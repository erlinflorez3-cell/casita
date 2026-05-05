package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class aj implements Factory<com.incode.welcome_sdk.data.remote.e.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4877d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4878e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Retrofit> f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final al f4880b;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4877d + 95;
        f4878e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            d();
            throw null;
        }
        com.incode.welcome_sdk.data.remote.e.c cVarD = d();
        int i4 = f4877d + 115;
        f4878e = i4 % 128;
        if (i4 % 2 != 0) {
            return cVarD;
        }
        obj.hashCode();
        throw null;
    }

    private aj(al alVar, Provider<Retrofit> provider) {
        this.f4880b = alVar;
        this.f4879a = provider;
    }

    private com.incode.welcome_sdk.data.remote.e.c d() {
        int i2 = 2 % 2;
        int i3 = f4877d + 57;
        f4878e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarC = c(this.f4880b, this.f4879a.get());
        int i5 = f4878e + 3;
        f4877d = i5 % 128;
        int i6 = i5 % 2;
        return cVarC;
    }

    public static aj c(al alVar, Provider<Retrofit> provider) {
        int i2 = 2 % 2;
        aj ajVar = new aj(alVar, provider);
        int i3 = f4878e + 5;
        f4877d = i3 % 128;
        int i4 = i3 % 2;
        return ajVar;
    }

    private static com.incode.welcome_sdk.data.remote.e.c c(al alVar, Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4878e + 99;
        f4877d = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVar = (com.incode.welcome_sdk.data.remote.e.c) Preconditions.checkNotNullFromProvides(alVar.e(retrofit));
        int i5 = f4877d + 9;
        f4878e = i5 % 128;
        if (i5 % 2 != 0) {
            return cVar;
        }
        throw null;
    }
}
