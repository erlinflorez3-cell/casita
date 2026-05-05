package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmh extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 2);
        zzqz zzrkVar = zzqzVarArr[0];
        boolean z2 = zzrkVar instanceof zzrd;
        zzqz zzrkVar2 = zzqzVarArr[1];
        if ((z2 && zzrkVar != zzrd.zze && zzrkVar != zzrd.zzd) || ((zzrkVar2 instanceof zzrd) && zzrkVar2 != zzrd.zze && zzrkVar2 != zzrd.zzd)) {
            throw new IllegalArgumentException("Illegal InternalType passed to Add.");
        }
        if ((zzrkVar instanceof zzrh) || (zzrkVar instanceof zzrg) || (zzrkVar instanceof zzrc)) {
            zzrkVar = new zzrk(zzjx.zzd(zzrkVar));
        }
        if ((zzrkVar2 instanceof zzrh) || (zzrkVar2 instanceof zzrg) || (zzrkVar2 instanceof zzrc)) {
            zzrkVar2 = new zzrk(zzjx.zzd(zzrkVar2));
        }
        if ((zzrkVar instanceof zzrk) || (zzrkVar2 instanceof zzrk)) {
            return new zzrk(String.valueOf(zzjx.zzd(zzrkVar)).concat(String.valueOf(zzjx.zzd(zzrkVar2))));
        }
        return new zzrb(Double.valueOf(zzjx.zzc(zzrkVar, zzrkVar2)));
    }
}
