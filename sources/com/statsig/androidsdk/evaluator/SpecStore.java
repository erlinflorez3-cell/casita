package com.statsig.androidsdk.evaluator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\r.4\u0012\u000e\u0007nj?1Le^.Zݷ2\u000f\u0002{<$a'yCI\\\"}(\u000bWNugvJ`\u000bIƤ\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8MAX\b?O_#:5$@.Py3\u0004b8V\u001d\u000f|YJ:\u0016`D~Fj\r{\bb \u0014L8\u00034[\u0016RfLziR/Q\u00062M\\6w2\u0013L;Vù+\r\u0005rf9NIM\u0017;R1\u000f\u0003_M\u000fWqk\b1-5>aum5\u0007\n\\!9c%]!;\r\t_v$'YY4c^\u000f@\u0004\u000b}\u001d<2\u0011\u0016)X.[\u001e\u0015\ndޚ\u0001ɤW@X\u061c/Z\u000e\u007fyB''\u00103Y<+haai\u001d|9R˟\u0019̷'\u0001vď,l\u001cf-'dya1\u007fCMJ^\n\bA\u001c\u0006Gê\u000eò\b0Oĉ\u007f\u0014\u001f5/1G]I#On\u0012JTg%\r\u000fj*֢^͕D\"vݫ\b8\u0017\u0015rFz\u0004\u001aZ+Г8ҭQ\u001c\\͵ċ\f*"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,;REx4s", "", "u(E", "1n]3\\.L", "", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,#", "5`c2f", ":`h2e:", ">`a.`\u001aM]&~\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,8?Hg<\f$rn9\\", "@`f c,<a", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,[0;y?(\u001eva\u000f", "5dc\u0010b5?W\u001b", "<`\\2", "5dc\u0014T;>", "5dc\u0019T@>`", "5dc\u0019V<M", "", "u(;7T=:\u001d z\u0004`uc\u00138gU", "5dc\u001dT9:[\u0007\u000e\u0005k,", "5dc\u001fT>,^\u0019|\t", "Adc c,<a", "", "AoT0f", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SpecStore {
    private SpecsResponse rawSpecs;
    private Map<String, Spec> gates = MapsKt.emptyMap();
    private Map<String, Spec> configs = MapsKt.emptyMap();
    private Map<String, Spec> layers = MapsKt.emptyMap();
    private Map<String, SpecParamStore> paramStores = MapsKt.emptyMap();

    public final Spec getConfig(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.configs.get(name);
    }

    public final Spec getGate(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.gates.get(name);
    }

    public final Spec getLayer(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.layers.get(name);
    }

    public final Long getLcut() {
        SpecsResponse specsResponse = this.rawSpecs;
        if (specsResponse == null) {
            return null;
        }
        return Long.valueOf(specsResponse.getTime());
    }

    public final SpecParamStore getParamStore(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.paramStores.get(name);
    }

    public final SpecsResponse getRawSpecs() {
        return this.rawSpecs;
    }

    public final void setSpecs(SpecsResponse specs) {
        Intrinsics.checkNotNullParameter(specs, "specs");
        this.rawSpecs = specs;
        List<Spec> featureGates = specs.getFeatureGates();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(featureGates, 10)), 16));
        for (Object obj : featureGates) {
            linkedHashMap.put(((Spec) obj).getName(), obj);
        }
        this.gates = linkedHashMap;
        List<Spec> dynamicConfigs = specs.getDynamicConfigs();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(dynamicConfigs, 10)), 16));
        for (Object obj2 : dynamicConfigs) {
            linkedHashMap2.put(((Spec) obj2).getName(), obj2);
        }
        this.configs = linkedHashMap2;
        List<Spec> layerConfigs = specs.getLayerConfigs();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(layerConfigs, 10)), 16));
        for (Object obj3 : layerConfigs) {
            linkedHashMap3.put(((Spec) obj3).getName(), obj3);
        }
        this.layers = linkedHashMap3;
        Map<String, SpecParamStore> paramStores = specs.getParamStores();
        if (paramStores == null) {
            paramStores = MapsKt.emptyMap();
        }
        this.paramStores = paramStores;
    }
}
