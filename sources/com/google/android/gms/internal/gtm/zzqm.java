package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqm {
    private final Map zza;
    private final zzqv zzb;

    /* synthetic */ zzqm(Map map, zzqv zzqvVar, zzql zzqlVar) {
        this.zza = Collections.unmodifiableMap(map);
        this.zzb = zzqvVar;
    }

    public final String toString() {
        return "Properties: " + String.valueOf(this.zza) + " pushAfterEvaluate: " + String.valueOf(this.zzb);
    }

    public final Map zza() {
        return this.zza;
    }
}
