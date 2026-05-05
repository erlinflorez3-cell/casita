package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrb extends zzqz {
    private static final Map zzb;
    private final Double zzc;

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", zzlx.zza);
        map.put("toString", new zzmz());
        zzb = Collections.unmodifiableMap(map);
    }

    public zzrb(Double d2) {
        Preconditions.checkNotNull(d2);
        this.zzc = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrb) {
            return this.zzc.equals(((zzrb) obj).zzc);
        }
        return false;
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
        throw new IllegalStateException("Native Method " + str + " is not defined for type DoubleWrapper.");
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final Double zzi() {
        return this.zzc;
    }
}
