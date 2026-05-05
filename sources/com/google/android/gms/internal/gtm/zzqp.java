package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqp {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    /* synthetic */ zzqp(List list, List list2, List list3, List list4, zzqo zzqoVar) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableList(list2);
        this.zzc = Collections.unmodifiableList(list3);
        this.zzd = Collections.unmodifiableList(list4);
    }

    public final String toString() {
        List list = this.zzd;
        List list2 = this.zzc;
        List list3 = this.zzb;
        return "Positive predicates: " + String.valueOf(this.zza) + "  Negative predicates: " + String.valueOf(list3) + "  Add tags: " + String.valueOf(list2) + "  Remove tags: " + String.valueOf(list);
    }

    public final List zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zza;
    }

    public final List zzd() {
        return this.zzd;
    }
}
