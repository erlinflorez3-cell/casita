package com.statsig.androidsdk;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\rD4\u0012\u0006\u0013nj?0Le^.Zݷ2\u000f\u0002{<$a.yCQU\"}8\tWNmivJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0012\u00172P~G3SpE9n}>\u0005&2*8\b\t\t\u001a0J\u0018v\u0011CS\f(0Hp@S#˟5\u001a@\u0005~e\u0011\"jgf6vmmV=%\u001b\u0002RP7_^\u0001]\u001bV`7\u000f\u0007aL/P9E\u0015SR1\n\u0001^O\u0007MvU\u0005\u0017+7/Wyo6\u0007\u0007$\u001b9W%_\t%\u000b\u000eŌd\f55\u0018.Ya&(>\r\u001c\u0011Bǉ\u001c\u0018=G^=(y \u001aCv\u0003SnT\u0012`R\u007f)`d\u001aU\u0004A?Q\u001b-c\u0012Q'cO\u000e\u0015\u000f.#/\u00061]d\u000e\u000f\u0019+V\bQwcnS\u000fݓ\u0010ՒAm\u0012\t+L8\u001dHGFA\u001c\u00154Ϗ3Iq8S1y\u0015`Pwx\u0015`\u0017WyTX@PmD:Z\r\u001an\\dK}\u0001jfA)_,V\u0017}6*0^\b<O) P_h0|{sPɛ5Ϭ;Y|\u0004V\u0010GxK5\u0018u0eXΘ\"QRa5\\t]k\f\txX2@[\u0003\u001c\b}TN:\u0017BA\u0002\u001cb+_\u001c\r\u0019V\u00176B\b\u000fOݣ`ӳ\u0014~bPlMwB\r\tGb|tuΟ\u0007[B{\u00112;TiA)(e\"\u00178\r%\u0017~\"~uj|KZ\u0001.u\u001c\u000eP,(NiAM\u0015\u001f~WQ\u0012/UL!iaO\"'A\u000f(%\u0002ß4Թ\fj~D)#Xol\u0017h\t~v)Ψr\u0012\u0010`v~U~l\u000b\nZy\u0003\u0011lTZH~\u0015\u001fL)\u0011q2|c,q*M\u001a\u0006(G\u0015(o0۳4ԃf\u000f4\u0012.):\u0005.urQc3Q7w{/B0G\u0005\u0003pL\u001b\u0002\u0016V!:\u001d3NBzo\u0005ZԪ\u000f/\f\u000bO@\u001b\u0016n[h9 \u0002BQw*\"G.\u0018lW=\u0011{y0\u001e{rt\u0019Z\u0011\u001a\u000b*5~\u0014,=NUma736w&YY;\u0011\tl\u001b2HDJ\u0018\rST\u0018\n |\u0010F\u000e\u000e-1pv\u0004j\u001c|\u0011\\\u0005q5dS\u00049*/\u0003?7,\rM13\u0017\u000fl=\u000eJ\u0003i\u001c7\u001f\u001bS\r\n=+rXi!6l\u0019\r[\\qMJ%\u0012rAm2\u0002,<\u001eӽ+T.\u001aiU\u001f\f\u000f0\r\u000f\u0006h\\x\u000f\u0012-d~C7,\u0013\u001a\u001e>\u001a\u000f98_t\u007fb[P^yGC`\u0013'F9\u0007R\u000f\u0012tɴ1\u0006;\\mjxD?\u0019gUK}670)\u0014tO`g\u0010v\n$-J\u0018\u0002\u0016)\u00147Aц$\u00044y;ҝ\u0010ڷ\f6]3\u0004\u0011!dqk&(͛+1tݩZMn\u0004\u0018o=r|Z#\u0003\u00155ٟ}t5Ǡ5\u000b-Z<!)kH\u0019k\"n\u0010.\u001dޞ*%>ʊz+\u0016^qxA\u0010]]%C?m:a_4b,\u000e+\nw\u0014*\u0003,%=fMlc7_\u001bE.Е`Ɉ,d|׃y \u000b~`^?\u0014\u000bЛt۠h/?؟ۻ_?"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.#", "", "AsPAf0@1 \u0003zg;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", ">`a.`\u001aM]&~", "", "", "<`\\2", "3uP9h(MW#\bY^;x\r6s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.-T7rD\u001a$lkBpn;R\u00010U\"", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[[';m\u001f=#*@gE\u001a^xp=\u000e-\u0014J\u0002|.QJ=X\u001cy9\u001d\u0014${]8\u0011\u000e[\u0017\u000blN?h\u0016;E\u0011Il\u0003U\u0012\u00174wzFU\u001eF\u007f^UR%oVUn}QJ$b9`\u0010f+2!8.\u001c;'*d_<\u000e}\u001d\r{Q\u0007qkF'y>m)ihBMod<\u0002\u0015.U\twqCT{;p<\b>3 o\u0014Oq!L4<\u0006", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Avt.\\??rBs", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001cc;B]\"\r", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9x8\u0004!=Y\r D[%8ZC\u001b|0%%dp=\u0011l\u0016Y\u0006+QU\\\u0002", "3uP9h(MSw\u0013\u0004Z4\u0001\u0007\ro\t)\u007fBk\u0013$Cw\u000eKv2", "\"", ">`a.`", "4`[9U(<Y", "5dc#T3NS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW&s*5W\ru\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "3uP9h(MSx\u0012\u0006^9\u0001\u0011/n\u000f\u0013wM|\u001f\u0017Vo\u001b", "3uP9h(MSy~vm<\n\t\u0011a\u000f(", ">`a.`\u001bR^\u0019", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~\u0014Id}u", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011Z\nIr-$m\t \rT\u001b*^?\u0005{C\"\u001c2I5\u00129\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001Pk^=5j\u000e>\u001b\u0011.\u0013k8m\u0001\n%c", "3uP9h(MS\u007fz\u000f^9g\u0005<a\b(\u000b@\u000e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", "3uP9h(MS\u0007\u000evm0zy+l\u0010(", "5dc\u000ee9:g", "", ">`a.`\u0015:[\u0019", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00119\"p0/\u00112h5\u0010eu8s,GJ]\u0002", "5dc\u000fb6ES\u0015\b", "", "5dc\u0011\\*MW#\bvk@", "5dc\u0011b<;Z\u0019", "", "5dc g9B\\\u001b", "5dc#T3NSy\f\u0005f\u0019|\n", "Bn_\u0019X=>Z\u0004z\bZ4e\u00057e", "5dc\u0019T@>`\nz\u0002n,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u0011l5:[\u001d|Xh5}\r1V{/\f@", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018Wxbk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK26\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ParameterStore {
    private final EvaluationDetails evaluationDetails;
    private final String name;
    private final ParameterStoreEvaluationOptions options;
    private final Map<String, Map<String, Object>> paramStore;
    private final StatsigClient statsigClient;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RefType.valuesCustom().length];
            iArr[RefType.GATE.ordinal()] = 1;
            iArr[RefType.STATIC.ordinal()] = 2;
            iArr[RefType.LAYER.ordinal()] = 3;
            iArr[RefType.DYNAMIC_CONFIG.ordinal()] = 4;
            iArr[RefType.EXPERIMENT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParamType.valuesCustom().length];
            iArr2[ParamType.BOOLEAN.ordinal()] = 1;
            iArr2[ParamType.STRING.ordinal()] = 2;
            iArr2[ParamType.NUMBER.ordinal()] = 3;
            iArr2[ParamType.OBJECT.ordinal()] = 4;
            iArr2[ParamType.ARRAY.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParameterStore(StatsigClient statsigClient, Map<String, ? extends Map<String, ? extends Object>> paramStore, String name, EvaluationDetails evaluationDetails, ParameterStoreEvaluationOptions parameterStoreEvaluationOptions) {
        Intrinsics.checkNotNullParameter(statsigClient, "statsigClient");
        Intrinsics.checkNotNullParameter(paramStore, "paramStore");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(evaluationDetails, "evaluationDetails");
        this.statsigClient = statsigClient;
        this.paramStore = paramStore;
        this.name = name;
        this.evaluationDetails = evaluationDetails;
        this.options = parameterStoreEvaluationOptions;
    }

    private final /* synthetic */ Object evaluateDynamicConfigParameter(Map map, Object obj, Function2 function2) {
        Object obj2 = map.get("config_name");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("param_name");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        ParameterStoreEvaluationOptions options = getOptions();
        return function2.invoke(Intrinsics.areEqual((Object) (options != null ? Boolean.valueOf(options.getDisableExposureLog()) : null), (Object) true) ? this.statsigClient.getConfigWithExposureLoggingDisabled(str) : this.statsigClient.getConfig(str), str2);
    }

    private final /* synthetic */ Object evaluateExperimentParameter(Map map, Object obj, Function2 function2) {
        Object obj2 = map.get("experiment_name");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("param_name");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        ParameterStoreEvaluationOptions options = getOptions();
        return function2.invoke(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str, false, 2, null) : StatsigClient.getExperiment$default(this.statsigClient, str, false, 2, null), str2);
    }

    private final /* synthetic */ Object evaluateFeatureGate(ParamType paramType, Map map, Object obj) {
        Object obj2 = map.get("pass_value");
        Object obj3 = map.get("fail_value");
        Object obj4 = map.get("gate_name");
        String str = obj4 instanceof String ? (String) obj4 : null;
        if (obj2 == null || obj3 == null || str == null) {
            return obj;
        }
        ParameterStoreEvaluationOptions options = getOptions();
        if (!(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? this.statsigClient.checkGateWithExposureLoggingDisabled(str) : this.statsigClient.checkGate(str))) {
            obj2 = obj3;
        }
        if (paramType == ParamType.NUMBER) {
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            Double d2 = dValueOf;
            return d2 == null ? obj : d2;
        }
        if (paramType != ParamType.ARRAY) {
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            return obj2 == null ? obj : obj2;
        }
        if (obj2 instanceof Object[]) {
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            return obj2 == null ? obj : obj2;
        }
        if (!(obj2 instanceof ArrayList)) {
            return obj;
        }
        Object[] array = ((Collection) obj2).toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = array;
        return objArr == null ? obj : objArr;
    }

    private final /* synthetic */ Object evaluateLayerParameter(Map map, Object obj, Function2 function2) {
        Object obj2 = map.get("layer_name");
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("param_name");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || str2 == null) {
            return obj;
        }
        ParameterStoreEvaluationOptions options = getOptions();
        return function2.invoke(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str, false, 2, null) : StatsigClient.getLayer$default(this.statsigClient, str, false, 2, null), str2);
    }

    private final /* synthetic */ Object evaluateStaticValue(ParamType paramType, Map map, Object obj) {
        Object[] objArr;
        int i2 = WhenMappings.$EnumSwitchMapping$1[paramType.ordinal()];
        if (i2 == 1) {
            objArr = map.get("value");
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (objArr == null) {
                return obj;
            }
        } else if (i2 == 2) {
            objArr = map.get("value");
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (objArr == null) {
                return obj;
            }
        } else {
            if (i2 == 3) {
                Object obj2 = map.get("value");
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                Double d2 = dValueOf;
                return d2 == null ? obj : d2;
            }
            if (i2 == 4) {
                objArr = map.get("value");
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                if (objArr == null) {
                    return obj;
                }
            } else {
                if (i2 != 5) {
                    return obj;
                }
                objArr = map.get("value");
                if (objArr instanceof Object[]) {
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    if (objArr == null) {
                        return obj;
                    }
                } else {
                    if (!(objArr instanceof ArrayList)) {
                        return obj;
                    }
                    Object[] array = ((Collection) objArr).toArray(new Object[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    objArr = array;
                    if (objArr == null) {
                        return obj;
                    }
                }
            }
        }
        return objArr;
    }

    private final /* synthetic */ Object getValueFromRef(String str, Object obj, Function3 function3, Function3 function32) {
        Object[] objArr;
        Object objValueOf;
        Object obj2;
        Map map = (Map) this.paramStore.get(str);
        if (map == null) {
            return obj;
        }
        Object obj3 = map.get("ref_type");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str2 == null) {
            return obj;
        }
        Object obj4 = map.get("param_type");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str3 == null) {
            return obj;
        }
        RefType refTypeFromString = RefType.Companion.fromString(str2);
        ParamType paramTypeFromString = ParamType.Companion.fromString(str3);
        int i2 = WhenMappings.$EnumSwitchMapping$0[refTypeFromString.ordinal()];
        if (i2 == 1) {
            Object obj5 = map.get("pass_value");
            Object obj6 = map.get("fail_value");
            Object obj7 = map.get("gate_name");
            String str4 = obj7 instanceof String ? (String) obj7 : null;
            if (obj5 == null || obj6 == null || str4 == null) {
                return obj;
            }
            ParameterStoreEvaluationOptions options = getOptions();
            if (!(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? this.statsigClient.checkGateWithExposureLoggingDisabled(str4) : this.statsigClient.checkGate(str4))) {
                obj5 = obj6;
            }
            if (paramTypeFromString == ParamType.NUMBER) {
                Number number = obj5 instanceof Number ? (Number) obj5 : null;
                objValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                obj2 = objValueOf;
                if (obj2 == null) {
                    return obj;
                }
                return obj2;
            }
            if (paramTypeFromString != ParamType.ARRAY) {
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                if (obj5 == null) {
                    return obj;
                }
            } else {
                if (!(obj5 instanceof Object[])) {
                    if (!(obj5 instanceof ArrayList)) {
                        return obj;
                    }
                    Object[] array = ((Collection) obj5).toArray(new Object[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    objArr = array;
                    if (objArr == null) {
                        return obj;
                    }
                    return objArr;
                }
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                if (obj5 == null) {
                    return obj;
                }
            }
            return obj5;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                Object obj8 = map.get("layer_name");
                String str5 = obj8 instanceof String ? (String) obj8 : null;
                Object obj9 = map.get("param_name");
                String str6 = obj9 instanceof String ? (String) obj9 : null;
                if (str5 == null || str6 == null) {
                    return obj;
                }
                ParameterStoreEvaluationOptions options2 = getOptions();
                return function3.invoke(Intrinsics.areEqual((Object) (options2 == null ? null : Boolean.valueOf(options2.getDisableExposureLog())), (Object) true) ? StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str5, false, 2, null) : StatsigClient.getLayer$default(this.statsigClient, str5, false, 2, null), str6, obj);
            }
            if (i2 == 4) {
                Object obj10 = map.get("config_name");
                String str7 = obj10 instanceof String ? (String) obj10 : null;
                Object obj11 = map.get("param_name");
                String str8 = obj11 instanceof String ? (String) obj11 : null;
                if (str7 == null || str8 == null) {
                    return obj;
                }
                ParameterStoreEvaluationOptions options3 = getOptions();
                return function32.invoke(Intrinsics.areEqual(options3 != null ? Boolean.valueOf(options3.getDisableExposureLog()) : null, (Object) true) ? this.statsigClient.getConfigWithExposureLoggingDisabled(str7) : this.statsigClient.getConfig(str7), str8, obj);
            }
            if (i2 != 5) {
                return obj;
            }
            Object obj12 = map.get("experiment_name");
            String str9 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = map.get("param_name");
            String str10 = obj13 instanceof String ? (String) obj13 : null;
            if (str9 == null || str10 == null) {
                return obj;
            }
            ParameterStoreEvaluationOptions options4 = getOptions();
            return function32.invoke(Intrinsics.areEqual((Object) (options4 == null ? null : Boolean.valueOf(options4.getDisableExposureLog())), (Object) true) ? StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str9, false, 2, null) : StatsigClient.getExperiment$default(this.statsigClient, str9, false, 2, null), str10, obj);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[paramTypeFromString.ordinal()];
        if (i3 == 1) {
            objArr = map.get("value");
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (objArr == null) {
                return obj;
            }
        } else if (i3 == 2) {
            objArr = map.get("value");
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            if (objArr == null) {
                return obj;
            }
        } else {
            if (i3 == 3) {
                Object obj14 = map.get("value");
                Number number2 = obj14 instanceof Number ? (Number) obj14 : null;
                objValueOf = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                obj2 = objValueOf;
                if (obj2 == null) {
                    return obj;
                }
                return obj2;
            }
            if (i3 == 4) {
                objArr = map.get("value");
                Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                if (objArr == null) {
                    return obj;
                }
            } else {
                if (i3 != 5) {
                    return obj;
                }
                objArr = map.get("value");
                if (objArr instanceof Object[]) {
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    if (objArr == null) {
                        return obj;
                    }
                } else {
                    if (!(objArr instanceof ArrayList)) {
                        return obj;
                    }
                    Object[] array2 = ((Collection) objArr).toArray(new Object[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
                    objArr = array2;
                    if (objArr == null) {
                        return obj;
                    }
                }
            }
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] getArray(String paramName, Object[] objArr) {
        Object obj;
        String str;
        DynamicConfig configWithExposureLoggingDisabled;
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Map map = (Map) this.paramStore.get(paramName);
        if (map == null) {
            return objArr;
        }
        Object obj2 = map.get("ref_type");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            return objArr;
        }
        Object obj3 = map.get("param_type");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            return objArr;
        }
        RefType refTypeFromString = RefType.Companion.fromString(str2);
        ParamType paramTypeFromString = ParamType.Companion.fromString(str3);
        int i2 = WhenMappings.$EnumSwitchMapping$0[refTypeFromString.ordinal()];
        if (i2 == 1) {
            Object obj4 = map.get("pass_value");
            Object obj5 = map.get("fail_value");
            Object obj6 = map.get("gate_name");
            String str4 = obj6 instanceof String ? (String) obj6 : null;
            if (obj4 == null || obj5 == null || str4 == null) {
                return objArr;
            }
            ParameterStoreEvaluationOptions options = getOptions();
            if (!(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? this.statsigClient.checkGateWithExposureLoggingDisabled(str4) : this.statsigClient.checkGate(str4))) {
                obj4 = obj5;
            }
            if (paramTypeFromString == ParamType.NUMBER) {
                Number number = obj4 instanceof Number ? (Number) obj4 : null;
                Double dValueOf = number == null ? null : Double.valueOf(number.doubleValue());
                obj = (Object[]) (dValueOf instanceof Object[] ? dValueOf : null);
                if (obj == null) {
                    return objArr;
                }
            } else if (paramTypeFromString == ParamType.ARRAY) {
                boolean z2 = obj4 instanceof Object[];
                if (z2) {
                    obj = (Object[]) (z2 ? obj4 : null);
                    if (obj == null) {
                        return objArr;
                    }
                } else {
                    if (!(obj4 instanceof ArrayList)) {
                        return objArr;
                    }
                    Object[] array = ((Collection) obj4).toArray(new Object[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    obj = array instanceof Object[] ? array : null;
                    if (obj == null) {
                        return objArr;
                    }
                }
            } else {
                obj = (Object[]) (obj4 instanceof Object[] ? obj4 : null);
                if (obj == null) {
                    return objArr;
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj7 = map.get("layer_name");
                    String str5 = obj7 instanceof String ? (String) obj7 : null;
                    Object obj8 = map.get("param_name");
                    String str6 = obj8 instanceof String ? (String) obj8 : null;
                    if (str5 == null || str6 == null) {
                        return objArr;
                    }
                    ParameterStoreEvaluationOptions options2 = getOptions();
                    return (Intrinsics.areEqual((Object) (options2 == null ? null : Boolean.valueOf(options2.getDisableExposureLog())), (Object) true) ? StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str5, false, 2, null) : StatsigClient.getLayer$default(this.statsigClient, str5, false, 2, null)).getArray(str6, objArr);
                }
                if (i2 == 4) {
                    Object obj9 = map.get("config_name");
                    String str7 = obj9 instanceof String ? (String) obj9 : null;
                    Object obj10 = map.get("param_name");
                    str = obj10 instanceof String ? (String) obj10 : null;
                    if (str7 == null || str == null) {
                        return objArr;
                    }
                    ParameterStoreEvaluationOptions options3 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual(options3 != null ? Boolean.valueOf(options3.getDisableExposureLog()) : null, (Object) true) ? this.statsigClient.getConfigWithExposureLoggingDisabled(str7) : this.statsigClient.getConfig(str7);
                } else {
                    if (i2 != 5) {
                        return objArr;
                    }
                    Object obj11 = map.get("experiment_name");
                    String str8 = obj11 instanceof String ? (String) obj11 : null;
                    Object obj12 = map.get("param_name");
                    str = obj12 instanceof String ? (String) obj12 : null;
                    if (str8 == null || str == null) {
                        return objArr;
                    }
                    ParameterStoreEvaluationOptions options4 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual((Object) (options4 == null ? null : Boolean.valueOf(options4.getDisableExposureLog())), (Object) true) ? StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null) : StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null);
                }
                return configWithExposureLoggingDisabled.getArray(str, objArr);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[paramTypeFromString.ordinal()];
            if (i3 == 1) {
                Object obj13 = map.get("value");
                obj = (Object[]) (obj13 instanceof Object[] ? obj13 : null);
                if (obj == null) {
                    return objArr;
                }
            } else if (i3 == 2) {
                Object obj14 = map.get("value");
                obj = (Object[]) (obj14 instanceof Object[] ? obj14 : null);
                if (obj == null) {
                    return objArr;
                }
            } else if (i3 == 3) {
                Object obj15 = map.get("value");
                Number number2 = obj15 instanceof Number ? (Number) obj15 : null;
                Double dValueOf2 = number2 == null ? null : Double.valueOf(number2.doubleValue());
                obj = (Object[]) (dValueOf2 instanceof Object[] ? dValueOf2 : null);
                if (obj == null) {
                    return objArr;
                }
            } else if (i3 == 4) {
                Object obj16 = map.get("value");
                obj = (Object[]) (obj16 instanceof Object[] ? obj16 : null);
                if (obj == null) {
                    return objArr;
                }
            } else {
                if (i3 != 5) {
                    return objArr;
                }
                Object obj17 = map.get("value");
                boolean z3 = obj17 instanceof Object[];
                if (z3) {
                    obj = (Object[]) (z3 ? obj17 : null);
                    if (obj == null) {
                        return objArr;
                    }
                } else {
                    if (!(obj17 instanceof ArrayList)) {
                        return objArr;
                    }
                    Object[] array2 = ((Collection) obj17).toArray(new Object[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    obj = array2 instanceof Object[] ? array2 : null;
                    if (obj == null) {
                        return objArr;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:409:0x02ae A[PHI: r2
  0x02ae: PHI (r2v13 java.lang.Boolean) = 
  (r2v3 java.lang.Boolean)
  (r2v6 java.lang.Boolean)
  (r2v9 java.lang.Boolean)
  (r2v12 java.lang.Boolean)
  (r2v16 java.lang.Boolean)
  (r2v19 java.lang.Boolean)
  (r2v22 java.lang.Boolean)
  (r2v25 java.lang.Boolean)
  (r2v28 java.lang.Boolean)
  (r2v31 java.lang.Boolean)
 binds: [B:406:0x02a8, B:400:0x029c, B:390:0x0282, B:375:0x024f, B:347:0x01f9, B:341:0x01e9, B:333:0x01ce, B:322:0x01b5, B:316:0x01a5, B:306:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getBoolean(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.ParameterStore.getBoolean(java.lang.String, boolean):boolean");
    }

    public final Map<String, Object> getDictionary(String paramName, Map<String, ? extends Object> map) {
        Map<String, Object> map2;
        String str;
        DynamicConfig configWithExposureLoggingDisabled;
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Map map3 = (Map) this.paramStore.get(paramName);
        if (map3 == null) {
            return map;
        }
        Object obj = map3.get("ref_type");
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            return map;
        }
        Object obj2 = map3.get("param_type");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        if (str3 == null) {
            return map;
        }
        RefType refTypeFromString = RefType.Companion.fromString(str2);
        ParamType paramTypeFromString = ParamType.Companion.fromString(str3);
        int i2 = WhenMappings.$EnumSwitchMapping$0[refTypeFromString.ordinal()];
        if (i2 == 1) {
            Object obj3 = map3.get("pass_value");
            Object obj4 = map3.get("fail_value");
            Object obj5 = map3.get("gate_name");
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            if (obj3 == null || obj4 == null || str4 == null) {
                return map;
            }
            ParameterStoreEvaluationOptions options = getOptions();
            if (!(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? this.statsigClient.checkGateWithExposureLoggingDisabled(str4) : this.statsigClient.checkGate(str4))) {
                obj3 = obj4;
            }
            if (paramTypeFromString == ParamType.NUMBER) {
                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                Double dValueOf = number == null ? null : Double.valueOf(number.doubleValue());
                map2 = (Map) (dValueOf instanceof Map ? dValueOf : null);
                if (map2 == null) {
                    return map;
                }
            } else if (paramTypeFromString != ParamType.ARRAY) {
                map2 = (Map) (obj3 instanceof Map ? obj3 : null);
                if (map2 == null) {
                    return map;
                }
            } else if (obj3 instanceof Object[]) {
                map2 = (Map) (obj3 instanceof Map ? obj3 : null);
                if (map2 == null) {
                    return map;
                }
            } else {
                if (!(obj3 instanceof ArrayList)) {
                    return map;
                }
                Object[] array = ((Collection) obj3).toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                map2 = (Map) (array instanceof Map ? array : null);
                if (map2 == null) {
                    return map;
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj6 = map3.get("layer_name");
                    String str5 = obj6 instanceof String ? (String) obj6 : null;
                    Object obj7 = map3.get("param_name");
                    String str6 = obj7 instanceof String ? (String) obj7 : null;
                    if (str5 == null || str6 == null) {
                        return map;
                    }
                    ParameterStoreEvaluationOptions options2 = getOptions();
                    return (Intrinsics.areEqual((Object) (options2 == null ? null : Boolean.valueOf(options2.getDisableExposureLog())), (Object) true) ? StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str5, false, 2, null) : StatsigClient.getLayer$default(this.statsigClient, str5, false, 2, null)).getDictionary(str6, map);
                }
                if (i2 == 4) {
                    Object obj8 = map3.get("config_name");
                    String str7 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = map3.get("param_name");
                    str = obj9 instanceof String ? (String) obj9 : null;
                    if (str7 == null || str == null) {
                        return map;
                    }
                    ParameterStoreEvaluationOptions options3 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual(options3 != null ? Boolean.valueOf(options3.getDisableExposureLog()) : null, (Object) true) ? this.statsigClient.getConfigWithExposureLoggingDisabled(str7) : this.statsigClient.getConfig(str7);
                } else {
                    if (i2 != 5) {
                        return map;
                    }
                    Object obj10 = map3.get("experiment_name");
                    String str8 = obj10 instanceof String ? (String) obj10 : null;
                    Object obj11 = map3.get("param_name");
                    str = obj11 instanceof String ? (String) obj11 : null;
                    if (str8 == null || str == null) {
                        return map;
                    }
                    ParameterStoreEvaluationOptions options4 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual((Object) (options4 == null ? null : Boolean.valueOf(options4.getDisableExposureLog())), (Object) true) ? StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str8, false, 2, null) : StatsigClient.getExperiment$default(this.statsigClient, str8, false, 2, null);
                }
                return configWithExposureLoggingDisabled.getDictionary(str, map);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[paramTypeFromString.ordinal()];
            if (i3 == 1) {
                Object obj12 = map3.get("value");
                map2 = (Map) (obj12 instanceof Map ? obj12 : null);
                if (map2 == null) {
                    return map;
                }
            } else if (i3 == 2) {
                Object obj13 = map3.get("value");
                map2 = (Map) (obj13 instanceof Map ? obj13 : null);
                if (map2 == null) {
                    return map;
                }
            } else if (i3 == 3) {
                Object obj14 = map3.get("value");
                Number number2 = obj14 instanceof Number ? (Number) obj14 : null;
                Double dValueOf2 = number2 == null ? null : Double.valueOf(number2.doubleValue());
                map2 = (Map) (dValueOf2 instanceof Map ? dValueOf2 : null);
                if (map2 == null) {
                    return map;
                }
            } else if (i3 == 4) {
                Object obj15 = map3.get("value");
                map2 = (Map) (obj15 instanceof Map ? obj15 : null);
                if (map2 == null) {
                    return map;
                }
            } else {
                if (i3 != 5) {
                    return map;
                }
                Object obj16 = map3.get("value");
                if (obj16 instanceof Object[]) {
                    map2 = (Map) (obj16 instanceof Map ? obj16 : null);
                    if (map2 == null) {
                        return map;
                    }
                } else {
                    if (!(obj16 instanceof ArrayList)) {
                        return map;
                    }
                    Object[] array2 = ((Collection) obj16).toArray(new Object[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    map2 = (Map) (array2 instanceof Map ? array2 : null);
                    if (map2 == null) {
                        return map;
                    }
                }
            }
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:405:0x02b2 A[PHI: r3
  0x02b2: PHI (r3v12 java.lang.Object) = 
  (r3v3 java.lang.Object)
  (r3v6 java.lang.Object)
  (r3v9 java.lang.Object)
  (r3v11 java.lang.Object)
  (r3v15 java.lang.Object)
  (r3v18 java.lang.Object)
  (r3v20 java.lang.Object)
  (r3v23 java.lang.Object)
  (r3v26 java.lang.Object)
  (r3v29 java.lang.Object)
 binds: [B:402:0x02ac, B:396:0x02a0, B:386:0x0286, B:371:0x0253, B:344:0x01ff, B:338:0x01ef, B:330:0x01d4, B:320:0x01bd, B:314:0x01ad, B:304:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double getDouble(java.lang.String r14, double r15) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.ParameterStore.getDouble(java.lang.String, double):double");
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final String getName() {
        return this.name;
    }

    public final ParameterStoreEvaluationOptions getOptions() {
        return this.options;
    }

    public final String getString(String paramName, String str) {
        String str2;
        String str3;
        DynamicConfig configWithExposureLoggingDisabled;
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Map map = (Map) this.paramStore.get(paramName);
        if (map == null) {
            return str;
        }
        Object obj = map.get("ref_type");
        String str4 = obj instanceof String ? (String) obj : null;
        if (str4 == null) {
            return str;
        }
        Object obj2 = map.get("param_type");
        String str5 = obj2 instanceof String ? (String) obj2 : null;
        if (str5 == null) {
            return str;
        }
        RefType refTypeFromString = RefType.Companion.fromString(str4);
        ParamType paramTypeFromString = ParamType.Companion.fromString(str5);
        int i2 = WhenMappings.$EnumSwitchMapping$0[refTypeFromString.ordinal()];
        if (i2 == 1) {
            Object obj3 = map.get("pass_value");
            Object obj4 = map.get("fail_value");
            Object obj5 = map.get("gate_name");
            String str6 = obj5 instanceof String ? (String) obj5 : null;
            if (obj3 == null || obj4 == null || str6 == null) {
                return str;
            }
            ParameterStoreEvaluationOptions options = getOptions();
            if (!(Intrinsics.areEqual((Object) (options == null ? null : Boolean.valueOf(options.getDisableExposureLog())), (Object) true) ? this.statsigClient.checkGateWithExposureLoggingDisabled(str6) : this.statsigClient.checkGate(str6))) {
                obj3 = obj4;
            }
            if (paramTypeFromString == ParamType.NUMBER) {
                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                Double dValueOf = number == null ? null : Double.valueOf(number.doubleValue());
                str2 = (String) (dValueOf instanceof String ? dValueOf : null);
                if (str2 == null) {
                    return str;
                }
            } else if (paramTypeFromString != ParamType.ARRAY) {
                str2 = (String) (obj3 instanceof String ? obj3 : null);
                if (str2 == null) {
                    return str;
                }
            } else if (obj3 instanceof Object[]) {
                str2 = (String) (obj3 instanceof String ? obj3 : null);
                if (str2 == null) {
                    return str;
                }
            } else {
                if (!(obj3 instanceof ArrayList)) {
                    return str;
                }
                Object[] array = ((Collection) obj3).toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                str2 = (String) (array instanceof String ? array : null);
                if (str2 == null) {
                    return str;
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj6 = map.get("layer_name");
                    String str7 = obj6 instanceof String ? (String) obj6 : null;
                    Object obj7 = map.get("param_name");
                    String str8 = obj7 instanceof String ? (String) obj7 : null;
                    if (str7 == null || str8 == null) {
                        return str;
                    }
                    ParameterStoreEvaluationOptions options2 = getOptions();
                    return (Intrinsics.areEqual((Object) (options2 == null ? null : Boolean.valueOf(options2.getDisableExposureLog())), (Object) true) ? StatsigClient.getLayerWithExposureLoggingDisabled$default(this.statsigClient, str7, false, 2, null) : StatsigClient.getLayer$default(this.statsigClient, str7, false, 2, null)).getString(str8, str);
                }
                if (i2 == 4) {
                    Object obj8 = map.get("config_name");
                    String str9 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = map.get("param_name");
                    str3 = obj9 instanceof String ? (String) obj9 : null;
                    if (str9 == null || str3 == null) {
                        return str;
                    }
                    ParameterStoreEvaluationOptions options3 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual(options3 != null ? Boolean.valueOf(options3.getDisableExposureLog()) : null, (Object) true) ? this.statsigClient.getConfigWithExposureLoggingDisabled(str9) : this.statsigClient.getConfig(str9);
                } else {
                    if (i2 != 5) {
                        return str;
                    }
                    Object obj10 = map.get("experiment_name");
                    String str10 = obj10 instanceof String ? (String) obj10 : null;
                    Object obj11 = map.get("param_name");
                    str3 = obj11 instanceof String ? (String) obj11 : null;
                    if (str10 == null || str3 == null) {
                        return str;
                    }
                    ParameterStoreEvaluationOptions options4 = getOptions();
                    configWithExposureLoggingDisabled = Intrinsics.areEqual((Object) (options4 == null ? null : Boolean.valueOf(options4.getDisableExposureLog())), (Object) true) ? StatsigClient.getExperimentWithExposureLoggingDisabled$default(this.statsigClient, str10, false, 2, null) : StatsigClient.getExperiment$default(this.statsigClient, str10, false, 2, null);
                }
                return configWithExposureLoggingDisabled.getString(str3, str);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[paramTypeFromString.ordinal()];
            if (i3 == 1) {
                Object obj12 = map.get("value");
                str2 = (String) (obj12 instanceof String ? obj12 : null);
                if (str2 == null) {
                    return str;
                }
            } else if (i3 == 2) {
                Object obj13 = map.get("value");
                str2 = (String) (obj13 instanceof String ? obj13 : null);
                if (str2 == null) {
                    return str;
                }
            } else if (i3 == 3) {
                Object obj14 = map.get("value");
                Number number2 = obj14 instanceof Number ? (Number) obj14 : null;
                Double dValueOf2 = number2 == null ? null : Double.valueOf(number2.doubleValue());
                str2 = (String) (dValueOf2 instanceof String ? dValueOf2 : null);
                if (str2 == null) {
                    return str;
                }
            } else if (i3 == 4) {
                Object obj15 = map.get("value");
                str2 = (String) (obj15 instanceof String ? obj15 : null);
                if (str2 == null) {
                    return str;
                }
            } else {
                if (i3 != 5) {
                    return str;
                }
                Object obj16 = map.get("value");
                if (obj16 instanceof Object[]) {
                    str2 = (String) (obj16 instanceof String ? obj16 : null);
                    if (str2 == null) {
                        return str;
                    }
                } else {
                    if (!(obj16 instanceof ArrayList)) {
                        return str;
                    }
                    Object[] array2 = ((Collection) obj16).toArray(new Object[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    str2 = (String) (array2 instanceof String ? array2 : null);
                    if (str2 == null) {
                        return str;
                    }
                }
            }
        }
        return str2;
    }
}
