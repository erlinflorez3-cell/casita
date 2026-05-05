package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.biocatch.client.android.sdk.core.Constants;
import com.facebook.common.callercontext.ContextChain;
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
public class RecogKitAndroid {
    private static Map CameraConstants = null;
    private static getPreviewView IncodeCamera = null;
    private static long ProcessCameraProviderExtensionsKt = 0;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static byte[] f3652e1 = null;
    private static int getAnalysisEvents = 0;
    private static Map getAvailableCameraInternals = null;
    private static final int getCameraState = 0;
    private static int getConfig = 0;
    private static int getContext = 0;
    private static short[] getExposureCompensationState = null;
    private static int getFrameAnalyzerWrapper = 0;
    private static final byte[] getImagePreview = null;
    private static byte[] getPreviewView = null;
    private static int[] setConfig = null;
    private static int setExposureCompensationState = 0;

    public native void clear(String str) throws RecogKitProcessException;

    public native float compare(String str, String str2) throws RecogKitIncorrectTemplateException, RecogKitInvalidInputException, RecogKitProcessException;

    public native void createTemplateSet(String str, int i2) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native String getTemplate(Bitmap bitmap, float f2, float f3, float f4, float f5, float f6, float f7) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native ArrayList<ArrayList<Pair<String, Float>>> groupTemplates(float f2, String str) throws RecogKitProcessException;

    public native void loadModel(String str, boolean z2) throws RecogKitInitException;

    public native Pair<String, Float> predict(String str, String str2) throws RecogKitIncorrectTemplateException, RecogKitInvalidInputException, RecogKitProcessException;

    public native ArrayList<Pair<String, Float>> predictWithThreshold(String str, float f2, String str2) throws RecogKitIncorrectTemplateException, RecogKitInvalidInputException, RecogKitProcessException;

    public native boolean removeByTemplateID(String str, String str2) throws RecogKitProcessException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    public native void train(String str, String str2, String str3) throws RecogKitIncorrectTemplateException, RecogKitInvalidInputException, RecogKitProcessException, RecogKitTemplateSetFullException;

    static {
        IncodeCamera();
        getAnalysisEvents = 0;
        setExposureCompensationState = 1;
        ProcessCameraProviderExtensionsKt();
        CameraConstants();
        getAvailableCameraInternals();
        try {
            byte b2 = getImagePreview[5];
            Object[] objArr = new Object[1];
            a(b2, (byte) (-b2), r1[15], objArr);
            IncodeCamera((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = setExposureCompensationState + 81;
            getAnalysisEvents = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public RecogKitAndroid() {
    }

    public RecogKitAndroid(String str, boolean z2) throws RecogKitInitException {
        loadModel(str, z2);
    }

    private static InputStream e1(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = ProcessCameraProviderExtensionsKt;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, IncodeCamera, s2);
    }

    private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
        getContext getcontext = new getContext();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = setConfig;
        int i3 = -451715144;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451715144);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(TextUtils.indexOf("", "", 0), 34 - View.resolveSize(0, 0), (char) (17615 - View.MeasureSpec.getMode(0)), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
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
        int i5 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i6])};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(i3);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getKeyRepeatDelay() >> 16, 34 - (ViewConfiguration.getScrollBarFadeDuration() >> i5), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17616), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
                }
                iArr6[i6] = ((Integer) ((Method) availableCameraInternals2).invoke(null, objArr3)).intValue();
                i6++;
                i3 = -451715144;
                i5 = 16;
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
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                getcontext.getAvailableCameraInternals ^= iArr4[i7];
                Object[] objArr4 = {getcontext, Integer.valueOf(getContext.ProcessCameraProviderExtensionsKt(getcontext.getAvailableCameraInternals)), getcontext, getcontext};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(678506218);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (17615 - Gravity.getAbsoluteGravity(0, 0)), -1437579349, false, "g", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue();
                getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
                getcontext.IncodeCamera = iIntValue;
                i7++;
            }
            int i9 = getcontext.getAvailableCameraInternals;
            getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
            getcontext.IncodeCamera = i9;
            getcontext.IncodeCamera ^= iArr4[16];
            getcontext.getAvailableCameraInternals ^= iArr4[17];
            int i10 = getcontext.getAvailableCameraInternals;
            int i11 = getcontext.IncodeCamera;
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
                availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(Color.alpha(0), 34 - KeyEvent.keyCodeFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0') + 17616), 1313763947, false, Constants.FLUSH_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void c(byte b2, short s2, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        getExposureCompensationState getexposurecompensationstate = new getExposureCompensationState();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getConfig)};
            Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
            float f2 = 0.0f;
            if (availableCameraInternals == null) {
                availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 34 - Color.alpha(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 17616), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) availableCameraInternals).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = getPreviewView;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451834308);
                        if (availableCameraInternals2 == null) {
                            availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getTapTimeout() >> 16, View.getDefaultSize(0, 0) + 34, (char) (17615 - (TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1))), 1731258237, false, "e", new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) availableCameraInternals2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f2 = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getPreviewView;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(getFrameAnalyzerWrapper)};
                    Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1944797977);
                    if (availableCameraInternals3 == null) {
                        availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - TextUtils.lastIndexOf("", '0', 0, 0), 34 - (ViewConfiguration.getTapTimeout() >> 16), (char) (Process.getGidForName("") + 17616), 238409126, false, "c", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue()]) ^ 2200953557445420308L)) + ((int) (((long) getConfig) ^ 2200953557445420308L)));
                    j2 = 2200953557445420308L;
                } else {
                    j2 = 2200953557445420308L;
                    iIntValue = (short) (((short) (((long) getExposureCompensationState[i4 + ((int) (((long) getFrameAnalyzerWrapper) ^ 2200953557445420308L))]) ^ 2200953557445420308L)) + ((int) (((long) getConfig) ^ 2200953557445420308L)));
                }
            } else {
                j2 = 2200953557445420308L;
            }
            if (iIntValue > 0) {
                getexposurecompensationstate.CameraConstants = ((i4 + iIntValue) - 2) + ((int) (((long) getFrameAnalyzerWrapper) ^ j2)) + i5;
                Object[] objArr5 = {getexposurecompensationstate, Integer.valueOf(i2), Integer.valueOf(getContext), sb};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1881789883);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants((-1) - Process.getGidForName(""), Color.alpha(0) + 34, (char) (17614 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 234308356, false, "a", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) availableCameraInternals4).invoke(null, objArr5)).append(getexposurecompensationstate.IncodeCamera);
                getexposurecompensationstate.getAvailableCameraInternals = getexposurecompensationstate.IncodeCamera;
                byte[] bArr4 = getPreviewView;
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
                        byte[] bArr6 = getPreviewView;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 20
            int r0 = r0 + 82
            int r8 = r6 + 4
            int r2 = r7 * 4
            int r1 = r2 + 11
            byte[] r7 = com.incode.recogkitandroid.RecogKitAndroid.getImagePreview
            byte[] r6 = new byte[r1]
            int r5 = r2 + 10
            r4 = 0
            if (r7 != 0) goto L31
            r2 = r0
            r3 = r4
            r1 = r8
        L16:
            int r0 = -r2
            int r8 = r8 + r0
            int r0 = r8 + (-3)
            r2 = r3
            r8 = r1
        L1c:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r5) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r9[r4] = r0
            return
        L2b:
            int r1 = r8 + 1
            r2 = r7[r1]
            r8 = r0
            goto L16
        L31:
            r2 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.RecogKitAndroid.a(int, int, int, java.lang.Object[]):void");
    }

    static void IncodeCamera() {
        getImagePreview = new byte[]{45, 100, 38, 47, -22, -1, -15, 5, Ascii.EM, MessagePack.Code.MAP32, -14, 48, MessagePack.Code.INT8, 7, -17, 0, 3, 2, -6, -8, 7, Ascii.NAK, MessagePack.Code.NEGFIXINT_PREFIX, 4, -19, Ascii.SO, -20, -10};
        getCameraState = 162;
    }

    static void ProcessCameraProviderExtensionsKt() {
        setConfig = new int[]{1526224953, 1200602244, -1986724628, -1192074924, 973317846, -1019034194, 1937719839, 1630237814, -2111810977, 796024173, 783094450, 2018706696, -1163930187, -2101180961, 841030517, 1165739519, 1853054358, -883925771};
        getFrameAnalyzerWrapper = 673196174;
        getConfig = 1856677163;
        getContext = -1397723864;
        getPreviewView = new byte[]{MessagePack.Code.STR32, -104, -100, 99, -110, 104, MessagePack.Code.ARRAY32, 86, -99, -86, 68, 122, -116, 110, MessagePack.Code.FIXEXT16, -78, -92, -102, -69, -116, -88, -109, -74, -123, -74, MessagePack.Code.MAP16, 51, 95, 65, 65, 106, Ascii.SO, 119, 93, MessagePack.Code.NIL, 4, Ascii.DC4, -29, Ascii.SYN, 49, -9, Ascii.ETB, Ascii.GS, Ascii.DC2, Base64.padSymbol, Ascii.VT, MessagePack.Code.FIXEXT8, Ascii.RS, 43, MessagePack.Code.BIN16, -5, Ascii.CR, -17, MessagePack.Code.INT16, Ascii.NAK, -28, Ascii.NAK, MessagePack.Code.INT64, -125, -110, -93, 101, -117, MessagePack.Code.MAP32, Ascii.SUB, -23, 58, -26, -18, Ascii.FF, Ascii.DC4, 10, -22, MessagePack.Code.INT16, MessagePack.Code.UINT64, MessagePack.Code.UINT64, -8, MessagePack.Code.BIN8, -31, 0, 6, -8, -26, Ascii.DC4, Ascii.RS, -22, -23, 6, 54, MessagePack.Code.STR16, 4, -21};
    }

    static void CameraConstants() {
        f3652e1 = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        getAvailableCameraInternals = map;
        CameraConstants = new HashMap();
    }

    static void getAvailableCameraInternals() {
        ProcessCameraProviderExtensionsKt = -9069852447415910728L;
        IncodeCamera = (getPreviewView) new startCamera(new ByteArrayInputStream(f3652e1), getAvailableCameraInternals, CameraConstants).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x086b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0578 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void IncodeCamera(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.RecogKitAndroid.IncodeCamera(java.lang.String):void");
    }
}
