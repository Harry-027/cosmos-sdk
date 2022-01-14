//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun votingParams(block: cosmos.gov.v1beta1.VotingParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.VotingParams =
  cosmos.gov.v1beta1.VotingParamsKt.Dsl._create(cosmos.gov.v1beta1.Gov.VotingParams.newBuilder()).apply { block() }._build()
public object VotingParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.Gov.VotingParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Gov.VotingParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Gov.VotingParams = _builder.build()

    /**
     * <pre>
     *  Length of the voting period.
     * </pre>
     *
     * <code>.google.protobuf.Duration voting_period = 1 [json_name = "votingPeriod", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public var votingPeriod: com.google.protobuf.Duration
      @JvmName("getVotingPeriod")
      get() = _builder.getVotingPeriod()
      @JvmName("setVotingPeriod")
      set(value) {
        _builder.setVotingPeriod(value)
      }
    /**
     * <pre>
     *  Length of the voting period.
     * </pre>
     *
     * <code>.google.protobuf.Duration voting_period = 1 [json_name = "votingPeriod", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public fun clearVotingPeriod() {
      _builder.clearVotingPeriod()
    }
    /**
     * <pre>
     *  Length of the voting period.
     * </pre>
     *
     * <code>.google.protobuf.Duration voting_period = 1 [json_name = "votingPeriod", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the votingPeriod field is set.
     */
    public fun hasVotingPeriod(): kotlin.Boolean {
      return _builder.hasVotingPeriod()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta1.Gov.VotingParams.copy(block: cosmos.gov.v1beta1.VotingParamsKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.VotingParams =
  cosmos.gov.v1beta1.VotingParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()