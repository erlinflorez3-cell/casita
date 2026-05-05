package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class AtomicLongMap<K> implements Serializable {

    @CheckForNull
    @LazyInit
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> map) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(map);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> m2) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(m2);
        return atomicLongMapCreate;
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>(this) { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomic) {
                return Long.valueOf(atomic.get());
            }
        }));
    }

    public long addAndGet(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        long j3;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return delta;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 != 0) {
                    j3 = j2 + delta;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, j3));
            return j3;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return delta;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    public long decrementAndGet(K key) {
        return addAndGet(key, -1L);
    }

    public long get(K key) {
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public long getAndAdd(K key, long delta) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, j2 + delta));
            return j2;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new AtomicLong(delta)));
        return 0L;
    }

    public long getAndDecrement(K key) {
        return getAndAdd(key, -1L);
    }

    public long getAndIncrement(K key) {
        return getAndAdd(key, 1L);
    }

    public long incrementAndGet(K key) {
        return addAndGet(key, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public long put(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        long j2;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            do {
                j2 = atomicLongPutIfAbsent.get();
                if (j2 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j2, newValue));
            return j2;
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> m2) {
        for (Map.Entry<? extends K, ? extends Long> entry : m2.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    long putIfAbsent(K key, long newValue) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(key);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            long j2 = atomicLongPutIfAbsent.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.map.replace(key, atomicLongPutIfAbsent, new AtomicLong(newValue)));
        return 0L;
    }

    public long remove(K key) {
        long j2;
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j2 = atomicLong.get();
            if (j2 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j2, 0L));
        this.map.remove(key, atomicLong);
        return j2;
    }

    boolean remove(K key, long value) {
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != value) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0L)) {
            return false;
        }
        this.map.remove(key, atomicLong);
        return true;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public boolean removeIfZero(K key) {
        return remove(key, 0L);
    }

    boolean replace(K key, long expectedOldValue, long newValue) {
        if (expectedOldValue == 0) {
            return putIfAbsent(key, newValue) == 0;
        }
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(expectedOldValue, newValue);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().get();
        }
        return j2;
    }

    public String toString() {
        return this.map.toString();
    }
}
