package com.valid.vssh_android_core.vsshcoreinit;

import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCoreInit {

    public class IOException extends RuntimeException {
    }

    void exchangeKey();

    void setup(SetupModel setupModel, LambdaSuccess<Boolean> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError);

    void setup(SetupModel setupModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError);

    void setup(SetupModel setupModel, VsshCoreInitCallback vsshCoreInitCallback);
}
