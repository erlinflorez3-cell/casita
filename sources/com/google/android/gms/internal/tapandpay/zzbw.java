package com.google.android.gms.internal.tapandpay;

/* JADX INFO: loaded from: classes8.dex */
final class zzbw extends zzbt {
    private final zzby zza;

    zzbw(zzby zzbyVar, int i2) {
        super(zzbyVar.size(), i2);
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbt
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
