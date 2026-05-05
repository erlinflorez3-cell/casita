package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import com.incode.welcome_sdk.commons.RecogManager;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4941a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4942e = 1;

    @Provides
    @Singleton
    public final RecogManager b(Application application, SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        RecogManager recogManagerB = new com.incode.welcome_sdk.commons.i(application, sharedPreferences).b();
        int i3 = f4941a + 3;
        f4942e = i3 % 128;
        int i4 = i3 % 2;
        return recogManagerB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecogManager b(Lazy lazy) {
        int i2 = 2 % 2;
        int i3 = f4942e + 31;
        f4941a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        RecogManager recogManager = (RecogManager) lazy.get();
        int i5 = f4941a + 25;
        f4942e = i5 % 128;
        int i6 = i5 % 2;
        return recogManager;
    }

    @Provides
    @Singleton
    public final Observable<RecogManager> d(final Lazy<RecogManager> lazy) {
        int i2 = 2 % 2;
        int i3 = f4941a + 107;
        f4942e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        Observable<RecogManager> observableObserveOn = Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.e.n$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.b(lazy);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "");
        int i5 = f4941a + 57;
        f4942e = i5 % 128;
        if (i5 % 2 != 0) {
            return observableObserveOn;
        }
        throw null;
    }
}
