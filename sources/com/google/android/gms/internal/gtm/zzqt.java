package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqt {
    private final Integer zza;
    private final Object zzb;
    private final List zzc = new ArrayList();
    private boolean zzd = false;

    public zzqt(int i2, Object obj) {
        this.zza = Integer.valueOf(i2);
        this.zzb = obj;
    }

    public final zzqt zza(int i2) {
        this.zzc.add(Integer.valueOf(i2));
        return this;
    }

    public final zzqt zzb(boolean z2) {
        this.zzd = true;
        return this;
    }

    public final zzqv zzc() {
        Preconditions.checkNotNull(this.zza);
        Preconditions.checkNotNull(this.zzb);
        return new zzqv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
