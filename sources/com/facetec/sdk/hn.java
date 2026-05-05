package com.facetec.sdk;

import android.os.Build;
import android.util.Log;
import com.facetec.sdk.cf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
final class hn extends hv {
    private final ht<Socket> B;
    private final ht<Socket> Code;
    private final V D = V.Code();
    private final ht<Socket> I;
    private final ht<Socket> V;
    private final Class<?> Z;

    static final class Code extends hx {
        private final Object Code;
        private final Method I;

        Code(Object obj, Method method) {
            this.Code = obj;
            this.I = method;
        }

        @Override // com.facetec.sdk.hx
        public final List<Certificate> B(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.I.invoke(this.Code, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof Code;
        }

        public final int hashCode() {
            return 0;
        }
    }

    static final class V {
        private final Method Code;
        private final Method I;
        private final Method Z;

        private V(Method method, Method method2, Method method3) {
            this.Z = method;
            this.Code = method2;
            this.I = method3;
        }

        static V Code() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new V(method, method3, method2);
        }

        final boolean B(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.I.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        final Object Code(String str) {
            Method method = this.Z;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.Code.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    static final class Z implements cf.I {
        private final Method Code;
        private final X509TrustManager Z;

        Z(X509TrustManager x509TrustManager, Method method) {
            this.Code = method;
            this.Z = x509TrustManager;
        }

        @Override // com.facetec.sdk.cf.I
        public final X509Certificate Z(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.Code.invoke(this.Z, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e2) {
                throw gg.I("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Z)) {
                return false;
            }
            Z z2 = (Z) obj;
            return this.Z.equals(z2.Z) && this.Code.equals(z2.Code);
        }

        public final int hashCode() {
            return this.Z.hashCode() + (this.Code.hashCode() * 31);
        }
    }

    private hn(Class<?> cls, ht<Socket> htVar, ht<Socket> htVar2, ht<Socket> htVar3, ht<Socket> htVar4) {
        this.Z = cls;
        this.I = htVar;
        this.Code = htVar2;
        this.V = htVar3;
        this.B = htVar4;
    }

    private boolean B(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return Z(str, cls, obj);
        }
    }

    private static boolean Code() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static hv I() {
        Class<?> cls;
        ht htVar;
        ht htVar2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            ht htVar3 = new ht(null, "setUseSessionTickets", Boolean.TYPE);
            ht htVar4 = new ht(null, "setHostname", String.class);
            if (Code()) {
                htVar = new ht(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                htVar2 = new ht(null, "setAlpnProtocols", byte[].class);
            } else {
                htVar = null;
                htVar2 = null;
            }
            return new hn(cls, htVar3, htVar4, htVar, htVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    private boolean Z(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.Z(str);
        }
    }

    @Override // com.facetec.sdk.hv
    public final Object B(String str) {
        return this.D.Code(str);
    }

    @Override // com.facetec.sdk.hv
    public final void Code(int i2, String str, @Nullable Throwable th) {
        int iMin;
        if (i2 != 5) {
        }
        if (th != null) {
            str = new StringBuilder().append(str).append('\n').append(Log.getStackTraceString(th)).toString();
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + 4000);
                str.substring(i3, iMin);
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.facetec.sdk.hv
    public final void Code(String str, Object obj) {
        if (this.D.B(obj)) {
            return;
        }
        Code(5, str, (Throwable) null);
    }

    @Override // com.facetec.sdk.hv
    public final cf.I I(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new Z(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.I(x509TrustManager);
        }
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    protected final X509TrustManager I(SSLSocketFactory sSLSocketFactory) {
        Object objCode = Code(sSLSocketFactory, this.Z, "sslParameters");
        if (objCode == null) {
            try {
                objCode = Code(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.I(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) Code(objCode, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) Code(objCode, X509TrustManager.class, "trustManager");
    }

    @Override // com.facetec.sdk.hv
    public final void I(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (!gg.I(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (SecurityException e4) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e4);
            throw iOException2;
        }
    }

    @Override // com.facetec.sdk.hv
    public final hx V(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new Code(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.V(x509TrustManager);
        }
    }

    @Override // com.facetec.sdk.hv
    public final SSLContext V() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // com.facetec.sdk.hv
    public final void V(SSLSocket sSLSocket, String str, List<fx> list) {
        if (str != null) {
            this.I.B(sSLSocket, Boolean.TRUE);
            this.Code.B(sSLSocket, str);
        }
        ht<Socket> htVar = this.B;
        if (htVar == null || !htVar.V(sSLSocket)) {
            return;
        }
        this.B.I(sSLSocket, I(list));
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    public final String Z(SSLSocket sSLSocket) {
        byte[] bArr;
        ht<Socket> htVar = this.V;
        if (htVar == null || !htVar.V(sSLSocket) || (bArr = (byte[]) this.V.I(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, gg.Code);
    }

    @Override // com.facetec.sdk.hv
    public final boolean Z(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return B(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.Z(str);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw gg.I("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw gg.I("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw gg.I("unable to determine cleartext support", e);
        }
    }
}
