package com.dynatrace.android.agent.comm;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.ssl.LocalX509TrustManager;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.util.Utility;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;

/* JADX INFO: loaded from: classes3.dex */
public class CommHandler {
    private Configuration configuration;
    private static final String TAG = Global.LOG_PREFIX + "CommHandler";
    private static int CONN_TIMEOUT = 10000;
    private static int READ_TIMEOUT = HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT;

    public CommHandler(Configuration configuration) {
        this.configuration = configuration;
    }

    private static byte[] decompress(byte[] bArr) throws IOException {
        return Utility.readStream(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    private static boolean isGZIPStream(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    private HttpURLConnection openConnection(URL url) throws Throwable {
        if (!this.configuration.getServerUrl().startsWith(C1561oA.ud("\u000e\u0019\u0018\u0013\u0015", (short) (C1499aX.Xd() ^ (-7927))))) {
            return (HttpURLConnection) url.openConnection();
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        if (this.configuration.keyStore != null || !this.configuration.certificateValidation) {
            SSLContext sSLContext = SSLContext.getInstance(C1561oA.yd("92:", (short) (OY.Xd() ^ 22824)));
            KeyManager[] keyManagerArr = this.configuration.keyManagers;
            TrustManager[] trustManagerArr = {new LocalX509TrustManager(this.configuration.keyStore, true ^ this.configuration.certificateValidation)};
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Yd("c[q]+qdcvtlx~4Zml\u007f}q_o}t\u0001\u007f", (short) (C1499aX.Xd() ^ (-2777)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                sSLContext.init(keyManagerArr, trustManagerArr, (SecureRandom) constructor.newInstance(objArr));
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return httpsURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.dynatrace.android.agent.comm.HttpResponse executeRequest(java.lang.String r10, java.lang.String r11, boolean r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.comm.CommHandler.executeRequest(java.lang.String, java.lang.String, boolean):com.dynatrace.android.agent.comm.HttpResponse");
    }
}
