package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zzll implements Runnable {
    private final /* synthetic */ zzlk zza;
    private final /* synthetic */ zzlk zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzlj zze;

    zzll(zzlj zzljVar, zzlk zzlkVar, zzlk zzlkVar2, long j2, boolean z2) {
        this.zza = zzlkVar;
        this.zzb = zzlkVar2;
        this.zzc = j2;
        this.zzd = z2;
        this.zze = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
