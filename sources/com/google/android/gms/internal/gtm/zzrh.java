package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrh extends zzqz {
    private static final Map zzb;
    private boolean zzc = false;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", zzlx.zza);
        zzb = Collections.unmodifiableMap(map);
    }

    public zzrh(Map map) {
        this.zza = (Map) Preconditions.checkNotNull(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrh) {
            return this.zza.entrySet().equals(((zzrh) obj).zza.entrySet());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    /* JADX INFO: renamed from: toString */
    public final String zzc() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException("Native Method " + str + " is not defined for type ListWrapper.");
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final zzqz zzb(String str) {
        zzqz zzqzVarZzb = super.zzb(str);
        return zzqzVarZzb == null ? zzrd.zze : zzqzVarZzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final Iterator zze() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Map zzi() {
        return this.zza;
    }

    public final void zzj() {
        this.zzc = true;
    }

    public final boolean zzk() {
        return this.zzc;
    }
}
