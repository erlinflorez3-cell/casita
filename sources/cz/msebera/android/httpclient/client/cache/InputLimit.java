package cz.msebera.android.httpclient.client.cache;

/* JADX INFO: loaded from: classes5.dex */
public class InputLimit {
    private boolean reached = false;
    private final long value;

    public InputLimit(long j2) {
        this.value = j2;
    }

    public long getValue() {
        return this.value;
    }

    public boolean isReached() {
        return this.reached;
    }

    public void reached() {
        this.reached = true;
    }
}
