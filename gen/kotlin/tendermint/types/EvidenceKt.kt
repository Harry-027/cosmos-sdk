//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/evidence.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun evidence(block: tendermint.types.EvidenceKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.Evidence =
  tendermint.types.EvidenceKt.Dsl._create(tendermint.types.EvidenceOuterClass.Evidence.newBuilder()).apply { block() }._build()
public object EvidenceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.EvidenceOuterClass.Evidence.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.EvidenceOuterClass.Evidence.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.EvidenceOuterClass.Evidence = _builder.build()

    /**
     * <code>.tendermint.types.DuplicateVoteEvidence duplicate_vote_evidence = 1 [json_name = "duplicateVoteEvidence"];</code>
     */
    public var duplicateVoteEvidence: tendermint.types.EvidenceOuterClass.DuplicateVoteEvidence
      @JvmName("getDuplicateVoteEvidence")
      get() = _builder.getDuplicateVoteEvidence()
      @JvmName("setDuplicateVoteEvidence")
      set(value) {
        _builder.setDuplicateVoteEvidence(value)
      }
    /**
     * <code>.tendermint.types.DuplicateVoteEvidence duplicate_vote_evidence = 1 [json_name = "duplicateVoteEvidence"];</code>
     */
    public fun clearDuplicateVoteEvidence() {
      _builder.clearDuplicateVoteEvidence()
    }
    /**
     * <code>.tendermint.types.DuplicateVoteEvidence duplicate_vote_evidence = 1 [json_name = "duplicateVoteEvidence"];</code>
     * @return Whether the duplicateVoteEvidence field is set.
     */
    public fun hasDuplicateVoteEvidence(): kotlin.Boolean {
      return _builder.hasDuplicateVoteEvidence()
    }

    /**
     * <code>.tendermint.types.LightClientAttackEvidence light_client_attack_evidence = 2 [json_name = "lightClientAttackEvidence"];</code>
     */
    public var lightClientAttackEvidence: tendermint.types.EvidenceOuterClass.LightClientAttackEvidence
      @JvmName("getLightClientAttackEvidence")
      get() = _builder.getLightClientAttackEvidence()
      @JvmName("setLightClientAttackEvidence")
      set(value) {
        _builder.setLightClientAttackEvidence(value)
      }
    /**
     * <code>.tendermint.types.LightClientAttackEvidence light_client_attack_evidence = 2 [json_name = "lightClientAttackEvidence"];</code>
     */
    public fun clearLightClientAttackEvidence() {
      _builder.clearLightClientAttackEvidence()
    }
    /**
     * <code>.tendermint.types.LightClientAttackEvidence light_client_attack_evidence = 2 [json_name = "lightClientAttackEvidence"];</code>
     * @return Whether the lightClientAttackEvidence field is set.
     */
    public fun hasLightClientAttackEvidence(): kotlin.Boolean {
      return _builder.hasLightClientAttackEvidence()
    }
    public val sumCase: tendermint.types.EvidenceOuterClass.Evidence.SumCase
      @JvmName("getSumCase")
      get() = _builder.getSumCase()

    public fun clearSum() {
      _builder.clearSum()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.EvidenceOuterClass.Evidence.copy(block: tendermint.types.EvidenceKt.Dsl.() -> kotlin.Unit): tendermint.types.EvidenceOuterClass.Evidence =
  tendermint.types.EvidenceKt.Dsl._create(this.toBuilder()).apply { block() }._build()