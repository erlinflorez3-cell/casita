package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
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
public class MaskDetectorKitAndroid {
    private static Map CameraConstants = null;
    private static byte[] IncodeCamera = null;
    private static getPreviewView ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static long f3651e1 = 0;
    private static int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static boolean getConfig = false;
    private static char[] getContext = null;
    private static final byte[] getExposureCompensationState = null;
    private static boolean getFrameAnalyzerWrapper = false;
    private static final int getImagePreview = 0;
    private static int getPreviewView = 0;
    private static long setConfig = 0;

    public native float detectMask(Bitmap bitmap) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        e1();
        getAnalysisEvents = 0;
        getCameraState = 1;
        ProcessCameraProviderExtensionsKt();
        IncodeCamera();
        CameraConstants();
        try {
            byte[] bArr = getExposureCompensationState;
            byte b2 = bArr[15];
            byte b3 = (byte) (-bArr[5]);
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            e1((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getAnalysisEvents + 15;
            getCameraState = i2 % 128;
            int i3 = i2 % 2;
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public MaskDetectorKitAndroid() {
    }

    public MaskDetectorKitAndroid(String str) throws RecogKitInitException {
        loadModel(str);
    }

    private static void c(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        getAnalysisEvents getanalysisevents = new getAnalysisEvents();
        char[] cArrIncodeCamera = getAnalysisEvents.IncodeCamera(setConfig ^ 4672391023231308849L, (char[]) charArray, i2);
        getanalysisevents.ProcessCameraProviderExtensionsKt = 4;
        while (getanalysisevents.ProcessCameraProviderExtensionsKt < cArrIncodeCamera.length) {
            getanalysisevents.getAvailableCameraInternals = getanalysisevents.ProcessCameraProviderExtensionsKt - 4;
            int i3 = getanalysisevents.ProcessCameraProviderExtensionsKt;
            try {
                Object[] objArr2 = {Long.valueOf(cArrIncodeCamera[getanalysisevents.ProcessCameraProviderExtensionsKt] ^ cArrIncodeCamera[getanalysisevents.ProcessCameraProviderExtensionsKt % 4]), Long.valueOf(getanalysisevents.getAvailableCameraInternals), Long.valueOf(setConfig)};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-948699641);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getDoubleTapTimeout() >> 16, (Process.myPid() >> 22) + 34, (char) (17614 - TextUtils.lastIndexOf("", '0')), 1163040582, false, "y", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrIncodeCamera[i3] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getanalysisevents, getanalysisevents};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(588379707);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getPressedStateDuration() >> 16, 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (17615 - (Process.myPid() >> 22)), -1590648966, false, "w", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrIncodeCamera, 4, cArrIncodeCamera.length - 4);
    }

    private static InputStream getAvailableCameraInternals(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = f3651e1;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, ProcessCameraProviderExtensionsKt, s2);
    }

    private static void b(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
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
        char[] cArr2 = getContext;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451595980);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getEdgeSlop() >> 16, (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 33, (char) (Process.getGidForName("") + 17616), 1731483765, false, "m", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                    i3++;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(getPreviewView)};
        Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451625771);
        if (availableCameraInternals2 == null) {
            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, 33 - TextUtils.lastIndexOf("", '0', 0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17615), 1731581332, false, "l", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
        if (getFrameAnalyzerWrapper) {
            getframeanalyzerwrapper.IncodeCamera = bArr.length;
            char[] cArr4 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr4[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[bArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] + i2] - iIntValue);
                Object[] objArr4 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(KeyEvent.normalizeMetaState(0), 34 - ExpandableListView.getPackedPositionType(0L), (char) (17615 - TextUtils.indexOf("", "", 0, 0)), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (getConfig) {
            getframeanalyzerwrapper.IncodeCamera = cArr.length;
            char[] cArr5 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr5[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[cArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] - i2] - iIntValue);
                Object[] objArr5 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(View.resolveSize(0, 0), 34 - Gravity.getAbsoluteGravity(0, 0), (char) (KeyEvent.normalizeMetaState(0) + 17615), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = com.incode.recogkitandroid.MaskDetectorKitAndroid.getExposureCompensationState
            int r0 = r10 * 14
            int r7 = 18 - r0
            int r0 = r11 * 20
            int r6 = 102 - r0
            int r0 = r9 * 4
            int r5 = 15 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r8 != 0) goto L2e
            r0 = r7
            r2 = r3
        L15:
            int r7 = r7 + 1
            int r0 = -r0
            int r6 = r6 + r0
            int r6 = r6 + (-3)
            r1 = r2
        L1c:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r5) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2b:
            r0 = r8[r7]
            goto L15
        L2e:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.MaskDetectorKitAndroid.a(byte, int, byte, java.lang.Object[]):void");
    }

    static void e1() {
        getExposureCompensationState = new byte[]{123, Ascii.DC4, 46, -99, -22, -1, -15, 5, Ascii.EM, MessagePack.Code.MAP32, -14, 48, MessagePack.Code.INT8, 7, -17, 0, 3, 2, -6, -8, 7, Ascii.NAK, MessagePack.Code.NEGFIXINT_PREFIX, 4, -19, Ascii.SO, -20, -10};
        getImagePreview = 163;
    }

    static void ProcessCameraProviderExtensionsKt() {
        getContext = new char[]{48021, 47936, 47943, 47952, 47937, 47957, 47947, 48010, 47951, 47946, 47939, 47958, 47941, 47944, 47949, 47948, 47950, 47954, 47956, 48054, 47955, 48040, 47942, 47967, 47953, 48030, 47938, 47966, 48047, 48049, 48039, 48052};
        getPreviewView = -2007974940;
        getConfig = true;
        getFrameAnalyzerWrapper = true;
        setConfig = -8331408046219707605L;
    }

    static void IncodeCamera() {
        IncodeCamera = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        getAvailableCameraInternals = map;
        CameraConstants = new HashMap();
    }

    static void CameraConstants() {
        f3651e1 = -9069852447415910728L;
        ProcessCameraProviderExtensionsKt = (getPreviewView) new startCamera(new ByteArrayInputStream(IncodeCamera), getAvailableCameraInternals, CameraConstants).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0429 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0604 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e1(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.MaskDetectorKitAndroid.e1(java.lang.String):void");
    }
}
