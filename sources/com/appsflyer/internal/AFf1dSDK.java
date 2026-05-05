package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1dSDK {

    interface AFa1tSDK {
        void getMonetizationNetwork(String str, String str2);

        void getRevenue(String str, Exception exc);
    }

    public final boolean getRevenue(long j2, Context context, final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j2, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1dSDK.3
                public final void onLvlFailure(Exception exc) {
                    aFa1tSDK.getRevenue("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.getMonetizationNetwork(str, str2);
                    } else if (str2 == null) {
                        aFa1tSDK.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
