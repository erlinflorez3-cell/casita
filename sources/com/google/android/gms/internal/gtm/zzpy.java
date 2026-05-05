package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzpy implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzpk zzc;
    final /* synthetic */ zzqa zzd;

    zzpy(zzqa zzqaVar, String str, String str2, zzpk zzpkVar) {
        this.zzd = zzqaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzd(this.zza, this.zzb, this.zzc);
    }
}
