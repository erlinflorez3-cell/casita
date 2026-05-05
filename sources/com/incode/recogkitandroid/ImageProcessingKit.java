package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
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
public class ImageProcessingKit {
    private static Map CameraConstants = null;
    private static Map IncodeCamera = null;
    private static getPreviewView ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "ImageProcessingKit";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static long f3650e1 = 0;
    private static int getAnalysisEvents = 0;
    private static byte[] getAvailableCameraInternals = null;
    private static final byte[] getCameraState = null;
    private static int getConfig = 0;
    private static byte[] getContext = null;
    private static short[] getExposureCompensationState = null;
    private static int getFrameAnalyzerWrapper = 0;
    private static int getImagePreview = 0;
    private static long getPreviewView = 0;
    private static int setConfig = 0;
    private static final int setExposureCompensationState = 0;

    public static native float getBlurrinessLevel(Bitmap bitmap) throws ImageProcessingKitInvalidInputException, ImageProcessingKitProcessException;

    public static native float getCenterBrightnessLevel(Bitmap bitmap) throws ImageProcessingKitInvalidInputException, ImageProcessingKitProcessException;

    static {
        IncodeCamera();
        getAnalysisEvents = 0;
        getImagePreview = 1;
        ProcessCameraProviderExtensionsKt();
        CameraConstants();
        e1();
        try {
            byte b2 = getCameraState[5];
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            CameraConstants((String) objArr[0]);
            Log.d(TAG, "init success");
            int i2 = getAnalysisEvents + 33;
            getImagePreview = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e(TAG, "library not found");
        }
    }

    private static void b(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        getAnalysisEvents getanalysisevents = new getAnalysisEvents();
        char[] cArrIncodeCamera = getAnalysisEvents.IncodeCamera(getPreviewView ^ 4672391023231308849L, (char[]) charArray, i2);
        getanalysisevents.ProcessCameraProviderExtensionsKt = 4;
        while (getanalysisevents.ProcessCameraProviderExtensionsKt < cArrIncodeCamera.length) {
            getanalysisevents.getAvailableCameraInternals = getanalysisevents.ProcessCameraProviderExtensionsKt - 4;
            int i3 = getanalysisevents.ProcessCameraProviderExtensionsKt;
            try {
                Object[] objArr2 = {Long.valueOf(cArrIncodeCamera[getanalysisevents.ProcessCameraProviderExtensionsKt] ^ cArrIncodeCamera[getanalysisevents.ProcessCameraProviderExtensionsKt % 4]), Long.valueOf(getanalysisevents.getAvailableCameraInternals), Long.valueOf(getPreviewView)};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-948699641);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(AndroidCharacter.getMirror('0') - '0', (KeyEvent.getMaxKeyCode() >> 16) + 34, (char) (17615 - TextUtils.getCapsMode("", 0, 0)), 1163040582, false, "y", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrIncodeCamera[i3] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getanalysisevents, getanalysisevents};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(588379707);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ExpandableListView.getPackedPositionType(0L), 34 - KeyEvent.normalizeMetaState(0), (char) (17615 - Color.alpha(0)), -1590648966, false, "w", new Class[]{Object.class, Object.class});
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

    private static InputStream ProcessCameraProviderExtensionsKt(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = f3650e1;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, ProcessCameraProviderExtensionsKt, s2);
    }

    private static void c(byte b2, short s2, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        getExposureCompensationState getexposurecompensationstate = new getExposureCompensationState();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getFrameAnalyzerWrapper)};
            Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
            if (availableCameraInternals == null) {
                availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(Gravity.getAbsoluteGravity(0, 0), Gravity.getAbsoluteGravity(0, 0) + 34, (char) (17614 - TextUtils.lastIndexOf("", '0', 0)), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = getContext;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451834308);
                        if (availableCameraInternals2 == null) {
                            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Process.getGidForName("") + 35, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17615), 1731258237, false, "e", new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) availableCameraInternals2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getContext;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(getConfig)};
                    Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
                    if (availableCameraInternals3 == null) {
                        availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((Process.getThreadPriority(0) + 20) >> 6, 33 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17615), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue()]) ^ 2200953557445420308L)) + ((int) (((long) getFrameAnalyzerWrapper) ^ 2200953557445420308L)));
                    j2 = 2200953557445420308L;
                } else {
                    j2 = 2200953557445420308L;
                    iIntValue = (short) (((short) (((long) getExposureCompensationState[i4 + ((int) (((long) getConfig) ^ 2200953557445420308L))]) ^ 2200953557445420308L)) + ((int) (((long) getFrameAnalyzerWrapper) ^ 2200953557445420308L)));
                }
            } else {
                j2 = 2200953557445420308L;
            }
            if (iIntValue > 0) {
                getexposurecompensationstate.CameraConstants = ((i4 + iIntValue) - 2) + ((int) (((long) getConfig) ^ j2)) + i5;
                Object[] objArr5 = {getexposurecompensationstate, Integer.valueOf(i2), Integer.valueOf(setConfig), sb};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1881789883);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(Process.getGidForName("") + 1, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35, (char) (17615 - Drawable.resolveOpacity(0, 0)), 234308356, false, "a", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
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
                        getexposurecompensationstate.IncodeCamera = (char) (getexposurecompensationstate.getAvailableCameraInternals + (((byte) (((byte) (((long) bArr6[r3]) ^ 2200953557445420308L)) + s2)) ^ b2));
                    } else {
                        short[] sArr = getExposureCompensationState;
                        getexposurecompensationstate.CameraConstants = getexposurecompensationstate.CameraConstants - 1;
                        getexposurecompensationstate.IncodeCamera = (char) (getexposurecompensationstate.getAvailableCameraInternals + (((short) (((short) (((long) sArr[r3]) ^ 2200953557445420308L)) + s2)) ^ b2));
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 * 20
            int r7 = 102 - r0
            int r2 = r6 * 4
            int r1 = r2 + 11
            int r0 = r8 * 14
            int r0 = 17 - r0
            byte[] r6 = com.incode.recogkitandroid.ImageProcessingKit.getCameraState
            byte[] r5 = new byte[r1]
            int r4 = r2 + 10
            r3 = 0
            if (r6 != 0) goto L2f
            r2 = r0
            r1 = r3
        L17:
            int r7 = r7 + r0
            int r7 = r7 + (-3)
            r0 = r2
        L1b:
            byte r2 = (byte) r7
            r5[r1] = r2
            int r2 = r0 + 1
            if (r1 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r9[r3] = r0
            return
        L2a:
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L17
        L2f:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.ImageProcessingKit.a(short, byte, int, java.lang.Object[]):void");
    }

    static void IncodeCamera() {
        getCameraState = new byte[]{121, -78, 54, -121, Ascii.SYN, 1, Ascii.SI, -5, -25, 33, Ascii.SO, MessagePack.Code.INT8, 48, -7, 17, 0, -3, -2, 6, 8, -7, -21, 32, -4, 19, -14, Ascii.DC4, 10};
        setExposureCompensationState = 67;
    }

    static void ProcessCameraProviderExtensionsKt() {
        getPreviewView = -3139231826144854909L;
        getConfig = 927195975;
        getFrameAnalyzerWrapper = 1856677178;
        setConfig = 2112223844;
        getContext = new byte[]{MessagePack.Code.UINT32, -27, Ascii.US, -29, Ascii.SI, -3, Ascii.EM, -22, -12, Ascii.GS, 17, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.ETB, -19, 82, -85, Ascii.DC2, 47, MessagePack.Code.STR8, -1, 1, -29, MessagePack.Code.EXT32, 3, MessagePack.Code.TRUE, 7, Ascii.NAK, -30, 49, MessagePack.Code.NEVER_USED, Ascii.NAK, 6, -31, MessagePack.Code.UINT64, MessagePack.Code.NEVER_USED, -19, Ascii.ETB, Ascii.ETB, 56, MessagePack.Code.ARRAY16, 5, -29, -15, Ascii.CAN, -24, -25, -22, 53, MessagePack.Code.FLOAT64, -21, 17, Ascii.SYN, 49, Ascii.SI, -85, Ascii.DC2, 47, MessagePack.Code.STR8, -1, 1, -29, MessagePack.Code.EXT16, Ascii.ETB, -26, 55, -13, -5, Ascii.EM, -31, 7, -25, MessagePack.Code.TRUE, -22, MessagePack.Code.BIN32, Ascii.ESC, -22, MessagePack.Code.FALSE, -31, -31, Ascii.DC2, MessagePack.Code.UINT8, -27, Ascii.ESC, -19, 19, Ascii.NAK};
    }

    static void CameraConstants() {
        getAvailableCameraInternals = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        CameraConstants = map;
        IncodeCamera = new HashMap();
    }

    static void e1() {
        f3650e1 = -9069852447415910728L;
        ProcessCameraProviderExtensionsKt = (getPreviewView) new startCamera(new ByteArrayInputStream(getAvailableCameraInternals), CameraConstants, IncodeCamera).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0771 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0548 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void CameraConstants(java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.ImageProcessingKit.CameraConstants(java.lang.String):void");
    }
}
