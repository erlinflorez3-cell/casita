package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzna extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqzVarArr.length == 1);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        return new zzrk(((zzrk) zzqzVarArr[0]).zzk().toUpperCase(Locale.ENGLISH));
    }
}
