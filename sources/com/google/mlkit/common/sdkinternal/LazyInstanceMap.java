package com.google.mlkit.common.sdkinternal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    protected abstract V create(K k2);

    public V get(K k2) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k2)) {
                return (V) this.zza.get(k2);
            }
            V vCreate = create(k2);
            this.zza.put(k2, vCreate);
            return vCreate;
        }
    }
}
