package com.reactnativeincodesdk;

/* JADX INFO: loaded from: classes5.dex */
public enum IncodeSdkInitError {
    SIMULATOR_DETECTED("simulatorDetected"),
    TEST_MODE_ENABLED("testModeEnabled"),
    INVALID_INIT_PARAMS("invalidInitParams"),
    CONFIG_ERROR("configError"),
    ACTIVITY_NOT_PRESENT("activityNotPresent"),
    UNKNOWN("unknown");

    private final String value;

    IncodeSdkInitError(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
