//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun responseEcho(block: tendermint.abci.ResponseEchoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseEcho =
  tendermint.abci.ResponseEchoKt.Dsl._create(tendermint.abci.Types.ResponseEcho.newBuilder()).apply { block() }._build()
public object ResponseEchoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseEcho.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseEcho.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseEcho = _builder.build()

    /**
     * <code>string message = 1 [json_name = "message"];</code>
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <code>string message = 1 [json_name = "message"];</code>
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseEcho.copy(block: tendermint.abci.ResponseEchoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseEcho =
  tendermint.abci.ResponseEchoKt.Dsl._create(this.toBuilder()).apply { block() }._build()