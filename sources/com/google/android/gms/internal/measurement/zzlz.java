package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes8.dex */
final class zzlz<K, V> implements Comparable<zzlz>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable zza;
    private V zzb;
    private final /* synthetic */ zzlv zzc;

    /* JADX WARN: Multi-variable type inference failed */
    zzlz(zzlv zzlvVar, K k2, V v2) {
        this.zzc = zzlvVar;
        this.zza = k2;
        this.zzb = v2;
    }

    zzlz(zzlv zzlvVar, Map.Entry<K, V> entry) {
        this(zzlvVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzlz zzlzVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzlzVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zza;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v2 = this.zzb;
        return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v2) {
        this.zzc.zzg();
        V v3 = this.zzb;
        this.zzb = v2;
        return v3;
    }

    public final String toString() {
        return String.valueOf(this.zza) + "=" + String.valueOf(this.zzb);
    }
}
