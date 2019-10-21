/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-12")
public class TRuntimeProfileForest implements org.apache.thrift.TBase<TRuntimeProfileForest, TRuntimeProfileForest._Fields>, java.io.Serializable, Cloneable, Comparable<TRuntimeProfileForest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRuntimeProfileForest");

  private static final org.apache.thrift.protocol.TField PROFILE_TREES_FIELD_DESC = new org.apache.thrift.protocol.TField("profile_trees", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("host_profile", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRuntimeProfileForestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRuntimeProfileForestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TRuntimeProfileTree> profile_trees; // required
  public @org.apache.thrift.annotation.Nullable TRuntimeProfileTree host_profile; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROFILE_TREES((short)1, "profile_trees"),
    HOST_PROFILE((short)2, "host_profile");

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
        case 1: // PROFILE_TREES
          return PROFILE_TREES;
        case 2: // HOST_PROFILE
          return HOST_PROFILE;
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
  private static final _Fields optionals[] = {_Fields.HOST_PROFILE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROFILE_TREES, new org.apache.thrift.meta_data.FieldMetaData("profile_trees", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRuntimeProfileTree.class))));
    tmpMap.put(_Fields.HOST_PROFILE, new org.apache.thrift.meta_data.FieldMetaData("host_profile", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRuntimeProfileTree.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRuntimeProfileForest.class, metaDataMap);
  }

  public TRuntimeProfileForest() {
  }

  public TRuntimeProfileForest(
    java.util.List<TRuntimeProfileTree> profile_trees)
  {
    this();
    this.profile_trees = profile_trees;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRuntimeProfileForest(TRuntimeProfileForest other) {
    if (other.isSetProfile_trees()) {
      java.util.List<TRuntimeProfileTree> __this__profile_trees = new java.util.ArrayList<TRuntimeProfileTree>(other.profile_trees.size());
      for (TRuntimeProfileTree other_element : other.profile_trees) {
        __this__profile_trees.add(new TRuntimeProfileTree(other_element));
      }
      this.profile_trees = __this__profile_trees;
    }
    if (other.isSetHost_profile()) {
      this.host_profile = new TRuntimeProfileTree(other.host_profile);
    }
  }

  public TRuntimeProfileForest deepCopy() {
    return new TRuntimeProfileForest(this);
  }

  @Override
  public void clear() {
    this.profile_trees = null;
    this.host_profile = null;
  }

  public int getProfile_treesSize() {
    return (this.profile_trees == null) ? 0 : this.profile_trees.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TRuntimeProfileTree> getProfile_treesIterator() {
    return (this.profile_trees == null) ? null : this.profile_trees.iterator();
  }

  public void addToProfile_trees(TRuntimeProfileTree elem) {
    if (this.profile_trees == null) {
      this.profile_trees = new java.util.ArrayList<TRuntimeProfileTree>();
    }
    this.profile_trees.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TRuntimeProfileTree> getProfile_trees() {
    return this.profile_trees;
  }

  public TRuntimeProfileForest setProfile_trees(@org.apache.thrift.annotation.Nullable java.util.List<TRuntimeProfileTree> profile_trees) {
    this.profile_trees = profile_trees;
    return this;
  }

  public void unsetProfile_trees() {
    this.profile_trees = null;
  }

  /** Returns true if field profile_trees is set (has been assigned a value) and false otherwise */
  public boolean isSetProfile_trees() {
    return this.profile_trees != null;
  }

  public void setProfile_treesIsSet(boolean value) {
    if (!value) {
      this.profile_trees = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TRuntimeProfileTree getHost_profile() {
    return this.host_profile;
  }

  public TRuntimeProfileForest setHost_profile(@org.apache.thrift.annotation.Nullable TRuntimeProfileTree host_profile) {
    this.host_profile = host_profile;
    return this;
  }

  public void unsetHost_profile() {
    this.host_profile = null;
  }

  /** Returns true if field host_profile is set (has been assigned a value) and false otherwise */
  public boolean isSetHost_profile() {
    return this.host_profile != null;
  }

  public void setHost_profileIsSet(boolean value) {
    if (!value) {
      this.host_profile = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PROFILE_TREES:
      if (value == null) {
        unsetProfile_trees();
      } else {
        setProfile_trees((java.util.List<TRuntimeProfileTree>)value);
      }
      break;

    case HOST_PROFILE:
      if (value == null) {
        unsetHost_profile();
      } else {
        setHost_profile((TRuntimeProfileTree)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROFILE_TREES:
      return getProfile_trees();

    case HOST_PROFILE:
      return getHost_profile();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROFILE_TREES:
      return isSetProfile_trees();
    case HOST_PROFILE:
      return isSetHost_profile();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TRuntimeProfileForest)
      return this.equals((TRuntimeProfileForest)that);
    return false;
  }

  public boolean equals(TRuntimeProfileForest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_profile_trees = true && this.isSetProfile_trees();
    boolean that_present_profile_trees = true && that.isSetProfile_trees();
    if (this_present_profile_trees || that_present_profile_trees) {
      if (!(this_present_profile_trees && that_present_profile_trees))
        return false;
      if (!this.profile_trees.equals(that.profile_trees))
        return false;
    }

    boolean this_present_host_profile = true && this.isSetHost_profile();
    boolean that_present_host_profile = true && that.isSetHost_profile();
    if (this_present_host_profile || that_present_host_profile) {
      if (!(this_present_host_profile && that_present_host_profile))
        return false;
      if (!this.host_profile.equals(that.host_profile))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProfile_trees()) ? 131071 : 524287);
    if (isSetProfile_trees())
      hashCode = hashCode * 8191 + profile_trees.hashCode();

    hashCode = hashCode * 8191 + ((isSetHost_profile()) ? 131071 : 524287);
    if (isSetHost_profile())
      hashCode = hashCode * 8191 + host_profile.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRuntimeProfileForest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetProfile_trees()).compareTo(other.isSetProfile_trees());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfile_trees()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profile_trees, other.profile_trees);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHost_profile()).compareTo(other.isSetHost_profile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost_profile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host_profile, other.host_profile);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRuntimeProfileForest(");
    boolean first = true;

    sb.append("profile_trees:");
    if (this.profile_trees == null) {
      sb.append("null");
    } else {
      sb.append(this.profile_trees);
    }
    first = false;
    if (isSetHost_profile()) {
      if (!first) sb.append(", ");
      sb.append("host_profile:");
      if (this.host_profile == null) {
        sb.append("null");
      } else {
        sb.append(this.host_profile);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (profile_trees == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'profile_trees' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (host_profile != null) {
      host_profile.validate();
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

  private static class TRuntimeProfileForestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeProfileForestStandardScheme getScheme() {
      return new TRuntimeProfileForestStandardScheme();
    }
  }

  private static class TRuntimeProfileForestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRuntimeProfileForest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRuntimeProfileForest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROFILE_TREES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list100 = iprot.readListBegin();
                struct.profile_trees = new java.util.ArrayList<TRuntimeProfileTree>(_list100.size);
                @org.apache.thrift.annotation.Nullable TRuntimeProfileTree _elem101;
                for (int _i102 = 0; _i102 < _list100.size; ++_i102)
                {
                  _elem101 = new TRuntimeProfileTree();
                  _elem101.read(iprot);
                  struct.profile_trees.add(_elem101);
                }
                iprot.readListEnd();
              }
              struct.setProfile_treesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOST_PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.host_profile = new TRuntimeProfileTree();
              struct.host_profile.read(iprot);
              struct.setHost_profileIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRuntimeProfileForest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.profile_trees != null) {
        oprot.writeFieldBegin(PROFILE_TREES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.profile_trees.size()));
          for (TRuntimeProfileTree _iter103 : struct.profile_trees)
          {
            _iter103.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.host_profile != null) {
        if (struct.isSetHost_profile()) {
          oprot.writeFieldBegin(HOST_PROFILE_FIELD_DESC);
          struct.host_profile.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRuntimeProfileForestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeProfileForestTupleScheme getScheme() {
      return new TRuntimeProfileForestTupleScheme();
    }
  }

  private static class TRuntimeProfileForestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRuntimeProfileForest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileForest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.profile_trees.size());
        for (TRuntimeProfileTree _iter104 : struct.profile_trees)
        {
          _iter104.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHost_profile()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHost_profile()) {
        struct.host_profile.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileForest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list105 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.profile_trees = new java.util.ArrayList<TRuntimeProfileTree>(_list105.size);
        @org.apache.thrift.annotation.Nullable TRuntimeProfileTree _elem106;
        for (int _i107 = 0; _i107 < _list105.size; ++_i107)
        {
          _elem106 = new TRuntimeProfileTree();
          _elem106.read(iprot);
          struct.profile_trees.add(_elem106);
        }
      }
      struct.setProfile_treesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.host_profile = new TRuntimeProfileTree();
        struct.host_profile.read(iprot);
        struct.setHost_profileIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
