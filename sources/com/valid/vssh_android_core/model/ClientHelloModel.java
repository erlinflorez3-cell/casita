package com.valid.vssh_android_core.model;

import android.content.Context;
import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class ClientHelloModel extends BaseModel {
    public String applicationCode;
    public String applicationId;
    public String applicationVersion;
    public Context context;
    public String idData;
    public String idType;

    public class NullPointerException extends RuntimeException {
    }

    public String getApplicationCode() {
        return this.applicationCode;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public Context getContext() {
        return this.context;
    }

    public String getIdData() {
        return this.idData;
    }

    public String getIdType() {
        return this.idType;
    }

    public void setApplicationCode(String str) {
        try {
            this.applicationCode = str;
        } catch (NullPointerException unused) {
        }
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

    public void setContext(Context context) {
        try {
            this.context = context;
        } catch (NullPointerException unused) {
        }
    }

    public void setIdData(String str) {
        try {
            this.idData = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setIdType(String str) {
        try {
            this.idType = str;
        } catch (NullPointerException unused) {
        }
    }
}
