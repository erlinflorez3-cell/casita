package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class SelfieFaceDetectorKit {
    private static Map CameraConstants = null;
    private static getPreviewView IncodeCamera = null;
    private static long ProcessCameraProviderExtensionsKt = 0;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static Map f3653e1 = null;
    private static byte[] getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static char getConfig = 0;
    private static char getContext = 0;
    private static final byte[] getExposureCompensationState = null;
    private static char getFrameAnalyzerWrapper = 0;
    private static int getImagePreview = 0;
    private static long getPreviewView = 0;
    private static char setConfig = 0;
    private static final int setExposureCompensationState = 0;

    public native ArrayList<Face> detect(Bitmap bitmap, float f2) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        ProcessCameraProviderExtensionsKt();
        getImagePreview = 0;
        getCameraState = 1;
        e1();
        CameraConstants();
        getAvailableCameraInternals();
        try {
            byte[] bArr = getExposureCompensationState;
            byte b2 = bArr[5];
            byte b3 = bArr[15];
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            e1((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getCameraState + 105;
            getImagePreview = i2 % 128;
            int i3 = i2 % 2;
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public SelfieFaceDetectorKit() {
    }

    public SelfieFaceDetectorKit(String str) throws RecogKitInitException {
        loadModel(str);
    }

    private static void c(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        stopRecording stoprecording = new stopRecording();
        stoprecording.CameraConstants = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        stoprecording.IncodeCamera = 0;
        while (stoprecording.IncodeCamera < cArr.length) {
            int i3 = stoprecording.IncodeCamera;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[stoprecording.IncodeCamera]), stoprecording, stoprecording};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1503410903);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(View.MeasureSpec.getMode(0), (ViewConfiguration.getTapTimeout() >> 16) + 34, (char) (17615 - (Process.myPid() >> 22)), 608349288, false, "x", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) availableCameraInternals).invoke(null, objArr2)).longValue() ^ (getPreviewView ^ 4489085868529267874L);
                Object[] objArr3 = {stoprecording, stoprecording};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1770927302);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getScrollBarSize() >> 8, 34 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (17615 - View.MeasureSpec.getSize(0)), 340828795, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        stoprecording.IncodeCamera = 0;
        while (stoprecording.IncodeCamera < cArr.length) {
            cArr2[stoprecording.IncodeCamera] = (char) jArr[stoprecording.IncodeCamera];
            Object[] objArr4 = {stoprecording, stoprecording};
            Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1770927302);
            if (availableCameraInternals3 == null) {
                availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(KeyEvent.getMaxKeyCode() >> 16, 35 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (17614 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 340828795, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static InputStream ProcessCameraProviderExtensionsKt(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = ProcessCameraProviderExtensionsKt;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, IncodeCamera, s2);
    }

    private static void b(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        getImagePreview getimagepreview = new getImagePreview();
        char[] cArr2 = new char[cArr.length];
        getimagepreview.IncodeCamera = 0;
        char[] cArr3 = new char[2];
        while (getimagepreview.IncodeCamera < cArr.length) {
            cArr3[0] = cArr[getimagepreview.IncodeCamera];
            char c2 = 1;
            cArr3[1] = cArr[getimagepreview.IncodeCamera + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[0];
                int i5 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) setConfig) ^ 1254585390605948909L)));
                int i6 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getContext);
                    objArr2[2] = Integer.valueOf(i6);
                    objArr2[c2] = Integer.valueOf(i5);
                    objArr2[0] = Integer.valueOf(c3);
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1668328690);
                    if (availableCameraInternals == null) {
                        int iAlpha = Color.alpha(0);
                        int gidForName = 33 - Process.getGidForName("");
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17615);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(iAlpha, gidForName, scrollBarFadeDuration, 514734671, false, "j", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) getFrameAnalyzerWrapper) ^ 1254585390605948909L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getConfig)};
                    Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1668328690);
                    if (availableCameraInternals2 == null) {
                        availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getScrollBarFadeDuration() >> 16, 34 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 17615), 514734671, false, "j", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) availableCameraInternals2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[getimagepreview.IncodeCamera] = cArr3[0];
            cArr2[getimagepreview.IncodeCamera + 1] = cArr3[1];
            Object[] objArr4 = {getimagepreview, getimagepreview};
            Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-441487060);
            if (availableCameraInternals3 == null) {
                availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (17615 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1737365613, false, "h", new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void a(short s2, int i2, int i3, Object[] objArr) {
        int i4 = (i2 * 14) + 4;
        int i5 = i3 * 4;
        byte[] bArr = getExposureCompensationState;
        int i6 = 102 - (s2 * 20);
        byte[] bArr2 = new byte[15 - i5];
        int i7 = 14 - i5;
        int i8 = -1;
        if (bArr == null) {
            i6 = (i7 + i4) - 3;
            i4++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i6;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i9 = i4;
                i6 = (i6 + bArr[i4]) - 3;
                i4 = i9 + 1;
            }
        }
    }

    static void ProcessCameraProviderExtensionsKt() {
        getExposureCompensationState = new byte[]{106, 50, -99, -104, Ascii.SYN, 1, Ascii.SI, -5, -25, 33, Ascii.SO, MessagePack.Code.INT8, 48, -7, 17, 0, -3, -2, 6, 8, -7, -21, 32, -4, 19, -14, Ascii.DC4, 10};
        setExposureCompensationState = 57;
    }

    static void e1() {
        getFrameAnalyzerWrapper = (char) 10951;
        getConfig = (char) 62343;
        setConfig = (char) 26773;
        getContext = (char) 24874;
        getPreviewView = -8448773616113652313L;
    }

    static void CameraConstants() {
        getAvailableCameraInternals = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        f3653e1 = map;
        CameraConstants = new HashMap();
    }

    static void getAvailableCameraInternals() {
        ProcessCameraProviderExtensionsKt = -9069852447415910728L;
        IncodeCamera = (getPreviewView) new startCamera(new ByteArrayInputStream(getAvailableCameraInternals), f3653e1, CameraConstants).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x061e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0438 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e1(java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.SelfieFaceDetectorKit.e1(java.lang.String):void");
    }
}
