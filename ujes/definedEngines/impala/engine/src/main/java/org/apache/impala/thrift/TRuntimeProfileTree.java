/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-12")
public class TRuntimeProfileTree implements org.apache.thrift.TBase<TRuntimeProfileTree, TRuntimeProfileTree._Fields>, java.io.Serializable, Cloneable, Comparable<TRuntimeProfileTree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRuntimeProfileTree");

  private static final org.apache.thrift.protocol.TField NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXEC_SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("exec_summary", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRuntimeProfileTreeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRuntimeProfileTreeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TRuntimeProfileNode> nodes; // required
  public @org.apache.thrift.annotation.Nullable org.apache.impala.thrift.TExecSummary exec_summary; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODES((short)1, "nodes"),
    EXEC_SUMMARY((short)2, "exec_summary");

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
        case 1: // NODES
          return NODES;
        case 2: // EXEC_SUMMARY
          return EXEC_SUMMARY;
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
  private static final _Fields optionals[] = {_Fields.EXEC_SUMMARY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODES, new org.apache.thrift.meta_data.FieldMetaData("nodes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRuntimeProfileNode.class))));
    tmpMap.put(_Fields.EXEC_SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("exec_summary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.impala.thrift.TExecSummary.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRuntimeProfileTree.class, metaDataMap);
  }

  public TRuntimeProfileTree() {
  }

  public TRuntimeProfileTree(
    java.util.List<TRuntimeProfileNode> nodes)
  {
    this();
    this.nodes = nodes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRuntimeProfileTree(TRuntimeProfileTree other) {
    if (other.isSetNodes()) {
      java.util.List<TRuntimeProfileNode> __this__nodes = new java.util.ArrayList<TRuntimeProfileNode>(other.nodes.size());
      for (TRuntimeProfileNode other_element : other.nodes) {
        __this__nodes.add(new TRuntimeProfileNode(other_element));
      }
      this.nodes = __this__nodes;
    }
    if (other.isSetExec_summary()) {
      this.exec_summary = new org.apache.impala.thrift.TExecSummary(other.exec_summary);
    }
  }

  public TRuntimeProfileTree deepCopy() {
    return new TRuntimeProfileTree(this);
  }

  @Override
  public void clear() {
    this.nodes = null;
    this.exec_summary = null;
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TRuntimeProfileNode> getNodesIterator() {
    return (this.nodes == null) ? null : this.nodes.iterator();
  }

  public void addToNodes(TRuntimeProfileNode elem) {
    if (this.nodes == null) {
      this.nodes = new java.util.ArrayList<TRuntimeProfileNode>();
    }
    this.nodes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TRuntimeProfileNode> getNodes() {
    return this.nodes;
  }

  public TRuntimeProfileTree setNodes(@org.apache.thrift.annotation.Nullable java.util.List<TRuntimeProfileNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been assigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.impala.thrift.TExecSummary getExec_summary() {
    return this.exec_summary;
  }

  public TRuntimeProfileTree setExec_summary(@org.apache.thrift.annotation.Nullable org.apache.impala.thrift.TExecSummary exec_summary) {
    this.exec_summary = exec_summary;
    return this;
  }

  public void unsetExec_summary() {
    this.exec_summary = null;
  }

  /** Returns true if field exec_summary is set (has been assigned a value) and false otherwise */
  public boolean isSetExec_summary() {
    return this.exec_summary != null;
  }

  public void setExec_summaryIsSet(boolean value) {
    if (!value) {
      this.exec_summary = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((java.util.List<TRuntimeProfileNode>)value);
      }
      break;

    case EXEC_SUMMARY:
      if (value == null) {
        unsetExec_summary();
      } else {
        setExec_summary((org.apache.impala.thrift.TExecSummary)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NODES:
      return getNodes();

    case EXEC_SUMMARY:
      return getExec_summary();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NODES:
      return isSetNodes();
    case EXEC_SUMMARY:
      return isSetExec_summary();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TRuntimeProfileTree)
      return this.equals((TRuntimeProfileTree)that);
    return false;
  }

  public boolean equals(TRuntimeProfileTree that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    boolean this_present_exec_summary = true && this.isSetExec_summary();
    boolean that_present_exec_summary = true && that.isSetExec_summary();
    if (this_present_exec_summary || that_present_exec_summary) {
      if (!(this_present_exec_summary && that_present_exec_summary))
        return false;
      if (!this.exec_summary.equals(that.exec_summary))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNodes()) ? 131071 : 524287);
    if (isSetNodes())
      hashCode = hashCode * 8191 + nodes.hashCode();

    hashCode = hashCode * 8191 + ((isSetExec_summary()) ? 131071 : 524287);
    if (isSetExec_summary())
      hashCode = hashCode * 8191 + exec_summary.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRuntimeProfileTree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes, other.nodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExec_summary()).compareTo(other.isSetExec_summary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExec_summary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exec_summary, other.exec_summary);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRuntimeProfileTree(");
    boolean first = true;

    sb.append("nodes:");
    if (this.nodes == null) {
      sb.append("null");
    } else {
      sb.append(this.nodes);
    }
    first = false;
    if (isSetExec_summary()) {
      if (!first) sb.append(", ");
      sb.append("exec_summary:");
      if (this.exec_summary == null) {
        sb.append("null");
      } else {
        sb.append(this.exec_summary);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (nodes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodes' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (exec_summary != null) {
      exec_summary.validate();
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

  private static class TRuntimeProfileTreeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeProfileTreeStandardScheme getScheme() {
      return new TRuntimeProfileTreeStandardScheme();
    }
  }

  private static class TRuntimeProfileTreeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRuntimeProfileTree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list92 = iprot.readListBegin();
                struct.nodes = new java.util.ArrayList<TRuntimeProfileNode>(_list92.size);
                @org.apache.thrift.annotation.Nullable TRuntimeProfileNode _elem93;
                for (int _i94 = 0; _i94 < _list92.size; ++_i94)
                {
                  _elem93 = new TRuntimeProfileNode();
                  _elem93.read(iprot);
                  struct.nodes.add(_elem93);
                }
                iprot.readListEnd();
              }
              struct.setNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXEC_SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.exec_summary = new org.apache.impala.thrift.TExecSummary();
              struct.exec_summary.read(iprot);
              struct.setExec_summaryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodes != null) {
        oprot.writeFieldBegin(NODES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodes.size()));
          for (TRuntimeProfileNode _iter95 : struct.nodes)
          {
            _iter95.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.exec_summary != null) {
        if (struct.isSetExec_summary()) {
          oprot.writeFieldBegin(EXEC_SUMMARY_FIELD_DESC);
          struct.exec_summary.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRuntimeProfileTreeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeProfileTreeTupleScheme getScheme() {
      return new TRuntimeProfileTreeTupleScheme();
    }
  }

  private static class TRuntimeProfileTreeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRuntimeProfileTree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.nodes.size());
        for (TRuntimeProfileNode _iter96 : struct.nodes)
        {
          _iter96.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExec_summary()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExec_summary()) {
        struct.exec_summary.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRuntimeProfileTree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list97 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.nodes = new java.util.ArrayList<TRuntimeProfileNode>(_list97.size);
        @org.apache.thrift.annotation.Nullable TRuntimeProfileNode _elem98;
        for (int _i99 = 0; _i99 < _list97.size; ++_i99)
        {
          _elem98 = new TRuntimeProfileNode();
          _elem98.read(iprot);
          struct.nodes.add(_elem98);
        }
      }
      struct.setNodesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.exec_summary = new org.apache.impala.thrift.TExecSummary();
        struct.exec_summary.read(iprot);
        struct.setExec_summaryIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
