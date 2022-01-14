//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun appDescriptor(block: cosmos.base.reflection.v2alpha1.AppDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor =
  cosmos.base.reflection.v2alpha1.AppDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor.newBuilder()).apply { block() }._build()
public object AppDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor = _builder.build()

    /**
     * <pre>
     * AuthnDescriptor provides information on how to authenticate transactions on the application
     * NOTE: experimental and subject to change in future releases.
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
     */
    public var authn: cosmos.base.reflection.v2alpha1.Reflection.AuthnDescriptor
      @JvmName("getAuthn")
      get() = _builder.getAuthn()
      @JvmName("setAuthn")
      set(value) {
        _builder.setAuthn(value)
      }
    /**
     * <pre>
     * AuthnDescriptor provides information on how to authenticate transactions on the application
     * NOTE: experimental and subject to change in future releases.
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
     */
    public fun clearAuthn() {
      _builder.clearAuthn()
    }
    /**
     * <pre>
     * AuthnDescriptor provides information on how to authenticate transactions on the application
     * NOTE: experimental and subject to change in future releases.
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.AuthnDescriptor authn = 1 [json_name = "authn"];</code>
     * @return Whether the authn field is set.
     */
    public fun hasAuthn(): kotlin.Boolean {
      return _builder.hasAuthn()
    }

    /**
     * <pre>
     * chain provides the chain descriptor
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 2 [json_name = "chain"];</code>
     */
    public var chain: cosmos.base.reflection.v2alpha1.Reflection.ChainDescriptor
      @JvmName("getChain")
      get() = _builder.getChain()
      @JvmName("setChain")
      set(value) {
        _builder.setChain(value)
      }
    /**
     * <pre>
     * chain provides the chain descriptor
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 2 [json_name = "chain"];</code>
     */
    public fun clearChain() {
      _builder.clearChain()
    }
    /**
     * <pre>
     * chain provides the chain descriptor
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ChainDescriptor chain = 2 [json_name = "chain"];</code>
     * @return Whether the chain field is set.
     */
    public fun hasChain(): kotlin.Boolean {
      return _builder.hasChain()
    }

    /**
     * <pre>
     * codec provides metadata information regarding codec related types
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 3 [json_name = "codec"];</code>
     */
    public var codec: cosmos.base.reflection.v2alpha1.Reflection.CodecDescriptor
      @JvmName("getCodec")
      get() = _builder.getCodec()
      @JvmName("setCodec")
      set(value) {
        _builder.setCodec(value)
      }
    /**
     * <pre>
     * codec provides metadata information regarding codec related types
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 3 [json_name = "codec"];</code>
     */
    public fun clearCodec() {
      _builder.clearCodec()
    }
    /**
     * <pre>
     * codec provides metadata information regarding codec related types
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.CodecDescriptor codec = 3 [json_name = "codec"];</code>
     * @return Whether the codec field is set.
     */
    public fun hasCodec(): kotlin.Boolean {
      return _builder.hasCodec()
    }

    /**
     * <pre>
     * configuration provides metadata information regarding the sdk.Config type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor configuration = 4 [json_name = "configuration"];</code>
     */
    public var configuration: cosmos.base.reflection.v2alpha1.Reflection.ConfigurationDescriptor
      @JvmName("getConfiguration")
      get() = _builder.getConfiguration()
      @JvmName("setConfiguration")
      set(value) {
        _builder.setConfiguration(value)
      }
    /**
     * <pre>
     * configuration provides metadata information regarding the sdk.Config type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor configuration = 4 [json_name = "configuration"];</code>
     */
    public fun clearConfiguration() {
      _builder.clearConfiguration()
    }
    /**
     * <pre>
     * configuration provides metadata information regarding the sdk.Config type
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.ConfigurationDescriptor configuration = 4 [json_name = "configuration"];</code>
     * @return Whether the configuration field is set.
     */
    public fun hasConfiguration(): kotlin.Boolean {
      return _builder.hasConfiguration()
    }

    /**
     * <pre>
     * query_services provides metadata information regarding the available queriable endpoints
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor query_services = 5 [json_name = "queryServices"];</code>
     */
    public var queryServices: cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor
      @JvmName("getQueryServices")
      get() = _builder.getQueryServices()
      @JvmName("setQueryServices")
      set(value) {
        _builder.setQueryServices(value)
      }
    /**
     * <pre>
     * query_services provides metadata information regarding the available queriable endpoints
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor query_services = 5 [json_name = "queryServices"];</code>
     */
    public fun clearQueryServices() {
      _builder.clearQueryServices()
    }
    /**
     * <pre>
     * query_services provides metadata information regarding the available queriable endpoints
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor query_services = 5 [json_name = "queryServices"];</code>
     * @return Whether the queryServices field is set.
     */
    public fun hasQueryServices(): kotlin.Boolean {
      return _builder.hasQueryServices()
    }

    /**
     * <pre>
     * tx provides metadata information regarding how to send transactions to the given application
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 6 [json_name = "tx"];</code>
     */
    public var tx: cosmos.base.reflection.v2alpha1.Reflection.TxDescriptor
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx provides metadata information regarding how to send transactions to the given application
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 6 [json_name = "tx"];</code>
     */
    public fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx provides metadata information regarding how to send transactions to the given application
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.TxDescriptor tx = 6 [json_name = "tx"];</code>
     * @return Whether the tx field is set.
     */
    public fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor.copy(block: cosmos.base.reflection.v2alpha1.AppDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.AppDescriptor =
  cosmos.base.reflection.v2alpha1.AppDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()