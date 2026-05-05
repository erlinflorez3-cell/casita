package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxb {
    private static zzxb zza = null;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        if (zza == null) {
            zza = new zzxb();
        }
        return zza;
    }
}
