package com.reactnativeincodesdk;

/* JADX INFO: loaded from: classes5.dex */
public enum IncodeSdkErrorMessage {
    SIMULATOR_DETECTED("Emulator detected. Emulators aren't supported outside of test mode!"),
    HOOK_DETECTED("Hooking framework detected. Devices with hooking frameworks aren't supported outside of test mode!"),
    VIRTUAL_ENV_DETECTED("Virtual environment detected. Running in a virtual environment isn't supported outside of test mode!"),
    ROOT_DETECTED("Root access detected. Rooted devices aren't supported outside of test mode!"),
    BAD_ENV_DETECTED("Environment for capture is not ideal!"),
    TEST_MODE_ENABLED("Please disable test mode before deploying to a real device!"),
    FACE_AUTHENTICATION_FAILED("faceAuthenticationFailed");

    private final String errorMessage;

    IncodeSdkErrorMessage(String str) {
        this.errorMessage = str;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
