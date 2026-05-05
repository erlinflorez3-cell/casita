package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzzc {
    private static final zzzb zza;
    private static final zzzb zzb;

    static {
        zzzb zzzbVar;
        try {
            zzzbVar = (zzzb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzzbVar = null;
        }
        zza = zzzbVar;
        zzb = new zzzb();
    }

    static zzzb zza() {
        return zza;
    }

    static zzzb zzb() {
        return zzb;
    }
}
