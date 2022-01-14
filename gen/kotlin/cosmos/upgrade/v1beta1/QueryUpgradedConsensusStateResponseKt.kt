//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package cosmos.upgrade.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryUpgradedConsensusStateResponse(block: cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponseKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse =
  cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponseKt.Dsl._create(cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse.newBuilder()).apply { block() }._build()
public object QueryUpgradedConsensusStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse = _builder.build()

    /**
     * <pre>
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bytes upgraded_consensus_state = 2 [json_name = "upgradedConsensusState"];</code>
     */
    public var upgradedConsensusState: com.google.protobuf.ByteString
      @JvmName("getUpgradedConsensusState")
      get() = _builder.getUpgradedConsensusState()
      @JvmName("setUpgradedConsensusState")
      set(value) {
        _builder.setUpgradedConsensusState(value)
      }
    /**
     * <pre>
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bytes upgraded_consensus_state = 2 [json_name = "upgradedConsensusState"];</code>
     */
    public fun clearUpgradedConsensusState() {
      _builder.clearUpgradedConsensusState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse.copy(block: cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponseKt.Dsl.() -> kotlin.Unit): cosmos.upgrade.v1beta1.QueryOuterClass.QueryUpgradedConsensusStateResponse =
  cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()