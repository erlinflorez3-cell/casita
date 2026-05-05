package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqn {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final List zzd = new ArrayList();

    public final zzqn zza(zzqm zzqmVar) {
        this.zzc.add(zzqmVar);
        return this;
    }

    public final zzqn zzb(zzqm zzqmVar) {
        this.zzb.add(zzqmVar);
        return this;
    }

    public final zzqn zzc(zzqm zzqmVar) {
        this.zza.add(zzqmVar);
        return this;
    }

    public final zzqn zzd(zzqm zzqmVar) {
        this.zzd.add(zzqmVar);
        return this;
    }

    public final zzqp zze() {
        return new zzqp(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
