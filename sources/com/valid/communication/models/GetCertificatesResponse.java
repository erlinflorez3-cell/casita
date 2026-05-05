package com.valid.communication.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class GetCertificatesResponse {

    @SerializedName(alternate = {}, value = "\n\u000b\u0017\u0018\f\b\n\u0003\u007f\u0012\u0002\u000f")
    @InterfaceC1492Gx
    private List<StringCertificateModel> certificates;

    public class Exception extends RuntimeException {
    }

    public List<StringCertificateModel> getCertificates() {
        return this.certificates;
    }

    public void setCertificates(List<StringCertificateModel> list) {
        try {
            this.certificates = list;
        } catch (Exception unused) {
        }
    }
}
