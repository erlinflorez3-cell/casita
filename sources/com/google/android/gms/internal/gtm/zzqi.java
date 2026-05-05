package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqi {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private String zzc = "";

    public final zzqi zza(zzqm zzqmVar) {
        this.zzb.put(((zzqv) zzqmVar.zza().get("instance_name")).toString(), zzqmVar);
        return this;
    }

    public final zzqi zzb(zzqp zzqpVar) {
        this.zza.add(zzqpVar);
        return this;
    }

    public final zzqi zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzqj zzd() {
        return new zzqj(this.zza, this.zzb, this.zzc, 0);
    }
}
