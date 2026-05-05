package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
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

/* JADX INFO: loaded from: classes8.dex */
public final class DeviceProperties {
    private static Boolean zza = null;
    private static Boolean zzb = null;
    private static Boolean zzc = null;
    private static Boolean zzd = null;
    private static Boolean zze = null;
    private static Boolean zzf = null;
    private static Boolean zzg = null;
    private static Boolean zzh = null;
    private static Boolean zzi = null;
    private static Boolean zzj = null;
    private static Boolean zzk = null;
    private static Boolean zzl = null;
    private static Boolean zzm = null;
    private static Boolean zzn = null;

    private DeviceProperties() {
    }

    public static boolean isAuto(Context context) throws Throwable {
        Class<?> cls = Class.forName(ZO.xd("9z\u001cyQ\u001fLsa\u0010\u000e\"k~&ZK{oX,_d", (short) (C1580rY.Xd() ^ (-10095)), (short) (C1580rY.Xd() ^ (-17954))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 9072);
        short sXd2 = (short) (FB.Xd() ^ 21410);
        int[] iArr = new int[".qxm}0@\u0017uK|O\u0001\u001c\u0018![".length()];
        QB qb = new QB(".qxm}0@\u0017uK|O\u0001\u001c\u0018![");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (zzj == null) {
                boolean z2 = false;
                if (PlatformVersion.isAtLeastO()) {
                    Object[] objArr2 = {Ig.wd("Y\u0017|m7\u0004\u001d|X~\u0014&nX\u007f\u000e\nd\u001f0fd0Ff\u0010-~\u0018<gs", (short) (C1607wl.Xd() ^ 19682))};
                    Method method2 = Class.forName(EO.Od("r*N\u0004\u0018_>WL\u001c\u0015=Y`\u0003]M`H\u0003S\r?9>\u0018^K.\u0010yZG", (short) (Od.Xd() ^ (-7039)))).getMethod(C1593ug.zd("ZTgHojl^gAa^rtrf", (short) (C1580rY.Xd() ^ (-27365)), (short) (C1580rY.Xd() ^ (-3805))), Class.forName(C1561oA.Qd("{q\u0006o;xlxp6Zzwmqi", (short) (Od.Xd() ^ (-3372)))));
                    try {
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                            z2 = true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                zzj = Boolean.valueOf(z2);
            }
            return zzj.booleanValue();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static boolean isBstar(Context context) throws Throwable {
        if (zzm == null) {
            boolean z2 = false;
            if (PlatformVersion.isAtLeastR()) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.od("}\n~\f\b\u0001zCw\u0003\u0001\u0006u}\u0003;Ozx}m\u007fz", (short) (C1607wl.Xd() ^ 10400))).getMethod(C1561oA.Kd("LK[8JMVMTS<Q_SZYg", (short) (Od.Xd() ^ (-15663))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    String strZd = Wg.Zd("ZNgD\u0019t\u0011(I%I\u0019AK1I_}#A\\e\u0019)} w\"~\u0010\u001e\u0003x(920\u001b*?_~RzG`", (short) (FB.Xd() ^ 7702), (short) (FB.Xd() ^ 20756));
                    short sXd = (short) (C1633zX.Xd() ^ (-4773));
                    int[] iArr = new int["`netrmi4jww~pz\u0002<\u007f}?btw\u0001w~}f{\n}\u0005\u0004\u0012".length()];
                    QB qb = new QB("`netrmi4jww~pz\u0002<\u007f}?btw\u0001w~}f{\n}\u0005\u0004\u0012");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[1];
                    short sXd2 = (short) (OY.Xd() ^ 19006);
                    int[] iArr2 = new int["\u000e\u0004\u001c\u0006U\u0013\u000b\u0017\u0003Hp\u0011\u0012\b\u0010\b".length()];
                    QB qb2 = new QB("\u000e\u0004\u001c\u0006U\u0013\u000b\u0017\u0003Hp\u0011\u0012\b\u0010\b");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr2 = {strZd};
                    Method method2 = cls.getMethod(Qg.kd("~v\bf\f\u0005\u0005t{Sql~~zl", (short) (FB.Xd() ^ 23769), (short) (FB.Xd() ^ 4703)), clsArr);
                    try {
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                            z2 = true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            zzm = Boolean.valueOf(z2);
        }
        return zzm.booleanValue();
    }

    public static boolean isFoldable(Context context) throws Throwable {
        if (zzc == null) {
            boolean z2 = false;
            if (PlatformVersion.isAtLeastR()) {
                Class<?> cls = Class.forName(hg.Vd("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (FB.Xd() ^ 13970), (short) (FB.Xd() ^ 30156)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-6751));
                int[] iArr = new int["~{\ndtu|qvsZmykpmy".length()];
                QB qb = new QB("~{\ndtu|qvsZmykpmy");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    short sXd2 = (short) (FB.Xd() ^ 1341);
                    int[] iArr2 = new int["ESFUOJB\rD>L?O:H<\"hWac``\u001dTVXRMHGUkqg".length()];
                    QB qb2 = new QB("ESFUOJB\rD>L?O:H<\"hWac``\u001dTVXRMHGUkqg");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                        i3++;
                    }
                    Object[] objArr2 = {new String(iArr2, 0, i3)};
                    Method method2 = Class.forName(C1561oA.Yd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'a%#d\b\u001a\u001d&\u001d$#\f!/#*)7", (short) (C1607wl.Xd() ^ 6319))).getMethod(Jg.Wd("_\u0002_\\F\u000eJ\tTJ5.\u0005Sk,", (short) (OY.Xd() ^ 15844), (short) (OY.Xd() ^ 27026)), Class.forName(Xg.qd("kcye3rhvp8^\u0001\u007fw}w", (short) (C1633zX.Xd() ^ (-22873)), (short) (C1633zX.Xd() ^ (-10878)))));
                    try {
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                            z2 = true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            zzc = Boolean.valueOf(z2);
        }
        return zzc.booleanValue();
    }

    public static boolean isLatchsky(Context context) throws Throwable {
        if (zzg == null) {
            Class<?> cls = Class.forName(ZO.xd("\u0015\b]e/?\u001880AV2G`3\u0005#e8\u001396\u000e", (short) (FB.Xd() ^ 1390), (short) (FB.Xd() ^ 10676)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 8097);
            short sXd2 = (short) (OY.Xd() ^ 23679);
            int[] iArr = new int["wb\u001f \u0006&aO[+GA]|9#v".length()];
            QB qb = new QB("wb\u001f \u0006&aO[+GA]|9#v");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {Ig.wd("g\u001cH<\u001d\u0001P(v\u0013U\u000fMQG&WhYV\u000fF34/Y\u0004\u0015\\[/\u0004iQ\u0018E1\fzi|U0", (short) (ZN.Xd() ^ 26661))};
                Method method2 = Class.forName(EO.Od("O,0^<bAs\u0017pkU\u0012\u001b\u000b(8\u0015\u001fk<\u0004wsY\u001dd6#eQ3\"", (short) (C1607wl.Xd() ^ 22054))).getMethod(C1593ug.zd("\"\u001c/\u0010724&/\t)&:<:.", (short) (C1633zX.Xd() ^ (-9499)), (short) (C1633zX.Xd() ^ (-19976))), Class.forName(C1561oA.Qd("PFZD\u0010MAME\u000b/OLBF>", (short) (ZN.Xd() ^ 20516))));
                try {
                    method2.setAccessible(true);
                    boolean z2 = false;
                    if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                        Object[] objArr3 = {C1561oA.od("1;y298/3+r7(47)\"#0", (short) (C1499aX.Xd() ^ (-8734)))};
                        Method method3 = Class.forName(C1561oA.Kd("[i`omhd/erryku|7zx:]or{ryxav\u0005x\u007f~\r", (short) (C1607wl.Xd() ^ 22973))).getMethod(C1561oA.Xd("^XkLsnpbkEebvxvj", (short) (C1499aX.Xd() ^ (-26955))), Class.forName(Wg.Zd(")wb/S[6\u0013q\u0012|\u0002U&\u000fI", (short) (Od.Xd() ^ (-18641)), (short) (Od.Xd() ^ (-11122)))));
                        try {
                            method3.setAccessible(true);
                            if (((Boolean) method3.invoke(packageManager, objArr3)).booleanValue()) {
                                z2 = true;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    zzg = Boolean.valueOf(z2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        return zzg.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPhone(android.content.Context r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isPhone(android.content.Context):boolean");
    }

    public static boolean isSevenInchTablet(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 29533);
        int[] iArr = new int["kwlyunh1epnsckp)=hfk[mh".length()];
        QB qb = new QB("kwlyunh1epnsckp)=hfk[mh");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("`_oNbqnusehw", (short) (Od.Xd() ^ (-13402)), (short) (Od.Xd() ^ (-14113))), new Class[0]);
        try {
            method.setAccessible(true);
            return zzc((Resources) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isSidewinder(Context context) {
        return zza(context);
    }

    public static boolean isTablet(Context context) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("codqmf`)]hfk[ch!5`^cSe`", (short) (FB.Xd() ^ 12300)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-5546));
        int[] iArr = new int["ihxWkzw~|nq\u0001".length()];
        QB qb = new QB("ihxWkzw~|nq\u0001");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return isTablet((Resources) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isTablet(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }

    public static boolean isTv(Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-2332));
        short sXd2 = (short) (C1580rY.Xd() ^ (-27701));
        int[] iArr = new int["\"s5\u0007?}DUF\u0017a+W!ro@1{IuM\u0015".length()];
        QB qb = new QB("\"s5\u0007?}DUF\u0017a+W!ro@1{IuM\u0015");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1607wl.Xd() ^ 30395);
        int[] iArr2 = new int["\u0015\u0014$\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0005\u001a(\u001c#\"0".length()];
        QB qb2 = new QB("\u0015\u0014$\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0005\u001a(\u001c#\"0");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (zzk == null) {
                Object[] objArr2 = {Wg.vd("erq3mvwpvp:n|s\u0003\u0001{wB\n\r", (short) (C1499aX.Xd() ^ (-30765)))};
                Method method2 = Class.forName(Qg.kd("_k`mib\\%YdbgW_d\u001d^Z\u001a;KLSHMJ1DPBGDP", (short) (C1633zX.Xd() ^ (-22599)), (short) (C1633zX.Xd() ^ (-28647)))).getMethod(C1561oA.ud("rj{Z\u007fxxhoGe`rrn`", (short) (C1499aX.Xd() ^ (-5533))), Class.forName(hg.Vd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (Od.Xd() ^ (-18782)), (short) (Od.Xd() ^ (-17946)))));
                try {
                    method2.setAccessible(true);
                    boolean z2 = true;
                    if (!((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                        String strYd = C1561oA.yd("$0)6.'%m#\u001b/ .\u0017+\u001d`&.$\u0014[%\u0015\u0017\u000f#\u0015\u001a\u000f\u0018\u0016", (short) (ZN.Xd() ^ 15437));
                        Class<?> cls2 = Class.forName(C1561oA.Yd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o31r\u0016(+4+21\u001a/=187E", (short) (FB.Xd() ^ 24876)));
                        Class<?>[] clsArr2 = {Class.forName(Xg.qd("~v\rxF\u0006{\n\u0004Kq\u0014\u0013\u000b\u0011\u000b", (short) (C1607wl.Xd() ^ 16328), (short) (C1607wl.Xd() ^ 12373)))};
                        Object[] objArr3 = {strYd};
                        short sXd4 = (short) (C1633zX.Xd() ^ (-19368));
                        short sXd5 = (short) (C1633zX.Xd() ^ (-22172));
                        int[] iArr3 = new int["[XWcv\u0015A_UQ\\\u0004DkSr".length()];
                        QB qb3 = new QB("[XWcv\u0015A_UQ\\\u0004DkSr");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                            i4++;
                        }
                        Method method3 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                        try {
                            method3.setAccessible(true);
                            if (!((Boolean) method3.invoke(packageManager, objArr3)).booleanValue()) {
                                String strXd = ZO.xd("\u0001\"q\\\fmM\nV%bSb_<IIkZ1E$?\u001aE", (short) (Od.Xd() ^ (-31185)), (short) (Od.Xd() ^ (-22371)));
                                short sXd6 = (short) (C1580rY.Xd() ^ (-16734));
                                short sXd7 = (short) (C1580rY.Xd() ^ (-1915));
                                int[] iArr4 = new int["\u0004-\u0012p1^\n\u0017\u001d\u000fF~22E>5b2yOL0(\u0002S\u0003X\u0004\u0003\u001a/\f".length()];
                                QB qb4 = new QB("\u0004-\u0012p1^\n\u0017\u001d\u000fF~22E>5b2yOL0(\u0002S\u0003X\u0004\u0003\u001a/\f");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                                Class<?>[] clsArr3 = {Class.forName(Ig.wd("r9\u001ec^Wb&G|\u001e'YX;\u0019", (short) (ZN.Xd() ^ 20436)))};
                                Object[] objArr4 = {strXd};
                                short sXd8 = (short) (FB.Xd() ^ 16502);
                                int[] iArr5 = new int[" JN\n\u0001HYy-u\u0013p3.3\u0004".length()];
                                QB qb5 = new QB(" JN\n\u0001HYy-u\u0013p3.3\u0004");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + i6)) + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                Method method4 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
                                try {
                                    method4.setAccessible(true);
                                    if (!((Boolean) method4.invoke(packageManager, objArr4)).booleanValue()) {
                                        Object[] objArr5 = {C1561oA.Qd("{\u0007\u0004C{\u0003\u0002x|t<nzo|xqk4kidvvrd,>I<NBW<NE9E;6>23", (short) (OY.Xd() ^ 18590))};
                                        Method method5 = Class.forName(C1593ug.zd("R`Wfd_[&\\iipbls.qo1TfiripoXm{ovu\u0004", (short) (Od.Xd() ^ (-25146)), (short) (Od.Xd() ^ (-31492)))).getMethod(C1561oA.Kd("E?R3ZUWIR,LI]_]Q", (short) (C1633zX.Xd() ^ (-20721))), Class.forName(C1561oA.od("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jn\u000f\f\u0002\u0006}", (short) (FB.Xd() ^ 32312))));
                                        try {
                                            method5.setAccessible(true);
                                            if (!((Boolean) method5.invoke(packageManager, objArr5)).booleanValue()) {
                                                z2 = false;
                                            }
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    }
                    zzk = Boolean.valueOf(z2);
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            return zzk.booleanValue();
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    public static boolean isUserBuild() {
        int i2 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    public static boolean isWearable(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("x\u0007t\u001a\u0007YL\u0015bg63<FDTa\u001f\u0016rco\u0004", (short) (OY.Xd() ^ 700), (short) (OY.Xd() ^ 23432))).getMethod(C1561oA.Xd("\"!1\u000e #,#*)\u0012'5)0/=", (short) (ZN.Xd() ^ 1459)), new Class[0]);
        try {
            method.setAccessible(true);
            return zzd((PackageManager) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    public static boolean isXr(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("-9.;?82z7B@E=EJ\u0003\u001fJHMEWR", (short) (C1499aX.Xd() ^ (-15472)))).getMethod(Qg.kd("QN\\7GHODIF-@L>C@L", (short) (FB.Xd() ^ 6656), (short) (FB.Xd() ^ 7831)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (zzn == null) {
                Object[] objArr2 = {hg.Vd("NZO\\XQK\u0014XSIVXAQC\u000bTM\bBED;GG<H6", (short) (FB.Xd() ^ 3772), (short) (FB.Xd() ^ 7143))};
                Method method2 = Class.forName(C1561oA.ud("s\u007ft\u0002}vp9mxv{ksx1rn.O_`g\\a^EXdV[Xd", (short) (OY.Xd() ^ 15214))).getMethod(C1561oA.Yd("WQdElgi[d>^[oqoc", (short) (C1580rY.Xd() ^ (-16957))), Class.forName(C1561oA.yd("B8L6\nG;GG\r1QVLPH", (short) (C1607wl.Xd() ^ 8745))));
                try {
                    method2.setAccessible(true);
                    zzn = Boolean.valueOf(((Boolean) method2.invoke(packageManager, objArr2)).booleanValue());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return zzn.booleanValue();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static boolean zza(Context context) throws Throwable {
        if (zzf == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e", (short) (OY.Xd() ^ 17671), (short) (OY.Xd() ^ 31306))).getMethod(Jg.Wd("P\t8?n\u0014$5i\u000b\u00131Ul\":V", (short) (C1633zX.Xd() ^ (-32130)), (short) (C1633zX.Xd() ^ (-15256))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {ZO.xd("Z\nTC\u001c\u0014fG\u001a", (short) (OY.Xd() ^ 1331), (short) (OY.Xd() ^ 27245))};
                Method method2 = Class.forName(C1626yg.Ud("%\u00018(x(%<-4)\u00152MCH_`\u001c\b\u0016\u000f]C`8\u0004O\u0011\u0004(J7", (short) (C1607wl.Xd() ^ 11126), (short) (C1607wl.Xd() ^ 5794))).getMethod(EO.Od("M @<]-HJ\u001aDg;\u001a#\u0002P", (short) (OY.Xd() ^ 12182)), Class.forName(Ig.wd("L\u00147I\u0006\u007fHMou\u0015@\u0010\u0015\u0002\u001c", (short) (C1633zX.Xd() ^ (-10738)))));
                try {
                    method2.setAccessible(true);
                    zzf = Boolean.valueOf(((Boolean) method2.invoke(packageManager, objArr2)).booleanValue());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return zzf.booleanValue();
    }

    public static boolean zzb(Context context) throws Throwable {
        if (zzh == null) {
            short sXd = (short) (C1499aX.Xd() ^ (-10849));
            int[] iArr = new int["4@5B>71y.97<,49q\u00061/4$61".length()];
            QB qb = new QB("4@5B>71y.97<,49q\u00061/4$61");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("\u001b\u001a*\u0007\u0019\u001c%\u001c#\"\u000b .\")(6", (short) (OY.Xd() ^ 27997), (short) (OY.Xd() ^ 5788)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {C1561oA.od("\u000b\u0017\f\u0019\u0015\u000e\bP\n\u0002\u0012\u0003\u0015}\u000e\u007fG\r\u0011\u0007zB|\u0002\u0006", (short) (C1580rY.Xd() ^ (-15187)))};
                Method method2 = Class.forName(C1561oA.Kd("^lcrpkg2huu|nx\u007f:}{=`ru~u|{dy\b{\u0003\u0002\u0010", (short) (OY.Xd() ^ 18645))).getMethod(C1561oA.Xd("4.A\"IDF8A\u001b;8LNL@", (short) (ZN.Xd() ^ 24439)), Class.forName(Wg.Zd(" \u0010n3ai\u0019\u0010Zjy\u0015SD\u0013U", (short) (C1580rY.Xd() ^ (-8110)), (short) (C1580rY.Xd() ^ (-6764)))));
                try {
                    method2.setAccessible(true);
                    boolean z2 = true;
                    if (!((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(Wg.vd("eqfswpj3ozx}u}\u0003;7b`e]oj", (short) (C1607wl.Xd() ^ PhotoshopDirectory.TAG_INDEXED_COLOR_TABLE_COUNT))).getMethod(Qg.kd("\\YgBRSZOTQ8KWINKW", (short) (C1607wl.Xd() ^ 31360), (short) (C1607wl.Xd() ^ 33)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                            Object[] objArr4 = {hg.Vd("nzo|xqk4meufxaqc+ptj^&\\cWYWVVT", (short) (OY.Xd() ^ 13443), (short) (OY.Xd() ^ 1927))};
                            Method method4 = Class.forName(C1561oA.ud("y\u0006z\b\u0004|v?s~|\u0002qy~7xt4UefmbgdK^j\\a^j", (short) (OY.Xd() ^ 17953))).getMethod(C1561oA.Yd("\u001a\u0014'\b/*,\u001e'\u0001!\u001e242&", (short) (C1607wl.Xd() ^ 16487)), Class.forName(C1561oA.yd("=5K7\u0005D:HB\n0RQIOI", (short) (C1607wl.Xd() ^ 23322))));
                            try {
                                method4.setAccessible(true);
                                if (!((Boolean) method4.invoke(packageManager2, objArr4)).booleanValue()) {
                                    z2 = false;
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    zzh = Boolean.valueOf(z2);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return zzh.booleanValue();
    }

    public static boolean zzc(Resources resources) {
        boolean z2 = false;
        if (resources == null) {
            return false;
        }
        if (zzd == null) {
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.screenLayout;
            if ((i2 + 15) - (i2 | 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z2 = true;
            }
            zzd = Boolean.valueOf(z2);
        }
        return zzd.booleanValue();
    }

    public static boolean zzd(PackageManager packageManager) throws Throwable {
        if (zze == null) {
            Object[] objArr = {Xg.qd("%3*972.x4.@3G2D8\u0002IOG=\u0007Q<P@F", (short) (C1607wl.Xd() ^ 22126), (short) (C1607wl.Xd() ^ 24376))};
            Method method = Class.forName(Jg.Wd("*\u001141{T|58\u0002o##I>)y5#4\u0013s)\u000ea\u001ds5Q]R\u001e\u0019", (short) (C1607wl.Xd() ^ 2764), (short) (C1607wl.Xd() ^ 7732))).getMethod(C1626yg.Ud("\u00183WfWH'[_5?%\u0014ho}", (short) (FB.Xd() ^ 29762), (short) (FB.Xd() ^ 1263)), Class.forName(ZO.xd("ozo\u0019c\u0002$t5\u0010_\u0006>j\u001a6", (short) (C1607wl.Xd() ^ 29210), (short) (C1607wl.Xd() ^ 27179))));
            try {
                method.setAccessible(true);
                zze = Boolean.valueOf(((Boolean) method.invoke(packageManager, objArr)).booleanValue());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return zze.booleanValue();
    }
}
