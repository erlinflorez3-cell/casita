package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10670a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10671c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f10672d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f10673e = 0;

    public d() {
        super(Modules.ANTIFRAUD);
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10670a + 41;
        f10671c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int i5 = f10670a + 17;
        f10671c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static int a() {
        int i2 = f10673e;
        int i3 = i2 % 7966112;
        f10673e = i2 + 1;
        if (i3 != 0) {
            return f10672d;
        }
        int iNextInt = new Random().nextInt(177566470);
        f10672d = iNextInt;
        return iNextInt;
    }
}
