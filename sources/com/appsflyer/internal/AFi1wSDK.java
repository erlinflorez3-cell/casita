package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1wSDK {
    public final String AFAdRevenueData;
    public final AFi1ySDK areAllFieldsValid;
    public final Throwable component1;
    public final String component2;
    public final long getCurrencyIso4217Code;
    public final int getMediationNetwork;
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1wSDK(String str, String str2, long j2, long j3, int i2, AFi1ySDK aFi1ySDK, String str3, Throwable th) {
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = j2;
        this.getRevenue = j3;
        this.getMediationNetwork = i2;
        this.areAllFieldsValid = aFi1ySDK;
        this.component2 = str3;
        this.component1 = th;
    }
}
