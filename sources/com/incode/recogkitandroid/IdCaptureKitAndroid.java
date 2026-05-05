package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.braze.Constants;
import com.dynatrace.android.agent.Global;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class IdCaptureKitAndroid {
    private static Map CameraConstants = null;
    private static byte[] IncodeCamera = null;
    private static getPreviewView ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static long f3648e1 = 0;
    private static int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static char[] getConfig = null;
    private static boolean getContext = false;
    private static int getExposureCompensationState = 0;
    private static char[] getFrameAnalyzerWrapper = null;
    private static int getImagePreview = 0;
    private static int getPreviewView = 0;
    private static boolean setConfig = false;
    private static long setExposureCompensationState = 0;
    private static final byte[] startRecording = null;
    private static final int stopRecording = 0;

    private native Result captureIdImpl(Bitmap bitmap, boolean z2, boolean z3) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native int getVersion();

    public native void loadModel(String str) throws RecogKitInitException;

    public native void loadModel(String str, float f2, float f3, float f4, float f5) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        ProcessCameraProviderExtensionsKt();
        getImagePreview = 0;
        getAnalysisEvents = 1;
        getExposureCompensationState = 0;
        getCameraState = 1;
        CameraConstants();
        getAvailableCameraInternals();
        e1();
        try {
            byte[] bArr = startRecording;
            byte b2 = bArr[5];
            byte b3 = bArr[15];
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            IncodeCamera((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getImagePreview + 97;
            getAnalysisEvents = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public IdCaptureKitAndroid() {
    }

    public IdCaptureKitAndroid(String str) throws RecogKitInitException {
        loadModel(str);
    }

    public IdCaptureKitAndroid(String str, float f2, float f3, float f4, float f5) throws RecogKitInitException {
        loadModel(str, f2, f3, f4, f5);
    }

    public class BarcodeQuad {
        private static int CameraConstants = 1;
        private static int getAvailableCameraInternals = 0;
        public Point[] quad;
        public String type;

        public BarcodeQuad(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.type = str;
            this.quad = new Point[]{new Point(i2, i3), new Point(i4, i5), new Point(i6, i7), new Point(i8, i9)};
        }

        public String toString() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 75;
            int i4 = i3 % 128;
            CameraConstants = i4;
            int i5 = i3 % 2;
            Point[] pointArr = this.quad;
            int i6 = i4 + 27;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            String string = "";
            for (Point point : pointArr) {
                string = new StringBuilder().append(string).append(point.x).append(Global.BLANK).append(point.y).append(Global.BLANK).toString();
            }
            return new StringBuilder().append(this.type).append("\n").append(string).toString();
        }
    }

    private static void c(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        setConfig setconfig = new setConfig();
        long[] jArr = new long[i3];
        setconfig.IncodeCamera = 0;
        while (setconfig.IncodeCamera < i3) {
            int i4 = setconfig.IncodeCamera;
            try {
                Object[] objArr2 = {Integer.valueOf(getFrameAnalyzerWrapper[i2 + i4])};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451536398);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 34 - TextUtils.getTrimmedLength(""), (char) (Color.green(0) + 17615), 1731686579, false, "o", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) availableCameraInternals).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(setExposureCompensationState), Integer.valueOf(c2)};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-2014949200);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, (char) ((Process.myPid() >> 22) + 17615), 96942577, false, "k", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) availableCameraInternals2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {setconfig, setconfig};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(2100393272);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(View.MeasureSpec.makeMeasureSpec(0, 0), 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (17615 - ((Process.getThreadPriority(0) + 20) >> 6)), -15721351, false, "t", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        setconfig.IncodeCamera = 0;
        while (setconfig.IncodeCamera < i3) {
            cArr[setconfig.IncodeCamera] = (char) jArr[setconfig.IncodeCamera];
            Object[] objArr5 = {setconfig, setconfig};
            Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(2100393272);
            if (availableCameraInternals4 == null) {
                availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.getTrimmedLength(""), TextUtils.getTrimmedLength("") + 34, (char) (17663 - AndroidCharacter.getMirror('0')), -15721351, false, "t", new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static InputStream e1(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = f3648e1;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, ProcessCameraProviderExtensionsKt, s2);
    }

    public class Result {
        public float backScore;
        public boolean barcodePass;
        public HashMap<String, BarcodeQuad> barcodeQuads;
        public int barcodeReadabilityClass;
        public float blur;
        public float cls;
        public float docAreaRatio;
        public float frontScore;
        public float glare;
        public float idScore;
        public String idType;
        public float iouScore;
        public float passportScore;
        public Point[] quad;
        public String side;
        public boolean textPass;
        public int textReadabilityClass;

        public Result(float f2, String str, float f3, float f4, float f5, float f6, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, HashMap<String, BarcodeQuad> map, String str2, float f7, float f8, int i10, boolean z2, int i11, boolean z3, float f9, float f10) {
            this.quad = new Point[]{new Point(i2, i3), new Point(i4, i5), new Point(i6, i7), new Point(i8, i9)};
            this.cls = f2;
            this.blur = f5;
            this.glare = f6;
            this.side = str;
            this.frontScore = f3;
            this.backScore = f4;
            this.idType = str2;
            this.idScore = f7;
            this.passportScore = f8;
            this.barcodeQuads = map;
            this.textReadabilityClass = i10;
            this.textPass = z2;
            this.barcodeReadabilityClass = i11;
            this.barcodePass = z3;
            this.docAreaRatio = f9;
            this.iouScore = f10;
        }

        public Result(float f2, String str, float f3, float f4, float f5, float f6, HashMap<String, BarcodeQuad> map, String str2, float f7, float f8, int i2, boolean z2, int i3, boolean z3, float f9, float f10) {
            this.cls = f2;
            this.side = str;
            this.frontScore = f3;
            this.backScore = f4;
            this.blur = f5;
            this.glare = f6;
            this.idType = str2;
            this.idScore = f7;
            this.passportScore = f8;
            this.barcodeQuads = map;
            this.textReadabilityClass = i2;
            this.textPass = z2;
            this.barcodeReadabilityClass = i3;
            this.barcodePass = z3;
            this.docAreaRatio = f9;
            this.iouScore = f10;
        }
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
        char[] cArr2 = getConfig;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451595980);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - TextUtils.lastIndexOf("", c2, 0, 0), AndroidCharacter.getMirror(c2) - 14, (char) (17616 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1731483765, false, "m", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                    i3++;
                    c2 = '0';
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
        long j2 = 0;
        if (availableCameraInternals2 == null) {
            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 34, (char) (17615 - (ViewConfiguration.getTouchSlop() >> 8)), 1731581332, false, "l", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
        if (getContext) {
            getframeanalyzerwrapper.IncodeCamera = bArr.length;
            char[] cArr4 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr4[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[bArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] + i2] - iIntValue);
                Object[] objArr4 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, View.getDefaultSize(0, 0) + 34, (char) (TextUtils.getCapsMode("", 0, 0) + 17615), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (setConfig) {
            getframeanalyzerwrapper.IncodeCamera = cArr.length;
            char[] cArr5 = new char[getframeanalyzerwrapper.IncodeCamera];
            getframeanalyzerwrapper.CameraConstants = 0;
            while (getframeanalyzerwrapper.CameraConstants < getframeanalyzerwrapper.IncodeCamera) {
                cArr5[getframeanalyzerwrapper.CameraConstants] = (char) (cArr2[cArr[(getframeanalyzerwrapper.IncodeCamera - 1) - getframeanalyzerwrapper.CameraConstants] - i2] - iIntValue);
                Object[] objArr5 = {getframeanalyzerwrapper, getframeanalyzerwrapper};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(829453106);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - TextUtils.lastIndexOf("", '0', 0, 0), (-16777182) - Color.rgb(0, 0, 0), (char) (17616 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1))), -1286530445, false, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals4).invoke(null, objArr5);
                j2 = 0;
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

    public Result captureId(Bitmap bitmap, Boolean bool, Boolean bool2) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = getExposureCompensationState + 45;
        getCameraState = i3 % 128;
        int i4 = i3 % 2;
        Result resultCaptureIdImpl = captureIdImpl(bitmap, bool.booleanValue(), bool2.booleanValue());
        int i5 = getExposureCompensationState + 17;
        getCameraState = i5 % 128;
        int i6 = i5 % 2;
        return resultCaptureIdImpl;
    }

    public Result captureId(Bitmap bitmap) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = getCameraState + 117;
        getExposureCompensationState = i3 % 128;
        int i4 = i3 % 2;
        Result resultCaptureIdImpl = captureIdImpl(bitmap, false, true);
        int i5 = getExposureCompensationState + 87;
        getCameraState = i5 % 128;
        if (i5 % 2 != 0) {
            return resultCaptureIdImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = com.incode.recogkitandroid.IdCaptureKitAndroid.startRecording
            int r6 = r8 + 4
            int r2 = r10 * 4
            int r1 = 15 - r2
            int r0 = r9 * 20
            int r5 = r0 + 82
            byte[] r4 = new byte[r1]
            int r3 = 14 - r2
            r2 = 0
            if (r7 != 0) goto L2d
            r0 = r3
            r1 = r2
        L15:
            int r0 = -r0
            int r5 = r5 + r0
            int r5 = r5 + (-3)
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r6 = r6 + 1
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r11[r2] = r0
            return
        L28:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L15
        L2d:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.IdCaptureKitAndroid.a(short, byte, short, java.lang.Object[]):void");
    }

    static void ProcessCameraProviderExtensionsKt() {
        startRecording = new byte[]{126, 117, -109, 43, -22, -1, -15, 5, Ascii.EM, MessagePack.Code.MAP32, -14, 48, MessagePack.Code.INT8, 7, -17, 0, 3, 2, -6, -8, 7, Ascii.NAK, MessagePack.Code.NEGFIXINT_PREFIX, 4, -19, Ascii.SO, -20, -10};
        stopRecording = JfifUtil.MARKER_SOI;
    }

    static void CameraConstants() {
        getConfig = new char[]{48112, 48047, 48034, 48063, 48044, 48048, 48054, 48113, 48042, 48049, 48046, 48061, 48032, 48055, 48040, 48043, 48024, 48053, 48057, 48051, 48029, 48062, 48023, 48045, 48058, 48060, 48010, 48059, 48016, 48041, 48028, 48002, 48019};
        getPreviewView = -2007974973;
        setConfig = true;
        getContext = true;
        getFrameAnalyzerWrapper = new char[]{8695, 21193, 51094, 30815, 60688, 25070, 37565, 1890, 47139, 3142, 32629, 59950, 21950, 49322, 19549, 48912, 10945, 38358, 3142, 32629, 59946, 21989, 49378, 19521, 48904, 10957, 38272, 250, 35942, 65325, 27388, 54746, 16757, 52234, 16330, 43768, 5565, 33136, 3113, 32710, 60085, 22090, 49436, 19489, 49128, 10903, 38520, 262, 36057, 65413, 27457, 59368, 38099, 405, 48712, 3147, 32625, 59944, 21954, 49288, 52186, 47336, 11703, 37474};
        setExposureCompensationState = 2568701019331460884L;
    }

    static void getAvailableCameraInternals() {
        IncodeCamera = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        getAvailableCameraInternals = map;
        CameraConstants = new HashMap();
    }

    static void e1() {
        f3648e1 = -9069852447415910728L;
        ProcessCameraProviderExtensionsKt = (getPreviewView) new startCamera(new ByteArrayInputStream(IncodeCamera), getAvailableCameraInternals, CameraConstants).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0499 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x069a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void IncodeCamera(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.IdCaptureKitAndroid.IncodeCamera(java.lang.String):void");
    }
}
