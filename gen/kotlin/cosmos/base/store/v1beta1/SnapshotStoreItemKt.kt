//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/store/v1beta1/snapshot.proto

package cosmos.base.store.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun snapshotStoreItem(block: cosmos.base.store.v1beta1.SnapshotStoreItemKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem =
  cosmos.base.store.v1beta1.SnapshotStoreItemKt.Dsl._create(cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem.newBuilder()).apply { block() }._build()
public object SnapshotStoreItemKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem = _builder.build()

    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    public fun clearName() {
      _builder.clearName()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem.copy(block: cosmos.base.store.v1beta1.SnapshotStoreItemKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.Snapshot.SnapshotStoreItem =
  cosmos.base.store.v1beta1.SnapshotStoreItemKt.Dsl._create(this.toBuilder()).apply { block() }._build()