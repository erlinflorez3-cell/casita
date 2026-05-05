package io.cobrowse;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class MapUtils {
    MapUtils() {
    }

    static <A, B> boolean contains(Map<A, B> map, Map<A, B> map2) {
        B b2;
        for (A a2 : map2.keySet()) {
            if (!map.containsKey(a2) || (b2 = map.get(a2)) == null || !b2.equals(map2.get(a2))) {
                return false;
            }
        }
        return true;
    }
}
