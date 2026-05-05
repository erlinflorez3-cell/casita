package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
final class zzcq extends zzbd {
    private final zzcs zza;

    zzcq(zzcs zzcsVar, int i2) {
        super(zzcsVar.size(), i2);
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbd
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
