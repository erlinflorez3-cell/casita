package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzxi {
    private static final zzxg zza = new zzxh();
    private static final zzxg zzb;

    static {
        zzxg zzxgVar;
        try {
            zzxgVar = (zzxg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzxgVar = null;
        }
        zzb = zzxgVar;
    }

    static zzxg zza() {
        zzxg zzxgVar = zzb;
        if (zzxgVar != null) {
            return zzxgVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzxg zzb() {
        return zza;
    }
}
