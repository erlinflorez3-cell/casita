package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
public final class zzuf {
    private static zzuf zza = null;

    private zzuf() {
    }

    public static synchronized zzuf zza() {
        if (zza == null) {
            zza = new zzuf();
        }
        return zza;
    }
}
