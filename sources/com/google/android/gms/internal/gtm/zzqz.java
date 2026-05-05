package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzqz {
    protected Map zza;

    /* JADX INFO: renamed from: toString */
    public abstract String zzc();

    public zzjw zza(String str) {
        throw new IllegalStateException("Attempting to access Native Method " + str + " on unsupported type.");
    }

    public zzqz zzb(String str) {
        Map map = this.zza;
        return map != null ? (zzqz) map.get(str) : zzrd.zze;
    }

    public abstract Object zzc();

    protected final Iterator zzd() {
        Map map = this.zza;
        return map == null ? new zzqy(null) : new zzqw(this, map.keySet().iterator());
    }

    public Iterator zze() {
        return new zzqy(null);
    }

    public final void zzf(String str, zzqz zzqzVar) {
        if (this.zza == null) {
            this.zza = new HashMap();
        }
        this.zza.put(str, zzqzVar);
    }

    public boolean zzg(String str) {
        return false;
    }

    public final boolean zzh(String str) {
        Map map = this.zza;
        return map != null && map.containsKey(str);
    }
}
