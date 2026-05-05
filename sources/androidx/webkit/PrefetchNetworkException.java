package androidx.webkit;

/* JADX INFO: loaded from: classes4.dex */
public class PrefetchNetworkException extends PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(String str) {
        this(str, 0);
    }

    public PrefetchNetworkException(String str, int i2) {
        super(str);
        this.httpResponseStatusCode = i2;
    }

    public PrefetchNetworkException(int i2) {
        this.httpResponseStatusCode = i2;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
