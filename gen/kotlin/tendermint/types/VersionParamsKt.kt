//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun versionParams(block: tendermint.types.VersionParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.VersionParams =
  tendermint.types.VersionParamsKt.Dsl._create(tendermint.types.Params.VersionParams.newBuilder()).apply { block() }._build()
public object VersionParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Params.VersionParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Params.VersionParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Params.VersionParams = _builder.build()

    /**
     * <code>uint64 app_version = 1 [json_name = "appVersion"];</code>
     */
    public var appVersion: kotlin.Long
      @JvmName("getAppVersion")
      get() = _builder.getAppVersion()
      @JvmName("setAppVersion")
      set(value) {
        _builder.setAppVersion(value)
      }
    /**
     * <code>uint64 app_version = 1 [json_name = "appVersion"];</code>
     */
    public fun clearAppVersion() {
      _builder.clearAppVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Params.VersionParams.copy(block: tendermint.types.VersionParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.VersionParams =
  tendermint.types.VersionParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()