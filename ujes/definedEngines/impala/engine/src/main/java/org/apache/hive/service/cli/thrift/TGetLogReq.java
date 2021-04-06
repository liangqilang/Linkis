/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class TGetLogReq implements org.apache.thrift.TBase<TGetLogReq, TGetLogReq._Fields>, java.io.Serializable, Cloneable, Comparable<TGetLogReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetLogReq");

  private static final org.apache.thrift.protocol.TField OPERATION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("operationHandle", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetLogReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetLogReqTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TOperationHandle operationHandle; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATION_HANDLE((short)1, "operationHandle");

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
        case 1: // OPERATION_HANDLE
          return OPERATION_HANDLE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("operationHandle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TOperationHandle.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetLogReq.class, metaDataMap);
  }

  public TGetLogReq() {
  }

  public TGetLogReq(
    TOperationHandle operationHandle)
  {
    this();
    this.operationHandle = operationHandle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetLogReq(TGetLogReq other) {
    if (other.isSetOperationHandle()) {
      this.operationHandle = new TOperationHandle(other.operationHandle);
    }
  }

  public TGetLogReq deepCopy() {
    return new TGetLogReq(this);
  }

  @Override
  public void clear() {
    this.operationHandle = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TOperationHandle getOperationHandle() {
    return this.operationHandle;
  }

  public TGetLogReq setOperationHandle(@org.apache.thrift.annotation.Nullable TOperationHandle operationHandle) {
    this.operationHandle = operationHandle;
    return this;
  }

  public void unsetOperationHandle() {
    this.operationHandle = null;
  }

  /** Returns true if field operationHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationHandle() {
    return this.operationHandle != null;
  }

  public void setOperationHandleIsSet(boolean value) {
    if (!value) {
      this.operationHandle = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case OPERATION_HANDLE:
      if (value == null) {
        unsetOperationHandle();
      } else {
        setOperationHandle((TOperationHandle)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION_HANDLE:
      return getOperationHandle();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPERATION_HANDLE:
      return isSetOperationHandle();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetLogReq)
      return this.equals((TGetLogReq)that);
    return false;
  }

  public boolean equals(TGetLogReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_operationHandle = true && this.isSetOperationHandle();
    boolean that_present_operationHandle = true && that.isSetOperationHandle();
    if (this_present_operationHandle || that_present_operationHandle) {
      if (!(this_present_operationHandle && that_present_operationHandle))
        return false;
      if (!this.operationHandle.equals(that.operationHandle))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOperationHandle()) ? 131071 : 524287);
    if (isSetOperationHandle())
      hashCode = hashCode * 8191 + operationHandle.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetLogReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOperationHandle()).compareTo(other.isSetOperationHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationHandle, other.operationHandle);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetLogReq(");
    boolean first = true;

    sb.append("operationHandle:");
    if (this.operationHandle == null) {
      sb.append("null");
    } else {
      sb.append(this.operationHandle);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (operationHandle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'operationHandle' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (operationHandle != null) {
      operationHandle.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetLogReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetLogReqStandardScheme getScheme() {
      return new TGetLogReqStandardScheme();
    }
  }

  private static class TGetLogReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetLogReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetLogReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.operationHandle = new TOperationHandle();
              struct.operationHandle.read(iprot);
              struct.setOperationHandleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetLogReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operationHandle != null) {
        oprot.writeFieldBegin(OPERATION_HANDLE_FIELD_DESC);
        struct.operationHandle.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetLogReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetLogReqTupleScheme getScheme() {
      return new TGetLogReqTupleScheme();
    }
  }

  private static class TGetLogReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetLogReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetLogReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.operationHandle.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetLogReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.operationHandle = new TOperationHandle();
      struct.operationHandle.read(iprot);
      struct.setOperationHandleIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

