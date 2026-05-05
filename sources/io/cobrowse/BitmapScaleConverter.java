package io.cobrowse;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
class BitmapScaleConverter {
    private final HashSet<Bitmap> cachedBitmap = new HashSet<>();

    BitmapScaleConverter() {
    }

    private Bitmap doResize(Bitmap bitmap, float f2, Point point) {
        int width = (int) (bitmap.getWidth() * f2);
        int i2 = width - (width % point.x);
        float width2 = i2 / bitmap.getWidth();
        int height = (int) (bitmap.getHeight() * width2);
        int i3 = height - (height % point.y);
        float height2 = i3 / bitmap.getHeight();
        Bitmap orCreateBitmap = getOrCreateBitmap(i2, i3, bitmap.getConfig());
        orCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(orCreateBitmap);
        canvas.scale(width2, height2);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return orCreateBitmap;
    }

    private Bitmap downscale(Bitmap bitmap, float f2, float f3, Point point) {
        if (f2 > f3) {
            f2 = f3;
        }
        float f4 = f3 / 2.0f;
        return f4 > f2 ? downscale(doResize(bitmap, 0.5f, new Point(1, 1)), f2, f4, point) : doResize(bitmap, f2 / f3, point);
    }

    private Bitmap getOrCreateBitmap(int i2, int i3, Bitmap.Config config) {
        for (Bitmap bitmap : this.cachedBitmap) {
            if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3 && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
        this.cachedBitmap.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public void clear() {
        this.cachedBitmap.clear();
    }

    public Bitmap createScaledBitmap(Bitmap bitmap, int i2, int i3) {
        return Bitmap.createScaledBitmap(bitmap, i2, i3, true);
    }

    public Bitmap downscale(Bitmap bitmap, float f2) {
        return downscale(bitmap, f2, 1.0f, new Point(1, 1));
    }

    public Bitmap downscale(Bitmap bitmap, float f2, Point point) {
        return downscale(bitmap, f2, 1.0f, point);
    }
}
