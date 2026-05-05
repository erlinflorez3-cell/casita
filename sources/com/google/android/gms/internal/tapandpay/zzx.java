package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzx extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzx(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzQ(Status status, PushProvisionSessionContext pushProvisionSessionContext) {
        TaskUtil.trySetResultOrApiException(status, pushProvisionSessionContext, this.zza);
    }
}
