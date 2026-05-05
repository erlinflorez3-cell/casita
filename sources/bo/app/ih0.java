package bo.app;

import com.braze.support.BrazeLogger;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ih0 {

    /* JADX INFO: renamed from: a */
    public static final ih0 f914a = new ih0();

    /* JADX INFO: renamed from: b */
    public static final cd0 f915b;

    static {
        try {
            f915b = new cd0();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f914a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) gh0.f759a, 4, (Object) null);
        }
    }

    public final HttpURLConnection a(URL url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                cd0 cd0Var = f915b;
                if (cd0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    cd0Var = null;
                }
                httpsURLConnection.setSSLSocketFactory(cd0Var);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) hh0.f832a, 4, (Object) null);
            }
        }
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
