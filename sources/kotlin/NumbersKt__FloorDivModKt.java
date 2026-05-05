package kotlin;

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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,o\bDRf|İI\u0006>\u00126B\r*4ߚ\u007f\u0007tnA0RjP\u008cjf8ş\u0004{b#\u0004$ CkY(~:\t}N.˯tbm\u0019¼'\u0006Dw\u0013,wU)a \u0010JB\u001e>yށuULnҚN\u0005N4J8(\u00051\u001e8I(v)E\u0012Ð\u0018HS~íj\r{\u0004B\u00124>P\u0005,]\u007fNdK3ҟ@G6\u0011݃ZNU^X|{\fvX5\u000e\u000faL+\u0007˂;-8aΈ\u001fR\n>+? <5l5(CI\"V|ݡ\u0006,(9˽%]!(\u0005\u0005\u007f_<+9P{K~\u0010nÃ\u0001\u0014 Jǉ&\u0006UGV-He8\u0012Au\u000bSnSHޑH\u0018\u000eoا/%.5S9Ih\u0002eI\u001af7*\u0005S̜)\u0019\u0002/żl\u000e\u000f\u0017CT&SaUN>`N8X\u0004Я\n\tu\u0010Ï\u001c0u\u0002W{?0G)E\\Q#OmHҎJ\u007f\n\u0013\u009b\u0001S\u0018Tp@PpF;8\n$ZrgKߠVlk:Ҋe\u001c\u0003\u0006&\bA#\r{J\"=\u0010|O/ȑpep\u0018ɘGfeX\u0017k<ZibA6ic>`\u0019Π\u001aWOpڳpfpU4Z\u000b+R6Vk(w*F\u0015܄\u0019JR\u007fʉL,_\u0018\u0005\u0015v\u0006NFO}!_\tkVпZK7\u0011m<t7\u0001x\\\u001fo\u0018|W-\u0015`P-\b٣;19c&\u00014+\"/~\"\u007fwkZHdlDt\u001cݰ&.-GUG=A\u0011')`\u0002]IZs}Q{\u0014mϝ\u0003\u0012\"IlFg6m\u0019,\u000fjzSb\u0018:v\ruiΰj\u0018\roJ\u0013G\u0012Y3[lN#\u0007g=f8+\neǏ+\u0019\u00030\u0001M-q,E\u0016&\u0019_\u0019o^\u0002o\\\u007f)Ϗ,\rx\u00120{\u0016\u001egy]`AhMg\u007fV\"RqIܱN\u0003\u000b\u0016F!4;9pA\u0013v\u0007<[\fG}\u0015\rrހvnnH\u0017\b}b.\b*\"B.\u0018lD=\u0011{S.Ƣsco\u0019N'\n9zYn@\u001bm$dXz\t^\u0005:̀<YNp\tT\tR6T<6\nsXw\u0007(z.H&ʝ\u001dJU\u0002?n\u000e\u0003{\u0005Vv\u0004\u0011In\"B\u0001-\u0012yͰ~MD\u0013q^T]cZ\u0001\u0002\u001f9\u001fxP\u0017fS+\u000bǼ?3;f\u0005#E\fBq\u0002d\u0006w-{l\b\ff\u0017CܐH0.GU)_%2\u0007\u000b\u0004f~h\u0005\u0013~R|$oͮ\u0001\u0015!J\u000e'\u000bGR\u001bo\u0011/|R\u00068[\u001a/\u001a\u000b͐\r$\u0010qJ3-45U=wmD+\nXk;,\bfñ-\u001c\b/`o\u000e\u0015\t\u0006\u001bh\u0019\"\u001ap\u0003!\u0013~\u001fJ̀P\r\u0006\u00182 6}\u0004[\u0002Aa\no\u0006\"X'YnLפQ\u0001\f\u0018g\u0005c\u001dX3\u0003\u00154\u0007}|.h\u001d7*\u0014ܠ\u0019ͦ^A"}, d2 = {"4k^<e\u000bBd", "", "", "=sW2e", "", "", ";nS", "", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u001a@7+-99\u00108")
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    private static final int floorDiv(byte b2, byte b3) {
        int i2 = b2 / b3;
        return ((b2 ^ b3) >= 0 || b3 * i2 == b2) ? i2 : i2 - 1;
    }

    private static final int floorDiv(byte b2, int i2) {
        int i3 = b2 / i2;
        return ((b2 ^ i2) >= 0 || i2 * i3 == b2) ? i3 : i3 - 1;
    }

    private static final int floorDiv(byte b2, short s2) {
        int i2 = b2 / s2;
        return ((b2 ^ s2) >= 0 || s2 * i2 == b2) ? i2 : i2 - 1;
    }

    private static final int floorDiv(int i2, byte b2) {
        int i3 = i2 / b2;
        return ((i2 ^ b2) >= 0 || b2 * i3 == i2) ? i3 : i3 - 1;
    }

    private static final int floorDiv(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i4 == i2) ? i4 : i4 - 1;
    }

    private static final int floorDiv(int i2, short s2) {
        int i3 = i2 / s2;
        return ((i2 ^ s2) >= 0 || s2 * i3 == i2) ? i3 : i3 - 1;
    }

    private static final int floorDiv(short s2, byte b2) {
        int i2 = s2 / b2;
        return ((s2 ^ b2) >= 0 || b2 * i2 == s2) ? i2 : i2 - 1;
    }

    private static final int floorDiv(short s2, int i2) {
        int i3 = s2 / i2;
        return ((s2 ^ i2) >= 0 || i2 * i3 == s2) ? i3 : i3 - 1;
    }

    private static final int floorDiv(short s2, short s3) {
        int i2 = s2 / s3;
        return ((s2 ^ s3) >= 0 || s3 * i2 == s2) ? i2 : i2 - 1;
    }

    private static final long floorDiv(byte b2, long j2) {
        long j3 = b2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    private static final long floorDiv(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    private static final long floorDiv(long j2, byte b2) {
        long j3 = b2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    private static final long floorDiv(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    private static final long floorDiv(long j2, long j3) {
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    private static final long floorDiv(long j2, short s2) {
        long j3 = s2;
        long j4 = j2 / j3;
        return ((j2 ^ j3) >= 0 || j3 * j4 == j2) ? j4 : j4 - 1;
    }

    private static final long floorDiv(short s2, long j2) {
        long j3 = s2;
        long j4 = j3 / j2;
        return ((j3 ^ j2) >= 0 || j2 * j4 == j3) ? j4 : j4 - 1;
    }

    private static final byte mod(byte b2, byte b3) {
        int i2 = b2 % b3;
        int i3 = ((i2 ^ b3) & ((-i2) | i2)) >> 31;
        return (byte) (i2 + ((b3 + i3) - (b3 | i3)));
    }

    private static final byte mod(int i2, byte b2) {
        int i3 = i2 % b2;
        return (byte) (i3 + ((-1) - (((-1) - b2) | ((-1) - (((-1) - (((-1) - (i3 ^ b2)) | ((-1) - ((-i3) | i3)))) >> 31)))));
    }

    private static final byte mod(long j2, byte b2) {
        long j3 = b2;
        long j4 = j2 % j3;
        long j5 = ((-1) - (((-1) - (j4 ^ j3)) | ((-1) - ((-1) - (((-1) - (-j4)) & ((-1) - j4)))))) >> 63;
        return (byte) (j4 + ((j3 + j5) - (j3 | j5)));
    }

    private static final byte mod(short s2, byte b2) {
        int i2 = s2 % b2;
        int i3 = i2 ^ b2;
        int i4 = (-1) - (((-1) - (-i2)) & ((-1) - i2));
        return (byte) (i2 + ((-1) - (((-1) - b2) | ((-1) - (((i3 + i4) - (i3 | i4)) >> 31)))));
    }

    private static final double mod(double d2, double d3) {
        double d4 = d2 % d3;
        return (d4 == 0.0d || Math.signum(d4) == Math.signum(d3)) ? d4 : d4 + d3;
    }

    private static final double mod(double d2, float f2) {
        double d3 = f2;
        double d4 = d2 % d3;
        return (d4 == 0.0d || Math.signum(d4) == Math.signum(d3)) ? d4 : d4 + d3;
    }

    private static final double mod(float f2, double d2) {
        double d3 = ((double) f2) % d2;
        return (d3 == 0.0d || Math.signum(d3) == Math.signum(d2)) ? d3 : d3 + d2;
    }

    private static final float mod(float f2, float f3) {
        float f4 = f2 % f3;
        return (f4 == 0.0f || Math.signum(f4) == Math.signum(f3)) ? f4 : f4 + f3;
    }

    private static final int mod(byte b2, int i2) {
        int i3 = b2 % i2;
        int i4 = -i3;
        return i3 + (i2 & (((-1) - (((-1) - (i3 ^ i2)) | ((-1) - ((i4 + i3) - (i4 & i3))))) >> 31));
    }

    private static final int mod(int i2, int i3) {
        int i4 = i2 % i3;
        int i5 = i4 ^ i3;
        int i6 = -i4;
        int i7 = (i6 + i4) - (i6 & i4);
        return i4 + ((-1) - (((-1) - i3) | ((-1) - (((i5 + i7) - (i5 | i7)) >> 31))));
    }

    private static final int mod(long j2, int i2) {
        long j3 = i2;
        long j4 = j2 % j3;
        long j5 = ((j4 ^ j3) & ((-1) - (((-1) - (-j4)) & ((-1) - j4)))) >> 63;
        return (int) (j4 + ((j3 + j5) - (j3 | j5)));
    }

    private static final int mod(short s2, int i2) {
        int i3 = s2 % i2;
        int i4 = -i3;
        int i5 = ((-1) - (((-1) - (i3 ^ i2)) | ((-1) - ((i4 + i3) - (i4 & i3))))) >> 31;
        return i3 + ((i2 + i5) - (i2 | i5));
    }

    private static final long mod(byte b2, long j2) {
        long j3 = ((long) b2) % j2;
        long j4 = j3 ^ j2;
        long j5 = -j3;
        long j6 = (j5 + j3) - (j5 & j3);
        return j3 + ((-1) - (((-1) - j2) | ((-1) - (((j4 + j6) - (j4 | j6)) >> 63))));
    }

    private static final long mod(int i2, long j2) {
        long j3 = ((long) i2) % j2;
        return j3 + ((-1) - (((-1) - j2) | ((-1) - (((j3 ^ j2) & ((-1) - (((-1) - (-j3)) & ((-1) - j3)))) >> 63))));
    }

    private static final long mod(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 + ((-1) - (((-1) - j3) | ((-1) - (((-1) - (((-1) - (j4 ^ j3)) | ((-1) - ((-1) - (((-1) - (-j4)) & ((-1) - j4)))))) >> 63))));
    }

    private static final long mod(short s2, long j2) {
        long j3 = ((long) s2) % j2;
        return j3 + ((-1) - (((-1) - j2) | ((-1) - (((j3 ^ j2) & ((-j3) | j3)) >> 63))));
    }

    private static final short mod(byte b2, short s2) {
        int i2 = b2 % s2;
        int i3 = i2 ^ s2;
        int i4 = (-1) - (((-1) - (-i2)) & ((-1) - i2));
        int i5 = ((i3 + i4) - (i3 | i4)) >> 31;
        return (short) (i2 + ((s2 + i5) - (s2 | i5)));
    }

    private static final short mod(int i2, short s2) {
        int i3 = i2 % s2;
        int i4 = i3 ^ s2;
        int i5 = (-i3) | i3;
        return (short) (i3 + ((-1) - (((-1) - s2) | ((-1) - (((i4 + i5) - (i4 | i5)) >> 31)))));
    }

    private static final short mod(long j2, short s2) {
        long j3 = s2;
        long j4 = j2 % j3;
        long j5 = ((j4 ^ j3) & ((-j4) | j4)) >> 63;
        return (short) (j4 + ((j3 + j5) - (j3 | j5)));
    }

    private static final short mod(short s2, short s3) {
        int i2 = s2 % s3;
        int i3 = ((i2 ^ s3) & ((-i2) | i2)) >> 31;
        return (short) (i2 + ((s3 + i3) - (s3 | i3)));
    }
}
