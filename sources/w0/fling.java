package w0;

import com.dynatrace.android.callback.Callback;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class fling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.apparatus f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f28389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f28390c = LazyKt.lazy(clean.f28376a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f28391d = LazyKt.lazy(crisis.f28380a);

    public fling(f1.apparatus apparatusVar, CoroutineDispatcher coroutineDispatcher) {
        this.f28388a = apparatusVar;
        this.f28389b = coroutineDispatcher;
    }

    public static final boolean a(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, w0.misplace] */
    public final Object a(String str, Function1 function1, ContinuationImpl continuationImpl) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = misplace.f28393a;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        function1.invoke(new slide(objectRef, booleanRef, booleanRef2, map, objectRef2));
        return a(new fabricate((misplace) objectRef.element, str, map2, map, booleanRef.element, booleanRef2.element, (byte[]) objectRef2.element), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(w0.fabricate r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.fling.a(w0.fabricate, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final HttpURLConnection a(String str, boolean z2) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IllegalArgumentException("Invalid URL");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT);
        httpURLConnection.setReadTimeout(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT);
        if ((uRLConnectionOpenConnection instanceof HttpsURLConnection) && z2) {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, new X509TrustManager[]{(X509TrustManager) this.f28391d.getValue()}, (SecureRandom) this.f28390c.getValue());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: w0.fling$$ExternalSyntheticLambda0
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str2, SSLSession sSLSession) {
                    return fling.a(str2, sSLSession);
                }
            });
        }
        return httpURLConnection;
    }
}
