//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package cosmos.auth.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryAccountResponse(block: cosmos.auth.v1beta1.QueryAccountResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse =
  cosmos.auth.v1beta1.QueryAccountResponseKt.Dsl._create(cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.newBuilder()).apply { block() }._build()
public object QueryAccountResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse = _builder.build()

    /**
     * <pre>
     * account defines the account of the corresponding address.
     * </pre>
     *
     * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public var account: com.google.protobuf.Any
      @JvmName("getAccount")
      get() = _builder.getAccount()
      @JvmName("setAccount")
      set(value) {
        _builder.setAccount(value)
      }
    /**
     * <pre>
     * account defines the account of the corresponding address.
     * </pre>
     *
     * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public fun clearAccount() {
      _builder.clearAccount()
    }
    /**
     * <pre>
     * account defines the account of the corresponding address.
     * </pre>
     *
     * <code>.google.protobuf.Any account = 1 [json_name = "account", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     * @return Whether the account field is set.
     */
    public fun hasAccount(): kotlin.Boolean {
      return _builder.hasAccount()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse.copy(block: cosmos.auth.v1beta1.QueryAccountResponseKt.Dsl.() -> kotlin.Unit): cosmos.auth.v1beta1.QueryOuterClass.QueryAccountResponse =
  cosmos.auth.v1beta1.QueryAccountResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()