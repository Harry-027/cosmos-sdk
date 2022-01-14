//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getValidatorSetByHeightRequest(block: cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest =
  cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequestKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest.newBuilder()).apply { block() }._build()
public object GetValidatorSetByHeightRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest = _builder.build()

    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * pagination defines an pagination for the request.
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
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
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
public inline fun cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest.copy(block: cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetValidatorSetByHeightRequest =
  cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()