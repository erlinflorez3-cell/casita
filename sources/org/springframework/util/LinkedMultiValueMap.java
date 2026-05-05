package org.springframework.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LinkedMultiValueMap<K, V> implements MultiValueMap<K, V>, Serializable {
    private static final long serialVersionUID = 3801124242820219131L;
    private final Map<K, List<V>> targetMap;

    public LinkedMultiValueMap() {
        this.targetMap = new LinkedHashMap();
    }

    public LinkedMultiValueMap(int i2) {
        this.targetMap = new LinkedHashMap(i2);
    }

    public LinkedMultiValueMap(Map<K, List<V>> map) {
        this.targetMap = new LinkedHashMap(map);
    }

    @Override // org.springframework.util.MultiValueMap
    public void add(K k2, V v2) {
        List<V> linkedList = this.targetMap.get(k2);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.targetMap.put(k2, linkedList);
        }
        linkedList.add(v2);
    }

    @Override // java.util.Map
    public void clear() {
        this.targetMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.targetMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.targetMap.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, List<V>>> entrySet() {
        return this.targetMap.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.targetMap.equals(obj);
    }

    @Override // java.util.Map
    public List<V> get(Object obj) {
        return this.targetMap.get(obj);
    }

    @Override // org.springframework.util.MultiValueMap
    public V getFirst(K k2) {
        List<V> list = this.targetMap.get(k2);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.targetMap.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.targetMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.targetMap.keySet();
    }

    @Override // java.util.Map
    public List<V> put(K k2, List<V> list) {
        return this.targetMap.put(k2, list);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends List<V>> map) {
        this.targetMap.putAll(map);
    }

    @Override // java.util.Map
    public List<V> remove(Object obj) {
        return this.targetMap.remove(obj);
    }

    @Override // org.springframework.util.MultiValueMap
    public void set(K k2, V v2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(v2);
        this.targetMap.put(k2, linkedList);
    }

    @Override // org.springframework.util.MultiValueMap
    public void setAll(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.targetMap.size();
    }

    @Override // org.springframework.util.MultiValueMap
    public Map<K, V> toSingleValueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.targetMap.size());
        for (Map.Entry<K, List<V>> entry : this.targetMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().get(0));
        }
        return linkedHashMap;
    }

    public String toString() {
        return this.targetMap.toString();
    }

    @Override // java.util.Map
    public Collection<List<V>> values() {
        return this.targetMap.values();
    }
}
