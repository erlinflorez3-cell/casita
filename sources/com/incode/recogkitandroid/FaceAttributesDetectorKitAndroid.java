package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.biocatch.client.android.sdk.core.Constants;
import com.facebook.common.callercontext.ContextChain;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class FaceAttributesDetectorKitAndroid {
    private static long CameraConstants = 0;
    private static Map IncodeCamera = null;
    private static byte[] ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static getPreviewView f3646e1 = null;
    private static int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static final byte[] getCameraState = null;
    private static char getConfig = 0;
    private static char getContext = 0;
    private static char getFrameAnalyzerWrapper = 0;
    private static int getImagePreview = 0;
    private static char getPreviewView = 0;
    private static int[] setConfig = null;
    private static final int setExposureCompensationState = 0;

    public native FaceAttributes detectAttributes(Bitmap bitmap, float f2, float f3, float f4, float f5) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        getAvailableCameraInternals();
        getAnalysisEvents = 0;
        getImagePreview = 1;
        IncodeCamera();
        CameraConstants();
        ProcessCameraProviderExtensionsKt();
        try {
            byte b2 = getCameraState[5];
            Object[] objArr = new Object[1];
            a((byte) (-b2), r2[15], (byte) (-b2), objArr);
            getAvailableCameraInternals((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getImagePreview + 23;
            getAnalysisEvents = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public FaceAttributesDetectorKitAndroid() {
    }

    public FaceAttributesDetectorKitAndroid(String str) throws RecogKitInitException {
        loadModel(str);
    }

    private static InputStream CameraConstants(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = CameraConstants;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, f3646e1, s2);
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
                int i5 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) getPreviewView) ^ 1254585390605948909L)));
                int i6 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getFrameAnalyzerWrapper);
                    objArr2[2] = Integer.valueOf(i6);
                    objArr2[c2] = Integer.valueOf(i5);
                    objArr2[0] = Integer.valueOf(c3);
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1668328690);
                    if (availableCameraInternals == null) {
                        int bitsPerPixel = (-1) - ImageFormat.getBitsPerPixel(0);
                        int iAxisFromString = 33 - MotionEvent.axisFromString("");
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 17615);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(bitsPerPixel, iAxisFromString, cNormalizeMetaState, 514734671, false, "j", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) getConfig) ^ 1254585390605948909L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getContext)};
                    Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1668328690);
                    if (availableCameraInternals2 == null) {
                        availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 34, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 17615), 514734671, false, "j", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.indexOf("", ""), KeyEvent.keyCodeFromString("") + 34, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 17615), 1737365613, false, "h", new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
        getContext getcontext = new getContext();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = setConfig;
        int i3 = -451715144;
        long j2 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451715144);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 33, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17614), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
                    i4++;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = setConfig;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i5])};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(i3);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 33 - TextUtils.lastIndexOf("", '0', 0), (char) (Drawable.resolveOpacity(0, 0) + 17615), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
                }
                iArr6[i5] = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
                i5++;
                i3 = -451715144;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getcontext.f3656e1 = 0;
        while (getcontext.f3656e1 < iArr.length) {
            cArr[0] = (char) (iArr[getcontext.f3656e1] >> 16);
            cArr[1] = (char) iArr[getcontext.f3656e1];
            cArr[2] = (char) (iArr[getcontext.f3656e1 + 1] >> 16);
            cArr[3] = (char) iArr[getcontext.f3656e1 + 1];
            getcontext.getAvailableCameraInternals = (cArr[0] << 16) + cArr[1];
            getcontext.IncodeCamera = (cArr[2] << 16) + cArr[3];
            getContext.CameraConstants(iArr4);
            for (int i6 = 0; i6 < 16; i6++) {
                getcontext.getAvailableCameraInternals ^= iArr4[i6];
                Object[] objArr4 = {getcontext, Integer.valueOf(getContext.ProcessCameraProviderExtensionsKt(getcontext.getAvailableCameraInternals)), getcontext, getcontext};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(678506218);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) (17615 - (ViewConfiguration.getLongPressTimeout() >> 16)), -1437579349, false, "g", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue();
                getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
                getcontext.IncodeCamera = iIntValue;
            }
            int i7 = getcontext.getAvailableCameraInternals;
            getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
            getcontext.IncodeCamera = i7;
            getcontext.IncodeCamera ^= iArr4[16];
            getcontext.getAvailableCameraInternals ^= iArr4[17];
            int i8 = getcontext.getAvailableCameraInternals;
            int i9 = getcontext.IncodeCamera;
            cArr[0] = (char) (getcontext.getAvailableCameraInternals >>> 16);
            cArr[1] = (char) getcontext.getAvailableCameraInternals;
            cArr[2] = (char) (getcontext.IncodeCamera >>> 16);
            cArr[3] = (char) getcontext.IncodeCamera;
            getContext.CameraConstants(iArr4);
            cArr2[getcontext.f3656e1 * 2] = cArr[0];
            cArr2[(getcontext.f3656e1 * 2) + 1] = cArr[1];
            cArr2[(getcontext.f3656e1 * 2) + 2] = cArr[2];
            cArr2[(getcontext.f3656e1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getcontext, getcontext};
            Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-865133782);
            if (availableCameraInternals4 == null) {
                availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) (Process.getGidForName("") + 17616), 1313763947, false, Constants.FLUSH_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 14
            int r0 = 17 - r0
            int r1 = r7 * 20
            int r8 = r1 + 82
            int r1 = r6 * 4
            int r7 = r1 + 11
            byte[] r6 = com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid.getCameraState
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2f
            r1 = r0
            r3 = r4
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            int r8 = r8 + (-3)
            r0 = r1
            r2 = r3
        L1b:
            int r3 = r2 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            if (r3 != r7) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L2a:
            int r1 = r0 + 1
            r0 = r6[r1]
            goto L15
        L2f:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid.a(short, short, short, java.lang.Object[]):void");
    }

    static void getAvailableCameraInternals() {
        getCameraState = new byte[]{112, Ascii.SUB, MessagePack.Code.FIXEXT2, 87, -22, -1, -15, 5, Ascii.EM, MessagePack.Code.MAP32, -14, 48, MessagePack.Code.INT8, 7, -17, 0, 3, 2, -6, -8, 7, Ascii.NAK, MessagePack.Code.NEGFIXINT_PREFIX, 4, -19, Ascii.SO, -20, -10};
        setExposureCompensationState = 37;
    }

    static void IncodeCamera() {
        getConfig = (char) 14963;
        getContext = (char) 32498;
        getPreviewView = (char) 10884;
        getFrameAnalyzerWrapper = (char) 26138;
        setConfig = new int[]{-1650844909, 883289680, 661990128, -1507572150, 1217824789, -587127701, 1770641011, 1656158638, 1181522527, 1174679215, 1744586210, 1318615194, -275532755, -220129954, -1746244852, 870965403, 292797207, 1609764258};
    }

    static void CameraConstants() {
        ProcessCameraProviderExtensionsKt = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        IncodeCamera = map;
        getAvailableCameraInternals = new HashMap();
    }

    static void ProcessCameraProviderExtensionsKt() {
        CameraConstants = -9069852447415910728L;
        f3646e1 = (getPreviewView) new startCamera(new ByteArrayInputStream(ProcessCameraProviderExtensionsKt), IncodeCamera, getAvailableCameraInternals).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0687 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void getAvailableCameraInternals(java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid.getAvailableCameraInternals(java.lang.String):void");
    }
}
