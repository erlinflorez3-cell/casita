package com.incode.welcome_sdk;

import android.content.Context;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1;
import com.incode.welcome_sdk.commons.extensions.n;
import com.incode.welcome_sdk.commons.utils.ah;
import com.incode.welcome_sdk.data.FlowType;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseWorkflowInfo;
import com.incode.welcome_sdk.data.remote.beans.ap;
import com.incode.welcome_sdk.listeners.OnboardingSessionListener;
import com.incode.welcome_sdk.modules.Modules;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class IncodeWelcome$startOnboardingAndCreateFlowConfig$1 implements OnboardingSessionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4317b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4318d = 0;
    final /* synthetic */ Context $context;
    final /* synthetic */ IncodeWelcome.OnboardingListener $onboardingListener;
    final /* synthetic */ SessionConfig $sessionConfig;
    final /* synthetic */ Modules $startFromModule;
    final /* synthetic */ boolean $startedFromDeepLink;
    final /* synthetic */ com.incode.welcome_sdk.a $wrappedOnboardingListener;
    final /* synthetic */ IncodeWelcome this$0;

    IncodeWelcome$startOnboardingAndCreateFlowConfig$1(IncodeWelcome incodeWelcome, SessionConfig sessionConfig, Modules modules, boolean z2, Context context, com.incode.welcome_sdk.a aVar, IncodeWelcome.OnboardingListener onboardingListener) {
        this.this$0 = incodeWelcome;
        this.$sessionConfig = sessionConfig;
        this.$startFromModule = modules;
        this.$startedFromDeepLink = z2;
        this.$context = context;
        this.$wrappedOnboardingListener = aVar;
        this.$onboardingListener = onboardingListener;
    }

    static final class a extends Lambda implements Function1<ap, SingleSource<? extends ap>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4319c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f4320e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ IncodeWelcome f4321a;

        private SingleSource<? extends ap> e(ap apVar) {
            int i2 = 2 % 2;
            int i3 = f4319c + 27;
            f4320e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(apVar, "");
                IncodeWelcome.access$fetchPhoneIfPrefillEnabled(this.f4321a, apVar);
                throw null;
            }
            Intrinsics.checkNotNullParameter(apVar, "");
            Single singleAccess$fetchPhoneIfPrefillEnabled = IncodeWelcome.access$fetchPhoneIfPrefillEnabled(this.f4321a, apVar);
            int i4 = f4319c + 59;
            f4320e = i4 % 128;
            int i5 = i4 % 2;
            return singleAccess$fetchPhoneIfPrefillEnabled;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends ap> invoke(ap apVar) {
            int i2 = 2 % 2;
            int i3 = f4320e + 99;
            f4319c = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends ap> singleSourceE = e(apVar);
            int i5 = f4320e + 117;
            f4319c = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceE;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(IncodeWelcome incodeWelcome) {
            super(1);
            this.f4321a = incodeWelcome;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource onOnboardingSessionCreated$lambda$0(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4318d + 85;
        f4317b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (SingleSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class d extends Lambda implements Function1<ap, CompletableSource> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f4332h = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f4333j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ boolean f4334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Context f4335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IncodeWelcome f4336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ SessionConfig f4337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Modules f4338e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.a f4339g;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(ap apVar) {
            int i2 = 2 % 2;
            int i3 = f4333j + 59;
            f4332h = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(apVar);
            int i5 = f4332h + 93;
            f4333j = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSourceC;
            }
            throw null;
        }

        private CompletableSource c(final ap apVar) {
            int i2 = 2 % 2;
            int i3 = f4333j + 83;
            f4332h = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(apVar, "");
                final SessionConfig sessionConfig = this.f4337d;
                final Modules modules = this.f4338e;
                final IncodeWelcome incodeWelcome = this.f4336c;
                final boolean z2 = this.f4334a;
                final Context context = this.f4335b;
                final com.incode.welcome_sdk.a aVar = this.f4339g;
                return Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$d$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Action
                    public final void run() throws Exception {
                        IncodeWelcome$startOnboardingAndCreateFlowConfig$1.d.b(sessionConfig, modules, incodeWelcome, apVar, z2, context, aVar);
                    }
                });
            }
            Intrinsics.checkNotNullParameter(apVar, "");
            final SessionConfig sessionConfig2 = this.f4337d;
            final Modules modules2 = this.f4338e;
            final IncodeWelcome incodeWelcome2 = this.f4336c;
            final boolean z3 = this.f4334a;
            final Context context2 = this.f4335b;
            final com.incode.welcome_sdk.a aVar2 = this.f4339g;
            Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$d$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    IncodeWelcome$startOnboardingAndCreateFlowConfig$1.d.b(sessionConfig2, modules2, incodeWelcome2, apVar, z3, context2, aVar2);
                }
            });
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SessionConfig sessionConfig, Modules modules, IncodeWelcome incodeWelcome, ap apVar, boolean z2, Context context, com.incode.welcome_sdk.a aVar) throws Exception {
            int i2 = 2 % 2;
            int i3 = f4332h + 87;
            f4333j = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(sessionConfig, "");
            Intrinsics.checkNotNullParameter(incodeWelcome, "");
            Intrinsics.checkNotNullParameter(apVar, "");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            if (sessionConfig.getInterviewId() == null) {
                modules = null;
            }
            FlowConfig flowConfigAccess$createFlowConfig = IncodeWelcome.access$createFlowConfig(incodeWelcome, modules, apVar);
            if (z2) {
                int i5 = f4332h + 5;
                f4333j = i5 % 128;
                int i6 = i5 % 2;
                if (sessionConfig.getInterviewId() != null) {
                    IncodeWelcome.access$logFinishGptEvent(incodeWelcome, sessionConfig.getInterviewId());
                    int i7 = f4333j + 25;
                    f4332h = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            IncodeWelcome.access$calculateDiskSpace(incodeWelcome, context, flowConfigAccess$createFlowConfig);
            IncodeWelcome.access$setInternalConfig(incodeWelcome, sessionConfig, flowConfigAccess$createFlowConfig);
            IncodeWelcome.access$setupValidationModules(incodeWelcome, flowConfigAccess$createFlowConfig, sessionConfig);
            IncodeWelcome.access$handleModules(incodeWelcome, context, flowConfigAccess$createFlowConfig, aVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SessionConfig sessionConfig, Modules modules, IncodeWelcome incodeWelcome, boolean z2, Context context, com.incode.welcome_sdk.a aVar) {
            super(1);
            this.f4337d = sessionConfig;
            this.f4338e = modules;
            this.f4336c = incodeWelcome;
            this.f4334a = z2;
            this.f4335b = context;
            this.f4339g = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource onOnboardingSessionCreated$lambda$1(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4317b + 89;
        f4318d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f4317b + 69;
        f4318d = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4340b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4341d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IncodeWelcome f4342c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.a f4343e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4340b + 83;
            f4341d = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4340b + 67;
            f4341d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4340b + 123;
            f4341d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Couldn't create flow configuration", new Object[0]);
            IncodeWelcome.access$onSetupOnboardingError(this.f4342c, th);
            this.f4343e.onError(th);
            int i5 = f4340b + 55;
            f4341d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(IncodeWelcome incodeWelcome, com.incode.welcome_sdk.a aVar) {
            super(1);
            this.f4342c = incodeWelcome;
            this.f4343e = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOnboardingSessionCreated$lambda$2(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4318d + 23;
        f4317b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4318d + 41;
        f4317b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    static final class b extends Lambda implements Function1<ResponseWorkflowInfo, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4322a = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f4323j = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Context f4324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IncodeWelcome f4325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.a f4326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ SessionConfig f4327e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseWorkflowInfo responseWorkflowInfo) throws Exception {
            int i2 = 2 % 2;
            int i3 = f4322a + 35;
            f4323j = i3 % 128;
            int i4 = i3 % 2;
            d(responseWorkflowInfo);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 69 / 0;
            }
            return unit;
        }

        private void d(ResponseWorkflowInfo responseWorkflowInfo) throws Exception {
            int i2 = 2 % 2;
            int i3 = f4322a + 33;
            f4323j = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseWorkflowInfo, "");
            IncodeWelcome.access$setAutoCreateIdentityIfSuccessful$p(this.f4325c, responseWorkflowInfo.getAutoCreateIdentityIfSuccessful());
            FlowConfig flowConfigAccess$createFlowConfig = IncodeWelcome.access$createFlowConfig(this.f4325c, responseWorkflowInfo);
            IncodeWelcome.access$calculateDiskSpace(this.f4325c, this.f4324b, flowConfigAccess$createFlowConfig);
            IncodeWelcome.access$setInternalConfig(this.f4325c, this.f4327e, flowConfigAccess$createFlowConfig);
            IncodeWelcome.access$handleModules(this.f4325c, this.f4324b, flowConfigAccess$createFlowConfig, this.f4326d);
            int i5 = f4322a + 111;
            f4323j = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IncodeWelcome incodeWelcome, Context context, SessionConfig sessionConfig, com.incode.welcome_sdk.a aVar) {
            super(1);
            this.f4325c = incodeWelcome;
            this.f4324b = context;
            this.f4327e = sessionConfig;
            this.f4326d = aVar;
        }
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4328a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4329b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IncodeWelcome f4330c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.a f4331e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4328a + 63;
            f4329b = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4329b + 101;
            f4328a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4328a + 9;
            f4329b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Couldn't create flow configuration", new Object[0]);
            IncodeWelcome.access$onSetupOnboardingError(this.f4330c, th);
            this.f4331e.onError(th);
            int i5 = f4328a + 63;
            f4329b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(IncodeWelcome incodeWelcome, com.incode.welcome_sdk.a aVar) {
            super(1);
            this.f4330c = incodeWelcome;
            this.f4331e = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOnboardingSessionCreated$lambda$3(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4317b + 1;
        f4318d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4317b + 91;
        f4318d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onOnboardingSessionCreated$lambda$4(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4317b + 95;
        f4318d = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f4317b + 93;
        f4318d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.listeners.OnboardingSessionListener
    public final void onOnboardingSessionCreated(String str, String str2, String str3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str3, "");
        IncodeWelcomeRepository incodeWelcomeRepository = null;
        if (IncodeWelcome.access$getFlowType$p(this.this$0) != FlowType.FLOW) {
            CompositeDisposable compositeDisposableAccess$getModuleCompositeDisposable$p = IncodeWelcome.access$getModuleCompositeDisposable$p(this.this$0);
            if (compositeDisposableAccess$getModuleCompositeDisposable$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                compositeDisposableAccess$getModuleCompositeDisposable$p = null;
            }
            IncodeWelcomeRepository incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p = IncodeWelcome.access$getIncodeWelcomeRepository$p(this.this$0);
            if (incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p == null) {
                int i3 = f4317b + 47;
                f4318d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                incodeWelcomeRepository = incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p;
            }
            Observable<ResponseWorkflowInfo> observableObserveOn = incodeWelcomeRepository.getWorkflowInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final b bVar = new b(this.this$0, this.$context, this.$sessionConfig, this.$wrappedOnboardingListener);
            Consumer<? super ResponseWorkflowInfo> consumer = new Consumer() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IncodeWelcome$startOnboardingAndCreateFlowConfig$1.onOnboardingSessionCreated$lambda$3(bVar, obj);
                }
            };
            final c cVar = new c(this.this$0, this.$wrappedOnboardingListener);
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IncodeWelcome$startOnboardingAndCreateFlowConfig$1.onOnboardingSessionCreated$lambda$4(cVar, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
            n.b(compositeDisposableAccess$getModuleCompositeDisposable$p, disposableSubscribe);
            return;
        }
        int i5 = f4318d + 25;
        f4317b = i5 % 128;
        if (i5 % 2 == 0) {
            IncodeWelcome.access$getModuleCompositeDisposable$p(this.this$0);
            incodeWelcomeRepository.hashCode();
            throw null;
        }
        CompositeDisposable compositeDisposableAccess$getModuleCompositeDisposable$p2 = IncodeWelcome.access$getModuleCompositeDisposable$p(this.this$0);
        if (compositeDisposableAccess$getModuleCompositeDisposable$p2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            compositeDisposableAccess$getModuleCompositeDisposable$p2 = null;
        }
        IncodeWelcomeRepository incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p2 = IncodeWelcome.access$getIncodeWelcomeRepository$p(this.this$0);
        if (incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            incodeWelcomeRepository = incodeWelcomeRepositoryAccess$getIncodeWelcomeRepository$p2;
        }
        Observable<ap> observableSubscribeOn = incodeWelcomeRepository.fetchFlowConfiguration().subscribeOn(Schedulers.io());
        final a aVar = new a(this.this$0);
        Observable observableObserveOn2 = observableSubscribeOn.flatMapSingle(new Function() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return IncodeWelcome$startOnboardingAndCreateFlowConfig$1.onOnboardingSessionCreated$lambda$0(aVar, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d(this.$sessionConfig, this.$startFromModule, this.this$0, this.$startedFromDeepLink, this.$context, this.$wrappedOnboardingListener);
        Completable completableFlatMapCompletable = observableObserveOn2.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return IncodeWelcome$startOnboardingAndCreateFlowConfig$1.onOnboardingSessionCreated$lambda$1(dVar, obj);
            }
        });
        Action action = ah.f6384b;
        final e eVar = new e(this.this$0, this.$wrappedOnboardingListener);
        Disposable disposableSubscribe2 = completableFlatMapCompletable.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.IncodeWelcome$startOnboardingAndCreateFlowConfig$1$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IncodeWelcome$startOnboardingAndCreateFlowConfig$1.onOnboardingSessionCreated$lambda$2(eVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "");
        n.b(compositeDisposableAccess$getModuleCompositeDisposable$p2, disposableSubscribe2);
        int i6 = f4317b + 57;
        f4318d = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.listeners.ErrorListener
    public final void onError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f4317b + 93;
        f4318d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        this.$onboardingListener.onError(th);
        int i5 = f4317b + 75;
        f4318d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
    public final void onUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f4318d + 117;
        f4317b = i3 % 128;
        int i4 = i3 % 2;
        this.$onboardingListener.onUserCancelled();
        int i5 = f4318d + 7;
        f4317b = i5 % 128;
        int i6 = i5 % 2;
    }
}
