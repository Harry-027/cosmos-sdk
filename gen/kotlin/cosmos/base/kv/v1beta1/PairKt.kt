//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/kv/v1beta1/kv.proto

package cosmos.base.kv.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun pair(block: cosmos.base.kv.v1beta1.PairKt.Dsl.() -> kotlin.Unit): cosmos.base.kv.v1beta1.Kv.Pair =
  cosmos.base.kv.v1beta1.PairKt.Dsl._create(cosmos.base.kv.v1beta1.Kv.Pair.newBuilder()).apply { block() }._build()
public object PairKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.kv.v1beta1.Kv.Pair.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.kv.v1beta1.Kv.Pair.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.kv.v1beta1.Kv.Pair = _builder.build()

    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.kv.v1beta1.Kv.Pair.copy(block: cosmos.base.kv.v1beta1.PairKt.Dsl.() -> kotlin.Unit): cosmos.base.kv.v1beta1.Kv.Pair =
  cosmos.base.kv.v1beta1.PairKt.Dsl._create(this.toBuilder()).apply { block() }._build()