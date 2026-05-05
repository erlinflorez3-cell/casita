package com.facetec.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.PeriodicWorkRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
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
final class cb {
    private static boolean B = false;
    private static LinkedList<Long> C = null;
    private static String Code = null;
    private static char D = 0;
    private static boolean F = false;
    private static String I = null;
    private static long L = 0;
    private static char S = 0;
    private static boolean V = false;
    static boolean Z = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f3081a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3082c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f3083d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f3084e = 0;

    static class Code implements Runnable {
        private final WeakReference<Context> Z;

        Code(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("8D9FB;5}2=;@08=u\n538(:5", (short) (ZN.Xd() ^ 4925))).getMethod(C1561oA.yd("@?O\u001dMNKI43G=DD\u001aG7>0DA", (short) (C1633zX.Xd() ^ (-19405))), new Class[0]);
            try {
                method.setAccessible(true);
                this.Z = new WeakReference<>((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            Context context = this.Z.get();
            if (context == null) {
                return;
            }
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Yd("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8", (short) (OY.Xd() ^ 23564))).getMethod(Xg.qd("]\\l<[^dbBhr", (short) (OY.Xd() ^ 27209), (short) (OY.Xd() ^ 32363)), new Class[0]);
                try {
                    method.setAccessible(true);
                    cb.B((File) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                ce.I(e3.getMessage());
            }
        }
    }

    static {
        B();
        I = "";
        V = false;
        B = false;
        Code = "";
        Z = false;
        int i2 = f3081a + 103;
        f3082c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    cb() {
    }

    static void B() {
        D = (char) 40208;
        S = (char) 1445;
        f3084e = (char) 7812;
        f3083d = (char) 64193;
    }

    static void B(Context context) {
        int i2 = 2 % 2;
        int i3 = f3082c + 17;
        f3081a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (V) {
            if (!C.isEmpty()) {
                int i4 = f3081a + 11;
                f3082c = i4 % 128;
                if (i4 % 2 == 0) {
                    C.removeLast();
                    C(context);
                    super.hashCode();
                    throw null;
                }
                C.removeLast();
                C(context);
            }
            int i5 = f3082c + 55;
            f3081a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    static /* synthetic */ void B(File file) throws Exception {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Long> it = C.iterator();
        while (it.hasNext()) {
            int i3 = f3081a + 63;
            f3082c = i3 % 128;
            if (i3 % 2 == 0) {
                jSONArray.put(it.next().longValue());
                throw null;
            }
            jSONArray.put(it.next().longValue());
        }
        jSONObject.put(I("\uf0e8\uef66", 1 - TextUtils.indexOf((CharSequence) "", '0')).intern(), jSONArray);
        jSONObject.put(I("\uf33e铂", 2 - Gravity.getAbsoluteGravity(0, 0)).intern(), L);
        jSONObject.put(I("\udb37ꧏ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2).intern(), F);
        jSONObject.put(I("\uf85f狅", (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern(), ce.V(16, 128));
        m.I(new File(file, V()), Z(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i4 = f3081a + 81;
        f3082c = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void C(Context context) {
        int i2 = 2 % 2;
        int i3 = f3082c + 23;
        f3081a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            return;
        }
        Thread thread = new Thread(new Code(context));
        thread.setPriority(1);
        thread.start();
        int i4 = f3082c + 125;
        f3081a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    static void Code(Context context) {
        int i2 = 2 % 2;
        if (F) {
            return;
        }
        F = true;
        while (C.size() > 3) {
            int i3 = f3082c + 33;
            f3081a = i3 % 128;
            if (i3 % 2 != 0) {
                C.removeFirst();
                int i4 = 10 / 0;
            } else {
                C.removeFirst();
            }
        }
        C(context);
        int i5 = f3081a + 11;
        f3082c = i5 % 128;
        int i6 = i5 % 2;
    }

    static boolean F(Context context) {
        int i2 = 2 % 2;
        long jL = L(context);
        if (jL <= 0) {
            int i3 = f3081a + 53;
            f3082c = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (new Date().getTime() >= jL) {
            return false;
        }
        int i5 = f3081a + 7;
        f3082c = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static String I(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = f3082c;
        int i5 = i4 + 53;
        f3081a = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str;
        if (str != null) {
            int i7 = i4 + 107;
            f3081a = i7 % 128;
            int i8 = i7 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        int i9 = f3082c + 91;
        f3081a = i9 % 128;
        int i10 = i9 % 2;
        for (int i11 = 0; i11 < cArr.length; i11 += 2) {
            int i12 = i11 + 1;
            char[] cArr3 = {cArr[i11], cArr[i12]};
            ep.Z(cArr3, S, D, f3084e, f3083d);
            cArr2[i11] = cArr3[0];
            cArr2[i12] = cArr3[1];
        }
        return new String(cArr2, 0, i2);
    }

    static void I(Context context) {
        int i2 = 2 % 2;
        if (V) {
            int i3 = f3082c + 7;
            f3081a = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        C = new LinkedList<>();
        L = 0L;
        F = false;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("7UEMD\u0001u9x\u0007@@+5u)Hvo.\u0019.$", (short) (OY.Xd() ^ 17620), (short) (OY.Xd() ^ 2963))).getMethod(ZO.xd("\u007f\n60u\u007f&0\u001a\u0012 65Y", (short) (C1607wl.Xd() ^ 17969), (short) (C1607wl.Xd() ^ 14246)), new Class[0]);
        try {
            method.setAccessible(true);
            I = (String) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1626yg.Ud("E6[|b\u007fW}J4!GY.W~J8d\\USA", (short) (Od.Xd() ^ (-19819)), (short) (Od.Xd() ^ (-30860)))).getMethod(Ig.wd("P\u0001}5@\u001a4=\u000fe=\u001aYcx$Ja", (short) (OY.Xd() ^ 4445)), new Class[0]);
            try {
                method2.setAccessible(true);
                Code = Settings.Secure.getString((ContentResolver) method2.invoke(context, objArr2), EO.Od("Y\u0017|l;j\u00048iR", (short) (Od.Xd() ^ (-5549))));
                B = S(context);
                V = true;
                int i5 = f3082c + 45;
                f3081a = i5 % 128;
                int i6 = i5 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static long L(Context context) {
        long j2;
        int i2 = 2 % 2;
        if (!C.isEmpty()) {
            long size = C.size();
            long jLongValue = C.peekLast().longValue();
            if (Z) {
                j2 = 600000;
            } else {
                int i3 = f3082c + 123;
                f3081a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 2;
                }
                j2 = 300000;
            }
            long j3 = jLongValue - j2;
            while (!C.isEmpty()) {
                int i5 = f3082c + 63;
                f3081a = i5 % 128;
                if (i5 % 2 != 0) {
                    C.peekFirst().longValue();
                    throw null;
                }
                if (C.peekFirst().longValue() >= j3) {
                    break;
                }
                C.removeFirst();
            }
            if (C.size() >= (!Z ? 10L : 12L)) {
                int i6 = f3082c + 17;
                f3081a = i6 % 128;
                if (i6 % 2 != 0) {
                    L = jLongValue;
                    C.clear();
                    int i7 = 17 / 0;
                } else {
                    L = jLongValue;
                    C.clear();
                }
            }
            if (C.size() != size) {
                C(context);
            }
        }
        long j4 = L;
        if (j4 == 0) {
            return 0L;
        }
        int i8 = f3082c + 59;
        f3081a = i8 % 128;
        return i8 % 2 != 0 ? (-1) - (((-1) - j4) | ((-1) - PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)) : j4 + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    private static boolean S(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            byte[] bArrZ = Z();
            short sXd = (short) (Od.Xd() ^ (-17563));
            int[] iArr = new int["4@5B>71y.97<,49q\u00061/4$61".length()];
            QB qb = new QB("4@5B>71y.97<,49q\u00061/4$61");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (ZN.Xd() ^ 2164);
            short sXd3 = (short) (ZN.Xd() ^ 6306);
            int[] iArr2 = new int["xw\bWvy\u007f}]\u0004\u000e".length()];
            QB qb2 = new QB("xw\bWvy\u007f}]\u0004\u000e");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                byte[] bArrI = m.I(new File((File) method.invoke(context, objArr), V()), bArrZ);
                JSONObject jSONObject = new JSONObject(new String(bArrI, 0, bArrI.length, StandardCharsets.UTF_8));
                C.clear();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(I(C1561oA.od("㨐㢍", (short) (OY.Xd() ^ 21380)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2).intern());
                if (jSONArrayOptJSONArray != null) {
                    int i5 = 0;
                    while (i5 < jSONArrayOptJSONArray.length()) {
                        int i6 = f3082c + 23;
                        f3081a = i6 % 128;
                        if (i6 % 2 != 0) {
                            C.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i5)));
                            i5 += 113;
                        } else {
                            C.add(Long.valueOf(jSONArrayOptJSONArray.getLong(i5)));
                            i5++;
                        }
                    }
                    Collections.sort(C);
                }
                L = jSONObject.optLong(I(C1561oA.Kd("뜐墕", (short) (C1607wl.Xd() ^ 20019)), Color.blue(0) + 2).intern(), 0L);
                F = jSONObject.optBoolean(I(Wg.Zd("麲䓄", (short) (C1580rY.Xd() ^ (-10396)), (short) (C1580rY.Xd() ^ (-19857))), Color.rgb(0, 0, 0) + 16777218).intern(), false);
                int i7 = f3082c + 49;
                f3081a = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 2;
                }
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (FileNotFoundException unused) {
            return false;
        } catch (Exception e3) {
            ce.I(e3.getMessage());
            e3.getStackTrace();
            return false;
        }
    }

    private static String V() throws Exception {
        int i2 = 2 % 2;
        String strI = C1150r.I(new StringBuilder().append(I).append(Code).append(I("\ueedb᳧詝豤㒀峀嬜힝\udb4f蝈都ぁꇻ탨\uf12f῏렺잎㶭◲㵈늅", View.resolveSize(0, 0) + 21).intern()).toString());
        int i3 = f3082c + 77;
        f3081a = i3 % 128;
        if (i3 % 2 == 0) {
            return strI;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        com.facetec.sdk.cb.C.add(java.lang.Long.valueOf(new java.util.Date().getTime()));
        C(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (com.facetec.sdk.cb.V == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r2 + 59;
        com.facetec.sdk.cb.f3081a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (com.facetec.sdk.cb.V == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void V(android.content.Context r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.facetec.sdk.cb.f3081a
            int r0 = r0 + 21
            int r2 = r0 % 128
            com.facetec.sdk.cb.f3082c = r2
            int r0 = r0 % r3
            if (r0 != 0) goto L1e
            boolean r1 = com.facetec.sdk.cb.V
            r0 = 57
            int r0 = r0 / 0
            if (r1 != 0) goto L23
        L16:
            int r1 = r2 + 59
            int r0 = r1 % 128
            com.facetec.sdk.cb.f3081a = r0
            int r1 = r1 % r3
            return
        L1e:
            boolean r0 = com.facetec.sdk.cb.V
            if (r0 != 0) goto L23
            goto L16
        L23:
            java.util.LinkedList<java.lang.Long> r2 = com.facetec.sdk.cb.C
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
            C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cb.V(android.content.Context):void");
    }

    static void V(Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = f3082c + 111;
        f3081a = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!B && i2 > 0) {
            long time = new Date().getTime();
            int i5 = 0;
            while (i5 < i2) {
                int i6 = f3081a + 69;
                f3082c = i6 % 128;
                int i7 = i6 % 2;
                C.add(Long.valueOf(time));
                i5++;
                int i8 = f3082c + 95;
                f3081a = i8 % 128;
                int i9 = i8 % 2;
            }
            C(context);
        }
        int i10 = f3081a + 107;
        f3082c = i10 % 128;
        int i11 = i10 % 2;
    }

    static void Z(Context context) {
        int i2 = 2 % 2;
        int i3 = f3082c + 65;
        f3081a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
            if (!V) {
                return;
            }
        } else if (!V) {
            return;
        }
        if (!C.isEmpty()) {
            int i5 = f3081a + 31;
            f3082c = i5 % 128;
            if (i5 % 2 == 0) {
                C.removeLast();
                int i6 = 97 / 0;
            } else {
                C.removeLast();
            }
        }
        V(context);
    }

    private static byte[] Z() throws Exception {
        int i2 = 2 % 2;
        byte[] bArrB = C1150r.B(new StringBuilder().append(I).append(Code).append(I("\ueedb᳧詝豤㒀峀嬜힝￨䥓긄⚨", 11 - View.combineMeasuredStates(0, 0)).intern()).toString());
        int i3 = f3082c + 59;
        f3081a = i3 % 128;
        if (i3 % 2 == 0) {
            return bArrB;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }
}
