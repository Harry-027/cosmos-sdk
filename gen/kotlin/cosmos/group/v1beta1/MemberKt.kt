//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/types.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun member(block: cosmos.group.v1beta1.MemberKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.Member =
  cosmos.group.v1beta1.MemberKt.Dsl._create(cosmos.group.v1beta1.Types.Member.newBuilder()).apply { block() }._build()
public object MemberKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Types.Member.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Types.Member.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Types.Member = _builder.build()

    /**
     * <pre>
     * address is the member's account address.
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
     * address is the member's account address.
     * </pre>
     *
     * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * weight is the member's voting weight that should be greater than 0.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight"];</code>
     */
    public var weight: kotlin.String
      @JvmName("getWeight")
      get() = _builder.getWeight()
      @JvmName("setWeight")
      set(value) {
        _builder.setWeight(value)
      }
    /**
     * <pre>
     * weight is the member's voting weight that should be greater than 0.
     * </pre>
     *
     * <code>string weight = 2 [json_name = "weight"];</code>
     */
    public fun clearWeight() {
      _builder.clearWeight()
    }

    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the member.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
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
     * metadata is any arbitrary metadata to attached to the member.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * added_at is a timestamp specifying when a member was added.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp added_at = 4 [json_name = "addedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var addedAt: com.google.protobuf.Timestamp
      @JvmName("getAddedAt")
      get() = _builder.getAddedAt()
      @JvmName("setAddedAt")
      set(value) {
        _builder.setAddedAt(value)
      }
    /**
     * <pre>
     * added_at is a timestamp specifying when a member was added.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp added_at = 4 [json_name = "addedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearAddedAt() {
      _builder.clearAddedAt()
    }
    /**
     * <pre>
     * added_at is a timestamp specifying when a member was added.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp added_at = 4 [json_name = "addedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the addedAt field is set.
     */
    public fun hasAddedAt(): kotlin.Boolean {
      return _builder.hasAddedAt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Types.Member.copy(block: cosmos.group.v1beta1.MemberKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.Member =
  cosmos.group.v1beta1.MemberKt.Dsl._create(this.toBuilder()).apply { block() }._build()