package com.google.android.gms.internal.gtm;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
final class zzjf extends zzhi {
    final /* synthetic */ zzjh zza;

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zze(boolean z2, String str) throws RemoteException {
        this.zza.zzg.execute(new zzjd(this, z2, str));
    }
}
