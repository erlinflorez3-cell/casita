package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzie {
    private zzie zza;
    private Map zzb;

    public zzie() {
        this(null);
    }

    private zzie(zzie zzieVar) {
        this.zzb = null;
        this.zza = zzieVar;
    }

    public final zzie zza() {
        return new zzie(this);
    }

    public final zzqz zzb(String str) {
        Map map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return (zzqz) this.zzb.get(str);
        }
        zzie zzieVar = this.zza;
        if (zzieVar != null) {
            return zzieVar.zzb(str);
        }
        throw new IllegalStateException("Trying to get a non existent symbol: ".concat(String.valueOf(str)));
    }

    public final void zzc(String str, zzqz zzqzVar) {
        if (this.zzb == null) {
            this.zzb = new HashMap();
        }
        this.zzb.put(str, zzqzVar);
    }

    public final void zzd(String str) {
        Preconditions.checkState(zzf("gtm.globals.eventName"));
        Map map = this.zzb;
        if (map == null || !map.containsKey("gtm.globals.eventName")) {
            this.zza.zzd("gtm.globals.eventName");
        } else {
            this.zzb.remove("gtm.globals.eventName");
        }
    }

    public final void zze(String str, zzqz zzqzVar) {
        Map map = this.zzb;
        if (map != null && map.containsKey(str)) {
            this.zzb.put(str, zzqzVar);
            return;
        }
        zzie zzieVar = this.zza;
        if (zzieVar == null) {
            throw new IllegalStateException("Trying to modify a non existent symbol: ".concat(String.valueOf(str)));
        }
        zzieVar.zze(str, zzqzVar);
    }

    public final boolean zzf(String str) {
        Map map = this.zzb;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        zzie zzieVar = this.zza;
        if (zzieVar != null) {
            return zzieVar.zzf(str);
        }
        return false;
    }
}
