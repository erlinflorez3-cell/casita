package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
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
/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u0010s{J$c$wDCU(\u0011*\tUO\u007f$|Ϻr\u000bq\u000e6\u001a\u0007jDI\u0004y\u000e\u0016\u001d4Zom4}uC9nwN\u0005N6R>\u007f\u0005\u000f\u001fBH>|+IQ\f 7XphZԁLĨܨ\u0016\bD)\u000f(t6\\A`l\fFW#1hrT-_>\ne\rtUW\u0013|a,9X7c\u0016UY\t\u0007`[W\u0003mrm\u000bn'5-as\u00067\t\u0006\u001a\u00159^%]!6\r\u000bW`\u001a8CO\u0012L\u0001\u0014.w\t\u000e%<2\u000fͽ'M60 ǳ$<2Ϩvf"}, d2 = {"\u0017lP4X\tBb!z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "EhSA[", "", "6dX4[;", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "6`b\u000e_7AO", "", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "\u0017lP4X\tBb!z\u0006&?v\u0003vh^\u0018", "uH8\u0016M\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuK\u000f7s\u0004\u0010\u0014\u001c~Nx>X\u0010$}$}=4>", "Bn?6k,E;\u0015\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n ]\u0011 >U\u00129#", "AsP?g\u001f", "AsP?g ", "0tU3X9", "", "0tU3X9(T\u001a\rzm", "Asa6W,", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageBitmapKt {
    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7, int i8, Object obj) {
        if ((-1) - (((-1) - i8) | ((-1) - 1)) != 0) {
            i2 = 0;
        }
        if ((2 & i8) != 0) {
            i3 = 0;
        }
        if ((4 & i8) != 0) {
            i4 = imageBitmap.getWidth();
        }
        if ((i8 + 8) - (8 | i8) != 0) {
            i5 = imageBitmap.getHeight();
        }
        if ((i8 + 16) - (16 | i8) != 0) {
            iArr = new int[i4 * i5];
        }
        if ((-1) - (((-1) - i8) | ((-1) - 32)) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = i4;
        }
        return toPixelMap(imageBitmap, i2, i3, i4, i5, iArr, i6, i7);
    }

    public static final PixelMap toPixelMap(ImageBitmap imageBitmap, int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) {
        imageBitmap.readPixels(iArr, i2, i3, i4, i5, i6, i7);
        return new PixelMap(iArr, i4, i5, i6, i7);
    }

    /* JADX INFO: renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m4404ImageBitmapx__hDU$default(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace, int i5, Object obj) {
        if ((4 & i5) != 0) {
            i4 = ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
        }
        if ((i5 + 8) - (8 | i5) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m4403ImageBitmapx__hDU(i2, i3, i4, z2, colorSpace);
    }

    /* JADX INFO: renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m4403ImageBitmapx__hDU(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m4046ActualImageBitmapx__hDU(i2, i3, i4, z2, colorSpace);
    }
}
