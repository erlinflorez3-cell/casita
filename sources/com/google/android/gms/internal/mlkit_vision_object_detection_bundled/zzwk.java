package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwk {
    private static zzwk zza = null;

    private zzwk() {
    }

    public static synchronized zzwk zza() {
        if (zza == null) {
            zza = new zzwk();
        }
        return zza;
    }
}
