package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class ValidateOtpModel extends BaseModel {
    public String otp;

    public class NullPointerException extends RuntimeException {
    }

    public String getOtp() {
        return this.otp;
    }

    public void setOtp(String str) {
        try {
            this.otp = str;
        } catch (NullPointerException unused) {
        }
    }
}
