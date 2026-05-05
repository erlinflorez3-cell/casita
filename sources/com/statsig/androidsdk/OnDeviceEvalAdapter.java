package com.statsig.androidsdk;

import com.google.gson.Gson;
import com.statsig.androidsdk.evaluator.ConfigEvaluation;
import com.statsig.androidsdk.evaluator.Evaluator;
import com.statsig.androidsdk.evaluator.SpecParamStore;
import com.statsig.androidsdk.evaluator.SpecStore;
import com.statsig.androidsdk.evaluator.SpecsResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCCU0}*ޛWN}gvϺb\u000bQ\u0018\u000eǝ\u0001jBI]ތe\u0012%2JģG3coEʠhtL\u0005(݅*8\b\u0005\t\u001a0I&͌+Cy\u000bR=PvHR%O\u001b\u0019@\u0007̧$\u0001,^0dDQ\u0005_P.Q\r\u001aF\\2w0+W=Jb3%v\u0010+sNEC-%\u0002\u00127ViO\u001b? NKho=9[\fYLW.'E/]\u0018urTo5Un\u0018?+}p\u0014p\u001c<\u0010|\u0012\fj\u0019>\f5^F/0e6%cx\u0001^XP0sr\u0004\tmN\u0017S\r{AG3~Sw:Ggg\u007f\u0013#6#/\u0006Q_b\u0019x\u0015Im@]?kX=vi:]Km\u001cp\u0011\u0003r\u0012>c\u0018/*\"^\u001b3Ts9Q02\u0002\u0019Ruv\u001db~R\u0018S\u001fؚ$å\u001a72\u009e\\fRg\u001dk~X/\u008f\u0013ܖ T\u000fâX\u001f.a\u0010<O+fʝQŹmjUΪZ1=mOY\u001dsdæ;ӷ75Yү߭ep"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`1xl<\b)3Y]13tq-INJkAs", "", "2`c.", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3uP9h(M]&", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi\u0017~\u00125]?JuAs", "5r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", "As^?X", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,;REx4s", "5dc\u0011l5:[\u001d|Xh5}\r1", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "1ta?X5M", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "7rD;e,<]\u001b\b~s,{", "", "5dc\u0014T;>", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", "5dc\u0019T@>`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.k\"<\u0004z", "1kX2a;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)77\u0005$7v%\u0004", "5dc\u001dT9:[\u0007\u000e\u0005k,", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`2k\u001b8~%DY\u000b\u000eFw#.#", "Adc\u0011T;:", "", "Ag^B_+-`-h\u0004=,\u000e\r-e_9wG\u0011\u0013&Ky\u0017", "2dc.\\3L", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class OnDeviceEvalAdapter {
    private final String data;
    private final Evaluator evaluator;
    private final Gson gson;
    private final SpecStore store;

    public OnDeviceEvalAdapter(String str) {
        this.data = str;
        SpecStore specStore = new SpecStore();
        this.store = specStore;
        this.evaluator = new Evaluator(specStore);
        this.gson = StatsigUtil.INSTANCE.getGson$android_sdk_release();
        if (str == null) {
            return;
        }
        setData(str);
    }

    private final EvaluationDetails getEvaluationDetails(boolean z2) {
        Long lcut = this.store.getLcut();
        long jLongValue = lcut == null ? 0L : lcut.longValue();
        return z2 ? new EvaluationDetails(EvaluationReason.OnDeviceEvalAdapterBootstrapUnrecognized, 0L, jLongValue, 2, null) : new EvaluationDetails(EvaluationReason.OnDeviceEvalAdapterBootstrapRecognized, 0L, jLongValue, 2, null);
    }

    private final boolean shouldTryOnDeviceEvaluation(EvaluationDetails evaluationDetails) {
        SpecsResponse rawSpecs = this.store.getRawSpecs();
        return rawSpecs != null && rawSpecs.getTime() > evaluationDetails.getLcut();
    }

    public final DynamicConfig getDynamicConfig(DynamicConfig current, StatsigUser user) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(user, "user");
        if (!shouldTryOnDeviceEvaluation(current.getEvaluationDetails())) {
            return null;
        }
        String name = current.getName();
        ConfigEvaluation configEvaluationEvaluateConfig$android_sdk_release = this.evaluator.evaluateConfig$android_sdk_release(name, user);
        return new DynamicConfig(name, configEvaluationEvaluateConfig$android_sdk_release, getEvaluationDetails(configEvaluationEvaluateConfig$android_sdk_release.isUnrecognized()));
    }

    public final FeatureGate getGate(FeatureGate current, StatsigUser user) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(user, "user");
        if (!shouldTryOnDeviceEvaluation(current.getEvaluationDetails())) {
            return null;
        }
        String name = current.getName();
        ConfigEvaluation configEvaluationEvaluateGate$android_sdk_release = this.evaluator.evaluateGate$android_sdk_release(name, user);
        return new FeatureGate(name, configEvaluationEvaluateGate$android_sdk_release, getEvaluationDetails(configEvaluationEvaluateGate$android_sdk_release.isUnrecognized()));
    }

    public final Layer getLayer(StatsigClient statsigClient, Layer current, StatsigUser user) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(user, "user");
        if (!shouldTryOnDeviceEvaluation(current.getEvaluationDetails())) {
            return null;
        }
        String name = current.getName();
        ConfigEvaluation configEvaluationEvaluateLayer$android_sdk_release = this.evaluator.evaluateLayer$android_sdk_release(name, user);
        return new Layer(statsigClient, name, configEvaluationEvaluateLayer$android_sdk_release, getEvaluationDetails(configEvaluationEvaluateLayer$android_sdk_release.isUnrecognized()));
    }

    public final ParameterStore getParamStore(StatsigClient client, ParameterStore current) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(current, "current");
        if (!shouldTryOnDeviceEvaluation(current.getEvaluationDetails())) {
            return null;
        }
        SpecParamStore paramStore = this.store.getParamStore(current.getName());
        EvaluationDetails evaluationDetails = getEvaluationDetails(paramStore == null);
        Map<String, Map<String, Object>> parameters = paramStore != null ? paramStore.getParameters() : null;
        if (parameters == null) {
            parameters = MapsKt.emptyMap();
        }
        return new ParameterStore(client, parameters, current.getName(), evaluationDetails, null);
    }

    public final void setData(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Object objFromJson = this.gson.fromJson(data, (Class<Object>) SpecsResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "{\n            gson.fromJson(data, SpecsResponse::class.java)\n        }");
            this.store.setSpecs((SpecsResponse) objFromJson);
        } catch (Exception unused) {
            System.out.println((Object) "[Statsig]: Failed to parse specs from data string.");
        }
    }
}
