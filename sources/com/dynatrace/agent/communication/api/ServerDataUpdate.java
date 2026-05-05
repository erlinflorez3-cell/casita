package com.dynatrace.agent.communication.api;

import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JpP.`\\2\u000fq{<$i*yّCU(\n*ޛUȟm}ñzZ9BO'&|x,aU'^\"\u0015@D\bAIL\u001e@If\u0003:\u001d\"H!f~ڱ\u0005\u001c0N\u001e}CJY\u001a*0nq\u0001Ŭ\u000e\u0016\u000e(!\u001e@6\u007fL_.ߵ7\u0011ukJG%\u0019hpSm܆1Ev\u001bWl';Ǹ\u0012$1@E5-%\u0002\u00047Za?\u0011A\n?\u001bgU*[QyWD\\\u0018\u0016+*}\u0012$Ľ%%\u0016_r$'Yb\u0014Q^\"@y\u0011z;;Jّ\u0007oO<B2f6$yЖq\u001cG^\u0019vB.\u0013(پ\u0016u\u000fA+Q\u001b\u0015Rň?\u001fVљ\u0014\u0007\u0013&1\n?2iV&b+\u001a\u0003zΦ5WH׀`P\u0010cKxT\u0002p\u0006B\u0006FF.4ɨ\u00154\u001f¦O]?//xɞL]"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "", "AsPAX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "1n]3\\./!", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r\u0017m4'$Vp5\u0016c\u00025t1O\u0016M@eN\u0002J\u0010\u0010ZWJ-\r\u000eh\u000b2}ND\u001b\n,\u0013\rHh\u0002\f#\u000e>hp\fD\u0010T\u000b\u0015\u0003\u001f3qG]a\nT=Tf4m|.rC8D,]p-$d_;\u0006ySZn[xtqK\u0018D4&>vj\u0010Cy^=>\u0015\u001fX\rw\u001f\u0010b},x/\u0014A&Eh\u000fT=[/", "5dc g(MS", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005G6\u001e\u001ewOH\u0003r,$", "5dc\u0010b5?W\u001b", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\"\u001e\"yaFdm5Oz)WYJ;`\\{.bg", "5dc\u0010b5?W\u001boH", "u(;0b4\bR-\bvm9x\u0007//{1zM\u000b\u001b\u0016\u0011k\u0010<\u007f4~W\b)87\u0004.ZT;x\u0012(\u001eie;\u0017p(]z1P\"", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerDataUpdate {
    private final ServerConfigurationV4 config;
    private final ServerConfiguration configV3;
    private final AgentState state;

    public ServerDataUpdate(AgentState state, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.config = serverConfigurationV4;
        this.configV3 = serverConfiguration;
    }

    public static /* synthetic */ ServerDataUpdate copy$default(ServerDataUpdate serverDataUpdate, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            agentState = serverDataUpdate.state;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            serverConfigurationV4 = serverDataUpdate.config;
        }
        if ((i2 & 4) != 0) {
            serverConfiguration = serverDataUpdate.configV3;
        }
        return serverDataUpdate.copy(agentState, serverConfigurationV4, serverConfiguration);
    }

    public final AgentState component1() {
        return this.state;
    }

    public final ServerConfigurationV4 component2() {
        return this.config;
    }

    public final ServerConfiguration component3() {
        return this.configV3;
    }

    public final ServerDataUpdate copy(AgentState state, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new ServerDataUpdate(state, serverConfigurationV4, serverConfiguration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerDataUpdate)) {
            return false;
        }
        ServerDataUpdate serverDataUpdate = (ServerDataUpdate) obj;
        return Intrinsics.areEqual(this.state, serverDataUpdate.state) && Intrinsics.areEqual(this.config, serverDataUpdate.config) && Intrinsics.areEqual(this.configV3, serverDataUpdate.configV3);
    }

    public final ServerConfigurationV4 getConfig() {
        return this.config;
    }

    public final ServerConfiguration getConfigV3() {
        return this.configV3;
    }

    public final AgentState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.config;
        int iHashCode2 = (iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode())) * 31;
        ServerConfiguration serverConfiguration = this.configV3;
        return iHashCode2 + (serverConfiguration != null ? serverConfiguration.hashCode() : 0);
    }

    public String toString() {
        return "ServerDataUpdate(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
