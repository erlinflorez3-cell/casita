package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1xSDK implements AFj1vSDK {
    /* JADX WARN: Removed duplicated region for block: B:62:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.pm.ProviderInfo A_(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1xSDK.A_(android.content.Context):android.content.pm.ProviderInfo");
    }

    @Override // com.appsflyer.internal.AFj1vSDK
    public final boolean getCurrencyIso4217Code(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return A_(context) != null;
    }

    @Override // com.appsflyer.internal.AFj1vSDK
    public final boolean getRevenue(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ProviderInfo providerInfoA_ = A_(context);
        if (providerInfoA_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoA_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            String message = th.getMessage();
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message != null ? message : "", th, false, false, false, false, 96, null);
            return false;
        }
    }
}
