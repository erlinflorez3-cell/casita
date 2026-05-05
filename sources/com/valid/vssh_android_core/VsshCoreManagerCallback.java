package com.valid.vssh_android_core;

import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCoreManagerCallback {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    void coreClientHelloResponse(ClientHelloModelResponse clientHelloModelResponse);

    void coreErrorResponse(Integer num, Integer num2, String str);

    void coreGenericResponse(String str, Integer num, String str2);

    void coreGenericResponse(String str, Integer num, String str2, String str3);

    void setupResponse(boolean z2);
}
