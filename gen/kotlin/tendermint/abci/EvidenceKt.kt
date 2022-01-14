//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun evidence(block: tendermint.abci.EvidenceKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.Evidence =
  tendermint.abci.EvidenceKt.Dsl._create(tendermint.abci.Types.Evidence.newBuilder()).apply { block() }._build()
public object EvidenceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.Evidence.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.Evidence.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.Evidence = _builder.build()

    /**
     * <code>.tendermint.abci.EvidenceType type = 1 [json_name = "type"];</code>
     */
    public var type: tendermint.abci.Types.EvidenceType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>.tendermint.abci.EvidenceType type = 1 [json_name = "type"];</code>
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * <pre>
     * The offending validator
     * </pre>
     *
     * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public var validator: tendermint.abci.Types.Validator
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <pre>
     * The offending validator
     * </pre>
     *
     * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public fun clearValidator() {
      _builder.clearValidator()
    }
    /**
     * <pre>
     * The offending validator
     * </pre>
     *
     * <code>.tendermint.abci.Validator validator = 2 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return Whether the validator field is set.
     */
    public fun hasValidator(): kotlin.Boolean {
      return _builder.hasValidator()
    }

    /**
     * <pre>
     * The height when the offense occurred
     * </pre>
     *
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
     * <pre>
     * The height when the offense occurred
     * </pre>
     *
     * <code>int64 height = 3 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * The corresponding time where the offense occurred
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var time: com.google.protobuf.Timestamp
      @JvmName("getTime")
      get() = _builder.getTime()
      @JvmName("setTime")
      set(value) {
        _builder.setTime(value)
      }
    /**
     * <pre>
     * The corresponding time where the offense occurred
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearTime() {
      _builder.clearTime()
    }
    /**
     * <pre>
     * The corresponding time where the offense occurred
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the time field is set.
     */
    public fun hasTime(): kotlin.Boolean {
      return _builder.hasTime()
    }

    /**
     * <pre>
     * Total voting power of the validator set in case the ABCI application does
     * not store historical validators.
     * https://github.com/tendermint/tendermint/issues/4581
     * </pre>
     *
     * <code>int64 total_voting_power = 5 [json_name = "totalVotingPower"];</code>
     */
    public var totalVotingPower: kotlin.Long
      @JvmName("getTotalVotingPower")
      get() = _builder.getTotalVotingPower()
      @JvmName("setTotalVotingPower")
      set(value) {
        _builder.setTotalVotingPower(value)
      }
    /**
     * <pre>
     * Total voting power of the validator set in case the ABCI application does
     * not store historical validators.
     * https://github.com/tendermint/tendermint/issues/4581
     * </pre>
     *
     * <code>int64 total_voting_power = 5 [json_name = "totalVotingPower"];</code>
     */
    public fun clearTotalVotingPower() {
      _builder.clearTotalVotingPower()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.Evidence.copy(block: tendermint.abci.EvidenceKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.Evidence =
  tendermint.abci.EvidenceKt.Dsl._create(this.toBuilder()).apply { block() }._build()