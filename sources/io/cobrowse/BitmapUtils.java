package io.cobrowse;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes3.dex */
class BitmapUtils {
    BitmapUtils() {
    }

    static Bitmap copy(Bitmap bitmap) {
        return bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
    }

    static void copy(Bitmap bitmap, Bitmap bitmap2) {
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    static boolean sameSize(Bitmap bitmap, Bitmap bitmap2) {
        return bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight();
    }
}
