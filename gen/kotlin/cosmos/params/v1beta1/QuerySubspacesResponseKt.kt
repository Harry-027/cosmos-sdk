//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package cosmos.params.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun querySubspacesResponse(block: cosmos.params.v1beta1.QuerySubspacesResponseKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse =
  cosmos.params.v1beta1.QuerySubspacesResponseKt.Dsl._create(cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse.newBuilder()).apply { block() }._build()
public object QuerySubspacesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SubspacesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     */
     public val subspaces: com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSubspacesList()
      )
    /**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     * @param value The subspaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSubspaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.add(value: cosmos.params.v1beta1.QueryOuterClass.Subspace) {
      _builder.addSubspaces(value)
    }/**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     * @param value The subspaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSubspaces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.plusAssign(value: cosmos.params.v1beta1.QueryOuterClass.Subspace) {
      add(value)
    }/**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     * @param values The subspaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSubspaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.params.v1beta1.QueryOuterClass.Subspace>) {
      _builder.addAllSubspaces(values)
    }/**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     * @param values The subspaces to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSubspaces")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.params.v1beta1.QueryOuterClass.Subspace>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     * @param index The index to set the value at.
     * @param value The subspaces to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSubspaces")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.set(index: kotlin.Int, value: cosmos.params.v1beta1.QueryOuterClass.Subspace) {
      _builder.setSubspaces(index, value)
    }/**
     * <code>repeated .cosmos.params.v1beta1.Subspace subspaces = 1 [json_name = "subspaces"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSubspaces")
    public fun com.google.protobuf.kotlin.DslList<cosmos.params.v1beta1.QueryOuterClass.Subspace, SubspacesProxy>.clear() {
      _builder.clearSubspaces()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse.copy(block: cosmos.params.v1beta1.QuerySubspacesResponseKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QuerySubspacesResponse =
  cosmos.params.v1beta1.QuerySubspacesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()