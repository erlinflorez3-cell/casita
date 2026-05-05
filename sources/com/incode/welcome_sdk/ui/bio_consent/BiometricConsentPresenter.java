package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.BiometricConsentNotGiven;
import com.incode.welcome_sdk.commons.exceptions.BiometricConsentNotReceived;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.BiometricConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentPresenter extends BaseModulePresenter implements BiometricConsentContract.Presenter {

    /* JADX INFO: renamed from: d */
    private static int f11143d = 0;

    /* JADX INFO: renamed from: e */
    private static int f11144e = 1;

    /* JADX INFO: renamed from: a */
    private final CompositeDisposable f11145a;

    /* JADX INFO: renamed from: b */
    private final BiometricConsentContract.View f11146b;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f11147c;

    public static final /* synthetic */ BiometricConsentContract.View access$getView$p(BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11144e + 53;
        f11143d = i3 % 128;
        int i4 = i3 % 2;
        BiometricConsentContract.View view = biometricConsentPresenter.f11146b;
        if (i4 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$publishConsentNotReceivedResult(BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11144e + 17;
        f11143d = i3 % 128;
        int i4 = i3 % 2;
        biometricConsentPresenter.d();
        if (i4 != 0) {
            throw null;
        }
        int i5 = f11144e + 43;
        f11143d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$publishSuccessResult(BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11144e + 83;
        f11143d = i3 % 128;
        int i4 = i3 % 2;
        biometricConsentPresenter.a();
        int i5 = f11144e + 43;
        f11143d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$publishUserCancelledResult(BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11144e + 63;
        f11143d = i3 % 128;
        int i4 = i3 % 2;
        biometricConsentPresenter.c();
        int i5 = f11143d + 37;
        f11144e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BiometricConsentPresenter(IncodeWelcomeRepository incodeWelcomeRepository, BiometricConsentContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f11147c = incodeWelcomeRepository;
        this.f11146b = view;
        this.f11145a = new CompositeDisposable();
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f11148b = 1;

        /* JADX INFO: renamed from: c */
        private static int f11149c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11148b + 5;
            f11149c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11149c + 123;
            f11148b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't submit biometric consent.", new Object[1]);
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't submit biometric consent.", new Object[0]);
            }
            BiometricConsentPresenter.access$publishConsentNotReceivedResult(BiometricConsentPresenter.this);
            BiometricConsentPresenter.access$getView$p(BiometricConsentPresenter.this).closeScreen();
            int i4 = f11148b + 3;
            f11149c = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        a() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f11151c = 1;

        /* JADX INFO: renamed from: e */
        private static int f11152e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ BiometricConsentPresenter f11153a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ boolean f11154b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f11152e + 107;
            f11151c = i3 % 128;
            int i4 = i3 % 2;
            e(responseSuccess);
            Unit unit = Unit.INSTANCE;
            int i5 = f11151c + 95;
            f11152e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(com.incode.welcome_sdk.data.remote.beans.ResponseSuccess r6) {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r6.isSuccess()
                r3 = 0
                if (r0 == 0) goto L3b
                int r0 = com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.d.f11151c
                int r1 = r0 + 11
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.d.f11152e = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L30
                boolean r1 = r5.f11154b
                r0 = 26
                int r0 = r0 / r3
                if (r1 == 0) goto L35
            L21:
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter r0 = r5.f11153a
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.access$publishSuccessResult(r0)
            L26:
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter r0 = r5.f11153a
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract$View r0 = com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.access$getView$p(r0)
                r0.closeScreen()
                return
            L30:
                boolean r0 = r5.f11154b
                if (r0 == 0) goto L35
                goto L21
            L35:
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter r0 = r5.f11153a
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.access$publishUserCancelledResult(r0)
                goto L26
            L3b:
                timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                java.lang.String r1 = "Biometric consent submitted, but the result wasn't successful"
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r2.w(r1, r0)
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter r0 = r5.f11153a
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.access$publishConsentNotReceivedResult(r0)
                int r0 = com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.d.f11151c
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.d.f11152e = r0
                int r1 = r1 % r4
                goto L26
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter.d.e(com.incode.welcome_sdk.data.remote.beans.ResponseSuccess):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z2, BiometricConsentPresenter biometricConsentPresenter) {
            super(1);
            this.f11154b = z2;
            this.f11153a = biometricConsentPresenter;
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11144e + 83;
        f11143d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f11144e + 59;
        f11143d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11143d + 45;
        f11144e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11143d + 41;
        f11144e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract.Presenter
    public final void submitConsent(boolean z2, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CompositeDisposable compositeDisposable = this.f11145a;
        Observable<ResponseSuccess> observableObserveOn = this.f11147c.addConsent(z2, str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d(z2, this);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BiometricConsentPresenter.d(dVar, obj);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BiometricConsentPresenter.b(aVar, obj);
            }
        }));
        int i3 = f11143d + 13;
        f11144e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
    }

    private final void b(BiometricConsentResult biometricConsentResult) {
        int i2 = 2 % 2;
        int i3 = f11143d + 49;
        f11144e = i3 % 128;
        int i4 = i3 % 2;
        publishResult(IncodeWelcome.Companion.getInstance().getBiometricConsentBus(), biometricConsentResult);
        int i5 = f11143d + 57;
        f11144e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        b(new BiometricConsentResult(ResultCode.SUCCESS, null, false, true, 6, null));
        int i3 = f11143d + 23;
        f11144e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        b(new BiometricConsentResult(ResultCode.ERROR, new BiometricConsentNotReceived(null, 1, null), false, false, 12, null));
        int i3 = f11143d + 97;
        f11144e = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        Object obj = null;
        b(new BiometricConsentResult(ResultCode.USER_CANCELLED, new BiometricConsentNotGiven(null, 1, null), false, false, 4, null));
        int i3 = f11144e + 55;
        f11143d = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11144e + 59;
        f11143d = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11145a.clear();
            int i4 = 98 / 0;
        } else {
            this.f11145a.clear();
        }
    }
}
