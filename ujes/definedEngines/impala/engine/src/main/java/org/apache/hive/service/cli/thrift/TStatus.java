/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class TStatus implements org.apache.thrift.TBase<TStatus, TStatus._Fields>, java.io.Serializable, Cloneable, Comparable<TStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStatus");

  private static final org.apache.thrift.protocol.TField STATUS_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INFO_MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("infoMessages", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SQL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlState", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TStatusTupleSchemeFactory();

  /**
   * 
   * @see TStatusCode
   */
  public @org.apache.thrift.annotation.Nullable TStatusCode statusCode; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> infoMessages; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String sqlState; // optional
  public int errorCode; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String errorMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TStatusCode
     */
    STATUS_CODE((short)1, "statusCode"),
    INFO_MESSAGES((short)2, "infoMessages"),
    SQL_STATE((short)3, "sqlState"),
    ERROR_CODE((short)4, "errorCode"),
    ERROR_MESSAGE((short)5, "errorMessage");

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
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // INFO_MESSAGES
          return INFO_MESSAGES;
        case 3: // SQL_STATE
          return SQL_STATE;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // ERROR_MESSAGE
          return ERROR_MESSAGE;
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
  private static final _Fields optionals[] = {_Fields.INFO_MESSAGES,_Fields.SQL_STATE,_Fields.ERROR_CODE,_Fields.ERROR_MESSAGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS_CODE, new org.apache.thrift.meta_data.FieldMetaData("statusCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatusCode.class)));
    tmpMap.put(_Fields.INFO_MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("infoMessages", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SQL_STATE, new org.apache.thrift.meta_data.FieldMetaData("sqlState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStatus.class, metaDataMap);
  }

  public TStatus() {
  }

  public TStatus(
    TStatusCode statusCode)
  {
    this();
    this.statusCode = statusCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStatus(TStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatusCode()) {
      this.statusCode = other.statusCode;
    }
    if (other.isSetInfoMessages()) {
      java.util.List<java.lang.String> __this__infoMessages = new java.util.ArrayList<java.lang.String>(other.infoMessages);
      this.infoMessages = __this__infoMessages;
    }
    if (other.isSetSqlState()) {
      this.sqlState = other.sqlState;
    }
    this.errorCode = other.errorCode;
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
  }

  public TStatus deepCopy() {
    return new TStatus(this);
  }

  @Override
  public void clear() {
    this.statusCode = null;
    this.infoMessages = null;
    this.sqlState = null;
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.errorMessage = null;
  }

  /**
   * 
   * @see TStatusCode
   */
  @org.apache.thrift.annotation.Nullable
  public TStatusCode getStatusCode() {
    return this.statusCode;
  }

  /**
   * 
   * @see TStatusCode
   */
  public TStatus setStatusCode(@org.apache.thrift.annotation.Nullable TStatusCode statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public void unsetStatusCode() {
    this.statusCode = null;
  }

  /** Returns true if field statusCode is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusCode() {
    return this.statusCode != null;
  }

  public void setStatusCodeIsSet(boolean value) {
    if (!value) {
      this.statusCode = null;
    }
  }

  public int getInfoMessagesSize() {
    return (this.infoMessages == null) ? 0 : this.infoMessages.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getInfoMessagesIterator() {
    return (this.infoMessages == null) ? null : this.infoMessages.iterator();
  }

  public void addToInfoMessages(java.lang.String elem) {
    if (this.infoMessages == null) {
      this.infoMessages = new java.util.ArrayList<java.lang.String>();
    }
    this.infoMessages.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getInfoMessages() {
    return this.infoMessages;
  }

  public TStatus setInfoMessages(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> infoMessages) {
    this.infoMessages = infoMessages;
    return this;
  }

  public void unsetInfoMessages() {
    this.infoMessages = null;
  }

  /** Returns true if field infoMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetInfoMessages() {
    return this.infoMessages != null;
  }

  public void setInfoMessagesIsSet(boolean value) {
    if (!value) {
      this.infoMessages = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSqlState() {
    return this.sqlState;
  }

  public TStatus setSqlState(@org.apache.thrift.annotation.Nullable java.lang.String sqlState) {
    this.sqlState = sqlState;
    return this;
  }

  public void unsetSqlState() {
    this.sqlState = null;
  }

  /** Returns true if field sqlState is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlState() {
    return this.sqlState != null;
  }

  public void setSqlStateIsSet(boolean value) {
    if (!value) {
      this.sqlState = null;
    }
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public TStatus setErrorCode(int errorCode) {
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
  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public TStatus setErrorMessage(@org.apache.thrift.annotation.Nullable java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        unsetStatusCode();
      } else {
        setStatusCode((TStatusCode)value);
      }
      break;

    case INFO_MESSAGES:
      if (value == null) {
        unsetInfoMessages();
      } else {
        setInfoMessages((java.util.List<java.lang.String>)value);
      }
      break;

    case SQL_STATE:
      if (value == null) {
        unsetSqlState();
      } else {
        setSqlState((java.lang.String)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((java.lang.Integer)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return getStatusCode();

    case INFO_MESSAGES:
      return getInfoMessages();

    case SQL_STATE:
      return getSqlState();

    case ERROR_CODE:
      return getErrorCode();

    case ERROR_MESSAGE:
      return getErrorMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS_CODE:
      return isSetStatusCode();
    case INFO_MESSAGES:
      return isSetInfoMessages();
    case SQL_STATE:
      return isSetSqlState();
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TStatus)
      return this.equals((TStatus)that);
    return false;
  }

  public boolean equals(TStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_statusCode = true && this.isSetStatusCode();
    boolean that_present_statusCode = true && that.isSetStatusCode();
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (!this.statusCode.equals(that.statusCode))
        return false;
    }

    boolean this_present_infoMessages = true && this.isSetInfoMessages();
    boolean that_present_infoMessages = true && that.isSetInfoMessages();
    if (this_present_infoMessages || that_present_infoMessages) {
      if (!(this_present_infoMessages && that_present_infoMessages))
        return false;
      if (!this.infoMessages.equals(that.infoMessages))
        return false;
    }

    boolean this_present_sqlState = true && this.isSetSqlState();
    boolean that_present_sqlState = true && that.isSetSqlState();
    if (this_present_sqlState || that_present_sqlState) {
      if (!(this_present_sqlState && that_present_sqlState))
        return false;
      if (!this.sqlState.equals(that.sqlState))
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

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatusCode()) ? 131071 : 524287);
    if (isSetStatusCode())
      hashCode = hashCode * 8191 + statusCode.getValue();

    hashCode = hashCode * 8191 + ((isSetInfoMessages()) ? 131071 : 524287);
    if (isSetInfoMessages())
      hashCode = hashCode * 8191 + infoMessages.hashCode();

    hashCode = hashCode * 8191 + ((isSetSqlState()) ? 131071 : 524287);
    if (isSetSqlState())
      hashCode = hashCode * 8191 + sqlState.hashCode();

    hashCode = hashCode * 8191 + ((isSetErrorCode()) ? 131071 : 524287);
    if (isSetErrorCode())
      hashCode = hashCode * 8191 + errorCode;

    hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
    if (isSetErrorMessage())
      hashCode = hashCode * 8191 + errorMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatusCode()).compareTo(other.isSetStatusCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusCode, other.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInfoMessages()).compareTo(other.isSetInfoMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfoMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infoMessages, other.infoMessages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSqlState()).compareTo(other.isSetSqlState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlState, other.sqlState);
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
    lastComparison = java.lang.Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TStatus(");
    boolean first = true;

    sb.append("statusCode:");
    if (this.statusCode == null) {
      sb.append("null");
    } else {
      sb.append(this.statusCode);
    }
    first = false;
    if (isSetInfoMessages()) {
      if (!first) sb.append(", ");
      sb.append("infoMessages:");
      if (this.infoMessages == null) {
        sb.append("null");
      } else {
        sb.append(this.infoMessages);
      }
      first = false;
    }
    if (isSetSqlState()) {
      if (!first) sb.append(", ");
      sb.append("sqlState:");
      if (this.sqlState == null) {
        sb.append("null");
      } else {
        sb.append(this.sqlState);
      }
      first = false;
    }
    if (isSetErrorCode()) {
      if (!first) sb.append(", ");
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (statusCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statusCode' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class TStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TStatusStandardScheme getScheme() {
      return new TStatusStandardScheme();
    }
  }

  private static class TStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<TStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.statusCode = org.apache.hive.service.cli.thrift.TStatusCode.findByValue(iprot.readI32());
              struct.setStatusCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INFO_MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.infoMessages = new java.util.ArrayList<java.lang.String>(_list134.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem135;
                for (int _i136 = 0; _i136 < _list134.size; ++_i136)
                {
                  _elem135 = iprot.readString();
                  struct.infoMessages.add(_elem135);
                }
                iprot.readListEnd();
              }
              struct.setInfoMessagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sqlState = iprot.readString();
              struct.setSqlStateIsSet(true);
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
          case 5: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.statusCode != null) {
        oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
        oprot.writeI32(struct.statusCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.infoMessages != null) {
        if (struct.isSetInfoMessages()) {
          oprot.writeFieldBegin(INFO_MESSAGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.infoMessages.size()));
            for (java.lang.String _iter137 : struct.infoMessages)
            {
              oprot.writeString(_iter137);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sqlState != null) {
        if (struct.isSetSqlState()) {
          oprot.writeFieldBegin(SQL_STATE_FIELD_DESC);
          oprot.writeString(struct.sqlState);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TStatusTupleScheme getScheme() {
      return new TStatusTupleScheme();
    }
  }

  private static class TStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<TStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.statusCode.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInfoMessages()) {
        optionals.set(0);
      }
      if (struct.isSetSqlState()) {
        optionals.set(1);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(2);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetInfoMessages()) {
        {
          oprot.writeI32(struct.infoMessages.size());
          for (java.lang.String _iter138 : struct.infoMessages)
          {
            oprot.writeString(_iter138);
          }
        }
      }
      if (struct.isSetSqlState()) {
        oprot.writeString(struct.sqlState);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.statusCode = org.apache.hive.service.cli.thrift.TStatusCode.findByValue(iprot.readI32());
      struct.setStatusCodeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list139 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.infoMessages = new java.util.ArrayList<java.lang.String>(_list139.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem140;
          for (int _i141 = 0; _i141 < _list139.size; ++_i141)
          {
            _elem140 = iprot.readString();
            struct.infoMessages.add(_elem140);
          }
        }
        struct.setInfoMessagesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sqlState = iprot.readString();
        struct.setSqlStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

