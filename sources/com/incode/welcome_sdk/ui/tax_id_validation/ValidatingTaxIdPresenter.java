package com.incode.welcome_sdk.ui.tax_id_validation;

import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.bl;
import com.incode.welcome_sdk.results.TaxIdValidationResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ValidatingTaxIdPresenter extends BaseModulePresenter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17533h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f17534j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Scheduler f17535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IncodeWelcomeRepository f17536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValidatingTaxIdContract.ValidatingTaxIdView f17537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Scheduler f17538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Subject<TaxIdValidationResult> f17539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CompositeDisposable f17541g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ValidatingTaxIdPresenter(ValidatingTaxIdContract.ValidatingTaxIdView validatingTaxIdView, IncodeWelcomeRepository incodeWelcomeRepository, Subject subject, Scheduler scheduler, Scheduler scheduler2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Scheduler schedulerMainThread = scheduler2;
        Scheduler schedulerIo = scheduler;
        if ((i2 & 8) != 0) {
            schedulerIo = Schedulers.io();
            Intrinsics.checkNotNullExpressionValue(schedulerIo, "");
        }
        if ((i2 & 16) != 0) {
            schedulerMainThread = AndroidSchedulers.mainThread();
            Intrinsics.checkNotNullExpressionValue(schedulerMainThread, "");
        }
        this(validatingTaxIdView, incodeWelcomeRepository, subject, schedulerIo, schedulerMainThread);
    }

    public static final /* synthetic */ boolean access$getAllowRetry(ValidatingTaxIdPresenter validatingTaxIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f17534j + 43;
        f17533h = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = validatingTaxIdPresenter.d();
        if (i4 == 0) {
            int i5 = 81 / 0;
        }
        int i6 = f17533h + 77;
        f17534j = i6 % 128;
        if (i6 % 2 == 0) {
            return zD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Subject access$getBus$p(ValidatingTaxIdPresenter validatingTaxIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f17533h + 65;
        int i4 = i3 % 128;
        f17534j = i4;
        int i5 = i3 % 2;
        Subject<TaxIdValidationResult> subject = validatingTaxIdPresenter.f17539e;
        int i6 = i4 + 53;
        f17533h = i6 % 128;
        int i7 = i6 % 2;
        return subject;
    }

    public static final /* synthetic */ int access$getNumberOfRetries$p(ValidatingTaxIdPresenter validatingTaxIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f17534j;
        int i4 = i3 + 33;
        f17533h = i4 % 128;
        int i5 = i4 % 2;
        int i6 = validatingTaxIdPresenter.f17540f;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = i3 + 1;
        f17533h = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 78 / 0;
        }
        return i6;
    }

    public static final /* synthetic */ Scheduler access$getUiScheduler$p(ValidatingTaxIdPresenter validatingTaxIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f17534j + 43;
        int i4 = i3 % 128;
        f17533h = i4;
        int i5 = i3 % 2;
        Scheduler scheduler = validatingTaxIdPresenter.f17535a;
        if (i5 == 0) {
            int i6 = 68 / 0;
        }
        int i7 = i4 + 95;
        f17534j = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 98 / 0;
        }
        return scheduler;
    }

    public static final /* synthetic */ ValidatingTaxIdContract.ValidatingTaxIdView access$getView$p(ValidatingTaxIdPresenter validatingTaxIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f17533h;
        int i4 = i3 + 107;
        f17534j = i4 % 128;
        int i5 = i4 % 2;
        ValidatingTaxIdContract.ValidatingTaxIdView validatingTaxIdView = validatingTaxIdPresenter.f17537c;
        int i6 = i3 + 89;
        f17534j = i6 % 128;
        int i7 = i6 % 2;
        return validatingTaxIdView;
    }

    public static final /* synthetic */ void access$setNumberOfRetries$p(ValidatingTaxIdPresenter validatingTaxIdPresenter, int i2) {
        int i3 = 2 % 2;
        int i4 = f17533h + 115;
        int i5 = i4 % 128;
        f17534j = i5;
        int i6 = i4 % 2;
        validatingTaxIdPresenter.f17540f = i2;
        int i7 = i5 + 23;
        f17533h = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatingTaxIdPresenter(ValidatingTaxIdContract.ValidatingTaxIdView validatingTaxIdView, IncodeWelcomeRepository incodeWelcomeRepository, Subject<TaxIdValidationResult> subject, Scheduler scheduler, Scheduler scheduler2) {
        super(validatingTaxIdView);
        Intrinsics.checkNotNullParameter(validatingTaxIdView, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(subject, "");
        Intrinsics.checkNotNullParameter(scheduler, "");
        Intrinsics.checkNotNullParameter(scheduler2, "");
        this.f17537c = validatingTaxIdView;
        this.f17536b = incodeWelcomeRepository;
        this.f17539e = subject;
        this.f17538d = scheduler;
        this.f17535a = scheduler2;
        this.f17541g = new CompositeDisposable();
    }

    private final boolean d() {
        int i2 = 2 % 2;
        int i3 = f17534j;
        int i4 = i3 + 69;
        f17533h = i4 % 128;
        int i5 = i4 % 2;
        if (this.f17540f >= 3) {
            return false;
        }
        int i6 = i3 + 41;
        f17533h = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static final class d extends Lambda implements Function1<bl, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17554a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17555b = 0;

        private void d(bl blVar) {
            int i2 = 2 % 2;
            int i3 = f17554a + 91;
            f17555b = i3 % 128;
            int i4 = i3 % 2;
            ValidatingTaxIdPresenter.access$getView$p(ValidatingTaxIdPresenter.this).updateUiState(blVar.c());
            int i5 = f17555b + 107;
            f17554a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 31 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bl blVar) {
            int i2 = 2 % 2;
            int i3 = f17555b + 23;
            f17554a = i3 % 128;
            int i4 = i3 % 2;
            d(blVar);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 30 / 0;
            }
            int i6 = f17555b + 109;
            f17554a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 71 / 0;
            }
            return unit;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17534j + 111;
        f17533h = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f17533h + 49;
        f17534j = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function1<Throwable, SingleSource<? extends bl>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17548b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17549d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends bl> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17549d + 47;
            f17548b = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends bl> singleSourceA = a(th);
            if (i4 == 0) {
                int i5 = 76 / 0;
            }
            int i6 = f17548b + 111;
            f17549d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 50 / 0;
            }
            return singleSourceA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Throwable th, ValidatingTaxIdPresenter validatingTaxIdPresenter) {
            ValidatingTaxIdContract.ValidatingTaxIdView validatingTaxIdViewAccess$getView$p;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f17549d + 81;
            f17548b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(validatingTaxIdPresenter, "");
            if (!ThrowableExtensionsKt.isNoConnectivityException(th)) {
                int i5 = f17549d + 15;
                f17548b = i5 % 128;
                if (i5 % 2 == 0) {
                    validatingTaxIdViewAccess$getView$p = ValidatingTaxIdPresenter.access$getView$p(validatingTaxIdPresenter);
                    z2 = true;
                } else {
                    validatingTaxIdViewAccess$getView$p = ValidatingTaxIdPresenter.access$getView$p(validatingTaxIdPresenter);
                    z2 = false;
                }
                validatingTaxIdViewAccess$getView$p.updateUiState(z2);
            }
            return Unit.INSTANCE;
        }

        private SingleSource<? extends bl> a(final Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            final ValidatingTaxIdPresenter validatingTaxIdPresenter = ValidatingTaxIdPresenter.this;
            Single singleSubscribeOn = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$c$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ValidatingTaxIdPresenter.c.b(th, validatingTaxIdPresenter);
                }
            }).subscribeOn(ValidatingTaxIdPresenter.access$getUiScheduler$p(ValidatingTaxIdPresenter.this));
            final Function1<Unit, SingleSource<? extends bl>> function1 = new Function1<Unit, SingleSource<? extends bl>>() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.c.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f17551b = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f17552e = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ SingleSource<? extends bl> invoke(Unit unit) {
                    int i3 = 2 % 2;
                    int i4 = f17552e + 47;
                    f17551b = i4 % 128;
                    int i5 = i4 % 2;
                    SingleSource<? extends bl> singleSourceD = d(unit);
                    int i6 = f17551b + 97;
                    f17552e = i6 % 128;
                    if (i6 % 2 == 0) {
                        return singleSourceD;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private SingleSource<? extends bl> d(Unit unit) {
                    int i3 = 2 % 2;
                    int i4 = f17551b + 11;
                    f17552e = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(unit, "");
                    Single singleDelaySubscription = Single.error(th).delaySubscription(2L, TimeUnit.SECONDS);
                    int i6 = f17551b + 91;
                    f17552e = i6 % 128;
                    int i7 = i6 % 2;
                    return singleDelaySubscription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            Single singleFlatMap = singleSubscribeOn.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$c$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ValidatingTaxIdPresenter.c.e(function1, obj);
                }
            });
            int i3 = f17548b + 59;
            f17549d = i3 % 128;
            int i4 = i3 % 2;
            return singleFlatMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleSource e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f17548b + 91;
            f17549d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                return (SingleSource) function1.invoke(obj);
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        c() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17534j + 77;
        f17533h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (SingleSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 10 / 0;
        return (SingleSource) function1.invoke(obj);
    }

    public static final class a extends Lambda implements Function1<bl, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f17542a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f17543b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17544d = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f17545h = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f17547e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bl blVar) {
            int i2 = 2 % 2;
            int i3 = f17545h + 19;
            f17544d = i3 % 128;
            int i4 = i3 % 2;
            c(blVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f17544d + 11;
            f17545h = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(com.incode.welcome_sdk.data.remote.beans.bl r7) {
            /*
                r6 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17544d
                int r1 = r0 + 69
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17545h = r0
                int r1 = r1 % r2
                if (r1 != 0) goto L4e
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r1 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getNumberOfRetries$p(r1)
                int r0 = r0 + 1
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$setNumberOfRetries$p(r1, r0)
                boolean r0 = r7.c()
                if (r0 != 0) goto L6b
            L1f:
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17545h
                int r1 = r0 + 25
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17544d = r0
                int r1 = r1 % r2
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                boolean r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getAllowRetry(r0)
                if (r0 == 0) goto L6b
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17544d
                int r1 = r0 + 49
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17545h = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L60
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract$ValidatingTaxIdView r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r0)
                r0.goBackToTaxInputFragment()
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17545h
                int r1 = r0 + 77
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.f17544d = r0
                int r1 = r1 % r2
                return
            L4e:
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r1 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getNumberOfRetries$p(r1)
                int r0 = r0 + 1
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$setNumberOfRetries$p(r1, r0)
                boolean r0 = r7.c()
                if (r0 != 0) goto L6b
                goto L1f
            L60:
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract$ValidatingTaxIdView r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r0)
                r0.goBackToTaxInputFragment()
                r0 = 0
                throw r0
            L6b:
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r5 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                io.reactivex.subjects.Subject r4 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getBus$p(r5)
                com.incode.welcome_sdk.results.TaxIdValidationResult r3 = new com.incode.welcome_sdk.results.TaxIdValidationResult
                com.incode.welcome_sdk.results.ResultCode r2 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
                java.lang.String r1 = r6.f17547e
                boolean r0 = r7.c()
                r3.<init>(r2, r1, r0)
                com.incode.welcome_sdk.results.BaseResult r3 = (com.incode.welcome_sdk.results.BaseResult) r3
                r5.publishResult(r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.a.c(com.incode.welcome_sdk.data.remote.beans.bl):void");
        }

        public static int c() {
            int i2 = f17542a;
            int i3 = i2 % 8537841;
            f17542a = i2 + 1;
            if (i3 != 0) {
                return f17543b;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            f17543b = iMaxMemory;
            return iMaxMemory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f17547e = str;
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17557c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17558e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f17560b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17557c + 65;
            f17558e = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f17557c + 103;
            f17558e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        
            if (com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isHttpError(r7, 400) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            r1 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17557c + 31;
            com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17558e = r1 % 128;
            r1 = r1 % 2;
            r1 = r6.f17559a;
            com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$setNumberOfRetries$p(r1, com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getNumberOfRetries$p(r1) + 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        
            if (com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getAllowRetry(r6.f17559a) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            r4 = r6.f17559a;
            r4.publishResult(com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getBus$p(r4), new com.incode.welcome_sdk.results.TaxIdValidationResult(com.incode.welcome_sdk.results.ResultCode.SUCCESS, r6.f17560b, false));
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r6.f17559a).goBackToTaxInputFragment();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        
            if (com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        
            r3 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r6.f17559a);
            r1 = r6.f17559a;
            r0 = r6.f17560b;
            r3.showNoNetworkMessage(new com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.AnonymousClass5());
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
        
            if (com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7) != false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.Throwable r7) {
            /*
                r6 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17558e
                int r1 = r0 + 49
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17557c = r0
                int r1 = r1 % r3
                java.lang.String r2 = "Error while validating Tax ID."
                r5 = 0
                if (r1 == 0) goto L36
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r1.e(r7, r2, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7)
                if (r0 == 0) goto L47
            L21:
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract$ValidatingTaxIdView r3 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r0)
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$e$5 r2 = new com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$e$5
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r1 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                java.lang.String r0 = r6.f17560b
                r2.<init>()
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                r3.showNoNetworkMessage(r2)
                return
            L36:
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r1.e(r7, r2, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7)
                if (r0 == 0) goto L47
                goto L21
            L47:
                r0 = 400(0x190, float:5.6E-43)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isHttpError(r7, r0)
                if (r0 == 0) goto L80
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17557c
                int r1 = r0 + 31
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.f17558e = r0
                int r1 = r1 % r3
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r1 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                int r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getNumberOfRetries$p(r1)
                int r0 = r0 + 1
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$setNumberOfRetries$p(r1, r0)
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                boolean r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getAllowRetry(r0)
                if (r0 != 0) goto L80
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r4 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                io.reactivex.subjects.Subject r3 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getBus$p(r4)
                com.incode.welcome_sdk.results.TaxIdValidationResult r2 = new com.incode.welcome_sdk.results.TaxIdValidationResult
                com.incode.welcome_sdk.results.ResultCode r1 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
                java.lang.String r0 = r6.f17560b
                r2.<init>(r1, r0, r5)
                com.incode.welcome_sdk.results.BaseResult r2 = (com.incode.welcome_sdk.results.BaseResult) r2
                r4.publishResult(r3, r2)
                return
            L80:
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.this
                com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract$ValidatingTaxIdView r0 = com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.access$getView$p(r0)
                r0.goBackToTaxInputFragment()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter.e.e(java.lang.Throwable):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f17560b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17534j + 125;
        f17533h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f17534j + 45;
        f17533h = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17534j + 125;
        f17533h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f17534j + 87;
        f17533h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
    }

    public final void validateTaxId(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CompositeDisposable compositeDisposable = this.f17541g;
        Single<bl> singleObserveOn = this.f17536b.validateRfc(str).subscribeOn(this.f17538d).observeOn(this.f17535a);
        final d dVar = new d();
        Single<bl> singleDelay = singleObserveOn.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ValidatingTaxIdPresenter.b(dVar, obj);
            }
        }).delay(2L, TimeUnit.SECONDS);
        final c cVar = new c();
        Single<bl> singleObserveOn2 = singleDelay.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ValidatingTaxIdPresenter.a(cVar, obj);
            }
        }).observeOn(this.f17535a);
        final a aVar = new a(str);
        Consumer<? super bl> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ValidatingTaxIdPresenter.c(aVar, obj);
            }
        };
        final e eVar = new e(str);
        compositeDisposable.add(singleObserveOn2.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ValidatingTaxIdPresenter.e(eVar, obj);
            }
        }));
        int i3 = f17534j + 79;
        f17533h = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void destroy() {
        int i2 = 2 % 2;
        int i3 = f17533h + 71;
        f17534j = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17541g.clear();
            int i4 = 73 / 0;
        } else {
            this.f17541g.clear();
        }
        int i5 = f17534j + 111;
        f17533h = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
