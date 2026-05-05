package com.incode.recogkitandroid;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.biocatch.client.android.sdk.core.Constants;
import com.facebook.common.callercontext.ContextChain;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
public class SelfieFaceQualityKitAndroid {
    private static Map CameraConstants = null;
    private static getPreviewView IncodeCamera = null;
    private static byte[] ProcessCameraProviderExtensionsKt = null;
    public static final String TAG = "RecogKitAndroid";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static Map f3654e1 = null;
    private static long getAvailableCameraInternals = 0;
    private static int[] getConfig = null;
    private static final byte[] getContext = null;
    private static int getFrameAnalyzerWrapper = 0;
    private static final int getImagePreview = 0;
    private static char[] getPreviewView = null;
    private static int setConfig = 0;

    public native QualityResult estimateFaceQuality(Bitmap bitmap, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) throws RecogKitInvalidInputException, RecogKitProcessException;

    public native int getVersion();

    public native void loadModel(String str, float f2) throws RecogKitInitException;

    public native void removeCPPObject();

    public native void setNumThreads(int i2, int i3);

    static {
        ProcessCameraProviderExtensionsKt();
        getFrameAnalyzerWrapper = 0;
        setConfig = 1;
        CameraConstants();
        e1();
        getAvailableCameraInternals();
        try {
            byte b2 = getContext[15];
            Object[] objArr = new Object[1];
            a(b2, r2[5], b2, objArr);
            ProcessCameraProviderExtensionsKt((String) objArr[0]);
            Log.d("RecogKitAndroid", "library found");
            int i2 = getFrameAnalyzerWrapper + 33;
            setConfig = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.e("RecogKitAndroid", "library not found");
        }
    }

    public SelfieFaceQualityKitAndroid() {
    }

    public SelfieFaceQualityKitAndroid(String str, float f2) throws RecogKitInitException {
        loadModel(str, f2);
    }

    private static InputStream getAvailableCameraInternals(InputStream inputStream, int i2, short s2) throws IOException {
        long j2 = getAvailableCameraInternals;
        return new getConfig(inputStream, new int[]{((int) (j2 >>> 32)) ^ i2, i2 ^ ((int) j2)}, IncodeCamera, s2);
    }

    private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
        getContext getcontext = new getContext();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getConfig;
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
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants((ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 1, 33 - ExpandableListView.getPackedPositionChild(j2), (char) (TextUtils.indexOf("", "", 0, 0) + 17615), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
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
        int[] iArr5 = getConfig;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i5])};
                Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(i3);
                if (availableCameraInternals2 == null) {
                    availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17615), 1731344121, false, ContextChain.TAG_INFRA, new Class[]{Integer.TYPE});
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
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                getcontext.getAvailableCameraInternals ^= iArr4[i6];
                Object[] objArr4 = {getcontext, Integer.valueOf(getContext.ProcessCameraProviderExtensionsKt(getcontext.getAvailableCameraInternals)), getcontext, getcontext};
                Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(678506218);
                if (availableCameraInternals3 == null) {
                    availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants(KeyEvent.getMaxKeyCode() >> 16, 34 - View.MeasureSpec.getSize(0), (char) (MotionEvent.axisFromString("") + 17616), -1437579349, false, "g", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) availableCameraInternals3).invoke(null, objArr4)).intValue();
                getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
                getcontext.IncodeCamera = iIntValue;
                i6++;
            }
            int i8 = getcontext.getAvailableCameraInternals;
            getcontext.getAvailableCameraInternals = getcontext.IncodeCamera;
            getcontext.IncodeCamera = i8;
            getcontext.IncodeCamera ^= iArr4[16];
            getcontext.getAvailableCameraInternals ^= iArr4[17];
            int i9 = getcontext.getAvailableCameraInternals;
            int i10 = getcontext.IncodeCamera;
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
                availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getKeyRepeatTimeout() >> 16, 34 - TextUtils.indexOf("", "", 0), (char) (ExpandableListView.getPackedPositionType(0L) + 17615), 1313763947, false, Constants.FLUSH_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) availableCameraInternals4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void c(boolean z2, int[] iArr, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        getCameraState getcamerastate = new getCameraState();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getPreviewView;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-451357652);
                    if (availableCameraInternals == null) {
                        availableCameraInternals = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getKeyRepeatDelay() >> 16, 34 - ExpandableListView.getPackedPositionType(j2), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17615), 1731837293, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) availableCameraInternals).invoke(null, objArr2)).charValue();
                    i6++;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            getcamerastate.getAvailableCameraInternals = 0;
            char c2 = 0;
            while (getcamerastate.getAvailableCameraInternals < i3) {
                if (bArr[getcamerastate.getAvailableCameraInternals] == 1) {
                    int i7 = getcamerastate.getAvailableCameraInternals;
                    Object[] objArr3 = {Integer.valueOf(cArr3[getcamerastate.getAvailableCameraInternals]), Integer.valueOf(c2)};
                    Object availableCameraInternals2 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-2055152059);
                    if (availableCameraInternals2 == null) {
                        availableCameraInternals2 = ProcessCameraProviderExtensionsKt.CameraConstants(ViewConfiguration.getEdgeSlop() >> 16, 34 - (Process.myTid() >> 22), (char) (TextUtils.lastIndexOf("", '0', 0) + 17616), 128038660, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) availableCameraInternals2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = getcamerastate.getAvailableCameraInternals;
                    Object[] objArr4 = {Integer.valueOf(cArr3[getcamerastate.getAvailableCameraInternals]), Integer.valueOf(c2)};
                    Object availableCameraInternals3 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(-1167648378);
                    if (availableCameraInternals3 == null) {
                        availableCameraInternals3 = ProcessCameraProviderExtensionsKt.CameraConstants((Process.getThreadPriority(0) + 20) >> 6, 34 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (Color.argb(0, 0, 0, 0) + 17615), 944140487, false, "B", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) availableCameraInternals3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[getcamerastate.getAvailableCameraInternals];
                Object[] objArr5 = {getcamerastate, getcamerastate};
                Object availableCameraInternals4 = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(522806536);
                if (availableCameraInternals4 == null) {
                    availableCameraInternals4 = ProcessCameraProviderExtensionsKt.CameraConstants((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (View.combineMeasuredStates(0, 0) + 17615), -1660416951, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) availableCameraInternals4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i9, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z2) {
            char[] cArr6 = new char[i3];
            getcamerastate.getAvailableCameraInternals = 0;
            while (getcamerastate.getAvailableCameraInternals < i3) {
                cArr6[getcamerastate.getAvailableCameraInternals] = cArr3[(i3 - getcamerastate.getAvailableCameraInternals) - 1];
                getcamerastate.getAvailableCameraInternals++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            getcamerastate.getAvailableCameraInternals = 0;
            while (getcamerastate.getAvailableCameraInternals < i3) {
                cArr3[getcamerastate.getAvailableCameraInternals] = (char) (cArr3[getcamerastate.getAvailableCameraInternals] - iArr[2]);
                getcamerastate.getAvailableCameraInternals++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r0 = r7 * 14
            int r7 = r0 + 4
            int r0 = r9 * 20
            int r6 = r0 + 82
            int r1 = r8 * 4
            int r0 = r1 + 11
            byte[] r5 = com.incode.recogkitandroid.SelfieFaceQualityKitAndroid.getContext
            byte[] r4 = new byte[r0]
            int r3 = r1 + 10
            r2 = 0
            if (r5 != 0) goto L2e
            r0 = r7
            r1 = r2
        L17:
            int r7 = r7 + 1
            int r6 = r6 + r0
            int r6 = r6 + (-3)
        L1c:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r10[r2] = r0
            return
        L29:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L17
        L2e:
            r1 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.SelfieFaceQualityKitAndroid.a(byte, byte, short, java.lang.Object[]):void");
    }

    static void ProcessCameraProviderExtensionsKt() {
        getContext = new byte[]{49, Ascii.SUB, -88, MessagePack.Code.ARRAY32, Ascii.SYN, 1, Ascii.SI, -5, -25, 33, Ascii.SO, MessagePack.Code.INT8, 48, -7, 17, 0, -3, -2, 6, 8, -7, -21, 32, -4, 19, -14, Ascii.DC4, 10};
        getImagePreview = 195;
    }

    static void CameraConstants() {
        getPreviewView = new char[]{8931, 8893, 8861, 8860, 8894, 8894, 8886, 8861, 8860, 8894, 8894, 8886, 8861, 8837, 8890, 8883, 8892, 8894, 8881, 8886, 8895, 8868, 8893, 8860, 8861, 8880, 8893, 8893, 8892, 8895, 8863, 8857, 8855, 8798, 8799, 8793, 8775, 8775, 8798, 8799, 8768, 8932, 8894, 8869, 8890, 8893, 8895, 8868, 8895, 8882, 8723, 8735, 8812, 8806, 8733, 8728, 8734, Typography.greaterOrEqual, 8899, 8943, 8847, 8894, 8893, 8882, 8894, 8888, 8895, 8841, 8847, 8891, 8870, 8864, 8887, 8887, 8871, 8895, 8887, 8883, 8895, 8881, 8895, 8895, 8851, 8837, 8864, 8890, 8894, 8857, 8832, 8869, 8888, 8932, 8895, 8895, 8851, 8863, 8888, 8858, 8943, 8847, 8891, 8870, 8864, 8887, 8887, 8871, 8895, 8887, 8883, 8895, 8866, 8766, 8740, 8753, 8753, 8741, 8950, 8849, 8841, 8888, 8882, 9190, 9208, 9160, 9203};
        getConfig = new int[]{1372353172, -232769066, -1594816541, 1043618336, -2063957240, 324550638, 306350788, 637079338, -130505027, -1859569733, 1065380506, -1416040054, -440879905, -133027154, -803946148, 1457858762, -1798322459, -79060233};
    }

    static void e1() {
        ProcessCameraProviderExtensionsKt = new byte[]{0, 0, 0, 1, 0, 0, 0, 0, MessagePack.Code.INT32, -111, 62, -72, 0, 0, 0, 8, MessagePack.Code.NIL, -4, MessagePack.Code.FIXEXT1, -67, 36, -78, 86, -67};
        HashMap map = new HashMap();
        map.put(0, getPreviewView.class);
        CameraConstants = map;
        f3654e1 = new HashMap();
    }

    static void getAvailableCameraInternals() {
        getAvailableCameraInternals = -9069852447415910728L;
        IncodeCamera = (getPreviewView) new startCamera(new ByteArrayInputStream(ProcessCameraProviderExtensionsKt), CameraConstants, f3654e1).getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0659 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ProcessCameraProviderExtensionsKt(java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.SelfieFaceQualityKitAndroid.ProcessCameraProviderExtensionsKt(java.lang.String):void");
    }
}
