package com.incode.welcome_sdk.ui.ekyb;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ah;
import com.incode.welcome_sdk.data.remote.beans.j;
import com.incode.welcome_sdk.results.EKYBResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.ekyb.EKYBContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYBPresenter extends BaseModulePresenter implements EKYBContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14109b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14110d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompositeDisposable f14111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcomeRepository f14112c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EKYBContract.View f14113e;

    public static final /* synthetic */ EKYBContract.View access$getView$p(EKYBPresenter eKYBPresenter) {
        int i2 = 2 % 2;
        int i3 = f14110d + 81;
        int i4 = i3 % 128;
        f14109b = i4;
        int i5 = i3 % 2;
        EKYBContract.View view = eKYBPresenter.f14113e;
        int i6 = i4 + 15;
        f14110d = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    public static final /* synthetic */ void access$publish(EKYBPresenter eKYBPresenter, EKYBResult eKYBResult) {
        int i2 = 2 % 2;
        int i3 = f14109b + 43;
        f14110d = i3 % 128;
        int i4 = i3 % 2;
        eKYBPresenter.e(eKYBResult);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f14110d + 81;
        f14109b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EKYBPresenter(EKYBContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f14113e = view;
        this.f14112c = incodeWelcomeRepository;
        this.f14111a = new CompositeDisposable();
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.Presenter
    public final void processFormFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.f14113e.hideForm();
        this.f14113e.showProcessing();
        b(new EKYBForm(str, str2, str3, str4, str5, str6, str7, str8, str9));
        int i3 = f14109b + 19;
        f14110d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
    }

    static final class d extends Lambda implements Function1<ah, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14122c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14123e = 1;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f14123e + 115;
            f14122c = i3 % 128;
            if (i3 % 2 != 0) {
                EKYBPresenter.access$getView$p(EKYBPresenter.this).hideProcessing();
                int i4 = 45 / 0;
            } else {
                EKYBPresenter.access$getView$p(EKYBPresenter.this).hideProcessing();
            }
            int i5 = f14122c + 87;
            f14123e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ah ahVar) {
            int i2 = 2 % 2;
            int i3 = f14123e + 87;
            f14122c = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f14122c + 61;
            f14123e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        d() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<ah, List<? extends j>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14117a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14118b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14119c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14120d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14121e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ List<? extends j> invoke(ah ahVar) {
            int i2 = 2 % 2;
            int i3 = f14121e + 91;
            f14118b = i3 % 128;
            int i4 = i3 % 2;
            List<j> listB = b(ahVar);
            int i5 = f14118b + 3;
            f14121e = i5 % 128;
            int i6 = i5 % 2;
            return listB;
        }

        private static List<j> b(ah ahVar) {
            int i2 = 2 % 2;
            int i3 = f14118b + 81;
            f14121e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(ahVar, "");
                return ahVar.d();
            }
            Intrinsics.checkNotNullParameter(ahVar, "");
            ahVar.d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f14119c + 15;
            f14120d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14110d + 81;
        f14109b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14110d + 41;
        f14109b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14110d + 33;
        f14109b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i5 = f14110d + 89;
        f14109b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return list;
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14114b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14115e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14115e + 63;
            f14114b = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            Timber.Forest.e(th, "Couldn't process EKYB Checks", new Object[0]);
            if (th instanceof NoConnectivityException) {
                int i3 = f14114b + 105;
                f14115e = i3 % 128;
                int i4 = i3 % 2;
                EKYBPresenter.access$getView$p(EKYBPresenter.this).showNoNetworkMessage();
            }
            EKYBPresenter.access$getView$p(EKYBPresenter.this).hideProcessing();
            EKYBPresenter.access$getView$p(EKYBPresenter.this).showResult(false);
            EKYBPresenter.access$publish(EKYBPresenter.this, new EKYBResult(ResultCode.SUCCESS, null, 2, null));
            int i5 = f14115e + 5;
            f14114b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<List<? extends j>, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14125d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14126e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends j> list) {
            int i2 = 2 % 2;
            int i3 = f14126e + 101;
            f14125d = i3 % 128;
            int i4 = i3 % 2;
            a(list);
            Unit unit = Unit.INSTANCE;
            int i5 = f14126e + 75;
            f14125d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(List<j> list) {
            int i2 = 2 % 2;
            EKYBPresenter.access$getView$p(EKYBPresenter.this).showResult(true);
            EKYBPresenter eKYBPresenter = EKYBPresenter.this;
            ResultCode resultCode = ResultCode.SUCCESS;
            Intrinsics.checkNotNull(list);
            EKYBPresenter.access$publish(eKYBPresenter, new EKYBResult(resultCode, list));
            int i3 = f14126e + 81;
            f14125d = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14109b + 25;
        f14110d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14109b + 103;
        f14110d = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14110d + 121;
        f14109b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14109b + 105;
        f14110d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void b(EKYBForm eKYBForm) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f14111a;
        Observable<ah> observableProcessEKYBChecks = this.f14112c.processEKYBChecks(eKYBForm);
        Intrinsics.checkNotNullExpressionValue(observableProcessEKYBChecks, "");
        Observable observableB = b(observableProcessEKYBChecks);
        final d dVar = new d();
        Observable observableDoOnNext = observableB.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EKYBPresenter.e(dVar, obj);
            }
        });
        final c cVar = c.f14117a;
        Observable map = observableDoOnNext.map(new Function() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return EKYBPresenter.d(cVar, obj);
            }
        });
        final e eVar = new e();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EKYBPresenter.c(eVar, obj);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(map.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EKYBPresenter.a(aVar, obj);
            }
        }));
        int i3 = f14110d + 117;
        f14109b = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void e(EKYBResult eKYBResult) {
        int i2 = 2 % 2;
        int i3 = f14109b + 81;
        f14110d = i3 % 128;
        if (i3 % 2 == 0) {
            publishResult(IncodeWelcome.Companion.getInstance().getEkybBus(), eKYBResult);
            int i4 = 27 / 0;
        } else {
            publishResult(IncodeWelcome.Companion.getInstance().getEkybBus(), eKYBResult);
        }
    }

    private static <T> Observable<T> b(Observable<T> observable) {
        int i2 = 2 % 2;
        int i3 = f14109b + 83;
        f14110d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()), "");
            throw null;
        }
        Observable<T> observableObserveOn = observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "");
        return observableObserveOn;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14109b + 103;
        f14110d = i3 % 128;
        int i4 = i3 % 2;
        this.f14111a.clear();
        int i5 = f14110d + 31;
        f14109b = i5 % 128;
        int i6 = i5 % 2;
    }
}
