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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\"B\u0012\u007f\u0007lrA0RnP.XU2\u000fy\u0002<$a*yCIa\"}(\u000bUȦ&}ñh};C=\u0005Nw\u000elX[ތm\u0016\u001d2Zom4ޜs??b\u00039MB@0Py3ЏJ0N\u0010\u0005\u0001[K:\u0019`Fv:`\u0018e\u0005H\u0019Ř=ĨӘ\"^m]DX5uH@;\u0003\u0018T~-mC\u0015O#E\u0003&Sɏbӿ/B=I#:\u001c\u0011\u0015hs?1V8ތ\u0004ص+)1a\u0002p~q\u000e.-+}Օ\u000ev4o\u001dQ\u000fϯmˋOԣJִˎ,y\u0001\u0017\u001bXL'\u0014D`.[Կ\u0017\f\u001cF\rr\u0002ó\u0017ؤ^݆~Эˋ:\u0019+\u001eAG\u0002(tpy;Gn}\u0011˿\u0011 )\"|C,h\u001c`-\u001b\u0003x\bĸ(̷?˓R\u0010aƝ}\u0006vf\u0010/TNU\u0006G{?5Mi\u000eً;ٳ ǽʮGCϼz\u000fpjYq`MX$t\u001fE4Y*hO|\u0005\u001aW\u000b\u001d\u0003ҒOʵS͵ś\u0007\u0012ء`\u0002L#+\u001c\\T\u0001kpZk\u0014ɡ.fƐXn\u001a\u000fæ9g;8Wӑ,\u0010Q~\u0014E[О\t|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "", ">`R8X+/O \u000fz", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u001dT*DS\u0018ove<|G+n\t2\u000b<\u0010\u001b!P}", "u(E", "F", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc% \u000b\u00123\u001eN{Fjx\u00128o\u000f$\u000bD\u000b %", "5dc% \u000b\u00123\u001eN{F", "uI\u0018\u0013", "G", "5dc& \u000b\u00123\u001eN{Fjx\u00128o\u000f$\u000bD\u000b %", "5dc& \u000b\u00123\u001eN{F", "1n_F", "1n_F ;)W\u001b`g1", "uI5\u0013\u001c\u0011", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", ";h]Bf", ";h]Bfs\u001c0`f|dz", "uI9u=", ">kd@", ">kd@ \n\u001b\u001b\u0001\u0001\u0001-", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6694constructorimpl(0);
    private static final long Unspecified = m6694constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m6693boximpl(long j2) {
        return new DpOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6694constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6697equalsimpl(long j2, Object obj) {
        return (obj instanceof DpOffset) && j2 == ((DpOffset) obj).m6707unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6698equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6700getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6702getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6703hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return m6697equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6703hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6707unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ DpOffset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m6696copytPigGR8$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = m6699getXD9Ej5fM(j2);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = m6701getYD9Ej5fM(j2);
        }
        return m6695copytPigGR8(j2, f2, f3);
    }

    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m6704minusCBMgk4(long j2, long j3) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6699getXD9Ej5fM(j2) - m6699getXD9Ej5fM(j3));
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6701getYD9Ej5fM(j2) - m6701getYD9Ej5fM(j3));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM6638constructorimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM6638constructorimpl2);
        long j4 = jFloatToRawIntBits << 32;
        long j5 = (4294967295L + jFloatToRawIntBits2) - (4294967295L | jFloatToRawIntBits2);
        return m6694constructorimpl((j4 + j5) - (j4 & j5));
    }

    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m6705plusCBMgk4(long j2, long j3) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(m6699getXD9Ej5fM(j2) + m6699getXD9Ej5fM(j3));
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(m6701getYD9Ej5fM(j2) + m6701getYD9Ej5fM(j3));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM6638constructorimpl);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM6638constructorimpl2);
        return m6694constructorimpl((jFloatToRawIntBits << 32) | ((4294967295L + jFloatToRawIntBits2) - (4294967295L | jFloatToRawIntBits2)));
    }

    public String toString() {
        return m6706toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6706toStringimpl(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? "(" + ((Object) Dp.m6649toStringimpl(m6699getXD9Ej5fM(j2))) + ", " + ((Object) Dp.m6649toStringimpl(m6701getYD9Ej5fM(j2))) + ')' : "DpOffset.Unspecified";
    }

    /* JADX INFO: compiled from: Dp.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001eݕH\u0019~}Iƙ(@/Hp@qұQ\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/uK 6X?Do>'j", "", "u(E", "#mb=X*BT\u001d~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "5dc\"a:IS\u0017\u0003{b,{P\u001cK^\u0012l\u000eh", "u(9", "\u0018", "(da<", "5dc'X9H\u001b\u0006dYH\u001dJp", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m6709getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m6708getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m6699getXD9Ej5fM(long j2) {
        return Dp.m6638constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m6701getYD9Ej5fM(long j2) {
        return Dp.m6638constructorimpl(Float.intBitsToFloat((int) ((j2 + 4294967295L) - (j2 | 4294967295L))));
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m6695copytPigGR8(long j2, float f2, float f3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        return m6694constructorimpl((-1) - (((-1) - (jFloatToRawIntBits << 32)) & ((-1) - ((jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L)))));
    }
}
