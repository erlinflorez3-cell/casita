package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.beans.IResponseDocumentScan;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentValidationResult extends BaseResult {
    public static final int $stable = 8;
    public IncodeWelcome.AddressFields addressFields;
    public String documentPath;
    public String mimeType;
    private final Map<DocumentType, IResponseDocumentScan> results;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode) {
        this(resultCode, null, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode, Throwable th, String str) {
        this(resultCode, th, str, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode, Throwable th, String str, IncodeWelcome.AddressFields addressFields) {
        this(resultCode, th, str, addressFields, null, null, 48, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode, Throwable th, String str, IncodeWelcome.AddressFields addressFields, String mimeType) {
        this(resultCode, th, str, addressFields, mimeType, null, 32, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
    }

    public /* synthetic */ DocumentValidationResult(ResultCode resultCode, Throwable th, String str, IncodeWelcome.AddressFields addressFields, String str2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str, (i2 & 8) == 0 ? addressFields : null, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? new HashMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentValidationResult(ResultCode resultCode, Throwable th, String str, IncodeWelcome.AddressFields addressFields, String mimeType, Map<DocumentType, IResponseDocumentScan> results) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(results, "results");
        this.documentPath = str;
        this.addressFields = addressFields;
        this.mimeType = mimeType;
        this.results = results;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "DocumentValidationResult{documentPath='" + this.documentPath + "', addressFields=" + this.addressFields + ", results=" + this.results + "}";
    }

    public final ResponseMedicalDoc getMedicalDocData() {
        return (ResponseMedicalDoc) getResult(DocumentType.MEDICAL_DOC);
    }

    public final ResponseOCRData getAddressStatementData() {
        return (ResponseOCRData) getResult(DocumentType.ADDRESS_STATEMENT);
    }

    private final IResponseDocumentScan getResult(DocumentType documentType) {
        return this.results.get(documentType);
    }

    public final void setResult(DocumentType documentType, IResponseDocumentScan result) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(result, "result");
        this.results.put(documentType, result);
    }
}
