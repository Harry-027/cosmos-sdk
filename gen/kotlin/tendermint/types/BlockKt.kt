//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/block.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun block(block: tendermint.types.BlockKt.Dsl.() -> kotlin.Unit): tendermint.types.BlockOuterClass.Block =
  tendermint.types.BlockKt.Dsl._create(tendermint.types.BlockOuterClass.Block.newBuilder()).apply { block() }._build()
public object BlockKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.BlockOuterClass.Block.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.BlockOuterClass.Block.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.BlockOuterClass.Block = _builder.build()

    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public var header: tendermint.types.Types.Header
      @JvmName("getHeader")
      get() = _builder.getHeader()
      @JvmName("setHeader")
      set(value) {
        _builder.setHeader(value)
      }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public fun clearHeader() {
      _builder.clearHeader()
    }
    /**
     * <code>.tendermint.types.Header header = 1 [json_name = "header", (.gogoproto.nullable) = false];</code>
     * @return Whether the header field is set.
     */
    public fun hasHeader(): kotlin.Boolean {
      return _builder.hasHeader()
    }

    /**
     * <code>.tendermint.types.Data data = 2 [json_name = "data", (.gogoproto.nullable) = false];</code>
     */
    public var data: tendermint.types.Types.Data
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>.tendermint.types.Data data = 2 [json_name = "data", (.gogoproto.nullable) = false];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * <code>.tendermint.types.Data data = 2 [json_name = "data", (.gogoproto.nullable) = false];</code>
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }

    /**
     * <code>.tendermint.types.EvidenceList evidence = 3 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
    public var evidence: tendermint.types.EvidenceOuterClass.EvidenceList
      @JvmName("getEvidence")
      get() = _builder.getEvidence()
      @JvmName("setEvidence")
      set(value) {
        _builder.setEvidence(value)
      }
    /**
     * <code>.tendermint.types.EvidenceList evidence = 3 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
    public fun clearEvidence() {
      _builder.clearEvidence()
    }
    /**
     * <code>.tendermint.types.EvidenceList evidence = 3 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @return Whether the evidence field is set.
     */
    public fun hasEvidence(): kotlin.Boolean {
      return _builder.hasEvidence()
    }

    /**
     * <code>.tendermint.types.Commit last_commit = 4 [json_name = "lastCommit"];</code>
     */
    public var lastCommit: tendermint.types.Types.Commit
      @JvmName("getLastCommit")
      get() = _builder.getLastCommit()
      @JvmName("setLastCommit")
      set(value) {
        _builder.setLastCommit(value)
      }
    /**
     * <code>.tendermint.types.Commit last_commit = 4 [json_name = "lastCommit"];</code>
     */
    public fun clearLastCommit() {
      _builder.clearLastCommit()
    }
    /**
     * <code>.tendermint.types.Commit last_commit = 4 [json_name = "lastCommit"];</code>
     * @return Whether the lastCommit field is set.
     */
    public fun hasLastCommit(): kotlin.Boolean {
      return _builder.hasLastCommit()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.BlockOuterClass.Block.copy(block: tendermint.types.BlockKt.Dsl.() -> kotlin.Unit): tendermint.types.BlockOuterClass.Block =
  tendermint.types.BlockKt.Dsl._create(this.toBuilder()).apply { block() }._build()