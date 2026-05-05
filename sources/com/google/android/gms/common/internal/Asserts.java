package com.google.android.gms.common.internal;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String str) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 13188);
        int[] iArr = new int["p0\u0016}\u0018m~]hJ\u0001\u0007>HUp0".length()];
        QB qb = new QB("p0\u0016}\u0018m~]hJ\u0001\u0007>HUp0");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(EO.Od("*R\u0014\u0011\\1\u0006\\*ji\u0001<", (short) (FB.Xd() ^ 23366)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)).getThread() == Thread.currentThread()) {
                return;
            }
            String strValueOf = String.valueOf(Thread.currentThread());
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Qd("[g\\ie^X!ad\u001e;]\\\\P\\", (short) (Od.Xd() ^ (-27350)))).getDeclaredMethod(C1593ug.zd(";:J$9BH'KLNDR", (short) (C1607wl.Xd() ^ 24047), (short) (C1607wl.Xd() ^ 28254)), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String strValueOf2 = String.valueOf(((Looper) declaredMethod2.invoke(null, objArr2)).getThread());
                StringBuilder sb = new StringBuilder(C1561oA.od("RVROV7JQU:MVHCE\u001a~ARNM?GLvJ=F835o", (short) (C1499aX.Xd() ^ (-12553))));
                sb.append(strValueOf);
                short sXd2 = (short) (FB.Xd() ^ 6906);
                int[] iArr2 = new int["\r7B\u0010?AG\u0014i^\\\u0018f[dj\u001drgrfcg$".length()];
                QB qb2 = new QB("\r7B\u0010?AG\u0014i^\\\u0018f[dj\u001drgrfcg$");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                    i3++;
                }
                sb.append(new String(iArr2, 0, i3));
                sb.append(strValueOf2);
                short sXd3 = (short) (ZN.Xd() ^ 7434);
                short sXd4 = (short) (ZN.Xd() ^ 3759);
                int[] iArr3 = new int["^".length()];
                QB qb3 = new QB("^");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                    i4++;
                }
                sb.append(new String(iArr3, 0, i4));
                sb.toString();
                C1561oA.Xd("!TUHVYY", (short) (FB.Xd() ^ 10976));
                throw new IllegalStateException(str);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void checkNotMainThread(String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("^l_npkc.di!@hig]\u007f", (short) (C1499aX.Xd() ^ (-8551)))).getDeclaredMethod(Qg.kd("XUc;NUY6XWWKW", (short) (C1580rY.Xd() ^ (-30395)), (short) (C1580rY.Xd() ^ (-31765))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)).getThread() != Thread.currentThread()) {
                return;
            }
            String strValueOf = String.valueOf(Thread.currentThread());
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(hg.Vd("GSHUQJD\rMP\n'IHH<H", (short) (C1580rY.Xd() ^ (-29415)), (short) (C1580rY.Xd() ^ (-31597)))).getDeclaredMethod(C1561oA.ud("*'5\r '+\b*))\u001d)", (short) (ZN.Xd() ^ 28650)), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String strValueOf2 = String.valueOf(((Looper) declaredMethod2.invoke(null, objArr2)).getThread());
                StringBuilder sb = new StringBuilder(C1561oA.yd("TZXWX<^d6KTZ9NYMbf=$`sqr^ho\u001ci^i]rv3", (short) (C1499aX.Xd() ^ (-21792))));
                sb.append(strValueOf);
                short sXd = (short) (FB.Xd() ^ 5880);
                int[] iArr = new int["a\f\u0017d:/-h7,5;mC8C748t".length()];
                QB qb = new QB("a\f\u0017d:/-h7,5;mC8C748t");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                sb.append(new String(iArr, 0, i2));
                sb.append(strValueOf2);
                sb.append(Xg.qd("k", (short) (FB.Xd() ^ 25045), (short) (FB.Xd() ^ 23032)));
                sb.toString();
                Jg.Wd("{5\"\u001blFa", (short) (Od.Xd() ^ (-31040)), (short) (Od.Xd() ^ (-22976)));
                throw new IllegalStateException(str);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void checkNotNull(@Nullable Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkNull(@Nullable Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    public static void checkNull(@Nullable Object obj, Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
