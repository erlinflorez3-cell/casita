package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmw {
    private static zzmw zza = null;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        if (zza == null) {
            zza = new zzmw();
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
