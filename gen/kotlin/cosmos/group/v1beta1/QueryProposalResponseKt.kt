//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/query.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryProposalResponse(block: cosmos.group.v1beta1.QueryProposalResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse =
  cosmos.group.v1beta1.QueryProposalResponseKt.Dsl._create(cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse.newBuilder()).apply { block() }._build()
public object QueryProposalResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse = _builder.build()

    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public var proposal: cosmos.group.v1beta1.Types.Proposal
      @JvmName("getProposal")
      get() = _builder.getProposal()
      @JvmName("setProposal")
      set(value) {
        _builder.setProposal(value)
      }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public fun clearProposal() {
      _builder.clearProposal()
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1beta1.Proposal proposal = 1 [json_name = "proposal"];</code>
     * @return Whether the proposal field is set.
     */
    public fun hasProposal(): kotlin.Boolean {
      return _builder.hasProposal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse.copy(block: cosmos.group.v1beta1.QueryProposalResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalResponse =
  cosmos.group.v1beta1.QueryProposalResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()