package com.incode.welcome_sdk.modules.exceptions;

import com.incode.welcome_sdk.modules.Modules;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleNotAvailableException extends ModuleConfigurationException {
    public ModuleNotAvailableException(Modules modules) {
        super(new StringBuilder("Module ").append(modules.name()).append(" not available for current configuration. Please check your configuration.").toString());
    }

    public ModuleNotAvailableException() {
        super("Module not available for current configuration. Please check your configuration.");
    }
}
