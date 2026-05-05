package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1lSDK {
    public static Boolean AFAdRevenueData = null;
    public static String getMonetizationNetwork = null;

    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.appsflyer.internal.AFb1jSDK getMediationNetwork(android.content.Context r6) {
        /*
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = com.appsflyer.internal.AFb1lSDK.getMonetizationNetwork
            r1 = 1
            if (r2 == 0) goto L57
            r4 = r1
        La:
            r3 = 0
            if (r4 == 0) goto L1c
        Ld:
            r0 = r3
        Le:
            if (r2 == 0) goto L59
            com.appsflyer.internal.AFb1jSDK r1 = new com.appsflyer.internal.AFb1jSDK
            r1.<init>(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.getMonetizationNetwork = r0
            return r1
        L1c:
            java.lang.Boolean r0 = com.appsflyer.internal.AFb1lSDK.AFAdRevenueData
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L32
        L26:
            java.lang.Boolean r0 = com.appsflyer.internal.AFb1lSDK.AFAdRevenueData
            if (r0 != 0) goto L4d
            java.lang.String r0 = "collectOAID"
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L4d
        L32:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L50
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r5.isEnableLog()     // Catch: java.lang.Throwable -> L50
            r1.setLogging(r0)     // Catch: java.lang.Throwable -> L50
            com.appsflyer.oaid.OaidClient$Info r0 = r1.fetch()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L4d
            java.lang.String r2 = r0.getId()     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r0 = r0.getLat()     // Catch: java.lang.Throwable -> L51
            goto Le
        L4d:
            r0 = r3
            r2 = r0
            goto Le
        L50:
            r2 = r3
        L51:
            java.lang.String r0 = "No OAID library"
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto Ld
        L57:
            r4 = 0
            goto La
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK.getMediationNetwork(android.content.Context):com.appsflyer.internal.AFb1jSDK");
    }

    private static boolean getMediationNetwork() {
        Boolean bool = AFAdRevenueData;
        return bool == null || bool.booleanValue();
    }

    public static AFb1jSDK l_(ContentResolver contentResolver) throws Throwable {
        String string;
        if (!getMediationNetwork() || contentResolver == null) {
            return null;
        }
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        short sXd = (short) (C1607wl.Xd() ^ 16202);
        int[] iArr = new int["w\u0003u\u000e\u0002\u007fopwq".length()];
        QB qb = new QB("w\u0003u\u000e\u0002\u007fopwq");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        if (appsFlyerProperties.getString(new String(iArr, 0, i2)) != null || !C1561oA.yd("S\u0001q\f}}", (short) (C1607wl.Xd() ^ 21076)).equals(Build.MANUFACTURER)) {
            return null;
        }
        short sXd2 = (short) (C1607wl.Xd() ^ 29334);
        int[] iArr2 = new int["\u001d\u001b \u001d)\u0015\u0018\u001c\u0018.-\u001d )(.(".length()];
        QB qb2 = new QB("\u001d\u001b \u001d)\u0015\u0018\u001c\u0018.-\u001d )(.(");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        Class<?> cls = Class.forName(Xg.qd("m{r\u0002\u007fzvA\u0005\b\u0006\u000e\u0002}\u007f\u000eJp\u0004\u0014\u0015\u000b\u0011\u000b\u0018Iy\r\f\u001f\u001d\u0011", (short) (FB.Xd() ^ 5999), (short) (FB.Xd() ^ 9631)));
        Class<?>[] clsArr = new Class[3];
        short sXd3 = (short) (Od.Xd() ^ (-5657));
        short sXd4 = (short) (Od.Xd() ^ (-7806));
        int[] iArr3 = new int["\u0011d/f:T%\u0019#p&t\u001bj\u0016(ca%e\u001cU\"9\u0011i\u0017\\\u001cM\u000f".length()];
        QB qb3 = new QB("\u0011d/f:T%\u0019#p&t\u001bj\u0016(ca%e\u001cU\"9\u0011i\u0017\\\u001cM\u000f");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i4));
        clsArr[1] = Class.forName(ZO.xd("6\nr;s6\u001c\u0018D|*|u9HD", (short) (C1633zX.Xd() ^ (-32292)), (short) (C1633zX.Xd() ^ (-16593))));
        clsArr[2] = Integer.TYPE;
        Object[] objArr = {contentResolver, str, 2};
        Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("EV5dS>", (short) (Od.Xd() ^ (-15689)), (short) (Od.Xd() ^ (-13116))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            short sXd5 = (short) (OY.Xd() ^ 7201);
            int[] iArr4 = new int["T2R\\AvC-t\r\b\u001eyz".length()];
            QB qb4 = new QB("T2R\\AvC-t\r\b\u001eyz");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
                i5++;
            }
            String str2 = new String(iArr4, 0, i5);
            if (iIntValue == 0) {
                return new AFb1jSDK(Settings.Secure.getString(contentResolver, str2), Boolean.FALSE);
            }
            if (iIntValue == 2) {
                return null;
            }
            try {
                string = Settings.Secure.getString(contentResolver, str2);
            } catch (Throwable th) {
                AFLogger.afErrorLog(EO.Od("f93\u0010\u0001X\u001b\"xA@+IJwxZf)T\u000f}+T\u0002j\u001bjw5Ei\rl\tCBlj\u001ad5\u0003yWi^*3\u00114ky8\u0014zr]\u0019\u0018.\u001b", (short) (C1499aX.Xd() ^ (-29591))), th);
                string = "";
            }
            return new AFb1jSDK(string, Boolean.TRUE);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
