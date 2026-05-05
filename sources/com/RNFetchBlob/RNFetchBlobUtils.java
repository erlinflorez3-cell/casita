package com.RNFetchBlob;

import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Xg;

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlobUtils {
    public static void emitWarningEvent(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(NotificationCompat.CATEGORY_EVENT, "warn");
        writableMapCreateMap.putString(ProductAction.ACTION_DETAIL, str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RNFetchBlobConst.EVENT_MESSAGE, writableMapCreateMap);
    }

    public static String getMD5(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                messageDigest.update(str.getBytes());
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(String.format("%02x", Integer.valueOf(b2 & 255)));
                }
                return sb.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static OkHttpClient.Builder getUnsafeOkHttpClient(OkHttpClient okHttpClient) throws Throwable {
        try {
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.RNFetchBlob.RNFetchBlobUtils.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            TrustManager[] trustManagerArr = {x509TrustManager};
            SSLContext sSLContext = SSLContext.getInstance(C1561oA.Yd("\\]W", (short) (C1607wl.Xd() ^ 30832)));
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Xg.qd("|t\u000bvD\u000b}|\u0010\u000e\u0006\u0012\u0018Ms\u0007\u0006\u0019\u0017\u000bx\t\u0017\u000e\u001a\u0019", (short) (FB.Xd() ^ 847), (short) (FB.Xd() ^ 23791))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                sSLContext.init(null, trustManagerArr, (SecureRandom) constructor.newInstance(objArr));
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                builderNewBuilder.sslSocketFactory(socketFactory, x509TrustManager);
                builderNewBuilder.hostnameVerifier(new HostnameVerifier() { // from class: com.RNFetchBlob.RNFetchBlobUtils.2
                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(String str, SSLSession sSLSession) {
                        return true;
                    }
                });
                return builderNewBuilder;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
