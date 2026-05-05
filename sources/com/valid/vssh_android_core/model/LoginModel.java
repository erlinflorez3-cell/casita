package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class LoginModel extends BaseModel {
    public String password;
    public String publicKey;

    public class Exception extends RuntimeException {
    }

    public String getPassword() {
        return this.password;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPassword(String str) {
        try {
            this.password = str;
        } catch (Exception unused) {
        }
    }

    public void setPublicKey(String str) {
        try {
            this.publicKey = str;
        } catch (Exception unused) {
        }
    }
}
