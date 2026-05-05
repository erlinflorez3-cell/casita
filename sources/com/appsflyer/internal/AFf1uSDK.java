package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1uSDK extends AFe1fSDK<String> {
    private final AFh1gSDK component2;

    public AFf1uSDK(AFh1gSDK aFh1gSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1gSDK.hashCode != null ? aFh1gSDK.hashCode : AFe1pSDK.CACHED_EVENT, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, new StringBuilder().append(aFh1gSDK.component3).append(Global.HYPHEN).append(getRevenue(aFh1gSDK)).toString(), aFh1gSDK.component3);
        this.component2 = aFh1gSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        return (this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1) && (this.getRevenue == AFe1pSDK.CONVERSION || this.getRevenue == AFe1pSDK.ATTR);
    }

    private boolean equals() {
        AFh1gSDK aFh1gSDK = this.component2;
        return (aFh1gSDK.hashCode != null ? aFh1gSDK.hashCode : AFe1pSDK.CACHED_EVENT) == AFe1pSDK.ARS_VALIDATE && ((AFe1fSDK) this).areAllFieldsValid != null && ((AFe1fSDK) this).areAllFieldsValid.getStatusCode() == 424;
    }

    private static String getRevenue(AFh1gSDK aFh1gSDK) {
        try {
            return new URL(aFh1gSDK.component2).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) throws Throwable {
        Object[] objArr = {this.component2.getMonetizationNetwork(), 2};
        Method declaredMethod = Class.forName(C1561oA.Qd("+7,95.(p75)+k~\u001d.\u001fnk", (short) (Od.Xd() ^ (-31579)))).getDeclaredMethod(C1593ug.zd("$.$1')\u00195\u001a<;393", (short) (ZN.Xd() ^ 27440), (short) (ZN.Xd() ^ 11223)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            AFLogger.afInfoLog(C1561oA.od("~{|\u0001|z5xt\u0007rJ/", (short) (C1607wl.Xd() ^ 16593)).concat(String.valueOf(str2)));
            this.component3.getRevenue(this.component2.component2, str2);
            return ((AFe1fSDK) this).component4.getRevenue(this.component2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return super.getMonetizationNetwork() || equals() || copy();
    }
}
