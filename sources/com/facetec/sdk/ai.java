package com.facetec.sdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facetec.sdk.JNI;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.Kl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class ai implements ZoomEncryptStrings {
    private static boolean B = false;
    private static char[] C = null;
    public static String Code = null;
    private static boolean D = false;
    private static boolean F = false;
    private static char[] I = null;
    private static long L = 0;
    private static int S = 0;
    private static boolean V = false;
    private static String Z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f2896a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f2897c = 0;

    static class I extends ax {
        I(Context context) {
            super(context);
        }

        @Override // com.facetec.sdk.ax
        protected final void B() {
            try {
                ai.B(this.V);
            } catch (Throwable unused) {
            }
        }

        @Override // com.facetec.sdk.ax
        final void Code() {
            try {
                ai.I(this.V);
                ai.B();
            } catch (Throwable unused) {
                cancel(false);
            }
        }
    }

    enum V {
        EmulatorDetected(1),
        Next(2);

        final int Code;

        V(int i2) {
            this.Code = i2;
        }
    }

    static {
        l();
        Z = null;
        B = false;
        Code = I(TextUtils.indexOf("", "") + 7, (char) (14524 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0', 0, 0) + 169).intern();
        V = false;
        int i2 = f2897c + 49;
        f2896a = i2 % 128;
        int i3 = i2 % 2;
    }

    ai() {
    }

    @JNI.B(V = 774884799)
    static native void A(String str);

    static synchronized void B() throws bx {
        int i2 = 2 % 2;
        int i3 = f2897c + 87;
        f2896a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (B) {
            return;
        }
        try {
            System.loadLibrary("PhoenixAndroid");
            B = true;
            int i4 = 2 % 2;
            for (Method method : ai.class.getDeclaredMethods()) {
                JNI.B b2 = (JNI.B) Kl.zd(method, JNI.B.class);
                if (b2 != null) {
                    int i5 = f2896a + 71;
                    f2897c = i5 % 128;
                    if (i5 % 2 != 0) {
                        JNI.Code(b2.V(), method);
                        throw null;
                    }
                    JNI.Code(b2.V(), method);
                    int i6 = 2 % 2;
                }
            }
            JNI.finalizeNativeMethods(ai.class, cf.class);
            return;
        } catch (Throwable th) {
            bu.I(new StringBuilder().append(V(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u0085\u009d\u009b\u0087\u009c\u008b\u0085\u009c\u008e\u0085\u009b\u0083\u008b\u008a\u0087\u0089\u0085\u009a\u0084\u0087\u0084\u0099\u008a\u008b\u0085\u0083\u0098\u008a\u008e\u0087\u0097").intern()).append(th.getMessage()).toString());
            throw new bx(th);
        }
    }

    static synchronized void B(Context context) throws Throwable {
        String[] strArr;
        int length;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            Code(context, false);
            B();
            if (V) {
                int i3 = f2897c + 35;
                f2896a = i3 % 128;
                if (i3 % 2 != 0) {
                    V(context);
                    return;
                } else {
                    V(context);
                    super.hashCode();
                    throw null;
                }
            }
            L(I((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37, (char) (25987 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), ViewConfiguration.getTouchSlop() >> 8).intern(), Z, q());
            V = true;
            M(bv.class);
            V(context);
            int i4 = f2897c + 83;
            f2896a = i4 % 128;
            if (i4 % 2 == 0) {
                strArr = Build.SUPPORTED_ABIS;
                length = strArr.length;
            } else {
                strArr = Build.SUPPORTED_ABIS;
                length = strArr.length;
            }
            int i5 = 0;
            while (i5 < length) {
                if (strArr[i5].toLowerCase().startsWith(V(127 - KeyEvent.normalizeMetaState(0), null, null, "\u0096\u0095\u0094").intern())) {
                    int i6 = f2896a + 21;
                    f2897c = i6 % 128;
                    if (i6 % 2 == 0) {
                        af(V.EmulatorDetected.Code);
                        return;
                    } else {
                        af(V.EmulatorDetected.Code);
                        throw null;
                    }
                }
                i5++;
                int i7 = f2897c + 83;
                f2896a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
        } catch (bx e2) {
            if (e2.Code()) {
                bu.I(I(67 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 38 - TextUtils.getOffsetAfter("", 0)).intern());
                int i10 = 2 % 2;
            }
            throw e2;
        } catch (Throwable th) {
            L.V(th);
            bu.I(V(127 - View.combineMeasuredStates(0, 0), null, null, "\u0093\u0092\u0091\u0085\u0083\u0082\u008e\u0085\u0090\u008d\u008a\u008f\u008a\u008b\u0087\u008a\u008e\u008a\u008d\u008a\u0085\u0083\u0084\u008c\u008b\u008a\u0087\u0089\u0085\u0087\u0085\u0088\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern());
            throw new bx(th);
        }
    }

    @JNI.B(V = 718243112)
    static native void B(String str, int i2);

    static aj C() {
        int i2 = 2 % 2;
        int i3 = f2896a + 123;
        f2897c = i3 % 128;
        int i4 = i3 % 2;
        aj ajVar = aj.values()[O()];
        int i5 = f2896a + 13;
        f2897c = i5 % 128;
        if (i5 % 2 == 0) {
            return ajVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @JNI.B(V = 435246041)
    static native void C(String str);

    static void Code() {
        int i2 = 2 % 2;
        int i3 = f2896a + 55;
        int i4 = i3 % 128;
        f2897c = i4;
        int i5 = i3 % 2;
        if (B) {
            int i6 = i4 + 17;
            f2896a = i6 % 128;
            int i7 = i6 % 2;
            ah(q());
            if (i7 == 0) {
                int i8 = 60 / 0;
            }
        }
        int i9 = f2896a + 77;
        f2897c = i9 % 128;
        int i10 = i9 % 2;
    }

    static synchronized void Code(Context context) {
        int i2 = 2 % 2;
        new I(context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        int i3 = f2896a + 5;
        f2897c = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0239 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void Code(android.content.Context r15, boolean r16) throws com.facetec.sdk.bx {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ai.Code(android.content.Context, boolean):void");
    }

    static al D() {
        int i2 = 2 % 2;
        int i3 = f2896a + 65;
        f2897c = i3 % 128;
        if (i3 % 2 == 0) {
            return al.values()[Q()];
        }
        int i4 = 63 / 0;
        return al.values()[Q()];
    }

    @JNI.B(V = 957213713)
    static native void D(String str);

    @JNI.B(V = 802163113)
    static native void E(int i2);

    static ak F() {
        int i2 = 2 % 2;
        int i3 = f2896a + 19;
        f2897c = i3 % 128;
        if (i3 % 2 == 0) {
            return ak.values()[T()];
        }
        ak akVar = ak.values()[T()];
        throw null;
    }

    @JNI.B(V = 218119279)
    static native void F(String str);

    @JNI.B(V = 426837000)
    static native void G(String str);

    @JNI.B(V = 534730124)
    static native void H(String str);

    private static String I(int i2, char c2, int i3) {
        int i4 = 2 % 2;
        char[] cArr = new char[i2];
        int i5 = f2897c + 27;
        f2896a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < i2) {
            int i8 = f2896a + 59;
            f2897c = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[i7] = (char) (((long) I[i3 >> i7]) * (((long) i7) % L) * ((long) c2));
                i7 += 21;
            } else {
                cArr[i7] = (char) ((((long) I[i3 + i7]) ^ (((long) i7) * L)) ^ ((long) c2));
                i7++;
            }
        }
        return new String(cArr);
    }

    @JNI.B(V = 953865493)
    static native void I();

    static /* synthetic */ void I(Context context) throws bx {
        int i2 = 2 % 2;
        int i3 = f2897c + 11;
        f2896a = i3 % 128;
        int i4 = i3 % 2;
        Code(context, true);
        int i5 = f2897c + 11;
        f2896a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    private static void I(File file) {
        int i2 = 2 % 2;
        Object obj = null;
        if (!file.exists()) {
            int i3 = f2897c + 5;
            f2896a = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            super.hashCode();
            throw null;
        }
        if (!(!file.isDirectory())) {
            int i4 = f2897c + 123;
            f2896a = i4 % 128;
            if (i4 % 2 == 0) {
                file.listFiles();
                super.hashCode();
                throw null;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int i5 = f2897c + 69;
                f2896a = i5 % 128;
                int i6 = i5 % 2;
                for (File file2 : fileArrListFiles) {
                    int i7 = f2896a + 123;
                    f2897c = i7 % 128;
                    int i8 = i7 % 2;
                    I(file2);
                }
            }
        }
        file.delete();
    }

    @JNI.B(V = 251547157)
    static native String J(String str, boolean z2);

    @JNI.B(V = 801550182)
    static native void K();

    static ah L() {
        int i2 = 2 % 2;
        int i3 = f2897c + 91;
        f2896a = i3 % 128;
        int i4 = i3 % 2;
        ah ahVar = ah.values()[R()];
        int i5 = f2896a + 11;
        f2897c = i5 % 128;
        int i6 = i5 % 2;
        return ahVar;
    }

    @JNI.B(V = 331891646)
    private static native void L(String str, String str2, int i2) throws Throwable;

    @JNI.B(V = 419417896)
    private static native void M(Class<bv> cls);

    @JNI.B(V = 854339086)
    static native boolean N();

    @JNI.B(V = 828862140)
    private static native int O();

    @JNI.B(V = 559139395)
    private static native void P();

    @JNI.B(V = 236851259)
    private static native int Q();

    @JNI.B(V = 417661065)
    private static native int R();

    static an S() {
        int i2 = 2 % 2;
        int i3 = f2897c + 35;
        f2896a = i3 % 128;
        int i4 = i3 % 2;
        an anVar = an.values()[U()];
        int i5 = f2897c + 77;
        f2896a = i5 % 128;
        if (i5 % 2 != 0) {
            return anVar;
        }
        throw null;
    }

    @JNI.B(V = 942861196)
    private static native int T();

    @JNI.B(V = 492857316)
    private static native int U();

    private static String V(int i2, String str, int[] iArr, String str2) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            int i4 = f2896a + 125;
            f2897c = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        char[] cArr3 = C;
        int i5 = S;
        int i6 = 0;
        if (D) {
            int i7 = f2897c + 125;
            f2896a = i7 % 128;
            if (i7 % 2 == 0) {
                length = bArr.length;
                cArr = new char[length];
                i6 = 1;
            } else {
                length = bArr.length;
                cArr = new char[length];
            }
            while (i6 < length) {
                int i8 = f2897c + 117;
                f2896a = i8 % 128;
                int i9 = i8 % 2;
                cArr[i6] = (char) (cArr3[bArr[(length - 1) - i6] + i2] - i5);
                i6++;
            }
            return new String(cArr);
        }
        if (!F) {
            int length2 = iArr.length;
            char[] cArr4 = new char[length2];
            while (i6 < length2) {
                cArr4[i6] = (char) (cArr3[iArr[(length2 - 1) - i6] - i2] - i5);
                i6++;
            }
            return new String(cArr4);
        }
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        int i10 = f2897c + 111;
        f2896a = i10 % 128;
        int i11 = i10 % 2;
        while (i6 < length3) {
            int i12 = f2897c + 49;
            f2896a = i12 % 128;
            if (i12 % 2 == 0) {
                cArr5[i6] = (char) (cArr3[cArr2[length3 - i6] >> i2] << i5);
                i6 += 48;
            } else {
                cArr5[i6] = (char) (cArr3[cArr2[(length3 - 1) - i6] - i2] - i5);
                i6++;
            }
        }
        return new String(cArr5);
    }

    static synchronized void V() {
        int i2 = 2 % 2;
        int i3 = f2897c + 61;
        f2896a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (B) {
            P();
            int i4 = f2896a + 63;
            f2897c = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        V = false;
    }

    private static void V(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2896a + 13;
        f2897c = i3 % 128;
        int i4 = i3 % 2;
        if (n.I == null) {
            int i5 = f2896a + 1;
            f2897c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("o^/\u000bf's(WV\fsC\u0012zz-<pe\u0015\u0012`", (short) (C1633zX.Xd() ^ (-275)), (short) (C1633zX.Xd() ^ (-22385)))).getMethod(C1561oA.Xd("A@P\u001eNOLJEDXNUU+XX_Qeb", (short) (C1633zX.Xd() ^ (-10380))), new Class[0]);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            ax.Z(new Runnable() { // from class: com.facetec.sdk.ai.1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    ai.u(yg.hg.Vd("bie^qVPDC@E5;ND2>>386", (short) (C1633zX.Xd() ^ (-28395)), (short) (C1633zX.Xd() ^ (-22175))), FaceTecSDK.version());
                    Context context3 = context2;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\", (short) (C1633zX.Xd() ^ (-8769)))).getMethod(C1561oA.yd("\u001c\u001b'\u0004\u0012\u0015\u001a\u0011$#\t\u001d&\u001f", (short) (C1499aX.Xd() ^ (-2374))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str = (String) method2.invoke(context3, objArr2);
                        short sXd = (short) (C1499aX.Xd() ^ (-3656));
                        int[] iArr = new int["_hfav]YOPOVHPeJTROY`l^PS\\SZY".length()];
                        QB qb = new QB("_hfav]YOPOVHPeJTROY`l^PS\\SZY");
                        int i6 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i6] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i6));
                            i6++;
                        }
                        ai.u(new String(iArr, 0, i6), str);
                        short sXd2 = (short) (OY.Xd() ^ 26500);
                        short sXd3 = (short) (OY.Xd() ^ 26699);
                        int[] iArr2 = new int["MVTOdKG=>=D6>S8B@=GNZ=MNSOLGQ".length()];
                        QB qb2 = new QB("MVTOdKG=>=D6>S8B@=GNZ=MNSOLGQ");
                        int i7 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) + sXd3);
                            i7++;
                        }
                        ai.u(new String(iArr2, 0, i7), n.I);
                        ai.u(Jg.Wd("*\u000fX#\bN\u0016[,\u0007M\u000bfW\rZ<\u0010V9\u0012t6\u0004_", (short) (C1580rY.Xd() ^ (-28903)), (short) (C1580rY.Xd() ^ (-13425))), Build.MODEL);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JNI.B(V = 241053919)
    private static native int W();

    @JNI.B(V = 233296901)
    private static native int X();

    @JNI.B(V = 532200877)
    private static native Object[] Y();

    static void Z() {
        int i2 = 2 % 2;
        int i3 = f2897c + 91;
        f2896a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
    }

    private static synchronized void Z(AssetManager assetManager, String str, String str2) throws Exception {
        InputStream inputStreamOpen;
        int i2 = 2 % 2;
        int i3 = f2897c + 81;
        f2896a = i3 % 128;
        int i4 = i3 % 2;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            inputStreamOpen = assetManager.open(str, 2);
        } catch (FileNotFoundException unused) {
            inputStreamOpen = null;
        }
        if (inputStreamOpen == null) {
            String[] list = assetManager.list(str);
            new File(str2).mkdirs();
            int i5 = 2 % 2;
            for (String str3 : list) {
                Z(assetManager, new StringBuilder().append(str).append(V(126 - MotionEvent.axisFromString(""), null, null, "\u009e").intern()).append(str3).toString(), new StringBuilder().append(str2).append(V(128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), null, null, "\u009e").intern()).append(str3).toString());
            }
            int i6 = f2896a + 11;
            f2897c = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                byte[] bArr = new byte[2097152];
                while (true) {
                    int i8 = 2 % 2;
                    int i9 = inputStreamOpen.read(bArr);
                    if (i9 <= 0) {
                        bufferedOutputStream2.close();
                        inputStreamOpen.close();
                        return;
                    } else {
                        bufferedOutputStream2.write(bArr, 0, i9);
                        int i10 = f2896a + 125;
                        f2897c = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                inputStreamOpen.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static ac a() {
        int i2 = 2 % 2;
        int i3 = f2897c + 25;
        f2896a = i3 % 128;
        if (i3 % 2 != 0) {
            return ac.values()[W()];
        }
        ac acVar = ac.values()[W()];
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @JNI.B(V = 410261680)
    static native void a(String str, String str2);

    @JNI.B(V = 476130761)
    private static native int aa();

    @JNI.B(V = 184271543)
    private static native int ab();

    @JNI.B(V = 895617849)
    private static native Object[] ac();

    @JNI.B(V = 340304317)
    private static native Object[] ad();

    @JNI.B(V = 845714052)
    private static native Object[] ae();

    @JNI.B(V = 536412578)
    private static native void af(int i2);

    @JNI.B(V = 146230439)
    private static native Object[] ag();

    @JNI.B(V = 276274731)
    private static native void ah(int i2);

    static ar b() {
        int i2 = 2 % 2;
        int i3 = f2896a + 93;
        f2897c = i3 % 128;
        if (i3 % 2 == 0) {
            return ar.values()[ab()];
        }
        ar arVar = ar.values()[ab()];
        throw null;
    }

    @JNI.B(V = 946822600)
    static native boolean b(String str);

    @JNI.B(V = 123942655)
    static native boolean c();

    @JNI.B(V = 280142536)
    static native void d();

    static ag e() {
        ag agVar;
        int i2 = 2 % 2;
        int i3 = f2896a + 55;
        f2897c = i3 % 128;
        if (i3 % 2 != 0) {
            agVar = ag.values()[X()];
            int i4 = 11 / 0;
        } else {
            agVar = ag.values()[X()];
        }
        int i5 = f2896a + 95;
        f2897c = i5 % 128;
        int i6 = i5 % 2;
        return agVar;
    }

    @JNI.B(V = 465999614)
    static native void e(boolean z2);

    @JNI.B(V = 759707868)
    static native void f(boolean z2);

    static byte[][] f() {
        int i2 = 2 % 2;
        int i3 = f2896a + 57;
        f2897c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArrAc = ac();
        byte[][] bArr = new byte[objArrAc.length][];
        int i5 = f2896a + 85;
        f2897c = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < objArrAc.length; i7++) {
            bArr[i7] = (byte[]) objArrAc[i7];
        }
        return bArr;
    }

    @JNI.B(V = 663820916)
    static native boolean g(boolean z2);

    static byte[][] g() {
        int i2 = 2 % 2;
        int i3 = f2897c + 35;
        f2896a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArrY = Y();
        byte[][] bArr = new byte[objArrY.length][];
        int i5 = 0;
        while (i5 < objArrY.length) {
            bArr[i5] = (byte[]) objArrY[i5];
            i5++;
            int i6 = f2897c + 71;
            f2896a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = f2897c + 85;
        f2896a = i8 % 128;
        if (i8 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static ae h() {
        int i2 = 2 % 2;
        int i3 = f2896a + 113;
        f2897c = i3 % 128;
        int i4 = i3 % 2;
        ae aeVar = ae.values()[aa()];
        int i5 = f2896a + 13;
        f2897c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return aeVar;
    }

    @JNI.B(V = 363975514)
    static native void h(boolean z2);

    @JNI.B(V = 986922517)
    static native void i(String str, byte[] bArr, boolean z2, int i2, int i3, int i4, boolean z3);

    static byte[][] i() {
        Object[] objArrAe;
        byte[][] bArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2897c + 43;
        f2896a = i4 % 128;
        if (i4 % 2 == 0) {
            objArrAe = ae();
            bArr = new byte[objArrAe.length][];
            i2 = 1;
        } else {
            objArrAe = ae();
            bArr = new byte[objArrAe.length][];
            i2 = 0;
        }
        while (i2 < objArrAe.length) {
            bArr[i2] = (byte[]) objArrAe[i2];
            i2++;
        }
        int i5 = f2896a + 65;
        f2897c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return bArr;
    }

    @JNI.B(V = 936399077)
    static native void j(byte[] bArr, boolean z2, int i2, int i3, int i4);

    static byte[][] j() {
        Object[] objArrAd;
        byte[][] bArr;
        int i2;
        int i3 = 2 % 2;
        int i4 = f2896a + 41;
        f2897c = i4 % 128;
        if (i4 % 2 != 0) {
            objArrAd = ad();
            bArr = new byte[objArrAd.length][];
            i2 = 1;
        } else {
            objArrAd = ad();
            bArr = new byte[objArrAd.length][];
            i2 = 0;
        }
        while (i2 < objArrAd.length) {
            bArr[i2] = (byte[]) objArrAd[i2];
            i2++;
            int i5 = f2896a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f2897c = i5 % 128;
            int i6 = i5 % 2;
        }
        return bArr;
    }

    @JNI.B(V = 853861522)
    static native byte[] k();

    static void l() {
        L = 3737574374489489899L;
        I = new char[]{26036, 58371, 26171, 57381, 25176, 60506, 28208, 59525, 27294, 62644, 30361, 61641, 29414, 64794, 32540, 63797, 31611, 50557, 18256, 49576, 17328, 52659, 20425, 51676, 19421, 51775, 21513, 54905, 20593, 53853, 23629, 56976, 22711, 55992, 9463, 42715, 8410, 41797, 'U', 33157, 951, 34211, 1984, 35314, 2978, 36121, 3895, 37219, 4935, 38263, 5997, 39067, 6835, 40100, 7900, 41202, 8956, 42004, 9852, 43009, 10835, 44158, 11885, 44967, 12731, 45994, 13799, 47067, 14785, 47963, 15680, 49003, 16742, 49997, 17769, 50838, 18577, 51880, 19608, 52949, 20715, 53771, 21517, 54825, 22595, 55813, 23657, 56724, 24467, 57763, 25500, 58871, 26592, 59666, 27407, 60710, 28511, 61787, 29552, 62687, 30360, 63648, 31404, 64718, 32485, 'z', 33156, 953, 34220, 1997, 35298, 3062, 36101, 3957, 37235, 4894, 38176, 5941, 39135, 6888, 40189, 'F', 33162, 959, 34221, 2009, 35301, 3047, 36173, 3887, 37163, 4935, 38261, 5985, 39119, 6831, 40107, 7872, 41210, 8933, 42010, 9781, 43049, 10837, 44093, 11877, 44956, 12730, 45996, 13784, 47084, 14762, 47875, 15625, 48938, 16662, 50016, 17791, 50820, 18567, 51897, 19701, 52930, 20704, 53784, 21507, 54826, 22600, 14557, 47417, 15118, 48399, 16255, 45378, 13146};
        S = 229;
        F = true;
        C = new char[]{313, 333, 330, 343, 261, 348, 326, 344, 331, 334, 337, 346, 339, 345, 351, 332, 312, 297, 304, 349, 285, 283, 307, 347, 327, 350, 329, 340, 287, 276, 328, 324, 336, 335};
        D = true;
    }

    @JNI.B(V = 444410178)
    static native void l(boolean z2, boolean z3);

    @JNI.B(V = 313884573)
    static native boolean m();

    @JNI.B(V = 785930769)
    static native void n();

    @JNI.B(V = 779218783)
    static native void o(boolean z2);

    static String[] o() {
        int i2 = 2 % 2;
        Object[] objArrAg = ag();
        String[] strArr = new String[objArrAg.length];
        int i3 = 0;
        while (i3 < objArrAg.length) {
            int i4 = f2897c;
            int i5 = i4 + 91;
            f2896a = i5 % 128;
            if (i5 % 2 == 0) {
                strArr[i3] = (String) objArrAg[i3];
                i3 += 115;
            } else {
                strArr[i3] = (String) objArrAg[i3];
                i3++;
            }
            int i6 = i4 + 1;
            f2896a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = f2896a + 121;
        f2897c = i8 % 128;
        if (i8 % 2 == 0) {
            return strArr;
        }
        throw null;
    }

    @JNI.B(V = 634933143)
    static native byte[] p(String str, String str2, String str3);

    private static int q() {
        int i2 = 2 % 2;
        int i3 = f2896a + 101;
        f2897c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            FaceTecAuditTrailType faceTecAuditTrailType = n.B;
            FaceTecAuditTrailType faceTecAuditTrailType2 = FaceTecAuditTrailType.FULL_RESOLUTION;
            throw null;
        }
        if (n.B != FaceTecAuditTrailType.FULL_RESOLUTION) {
            return OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE;
        }
        int i4 = f2896a + 79;
        f2897c = i4 % 128;
        if (i4 % 2 == 0) {
            return -1;
        }
        super.hashCode();
        throw null;
    }

    @JNI.B(V = 336136627)
    static native String q(int i2);

    @JNI.B(V = 336358377)
    static native void r();

    @JNI.B(V = 122908087)
    static native void s();

    @JNI.B(V = 108889513)
    static native byte[] t(String str, String str2, boolean z2, boolean z3);

    @JNI.B(V = 507506694)
    static native void u(String str, String str2);

    @JNI.B(V = 470111729)
    static native void v(String str);

    @JNI.B(V = 605746527)
    static native void w();

    @JNI.B(V = 764687447)
    static native void x(boolean z2);

    @JNI.B(V = 895026767)
    static native void y(Map<String, String> map);

    @JNI.B(V = 980875271)
    static native void z(String str);
}
