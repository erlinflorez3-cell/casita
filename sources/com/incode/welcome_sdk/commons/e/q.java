package com.incode.welcome_sdk.commons.e;

import com.incode.recogkitandroid.IdCaptureKitAndroid;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.Observable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements Factory<Observable<IdCaptureKitAndroid>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4961b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4962d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f4963a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<IdCaptureKitAndroid> f4964c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4962d + 83;
        f4961b = i3 % 128;
        int i4 = i3 % 2;
        Observable<IdCaptureKitAndroid> observableA = a();
        int i5 = f4962d + 67;
        f4961b = i5 % 128;
        if (i5 % 2 == 0) {
            return observableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private q(p pVar, Provider<IdCaptureKitAndroid> provider) {
        this.f4963a = pVar;
        this.f4964c = provider;
    }

    private Observable<IdCaptureKitAndroid> a() {
        int i2 = 2 % 2;
        int i3 = f4962d + 15;
        f4961b = i3 % 128;
        int i4 = i3 % 2;
        p pVar = this.f4963a;
        if (i4 == 0) {
            return c(pVar, DoubleCheck.lazy(this.f4964c));
        }
        c(pVar, DoubleCheck.lazy(this.f4964c));
        throw null;
    }

    public static q d(p pVar, Provider<IdCaptureKitAndroid> provider) {
        int i2 = 2 % 2;
        q qVar = new q(pVar, provider);
        int i3 = f4961b + 31;
        f4962d = i3 % 128;
        if (i3 % 2 != 0) {
            return qVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Observable<IdCaptureKitAndroid> c(p pVar, Lazy<IdCaptureKitAndroid> lazy) {
        int i2 = 2 % 2;
        int i3 = f4962d + 57;
        f4961b = i3 % 128;
        int i4 = i3 % 2;
        Observable<IdCaptureKitAndroid> observable = (Observable) Preconditions.checkNotNullFromProvides(pVar.c(lazy));
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        int i6 = f4962d + 61;
        f4961b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
        return observable;
    }
}
