package com.google.android.gms.internal.gtm;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzyj implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzyl) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzzg) {
            return ((zzyl) this.zza.getValue()).zzc((zzzg) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzyl zza() {
        return (zzyl) this.zza.getValue();
    }
}
