//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun validatorOutstandingRewardsRecord(block: cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord =
  cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecordKt.Dsl._create(cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord.newBuilder()).apply { block() }._build()
public object ValidatorOutstandingRewardsRecordKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord = _builder.build()

    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OutstandingRewardsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
     public val outstandingRewards: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOutstandingRewardsList()
      )
    /**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param value The outstandingRewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOutstandingRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      _builder.addOutstandingRewards(value)
    }/**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param value The outstandingRewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOutstandingRewards")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      add(value)
    }/**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param values The outstandingRewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOutstandingRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.DecCoin>) {
      _builder.addAllOutstandingRewards(values)
    }/**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param values The outstandingRewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOutstandingRewards")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.DecCoin>) {
      addAll(values)
    }/**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param index The index to set the value at.
     * @param value The outstandingRewards to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOutstandingRewards")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      _builder.setOutstandingRewards(index, value)
    }/**
     * <pre>
     * outstanding_rewards represents the oustanding rewards of a validator.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.DecCoin outstanding_rewards = 2 [json_name = "outstandingRewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOutstandingRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, OutstandingRewardsProxy>.clear() {
      _builder.clearOutstandingRewards()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord.copy(block: cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorOutstandingRewardsRecord =
  cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecordKt.Dsl._create(this.toBuilder()).apply { block() }._build()