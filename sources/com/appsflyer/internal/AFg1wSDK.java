package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1uSDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1wSDK implements AFg1uSDK {
    private static IntentFilter AFAdRevenueData = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1uSDK
    public final AFg1uSDK.AFa1zSDK getCurrencyIso4217Code(Context context) {
        String str = null;
        float f2 = 0.0f;
        try {
            IntentFilter intentFilter = AFAdRevenueData;
            Class<?> cls = Class.forName(C1561oA.Kd("TbYhfa](^kkrdnu0Fsszl\u0001}", (short) (Od.Xd() ^ (-20713))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Wg.Zd("\u0017Eh\u000b1NUP1Cm% N}K\r`e\u000b;<e-87w\n5\\u\u0018N", (short) (FB.Xd() ^ 18504), (short) (FB.Xd() ^ 25989)));
            clsArr[1] = Class.forName(C1561oA.Xd("\u001f-$31,(r)66=/9@z\u0017=D6@G\u001a>BK=K", (short) (C1499aX.Xd() ^ (-14612))));
            Object[] objArr = {null, intentFilter};
            Method method = cls.getMethod(Wg.vd("cUVW``P\\K]Z[^jXd", (short) (C1607wl.Xd() ^ 6306)), clsArr);
            try {
                method.setAccessible(true);
                Intent intent = (Intent) method.invoke(context, objArr);
                if (intent != null) {
                    if (2 == intent.getIntExtra(Qg.kd("!!\r\u001f\u001f\u001c", (short) (FB.Xd() ^ 25708), (short) (FB.Xd() ^ 9146)), -1)) {
                        short sXd = (short) (ZN.Xd() ^ 26461);
                        short sXd2 = (short) (ZN.Xd() ^ 21060);
                        int[] iArr = new int["\u007fz\u0003srom".length()];
                        QB qb = new QB("\u007fz\u0003srom");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                            i2++;
                        }
                        int intExtra = intent.getIntExtra(new String(iArr, 0, i2), -1);
                        if (intExtra != 1) {
                            str = intExtra != 2 ? intExtra != 4 ? C1561oA.ud("\u0014\u0018\u000b\u0007\u0013", (short) (FB.Xd() ^ 7494)) : C1561oA.yd(">/7)/'43", (short) (OY.Xd() ^ 8063)) : C1561oA.Yd("-,\u001c", (short) (Od.Xd() ^ (-29082)));
                        } else {
                            short sXd3 = (short) (C1607wl.Xd() ^ 20275);
                            short sXd4 = (short) (C1607wl.Xd() ^ 10644);
                            int[] iArr2 = new int["BE".length()];
                            QB qb2 = new QB("BE");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                                i3++;
                            }
                            str = new String(iArr2, 0, i3);
                        }
                    } else {
                        short sXd5 = (short) (C1607wl.Xd() ^ 17397);
                        short sXd6 = (short) (C1607wl.Xd() ^ 32626);
                        int[] iArr3 = new int["?p".length()];
                        QB qb3 = new QB("?p");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                            i4++;
                        }
                        str = new String(iArr3, 0, i4);
                    }
                    int intExtra2 = intent.getIntExtra(ZO.xd("\u0002zPiP", (short) (C1580rY.Xd() ^ (-5259)), (short) (C1580rY.Xd() ^ (-16440))), -1);
                    int intExtra3 = intent.getIntExtra(C1626yg.Ud("dsE3\u007f", (short) (C1580rY.Xd() ^ (-31221)), (short) (C1580rY.Xd() ^ (-25559))), -1);
                    if (-1 != intExtra2 && -1 != intExtra3) {
                        f2 = (intExtra2 * 100.0f) / intExtra3;
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly(Ig.wd("gQr\bwDd\bTKZ.I<Ry5\u0018*H,\u0003E:%\u001d\b?\fi|4|_i2\u0010d\t", (short) (C1499aX.Xd() ^ (-11296))), th);
        }
        return new AFg1uSDK.AFa1zSDK(f2, str);
    }
}
