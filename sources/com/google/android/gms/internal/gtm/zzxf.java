package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class zzxf {
    static final zzxf zza = new zzxf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzxf zzd = null;
    private final Map zze;

    zzxf() {
        this.zze = new HashMap();
    }

    zzxf(boolean z2) {
        this.zze = Collections.emptyMap();
    }

    public static zzxf zza() {
        zzxf zzxfVar = zzd;
        if (zzxfVar != null) {
            return zzxfVar;
        }
        synchronized (zzxf.class) {
            zzxf zzxfVar2 = zzd;
            if (zzxfVar2 != null) {
                return zzxfVar2;
            }
            zzxf zzxfVarZzb = zzxn.zzb(zzxf.class);
            zzd = zzxfVarZzb;
            return zzxfVarZzb;
        }
    }

    public zzxt zzb(zzzg zzzgVar, int i2) {
        return (zzxt) this.zze.get(new zzxe(zzzgVar, i2));
    }
}
