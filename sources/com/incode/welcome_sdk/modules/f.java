package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends BaseModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10679c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10680d = 0;

    public f() {
        super(Modules.GEOLOCATION);
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10679c + 1;
        f10680d = i3 % 128;
        int i4 = i3 % 2;
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10679c + 43;
        f10680d = i5 % 128;
        int i6 = i5 % 2;
    }
}
