//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgUpdateGroupPolicyAdmin(block: cosmos.group.v1beta1.MsgUpdateGroupPolicyAdminKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin =
  cosmos.group.v1beta1.MsgUpdateGroupPolicyAdminKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin.newBuilder()).apply { block() }._build()
public object MsgUpdateGroupPolicyAdminKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin = _builder.build()

    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * address is the account address of the group policy.
     * </pre>
     *
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * <code>string address = 2 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * new_admin is the new group policy admin.
     * </pre>
     *
     * <code>string new_admin = 3 [json_name = "newAdmin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var newAdmin: kotlin.String
      @JvmName("getNewAdmin")
      get() = _builder.getNewAdmin()
      @JvmName("setNewAdmin")
      set(value) {
        _builder.setNewAdmin(value)
      }
    /**
     * <pre>
     * new_admin is the new group policy admin.
     * </pre>
     *
     * <code>string new_admin = 3 [json_name = "newAdmin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearNewAdmin() {
      _builder.clearNewAdmin()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin.copy(block: cosmos.group.v1beta1.MsgUpdateGroupPolicyAdminKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupPolicyAdmin =
  cosmos.group.v1beta1.MsgUpdateGroupPolicyAdminKt.Dsl._create(this.toBuilder()).apply { block() }._build()