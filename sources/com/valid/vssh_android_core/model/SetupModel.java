package com.valid.vssh_android_core.model;

import android.content.Context;
import com.valid.security.entities.TransformAes;
import com.valid.vssh_android_core.basecore.BaseModel;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SetupModel extends BaseModel {
    public String apiExchange;
    public String apiGetCertificates;
    public Context context;
    public Map<String, Object> exchangeAdditionalData;
    public String exchangeEndPoint;
    public Map<String, String> exchangeHeaders;
    public String publicKey;
    public TransformAes transformAes;
    public String urlBase;

    public class Exception extends RuntimeException {
    }

    public String getApiExchange() {
        return this.apiExchange;
    }

    public String getApiGetCertificates() {
        return this.apiGetCertificates;
    }

    public Context getContext() {
        return this.context;
    }

    public Map<String, Object> getExchangeAdditionalData() {
        return this.exchangeAdditionalData;
    }

    public String getExchangeEndPoint() {
        return this.exchangeEndPoint;
    }

    public Map<String, String> getExchangeHeaders() {
        return this.exchangeHeaders;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public TransformAes getTransformAes() {
        return this.transformAes;
    }

    public String getUrlBase() {
        return this.urlBase;
    }

    public void setApiExchange(String str) {
        try {
            this.apiExchange = str;
        } catch (Exception unused) {
        }
    }

    public void setApiGetCertificates(String str) {
        try {
            this.apiGetCertificates = str;
        } catch (Exception unused) {
        }
    }

    public void setContext(Context context) {
        try {
            this.context = context;
        } catch (Exception unused) {
        }
    }

    public void setExchangeAdditionalData(Map<String, Object> map) {
        try {
            this.exchangeAdditionalData = map;
        } catch (Exception unused) {
        }
    }

    public void setExchangeEndPoint(String str) {
        try {
            this.exchangeEndPoint = str;
        } catch (Exception unused) {
        }
    }

    public void setExchangeHeaders(Map<String, String> map) {
        try {
            this.exchangeHeaders = map;
        } catch (Exception unused) {
        }
    }

    public void setPublicKey(String str) {
        try {
            this.publicKey = str;
        } catch (Exception unused) {
        }
    }

    public void setTransformAes(TransformAes transformAes) {
        try {
            this.transformAes = transformAes;
        } catch (Exception unused) {
        }
    }

    public void setUrlBase(String str) {
        try {
            this.urlBase = str;
        } catch (Exception unused) {
        }
    }
}
