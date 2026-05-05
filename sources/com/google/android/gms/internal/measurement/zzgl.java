package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgl {
    private static zzgk zza = null;

    public static synchronized zzgk zza() {
        if (zza == null) {
            zza(new zzgn());
        }
        return zza;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        if (zza != null) {
            throw new IllegalStateException("init() already called");
        }
        zza = zzgkVar;
    }
}
