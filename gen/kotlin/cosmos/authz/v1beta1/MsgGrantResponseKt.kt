//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/tx.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgGrantResponse(block: cosmos.authz.v1beta1.MsgGrantResponseKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Tx.MsgGrantResponse =
  cosmos.authz.v1beta1.MsgGrantResponseKt.Dsl._create(cosmos.authz.v1beta1.Tx.MsgGrantResponse.newBuilder()).apply { block() }._build()
public object MsgGrantResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Tx.MsgGrantResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Tx.MsgGrantResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Tx.MsgGrantResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Tx.MsgGrantResponse.copy(block: cosmos.authz.v1beta1.MsgGrantResponseKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Tx.MsgGrantResponse =
  cosmos.authz.v1beta1.MsgGrantResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()