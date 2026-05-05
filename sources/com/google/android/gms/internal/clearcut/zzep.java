package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes8.dex */
final class zzep<K, V> implements Comparable<zzep>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzei zzos;

    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable zzov;

    /* JADX WARN: Multi-variable type inference failed */
    zzep(zzei zzeiVar, K k2, V v2) {
        this.zzos = zzeiVar;
        this.zzov = k2;
        this.value = v2;
    }

    zzep(zzei zzeiVar, Map.Entry<K, V> entry) {
        this(zzeiVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzep zzepVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzepVar.getKey());
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
        return equals(this.zzov, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzov;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzov;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v2 = this.value;
        return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v2) {
        this.zzos.zzdu();
        V v3 = this.value;
        this.value = v2;
        return v3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzov);
        String strValueOf2 = String.valueOf(this.value);
        return new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length()).append(strValueOf).append("=").append(strValueOf2).toString();
    }
}
