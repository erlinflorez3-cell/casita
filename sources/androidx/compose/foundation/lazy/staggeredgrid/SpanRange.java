package androidx.compose.foundation.lazy.staggeredgrid;

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
/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u0019\u007f\u0007lsA0RnP.XW2\u000fy\b<$a%wٓykڼ.\"7N\u000f~m\u0003Z^\u0019C'\u0006Dyz0WW\u0011]@\u0010̓FqE6[s}HftF\t.7:8(\u000bв\u001e,N\u0013\u0005\u0002\fc\u001a#H@\u001fL\u0003\u0013[\u00182\u0014\u001c=N\u007fd\u05c8hߑ:JrqHDk\u0011wXf'\u000e1C\u05c8\fТX)\u0013\u000eo(sNEM-%\u0002\u001cMӏZύ\u0007AwW\u0013\u0004w79Q\fWdY6г\u0015ۣS\u0011ut,e\u0013[1\u001b50gcyVˎ,}\u0003Ԉ%>\n\u0019\u00143\u0019>;'~\b<4+ʈSĖT\u0006vD\u0006\to@g5\u000eBC9Ig\bŬ;ϭR;\u0014\u0007\u0013.1\u000b͢ `ړ\u0012|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tn(Wc#PNN\u0002", "", ":`]2", "", "AoP;", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH8u=", ">`R8X+/O \u000fz", "", "uI\u0018\u0017", "3mS", "5dc\u0012a+\u0006W!\n\u0002", "uI\u0018\u0016", "5dc\u001dT*DS\u0018ove<|", "u(9", "Ahi2", "5dc \\A>\u001b\u001d\u0007\u0006e", "AsP?g", "5dc g(Kb`\u0003\u0003i3", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class SpanRange {
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m1238boximpl(long j2) {
        return new SpanRange(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m1240constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1241equalsimpl(long j2, Object obj) {
        return (obj instanceof SpanRange) && j2 == ((SpanRange) obj).m1248unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1242equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m1243getEndimpl(long j2) {
        return (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m1244getSizeimpl(long j2) {
        return ((int) ((4294967295L + j2) - (4294967295L | j2))) - ((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m1245getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1246hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1247toStringimpl(long j2) {
        return "SpanRange(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m1241equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1246hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1247toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1248unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ SpanRange(long j2) {
        this.packedValue = j2;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1239constructorimpl(int i2, int i3) {
        long j2 = ((long) i2) << 32;
        long j3 = ((long) (i3 + i2)) & 4294967295L;
        return m1240constructorimpl((j3 + j2) - (j3 & j2));
    }
}
