package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
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
/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u0010s{J$c$wCCU0}*\tUQ\u007f |Ϻr\u000bq\u000e6\u001a\u0007jDI\u0004y\u000e\u0016\u001d4Zom4}sK<xtd\tP60=\u0012\u0005/ ZL\u001e}\u0013Cy\u0014Xؓфoíň\u0011O\u000b# \u0010V(\u000f)tg|Bpl\f9G+\u0011vZNU^X|{\u0019^h5\u001b\u000faL:h7c\u0019kمЁ\u0006ѸÜC\u0005E\u0002K\u0016\u000165=as\u0006:\u0001\u007fB$q˽ոar4oӧQe\u0014*1մ\u007fyO˔,\f"}, d2 = {"\u000fbcBT3\"[\u0015\u0001z;0\f\u0011+p", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "EhSA[", "", "6dX4[;", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "6`b\u000e_7AO", "", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "\u000fbcBT3\"[\u0015\u0001z;0\f\u0011+pG;u:H\u001au7", "uH8\u0016M\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuK\u000f7s\u0004\u0010\u0014\u001c~Nx>X\u0010$}$}=4>", "/r0;W9HW\u0018[~m4x\u0014", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "/r8:T.>0\u001d\u000e\u0003Z7", "Bn16g4:^v\t\u0004_0~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "Bn16g4:^v\t\u0004_0~PzJd'n\u000f\\", "uH\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n]\u001b&Ok\u0019zT/>Z\u0002\"\r", "Bn8:T.>1#\b{b.", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013R.kF\u007f&9[Sc\u001b", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m4046ActualImageBitmapx__hDU(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace) {
        m4047toBitmapConfig1JJdX4A(i4);
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, m4047toBitmapConfig1JJdX4A(i4), z2, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace)));
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m4047toBitmapConfig1JJdX4A(int i2) {
        if (ImageBitmapConfig.m4394equalsimpl0(i2, ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m4394equalsimpl0(i2, ImageBitmapConfig.Companion.m4398getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m4394equalsimpl0(i2, ImageBitmapConfig.Companion.m4402getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        if (ImageBitmapConfig.m4394equalsimpl0(i2, ImageBitmapConfig.Companion.m4400getF16_sVssgQ())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (ImageBitmapConfig.m4394equalsimpl0(i2, ImageBitmapConfig.Companion.m4401getGpu_sVssgQ())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m4398getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m4402getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return ImageBitmapConfig.Companion.m4400getF16_sVssgQ();
        }
        if (config == Bitmap.Config.HARDWARE) {
            return ImageBitmapConfig.Companion.m4401getGpu_sVssgQ();
        }
        return ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
    }
}
