package io.github.muddz.quickshot;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import io.github.muddz.quickshot.PixelCopyHelper;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class QuickShot {
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_NOMEDIA = ".nomedia";
    private static final String EXTENSION_PNG = ".png";
    private static final int JPG_MAX_QUALITY = 100;
    private Bitmap bitmap;
    private Context context;
    private QuickShotListener listener;
    private String path;
    private boolean printStackTrace;
    private View view;
    private int jpgQuality = 100;
    private String fileExtension = EXTENSION_JPG;
    private String filename = String.valueOf(System.currentTimeMillis());

    static class BitmapSaver extends AsyncTask<Void, Void, Void> {
        private Bitmap bitmap;
        private String errorMsg;
        private File file;
        private String fileExtension;
        private String filename;
        private int jpgQuality;
        private QuickShotListener listener;
        private Handler mainThreadHandler;
        private String path;
        private boolean printStacktrace;
        private final WeakReference<Context> weakContext;

        BitmapSaver(Context context, Bitmap bitmap, boolean z2, String str, String str2, String str3, int i2, QuickShotListener quickShotListener) throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(ZO.xd("W;\u000b[-Qw|Y\u0004E*d.'V1", (short) (C1633zX.Xd() ^ (-9797)), (short) (C1633zX.Xd() ^ (-7963)))).getDeclaredMethod(C1626yg.Ud("Q\u007fPA\u0010:[fQ\u001b#x|", (short) (ZN.Xd() ^ 22342), (short) (ZN.Xd() ^ 8396)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mainThreadHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                this.weakContext = new WeakReference<>(context);
                this.bitmap = bitmap;
                this.printStacktrace = z2;
                this.path = str;
                this.filename = str2;
                this.fileExtension = str3;
                this.jpgQuality = i2;
                this.listener = quickShotListener;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ec A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #2 {all -> 0x00f9, blocks: (B:12:0x0098, B:29:0x00e4, B:30:0x00ec, B:26:0x00dc, B:16:0x00bb), top: B:50:0x0098 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void save() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.github.muddz.quickshot.QuickShot.BitmapSaver.save():void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) throws Throwable {
            save();
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() throws Throwable {
            Handler handler = this.mainThreadHandler;
            Runnable runnable = new Runnable() { // from class: io.github.muddz.quickshot.QuickShot.BitmapSaver.1
                @Override // java.lang.Runnable
                public void run() {
                    BitmapSaver.this.listener.onQuickShotFailed(BitmapSaver.this.file.getAbsolutePath(), BitmapSaver.this.errorMsg);
                }
            };
            short sXd = (short) (C1607wl.Xd() ^ 16905);
            int[] iArr = new int["q}r\u007f{tn7wz4Meqfmeq".length()];
            QB qb = new QB("q}r\u007f{tn7wz4Meqfmeq");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (ZN.Xd() ^ 24675);
            int[] iArr2 = new int["\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u007f$\u001e\u001f\u0013\u0015 \u001a".length()];
            QB qb2 = new QB("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u007f$\u001e\u001f\u0013\u0015 \u001a");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(Wg.Zd("Z\u0004Z}", (short) (OY.Xd() ^ 19193), (short) (OY.Xd() ^ 3362)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            this.listener.onQuickShotSuccess(this.file.getAbsolutePath());
            if (QuickShotUtils.isAboveAPI29()) {
                return;
            }
            MediaScannerConnection.scanFile(this.weakContext.get(), new String[]{this.file.getAbsolutePath()}, null, null);
        }
    }

    public interface QuickShotListener {
        void onQuickShotFailed(String str, String str2);

        void onQuickShotSuccess(String str);
    }

    private QuickShot(Bitmap bitmap, Context context) {
        this.bitmap = bitmap;
        this.context = context;
    }

    private QuickShot(View view) {
        this.view = view;
        this.context = view.getContext();
    }

    private Bitmap getBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            return bitmap;
        }
        View view = this.view;
        if (view instanceof TextureView) {
            this.bitmap = ((TextureView) view).getBitmap();
            Canvas canvas = new Canvas(this.bitmap);
            this.view.draw(canvas);
            canvas.setBitmap(null);
            return this.bitmap;
        }
        this.bitmap = Bitmap.createBitmap(view.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.bitmap);
        this.view.draw(canvas2);
        canvas2.setBitmap(null);
        return this.bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Attempt to save the picture failed: View or Context was null");
    }

    public static QuickShot of(Bitmap bitmap, Context context) {
        return new QuickShot(bitmap, context);
    }

    public static QuickShot of(View view) {
        return new QuickShot(view);
    }

    private void setFileExtension(String str) {
        this.fileExtension = str;
    }

    public QuickShot enableLogging() {
        this.printStackTrace = true;
        return this;
    }

    public void save() throws NullPointerException {
        View view = this.view;
        if (view instanceof SurfaceView) {
            PixelCopyHelper.getSurfaceBitmap((SurfaceView) view, new PixelCopyHelper.PixelCopyListener() { // from class: io.github.muddz.quickshot.QuickShot.1
                @Override // io.github.muddz.quickshot.PixelCopyHelper.PixelCopyListener
                public void onSurfaceBitmapError(String str) {
                    QuickShot.this.listener.onQuickShotFailed(QuickShot.this.path, str);
                }

                @Override // io.github.muddz.quickshot.PixelCopyHelper.PixelCopyListener
                public void onSurfaceBitmapReady(Bitmap bitmap) {
                    new BitmapSaver(QuickShot.this.getContext(), bitmap, QuickShot.this.printStackTrace, QuickShot.this.path, QuickShot.this.filename, QuickShot.this.fileExtension, QuickShot.this.jpgQuality, QuickShot.this.listener).execute(new Void[0]);
                }
            });
        } else {
            new BitmapSaver(getContext(), getBitmap(), this.printStackTrace, this.path, this.filename, this.fileExtension, this.jpgQuality, this.listener).execute(new Void[0]);
        }
    }

    public QuickShot setFilename(String str) {
        this.filename = str;
        return this;
    }

    public QuickShot setPath(String str) {
        this.path = str;
        return this;
    }

    public QuickShot setResultListener(QuickShotListener quickShotListener) {
        this.listener = quickShotListener;
        if (quickShotListener != null) {
            return this;
        }
        throw new NullPointerException("QuickShot.setResultListener() was provided with a null object reference");
    }

    public QuickShot toJPG() {
        this.jpgQuality = 100;
        setFileExtension(EXTENSION_JPG);
        return this;
    }

    public QuickShot toJPG(int i2) {
        this.jpgQuality = i2;
        setFileExtension(EXTENSION_JPG);
        return this;
    }

    public QuickShot toNomedia() {
        setFileExtension(EXTENSION_NOMEDIA);
        return this;
    }

    public QuickShot toPNG() {
        setFileExtension(EXTENSION_PNG);
        return this;
    }
}
