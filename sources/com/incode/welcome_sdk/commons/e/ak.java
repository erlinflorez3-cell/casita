package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.IncodeWelcome;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class ak implements Factory<IncodeWelcome.SSLConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4881a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4882c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ad f4883e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4882c + 37;
        f4881a = i3 % 128;
        if (i3 % 2 == 0) {
            b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IncodeWelcome.SSLConfig sSLConfigB = b();
        int i4 = f4881a + 91;
        f4882c = i4 % 128;
        int i5 = i4 % 2;
        return sSLConfigB;
    }

    private ak(ad adVar) {
        this.f4883e = adVar;
    }

    private IncodeWelcome.SSLConfig b() {
        int i2 = 2 % 2;
        int i3 = f4882c + 37;
        f4881a = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.SSLConfig sSLConfigA = a(this.f4883e);
        int i5 = f4882c + 1;
        f4881a = i5 % 128;
        int i6 = i5 % 2;
        return sSLConfigA;
    }

    public static ak e(ad adVar) {
        int i2 = 2 % 2;
        ak akVar = new ak(adVar);
        int i3 = f4882c + 97;
        f4881a = i3 % 128;
        int i4 = i3 % 2;
        return akVar;
    }

    private static IncodeWelcome.SSLConfig a(ad adVar) {
        int i2 = 2 % 2;
        int i3 = f4881a + 95;
        f4882c = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.SSLConfig sSLConfigA = adVar.a();
        int i5 = f4881a + 7;
        f4882c = i5 % 128;
        if (i5 % 2 == 0) {
            return sSLConfigA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
