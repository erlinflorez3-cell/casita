package com.incode.welcome_sdk.modules.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidModuleOrderException extends ModuleConfigurationException {
    public InvalidModuleOrderException(String str) {
        super(str);
    }

    public InvalidModuleOrderException() {
        super("Invalid order of modules. Please check your configuration.");
    }
}
