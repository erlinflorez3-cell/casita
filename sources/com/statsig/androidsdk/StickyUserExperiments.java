package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O)8\u000b<N\u0007\"B\u0012\u007f\u0007lnA0RnP.XS2\u000fy\u0002<$a$wٔAkڼ.\"7N\u000f~w~XZ#O\u001f\b&x\u0019.YW\t]@\u0012`CņC3[s\u0006Ln{N\u00110428(\u0007\u0011\u001c:H>y)D\u0012ď\u0013x]~Bj\r{ĨJ$\f>.\u00016hwPFH\u001b_J13\u0003\u0018E|(&ݥ{\u0016\u001eT]?\r%kN1NBM\u0017;R1\u0006\u0019Đ@KF\u007fI\u001dhU4qʵr =f\u000e,\u0015YQSǵqv|\u0013Qx\u00187-_cyR\u001e*\bz*\u0010j\u0005D\n}Φ0ǉ\u001el\u0010ԄKvxXNVمbQ"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0012:|9%g}-\u0017\u0001!.ZGCk=-#>", "", "3w_2e0FS\"\u000e\t", "", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "5dc\u0012k7>`\u001d\u0007zg;\u000b", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
final class StickyUserExperiments {

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b\u0015")
    @InterfaceC1492Gx
    private final Map<String, APIDynamicConfig> experiments;

    public StickyUserExperiments(Map<String, APIDynamicConfig> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.experiments = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickyUserExperiments copy$default(StickyUserExperiments stickyUserExperiments, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            map = stickyUserExperiments.experiments;
        }
        return stickyUserExperiments.copy(map);
    }

    public final Map<String, APIDynamicConfig> component1() {
        return this.experiments;
    }

    public final StickyUserExperiments copy(Map<String, APIDynamicConfig> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return new StickyUserExperiments(experiments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickyUserExperiments) && Intrinsics.areEqual(this.experiments, ((StickyUserExperiments) obj).experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public int hashCode() {
        return this.experiments.hashCode();
    }

    public String toString() {
        return "StickyUserExperiments(experiments=" + this.experiments + ')';
    }
}
