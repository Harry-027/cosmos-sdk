//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgCreateGroupPolicyResponse(block: cosmos.group.v1beta1.MsgCreateGroupPolicyResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse =
  cosmos.group.v1beta1.MsgCreateGroupPolicyResponseKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse.newBuilder()).apply { block() }._build()
public object MsgCreateGroupPolicyResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse = _builder.build()

    /**
     * <pre>
     * address is the account address of the newly created group policy.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the account address of the newly created group policy.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse.copy(block: cosmos.group.v1beta1.MsgCreateGroupPolicyResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicyResponse =
  cosmos.group.v1beta1.MsgCreateGroupPolicyResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()