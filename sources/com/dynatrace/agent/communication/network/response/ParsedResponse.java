package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000fnjG9LeN.ZS8\u0015sڔ<$i0yّA٦ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz2WW\u0011_(\u000e`EņC5SsK>){D\u000f82P9@ە\u0002b3V\u001b\u000f|YJ:\u0015vВq\u0003o\u001bY\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0004y\u001eYNg;#4k\u0005\u001dQ\n>Iԡr\u0006\fv7?+w\u0005\u001e\u0383WH\u001b#=g\r\f\u0006lٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\n\u001c\rwY</2h\u001e\rawɤWFX\u061cvD\u0006\u0003o?ж)\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018a#TZN+IR\u0001H\u001e\u001bh\u000e$", "", "AsPAX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.N`\u0015\u000e~h5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r\u0017m4'$Vp5\u0016c\u00025t1O\u0016M@eN\u0002J\u0010\u0010ZWJ-\r\u000eh\u000b2}ND\u001b\n,\u0013\rHh\u0002\f#\u000e>hp\fD\u0010T\u000b\u0015\u0003\u001f3qG]a\nT=Tf4m|.r +", "5dc g(MS", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005G6\u001e\u001ewOH\u0003r,$", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\"\u001e\"yaFdm5Oz)WYJ;`\\{.bg", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ParsedResponse {
    private final ServerConfigurationV4 configuration;
    private final AgentState state;

    public ParsedResponse(AgentState state, ServerConfigurationV4 serverConfigurationV4) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.configuration = serverConfigurationV4;
    }

    public static /* synthetic */ ParsedResponse copy$default(ParsedResponse parsedResponse, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, int i2, Object obj) {
        if ((1 & i2) != 0) {
            agentState = parsedResponse.state;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            serverConfigurationV4 = parsedResponse.configuration;
        }
        return parsedResponse.copy(agentState, serverConfigurationV4);
    }

    public final AgentState component1() {
        return this.state;
    }

    public final ServerConfigurationV4 component2() {
        return this.configuration;
    }

    public final ParsedResponse copy(AgentState state, ServerConfigurationV4 serverConfigurationV4) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new ParsedResponse(state, serverConfigurationV4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedResponse)) {
            return false;
        }
        ParsedResponse parsedResponse = (ParsedResponse) obj;
        return Intrinsics.areEqual(this.state, parsedResponse.state) && Intrinsics.areEqual(this.configuration, parsedResponse.configuration);
    }

    public final ServerConfigurationV4 getConfiguration() {
        return this.configuration;
    }

    public final AgentState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.configuration;
        return iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode());
    }

    public String toString() {
        return "ParsedResponse(state=" + this.state + ", configuration=" + this.configuration + ')';
    }
}
