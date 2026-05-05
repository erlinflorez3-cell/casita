package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
final class zzit extends com.google.android.gms.tagmanager.zzck {
    final /* synthetic */ zzjh zza;

    zzit(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcl
    public final void zze(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        this.zza.zzg.execute(new zzis(this, str2, bundle, String.valueOf(str).concat("+gtm"), j2, str));
    }
}
