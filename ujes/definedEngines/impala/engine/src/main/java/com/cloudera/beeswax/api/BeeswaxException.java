/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.beeswax.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-12")
public class BeeswaxException extends org.apache.thrift.TException implements org.apache.thrift.TBase<BeeswaxException, BeeswaxException._Fields>, java.io.Serializable, Cloneable, Comparable<BeeswaxException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BeeswaxException");

  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOG_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("log_context", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("handle", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SQLSTATE_FIELD_DESC = new org.apache.thrift.protocol.TField("SQLState", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BeeswaxExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BeeswaxExceptionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String message; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String log_context; // required
  public @org.apache.thrift.annotation.Nullable QueryHandle handle; // required
  public int errorCode; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String SQLState; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE((short)1, "message"),
    LOG_CONTEXT((short)2, "log_context"),
    HANDLE((short)3, "handle"),
    ERROR_CODE((short)4, "errorCode"),
    SQLSTATE((short)5, "SQLState");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MESSAGE
          return MESSAGE;
        case 2: // LOG_CONTEXT
          return LOG_CONTEXT;
        case 3: // HANDLE
          return HANDLE;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // SQLSTATE
          return SQLSTATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ERROR_CODE,_Fields.SQLSTATE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOG_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("log_context", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "LogContextId")));
    tmpMap.put(_Fields.HANDLE, new org.apache.thrift.meta_data.FieldMetaData("handle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, QueryHandle.class)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SQLSTATE, new org.apache.thrift.meta_data.FieldMetaData("SQLState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BeeswaxException.class, metaDataMap);
  }

  public BeeswaxException() {
    this.errorCode = 0;

    this.SQLState = "     ";

  }

  public BeeswaxException(
    java.lang.String message,
    java.lang.String log_context,
    QueryHandle handle)
  {
    this();
    this.message = message;
    this.log_context = log_context;
    this.handle = handle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BeeswaxException(BeeswaxException other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetLog_context()) {
      this.log_context = other.log_context;
    }
    if (other.isSetHandle()) {
      this.handle = new QueryHandle(other.handle);
    }
    this.errorCode = other.errorCode;
    if (other.isSetSQLState()) {
      this.SQLState = other.SQLState;
    }
  }

  public BeeswaxException deepCopy() {
    return new BeeswaxException(this);
  }

  @Override
  public void clear() {
    this.message = null;
    this.log_context = null;
    this.handle = null;
    this.errorCode = 0;

    this.SQLState = "     ";

  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessage() {
    return this.message;
  }

  public BeeswaxException setMessage(@org.apache.thrift.annotation.Nullable java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLog_context() {
    return this.log_context;
  }

  public BeeswaxException setLog_context(@org.apache.thrift.annotation.Nullable java.lang.String log_context) {
    this.log_context = log_context;
    return this;
  }

  public void unsetLog_context() {
    this.log_context = null;
  }

  /** Returns true if field log_context is set (has been assigned a value) and false otherwise */
  public boolean isSetLog_context() {
    return this.log_context != null;
  }

  public void setLog_contextIsSet(boolean value) {
    if (!value) {
      this.log_context = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public QueryHandle getHandle() {
    return this.handle;
  }

  public BeeswaxException setHandle(@org.apache.thrift.annotation.Nullable QueryHandle handle) {
    this.handle = handle;
    return this;
  }

  public void unsetHandle() {
    this.handle = null;
  }

  /** Returns true if field handle is set (has been assigned a value) and false otherwise */
  public boolean isSetHandle() {
    return this.handle != null;
  }

  public void setHandleIsSet(boolean value) {
    if (!value) {
      this.handle = null;
    }
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public BeeswaxException setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSQLState() {
    return this.SQLState;
  }

  public BeeswaxException setSQLState(@org.apache.thrift.annotation.Nullable java.lang.String SQLState) {
    this.SQLState = SQLState;
    return this;
  }

  public void unsetSQLState() {
    this.SQLState = null;
  }

  /** Returns true if field SQLState is set (has been assigned a value) and false otherwise */
  public boolean isSetSQLState() {
    return this.SQLState != null;
  }

  public void setSQLStateIsSet(boolean value) {
    if (!value) {
      this.SQLState = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case LOG_CONTEXT:
      if (value == null) {
        unsetLog_context();
      } else {
        setLog_context((java.lang.String)value);
      }
      break;

    case HANDLE:
      if (value == null) {
        unsetHandle();
      } else {
        setHandle((QueryHandle)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((java.lang.Integer)value);
      }
      break;

    case SQLSTATE:
      if (value == null) {
        unsetSQLState();
      } else {
        setSQLState((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE:
      return getMessage();

    case LOG_CONTEXT:
      return getLog_context();

    case HANDLE:
      return getHandle();

    case ERROR_CODE:
      return getErrorCode();

    case SQLSTATE:
      return getSQLState();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE:
      return isSetMessage();
    case LOG_CONTEXT:
      return isSetLog_context();
    case HANDLE:
      return isSetHandle();
    case ERROR_CODE:
      return isSetErrorCode();
    case SQLSTATE:
      return isSetSQLState();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BeeswaxException)
      return this.equals((BeeswaxException)that);
    return false;
  }

  public boolean equals(BeeswaxException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_log_context = true && this.isSetLog_context();
    boolean that_present_log_context = true && that.isSetLog_context();
    if (this_present_log_context || that_present_log_context) {
      if (!(this_present_log_context && that_present_log_context))
        return false;
      if (!this.log_context.equals(that.log_context))
        return false;
    }

    boolean this_present_handle = true && this.isSetHandle();
    boolean that_present_handle = true && that.isSetHandle();
    if (this_present_handle || that_present_handle) {
      if (!(this_present_handle && that_present_handle))
        return false;
      if (!this.handle.equals(that.handle))
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_SQLState = true && this.isSetSQLState();
    boolean that_present_SQLState = true && that.isSetSQLState();
    if (this_present_SQLState || that_present_SQLState) {
      if (!(this_present_SQLState && that_present_SQLState))
        return false;
      if (!this.SQLState.equals(that.SQLState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetLog_context()) ? 131071 : 524287);
    if (isSetLog_context())
      hashCode = hashCode * 8191 + log_context.hashCode();

    hashCode = hashCode * 8191 + ((isSetHandle()) ? 131071 : 524287);
    if (isSetHandle())
      hashCode = hashCode * 8191 + handle.hashCode();

    hashCode = hashCode * 8191 + ((isSetErrorCode()) ? 131071 : 524287);
    if (isSetErrorCode())
      hashCode = hashCode * 8191 + errorCode;

    hashCode = hashCode * 8191 + ((isSetSQLState()) ? 131071 : 524287);
    if (isSetSQLState())
      hashCode = hashCode * 8191 + SQLState.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BeeswaxException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLog_context()).compareTo(other.isSetLog_context());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLog_context()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.log_context, other.log_context);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHandle()).compareTo(other.isSetHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.handle, other.handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSQLState()).compareTo(other.isSetSQLState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSQLState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.SQLState, other.SQLState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BeeswaxException(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("log_context:");
    if (this.log_context == null) {
      sb.append("null");
    } else {
      sb.append(this.log_context);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("handle:");
    if (this.handle == null) {
      sb.append("null");
    } else {
      sb.append(this.handle);
    }
    first = false;
    if (isSetErrorCode()) {
      if (!first) sb.append(", ");
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetSQLState()) {
      if (!first) sb.append(", ");
      sb.append("SQLState:");
      if (this.SQLState == null) {
        sb.append("null");
      } else {
        sb.append(this.SQLState);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (handle != null) {
      handle.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BeeswaxExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BeeswaxExceptionStandardScheme getScheme() {
      return new BeeswaxExceptionStandardScheme();
    }
  }

  private static class BeeswaxExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<BeeswaxException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BeeswaxException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOG_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.log_context = iprot.readString();
              struct.setLog_contextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.handle = new QueryHandle();
              struct.handle.read(iprot);
              struct.setHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SQLSTATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.SQLState = iprot.readString();
              struct.setSQLStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BeeswaxException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.log_context != null) {
        oprot.writeFieldBegin(LOG_CONTEXT_FIELD_DESC);
        oprot.writeString(struct.log_context);
        oprot.writeFieldEnd();
      }
      if (struct.handle != null) {
        oprot.writeFieldBegin(HANDLE_FIELD_DESC);
        struct.handle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.SQLState != null) {
        if (struct.isSetSQLState()) {
          oprot.writeFieldBegin(SQLSTATE_FIELD_DESC);
          oprot.writeString(struct.SQLState);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BeeswaxExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BeeswaxExceptionTupleScheme getScheme() {
      return new BeeswaxExceptionTupleScheme();
    }
  }

  private static class BeeswaxExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<BeeswaxException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BeeswaxException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMessage()) {
        optionals.set(0);
      }
      if (struct.isSetLog_context()) {
        optionals.set(1);
      }
      if (struct.isSetHandle()) {
        optionals.set(2);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(3);
      }
      if (struct.isSetSQLState()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
      if (struct.isSetLog_context()) {
        oprot.writeString(struct.log_context);
      }
      if (struct.isSetHandle()) {
        struct.handle.write(oprot);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetSQLState()) {
        oprot.writeString(struct.SQLState);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BeeswaxException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.log_context = iprot.readString();
        struct.setLog_contextIsSet(true);
      }
      if (incoming.get(2)) {
        struct.handle = new QueryHandle();
        struct.handle.read(iprot);
        struct.setHandleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.SQLState = iprot.readString();
        struct.setSQLStateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
