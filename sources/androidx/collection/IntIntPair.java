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
/* JADX INFO: compiled from: IntIntPair.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4D\u0007\":\u0019\u007f\u0007lsA0RnP.XW2\u000fy\b<$a%wٙykڼ.\"7N\u000f~m\u0003Z^\u0019C'\u0006Dyz0WW\u0011]@\u0010̓FqE6[s}HfҚF\t.7:8(\u000bв\u001e,N\u0013\u0005\u0002\fY\u001a\u001fH@\u001f;\u0019ҏUŋ\u001e\u0014\fL.\nfju]NH\u001b^\u0001ǉ+ɨmDT7m9Ee\u001bWl';\t\u0012$9SO7+$\u0002\u0002Mӏ\\ύ\u0007AwQ\u0013}o59_\fWdYFу\u0014ۣS\u000fc\n4eM^n$?+}|\u0012dˎ,y\u0001\u0016\u001bWT\u001d\u0014'`.[\u001b\u001dLԧ7x\u000bUFX\u0010g\u0013\u0014\tfN\u0017S\u0006iٿ\u0010ӗhЂeA!\u05cbG}\u000b\u0017,.Q}/]l\u000e\u000f\u0016Q\u0019ɐU5iBCT\\\u0013Ը<rաob00˟4c"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d'r)B/", "", "4ha@g", "", "AdR<a+", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH8u=", ">`R8X+/O \u000fz", "", "uI\u0018\u0017", "5dc\u0013\\9Lb`\u0003\u0003i3", "uI\u0018\u0016", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "5dc X*H\\\u0018F~f7\u0004", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class IntIntPair {
    public final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m358boximpl(long j2) {
        return new IntIntPair(j2);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m359component1impl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m360component2impl(long j2) {
        return (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m362constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m363equalsimpl(long j2, Object obj) {
        return (obj instanceof IntIntPair) && j2 == ((IntIntPair) obj).m369unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m364equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m365getFirstimpl(long j2) {
        return (int) (j2 >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m366getSecondimpl(long j2) {
        return (int) ((j2 + 4294967295L) - (j2 | 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m367hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m363equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m367hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m369unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntIntPair(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m361constructorimpl(int i2, int i3) {
        return m362constructorimpl((-1) - (((-1) - ((-1) - (((-1) - ((long) i3)) | ((-1) - 4294967295L)))) & ((-1) - (((long) i2) << 32))));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m368toStringimpl(long j2) {
        return "(" + m365getFirstimpl(j2) + ", " + m366getSecondimpl(j2) + ')';
    }

    public String toString() {
        return m368toStringimpl(this.packedValue);
    }
}
