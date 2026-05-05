package com.incode.welcome_sdk.ui.user_consent;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.UserConsentResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.user_consent.UserConsentContract;
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
public final class UserConsentPresenter extends BaseModulePresenter implements UserConsentContract.Presenter {

    /* JADX INFO: renamed from: a */
    private static int f18024a = 1;

    /* JADX INFO: renamed from: b */
    private static int f18025b = 0;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f18026c;

    /* JADX INFO: renamed from: e */
    private final CompositeDisposable f18027e;

    public static final /* synthetic */ void access$publishResult(UserConsentPresenter userConsentPresenter, UserConsentResult userConsentResult) {
        int i2 = 2 % 2;
        int i3 = f18025b + 89;
        f18024a = i3 % 128;
        int i4 = i3 % 2;
        userConsentPresenter.d(userConsentResult);
        int i5 = f18025b + 63;
        f18024a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public UserConsentPresenter(IncodeWelcomeRepository incodeWelcomeRepository, UserConsentContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f18026c = incodeWelcomeRepository;
        this.f18027e = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.user_consent.UserConsentPresenter$submitUserConsent$1 */
    public static final class AnonymousClass1 implements IncodeWelcome.AddDataListener {

        /* JADX INFO: renamed from: a */
        private static int f18034a = 0;

        /* JADX INFO: renamed from: b */
        private static int f18035b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ boolean f18036c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ UserConsentPresenter f18037e;

        AnonymousClass1(boolean z2, UserConsentPresenter userConsentPresenter) {
            z = z2;
            userConsentPresenter = userConsentPresenter;
        }

        @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
        public final void onSuccess() {
            int i2 = 2 % 2;
            int i3 = f18034a + 7;
            f18035b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                if (z) {
                    UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.SUCCESS, null, true));
                    int i4 = f18034a + 39;
                    f18035b = i4 % 128;
                    if (i4 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.USER_CANCELLED, null, false, 6, null));
                int i5 = f18035b + 49;
                f18034a = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
        public final void onError(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.ERROR, th, false, 4, null));
            int i3 = f18035b + 103;
            f18034a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.user_consent.UserConsentContract.Presenter
    public final void submitUserConsent(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        e(str, str2, z2, new IncodeWelcome.AddDataListener() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentPresenter.submitUserConsent.1

            /* JADX INFO: renamed from: a */
            private static int f18034a = 0;

            /* JADX INFO: renamed from: b */
            private static int f18035b = 1;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ boolean f18036c;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ UserConsentPresenter f18037e;

            AnonymousClass1(boolean z22, UserConsentPresenter this) {
                z = z22;
                userConsentPresenter = this;
            }

            @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
            public final void onSuccess() {
                int i22 = 2 % 2;
                int i3 = f18034a + 7;
                f18035b = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    if (z) {
                        UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.SUCCESS, null, true));
                        int i4 = f18034a + 39;
                        f18035b = i4 % 128;
                        if (i4 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.USER_CANCELLED, null, false, 6, null));
                    int i5 = f18035b + 49;
                    f18034a = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
            public final void onError(Throwable th) {
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                UserConsentPresenter.access$publishResult(userConsentPresenter, new UserConsentResult(ResultCode.ERROR, th, false, 4, null));
                int i3 = f18035b + 103;
                f18034a = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i3 = f18024a + 103;
        f18025b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f18025b + 19;
        f18024a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f18027e.clear();
            throw null;
        }
        this.f18027e.clear();
        int i4 = f18025b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18024a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f18028a = 0;

        /* JADX INFO: renamed from: e */
        private static int f18029e = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IncodeWelcome.AddDataListener f18030c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f18028a + 51;
            f18029e = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            int i5 = f18028a + 11;
            f18029e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return unit;
        }

        private void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f18029e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f18028a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(responseSuccess, "");
                int i4 = 89 / 0;
                if (!responseSuccess.isSuccess()) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(responseSuccess, "");
                if (!responseSuccess.isSuccess()) {
                    return;
                }
            }
            this.f18030c.onSuccess();
            int i5 = f18028a + 1;
            f18029e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(IncodeWelcome.AddDataListener addDataListener) {
            super(1);
            this.f18030c = addDataListener;
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f18031a = 0;

        /* JADX INFO: renamed from: d */
        private static int f18032d = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IncodeWelcome.AddDataListener f18033c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f18031a + 41;
            f18032d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f18031a + 103;
            f18032d = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f18031a + 55;
            f18032d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't add user consent", new Object[1]);
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't add user consent", new Object[0]);
            }
            this.f18033c.onError(th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(IncodeWelcome.AddDataListener addDataListener) {
            super(1);
            this.f18033c = addDataListener;
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f18024a + 103;
        f18025b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f18025b + 53;
        f18024a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f18025b + 97;
        f18024a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f18025b + 65;
        f18024a = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void e(String str, String str2, boolean z2, IncodeWelcome.AddDataListener addDataListener) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f18027e;
        Observable<ResponseSuccess> observableObserveOn = this.f18026c.addUserConsent(str, str2, z2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a(addDataListener);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UserConsentPresenter.b(aVar, obj);
            }
        };
        final d dVar = new d(addDataListener);
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.user_consent.UserConsentPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UserConsentPresenter.c(dVar, obj);
            }
        }));
        int i3 = f18025b + 5;
        f18024a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void d(UserConsentResult userConsentResult) {
        int i2 = 2 % 2;
        int i3 = f18025b + 33;
        f18024a = i3 % 128;
        int i4 = i3 % 2;
        publishResult(IncodeWelcome.Companion.getInstance().getUserConsentBus(), userConsentResult);
        int i5 = f18024a + 3;
        f18025b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
