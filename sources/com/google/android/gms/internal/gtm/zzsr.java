package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzsr extends zzsn {
    private final zzst zza;

    zzsr(zzst zzstVar, int i2) {
        super(zzstVar.size(), i2);
        this.zza = zzstVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzsn
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
