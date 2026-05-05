package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzgi implements Runnable {
    final /* synthetic */ zzgs zza;

    zzgi(zzgs zzgsVar) {
        this.zza = zzgsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzm == 2) {
            this.zza.zzl.zze();
        }
    }
}
