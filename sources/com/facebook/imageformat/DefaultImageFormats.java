package com.facebook.imageformat;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005,4\u0012\u0006%nʑA0RnP.XT0Ʀk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0u|Zr\u000bq 6\u001a\u0007|DI\u0004z$\u0017W@P\u0003W3{\u0001m=n\u0007N\u0005N4h=J\u0013\u000f\u001bBH>x1G\"Ð\u0014ضDpBĥ][\u0013\u001d*\u0006l\"7\"3ɩPɇLleŽ\u007f1\u0011mZNUaf\u0001$νHù+\r~ѭn9N<M\u0015SU9\u000b)ÁAƄCqEݛ9551as\u00068\u000f\u0004jƋ-̠\u0011]z̦-\u0013_g$'YQ\u001aO'ʳ*Þ~{\u0015ɝT\u001c\u0014/`.[\u001c\u001d\fdޟvɤW@X\u061c/P\u000e\u0004y6E'67\u0002ݕ\u001dƻUaCϊ\u001fE\n\u000f%\u001eQ\u0003%%2ٲ\u0010\u05ce\u0019\u001b\\ȭ\"?_KUH|\f\u0010ADՖrĊ\u0006*\f\u0382\u0018\u000e=\b).E'm_\u0010\u0602#Ƞ\u0006HLϙG\u0013nuki\u0001Jv&Eݳ9Ҋ\r\fbե5\u0019y^l^<\u0013]\u001c\u0003\t,\u0017I$3ʄ>Ƽ)\u0010Vиſm~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9l<w!E`\r\u0004?i\u0018..MHs0-#>", "", "u(E", "\u0010L?", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "\u0012M6", "\u0015H5", "\u0016D8\u0013", "\u0017B>", "\u0018O4\u0014", "\u001eM6", "%D1\u001dR\b'7\u0001Zi>\u000b", "%D1\u001dR\f1BxgY>\u000b", "%D1\u001dR\f1BxgY>\u000bvz\u0013Tb\"W'kyr", "%D1\u001dR\u0013(A\u0007eZL\u001a", "%D1\u001dR\u001a\";\u0004eZ", "2dU.h3M4#\f\u0003Z;\u000b", "", "7rBAT;BQ\u000b~wi\r\u0007\u00167a\u000f", "", "7lP4X\rH`!z\n", "7rF2U7\u001f]&\u0007vm", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultImageFormats {
    public static final ImageFormat BMP;
    public static final ImageFormat DNG;
    public static final ImageFormat GIF;
    public static final ImageFormat HEIF;
    public static final ImageFormat ICO;
    public static final DefaultImageFormats INSTANCE = new DefaultImageFormats();
    public static final ImageFormat JPEG;
    public static final ImageFormat PNG;
    public static final ImageFormat WEBP_ANIMATED;
    public static final ImageFormat WEBP_EXTENDED;
    public static final ImageFormat WEBP_EXTENDED_WITH_ALPHA;
    public static final ImageFormat WEBP_LOSSLESS;
    public static final ImageFormat WEBP_SIMPLE;
    public static final List<ImageFormat> defaultFormats;

    static {
        ImageFormat imageFormat = new ImageFormat("JPEG", "jpeg");
        JPEG = imageFormat;
        ImageFormat imageFormat2 = new ImageFormat("PNG", "png");
        PNG = imageFormat2;
        ImageFormat imageFormat3 = new ImageFormat("GIF", "gif");
        GIF = imageFormat3;
        ImageFormat imageFormat4 = new ImageFormat("BMP", "bmp");
        BMP = imageFormat4;
        ImageFormat imageFormat5 = new ImageFormat("ICO", "ico");
        ICO = imageFormat5;
        ImageFormat imageFormat6 = new ImageFormat("WEBP_SIMPLE", "webp");
        WEBP_SIMPLE = imageFormat6;
        ImageFormat imageFormat7 = new ImageFormat("WEBP_LOSSLESS", "webp");
        WEBP_LOSSLESS = imageFormat7;
        ImageFormat imageFormat8 = new ImageFormat("WEBP_EXTENDED", "webp");
        WEBP_EXTENDED = imageFormat8;
        ImageFormat imageFormat9 = new ImageFormat("WEBP_EXTENDED_WITH_ALPHA", "webp");
        WEBP_EXTENDED_WITH_ALPHA = imageFormat9;
        ImageFormat imageFormat10 = new ImageFormat("WEBP_ANIMATED", "webp");
        WEBP_ANIMATED = imageFormat10;
        ImageFormat imageFormat11 = new ImageFormat("HEIF", "heif");
        HEIF = imageFormat11;
        DNG = new ImageFormat("DNG", "dng");
        defaultFormats = CollectionsKt.listOf((Object[]) new ImageFormat[]{imageFormat, imageFormat2, imageFormat3, imageFormat4, imageFormat5, imageFormat6, imageFormat7, imageFormat8, imageFormat9, imageFormat10, imageFormat11});
    }

    private DefaultImageFormats() {
    }

    @JvmStatic
    public static final boolean isStaticWebpFormat(ImageFormat imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == WEBP_SIMPLE || imageFormat == WEBP_LOSSLESS || imageFormat == WEBP_EXTENDED || imageFormat == WEBP_EXTENDED_WITH_ALPHA;
    }

    @JvmStatic
    public static final boolean isWebpFormat(ImageFormat imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return isStaticWebpFormat(imageFormat) || imageFormat == WEBP_ANIMATED;
    }
}
