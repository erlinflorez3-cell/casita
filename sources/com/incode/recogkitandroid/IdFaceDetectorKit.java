package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class IdFaceDetectorKit {
    private static getPreviewView CameraConstants = null;
    private static Map IncodeCamera = null;
    private static long ProcessCameraProviderExtensionsKt = 0;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static byte[] f3649e1 = null;
    private static Map getAvailableCameraInternals = null;
    private static int getCameraState = 0;
    private static int getConfig = 0;
    private static char getContext = 0;
    private static final int getExposureCompensationState = 0;
    private static int getFrameAnalyzerWrapper = 0;
    private static final byte[] getImagePreview = null;
    private static long getPreviewView = 0;
    private static int setConfig = 0;

    public native ArrayList<Face> detect(Bitmap bitmap, float f2) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native void loadModel(String str) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        e1();
        getConfig = 0;
        getCameraState = 1;
        IncodeCamera();
        CameraConstants();
        getAvailableCameraInternals();
        try {
            byte b2 = getImagePreview[5];
            Object[] objArr = new Object[1];
            a((byte) (-b2), b2, r4[15], objArr);
            getAvailableCameraInternals((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getConfig + 27;
            getCameraState = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public IdFaceDetectorKit() {
    }

    public IdFaceDetectorKit(String str) throws RecogKitInitException {
        loadModel(str);
    }

    private static InputStream ProcessCameraProviderExtensionsKt(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = ProcessCameraProviderExtensionsKt;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, CameraConstants, s2);
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(getFrameAnalyzerWrapper)};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1057294296);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(View.getDefaultSize(0, 0), Color.green(0) + 34, (char) (17616 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1121685865, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setexposurecompensationstate, setexposurecompensationstate};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1712427226);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.getOffsetBefore("", 0), 34 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + MessagePack.Code.INT8), 466552423, false, "b", new Class[]{Object.class, Object.class});
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
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.indexOf("", ""), TextUtils.indexOf("", "") + 34, (char) (17615 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 466552423, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(String str, int i2, String str2, String str3, char c2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        stopCamera stopcamera = new stopCamera();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        stopcamera.ProcessCameraProviderExtensionsKt = 0;
        while (stopcamera.ProcessCameraProviderExtensionsKt < length3) {
            try {
                Object[] objArr2 = {stopcamera};
                Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-300007609);
                if (availableCameraInternals == null) {
                    availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) (17615 - Drawable.resolveOpacity(0, 0)), 1816090118, false, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {stopcamera};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-511358522);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getKeyRepeatTimeout() >> 16, 34 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17615), 1671700615, false, "r", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {stopcamera, Integer.valueOf(cArr4[stopcamera.ProcessCameraProviderExtensionsKt % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(582823332);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, ExpandableListView.getPackedPositionGroup(0L) + 34, (char) (Color.argb(0, 0, 0, 0) + 17615), -1600371483, false, "p", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) availableCameraInternals3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(1890318965);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.getOffsetAfter("", 0), 34 - Gravity.getAbsoluteGravity(0, 0), (char) (17615 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -225799372, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) availableCameraInternals4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = stopcamera.f3659e1;
                cArr6[stopcamera.ProcessCameraProviderExtensionsKt] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[stopcamera.ProcessCameraProviderExtensionsKt])) ^ (getPreviewView ^ 4747244972757434514L)) ^ ((long) ((int) (((long) setConfig) ^ 4747244972757434514L)))) ^ ((long) ((char) (((long) getContext) ^ 4747244972757434514L))));
                stopcamera.ProcessCameraProviderExtensionsKt++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r9, int r10, int r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 20
            int r8 = r0 + 82
            byte[] r7 = com.incode.recogkitandroid.IdFaceDetectorKit.getImagePreview
            int r0 = r9 * 4
            int r6 = r0 + 11
            int r5 = r10 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2e
            r1 = r6
            r2 = r3
        L13:
            int r0 = -r8
            int r1 = r1 + r0
            int r8 = r1 + (-3)
            r1 = r2
        L18:
            int r5 = r5 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r6) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L29:
            r0 = r7[r5]
            r1 = r8
            r8 = r0
            goto L13
        L2e:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.IdFaceDetectorKit.a(int, int, int, java.lang.Object[]):void");
    }

    static void e1() {
        getImagePreview = new byte[]{71, Base64.padSymbol, 39, Base64.padSymbol, -22, -1, -15, 5, Ascii.EM, MessagePack.Code.MAP32, -14, 48, MessagePack.Code.INT8, 7, -17, 0, 3, 2, -6, -8, 7, Ascii.NAK, MessagePack.Code.NEGFIXINT_PREFIX, 4, -19, Ascii.SO, -20, -10};
        getExposureCompensationState = 75;
    }

    static void IncodeCamera() {
        getPreviewView = 4747244972757434514L;
        setConfig = -1762180974;
        getContext = (char) 60968;
        getFrameAnalyzerWrapper = -1265249523;
    }

    static void CameraConstants() {
        f3649e1 = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        IncodeCamera = map;
        getAvailableCameraInternals = new HashMap();
    }

    static void getAvailableCameraInternals() {
        ProcessCameraProviderExtensionsKt = -9069852447415910728L;
        CameraConstants = (getPreviewView) new startCamera(new ByteArrayInputStream(f3649e1), IncodeCamera, getAvailableCameraInternals).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x05a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0824 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void getAvailableCameraInternals(java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.IdFaceDetectorKit.getAvailableCameraInternals(java.lang.String):void");
    }
}
