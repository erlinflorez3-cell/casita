package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzo extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzo(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzN(Status status, TokenInfo[] tokenInfoArr) {
        TaskUtil.trySetResultOrApiException(status, zzby.zzg(tokenInfoArr), this.zza);
    }
}
