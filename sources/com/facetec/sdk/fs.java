package com.facetec.sdk;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class fs {
    private final List<Certificate> B;
    private final ff I;
    private final fz V;
    private final List<Certificate> Z;

    private fs(fz fzVar, ff ffVar, List<Certificate> list, List<Certificate> list2) {
        this.V = fzVar;
        this.I = ffVar;
        this.B = list;
        this.Z = list2;
    }

    public static fs Code(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        ff ffVarZ = ff.Z(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        fz fzVarI = fz.I(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listCode = peerCertificates != null ? gg.Code(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new fs(fzVarI, ffVarZ, listCode, localCertificates != null ? gg.Code(localCertificates) : Collections.emptyList());
    }

    public final ff Code() {
        return this.I;
    }

    public final List<Certificate> I() {
        return this.B;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return this.V.equals(fsVar.V) && this.I.equals(fsVar.I) && this.B.equals(fsVar.B) && this.Z.equals(fsVar.Z);
    }

    public final int hashCode() {
        return ((((((this.V.hashCode() + 527) * 31) + this.I.hashCode()) * 31) + this.B.hashCode()) * 31) + this.Z.hashCode();
    }
}
