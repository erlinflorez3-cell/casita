package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes8.dex */
final class zzad extends zzv {
    private final zzaf zza;

    zzad(zzaf zzafVar, int i2) {
        super(zzafVar.size(), i2);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzv
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
