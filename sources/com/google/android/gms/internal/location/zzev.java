package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes8.dex */
final class zzev extends zzet {
    private final zzex zza;

    zzev(zzex zzexVar, int i2) {
        super(zzexVar.size(), i2);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.location.zzet
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
