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
/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0017\u007f\u0007l{A0RnP.XY2\u000fy\u0002<$a1yCIa\"}(\rUȦ&}ñh\u0012;C=\u0005Nw\"lX[ތm\u0016\u001d2Zom4ޜs??b\u00039M.@/Py3\u0006`ݚPǘz|IY\u001a\u001bxN~Ij\r{\n`ŏ\u000ȩ$\u0003$luW~mznR/QɅ\u001aHT'm4\u0015M;K\u0005-\u0013vo(C@e:\u05cf$مЁ\u0006QÜC\u0005E\u0004K\u00181C5?as\u0006̬\t\u0004\"*CO;b9̮\\՝PӠѨ&*յgMV$6\u000fC\u0014\u001bT\u001c\u000e4@x4;4~\n$2#q\u001aŊQؿbD\u0006\u0016oR_2\u000ePC9Ik\u0018fޅ\u001dP=\u001a\u0013\u0016f0\u000f\u000e9[\u0003\u0013'\u001aôXyWQ_I\u0006V\\+q=\u001c&7ľ\u0001ò\b2M#= Y;%JO[g<gpɘLFm\u001d\u0013\b1lwz`@PÂF;8#$ZrߟKߠPղW+ҭQ\u001eZ0\f2[9j#T!Sī~Sv\u0004\u0003M\f܃kÌfǶXm«\u0012Y?\u000bA_\u001a\u007f\u001e\u000fjvB̳lf\u0013m~B\u0002\u0011!٪(Ш1ʋғ\u000fvԞHP\u0012A@V:8B[I\u0019\u000béx\u0007,WY|7d!Ә\u0010ҰS՜˭\u0002h˨x\u000b\u0007\u0001j\b8t\u0007zD|\u000fTsUپ9\u001b,\t0\u001d|\u00111<\u0017s.ø.վGǻkֵçTz°\u001a\u001c?\b=@c\u001b\r)J\u0002[F#Ǫg˛Q\u0012/ϕM\u0012\u001d?\u0001.\u0016\r!5\u0003ߔlߝS^'$|d\u0001* f\u0006\u0002oOK_q^#[lN)G0ߪP̞\u0001\u000f/ +\f})\u001573O5&ȿv\u0014ٿ\u0014a\fj۳.\u0003j\u000f,\u0014m\u00072Ѕ2\u001eaмaj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "F", "", "5dc%\u0017(G\\#\u000evm0\u0007\u0012=", "u(E", "5dc% 0F^ ", "uI\u0018\u0013", "G", "5dc&\u0017(G\\#\u000evm0\u0007\u0012=", "5dc& 0F^ ", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n_F", "1n_F +\u001b/\u001cQgN", "uI5\u0013\u001c\u0011", "2he", "=oT?T5=", "2heyg<+C*\u0004f", "uI5u=", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "5dc\u0011\\:MO\"|z", "5dc\u0011\\:MO\"|z&0\u0005\u00146", "5dc\u0011\\:MO\"|zL8\r\u0005<e~", "5dc\u0011\\:MO\"|zL8\r\u0005<e~o\u007fH\f\u001e", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "7rE._0=", "7rE._0=\u001b\u001d\u0007\u0006e", "uI\u0018'", ";h]Bf", ";h]Bfs&9`a\u00102\u001c", "uI9u=", ">kd@", ">kd@ \u0014$\u001b{\u0014NN", "@d\\", "@d\\yg<+C*\u0004f", "Bh\\2f", "Bh\\2fsMc\u0006n\fc\u0018", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rB?wZX\fWJ", "\u0011n\\=T5B]\"", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Offset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3929constructorimpl(0);
    private static final long Infinite = m3929constructorimpl(InlineClassHelperKt.DualFloatInfinityBase);
    private static final long Unspecified = m3929constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Offset m3926boximpl(long j2) {
        return new Offset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m3929constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m3933equalsimpl(long j2, Object obj) {
        return (obj instanceof Offset) && j2 == ((Offset) obj).m3947unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m3934equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m3939hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: isValid-impl */
    public static final boolean m3940isValidimpl(long j2) {
        long j3 = (j2 + InlineClassHelperKt.DualUnsignedFloatMask) - (j2 | InlineClassHelperKt.DualUnsignedFloatMask);
        long j4 = j3 - InlineClassHelperKt.DualFirstNaN;
        long j5 = ~j3;
        long j6 = (j5 + j4) - (j5 | j4);
        return (j6 + (-9223372034707292160L)) - (j6 | (-9223372034707292160L)) == -9223372034707292160L;
    }

    public boolean equals(Object obj) {
        return m3933equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3939hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m3947unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ Offset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: component1-impl */
    public static final float m3927component1impl(long j2) {
        return m3937getXimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl */
    public static final float m3928component2impl(long j2) {
        return m3938getYimpl(j2);
    }

    /* JADX INFO: compiled from: Offset.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\fѻ[H\u000bBwݗ!\u0017&/+O\u0013ɷ:e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|T\fWKFg=\"\u001fq7", "", "u(E", "\u0017mU6a0MS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0016a-B\\\u001d\u000ez&\rHf~Bqr:<\n !Vk\u001d@\u0001.C", "5dc\u0016a-B\\\u001d\u000ez&\rHf~Bqr", "u(9", "\u0018", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P\u00101]wX2KU\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\u00101]wX2K", "(da<", "5dc'X9H\u001byJX.\tnSma\t1\u0006O|&\u001bQx\u001c", "5dc'X9H\u001byJX.\tnS", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0$annotations */
        public static /* synthetic */ void m3948getInfiniteF1C5BW0$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0$annotations */
        public static /* synthetic */ void m3949getUnspecifiedF1C5BW0$annotations() {
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0$annotations */
        public static /* synthetic */ void m3950getZeroF1C5BW0$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0 */
        public final long m3953getZeroF1C5BW0() {
            return Offset.Zero;
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0 */
        public final long m3951getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0 */
        public final long m3952getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }
    }

    /* JADX INFO: renamed from: unaryMinus-F1C5BW0 */
    public static final long m3946unaryMinusF1C5BW0(long j2) {
        return m3929constructorimpl(j2 ^ (-9223372034707292160L));
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m3945toStringimpl(long j2) {
        return OffsetKt.m3956isSpecifiedk4lQ0M(j2) ? "Offset(" + GeometryUtilsKt.toStringAsFixed(m3937getXimpl(j2), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m3938getYimpl(j2), 1) + ')' : "Offset.Unspecified";
    }

    public String toString() {
        return m3945toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: getX-impl */
    public static final float m3937getXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getY-impl */
    public static final float m3938getYimpl(long j2) {
        return Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: copy-dBAh8RU */
    public static final long m3930copydBAh8RU(long j2, float f2, float f3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return m3929constructorimpl((j3 + j4) - (j3 & j4));
    }

    /* JADX INFO: renamed from: copy-dBAh8RU$default */
    public static /* synthetic */ long m3931copydBAh8RU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (4294967295L & j2));
        }
        return m3930copydBAh8RU(j2, f2, f3);
    }

    /* JADX INFO: renamed from: getDistance-impl */
    public static final float m3935getDistanceimpl(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L))));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    /* JADX INFO: renamed from: getDistanceSquared-impl */
    public static final float m3936getDistanceSquaredimpl(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L)));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: minus-MK-Hz9U */
    public static final long m3941minusMKHz9U(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) - Float.intBitsToFloat((int) ((j3 + 4294967295L) - (j3 | 4294967295L)));
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | ((-1) - 4294967295L));
        return m3929constructorimpl((jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2));
    }

    /* JADX INFO: renamed from: plus-MK-Hz9U */
    public static final long m3942plusMKHz9U(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        return m3929constructorimpl((jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2));
    }

    /* JADX INFO: renamed from: times-tuRUvjQ */
    public static final long m3944timestuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        return m3929constructorimpl((jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2));
    }

    /* JADX INFO: renamed from: div-tuRUvjQ */
    public static final long m3932divtuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)))) / f2;
        return m3929constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: rem-tuRUvjQ */
    public static final long m3943remtuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) % f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))) % f2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return m3929constructorimpl((j3 + j4) - (j3 & j4));
    }
}
