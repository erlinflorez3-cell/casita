package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzyx implements zzze {
    private final zzze[] zza;

    zzyx(zzze... zzzeVarArr) {
        this.zza = zzzeVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final zzzd zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzze zzzeVar = this.zza[i2];
            if (zzzeVar.zzc(cls)) {
                return zzzeVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.gtm.zzze
    public final boolean zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
