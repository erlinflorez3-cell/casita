package com.facetec.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class hq extends hv {
    private hq() {
    }

    public static hq I() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new hq();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Provider Z() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.facetec.sdk.hv
    public final void Code(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    public final X509TrustManager I(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.I(sSLSocketFactory);
        }
        try {
            Object objCode = Code(sSLSocketFactory, (Class<Object>) Object.class, "sslParameters");
            if (objCode != null) {
                return (X509TrustManager) Code(objCode, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e2) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e2);
        }
    }

    @Override // com.facetec.sdk.hv
    public final SSLContext V() {
        try {
            return SSLContext.getInstance("TLSv1.3", Z());
        } catch (NoSuchAlgorithmException e2) {
            try {
                return SSLContext.getInstance("TLS", Z());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e2);
            }
        }
    }

    @Override // com.facetec.sdk.hv
    public final void V(SSLSocket sSLSocket, String str, List<fx> list) {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.V(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) hv.B(list).toArray(new String[0]));
    }

    @Override // com.facetec.sdk.hv
    @Nullable
    public final String Z(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.Z(sSLSocket);
    }
}
