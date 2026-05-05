package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqv {
    private static final String zza = new String("");
    private static final Integer zzb = 0;
    private final int zzc;
    private final Object zzd;
    private final List zze;

    /* synthetic */ zzqv(Integer num, Object obj, List list, boolean z2, zzqu zzquVar) {
        this.zzc = num.intValue();
        this.zzd = obj;
        this.zze = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzqv) && ((zzqv) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        Object obj = this.zzd;
        if (obj != null) {
            return obj.toString();
        }
        zzho.zza("Fail to convert a null object to string");
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    public final Object zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }
}
