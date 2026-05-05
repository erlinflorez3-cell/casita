package com.valid.vssh_android_core.model.response;

/* JADX INFO: loaded from: classes5.dex */
public class ProcessImageResponse {
    public String firstPart;
    public String secondPart;

    public class IOException extends RuntimeException {
    }

    public String getFirstPart() {
        return this.firstPart;
    }

    public String getSecondPart() {
        return this.secondPart;
    }

    public void setFirstPart(String str) {
        try {
            this.firstPart = str;
        } catch (IOException unused) {
        }
    }

    public void setSecondPart(String str) {
        try {
            this.secondPart = str;
        } catch (IOException unused) {
        }
    }
}
