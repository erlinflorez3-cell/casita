package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.ZS0\u000fs{J$c$\bCCU(}*\teNogtJb\u000bY\u000f\u000e\u0016\u000fj4I[~u3\u001d˰Zom2}sK9xtd\u0006P60:\u0012\u0005/\u001bZN\u0016v\tFc\f@4\u0007\u0088@jB[Ĩ2\u00124=P\u0005,\\\u007fNdI\u001daH1;\u0003\u0018C~-e0\u000bP%F\u0003+=|g\u001e9EO5C+\u0004\t\rRiF\u001b? EKؚ-?OW|o6\u0007~<\u0015YN=r\u00010t\u0016ab\u001c'Y[sM`\u000eV\u0005)\u0007Ɂ@\u0004\u0014\u0014mΥ4E-t\u0017&3#x{@~\u0001\u000fF\u000e\u000by6E6FĘ3Q.t`y;GT_{3\fN'\u000f~9[\u0003 'ڄ#l\u0013_Di@kIv\n\b<\u001e\b~v\u001a*21w\u0004=\u0011).E&}يA;Fy\u0018`D\u0016u-`\u0017R\u001aVV@:nD8Z\r\u001a\\\\d3l\u0001Z^,\u001fd4T5\u0004Nʽ&t\u001dJ9=\u0010|\\\u0011i\u0019L\u000e\u000e3C~7\bo\u001c\u0012eNv3cR\u0014\u0016gQ\u0005-W<\u0011\u0006\u001fٯJΖ\u0010t"}, d2 = {"1qT.g,\u001bW(\u0007vi", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "EhSA[", "", "6dX4[;", "1n]3\\.", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", "6`b\u000e_7AO", "", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$\u0005Rk\f<L", "/o_9l\n:\\*z\t", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AT0Ga", ">", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "5dc", "F", "G", "AbP9X", "4h[AX9", "Adc", "1n[<e", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, Function1<? super Canvas, Unit> function1) {
        function1.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final int get(Bitmap bitmap, int i2, int i3) {
        return bitmap.getPixel(i2, i3);
    }

    public static final void set(Bitmap bitmap, int i2, int i3, int i4) {
        bitmap.setPixel(i2, i3, i4);
    }

    public static final Bitmap scale(Bitmap bitmap, int i2, int i3, boolean z2) {
        return Bitmap.createScaledBitmap(bitmap, i2, i3, z2);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 + 4) - (i4 | 4) != 0) {
            z2 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i3, z2);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, boolean z2, ColorSpace colorSpace, int i4, Object obj) {
        if ((4 & i4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i4 + 8) - (8 | i4) != 0) {
            z2 = true;
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
    }

    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config, boolean z2, ColorSpace colorSpace) {
        return Bitmap.createBitmap(i2, i3, config, z2, colorSpace);
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int width = bitmap.getWidth();
        int i2 = point.x;
        return i2 >= 0 && i2 < width && point.y >= 0 && point.y < bitmap.getHeight();
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        return pointF.x >= 0.0f && pointF.x < ((float) bitmap.getWidth()) && pointF.y >= 0.0f && pointF.y < ((float) bitmap.getHeight());
    }
}
