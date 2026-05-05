package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1dSDK extends AFe1fSDK<String> {
    private final String component2;
    private final AFc1oSDK equals;
    private final AFk1vSDK toString;

    public AFe1dSDK(AFd1zSDK aFd1zSDK, String str, AFk1vSDK aFk1vSDK) {
        super(AFe1pSDK.IMPRESSIONS, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.component2 = str;
        this.toString = aFk1vSDK;
        this.equals = aFd1zSDK.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) {
        AFd1nSDK aFd1nSDK = ((AFe1fSDK) this).component4;
        String strAreAllFieldsValid = this.equals.areAllFieldsValid();
        return (AFd1hSDK) AFd1nSDK.getMediationNetwork(new Object[]{aFd1nSDK, AFk1wSDK.getMonetizationNetwork(strAreAllFieldsValid) ? this.component2 : Uri.parse(this.component2).buildUpon().appendQueryParameter("advertising_id", strAreAllFieldsValid).build().toString()}, 1535622589, -1535622589, System.identityHashCode(aFd1nSDK));
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() throws Exception {
        super.getCurrencyIso4217Code();
        AFe1wSDK<Result> aFe1wSDK = ((AFe1fSDK) this).areAllFieldsValid;
        if (aFe1wSDK != 0) {
            int statusCode = aFe1wSDK.getStatusCode();
            if (statusCode == 200) {
                short sXd = (short) (C1633zX.Xd() ^ (-14561));
                int[] iArr = new int["4b^a`\f[\\XUVZNSQ\u0002JMOPBONCHFJuHI656CB\bl".length()];
                QB qb = new QB("4b^a`\f[\\XUVZNSQ\u0002JMOPBONCHFJuHI656CB\bl");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                AFLogger.afInfoLog(new StringBuilder(new String(iArr, 0, i2)).append(this.component2).toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                short sXd2 = (short) (FB.Xd() ^ 10440);
                int[] iArr2 = new int["?<FEwKEt".length()];
                QB qb2 = new QB("?<FEwKEt");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                AFLogger.afInfoLog(new StringBuilder(new String(iArr2, 0, i3)).append(this.component2).append(C1593ug.zd("\u0019`\\eicc:!", (short) (FB.Xd() ^ 15618), (short) (FB.Xd() ^ 891))).append(statusCode).toString());
                return;
            }
            AFLogger.afInfoLog(new StringBuilder(C1561oA.od("#QMPOzJKGDEI=B@pB426>0-=164d78%$%21v[", (short) (FB.Xd() ^ 2417))).append(this.component2).toString(), false);
            String revenue = aFe1wSDK.getRevenue(C1561oA.Kd("$H=<PFMM", (short) (FB.Xd() ^ 25569)));
            AFk1vSDK aFk1vSDK = this.toString;
            if (aFk1vSDK == null || revenue == null) {
                return;
            }
            aFk1vSDK.getCurrencyIso4217Code = revenue;
            AFk1vSDK aFk1vSDK2 = this.toString;
            Context context = aFk1vSDK2.getMonetizationNetwork.get();
            if (context != null) {
                try {
                    if (aFk1vSDK2.getCurrencyIso4217Code != null) {
                        Intent flags = new Intent(Wg.Zd("|N\u0010T\u001dOQVX\u0019kS(dgU^+f&kr\u0016Q\u0005a", (short) (C1633zX.Xd() ^ (-9963)), (short) (C1633zX.Xd() ^ (-21971))), Uri.parse(aFk1vSDK2.getCurrencyIso4217Code)).setFlags(268435456);
                        CX.ud();
                        Class<?> cls = Class.forName(C1561oA.Xd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30", (short) (Od.Xd() ^ (-23148))));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(Wg.vd("!/\"13.&p\u001b($+!+.hx\u001f\"\u0014\")", (short) (C1633zX.Xd() ^ (-10514))));
                        Object[] objArr = {flags};
                        Method method = cls.getMethod(Qg.kd("\u001a\u001a\u0006\u0016\u0017b\u0004\u0014\b\u0014\u0006\u0010\u0014", (short) (C1607wl.Xd() ^ 19423), (short) (C1607wl.Xd() ^ 3578)), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(context, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (Exception e3) {
                    AFLogger.afErrorLog(hg.Vd("@Zac[Y\u0014ga\u0011__S[\fN\\X[Z\u0006UVROPTHMK{PLE\u0004v:D9Fq #n6.B0i+:6=8)5a*.22\u001e('\u001f\u001dv", (short) (C1580rY.Xd() ^ (-18612)), (short) (C1580rY.Xd() ^ (-29394))).concat(String.valueOf(e3)), e3);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
