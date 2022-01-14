//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun requestInfo(block: tendermint.abci.RequestInfoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestInfo =
  tendermint.abci.RequestInfoKt.Dsl._create(tendermint.abci.Types.RequestInfo.newBuilder()).apply { block() }._build()
public object RequestInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestInfo = _builder.build()

    /**
     * <code>string version = 1 [json_name = "version"];</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <code>uint64 block_version = 2 [json_name = "blockVersion"];</code>
     */
    public var blockVersion: kotlin.Long
      @JvmName("getBlockVersion")
      get() = _builder.getBlockVersion()
      @JvmName("setBlockVersion")
      set(value) {
        _builder.setBlockVersion(value)
      }
    /**
     * <code>uint64 block_version = 2 [json_name = "blockVersion"];</code>
     */
    public fun clearBlockVersion() {
      _builder.clearBlockVersion()
    }

    /**
     * <code>uint64 p2p_version = 3 [json_name = "p2pVersion"];</code>
     */
    public var p2PVersion: kotlin.Long
      @JvmName("getP2PVersion")
      get() = _builder.getP2PVersion()
      @JvmName("setP2PVersion")
      set(value) {
        _builder.setP2PVersion(value)
      }
    /**
     * <code>uint64 p2p_version = 3 [json_name = "p2pVersion"];</code>
     */
    public fun clearP2PVersion() {
      _builder.clearP2PVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestInfo.copy(block: tendermint.abci.RequestInfoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestInfo =
  tendermint.abci.RequestInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()