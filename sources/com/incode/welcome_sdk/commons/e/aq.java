package com.incode.welcome_sdk.commons.e;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class aq implements Factory<com.incode.welcome_sdk.data.remote.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4894a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4895b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final al f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Retrofit> f4897d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4894a + 63;
        f4895b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVarC = c();
        int i5 = f4894a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4895b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return aVarC;
    }

    private aq(al alVar, Provider<Retrofit> provider) {
        this.f4896c = alVar;
        this.f4897d = provider;
    }

    private com.incode.welcome_sdk.data.remote.e.a c() {
        int i2 = 2 % 2;
        int i3 = f4895b + 23;
        f4894a = i3 % 128;
        int i4 = i3 % 2;
        al alVar = this.f4896c;
        if (i4 == 0) {
            return b(alVar, this.f4897d.get());
        }
        b(alVar, this.f4897d.get());
        throw null;
    }

    public static aq b(al alVar, Provider<Retrofit> provider) {
        int i2 = 2 % 2;
        aq aqVar = new aq(alVar, provider);
        int i3 = f4895b + 35;
        f4894a = i3 % 128;
        int i4 = i3 % 2;
        return aqVar;
    }

    private static com.incode.welcome_sdk.data.remote.e.a b(al alVar, Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4894a + 79;
        f4895b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVar = (com.incode.welcome_sdk.data.remote.e.a) Preconditions.checkNotNullFromProvides(alVar.a(retrofit));
        int i5 = f4895b + 113;
        f4894a = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        throw null;
    }
}
