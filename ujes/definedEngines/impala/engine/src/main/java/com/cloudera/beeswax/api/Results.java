/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.beeswax.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class Results implements org.apache.thrift.TBase<Results, Results._Fields>, java.io.Serializable, Cloneable, Comparable<Results> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Results");

  private static final org.apache.thrift.protocol.TField READY_FIELD_DESC = new org.apache.thrift.protocol.TField("ready", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField START_ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("start_row", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField HAS_MORE_FIELD_DESC = new org.apache.thrift.protocol.TField("has_more", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ResultsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ResultsTupleSchemeFactory();

  public boolean ready; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> data; // required
  public long start_row; // required
  public boolean has_more; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    READY((short)1, "ready"),
    COLUMNS((short)2, "columns"),
    DATA((short)3, "data"),
    START_ROW((short)4, "start_row"),
    HAS_MORE((short)5, "has_more");

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
        case 1: // READY
          return READY;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // DATA
          return DATA;
        case 4: // START_ROW
          return START_ROW;
        case 5: // HAS_MORE
          return HAS_MORE;
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
  private static final int __READY_ISSET_ID = 0;
  private static final int __START_ROW_ISSET_ID = 1;
  private static final int __HAS_MORE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.READY, new org.apache.thrift.meta_data.FieldMetaData("ready", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.START_ROW, new org.apache.thrift.meta_data.FieldMetaData("start_row", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HAS_MORE, new org.apache.thrift.meta_data.FieldMetaData("has_more", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Results.class, metaDataMap);
  }

  public Results() {
  }

  public Results(
    boolean ready,
    java.util.List<java.lang.String> columns,
    java.util.List<java.lang.String> data,
    long start_row,
    boolean has_more)
  {
    this();
    this.ready = ready;
    setReadyIsSet(true);
    this.columns = columns;
    this.data = data;
    this.start_row = start_row;
    setStart_rowIsSet(true);
    this.has_more = has_more;
    setHas_moreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Results(Results other) {
    __isset_bitfield = other.__isset_bitfield;
    this.ready = other.ready;
    if (other.isSetColumns()) {
      java.util.List<java.lang.String> __this__columns = new java.util.ArrayList<java.lang.String>(other.columns);
      this.columns = __this__columns;
    }
    if (other.isSetData()) {
      java.util.List<java.lang.String> __this__data = new java.util.ArrayList<java.lang.String>(other.data);
      this.data = __this__data;
    }
    this.start_row = other.start_row;
    this.has_more = other.has_more;
  }

  public Results deepCopy() {
    return new Results(this);
  }

  @Override
  public void clear() {
    setReadyIsSet(false);
    this.ready = false;
    this.columns = null;
    this.data = null;
    setStart_rowIsSet(false);
    this.start_row = 0;
    setHas_moreIsSet(false);
    this.has_more = false;
  }

  public boolean isReady() {
    return this.ready;
  }

  public Results setReady(boolean ready) {
    this.ready = ready;
    setReadyIsSet(true);
    return this;
  }

  public void unsetReady() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __READY_ISSET_ID);
  }

  /** Returns true if field ready is set (has been assigned a value) and false otherwise */
  public boolean isSetReady() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __READY_ISSET_ID);
  }

  public void setReadyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __READY_ISSET_ID, value);
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(java.lang.String elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<java.lang.String>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumns() {
    return this.columns;
  }

  public Results setColumns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(java.lang.String elem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<java.lang.String>();
    }
    this.data.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getData() {
    return this.data;
  }

  public Results setData(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public long getStart_row() {
    return this.start_row;
  }

  public Results setStart_row(long start_row) {
    this.start_row = start_row;
    setStart_rowIsSet(true);
    return this;
  }

  public void unsetStart_row() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __START_ROW_ISSET_ID);
  }

  /** Returns true if field start_row is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_row() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __START_ROW_ISSET_ID);
  }

  public void setStart_rowIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __START_ROW_ISSET_ID, value);
  }

  public boolean isHas_more() {
    return this.has_more;
  }

  public Results setHas_more(boolean has_more) {
    this.has_more = has_more;
    setHas_moreIsSet(true);
    return this;
  }

  public void unsetHas_more() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HAS_MORE_ISSET_ID);
  }

  /** Returns true if field has_more is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_more() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HAS_MORE_ISSET_ID);
  }

  public void setHas_moreIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HAS_MORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case READY:
      if (value == null) {
        unsetReady();
      } else {
        setReady((java.lang.Boolean)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<java.lang.String>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((java.util.List<java.lang.String>)value);
      }
      break;

    case START_ROW:
      if (value == null) {
        unsetStart_row();
      } else {
        setStart_row((java.lang.Long)value);
      }
      break;

    case HAS_MORE:
      if (value == null) {
        unsetHas_more();
      } else {
        setHas_more((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case READY:
      return isReady();

    case COLUMNS:
      return getColumns();

    case DATA:
      return getData();

    case START_ROW:
      return getStart_row();

    case HAS_MORE:
      return isHas_more();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case READY:
      return isSetReady();
    case COLUMNS:
      return isSetColumns();
    case DATA:
      return isSetData();
    case START_ROW:
      return isSetStart_row();
    case HAS_MORE:
      return isSetHas_more();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Results)
      return this.equals((Results)that);
    return false;
  }

  public boolean equals(Results that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ready = true;
    boolean that_present_ready = true;
    if (this_present_ready || that_present_ready) {
      if (!(this_present_ready && that_present_ready))
        return false;
      if (this.ready != that.ready)
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_start_row = true;
    boolean that_present_start_row = true;
    if (this_present_start_row || that_present_start_row) {
      if (!(this_present_start_row && that_present_start_row))
        return false;
      if (this.start_row != that.start_row)
        return false;
    }

    boolean this_present_has_more = true;
    boolean that_present_has_more = true;
    if (this_present_has_more || that_present_has_more) {
      if (!(this_present_has_more && that_present_has_more))
        return false;
      if (this.has_more != that.has_more)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((ready) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(start_row);

    hashCode = hashCode * 8191 + ((has_more) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Results other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReady()).compareTo(other.isSetReady());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReady()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ready, other.ready);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStart_row()).compareTo(other.isSetStart_row());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_row()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_row, other.start_row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHas_more()).compareTo(other.isSetHas_more());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_more()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_more, other.has_more);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Results(");
    boolean first = true;

    sb.append("ready:");
    sb.append(this.ready);
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_row:");
    sb.append(this.start_row);
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_more:");
    sb.append(this.has_more);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class ResultsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResultsStandardScheme getScheme() {
      return new ResultsStandardScheme();
    }
  }

  private static class ResultsStandardScheme extends org.apache.thrift.scheme.StandardScheme<Results> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Results struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // READY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ready = iprot.readBool();
              struct.setReadyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<java.lang.String>(_list8.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.columns.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.data = new java.util.ArrayList<java.lang.String>(_list11.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readString();
                  struct.data.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_row = iprot.readI64();
              struct.setStart_rowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HAS_MORE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_more = iprot.readBool();
              struct.setHas_moreIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Results struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(READY_FIELD_DESC);
      oprot.writeBool(struct.ready);
      oprot.writeFieldEnd();
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (java.lang.String _iter14 : struct.columns)
          {
            oprot.writeString(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.data.size()));
          for (java.lang.String _iter15 : struct.data)
          {
            oprot.writeString(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_ROW_FIELD_DESC);
      oprot.writeI64(struct.start_row);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HAS_MORE_FIELD_DESC);
      oprot.writeBool(struct.has_more);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResultsTupleScheme getScheme() {
      return new ResultsTupleScheme();
    }
  }

  private static class ResultsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Results> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Results struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReady()) {
        optionals.set(0);
      }
      if (struct.isSetColumns()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      if (struct.isSetStart_row()) {
        optionals.set(3);
      }
      if (struct.isSetHas_more()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetReady()) {
        oprot.writeBool(struct.ready);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (java.lang.String _iter16 : struct.columns)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (java.lang.String _iter17 : struct.data)
          {
            oprot.writeString(_iter17);
          }
        }
      }
      if (struct.isSetStart_row()) {
        oprot.writeI64(struct.start_row);
      }
      if (struct.isSetHas_more()) {
        oprot.writeBool(struct.has_more);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Results struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.ready = iprot.readBool();
        struct.setReadyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columns = new java.util.ArrayList<java.lang.String>(_list18.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.columns.add(_elem19);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.data = new java.util.ArrayList<java.lang.String>(_list21.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readString();
            struct.data.add(_elem22);
          }
        }
        struct.setDataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.start_row = iprot.readI64();
        struct.setStart_rowIsSet(true);
      }
      if (incoming.get(4)) {
        struct.has_more = iprot.readBool();
        struct.setHas_moreIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

