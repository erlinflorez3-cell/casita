package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxa {
    private static zzwz zza = null;

    public static synchronized zzwp zza(zzwh zzwhVar) {
        if (zza == null) {
            zza = new zzwz(null);
        }
        return (zzwp) zza.get(zzwhVar);
    }

    public static synchronized zzwp zzb(String str) {
        return zza(zzwh.zzd(str).zzd());
    }
}
