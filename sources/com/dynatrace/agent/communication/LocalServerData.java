package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.api.AgentState;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JpP.`\\2\u000fq{<$i*yّCU(\n*ޛUȟm}ñzZ9BO#&|x,aU'^\"\u0013@D\b?aP\u007fAGd\r63%ݨ&:\u007f\u000b\u000f!rO\u001e\u0005\u0013Cy\rXٚA9A`\u001ce\u0005H\u0015L͋!I%jwf6vq$Ǆ0k(wSf'\u000eܞ-S\u0013Fb'%v\u0010\u001f[F=5#'k\u00035U\fE\t?\u007fA\u001dhU,qʥr Gf\u0012,\u0015Yb=c\u0001:t\u0007g_:&q֩d\u0014W\u001c=\u0010z*#\u0003Ƞ\rN.VEE\u001a\u0015 T߮sCbNP\u001a^p\u0001ѐe<\u001fӛ\u001851A)o\"pI\u001bf7*\bڟ\")\t͙9]Z\u0018n kc\u0006UIQnB˓R\u0010aƝ\u0006\u0006vn\u00107˟4`"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "", "AsPAX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "1n]3\\./!", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r\u0017m4'$Vp5\u0016c\u00025t1O\u0016M@eN\u0002J\u0010\u0010ZWJ-\r\u000eh\u000b2}ND\u001b\n,\u0013\rHh\u0002\f#\u000e>hp\fD\u0010T\u000b\u0015\u0003\u001f3qG]a\nT=Tf4m|.rC8D,]p-$d_;\u0006ySZn[xtqK\u0018D4&>vj\u0010Cy^=>\u0015\u001fX\rw\u001f\u0010b},x/\u0014A&Eh\u000fT=[/", "5dc g(MS", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_*XG\u0005G6\u001e\u001ewOH\u0003r,$", "5dc\u0010b5?W\u001b", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~d\u000b 8m#.VA;5\"\u001e\"yaFdm5Oz)WYJ;`\\{.bg", "5dc\u0010b5?W\u001boH", "u(;0b4\bR-\bvm9x\u0007//{1zM\u000b\u001b\u0016\u0011k\u0010<\u007f4~W\b)87\u0004.ZT;x\u0012(\u001eie;\u0017p(]z1P\"", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LocalServerData {
    private final ServerConfigurationV4 config;
    private final ServerConfiguration configV3;
    private final AgentState state;

    public LocalServerData(AgentState state, ServerConfigurationV4 config, ServerConfiguration configV3) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(configV3, "configV3");
        this.state = state;
        this.config = config;
        this.configV3 = configV3;
    }

    public static /* synthetic */ LocalServerData copy$default(LocalServerData localServerData, AgentState agentState, ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            agentState = localServerData.state;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            serverConfigurationV4 = localServerData.config;
        }
        if ((i2 & 4) != 0) {
            serverConfiguration = localServerData.configV3;
        }
        return localServerData.copy(agentState, serverConfigurationV4, serverConfiguration);
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

    public final LocalServerData copy(AgentState state, ServerConfigurationV4 config, ServerConfiguration configV3) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(configV3, "configV3");
        return new LocalServerData(state, config, configV3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalServerData)) {
            return false;
        }
        LocalServerData localServerData = (LocalServerData) obj;
        return Intrinsics.areEqual(this.state, localServerData.state) && Intrinsics.areEqual(this.config, localServerData.config) && Intrinsics.areEqual(this.configV3, localServerData.configV3);
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
        return (((this.state.hashCode() * 31) + this.config.hashCode()) * 31) + this.configV3.hashCode();
    }

    public String toString() {
        return "LocalServerData(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
