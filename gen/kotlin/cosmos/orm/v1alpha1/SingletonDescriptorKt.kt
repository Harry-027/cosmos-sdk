//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/orm.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun singletonDescriptor(block: cosmos.orm.v1alpha1.SingletonDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.SingletonDescriptor =
  cosmos.orm.v1alpha1.SingletonDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Orm.SingletonDescriptor.newBuilder()).apply { block() }._build()
public object SingletonDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Orm.SingletonDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Orm.SingletonDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Orm.SingletonDescriptor = _builder.build()

    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the
     * tables and singletons in this file. It may be deprecated in the future when this
     * can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 1 [json_name = "id"];</code>
     */
    public var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the
     * tables and singletons in this file. It may be deprecated in the future when this
     * can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 1 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Orm.SingletonDescriptor.copy(block: cosmos.orm.v1alpha1.SingletonDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.SingletonDescriptor =
  cosmos.orm.v1alpha1.SingletonDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()