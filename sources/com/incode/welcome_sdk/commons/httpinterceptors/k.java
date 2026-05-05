package com.incode.welcome_sdk.commons.httpinterceptors;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements Factory<n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5246c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5247d = 1;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f5246c + 111;
        f5247d = i3 % 128;
        int i4 = i3 % 2;
        n nVarE = e();
        int i5 = f5247d + 75;
        f5246c = i5 % 128;
        if (i5 % 2 == 0) {
            return nVarE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static n e() {
        int i2 = 2 % 2;
        int i3 = f5247d + 87;
        f5246c = i3 % 128;
        int i4 = i3 % 2;
        n nVarC = c();
        int i5 = f5246c + 109;
        f5247d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return nVarC;
    }

    public static k d() {
        int i2 = 2 % 2;
        int i3 = f5246c + 115;
        f5247d = i3 % 128;
        int i4 = i3 % 2;
        k kVar = d.f5249b;
        int i5 = f5246c + 87;
        f5247d = i5 % 128;
        int i6 = i5 % 2;
        return kVar;
    }

    private static n c() {
        int i2 = 2 % 2;
        n nVar = new n();
        int i3 = f5246c + 75;
        f5247d = i3 % 128;
        int i4 = i3 % 2;
        return nVar;
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5248a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final k f5249b = new k();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5250e = 1;

        static {
            int i2 = f5250e + 5;
            f5248a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }
}
