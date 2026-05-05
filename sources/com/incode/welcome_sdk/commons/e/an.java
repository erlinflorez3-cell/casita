package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class an implements Factory<com.incode.welcome_sdk.data.remote.e.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4890a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4891b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final al f4892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Retrofit> f4893d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4890a + 125;
        f4891b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarE = e();
        int i5 = f4891b + 89;
        f4890a = i5 % 128;
        int i6 = i5 % 2;
        return cVarE;
    }

    private an(al alVar, Provider<Retrofit> provider) {
        this.f4892c = alVar;
        this.f4893d = provider;
    }

    private com.incode.welcome_sdk.data.remote.e.c e() {
        int i2 = 2 % 2;
        int i3 = f4891b + 87;
        f4890a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarD = d(this.f4892c, this.f4893d.get());
        int i5 = f4890a + 7;
        f4891b = i5 % 128;
        if (i5 % 2 == 0) {
            return cVarD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static an e(al alVar, Provider<Retrofit> provider) {
        int i2 = 2 % 2;
        an anVar = new an(alVar, provider);
        int i3 = f4890a + 11;
        f4891b = i3 % 128;
        int i4 = i3 % 2;
        return anVar;
    }

    private static com.incode.welcome_sdk.data.remote.e.c d(al alVar, Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4890a + 105;
        f4891b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVar = (com.incode.welcome_sdk.data.remote.e.c) Preconditions.checkNotNullFromProvides(alVar.b(retrofit));
        int i5 = f4891b + 29;
        f4890a = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }
}
