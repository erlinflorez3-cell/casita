package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import io.cobrowse.FrameLoop;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class FullDeviceFrameSource implements FrameLoop.Source, ImageReader.OnImageAvailableListener {
    private static PermissionRequest currentRequest = null;
    private final Application application;
    private final Delegate delegate;
    private boolean isDirty = false;
    private boolean isFirstFrameReturned;
    private Frame mostRecent;
    private Intent permissionToken;
    private Bitmap previousBitmap;
    private MediaProjection projection;
    private final MediaProjection.Callback projectionCallback;
    private ImageReader reader;
    private VirtualDisplay virtualDisplay;
    private Bitmap writableBitmap;
    private Bitmap writableOriginalBitmap;

    interface Delegate {
        void fullDeviceCaptureRejected();

        void fullDeviceCaptureStarted();

        void fullDeviceCaptureStopped();

        void requestFullDevicePermission(PermissionRequest permissionRequest);
    }

    public static class PermissionRequest extends Fragment {
        private Callback<Error, Intent> callback;

        private void remove() throws Exception {
            try {
                Activity activity = getActivity();
                if (activity != null && !activity.isFinishing()) {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    CX.ud();
                    fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
                }
            } catch (Throwable th) {
                String str = "Error while removing full device permission fragment: " + th.getMessage();
            }
            try {
                Activity activity2 = getActivity();
                if (activity2 instanceof PermissionRequestActivity) {
                    activity2.finish();
                }
            } catch (Throwable th2) {
                String str2 = "Error while finishing full device permission fragment parent: " + th2.getMessage();
            }
            this.callback = null;
        }

        PermissionRequest callback(Callback<Error, Intent> callback) {
            this.callback = callback;
            return this;
        }

        public void cancel() throws Exception {
            Callback<Error, Intent> callback = this.callback;
            if (callback != null) {
                ThreadUtils.invoke(callback, new CodedError(0, "Request was canceled"), null);
                this.callback = null;
            }
            remove();
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i2, int i3, Intent intent) throws Exception {
            if (i2 == 1) {
                Callback<Error, Intent> callback = this.callback;
                if (callback != null) {
                    if (i3 == -1) {
                        ThreadUtils.invoke(callback, null, intent);
                    } else {
                        ThreadUtils.invoke(callback, new CodedError(i3, "Result not OK"), intent);
                    }
                    this.callback = null;
                }
                remove();
            }
        }

        @Override // android.app.Fragment
        public void onAttach(Activity activity) throws Exception {
            super.onAttach(activity);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) activity.getSystemService("media_projection");
            if (mediaProjectionManager == null) {
                cancel();
                return;
            }
            Intent intentCreateScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
            CX.ud();
            startActivityForResult(intentCreateScreenCaptureIntent, 1);
        }

        public void show(Activity activity) throws Exception {
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                cancel();
                return;
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            CX.ud();
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, "cobrowse-get-media-permission");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public static class PermissionRequestActivity extends Activity {
        @Override // android.app.Activity, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            synchronized (C1553lQ.class) {
                short sXd = (short) (C1499aX.Xd() ^ (1880032384 ^ (-1880046461)));
                short sXd2 = (short) (C1499aX.Xd() ^ ((1122476521 ^ 1232198618) ^ (-194391180)));
                int[] iArr = new int["\u001c\u007f_yS".length()];
                QB qb = new QB("\u001c\u007f_yS");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strXd = ZO.xd("L#", (short) (C1580rY.Xd() ^ (562846107 ^ (-562830647))), (short) (C1580rY.Xd() ^ ((173543219 ^ 151718275) ^ (-55784444))));
                try {
                    Class<?> cls = Class.forName(str);
                    Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                    field.setAccessible(true);
                    obj = field.get(null);
                } catch (Throwable th) {
                    obj = null;
                }
                if (!((AtomicBoolean) obj).get()) {
                    short sXd3 = (short) (C1633zX.Xd() ^ (1471354463 ^ (-1471362234)));
                    short sXd4 = (short) (C1633zX.Xd() ^ (1194908030 ^ (-1194891104)));
                    int[] iArr2 = new int["8\u000e;ns".length()];
                    QB qb2 = new QB("8\u000e;ns");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strWd = Ig.wd("%b", (short) (C1580rY.Xd() ^ ((1716017772 ^ 482298004) ^ (-2063025742))));
                    try {
                        Class<?> cls2 = Class.forName(str2);
                        Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                        field2.setAccessible(true);
                        obj2 = field2.get(null);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    if (!((AtomicBoolean) obj2).get()) {
                        String strOd = EO.Od("}$Zr\u0011", (short) (Od.Xd() ^ ((853424381 ^ 398156786) ^ (-627395492))));
                        String strQd = C1561oA.Qd("\u001d\u0011", (short) (Od.Xd() ^ (1859158830 ^ (-1859173072))));
                        try {
                            Class<?> cls3 = Class.forName(strOd);
                            Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                            field3.setAccessible(true);
                            obj3 = field3.get(null);
                        } catch (Throwable th3) {
                            obj3 = null;
                        }
                        if (((WindowManager) obj3) == null) {
                            Object[] objArr = new Object[0];
                            Method declaredMethod = Class.forName(C1593ug.zd("\u001c\u000bR\u001e\u007f", (short) (C1607wl.Xd() ^ (1385242167 ^ 1385265434)), (short) (C1607wl.Xd() ^ (162810215 ^ 162801400)))).getDeclaredMethod(C1561oA.od("6A", (short) (Od.Xd() ^ (136400613 ^ (-136389326)))), new Class[0]);
                            try {
                                declaredMethod.setAccessible(true);
                                Context context = (Context) declaredMethod.invoke(null, objArr);
                                if (context != null) {
                                    Object[] objArr2 = {C1561oA.Kd("!\u0014\u001a\u0011\u001d&", (short) (C1633zX.Xd() ^ (1490936430 ^ (-1490926598))))};
                                    Method method = Class.forName(Wg.Zd("\u0002\u0010G\u0017]\u0017\u0013&\u001df-4f1\u0001yP\u0006B\nB\u0017\u0014", (short) (C1633zX.Xd() ^ (1537548506 ^ (-1537555088))), (short) (C1633zX.Xd() ^ (2038239752 ^ (-2038266023))))).getMethod(Wg.vd("xw\u0004c\u0007\u0002\u007fqv]lz{ofi", (short) (C1607wl.Xd() ^ ((1173783402 ^ 483008046) ^ 1497139327))), Class.forName(C1561oA.Xd("UMcO\u001d\\R`Z\"Hjiaga", (short) (ZN.Xd() ^ (2033575926 ^ 2033571656)))));
                                    try {
                                        method.setAccessible(true);
                                        WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                        String strKd = Qg.kd("L9~< ", (short) (C1633zX.Xd() ^ ((2141817710 ^ 2116647347) ^ (-25214947))), (short) (C1633zX.Xd() ^ ((73896007 ^ 618059613) ^ (-548473206))));
                                        String strVd = hg.Vd(" \u0014", (short) (FB.Xd() ^ (215749865 ^ 215757908)), (short) (FB.Xd() ^ (1873359524 ^ 1873371313)));
                                        try {
                                            Class<?> cls4 = Class.forName(strKd);
                                            Field field4 = 0 != 0 ? cls4.getField(strVd) : cls4.getDeclaredField(strVd);
                                            field4.setAccessible(true);
                                            field4.set(null, windowManager);
                                        } catch (Throwable th4) {
                                        }
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                        String strUd = C1561oA.ud("=*o-\u0011", (short) (C1607wl.Xd() ^ (346997681 ^ 346982496)));
                        String strYd = C1561oA.yd("#\u0019", (short) (C1580rY.Xd() ^ ((622495358 ^ 1191038854) ^ (-1676109221))));
                        try {
                            Class<?> cls5 = Class.forName(strUd);
                            Field field5 = 0 != 0 ? cls5.getField(strYd) : cls5.getDeclaredField(strYd);
                            field5.setAccessible(true);
                            obj4 = field5.get(null);
                        } catch (Throwable th5) {
                            obj4 = null;
                        }
                        if (((WindowManager) obj4) != null) {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            String strYd2 = C1561oA.Yd("\u0011\u007fG\u0007l", (short) (C1499aX.Xd() ^ ((660275879 ^ 185218216) ^ (-743532255))));
                            String strQd2 = Xg.qd("2(", (short) (FB.Xd() ^ ((532456569 ^ 172219034) ^ 369055636)), (short) (FB.Xd() ^ (153639299 ^ 153642455)));
                            try {
                                Class<?> cls6 = Class.forName(strYd2);
                                Field field6 = 0 != 0 ? cls6.getField(strQd2) : cls6.getDeclaredField(strQd2);
                                field6.setAccessible(true);
                                obj5 = field6.get(null);
                            } catch (Throwable th6) {
                                obj5 = null;
                            }
                            ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                            int x2 = (int) motionEvent.getX();
                            int y2 = (int) motionEvent.getY();
                            int i4 = (1051673127 ^ 208976742) ^ 853276938;
                            if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                                C1553lQ.vd(motionEvent);
                                C1553lQ.Od(motionEvent);
                            }
                        }
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    FullDeviceFrameSource(Application application, final Delegate delegate) {
        this.application = application;
        this.delegate = delegate;
        this.projectionCallback = new MediaProjection.Callback() { // from class: io.cobrowse.FullDeviceFrameSource.1
            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                super.onStop();
                delegate.fullDeviceCaptureStopped();
            }
        };
    }

    private boolean isPrimaryDisplay(Display display) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) this.application.getSystemService("window");
        return (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || display.getDisplayId() != defaultDisplay.getDisplayId()) ? false : true;
    }

    private boolean startProjection(Display display, Intent intent) {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.application.getSystemService("media_projection");
        if (mediaProjectionManager == null) {
            return false;
        }
        try {
            MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(-1, intent);
            this.projection = mediaProjection;
            mediaProjection.registerCallback(this.projectionCallback, new Handler(Looper.myLooper()));
            if (this.projection == null) {
                return false;
            }
            DisplayMetrics metrics = DisplayScaling.getMetrics(display);
            int i2 = metrics.widthPixels;
            int i3 = metrics.heightPixels;
            ImageReader imageReaderNewInstance = ImageReader.newInstance(i2, i3, 1, 2);
            this.reader = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this, null);
            this.virtualDisplay = this.projection.createVirtualDisplay("cobrowse-virtual-display", i2, i3, 120, 0, this.reader.getSurface(), null, null);
            return true;
        } catch (Exception e2) {
            String str = "Media projection failed to start: " + e2.getMessage();
            return false;
        }
    }

    private void stopProjection() {
        this.mostRecent = null;
        this.isFirstFrameReturned = false;
        ImageReader imageReader = this.reader;
        if (imageReader != null) {
            imageReader.close();
            this.reader = null;
        }
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.virtualDisplay = null;
        }
        MediaProjection mediaProjection = this.projection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.projectionCallback);
            this.projection.stop();
            this.projection = null;
        }
    }

    private void updateMostRecentFrame(Image image) {
        Bitmap bitmap;
        Rect cropRect = image.getCropRect();
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        int pixelStride = planes[0].getPixelStride();
        int width = image.getWidth() + ((planes[0].getRowStride() - (image.getWidth() * pixelStride)) / pixelStride);
        int height = image.getHeight();
        Bitmap bitmap2 = this.writableOriginalBitmap;
        if (bitmap2 == null || bitmap2.getWidth() != width || this.writableOriginalBitmap.getHeight() != height) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.writableOriginalBitmap = bitmapCreateBitmap;
            if (bitmapCreateBitmap == null) {
                throw new RuntimeException(String.format("Failed to create a bitmap %d:%d", Integer.valueOf(width), Integer.valueOf(height)));
            }
        }
        this.writableOriginalBitmap.copyPixelsFromBuffer(buffer);
        int iWidth = cropRect.width() - cropRect.left;
        int iHeight = cropRect.height() - cropRect.top;
        if (this.mostRecent == null || (bitmap = this.writableBitmap) == null || bitmap.getWidth() != iWidth || this.writableBitmap.getHeight() != iHeight) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            this.writableBitmap = bitmapCreateBitmap2;
            if (bitmapCreateBitmap2 == null) {
                throw new RuntimeException(String.format("Failed to create a bitmap %d:%d", Integer.valueOf(width), Integer.valueOf(height)));
            }
            this.mostRecent = new Frame(this.writableBitmap);
        }
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Canvas(this.writableBitmap).drawBitmap(this.writableOriginalBitmap, cropRect.left, cropRect.top, (Paint) null);
        Bitmap bitmap3 = this.previousBitmap;
        if (bitmap3 == null || !BitmapUtils.sameSize(bitmap3, this.writableBitmap)) {
            this.mostRecent.setDirty(true);
            this.previousBitmap = BitmapUtils.copy(this.writableBitmap);
        } else if (this.previousBitmap.sameAs(this.writableBitmap)) {
            this.mostRecent.setDirty(false);
        } else {
            this.mostRecent.setDirty(true);
            BitmapUtils.copy(this.writableBitmap, this.previousBitmap);
        }
    }

    @Override // io.cobrowse.FrameLoop.Source
    public void capturingWillStart(final Display display) {
        if (isPrimaryDisplay(display)) {
            stopProjection();
            Intent intent = this.permissionToken;
            if (intent != null) {
                if (startProjection(display, intent)) {
                    this.delegate.fullDeviceCaptureStarted();
                    return;
                } else {
                    this.delegate.fullDeviceCaptureStopped();
                    return;
                }
            }
            if (currentRequest != null) {
                return;
            }
            currentRequest = new PermissionRequest().callback(new Callback() { // from class: io.cobrowse.FullDeviceFrameSource$$ExternalSyntheticLambda0
                @Override // io.cobrowse.Callback
                public final void call(Error error, Object obj) {
                    this.f$0.m8818lambda$capturingWillStart$1$iocobrowseFullDeviceFrameSource(display, error, (Intent) obj);
                }
            });
            this.delegate.requestFullDevicePermission(currentRequest);
        }
    }

    @Override // io.cobrowse.FrameLoop.Source
    public void capturingWillStop(Display display) throws Exception {
        if (isPrimaryDisplay(display)) {
            stopProjection();
            if (CobrowseService.needMediaProjectionPermissionBeforeStart()) {
                CobrowseService.setBackground();
            }
            this.delegate.fullDeviceCaptureStopped();
            this.previousBitmap = null;
            this.writableBitmap = null;
            this.writableOriginalBitmap = null;
        }
    }

    @Override // io.cobrowse.FrameLoop.Source
    public boolean isNewFrameAvailable(Display display) {
        if (isPrimaryDisplay(display)) {
            return this.isDirty;
        }
        return false;
    }

    /* JADX INFO: renamed from: lambda$capturingWillStart$0$io-cobrowse-FullDeviceFrameSource, reason: not valid java name */
    /* synthetic */ void m8817lambda$capturingWillStart$0$iocobrowseFullDeviceFrameSource(Display display, Intent intent, Error error, Boolean bool) {
        if (Boolean.TRUE.equals(bool) && startProjection(display, intent)) {
            this.delegate.fullDeviceCaptureStarted();
        } else {
            this.delegate.fullDeviceCaptureStopped();
        }
    }

    /* JADX INFO: renamed from: lambda$capturingWillStart$1$io-cobrowse-FullDeviceFrameSource, reason: not valid java name */
    /* synthetic */ void m8818lambda$capturingWillStart$1$iocobrowseFullDeviceFrameSource(final Display display, Error error, final Intent intent) {
        String str = "Full device screen request completed " + error;
        currentRequest = null;
        if (error != null || intent == null) {
            this.delegate.fullDeviceCaptureRejected();
            return;
        }
        if (!CobrowseService.isMediaProjectionEnabled()) {
            this.delegate.fullDeviceCaptureRejected();
            return;
        }
        if (CobrowseService.needMediaProjectionPermissionBeforeStart()) {
            CobrowseService.setForeground(new Callback() { // from class: io.cobrowse.FullDeviceFrameSource$$ExternalSyntheticLambda1
                @Override // io.cobrowse.Callback
                public final void call(Error error2, Object obj) {
                    this.f$0.m8817lambda$capturingWillStart$0$iocobrowseFullDeviceFrameSource(display, intent, error2, (Boolean) obj);
                }
            });
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            this.permissionToken = intent;
        }
        if (startProjection(display, intent)) {
            this.delegate.fullDeviceCaptureStarted();
        } else {
            this.delegate.fullDeviceCaptureStopped();
        }
    }

    @Override // io.cobrowse.FrameLoop.Source
    public Frame newFrame(Display display) {
        ImageReader imageReader;
        Frame frame;
        if (!isPrimaryDisplay(display) || (imageReader = this.reader) == null) {
            return null;
        }
        boolean z2 = this.mostRecent == null;
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            updateMostRecentFrame(imageAcquireLatestImage);
            imageAcquireLatestImage.close();
        } else {
            Frame frame2 = this.mostRecent;
            if (frame2 != null && frame2.isDirty()) {
                this.mostRecent.setDirty(false);
            }
        }
        if (z2) {
            return null;
        }
        if (!this.isFirstFrameReturned && (frame = this.mostRecent) != null) {
            frame.setDirty(true);
            this.isFirstFrameReturned = true;
        }
        this.isDirty = false;
        return this.mostRecent;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        this.isDirty = true;
    }

    protected void restart(Display display) {
        if (isPrimaryDisplay(display) && this.permissionToken != null) {
            stopProjection();
            startProjection(display, this.permissionToken);
        }
    }
}
