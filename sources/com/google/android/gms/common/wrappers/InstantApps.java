package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class InstantApps {
    private static Context zza = null;
    private static Boolean zzb = null;

    public static synchronized boolean isInstantApp(Context context) {
        Boolean bool;
        Class<?> cls = Class.forName(C1561oA.ud("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (OY.Xd() ^ 22052)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-9997));
        int[] iArr = new int["'&6\u00044520\u001b\u001a.$++\u0001.\u001e%\u0017+(".length()];
        QB qb = new QB("'&6\u00044520\u001b\u001a.$++\u0001.\u001e%\u0017+(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Context context3 = zza;
            if (context3 != null && (bool = zzb) != null && context3 == context2) {
                return bool.booleanValue();
            }
            zzb = null;
            if (!PlatformVersion.isAtLeastO()) {
                try {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1626yg.Ud("2[p#\u001f{ek'q]p^\u0007\\\u001eg?z5\u0017E`", (short) (C1499aX.Xd() ^ (-9667)), (short) (C1499aX.Xd() ^ (-6084)))).getMethod(Ig.wd("<\r,\u0018W\u0010\u0004Iw0\u001eE\u0014!", (short) (C1633zX.Xd() ^ (-8320))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ((ClassLoader) method2.invoke(context, objArr2)).loadClass(EO.Od("\u0016X\u0007ex5\u000fy%P\u001dh \u001e.G}\u0005xz\u0018d7 \u0005f1\n_Pf\bqJ\nPD\u0013\u0006\u0010\u000f2\u0001,>SeC\u001bG&Sb\u0011\u007f\f\u0010#vh", (short) (C1580rY.Xd() ^ (-17321))));
                        zzb = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (ClassNotFoundException unused) {
                    zzb = false;
                }
                zza = context2;
                return zzb.booleanValue();
            }
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(C1561oA.Yd("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f", (short) (C1499aX.Xd() ^ (-8758)))).getMethod(Xg.qd("ut\u0005asv\u007fv}|ez\t|\u0004\u0003\u0011", (short) (C1607wl.Xd() ^ 15318), (short) (C1607wl.Xd() ^ 26296)), new Class[0]);
            try {
                method3.setAccessible(true);
                PackageManager packageManager = (PackageManager) method3.invoke(context2, objArr3);
                Class<?> cls2 = Class.forName(Jg.Wd("\u0015xlxsoh0cifjYdh !\u0018Vv\u0006\n\u0010\u0004\b\u007few\u0003w{wB", (short) (C1580rY.Xd() ^ (-32193)), (short) (C1580rY.Xd() ^ (-3037))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr4 = new Object[0];
                short sXd2 = (short) (OY.Xd() ^ 17800);
                short sXd3 = (short) (OY.Xd() ^ 14666);
                int[] iArr2 = new int["eFtx%[`\u0019`9'\u0010".length()];
                QB qb2 = new QB("eFtx%[`\u0019`9'\u0010");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                    i3++;
                }
                Method method4 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method4.setAccessible(true);
                    zzb = Boolean.valueOf(((Boolean) method4.invoke(packageManager, objArr4)).booleanValue());
                    zza = context2;
                    return zzb.booleanValue();
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
