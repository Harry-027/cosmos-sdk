//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/crypto/proof.proto

package tendermint.crypto;

@kotlin.jvm.JvmSynthetic
public inline fun valueOp(block: tendermint.crypto.ValueOpKt.Dsl.() -> kotlin.Unit): tendermint.crypto.ProofOuterClass.ValueOp =
  tendermint.crypto.ValueOpKt.Dsl._create(tendermint.crypto.ProofOuterClass.ValueOp.newBuilder()).apply { block() }._build()
public object ValueOpKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.crypto.ProofOuterClass.ValueOp.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.crypto.ProofOuterClass.ValueOp.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.crypto.ProofOuterClass.ValueOp = _builder.build()

    /**
     * <pre>
     * Encoded in ProofOp.Key.
     * </pre>
     *
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
     * <pre>
     * Encoded in ProofOp.Key.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <pre>
     * To encode in ProofOp.Data
     * </pre>
     *
     * <code>.tendermint.crypto.Proof proof = 2 [json_name = "proof"];</code>
     */
    public var proof: tendermint.crypto.ProofOuterClass.Proof
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <pre>
     * To encode in ProofOp.Data
     * </pre>
     *
     * <code>.tendermint.crypto.Proof proof = 2 [json_name = "proof"];</code>
     */
    public fun clearProof() {
      _builder.clearProof()
    }
    /**
     * <pre>
     * To encode in ProofOp.Data
     * </pre>
     *
     * <code>.tendermint.crypto.Proof proof = 2 [json_name = "proof"];</code>
     * @return Whether the proof field is set.
     */
    public fun hasProof(): kotlin.Boolean {
      return _builder.hasProof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.crypto.ProofOuterClass.ValueOp.copy(block: tendermint.crypto.ValueOpKt.Dsl.() -> kotlin.Unit): tendermint.crypto.ProofOuterClass.ValueOp =
  tendermint.crypto.ValueOpKt.Dsl._create(this.toBuilder()).apply { block() }._build()