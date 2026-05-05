package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzue {
    private static zzud zza = null;

    public static synchronized zztt zza(zztm zztmVar) {
        if (zza == null) {
            zza = new zzud(null);
        }
        return (zztt) zza.get(zztmVar);
    }

    public static synchronized zztt zzb(String str) {
        return zza(zztm.zzd("object-detection-custom").zzd());
    }
}
