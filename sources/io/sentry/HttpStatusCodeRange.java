package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public final class HttpStatusCodeRange {
    public static final int DEFAULT_MAX = 599;
    public static final int DEFAULT_MIN = 500;
    private final int max;
    private final int min;

    public HttpStatusCodeRange(int i2) {
        this.min = i2;
        this.max = i2;
    }

    public HttpStatusCodeRange(int i2, int i3) {
        this.min = i2;
        this.max = i3;
    }

    public boolean isInRange(int i2) {
        return i2 >= this.min && i2 <= this.max;
    }
}
