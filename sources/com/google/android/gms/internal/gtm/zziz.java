package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zziz implements Runnable {
    final /* synthetic */ zzja zza;

    zziz(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzho.zzd("App's UI deactivated. Dispatching hits.");
        this.zza.zza.zzf.zza();
    }
}
