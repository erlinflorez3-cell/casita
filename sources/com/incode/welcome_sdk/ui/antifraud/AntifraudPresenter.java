package com.incode.welcome_sdk.ui.antifraud;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.u;
import com.incode.welcome_sdk.results.AntifraudResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.antifraud.AntifraudContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class AntifraudPresenter extends BaseModulePresenter implements AntifraudContract.Presenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11058d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11059e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompositeDisposable f11060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AntifraudContract.View f11061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcomeRepository f11062c;

    public static final /* synthetic */ AntifraudContract.View access$getView$p(AntifraudPresenter antifraudPresenter) {
        int i2 = 2 % 2;
        int i3 = f11058d + 73;
        f11059e = i3 % 128;
        int i4 = i3 % 2;
        AntifraudContract.View view = antifraudPresenter.f11061b;
        if (i4 != 0) {
            return view;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntifraudPresenter(IncodeWelcomeRepository incodeWelcomeRepository, AntifraudContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f11062c = incodeWelcomeRepository;
        this.f11061b = view;
        this.f11060a = new CompositeDisposable();
    }

    static final class a extends Lambda implements Function1<u, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11063c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11064e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(u uVar) {
            int i2 = 2 % 2;
            int i3 = f11064e + 71;
            f11063c = i3 % 128;
            int i4 = i3 % 2;
            b(uVar);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 14 / 0;
            }
            int i6 = f11064e + 37;
            f11063c = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void b(u uVar) {
            int i2 = 2 % 2;
            AntifraudPresenter.this.publishResult(new AntifraudResult(ResultCode.SUCCESS, uVar.e()));
            int i3 = f11064e + 37;
            f11063c = i3 % 128;
            int i4 = i3 % 2;
        }

        a() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11066c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11067e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11066c + 103;
            f11067e = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 28 / 0;
            }
            int i6 = f11066c + 31;
            f11067e = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (!(th instanceof NoConnectivityException)) {
                int i3 = f11066c + 65;
                f11067e = i3 % 128;
                int i4 = i3 % 2;
                if (!(th instanceof UnknownHostException)) {
                    Timber.Forest.d(th, "Couldn't process antifraud", new Object[0]);
                    AntifraudPresenter antifraudPresenter = AntifraudPresenter.this;
                    AntifraudResult antifraudResult = new AntifraudResult(ResultCode.ERROR, false, 2, null);
                    antifraudResult.error = th;
                    antifraudPresenter.publishResult(antifraudResult);
                    return;
                }
            }
            AntifraudContract.View viewAccess$getView$p = AntifraudPresenter.access$getView$p(AntifraudPresenter.this);
            final AntifraudPresenter antifraudPresenter2 = AntifraudPresenter.this;
            viewAccess$getView$p.showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.antifraud.AntifraudPresenter.d.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f11069a = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f11070e = 0;

                private void d() {
                    int i5 = 2 % 2;
                    int i6 = f11069a + 101;
                    f11070e = i6 % 128;
                    int i7 = i6 % 2;
                    antifraudPresenter2.processAntifraud();
                    int i8 = f11069a + 25;
                    f11070e = i8 % 128;
                    int i9 = i8 % 2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Unit invoke() {
                    int i5 = 2 % 2;
                    int i6 = f11069a + 85;
                    f11070e = i6 % 128;
                    int i7 = i6 % 2;
                    d();
                    if (i7 != 0) {
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    int i8 = f11069a + 81;
                    f11070e = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unit2;
                    }
                    throw null;
                }

                {
                    super(0);
                }
            });
            int i5 = f11067e + 41;
            f11066c = i5 % 128;
            int i6 = i5 % 2;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11059e + 67;
        f11058d = i3 % 128;
        if (i3 % 2 == 0) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11058d + 107;
        f11059e = i3 % 128;
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

    @Override // com.incode.welcome_sdk.ui.antifraud.AntifraudContract.Presenter
    public final void processAntifraud() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f11060a;
        Observable<u> observableObserveOn = this.f11062c.processAntifraud().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        Consumer<? super u> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.antifraud.AntifraudPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AntifraudPresenter.a(aVar, obj);
            }
        };
        final d dVar = new d();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.antifraud.AntifraudPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AntifraudPresenter.d(dVar, obj);
            }
        }));
        int i3 = f11058d + 53;
        f11059e = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void publishResult(AntifraudResult antifraudResult) {
        int i2 = 2 % 2;
        int i3 = f11058d + 53;
        f11059e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(antifraudResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getAntifraudBus(), antifraudResult);
        } else {
            Intrinsics.checkNotNullParameter(antifraudResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getAntifraudBus(), antifraudResult);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11058d + 105;
        f11059e = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11060a.clear();
            int i4 = f11059e + 123;
            f11058d = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f11060a.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
