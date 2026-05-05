package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;

/* JADX INFO: loaded from: classes5.dex */
public interface DocumentValidationListener extends BaseListener {
    void onDocumentValidationCompleted(DocumentType documentType, DocumentValidationResult documentValidationResult);
}
