//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun addressBytesToStringResponse(block: cosmos.auth.v1beta1.AddressBytesToStringResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse =
  cosmos.auth.v1beta1.AddressBytesToStringResponseKt.Dsl._create(cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse.newBuilder()).apply { block() }._build()
public object AddressBytesToStringResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse = _builder.build()

    /**
     * <code>string address_string = 1 [json_name = "addressString"];</code>
     */
    public var addressString: kotlin.String
      @JvmName("getAddressString")
      get() = _builder.getAddressString()
      @JvmName("setAddressString")
      set(value) {
        _builder.setAddressString(value)
      }
    /**
     * <code>string address_string = 1 [json_name = "addressString"];</code>
     */
    public fun clearAddressString() {
      _builder.clearAddressString()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse.copy(block: cosmos.auth.v1beta1.AddressBytesToStringResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.AddressBytesToStringResponse =
  cosmos.auth.v1beta1.AddressBytesToStringResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()