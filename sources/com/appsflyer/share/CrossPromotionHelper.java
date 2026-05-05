package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFk1uSDK;
import com.appsflyer.internal.AFk1vSDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class CrossPromotionHelper {
    private static String AFAdRevenueData = "https://%simpression.%s";

    private static void AFAdRevenueData(String str, Context context, AFk1vSDK aFk1vSDK) throws Throwable {
        AFa1ySDK revenue = AFa1ySDK.getRevenue();
        revenue.AFAdRevenueData(context);
        AFd1zSDK monetizationNetwork = revenue.getMonetizationNetwork();
        AFe1dSDK aFe1dSDK = new AFe1dSDK(monetizationNetwork, str, aFk1vSDK);
        AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFe1dSDK));
    }

    private static LinkGenerator getMonetizationNetwork(Context context, String str, String str2, Map<String, String> map, String str3) throws Throwable {
        LinkGenerator linkGenerator = new LinkGenerator(Jg.Wd("\u0010?u&r\u001e_\f\u0005C\u007f*d\u0014Wy\t4", (short) (C1580rY.Xd() ^ (-18202)), (short) (C1580rY.Xd() ^ (-26128))));
        linkGenerator.AFAdRevenueData = str3;
        linkGenerator.getMonetizationNetwork = str;
        String strXd = ZO.xd("+X\u00025oN2~N", (short) (C1580rY.Xd() ^ (-16447)), (short) (C1580rY.Xd() ^ (-19233)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("J:\u0012\u0014m,\u0011aFcNl!ZPhB\u0015\u0006\u0004X\u001fP", (short) (C1580rY.Xd() ^ (-11849)), (short) (C1580rY.Xd() ^ (-10477)))).getMethod(Ig.wd("\b@\u007fy\u0001U7{\"\u0013\u007fn/'", (short) (C1607wl.Xd() ^ 6082)), new Class[0]);
        try {
            method.setAccessible(true);
            linkGenerator.addParameter(strXd, (String) method.invoke(context, objArr));
            if (str2 != null) {
                linkGenerator.setCampaign(str2);
            }
            if (map != null) {
                linkGenerator.addParameters(map);
            }
            return linkGenerator;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2) throws Throwable {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) throws Throwable {
        LinkGenerator monetizationNetwork = getMonetizationNetwork(context, str, str2, map, String.format(AFk1uSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFAdRevenueData(monetizationNetwork.generateLink(), context, new AFk1vSDK(context));
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) throws Throwable {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) throws Throwable {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFAdRevenueData(getMonetizationNetwork(context, str, str2, map, String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName())).generateLink(), context, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setUrl(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r3.hashCode()
            r0 = 96801(0x17a21, float:1.35647E-40)
            r1 = 1
            if (r2 == r0) goto L46
            r0 = 120623625(0x7309209, float:1.3283684E-34)
            if (r2 == r0) goto L3b
        L2f:
            r0 = -1
        L30:
            if (r0 == 0) goto L38
            if (r0 == r1) goto L35
            goto L8
        L35:
            com.appsflyer.share.CrossPromotionHelper.AFAdRevenueData = r4
            goto L8
        L38:
            com.appsflyer.internal.AFk1uSDK.getCurrencyIso4217Code = r4
            goto L8
        L3b:
            java.lang.String r0 = "impression"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2f
            r0 = r1
            goto L30
        L46:
            java.lang.String r0 = "app"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2f
            r0 = 0
            goto L30
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.setUrl(java.util.Map):void");
    }
}
