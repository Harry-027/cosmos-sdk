//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgUpdateGroupMembersResponse(block: cosmos.group.v1beta1.MsgUpdateGroupMembersResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse =
  cosmos.group.v1beta1.MsgUpdateGroupMembersResponseKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse.newBuilder()).apply { block() }._build()
public object MsgUpdateGroupMembersResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse.copy(block: cosmos.group.v1beta1.MsgUpdateGroupMembersResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupMembersResponse =
  cosmos.group.v1beta1.MsgUpdateGroupMembersResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()