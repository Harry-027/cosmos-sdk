//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/query.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryOwnerResponse(block: cosmos.nft.v1beta1.QueryOwnerResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse =
  cosmos.nft.v1beta1.QueryOwnerResponseKt.Dsl._create(cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.newBuilder()).apply { block() }._build()
public object QueryOwnerResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse = _builder.build()

    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     */
    public var owner: kotlin.String
      @JvmName("getOwner")
      get() = _builder.getOwner()
      @JvmName("setOwner")
      set(value) {
        _builder.setOwner(value)
      }
    /**
     * <code>string owner = 1 [json_name = "owner"];</code>
     */
    public fun clearOwner() {
      _builder.clearOwner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.copy(block: cosmos.nft.v1beta1.QueryOwnerResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.QueryOuterClass.QueryOwnerResponse =
  cosmos.nft.v1beta1.QueryOwnerResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()