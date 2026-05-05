package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: LazyGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0018\u007f\u0007lkA0RnP.XW2\u000fy\b<$a%wٙykڼ.\"7N\u000fvmñZ^\u0019C'\u0006Dy̶0K[zk\u0015WJPwW3{xm?n~N\u000761P7@ۥ\u0002ʀ.J\u0016\u0002\tO\u0014\u001a =XphWS̶\u0004ܨ\u0016\bD.\u000f%%u\\E`l\fJuޡ\u0002ݦFP-p>\u000f\u001e\u001cTX?\r%fToË;9-'Y\t\u0015Y,K\u0011?\n=3i}ݓ-ʁwW>ݙå\u0013\u0015ۓN\r\fs͏`\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "1ta?X5M:\u001d\bzL7x\u0012", "", "5dc\u0010h9KS\"\u000eab5|v:a\to\u007fH\f\u001e", "uI\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class GridItemSpan {
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m1137boximpl(long j2) {
        return new GridItemSpan(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1138constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1139equalsimpl(long j2, Object obj) {
        return (obj instanceof GridItemSpan) && j2 == ((GridItemSpan) obj).m1144unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1140equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m1141getCurrentLineSpanimpl(long j2) {
        return (int) j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1142hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1143toStringimpl(long j2) {
        return "GridItemSpan(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m1139equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1142hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1143toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1144unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ GridItemSpan(long j2) {
        this.packedValue = j2;
    }
}
