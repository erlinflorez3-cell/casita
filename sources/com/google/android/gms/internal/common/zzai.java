package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes8.dex */
final class zzai extends zzad {
    private final zzak zza;

    zzai(zzak zzakVar, int i2) {
        super(zzakVar.size(), i2);
        this.zza = zzakVar;
    }

    @Override // com.google.android.gms.internal.common.zzad
    protected final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
