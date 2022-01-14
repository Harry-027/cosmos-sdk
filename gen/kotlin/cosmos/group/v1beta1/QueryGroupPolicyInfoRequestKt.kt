//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/query.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryGroupPolicyInfoRequest(block: cosmos.group.v1beta1.QueryGroupPolicyInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest =
  cosmos.group.v1beta1.QueryGroupPolicyInfoRequestKt.Dsl._create(cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest.newBuilder()).apply { block() }._build()
public object QueryGroupPolicyInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest = _builder.build()

    /**
     * <pre>
     * address is the account address of the group policy.
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
     * address is the account address of the group policy.
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
public inline fun cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest.copy(block: cosmos.group.v1beta1.QueryGroupPolicyInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryGroupPolicyInfoRequest =
  cosmos.group.v1beta1.QueryGroupPolicyInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()