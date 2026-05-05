package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.ah;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ay;
import com.incode.welcome_sdk.results.GovernmentValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidationPresenter extends BaseModulePresenter implements GovernmentValidationContract.Presenter {

    /* JADX INFO: renamed from: b */
    private static int f14466b = 0;

    /* JADX INFO: renamed from: c */
    private static int f14467c = 1;

    /* JADX INFO: renamed from: a */
    private final GovernmentValidationContract.View f14468a;

    /* JADX INFO: renamed from: d */
    private final IncodeWelcomeRepository f14469d;

    /* JADX INFO: renamed from: e */
    private final CompositeDisposable f14470e;

    public static final /* synthetic */ GovernmentValidationContract.View access$getView$p(GovernmentValidationPresenter governmentValidationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14467c;
        int i4 = i3 + 61;
        f14466b = i4 % 128;
        int i5 = i4 % 2;
        GovernmentValidationContract.View view = governmentValidationPresenter.f14468a;
        int i6 = i3 + 85;
        f14466b = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GovernmentValidationPresenter(IncodeWelcomeRepository incodeWelcomeRepository, GovernmentValidationContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f14469d = incodeWelcomeRepository;
        this.f14468a = view;
        this.f14470e = new CompositeDisposable();
    }

    static final class d extends Lambda implements Function1<ay, Integer> {

        /* JADX INFO: renamed from: a */
        private static int f14477a = 0;

        /* JADX INFO: renamed from: b */
        private static int f14478b = 1;

        /* JADX INFO: renamed from: c */
        private static int f14479c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14480d = 0;

        /* JADX INFO: renamed from: e */
        public static final d f14481e = new d();

        private static Integer e(ay ayVar) {
            int i2 = 2 % 2;
            int i3 = f14480d + 121;
            f14478b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(ayVar, "");
                Integer.valueOf(ayVar.c());
                throw null;
            }
            Intrinsics.checkNotNullParameter(ayVar, "");
            Integer numValueOf = Integer.valueOf(ayVar.c());
            int i4 = f14480d + 9;
            f14478b = i4 % 128;
            if (i4 % 2 != 0) {
                return numValueOf;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Integer invoke(ay ayVar) {
            int i2 = 2 % 2;
            int i3 = f14480d + 109;
            f14478b = i3 % 128;
            ay ayVar2 = ayVar;
            if (i3 % 2 == 0) {
                e(ayVar2);
                throw null;
            }
            Integer numE = e(ayVar2);
            int i4 = f14480d + 73;
            f14478b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 26 / 0;
            }
            return numE;
        }

        static {
            int i2 = f14477a + 45;
            f14479c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f14474b = 1;

        /* JADX INFO: renamed from: d */
        private static int f14475d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int i2 = 2 % 2;
            int i3 = f14474b + 63;
            f14475d = i3 % 128;
            int i4 = i3 % 2;
            d(num);
            Unit unit = Unit.INSTANCE;
            int i5 = f14475d + 1;
            f14474b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Integer num) {
            int i2 = 2 % 2;
            if (num == null) {
                int i3 = f14474b + 57;
                f14475d = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            } else if (num.intValue() == 0) {
                int i4 = f14474b + 27;
                f14475d = i4 % 128;
                int i5 = i4 % 2;
                GovernmentValidationPresenter.access$getView$p(GovernmentValidationPresenter.this).onIdentityVerified();
                return;
            }
            if (num == null) {
                int i6 = f14475d + 17;
                f14474b = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            } else if (num.intValue() == 1) {
                GovernmentValidationPresenter.access$getView$p(GovernmentValidationPresenter.this).onIdentityNotVerified();
                return;
            }
            GovernmentValidationContract.View viewAccess$getView$p = GovernmentValidationPresenter.access$getView$p(GovernmentValidationPresenter.this);
            Intrinsics.checkNotNull(num);
            viewAccess$getView$p.onGovernmentValidationError(num.intValue());
        }

        c() {
            super(1);
        }
    }

    public static final Integer a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14467c + 53;
        f14466b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Integer num = (Integer) function1.invoke(obj);
        int i4 = f14467c + 11;
        f14466b = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14466b + 37;
        f14467c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14467c + 7;
        f14466b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14471a = 0;

        /* JADX INFO: renamed from: d */
        private static int f14472d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14472d + 87;
            f14471a = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 77 / 0;
            }
            int i6 = f14472d + 93;
            f14471a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 17 / 0;
            }
            return unit;
        }

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14471a + 107;
            f14472d = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Identity validation error", new Object[0]);
            GovernmentValidationContract.View viewAccess$getView$p = GovernmentValidationPresenter.access$getView$p(GovernmentValidationPresenter.this);
            Intrinsics.checkNotNull(th);
            viewAccess$getView$p.onError(th);
            int i5 = f14471a + 73;
            f14472d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14466b + 35;
        f14467c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.Presenter
    public final void validate() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f14470e;
        Observable<ay> observableObserveOn = this.f14469d.processGovernmentValidation().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = d.f14481e;
        Observable<R> map = observableObserveOn.map(new Function() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return GovernmentValidationPresenter.a(dVar, obj);
            }
        });
        final c cVar = new c();
        Observable observableDoOnNext = map.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GovernmentValidationPresenter.b(cVar, obj);
            }
        });
        Consumer<Object> consumer = ah.f6383a;
        final a aVar = new a();
        compositeDisposable.add(observableDoOnNext.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GovernmentValidationPresenter.e(aVar, obj);
            }
        }));
        int i3 = f14466b + 9;
        f14467c = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void publishSuccessResult(Integer num) {
        int i2 = 2 % 2;
        boolean z2 = false;
        if (num == null) {
            int i3 = f14467c + 83;
            f14466b = i3 % 128;
            int i4 = i3 % 2;
        } else if (num.intValue() == 0) {
            int i5 = f14466b + 3;
            f14467c = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = true;
            }
        }
        publishResult(new GovernmentValidationResult(ResultCode.SUCCESS, null, z2, 2, null));
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.Presenter
    public final void publishResult(GovernmentValidationResult governmentValidationResult) {
        int i2 = 2 % 2;
        int i3 = f14466b + 7;
        f14467c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(governmentValidationResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getGovernmentValidationBus(), governmentValidationResult);
        int i5 = f14466b + 87;
        f14467c = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14466b + 43;
        f14467c = i3 % 128;
        int i4 = i3 % 2;
        this.f14470e.clear();
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
    }
}
