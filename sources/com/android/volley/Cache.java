package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    /* JADX INFO: loaded from: classes2.dex */
    public static class Entry {
        public List<Header> allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, String> responseHeaders = Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired() {
            return isExpired(System.currentTimeMillis());
        }

        boolean isExpired(long j2) {
            return this.ttl < j2;
        }

        public boolean refreshNeeded() {
            return refreshNeeded(System.currentTimeMillis());
        }

        boolean refreshNeeded(long j2) {
            return this.softTtl < j2;
        }
    }

    void clear();

    Entry get(String str);

    void initialize();

    void invalidate(String str, boolean z2);

    void put(String str, Entry entry);

    void remove(String str);
}
