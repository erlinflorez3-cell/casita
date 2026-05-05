package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends zzac {
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int i2) {
        this.zza = baseGmsClient;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i2, IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i2, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i2, Bundle bundle) {
        new Exception();
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i2, IBinder iBinder, zzk zzkVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzkVar);
        BaseGmsClient.zzj(baseGmsClient, zzkVar);
        onPostInitComplete(i2, iBinder, zzkVar.zza);
    }
}
