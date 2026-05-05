package com.incode.welcome_sdk.modules.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public class MissingModuleException extends ModuleConfigurationException {
    public MissingModuleException(String str) {
        super(str);
    }

    public MissingModuleException() {
        super("Invalid order of modules. Please check your configuration.");
    }
}
