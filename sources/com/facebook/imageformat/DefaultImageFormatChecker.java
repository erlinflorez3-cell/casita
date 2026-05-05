package com.facebook.imageformat;

import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imageformat.ImageFormat;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.msgpack.core.MessagePack;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007nʑA0RuP.XS@ş\n\u0005d$\n#*BD\u0016\u001dԥ&\t]N0}|Or\u000bq\u00156\u001a\u0007qDI\u0004\u0001\u000e\u0016\u001d3Zom5\u0014\u0004\u000eKnuN\u0005N4xؗ{ڱ\u0005 2Ϻ(x\u0001FY\u0010ܞ4J"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9l<w!E`\r\u0004?i\u0018..MHs0-rka7\rc9$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%l.MHs0-rka7\rc9$", "u(E", "6dP1X9,W.~", "", "5dc\u0015X(=S&l~s,", "u(8", "2dc2e4B\\\u0019_\u0005k4x\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "6dP1X9\u001bg(~\t", "", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultImageFormatChecker implements ImageFormat.FormatChecker {
    private static final byte[] BMP_HEADER;
    private static final int BMP_HEADER_LENGTH;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DNG_HEADER_II;
    private static final int DNG_HEADER_LENGTH;
    private static final byte[] DNG_HEADER_MM;
    private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
    private static final byte[] GIF_HEADER_87A;
    private static final byte[] GIF_HEADER_89A;
    private static final int GIF_HEADER_LENGTH = 6;
    private static final int HEIF_HEADER_LENGTH = 12;
    private static final byte[] HEIF_HEADER_PREFIX;
    private static final byte[][] HEIF_HEADER_SUFFIXES;
    private static final byte[] ICO_HEADER;
    private static final int ICO_HEADER_LENGTH;
    private static final byte[] JPEG_HEADER;
    private static final int JPEG_HEADER_LENGTH;
    private static final byte[] PNG_HEADER;
    private static final int PNG_HEADER_LENGTH;
    private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
    private final int headerSize;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001b6Ȑ\u0007\":\u0018\u007f\u0007lrA0RtP.XZ2\u000f\u0002{<$a%yCI^\"}(\u000eUȥh}ñzZ9BO\u000b\u001cx̶0Icx&(\u001dJZomL}sKSxtd\u0007P60S\u0012\u0005/\u001epHX\r\t_c\f@MptHl%M3\u001cB\nL;\u0019\u001e\u000bk\u00156\u0011\u0003kXG#1\u0007rR5yH|{\u000fvX5(\u000faL/\u00077}+3r\u001b\u0007\u0001xo\u0007M\fU\u0005\u0017)W/W\u000fo6\u0007\u0004Z\u0015se\u001b}\u000b&\u000b\"\u0002d\u001aACO\u0012M\u0001\u00126\u0013\u0013{;@J\u000eN=VOE\u001a\u0015%>7\u0003\rk@~\u0004\u000fF\u000e\u0016y6E)F3sO)\tiai6~;\n\u001f%\u001eQ\u0003\u001f%io&`C\u001f\u001bw\u001aG_cUH|'\nA{\u001e\tb0,44U\u001bG{?2]%\bgG$9k0J\u001bϜxݶdh[֟#TN%\u0007\u0016e._ȴ\\ֈh\u0005s¬%d:\u0016e\u001c\u0003\tTܴ\u0015ء`wDƙu\u001c\\U\u0001i\u0019Q4܆'çj7aʤ<\u001ae@v3cS:߇c؏z\u0014Gֺ3\u0011fnZS:^3̨tĘLj\u0018ǮLP\\\u0015+2msrؼ.֞\u001d\\\u001dǽS*PK\u0015\t\u000e\\?ɰ\u0001Ձ7$\u000bǭt\u0001\u0017\fh\\\u001fs>ձ\u001cض\u0001`*Ί\u0012]C%>UPl\u000bíuȷ\u0003s\bø8XUY\u0005\u0016$WR\u0090\u0018׀=Q7ˋc#\r7J\b=G\\r\u0014S{!}Ϙ~ɍ\u0013=p.u\u0018;|:q\u0003J}VmǴx݈v#\u0010ۭP\u0006oX\u0013G\u0012Xaϸ@ϗv\u0003aߢ\u001fD\u000b\u00187\u001eS\u0003Fܵ~ީ1C/ݴf\u0004\"C-a\fmFІ{ˏ\u0013&|ЁT8q+\bb\u007f_\tձ:ա]~FЭtx\u0011X`j&\f\u0019މ6٢7HIЬAbFd#/,j]\u0530_\u0080Z[Bܤ̳\u0002X"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9l<w!E`\r\u0004?i\u0018..MHs0-rka7\rc9\rT1OWJ5`\\{\u0013", "", "u(E", "\u0010L?,;\f\u001a2xk", "", "\u0010L?,;\f\u001a2xktE\fej\u001eH", "", "\u0012M6,;\f\u001a2xktB\u0010", "\u0012M6,;\f\u001a2xktE\fej\u001eH", "\u0012M6,;\f\u001a2xktF\u0014", "\u0013WC\u0012A\u000b\u001e2\u0013pZ;\u0017vk\u000fA^\bh:gv\u007f)^p", "\u0015H5,;\f\u001a2xkt1}X", "\u0015H5,;\f\u001a2xkt1\u007fX", "\u0015H5,;\f\u001a2xktE\fej\u001eH", "\u0016D8\u0013R\u000f\u001e/w^gX\u0013\\q\u0011Tb", "\u0016D8\u0013R\u000f\u001e/w^gX\u0017ih\u0010Ir", "\u0016D8\u0013R\u000f\u001e/w^gX\u001ali\u0010Ir\bi", "", ")Z1", "\u0017B>,;\f\u001a2xk", "\u0017B>,;\f\u001a2xktE\fej\u001eH", "\u0018O4\u0014R\u000f\u001e/w^g", "\u0018O4\u0014R\u000f\u001e/w^gX\u0013\\q\u0011Tb", "\u001eM6,;\f\u001a2xk", "\u001eM6,;\f\u001a2xktE\fej\u001eH", "!H<\u001d?\f8Ex[eX\u000f\\d\u000eEl\"b ix\u0006*", "5dc$X)I4#\f\u0003Z;", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7lP4X\u000f>O\u0018~\b;@\f\t=", "6dP1X9,W.~", "7r1:c\u000f>O\u0018~\b", "", "7r3;Z\u000f>O\u0018~\b", "7r66Y\u000f>O\u0018~\b", "7r72\\-!S\u0015}zk", "7r80b\u000f>O\u0018~\b", "7r9=X.!S\u0015}zk", "7r?;Z\u000f>O\u0018~\b", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImageFormat getWebpFormat(byte[] bArr, int i2) {
            if (WebpSupportStatus.isWebpHeader(bArr, 0, i2)) {
                return WebpSupportStatus.isSimpleWebpHeader(bArr, 0) ? DefaultImageFormats.WEBP_SIMPLE : WebpSupportStatus.isLosslessWebpHeader(bArr, 0) ? DefaultImageFormats.WEBP_LOSSLESS : WebpSupportStatus.isExtendedWebpHeader(bArr, 0, i2) ? WebpSupportStatus.isAnimatedWebpHeader(bArr, 0) ? DefaultImageFormats.WEBP_ANIMATED : WebpSupportStatus.isExtendedWebpHeaderWithAlpha(bArr, 0) ? DefaultImageFormats.WEBP_EXTENDED_WITH_ALPHA : DefaultImageFormats.WEBP_EXTENDED : ImageFormat.UNKNOWN;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBmpHeader(byte[] bArr, int i2) {
            if (i2 < DefaultImageFormatChecker.BMP_HEADER.length) {
                return false;
            }
            return ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.BMP_HEADER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isDngHeader(byte[] bArr, int i2) {
            return i2 >= DefaultImageFormatChecker.DNG_HEADER_LENGTH && (ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.DNG_HEADER_II) || ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.DNG_HEADER_MM));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGifHeader(byte[] bArr, int i2) {
            if (i2 < 6) {
                return false;
            }
            return ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.GIF_HEADER_87A) || ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.GIF_HEADER_89A);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isHeifHeader(byte[] bArr, int i2) {
            if (i2 < 12 || bArr[3] < 8 || !ImageFormatCheckerUtils.hasPatternAt(bArr, DefaultImageFormatChecker.HEIF_HEADER_PREFIX, 4)) {
                return false;
            }
            for (byte[] bArr2 : DefaultImageFormatChecker.HEIF_HEADER_SUFFIXES) {
                if (ImageFormatCheckerUtils.hasPatternAt(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isIcoHeader(byte[] bArr, int i2) {
            if (i2 < DefaultImageFormatChecker.ICO_HEADER.length) {
                return false;
            }
            return ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.ICO_HEADER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isJpegHeader(byte[] bArr, int i2) {
            return i2 >= DefaultImageFormatChecker.JPEG_HEADER.length && ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.JPEG_HEADER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPngHeader(byte[] bArr, int i2) {
            return i2 >= DefaultImageFormatChecker.PNG_HEADER.length && ImageFormatCheckerUtils.startsWithPattern(bArr, DefaultImageFormatChecker.PNG_HEADER);
        }
    }

    static {
        byte[] bArr = {-1, MessagePack.Code.FIXEXT16, -1};
        JPEG_HEADER = bArr;
        JPEG_HEADER_LENGTH = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
        PNG_HEADER = bArr2;
        PNG_HEADER_LENGTH = bArr2.length;
        GIF_HEADER_87A = ImageFormatCheckerUtils.asciiBytes("GIF87a");
        GIF_HEADER_89A = ImageFormatCheckerUtils.asciiBytes("GIF89a");
        byte[] bArrAsciiBytes = ImageFormatCheckerUtils.asciiBytes("BM");
        BMP_HEADER = bArrAsciiBytes;
        BMP_HEADER_LENGTH = bArrAsciiBytes.length;
        byte[] bArr3 = {0, 0, 1, 0};
        ICO_HEADER = bArr3;
        ICO_HEADER_LENGTH = bArr3.length;
        HEIF_HEADER_PREFIX = ImageFormatCheckerUtils.asciiBytes("ftyp");
        HEIF_HEADER_SUFFIXES = new byte[][]{ImageFormatCheckerUtils.asciiBytes("heic"), ImageFormatCheckerUtils.asciiBytes("heix"), ImageFormatCheckerUtils.asciiBytes("hevc"), ImageFormatCheckerUtils.asciiBytes("hevx"), ImageFormatCheckerUtils.asciiBytes("mif1"), ImageFormatCheckerUtils.asciiBytes("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        DNG_HEADER_II = bArr4;
        DNG_HEADER_MM = new byte[]{77, 77, 0, 42};
        DNG_HEADER_LENGTH = bArr4.length;
    }

    public DefaultImageFormatChecker() {
        Object objMaxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(JPEG_HEADER_LENGTH), Integer.valueOf(PNG_HEADER_LENGTH), 6, Integer.valueOf(BMP_HEADER_LENGTH), Integer.valueOf(ICO_HEADER_LENGTH), 12});
        if (objMaxOrNull == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.headerSize = ((Number) objMaxOrNull).intValue();
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    public ImageFormat determineFormat(byte[] headerBytes, int i2) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (WebpSupportStatus.isWebpHeader(headerBytes, 0, i2)) {
            return Companion.getWebpFormat(headerBytes, i2);
        }
        Companion companion = Companion;
        return companion.isJpegHeader(headerBytes, i2) ? DefaultImageFormats.JPEG : companion.isPngHeader(headerBytes, i2) ? DefaultImageFormats.PNG : companion.isGifHeader(headerBytes, i2) ? DefaultImageFormats.GIF : companion.isBmpHeader(headerBytes, i2) ? DefaultImageFormats.BMP : companion.isIcoHeader(headerBytes, i2) ? DefaultImageFormats.ICO : companion.isHeifHeader(headerBytes, i2) ? DefaultImageFormats.HEIF : companion.isDngHeader(headerBytes, i2) ? DefaultImageFormats.DNG : ImageFormat.UNKNOWN;
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    public int getHeaderSize() {
        return this.headerSize;
    }
}
