package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqk {
    private final Map zza = new HashMap();
    private zzqv zzb;

    public final zzqk zza(String str, zzqv zzqvVar) {
        this.zza.put(str, zzqvVar);
        return this;
    }

    public final zzqk zzb(zzqv zzqvVar) {
        this.zzb = zzqvVar;
        return this;
    }

    public final zzqm zzc() {
        return new zzqm(this.zza, this.zzb, null);
    }
}
