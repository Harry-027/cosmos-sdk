//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/types.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun groupMember(block: cosmos.group.v1beta1.GroupMemberKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.GroupMember =
  cosmos.group.v1beta1.GroupMemberKt.Dsl._create(cosmos.group.v1beta1.Types.GroupMember.newBuilder()).apply { block() }._build()
public object GroupMemberKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Types.GroupMember.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Types.GroupMember.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Types.GroupMember = _builder.build()

    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
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
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }

    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Member member = 2 [json_name = "member"];</code>
     */
    public var member: cosmos.group.v1beta1.Types.Member
      @JvmName("getMember")
      get() = _builder.getMember()
      @JvmName("setMember")
      set(value) {
        _builder.setMember(value)
      }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Member member = 2 [json_name = "member"];</code>
     */
    public fun clearMember() {
      _builder.clearMember()
    }
    /**
     * <pre>
     * member is the member data.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Member member = 2 [json_name = "member"];</code>
     * @return Whether the member field is set.
     */
    public fun hasMember(): kotlin.Boolean {
      return _builder.hasMember()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Types.GroupMember.copy(block: cosmos.group.v1beta1.GroupMemberKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Types.GroupMember =
  cosmos.group.v1beta1.GroupMemberKt.Dsl._create(this.toBuilder()).apply { block() }._build()