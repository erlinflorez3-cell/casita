package com.facetec.sdk;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hx {
    public static hx V(X509TrustManager x509TrustManager) {
        return hv.B().V(x509TrustManager);
    }

    public abstract List<Certificate> B(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
