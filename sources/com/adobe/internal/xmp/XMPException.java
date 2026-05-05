package com.adobe.internal.xmp;

/* JADX INFO: loaded from: classes4.dex */
public class XMPException extends Exception {
    private int errorCode;

    public XMPException(String str, int i2) {
        super(str);
        this.errorCode = i2;
    }

    public XMPException(String str, int i2, Throwable th) {
        super(str, th);
        this.errorCode = i2;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
