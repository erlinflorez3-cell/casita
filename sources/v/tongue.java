package v;

import com.cleafy.mobile.detection.http.wrappers.HttpURLConnectionFactory;
import com.dynatrace.android.callback.Callback;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class tongue extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ civilian f28350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tongue(civilian civilianVar) {
        super(0);
        this.f28350a = civilianVar;
    }

    public static final HttpURLConnection a(civilian civilianVar, URL url, HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            t0.tongue tongueVar = new t0.tongue(url, civilianVar, (HttpsURLConnection) httpURLConnection);
            Callback.newInstance(tongueVar);
            return tongueVar;
        }
        t0.pair pairVar = new t0.pair(civilianVar, url, httpURLConnection);
        Callback.newInstance(pairVar);
        return pairVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final HttpURLConnectionFactory invoke() {
        final civilian civilianVar = this.f28350a;
        return new HttpURLConnectionFactory() { // from class: v.tongue$$ExternalSyntheticLambda0
            @Override // com.cleafy.mobile.detection.http.wrappers.HttpURLConnectionFactory
            public final HttpURLConnection create(URL url, HttpURLConnection httpURLConnection) {
                return tongue.a(civilianVar, url, httpURLConnection);
            }
        };
    }
}
