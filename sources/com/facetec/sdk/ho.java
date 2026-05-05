package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
final class ho extends hv {
    private Method B;
    private Method Code;

    private ho(Method method, Method method2) {
        this.Code = method;
        this.B = method2;
    }

    public static ho Code() {
        try {
            return new ho(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.facetec.sdk.hv
    public final X509TrustManager I(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // com.facetec.sdk.hv
    public final void V(SSLSocket sSLSocket, String str, List<fx> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listB = B(list);
            this.Code.invoke(sSLParameters, listB.toArray(new String[listB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw gg.I("unable to set ssl parameters", e2);
        }
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    public final String Z(SSLSocket sSLSocket) {
        try {
            String str = (String) this.B.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw gg.I("unable to get selected protocols", e2);
        }
    }
}
