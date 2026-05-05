package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10712a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10713d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10714b;

    public i() {
        super(Modules.QR_SCAN);
        this.f10714b = true;
    }

    public i(boolean z2) {
        super(Modules.QR_SCAN);
        this.f10714b = z2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f10713d + 55;
        int i4 = i3 % 128;
        f10712a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10714b;
        int i6 = i4 + 113;
        f10713d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10712a + 65;
        f10713d = i3 % 128;
        if (i3 % 2 == 0) {
            verifyAddAndProcessDataNotAfterApprove(list);
            verifyNotAfter(list, Modules.INE_VALIDATION);
            int i4 = f10712a + 57;
            f10713d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
                return;
            }
            return;
        }
        verifyAddAndProcessDataNotAfterApprove(list);
        verifyNotAfter(list, Modules.INE_VALIDATION);
        throw null;
    }
}
