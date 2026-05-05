package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements Factory<PublishSubject<com.incode.welcome_sdk.data.remote.d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4999a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5000b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ad f5001d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4999a + 87;
        f5000b = i3 % 128;
        int i4 = i3 % 2;
        PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubjectB = b();
        int i5 = f5000b + 103;
        f4999a = i5 % 128;
        if (i5 % 2 == 0) {
            return publishSubjectB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private z(ad adVar) {
        this.f5001d = adVar;
    }

    private PublishSubject<com.incode.welcome_sdk.data.remote.d> b() {
        int i2 = 2 % 2;
        int i3 = f5000b + 97;
        f4999a = i3 % 128;
        int i4 = i3 % 2;
        PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubjectD = d(this.f5001d);
        int i5 = f5000b + 79;
        f4999a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return publishSubjectD;
    }

    public static z a(ad adVar) {
        int i2 = 2 % 2;
        z zVar = new z(adVar);
        int i3 = f4999a + 61;
        f5000b = i3 % 128;
        if (i3 % 2 != 0) {
            return zVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static PublishSubject<com.incode.welcome_sdk.data.remote.d> d(ad adVar) {
        int i2 = 2 % 2;
        int i3 = f5000b + 109;
        f4999a = i3 % 128;
        int i4 = i3 % 2;
        PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubject = (PublishSubject) Preconditions.checkNotNullFromProvides(adVar.d());
        int i5 = f4999a + 15;
        f5000b = i5 % 128;
        int i6 = i5 % 2;
        return publishSubject;
    }
}
