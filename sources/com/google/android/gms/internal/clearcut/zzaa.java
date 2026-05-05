package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class zzaa {
    private static volatile UserManager zzdc = null;
    private static volatile boolean zzdd = !zzf();

    private zzaa() {
    }

    public static boolean zze(Context context) {
        return zzf() && !zzf(context);
    }

    private static boolean zzf() {
        return true;
    }

    private static boolean zzf(Context context) {
        boolean zIsUserUnlocked = zzdd;
        if (!zIsUserUnlocked) {
            UserManager userManager = zzdc;
            if (userManager == null) {
                synchronized (zzaa.class) {
                    userManager = zzdc;
                    if (userManager == null) {
                        Class<?> cls = Class.forName(C1561oA.Kd("&4+:83/y0==D6@G\u0002\u0018EEL>RO", (short) (C1499aX.Xd() ^ (-11035))));
                        Class<?>[] clsArr = new Class[1];
                        short sXd = (short) (C1580rY.Xd() ^ (-15551));
                        short sXd2 = (short) (C1580rY.Xd() ^ (-15716));
                        int[] iArr = new int["x\u0001&_=Ho\nS(\u000e$+\n\u001b".length()];
                        QB qb = new QB("x\u0001&_=Ho\nS(\u000e$+\n\u001b");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                            i2++;
                        }
                        clsArr[0] = Class.forName(new String(iArr, 0, i2));
                        Object[] objArr = {UserManager.class};
                        short sXd3 = (short) (C1607wl.Xd() ^ 30952);
                        int[] iArr2 = new int["qp\u0001`\b\u0003\u0005v\u007ffy\b\r\u0001{~".length()];
                        QB qb2 = new QB("qp\u0001`\b\u0003\u0005v\u007ffy\b\r\u0001{~");
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
                            userManager = (UserManager) method.invoke(context, objArr);
                            zzdc = userManager;
                            if (userManager == null) {
                                zzdd = true;
                                return true;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                }
            }
            zIsUserUnlocked = userManager.isUserUnlocked();
            zzdd = zIsUserUnlocked;
            if (zIsUserUnlocked) {
                zzdc = null;
            }
        }
        return zIsUserUnlocked;
    }
}
