package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10668b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10669c = 0;

    public c() {
        super(Modules.ACCEPT_VIDEO_SELFIE);
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10669c + 123;
        f10668b = i3 % 128;
        if (i3 % 2 != 0) {
            verifyNotAfter(list, Modules.VIDEO_ONBOARDING);
            int i4 = f10668b + 101;
            f10669c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
                return;
            }
            return;
        }
        verifyNotAfter(list, Modules.VIDEO_ONBOARDING);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
