package com.google.android.gms.internal.gtm;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
final class zzjb implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ zzjh zzb;

    zzjb(zzjh zzjhVar, Uri uri) {
        this.zzb = zzjhVar;
        this.zza = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzho.zzd("Preview requested to uri ".concat(String.valueOf(String.valueOf(this.zza))));
        synchronized (this.zzb.zzk) {
            zzjh zzjhVar = this.zzb;
            if (zzjhVar.zzn == 2) {
                zzho.zzd("Still initializing. Defer preview container loading.");
                this.zzb.zzo.add(this);
                return;
            }
            String str = (String) zzjhVar.zzp(null).first;
            if (str == null) {
                zzho.zze("Preview failed (no container found)");
                return;
            }
            if (!this.zzb.zzi.zzf(str, this.zza)) {
                zzho.zze("Cannot preview the app with the uri: " + String.valueOf(this.zza) + ". Launching current version instead.");
                return;
            }
            if (!this.zzb.zzp) {
                zzho.zzd("Deferring container loading for preview uri: " + String.valueOf(this.zza) + "(Tag Manager has not been initialized).");
                return;
            }
            zzho.zzc("Starting to load preview container: " + String.valueOf(this.zza));
            if (!this.zzb.zzf.zze()) {
                zzho.zze("Failed to reset TagManager service for preview");
                return;
            }
            this.zzb.zzp = false;
            this.zzb.zzn = 1;
            this.zzb.zzm(null);
        }
    }
}
