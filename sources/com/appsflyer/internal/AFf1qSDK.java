package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1qSDK extends AFe1mSDK<AFf1pSDK> {
    public AFi1wSDK areAllFieldsValid;
    private final AFc1oSDK component1;
    public final AFf1mSDK component2;
    public AFf1pSDK component3;
    private final AFf1nSDK component4;
    private final AFd1nSDK copy;
    private final AFf1jSDK copydefault;
    private final String equals;
    private final AFf1hSDK hashCode;
    private final AFf1eSDK toString;

    public AFf1qSDK(AFf1nSDK aFf1nSDK, AFc1oSDK aFc1oSDK, AFf1eSDK aFf1eSDK, AFf1hSDK aFf1hSDK, AFd1nSDK aFd1nSDK, AFf1jSDK aFf1jSDK, String str, AFf1mSDK aFf1mSDK) {
        super(AFe1pSDK.RC_CDN, new AFe1pSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component4 = aFf1nSDK;
        this.component1 = aFc1oSDK;
        this.toString = aFf1eSDK;
        this.hashCode = aFf1hSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFf1jSDK;
        this.equals = str;
        this.component2 = aFf1mSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.appsflyer.internal.AFf1pSDK component3() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1qSDK.component3():com.appsflyer.internal.AFf1pSDK");
    }

    private void getCurrencyIso4217Code(String str, long j2, AFi1ySDK aFi1ySDK, String str2, AFe1wSDK<AFi1vSDK> aFe1wSDK) {
        String str3 = str2;
        AFi1vSDK body = aFe1wSDK != null ? aFe1wSDK.getBody() : null;
        if (str3 == null) {
            str3 = null;
        }
        getMonetizationNetwork(str, j2, aFe1wSDK, body, aFi1ySDK, str3, null);
    }

    private void getMonetizationNetwork(String str, long j2, AFe1wSDK<?> aFe1wSDK, AFi1vSDK aFi1vSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j3;
        int statusCode;
        Throwable cause;
        if (aFe1wSDK != null) {
            j3 = aFe1wSDK.getMonetizationNetwork.getMediationNetwork;
            statusCode = aFe1wSDK.getStatusCode();
        } else {
            j3 = 0;
            statusCode = 0;
        }
        if (th instanceof HttpException) {
            cause = th.getCause();
            j3 = ((HttpException) th).getMetrics().getMediationNetwork;
        } else {
            cause = th;
        }
        this.areAllFieldsValid = new AFi1wSDK(aFi1vSDK != null ? aFi1vSDK.AFAdRevenueData : null, str, j3, System.currentTimeMillis() - j2, statusCode, aFi1ySDK, str2, cause);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        try {
            AFf1pSDK aFf1pSDKComponent3 = component3();
            this.component3 = aFf1pSDKComponent3;
            return aFf1pSDKComponent3 == AFf1pSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedException e3) {
            e = e3;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }
}
