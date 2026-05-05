package com.reactnativeincodesdk;

/* JADX INFO: loaded from: classes5.dex */
public class UnknownModuleException extends IllegalArgumentException {
    public UnknownModuleException(String str) {
        super("Unknown module " + str + " specified in Onboarding configuration");
    }
}
