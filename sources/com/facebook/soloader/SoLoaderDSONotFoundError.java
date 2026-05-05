package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
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
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }

    public static SoLoaderDSONotFoundError create(String str, @Nullable Context context, SoSource[] soSourceArr) throws Throwable {
        Object obj;
        short sXd = (short) (C1499aX.Xd() ^ (-3962));
        short sXd2 = (short) (C1499aX.Xd() ^ (-28447));
        int[] iArr = new int[" wN\t|\u001di$\tJk)/rt9\u0004@^J4^\u00013^<\u0005".length()];
        QB qb = new QB(" wN\t|\u001di$\tJk)/rt9\u0004@^J4^\u00013^<\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(str);
        short sXd3 = (short) (C1580rY.Xd() ^ (-1580));
        short sXd4 = (short) (C1580rY.Xd() ^ (-18335));
        int[] iArr2 = new int["V^CGyjzbh\u000bYdGTCail|_\u0013\tE".length()];
        QB qb2 = new QB("V^CGyjzbh\u000bYdGTCail|_\u0013\tE");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        sbAppend.append(new String(iArr2, 0, i3));
        for (int i4 = 0; i4 < soSourceArr.length; i4++) {
            sbAppend.append(Ig.wd("4j\u001d\u0003\u007f?3\tSw\u007f\u0014", (short) (FB.Xd() ^ 2020))).append(i4).append(EO.Od("Wj", (short) (ZN.Xd() ^ 31573))).append(soSourceArr[i4].toString());
        }
        if (context != null) {
            short sXd5 = (short) (OY.Xd() ^ 25716);
            int[] iArr3 = new int["%#gy\f\u007f\fy3~zr/rv~E*".length()];
            QB qb3 = new QB("%#gy\f\u007f\fy3~zr/rv~E*");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i5 + xuXd3.CK(iKK3));
                i5++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr3, 0, i5));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("We\\kid`+annugqx3Ivv}o\u0004\u0001", (short) (C1607wl.Xd() ^ 13789), (short) (C1607wl.Xd() ^ 9836))).getMethod(C1561oA.od("a^l8fe`\\URdX][5YPX", (short) (ZN.Xd() ^ 22979)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strKd = C1561oA.Kd("\u001e,#20+'q(55<.8?y=;|\u0011AB?=87KAHH$JCM", (short) (C1499aX.Xd() ^ (-27676)));
                String strZd = Wg.Zd("N\u0015k4\u0001C>\u001bgKy\u001eh\u0003{H", (short) (ZN.Xd() ^ 17110), (short) (ZN.Xd() ^ 6006));
                try {
                    Class<?> cls = Class.forName(strKd);
                    Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                sbAppend2.append((String) obj).append(C1561oA.Xd("k", (short) (C1607wl.Xd() ^ 30541)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new SoLoaderDSONotFoundError(str, sbAppend.toString());
    }
}
