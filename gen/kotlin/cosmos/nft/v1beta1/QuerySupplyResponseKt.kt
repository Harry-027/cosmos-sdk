//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/query.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun querySupplyResponse(block: cosmos.nft.v1beta1.QuerySupplyResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse =
  cosmos.nft.v1beta1.QuerySupplyResponseKt.Dsl._create(cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.newBuilder()).apply { block() }._build()
public object QuerySupplyResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse = _builder.build()

    /**
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     */
    public var amount: kotlin.Long
      @JvmName("getAmount")
      get() = _builder.getAmount()
      @JvmName("setAmount")
      set(value) {
        _builder.setAmount(value)
      }
    /**
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     */
    public fun clearAmount() {
      _builder.clearAmount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.copy(block: cosmos.nft.v1beta1.QuerySupplyResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.QueryOuterClass.QuerySupplyResponse =
  cosmos.nft.v1beta1.QuerySupplyResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()