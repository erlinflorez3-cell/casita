package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class am implements Factory<com.incode.welcome_sdk.data.remote.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4886a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4887b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Retrofit> f4888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final al f4889d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4886a + 65;
        f4887b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVarD = d();
        int i5 = f4886a + 11;
        f4887b = i5 % 128;
        int i6 = i5 % 2;
        return aVarD;
    }

    private am(al alVar, Provider<Retrofit> provider) {
        this.f4889d = alVar;
        this.f4888c = provider;
    }

    private com.incode.welcome_sdk.data.remote.e.a d() {
        int i2 = 2 % 2;
        int i3 = f4887b + 3;
        f4886a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVarA = a(this.f4889d, this.f4888c.get());
        int i5 = f4887b + 67;
        f4886a = i5 % 128;
        int i6 = i5 % 2;
        return aVarA;
    }

    public static am d(al alVar, Provider<Retrofit> provider) {
        int i2 = 2 % 2;
        am amVar = new am(alVar, provider);
        int i3 = f4887b + 61;
        f4886a = i3 % 128;
        int i4 = i3 % 2;
        return amVar;
    }

    private static com.incode.welcome_sdk.data.remote.e.a a(al alVar, Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4886a + 23;
        f4887b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVar = (com.incode.welcome_sdk.data.remote.e.a) Preconditions.checkNotNullFromProvides(alVar.d(retrofit));
        int i5 = f4887b + 121;
        f4886a = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
