package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0017\u007f\u0007l\u0003A0RnP.XU2\u000fy\u0002<$a*yCIa\"}(\u000bUȦ&}ñh\f;C=\u0005Nw\u001clX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@6Py3\u0006`ݚPǘz|I`\u001a\u001bxN~Pj\r{\n`ŏ\u000ȩ$\u0003$suW~mzuR/QɅ\u001aHT'mA\u0015M;K\u0005-\u0013vo\"C@e:\u05cf$مЁ\u0006QÜC\u0005E\u000bK\u001f1C5Fas\u0006̬\t\u0004\"1CO;b9̮\\՝PӠѨ&*յgMV+6\u0016C\u0014\u001b[\u001c\u000e4Gx4;;~\n$2#q\u001aŊQؿbD\u0006\u001doY_3\u000eWC9I\f\u0018ż:ϭR9\u0002+\u001bEk\u000e|IsT<\u0001[ ƻ{S7zNg\u0011j\u0018\u0005Um2͏\u0013\u00068 HG.4B\u0085.ш$ڛڼ8\"\u074co\u0004Npu\u0015Mmv\u0001\u0002Rvnh\u0003ގ;,\u000f;ht5\u001dyTlXZ\u0016\u0004`+ͽ\u007fݔ\u0017*lyB'3\u0017fQnqxV.\"39~7\bs\"R.\u07b2`ۋ9[s\u0012g]\u0005\u001bW>h\u0011fo\u0013k\u001agt(P7~/fǶ}ΌR\u0016#4E\u007f*;D3\u001fk#QS2PA\u0015\t\u000e[\u001fɭUԠ5ʗ\u0007o,ڏ\u0019\u0003Vl~v8\u0011W=\u0015`P2w\u0016\fӯ(Ɓ&rD~)\u0019\rz\u0018Im_UU̇\u0015uɰz D\u001bߜQ8E\u0013\u0015\u001e15\bαazqϵU\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "6dX4[;", "", "5dc\u0015X0@V(=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u0015X0@V(F~f7\u0004", "uI\u0018\u0013", ";`g\u0011\\4>\\'\u0003\u0005g", "5dc\u001aT?\u001dW!~\u0004l0\u0007\u0012ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001aT?\u001dW!~\u0004l0\u0007\u0012vi\b3\u0003", ";h]\u0011\\4>\\'\u0003\u0005g", "5dc\u001a\\5\u001dW!~\u0004l0\u0007\u0012ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001a\\5\u001dW!~\u0004l0\u0007\u0012vi\b3\u0003", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "EhSA[", "5dc$\\+MVWz\u0004g6\f\u0005>i\n1\n", "5dc$\\+MV`\u0003\u0003i3", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F ?CP*\u0005I:", "uI5\u0013\u001c\u0011", "2he", "=oT?T5=", "2hey*\bA&\u000b\u0004M", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "7r4:c;R", "7r4:c;R\u001b\u001d\u0007\u0006e", "uI\u0018'", "Bh\\2f", "Bh\\2fs\u0010/\u001cQlc~", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3997constructorimpl(0);
    private static final long Unspecified = m3997constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m3994boximpl(long j2) {
        return new Size(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3997constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4001equalsimpl(long j2, Object obj) {
        return (obj instanceof Size) && j2 == ((Size) obj).m4011unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4002equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4007hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m4001equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4007hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4011unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Size(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final float m4006getWidthimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final float m4003getHeightimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m3995component1impl(long j2) {
        return m4006getWidthimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m3996component2impl(long j2) {
        return m4003getHeightimpl(j2);
    }

    /* JADX INFO: compiled from: Size.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Ҹ\u001eeoQ<Ձ\t\f97#\t\tŒR1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 uK 6X?Do>'j", "", "u(E", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\"a:IS\u0017\u0003{b,{P\u0018HG-x-~U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\u0018HG-x-~", "u(9", "\u0018", "(da<", "5dc'X9H\u001b\u0002aBc)i\u0007ma\t1\u0006O|&\u001bQx\u001c", "5dc'X9H\u001b\u0002aBc)i\u0007", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4012getUnspecifiedNHjbRc$annotations() {
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4013getZeroNHjbRc$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m4015getZeroNHjbRc() {
            return Size.Zero;
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m4014getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m4008isEmptyimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        long j3 = (-1) - (((-1) - j2) | ((-1) - (~(((((-9223372034707292160L) + j2) - ((-9223372034707292160L) | j2)) >>> 31) * ((long) (-1))))));
        long j4 = j3 >>> 32;
        long j5 = (j3 + 4294967295L) - (j3 | 4294967295L);
        return (j5 + j4) - (j5 | j4) == 0;
    }

    /* JADX INFO: renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m4009times7Ah8Wj8(long j2, float f2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) * f2;
        return m3997constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)) & ((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | ((-1) - 4294967295L))))));
    }

    /* JADX INFO: renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m4000div7Ah8Wj8(long j2, float f2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) / f2;
        return m3997constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | ((-1) - (((-1) - ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m4005getMinDimensionimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 2147483647L)))), Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 2147483647L)))));
    }

    /* JADX INFO: renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m4004getMaxDimensionimpl(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return Math.max(Float.intBitsToFloat((int) ((j2 >> 32) & 2147483647L)), Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 2147483647L)))));
    }

    public String toString() {
        return m4010toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4010toStringimpl(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? "Size(" + GeometryUtilsKt.toStringAsFixed(m4006getWidthimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m4003getHeightimpl(j2), 1) + ')' : "Size.Unspecified";
    }

    /* JADX INFO: renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m3998copyxjbvk4A(long j2, float f2, float f3) {
        return m3997constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(f2)) << 32)) & ((-1) - (((long) Float.floatToRawIntBits(f3)) & 4294967295L))));
    }

    /* JADX INFO: renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m3999copyxjbvk4A$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Float.intBitsToFloat((int) ((-1) - (((-1) - 4294967295L) | ((-1) - j2))));
        }
        return m3998copyxjbvk4A(j2, f2, f3);
    }
}
