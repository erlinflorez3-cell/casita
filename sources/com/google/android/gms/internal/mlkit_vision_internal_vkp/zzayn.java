package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayn {
    private static zzayn zza = null;

    private zzayn() {
    }

    public static synchronized zzayn zza() {
        if (zza == null) {
            zza = new zzayn();
        }
        return zza;
    }
}
