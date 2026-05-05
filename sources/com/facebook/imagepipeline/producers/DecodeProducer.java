package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.common.util.UriUtil;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.CloseableReferenceFactory;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegParser;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.DownsampleUtil;
import com.facebook.imageutils.BitmapUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\t]WogtJb\u000bY\u000f\u000eǝ\u0001j:O]ތe\u0012%2JģG3coEʠhtL\u0005(2(O\u0002\u0005\u000f\u001a2Ϻ\u0018v\u0011CSÈ\u001a0VpBR\u0013P\u001b܅0=n,\u0011&lm^8Xl\f;]#1hzP^\u0018i7\u000e\u0001VX5\u000f\u000faL.P;C\u0019=S1\fb_M\tWqk\fx+53as\u0006?h\u0004\"\u001fCO;h\u0003*j\u0011i`:4;SqYh\u000eV\u0005\u000b\b\u001bK\u001c\u0016\u0016+X0C\u0019\u0015\u0018<2\u0005vaQh\u0002\rT\u0010~oI/%.G;?){icQ\u0018|M\f\u000f\u001b5;\u0007~#kT<mC3ƻ{Q?j\t_V\u007f\"Yk 4\u0001p5B\u0010@O\u00105\f\u0013>\u0017S8\n9QU\u001c\u0006Vy\u007fv3\u0017/g:aVB:nD:Ҋ\r\u0012bե|\u0007qjbs| [/l\u0007,\u001c˙$b\u007f˓9'\u0016j]\u0006:y[k\"%]sƠ]tsލo;dQCp4\u001fo^\u000f\u0014mIИ\t^n̻k\u000e`|6A\u0003Wx\u001a\u0010{rYܟ\u00178Gڤ462R'~eW\u0011\"ZA+\u000eރ^n\u0018зl5*&wHE\u0018\u000fVtp\u001en֑M2\u0005ʠ:/GvC?vl0wL\u00053\u000b\u000fu\u0016F\u0016\\uK̡\u001a{]ݨ8\u0018 `_W\u000e\"\u001d\u0010A20?։Pxmʸe\u0014-$\u000b$_Jv6\u007f\b\u0019yݽdpR֢l\u0019(\"l\u001fs\u0019r\u0015\u0012c\\yuyӝ\u000faFδ\u000b\u0005_i\\fM\u001a-5=\u0007\u007f$\r5[PU5ə{\u001a7֒y_o\u001f<*˕\u0013a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[L", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "0xc249KO-i\u0005h3", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006S9DYY-Di*\u0019WMBA", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "7lP4X\u000b>Q#}zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7y6IE;J4\u001c\u001fgaF\\", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "2nf;f(F^ ~Zg(y\u0010/d`2\t)\u0001&)Q|\u0014", "", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "7m_Bg\u0017K]\u0018\u000fx^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", ";`g\u000f\\;FO$l~s,", "", "1k^@X(;Z\u0019kz_,\n\t8c\u007f\tw>\u0010!$[", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG}>w$.I@Bk!\u001e\u0016hn9\u0010a,/r%VV[@2", "@dR9T0F;\u0019\u0007\u0005k@i\u00198n{%\u0003@", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@dR<i,K4&\t\u0003=,z\u0013.e\r\u0012e(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n#i\t+>q\u0016;#", "uKR<`u?O\u0017~wh6\u0003R-o\b0\u0006IJ\u001f\u0017Oy\u001bP@\u0002Ih}{Dz\u0012B8MEr\n\u0005\u001adr5Ps;R}pEVW*l_\u007f=\u001d!$ma+\u000b\u0015hK1D+5)\u0010uJ}9h}\u0016 \u0014~nx>X\u0010R} uH-qF#^yEKDb7.og\u0019^:\u0019$\u0012{\u0018\u001bu&\u0015\b\u0006[ZsNwgdQ#\u0001\u0002(Fi]FPs`<{+(KEv\u00120bs+\u0002vnA48q\u0005Yu\u001cO^] ,^\u001f1/7@\u0015\u00152a\u007ft\b\u000fd\u001da\u0005\u0018l;z\u001dmaeH\u001a\u000bh\u0017b9j_J5\\\u0013>\u0013N\u001f9O\r>c\u0005\u001c\tn.le\u001f8\u0010;~$x\u000e#[\u000f\u0003\u007fp\"\"w\u001aEU\u0011h5cBM\u001a\rq8U\u0007fM\u0014\u0001F\u0010zY<Fdy#Fv\u0011Vv\u00172:\u0001Z\rp\f\u00144}\u0015\t#=mJu8\u00130)HY?fi/Te]/\u00191\u0016#);1}OGnKw(\u0015\u000b\u000eqz\u0015>:6\u0011=N]@\tA_\\\u0001\u0006aN\u0019.\u0017\u0002?i}\u0012?bs\u000b1l\u0018\bM,t\u0011\u001c)0\u007fMhe%7n\u0016\u0015Ss&>\u001b\u000eaJ\u001d\u0017\u0001~SS!\u0002[<ZS\u0013", "5dc\u000fl;>/&\fvr\u0017\u0007\u00136", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001fGw\u0018I\u000bn\u0012m\r \u0013z#*a.Eu;s", "5dc\u0010_6LS\u0015{\u0002^\u0019|\n/r\u007f1y@a\u0013\u0015Vy\u001bP", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001K\u001d8[C7h;\u001e\u0002hb9\u0014c5Lv\bCJ]6ifH", "5dc\u0011X*HR\u0019\\vg*|\u00106a\u000f,\u0006I` \u0013Dv\u000e;", "u(I", "5dc\u0011b>Ga\u0015\u0007\u0006e,\\\u0012+b\u0007(z!\u000b$\u007fG~ F\u0004+", "5dc\u0011b>Ga\u0015\u0007\u0006e,d\u0013.e", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn3c\u000b \u0001L @VQ7s?%\u0015Pk8\u00079", "5dc\u0012k,<c(\t\b", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "5dc\u0016`(@Sw~xh+|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w1K7m4|\u0015fk8\u0007p\u0002", "5dc\u0016a7Nb\u0004\f\u0005]<z\t<", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faF\\", "5dc\u001aT?\u001bW(\u0007vi\u001a\u0001\u001e/", "u(8", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0005QUO0^(", "5dc\u001fX*EO\u001d\u0007b^4\u0007\u0016CR\u00101\u0005<}\u001e\u0017", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "5dc\u001fX*Hd\u0019\f[k6\u0005g/c\n'{Mj\u0001~", "u(;0b4\bT\u0015|z[6\u0007\u000fxc\n0\u0004J\n`\u001bP~\u000eI\u007f!<#k0Bx\u001d2MP\u0011", ">q^1h*>@\u0019\r\u000be;\u000b", "", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "\u0011n\\=T5B]\"", "\u001anR._\u0010FO\u001b~\tI9\u0007\u000b<e\u000e6\u007fQ\u0001u\u0017Ey\r<\u0004", "\u001cdcDb9D7!z|^:g\u00169g\r(\nN\u0005(\u0017&o\fFu%B", "\u001eq^4e,La\u001d\u0010z=,z\u0013.e\r", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DecodeProducer implements Producer<CloseableReference<CloseableImage>> {
    public static final Companion Companion = new Companion(null);
    private static final int DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES = 10;
    public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
    public static final String EXTRA_BITMAP_BYTES = "byteCount";
    public static final String EXTRA_BITMAP_SIZE = "bitmapSize";
    public static final String EXTRA_HAS_GOOD_QUALITY = "hasGoodQuality";
    public static final String EXTRA_IMAGE_FORMAT_NAME = "imageFormat";
    public static final String EXTRA_IS_FINAL = "isFinal";
    private static final int MAX_BITMAP_SIZE = 104857600;
    public static final String NON_FATAL_DECODE_ERROR = "non_fatal_decode_error";
    public static final String PRODUCER_NAME = "DecodeProducer";
    public static final String REQUESTED_IMAGE_SIZE = "requestedImageSize";
    public static final String SAMPLE_SIZE = "sampleSize";
    private final ByteArrayPool byteArrayPool;
    private final CloseableReferenceFactory closeableReferenceFactory;
    private final boolean decodeCancellationEnabled;
    private final boolean downsampleEnabledForNetwork;
    private final DownsampleMode downsampleMode;
    private final Executor executor;
    private final ImageDecoder imageDecoder;
    private final Producer<EncodedImage> inputProducer;
    private final int maxBitmapSize;
    private final ProgressiveJpegConfig progressiveJpegConfig;
    private final Runnable reclaimMemoryRunnable;
    private final Supplier<Boolean> recoverFromDecoderOOM;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007f\u0007lsA0RnP\u008cZS@\u000fsڔ<$q$yّA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0001:Xmx\f\"?6P\u0001W3{\u0002m=n\bN\u0005NFh8J\u0011\u000f\u001bBH>xQŒ\u001eë\u00160H\u0081\u000b^\u001bP\u001d\u001a@\n\u0015įSɉ`gVȤ\u0019xk?G#1m\u0019þyۢ4|Uε\u0017`5\u0013\u000faL/\u0017ˁ\bչ)S\u000bޗ#gM\nWqk\t?ѮyȅMs_̬)\f\"\u001dCO;aI̭/ԇU`\u0014ʬ{[qTh\u000eV{Qԏ_ʀ\b\u000e\u000eΩ\u0019:;$~\b<5KɄ&ĖT\u0002fۍP\u0007oA/%.7\u0002ݔmƻUaCϊ\u001fC\n\u0011%\u001eQ\u0005EĖ.ڍ\u0012`\u001dÑ%\u0004_>i@kL%˪,ǀq\u0004xçR6\u0012>_\u007f]\u007fgыiÉ;[A\u05faݒo\u0017"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u0005QTY(eV|Fi", "", "u(E", "\u0012D2\u001c7\f83\f\\ZI\u001b`r\u0018_g\bi.\\xvAX}$p\b\u00155\\\u007f$gr\"<#)", "", "\u0013M2\u001c7\f\u001dM|fV@\fvv\u0013Z_", "", "\u0013WC\u001f4&\u001b7\bfVI&Y|\u001eEm", "\u0013WC\u001f4&\u001b7\bfVI&jl$E", "\u0013WC\u001f4&!/\u0007x\\H\u0016[\u0003\u001bU[\u000f_/t", "\u0013WC\u001f4&\";t`ZX\rfu\u0017An\"d\u001chv", "\u0013WC\u001f4&\"A\u0013_^G\bc", "\u001b@G,5\u0010-;titL\u0010qh", "\u001cN=,9\b-/\u007fxY>\nfg\u000f__\u0015h*m", "\u001eQ>\u0011H\n\u001e@\u0013gVF\f", " D@\"8\u001a-3wx^F\b^h)Sc\u001d[", "!@<\u001d?\f8A|sZ", "7rC<b\tBU", "", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "7lP4X\u000b>Q#}zH7\f\r9n\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Q\u001e*OC\u001ak2(\u0014hKD\u0016g6W\u0005|", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTooBig(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
            return (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight())) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(imageDecodeOptions.bitmapConfig)) > StatFsHelper.DEFAULT_DISK_RED_LEVEL_IN_BYTES;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\u007fICU }*\teNogtLb\u000bY\u000f\u000e\u0016~k2ղW\u000fزB\u0013`A@?aM0lIp\u00037\u001d,B*H\u007f\u0015\u0003**v\u0014%}qM\u001c\u0016>E\t:\u0001\u0013]\t(\u0019\u001e>N\t.`uWNH\u001bgƠ3#\u0011t\u000b\\5oH|{\u0017vX5\u001e\u000faL=\u0007I}-3f\u001b\u0007\u0001co\tM\u0003U\u0007~&U=yweJp\u007fB\u001fqa]o\u00012t\u0005\u007fmBy\u0002էeׂT\u0012@y\u0001\n\u001bKǲ\u0012\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u000eQJJ3@Zn?\u0014 E\u001bX-\u001a\u0005gO(\u007fD\u0016\u001f\u00066H\u0002H>", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u0012TVP9\\`\u0001A%\u00129\u000eL5\f\u0005f\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[L", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "", ";`g\u000f\\;FO$l~s,", "", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017\";i>\u001d\u0015SnC\u0006s*N\u0004|.JX4&Sn;\u0014\u000fd\u0018Tt\u0011\rUC$yHB\u001f\u000f0R\u0002\u0005s\u000e\u0016\u0015\u001e3j}P mQ\u0003#\u0006I)u\u001c@]\u0004O\u000bF^(d\ti'b\u0004>,\u0010s\u0019&l[.\u0011\u007f\\\u0011<]\u0007qfW\u0017zE2\bXhPD\u007fS<\u0002\u0005)T\u000bw%A.i\u000f8\u001e", "?tP9\\;R7\"\u007f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i#}\u00125QROO=\u001f\u001f>", "5dc\u001eh(EW(\u0013^g-\u0007", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn9ay\"77\u0002>IJ?zH\u0002\u001eik\u000f", "5dc\u0016a;>`!~yb(\f\t\u0013m{*{ \n\u0016\u0001Hp\u001c<\u0006", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "CoS.g,\u001dS\u0017\ty^\u0011\u0007\u0006", "AsPAh:", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class LocalImagesProgressiveDecoder extends ProgressiveDecoder {
        final /* synthetic */ DecodeProducer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalImagesProgressiveDecoder(DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext, boolean z2, int i2) {
            super(decodeProducer, consumer, producerContext, z2, i2);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.this$0 = decodeProducer;
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected int getIntermediateImageEndOffset(EncodedImage encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return encodedImage.getSize();
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected QualityInfo getQualityInfo() {
            QualityInfo qualityInfoOf = ImmutableQualityInfo.of(0, false, false);
            Intrinsics.checkNotNullExpressionValue(qualityInfoOf, "of(0, false, false)");
            return qualityInfoOf;
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected synchronized boolean updateDecodeJob(EncodedImage encodedImage, int i2) {
            return BaseConsumer.isNotLast(i2) ? false : super.updateDecodeJob(encodedImage, i2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}0\u0012WȞog|Pb\u000bI\u0013\u000e\u0016\u000fj4I[ze\u0012%2JoE4Sڑ?Oś%:3\u001f\u0003\"fyE@*:V\u0011\u000f\u0007SS\u001c\u0018@B\u0001:\u0001\u0011{\bH\u0014\u0016B.\u00066\\\u0016TFLzdR/Q\u000byF\\0w0+W\u001dJb2%v\u0010*;DEB-%\u0002\u0011\u07baV[M\u0012\b\u007fK\u001d\u0001'U9yweOp\u007fB/qaUu\u0001At\u0005\u007fl<-9h{Mf\rV\u0012+\u007f\u001bX\u001c\u000e45\u000f@})t\u0011&3#|ՂDV\nމZ\u0002\u0001qD(u\u000fA2Q\u001b\u0015Yň?\u001fVљ\u0014\u0007\u001301\u0014?3ih&`C0\u000bJ(ōS͘ALf\f_S{\u001b\u0378f\u001f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u0010G[`6iXVE\u0010\u0014Z\u001c98\u0017\u0007fA2|HH\u001ff,G\f:h\u000ea", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u0012TVP9\\`\u0001A%\u00129\u000eL5\f\u0005f\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[L", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", ">q^4e,La\u001d\u0010zC7|\u000b\u001aa\r6{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.9r4UL[\u0002", ">q^4e,La\u001d\u0010zC7|\u000b\ro\t)\u007fB", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006u%3c| D7\u0001;WEHkB,\u0019ya\u001e\u0012c.,\u00010HPP\u0002", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "", ";`g\u000f\\;FO$l~s,", "", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017\";i>\u001d\u0015SnC\u0006s*N\u0004|.JX4&Sn;\u0014\u000fd\u0018Tt\u0011\rUC$yHB\u001f\u000f0R\u0002\u0005s\u000e\u0016\u0015\u001e3j}P mQ\u0003#\u0006I)u\u001c@]\u0004O\u000bF^(d\ti'b\u0004>,\u0010s\u0019&l[.\u0011\u007f\\\u0011<]\u0007qfW\u0017zE2\bXhPD\u007fS<\u0002\u0005)T\u000bw%A.[)~5M5&4d\u0002Uq\u001e\bb\u0001\u0011.\\L+16C\u0017HK-tl<\u0018g\u001fnQxo?3&esqL \u0007B\"[7L[\u000eER\u0013\u00140m\u001f/\u0010\u007f>Yy\u0012\u0013\u0011*7iQ?\u001dT\f\u001e{D)c\u001a\u0003Le\u0018\u001a8\u0015=fXS7i9Z\u0013\u0017v<\u001d{>N\u0015r&\u001avLv]-d\byi", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0006\u0006I\u0002\u001b\u0019", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0005QUO0^(", "5dc\u001de6@`\u0019\r\tb=|m:e\u0002\u0013wM\u000f\u0017$", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn4Y{*6m#w8PEmA\u001e#veJ\u0007H7Nx\u0012CY\\,i(", "?tP9\\;R7\"\u007f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i#}\u00125QROO=\u001f\u001f>", "5dc\u001eh(EW(\u0013^g-\u0007", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn9ay\"77\u0002>IJ?zH\u0002\u001eik\u000f", "5dc\u0016a;>`!~yb(\f\t\u0013m{*{ \n\u0016\u0001Hp\u001c<\u0006", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "CoS.g,\u001dS\u0017\ty^\u0011\u0007\u0006", "AsPAh:", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class NetworkImagesProgressiveDecoder extends ProgressiveDecoder {
        private final ProgressiveJpegConfig progressiveJpegConfig;
        private final ProgressiveJpegParser progressiveJpegParser;
        final /* synthetic */ DecodeProducer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkImagesProgressiveDecoder(DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext, ProgressiveJpegParser progressiveJpegParser, ProgressiveJpegConfig progressiveJpegConfig, boolean z2, int i2) {
            super(decodeProducer, consumer, producerContext, z2, i2);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            this.this$0 = decodeProducer;
            this.progressiveJpegParser = progressiveJpegParser;
            this.progressiveJpegConfig = progressiveJpegConfig;
            setLastScheduledScanNumber(0);
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected int getIntermediateImageEndOffset(EncodedImage encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return this.progressiveJpegParser.getBestScanEndOffset();
        }

        public final ProgressiveJpegConfig getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        public final ProgressiveJpegParser getProgressiveJpegParser() {
            return this.progressiveJpegParser;
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected QualityInfo getQualityInfo() {
            QualityInfo qualityInfo = this.progressiveJpegConfig.getQualityInfo(this.progressiveJpegParser.getBestScanNumber());
            Intrinsics.checkNotNullExpressionValue(qualityInfo, "progressiveJpegConfig.ge…pegParser.bestScanNumber)");
            return qualityInfo;
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
        protected synchronized boolean updateDecodeJob(EncodedImage encodedImage, int i2) {
            if (encodedImage == null) {
                return false;
            }
            boolean zUpdateDecodeJob = super.updateDecodeJob(encodedImage, i2);
            if ((BaseConsumer.isNotLast(i2) || BaseConsumer.statusHasFlag(i2, 8)) && !BaseConsumer.statusHasFlag(i2, 4) && EncodedImage.isValid(encodedImage) && encodedImage.getImageFormat() == DefaultImageFormats.JPEG) {
                if (!this.progressiveJpegParser.parseMoreData(encodedImage)) {
                    return false;
                }
                int bestScanNumber = this.progressiveJpegParser.getBestScanNumber();
                if (bestScanNumber <= getLastScheduledScanNumber()) {
                    return false;
                }
                if (bestScanNumber < this.progressiveJpegConfig.getNextScanNumberToDecode(getLastScheduledScanNumber()) && !this.progressiveJpegParser.isEndMarkerRead()) {
                    return false;
                }
                setLastScheduledScanNumber(bestScanNumber);
            }
            return zUpdateDecodeJob;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\u007fICU }*\t]Zo˧vJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0016\u00172XoG\u074cUoS9ht<\u0006(208\u0002\u0005\u0007\u001b2H\u001e\u0019\u0003CQ\f\u001a0NwBR\u0013U\r\u001a \u0007F \u0007)dg\\;Plc<5ݭ\u0005\u007fĩ~;o4\rO#E\u0003'\u001d~q$;BG5C'\u0002\u00045Q\u001cn\u0013O\u007f@\u001dt7/;O\u0004YFX.\u0016C,}\u0011mv4a\u001dQ\u000f\u00127/]jcP<0\b~\n\u0016T\u0004<\u0010όL.;%/&\u001cQ\rr\u0002_\u0001\u0006lb\u0018z\u00106G)\u000eTC9Ip\u0002eI,f7*\u000fS\u001ekW|Csb\u001eb%\u001b\u0003\u0005a3a@kUd\t\b`\u001e\n~\u0007\u001a,\u001a/u\u0002_\u007f\u001fS/%e\u0002i'/\u0013\u001aHr\u0003'\tn\u0011ki\u0001Pp&|?O*7\u0019\u000bHr/\u0004P\u0003e\\\u0015[Gl\u0007,\u0015C$j$T!S\u001d\u0015O1wxzu\nS9\u0017;g\u000f\u0004\u000e\u00069%U}Wq>yR%3\u0006<+\u0013f\u0016ZS:y\r,0b`j>)BD\u0017$!dWqJS\\7'\u0010-J\u0019\u001dpC-\rm{\u0001\u0010-^y$K\n2)!\u0003f[\u001fq\u0018|WL\u0015`P-qUCN>UPrd\u00011.\u0017s.b.L\u0010ZzL\u000eU*?F\u001eG\tG=A\u0017E)z\u0010;}dr\u0014p}\u00165\u001b\u0015y=;/.0\u000ex*D`\u0019i\u0016h_0\u0005\u0019\u000b#6\u00040}ov\u0013G\u0012\u0006Qo\u0007a\u0001>q<|W-\u000b-Z=\u0003\u0006!+5]G5>.wB9[u&w}k\u0012b=E%i\u0012j{\u0016\u001e\"\u0018oz[F\nq~lATp\u0011b`j&\br\u000fB1KJWc\u001fXhQ\u0019B\u0016f56Sp\u001fsHT\b}b6\u00100\u0002\u0006\u0016\u0016tBS\u0011}Wu\u000f\u0006K\u000b\u0015\u0011!Z\u0017\n=\u0007\u0012JJv\u074b\u001ať\r0\u000e\u058chBOIz\u0005j\u0018zҌ.ѧ\f\u000bKҍ:\u0016\u001e\u000b\u0018F\u000e\u0017Mr\u0001s\u0012ٝ\u001a֭|\\^ޠUlSq9*/\u0011eɿ א91\rև\u0017l=vJ\u0001\u0002'_Ɗvˍ\u0003r-Ľ\\V?/6m!\rKsQ`RB\u0012LAm\u001aubՇ\u001aԠ!B Ç\n]\u001fw\u000f0\r$,̧PЩz\u0012nŚ\u001f27\u0019\u0013|<W`۬\rĢSv\bd3h\\\u0015̨G]"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,C9u3\u001e\u007fuk8\u0017a,[5\u0012TVP9\\`\u0001A%\u00129\u000eL5\f\u0005f\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w,CBk6\u001a$lj;dm5\\\u0007/GY$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "2dR<W,\u001cO\"|ze3x\u00183o\t\b\u0005<}\u001e\u0017F", "", ";`g\u000f\\;FO$l~s,", "", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017\";i>\u001d\u0015SnC\u0006s*N\u0004|.JX4&Sn;\u0014\u000fd\u0018Tt\u0011\rUC$yHB\u001f\u000f0R\u0002\u0005s\u000e\u0016\u0015\u001e3j}P mQ\u0003#\u0006I)u\u001c@]\u0004O\u000bF^(d\ti'b\u0004>,\u0010s\u0019&l[.\u0011\u007f\\\u0011<]\u0007qfW\u0017zE2\bXhPD\u007fS<\u0002\u0005)T\u000bw%A.i\u000f8\u001e", "\"@6", "", "7lP4X\u000b>Q#}zH7\f\r9n\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Q\u001e*OC\u001ak2(\u0014hKD\u0016g6W\u0005|", "7r56a0LV\u0019}", "8nQ V/>R)\u0006zk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w2M8Y2!\u0015gq@\u0007p\u0002", ":`bAF*AS\u0018\u000f\u0002^+j\u0007+nh8\u0004=\u0001$", "5dc\u0019T:MA\u0017\u0002z]<\u0004\t.S}$\u0005)\u0011\u001f\u0014G|", "u(8", "Adc\u0019T:MA\u0017\u0002z]<\u0004\t.S}$\u0005)\u0011\u001f\u0014G|", "uH\u0018#", ">q^1h*>`\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015uH=\u0015r,Wv4\u0014\"", "?tP9\\;R7\"\u007f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i#}\u00125QROO=\u001f\u001f>", "5dc\u001eh(EW(\u0013^g-\u0007", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn9ay\"77\u0002>IJ?zH\u0002\u001eik\u000f", "2n32V6=S", "", "3mR<W,=7!z|^", "AsPAh:", "5dc\u0012k;KO\u0001z\u0006", "", "7lP4X", "?tTBX\u001bB[\u0019", "", "?tP9\\;R", "7r56a(E", "7lP4X\rH`!z\nG(\u0005\t", "3mR<W,=7!z|^\u001a\u0001\u001e/", "@d`BX:M7!z|^\u001a\u0001\u001e/", "A`\\=_,,W.~", "5dc\u0016a;>`!~yb(\f\t\u0013m{*{ \n\u0016\u0001Hp\u001c<\u0006", "6`]1_,\u001cO\"|ze3x\u00183o\t", "6`]1_,\u001e`&\t\b", "B", "", "6`]1_,+S'\u000f\u0002m", "2dR<W,=7!z|^", "7mc2e5:Zw~xh+|", ":d]4g/", ";`h/X\rB\\\u001d\r}", "Ag^B_+\u001fW\"\u0003\ta", ";`h/X\u0010GQ&~vl,j\u00057p\u0007(iD\u0016\u0017", "=m2.a*>Z z\nb6\u0006l7p\u0007", "=m5.\\3N`\u0019b\u0003i3", "=m=2j\u0019>a)\u0006\nB4\b\u0010", "<df\u001fX:NZ(", "=m??b.KS'\rji+x\u0018/I\b3\u0003", ">q^4e,La", "", "Adc\u0016`(@Sx\u0012\nk(\u000b", "CoS.g,\u001dS\u0017\ty^\u0011\u0007\u0006", "@dU", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    abstract class ProgressiveDecoder extends DelegatingConsumer<EncodedImage, CloseableReference<CloseableImage>> {
        private final String TAG;
        private final ImageDecodeOptions imageDecodeOptions;
        private boolean isFinished;
        private final JobScheduler jobScheduler;
        private int lastScheduledScanNumber;
        private final ProducerContext producerContext;
        private final ProducerListener2 producerListener;
        final /* synthetic */ DecodeProducer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressiveDecoder(final DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext, final boolean z2, final int i2) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.this$0 = decodeProducer;
            this.producerContext = producerContext;
            this.TAG = "ProgressiveDecoder";
            this.producerListener = producerContext.getProducerListener();
            ImageDecodeOptions imageDecodeOptions = producerContext.getImageRequest().getImageDecodeOptions();
            Intrinsics.checkNotNullExpressionValue(imageDecodeOptions, "producerContext.imageRequest.imageDecodeOptions");
            this.imageDecodeOptions = imageDecodeOptions;
            this.jobScheduler = new JobScheduler(decodeProducer.getExecutor(), new JobScheduler.JobRunnable() { // from class: com.facebook.imagepipeline.producers.DecodeProducer$ProgressiveDecoder$$ExternalSyntheticLambda0
                @Override // com.facebook.imagepipeline.producers.JobScheduler.JobRunnable
                public final void run(EncodedImage encodedImage, int i3) throws Throwable {
                    DecodeProducer.ProgressiveDecoder._init_$lambda$2(this.f$0, decodeProducer, i2, encodedImage, i3);
                }
            }, imageDecodeOptions.minDecodeIntervalMs);
            producerContext.addCallbacks(new BaseProducerContextCallbacks() { // from class: com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder.1
                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onCancellationRequested() {
                    if (z2) {
                        ProgressiveDecoder.this.handleCancellation();
                    }
                }

                @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
                public void onIsIntermediateResultExpectedChanged() {
                    if (ProgressiveDecoder.this.producerContext.isIntermediateResultExpected()) {
                        ProgressiveDecoder.this.jobScheduler.scheduleJob();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(ProgressiveDecoder this$0, DecodeProducer this$1, int i2, EncodedImage encodedImage, int i3) throws Throwable {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (encodedImage != null) {
                ImageRequest imageRequest = this$0.producerContext.getImageRequest();
                this$0.producerContext.putExtra("image_format", encodedImage.getImageFormat().getName());
                Uri sourceUri = imageRequest.getSourceUri();
                encodedImage.setSource(sourceUri != null ? sourceUri.toString() : null);
                boolean zStatusHasFlag = BaseConsumer.statusHasFlag(i3, 16);
                if ((this$1.getDownsampleMode() == DownsampleMode.ALWAYS || (this$1.getDownsampleMode() == DownsampleMode.AUTO && !zStatusHasFlag)) && (this$1.getDownsampleEnabledForNetwork() || !UriUtil.isNetworkUri(imageRequest.getSourceUri()))) {
                    RotationOptions rotationOptions = imageRequest.getRotationOptions();
                    Intrinsics.checkNotNullExpressionValue(rotationOptions, "request.rotationOptions");
                    encodedImage.setSampleSize(DownsampleUtil.determineSampleSize(rotationOptions, imageRequest.getResizeOptions(), encodedImage, i2));
                }
                if (this$0.producerContext.getImagePipelineConfig().getExperiments().getDownsampleIfLargeBitmap()) {
                    this$0.maybeIncreaseSampleSize(encodedImage);
                }
                this$0.doDecode(encodedImage, i3, this$0.lastScheduledScanNumber);
            }
        }

        private final void doDecode(EncodedImage encodedImage, int i2, int i3) throws Throwable {
            String name;
            CloseableImage closeableImageInternalDecode;
            ProgressiveDecoder progressiveDecoder = this;
            int i4 = i2;
            if ((encodedImage.getImageFormat() != DefaultImageFormats.JPEG && BaseConsumer.isNotLast(i4)) || progressiveDecoder.isFinished || !EncodedImage.isValid(encodedImage)) {
                return;
            }
            if (Intrinsics.areEqual(encodedImage.getImageFormat(), DefaultImageFormats.GIF) && DecodeProducer.Companion.isTooBig(encodedImage, progressiveDecoder.imageDecodeOptions)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + encodedImage.getWidth() + ", h = " + encodedImage.getHeight() + ", pixel config = " + progressiveDecoder.imageDecodeOptions.bitmapConfig + ", max bitmap size = 104857600");
                progressiveDecoder.producerListener.onProducerFinishWithFailure(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME, illegalStateException, null);
                progressiveDecoder.handleError(illegalStateException);
                return;
            }
            ImageFormat imageFormat = encodedImage.getImageFormat();
            if (imageFormat == null || (name = imageFormat.getName()) == null) {
                name = "unknown";
            }
            String str = encodedImage.getWidth() + "x" + encodedImage.getHeight();
            String strValueOf = String.valueOf(encodedImage.getSampleSize());
            boolean zIsLast = BaseConsumer.isLast(i4);
            boolean z2 = zIsLast && !BaseConsumer.statusHasFlag(i4, 8);
            boolean zStatusHasFlag = BaseConsumer.statusHasFlag(i4, 4);
            ResizeOptions resizeOptions = progressiveDecoder.producerContext.getImageRequest().getResizeOptions();
            String str2 = resizeOptions != null ? resizeOptions.width + "x" + resizeOptions.height : "unknown";
            try {
                long queuedTime = progressiveDecoder.jobScheduler.getQueuedTime();
                String string = progressiveDecoder.producerContext.getImageRequest().getSourceUri().toString();
                Intrinsics.checkNotNullExpressionValue(string, "producerContext.imageRequest.sourceUri.toString()");
                int size = (z2 || zStatusHasFlag) ? encodedImage.getSize() : progressiveDecoder.getIntermediateImageEndOffset(encodedImage);
                QualityInfo quality = (z2 || zStatusHasFlag) ? ImmutableQualityInfo.FULL_QUALITY : progressiveDecoder.getQualityInfo();
                progressiveDecoder.producerListener.onProducerStart(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME);
                try {
                    try {
                        Intrinsics.checkNotNullExpressionValue(quality, "quality");
                        closeableImageInternalDecode = progressiveDecoder.internalDecode(encodedImage, size, quality);
                        try {
                            if (encodedImage.getSampleSize() != 1) {
                                i4 = (-1) - (((-1) - i4) & ((-1) - 16));
                            }
                            progressiveDecoder.producerListener.onProducerFinishWithSuccess(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME, progressiveDecoder.getExtraMap(closeableImageInternalDecode, queuedTime, quality, zIsLast, name, str, str2, strValueOf));
                            progressiveDecoder.setImageExtras(encodedImage, closeableImageInternalDecode, i3);
                            progressiveDecoder.handleResult(closeableImageInternalDecode, i4);
                            EncodedImage.closeSafely(encodedImage);
                        } catch (Exception e2) {
                            e = e2;
                            Intrinsics.checkNotNullExpressionValue(quality, "quality");
                            progressiveDecoder = progressiveDecoder;
                            try {
                                progressiveDecoder.producerListener.onProducerFinishWithFailure(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME, e, progressiveDecoder.getExtraMap(closeableImageInternalDecode, queuedTime, quality, zIsLast, name, str, str2, strValueOf));
                                progressiveDecoder.handleError(e);
                                EncodedImage.closeSafely(encodedImage);
                            } catch (Throwable th) {
                                th = th;
                                EncodedImage.closeSafely(encodedImage);
                                throw th;
                            }
                        }
                    } catch (DecodeException e3) {
                        try {
                            EncodedImage encodedImage2 = e3.getEncodedImage();
                            try {
                                FLog.w(progressiveDecoder.TAG, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e3.getMessage(), string, encodedImage2.getFirstBytesAsHexString(10), Integer.valueOf(encodedImage2.getSize()));
                                throw e3;
                            } catch (Exception e4) {
                                e = e4;
                                closeableImageInternalDecode = null;
                                Intrinsics.checkNotNullExpressionValue(quality, "quality");
                                progressiveDecoder = progressiveDecoder;
                                progressiveDecoder.producerListener.onProducerFinishWithFailure(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME, e, progressiveDecoder.getExtraMap(closeableImageInternalDecode, queuedTime, quality, zIsLast, name, str, str2, strValueOf));
                                progressiveDecoder.handleError(e);
                                EncodedImage.closeSafely(encodedImage);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            EncodedImage.closeSafely(encodedImage);
                            throw th;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    closeableImageInternalDecode = null;
                    Intrinsics.checkNotNullExpressionValue(quality, "quality");
                    progressiveDecoder = progressiveDecoder;
                    progressiveDecoder.producerListener.onProducerFinishWithFailure(progressiveDecoder.producerContext, DecodeProducer.PRODUCER_NAME, e, progressiveDecoder.getExtraMap(closeableImageInternalDecode, queuedTime, quality, zIsLast, name, str, str2, strValueOf));
                    progressiveDecoder.handleError(e);
                    EncodedImage.closeSafely(encodedImage);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final Map<String, String> getExtraMap(CloseableImage closeableImage, long j2, QualityInfo qualityInfo, boolean z2, String str, String str2, String str3, String str4) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.producerListener.requiresExtraMap(this.producerContext, DecodeProducer.PRODUCER_NAME)) {
                return null;
            }
            String strValueOf = String.valueOf(j2);
            String strValueOf2 = String.valueOf(qualityInfo.isOfGoodEnoughQuality());
            String strValueOf3 = String.valueOf(z2);
            if (closeableImage != null && (extras = closeableImage.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(closeableImage instanceof CloseableStaticBitmap)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (string != null) {
                    map.put("non_fatal_decode_error", string);
                }
                return ImmutableMap.copyOf((Map) map);
            }
            Bitmap underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap();
            Intrinsics.checkNotNullExpressionValue(underlyingBitmap, "image.underlyingBitmap");
            String str5 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str5);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            map2.put("byteCount", new StringBuilder().append(underlyingBitmap.getByteCount()).toString());
            if (string != null) {
                map2.put("non_fatal_decode_error", string);
            }
            return ImmutableMap.copyOf((Map) map2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleCancellation() {
            maybeFinish(true);
            getConsumer().onCancellation();
        }

        private final void handleError(Throwable th) {
            maybeFinish(true);
            getConsumer().onFailure(th);
        }

        private final void handleResult(CloseableImage closeableImage, int i2) {
            CloseableReference<CloseableImage> closeableReferenceCreate = this.this$0.getCloseableReferenceFactory().create(closeableImage);
            try {
                maybeFinish(BaseConsumer.isLast(i2));
                getConsumer().onNewResult(closeableReferenceCreate, i2);
            } finally {
                CloseableReference.closeSafely(closeableReferenceCreate);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final com.facebook.imagepipeline.image.CloseableImage internalDecode(com.facebook.imagepipeline.image.EncodedImage r4, int r5, com.facebook.imagepipeline.image.QualityInfo r6) {
            /*
                r3 = this;
                com.facebook.imagepipeline.producers.DecodeProducer r0 = r3.this$0
                java.lang.Runnable r0 = r0.getReclaimMemoryRunnable()
                if (r0 == 0) goto L22
                com.facebook.imagepipeline.producers.DecodeProducer r0 = r3.this$0
                com.facebook.common.internal.Supplier r0 = r0.getRecoverFromDecoderOOM()
                java.lang.Object r1 = r0.get()
                java.lang.String r0 = "recoverFromDecoderOOM.get()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r0 = r1.booleanValue()
                if (r0 == 0) goto L22
                r2 = 1
                goto L23
            L22:
                r2 = 0
            L23:
                com.facebook.imagepipeline.producers.DecodeProducer r0 = r3.this$0     // Catch: java.lang.OutOfMemoryError -> L30
                com.facebook.imagepipeline.decoder.ImageDecoder r1 = r0.getImageDecoder()     // Catch: java.lang.OutOfMemoryError -> L30
                com.facebook.imagepipeline.common.ImageDecodeOptions r0 = r3.imageDecodeOptions     // Catch: java.lang.OutOfMemoryError -> L30
                com.facebook.imagepipeline.image.CloseableImage r0 = r1.decode(r4, r5, r6, r0)     // Catch: java.lang.OutOfMemoryError -> L30
                goto L4d
            L30:
                r0 = move-exception
                if (r2 == 0) goto L4e
                com.facebook.imagepipeline.producers.DecodeProducer r0 = r3.this$0
                java.lang.Runnable r0 = r0.getReclaimMemoryRunnable()
                if (r0 == 0) goto L3e
                r0.run()
            L3e:
                java.lang.System.gc()
                com.facebook.imagepipeline.producers.DecodeProducer r0 = r3.this$0
                com.facebook.imagepipeline.decoder.ImageDecoder r1 = r0.getImageDecoder()
                com.facebook.imagepipeline.common.ImageDecodeOptions r0 = r3.imageDecodeOptions
                com.facebook.imagepipeline.image.CloseableImage r0 = r1.decode(r4, r5, r6, r0)
            L4d:
                return r0
            L4e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder.internalDecode(com.facebook.imagepipeline.image.EncodedImage, int, com.facebook.imagepipeline.image.QualityInfo):com.facebook.imagepipeline.image.CloseableImage");
        }

        private final void maybeFinish(boolean z2) {
            synchronized (this) {
                if (z2) {
                    if (!this.isFinished) {
                        getConsumer().onProgressUpdate(1.0f);
                        this.isFinished = true;
                        Unit unit = Unit.INSTANCE;
                        this.jobScheduler.clearJob();
                    }
                }
            }
        }

        private final void maybeIncreaseSampleSize(EncodedImage encodedImage) {
            if (encodedImage.getImageFormat() != DefaultImageFormats.JPEG) {
                return;
            }
            encodedImage.setSampleSize(DownsampleUtil.determineSampleSizeJPEG(encodedImage, BitmapUtil.getPixelSizeForBitmapConfig(this.imageDecodeOptions.bitmapConfig), DecodeProducer.MAX_BITMAP_SIZE));
        }

        private final void setImageExtras(EncodedImage encodedImage, CloseableImage closeableImage, int i2) {
            this.producerContext.putExtra("encoded_width", Integer.valueOf(encodedImage.getWidth()));
            this.producerContext.putExtra("encoded_height", Integer.valueOf(encodedImage.getHeight()));
            this.producerContext.putExtra("encoded_size", Integer.valueOf(encodedImage.getSize()));
            this.producerContext.putExtra("image_color_space", encodedImage.getColorSpace());
            if (closeableImage instanceof CloseableBitmap) {
                this.producerContext.putExtra("bitmap_config", String.valueOf(((CloseableBitmap) closeableImage).getUnderlyingBitmap().getConfig()));
            }
            if (closeableImage != null) {
                closeableImage.putExtras(this.producerContext.getExtras());
            }
            this.producerContext.putExtra("last_scan_num", Integer.valueOf(i2));
        }

        protected abstract int getIntermediateImageEndOffset(EncodedImage encodedImage);

        protected final int getLastScheduledScanNumber() {
            return this.lastScheduledScanNumber;
        }

        protected abstract QualityInfo getQualityInfo();

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onCancellationImpl() {
            handleCancellation();
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        public void onFailureImpl(Throwable t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            handleError(t2);
        }

        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public void onNewResultImpl(EncodedImage encodedImage, int i2) {
            FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
            if (!FrescoSystrace.isTracing()) {
                boolean zIsLast = BaseConsumer.isLast(i2);
                if (zIsLast) {
                    if (encodedImage == null) {
                        boolean zAreEqual = Intrinsics.areEqual(this.producerContext.getExtra("cached_value_found"), (Object) true);
                        if (!this.producerContext.getImagePipelineConfig().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.getLowestPermittedRequestLevel() == ImageRequest.RequestLevel.FULL_FETCH || zAreEqual) {
                            handleError(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!encodedImage.isValid()) {
                        handleError(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (updateDecodeJob(encodedImage, i2)) {
                    boolean zStatusHasFlag = BaseConsumer.statusHasFlag(i2, 4);
                    if (zIsLast || zStatusHasFlag || this.producerContext.isIntermediateResultExpected()) {
                        this.jobScheduler.scheduleJob();
                        return;
                    }
                    return;
                }
                return;
            }
            FrescoSystrace.beginSection("DecodeProducer#onNewResultImpl");
            try {
                boolean zIsLast2 = BaseConsumer.isLast(i2);
                if (zIsLast2) {
                    if (encodedImage == null) {
                        boolean zAreEqual2 = Intrinsics.areEqual(this.producerContext.getExtra("cached_value_found"), (Object) true);
                        if (this.producerContext.getImagePipelineConfig().getExperiments().getCancelDecodeOnCacheMiss()) {
                            if (this.producerContext.getLowestPermittedRequestLevel() != ImageRequest.RequestLevel.FULL_FETCH) {
                                if (zAreEqual2) {
                                }
                            }
                        }
                        handleError(new ExceptionWithNoStacktrace("Encoded image is null."));
                        return;
                    }
                    if (!encodedImage.isValid()) {
                        handleError(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (updateDecodeJob(encodedImage, i2)) {
                    boolean zStatusHasFlag2 = BaseConsumer.statusHasFlag(i2, 4);
                    if (zIsLast2 || zStatusHasFlag2 || this.producerContext.isIntermediateResultExpected()) {
                        this.jobScheduler.scheduleJob();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
                FrescoSystrace.endSection();
            }
        }

        @Override // com.facebook.imagepipeline.producers.DelegatingConsumer, com.facebook.imagepipeline.producers.BaseConsumer
        protected void onProgressUpdateImpl(float f2) {
            super.onProgressUpdateImpl(f2 * 0.99f);
        }

        protected final void setLastScheduledScanNumber(int i2) {
            this.lastScheduledScanNumber = i2;
        }

        protected boolean updateDecodeJob(EncodedImage encodedImage, int i2) {
            return this.jobScheduler.updateJob(encodedImage, i2);
        }
    }

    public DecodeProducer(ByteArrayPool byteArrayPool, Executor executor, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, DownsampleMode downsampleMode, boolean z2, boolean z3, Producer<EncodedImage> inputProducer, int i2, CloseableReferenceFactory closeableReferenceFactory, Runnable runnable, Supplier<Boolean> recoverFromDecoderOOM) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.byteArrayPool = byteArrayPool;
        this.executor = executor;
        this.imageDecoder = imageDecoder;
        this.progressiveJpegConfig = progressiveJpegConfig;
        this.downsampleMode = downsampleMode;
        this.downsampleEnabledForNetwork = z2;
        this.decodeCancellationEnabled = z3;
        this.inputProducer = inputProducer;
        this.maxBitmapSize = i2;
        this.closeableReferenceFactory = closeableReferenceFactory;
        this.reclaimMemoryRunnable = runnable;
        this.recoverFromDecoderOOM = recoverFromDecoderOOM;
    }

    public final ByteArrayPool getByteArrayPool() {
        return this.byteArrayPool;
    }

    public final CloseableReferenceFactory getCloseableReferenceFactory() {
        return this.closeableReferenceFactory;
    }

    public final boolean getDecodeCancellationEnabled() {
        return this.decodeCancellationEnabled;
    }

    public final boolean getDownsampleEnabledForNetwork() {
        return this.downsampleEnabledForNetwork;
    }

    public final DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final ImageDecoder getImageDecoder() {
        return this.imageDecoder;
    }

    public final Producer<EncodedImage> getInputProducer() {
        return this.inputProducer;
    }

    public final int getMaxBitmapSize() {
        return this.maxBitmapSize;
    }

    public final ProgressiveJpegConfig getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    public final Runnable getReclaimMemoryRunnable() {
        return this.reclaimMemoryRunnable;
    }

    public final Supplier<Boolean> getRecoverFromDecoderOOM() {
        return this.recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            ImageRequest imageRequest = context.getImageRequest();
            this.inputProducer.produceResults((UriUtil.isNetworkUri(imageRequest.getSourceUri()) || ImageRequestBuilder.isCustomNetworkUri(imageRequest.getSourceUri())) ? new NetworkImagesProgressiveDecoder(this, consumer, context, new ProgressiveJpegParser(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapSize) : new LocalImagesProgressiveDecoder(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapSize), context);
            return;
        }
        FrescoSystrace.beginSection("DecodeProducer#produceResults");
        try {
            ImageRequest imageRequest2 = context.getImageRequest();
            this.inputProducer.produceResults((UriUtil.isNetworkUri(imageRequest2.getSourceUri()) || ImageRequestBuilder.isCustomNetworkUri(imageRequest2.getSourceUri())) ? new NetworkImagesProgressiveDecoder(this, consumer, context, new ProgressiveJpegParser(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapSize) : new LocalImagesProgressiveDecoder(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapSize), context);
            Unit unit = Unit.INSTANCE;
        } finally {
            FrescoSystrace.endSection();
        }
    }
}
