package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class BarcodeReaderKitAndroid {
    private static getPreviewView CameraConstants = null;
    private static byte[] IncodeCamera = null;
    private static Map ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static long f3642e1 = 0;
    private static int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static int getConfig = 0;
    private static byte[] getContext = null;
    private static int getExposureCompensationState = 0;
    private static int getFrameAnalyzerWrapper = 0;
    private static int getImagePreview = 0;
    private static short[] getPreviewView = null;
    private static final byte[] isVideoLivenessRecordingSupported = null;
    private static int setConfig = 0;
    private static int setExposureCompensationState = 0;
    private static final int stopCamera = 0;

    private native Barcode readImpl(Bitmap bitmap, Point[] pointArr, String str, boolean z2) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        ProcessCameraProviderExtensionsKt();
        getAnalysisEvents = 0;
        setExposureCompensationState = 1;
        getExposureCompensationState = 0;
        getCameraState = 1;
        getAvailableCameraInternals();
        CameraConstants();
        e1();
        try {
            byte b2 = isVideoLivenessRecordingSupported[5];
            Object[] objArr = new Object[1];
            a(b2, b2, r1[15], objArr);
            ProcessCameraProviderExtensionsKt((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = setExposureCompensationState + 105;
            getAnalysisEvents = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public BarcodeReaderKitAndroid() {
    }

    public BarcodeReaderKitAndroid(String str) throws RecogKitInitException {
        loadModel(str);
    }

    public class Barcode {
        public String rawBase64Content;
        public String textContent;

        public Barcode(String str, String str2) {
            this.rawBase64Content = str;
            this.textContent = str2;
        }
    }

    public Barcode read(Bitmap bitmap, Point[] pointArr, String str, Boolean bool) throws RecogKitInvalidInputException, RecogKitProcessException {
        int i2 = 2 % 2;
        int i3 = getCameraState + 65;
        getExposureCompensationState = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = bool.booleanValue();
        if (i4 == 0) {
            return readImpl(bitmap, pointArr, str, zBooleanValue);
        }
        readImpl(bitmap, pointArr, str, zBooleanValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static InputStream ProcessCameraProviderExtensionsKt(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = f3642e1;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, CameraConstants, s2);
    }

    private static void c(int i2, int i3, boolean z2, int i4, String str, Object[] objArr) throws Throwable {
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(getImagePreview)};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1057294296);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(Color.blue(0), Color.rgb(0, 0, 0) + 16777250, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17615), 1121685865, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setexposurecompensationstate, setexposurecompensationstate};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1712427226);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(Color.blue(0), 34 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 17616), 466552423, false, "b", new Class[]{Object.class, Object.class});
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
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getLongPressTimeout() >> 16, 34 - TextUtils.indexOf("", "", 0), (char) (17614 - TextUtils.lastIndexOf("", '0', 0)), 466552423, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i2, byte b2, int i3, int i4, short s2, Object[] objArr) throws Throwable {
        long j2;
        getExposureCompensationState getexposurecompensationstate = new getExposureCompensationState();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getConfig)};
            Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
            float f2 = 0.0f;
            if (availableCameraInternals == null) {
                availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(Color.blue(0), 35 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (17616 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = getContext;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451834308);
                        if (availableCameraInternals2 == null) {
                            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants((TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)), TextUtils.lastIndexOf("", c2, 0) + 35, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17615), 1731258237, false, "e", new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) availableCameraInternals2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f2 = 0.0f;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getContext;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(setConfig)};
                    Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
                    if (availableCameraInternals3 == null) {
                        availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - TextUtils.lastIndexOf("", '0', 0, 0), 34 - View.MeasureSpec.getMode(0), (char) (17615 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue()]) ^ 2200953557445420308L)) + ((int) (((long) getConfig) ^ 2200953557445420308L)));
                    j2 = 2200953557445420308L;
                } else {
                    j2 = 2200953557445420308L;
                    iIntValue = (short) (((short) (((long) getPreviewView[i4 + ((int) (((long) setConfig) ^ 2200953557445420308L))]) ^ 2200953557445420308L)) + ((int) (((long) getConfig) ^ 2200953557445420308L)));
                }
            } else {
                j2 = 2200953557445420308L;
            }
            if (iIntValue > 0) {
                getexposurecompensationstate.CameraConstants = ((i4 + iIntValue) - 2) + ((int) (((long) setConfig) ^ j2)) + i5;
                Object[] objArr5 = {getexposurecompensationstate, Integer.valueOf(i2), Integer.valueOf(getFrameAnalyzerWrapper), sb};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1881789883);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 34 - ExpandableListView.getPackedPositionType(0L), (char) (17616 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 234308356, false, "a", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) availableCameraInternals4).invoke(null, objArr5)).append(getexposurecompensationstate.IncodeCamera);
                getexposurecompensationstate.getAvailableCameraInternals = getexposurecompensationstate.IncodeCamera;
                byte[] bArr4 = getContext;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr5[i7] = (byte) (((long) bArr4[i7]) ^ 2200953557445420308L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getexposurecompensationstate.ProcessCameraProviderExtensionsKt = 1;
                while (getexposurecompensationstate.ProcessCameraProviderExtensionsKt < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = getContext;
                        getexposurecompensationstate.CameraConstants = getexposurecompensationstate.CameraConstants - 1;
                        getexposurecompensationstate.IncodeCamera = (char) (getexposurecompensationstate.getAvailableCameraInternals + (((byte) (((byte) (((long) bArr6[r2]) ^ 2200953557445420308L)) + s2)) ^ b2));
                    } else {
                        short[] sArr = getPreviewView;
                        getexposurecompensationstate.CameraConstants = getexposurecompensationstate.CameraConstants - 1;
                        getexposurecompensationstate.IncodeCamera = (char) (getexposurecompensationstate.getAvailableCameraInternals + (((short) (((short) (((long) sArr[r2]) ^ 2200953557445420308L)) + s2)) ^ b2));
                    }
                    sb.append(getexposurecompensationstate.IncodeCamera);
                    getexposurecompensationstate.getAvailableCameraInternals = getexposurecompensationstate.IncodeCamera;
                    getexposurecompensationstate.ProcessCameraProviderExtensionsKt++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 20
            int r8 = 102 - r0
            int r0 = r9 * 4
            int r7 = r0 + 11
            int r0 = r10 * 14
            int r6 = r0 + 4
            byte[] r5 = com.incode.recogkitandroid.BarcodeReaderKitAndroid.isVideoLivenessRecordingSupported
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L2e
            r8 = r7
            r0 = r6
            r2 = r3
        L16:
            int r6 = r6 + 1
            int r8 = r8 + r0
            int r8 = r8 + (-3)
            r1 = r2
        L1c:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L2b:
            r0 = r5[r6]
            goto L16
        L2e:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.BarcodeReaderKitAndroid.a(int, short, byte, java.lang.Object[]):void");
    }

    static void ProcessCameraProviderExtensionsKt() {
        isVideoLivenessRecordingSupported = new byte[]{70, MessagePack.Code.FLOAT32, 7, 50, Ascii.SYN, 1, Ascii.SI, -5, -25, 33, Ascii.SO, MessagePack.Code.INT8, 48, -7, 17, 0, -3, -2, 6, 8, -7, -21, 32, -4, 19, -14, Ascii.DC4, 10};
        stopCamera = 89;
    }

    static void getAvailableCameraInternals() {
        setConfig = 9388965;
        getConfig = 1856677155;
        getFrameAnalyzerWrapper = -204663883;
        getContext = new byte[]{Ascii.CAN, Ascii.NAK, -22, -23, Ascii.EM, -18, -25, Ascii.ETB, Ascii.CAN, 33, MessagePack.Code.ARRAY32, Ascii.NAK, -31, Ascii.CAN, -31, 17, 47, MessagePack.Code.FIXEXT2, -22, Ascii.CAN, 32, MessagePack.Code.STR16, -7, 7, -23, 33, MessagePack.Code.STR16, -7, 7, -23, 33, -27, Ascii.US, -29, Ascii.SI, -3, Ascii.EM, -22, Ascii.GS, 17, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.ETB, -19, 82, -85, Ascii.DC2, 47, MessagePack.Code.STR8, -1, 1, -29, -20, 16, -31, Ascii.DC2, -19, 55, MessagePack.Code.FLOAT32, Ascii.ESC, -22, 19, 5, -5, 4, -19, 9, -4, Ascii.ETB, -26, Ascii.ETB, 3, MessagePack.Code.TRUE, 7, Ascii.NAK, -30, 49, MessagePack.Code.NEVER_USED, Ascii.NAK, 6, -31, 17, 17, Ascii.FS, -7, Ascii.DC2, -21, Ascii.CAN, Ascii.ETB, -26, 55, MessagePack.Code.EXT32, Ascii.US, Ascii.ETB, -26, 55, -13, -5, Ascii.EM, -31, 7, -25, -22, MessagePack.Code.BIN32, Ascii.ESC, -22, MessagePack.Code.NEGFIXINT_PREFIX, 7, 5, -1, -27, -21, Ascii.GS, -23, -24, 5, 53, MessagePack.Code.STR8, Ascii.ESC, -22, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4};
        getImagePreview = -1265249497;
    }

    static void CameraConstants() {
        IncodeCamera = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        ProcessCameraProviderExtensionsKt = map;
        getAvailableCameraInternals = new HashMap();
    }

    static void e1() {
        f3642e1 = -9069852447415910728L;
        CameraConstants = (getPreviewView) new startCamera(new ByteArrayInputStream(IncodeCamera), ProcessCameraProviderExtensionsKt, getAvailableCameraInternals).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x067b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ProcessCameraProviderExtensionsKt(java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.BarcodeReaderKitAndroid.ProcessCameraProviderExtensionsKt(java.lang.String):void");
    }
}
