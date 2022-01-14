//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun requestQuery(block: tendermint.abci.RequestQueryKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestQuery =
  tendermint.abci.RequestQueryKt.Dsl._create(tendermint.abci.Types.RequestQuery.newBuilder()).apply { block() }._build()
public object RequestQueryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestQuery.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestQuery.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestQuery = _builder.build()

    /**
     * <code>bytes data = 1 [json_name = "data"];</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>bytes data = 1 [json_name = "data"];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }

    /**
     * <code>string path = 2 [json_name = "path"];</code>
     */
    public var path: kotlin.String
      @JvmName("getPath")
      get() = _builder.getPath()
      @JvmName("setPath")
      set(value) {
        _builder.setPath(value)
      }
    /**
     * <code>string path = 2 [json_name = "path"];</code>
     */
    public fun clearPath() {
      _builder.clearPath()
    }

    /**
     * <code>int64 height = 3 [json_name = "height"];</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>int64 height = 3 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>bool prove = 4 [json_name = "prove"];</code>
     */
    public var prove: kotlin.Boolean
      @JvmName("getProve")
      get() = _builder.getProve()
      @JvmName("setProve")
      set(value) {
        _builder.setProve(value)
      }
    /**
     * <code>bool prove = 4 [json_name = "prove"];</code>
     */
    public fun clearProve() {
      _builder.clearProve()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestQuery.copy(block: tendermint.abci.RequestQueryKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestQuery =
  tendermint.abci.RequestQueryKt.Dsl._create(this.toBuilder()).apply { block() }._build()