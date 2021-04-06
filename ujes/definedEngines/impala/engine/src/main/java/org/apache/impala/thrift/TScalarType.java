/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class TScalarType implements org.apache.thrift.TBase<TScalarType, TScalarType._Fields>, java.io.Serializable, Cloneable, Comparable<TScalarType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScalarType");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("len", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRECISION_FIELD_DESC = new org.apache.thrift.protocol.TField("precision", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TScalarTypeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TScalarTypeTupleSchemeFactory();

  /**
   * 
   * @see TPrimitiveType
   */
  public @org.apache.thrift.annotation.Nullable TPrimitiveType type; // required
  public int len; // optional
  public int precision; // optional
  public int scale; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPrimitiveType
     */
    TYPE((short)1, "type"),
    LEN((short)2, "len"),
    PRECISION((short)3, "precision"),
    SCALE((short)4, "scale");

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
        case 1: // TYPE
          return TYPE;
        case 2: // LEN
          return LEN;
        case 3: // PRECISION
          return PRECISION;
        case 4: // SCALE
          return SCALE;
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
  private static final int __LEN_ISSET_ID = 0;
  private static final int __PRECISION_ISSET_ID = 1;
  private static final int __SCALE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LEN,_Fields.PRECISION,_Fields.SCALE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPrimitiveType.class)));
    tmpMap.put(_Fields.LEN, new org.apache.thrift.meta_data.FieldMetaData("len", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRECISION, new org.apache.thrift.meta_data.FieldMetaData("precision", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScalarType.class, metaDataMap);
  }

  public TScalarType() {
  }

  public TScalarType(
    TPrimitiveType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScalarType(TScalarType other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.len = other.len;
    this.precision = other.precision;
    this.scale = other.scale;
  }

  public TScalarType deepCopy() {
    return new TScalarType(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setLenIsSet(false);
    this.len = 0;
    setPrecisionIsSet(false);
    this.precision = 0;
    setScaleIsSet(false);
    this.scale = 0;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  @org.apache.thrift.annotation.Nullable
  public TPrimitiveType getType() {
    return this.type;
  }

  /**
   * 
   * @see TPrimitiveType
   */
  public TScalarType setType(@org.apache.thrift.annotation.Nullable TPrimitiveType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getLen() {
    return this.len;
  }

  public TScalarType setLen(int len) {
    this.len = len;
    setLenIsSet(true);
    return this;
  }

  public void unsetLen() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  /** Returns true if field len is set (has been assigned a value) and false otherwise */
  public boolean isSetLen() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEN_ISSET_ID);
  }

  public void setLenIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEN_ISSET_ID, value);
  }

  public int getPrecision() {
    return this.precision;
  }

  public TScalarType setPrecision(int precision) {
    this.precision = precision;
    setPrecisionIsSet(true);
    return this;
  }

  public void unsetPrecision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  /** Returns true if field precision is set (has been assigned a value) and false otherwise */
  public boolean isSetPrecision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  public void setPrecisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRECISION_ISSET_ID, value);
  }

  public int getScale() {
    return this.scale;
  }

  public TScalarType setScale(int scale) {
    this.scale = scale;
    setScaleIsSet(true);
    return this;
  }

  public void unsetScale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TPrimitiveType)value);
      }
      break;

    case LEN:
      if (value == null) {
        unsetLen();
      } else {
        setLen((java.lang.Integer)value);
      }
      break;

    case PRECISION:
      if (value == null) {
        unsetPrecision();
      } else {
        setPrecision((java.lang.Integer)value);
      }
      break;

    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LEN:
      return getLen();

    case PRECISION:
      return getPrecision();

    case SCALE:
      return getScale();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LEN:
      return isSetLen();
    case PRECISION:
      return isSetPrecision();
    case SCALE:
      return isSetScale();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TScalarType)
      return this.equals((TScalarType)that);
    return false;
  }

  public boolean equals(TScalarType that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_len = true && this.isSetLen();
    boolean that_present_len = true && that.isSetLen();
    if (this_present_len || that_present_len) {
      if (!(this_present_len && that_present_len))
        return false;
      if (this.len != that.len)
        return false;
    }

    boolean this_present_precision = true && this.isSetPrecision();
    boolean that_present_precision = true && that.isSetPrecision();
    if (this_present_precision || that_present_precision) {
      if (!(this_present_precision && that_present_precision))
        return false;
      if (this.precision != that.precision)
        return false;
    }

    boolean this_present_scale = true && this.isSetScale();
    boolean that_present_scale = true && that.isSetScale();
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetLen()) ? 131071 : 524287);
    if (isSetLen())
      hashCode = hashCode * 8191 + len;

    hashCode = hashCode * 8191 + ((isSetPrecision()) ? 131071 : 524287);
    if (isSetPrecision())
      hashCode = hashCode * 8191 + precision;

    hashCode = hashCode * 8191 + ((isSetScale()) ? 131071 : 524287);
    if (isSetScale())
      hashCode = hashCode * 8191 + scale;

    return hashCode;
  }

  @Override
  public int compareTo(TScalarType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLen()).compareTo(other.isSetLen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.len, other.len);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrecision()).compareTo(other.isSetPrecision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrecision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.precision, other.precision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScale()).compareTo(other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TScalarType(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetLen()) {
      if (!first) sb.append(", ");
      sb.append("len:");
      sb.append(this.len);
      first = false;
    }
    if (isSetPrecision()) {
      if (!first) sb.append(", ");
      sb.append("precision:");
      sb.append(this.precision);
      first = false;
    }
    if (isSetScale()) {
      if (!first) sb.append(", ");
      sb.append("scale:");
      sb.append(this.scale);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
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

  private static class TScalarTypeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TScalarTypeStandardScheme getScheme() {
      return new TScalarTypeStandardScheme();
    }
  }

  private static class TScalarTypeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TScalarType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScalarType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.impala.thrift.TPrimitiveType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.len = iprot.readI32();
              struct.setLenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRECISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.precision = iprot.readI32();
              struct.setPrecisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.scale = iprot.readI32();
              struct.setScaleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScalarType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetLen()) {
        oprot.writeFieldBegin(LEN_FIELD_DESC);
        oprot.writeI32(struct.len);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPrecision()) {
        oprot.writeFieldBegin(PRECISION_FIELD_DESC);
        oprot.writeI32(struct.precision);
        oprot.writeFieldEnd();
      }
      if (struct.isSetScale()) {
        oprot.writeFieldBegin(SCALE_FIELD_DESC);
        oprot.writeI32(struct.scale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScalarTypeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TScalarTypeTupleScheme getScheme() {
      return new TScalarTypeTupleScheme();
    }
  }

  private static class TScalarTypeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TScalarType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScalarType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLen()) {
        optionals.set(0);
      }
      if (struct.isSetPrecision()) {
        optionals.set(1);
      }
      if (struct.isSetScale()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetLen()) {
        oprot.writeI32(struct.len);
      }
      if (struct.isSetPrecision()) {
        oprot.writeI32(struct.precision);
      }
      if (struct.isSetScale()) {
        oprot.writeI32(struct.scale);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScalarType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.type = org.apache.impala.thrift.TPrimitiveType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.len = iprot.readI32();
        struct.setLenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.precision = iprot.readI32();
        struct.setPrecisionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.scale = iprot.readI32();
        struct.setScaleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

