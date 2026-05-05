package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzin zza;

    zzii(zzin zzinVar) {
        this.zza = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh = false;
        this.zza.zzd.zza();
    }
}
