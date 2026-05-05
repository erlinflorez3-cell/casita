package com.valid.vssh_android_core.generic;

import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreGeneric<T> {

    public class ParseException extends RuntimeException {
    }

    void consumeGenericService(GenericModel genericModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;

    void consumeGenericService(GenericModel genericModel, Class<T> cls, LambdaSuccess<T> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException;
}
