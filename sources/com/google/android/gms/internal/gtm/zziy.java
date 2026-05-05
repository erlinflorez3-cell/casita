package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zziy implements Runnable {
    final /* synthetic */ zzjh zza;

    zziy(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg.execute(new zzix(this));
    }
}
