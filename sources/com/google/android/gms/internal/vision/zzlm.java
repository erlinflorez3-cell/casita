package com.google.android.gms.internal.vision;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes8.dex */
final class zzlm<K, V> implements Comparable<zzlm>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable zza;
    private V zzb;
    private final /* synthetic */ zzlh zzc;

    /* JADX WARN: Multi-variable type inference failed */
    zzlm(zzlh zzlhVar, K k2, V v2) {
        this.zzc = zzlhVar;
        this.zza = k2;
        this.zzb = v2;
    }

    zzlm(zzlh zzlhVar, Map.Entry<K, V> entry) {
        this(zzlhVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzlm zzlmVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzlmVar.getKey());
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
        this.zzc.zzf();
        V v3 = this.zzb;
        this.zzb = v2;
        return v3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length()).append(strValueOf).append("=").append(strValueOf2).toString();
    }
}
