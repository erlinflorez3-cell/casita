package com.valid.vssh_android_core.model;

import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class RecoveryModel extends BaseModel {
    public String password;
    public String publicKey;

    public class ParseException extends RuntimeException {
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
        } catch (ParseException unused) {
        }
    }

    public void setPublicKey(String str) {
        try {
            this.publicKey = str;
        } catch (ParseException unused) {
        }
    }
}
