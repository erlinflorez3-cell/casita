package com.valid.vssh_android_core.model.response;

import com.google.gson.annotations.SerializedName;
import com.valid.vssh_android_core.basecore.BaseResponse;
import java.util.List;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class DocumentTypeResponse extends BaseResponse {

    @SerializedName(alternate = {}, value = "\u000b\u0015\b\u0019\u0010\u0007\u000f\u0014r\u0017\r\u0001\u000e")
    @InterfaceC1492Gx
    public List<DocumentType> documentTypes;

    public class IOException extends RuntimeException {
    }

    public List<DocumentType> getDocumentTypes() {
        return this.documentTypes;
    }

    public void setDocumentTypes(List<DocumentType> list) {
        try {
            this.documentTypes = list;
        } catch (IOException unused) {
        }
    }
}
