package com.incode.welcome_sdk.modules.exceptions;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleConfigurationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleConfigurationException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
