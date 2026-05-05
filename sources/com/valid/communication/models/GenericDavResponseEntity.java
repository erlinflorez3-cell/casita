package com.valid.communication.models;

/* JADX INFO: loaded from: classes5.dex */
public class GenericDavResponseEntity {
    private String data;

    public class NullPointerException extends RuntimeException {
    }

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        try {
            this.data = str;
        } catch (NullPointerException unused) {
        }
    }
}
