package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzr extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzr(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzd(Status status, Bundle bundle) {
        TaskUtil.trySetResultOrApiException(status.hasResolution() ? Status.RESULT_SUCCESS : status, status.getResolution(), this.zza);
    }
}
