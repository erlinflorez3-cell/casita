package com.incode.welcome_sdk.ui.phone_number;

import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.phone_number.OtpContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class OtpPresenter extends BaseModulePresenter implements BasePresenter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16924g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16925j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Subject<EmailAddressResult> f16926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Subject<PhoneNumberResult> f16927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OtpContract.View f16929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IncodeWelcomeRepository f16930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f16931f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f16932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CompositeDisposable f16933i;

    public static final /* synthetic */ String access$getInput$p(OtpPresenter otpPresenter) {
        int i2 = 2 % 2;
        int i3 = f16925j + 29;
        int i4 = i3 % 128;
        f16924g = i4;
        int i5 = i3 % 2;
        String str = otpPresenter.f16928c;
        int i6 = i4 + 73;
        f16925j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long access$getTryAgainTimerDurationInSeconds$p(OtpPresenter otpPresenter) {
        int i2 = 2 % 2;
        int i3 = f16924g + 71;
        int i4 = i3 % 128;
        f16925j = i4;
        int i5 = i3 % 2;
        long j2 = otpPresenter.f16932h;
        if (i5 != 0) {
            int i6 = 40 / 0;
        }
        int i7 = i4 + 45;
        f16924g = i7 % 128;
        if (i7 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ OtpContract.View access$getView$p(OtpPresenter otpPresenter) {
        int i2 = 2 % 2;
        int i3 = f16924g;
        int i4 = i3 + 91;
        f16925j = i4 % 128;
        int i5 = i4 % 2;
        OtpContract.View view = otpPresenter.f16929d;
        if (i5 != 0) {
            int i6 = 95 / 0;
        }
        int i7 = i3 + 21;
        f16925j = i7 % 128;
        int i8 = i7 % 2;
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpPresenter(OtpContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, Subject<PhoneNumberResult> subject, Subject<EmailAddressResult> subject2, String str, t tVar) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(subject, "");
        Intrinsics.checkNotNullParameter(subject2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tVar, "");
        this.f16929d = view;
        this.f16930e = incodeWelcomeRepository;
        this.f16927b = subject;
        this.f16926a = subject2;
        this.f16928c = str;
        this.f16931f = tVar;
        this.f16932h = 30L;
        this.f16933i = new CompositeDisposable();
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16937b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16938c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16937b + 13;
            f16938c = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f16937b + 113;
            f16938c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16937b + 121;
            f16938c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
                OtpContract.View viewAccess$getView$p = OtpPresenter.access$getView$p(OtpPresenter.this);
                final OtpPresenter otpPresenter = OtpPresenter.this;
                viewAccess$getView$p.showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter.a.5

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f16940a = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f16941d = 1;

                    private void b() {
                        int i5 = 2 % 2;
                        int i6 = f16941d + 65;
                        f16940a = i6 % 128;
                        if (i6 % 2 != 0) {
                            otpPresenter.sendOtp();
                            int i7 = 90 / 0;
                        } else {
                            otpPresenter.sendOtp();
                        }
                        int i8 = f16941d + 43;
                        f16940a = i8 % 128;
                        int i9 = i8 % 2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i5 = 2 % 2;
                        int i6 = f16940a + 79;
                        f16941d = i6 % 128;
                        int i7 = i6 % 2;
                        b();
                        Unit unit = Unit.INSTANCE;
                        int i8 = f16941d + 39;
                        f16940a = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }

                    {
                        super(0);
                    }
                });
            } else {
                Timber.Forest.e(th, "Sending the OTP code failed.", new Object[0]);
                OtpPresenter.a(OtpPresenter.this, ResultCode.ERROR, th, null, 4);
                int i5 = f16937b + 67;
                f16938c = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16959a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16960b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16961c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f16962d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16963e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16961c + 33;
            f16959a = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f16961c + 35;
            f16959a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void d() {
            int i2 = 2 % 2;
            int i3 = f16959a + 45;
            f16961c = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.d("OTP code sent successfully.", new Object[1]);
            } else {
                Timber.Forest.d("OTP code sent successfully.", new Object[0]);
            }
            int i4 = f16961c + 121;
            f16959a = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            int i2 = f16963e + 111;
            f16960b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16925j + 9;
        f16924g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16925j + 91;
        f16924g = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16925j + 43;
        f16924g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void sendOtp() {
        int i2 = 2 % 2;
        this.f16933i.clear();
        startTryAgainTimer();
        CompositeDisposable compositeDisposable = this.f16933i;
        Observable<ResponseSuccess> observableObserveOn = this.f16930e.sendOtp(this.f16931f).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final e eVar = e.f16962d;
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.d(eVar, obj);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.c(aVar, obj);
            }
        }));
        int i3 = f16924g + 1;
        f16925j = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16956b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16957e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f16957e + 79;
            f16956b = i3 % 128;
            int i4 = i3 % 2;
            c(l2);
            Unit unit = Unit.INSTANCE;
            int i5 = f16957e + 39;
            f16956b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return unit;
        }

        private void c(Long l2) {
            int i2 = 2 % 2;
            int i3 = f16957e + 101;
            f16956b = i3 % 128;
            int i4 = i3 % 2;
            OtpContract.View viewAccess$getView$p = OtpPresenter.access$getView$p(OtpPresenter.this);
            long jAccess$getTryAgainTimerDurationInSeconds$p = OtpPresenter.access$getTryAgainTimerDurationInSeconds$p(OtpPresenter.this);
            Intrinsics.checkNotNull(l2);
            viewAccess$getView$p.updateTryAgainTimer((jAccess$getTryAgainTimerDurationInSeconds$p - l2.longValue()) - 1);
            int i5 = f16956b + 89;
            f16957e = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16964d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16965e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16965e + 121;
            f16964d = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f16965e + 23;
            f16964d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16965e + 11;
            f16964d = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e(th, "Error while starting timer.", new Object[0]);
            } else {
                Timber.Forest.e(th, "Error while starting timer.", new Object[0]);
            }
            OtpPresenter.a(OtpPresenter.this, ResultCode.ERROR, th, null, 4);
            int i4 = f16964d + 37;
            f16965e = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(OtpPresenter otpPresenter) {
        int i2 = 2 % 2;
        int i3 = f16925j + 99;
        f16924g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(otpPresenter, "");
        otpPresenter.f16929d.showTryAgainOrChangeInputMessage();
        int i5 = f16925j + 111;
        f16924g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16924g + 105;
        f16925j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f16925j + 85;
        f16924g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16924g + 35;
        f16925j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16924g + 97;
        f16925j = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void startTryAgainTimer() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f16933i;
        Observable<Long> observableDoOnComplete = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(this.f16932h).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Action
            public final void run() {
                OtpPresenter.e(this.f$0);
            }
        });
        final d dVar = new d();
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.e(dVar, obj);
            }
        };
        final h hVar = new h();
        compositeDisposable.add(observableDoOnComplete.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.b(hVar, obj);
            }
        }));
        int i3 = f16924g + 23;
        f16925j = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class b extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16943d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16944e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16944e + 83;
            f16943d = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 36 / 0;
            }
            return unit;
        }

        private void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16943d + 47;
            f16944e = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                responseSuccess.isSuccess();
                obj.hashCode();
                throw null;
            }
            if (responseSuccess.isSuccess()) {
                OtpPresenter.access$getView$p(OtpPresenter.this).sendCorrectOtpSubmittedEvent();
                OtpPresenter.access$getView$p(OtpPresenter.this).hideProgressAndUnblockInteraction();
                Timber.Forest.d("OTP code check passed.", new Object[0]);
                OtpPresenter.a(OtpPresenter.this, ResultCode.SUCCESS, null, OtpPresenter.access$getInput$p(OtpPresenter.this), 2);
                return;
            }
            Timber.Forest.e("Wrong OTP code provided.", new Object[0]);
            OtpPresenter.access$getView$p(OtpPresenter.this).updateUiAfterWrongOtpProvided();
            int i4 = f16944e + 85;
            f16943d = i4 % 128;
            int i5 = i4 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16946a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16947d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f16948b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ t f16950e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16947d + 57;
            f16946a = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f16947d + 67;
            f16946a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16947d + 23;
            f16946a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                OtpPresenter.access$getView$p(OtpPresenter.this).hideProgressAndUnblockInteraction();
                ThrowableExtensionsKt.isNoConnectivityException(th);
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            OtpPresenter.access$getView$p(OtpPresenter.this).hideProgressAndUnblockInteraction();
            if (!ThrowableExtensionsKt.isNoConnectivityException(th)) {
                Timber.Forest.e(th, "OTP validation failed.", new Object[0]);
                OtpPresenter.a(OtpPresenter.this, ResultCode.ERROR, th, null, 4);
                return;
            }
            OtpPresenter.access$getView$p(OtpPresenter.this).hideProgressAndUnblockInteraction();
            OtpContract.View viewAccess$getView$p = OtpPresenter.access$getView$p(OtpPresenter.this);
            final OtpPresenter otpPresenter = OtpPresenter.this;
            final String str = this.f16948b;
            final t tVar = this.f16950e;
            viewAccess$getView$p.showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter.c.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f16951a = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f16952e = 1;

                private void b() {
                    int i4 = 2 % 2;
                    int i5 = f16952e + 49;
                    f16951a = i5 % 128;
                    int i6 = i5 % 2;
                    otpPresenter.compareOtp(str, tVar);
                    int i7 = f16952e + 95;
                    f16951a = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Unit invoke() {
                    int i4 = 2 % 2;
                    int i5 = f16952e + 9;
                    f16951a = i5 % 128;
                    int i6 = i5 % 2;
                    b();
                    Unit unit = Unit.INSTANCE;
                    int i7 = f16951a + 101;
                    f16952e = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
            int i4 = f16946a + 31;
            f16947d = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, t tVar) {
            super(1);
            this.f16948b = str;
            this.f16950e = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16924g + 93;
        f16925j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16925j + 69;
        f16924g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16924g + 25;
        f16925j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    public final void compareOtp(String str, t tVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tVar, "");
        this.f16929d.showProgressAndBlockInteraction();
        CompositeDisposable compositeDisposable = this.f16933i;
        Observable<ResponseSuccess> observableObserveOn = this.f16930e.compareOtp(str, tVar).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.a(bVar, obj);
            }
        };
        final c cVar = new c(str, tVar);
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpPresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtpPresenter.h(cVar, obj);
            }
        }));
        int i3 = f16924g + 123;
        f16925j = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void a(OtpPresenter otpPresenter, ResultCode resultCode, Throwable th, String str, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = f16924g + 47;
            f16925j = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            th = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = f16924g + 3;
            f16925j = i5 % 128;
            int i6 = i5 % 2;
            str = null;
        }
        otpPresenter.e(resultCode, th, str);
    }

    private final void e(ResultCode resultCode, Throwable th, String str) {
        int i2 = 2 % 2;
        int i3 = f16924g + 75;
        f16925j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f16935d[this.f16931f.ordinal()];
        if (i5 == 1) {
            super.publishResult(this.f16927b, new PhoneNumberResult(resultCode, th, str));
            return;
        }
        if (i5 == 2) {
            super.publishResult(this.f16926a, new EmailAddressResult(resultCode, th, str));
            int i6 = f16925j + 105;
            f16924g = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f16924g + 79;
        f16925j = i3 % 128;
        if (i3 % 2 == 0) {
            this.f16933i.clear();
            int i4 = f16924g + 79;
            f16925j = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
                return;
            }
            return;
        }
        this.f16933i.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16934c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f16935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16936e = 1;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f10057a.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f10059d.ordinal()] = 2;
                int i3 = f16934c + 125;
                f16936e = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            f16935d = iArr;
            int i5 = f16934c + 85;
            f16936e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 23 / 0;
            }
        }
    }
}
