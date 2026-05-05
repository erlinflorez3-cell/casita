package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes8.dex */
public final class zznw implements zzjw {
    private Clock zza = DefaultClock.getInstance();

    public final void zza(Clock clock) {
        this.zza = (Clock) Preconditions.checkNotNull(clock);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        return new zzrb(Double.valueOf(this.zza.currentTimeMillis()));
    }
}
