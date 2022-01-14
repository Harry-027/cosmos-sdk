//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDelegatorDelegationsRequest(block: cosmos.staking.v1beta1.QueryDelegatorDelegationsRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest =
  cosmos.staking.v1beta1.QueryDelegatorDelegationsRequestKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest.newBuilder()).apply { block() }._build()
public object QueryDelegatorDelegationsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest = _builder.build()

    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var delegatorAddr: kotlin.String
      @JvmName("getDelegatorAddr")
      get() = _builder.getDelegatorAddr()
      @JvmName("setDelegatorAddr")
      set(value) {
        _builder.setDelegatorAddr(value)
      }
    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1 [json_name = "delegatorAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddr() {
      _builder.clearDelegatorAddr()
    }

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest.copy(block: cosmos.staking.v1beta1.QueryDelegatorDelegationsRequestKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorDelegationsRequest =
  cosmos.staking.v1beta1.QueryDelegatorDelegationsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()