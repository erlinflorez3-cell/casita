package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.braze.Constants;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class FacePadKitAndroid {
    private static long CameraConstants = 0;
    private static getPreviewView IncodeCamera = null;
    private static byte[] ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static Map f3647e1 = null;
    private static final int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static int getConfig = 0;
    private static boolean getContext = false;
    private static int getExposureCompensationState = 0;
    private static int getFrameAnalyzerWrapper = 0;
    private static final byte[] getImagePreview = null;
    private static char[] getPreviewView = null;
    private static boolean setConfig = false;

    public native float detectSpoof(Bitmap bitmap, Bitmap bitmap2, int i2) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        ProcessCameraProviderExtensionsKt();
        getExposureCompensationState = 0;
        getCameraState = 1;
        e1();
        CameraConstants();
        IncodeCamera();
        try {
            byte b2 = getImagePreview[15];
            Object[] objArr = new Object[1];
            a(b2, b2, r1[5], objArr);
            getAvailableCameraInternals((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getExposureCompensationState + 75;
            getCameraState = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public FacePadKitAndroid() {
    }

    public FacePadKitAndroid(String str) throws RecogKitInitException {
        loadModel(str);
    }

    private static InputStream getAvailableCameraInternals(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = CameraConstants;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, IncodeCamera, s2);
    }

    private static void b(int i2, int i3, boolean z2, int i4, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        setExposureCompensationState setexposurecompensationstate = new setExposureCompensationState();
        char[] cArr2 = new char[i3];
        setexposurecompensationstate.ProcessCameraProviderExtensionsKt = 0;
        while (setexposurecompensationstate.ProcessCameraProviderExtensionsKt < i3) {
            setexposurecompensationstate.f3657e1 = cArr[setexposurecompensationstate.ProcessCameraProviderExtensionsKt];
            cArr2[setexposurecompensationstate.ProcessCameraProviderExtensionsKt] = (char) (i4 + setexposurecompensationstate.f3657e1);
            int i5 = setexposurecompensationstate.ProcessCameraProviderExtensionsKt;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(getConfig)};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1057294296);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(KeyEvent.keyCodeFromString(""), 33 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0') + 17616), 1121685865, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setexposurecompensationstate, setexposurecompensationstate};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1712427226);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 34, (char) (Color.rgb(0, 0, 0) + 16794831), 466552423, false, "b", new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            setexposurecompensationstate.CameraConstants = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - setexposurecompensationstate.CameraConstants, setexposurecompensationstate.CameraConstants);
            System.arraycopy(cArr3, setexposurecompensationstate.CameraConstants, cArr2, 0, i3 - setexposurecompensationstate.CameraConstants);
        }
        if (z2) {
            char[] cArr4 = new char[i3];
            setexposurecompensationstate.ProcessCameraProviderExtensionsKt = 0;
            while (setexposurecompensationstate.ProcessCameraProviderExtensionsKt < i3) {
                cArr4[setexposurecompensationstate.ProcessCameraProviderExtensionsKt] = cArr2[(i3 - setexposurecompensationstate.ProcessCameraProviderExtensionsKt) - 1];
                Object[] objArr4 = {setexposurecompensationstate, setexposurecompensationstate};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1712427226);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, 34 - View.resolveSizeAndState(0, 0, 0), (char) (View.getDefaultSize(0, 0) + 17615), 466552423, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        Object charArray = str4;
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        getFrameAnalyzerWrapper getframeanalyzerwrapper = new getFrameAnalyzerWrapper();
        char[] cArr2 = getPreviewView;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451595980);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getKeyRepeatTimeout() >> 16, 34 - TextUtils.getOffsetBefore("", 0), (char) (Process.getGidForName("") + 17616), 1731483765, false, "m", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(getFrameAnalyzerWrapper)};
        Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451625771);
        if (availableCameraInternals2 == null) {
            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 34 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((Process.myPid() >> 22) + 17615), 1731581332, false, "l", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
        if (setConfig) {
            getframeanalyzerwrapper.IncodeCamera = bArr.length;
            char[] cArr4 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr4[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[bArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] + i2] - iIntValue);
                Object[] objArr4 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, TextUtils.indexOf((CharSequence) "", '0') + 35, (char) (17615 - Color.argb(0, 0, 0, 0)), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (getContext) {
            getframeanalyzerwrapper.IncodeCamera = cArr.length;
            char[] cArr5 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr5[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[cArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] - i2] - iIntValue);
                Object[] objArr5 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 34, (char) (17615 - ExpandableListView.getPackedPositionGroup(0L)), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getframeanalyzerwrapper.IncodeCamera = iArr.length;
        char[] cArr6 = new char[getframeanalyzerwrapper.IncodeCamera];
        getframeanalyzerwrapper.CameraConstants = 0;
        while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
            cArr6[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[iArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] - i2] - iIntValue);
            getframeanalyzerwrapper.CameraConstants++;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = com.incode.recogkitandroid.FacePadKitAndroid.getImagePreview
            int r0 = r10 * 14
            int r7 = r0 + 4
            int r0 = r9 * 20
            int r6 = r0 + 82
            int r0 = r11 * 4
            int r5 = r0 + 11
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r8 != 0) goto L2f
            r1 = r7
            r2 = r3
        L15:
            int r6 = r6 + r7
            int r6 = r6 + (-3)
            int r7 = r1 + 1
            r1 = r2
        L1b:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r5) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2a:
            r0 = r8[r7]
            r1 = r7
            r7 = r0
            goto L15
        L2f:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.FacePadKitAndroid.a(int, int, short, java.lang.Object[]):void");
    }

    static void ProcessCameraProviderExtensionsKt() {
        getImagePreview = new byte[]{110, MessagePack.Code.UINT8, MessagePack.Code.NEVER_USED, 68, Ascii.SYN, 1, Ascii.SI, -5, -25, 33, Ascii.SO, MessagePack.Code.INT8, 48, -7, 17, 0, -3, -2, 6, 8, -7, -21, 32, -4, 19, -14, Ascii.DC4, 10};
        getAnalysisEvents = 131;
    }

    static void e1() {
        getPreviewView = new char[]{47818, 47745, 47748, 47761, 47750, 47754, 47752, 47819, 47756, 47755, 47744, 47767, 47866, 47753, 47746, 47757, 47766, 47759, 47763, 47760, 47775, 47765, 47852, 47747, 47862, 47849, 47772, 47844, 47751, 47861};
        getFrameAnalyzerWrapper = -2007975131;
        getContext = true;
        setConfig = true;
        getConfig = -1265249363;
    }

    static void CameraConstants() {
        ProcessCameraProviderExtensionsKt = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        getAvailableCameraInternals = map;
        f3647e1 = new HashMap();
    }

    static void IncodeCamera() {
        CameraConstants = -9069852447415910728L;
        IncodeCamera = (getPreviewView) new startCamera(new ByteArrayInputStream(ProcessCameraProviderExtensionsKt), getAvailableCameraInternals, f3647e1).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0571 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x076a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void getAvailableCameraInternals(java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.FacePadKitAndroid.getAvailableCameraInternals(java.lang.String):void");
    }
}
