package com.statsig.androidsdk.evaluator;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0013\u007f\u0007t\rA0RqP.hS2\u000fq{<$i+yّCU(\u0007*ޛWNumvJ`(Iƥ\f,ю\u001b,wT9ي\u0011\u001f<PoW9]qM9\u000fvd\u00060<0;\u0012\u000b\u0011\u001c:H>x)D[\u0016 4XvJT\u001dM3\u001c@\u0007N2\u000f#tu^8Xl\fA?%\u0013ipV=^^\u0003]%T]?!\u0007c.+n>E\u001d5Y\u0013\tb[m\nmrS\u0004\u0017-71Ose@p\u007fB ;S\u001bi\u000b&\u000b\u0012at\u0012'9]{Y`\u00108w)\u0003\u001d>\u0014\u000e46^-[ v\u0010\u00143\u0003\u0003kBf\u0001\rIȸ~aD(m\rAKQ!vSq;GPe|Kۃ\u001fk\u000e|BsZ\u001eb%\u001b\u0003y\u007f2\u0018ͼ>\u0011[\u0018{Us\u0014rr\u0002X\u0006^HFÂ|YC%HOiI%1k0OTi\u0007\u0005\u000fpih\u0001N\u0007͕o^R8-$nTf\u0015k~[h4!S,V\u0017}6\u001aN]\u000e;O+VˡP1pxru\nS:-ǄZ7r\u001c}Q^aB\u0018Ӷ\u0011*g\u0005;WJr\u0007hfpZ\u001c\\l(PA^i>}BΰOT\u001c@g\n\u001eJ+_ #İIKڄAO&!_\tӐ@\u000bZ32\u0003\u0002*\u0005\u000b\u0011P\u000br\u001eh)U2|n%EGa7)&\u0004$\u00175-/\r~\u0002\u0004_m\\I\\lDw\u0004|P* 9_4U!\u001f\u00019204UN\u0003e\u007fU(&)\u0003*)Ah<p ~\u0001.pjxVd\u001f2|nt3\b\u0013\u0007(b\\yui\u0005\u0011a>W|\u001bYjYh\u0003\u000b\u001f,1\u0019oP\neAI'+$\u0010\"?\u0017q]\u0018v>{r\u000fT\u0004{\u0003ZiFwhQkBS:_X-EhځkKSV\u0015\u0010\bp\u0016d\u0013AsYf\u0007UfLQʗ~/\u000e:9\tV\nIY͡||5mW\fC,\u001b%Ȑ$acaw\u0006oa[9QE\u000ea֒3ߎ\u0016\"EղnYh\u001b>\u0019D:DOSp\u0015>\u0019$b3L\n\u001bC\u0003x\u001c\u000f)\u0006|ceħ4¡wA^ՕlzbjV\u001a1_n!B\u0007\u000f\u0011C\u001e'7_\u0006$J+Зe҅\u0005Y%̿3lU\u0015t<{^b<3.h\u0003\u001bE\fEw\u0003l\b\u001eӫoÃs\u0012@\u008e\u0015\u001fH0)P\"%m\u0003H^9b\u001bR;ʂ\u0014؉VT*Ė\u0017|\u0003'J$_%'S\u000bur/\\N&9q\u001b7\u001b\u001b͐\tѼ\u0001iNɑE\b;HK`;<5\u0005ogK\u007f\u0018 N.\u0014|1bg\u0010v\n\f\"h\u0017\b\u0015\u0011\b?\u0017'܈\u0006̛Nzz˖F\n<k\u0010HR5l^\u0004\u00061B7+\u001b\rRMxx8k\u0003b\u001d[A\u0007=ۺXӖr3Xȿ!)SK!m+N\u001f]8X?\u000bJ\u0019|̇8ʭf/\u0018˖{jv\n]zç/]"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,[0;y?(\u001eva\u000f", "", "2x].`0<1#\b{b.\u000b", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,#", "4dPAh9>5\u0015\u000ezl", ":`h2e\nH\\\u001a\u0003|l", ">`a.`\u001aM]&~\t", "", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,8?Hg<\f$rn9\\", ":`h2e:", "Bh\\2", "", "6`b\"c+:b\u0019\r", "", "2hP4a6Lb\u001d|\t", "", "2dU.h3M3\"\u0010~k6\u0006\u0011/n\u000f", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChS\u0007<i'*\u0017SJo;g{loH\\J1J\b#\u0011\\]0c\u001cZ9\u001fgA\u0013J<\tNiP(u\u000e\u001f\u001b\u0013\u0002.v\"m|\u001d\u0012WEytI wC\u0005j\\F%yB#fuPC\u000fP9q\u0010h\u001f2}+", "5dc\u0011X-:c \u000eZg=\u0001\u00169n\b(\u0005O", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011\\(@\\#\r\nb*\u000b", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0011l5:[\u001d|Xh5}\r1s", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0013X(Mc&~\\Z;|\u0017", "5dc\u0015T:.^\u0018z\n^:", "u(I", "5dc\u0019T@>`v\t\u0004_0~\u0017", "5dc\u0019T@>`'", "5dc\u001dT9:[\u0007\u000e\u0005k,\u000b", "5dc!\\4>", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SpecsResponse {

    @SerializedName(alternate = {}, value = "\u000b\u000b\u000b\u0005\u0018\u000e\u0015~\u0004\f\u0013\u0005\r\t\u0007\u0005{\u0004\t")
    @InterfaceC1492Gx
    private final String defaultEnvironment;

    @SerializedName(alternate = {}, value = "\u000b\u000f\u0006\u000b\u0011\u0011\u0014\u0014\b\u0001\u0010")
    @InterfaceC1492Gx
    private final Map<String, Integer> diagnostics;

    @SerializedName(alternate = {}, value = "\u000b\u001f\u0013\u0005\u0010\u000b\u0004~\u0002\r\u000b\u0002\u0004\u0001\f")
    @InterfaceC1492Gx
    private final List<Spec> dynamicConfigs;

    @SerializedName(alternate = {}, value = "\r\u000b\u0006\u0018\u0018\u0014\u0006~\u0006~\u0011\u0001\u000e")
    @InterfaceC1492Gx
    private final List<Spec> featureGates;

    @SerializedName(alternate = {}, value = "\u000f\u0007\u0018\u0003\u0018\u0012\u0005\u0001\u0013\u0003\u0010")
    @InterfaceC1492Gx
    private final boolean hasUpdates;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u001e\t\u0015\u0001\u0004\u000f\r\u0004\u0006\u0003\u000e")
    @InterfaceC1492Gx
    private final List<Spec> layerConfigs;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u001e\t\u0015\u0015")
    @InterfaceC1492Gx
    private final Map<String, List<String>> layers;

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0017\u0005\u0010\u0001\u0014\u0014\u000e\u0010\u0002\u000f")
    @InterfaceC1492Gx
    private final Map<String, SpecParamStore> paramStores;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t")
    @InterfaceC1492Gx
    private final long time;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecsResponse(List<Spec> dynamicConfigs, List<Spec> featureGates, List<Spec> layerConfigs, Map<String, SpecParamStore> map, Map<String, ? extends List<String>> map2, long j2, boolean z2, Map<String, Integer> map3, String str) {
        Intrinsics.checkNotNullParameter(dynamicConfigs, "dynamicConfigs");
        Intrinsics.checkNotNullParameter(featureGates, "featureGates");
        Intrinsics.checkNotNullParameter(layerConfigs, "layerConfigs");
        this.dynamicConfigs = dynamicConfigs;
        this.featureGates = featureGates;
        this.layerConfigs = layerConfigs;
        this.paramStores = map;
        this.layers = map2;
        this.time = j2;
        this.hasUpdates = z2;
        this.diagnostics = map3;
        this.defaultEnvironment = str;
    }

    public /* synthetic */ SpecsResponse(List list, List list2, List list3, Map map, Map map2, long j2, boolean z2, Map map3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, map, map2, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? 0L : j2, z2, (i2 + 128) - (i2 | 128) != 0 ? null : map3, (-1) - (((-1) - i2) | ((-1) - 256)) == 0 ? str : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecsResponse copy$default(SpecsResponse specsResponse, List list, List list2, List list3, Map map, Map map2, long j2, boolean z2, Map map3, String str, int i2, Object obj) {
        if ((1 & i2) != 0) {
            list = specsResponse.dynamicConfigs;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            list2 = specsResponse.featureGates;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            list3 = specsResponse.layerConfigs;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            map = specsResponse.paramStores;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            map2 = specsResponse.layers;
        }
        if ((32 & i2) != 0) {
            j2 = specsResponse.time;
        }
        if ((i2 + 64) - (64 | i2) != 0) {
            z2 = specsResponse.hasUpdates;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            map3 = specsResponse.diagnostics;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            str = specsResponse.defaultEnvironment;
        }
        return specsResponse.copy(list, list2, list3, map, map2, j2, z2, map3, str);
    }

    public final List<Spec> component1() {
        return this.dynamicConfigs;
    }

    public final List<Spec> component2() {
        return this.featureGates;
    }

    public final List<Spec> component3() {
        return this.layerConfigs;
    }

    public final Map<String, SpecParamStore> component4() {
        return this.paramStores;
    }

    public final Map<String, List<String>> component5() {
        return this.layers;
    }

    public final long component6() {
        return this.time;
    }

    public final boolean component7() {
        return this.hasUpdates;
    }

    public final Map<String, Integer> component8() {
        return this.diagnostics;
    }

    public final String component9() {
        return this.defaultEnvironment;
    }

    public final SpecsResponse copy(List<Spec> dynamicConfigs, List<Spec> featureGates, List<Spec> layerConfigs, Map<String, SpecParamStore> map, Map<String, ? extends List<String>> map2, long j2, boolean z2, Map<String, Integer> map3, String str) {
        Intrinsics.checkNotNullParameter(dynamicConfigs, "dynamicConfigs");
        Intrinsics.checkNotNullParameter(featureGates, "featureGates");
        Intrinsics.checkNotNullParameter(layerConfigs, "layerConfigs");
        return new SpecsResponse(dynamicConfigs, featureGates, layerConfigs, map, map2, j2, z2, map3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecsResponse)) {
            return false;
        }
        SpecsResponse specsResponse = (SpecsResponse) obj;
        return Intrinsics.areEqual(this.dynamicConfigs, specsResponse.dynamicConfigs) && Intrinsics.areEqual(this.featureGates, specsResponse.featureGates) && Intrinsics.areEqual(this.layerConfigs, specsResponse.layerConfigs) && Intrinsics.areEqual(this.paramStores, specsResponse.paramStores) && Intrinsics.areEqual(this.layers, specsResponse.layers) && this.time == specsResponse.time && this.hasUpdates == specsResponse.hasUpdates && Intrinsics.areEqual(this.diagnostics, specsResponse.diagnostics) && Intrinsics.areEqual(this.defaultEnvironment, specsResponse.defaultEnvironment);
    }

    public final String getDefaultEnvironment() {
        return this.defaultEnvironment;
    }

    public final Map<String, Integer> getDiagnostics() {
        return this.diagnostics;
    }

    public final List<Spec> getDynamicConfigs() {
        return this.dynamicConfigs;
    }

    public final List<Spec> getFeatureGates() {
        return this.featureGates;
    }

    public final boolean getHasUpdates() {
        return this.hasUpdates;
    }

    public final List<Spec> getLayerConfigs() {
        return this.layerConfigs;
    }

    public final Map<String, List<String>> getLayers() {
        return this.layers;
    }

    public final Map<String, SpecParamStore> getParamStores() {
        return this.paramStores;
    }

    public final long getTime() {
        return this.time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public int hashCode() {
        int iHashCode = ((((this.dynamicConfigs.hashCode() * 31) + this.featureGates.hashCode()) * 31) + this.layerConfigs.hashCode()) * 31;
        Map<String, SpecParamStore> map = this.paramStores;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, List<String>> map2 = this.layers;
        int iHashCode3 = (((iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31) + Long.hashCode(this.time)) * 31;
        boolean z2 = this.hasUpdates;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode3 + r02) * 31;
        Map<String, Integer> map3 = this.diagnostics;
        int iHashCode4 = (i2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str = this.defaultEnvironment;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SpecsResponse(dynamicConfigs=" + this.dynamicConfigs + ", featureGates=" + this.featureGates + ", layerConfigs=" + this.layerConfigs + ", paramStores=" + this.paramStores + ", layers=" + this.layers + ", time=" + this.time + ", hasUpdates=" + this.hasUpdates + ", diagnostics=" + this.diagnostics + ", defaultEnvironment=" + ((Object) this.defaultEnvironment) + ')';
    }
}
