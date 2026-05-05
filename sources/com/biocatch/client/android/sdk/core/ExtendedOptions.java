package com.biocatch.client.android.sdk.core;

import com.biocatch.client.android.sdk.backend.communication.http.ExternalHttpClientFactory;
import com.biocatch.client.android.sdk.contract.BCAgentType;
import com.biocatch.client.android.sdk.contract.BCCollectorID;
import com.biocatch.client.android.sdk.contract.BCProtocolType;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007lkA0R\u0004P.`Y2\u000fq{<$i0yCAV\"}8\tWNmhvJp\u000bKƤ\u000e\u0016\u000fj4I[\u000ec܈%˰rom2\u000eں<Id\u00036\u001d `#H}\u0013\u00032*v\u0011\u0007\u0001QN$\u0014F?\u001f>b\u0011[\n2\u00124?0\u0005,b\u007fNdI|gH6;\tyD^'\u000e9+U\u001dJb1%v\u0010\u001f;JE@-+c\u0005\u0017R\nK1G\u0002G\u0013u?-;K\u0004Wdd.\u001c%5]\u001bux6^\u0015Q\u000f\u0018U3_mY_&.\b|\f\rj\u0014<\u000e7L<>2f6\u000fCx\u0001eXP0_R\u0004\ttN\u0017S\u0014C/G0~Q\u0010Q)XE\u0013\u001d\u0013.%\u0011nOg\u0003\u0016\u05ce\u0019\u001bb\u0010\"@_SUH|\u001eՒAs\f͏z\u00040\u001d>aPD\n F\u001d59k9Q1\u001a\nҩHm~ݓxjY\u0005`d\u00117|#O0\u0019\u000ejD\u0013\u0011\u001aXԜ\\2\u0019۳4V\r\u001b\u0016/pq\u0006G9+ P_h\u0018v{eܦ)5nŽqpq,eU/BCV{\u0010\u0010Sλ\u0018EDϵ\u001dZlaa,+k6$JH\u0019\u0011ȑ\u007fJVۼ+4E\u0013*T|@'f-H1\u001fնE\u0003\u0011ݠrj\u0016!bSt\u0012w*\r\t/Qʷtuoծa.\u0003\u00040M\u0012`C\u0019>UPiط\u0001)\u000fѨ\f\u0002M\fZg\u001d{$\bm{N\u0017׀=W7ˋ+\u0011\u0005N@\"}ZZ\n}W]\u00147z+\u0006=Cÿ2m\u0010ξ\t.f\u0011Xk%(0yvt9\u0007\u0013\u0004\u05fbeL\u0003ò{V\u0011\u0003LqC\u0018gJf>\r\u0007/\u001eS\r\u001e*Ŀ93Kگ5\u0018}==12lw\u0001Fy\u0011\u0010֑xk\fϺ{\u0018us_}\u0003PFPq\u0005N$4l1Kvr͎\fH\u0011ͩ%5Nkr\r'G[ G}\u0015\u001dՐ\u0011v^ܪR\u0015u)BZʧ.!"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w-VJk=\u001d\u0015gKD\u0016g6W\u0005|", "", "3mP/_,!g\u0016\f~]\u001a\u0007\u0010?t\u00042\u0005", "", "3mP/_,\u001c]#\fyb5x\u0018/sg$\nF\u0005 \u0019", "3wc2e5:Z{\u000e\ni\n\u0004\r/n\u000f\tw>\u0010!$[", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cRP#\u0012g\u0017J2o\u0014hL\u0002uH7(\u0017\rE\u007fJr\u000e k", "3mP/_,\u001ac(\tXh5\f\tBt", "3mP/_, Z#{ve\u001b\u0007\u0019-h]2\u0003G\u0001\u0015&Ky\u0017$\u0001$5", "@dbAe0<b\u0019}kb,\u000fj<o\u00103bD\u000f&", "", "", "3mP/_,\u001eZ\u0019\u0007zg;m\u00056u\u007f6c<\u000f\u001d\u001bPq", "3kT:X5MD\u0015\u0006\u000b^:d\u0005=k\u00041}'\u0005%&", "", "3kT:X5MD\u0015\u0006\u000b^:[\r=a|/{(|%\u001dKx\u0010#z3D", "3wc2e5:Z\u0001\tyn3|\u0017\u0016i\u000e7", "2hb.U3>Rv\t\u0002e,z\u00189r\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrh@\u0007a;X\u0004\u000b&\"", "7r0=c\u001cLW\"\u0001g^5~\u001b?x\u0004$\u0005'\u0005\u0014$C|\"\u001a\u00073Dc\u0006}Au!8VCDzB", "3mP/_,0c$fzl:x\u000b/sb$\nC\u0005 \u0019", "/fT;g\u001bR^\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{pjaB\u0016R@Yv|", "AdaCX9\u001a^\u001dozk:\u0001\u00138", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{\u007fukH\u0011a6Ue;RL$", "3w_9\\*Bb\u0006~\u0007n0\n\t.C\n1\n@\n&%", "uYI\u0019V6F\u001d\u0016\u0003\u0005\\(\f\u00072/}/\u007f@\n&`Cx\rI\u0001)4#\f\u001f=7\u0013*KI;t3g\u0013riA\u0017l0Lr6KVWu_a\u0002H]qm\u001dN8\u0016\u0001`$3}O\u0015&\f,R\u0011\u001cd~\u001b \u001bI@e7=\u0015C\u000b\u0011?Q8lM#F}UP\u001bW\u0011i\bp\u0019&JI(\u001b;\u007f\u001fv_\u0004p\u0001O\"n\u001c\nvkNba<2MCBKA\u0001Q\u0006\u00056#RE^\u0016@gJ\u0012y)\u00150sFs\tR1~Bl\bj!Q(%0>\u0006\u0010CUaq{<\u00112\u001dh\f\u000ekDz\u0015ndpR\u0013\u0006'%Z;+]\u000b@a\u0013:G~^\u0004$ZD[\u0003$w\u001b/m;0A%\\J\u0017tN [ \u0001\u00060\u0016#2\u0016FhXd3^DW\u0017\b2F\u000b\u0002#A\u001fyW\u001diI\u0002%4M\u000fC\u0003 S\u001f=R+\u000b]CEv\u001b0\u0012\u0007H-\u0003mIC\u001d\u001734\u0013\u001d)", "5dc\u000eZ,Gb\b\u0013\u0006^", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCgqF=;\u0007l;=\u000b2G\"", "5dc\u0011\\::P ~y<6\u0004\u0010/c\u000f2\tN", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0012_,FS\"\u000ekZ3\r\t=D\u00046w=\b\u0017~C}\u0014@\u007f'\u001c]\f/", "5dc\u0012_,FS\"\u000ekZ3\r\t=M{6\u0002D\n\u0019}K}\u001d", "5dc\u0012a(;Z\u0019Z\u000bm6Z\u00138t\u007f;\u000b", "u(I", "5dc\u0012a(;Z\u0019\\\u0005h9{\r8a\u000f(\n(|%\u001dKx\u0010", "5dc\u0012a(;Z\u0019^\u0002^4|\u0012>V{/\f@\u000f~\u0013Uu\u0012Ex", "5dc\u0012a(;Z\u0019`\u0002h)x\u0010\u001eo\u0010&~\u001e\u000b\u001e\u001eGm\u001d@\u0001.\u001dc| ", "5dc\u0012a(;Z\u0019a\u000f[9\u0001\b\u001do\u00078\u000bD\u000b ", "5dc\u0012a(;Z\u0019p\u000bi\u0014|\u0017=a\u0002(\n#|%\u001aKx\u0010", "5dc\u0012k7EW\u0017\u0003\nK,\t\u00193r\u007f'YJ\n%\u0017P~\u001c", "5dc\u0012k;>`\"z\u0002A;\f\u0014\rl\u0004(\u0005Oa\u0013\u0015Vy\u001bP", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001j\u0012,SCDj}\u001c\u001fpiI\u0010g*J\u0006+QU\u0018/ka}\u0007s%i\u000e[4\t\f<P3y\">#\b5Xb7f\u0010\u0016#\"\u000b", "5dc\u0012k;>`\"z\u0002F6{\u00196e\u000e\u000f\u007fN\u0010", "5dc\u001fX:M`\u001d|\n^+m\r/wa5\u0006P\f}\u001bU~", "5dc X9OS&Z\u0006b\u001d|\u0016=i\n1", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCgqFLF\u0011r6L\u0001.6`Y,2", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExtendedOptions {
    private final BCAgentType agentType;
    private final List<BCCollectorID> disabledCollectors;
    private final List<String> elementValuesDisableMaskingList;
    private final List<String> elementValuesMaskingList;
    private final boolean enableAutoContext;
    private final boolean enableCoordinatesMasking;
    private final boolean enableElementValuesMasking;
    private final boolean enableGlobalTouchCollectionMode;
    private final boolean enableHybridSolution;
    private final boolean enableWupMessagesHashing;
    private final List<String> explicitRequiredConsents;
    private final ExternalHttpClientFactory externalHttpClientFactory;
    private final List<String> externalModulesList;
    private final boolean isAppUsingRengwuxianLibraryCustomComponents;
    private final List<Integer> restrictedViewGroupList;
    private final BCProtocolType serverApiVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedOptions(boolean z2, boolean z3, ExternalHttpClientFactory externalHttpClientFactory, boolean z4, boolean z5, List<Integer> restrictedViewGroupList, boolean z6, List<String> elementValuesMaskingList, List<String> elementValuesDisableMaskingList, List<String> externalModulesList, List<? extends BCCollectorID> disabledCollectors, boolean z7, boolean z8, BCAgentType agentType, BCProtocolType serverApiVersion, List<String> explicitRequiredConsents) {
        Intrinsics.checkNotNullParameter(restrictedViewGroupList, "restrictedViewGroupList");
        Intrinsics.checkNotNullParameter(elementValuesMaskingList, "elementValuesMaskingList");
        Intrinsics.checkNotNullParameter(elementValuesDisableMaskingList, "elementValuesDisableMaskingList");
        Intrinsics.checkNotNullParameter(externalModulesList, "externalModulesList");
        Intrinsics.checkNotNullParameter(disabledCollectors, "disabledCollectors");
        Intrinsics.checkNotNullParameter(agentType, "agentType");
        Intrinsics.checkNotNullParameter(serverApiVersion, "serverApiVersion");
        Intrinsics.checkNotNullParameter(explicitRequiredConsents, "explicitRequiredConsents");
        this.enableHybridSolution = z2;
        this.enableCoordinatesMasking = z3;
        this.externalHttpClientFactory = externalHttpClientFactory;
        this.enableAutoContext = z4;
        this.enableGlobalTouchCollectionMode = z5;
        this.restrictedViewGroupList = restrictedViewGroupList;
        this.enableElementValuesMasking = z6;
        this.elementValuesMaskingList = elementValuesMaskingList;
        this.elementValuesDisableMaskingList = elementValuesDisableMaskingList;
        this.externalModulesList = externalModulesList;
        this.disabledCollectors = disabledCollectors;
        this.isAppUsingRengwuxianLibraryCustomComponents = z7;
        this.enableWupMessagesHashing = z8;
        this.agentType = agentType;
        this.serverApiVersion = serverApiVersion;
        this.explicitRequiredConsents = explicitRequiredConsents;
    }

    public final BCAgentType getAgentType() {
        return this.agentType;
    }

    public final List<BCCollectorID> getDisabledCollectors() {
        return this.disabledCollectors;
    }

    public final List<String> getElementValuesDisableMaskingList() {
        return this.elementValuesDisableMaskingList;
    }

    public final List<String> getElementValuesMaskingList() {
        return this.elementValuesMaskingList;
    }

    public final boolean getEnableAutoContext() {
        return this.enableAutoContext;
    }

    public final boolean getEnableCoordinatesMasking() {
        return this.enableCoordinatesMasking;
    }

    public final boolean getEnableElementValuesMasking() {
        return this.enableElementValuesMasking;
    }

    public final boolean getEnableGlobalTouchCollectionMode() {
        return this.enableGlobalTouchCollectionMode;
    }

    public final boolean getEnableHybridSolution() {
        return this.enableHybridSolution;
    }

    public final boolean getEnableWupMessagesHashing() {
        return this.enableWupMessagesHashing;
    }

    public final List<String> getExplicitRequiredConsents() {
        return this.explicitRequiredConsents;
    }

    public final ExternalHttpClientFactory getExternalHttpClientFactory() {
        return this.externalHttpClientFactory;
    }

    public final List<String> getExternalModulesList() {
        return this.externalModulesList;
    }

    public final List<Integer> getRestrictedViewGroupList() {
        return this.restrictedViewGroupList;
    }

    public final BCProtocolType getServerApiVersion() {
        return this.serverApiVersion;
    }

    public final boolean isAppUsingRengwuxianLibraryCustomComponents() {
        return this.isAppUsingRengwuxianLibraryCustomComponents;
    }
}
