package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzzn {
    private static final zzzm zza;
    private static final zzzm zzb;

    static {
        zzzm zzzmVar;
        try {
            zzzmVar = (zzzm) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzzmVar = null;
        }
        zza = zzzmVar;
        zzb = new zzzm();
    }

    static zzzm zza() {
        return zza;
    }

    static zzzm zzb() {
        return zzb;
    }
}
