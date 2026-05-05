package cz.msebera.android.httpclient.impl.cookie;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class BestMatchSpec extends DefaultCookieSpec {
    public BestMatchSpec() {
        this(null, false);
    }

    public BestMatchSpec(String[] strArr, boolean z2) {
        super(strArr, z2);
    }

    @Override // cz.msebera.android.httpclient.impl.cookie.DefaultCookieSpec
    public String toString() {
        return "best-match";
    }
}
