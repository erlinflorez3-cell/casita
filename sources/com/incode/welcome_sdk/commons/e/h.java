package com.incode.welcome_sdk.commons.e;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Factory<com.incode.welcome_sdk.data.local.a.d.b.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4919a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4920b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4921c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f4922e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4919a + 33;
        f4920b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.b.c cVarD = d();
        int i5 = f4919a + 55;
        f4920b = i5 % 128;
        int i6 = i5 % 2;
        return cVarD;
    }

    private h(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        this.f4922e = aVar;
        this.f4921c = provider;
    }

    private com.incode.welcome_sdk.data.local.a.d.b.c d() {
        int i2 = 2 % 2;
        int i3 = f4919a + 45;
        f4920b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.b.c cVarD = d(this.f4922e, this.f4921c.get());
        int i5 = f4920b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4919a = i5 % 128;
        int i6 = i5 % 2;
        return cVarD;
    }

    public static h e(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        int i2 = 2 % 2;
        h hVar = new h(aVar, provider);
        int i3 = f4920b + 107;
        f4919a = i3 % 128;
        if (i3 % 2 != 0) {
            return hVar;
        }
        throw null;
    }

    private static com.incode.welcome_sdk.data.local.a.d.b.c d(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        int i3 = f4919a + 19;
        f4920b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.b.c cVar = (com.incode.welcome_sdk.data.local.a.d.b.c) Preconditions.checkNotNullFromProvides(aVar.b(delayedOnboardingDatabase));
        int i5 = f4919a + 29;
        f4920b = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }
}
