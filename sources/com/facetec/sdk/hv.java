package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class hv {
    private static final Logger I;
    private static final hv Z;

    static {
        hv hvVarI = hn.I();
        if (hvVarI == null && ((!I() || (hvVarI = hq.I()) == null) && (hvVarI = ho.Code()) == null && (hvVarI = hs.I()) == null)) {
            hvVarI = new hv();
        }
        Z = hvVarI;
        I = Logger.getLogger(ft.class.getName());
    }

    public static hv B() {
        return Z;
    }

    public static List<String> B(List<fx> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            fx fxVar = list.get(i2);
            if (fxVar != fx.HTTP_1_0) {
                arrayList.add(fxVar.toString());
            }
        }
        return arrayList;
    }

    @Nullable
    static <T> T Code(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null && cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = Code(obj, (Class<Object>) Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    private static boolean I() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    static byte[] I(List<fx> list) {
        ie ieVar = new ie();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            fx fxVar = list.get(i2);
            if (fxVar != fx.HTTP_1_0) {
                ieVar.I(fxVar.toString().length());
                ieVar.V(fxVar.toString());
            }
        }
        return ieVar.o();
    }

    public Object B(String str) {
        if (I.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void Code(int i2, String str, @Nullable Throwable th) {
        I.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void Code(String str, Object obj) {
        if (obj == null) {
            str = new StringBuilder().append(str).append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);").toString();
        }
        Code(5, str, (Throwable) obj);
    }

    public void Code(SSLSocketFactory sSLSocketFactory) {
    }

    public cf.I I(X509TrustManager x509TrustManager) {
        return new hw(x509TrustManager.getAcceptedIssuers());
    }

    @Nullable
    protected X509TrustManager I(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objCode = Code(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objCode == null) {
                return null;
            }
            return (X509TrustManager) Code(objCode, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void I(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        socket.connect(inetSocketAddress, i2);
    }

    public final hx V(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x509TrustManagerI = I(sSLSocketFactory);
        if (x509TrustManagerI != null) {
            return V(x509TrustManagerI);
        }
        throw new IllegalStateException(new StringBuilder("Unable to extract the trust manager on ").append(B()).append(", sslSocketFactory is ").append(sSLSocketFactory.getClass()).toString());
    }

    public hx V(X509TrustManager x509TrustManager) {
        return new hz(I(x509TrustManager));
    }

    public SSLContext V() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public void V(SSLSocket sSLSocket) {
    }

    public void V(SSLSocket sSLSocket, @Nullable String str, List<fx> list) {
    }

    @Nullable
    public String Z(SSLSocket sSLSocket) {
        return null;
    }

    public boolean Z(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
