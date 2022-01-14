//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/vesting/v1beta1/tx.proto

package cosmos.vesting.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgCreateVestingAccount(block: cosmos.vesting.v1beta1.MsgCreateVestingAccountKt.Dsl.() -> kotlin.Unit): cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount =
  cosmos.vesting.v1beta1.MsgCreateVestingAccountKt.Dsl._create(cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount.newBuilder()).apply { block() }._build()
public object MsgCreateVestingAccountKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount = _builder.build()

    /**
     * <code>string from_address = 1 [json_name = "fromAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var fromAddress: kotlin.String
      @JvmName("getFromAddress")
      get() = _builder.getFromAddress()
      @JvmName("setFromAddress")
      set(value) {
        _builder.setFromAddress(value)
      }
    /**
     * <code>string from_address = 1 [json_name = "fromAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearFromAddress() {
      _builder.clearFromAddress()
    }

    /**
     * <code>string to_address = 2 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var toAddress: kotlin.String
      @JvmName("getToAddress")
      get() = _builder.getToAddress()
      @JvmName("setToAddress")
      set(value) {
        _builder.setToAddress(value)
      }
    /**
     * <code>string to_address = 2 [json_name = "toAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearToAddress() {
      _builder.clearToAddress()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AmountProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     public val amount: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAmountList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addAmount(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllAmount(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The amount to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAmount")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The amount to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAmount")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setAmount(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAmount")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, AmountProxy>.clear() {
      _builder.clearAmount()
    }
    /**
     * <code>int64 end_time = 4 [json_name = "endTime"];</code>
     */
    public var endTime: kotlin.Long
      @JvmName("getEndTime")
      get() = _builder.getEndTime()
      @JvmName("setEndTime")
      set(value) {
        _builder.setEndTime(value)
      }
    /**
     * <code>int64 end_time = 4 [json_name = "endTime"];</code>
     */
    public fun clearEndTime() {
      _builder.clearEndTime()
    }

    /**
     * <code>bool delayed = 5 [json_name = "delayed"];</code>
     */
    public var delayed: kotlin.Boolean
      @JvmName("getDelayed")
      get() = _builder.getDelayed()
      @JvmName("setDelayed")
      set(value) {
        _builder.setDelayed(value)
      }
    /**
     * <code>bool delayed = 5 [json_name = "delayed"];</code>
     */
    public fun clearDelayed() {
      _builder.clearDelayed()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount.copy(block: cosmos.vesting.v1beta1.MsgCreateVestingAccountKt.Dsl.() -> kotlin.Unit): cosmos.vesting.v1beta1.Tx.MsgCreateVestingAccount =
  cosmos.vesting.v1beta1.MsgCreateVestingAccountKt.Dsl._create(this.toBuilder()).apply { block() }._build()