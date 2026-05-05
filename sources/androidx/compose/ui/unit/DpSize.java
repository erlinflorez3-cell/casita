package androidx.compose.ui.unit;

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
/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\"B\u0012\u007f\u0007lyA0RjP.XS2\u000fy\u0002<$a$yCI^\"}(\u0014WNusvJ`\rIƬD,ю\tZyU'\\J\u000e`\u0003~E\u074c]sK9xtd\u0006ڶ6$>{\u0013\u0004b>V\u001e\u000fzqPR۽8фo9ƞ\f˟ŋ\u001e\u0014\fM.\nfpu^NH\u001bb\u0001Ǌ+ʾhAŰ&ڿ݁\u0001O\u0013Wb0U\u0019o0C@eߎE+Y\u0003\u0015]s?1D\"C\u000bh5+CI\"\\ΥWÜЏ\u0019-U k\u0007nx\u0013fx\fU˃\u007fgYf&(&\u0012BȦ<ɂ\r\u0005ТG͓ǉ\u001eh\u000e&A\u000e;oNe\u001a^pȕ+eD-=\u007faE\u007fӝfј`:уMљ߉\t\u000f$;\u000f\nisb*x\u0015Iq(W?gX?^M8X\u0004Ѿ\u0005Ͳf\u00040\">fH=\n1F\u0017SQ\"ߔ\"\u074co\u0004Neu\u0019Myvv\u0002RvؗRr$MB\t:ɮ\u000bߧ\u0005ÐOӹг0\u0013S@b,F!!FtwjƙU\u0014\\e\u0001i\u0019ܔ$܋%ĽeŽ֍rm\u0014~G\u0004{Q_\f(a\u0001ΘDCJx\u001dX\u0015Y\u001aۖZۛ'!ŮGКݻ{}Jw\u001a,z[\u007fDL,_ǉ\r\u0019V\u00196Bo\u0017OݨZՉ\u000f}֗2ɴғm&z2\u000fk%}}\u0012\u0011IZ('7έES;E4\u0003r\u0007B\u0001;\u0007-x6\f>վIǻkֵçTz°\u001a$IS5C!\u0016\u0017+8\n;N\u001d\u0007sQe\u0012U{3Ȫe\u0092j\u05cek\u000erѱ<bpT][g@\u0005i\u000b#6i6>8Ç|ūbҺ¤Z=ϗv\ri>TD\u000b\f7 +\u000e}+ĥ4-ϑ&\u001dDxҤ/\u001ei`oܒJ(a\u0017&z\u0005צ0\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "6dX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015X0@V(FY2\f\u0002X0M>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u0015X0@V(FY2\f\u0002X0M", "uI\u0018\u0013", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "EhSA[", "5dc$\\+MV`]N>1L\n\u0017${1\u0005J\u0010\u0013&Ky\u0017J", "5dc$\\+MV`]N>1L\n\u0017", "1n\\=b5>\\(J", "1n\\=b5>\\(JB=\u007f\\\u000e~fg", "1n\\=b5>\\(K", "1n\\=b5>\\(KB=\u007f\\\u000e~fg", "1n_F", "1n_F \u000bP8\u001f\bxh", "uI5\u0013\u001c\u0011", "2he", "=sW2e", "", "2hey:/\u0012V\u0017p\u0001", "uI5u=", "", "uI8u=", "3pd._:", "", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", ";h]Bf", ";h]Bfs>M,\u0002MB*", "uI9u=", ">kd@", ">kd@ ,8f\u001cQ^\\", "Bh\\2f", "Bh\\2fs Vl\u0002xP2", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6727constructorimpl(0);
    private static final long Unspecified = m6727constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m6724boximpl(long j2) {
        return new DpSize(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6727constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6732equalsimpl(long j2, Object obj) {
        return (obj instanceof DpSize) && j2 == ((DpSize) obj).m6744unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6733equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6735getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6737getWidthD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6738hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6732equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6738hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6744unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ DpSize(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m6729copyDwJknco$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = m6736getWidthD9Ej5fM(j2);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = m6734getHeightD9Ej5fM(j2);
        }
        return m6728copyDwJknco(j2, f2, f3);
    }

    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m6739minuse_xh8Ic(long j2, long j3) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) - m6736getWidthD9Ej5fM(j3));
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) - m6734getHeightD9Ej5fM(j3));
        return m6727constructorimpl((((long) Float.floatToRawIntBits(fM6638constructorimpl)) << 32) | ((-1) - (((-1) - 4294967295L) | ((-1) - ((long) Float.floatToRawIntBits(fM6638constructorimpl2))))));
    }

    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m6740pluse_xh8Ic(long j2, long j3) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) + m6736getWidthD9Ej5fM(j3));
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) + m6734getHeightD9Ej5fM(j3));
        return m6727constructorimpl((((long) Float.floatToRawIntBits(fM6638constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM6638constructorimpl2))));
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m6725component1D9Ej5fM(long j2) {
        return m6736getWidthD9Ej5fM(j2);
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m6726component2D9Ej5fM(long j2) {
        return m6734getHeightD9Ej5fM(j2);
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m6742timesGh9hcWk(long j2, int i2) {
        float f2 = i2;
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) * f2);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) * f2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM6638constructorimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM6638constructorimpl2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = (jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L);
        return m6727constructorimpl((j3 + j4) - (j3 & j4));
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m6741timesGh9hcWk(long j2, float f2) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) * f2);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) * f2);
        return m6727constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(fM6638constructorimpl)) << 32)) & ((-1) - (((long) Float.floatToRawIntBits(fM6638constructorimpl2)) & 4294967295L))));
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m6731divGh9hcWk(long j2, int i2) {
        float f2 = i2;
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) / f2);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) / f2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM6638constructorimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM6638constructorimpl2);
        return m6727constructorimpl((-1) - (((-1) - (jFloatToRawIntBits << 32)) & ((-1) - ((jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L)))));
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m6730divGh9hcWk(long j2, float f2) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6736getWidthD9Ej5fM(j2) / f2);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6734getHeightD9Ej5fM(j2) / f2);
        return m6727constructorimpl((((long) Float.floatToRawIntBits(fM6638constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM6638constructorimpl2)) & 4294967295L));
    }

    public String toString() {
        return m6743toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6743toStringimpl(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? ((Object) Dp.m6649toStringimpl(m6736getWidthD9Ej5fM(j2))) + " x " + ((Object) Dp.m6649toStringimpl(m6734getHeightD9Ej5fM(j2))) : "DpSize.Unspecified";
    }

    /* JADX INFO: compiled from: Dp.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001eݕH\u0019~}Iƙ(@/Hp@qұQ\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JY<}Au!*VGEt\n", "", "u(E", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "5dc\"a:IS\u0017\u0003{b,{P\u0017Y\u0013\u0019H3l", "u(9", "\u0018", "(da<", "5dc'X9H\u001b\u0001r\u000eOxot", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m6746getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m6745getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m6736getWidthD9Ej5fM(long j2) {
        return Dp.m6638constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m6734getHeightD9Ej5fM(long j2) {
        return Dp.m6638constructorimpl(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m6728copyDwJknco(long j2, float f2, float f3) {
        return m6727constructorimpl((-1) - (((-1) - (((long) Float.floatToRawIntBits(f2)) << 32)) & ((-1) - (((long) Float.floatToRawIntBits(f3)) & 4294967295L))));
    }
}
