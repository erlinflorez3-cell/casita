package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.Z;
import com.facetec.sdk.by;
import com.facetec.sdk.u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class n {
    static FaceTecAuditTrailType B = null;
    private static String C = null;
    static String Code = null;
    private static Code D = null;
    private static String F = null;
    static String I = null;
    private static String L = null;
    private static boolean S = false;
    static int V = 0;
    static JSONObject Z = null;

    /* JADX INFO: renamed from: a */
    private static Boolean f3259a = null;

    /* JADX INFO: renamed from: b */
    private static char f3260b = 0;

    /* JADX INFO: renamed from: c */
    private static /* synthetic */ boolean f3261c = false;

    /* JADX INFO: renamed from: d */
    private static char f3262d = 0;

    /* JADX INFO: renamed from: e */
    private static SharedPreferences f3263e = null;

    /* JADX INFO: renamed from: f */
    private static int f3264f = 0;

    /* JADX INFO: renamed from: g */
    private static char f3265g = 0;

    /* JADX INFO: renamed from: h */
    private static char f3266h = 0;

    /* JADX INFO: renamed from: j */
    private static int f3267j = 1;

    /* JADX INFO: renamed from: com.facetec.sdk.n$1 */
    final class AnonymousClass1 extends by.I {
        private /* synthetic */ Context I;
        private /* synthetic */ FaceTecSDK.InitializeCallback V;

        AnonymousClass1(Context context, FaceTecSDK.InitializeCallback initializeCallback) {
            context = context;
            initializeCallback = initializeCallback;
        }

        @Override // com.facetec.sdk.by.I
        public final void B(by.Code code) {
            boolean z2 = true;
            if (code != null) {
                if (!code.Z) {
                    n.Code(Code.REJECTED);
                } else if (code.Code) {
                    n.Code(Code.VERSION_DEPRECATED);
                } else {
                    n.Code(Code.VALIDATED);
                }
                z2 = false;
            } else {
                n.Code(Code.NETWORK_ERROR);
                if (Z.Code(context)) {
                    n.Code(Code.IN_GRACE_PERIOD);
                } else {
                    z2 = false;
                }
            }
            n.I(initializeCallback, z2);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$10 */
    final class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            by.Code();
            ad.Code();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$2 */
    final class AnonymousClass2 implements Runnable {
        private /* synthetic */ Context Code;
        private /* synthetic */ String V;
        private /* synthetic */ FaceTecSDK.InitializeCallback Z;

        AnonymousClass2(String str, FaceTecSDK.InitializeCallback initializeCallback, Context context) {
            str = str;
            initializeCallback = initializeCallback;
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (!n.I(str)) {
                n.I(initializeCallback, false);
            } else {
                n.c(context);
                n.I(context, initializeCallback);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$3 */
    final class AnonymousClass3 extends by.I {
        private /* synthetic */ Context V;

        AnonymousClass3(Context context) {
            context = context;
        }

        @Override // com.facetec.sdk.by.I
        public final void B(by.Code code) {
            if (code == null || !code.Z) {
                n.I(initializeCallback, n.S(context));
            } else {
                n.I(initializeCallback, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] V;

        static {
            int[] iArr = new int[Code.values().length];
            V = iArr;
            try {
                iArr[Code.VALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                V[Code.IN_GRACE_PERIOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                V[Code.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                V[Code.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                V[Code.VERSION_DEPRECATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                V[Code.NEVER_VALIDATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$5 */
    final class AnonymousClass5 implements Runnable {
        private /* synthetic */ String B;
        private /* synthetic */ Context Code;
        private /* synthetic */ FaceTecSDK.InitializeCallback I;
        private /* synthetic */ String V;
        private /* synthetic */ String Z;

        AnonymousClass5(String str, FaceTecSDK.InitializeCallback initializeCallback, Context context, String str2, String str3) {
            str = str;
            initializeCallback = initializeCallback;
            context = context;
            str = str2;
            str = str3;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (!n.I(str)) {
                n.I(initializeCallback, false);
            } else {
                n.c(context);
                n.V(context, str, str, initializeCallback);
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$6 */
    final class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ai.Code();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$7 */
    final class AnonymousClass7 implements Runnable {
        private /* synthetic */ Context V;

        AnonymousClass7(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            be.Code(context);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$8 */
    final class AnonymousClass8 implements Runnable {
        private /* synthetic */ boolean I;

        AnonymousClass8(boolean z2) {
            z = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            initializeCallback.onCompletion(z);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.n$9 */
    final class AnonymousClass9 extends by.I {
        AnonymousClass9() {
        }

        @Override // com.facetec.sdk.by.I
        public final void B(by.Code code) {
            if (code == null || !code.Z) {
                return;
            }
            n.Code(Code.VALIDATED);
        }
    }

    enum Code {
        NEVER_VALIDATED,
        VALIDATED,
        REJECTED,
        VERSION_DEPRECATED,
        NETWORK_ERROR,
        IN_GRACE_PERIOD
    }

    static {
        L();
        int i2 = f3264f + 25;
        f3267j = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        f3261c = true;
        I = null;
        B = FaceTecAuditTrailType.HEIGHT_640;
        Z = null;
        D = Code.NEVER_VALIDATED;
        S = false;
        F = null;
        f3259a = null;
    }

    n() {
    }

    static void B(Context context) {
        int i2 = 2 % 2;
        ax.Z(new Runnable() { // from class: com.facetec.sdk.n.7
            private /* synthetic */ Context V;

            AnonymousClass7(Context context2) {
                context = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                be.Code(context);
            }
        });
        if (a(context2)) {
            ai.Code(context2);
            int i3 = f3267j + 19;
            f3264f = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f3264f + 117;
        f3267j = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static boolean B() {
        int i2 = 2 % 2;
        int i3 = f3267j + 51;
        f3264f = i3 % 128;
        return i3 % 2 != 0;
    }

    private static boolean B(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f3267j + 117;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            try {
                String strReplace = str.replace(C1561oA.yd("\u001b\u001c\u0019\u001a\u001f558/5\u00045?-42A\u001fGB[0-.#$}", (short) (C1633zX.Xd() ^ (-21951))), "").replace(C1561oA.Yd("6789:S]T1bhVa_Z8d_tIJKLM", (short) (Od.Xd() ^ (-7354))), "");
                Class<?> cls = Class.forName(Xg.qd("\u001e,#20+'q::04v\f,?2\u0004\u0003", (short) (Od.Xd() ^ (-23598)), (short) (Od.Xd() ^ (-23649))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (FB.Xd() ^ 32530);
                short sXd2 = (short) (FB.Xd() ^ 31833);
                int[] iArr = new int[",3ZUs\u0004\tgqI\u007f2A\t i".length()];
                QB qb = new QB(",3ZUs\u0004\tgqI\u007f2A\t i");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((i5 * sXd2) ^ sXd));
                    i5++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i5));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {strReplace, 0};
                short sXd3 = (short) (C1580rY.Xd() ^ (-20261));
                short sXd4 = (short) (C1580rY.Xd() ^ (-8019));
                int[] iArr2 = new int["V\u0001\u0001\u0003'\u0013".length()];
                QB qb2 = new QB("V\u0001\u0001\u0003'\u0013");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd4) + sXd3)));
                    i6++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i6), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                    short sXd5 = (short) (OY.Xd() ^ 25764);
                    short sXd6 = (short) (OY.Xd() ^ 14098);
                    int[] iArr3 = new int["\u0006R\u001c".length()];
                    QB qb3 = new QB("\u0006R\u001c");
                    int i7 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i7] = xuXd3.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i7 * sXd6))) + xuXd3.CK(iKK3));
                        i7++;
                    }
                    KeyFactory.getInstance(new String(iArr3, 0, i7)).generatePublic(new X509EncodedKeySpec(bArr));
                    F = str.trim();
                    int i8 = f3267j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f3264f = i8 % 128;
                    int i9 = i8 % 2;
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception unused) {
            }
        }
        int i10 = f3267j + 3;
        f3264f = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    static SharedPreferences C(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f3267j;
        int i4 = i3 + 1;
        f3264f = i4 % 128;
        int i5 = i4 % 2;
        if (f3263e == null) {
            int i6 = i3 + 73;
            f3264f = i6 % 128;
            int i7 = i6 % 2;
            if (!f3261c) {
                Looper looperMyLooper = Looper.myLooper();
                Class<?> cls = Class.forName(Ig.wd("']??b8I0;!S=\u0011\u001f\b\u001fb", (short) (ZN.Xd() ^ 22917)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 28559);
                int[] iArr = new int["!wH~kI`W> \u0019qN".length()];
                QB qb = new QB("!wH~kI`W> \u0019qN");
                int i8 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i8] = xuXd.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd + sXd) + i8)) + xuXd.CK(iKK));
                    i8++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i8), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                        throw new AssertionError();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            short sXd2 = (short) (C1499aX.Xd() ^ (-25899));
            int[] iArr2 = new int["B652q6&,m2#10$( +".length()];
            QB qb2 = new QB("B652q6&,m2#10$( +");
            int i9 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i9] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i9 + xuXd2.CK(iKK2));
                i9++;
            }
            String str = new String(iArr2, 0, i9);
            short sXd3 = (short) (C1633zX.Xd() ^ (-17144));
            short sXd4 = (short) (C1633zX.Xd() ^ (-12160));
            int[] iArr3 = new int["UcZigb^)_llseov1Gtt{m\u0002~".length()];
            QB qb3 = new QB("UcZigb^)_llseov1Gtt{m\u0002~");
            int i10 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i10] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i10)) - sXd4);
                i10++;
            }
            Object[] objArr2 = {str, 0};
            Method method = Class.forName(new String(iArr3, 0, i10)).getMethod(C1561oA.Kd("#\"2\u0012(\"4((\u00158,..<0:03B", (short) (C1607wl.Xd() ^ 15319)), Class.forName(C1561oA.od("I?S=\tF:F>\u0004(HE;?7", (short) (C1499aX.Xd() ^ (-2918)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                f3263e = (SharedPreferences) method.invoke(context, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return f3263e;
    }

    static String C() {
        int i2 = 2 % 2;
        int i3 = f3264f;
        int i4 = i3 + 69;
        f3267j = i4 % 128;
        int i5 = i4 % 2;
        String str = F;
        int i6 = i3 + 47;
        f3267j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static /* synthetic */ Code Code(Code code) {
        int i2 = 2 % 2;
        int i3 = f3264f;
        int i4 = i3 + 69;
        f3267j = i4 % 128;
        int i5 = i4 % 2;
        D = code;
        int i6 = i3 + 105;
        f3267j = i6 % 128;
        if (i6 % 2 != 0) {
            return code;
        }
        throw null;
    }

    static void Code() {
        int i2 = 2 % 2;
        ax.Z(new Runnable() { // from class: com.facetec.sdk.n.10
            AnonymousClass10() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                by.Code();
                ad.Code();
            }
        });
        int i3 = f3267j + 63;
        f3264f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
    }

    private static void Code(FaceTecSDK.InitializeCallback initializeCallback, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f3267j + 97;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        if (initializeCallback != null) {
            ax.Code(new Runnable() { // from class: com.facetec.sdk.n.8
                private /* synthetic */ boolean I;

                AnonymousClass8(boolean z22) {
                    z = z22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    initializeCallback.onCompletion(z);
                }
            });
            int i5 = f3264f + 53;
            f3267j = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
        }
    }

    static boolean Code(Context context) {
        int i2 = 2 % 2;
        int i3 = f3267j + 65;
        f3264f = i3 % 128;
        if (i3 % 2 != 0) {
            cb.F(context);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zF = cb.F(context);
        int i4 = f3264f + 101;
        f3267j = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return zF;
    }

    static synchronized String D(Context context) {
        int i2 = 2 % 2;
        int i3 = f3267j;
        int i4 = i3 + 111;
        f3264f = i4 % 128;
        int i5 = i4 % 2;
        if (L == null) {
            int i6 = i3 + 91;
            f3264f = i6 % 128;
            int i7 = i6 % 2;
            if (context != null) {
                L = d(context);
                int i8 = f3264f + 27;
                f3267j = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
        }
        return L;
    }

    private static boolean D() {
        int i2 = 2 % 2;
        int i3 = f3267j + 111;
        f3264f = i3 % 128;
        if (i3 % 2 != 0) {
            Build.CPU_ABI.toLowerCase().startsWith("arm");
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (Build.CPU_ABI.toLowerCase().startsWith("arm")) {
            return true;
        }
        int i4 = f3267j + 117;
        f3264f = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    static synchronized String F(Context context) {
        int i2 = 2 % 2;
        int i3 = f3264f;
        int i4 = i3 + 7;
        f3267j = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (C == null) {
            int i5 = i3 + 9;
            int i6 = i5 % 128;
            f3267j = i6;
            int i7 = i5 % 2;
            if (context != null) {
                int i8 = i6 + 1;
                f3264f = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.Zd("\u0002Vndc\u007f^6\u0010\u0002\u001f-\u007f7A\\\u0016\b\t7\u000e)G", (short) (ZN.Xd() ^ 18561), (short) (ZN.Xd() ^ 9407))).getMethod(C1561oA.Xd("cbrOadmdkjThun", (short) (C1499aX.Xd() ^ (-15448))), new Class[0]);
                try {
                    method.setAccessible(true);
                    C = (String) method.invoke(context, objArr);
                    int i10 = 2 % 2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return C;
    }

    static void F() {
        int i2 = 2 % 2;
        int i3 = f3264f + 53;
        f3267j = i3 % 128;
        int i4 = i3 % 2;
        D = Code.IN_GRACE_PERIOD;
        if (i4 == 0) {
            int i5 = 54 / 0;
        }
    }

    static Long I(Context context) {
        int i2 = 2 % 2;
        int i3 = f3264f + 47;
        f3267j = i3 % 128;
        int i4 = i3 % 2;
        long jL = cb.L(context);
        Object obj = null;
        if (jL == 0) {
            return null;
        }
        int i5 = f3264f + 39;
        f3267j = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(jL);
        }
        Long.valueOf(jL);
        super.hashCode();
        throw null;
    }

    private static String I(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = f3267j + 23;
        f3264f = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        while (i6 < cArr.length) {
            int i7 = i6 + 1;
            char[] cArr3 = {cArr[i6], cArr[i7]};
            ep.Z(cArr3, f3260b, f3262d, f3265g, f3266h);
            cArr2[i6] = cArr3[0];
            cArr2[i7] = cArr3[1];
            i6 += 2;
            int i8 = f3264f + 11;
            f3267j = i8 % 128;
            int i9 = i8 % 2;
        }
        return new String(cArr2, 0, i2);
    }

    static /* synthetic */ void I(Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        int i2 = 2 % 2;
        I(context, new by.I() { // from class: com.facetec.sdk.n.1
            private /* synthetic */ Context I;
            private /* synthetic */ FaceTecSDK.InitializeCallback V;

            AnonymousClass1(Context context2, FaceTecSDK.InitializeCallback initializeCallback2) {
                context = context2;
                initializeCallback = initializeCallback2;
            }

            @Override // com.facetec.sdk.by.I
            public final void B(by.Code code) {
                boolean z2 = true;
                if (code != null) {
                    if (!code.Z) {
                        n.Code(Code.REJECTED);
                    } else if (code.Code) {
                        n.Code(Code.VERSION_DEPRECATED);
                    } else {
                        n.Code(Code.VALIDATED);
                    }
                    z2 = false;
                } else {
                    n.Code(Code.NETWORK_ERROR);
                    if (Z.Code(context)) {
                        n.Code(Code.IN_GRACE_PERIOD);
                    } else {
                        z2 = false;
                    }
                }
                n.I(initializeCallback, z2);
            }
        });
        int i3 = f3267j + 85;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
    }

    private static synchronized void I(Context context, by.I i2) {
        int i3 = 2 % 2;
        int i4 = f3264f + 107;
        f3267j = i4 % 128;
        if (i4 % 2 == 0) {
            D(context);
            F(context);
            by.Code(context, i2);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        D(context);
        F(context);
        by.Code(context, i2);
        int i5 = f3264f + 125;
        f3267j = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void I(FaceTecSDK.InitializeCallback initializeCallback, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f3267j + 13;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        Code(initializeCallback, z2);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static boolean I() {
        int i2 = 2 % 2;
        if (S) {
            return false;
        }
        int i3 = f3267j;
        int i4 = i3 + 33;
        f3264f = i4 % 128;
        boolean z2 = i4 % 2 == 0;
        int i5 = i3 + 39;
        f3264f = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ boolean I(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f3267j + 83;
        f3264f = i3 % 128;
        if (i3 % 2 == 0) {
            return B(str);
        }
        B(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static FaceTecSDK.CameraPermissionStatus L(Context context) {
        int i2 = 2 % 2;
        int i3 = f3267j + 107;
        f3264f = i3 % 128;
        if (i3 % 2 != 0 && Build.VERSION.SDK_INT < 37) {
            FaceTecSDK.CameraPermissionStatus cameraPermissionStatus = FaceTecSDK.CameraPermissionStatus.GRANTED;
            int i4 = f3264f + 71;
            f3267j = i4 % 128;
            int i5 = i4 % 2;
            return cameraPermissionStatus;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") != 0) {
            int i6 = f3264f + 71;
            f3267j = i6 % 128;
            if (i6 % 2 != 0) {
                return FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
            }
            FaceTecSDK.CameraPermissionStatus cameraPermissionStatus2 = FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
            throw null;
        }
        FaceTecSDK.CameraPermissionStatus cameraPermissionStatus3 = FaceTecSDK.CameraPermissionStatus.GRANTED;
        int i7 = f3264f + 73;
        f3267j = i7 % 128;
        if (i7 % 2 != 0) {
            return cameraPermissionStatus3;
        }
        throw null;
    }

    static void L() {
        f3262d = (char) 53515;
        f3260b = (char) 2441;
        f3265g = (char) 8454;
        f3266h = (char) 48296;
    }

    static float S() {
        int i2 = 2 % 2;
        int i3 = f3267j + 49;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        if (be.B() != null) {
            return r2.B / r2.I;
        }
        int i5 = f3264f + 115;
        f3267j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return 0.0f;
    }

    static boolean S(Context context) {
        int i2 = 2 % 2;
        int i3 = f3264f + 97;
        f3267j = i3 % 128;
        if (i3 % 2 == 0) {
            Z.Code(context);
            throw null;
        }
        boolean zCode = Z.Code(context);
        int i4 = f3264f + 113;
        f3267j = i4 % 128;
        if (i4 % 2 != 0) {
            return zCode;
        }
        throw null;
    }

    static String V(String str) {
        int i2 = 2 % 2;
        String strD = D(null);
        if (strD == null) {
            int i3 = f3267j;
            int i4 = i3 + 15;
            f3264f = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 47;
            f3264f = i6 % 128;
            int i7 = i6 % 2;
            strD = Global.UNDERSCORE;
        }
        return C != null ? new StringBuilder("facetec|sdk|android|").append(C).append("|").append(I).append("|").append(strD).append("|").append(Build.MODEL).append("|").append(FaceTecSDK.version()).append("|").append(Locale.getDefault().toString()).append("|").append(Locale.getDefault().getLanguage()).append("|").append(str).toString() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void V(android.content.Context r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.facetec.sdk.n.f3267j
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.facetec.sdk.n.f3264f = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2a
            com.facetec.sdk.n$Code r2 = com.facetec.sdk.n.D
            com.facetec.sdk.n$Code r1 = com.facetec.sdk.n.Code.IN_GRACE_PERIOD
            r0 = 65
            int r0 = r0 / 0
            if (r2 != r1) goto L20
        L18:
            com.facetec.sdk.n$9 r0 = new com.facetec.sdk.n$9
            r0.<init>()
            I(r4, r0)
        L20:
            int r0 = com.facetec.sdk.n.f3264f
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.facetec.sdk.n.f3267j = r0
            int r1 = r1 % r3
            return
        L2a:
            com.facetec.sdk.n$Code r1 = com.facetec.sdk.n.D
            com.facetec.sdk.n$Code r0 = com.facetec.sdk.n.Code.IN_GRACE_PERIOD
            if (r1 != r0) goto L20
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.n.V(android.content.Context):void");
    }

    static /* synthetic */ void V(Context context, String str, String str2, FaceTecSDK.InitializeCallback initializeCallback) {
        int i2 = 2 % 2;
        int i3 = f3264f + 43;
        f3267j = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            D(context);
            F(context);
            u.I(context, str, str2);
            u.I i4 = u.I.VALIDATED;
            super.hashCode();
            throw null;
        }
        D(context);
        F(context);
        if (u.I(context, str, str2) != u.I.VALIDATED) {
            D = Code.REJECTED;
            Code(initializeCallback, false);
            int i5 = f3264f + 43;
            f3267j = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        D = Code.VALIDATED;
        Z.I i6 = new Z.I();
        i6.V = Boolean.FALSE;
        i6.Code = 100;
        Z.Z(context, false, i6);
        Code(initializeCallback, true);
        int i7 = f3267j + 43;
        f3264f = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 72 / 0;
        }
    }

    static boolean V() {
        int i2 = 2 % 2;
        int i3 = f3267j + 3;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        if (B == FaceTecAuditTrailType.DISABLED) {
            return false;
        }
        int i5 = f3264f + 11;
        f3267j = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static boolean V(Configuration configuration) {
        int i2 = 2 % 2;
        int i3 = f3264f + 41;
        f3267j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = configuration.orientation;
        if (i4 != 0 ? i5 != 2 : i5 != 3) {
            return false;
        }
        int i6 = f3264f + 79;
        f3267j = i6 % 128;
        return i6 % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0044, code lost:
    
        if (r2.isEmpty() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x004d, code lost:
    
        if (r2.isEmpty() != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.facetec.sdk.FaceTecSDKStatus Z(android.content.Context r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.n.Z(android.content.Context):com.facetec.sdk.FaceTecSDKStatus");
    }

    static void Z(Context context, String str, String str2, FaceTecSDK.InitializeCallback initializeCallback) {
        int i2 = 2 % 2;
        int i3 = f3264f + 3;
        f3267j = i3 % 128;
        int i4 = i3 % 2;
        if (a.Z.equals("")) {
            a.Z = UUID.randomUUID().toString();
        }
        B(context);
        if (D == Code.VALIDATED) {
            int i5 = f3267j + 3;
            f3264f = i5 % 128;
            if (i5 % 2 != 0) {
                Code(initializeCallback, false);
                return;
            } else {
                Code(initializeCallback, true);
                return;
            }
        }
        if (D != Code.IN_GRACE_PERIOD) {
            I = str;
            S = false;
            if (a(context)) {
                ax.Code(new Runnable() { // from class: com.facetec.sdk.n.2
                    private /* synthetic */ Context Code;
                    private /* synthetic */ String V;
                    private /* synthetic */ FaceTecSDK.InitializeCallback Z;

                    AnonymousClass2(String str22, FaceTecSDK.InitializeCallback initializeCallback2, Context context2) {
                        str = str22;
                        initializeCallback = initializeCallback2;
                        context = context2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        if (!n.I(str)) {
                            n.I(initializeCallback, false);
                        } else {
                            n.c(context);
                            n.I(context, initializeCallback);
                        }
                    }
                });
                return;
            }
            Code(initializeCallback2, false);
            int i6 = f3264f + 27;
            f3267j = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (!S(context2)) {
            I(context2, new by.I() { // from class: com.facetec.sdk.n.3
                private /* synthetic */ Context V;

                AnonymousClass3(Context context2) {
                    context = context2;
                }

                @Override // com.facetec.sdk.by.I
                public final void B(by.Code code) {
                    if (code == null || !code.Z) {
                        n.I(initializeCallback, n.S(context));
                    } else {
                        n.I(initializeCallback, true);
                    }
                }
            });
            int i8 = f3264f + 69;
            f3267j = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i9 = f3267j + 87;
        f3264f = i9 % 128;
        if (i9 % 2 != 0) {
            V(context2);
            Code(initializeCallback2, false);
        } else {
            V(context2);
            Code(initializeCallback2, true);
        }
    }

    static void Z(Context context, String str, String str2, String str3, FaceTecSDK.InitializeCallback initializeCallback) {
        int i2 = 2 % 2;
        int i3 = f3267j + 99;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        if (D == Code.VALIDATED) {
            Code(initializeCallback, true);
            return;
        }
        if (str3 == null) {
            int i5 = f3267j + 37;
            f3264f = i5 % 128;
            if (i5 % 2 != 0) {
                Code(initializeCallback, true);
                return;
            } else {
                Code(initializeCallback, false);
                return;
            }
        }
        B(context);
        I = str2;
        S = true;
        if (a(context)) {
            ax.Code(new Runnable() { // from class: com.facetec.sdk.n.5
                private /* synthetic */ String B;
                private /* synthetic */ Context Code;
                private /* synthetic */ FaceTecSDK.InitializeCallback I;
                private /* synthetic */ String V;
                private /* synthetic */ String Z;

                AnonymousClass5(String str32, FaceTecSDK.InitializeCallback initializeCallback2, Context context2, String str4, String str22) {
                    str = str32;
                    initializeCallback = initializeCallback2;
                    context = context2;
                    str = str4;
                    str = str22;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (!n.I(str)) {
                        n.I(initializeCallback, false);
                    } else {
                        n.c(context);
                        n.V(context, str, str, initializeCallback);
                    }
                }
            });
        } else {
            Code(initializeCallback2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void Z(com.facetec.sdk.FaceTecAuditTrailType r3) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.facetec.sdk.n.f3267j
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.facetec.sdk.n.f3264f = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2a
            com.facetec.sdk.FaceTecAuditTrailType r1 = com.facetec.sdk.n.B
            r0 = 70
            int r0 = r0 / 0
            if (r3 == r1) goto L20
        L16:
            com.facetec.sdk.n.B = r3
            com.facetec.sdk.n$6 r0 = new com.facetec.sdk.n$6
            r0.<init>()
            com.facetec.sdk.ax.Code(r0)
        L20:
            int r0 = com.facetec.sdk.n.f3267j
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.facetec.sdk.n.f3264f = r0
            int r1 = r1 % r2
            return
        L2a:
            com.facetec.sdk.FaceTecAuditTrailType r0 = com.facetec.sdk.n.B
            if (r3 == r0) goto L20
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.n.Z(com.facetec.sdk.FaceTecAuditTrailType):void");
    }

    static boolean Z() {
        int i2 = 2 % 2;
        if (D == Code.IN_GRACE_PERIOD) {
            int i3 = f3264f + 63;
            f3267j = i3 % 128;
            return true ^ (i3 % 2 == 0);
        }
        int i4 = f3264f + 43;
        f3267j = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x003c A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {, blocks: (B:42:0x0004, B:44:0x0012, B:46:0x0016, B:48:0x001c, B:50:0x0027, B:52:0x002d, B:53:0x002f, B:58:0x0041, B:62:0x0049, B:55:0x003c, B:54:0x0035, B:65:0x004c, B:59:0x0044, B:60:0x0047, B:63:0x004a), top: B:73:0x0004, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean a(android.content.Context r5) {
        /*
            java.lang.Class<com.facetec.sdk.n> r4 = com.facetec.sdk.n.class
            monitor-enter(r4)
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.facetec.sdk.n.f3267j     // Catch: java.lang.Throwable -> L4d
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.facetec.sdk.n.f3264f = r0     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L4a
            java.lang.Boolean r0 = com.facetec.sdk.n.f3259a     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L35
            boolean r0 = D()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3c
            int r0 = com.facetec.sdk.n.f3264f     // Catch: java.lang.Throwable -> L4d
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.facetec.sdk.n.f3267j = r0     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 % r3
            if (r1 == 0) goto L41
            boolean r0 = e(r5)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3c
            int r3 = r3 % r3
            r0 = 1
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L4d
            com.facetec.sdk.n.f3259a = r0     // Catch: java.lang.Throwable -> L4d
        L35:
            java.lang.Boolean r0 = com.facetec.sdk.n.f3259a     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4d
            goto L3f
        L3c:
            int r3 = r3 % r3
            r0 = 0
            goto L2f
        L3f:
            monitor-exit(r4)
            return r0
        L41:
            e(r5)     // Catch: java.lang.Throwable -> L4d
            super.hashCode()     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4d
        L4a:
            throw r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.n.a(android.content.Context):boolean");
    }

    static /* synthetic */ void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f3267j + 83;
        f3264f = i3 % 128;
        int i4 = i3 % 2;
        cb.I(context);
        bt.Code(context);
        C(context);
        bd.Code(context);
        int i5 = f3267j + 55;
        f3264f = i5 % 128;
        int i6 = i5 % 2;
    }

    private static String d(Context context) {
        int i2 = 2 % 2;
        int i3 = f3264f + 51;
        f3267j = i3 % 128;
        try {
            String strSubstring = i3 % 2 == 0 ? C1150r.Code(Z.Z(context), "gz9X05zb1cRaOLl8hkyP").substring(1, 93) : C1150r.Code(Z.Z(context), "gz9X05zb1cRaOLl8hkyP").substring(0, 16);
            int i4 = f3264f + 41;
            f3267j = i4 % 128;
            if (i4 % 2 != 0) {
                return strSubstring;
            }
            throw null;
        } catch (Exception e2) {
            L.V(e2);
            return "unknown";
        }
    }

    private static boolean e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f3264f + 115;
        f3267j = i3 % 128;
        int i4 = i3 % 2;
        short sXd = (short) (FB.Xd() ^ 16920);
        short sXd2 = (short) (FB.Xd() ^ 24036);
        int[] iArr = new int["\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b".length()];
        QB qb = new QB("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK) + sXd2);
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.ud("\"\u001f-\b\u0018\u0019 \u0015\u001a\u0017}\u0011\u001d\u000f\u0014\u0011\u001d", (short) (ZN.Xd() ^ 16307)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {C1561oA.yd("nzo|\u0001ys<meuf\u0001iyk+_\\gfr`,[fb`m", (short) (C1633zX.Xd() ^ (-3088)))};
            try {
                Class.forName(C1561oA.Yd("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i-+l\u0010\"%.%,+\u0014)7+21?", (short) (C1633zX.Xd() ^ (-346)))).getMethod(Jg.Wd("J2-CpRnoVe\u0016X\u001e0\u0015=", (short) (C1633zX.Xd() ^ (-11897)), (short) (C1633zX.Xd() ^ (-29034))), Class.forName(Xg.qd("\t\u0001\u0017\u0003P\u0010\u0006\u0014\u000eU{\u001e\u001d\u0015\u001b\u0015", (short) (Od.Xd() ^ (-30699)), (short) (Od.Xd() ^ (-10877))))).setAccessible(true);
                if (!(!((Boolean) r1.invoke(packageManager, objArr2)).booleanValue()) || Build.MODEL.equals(I(ZO.xd("鋳얩\ue0a7ᶏֺ\uaacd塾\uf0a7ං瑯욉쭙\u187e䌭\ue8b3웧", (short) (ZN.Xd() ^ 8607), (short) (ZN.Xd() ^ 5229)), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return true;
                }
                int i6 = f3264f + 35;
                f3267j = i6 % 128;
                int i7 = i6 % 2;
                bj.C();
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
