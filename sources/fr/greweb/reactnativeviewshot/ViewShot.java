package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ViewShot implements UIBlock {
    private static final int ARGB_SIZE = 4;
    public static final String ERROR_UNABLE_TO_SNAPSHOT = "E_UNABLE_TO_SNAPSHOT";
    private static final int PREALLOCATE_SIZE = 65536;
    private static final int SURFACE_VIEW_READ_PIXELS_TIMEOUT = 5;
    private static final String TAG = "ViewShot";
    private final Activity currentActivity;
    private final Executor executor;
    private final String extension;
    private final int format;
    private final boolean handleGLSurfaceView;
    private final Integer height;
    private final File output;
    private final Promise promise;
    private final double quality;
    private final ReactApplicationContext reactContext;
    private final String result;
    private final Boolean snapshotContentContainer;
    private final int tag;
    private final Integer width;
    private static byte[] outputBuffer = new byte[65536];
    private static final Object guardBitmaps = new Object();
    private static final Set<Bitmap> weakBitmaps = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.ViewShot$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ NativeViewHierarchyManager val$nativeViewHierarchyManager;

        AnonymousClass1(NativeViewHierarchyManager nativeViewHierarchyManager) {
            nativeViewHierarchyManager = nativeViewHierarchyManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                View viewFindViewById = ViewShot.this.tag == -1 ? ViewShot.this.currentActivity.getWindow().getDecorView().findViewById(android.R.id.content) : nativeViewHierarchyManager.resolveView(ViewShot.this.tag);
                if (viewFindViewById == null) {
                    String unused = ViewShot.TAG;
                    String str = "No view found with reactTag: " + ViewShot.this.tag;
                    new AssertionError();
                    ViewShot.this.promise.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "No view found with reactTag: " + ViewShot.this.tag);
                    return;
                }
                ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(ViewShot.outputBuffer);
                reusableByteArrayOutputStream.setSize(ViewShot.proposeSize(viewFindViewById));
                ViewShot.outputBuffer = reusableByteArrayOutputStream.innerBuffer();
                if (Results.TEMP_FILE.equals(ViewShot.this.result) && -1 == ViewShot.this.format) {
                    ViewShot.this.saveToRawFileOnDevice(viewFindViewById);
                    return;
                }
                if (Results.TEMP_FILE.equals(ViewShot.this.result) && -1 != ViewShot.this.format) {
                    ViewShot.this.saveToTempFileOnDevice(viewFindViewById);
                    return;
                }
                if ("base64".equals(ViewShot.this.result) || Results.ZIP_BASE_64.equals(ViewShot.this.result)) {
                    ViewShot.this.saveToBase64String(viewFindViewById);
                } else if (Results.DATA_URI.equals(ViewShot.this.result)) {
                    ViewShot.this.saveToDataUriString(viewFindViewById);
                }
            } catch (Throwable th) {
                String unused2 = ViewShot.TAG;
                ViewShot.this.promise.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "Failed to capture view snapshot");
            }
        }
    }

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.ViewShot$2 */
    class AnonymousClass2 implements PixelCopy.OnPixelCopyFinishedListener {
        final /* synthetic */ Canvas val$c;
        final /* synthetic */ View val$child;
        final /* synthetic */ Bitmap val$childBitmapBuffer;
        final /* synthetic */ CountDownLatch val$latch;
        final /* synthetic */ Paint val$paint;
        final /* synthetic */ View val$view;

        AnonymousClass2(Canvas canvas, View view, View view2, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
            canvas = canvas;
            view = view;
            view = view2;
            bitmap = bitmap;
            paint = paint;
            countDownLatch = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i2) {
            int iSave = canvas.save();
            ViewShot.this.applyTransformations(canvas, view, view);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.restoreToCount(iSave);
            ViewShot.recycleBitmap(bitmap);
            countDownLatch.countDown();
        }
    }

    public @interface Formats {
        public static final int JPEG = 0;
        public static final int PNG = 1;
        public static final int RAW = -1;
        public static final int WEBP = 2;
        public static final Bitmap.CompressFormat[] mapping = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public @interface Results {
        public static final String BASE_64 = "base64";
        public static final String DATA_URI = "data-uri";
        public static final String TEMP_FILE = "tmpfile";
        public static final String ZIP_BASE_64 = "zip-base64";
    }

    public static class ReusableByteArrayOutputStream extends ByteArrayOutputStream {
        private static final int MAX_ARRAY_SIZE = 2147483639;

        public ReusableByteArrayOutputStream(byte[] bArr) {
            super(0);
            this.buf = bArr;
        }

        protected static int hugeCapacity(int i2) {
            if (i2 < 0) {
                throw new OutOfMemoryError();
            }
            if (i2 > MAX_ARRAY_SIZE) {
                return Integer.MAX_VALUE;
            }
            return MAX_ARRAY_SIZE;
        }

        public ByteBuffer asBuffer(int i2) {
            if (this.buf.length < i2) {
                grow(i2);
            }
            return ByteBuffer.wrap(this.buf);
        }

        protected void grow(int i2) {
            int length = this.buf.length << 1;
            if (length - i2 < 0) {
                length = i2;
            }
            if (length - MAX_ARRAY_SIZE > 0) {
                length = hugeCapacity(i2);
            }
            this.buf = Arrays.copyOf(this.buf, length);
        }

        public byte[] innerBuffer() {
            return this.buf;
        }

        public void setSize(int i2) {
            this.count = i2;
        }
    }

    public ViewShot(int i2, String str, int i3, double d2, @Nullable Integer num, @Nullable Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z2, Promise promise, Executor executor) {
        this.tag = i2;
        this.extension = str;
        this.format = i3;
        this.quality = d2;
        this.width = num;
        this.height = num2;
        this.output = file;
        this.result = str2;
        this.snapshotContentContainer = bool;
        this.reactContext = reactApplicationContext;
        this.currentActivity = activity;
        this.handleGLSurfaceView = z2;
        this.promise = promise;
        this.executor = executor;
    }

    public Matrix applyTransformations(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = top + paddingTop + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point captureView(View view, OutputStream outputStream) throws IOException {
        try {
            return captureViewImpl(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point captureViewImpl(View view, OutputStream outputStream) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        Canvas canvas;
        View view2 = view;
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException(C1561oA.Kd("c\t\r\r\u0012\u0013\n\u0004\u000f\tD\u001a\u0016G\u001c\u0018\f\u001c \u0016\u001e$P&\u001b\u0019T, \u001d0sZ2&#6_*5b-3<(42.", (short) (Od.Xd() ^ (-1160))));
        }
        boolean z2 = false;
        if (this.snapshotContentContainer.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            height = 0;
            for (int i2 = 0; i2 < scrollView.getChildCount(); i2++) {
                height += scrollView.getChildAt(i2).getHeight();
            }
        }
        Point point = new Point(width, height);
        Bitmap bitmapForScreenshot = getBitmapForScreenshot(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas2 = new Canvas(bitmapForScreenshot);
        view2.draw(canvas2);
        for (View view3 : getAllChildren(view2)) {
            if (!(view3 instanceof TextureView)) {
                if ((view3 instanceof SurfaceView) && this.handleGLSurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view3;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    Bitmap exactBitmapForScreenshot = getExactBitmapForScreenshot(view3.getWidth(), view3.getHeight());
                    try {
                        canvas = canvas2;
                        try {
                            view2 = view2;
                            AnonymousClass2 anonymousClass2 = new PixelCopy.OnPixelCopyFinishedListener() { // from class: fr.greweb.reactnativeviewshot.ViewShot.2
                                final /* synthetic */ Canvas val$c;
                                final /* synthetic */ View val$child;
                                final /* synthetic */ Bitmap val$childBitmapBuffer;
                                final /* synthetic */ CountDownLatch val$latch;
                                final /* synthetic */ Paint val$paint;
                                final /* synthetic */ View val$view;

                                AnonymousClass2(Canvas canvas22, View view22, View view32, Bitmap exactBitmapForScreenshot2, Paint paint2, CountDownLatch countDownLatch2) {
                                    canvas = canvas22;
                                    view = view22;
                                    view = view32;
                                    bitmap = exactBitmapForScreenshot2;
                                    paint = paint2;
                                    countDownLatch = countDownLatch2;
                                }

                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                public void onPixelCopyFinished(int i22) {
                                    int iSave = canvas.save();
                                    ViewShot.this.applyTransformations(canvas, view, view);
                                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                                    canvas.restoreToCount(iSave);
                                    ViewShot.recycleBitmap(bitmap);
                                    countDownLatch.countDown();
                                }
                            };
                            short sXd = (short) (C1499aX.Xd() ^ (-1593));
                            int[] iArr = new int["\u0015!\u0016#\u001f\u0018\u0012Z\u001b\u001eWt\u0017\u0016\u0016\n\u0016".length()];
                            QB qb = new QB("\u0015!\u0016#\u001f\u0018\u0012Z\u001b\u001eWt\u0017\u0016\u0016\n\u0016");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                                i3++;
                            }
                            Object[] objArr = new Object[0];
                            Method declaredMethod = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(C1593ug.zd("FEU/DMS2VWYO]", (short) (OY.Xd() ^ 2220), (short) (OY.Xd() ^ 2939)), new Class[0]);
                            try {
                                declaredMethod.setAccessible(true);
                                PixelCopy.request(surfaceView, exactBitmapForScreenshot2, anonymousClass2, new Handler((Looper) declaredMethod.invoke(null, objArr)));
                                countDownLatch2.await(5L, TimeUnit.SECONDS);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (Exception e3) {
                            String str = TAG;
                            String str2 = C1561oA.od(",IUTTX\u00032JXDJ KKSx>FHt", (short) (C1633zX.Xd() ^ (-3777))) + surfaceView;
                        }
                    } catch (Exception e4) {
                        canvas = canvas22;
                    }
                }
                canvas22 = canvas;
                z2 = false;
            } else if (view32.getVisibility() == 0) {
                TextureView textureView = (TextureView) view32;
                textureView.setOpaque(z2);
                Bitmap bitmap = textureView.getBitmap(getExactBitmapForScreenshot(view32.getWidth(), view32.getHeight()));
                int iSave = canvas22.save();
                applyTransformations(canvas22, view22, view32);
                canvas22.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                canvas22.restoreToCount(iSave);
                recycleBitmap(bitmap);
            }
            canvas = canvas22;
            canvas22 = canvas;
            z2 = false;
        }
        Integer num = this.width;
        if (num == null || this.height == null || (num.intValue() == width && this.height.intValue() == height)) {
            bitmapCreateScaledBitmap = bitmapForScreenshot;
        } else {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapForScreenshot, this.width.intValue(), this.height.intValue(), true);
            recycleBitmap(bitmapForScreenshot);
        }
        if (-1 == this.format && (outputStream instanceof ReusableByteArrayOutputStream)) {
            int i4 = width * height * 4;
            ReusableByteArrayOutputStream reusableByteArrayOutputStream = (ReusableByteArrayOutputStream) cast(outputStream);
            bitmapCreateScaledBitmap.copyPixelsToBuffer(reusableByteArrayOutputStream.asBuffer(i4));
            reusableByteArrayOutputStream.setSize(i4);
        } else {
            bitmapCreateScaledBitmap.compress(Formats.mapping[this.format], (int) (this.quality * 100.0d), outputStream);
        }
        recycleBitmap(bitmapCreateScaledBitmap);
        return point;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T cast(A a2) {
        return a2;
    }

    private List<View> getAllChildren(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            arrayList2.addAll(getAllChildren(viewGroup.getChildAt(i2)));
        }
        return arrayList2;
    }

    private static Bitmap getBitmapForScreenshot(int i2, int i3) {
        synchronized (guardBitmaps) {
            for (Bitmap bitmap : weakBitmaps) {
                if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
                    weakBitmaps.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
    }

    private static Bitmap getExactBitmapForScreenshot(int i2, int i3) {
        synchronized (guardBitmaps) {
            for (Bitmap bitmap : weakBitmaps) {
                if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
                    weakBitmaps.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
    }

    public static int proposeSize(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    public static void recycleBitmap(Bitmap bitmap) {
        synchronized (guardBitmaps) {
            weakBitmaps.add(bitmap);
        }
    }

    public void saveToBase64String(View view) throws Throwable {
        String string;
        boolean z2 = -1 == this.format;
        boolean zEquals = Wg.Zd("\u0012wF$\u001de\u001fRf}", (short) (C1607wl.Xd() ^ 5248), (short) (C1607wl.Xd() ^ 20837)).equals(this.result);
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        Point pointCaptureView = captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        int size = reusableByteArrayOutputStream.size();
        String str = String.format(Locale.US, C1561oA.Xd(".nE1q\u000b", (short) (OY.Xd() ^ 27734)), Integer.valueOf(pointCaptureView.x), Integer.valueOf(pointCaptureView.y));
        if (!z2) {
            str = "";
        }
        if (zEquals) {
            Deflater deflater = new Deflater();
            deflater.setInput(outputBuffer, 0, size);
            deflater.finish();
            ReusableByteArrayOutputStream reusableByteArrayOutputStream2 = new ReusableByteArrayOutputStream(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                reusableByteArrayOutputStream2.write(bArr, 0, deflater.deflate(bArr));
            }
            StringBuilder sbAppend = new StringBuilder().append(str);
            byte[] bArrInnerBuffer = reusableByteArrayOutputStream2.innerBuffer();
            int size2 = reusableByteArrayOutputStream2.size();
            Class<?> cls = Class.forName(Wg.vd("_m`oqld/{{mq8Mi|sE@", (short) (C1633zX.Xd() ^ (-9674))));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
            Object[] objArr = {bArrInnerBuffer, 0, Integer.valueOf(size2), 2};
            short sXd = (short) (C1607wl.Xd() ^ 27545);
            short sXd2 = (short) (C1607wl.Xd() ^ 13961);
            int[] iArr = new int["NVJUII7Q4TQGKC".length()];
            QB qb = new QB("NVJUII7Q4TQGKC");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                string = sbAppend.append((String) declaredMethod.invoke(null, objArr)).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            StringBuilder sbAppend2 = new StringBuilder().append(str);
            byte[] bArr2 = outputBuffer;
            short sXd3 = (short) (FB.Xd() ^ 5514);
            short sXd4 = (short) (FB.Xd() ^ 12068);
            int[] iArr2 = new int["\u0019%\u001a'#\u001c\u0016^%#\u0017\u0019Yl\u000b\u001c\r\\Y".length()];
            QB qb2 = new QB("\u0019%\u001a'#\u001c\u0016^%#\u0017\u0019Yl\u000b\u001c\r\\Y");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr2 = {byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
            Object[] objArr2 = {bArr2, 0, Integer.valueOf(size), 2};
            Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.ud("lthsggUoRroeia", (short) (Od.Xd() ^ (-19347))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                string = sbAppend2.append((String) declaredMethod2.invoke(null, objArr2)).toString();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        this.promise.resolve(string);
    }

    public void saveToDataUriString(View view) throws Throwable {
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        int size = reusableByteArrayOutputStream.size();
        byte[] bArr = outputBuffer;
        Class<?> cls = Class.forName(C1561oA.yd("_m`oqld/kk]a(=YlsE@", (short) (C1633zX.Xd() ^ (-15743))));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {bArr, 0, Integer.valueOf(size), 2};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("OYO\\RTD`Egf^d^", (short) (Od.Xd() ^ (-17901))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.promise.resolve(ZO.xd("69g>F\\$av5}", (short) (Od.Xd() ^ (-11110)), (short) (Od.Xd() ^ (-4560))) + (Xg.qd("OVN", (short) (C1499aX.Xd() ^ (-5427)), (short) (C1499aX.Xd() ^ (-711))).equals(this.extension) ? Jg.Wd("\u0015^\u000ba", (short) (C1633zX.Xd() ^ (-21002)), (short) (C1633zX.Xd() ^ (-30636))) : this.extension) + C1626yg.Ud("3$U,N7eX", (short) (C1499aX.Xd() ^ (-14940)), (short) (C1499aX.Xd() ^ (-3207))) + ((String) declaredMethod.invoke(null, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void saveToRawFileOnDevice(View view) throws IOException {
        String string = Uri.fromFile(this.output).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.output);
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        Point pointCaptureView = captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        int size = reusableByteArrayOutputStream.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(pointCaptureView.x), Integer.valueOf(pointCaptureView.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(outputBuffer, 0, size);
        fileOutputStream.close();
        this.promise.resolve(string);
    }

    public void saveToTempFileOnDevice(View view) throws IOException {
        captureView(view, new FileOutputStream(this.output));
        this.promise.resolve(Uri.fromFile(this.output).toString());
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.executor.execute(new Runnable() { // from class: fr.greweb.reactnativeviewshot.ViewShot.1
            final /* synthetic */ NativeViewHierarchyManager val$nativeViewHierarchyManager;

            AnonymousClass1(NativeViewHierarchyManager nativeViewHierarchyManager2) {
                nativeViewHierarchyManager = nativeViewHierarchyManager2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    View viewFindViewById = ViewShot.this.tag == -1 ? ViewShot.this.currentActivity.getWindow().getDecorView().findViewById(android.R.id.content) : nativeViewHierarchyManager.resolveView(ViewShot.this.tag);
                    if (viewFindViewById == null) {
                        String unused = ViewShot.TAG;
                        String str = "No view found with reactTag: " + ViewShot.this.tag;
                        new AssertionError();
                        ViewShot.this.promise.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "No view found with reactTag: " + ViewShot.this.tag);
                        return;
                    }
                    ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(ViewShot.outputBuffer);
                    reusableByteArrayOutputStream.setSize(ViewShot.proposeSize(viewFindViewById));
                    ViewShot.outputBuffer = reusableByteArrayOutputStream.innerBuffer();
                    if (Results.TEMP_FILE.equals(ViewShot.this.result) && -1 == ViewShot.this.format) {
                        ViewShot.this.saveToRawFileOnDevice(viewFindViewById);
                        return;
                    }
                    if (Results.TEMP_FILE.equals(ViewShot.this.result) && -1 != ViewShot.this.format) {
                        ViewShot.this.saveToTempFileOnDevice(viewFindViewById);
                        return;
                    }
                    if ("base64".equals(ViewShot.this.result) || Results.ZIP_BASE_64.equals(ViewShot.this.result)) {
                        ViewShot.this.saveToBase64String(viewFindViewById);
                    } else if (Results.DATA_URI.equals(ViewShot.this.result)) {
                        ViewShot.this.saveToDataUriString(viewFindViewById);
                    }
                } catch (Throwable th) {
                    String unused2 = ViewShot.TAG;
                    ViewShot.this.promise.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "Failed to capture view snapshot");
                }
            }
        });
    }
}
