package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class zzgs {
    private static UserManager zza = null;
    private static volatile boolean zzb = !zza();

    private zzgs() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgs.class) {
            if (zzb) {
                return true;
            }
            boolean zZzd = zzd(context);
            if (zZzd) {
                zzb = zZzd;
            }
            return zZzd;
        }
    }

    private static boolean zzd(Context context) throws Throwable {
        boolean z2;
        boolean z3 = true;
        int i2 = 1;
        while (true) {
            z2 = false;
            if (i2 > 2) {
                break;
            }
            if (zza == null) {
                Object[] objArr = {UserManager.class};
                Method method = Class.forName(Ig.wd("4p\u0015B_-\u0004\u0015{ghPr\u0002(K\b6l\u001bM\bY", (short) (OY.Xd() ^ 29489))).getMethod(C1561oA.Qd("74B E>>.5\u001a+7:,%&", (short) (Od.Xd() ^ (-6658))), Class.forName(EO.Od("_\u000e\u0011W{\u007f%1\u0002\u0018/6v~#", (short) (FB.Xd() ^ 11889))));
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
                short sXd = (short) (C1580rY.Xd() ^ (-31087));
                short sXd2 = (short) (C1580rY.Xd() ^ (-25011));
                int[] iArr = new int["*PZNM_.\\]cEe[_g".length()];
                QB qb = new QB("*PZNM_.\\]cEe[_g");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                    i3++;
                }
                new String(iArr, 0, i3);
                C1561oA.od("\u0001\u001b\"$\u001c\u001aT(\"Q\u0014\u0018\u0014\u0011\u0018K\u0014\u0010H\u001d\u001a\u000b\u0017C\f\u0015@\u0015\r\n\f~\u0006~|E", (short) (C1607wl.Xd() ^ 25897));
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
}
