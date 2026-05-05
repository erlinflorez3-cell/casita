package androidx.compose.ui.util;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,p\bӵLc\u0003\tI\u00066\u000b6B\r(4\u0012}\r~\u0002Gӄ\\ev-\u0003W8\u000f\u0004{b%\f(\u007fESUH~hޢUf~uqbZ9B?\n$x\u0003,wY)a \u0011JB\u001eCyހuUHnyN\u0005N3R<\b\u000b\u0019\u001aXGV͓\u0001[Z\u001a\u0019H@\u001f;\u0003\u0011[\u000b2\u00124=fҼ$tv\\>`l\f;_'\u0011oZNU^vŮS%Ub0%v\u0010\u001f[DE;-%\u0002\u0002MѿaW\u0012M{U\u0005\u0017+W/Wyo6\u0007~ZƊ1g\u001ck}>\\3U\u0011\u001051gcyOTߑ}ߧ\u007f\u0019"}, d2 = {">`R893HO(\r", "", "D`[}", "", "D`[~", ">`R8<5Ma", "", "Cm_.V2\u001aP'_\u0002h(\fT", "D`[BX", "Cm_.V2\u001aP'_\u0002h(\fU", "Cm_.V2\u001fZ#z\n*", "Cm_.V2\u001fZ#z\n+", "Cm_.V2\"\\(J", "Cm_.V2\"\\(K", "Ch\u001cBg0EM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InlineClassHelperKt {
    public static final long packInts(int i2, int i3) {
        return (-1) - (((-1) - ((-1) - (((-1) - ((long) i3)) | ((-1) - 4294967295L)))) & ((-1) - (((long) i2) << 32)));
    }

    public static final int unpackInt1(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int unpackInt2(long j2) {
        return (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
    }

    public static final long packFloats(float f2, float f3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        long j2 = jFloatToRawIntBits << 32;
        long j3 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return (j3 + j2) - (j3 & j2);
    }

    public static final float unpackFloat1(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float unpackAbsFloat1(long j2) {
        return Float.intBitsToFloat((int) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 2147483647L))));
    }

    public static final float unpackFloat2(long j2) {
        return Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
    }

    public static final float unpackAbsFloat2(long j2) {
        return Float.intBitsToFloat((int) ((j2 + 2147483647L) - (j2 | 2147483647L)));
    }
}
