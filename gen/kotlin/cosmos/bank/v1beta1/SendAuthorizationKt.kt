//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/authz.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun sendAuthorization(block: cosmos.bank.v1beta1.SendAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.Authz.SendAuthorization =
  cosmos.bank.v1beta1.SendAuthorizationKt.Dsl._create(cosmos.bank.v1beta1.Authz.SendAuthorization.newBuilder()).apply { block() }._build()
public object SendAuthorizationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.Authz.SendAuthorization.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.Authz.SendAuthorization.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.Authz.SendAuthorization = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SpendLimitProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val spendLimit: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSpendLimitList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The spendLimit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSpendLimit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addSpendLimit(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The spendLimit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSpendLimit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The spendLimit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSpendLimit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllSpendLimit(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The spendLimit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSpendLimit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The spendLimit to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSpendLimit")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setSpendLimit(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin spend_limit = 1 [json_name = "spendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSpendLimit")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, SpendLimitProxy>.clear() {
      _builder.clearSpendLimit()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.Authz.SendAuthorization.copy(block: cosmos.bank.v1beta1.SendAuthorizationKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.Authz.SendAuthorization =
  cosmos.bank.v1beta1.SendAuthorizationKt.Dsl._create(this.toBuilder()).apply { block() }._build()