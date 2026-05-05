package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.commons.RecogManager;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.Observable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements Factory<Observable<RecogManager>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4931a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4932c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<RecogManager> f4933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f4934e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4931a + 35;
        f4932c = i3 % 128;
        int i4 = i3 % 2;
        Observable<RecogManager> observableA = a();
        int i5 = f4932c + 83;
        f4931a = i5 % 128;
        if (i5 % 2 != 0) {
            return observableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private k(n nVar, Provider<RecogManager> provider) {
        this.f4934e = nVar;
        this.f4933d = provider;
    }

    private Observable<RecogManager> a() {
        int i2 = 2 % 2;
        int i3 = f4932c + 15;
        f4931a = i3 % 128;
        int i4 = i3 % 2;
        Observable<RecogManager> observableE = e(this.f4934e, DoubleCheck.lazy(this.f4933d));
        int i5 = f4932c + 87;
        f4931a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return observableE;
    }

    public static k b(n nVar, Provider<RecogManager> provider) {
        int i2 = 2 % 2;
        k kVar = new k(nVar, provider);
        int i3 = f4932c + 95;
        f4931a = i3 % 128;
        int i4 = i3 % 2;
        return kVar;
    }

    private static Observable<RecogManager> e(n nVar, Lazy<RecogManager> lazy) {
        int i2 = 2 % 2;
        int i3 = f4932c + 21;
        f4931a = i3 % 128;
        int i4 = i3 % 2;
        Observable<RecogManager> observable = (Observable) Preconditions.checkNotNullFromProvides(nVar.d(lazy));
        int i5 = f4931a + 39;
        f4932c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return observable;
    }
}
