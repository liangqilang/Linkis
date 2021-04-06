package com.webank.wedatasphere.linkis.engine.impala.client.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 任务信息
 * @author dingqihuang
 * @version Sep 20, 2019
 */
public class ExecSummary {
	private ExecStatus status;
	private ExecProgress progress;
	private int nodeNum;

	/**
	 * @param status
	 * @param progress
	 * @param nodeNum
	 */
	public ExecSummary(ExecStatus status, ExecProgress progress, int nodeNum) {
		super();
		this.status = status;
		this.progress = progress;
		this.nodeNum = nodeNum;
	}

	public ExecStatus getStatus() {
		return status;
	}

	public ExecProgress getProgress() {
		return progress;
	}

	public int getNodeNum() {
		return nodeNum;
	}
}
