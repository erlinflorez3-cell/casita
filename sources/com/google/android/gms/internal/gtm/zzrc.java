package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrc extends zzqz {
    private static final Map zzb;
    private final zzjw zzc;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", zzlx.zza);
        zzb = Collections.unmodifiableMap(map);
    }

    public zzrc(zzjw zzjwVar) {
        this.zzc = zzjwVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    /* JADX INFO: renamed from: toString */
    public final String zzc() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException("Native Method " + str + " is not defined for type InstructionReference.");
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final Iterator zze() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzjw zzi() {
        return this.zzc;
    }
}
