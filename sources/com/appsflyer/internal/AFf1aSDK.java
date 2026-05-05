package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1aSDK {
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;
    public final String getRevenue;

    public AFf1aSDK(String str, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = j2;
        this.getMediationNetwork = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFf1aSDK.getRevenue) && this.getMonetizationNetwork == aFf1aSDK.getMonetizationNetwork && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int iHashCode = ((this.getRevenue.hashCode() * 31) + Long.hashCode(this.getMonetizationNetwork)) * 31;
        boolean z2 = this.getMediationNetwork;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return iHashCode + r02;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.getMonetizationNetwork + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
