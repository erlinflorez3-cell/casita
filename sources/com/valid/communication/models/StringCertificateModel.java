package com.valid.communication.models;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class StringCertificateModel {
    private List<String> certificate;
    private String domainServer;

    public class IOException extends RuntimeException {
    }

    public List<String> getCertificate() {
        return this.certificate;
    }

    public String getDomainServer() {
        return this.domainServer;
    }

    public void setCertificate(List<String> list) {
        try {
            this.certificate = list;
        } catch (IOException unused) {
        }
    }

    public void setDomainServer(String str) {
        try {
            this.domainServer = str;
        } catch (IOException unused) {
        }
    }
}
