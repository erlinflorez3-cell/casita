package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayj {
    private static zzayi zza = null;

    public static synchronized zzaxz zza(zzaxu zzaxuVar) {
        if (zza == null) {
            zza = new zzayi(null);
        }
        return (zzaxz) zza.get(zzaxuVar);
    }

    public static synchronized zzaxz zzb(String str) {
        return zza(zzaxu.zzd(str).zzd());
    }
}
