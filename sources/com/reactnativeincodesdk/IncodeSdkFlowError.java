package com.reactnativeincodesdk;

/* JADX INFO: loaded from: classes5.dex */
public enum IncodeSdkFlowError {
    SIMULATOR_DETECTED("simulatorDetected"),
    ROOT_DETECTED("rootDetected"),
    VIRTUAL_ENV_DETECTED("virtualEnvDetected"),
    HOOK_DETECTED("hookDetected"),
    BAD_ENV_DETECTED("badEnvDetected"),
    PERMISSIONS_DENIED("permissionsDenied"),
    FACE_AUTHENTICATION_FAILED("faceAuthenticationFailed"),
    UNKNOWN("unknown");

    private final String value;

    IncodeSdkFlowError(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
