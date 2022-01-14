//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/orm.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun tableDescriptor(block: cosmos.orm.v1alpha1.TableDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.TableDescriptor =
  cosmos.orm.v1alpha1.TableDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Orm.TableDescriptor.newBuilder()).apply { block() }._build()
public object TableDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Orm.TableDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Orm.TableDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Orm.TableDescriptor = _builder.build()

    /**
     * <pre>
     * primary_key defines the primary key for the table.
     * </pre>
     *
     * <code>.cosmos.orm.v1alpha1.PrimaryKeyDescriptor primary_key = 1 [json_name = "primaryKey"];</code>
     */
    public var primaryKey: cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor
      @JvmName("getPrimaryKey")
      get() = _builder.getPrimaryKey()
      @JvmName("setPrimaryKey")
      set(value) {
        _builder.setPrimaryKey(value)
      }
    /**
     * <pre>
     * primary_key defines the primary key for the table.
     * </pre>
     *
     * <code>.cosmos.orm.v1alpha1.PrimaryKeyDescriptor primary_key = 1 [json_name = "primaryKey"];</code>
     */
    public fun clearPrimaryKey() {
      _builder.clearPrimaryKey()
    }
    /**
     * <pre>
     * primary_key defines the primary key for the table.
     * </pre>
     *
     * <code>.cosmos.orm.v1alpha1.PrimaryKeyDescriptor primary_key = 1 [json_name = "primaryKey"];</code>
     * @return Whether the primaryKey field is set.
     */
    public fun hasPrimaryKey(): kotlin.Boolean {
      return _builder.hasPrimaryKey()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IndexProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     */
     public val index: com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIndexList()
      )
    /**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     * @param value The index to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIndex")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.add(value: cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor) {
      _builder.addIndex(value)
    }/**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     * @param value The index to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIndex")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.plusAssign(value: cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor) {
      add(value)
    }/**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     * @param values The index to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIndex")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.addAll(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor>) {
      _builder.addAllIndex(values)
    }/**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     * @param values The index to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIndex")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     * @param index The index to set the value at.
     * @param value The index to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIndex")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.set(index: kotlin.Int, value: cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor) {
      _builder.setIndex(index, value)
    }/**
     * <pre>
     * index defines one or more secondary indexes.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SecondaryIndexDescriptor index = 2 [json_name = "index"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIndex")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor, IndexProxy>.clear() {
      _builder.clearIndex()
    }
    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the
     * tables and singletons in this file. It may be deprecated in the future when this
     * can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 3 [json_name = "id"];</code>
     */
    public var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the
     * tables and singletons in this file. It may be deprecated in the future when this
     * can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 3 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Orm.TableDescriptor.copy(block: cosmos.orm.v1alpha1.TableDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.TableDescriptor =
  cosmos.orm.v1alpha1.TableDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()