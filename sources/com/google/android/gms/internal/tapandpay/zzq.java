package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzq extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzq(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzM(Status status, boolean z2) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z2), this.zza);
    }
}
