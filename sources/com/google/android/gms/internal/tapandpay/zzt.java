package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzt extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzt(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzq(Status status, TokenStatus tokenStatus) {
        TaskUtil.trySetResultOrApiException(status, tokenStatus, this.zza);
    }
}
