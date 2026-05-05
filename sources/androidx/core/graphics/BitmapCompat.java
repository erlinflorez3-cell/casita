package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class BitmapCompat {
    static int sizeAtStep(int i2, int i3, int i4, int i5) {
        return i4 == 0 ? i3 : i4 > 0 ? i2 * (1 << (i5 - i4)) : i3 << ((-i4) - 1);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00063+ ~p+Q9P\u0017\u001f`!1/R8", imports = {})
    @Deprecated
    public static boolean hasMipMap(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00063+ ~p+\\=Q\u0012\u0017c!9/wpl\u000fK)&>GR\u001b\u001b'C", imports = {})
    @Deprecated
    public static void setHasMipMap(Bitmap bitmap, boolean z2) {
        bitmap.setHasMipMap(z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00063+ ~p+P=Q\u000b\"\\C3 \u001fxkU%A'V!QC(+B1", imports = {})
    @Deprecated
    public static int getAllocationByteCount(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, int i2, int i3, Rect rect, boolean z2) {
        double dFloor;
        double dFloor2;
        Bitmap bitmap2;
        Bitmap bitmapCreateBitmap;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        Bitmap bitmapCopyBitmapIfHardware = Build.VERSION.SDK_INT >= 27 ? Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f2 = i2 / iWidth;
        float f3 = i3 / iHeight;
        int i4 = rect != null ? rect.left : 0;
        int i5 = rect != null ? rect.top : 0;
        int i6 = 1;
        if (i4 == 0 && i5 == 0 && i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapCopyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : bitmapCopyBitmapIfHardware;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setPaintBlendMode(paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i2 && iHeight == i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i2, i3, bitmapCopyBitmapIfHardware.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCopyBitmapIfHardware, -i4, -i5, paint);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        if (f2 > 1.0f) {
            dFloor = Math.ceil(Math.log(f2) / dLog);
        } else {
            dFloor = Math.floor(Math.log(f2) / dLog);
        }
        int i7 = (int) dFloor;
        if (f3 > 1.0f) {
            dFloor2 = Math.ceil(Math.log(f3) / dLog);
        } else {
            dFloor2 = Math.floor(Math.log(f3) / dLog);
        }
        int i8 = (int) dFloor2;
        if (z2 && Build.VERSION.SDK_INT >= 27 && !Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            Bitmap bitmapCreateBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(i7 > 0 ? sizeAtStep(iWidth, i2, 1, i7) : iWidth, i8 > 0 ? sizeAtStep(iHeight, i3, 1, i8) : iHeight, bitmap, true);
            new Canvas(bitmapCreateBitmapWithSourceColorspace).drawBitmap(bitmapCopyBitmapIfHardware, -i4, -i5, paint);
            i5 = 0;
            i4 = 0;
            bitmap2 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmapWithSourceColorspace;
        } else {
            bitmap2 = null;
            i6 = 0;
        }
        Rect rect2 = new Rect(i4, i5, iWidth, iHeight);
        Rect rect3 = new Rect();
        int i9 = i7;
        int i10 = i8;
        while (true) {
            if (i9 == 0 && i10 == 0) {
                break;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            boolean z3 = false;
            rect3.set(0, 0, sizeAtStep(iWidth, i2, i9, i7), sizeAtStep(iHeight, i3, i10, i8));
            boolean z4 = i9 == 0 && i10 == 0;
            if (bitmap2 != null && bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3) {
                z3 = true;
            }
            if (bitmap2 != null && bitmap2 != bitmap && ((!z2 || Build.VERSION.SDK_INT < 27 || Api27Impl.isAlreadyF16AndLinear(bitmap2)) && (!z4 || (z3 && i6 == 0)))) {
                bitmapCreateBitmap = bitmap2;
            } else {
                if (bitmap2 != bitmap && bitmap2 != null) {
                    bitmap2.recycle();
                }
                int iSizeAtStep = sizeAtStep(iWidth, i2, i9 > 0 ? i6 : i9, i7);
                int iSizeAtStep2 = sizeAtStep(iHeight, i3, i10 > 0 ? i6 : i10, i8);
                if (Build.VERSION.SDK_INT >= 27) {
                    bitmapCreateBitmap = Api27Impl.createBitmapWithSourceColorspace(iSizeAtStep, iSizeAtStep2, bitmap, z2 && !z4);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(iSizeAtStep, iSizeAtStep2, bitmapCopyBitmapIfHardware.getConfig());
                }
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect2, rect3, paint);
            rect2.set(rect3);
            bitmap2 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapCopyBitmapIfHardware;
    }

    private BitmapCompat() {
    }

    static class Api27Impl {
        private Api27Impl() {
        }

        static Bitmap createBitmapWithSourceColorspace(int i2, int i3, Bitmap bitmap, boolean z2) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z2 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config hardwareBitmapConfig = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                hardwareBitmapConfig = Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(hardwareBitmapConfig, true);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }
}
