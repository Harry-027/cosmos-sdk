//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgVote(block: cosmos.group.v1beta1.MsgVoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgVote =
  cosmos.group.v1beta1.MsgVoteKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgVote.newBuilder()).apply { block() }._build()
public object MsgVoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgVote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgVote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgVote = _builder.build()

    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public var proposalId: kotlin.Long
      @JvmName("getProposalId")
      get() = _builder.getProposalId()
      @JvmName("setProposalId")
      set(value) {
        _builder.setProposalId(value)
      }
    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }

    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var voter: kotlin.String
      @JvmName("getVoter")
      get() = _builder.getVoter()
      @JvmName("setVoter")
      set(value) {
        _builder.setVoter(value)
      }
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearVoter() {
      _builder.clearVoter()
    }

    /**
     * <pre>
     * choice is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Choice choice = 3 [json_name = "choice"];</code>
     */
    public var choice: cosmos.group.v1beta1.Types.Choice
      @JvmName("getChoice")
      get() = _builder.getChoice()
      @JvmName("setChoice")
      set(value) {
        _builder.setChoice(value)
      }
    /**
     * <pre>
     * choice is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Choice choice = 3 [json_name = "choice"];</code>
     */
    public fun clearChoice() {
      _builder.clearChoice()
    }

    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the vote.
     * </pre>
     *
     * <code>bytes metadata = 4 [json_name = "metadata"];</code>
     */
    public var metadata: com.google.protobuf.ByteString
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the vote.
     * </pre>
     *
     * <code>bytes metadata = 4 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Exec exec = 5 [json_name = "exec"];</code>
     */
    public var exec: cosmos.group.v1beta1.Tx.Exec
      @JvmName("getExec")
      get() = _builder.getExec()
      @JvmName("setExec")
      set(value) {
        _builder.setExec(value)
      }
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Exec exec = 5 [json_name = "exec"];</code>
     */
    public fun clearExec() {
      _builder.clearExec()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgVote.copy(block: cosmos.group.v1beta1.MsgVoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgVote =
  cosmos.group.v1beta1.MsgVoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()