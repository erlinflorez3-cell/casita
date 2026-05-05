package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFe1jSDK extends AFe1fSDK<String> {
    private final AFe1pSDK component2;
    private final AFc1qSDK copy;
    private final Map<String, Object> copydefault;
    private final AFc1oSDK equals;
    private final AFg1nSDK hashCode;
    private final AFf1fSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null);
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        Intrinsics.checkNotNullParameter(aFe1pSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFe1pSDK;
        this.copydefault = map;
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.equals = aFc1oSDKAFAdRevenueData;
        AFc1qSDK aFc1qSDKComponent4 = aFd1zSDK.component4();
        Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent4, "");
        this.copy = aFc1qSDKComponent4;
        AFg1nSDK aFg1nSDKComponent3 = aFd1zSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFg1nSDKComponent3, "");
        this.hashCode = aFg1nSDKComponent3;
        AFf1fSDK aFf1fSDKAfDebugLog = aFd1zSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFf1fSDKAfDebugLog, "");
        this.toString = aFf1fSDKAfDebugLog;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) throws Throwable {
        AFd1bSDK aFd1bSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.copydefault);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        String monetizationNetwork = getMonetizationNetwork(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        getMonetizationNetwork(mutableMap2, currencyIso4217Code);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAreAllFieldsValid = this.equals.areAllFieldsValid();
        String str2 = strAreAllFieldsValid;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put(ZO.xd("?D\u001bY\u0011,3\b\t2\u007f(7$", (short) (C1580rY.Xd() ^ (-17832)), (short) (C1580rY.Xd() ^ (-9939))), strAreAllFieldsValid);
        }
        AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(this.equals.getCurrencyIso4217Code.getMonetizationNetwork);
        String str3 = null;
        String str4 = mediationNetwork != null ? mediationNetwork.getRevenue : null;
        String str5 = str4;
        if (str5 != null && !StringsKt.isBlank(str5)) {
            linkedHashMap.put(C1626yg.Ud("-\u001ew+", (short) (C1499aX.Xd() ^ (-25355)), (short) (C1499aX.Xd() ^ (-23358))), str4);
        }
        Context context = this.equals.getCurrencyIso4217Code.getMonetizationNetwork;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("k)\u001d\u0003\u001ft\fdg?m\f-Bj<\f<q]\u000bDX", (short) (Od.Xd() ^ (-25181)))).getMethod(EO.Od("l\u0018\u001bH'r\u0003&YR0\u001f[Sva\u0005\"", (short) (FB.Xd() ^ 9366)), new Class[0]);
        try {
            method.setAccessible(true);
            AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_((ContentResolver) method.invoke(context, objArr));
            String str6 = aFb1jSDKL_ != null ? aFb1jSDKL_.getRevenue : null;
            String str7 = str6;
            if (str7 != null && !StringsKt.isBlank(str7)) {
                short sXd = (short) (OY.Xd() ^ 28922);
                int[] iArr = new int["U`Sk_]MNUO".length()];
                QB qb = new QB("U`Sk_]MNUO");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                linkedHashMap.put(new String(iArr, 0, i2), str6);
            }
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String strZd = C1593ug.zd("tv\t|wzj\ny|\u0006\u0005\u000b\u0005b\t\u0014\u0003\u0005\u0010\n\n", (short) (C1633zX.Xd() ^ (-1931)), (short) (C1633zX.Xd() ^ (-28098)));
            if (appsFlyerProperties.getBoolean(strZd, false)) {
                mutableMap2.put(strZd, C1561oA.Kd("\f\u000b\u000f\u007f", (short) (FB.Xd() ^ 15020)));
            } else {
                String monetizationNetwork2 = ((AFe1fSDK) this).component1.getMonetizationNetwork(this.copy);
                String str8 = monetizationNetwork2;
                if (str8 != null && !StringsKt.isBlank(str8)) {
                    linkedHashMap.put(C1561oA.od("hkbe", (short) (OY.Xd() ^ 22251)), monetizationNetwork2);
                }
            }
            String currencyIso4217Code2 = AFb1kSDK.getCurrencyIso4217Code(this.equals.getMediationNetwork);
            if (currencyIso4217Code2 == null) {
                currencyIso4217Code2 = "";
            }
            short sXd2 = (short) (Od.Xd() ^ (-11837));
            short sXd3 = (short) (Od.Xd() ^ (-24115));
            int[] iArr2 = new int["?\u0001lGF\\g=B;U.".length()];
            QB qb2 = new QB("?\u0001lGF\\g=B;U.");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            linkedHashMap.put(new String(iArr2, 0, i3), currencyIso4217Code2);
            linkedHashMap.put(C1561oA.Xd("chUm]kmdkk", (short) (C1580rY.Xd() ^ (-19374))), String.valueOf(Build.VERSION.SDK_INT));
            short sXd4 = (short) (C1580rY.Xd() ^ (-16821));
            int[] iArr3 = new int["\u001d\r\u0017\n\u001c\n\u001a\u001a\u001b \"".length()];
            QB qb3 = new QB("\u001d\r\u0017\n\u001c\n\u001a\u001a\u001b \"");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            linkedHashMap.put(new String(iArr3, 0, i4), Qg.kd("H?AF<C", (short) (ZN.Xd() ^ 32246), (short) (ZN.Xd() ^ 14563)));
            String str9 = monetizationNetwork;
            if (str9 != null && !StringsKt.isBlank(str9)) {
                linkedHashMap.put(hg.Vd(",\u001c\"\u0015\u0018#! \u0016\u0013#\u001d\u001f\u000b!\u000f\u001b\u001b\u0010\u0015\u0013", (short) (OY.Xd() ^ 18097), (short) (OY.Xd() ^ 19631)), monetizationNetwork);
            }
            this.hashCode.getMediationNetwork(linkedHashMap, this.component2);
            mutableMap2.put(C1561oA.ud("77G923,0,>*", (short) (FB.Xd() ^ 25765)), linkedHashMap);
            this.toString.getCurrencyIso4217Code(mutableMap2, this.component2);
            AFd1hSDK<String> revenue = getRevenue(mutableMap2, str, currencyIso4217Code);
            if (revenue != null && (aFd1bSDK = revenue.getMonetizationNetwork) != null) {
                str3 = aFd1bSDK.getMediationNetwork;
            }
            if (str3 != null) {
                JSONObject jSONObject = new JSONObject(mutableMap2);
                AFg1aSDK.getRevenue(toString() + C1561oA.yd("N3\u0003\u0004u\u007fo\u007f\u0006\n\u00029|x\u000bv>#", (short) (C1607wl.Xd() ^ 32365)), jSONObject);
                AFd1oSDK aFd1oSDK = this.component3;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                aFd1oSDK.getRevenue(str3, string);
            }
            return revenue;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    protected boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return true;
    }

    protected String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    protected String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    protected void getMonetizationNetwork(Map<String, Object> map, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(map, "");
        Context context = this.equals.getCurrencyIso4217Code.getMonetizationNetwork;
        Class<?> cls = Class.forName(C1561oA.Yd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (C1580rY.Xd() ^ (-8175))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-8283));
        short sXd2 = (short) (C1499aX.Xd() ^ (-19567));
        int[] iArr = new int["kjzWilulsr\\p}v".length()];
        QB qb = new QB("kjzWilulsr\\p}v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            map.put(Jg.Wd("\u0014@-1!I", (short) (OY.Xd() ^ 7789), (short) (OY.Xd() ^ 16765)), (String) method.invoke(context, objArr));
            String revenue = AFc1oSDK.getRevenue();
            if (revenue != null) {
                map.put(ZO.xd("_\u0003R?", (short) (C1607wl.Xd() ^ 20908), (short) (C1607wl.Xd() ^ 20436)), revenue);
            }
            map.put(C1626yg.Ud("}C#\u0011\u001f\u0003\u0002\u0004YQ$yr\t~}", (short) (ZN.Xd() ^ 28223), (short) (ZN.Xd() ^ 32337)), this.equals.n_().versionName);
            if (component3()) {
                map.put(Ig.wd(" {66q\u0017>q\u001e\r\u0013[\u00191.", (short) (ZN.Xd() ^ 29909)), Long.valueOf(this.hashCode.getCurrencyIso4217Code()));
            }
            if (str != null) {
                map.put(EO.Od("rI\u001a~\u001cEn\u000fR0+\u0006\blm\tK3\u000b", (short) (C1633zX.Xd() ^ (-8799))), str);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public abstract AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2);
}
