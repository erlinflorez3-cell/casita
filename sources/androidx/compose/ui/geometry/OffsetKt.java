package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,r\bDZc|\u0004G\u00108\u000b<G\u0007\"2\u001a\u007f\u0007|jA0Jf`I`^B\u000f\u001a{d(i0\nCibJ\u00020\u0017gN\u0016t5OҼ\u000fC\u001d\u0015.!x<aU']B\u0013@S\b?aM AGr\r63 b&F\r\u001d\u0001H7\u000f\u0015υyŏƚ\u0010\u00146T~Oj0[\u001b2\u00124>H\u0001L\\\u0018XD_\u0005cJ13\u0003\u0018B|?&ܥ\u0003ת\fϿù+\u000f|z,E`SCՖ=S1\u0006z[m\u0003u6\u0014ݣjҊ+5Yu]7f\u0002,\u00171R\u001ba\u0013Bj\ni`:&SO\u0012K\u0007R~Ã|ԫ\u0011F\u0014\u0010\f-V0E\u001cl\u000f\u001c7\u0015\u000faHh\u0002\rA(z\u00106MiVę-ݰ\u001fpacA\"\\9\u0014\u0007\u0013(1\u0005͜!`\\\u0011fڟ7\u0003vά5l"}, d2 = {"7r56a0MS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7r56a0MS`\u0005B-3hS\u0017${1\u0005J\u0010\u0013&Ky\u0017J", "uI\u0018#", "7r56a0MS`\u0005B-3hS\u0017", "uI\u0018'", "7rB=X*BT\u001d~y", "7rB=X*BT\u001d~y&2DW6QJ\u0010:<\n !Vk\u001d@\u0001.C", "7rB=X*BT\u001d~y&2DW6QJ\u0010", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+D\u000fv4\u0007\u0014F(?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+D\u000fv4\u0007\u0014F(", "\u001deU@X;", "F", "", "G", "uE5u=", ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= \u001eD]d}L`", "uI9\u0013\u001c\u0011", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~B,\u0014\u0005\t\u00176\u0006", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OffsetKt {
    /* JADX INFO: renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m3954isFinitek4lQ0M(long j2) {
        long j3 = ((-1) - (((-1) - j2) | ((-1) - InlineClassHelperKt.DualFloatInfinityBase))) ^ InlineClassHelperKt.DualFloatInfinityBase;
        return (((~j3) & (j3 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0;
    }

    /* JADX INFO: renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3955isFinitek4lQ0M$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m3956isSpecifiedk4lQ0M(long j2) {
        return (-1) - (((-1) - j2) | ((-1) - InlineClassHelperKt.DualUnsignedFloatMask)) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3957isSpecifiedk4lQ0M$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m3958isUnspecifiedk4lQ0M(long j2) {
        return (-1) - (((-1) - j2) | ((-1) - InlineClassHelperKt.DualUnsignedFloatMask)) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3959isUnspecifiedk4lQ0M$annotations(long j2) {
    }

    /* JADX INFO: renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m3961takeOrElse3MmeM6k(long j2, Function0<Offset> function0) {
        return m3956isSpecifiedk4lQ0M(j2) ? j2 : function0.invoke().m3947unboximpl();
    }

    public static final long Offset(float f2, float f3) {
        return Offset.m3929constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(f3)) & 4294967295L)) & ((-1) - (((long) Float.floatToRawIntBits(f2)) << 32))));
    }

    /* JADX INFO: renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m3960lerpWko1d7g(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return Offset.m3929constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(fLerp)) << 32)) & ((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(fLerp2))) | ((-1) - 4294967295L))))));
    }
}
