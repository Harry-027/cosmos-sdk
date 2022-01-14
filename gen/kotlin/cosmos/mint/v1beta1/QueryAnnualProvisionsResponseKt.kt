//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/mint/v1beta1/query.proto

package cosmos.mint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryAnnualProvisionsResponse(block: cosmos.mint.v1beta1.QueryAnnualProvisionsResponseKt.Dsl.() -> kotlin.Unit): cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse =
  cosmos.mint.v1beta1.QueryAnnualProvisionsResponseKt.Dsl._create(cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse.newBuilder()).apply { block() }._build()
public object QueryAnnualProvisionsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse = _builder.build()

    /**
     * <pre>
     * annual_provisions is the current minting annual provisions value.
     * </pre>
     *
     * <code>bytes annual_provisions = 1 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public var annualProvisions: com.google.protobuf.ByteString
      @JvmName("getAnnualProvisions")
      get() = _builder.getAnnualProvisions()
      @JvmName("setAnnualProvisions")
      set(value) {
        _builder.setAnnualProvisions(value)
      }
    /**
     * <pre>
     * annual_provisions is the current minting annual provisions value.
     * </pre>
     *
     * <code>bytes annual_provisions = 1 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public fun clearAnnualProvisions() {
      _builder.clearAnnualProvisions()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse.copy(block: cosmos.mint.v1beta1.QueryAnnualProvisionsResponseKt.Dsl.() -> kotlin.Unit): cosmos.mint.v1beta1.QueryOuterClass.QueryAnnualProvisionsResponse =
  cosmos.mint.v1beta1.QueryAnnualProvisionsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()