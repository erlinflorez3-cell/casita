package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqj {
    private final List zza;
    private final Map zzb;
    private final String zzc;

    public zzqj(List list, Map map, String str, int i2) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableMap(map);
        this.zzc = str;
    }

    public final String toString() {
        return "Rules: " + String.valueOf(this.zza) + "\n  Macros: " + String.valueOf(this.zzb);
    }

    public final zzqm zza(String str) {
        return (zzqm) this.zzb.get(str);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final List zzc() {
        return this.zza;
    }
}
