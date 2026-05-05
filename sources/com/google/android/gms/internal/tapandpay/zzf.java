package com.google.android.gms.internal.tapandpay;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf {
    public static ApiMetadata zza(Context context) {
        zzd.zza();
        return ApiMetadata.fromComplianceOptions(ComplianceOptions.newBuilder(context).build());
    }
}
