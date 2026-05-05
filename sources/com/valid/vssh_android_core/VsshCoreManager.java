package com.valid.vssh_android_core;

import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.vssh_android_core.card.CoreCardCallback;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.CardInformationModel;
import com.valid.vssh_android_core.model.ClientHelloModel;
import com.valid.vssh_android_core.model.DocumentTypeModel;
import com.valid.vssh_android_core.model.GenerateOtpModel;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.LoginModel;
import com.valid.vssh_android_core.model.PayModel;
import com.valid.vssh_android_core.model.RecoveryModel;
import com.valid.vssh_android_core.model.RegisterModel;
import com.valid.vssh_android_core.model.ScanDocumentModel;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.TransactionsModel;
import com.valid.vssh_android_core.model.UploadImageModel;
import com.valid.vssh_android_core.model.ValidateOtpModel;
import com.valid.vssh_android_core.model.response.CardAccountInfoResponse;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import com.valid.vssh_android_core.model.response.PayResponse;
import com.valid.vssh_android_core.model.response.ScanDocumentModelResponse;
import com.valid.vssh_android_core.model.response.TransactionsResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCoreManager {

    public class IOException extends RuntimeException {
    }

    void cardAccountInfo(CardInformationModel cardInformationModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void cardAccountInfo(CardInformationModel cardInformationModel, LambdaSuccess<CardAccountInfoResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void clientHello(ClientHelloModel clientHelloModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException;

    void clientHello(ClientHelloModel clientHelloModel, LambdaSuccess<ClientHelloModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void consumeGenericService(GenericModel genericModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    <T> void consumeGenericService(GenericModel genericModel, Class<T> cls, LambdaSuccess<T> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void generateOtp(GenerateOtpModel generateOtpModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException;

    void generateOtp(GenerateOtpModel generateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    CommunicationManager getCommunicationManager();

    void getDocumentType(DocumentTypeModel documentTypeModel, LambdaSuccess<DocumentTypeResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void getTransactions(TransactionsModel transactionsModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void getTransactions(TransactionsModel transactionsModel, LambdaSuccess<TransactionsResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void login(LoginModel loginModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, java.io.IOException;

    void login(LoginModel loginModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, java.io.IOException;

    void pay(PayModel payModel, CoreCardCallback coreCardCallback) throws CommunicationException;

    void pay(PayModel payModel, LambdaSuccess<PayResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void recovery(RecoveryModel recoveryModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, java.io.IOException;

    void recovery(RecoveryModel recoveryModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, java.io.IOException;

    void register(RegisterModel registerModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, java.io.IOException;

    void register(RegisterModel registerModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, java.io.IOException;

    void scanDocument(ScanDocumentModel scanDocumentModel, LambdaSuccess<ScanDocumentModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void setCommunicationManager(CommunicationManager communicationManager);

    void setup(SetupModel setupModel, VsshCoreManagerCallback vsshCoreManagerCallback);

    void setup(SetupModel setupModel, LambdaSuccess<Boolean> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError);

    void setup(SetupModel setupModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void uploadImage(UploadImageModel uploadImageModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, java.io.IOException;

    void validateOtp(ValidateOtpModel validateOtpModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException;

    void validateOtp(ValidateOtpModel validateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;
}
