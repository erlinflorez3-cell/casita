package androidx.collection;

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
/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4D\u0007\":\u0019\u007f\u0007lsA0RnP.XU2\u000fy\u0002<$a%yCIa\"}(\nUȦ&}ñzZ9BO\u001d\u001c\rz0WU\u0011]@\u0010BF}AKM\u001e>˃dv<\b.6bG\u007fڎ\u0011\u001e8M(v)Iƚ\u0010\u00146C~A\u001b\u001b[\u00122\u00124?fҼ&֔kP<Vzf\u0003=1\u0012\u0002B|(&ܥ\u0005֔\u0011HZ7\u001b\u007f*69QO5C7\u0004\t\u0015esA\u0019> <K٩(ݳ/KykDmH\"#Ag\r\f\nlٯ\u0004Ōd\u000e-C]|\u0014]\u001cB\u0010z*(\u0003\u0018؝\n)NJ;77\u0018\u001c3\rr\u0002A\u0007٣^۰\u0004~y8\u001d-\u000e<{M)kiai\u001f\u0005љR˞\u000f̷'\u0007vďkV\u0014j#&%\b_3i@kI\u0005̪Yǀq\b\td\b6\u00129ϣ~4ɘ\u0010.E+ۄ_W"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~nC\u0001!DDy$DC", "", "4ha@g", "", "AdR<a+", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE5u=", ">`R8X+/O \u000fz", "", "uI\u0018\u0017", "5dc\u0013\\9Lb`\u0003\u0003i3", "uI\u0018\u0013", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc X*H\\\u0018F~f7\u0004", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class FloatFloatPair {
    public final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m346boximpl(long j2) {
        return new FloatFloatPair(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m350constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m351equalsimpl(long j2, Object obj) {
        return (obj instanceof FloatFloatPair) && j2 == ((FloatFloatPair) obj).m357unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m352equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m355hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m351equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m355hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m357unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ FloatFloatPair(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m356toStringimpl(long j2) {
        return "(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public String toString() {
        return m356toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m349constructorimpl(float f2, float f3) {
        return m350constructorimpl((-1) - (((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) | ((-1) - 4294967295L)))) & ((-1) - (((long) Float.floatToRawIntBits(f2)) << 32))));
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m353getFirstimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m354getSecondimpl(long j2) {
        return Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m347component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m348component2impl(long j2) {
        return Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
    }
}
