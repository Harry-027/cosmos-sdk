//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/types.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun groupPolicyInfo(block: cosmos.group.v1beta1.GroupPolicyInfoKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.GroupPolicyInfo =
  cosmos.group.v1beta1.GroupPolicyInfoKt.Dsl._create(cosmos.group.v1beta1.Types.GroupPolicyInfo.newBuilder()).apply { block() }._build()
public object GroupPolicyInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Types.GroupPolicyInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Types.GroupPolicyInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Types.GroupPolicyInfo = _builder.build()

    /**
     * <pre>
     * address is the account address of group policy.
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
     * address is the account address of group policy.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 2 [json_name = "groupId"];</code>
     */
    public var groupId: kotlin.Long
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 2 [json_name = "groupId"];</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }

    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 3 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
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
     * <code>string admin = 3 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the group policy.
     * </pre>
     *
     * <code>bytes metadata = 4 [json_name = "metadata"];</code>
     */
    public var metadata: com.google.protobuf.ByteString
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the group policy.
     * </pre>
     *
     * <code>bytes metadata = 4 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * version is used to track changes to a group's GroupPolicyInfo structure that
     * would create a different result on a running proposal.
     * </pre>
     *
     * <code>uint64 version = 5 [json_name = "version"];</code>
     */
    public var version: kotlin.Long
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * version is used to track changes to a group's GroupPolicyInfo structure that
     * would create a different result on a running proposal.
     * </pre>
     *
     * <code>uint64 version = 5 [json_name = "version"];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     */
    public var decisionPolicy: com.google.protobuf.Any
      @JvmName("getDecisionPolicy")
      get() = _builder.getDecisionPolicy()
      @JvmName("setDecisionPolicy")
      set(value) {
        _builder.setDecisionPolicy(value)
      }
    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     */
    public fun clearDecisionPolicy() {
      _builder.clearDecisionPolicy()
    }
    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 6 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     * @return Whether the decisionPolicy field is set.
     */
    public fun hasDecisionPolicy(): kotlin.Boolean {
      return _builder.hasDecisionPolicy()
    }

    /**
     * <pre>
     * created_at is a timestamp specifying when a group policy was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var createdAt: com.google.protobuf.Timestamp
      @JvmName("getCreatedAt")
      get() = _builder.getCreatedAt()
      @JvmName("setCreatedAt")
      set(value) {
        _builder.setCreatedAt(value)
      }
    /**
     * <pre>
     * created_at is a timestamp specifying when a group policy was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearCreatedAt() {
      _builder.clearCreatedAt()
    }
    /**
     * <pre>
     * created_at is a timestamp specifying when a group policy was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the createdAt field is set.
     */
    public fun hasCreatedAt(): kotlin.Boolean {
      return _builder.hasCreatedAt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Types.GroupPolicyInfo.copy(block: cosmos.group.v1beta1.GroupPolicyInfoKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.GroupPolicyInfo =
  cosmos.group.v1beta1.GroupPolicyInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()