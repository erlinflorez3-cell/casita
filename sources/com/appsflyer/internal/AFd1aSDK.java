package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1aSDK {
    public final long getMediationNetwork;

    public AFd1aSDK(long j2) {
        this.getMediationNetwork = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFd1aSDK) obj).getMediationNetwork;
    }

    public int hashCode() {
        long j2 = this.getMediationNetwork;
        return (int) (j2 ^ (j2 >>> 32));
    }
}
