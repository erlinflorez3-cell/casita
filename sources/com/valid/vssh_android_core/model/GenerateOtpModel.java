package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class GenerateOtpModel extends BaseModel {
    public String cellphone;
    public String email;

    public class NullPointerException extends RuntimeException {
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCellphone(String str) {
        try {
            this.cellphone = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setEmail(String str) {
        try {
            this.email = str;
        } catch (NullPointerException unused) {
        }
    }
}
