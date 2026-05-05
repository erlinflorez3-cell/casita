package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static void setComponentEnabled(Context context, Class<?> klazz, boolean enabled) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 32094);
        int[] iArr = new int["=E77@86".length()];
        QB qb = new QB("=E77@86");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strZd = C1593ug.zd("v|\bvx\u0004}}", (short) (C1633zX.Xd() ^ (-32244)), (short) (C1633zX.Xd() ^ (-18150)));
        try {
            Class<?> cls = Class.forName(C1561oA.od("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (OY.Xd() ^ 22512)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (ZN.Xd() ^ 28090);
            int[] iArr2 = new int["KJZ7ILULSR;P^RYXf".length()];
            QB qb2 = new QB("KJZ7ILULSR;P^RYXf");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                ComponentName componentName = new ComponentName(context, klazz.getName());
                int i4 = enabled ? 1 : 2;
                short sXd3 = (short) (C1580rY.Xd() ^ (-31841));
                short sXd4 = (short) (C1580rY.Xd() ^ (-17777));
                int[] iArr3 = new int["\u0011k*\u0004I\u000br\u0004\u0004[#t\u000e_15?)1\u001cxC\u00197\u0006O\u007f[U\u0012`*\u007f".length()];
                QB qb3 = new QB("\u0011k*\u0004I\u000br\u0004\u0004[#t\u000e_15?)1\u001cxC\u00197\u0006O\u007f[U\u0012`*\u007f");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(((i5 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                    i5++;
                }
                Class<?> cls2 = Class.forName(new String(iArr3, 0, i5));
                Class<?>[] clsArr2 = new Class[3];
                clsArr2[0] = Class.forName(C1561oA.Xd("Yg^mkfb-cppwisz5Kxw{{{s}\u0005_s\u0001y", (short) (C1607wl.Xd() ^ 25294)));
                clsArr2[1] = Integer.TYPE;
                clsArr2[2] = Integer.TYPE;
                Object[] objArr2 = {componentName, Integer.valueOf(i4), 1};
                Method method2 = cls2.getMethod(Wg.vd("ylxHyxxx|tz\u0002W\u0002qsb\\XH_olblf", (short) (ZN.Xd() ^ 27453)), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr2);
                    Logger.get().debug(TAG, klazz.getName() + Qg.kd("x", (short) (C1580rY.Xd() ^ (-21322)), (short) (C1580rY.Xd() ^ (-7476))) + (enabled ? str : strZd));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder sbAppend = new StringBuilder().append(klazz.getName()).append(hg.Vd("MX]SJ\u0005RRV\u0001BD}", (short) (ZN.Xd() ^ 20294), (short) (ZN.Xd() ^ 13333)));
            if (!enabled) {
                str = strZd;
            }
            logger.debug(str2, sbAppend.append(str).toString(), e4);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> klazz) {
        return isComponentExplicitlyEnabled(context, klazz.getName());
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String className) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("EdM#/po\rGV-2[wQ\u007fX,+hlSD", (short) (Od.Xd() ^ (-3892)), (short) (Od.Xd() ^ (-12741))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-29778));
        short sXd2 = (short) (C1580rY.Xd() ^ (-29607));
        int[] iArr = new int["xO-u| *c!EnU\u0019|\u001f\u0001n".length()];
        QB qb = new QB("xO-u| *c!EnU\u0019|\u001f\u0001n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            ComponentName componentName = new ComponentName(context, className);
            Class<?> cls2 = Class.forName(C1626yg.Ud("5~b\u0006(\u0004X\u001cL\u0007D@\r35!M6$Tp-MMa/L\u000el\u0006X*M", (short) (Od.Xd() ^ (-15440)), (short) (Od.Xd() ^ (-27322))));
            Class<?>[] clsArr2 = {Class.forName(Ig.wd("\u001e\u0007H0s\u0011:1\b\u0016\u0015~!\u001eFG4\\ \\\u001dqPO+j]9\u0005", (short) (ZN.Xd() ^ 5009)))};
            Object[] objArr2 = {componentName};
            short sXd3 = (short) (OY.Xd() ^ 26250);
            int[] iArr2 = new int["f\u0016\u0013F3u)0\u0006=H,GfmI\u007fz2-u)\u000f\bsL".length()];
            QB qb2 = new QB("f\u0016\u0013F3u)0\u0006=H,GfmI\u007fz2-u)\u000f\bsL");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method2.setAccessible(true);
                return ((Integer) method2.invoke(packageManager, objArr2)).intValue() == 1;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
