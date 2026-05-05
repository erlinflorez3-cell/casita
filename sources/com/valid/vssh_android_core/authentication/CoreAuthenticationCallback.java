package com.valid.vssh_android_core.authentication;

import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreAuthenticationCallback extends BaseVsshCoreCallback {

    public class Exception extends RuntimeException {
    }

    void onClientHelloResponse(ClientHelloModelResponse clientHelloModelResponse);
}
