package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public class zzas {
    private static UserManager zza = null;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzas() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }

    private static boolean zzb(Context context) throws Throwable {
        boolean z2;
        boolean z3 = true;
        int i2 = 1;
        while (true) {
            z2 = false;
            if (i2 > 2) {
                break;
            }
            if (zza == null) {
                Class<?> cls = Class.forName(Xg.qd("$2)861-w.;;B4>E\u007f\u0016CCJ<PM", (short) (ZN.Xd() ^ 23222), (short) (ZN.Xd() ^ 20893)));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (-17012));
                short sXd2 = (short) (C1499aX.Xd() ^ (-22704));
                int[] iArr = new int["\u0016sDlxt%o d5\u001cP [".length()];
                QB qb = new QB("\u0016sDlxt%o d5\u001cP [");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                Object[] objArr = {UserManager.class};
                Method method = cls.getMethod(ZO.xd("P.\u000fr\u0019BST/EaA\u0004XFZ", (short) (Od.Xd() ^ (-2442)), (short) (Od.Xd() ^ (-11689))), clsArr);
                try {
                    method.setAccessible(true);
                    zza = (UserManager) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z3 = false;
                }
            } catch (NullPointerException e3) {
                short sXd3 = (short) (FB.Xd() ^ 14191);
                short sXd4 = (short) (FB.Xd() ^ 24254);
                int[] iArr2 = new int["(\u0016\u0014\u007ft &R\u001b\u0001i\"-9$".length()];
                QB qb2 = new QB("(\u0016\u0014\u007ft &R\u001b\u0001i\"-9$");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd2.CK(iKK2));
                    i4++;
                }
                new String(iArr2, 0, i4);
                short sXd5 = (short) (C1580rY.Xd() ^ (-27204));
                int[] iArr3 = new int["\"f\u001bSBlJL\u0001'bO}w\u001a.\u001f4#~6\u0002z&=1=^/\u001d\u0002W9\u001b1,".length()];
                QB qb3 = new QB("\"f\u001bSBlJL\u0001'bO}w\u001a.\u001f4#~6\u0002z&=1=^/\u001d\u0002W9\u001b1,");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
                    i5++;
                }
                new String(iArr3, 0, i5);
                zza = null;
                i2++;
            }
        }
        z2 = z3;
        if (z2) {
            zza = null;
        }
        return z2;
    }

    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzas.class) {
            if (zzb) {
                return true;
            }
            boolean zZzb = zzb(context);
            if (zZzb) {
                zzb = zZzb;
            }
            return zZzb;
        }
    }
}
