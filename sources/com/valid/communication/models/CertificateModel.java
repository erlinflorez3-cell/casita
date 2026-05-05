package com.valid.communication.models;

import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes5.dex */
public class CertificateModel {
    private Certificate certificate;
    private String domainServer;

    public class ParseException extends RuntimeException {
    }

    public CertificateModel(Certificate certificate, String str) {
        this.certificate = certificate;
        this.domainServer = str;
    }

    public Certificate getCertificate() {
        return this.certificate;
    }

    public String getDomainServer() {
        return this.domainServer;
    }

    public void setCertificate(Certificate certificate) {
        try {
            this.certificate = certificate;
        } catch (ParseException unused) {
        }
    }

    public void setDomainServer(String str) {
        try {
            this.domainServer = str;
        } catch (ParseException unused) {
        }
    }

    public String toString() {
        return this.domainServer;
    }
}
