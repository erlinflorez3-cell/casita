package com.google.android.gms.tapandpay.issuer;

/* JADX INFO: loaded from: classes8.dex */
public class GeneratePaymentCredentialsException extends Exception {
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNSUPPORTED_TOKEN_REQUESTOR_ID = 1;
    public final int errorCode;

    public @interface ErrorCode {
    }

    public GeneratePaymentCredentialsException(int i2) {
        this.errorCode = i2;
    }
}
