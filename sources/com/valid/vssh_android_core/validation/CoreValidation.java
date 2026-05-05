package com.valid.vssh_android_core.validation;

import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.GenerateOtpModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.ValidateOtpModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreValidation {

    public class IOException extends RuntimeException {
    }

    void generateOtp(GenerateOtpModel generateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void generateOtp(GenerateOtpModel generateOtpModel, CoreValidationCallback coreValidationCallback) throws CommunicationException;

    void validateOtp(ValidateOtpModel validateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void validateOtp(ValidateOtpModel validateOtpModel, CoreValidationCallback coreValidationCallback) throws CommunicationException;
}
