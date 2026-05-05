package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzpx implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpk zzb;
    final /* synthetic */ zzqa zzc;

    zzpx(zzqa zzqaVar, String str, zzpk zzpkVar) {
        this.zzc = zzqaVar;
        this.zza = str;
        this.zzb = zzpkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
