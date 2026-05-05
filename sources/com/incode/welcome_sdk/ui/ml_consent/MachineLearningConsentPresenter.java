package com.incode.welcome_sdk.ui.ml_consent;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.z;
import com.incode.welcome_sdk.results.MachineLearningConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract;
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
public final class MachineLearningConsentPresenter extends BaseModulePresenter implements MachineLearningConsentContract.Presenter {

    /* JADX INFO: renamed from: b */
    private static int f16412b = 0;

    /* JADX INFO: renamed from: g */
    private static int f16413g = 1;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f16414a;

    /* JADX INFO: renamed from: c */
    private final MachineLearningConsentContract.View f16415c;

    /* JADX INFO: renamed from: d */
    private final CompositeDisposable f16416d;

    /* JADX INFO: renamed from: e */
    private String f16417e;

    public static final /* synthetic */ MachineLearningConsentContract.View access$getView$p(MachineLearningConsentPresenter machineLearningConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f16413g + 11;
        f16412b = i3 % 128;
        int i4 = i3 % 2;
        MachineLearningConsentContract.View view = machineLearningConsentPresenter.f16415c;
        if (i4 == 0) {
            return view;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setMachineLearningConsentId$p(MachineLearningConsentPresenter machineLearningConsentPresenter, String str) {
        int i2 = 2 % 2;
        int i3 = f16412b;
        int i4 = i3 + 7;
        f16413g = i4 % 128;
        int i5 = i4 % 2;
        machineLearningConsentPresenter.f16417e = str;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 49;
        f16413g = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public MachineLearningConsentPresenter(IncodeWelcomeRepository incodeWelcomeRepository, MachineLearningConsentContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f16414a = incodeWelcomeRepository;
        this.f16415c = view;
        this.f16416d = new CompositeDisposable();
    }

    static final class d extends Lambda implements Function1<z, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f16424c = 0;

        /* JADX INFO: renamed from: d */
        private static int f16425d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(z zVar) {
            int i2 = 2 % 2;
            int i3 = f16424c + 49;
            f16425d = i3 % 128;
            int i4 = i3 % 2;
            b(zVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f16425d + 53;
            f16424c = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(z zVar) {
            int i2 = 2 % 2;
            int i3 = f16425d + 125;
            f16424c = i3 % 128;
            int i4 = i3 % 2;
            MachineLearningConsentPresenter.access$setMachineLearningConsentId$p(MachineLearningConsentPresenter.this, zVar.c());
            MachineLearningConsentPresenter.access$getView$p(MachineLearningConsentPresenter.this).showConsent(zVar.e(), zVar.a());
            int i5 = f16424c + 47;
            f16425d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16427a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16428b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16429c = 0;

        /* JADX INFO: renamed from: d */
        public static final e f16430d = new e();

        /* JADX INFO: renamed from: e */
        private static int f16431e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16431e + 21;
            f16428b = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 81 / 0;
            }
            return unit;
        }

        private static void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16428b + 29;
            f16431e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Couldn't get ML consent", new Object[0]);
            int i5 = f16431e + 57;
            f16428b = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f16429c + 105;
            f16427a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16412b + 87;
        f16413g = i3 % 128;
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

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16413g + 33;
        f16412b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16413g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16412b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract.Presenter
    public final void getConsent(String str, String str2, String str3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        CompositeDisposable compositeDisposable = this.f16416d;
        Observable<z> observableObserveOn = this.f16414a.fetchConsent(str, str2, str3).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d();
        Consumer<? super z> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MachineLearningConsentPresenter.c(dVar, obj);
            }
        };
        final e eVar = e.f16430d;
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MachineLearningConsentPresenter.a(eVar, obj);
            }
        }));
        int i3 = f16412b + 49;
        f16413g = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f16418b = 0;

        /* JADX INFO: renamed from: d */
        private static int f16419d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16419d + 69;
            f16418b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            a(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f16418b + 115;
            f16419d = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void a(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            Object obj = null;
            MachineLearningConsentPresenter.this.publishResult(new MachineLearningConsentResult(ResultCode.SUCCESS, null, responseSuccess.isSuccess()));
            int i3 = f16419d + 93;
            f16418b = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f16421d = 0;

        /* JADX INFO: renamed from: e */
        private static int f16422e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16422e + 101;
            f16421d = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f16422e + 87;
            f16421d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Couldn't add ML consent", new Object[0]);
            MachineLearningConsentPresenter.this.publishResult(new MachineLearningConsentResult(ResultCode.ERROR, th, false, 4, null));
            int i3 = f16421d + 11;
            f16422e = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16412b + 1;
        f16413g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16412b + 111;
        f16413g = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16412b + 107;
        f16413g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f16413g + 109;
        f16412b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract.Presenter
    public final void submitConsent(boolean z2) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f16416d;
        Observable<ResponseSuccess> observableObserveOn = this.f16414a.addConsent(z2, this.f16417e).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MachineLearningConsentPresenter.d(bVar, obj);
            }
        };
        final c cVar = new c();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MachineLearningConsentPresenter.b(cVar, obj);
            }
        }));
        int i3 = f16412b + 125;
        f16413g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract.Presenter
    public final void publishResult(MachineLearningConsentResult machineLearningConsentResult) {
        int i2 = 2 % 2;
        int i3 = f16413g + 81;
        f16412b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(machineLearningConsentResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getMachineLearningConsentBus(), machineLearningConsentResult);
        int i5 = f16412b + 99;
        f16413g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f16412b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16413g = i3 % 128;
        if (i3 % 2 != 0) {
            this.f16416d.clear();
            int i4 = f16412b + 37;
            f16413g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
                return;
            }
            return;
        }
        this.f16416d.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
