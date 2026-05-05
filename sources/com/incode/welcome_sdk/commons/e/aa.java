package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class aa implements Factory<com.incode.welcome_sdk.commons.httpinterceptors.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4826b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4827e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ad f4828a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<PublishSubject<com.incode.welcome_sdk.data.remote.d>> f4829c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4826b + 29;
        f4827e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.h hVarE = e();
        int i5 = f4826b + 69;
        f4827e = i5 % 128;
        if (i5 % 2 != 0) {
            return hVarE;
        }
        throw null;
    }

    private aa(ad adVar, Provider<PublishSubject<com.incode.welcome_sdk.data.remote.d>> provider) {
        this.f4828a = adVar;
        this.f4829c = provider;
    }

    private com.incode.welcome_sdk.commons.httpinterceptors.h e() {
        int i2 = 2 % 2;
        int i3 = f4827e + 27;
        f4826b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.h hVarA = a(this.f4828a, this.f4829c.get());
        int i5 = f4826b + 77;
        f4827e = i5 % 128;
        int i6 = i5 % 2;
        return hVarA;
    }

    public static aa a(ad adVar, Provider<PublishSubject<com.incode.welcome_sdk.data.remote.d>> provider) {
        int i2 = 2 % 2;
        aa aaVar = new aa(adVar, provider);
        int i3 = f4826b + 87;
        f4827e = i3 % 128;
        int i4 = i3 % 2;
        return aaVar;
    }

    private static com.incode.welcome_sdk.commons.httpinterceptors.h a(ad adVar, PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubject) {
        int i2 = 2 % 2;
        int i3 = f4827e + 85;
        f4826b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.h hVar = (com.incode.welcome_sdk.commons.httpinterceptors.h) Preconditions.checkNotNullFromProvides(adVar.c(publishSubject));
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        int i6 = f4826b + 97;
        f4827e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return hVar;
    }
}
