package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class SentrySpanStorage {
    private static volatile SentrySpanStorage INSTANCE = null;
    private final Map<String, ISpan> spans = new ConcurrentHashMap();

    private SentrySpanStorage() {
    }

    public static SentrySpanStorage getInstance() {
        if (INSTANCE == null) {
            synchronized (SentrySpanStorage.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SentrySpanStorage();
                }
            }
        }
        return INSTANCE;
    }

    public ISpan get(String str) {
        return this.spans.get(str);
    }

    public ISpan removeAndGet(String str) {
        return this.spans.remove(str);
    }

    public void store(String str, ISpan iSpan) {
        this.spans.put(str, iSpan);
    }
}
