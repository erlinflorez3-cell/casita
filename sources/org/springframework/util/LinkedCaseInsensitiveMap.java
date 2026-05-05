package org.springframework.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LinkedCaseInsensitiveMap<V> extends LinkedHashMap<String, V> {
    private final Map<String, String> caseInsensitiveKeys;
    private final Locale locale;

    public LinkedCaseInsensitiveMap() {
        this((Locale) null);
    }

    public LinkedCaseInsensitiveMap(int i2) {
        this(i2, null);
    }

    public LinkedCaseInsensitiveMap(int i2, Locale locale) {
        super(i2);
        this.caseInsensitiveKeys = new HashMap(i2);
        this.locale = locale == null ? Locale.getDefault() : locale;
    }

    public LinkedCaseInsensitiveMap(Locale locale) {
        this.caseInsensitiveKeys = new HashMap();
        this.locale = locale == null ? Locale.getDefault() : locale;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.caseInsensitiveKeys.clear();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return (obj instanceof String) && this.caseInsensitiveKeys.containsKey(convertKey((String) obj));
    }

    protected String convertKey(String str) {
        return str.toLowerCase(this.locale);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj instanceof String) {
            return (V) super.get(this.caseInsensitiveKeys.get(convertKey((String) obj)));
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(String str, V v2) {
        String strPut = this.caseInsensitiveKeys.put(convertKey(str), str);
        if (strPut != null && !strPut.equals(str)) {
            super.remove(strPut);
        }
        return (V) super.put(str, (Object) v2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ? extends V> map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), (Object) entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj instanceof String) {
            return (V) super.remove(this.caseInsensitiveKeys.remove(convertKey((String) obj)));
        }
        return null;
    }
}
