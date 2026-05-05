package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final class zzw extends zzbj {
    final /* synthetic */ TaskCompletionSource zza;

    zzw(zzbd zzbdVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzW(Status status, ReachableDeviceWalletInfo[] reachableDeviceWalletInfoArr) {
        if (reachableDeviceWalletInfoArr == null) {
            reachableDeviceWalletInfoArr = new ReachableDeviceWalletInfo[0];
        }
        TaskUtil.trySetResultOrApiException(status, zzby.zzg(reachableDeviceWalletInfoArr), this.zza);
    }
}
