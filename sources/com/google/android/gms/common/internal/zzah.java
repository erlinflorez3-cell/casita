package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzah {
    private static final Object zza = new Object();
    private static boolean zzb = false;
    private static String zzc = null;
    private static int zzd = 0;

    public static int zza(Context context) {
        zzc(context);
        return zzd;
    }

    public static String zzb(Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(Context context) {
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d", (short) (Od.Xd() ^ (-4840)))).getMethod(C1561oA.yd("\f\u000b\u001bw\n\r\u0016\r\u0014\u0013|\u0011\u001e\u0017", (short) (ZN.Xd() ^ 26496)), new Class[0]);
            try {
                method.setAccessible(true);
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo((String) method.invoke(context, objArr), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    zzc = bundle.getString(C1561oA.Yd("/<;|7@A:@:\u00048HI\bD@", (short) (C1607wl.Xd() ^ 6748)));
                    zzd = bundle.getInt(Xg.qd("O\\[\u001dW`aZ`Z$Xf]ljea,fmt0yiwypww", (short) (Od.Xd() ^ (-5712)), (short) (Od.Xd() ^ (-7588))));
                } catch (PackageManager.NameNotFoundException e2) {
                    short sXd = (short) (C1607wl.Xd() ^ 10354);
                    short sXd2 = (short) (C1607wl.Xd() ^ 31121);
                    int[] iArr = new int["mm\u00159\u0014\u001bt9(\t}n%\f\u0007JU@\u0004".length()];
                    QB qb = new QB("mm\u00159\u0014\u001bt9(\t}n%\f\u0007JU@\u0004");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                        i2++;
                    }
                    new String(iArr, 0, i2);
                    short sXd3 = (short) (C1580rY.Xd() ^ (-30316));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-30302));
                    int[] iArr2 = new int["\u0010dTF\u000b\u0005]Vw\u001aza\u0006zf\u0017[)\"\u00024> (%".length()];
                    QB qb2 = new QB("\u0010dTF\u000b\u0005]Vw\u001aza\u0006zf\u0017[)\"\u00024> (%");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                        i3++;
                    }
                    new String(iArr2, 0, i3);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
