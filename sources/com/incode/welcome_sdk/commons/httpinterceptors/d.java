package com.incode.welcome_sdk.commons.httpinterceptors;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Factory<com.incode.welcome_sdk.commons.httpinterceptors.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5200a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5201c = 1;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        com.incode.welcome_sdk.commons.httpinterceptors.b bVarA;
        int i2 = 2 % 2;
        int i3 = f5201c + 5;
        f5200a = i3 % 128;
        if (i3 % 2 != 0) {
            bVarA = a();
            int i4 = 73 / 0;
        } else {
            bVarA = a();
        }
        int i5 = f5200a + 111;
        f5201c = i5 % 128;
        int i6 = i5 % 2;
        return bVarA;
    }

    private static com.incode.welcome_sdk.commons.httpinterceptors.b a() {
        int i2 = 2 % 2;
        int i3 = f5200a + 67;
        f5201c = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.b bVarD = d();
        int i5 = f5201c + 17;
        f5200a = i5 % 128;
        if (i5 % 2 == 0) {
            return bVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static d b() {
        int i2 = 2 % 2;
        int i3 = f5201c + 13;
        f5200a = i3 % 128;
        int i4 = i3 % 2;
        d dVar = b.f5203d;
        int i5 = f5200a + 115;
        f5201c = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    private static com.incode.welcome_sdk.commons.httpinterceptors.b d() {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.b bVar = new com.incode.welcome_sdk.commons.httpinterceptors.b();
        int i3 = f5201c + 87;
        f5200a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return bVar;
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5202c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f5203d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5204e = 1;

        static {
            int i2 = f5204e + 99;
            f5202c = i2 % 128;
            int i3 = i2 % 2;
        }
    }
}
