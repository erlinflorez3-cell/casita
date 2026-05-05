package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzbf extends zzbn {
    final /* synthetic */ TaskCompletionSource zza;

    zzbf(zzbi zzbiVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbn, com.google.android.gms.internal.tapandpay.zzm
    public final void zzb(Status status, String str) {
        TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}
