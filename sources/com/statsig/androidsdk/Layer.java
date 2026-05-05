package com.statsig.androidsdk;

import androidx.exifinterface.media.ExifInterface;
import com.statsig.androidsdk.evaluator.ConfigEvaluation;
import com.statsig.androidsdk.evaluator.ReturnableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wECU( *\t]ȞogtKb\u000bQ\u001e\u000e\u0016~j4Ic\u0002e\u0012\u00154JoMSUoCDhtL\u0005(2(8\u0002\u0005\u000f\u001e2H\u0016x\u0003CY\u0012\u001a0FqBR\u001bT\r\u001a\u0018\rF \u000f\u001edgT6^Ǎ{{_#1hzMh W\u0003[\u001dLb'%xw\u001dYAG9#'k\u00035UkC\u0011C\n=3m7+9O\fWd_ÿ\u0018\u00159WM\u0005x4l\u000b_`$)AN\u0012L`\u00126y\u0013{;?\u0014\u0012\u00140`.[$v\f\u001c>\rr\u0002Gг\u0006^P\f;̂5\u001dӛ\u00109993hg`i\u001a^;\n\u0012%\u001eQ\u0004~%i_&`C\"d\nW1_NUT^\fi=\u001c\u0007\u0001d\u0012*2@u\u000f?\u0002\u0017.%6O[g&1s\bHRy\u000f\u0007vg\u0002lb`F\"|)O<\u0019\u001ajPt\u0007{P\u0003[<\u0013]\u001c\u0003\n,\u0017A4l\u0010B!3%faxwzYm\f5/\u0015:ip{\u000e\u0006<\rBces\u0016gR\u0005*W<\u0011\u001chlHS\u001art(PIXp\u0016w\n]f\fAIOy\"4:K1^+G1!RO\u0003\tmu\u0001\u0018\u000fVC$1l:s7\u001d`pvou\u0016a:\rb2-oTE\u001b6UPkJ{Q\u0016ҋw\u007fU\u0006\u0015\u007fZ\r.u\u001c\u001d@\u001a ߙ_PS\u0012?\u00037T\u001a-sO#i_p*'A\u001e*\u001fIvFs\u0018l\u0001,\u000fmZQd\u0017P\u0007\r\u0002iΫjѣ}aT\u001f\u0010ib0s@_q1\\\u0005sF#\u001d%.%\u0007p8{cAs++8\u0010\u0014]\u0018\u0012gw\u0013F\u007fr\u000f,u{\u0003Zw݁sb_\u0005zOFqq~l9Tp\u0011d`j&\u000br\rB0KHo{9dFv#1\u0014e5V=td}R\u0013\u001e\u0001|^mU\fQ\u000e\u0016nCS\u0014]Uwm\u001c[r\nx\u001e:\u000f\nS\u0007\u0012J@Phe\u0006!>\u0016u(6o>r\u0007L\tRDB;6\u001a\fhw2(z.s\u0010\u0013%TZsiY>X\u0007\u007fnH3\u000e\u000es/X\u0019\u0007\u001f5.xc4\u001bltpuѲ҅\u0005S#8cp]/~'AC\u0003<c<f2#E\fuy\u0006D&_)\u001cn \u0010F;\u0015\u001dpJc=_Dwv^uSYr\u0003|v@}\u001bb0^\u0017z+Dl\u000e\u001d-1O!r\u00131Zq\u00107qPI\u001bR`\u001f\f+f\u000f';>M-kL\u001b\u00185\u001eoSi\u0001P?.`\u001c\u00071jg\u001av\fm\u001bh\u0019\u0002\u0018r\u00027\u0016~/2B\u0011Ɠҽ\u000e0\u000ep]={\u001a!\u001bqm\u000e n*[p\u0014dch'\r\u0014rq\u0012m\r\u0019e_YB\u000e;\u000e5\u001b7[>\u001fh\\J\u0011\u0002#h\u0013\u0010\u0014C)ME6voց˹gjv*]\u0017U9=+Ba_p\u0003\"\fA\u0012u2-\u001b(eIdgVf\u001f[\u001bE.Е`Ɉ,d|׃y\"\u000b~``'\u0012bGIۀfԘ;\u0019'ʺ]Sn\u0012\u001cEw-wܓT̫\u001f7:У@<\u0005,\u001bBrv\u0010*p\f\t~\u0016H\u0004øVٗ\u001e'aݾ>r\u00118cGNA6/gÃ\u0013˲^8(ڨ-&*Ti3o0g۷\u0017Ƭ\no\u000fؒ\u0006v_k=*/\u0014W\u0090Aƺ5kBݩ\b~1E'oIn=ձ'̂iL/ڄR}X\reof\u0011q,w8U \nUn\u00108.zڑ\bÑ'\u007fMʹ\u00196miXV\"ZZڒ,߂rD+ؙ=\u0013\u0002'Dw(ut[\u00107Q|$\u0019rA@,\u001b\u0016\u001cރjނ\u000fD\u0015ҵdC\u001d\u0017A3E\u007ffބŝ/Izى\u007f|kO+\u0006\u0014HBmF{W@\b-\u0016/\"T\u0012m\u0019|\u007fsfف\u0014Է\u0011\u0006\u007f1`\u007fP\u0001+-?]\u0007TFh\tOQb9C\u001f&n.p\u000f9\u0015DB\u001fǉ\u0004ҍNb\u001d\u0013AfؼE\n"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$k\u001c<T/>Z\u0002\"\r", "1kX2a;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", ":`h2e\u0015:[\u0019", "", "/oX\u0011l5:[\u001d|Xh5}\r1", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "3uP97,MO\u001d\u0006\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[[';m\u001f=#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013Z\\z\u0007\"!V\u001d\\/\u000fNUJ#{N;\u001e\u0016+OK\u0017Sdj*\u00171rt@4\u001aPz\u0019w\u0017\u0010fPa)\bV=Tp.fU[&[GD(\u0013\u007f\u0018!20?\u0006\u0003c\r\u0002V\u0004pFG(v<+LC\u001f7", "3uP9h(MW#\b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "2dc.\\3L", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[[';m\u001f=#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013Z\\z\u0007\"!V\u001d\\/\u000fNUJ#{N;\u001e\u0016+OK;y|\u0013&\nDt}\f4\u001aPz\u0019w!:dMi[\tKKN8\u0011b\u0016gfjI63\"u\u001bddY-\u0017\u0006W\u0010\u0001Q\u007f1GX\u0015\u0002H MqeO$od8x.-!?h", "<`\\2", "8r^;I(Ec\u0019", "", "", "@t[2", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "CmS2_,@O(~yL,z\u00138d{5\u0010 \u0014\"!U\u007f\u001b<\u0005", "7rD@X9\"\\x\u0012\u0006^9\u0001\u0011/n\u000f", "", "7r4Ec,KW!~\u0004m\bz\u00183v\u007f", "7r32i0<Suz\t^+", "/k[<V(MS\u0018^\u000ei,\n\r7e\t7d<\t\u0017", "3w_9\\*Bb\u0004z\bZ4|\u0018/r\u000e", "", ">`a.`,MS&k\u000be,`g=", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[[';m\u001f=#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013Z\\z\u0007\"!V\u001d\\/\u000fNUJ#{N;\u001e\u0016+OK\u001by|\u0013&\nDnzK5\u0010Vu\u0019|O~OKUpu\u0011QTf1.s[(2!? %mb\"dY0Sib\u001ev[{=NL\u0015\f4mEidH\u000f]dIx0!!q^\u0017.ipt\u0005<\b;s\u001e`\u0010!]~CZ\n\u0011ulP+-\u007f$\u000fJ!Xja%\u0013d0]Q\u0015^>3bStpL\u0018\t3}`1r[JGa\nE\u0013]\u00156\u001ceGW\u000b\u0011R\u00173ql\u0013+\u0017_V]a", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "5dc", "\"", "9dh", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}.$lh\u0003n_7$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "5dc\u000e_3HQ\u0015\u000ez]\f\u0010\u0014/r\u00040{I\u0010\u007f\u0013Oo", "5dc\u000ee9:g", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00119\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "5dc\u000fb6ES\u0015\b", "5dc\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "5dc\u0011\\*MW#\bvk@", "5dc\u0011b<;Z\u0019", "", "5dc\u0012k7EW\u0017\u0003\nI(\n\u00057e\u000f(\tN", "5dc\u0012k7EW\u0017\u0003\nI(\n\u00057e\u000f(\tN?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "5dc\u0014e6N^\u0002z\u0003^", "5dc\u0016a;", "", "5dc\u0016f\fQ^\u0019\f~f,\u0006\u0018\u000bc\u000f,\r@", "5dc\u0016f\u001cLS&b\u0004>?\b\t<i\b(\u0005O", "5dc\u0019b5@", "", "5dc\u001fh3>7w", "5dc\u001fh3>7w_\u0005k\u0017x\u0016+m\u007f7{M", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "u(J\u0019](OOb\u000f\nb3Fp+pU", "5dc g9B\\\u001b", "5dc\"a+>Z\u0019\u0001vm,{v/c\n1z<\u000e+vZz\u0018J\u000725g", "5dc\"a+>Z\u0019\u0001vm,{v/c\n1z<\u000e+vZz\u0018J\u000725g<\u001c@l#8QB5y3$\u000fua@\u0007_:N", ":nV\u001dT9:[\u0019\u000ezk\f\u0010\u00149s\u00105{", "", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Layer extends BaseConfig {
    public static final Companion Companion = new Companion(null);
    private final String allocatedExperimentName;
    private final StatsigClient client;
    private final EvaluationDetails details;
    private final Set<String> explicitParameters;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final Map<String, String> parameterRuleIDs;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004c\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "5dc\u0012e9H`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", "<`\\2", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Layer getError(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Layer(null, name, new EvaluationDetails(EvaluationReason.Error, 0L, 0L, 2, null), null, null, null, null, null, false, false, false, null, null, null, 16376, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Layer(StatsigClient statsigClient, String layerName, APIDynamicConfig apiDynamicConfig, EvaluationDetails evalDetails) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(apiDynamicConfig, "apiDynamicConfig");
        Intrinsics.checkNotNullParameter(evalDetails, "evalDetails");
        Map<String, Object> value = apiDynamicConfig.getValue();
        String ruleID = apiDynamicConfig.getRuleID();
        String groupName = apiDynamicConfig.getGroupName();
        Map<String, String>[] secondaryExposures = apiDynamicConfig.getSecondaryExposures();
        secondaryExposures = secondaryExposures == null ? new Map[0] : secondaryExposures;
        Map<String, String>[] undelegatedSecondaryExposures = apiDynamicConfig.getUndelegatedSecondaryExposures();
        undelegatedSecondaryExposures = undelegatedSecondaryExposures == null ? new Map[0] : undelegatedSecondaryExposures;
        boolean zIsUserInExperiment = apiDynamicConfig.isUserInExperiment();
        boolean zIsExperimentActive = apiDynamicConfig.isExperimentActive();
        boolean zIsDeviceBased = apiDynamicConfig.isDeviceBased();
        String allocatedExperimentName = apiDynamicConfig.getAllocatedExperimentName();
        String[] explicitParameters = apiDynamicConfig.getExplicitParameters();
        this(statsigClient, layerName, evalDetails, value, ruleID, groupName, secondaryExposures, undelegatedSecondaryExposures, zIsUserInExperiment, zIsExperimentActive, zIsDeviceBased, allocatedExperimentName, explicitParameters == null ? null : ArraysKt.toSet(explicitParameters), apiDynamicConfig.getParameterRuleIDs());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Layer(StatsigClient statsigClient, String name, EvaluationDetails details, Map<String, ? extends Object> jsonValue, String rule, String str, Map<String, String>[] secondaryExposures, Map<String, String>[] undelegatedSecondaryExposures, boolean z2, boolean z3, boolean z4, String str2, Set<String> set, Map<String, String> map) {
        super(name, details);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(secondaryExposures, "secondaryExposures");
        Intrinsics.checkNotNullParameter(undelegatedSecondaryExposures, "undelegatedSecondaryExposures");
        this.client = statsigClient;
        this.name = name;
        this.details = details;
        this.jsonValue = jsonValue;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.undelegatedSecondaryExposures = undelegatedSecondaryExposures;
        this.isUserInExperiment = z2;
        this.isExperimentActive = z3;
        this.isDeviceBased = z4;
        this.allocatedExperimentName = str2;
        this.explicitParameters = set;
        this.parameterRuleIDs = map;
    }

    public /* synthetic */ Layer(StatsigClient statsigClient, String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z2, boolean z3, boolean z4, String str4, Set set, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(statsigClient, str, evaluationDetails, (i2 & 8) != 0 ? MapsKt.emptyMap() : map, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? "" : str2, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : str3, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? new Map[0] : mapArr, (i2 + 128) - (i2 | 128) != 0 ? new Map[0] : mapArr2, (i2 & 256) != 0 ? false : z2, (i2 + 512) - (i2 | 512) != 0 ? false : z3, (-1) - (((-1) - i2) | ((-1) - 1024)) == 0 ? z4 : false, (i2 + 2048) - (i2 | 2048) != 0 ? null : str4, (i2 + 4096) - (i2 | 4096) != 0 ? null : set, (i2 & 8192) == 0 ? map2 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Layer(StatsigClient statsigClient, String layerName, ConfigEvaluation evaluation, EvaluationDetails details) {
        Intrinsics.checkNotNullParameter(layerName, "layerName");
        Intrinsics.checkNotNullParameter(evaluation, "evaluation");
        Intrinsics.checkNotNullParameter(details, "details");
        ReturnableValue returnableValue = evaluation.getReturnableValue();
        Map<String, Object> mapValue = returnableValue == null ? null : returnableValue.getMapValue();
        mapValue = mapValue == null ? MapsKt.emptyMap() : mapValue;
        String ruleID = evaluation.getRuleID();
        String groupName = evaluation.getGroupName();
        Object[] array = evaluation.getSecondaryExposures().toArray(new Map[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Map[] mapArr = (Map[]) array;
        Object[] array2 = evaluation.getUndelegatedSecondaryExposures().toArray(new Map[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Map[] mapArr2 = (Map[]) array2;
        boolean zIsActive = evaluation.isActive();
        boolean zIsExperimentGroup = evaluation.isExperimentGroup();
        String configDelegate = evaluation.getConfigDelegate();
        List<String> explicitParameters = evaluation.getExplicitParameters();
        this(statsigClient, layerName, details, mapValue, ruleID, groupName, mapArr, mapArr2, zIsExperimentGroup, zIsActive, false, configDelegate, explicitParameters != null ? CollectionsKt.toSet(explicitParameters) : null, null, 8192, null);
    }

    private final /* synthetic */ Object get(String str, Object obj, Map map) {
        Object obj2 = map.get(str);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        if (obj2 != null) {
            logParameterExposure(str);
        }
        return obj2 == null ? obj : obj2;
    }

    public final void logParameterExposure(String str) {
        StatsigClient statsigClient = this.client;
        if (statsigClient == null) {
            return;
        }
        StatsigClient.logLayerParameterExposure$android_sdk_release$default(statsigClient, this, str, false, 4, null);
    }

    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String key, Object[] objArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        Object[] array = null;
        Object[] objArr2 = obj instanceof Object[] ? (Object[]) obj : null;
        if (objArr2 == null) {
            Object obj2 = this.jsonValue.get(key);
            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
            if (arrayList != null && (array = arrayList.toArray(new Object[0])) == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            objArr2 = array;
        }
        if (objArr2 != null) {
            logParameterExposure(key);
        }
        return objArr2 == null ? objArr : objArr2;
    }

    public final boolean getBoolean(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean boolValueOf = Boolean.valueOf(z2);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            logParameterExposure(key);
        }
        if (bool != null) {
            boolValueOf = bool;
        }
        return boolValueOf.booleanValue();
    }

    public final DynamicConfig getConfig(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map != null) {
            logParameterExposure(key);
        }
        if (map == null) {
            map = null;
        }
        if (map != null) {
            return new DynamicConfig(key, this.details, map, this.rule, this.groupName, null, false, false, false, null, null, 2016, null);
        }
        return null;
    }

    public final Map<String, Object> getDictionary(String key, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2 != null) {
            logParameterExposure(key);
        }
        return map2 == null ? map : map2;
    }

    public final double getDouble(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Number numberValueOf = Double.valueOf(d2);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.doubleValue();
    }

    public final Set<String> getExplicitParameters$android_sdk_release() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getInt(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Number numberValueOf = Integer.valueOf(i2);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.intValue();
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final long getLong(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Number numberValueOf = Long.valueOf(j2);
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            logParameterExposure(key);
        }
        if (number != null) {
            numberValueOf = number;
        }
        return numberValueOf.longValue();
    }

    public final String getRuleID() {
        return this.rule;
    }

    public final String getRuleIDForParameter(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.parameterRuleIDs;
        String str = map == null ? null : map.get(key);
        return str == null ? this.rule : str;
    }

    public final Map<String, String>[] getSecondaryExposures$android_sdk_release() {
        return this.secondaryExposures;
    }

    public final String getString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            logParameterExposure(key);
        }
        return str2 == null ? str : str2;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures$android_sdk_release() {
        return this.undelegatedSecondaryExposures;
    }
}
