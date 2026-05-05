package com.incode.welcome_sdk.ui.ekyc;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ai;
import com.incode.welcome_sdk.data.remote.beans.o;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EKYCResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.ekyc.EKYCContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYCPresenter extends BaseModulePresenter implements EKYCContract.Presenter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14162c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14163d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IncodeWelcomeRepository f14164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CompositeDisposable f14165b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EKYCContract.View f14166e;

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo$p(EKYCPresenter eKYCPresenter) {
        int i2 = 2 % 2;
        int i3 = f14162c + 101;
        f14163d = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = eKYCPresenter.f14164a;
        if (i4 == 0) {
            return incodeWelcomeRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ EKYCContract.View access$getView$p(EKYCPresenter eKYCPresenter) {
        int i2 = 2 % 2;
        int i3 = f14163d;
        int i4 = i3 + 3;
        f14162c = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        EKYCContract.View view = eKYCPresenter.f14166e;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 21;
        f14162c = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EKYCPresenter(EKYCContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f14166e = view;
        this.f14164a = incodeWelcomeRepository;
        this.f14165b = new CompositeDisposable();
    }

    static final class a extends Lambda implements Function1<ai, List<? extends o>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14167a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14168b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f14169c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14170d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14171e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ List<? extends o> invoke(ai aiVar) {
            int i2 = 2 % 2;
            int i3 = f14167a + 5;
            f14168b = i3 % 128;
            int i4 = i3 % 2;
            List<o> listE = e(aiVar);
            if (i4 == 0) {
                int i5 = 5 / 0;
            }
            int i6 = f14168b + 45;
            f14167a = i6 % 128;
            if (i6 % 2 == 0) {
                return listE;
            }
            throw null;
        }

        private static List<o> e(ai aiVar) {
            int i2 = 2 % 2;
            int i3 = f14167a + 27;
            f14168b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(aiVar, "");
                return aiVar.c();
            }
            Intrinsics.checkNotNullParameter(aiVar, "");
            aiVar.c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f14171e + 65;
            f14170d = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(Function1 function1, Object obj) {
        List list;
        int i2 = 2 % 2;
        int i3 = f14163d + 81;
        f14162c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
            int i4 = 72 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            list = (List) function1.invoke(obj);
        }
        int i5 = f14162c + 21;
        f14163d = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14172b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14173c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ EKYCForm f14175e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14172b + 21;
            f14173c = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 49 / 0;
            }
            int i6 = f14173c + 49;
            f14172b = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14172b + 53;
            f14173c = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Couldn't process EKYC checks", new Object[0]);
            if (th instanceof NoConnectivityException) {
                EKYCContract.View viewAccess$getView$p = EKYCPresenter.access$getView$p(EKYCPresenter.this);
                final EKYCPresenter eKYCPresenter = EKYCPresenter.this;
                final EKYCForm eKYCForm = this.f14175e;
                viewAccess$getView$p.showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCPresenter.b.4

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f14176a = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f14177d = 0;

                    private void b() {
                        int i5 = 2 % 2;
                        int i6 = f14176a + 61;
                        f14177d = i6 % 128;
                        if (i6 % 2 != 0) {
                            eKYCPresenter.processEkycForm(eKYCForm);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        eKYCPresenter.processEkycForm(eKYCForm);
                        int i7 = f14177d + 125;
                        f14176a = i7 % 128;
                        int i8 = i7 % 2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        Unit unit;
                        int i5 = 2 % 2;
                        int i6 = f14176a + 71;
                        f14177d = i6 % 128;
                        int i7 = i6 % 2;
                        b();
                        if (i7 != 0) {
                            unit = Unit.INSTANCE;
                            int i8 = 2 / 0;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        int i9 = f14177d + 45;
                        f14176a = i9 % 128;
                        int i10 = i9 % 2;
                        return unit;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                int i5 = f14173c + 13;
                f14172b = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            EventUtils.sendScreenOpened(EKYCPresenter.access$getRepo$p(EKYCPresenter.this), ScreenName.EKYC_FAILED, Modules.EXTERNAL_VERIFICATION);
            EKYCPresenter.access$getView$p(EKYCPresenter.this).showResult(true);
            EKYCPresenter.this.publishResult(IncodeWelcome.Companion.getInstance().getEkycBus(), new EKYCResult(ResultCode.SUCCESS, th));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EKYCForm eKYCForm) {
            super(1);
            this.f14175e = eKYCForm;
        }
    }

    static final class e extends Lambda implements Function1<List<? extends o>, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14180d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14181e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends o> list) {
            int i2 = 2 % 2;
            int i3 = f14180d + 9;
            f14181e = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 63 / 0;
            }
            int i6 = f14180d + 7;
            f14181e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            EventUtils.sendScreenOpened(EKYCPresenter.access$getRepo$p(EKYCPresenter.this), ScreenName.EKYC_SUCCEEDED, Modules.EXTERNAL_VERIFICATION);
            EKYCPresenter.access$getView$p(EKYCPresenter.this).showResult(true);
            Timber.Forest.d("Successfully processed EKYC checks", new Object[0]);
            EKYCPresenter.this.publishResult(IncodeWelcome.Companion.getInstance().getEkycBus(), new EKYCResult(ResultCode.SUCCESS, null, 2, null));
            int i3 = f14181e + 83;
            f14180d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 0 / 0;
            }
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14162c + 37;
        f14163d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14162c + 25;
        f14163d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14162c + 95;
        f14163d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14162c + 13;
        f14163d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.ekyc.EKYCContract.Presenter
    public final void processEkycForm(EKYCForm eKYCForm) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(eKYCForm, "");
        this.f14166e.showLoading();
        CompositeDisposable compositeDisposable = this.f14165b;
        Observable<ai> observableObserveOn = this.f14164a.processEKYCChecks(eKYCForm).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = a.f14169c;
        Observable<R> map = observableObserveOn.map(new Function() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return EKYCPresenter.c(aVar, obj);
            }
        });
        final e eVar = new e();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EKYCPresenter.a(eVar, obj);
            }
        };
        final b bVar = new b(eKYCForm);
        compositeDisposable.add(map.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EKYCPresenter.e(bVar, obj);
            }
        }));
        int i3 = f14163d + 13;
        f14162c = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14162c + 27;
        f14163d = i3 % 128;
        int i4 = i3 % 2;
        this.f14165b.clear();
        int i5 = f14163d + 117;
        f14162c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
