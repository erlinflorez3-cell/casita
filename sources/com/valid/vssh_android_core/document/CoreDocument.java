package com.valid.vssh_android_core.document;

import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.DocumentTypeModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.ScanDocumentModel;
import com.valid.vssh_android_core.model.UploadImageModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import com.valid.vssh_android_core.model.response.ScanDocumentModelResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreDocument {

    public class Exception extends RuntimeException {
    }

    void getDocumentType(DocumentTypeModel documentTypeModel, LambdaSuccess<DocumentTypeResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void scanDocument(ScanDocumentModel scanDocumentModel, LambdaSuccess<ScanDocumentModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void uploadImage(UploadImageModel uploadImageModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException;
}
