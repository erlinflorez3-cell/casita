package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.tapandpay.zzbj;

/* JADX INFO: loaded from: classes8.dex */
public final class zze extends zzbj {
    private static final ListenerHolder.Notifier zzb = new zzd();
    private final ListenerHolder zza;

    public zze(BaseImplementation.ResultHolder resultHolder, ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zza(Status status) {
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzb() {
        this.zza.notifyListener(zzb);
    }
}
