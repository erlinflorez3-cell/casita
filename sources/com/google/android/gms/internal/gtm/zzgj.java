package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzgj implements Runnable {
    final /* synthetic */ zzgs zza;

    zzgj(zzgs zzgsVar) {
        this.zza = zzgsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgs zzgsVar = this.zza;
        zzgsVar.zzg.execute(new zzgq(zzgsVar, null));
    }
}
