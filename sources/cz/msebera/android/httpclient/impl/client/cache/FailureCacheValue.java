package cz.msebera.android.httpclient.impl.client.cache;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class FailureCacheValue {
    private final long creationTimeInNanos = System.nanoTime();
    private final int errorCount;
    private final String key;

    public FailureCacheValue(String str, int i2) {
        this.key = str;
        this.errorCount = i2;
    }

    public long getCreationTimeInNanos() {
        return this.creationTimeInNanos;
    }

    public int getErrorCount() {
        return this.errorCount;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return "[entry creationTimeInNanos=" + this.creationTimeInNanos + "; key=" + this.key + "; errorCount=" + this.errorCount + AbstractJsonLexerKt.END_LIST;
    }
}
