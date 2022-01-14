//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgWithdrawDelegatorReward(block: cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward =
  cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward.newBuilder()).apply { block() }._build()
public object MsgWithdrawDelegatorRewardKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward = _builder.build()

    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 2 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward.copy(block: cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgWithdrawDelegatorReward =
  cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardKt.Dsl._create(this.toBuilder()).apply { block() }._build()