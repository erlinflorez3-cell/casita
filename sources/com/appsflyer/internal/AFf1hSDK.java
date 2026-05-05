package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1hSDK {
    public final AFc1qSDK AFAdRevenueData;
    public long getMonetizationNetwork;
    public long getRevenue;
    public AFi1vSDK getMediationNetwork = null;
    public AFi1vSDK getCurrencyIso4217Code = getRevenue();

    public AFf1hSDK(AFc1qSDK aFc1qSDK) {
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1qSDK.getMonetizationNetwork("af_rc_timestamp", 0L);
        this.getMonetizationNetwork = aFc1qSDK.getMonetizationNetwork("af_rc_max_age", 0L);
    }

    private AFi1vSDK getRevenue() throws Throwable {
        String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork(C1561oA.Kd("FLFZNWZ`RMR__X\\[", (short) (C1580rY.Xd() ^ (-3553))), (String) null);
        if (monetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, Wg.Zd("*\u0006T3]{\u001e@P\u0006!\u001bL`\u0001\u001f\u0003`\b)@U\u001c\u0004\u001csV\u0007 G[", (short) (C1580rY.Xd() ^ (-29130)), (short) (C1580rY.Xd() ^ (-23390))));
            return null;
        }
        try {
            Class<?> cls = Class.forName(C1561oA.Xd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^''\u001d!cx\u0019,\u001fpo", (short) (C1499aX.Xd() ^ (-6719))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1607wl.Xd() ^ 22382);
            int[] iArr = new int[",\"6 s1%1!f\u000b+0&*\"".length()];
            QB qb = new QB(",\"6 s1%1!f\u000b+0&*\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {monetizationNetwork, 2};
            short sXd2 = (short) (ZN.Xd() ^ 15269);
            short sXd3 = (short) (ZN.Xd() ^ 7211);
            int[] iArr2 = new int["&&#.\"\"".length()];
            QB qb2 = new QB("&&#.\"\"");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return new AFi1vSDK(new String((byte[]) declaredMethod.invoke(null, objArr), Charset.defaultCharset()));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
            short sXd4 = (short) (C1607wl.Xd() ^ 26482);
            short sXd5 = (short) (C1607wl.Xd() ^ 14782);
            int[] iArr3 = new int["x%$ \"N \u0012\r\u000f\u0013\u0017\u000fF\u0013\u0006\u0010\t\u0011\u0013\r\u0004\u0002<~\n\b~\u0001}\u000b\u0007t\u0007z\u007f}.s~zw)khimi/\"sepsfn`m\u0019^\\jX\\\\`X\u0010U`\\Y\u000b\\NUVZJ\u0004DIBIM".length()];
            QB qb3 = new QB("x%$ \"N \u0012\r\u000f\u0013\u0017\u000fF\u0013\u0006\u0010\t\u0011\u0013\r\u0004\u0002<~\n\b~\u0001}\u000b\u0007t\u0007z\u007f}.s~zw)khimi/\"sepsfn`m\u0019^\\jX\\\\`X\u0010U`\\Y\u000b\\NUVZJ\u0004DIBIM");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                i4++;
            }
            aFLogger.e(aFg1cSDK, new String(iArr3, 0, i4), e3, true);
            return null;
        }
    }
}
