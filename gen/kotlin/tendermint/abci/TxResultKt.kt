//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun txResult(block: tendermint.abci.TxResultKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.TxResult =
  tendermint.abci.TxResultKt.Dsl._create(tendermint.abci.Types.TxResult.newBuilder()).apply { block() }._build()
public object TxResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.TxResult.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.TxResult.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.TxResult = _builder.build()

    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>uint32 index = 2 [json_name = "index"];</code>
     */
    public var index: kotlin.Int
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * <code>uint32 index = 2 [json_name = "index"];</code>
     */
    public fun clearIndex() {
      _builder.clearIndex()
    }

    /**
     * <code>bytes tx = 3 [json_name = "tx"];</code>
     */
    public var tx: com.google.protobuf.ByteString
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <code>bytes tx = 3 [json_name = "tx"];</code>
     */
    public fun clearTx() {
      _builder.clearTx()
    }

    /**
     * <code>.tendermint.abci.ResponseDeliverTx result = 4 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public var result: tendermint.abci.Types.ResponseDeliverTx
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx result = 4 [json_name = "result", (.gogoproto.nullable) = false];</code>
     */
    public fun clearResult() {
      _builder.clearResult()
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx result = 4 [json_name = "result", (.gogoproto.nullable) = false];</code>
     * @return Whether the result field is set.
     */
    public fun hasResult(): kotlin.Boolean {
      return _builder.hasResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.TxResult.copy(block: tendermint.abci.TxResultKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.TxResult =
  tendermint.abci.TxResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()