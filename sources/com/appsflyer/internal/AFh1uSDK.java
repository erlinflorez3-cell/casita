package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1uSDK implements AFg1bSDK {
    private final AFd1zSDK AFAdRevenueData;
    private AFg1hSDK getCurrencyIso4217Code;
    private AFh1zSDK getMediationNetwork;
    private AFh1wSDK getRevenue;

    public AFh1uSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFh1zSDK aFh1zSDK = this.getMediationNetwork;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void areAllFieldsValid() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK[] aFh1ySDKArr = new AFh1ySDK[1];
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFg1hSDK();
        }
        AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(aFg1hSDK);
        aFh1ySDKArr[0] = aFg1hSDK;
        aFLogger.registerClient(aFh1ySDKArr);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() {
        AFh1wSDK aFh1wSDK = this.getRevenue;
        if (aFh1wSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.getRevenue = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK[] aFh1ySDKArr = new AFh1ySDK[1];
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1zSDK(this.AFAdRevenueData);
        }
        AFh1zSDK aFh1zSDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFh1zSDK);
        aFh1ySDKArr[0] = aFh1zSDK;
        aFLogger.registerClient(aFh1ySDKArr);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        AFg1hSDK aFg1hSDK = this.getCurrencyIso4217Code;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK[] aFh1ySDKArr = new AFh1ySDK[1];
        if (this.getRevenue == null) {
            this.getRevenue = new AFh1wSDK(this.AFAdRevenueData);
        }
        AFh1wSDK aFh1wSDK = this.getRevenue;
        Intrinsics.checkNotNull(aFh1wSDK);
        aFh1ySDKArr[0] = aFh1wSDK;
        aFLogger.registerClient(aFh1ySDKArr);
    }
}
