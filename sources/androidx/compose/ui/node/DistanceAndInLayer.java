package androidx.compose.ui.node;

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
/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0017\u007f\u0007lkA0RnP.XV2\u000fy\u0002<$a,yCIa\"}(\nUȢ&}ñzZ9BO\u0013&|x,aU'^ܫ\u00134HqM6\u0016\tKGxtd\u0014P60H\u0012\u0005/ɝpЁ\u0010υyŏƚ\u0010\u00146Q~L\u001b%[\u00182\u00124GP\u0007,l\u007fPLG\u001b\\\u0001ș$ɨmDT;mEE[\u001b\\l';\u0006(Գ*Ë;7\u001b<a\u001bO`iX\u001b? WK٩&ݳ/KyrDtP##/g\r\fw\\!ԇUd$)1UqR!\u001d6\u007f\u0013{;E:RΝ+LF/ p\u0016\u0019\u0004\u0004\u0001SXP0_۰\u0004\u0001iا/'\u0006?9FӞeQĨ;\u001eV:\u0002˾)L\"ѐr>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l@\u000541b{ \u0013v\u0015\u0012V*7\u007f4+j", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "2hbAT5<S", "", "5dc\u0011\\:MO\"|z&0\u0005\u00146", "uI\u0018\u0013", "7r8;?(RS&", "", "7r8;?(RS&F~f7\u0004", "uI\u0018'", "5dc\u001dT*DS\u0018ove<|", "u(9", "1n\\=T9>B#", "", "=sW2e", "1n\\=T9>B#FhX\u000fe\f\u0015s", "uI9u<", "3pd._:", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
final class DistanceAndInLayer {
    private final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m5647boximpl(long j2) {
        return new DistanceAndInLayer(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5649constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5650equalsimpl(long j2, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j2 == ((DistanceAndInLayer) obj).m5656unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5651equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5653hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m5654isInLayerimpl(long j2) {
        return ((int) (j2 & 4294967295L)) != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5655toStringimpl(long j2) {
        return "DistanceAndInLayer(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m5650equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5653hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5655toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5656unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ DistanceAndInLayer(long j2) {
        this.packedValue = j2;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m5648compareToS_HNhKs(long j2, long j3) {
        boolean zM5654isInLayerimpl = m5654isInLayerimpl(j2);
        if (zM5654isInLayerimpl != m5654isInLayerimpl(j3)) {
            return zM5654isInLayerimpl ? -1 : 1;
        }
        return (int) Math.signum(m5652getDistanceimpl(j2) - m5652getDistanceimpl(j3));
    }

    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m5652getDistanceimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }
}
