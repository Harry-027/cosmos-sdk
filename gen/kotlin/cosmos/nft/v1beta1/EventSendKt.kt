//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/event.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun eventSend(block: cosmos.nft.v1beta1.EventSendKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Event.EventSend =
  cosmos.nft.v1beta1.EventSendKt.Dsl._create(cosmos.nft.v1beta1.Event.EventSend.newBuilder()).apply { block() }._build()
public object EventSendKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Event.EventSend.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Event.EventSend.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Event.EventSend = _builder.build()

    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public var classId: kotlin.String
      @JvmName("getClassId")
      get() = _builder.getClassId()
      @JvmName("setClassId")
      set(value) {
        _builder.setClassId(value)
      }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public fun clearClassId() {
      _builder.clearClassId()
    }

    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string sender = 3 [json_name = "sender"];</code>
     */
    public var sender: kotlin.String
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <code>string sender = 3 [json_name = "sender"];</code>
     */
    public fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <code>string receiver = 4 [json_name = "receiver"];</code>
     */
    public var receiver: kotlin.String
      @JvmName("getReceiver")
      get() = _builder.getReceiver()
      @JvmName("setReceiver")
      set(value) {
        _builder.setReceiver(value)
      }
    /**
     * <code>string receiver = 4 [json_name = "receiver"];</code>
     */
    public fun clearReceiver() {
      _builder.clearReceiver()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Event.EventSend.copy(block: cosmos.nft.v1beta1.EventSendKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Event.EventSend =
  cosmos.nft.v1beta1.EventSendKt.Dsl._create(this.toBuilder()).apply { block() }._build()