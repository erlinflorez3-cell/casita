package org.springframework.core;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface ConcurrentMap extends Map {
    @Override // java.util.Map
    Object putIfAbsent(Object obj, Object obj2);

    @Override // java.util.Map
    boolean remove(Object obj, Object obj2);

    @Override // java.util.Map
    Object replace(Object obj, Object obj2);

    @Override // java.util.Map
    boolean replace(Object obj, Object obj2, Object obj3);
}
