package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvq {
    private static zzvp zza = null;

    public static synchronized zzvf zza(zzuy zzuyVar) {
        if (zza == null) {
            zza = new zzvp(null);
        }
        return (zzvf) zza.get(zzuyVar);
    }

    public static synchronized zzvf zzb(String str) {
        return zza(zzuy.zzd("object-detection").zzd());
    }
}
