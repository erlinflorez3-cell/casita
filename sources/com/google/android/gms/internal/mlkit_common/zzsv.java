package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsv {
    private static zzsv zza = null;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        if (zza == null) {
            zza = new zzsv();
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
