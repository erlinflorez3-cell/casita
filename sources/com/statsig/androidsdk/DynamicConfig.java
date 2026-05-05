package com.statsig.androidsdk;

import androidx.exifinterface.media.ExifInterface;
import com.statsig.androidsdk.evaluator.ConfigEvaluation;
import com.statsig.androidsdk.evaluator.ReturnableValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq}<$iFyCI٥\"}(\nWNuvvϺb\u000bQ\u0018\u000e\u0016~y4Ic|e\u0012\u00152JoM9UoC:htD\f(2(?\u0002\u0005\u000f82H&v\u0003CQ\u0012(ؓ^0jR;L=\u0019QF[&\u000f.`uNNH\u001b^J31\u0005\u0002B|*o4\u000bQ%F\u0003,˼za,1\u0001T;#5W\u0011\u0007j[m\u0004OuK\f\u0001'U3Ywe?p\u007fB\u001aۣS\rk|fج\u0004ad\u001a2CO\u0012L`\u00126\u0001\u0013{;A\u0014 \f'V:E&v\n\u001e3#scB`\u0002\rP.\bq<\u001d%\u000eBC9IgaiA\u0019\\G\u0014\u0007#\u001dQ\u0002~9aT\u001cq--d\u0006a=aBMH|\u000bi?}\u0004\u001fc072BW\u00065{\u001fA/%eoI)'k\u0010]\\g%\u0019pnYi`^X\"\u001d*G2\u000f\fh[|\u0007\u0002O\u0003Y<\u0019S\u001cb\u001f\u0016\n)\u001f\u000b\f˶%%\u001eg\u0018uw\u0007e_ $]g}ժˇo\u000e]V'XCo{\u0016qR|\u0015U;\u0011\u0017\tjPr$Z\u000b)R<V\u000b(}\fDT\r)1m\u0004ʬ8,?:%)V%6Bo\u00119ch\b(~\u00034T\u0007wD\r\t/d%~}\u000b\u0011KB{\u000fõ]E_T1&\u0004#1d\u000bG\u001f\r\u0004\u0002WgzH\\n&u\u0004\n6\u0015HF\u00023K2'~W32?Sl\u000bsaO\"')}\n\u0011Kh\\u\u001ei\u001f9)~Xtl\u0017P\u001d\u000fv1'|\u007f(bv~U\u0004l\u000b\nd\u0012x\u0011\u0001TPN{3 f9\u000f\u0018:|cVs++5\u0010\u0014]\u0016\u0012aw\u0010Fy\u00118nxs.DcD\u0004+Uk]S8wmGR0P\u0005\u0003pu\u001b{\u0016a!4;4xEr\u0011n8{8w\u0002t5D\r\u001fW$E!\u001f\u00166D^X\bʸ\u0002\u0014lsm0[\u0005\u007f\u007f}Yl\u0017Z\u0011\u001a\u000b*2~\u0014,=NW\u0006o7BL\u058c͛:CA\u0015\u0013oQ<B`T\n!B\u0003j6\u0014\t\u001f^_=\u0018bH\u0002[n\u0010jw\u000bW\u0011\u0015nzx-:\u0003\u000f\u000fa\u001f\t7A\u0005\u001cT\u0003<,e\u000f\n5\u001d+x_\u000bv';D\u001br+*h\u0001Q\u007f\f{_\u0001d;g-s }EN\u0017\u001d!H\u0017)sg\u0010\bz@^\u0011V\u0013\u0006+ɽ\u0018/\u001c\\]A\r\u000b~\u001e<PK\u001b\u001b_r6 CK|\u0005WG ݅%\u0001?\u0006,\u0001iE)j\u001c4UEYj\u001a(\fWY<,\u0015P4-\u0004\u0003Ate\u001eh\u001a]av&s&bHF)ON\u0011t\u0600z;;<FN]\u00125\u0012\u0013%\u0013{y1@me\u0003\u0005p\u0004\t|\u0010ɨz\u001d\u0005T+\u0007l0d4\u0005,x%\u0019'S/#X`;?\ffǈ\u0017P\"#=78\u001eaW\u0011&ɭjӗoOc¾{;y3y1^Wtݜ!ݺy\u00042Ĕx#Ife@z\b\u000bm\u0019ģ\u0010߿n(lÆ\\5\"\u0013\u0017H\r%i̍Hޔ\"d7Юi+i\"_`5\u0018\u001cÕ(Ж5RG\u05cd\b>\u0019\u0003@v?\u0017\u0011Ŋvʷ.B\u0011ۂP\u007f:9^`M\u001c7YRnt\u00056KsFp\u0015\u0003ֹ\u0010Ŕ3Z@Ԍ\u000fh('SQaBo։\u0003ͤ<\u0006wޞiAx`k%X\u0002SӘ\u000fק}1s\u009fDG\u0001;G\u0011\u0006\u001a\u0006z\u0012ç7ְP)\u0014\u0002sdOmqg's<WEQ.{e@.\u000b/&4\u0006$$.R_Z\u0001ئ^ȡZu_\u00044E߈r\u0005"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$k\u001c<T/>Z\u0002\"\r", "1n]3\\.'O!~", "", "/oX\u0011l5:[\u001d|Xh5}\r1", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "3uP97,MO\u001d\u0006\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}y\u007fL@M\u0010_4Rt\u0005QUO0^(Y;\u001e\u001a$\u001c]'\u001c\u0013]CmjM6,\u00120H\u0010:nJk'\n<zlQZ\u001aPX\u0015\u0005=-oT/#j", "3uP9h(MW#\b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0015w\u001f/QE\u001b|0%%dp=\u0011l\u0002", "2dc.\\3L", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\u001e&dhI\u0003r6[@\u0005QUO0^2\u00049\u001b\"V\u001dR5\u0016Z@?.v\u000eE.\u0004;W\u0006=2|\u0015\u0015\u001b?noPU\u0016\u0011Y&qH9dU]i\u0003&AT^.k\u001a5`M", "<`\\2", "8r^;I(Ec\u0019", "", "", "@t[2", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "7rD@X9\"\\x\u0012\u0006^9\u0001\u0011/n\u000f", "", "7r4Ec,KW!~\u0004m\bz\u00183v\u007f", "7r32i0<Suz\t^+", "/k[<V(MS\u0018^\u000ei,\n\r7e\t7d<\t\u0017", "@t[2C(La\u0019}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}}&dhI\u0003r0X\u007f\u0006G[J0c`H$\u0019\u000ek\n\u0018;\u001c\t`\u000b\fjO\r\u0006\r(Z}\u0005o|\u0015\u0018W#y}F_\u0012\u001d`\u001aqR%2MUh{\u0011/To.m\u000e5\u0013C?65\u0010;)*lWwqw^fgGnNlC*v\u0002+:v]\u00103~b@})t2\u0001s#.\"{'}/M\u00114@k\u0005Gpm\u0002O", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "5dc\u000e_3HQ\u0015\u000ez]\f\u0010\u0014/r\u00040{I\u0010\u007f\u0013Oo", "5dc\u000e_3HQ\u0015\u000ez]\f\u0010\u0014/r\u00040{I\u0010\u007f\u0013OoL8\u007f$Bc\u0002\u001f1{\u00154GP;r4\u001a#h", "5dc\u000ee9:g", "9dh", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00119\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "5dc\u000fb6ES\u0015\b", "5dc\u0010b5?W\u001b", "5dc\u0011\\*MW#\bvk@", "5dc\u0011b<;Z\u0019", "", "5dc\u0014e6N^\u0002z\u0003^", "5dc\u0016a;", "", "5dc\u0016f\fQ^\u0019\f~f,\u0006\u0018\u000bc\u000f,\r@", "5dc\u0016f\u001cLS&b\u0004>?\b\t<i\b(\u0005O", "5dc\u0019b5@", "", "5dc\u001fh3>7w", "5dc\u001fh3>>\u0015\r\t^+", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N?\u0013 F|\u0018@u\u001fCX\u0004\u001aDm\u001d.IQ;", "u(J\u0019](OOb\u000f\nb3Fp+pU", "5dc g9B\\\u001b", "5dc#T3NS", "/r;6f;(T\u0004z~k:", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u000f", "\u0010", "/r<.c\u0016?", "\u0019", "$", "/r?.\\9(T", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DynamicConfig extends BaseConfig {
    public static final Companion Companion = new Companion(null);
    private final String allocatedExperimentName;
    private final EvaluationDetails details;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final String rule;
    private final Boolean rulePassed;
    private final Map<String, String>[] secondaryExposures;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018l+MCv0'\u0019rj\u000f", "", "u(E", "5dc\u0012e9H`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "<`\\2", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DynamicConfig getError(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new DynamicConfig(name, new EvaluationDetails(EvaluationReason.Error, 0L, 0L, 2, null), null, null, null, null, false, false, false, null, null, 2044, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicConfig(String configName, APIDynamicConfig apiDynamicConfig, EvaluationDetails evalDetails) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(apiDynamicConfig, "apiDynamicConfig");
        Intrinsics.checkNotNullParameter(evalDetails, "evalDetails");
        Map<String, Object> value = apiDynamicConfig.getValue();
        String ruleID = apiDynamicConfig.getRuleID();
        String groupName = apiDynamicConfig.getGroupName();
        Map<String, String>[] secondaryExposures = apiDynamicConfig.getSecondaryExposures();
        this(configName, evalDetails, value, ruleID, groupName, secondaryExposures == null ? new Map[0] : secondaryExposures, apiDynamicConfig.isUserInExperiment(), apiDynamicConfig.isExperimentActive(), apiDynamicConfig.isDeviceBased(), apiDynamicConfig.getAllocatedExperimentName(), apiDynamicConfig.getRulePassed());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicConfig(String name, EvaluationDetails details, Map<String, ? extends Object> jsonValue, String rule, String str, Map<String, String>[] secondaryExposures, boolean z2, boolean z3, boolean z4, String str2, Boolean bool) {
        super(name, details);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(secondaryExposures, "secondaryExposures");
        this.name = name;
        this.details = details;
        this.jsonValue = jsonValue;
        this.rule = rule;
        this.groupName = str;
        this.secondaryExposures = secondaryExposures;
        this.isUserInExperiment = z2;
        this.isExperimentActive = z3;
        this.isDeviceBased = z4;
        this.allocatedExperimentName = str2;
        this.rulePassed = bool;
    }

    public /* synthetic */ DynamicConfig(String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, boolean z2, boolean z3, boolean z4, String str4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, evaluationDetails, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? MapsKt.emptyMap() : map, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? "" : str2, (i2 & 16) != 0 ? null : str3, (i2 + 32) - (i2 | 32) != 0 ? new Map[0] : mapArr, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? false : z2, (i2 + 128) - (i2 | 128) != 0 ? false : z3, (i2 & 256) == 0 ? z4 : false, (i2 + 512) - (i2 | 512) != 0 ? null : str4, (i2 & 1024) == 0 ? bool : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicConfig(String configName, ConfigEvaluation evaluation, EvaluationDetails details) {
        Intrinsics.checkNotNullParameter(configName, "configName");
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
        this(configName, details, mapValue, ruleID, groupName, (Map[]) array, evaluation.isExperimentGroup(), evaluation.isActive(), false, null, null, 1536, null);
    }

    private final /* synthetic */ List asListOfPairs(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = null;
            if (obj instanceof Pair) {
                Pair pair2 = (Pair) obj;
                Object first = pair2.getFirst();
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                if (first instanceof Object) {
                    Object second = pair2.getSecond();
                    Intrinsics.reifiedOperationMarker(3, "B");
                    if (second instanceof Object) {
                        Object first2 = pair2.getFirst();
                        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                        Object second2 = pair2.getSecond();
                        Intrinsics.reifiedOperationMarker(1, "B");
                        pair = TuplesKt.to(first2, second2);
                    }
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    private final /* synthetic */ Map asMapOf(Map map, Map map2) {
        Object objFirst = CollectionsKt.first(map.keySet());
        Intrinsics.reifiedOperationMarker(3, "K");
        if (objFirst instanceof Object) {
            Object objFirst2 = CollectionsKt.first(map.values());
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            if (objFirst2 instanceof Object) {
                List list = MapsKt.toList(map);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Pair pair = null;
                    if (obj instanceof Pair) {
                        Pair pair2 = (Pair) obj;
                        Object first = pair2.getFirst();
                        Intrinsics.reifiedOperationMarker(3, "K");
                        if (first instanceof Object) {
                            Object second = pair2.getSecond();
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                            if (second instanceof Object) {
                                Object first2 = pair2.getFirst();
                                Intrinsics.reifiedOperationMarker(1, "K");
                                Object second2 = pair2.getSecond();
                                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                                pair = TuplesKt.to(first2, second2);
                            }
                        }
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                ArrayList<Pair> arrayList2 = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                for (Pair pair3 : arrayList2) {
                    Pair pair4 = new Pair(pair3.getFirst(), pair3.getSecond());
                    linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
                }
                return linkedHashMap;
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.util.Map asMapOf$default(com.statsig.androidsdk.DynamicConfig r9, java.util.Map r10, java.util.Map r11, int r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.DynamicConfig.asMapOf$default(com.statsig.androidsdk.DynamicConfig, java.util.Map, java.util.Map, int, java.lang.Object):java.util.Map");
    }

    private final /* synthetic */ Pair asPairOf(Pair pair) {
        Object first = pair.getFirst();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        if (!(first instanceof Object)) {
            return null;
        }
        Object second = pair.getSecond();
        Intrinsics.reifiedOperationMarker(3, "B");
        if (!(second instanceof Object)) {
            return null;
        }
        Object first2 = pair.getFirst();
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        Object second2 = pair.getSecond();
        Intrinsics.reifiedOperationMarker(1, "B");
        return TuplesKt.to(first2, second2);
    }

    public final String getAllocatedExperimentName$android_sdk_release() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String key, Object[] objArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        if (!(obj instanceof ArrayList)) {
            return objArr;
        }
        Object[] array = ((Collection) obj).toArray(new Object[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean getBoolean(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(this.jsonValue.get(key) instanceof Boolean)) {
            return z2;
        }
        Object obj = this.jsonValue.get(key);
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.statsig.androidsdk.DynamicConfig getConfig(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.DynamicConfig.getConfig(java.lang.String):com.statsig.androidsdk.DynamicConfig");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0060  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> getDictionary(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.DynamicConfig.getDictionary(java.lang.String, java.util.Map):java.util.Map");
    }

    public final double getDouble(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).doubleValue() : d2;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getInt(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).intValue() : i2;
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final long getLong(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.jsonValue.get(key);
        return obj instanceof Number ? ((Number) obj).longValue() : j2;
    }

    public final String getRuleID() {
        return this.rule;
    }

    public final Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final Map<String, String>[] getSecondaryExposures$android_sdk_release() {
        return this.secondaryExposures;
    }

    public final String getString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(this.jsonValue.get(key) instanceof String)) {
            return str;
        }
        Object obj = this.jsonValue.get(key);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final Map<String, Object> getValue() {
        return this.jsonValue;
    }
}
