package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfi implements zzbfq {
    private final zzbfq[] zza;

    zzbfi(zzbfq... zzbfqVarArr) {
        this.zza = zzbfqVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfq
    public final zzbfp zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzbfq zzbfqVar = this.zza[i2];
            if (zzbfqVar.zzc(cls)) {
                return zzbfqVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfq
    public final boolean zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
