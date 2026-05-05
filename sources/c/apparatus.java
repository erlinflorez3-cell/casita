package c;

import android.app.Application;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.cleafy.mobile.detection.http.wrappers.HttpURLConnectionFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class apparatus {

    /* JADX INFO: renamed from: a */
    public d.tongue f2445a = null;

    /* JADX INFO: renamed from: b */
    public final Interceptor f2446b = new Interceptor() { // from class: c.apparatus$$ExternalSyntheticLambda0
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            return apparatus.a(this.f$0, chain);
        }
    };

    public apparatus(pair pairVar) {
    }

    public static final HttpURLConnection a(URL url, HttpURLConnection httpURLConnection) {
        return httpURLConnection;
    }

    public static final Response a(apparatus apparatusVar, Interceptor.Chain chain) {
        d.tongue tongueVar;
        v.civilian civilianVar;
        Interceptor interceptor;
        try {
            tongueVar = apparatusVar.f2445a;
        } catch (Throwable unused) {
            d.tongue tongueVar2 = apparatusVar.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        Response responseIntercept = (tongueVar == null || (civilianVar = tongueVar.f18385l) == null || (interceptor = (Interceptor) civilianVar.f28342f.getValue()) == null) ? null : interceptor.intercept(chain);
        return responseIntercept == null ? chain.proceed(chain.request().newBuilder().build()) : responseIntercept;
    }

    public final HttpURLConnectionFactory a() {
        d.tongue tongueVar;
        v.civilian civilianVar;
        try {
            tongueVar = this.f2445a;
        } catch (Throwable unused) {
            d.tongue tongueVar2 = this.f2445a;
            if (tongueVar2 != null) {
                g1.tongue tongueVar3 = tongueVar2.f18384k;
            }
        }
        HttpURLConnectionFactory httpURLConnectionFactory = (tongueVar == null || (civilianVar = tongueVar.f18385l) == null) ? null : (HttpURLConnectionFactory) civilianVar.f28343g.getValue();
        return httpURLConnectionFactory == null ? new HttpURLConnectionFactory() { // from class: c.apparatus$$ExternalSyntheticLambda1
            @Override // com.cleafy.mobile.detection.http.wrappers.HttpURLConnectionFactory
            public final HttpURLConnection create(URL url, HttpURLConnection httpURLConnection) {
                return apparatus.a(url, httpURLConnection);
            }
        } : httpURLConnectionFactory;
    }

    public final void a(Application application, CleafyConfiguration cleafyConfiguration) {
        if (this.f2445a != null) {
            return;
        }
        if (StringsKt.isBlank(cleafyConfiguration.f2790b) || StringsKt.isBlank(cleafyConfiguration.f2789a)) {
            throw new IllegalArgumentException("Missing applicationHostname or apiEndpoint. These are required parameters.");
        }
        d.tongue tongueVar = null;
        try {
            d.tongue tongueVar2 = pair.a(application, cleafyConfiguration).f2450a;
            if (!tongueVar2.f18390q) {
                tongueVar2.f18390q = true;
                r0.apparatus apparatusVar = tongueVar2.f18382i;
                apparatusVar.f28261c = (String) apparatusVar.f28260b.invoke();
                String str = (String) apparatusVar.f28260b.invoke();
                apparatusVar.f28262d = str;
                if (str == null) {
                    str = (String) apparatusVar.f28260b.invoke();
                }
                apparatusVar.f28263e = str;
                k0.pair pairVar = new k0.pair(apparatusVar.f28261c, apparatusVar.f28262d, str, apparatusVar.f28264f, apparatusVar.f28259a);
                tongueVar2.f18379f.a();
                BuildersKt__Builders_commonKt.launch$default(tongueVar2.f18389p, null, null, new d.superior(tongueVar2, pairVar, null), 3, null);
            }
            tongueVar = tongueVar2;
        } catch (Throwable unused) {
        }
        this.f2445a = tongueVar;
    }
}
