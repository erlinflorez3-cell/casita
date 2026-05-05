package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10662b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10663e = 0;

    public a() {
        super(Modules.OTP);
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10662b + 15;
        f10663e = i3 % 128;
        int i4 = i3 % 2;
    }
}
