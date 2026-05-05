package io.cobrowse;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
class Tls12OkHttpClient {

    private static class ReusableClientSingleton {
        private static final OkHttpClient INSTANCE = Tls12OkHttpClient.create();

        private ReusableClientSingleton() {
        }
    }

    private Tls12OkHttpClient() {
    }

    static OkHttpClient create() {
        return enableTls12OnPreLollipop(new OkHttpClient.Builder().pingInterval(60L, TimeUnit.SECONDS).connectTimeout(2000L, TimeUnit.MILLISECONDS)).build();
    }

    private static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder builder) {
        return builder;
    }

    private static TrustManager[] findTrustManagers() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            return trustManagerFactory.getTrustManagers();
        } catch (KeyStoreException | NoSuchAlgorithmException e2) {
            return null;
        }
    }

    private static X509TrustManager findX509TrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    static OkHttpClient reuse() {
        return ReusableClientSingleton.INSTANCE;
    }
}
