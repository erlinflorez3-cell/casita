package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10717b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10718d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IncodeWelcome.IDResultsFetchMode f10719a;

    public m() {
        super(Modules.SHOW_RESULTS);
        this.f10719a = IncodeWelcome.IDResultsFetchMode.ACCURATE;
    }

    public m(IncodeWelcome.IDResultsFetchMode iDResultsFetchMode) {
        super(Modules.SHOW_RESULTS);
        IncodeWelcome.IDResultsFetchMode iDResultsFetchMode2 = IncodeWelcome.IDResultsFetchMode.ACCURATE;
        this.f10719a = iDResultsFetchMode;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10718d + 57;
        f10717b = i3 % 128;
        int i4 = i3 % 2;
        verifyIfAfterEither(list, Modules.ID, Modules.QR_SCAN);
        verifyIfAfter(list, Modules.SELFIE);
        int i5 = f10718d + 91;
        f10717b = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IncodeWelcome.IDResultsFetchMode d() {
        int i2 = 2 % 2;
        int i3 = f10718d + 71;
        f10717b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10719a;
        }
        throw null;
    }
}
