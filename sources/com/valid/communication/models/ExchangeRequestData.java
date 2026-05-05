package com.valid.communication.models;

/* JADX INFO: loaded from: classes5.dex */
public class ExchangeRequestData {
    private String applicationId;
    private String applicationVersion;
    private String bankPublicKey;
    private String codeValidApplication;
    private String publicKey;

    public class NullPointerException extends RuntimeException {
    }

    public ExchangeRequestData() {
    }

    public ExchangeRequestData(String str) {
        this.publicKey = str;
    }

    public ExchangeRequestData(String str, String str2, String str3, String str4) {
        this.applicationId = str;
        this.applicationVersion = str2;
        this.codeValidApplication = str3;
        this.publicKey = str4;
    }

    public ExchangeRequestData(String str, String str2, String str3, String str4, String str5) {
        this.applicationId = str;
        this.applicationVersion = str2;
        this.codeValidApplication = str3;
        this.publicKey = str4;
        this.bankPublicKey = str5;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getBankPublicKey() {
        return this.bankPublicKey;
    }

    public String getCodeValidApplication() {
        return this.codeValidApplication;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setApplicationId(String str) {
        try {
            this.applicationId = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setApplicationVersion(String str) {
        try {
            this.applicationVersion = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setBankPublicKey(String str) {
        try {
            this.bankPublicKey = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setCodeValidApplication(String str) {
        try {
            this.codeValidApplication = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setPublicKey(String str) {
        try {
            this.publicKey = str;
        } catch (NullPointerException unused) {
        }
    }
}
