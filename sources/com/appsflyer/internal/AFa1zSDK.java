package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.dynatrace.android.agent.Global;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFa1zSDK implements Runnable {
    final String AFAdRevenueData;
    private final Map<String, String> areAllFieldsValid;
    private final String component1;
    private final String component3;
    private final WeakReference<Context> getCurrencyIso4217Code;
    private final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    AFa1zSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getCurrencyIso4217Code = new WeakReference<>(context);
        this.getMediationNetwork = str;
        this.component1 = str2;
        this.getMonetizationNetwork = str4;
        this.getRevenue = str5;
        this.AFAdRevenueData = str6;
        this.areAllFieldsValid = map;
        this.component3 = str3;
    }

    static void AFAdRevenueData(boolean z2, String str, String str2, String str3, String str4) {
        if (AFa1ySDK.getCurrencyIso4217Code != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(Global.BLANK).append(str2).append(Global.BLANK).append(str3).toString());
            if (z2) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1ySDK.getCurrencyIso4217Code.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1ySDK.getCurrencyIso4217Code;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFf1sSDK getCurrencyIso4217Code(Context context, AFh1fSDK aFh1fSDK) throws Throwable {
        AFa1ySDK.getRevenue().AFAdRevenueData(context);
        AFd1zSDK monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork();
        aFh1fSDK.AFAdRevenueData(monetizationNetwork.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
        AFf1sSDK aFf1sSDK = new AFf1sSDK(aFh1fSDK, monetizationNetwork);
        AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFf1sSDK));
        return aFf1sSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getCurrencyIso4217Code.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            short sXd = (short) (OY.Xd() ^ 8370);
            int[] iArr = new int["GM;FD?\nIDY".length()];
            QB qb = new QB("GM;FD?\nIDY");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            map.put(new String(iArr, 0, i2), this.component1);
            short sXd2 = (short) (ZN.Xd() ^ 24351);
            short sXd3 = (short) (ZN.Xd() ^ 25616);
            int[] iArr2 = new int["?c\ru\\|;N".length()];
            QB qb2 = new QB("?c\ru\\|;N");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            map.put(new String(iArr2, 0, i3), this.getMonetizationNetwork);
            map.put(C1561oA.Xd("\r\u0004\u0003\u000b~\u0013\u0015\u0013\u0007", (short) (ZN.Xd() ^ 2006)), this.component3);
            Object map2 = new HashMap(map);
            Object obj = this.areAllFieldsValid;
            String monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork().component4().getMonetizationNetwork(Wg.vd("PDFFTUIW", (short) (Od.Xd() ^ (-1902))), "");
            AFh1cSDK aFh1cSDK = new AFh1cSDK();
            aFh1cSDK.component1 = monetizationNetwork;
            AFa1ySDK revenue = AFa1ySDK.getRevenue();
            Map<String, Object> monetizationNetwork2 = revenue.getMonetizationNetwork(aFh1cSDK);
            monetizationNetwork2.put(Qg.kd("^_UNO", (short) (Od.Xd() ^ (-21794)), (short) (Od.Xd() ^ (-16438))), this.getRevenue);
            monetizationNetwork2.put(hg.Vd("\u0011\"\u001e\u001d\u000f\u0017\u000b ", (short) (Od.Xd() ^ (-27406)), (short) (Od.Xd() ^ (-17896))), this.AFAdRevenueData);
            monetizationNetwork2.put(C1561oA.ud("\u001c\u000e\u000b\f\u000f\u0015\u0018\u0002\u0006\u0002\u0014\u007f", (short) (OY.Xd() ^ 18875)), map2);
            if (obj != null) {
                monetizationNetwork2.put(C1561oA.yd("\b\u001a\u0015\u0012\b\u0005\u0015\u0016\u0018\u001d", (short) (Od.Xd() ^ (-23706))), obj);
            }
            monetizationNetwork2.putAll(revenue.getMonetizationNetwork().AFInAppEventType().getRevenue());
            aFh1cSDK.AFAdRevenueData((Map<String, ?>) monetizationNetwork2);
            getCurrencyIso4217Code(context, aFh1cSDK);
            map.put(C1561oA.Yd("&(:$1,A", (short) (C1499aX.Xd() ^ (-18160))), this.getMediationNetwork);
            short sXd4 = (short) (C1580rY.Xd() ^ (-30658));
            short sXd5 = (short) (C1580rY.Xd() ^ (-13278));
            int[] iArr3 = new int["v\u0007\bw\u0003~".length()];
            QB qb3 = new QB("v\u0007\bw\u0003~");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                i4++;
            }
            String str2 = new String(iArr3, 0, i4);
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("K\rtxgXE\u0005,/ [>>6el\u0010\u0001|_)\u0017", (short) (FB.Xd() ^ 8442), (short) (FB.Xd() ^ 20803))).getMethod(ZO.xd("m5Z!5e\u0002p'ai\u0016E\u001b", (short) (C1499aX.Xd() ^ (-20485)), (short) (C1499aX.Xd() ^ (-23991))), new Class[0]);
            try {
                method.setAccessible(true);
                map.put(str2, (String) method.invoke(context, objArr));
                short sXd6 = (short) (C1499aX.Xd() ^ (-1547));
                short sXd7 = (short) (C1499aX.Xd() ^ (-32158));
                int[] iArr4 = new int["<\u0015N".length()];
                QB qb4 = new QB("<\u0015N");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                    i5++;
                }
                map.put(new String(iArr4, 0, i5), AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                AFh1rSDK aFh1rSDK = AFa1ySDK.getRevenue().getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork.component3;
                AFb1jSDK aFb1jSDK = aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getCurrencyIso4217Code, aFh1rSDK.getRevenue) : null;
                String str3 = aFb1jSDK != null ? aFb1jSDK.getRevenue : null;
                if (str3 != null) {
                    short sXd8 = (short) (OY.Xd() ^ 9202);
                    int[] iArr5 = new int["R\u0007EVB\u0017\u0002:`L#\"".length()];
                    QB qb5 = new QB("R\u0007EVB\u0017\u0002:`L#\"");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd8 + i6)));
                        i6++;
                    }
                    map.put(new String(iArr5, 0, i6), str3);
                }
                AFh1bSDK aFh1bSDK = (AFh1bSDK) new AFh1bSDK().AFAdRevenueData(map);
                final AFf1sSDK currencyIso4217Code = getCurrencyIso4217Code(context, aFh1bSDK);
                aFh1bSDK.getCurrencyIso4217Code = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1zSDK.2
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public final void onError(int i7, String str4) {
                        ResponseNetwork responseNetwork;
                        if (i7 == 50 && (responseNetwork = ((AFe1fSDK) currencyIso4217Code).areAllFieldsValid) != null) {
                            str4 = responseNetwork.toString();
                        }
                        AFa1zSDK.AFAdRevenueData(false, AFa1zSDK.this.getMonetizationNetwork, AFa1zSDK.this.getRevenue, AFa1zSDK.this.AFAdRevenueData, str4);
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public final void onSuccess() {
                        try {
                            JSONObject jSONObject = new JSONObject((String) ((AFe1fSDK) currencyIso4217Code).areAllFieldsValid.getBody());
                            AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                            AFa1zSDK.AFAdRevenueData(jSONObject.optBoolean("result"), AFa1zSDK.this.getMonetizationNetwork, AFa1zSDK.this.getRevenue, AFa1zSDK.this.AFAdRevenueData, jSONObject.toString());
                        } catch (Exception e2) {
                            AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e2)), e2);
                            AFa1zSDK.AFAdRevenueData(false, AFa1zSDK.this.getMonetizationNetwork, AFa1zSDK.this.getRevenue, AFa1zSDK.this.AFAdRevenueData, e2.getMessage());
                        }
                    }
                };
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            if (AFa1ySDK.getCurrencyIso4217Code != null) {
                AFLogger.afErrorLog(EO.Od("\u0004pJ)b\u001fzP\u0017\u0002|Y\u0006#L$<\u001d\u0001P{Qt\u001c2gN+", (short) (ZN.Xd() ^ 21945)), th);
                AFAdRevenueData(false, this.getMonetizationNetwork, this.getRevenue, this.AFAdRevenueData, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
