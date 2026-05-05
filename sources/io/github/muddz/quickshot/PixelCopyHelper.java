package io.github.muddz.quickshot;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes3.dex */
class PixelCopyHelper {

    interface PixelCopyListener {
        void onSurfaceBitmapError(String str);

        void onSurfaceBitmapReady(Bitmap bitmap);
    }

    PixelCopyHelper() {
    }

    static void getSurfaceBitmap(SurfaceView surfaceView, final PixelCopyListener pixelCopyListener) {
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        final HandlerThread handlerThread = new HandlerThread("PixelCopyHelper");
        handlerThread.start();
        PixelCopy.request(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.github.muddz.quickshot.PixelCopyHelper.1
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public void onPixelCopyFinished(int i2) {
                if (i2 == 0) {
                    pixelCopyListener.onSurfaceBitmapReady(bitmapCreateBitmap);
                } else {
                    pixelCopyListener.onSurfaceBitmapError("Couldn't create bitmap of the SurfaceView");
                }
                handlerThread.quitSafely();
            }
        }, new Handler(handlerThread.getLooper()));
    }
}
