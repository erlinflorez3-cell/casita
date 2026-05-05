package com.valid.vssh_android_core.authentication;

import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.ClientHelloModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.LoginModel;
import com.valid.vssh_android_core.model.RecoveryModel;
import com.valid.vssh_android_core.model.RegisterModel;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreAuthentication {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    void clientHello(ClientHelloModel clientHelloModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException;

    void clientHello(ClientHelloModel clientHelloModel, LambdaSuccess<ClientHelloModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void login(LoginModel loginModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException;

    void login(LoginModel loginModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException;

    void recovery(RecoveryModel recoveryModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException;

    void recovery(RecoveryModel recoveryModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException;

    void register(RegisterModel registerModel, CoreAuthenticationCallback coreAuthenticationCallback) throws CommunicationException, IOException;

    void register(RegisterModel registerModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException;
}
