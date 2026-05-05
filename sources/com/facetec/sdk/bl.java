package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.Allocation;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.facetec.sdk.bd;
import com.facetec.sdk.bi;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.OY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
class bl extends be {
    private static int E = 1;

    /* JADX INFO: renamed from: b */
    private static final SparseIntArray f2994b;

    /* JADX INFO: renamed from: u */
    private static long f2995u = 0;

    /* JADX INFO: renamed from: w */
    private static /* synthetic */ boolean f2996w = false;

    /* JADX INFO: renamed from: x */
    private static int f2997x = 0;

    /* JADX INFO: renamed from: y */
    private static char f2998y = 0;

    /* JADX INFO: renamed from: z */
    private static int f2999z = 0;

    /* JADX INFO: renamed from: c */
    private final WeakReference<g> f3000c;

    /* JADX INFO: renamed from: e */
    private final B f3001e;

    /* JADX INFO: renamed from: f */
    private int f3002f;

    /* JADX INFO: renamed from: g */
    private CameraCharacteristics f3003g;

    /* JADX INFO: renamed from: h */
    private CameraDevice f3004h;

    /* JADX INFO: renamed from: i */
    private CameraCaptureSession f3005i;

    /* JADX INFO: renamed from: j */
    private String f3006j;

    /* JADX INFO: renamed from: k */
    private Handler f3007k;

    /* JADX INFO: renamed from: l */
    private bd f3008l;

    /* JADX INFO: renamed from: n */
    private HandlerThread f3010n;

    /* JADX INFO: renamed from: o */
    private CaptureRequest.Builder f3011o;

    /* JADX INFO: renamed from: q */
    private final bu f3013q;

    /* JADX INFO: renamed from: v */
    private final TextureView.SurfaceTextureListener f3017v;

    /* JADX INFO: renamed from: m */
    private final Semaphore f3009m = new Semaphore(1);

    /* JADX INFO: renamed from: p */
    private boolean f3012p = false;

    /* JADX INFO: renamed from: t */
    private boolean f3016t = false;

    /* JADX INFO: renamed from: s */
    private final bd.V f3015s = new bd.V() { // from class: com.facetec.sdk.bl.3
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.bd.V
        public final void V(byte[] bArr, Size size) {
            bl.this.C = true;
            ad adVar = bl.this.V.get();
            if (adVar == null || !adVar.Z()) {
                return;
            }
            adVar.Z(bArr, size.getWidth(), size.getHeight(), bl.V(bl.this), Boolean.TRUE);
        }
    };

    /* JADX INFO: renamed from: r */
    private final CameraDevice.StateCallback f3014r = new CameraDevice.StateCallback() { // from class: com.facetec.sdk.bl.4
        AnonymousClass4() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            bl.Z(bl.this).release();
            cameraDevice.close();
            bl.B(bl.this, (CameraDevice) null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i2) {
            bl.Z(bl.this).release();
            cameraDevice.close();
            bl.B(bl.this, (CameraDevice) null);
            g gVar = (g) bl.D(bl.this).get();
            if (gVar != null) {
                gVar.V("Camera2 device error: ".concat(String.valueOf(i2)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            bl.Z(bl.this).release();
            bl.B(bl.this, cameraDevice);
            bl.F(bl.this);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.bl$1 */
    final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (bl.I(bl.this) == null) {
                return;
            }
            bl.B(bl.this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            try {
                bl.I(bl.this).setRepeatingRequest(bl.B(bl.this).build(), null, null);
                bl.S();
            } catch (CameraAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$10 */
    final class AnonymousClass10 implements Comparator<Size> {
        AnonymousClass10() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            return (size4.getWidth() * size4.getHeight()) - (size3.getWidth() * size3.getHeight());
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$2 */
    final class AnonymousClass2 implements Comparator<Size> {
        AnonymousClass2() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            return Integer.compare(size3.getHeight() * size3.getWidth(), size4.getHeight() * size4.getWidth());
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$3 */
    final class AnonymousClass3 implements bd.V {
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.bd.V
        public final void V(byte[] bArr, Size size) {
            bl.this.C = true;
            ad adVar = bl.this.V.get();
            if (adVar == null || !adVar.Z()) {
                return;
            }
            adVar.Z(bArr, size.getWidth(), size.getHeight(), bl.V(bl.this), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$4 */
    final class AnonymousClass4 extends CameraDevice.StateCallback {
        AnonymousClass4() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            bl.Z(bl.this).release();
            cameraDevice.close();
            bl.B(bl.this, (CameraDevice) null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i2) {
            bl.Z(bl.this).release();
            cameraDevice.close();
            bl.B(bl.this, (CameraDevice) null);
            g gVar = (g) bl.D(bl.this).get();
            if (gVar != null) {
                gVar.V("Camera2 device error: ".concat(String.valueOf(i2)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            bl.Z(bl.this).release();
            bl.B(bl.this, cameraDevice);
            bl.F(bl.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$5 */
    final class AnonymousClass5 extends CameraCaptureSession.StateCallback {
        AnonymousClass5() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            if (bl.Code(bl.this) == null) {
                return;
            }
            bl.Z(bl.this, cameraCaptureSession);
            try {
                if (bl.Code(bl.this, CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 4)) {
                    bl.B(bl.this).set(CaptureRequest.CONTROL_AF_MODE, 4);
                }
                if (bl.Code(bl.this, CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, 1)) {
                    bl.B(bl.this).set(CaptureRequest.CONTROL_AE_MODE, 1);
                }
                bl.I(bl.this).setRepeatingRequest(bl.B(bl.this).build(), null, null);
            } catch (CameraAccessException e2) {
                L.V(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bl$8 */
    final class AnonymousClass8 implements TextureView.SurfaceTextureListener {
        AnonymousClass8() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            g gVar = (g) bl.D(bl.this).get();
            if (gVar == null) {
                return;
            }
            try {
                bl.I(bl.this, gVar, i2, i3);
            } catch (Throwable th) {
                L.V(th);
                gVar.V(th.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                bl.L(bl.this);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            bl.Code(bl.this, i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    static class Z {
        String B;
        CameraCharacteristics Code;
        boolean I;
        StreamConfigurationMap V;

        private Z() {
            this.I = false;
        }

        /* synthetic */ Z(byte b2) {
            this();
        }
    }

    static {
        F();
        int i2 = E;
        int i3 = i2 + 35;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        f2999z = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        f2996w = true;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2994b = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    bl(Activity activity) throws Throwable {
        AnonymousClass8 anonymousClass8 = new TextureView.SurfaceTextureListener() { // from class: com.facetec.sdk.bl.8
            AnonymousClass8() {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                g gVar = (g) bl.D(bl.this).get();
                if (gVar == null) {
                    return;
                }
                try {
                    bl.I(bl.this, gVar, i2, i3);
                } catch (Throwable th) {
                    L.V(th);
                    gVar.V(th.getMessage());
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                try {
                    bl.L(bl.this);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                bl.Code(bl.this, i2, i3);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.f3017v = anonymousClass8;
        this.f3000c = new WeakReference<>((g) activity);
        this.f3013q = B();
        B b2 = new B(activity);
        this.f3001e = b2;
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f3010n = handlerThread;
        handlerThread.start();
        this.f3007k = new Handler(this.f3010n.getLooper());
        if (b2.isAvailable()) {
            Code(activity, b2.getWidth(), b2.getHeight());
        } else {
            b2.setSurfaceTextureListener(anonymousClass8);
        }
    }

    static /* synthetic */ CameraDevice B(bl blVar, CameraDevice cameraDevice) {
        int i2 = 2 % 2;
        int i3 = E + 25;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
        blVar.f3004h = cameraDevice;
        if (i4 == 0) {
            return cameraDevice;
        }
        throw null;
    }

    static /* synthetic */ CaptureRequest.Builder B(bl blVar) {
        int i2 = 2 % 2;
        int i3 = f2999z;
        int i4 = i3 + 13;
        E = i4 % 128;
        int i5 = i4 % 2;
        CaptureRequest.Builder builder = blVar.f3011o;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 13;
        E = i6 % 128;
        int i7 = i6 % 2;
        return builder;
    }

    public static bu B(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = 5;
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        ArrayList arrayList = new ArrayList();
        Z Z2 = Z(context);
        if (Z2 == null) {
            throw new bi(bi.Z.FRONT_FACING_NOT_FOUND);
        }
        Size[] outputSizes = Z2.V.getOutputSizes(SurfaceTexture.class);
        if (outputSizes.length == 0) {
            throw new bi(bi.Z.NO_OUTPUT_SIZES);
        }
        Arrays.sort(outputSizes, new Comparator<Size>() { // from class: com.facetec.sdk.bl.10
            AnonymousClass10() {
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Size size, Size size2) {
                Size size3 = size;
                Size size4 = size2;
                return (size4.getWidth() * size4.getHeight()) - (size3.getWidth() * size3.getHeight());
            }
        });
        int i4 = 0;
        be.I = new StringBuilder().append(outputSizes[0].getWidth()).append("x").append(outputSizes[0].getHeight()).toString();
        ce.I(context).getDefaultDisplay().getRealSize(new Point());
        int i5 = 0;
        while (i5 < i3) {
            float f2 = fArr[i5];
            int length = outputSizes.length;
            while (i4 < length) {
                int i6 = E + 89;
                f2999z = i6 % 128;
                int i7 = i6 % 2;
                Size size = outputSizes[i4];
                float width = size.getWidth();
                float height = size.getHeight();
                if (width <= 1920.0f && height <= 1080.0f) {
                    int i8 = E;
                    int i9 = i8 + 41;
                    f2999z = i9 % 128;
                    int i10 = i9 % 2;
                    float f3 = width / height;
                    if (f3 >= f2) {
                        int i11 = i8 + 23;
                        f2999z = i11 % 128;
                        int i12 = i11 % 2;
                        if (f3 <= 1.9f && width >= 640.0f && width <= 1920.0f && width <= r3.y && height <= r3.x) {
                            arrayList.add(size);
                        }
                    }
                }
                i4++;
            }
            if (arrayList.size() > 0) {
                break;
            }
            i5++;
            i3 = 5;
            i4 = 0;
        }
        if (arrayList.size() > 0) {
            return new bu(((Size) arrayList.get(0)).getWidth(), ((Size) arrayList.get(0)).getHeight());
        }
        bu buVar = new bu(outputSizes[0].getWidth(), outputSizes[0].getHeight());
        int i13 = f2999z + 87;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return buVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private void B(Activity activity) throws Throwable {
        int i2 = 2 % 2;
        Z Z2 = Z((Context) activity);
        if (Z2 == null) {
            throw new bi(bi.Z.FRONT_FACING_NOT_FOUND);
        }
        String str = Z2.B;
        CameraCharacteristics cameraCharacteristics = Z2.Code;
        StreamConfigurationMap streamConfigurationMap = Z2.V;
        activity.getWindowManager().getDefaultDisplay().getRotation();
        this.f3002f = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        activity.getWindowManager().getDefaultDisplay().getSize(new Point());
        activity.getWindowManager().getDefaultDisplay().getRealSize(new Point());
        if (activity.getResources().getConfiguration().orientation == 2) {
            this.f3001e.setAspectRatio(this.f3013q.B, this.f3013q.I);
            be.Z = this.f3013q.I / this.f3013q.B;
        } else {
            this.f3001e.setAspectRatio(this.f3013q.I, this.f3013q.B);
            be.Z = this.f3013q.B / this.f3013q.I;
            int i3 = E + 113;
            f2999z = i3 % 128;
            int i4 = i3 % 2;
        }
        B(activity, streamConfigurationMap);
        this.f3006j = str;
        this.f3003g = cameraCharacteristics;
        int i5 = E + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f2999z = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void B(Context context, StreamConfigurationMap streamConfigurationMap) {
        int i2 = 2 % 2;
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(Allocation.class);
        Arrays.sort(outputSizes, new Comparator<Size>() { // from class: com.facetec.sdk.bl.2
            AnonymousClass2() {
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Size size, Size size2) {
                Size size3 = size;
                Size size4 = size2;
                return Integer.compare(size3.getHeight() * size3.getWidth(), size4.getHeight() * size4.getWidth());
            }
        });
        Size size = new Size(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS);
        float f2 = this.f3013q.B / this.f3013q.I;
        int width = size.getWidth() * size.getHeight();
        int i3 = width << 2;
        int length = outputSizes.length;
        Object obj = null;
        int i4 = 0;
        Size size2 = null;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Size size3 = outputSizes[i4];
            int height = size3.getHeight() * size3.getWidth();
            if (height >= width) {
                int i5 = E;
                int i6 = i5 + 17;
                f2999z = i6 % 128;
                int i7 = i6 % 2;
                if (height <= i3) {
                    int i8 = i5 + 105;
                    f2999z = i8 % 128;
                    int i9 = i8 % 2;
                    float width2 = size3.getWidth() / size3.getHeight();
                    if (width2 <= 3.0f) {
                        int i10 = f2999z + 111;
                        E = i10 % 128;
                        if (i10 % 2 == 0) {
                            super.hashCode();
                            throw null;
                        }
                        if (width2 == f2) {
                            size2 = size3;
                            break;
                        }
                        size2 = size3;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i4++;
        }
        if (size2 != null) {
            size = size2;
        }
        be.B = new bu(size.getWidth(), size.getHeight());
        try {
            bd bdVar = new bd(context, size);
            this.f3008l = bdVar;
            if (this.f3012p) {
                bdVar.I(this.f3015s);
            }
        } catch (Throwable th) {
            L.V(th);
            ce.I(th.getMessage());
            throw th;
        }
    }

    private void C() throws bi {
        boolean zTryAcquire;
        int i2 = 2 % 2;
        int i3 = f2999z + 19;
        E = i3 % 128;
        int i4 = i3 % 2;
        try {
            zTryAcquire = this.f3009m.tryAcquire(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            L.V(e2);
            zTryAcquire = false;
        }
        try {
            try {
                CameraCaptureSession cameraCaptureSession = this.f3005i;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.f3005i = null;
                }
                CameraDevice cameraDevice = this.f3004h;
                if (cameraDevice != null) {
                    int i5 = f2999z + 67;
                    E = i5 % 128;
                    if (i5 % 2 == 0) {
                        cameraDevice.close();
                        this.f3004h = null;
                        throw null;
                    }
                    cameraDevice.close();
                    this.f3004h = null;
                }
            } catch (Exception e3) {
                throw new bi(bi.Z.CLOSE_ERROR, e3);
            }
        } finally {
            if (zTryAcquire) {
                this.f3009m.release();
            }
        }
    }

    static /* synthetic */ CameraDevice Code(bl blVar) {
        int i2 = 2 % 2;
        int i3 = E;
        int i4 = i3 + 105;
        f2999z = i4 % 128;
        int i5 = i4 % 2;
        CameraDevice cameraDevice = blVar.f3004h;
        int i6 = i3 + 109;
        f2999z = i6 % 128;
        int i7 = i6 % 2;
        return cameraDevice;
    }

    private void Code(int i2, int i3) {
        int i4 = 2 % 2;
        g gVar = this.f3000c.get();
        if (this.f3001e == null || gVar == null) {
            return;
        }
        int rotation = gVar.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f2 = i2;
        float f3 = i3;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f3013q.I, this.f3013q.B);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f3 / this.f3013q.I, f2 / this.f3013q.B);
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (2 == rotation) {
            int i5 = f2999z + 93;
            E = i5 % 128;
            int i6 = i5 % 2;
            matrix.postRotate(180.0f, fCenterX, fCenterY);
            int i7 = f2999z + 35;
            E = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f3001e.setTransform(matrix);
        int i9 = f2999z + 17;
        E = i9 % 128;
        int i10 = i9 % 2;
    }

    private void Code(Activity activity, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        if (this.f3016t) {
            return;
        }
        if (ActivityCompat.checkSelfPermission(activity, C1593ug.zd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\ \u0016$ \u001d() ''g}|\n\u0003\u0011\u0001", (short) (OY.Xd() ^ 17144), (short) (OY.Xd() ^ 28126))) != 0) {
            throw new bi(bi.Z.PERMISSION_DENIED);
        }
        try {
            B(activity);
            int i5 = E + 25;
            f2999z = i5 % 128;
            int i6 = i5 % 2;
            Code(i2, i3);
            Object[] objArr = {C1561oA.od("vs~u\u0002o", (short) (C1580rY.Xd() ^ (-1164)))};
            Method method = Class.forName(C1561oA.Kd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (ZN.Xd() ^ 8974))).getMethod(C1561oA.Xd("CBR2YTVHQ8KY^RMP", (short) (C1633zX.Xd() ^ (-20401))), Class.forName(Wg.Zd("|:\u0013\u0003<}8qmyJ0sU\u001f\u001d", (short) (ZN.Xd() ^ 4192), (short) (ZN.Xd() ^ 26709))));
            try {
                method.setAccessible(true);
                CameraManager cameraManager = (CameraManager) method.invoke(activity, objArr);
                if (cameraManager == null) {
                    throw new bi(bi.Z.PERMISSION_DENIED);
                }
                try {
                    if (!this.f3009m.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                        throw new bi(bi.Z.OPEN_TIMEOUT);
                    }
                    int i7 = f2999z + 11;
                    E = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        cameraManager.openCamera(this.f3006j, this.f3014r, (Handler) null);
                    } catch (Exception e2) {
                        this.f3009m.release();
                        throw new bi(bi.Z.UNKNOWN, e2.getMessage());
                    }
                } catch (InterruptedException e3) {
                    L.V(e3);
                    throw new bi(bi.Z.LOCK_OPEN_TIMEOUT, e3);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (CameraAccessException e5) {
            throw new bi(bi.Z.UNKNOWN, e5.getMessage());
        }
    }

    static /* synthetic */ void Code(bl blVar, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = E + 15;
        f2999z = i5 % 128;
        int i6 = i5 % 2;
        blVar.Code(i2, i3);
        if (i6 != 0) {
            int i7 = 43 / 0;
        }
        int i8 = f2999z + 33;
        E = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 23 / 0;
        }
    }

    static /* synthetic */ boolean Code(bl blVar, CameraCharacteristics.Key key, int i2) {
        int i3 = 2 % 2;
        int i4 = E + 25;
        f2999z = i4 % 128;
        if (i4 % 2 == 0) {
            return blVar.V(key, i2);
        }
        blVar.V(key, i2);
        throw null;
    }

    static /* synthetic */ WeakReference D(bl blVar) {
        int i2 = 2 % 2;
        int i3 = E + 43;
        int i4 = i3 % 128;
        f2999z = i4;
        int i5 = i3 % 2;
        WeakReference<g> weakReference = blVar.f3000c;
        if (i5 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i6 = i4 + 29;
        E = i6 % 128;
        int i7 = i6 % 2;
        return weakReference;
    }

    static void F() {
        f2998y = (char) 63089;
        f2997x = 0;
        f2995u = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0032, code lost:
    
        if (r2 != null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void F(com.facetec.sdk.bl r10) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.facetec.sdk.bl.E
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.facetec.sdk.bl.f2999z = r0
            int r1 = r1 % r7
            r3 = 0
            if (r1 != 0) goto Lb4
            com.facetec.sdk.bd r0 = r10.f3008l     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            if (r0 != 0) goto L14
            return
        L14:
            com.facetec.sdk.B r0 = r10.f3001e     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.graphics.SurfaceTexture r2 = r0.getSurfaceTexture()     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            boolean r0 = com.facetec.sdk.bl.f2996w     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r9 = 0
            if (r0 != 0) goto L3b
            int r0 = com.facetec.sdk.bl.E
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.facetec.sdk.bl.f2999z = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L32
            r0 = 91
            int r0 = r0 / r9
            if (r2 == 0) goto L35
            goto L3b
        L30:
            r0 = move-exception
            throw r0
        L32:
            if (r2 == 0) goto L35
            goto L3b
        L35:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0.<init>()     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            throw r0     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
        L3b:
            com.facetec.sdk.bu r0 = r10.f3013q     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            int r1 = r0.B     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            com.facetec.sdk.bu r0 = r10.f3013q     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            int r0 = r0.I     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.setDefaultBufferSize(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.view.Surface r6 = new android.view.Surface     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r6.<init>(r2)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            com.facetec.sdk.bd r0 = r10.f3008l     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.view.Surface r5 = r0.I()     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CameraDevice r0 = r10.f3004h     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r4 = 1
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r4)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r10.f3011o = r0     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0.addTarget(r6)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0.addTarget(r5)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.set(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r8 = 11
            boolean r0 = r10.V(r0, r8)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            if (r0 == 0) goto L82
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.set(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
        L82:
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.set(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.set(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Builder r2 = r10.f3011o     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.STATISTICS_FACE_DETECT_MODE     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.set(r1, r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.hardware.camera2.CameraDevice r2 = r10.f3004h     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            android.view.Surface[] r0 = new android.view.Surface[r7]     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0[r9] = r6     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0[r4] = r5     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            com.facetec.sdk.bl$5 r0 = new com.facetec.sdk.bl$5     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r0.<init>()     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            r2.createCaptureSession(r1, r0, r3)     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            return
        Lb4:
            com.facetec.sdk.bd r0 = r10.f3008l     // Catch: android.hardware.camera2.CameraAccessException -> Lbc
            super.hashCode()     // Catch: java.lang.Throwable -> Lba android.hardware.camera2.CameraAccessException -> Lbc
            throw r3     // Catch: java.lang.Throwable -> Lba android.hardware.camera2.CameraAccessException -> Lbc
        Lba:
            r0 = move-exception
            throw r0
        Lbc:
            r0 = move-exception
            com.facetec.sdk.L.V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bl.F(com.facetec.sdk.bl):void");
    }

    static /* synthetic */ CameraCaptureSession I(bl blVar) {
        int i2 = 2 % 2;
        int i3 = f2999z + 121;
        int i4 = i3 % 128;
        E = i4;
        int i5 = i3 % 2;
        CameraCaptureSession cameraCaptureSession = blVar.f3005i;
        int i6 = i4 + 91;
        f2999z = i6 % 128;
        int i7 = i6 % 2;
        return cameraCaptureSession;
    }

    static /* synthetic */ void I(bl blVar, Activity activity, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = E + 53;
        f2999z = i5 % 128;
        int i6 = i5 % 2;
        blVar.Code(activity, i2, i3);
        int i7 = E + 89;
        f2999z = i7 % 128;
        int i8 = i7 % 2;
    }

    static boolean I(Context context) throws Throwable {
        int i2 = 2 % 2;
        Z Z2 = Z(context);
        if (Z2 == null || !Z2.I) {
            int i3 = f2999z + 115;
            E = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = f2999z + 87;
        E = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static /* synthetic */ void L(bl blVar) throws bi {
        int i2 = 2 % 2;
        int i3 = E + 31;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
        blVar.C();
        int i5 = f2999z + 21;
        E = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean S() {
        int i2 = 2 % 2;
        int i3 = E;
        int i4 = i3 + 39;
        f2999z = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        f2999z = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static float V(Activity activity) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2999z + 17;
        E = i3 % 128;
        if (i3 % 2 == 0) {
            bu buVarB = B((Context) activity);
            return buVarB.B * buVarB.I;
        }
        bu buVarB2 = B((Context) activity);
        return buVarB2.B / buVarB2.I;
    }

    static /* synthetic */ int V(bl blVar) {
        int i2 = 2 % 2;
        int i3 = f2999z + 111;
        int i4 = i3 % 128;
        E = i4;
        int i5 = i3 % 2;
        int i6 = blVar.f3002f;
        int i7 = i4 + 113;
        f2999z = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static String V(String str, char c2, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        Object obj = str3;
        if (str3 != null) {
            int i4 = E + 109;
            f2999z = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str3.toCharArray();
            int i6 = f2999z + 125;
            E = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        Object charArray2 = str2;
        if (str2 != null) {
            int i8 = f2999z + 27;
            E = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 11 / 0;
                charArray2 = str2.toCharArray();
            } else {
                charArray2 = str2.toCharArray();
            }
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj2 = str;
        if (str != null) {
            int i10 = E + 51;
            f2999z = i10 % 128;
            int i11 = i10 % 2;
            char[] charArray3 = str.toCharArray();
            int i12 = f2999z + 125;
            E = i12 % 128;
            int i13 = i12 % 2;
            obj2 = charArray3;
        }
        char[] cArr3 = (char[]) cArr2.clone();
        char[] cArr4 = (char[]) ((char[]) obj2).clone();
        cArr3[0] = (char) (c2 ^ cArr3[0]);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length = cArr.length;
        char[] cArr5 = new char[length];
        for (int i14 = 0; i14 < length; i14++) {
            et.Z(cArr3, cArr4, i14);
            cArr5[i14] = (char) (((((long) (cArr[i14] ^ cArr3[(i14 + 3) % 4])) ^ f2995u) ^ ((long) f2997x)) ^ ((long) f2998y));
        }
        return new String(cArr5);
    }

    private boolean V(CameraCharacteristics.Key<int[]> key, int i2) {
        int i3 = 2 % 2;
        int[] iArr = (int[]) this.f3003g.get(key);
        if (iArr != null) {
            int i4 = f2999z + 7;
            E = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 : iArr) {
                if (i6 == i2) {
                    int i7 = E + 65;
                    f2999z = i7 % 128;
                    int i8 = i7 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ CameraCaptureSession Z(bl blVar, CameraCaptureSession cameraCaptureSession) {
        int i2 = 2 % 2;
        int i3 = E + 5;
        int i4 = i3 % 128;
        f2999z = i4;
        int i5 = i3 % 2;
        blVar.f3005i = cameraCaptureSession;
        int i6 = i4 + 107;
        E = i6 % 128;
        if (i6 % 2 != 0) {
            return cameraCaptureSession;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.facetec.sdk.bl.Z Z(android.content.Context r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bl.Z(android.content.Context):com.facetec.sdk.bl$Z");
    }

    static /* synthetic */ Semaphore Z(bl blVar) {
        int i2 = 2 % 2;
        int i3 = E + 95;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
        Semaphore semaphore = blVar.f3009m;
        if (i4 == 0) {
            return semaphore;
        }
        throw null;
    }

    @Override // com.facetec.sdk.be
    public final View Code() {
        int i2 = 2 % 2;
        int i3 = f2999z + 115;
        int i4 = i3 % 128;
        E = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        B b2 = this.f3001e;
        int i5 = i4 + 73;
        f2999z = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return b2;
    }

    @Override // com.facetec.sdk.be
    final void Code(MotionEvent motionEvent, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = f2999z + 99;
        E = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.facetec.sdk.be
    final void Code(boolean z2) {
        int i2 = 2 % 2;
        int i3 = E + 85;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.facetec.sdk.be
    public final void I() {
        int i2 = 2 % 2;
        int i3 = f2999z + 115;
        E = i3 % 128;
        int i4 = i3 % 2;
        HandlerThread handlerThread = this.f3010n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f3010n.join();
                this.f3010n = null;
                this.f3007k.removeCallbacksAndMessages(null);
                this.f3007k = null;
            } catch (InterruptedException e2) {
                L.V(e2);
            }
        }
        try {
            C();
        } catch (Exception unused) {
        }
        bd bdVar = this.f3008l;
        if (bdVar != null) {
            int i5 = f2999z + 11;
            E = i5 % 128;
            if (i5 % 2 == 0) {
                bdVar.V();
                this.f3008l = null;
                throw null;
            }
            bdVar.V();
            this.f3008l = null;
            int i6 = E + 31;
            f2999z = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f3016t = true;
    }

    @Override // com.facetec.sdk.be
    final void I(boolean z2) {
        int i2 = 2 % 2;
        int i3 = E + 95;
        f2999z = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0016  */
    @Override // com.facetec.sdk.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void V() throws java.lang.Throwable {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.facetec.sdk.bl.f2999z
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.facetec.sdk.bl.E = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L7a
            android.os.Handler r1 = r10.f3007k
            r0 = 12
            int r0 = r0 / 0
            if (r1 == 0) goto L8d
        L16:
            android.os.Handler r5 = r10.f3007k
            com.facetec.sdk.bl$1 r3 = new com.facetec.sdk.bl$1
            r3.<init>()
            java.lang.String r4 = "En\u007f*\u007f\u0017-\u001c:X.cW\u0004\u001c\u0001\u0014;"
            r1 = 16997(0x4265, float:2.3818E-41)
            r2 = 1942(0x796, float:2.721E-42)
            int r0 = yg.C1607wl.Xd()
            r0 = r0 ^ r1
            short r1 = (short) r0
            int r0 = yg.C1607wl.Xd()
            r0 = r0 ^ r2
            short r0 = (short) r0
            java.lang.String r0 = yg.Jg.Wd(r4, r1, r0)
            java.lang.Class r7 = java.lang.Class.forName(r0)
            r0 = 1
            java.lang.Class[] r6 = new java.lang.Class[r0]
            r8 = 0
            java.lang.String r4 = "lg:x0\u001evz\u0005/x94\t[6\u000f}"
            r1 = 10711(0x29d7, float:1.501E-41)
            r2 = 31367(0x7a87, float:4.3955E-41)
            int r0 = yg.C1607wl.Xd()
            r0 = r0 ^ r1
            short r1 = (short) r0
            int r0 = yg.C1607wl.Xd()
            r0 = r0 ^ r2
            short r0 = (short) r0
            java.lang.String r0 = yg.ZO.xd(r4, r1, r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r6[r8] = r0
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "\u000f\u000bMt"
            r1 = 9838(0x266e, float:1.3786E-41)
            r2 = 15291(0x3bbb, float:2.1427E-41)
            int r0 = yg.FB.Xd()
            r0 = r0 ^ r1
            short r1 = (short) r0
            int r0 = yg.FB.Xd()
            r0 = r0 ^ r2
            short r0 = (short) r0
            java.lang.String r0 = yg.C1626yg.Ud(r3, r1, r0)
            java.lang.reflect.Method r1 = r7.getMethod(r0, r6)
            r0 = 1
            goto L7f
        L7a:
            android.os.Handler r0 = r10.f3007k
            if (r0 == 0) goto L8d
            goto L16
        L7f:
            r1.setAccessible(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L87
            java.lang.Object r0 = r1.invoke(r5, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L87
            goto L8d
        L87:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            throw r0
        L8d:
            int r0 = com.facetec.sdk.bl.E
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.facetec.sdk.bl.f2999z = r0
            int r1 = r1 % r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bl.V():void");
    }

    @Override // com.facetec.sdk.be
    final void Z() {
        int i2 = 2 % 2;
        int i3 = E;
        int i4 = i3 + 1;
        f2999z = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.f3012p) {
            return;
        }
        this.f3012p = true;
        bd bdVar = this.f3008l;
        if (bdVar != null) {
            int i5 = i3 + 109;
            f2999z = i5 % 128;
            int i6 = i5 % 2;
            bdVar.I(this.f3015s);
        }
    }

    @Override // com.facetec.sdk.be
    final void Z(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f2999z + 103;
        E = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
    }
}
