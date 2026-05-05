package org.springframework.util;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface MultiValueMap<K, V> extends Map<K, List<V>> {
    void add(K k2, V v2);

    V getFirst(K k2);

    void set(K k2, V v2);

    void setAll(Map<K, V> map);

    Map<K, V> toSingleValueMap();
}
