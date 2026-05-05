package io.cobrowse;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class SurfaceCapture {
    private Handler backgroundHandler;
    private HandlerThread backgroundHandlerThread;
    private final ConcurrentHashMap<Integer, Bitmap> cache = new ConcurrentHashMap<>();

    private Bitmap capture(SurfaceView surfaceView) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.cobrowse.SurfaceCapture.1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public void onPixelCopyFinished(int i2) {
                    if (i2 != 0) {
                        String str = "Cannot capture SurfaceView pixel data; result is " + i2;
                    }
                }
            }, this.backgroundHandler);
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private void draw(View view, Bitmap bitmap, Canvas canvas) {
        view.getLocationOnScreen(new int[2]);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        Matrix matrix = new Matrix(view.getMatrix());
        matrix.postTranslate(r5[0], r5[1]);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    private void invokeInBackground(Runnable runnable) throws Throwable {
        if (this.backgroundHandlerThread == null) {
            short sXd = (short) (OY.Xd() ^ 3309);
            int[] iArr = new int["m\u0011\u000f\u0004\u007f\u0003\u0006d\u0004\u0014\u0019\u001b\u0019\r".length()];
            QB qb = new QB("m\u0011\u000f\u0004\u007f\u0003\u0006d\u0004\u0014\u0019\u001b\u0019\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            HandlerThread handlerThread = new HandlerThread(new String(iArr, 0, i2));
            this.backgroundHandlerThread = handlerThread;
            handlerThread.start();
            this.backgroundHandler = new Handler(this.backgroundHandlerThread.getLooper());
        }
        Handler handler = this.backgroundHandler;
        Class<?> cls = Class.forName(Wg.Zd("r6#,#X\n\u0012JI}K\u001bf\u0013Vi1", (short) (C1580rY.Xd() ^ (-31248)), (short) (C1580rY.Xd() ^ (-16848))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSx\u001d\u0017\u0018\f\u000e\u0019\u0013", (short) (C1580rY.Xd() ^ (-22411))))};
        Object[] objArr = {runnable};
        short sXd2 = (short) (FB.Xd() ^ 13152);
        int[] iArr2 = new int["cchj".length()];
        QB qb2 = new QB("cchj");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public boolean capture(View view, Canvas canvas) throws Throwable {
        if (view instanceof TextureView) {
            final TextureView textureView = (TextureView) view;
            Bitmap bitmap = this.cache.get(Integer.valueOf(textureView.hashCode()));
            if (bitmap != null) {
                draw(textureView, bitmap, canvas);
            }
            invokeInBackground(new Runnable() { // from class: io.cobrowse.SurfaceCapture$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8849lambda$capture$0$iocobrowseSurfaceCapture(textureView);
                }
            });
            return true;
        }
        if (view instanceof SurfaceView) {
            final SurfaceView surfaceView = (SurfaceView) view;
            Bitmap bitmap2 = this.cache.get(Integer.valueOf(surfaceView.hashCode()));
            if (bitmap2 != null) {
                draw(surfaceView, bitmap2, canvas);
            }
            invokeInBackground(new Runnable() { // from class: io.cobrowse.SurfaceCapture$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8850lambda$capture$1$iocobrowseSurfaceCapture(surfaceView);
                }
            });
            return true;
        }
        int i2 = 0;
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ?? r2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            boolean zCapture = capture(viewGroup.getChildAt(i2), canvas);
            int i3 = (r2 + (zCapture ? 1 : 0)) - (r2 & (zCapture ? 1 : 0));
            boolean z2 = true;
            if (i3 != 1) {
                z2 = false;
            }
            i2++;
            r2 = z2;
        }
        return r2;
    }

    public void clear() {
        HandlerThread handlerThread = this.backgroundHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.backgroundHandlerThread = null;
            this.backgroundHandler = null;
        }
        this.cache.clear();
    }

    /* JADX INFO: renamed from: lambda$capture$0$io-cobrowse-SurfaceCapture, reason: not valid java name */
    /* synthetic */ void m8849lambda$capture$0$iocobrowseSurfaceCapture(TextureView textureView) {
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return;
        }
        this.cache.put(Integer.valueOf(textureView.hashCode()), bitmap);
    }

    /* JADX INFO: renamed from: lambda$capture$1$io-cobrowse-SurfaceCapture, reason: not valid java name */
    /* synthetic */ void m8850lambda$capture$1$iocobrowseSurfaceCapture(SurfaceView surfaceView) {
        Bitmap bitmapCapture = capture(surfaceView);
        if (bitmapCapture == null) {
            return;
        }
        this.cache.put(Integer.valueOf(surfaceView.hashCode()), bitmapCapture);
    }
}
