/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.wedatasphere.linkis.engine.impala.client.thrift;


import com.webank.wedatasphere.linkis.engine.impala.client.ImpalaTransportFactory;
import com.webank.wedatasphere.linkis.engine.impala.client.util.Constant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.thrift.transport.TSaslClientTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Random;


@Slf4j
public class ImpalaThriftTransportFactory extends ImpalaTransportFactory<TTransport> {

    private int index = -1;

    @Override
    public TTransport getTransport() throws Exception {
        SocketFactory socketFactory = null;

        /*
         * 是否加密传输
         */
        if (useSsl) {
            SSLContext context = SSLContext.getInstance(sslType);
            context.init(null, trustManagers, new SecureRandom());
            socketFactory = context.getSocketFactory();
        } else {
            socketFactory = SocketFactory.getDefault();
        }

        int length = Math.min(hosts.length, ports.length);
        if (index < 0) {
            index = new Random().nextInt(length);
        }

        Socket socket = null;
        TTransport tTransport = null;
        Exception exception = null;
        String host = null;
        int port = 0;
        for (int i = 0; i < length; ++i) {
            host = hosts[index];
            port = ports[index];
            try {
                log.info("Connecting to {}:{} ...", host, port);
                socket = socketFactory.createSocket(host, port);
                break;
            } catch (Exception e) {
                exception = e;
                log.warn("Failed to connect to {}:{}, {} - {}", host, port, e.getClass(), e.getMessage());
                index = (index + 1) % length;
            }
        }

        if (socket == null) {
            StringBuilder sb = new StringBuilder();
            for (int p : ports) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(p);
            }
            throw new RuntimeException(String.format("Failed to connect to impala servers: %s at ports: %s",
                    StringUtils.join(hosts, ','), sb.toString(), exception));
        }

        /*
         * 创建Thrift socket
         */
        TSocket tSocket = new TSocket(socket);
        tSocket.setTimeout(connectionTimeout * 1000);
        socket.setSoTimeout(connectionTimeout * 2000);

        /*
         * 使用动态密码，强制使用系统用户
         */
        if (useTicket) {
            username = System.getProperty("user.name");

            Process process = new ProcessBuilder().command(ticketBin).start();
            int ret = process.waitFor();
            if (ret != 0) {
                throw new RuntimeException(IOUtils.toString(process.getErrorStream(), Constant.DEFAULT_CHARSET));
            }
            password = IOUtils.toString(process.getInputStream(), Constant.DEFAULT_CHARSET);

        } else if (StringUtils.isBlank(username)) {
            /*
             * 未设置用户，使用系统用户
             */
            username = System.getProperty("user.name");
        }

        if (StringUtils.isNotBlank(password)) {
            CallbackHandler callbackHandler = new CallbackHandler() {
                @Override
                public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                    for (Callback callback : callbacks) {
                        if (callback instanceof NameCallback) {
                            ((NameCallback) callback).setName(username);
                            ;
                        } else if (callback instanceof PasswordCallback) {
                            ((PasswordCallback) callback).setPassword(password.toCharArray());
                        }
                    }
                }
            };
            /*
             * SASL+LDAP认证
             */
            tTransport = new TSaslClientTransport("PLAIN", (String) null, "LDAP", host, null, callbackHandler, tSocket);

        } else {
            /*
             * 普通连接
             */
            tTransport = tSocket;
        }

        if (!tTransport.isOpen()) {
            tTransport.open();
        }

        return tTransport;
    }
}
