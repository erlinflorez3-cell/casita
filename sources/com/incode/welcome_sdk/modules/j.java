package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10715b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10716e = 1;

    public j() {
        super(Modules.NAME_CAPTURE);
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10715b + 7;
        f10716e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10715b + 65;
        f10716e = i5 % 128;
        int i6 = i5 % 2;
    }
}
