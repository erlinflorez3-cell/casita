package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.zzfi;

/* JADX INFO: loaded from: classes8.dex */
final class zza implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ zzfi.zzo zzb;
    private final /* synthetic */ DynamiteClearcutLogger zzc;

    zza(DynamiteClearcutLogger dynamiteClearcutLogger, int i2, zzfi.zzo zzoVar) {
        this.zzc = dynamiteClearcutLogger;
        this.zza = i2;
        this.zzb = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc.zza(this.zza, this.zzb);
    }
}
