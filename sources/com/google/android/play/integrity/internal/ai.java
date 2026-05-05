package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f3477a = new s("PhoneskyVerificationUtils");

    public static int a(Context context) throws Throwable {
        Object obj;
        short sXd = (short) (C1607wl.Xd() ^ 7142);
        short sXd2 = (short) (C1607wl.Xd() ^ 1104);
        int[] iArr = new int[".d[31tp\u0005;\u0011\u0011`R&-0F<\\k\u001f;x".length()];
        QB qb = new QB(".d[31tp\u0005;\u0011\u0011`R&-0F<\\k\u001f;x");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("1Z?i&j\u0019b\u0010Q\u0003\u0011]irI<", (short) (OY.Xd() ^ 25497), (short) (OY.Xd() ^ 24695)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String strUd = C1626yg.Ud("8g7]\f\u001bOE\u001fdQ@\b\u0015XuQ[.", (short) (ZN.Xd() ^ 18837), (short) (ZN.Xd() ^ 3517));
                Class<?> cls = Class.forName(Ig.wd("+\n\f;f\u0014\u0005\u001c'@?i,99\u0012 \r#?\u0016ie]I5xHE\u0004oO2", (short) (OY.Xd() ^ 14242)));
                Class<?>[] clsArr = new Class[2];
                short sXd3 = (short) (OY.Xd() ^ 9822);
                int[] iArr2 = new int["Bh.?\u001f\u0012`h\b\u0001*c\f\u000b\u0012'".length()];
                QB qb2 = new QB("Bh.?\u001f\u0012`h\b\u0001*c\f\u000b\u0012'");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strUd, 64};
                Method method2 = cls.getMethod(C1561oA.Qd("FCQ,<=D9>;\u001eB9A", (short) (C1499aX.Xd() ^ (-3496))), clsArr);
                try {
                    method2.setAccessible(true);
                    PackageInfo packageInfo = (PackageInfo) method2.invoke(packageManager, objArr2);
                    if (packageInfo.applicationInfo == null) {
                        return 0;
                    }
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    String strZd = C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018[Y\u001b/_`][VUi_ffBhak", (short) (ZN.Xd() ^ 5763), (short) (ZN.Xd() ^ 25901));
                    String strOd = C1561oA.od("\u0013\u001b\r\r\u0016\u000e\f", (short) (C1607wl.Xd() ^ 8989));
                    try {
                        Class<?> cls2 = Class.forName(strZd);
                        Field field = 1 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    if (((Boolean) obj).booleanValue() && c(packageInfo.signatures)) {
                        return packageInfo.versionCode;
                    }
                    return 0;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean b(Context context) throws Throwable {
        Object obj;
        String strKd = C1561oA.Kd("r\u007f~@t\u0003y\t\u0007\u0002}H\u0012\u0002\f\u0003\t\u000f\t", (short) (C1607wl.Xd() ^ 2892));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("\u00163$1(\u001d\u0007Kz\u0006\u007f~\u007f\u0004\u0003<LqaaK_T", (short) (OY.Xd() ^ 11624), (short) (OY.Xd() ^ 8125))).getMethod(C1561oA.Xd("QP`=OR[RYXAVdX_^l", (short) (C1633zX.Xd() ^ (-15262))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (C1499aX.Xd() ^ (-24307));
                int[] iArr = new int["\f\u001a\r\u001c\u0016\u0011\tS\u0006\u0013\u000f\u0016\u0004\u000e\u0011K\u000b\tFiwz\u007fvyx]r|psr=".length()];
                QB qb = new QB("\f\u001a\r\u001c\u0016\u0011\tS\u0006\u0013\u000f\u0016\u0004\u000e\u0011K\u000b\tFiwz\u007fvyx]r|psr=");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Qg.kd("]SgQ\u001dZNZR\u0018<\\YOSK", (short) (Od.Xd() ^ (-17436)), (short) (Od.Xd() ^ (-12902))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strKd, 0};
                Method method2 = cls.getMethod(hg.Vd("\u001f\u001c*u$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019r\u0017\u000e\u0016", (short) (C1633zX.Xd() ^ (-3624)), (short) (C1633zX.Xd() ^ (-6869))), clsArr);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                    short sXd2 = (short) (C1580rY.Xd() ^ (-14500));
                    int[] iArr2 = new int["JVKXTMG\u0010DOMRBJO\bIE\u0005\u0017ED?;41C7<:\u00148/7".length()];
                    QB qb2 = new QB("JVKXTMG\u0010DOMRBJO\bIE\u0005\u0017ED?;41C7<:\u00148/7");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    String strYd = C1561oA.yd("\r\u0017\u000b\r\u0010\n\n", (short) (C1499aX.Xd() ^ (-20040)));
                    try {
                        Class<?> cls2 = Class.forName(str);
                        Field field = 1 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(C1561oA.Yd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (C1499aX.Xd() ^ (-10917)))).getMethod(Xg.qd("*)9\u0016(+4+21\u001a/=187E", (short) (C1633zX.Xd() ^ (-15634)), (short) (C1633zX.Xd() ^ (-1788))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                            short sXd3 = (short) (C1499aX.Xd() ^ (-8592));
                            short sXd4 = (short) (C1499aX.Xd() ^ (-19730));
                            int[] iArr3 = new int["\fg\"~d+l\u0007!{C\u0016mG\u0012\u001a\u0006OVI?\u0010`#\u0010^\u000bmc#o>p".length()];
                            QB qb3 = new QB("\fg\"~d+l\u0007!{C\u0016mG\u0012\u001a\u0006OVI?\u0010`#\u0010^\u000bmc#o>p");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                                i4++;
                            }
                            Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Class.forName(ZO.xd("\u007f\rOJ\u0017?;\u0004KPCU\u0016'K\u001d", (short) (FB.Xd() ^ 16389), (short) (FB.Xd() ^ 27476)));
                            clsArr2[1] = Integer.TYPE;
                            Object[] objArr4 = {strKd, 64};
                            Method method4 = cls3.getMethod(C1626yg.Ud("\u0007_{ng#\u0002X68ad\r\u007f", (short) (C1580rY.Xd() ^ (-21812)), (short) (C1580rY.Xd() ^ (-24572))), clsArr2);
                            try {
                                method4.setAccessible(true);
                                if (c(((PackageInfo) method4.invoke(packageManager2, objArr4)).signatures)) {
                                    return true;
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean c(Signature[] signatureArr) throws Throwable {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f3477a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String strA = ah.a(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                return true;
            }
        }
        return false;
    }
}
