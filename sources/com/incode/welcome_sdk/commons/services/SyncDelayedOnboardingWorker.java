package com.incode.welcome_sdk.commons.services;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker;
import com.incode.welcome_sdk.i;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class SyncDelayedOnboardingWorker extends RxWorker {
    public static final String DELAYED_ONBOARDING_SYNC_WORKER_ERROR_DATA = "SYNC_WORKER_ERROR_DATA";
    public static final String DELAYED_ONBOARDING_SYNC_WORKER_SUCCESSFUL_SYNC_COUNT = "SYNC_WORKER_SYNC_SUCCESS_COUNT";
    public static final String DELAYED_ONBOARDING_SYNC_WORKER_UNSUCCESSFUL_SYNC_COUNT = "SYNC_WORKER_SYNC_FAIL_COUNT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5336a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5337c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5338d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5339e = 0;
    private final Lazy syncHandler$delegate;
    public static final b Companion = new b(0);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncDelayedOnboardingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        this.syncHandler$delegate = LazyKt.lazy(a.f5343d);
    }

    static final class a extends Lambda implements Function0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5340a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5341b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5342c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f5343d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5344e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ i invoke() {
            int i2 = 2 % 2;
            int i3 = f5341b + 23;
            f5340a = i3 % 128;
            int i4 = i3 % 2;
            i iVarB = b();
            int i5 = f5341b + 63;
            f5340a = i5 % 128;
            int i6 = i5 % 2;
            return iVarB;
        }

        private static i b() {
            int i2 = 2 % 2;
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            c.b bVar = c.f4426a;
            i iVar = new i(companion, c.b.d());
            int i3 = f5341b + 7;
            f5340a = i3 % 128;
            if (i3 % 2 == 0) {
                return iVar;
            }
            throw null;
        }

        static {
            int i2 = f5342c + 123;
            f5344e = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
        }

        a() {
            super(0);
        }
    }

    private final i getSyncHandler() {
        int i2 = 2 % 2;
        int i3 = f5337c + 93;
        f5339e = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i iVar = (i) this.syncHandler$delegate.getValue();
        int i4 = f5337c + 41;
        f5339e = i4 % 128;
        int i5 = i4 % 2;
        return iVar;
    }

    static final class d extends Lambda implements Function1<Disposable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5345a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5346b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5347c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5348d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5349e = 0;

        private static void a() {
            int i2 = 2 % 2;
            int i3 = f5346b + 45;
            f5349e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.d("Delayed onboardings sync started.", new Object[0]);
            int i5 = f5349e + 47;
            f5346b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f5349e + 87;
            f5346b = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 27 / 0;
            }
            int i6 = f5346b + 27;
            f5349e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        static {
            int i2 = f5348d + 83;
            f5347c = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>, SingleSource<? extends ListenableWorker.Result>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5350d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5351e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ i f5352c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends ListenableWorker.Result> invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            int i3 = f5351e + 75;
            f5350d = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends ListenableWorker.Result> singleSourceA = a(list);
            if (i4 != 0) {
                int i5 = 48 / 0;
            }
            return singleSourceA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ListenableWorker.Result e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5351e + 9;
            f5350d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            ListenableWorker.Result result = (ListenableWorker.Result) function1.invoke(obj);
            int i4 = f5351e + 19;
            f5350d = i4 % 128;
            int i5 = i4 % 2;
            return result;
        }

        private SingleSource<? extends ListenableWorker.Result> a(final List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            int i3 = f5350d + 75;
            f5351e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Single<Pair<Integer, Integer>> singleA = this.f5352c.a(list);
            final AnonymousClass5 anonymousClass5 = new Function1<Pair<? extends Integer, ? extends Integer>, ListenableWorker.Result>() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker.e.5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f5353a = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f5355c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f5356d = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f5357e = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ ListenableWorker.Result invoke(Pair<? extends Integer, ? extends Integer> pair) {
                    int i5 = 2 % 2;
                    int i6 = f5356d + 109;
                    f5355c = i6 % 128;
                    int i7 = i6 % 2;
                    ListenableWorker.Result resultB = b(pair);
                    int i8 = f5356d + 29;
                    f5355c = i8 % 128;
                    if (i8 % 2 == 0) {
                        return resultB;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static ListenableWorker.Result b(Pair<Integer, Integer> pair) {
                    int i5 = 2 % 2;
                    Intrinsics.checkNotNullParameter(pair, "");
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success(new Data.Builder().putInt(SyncDelayedOnboardingWorker.DELAYED_ONBOARDING_SYNC_WORKER_SUCCESSFUL_SYNC_COUNT, pair.getFirst().intValue()).putInt(SyncDelayedOnboardingWorker.DELAYED_ONBOARDING_SYNC_WORKER_UNSUCCESSFUL_SYNC_COUNT, pair.getSecond().intValue()).build());
                    int i6 = f5356d + 23;
                    f5355c = i6 % 128;
                    int i7 = i6 % 2;
                    return resultSuccess;
                }

                static {
                    int i5 = f5353a + 37;
                    f5357e = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 10 / 0;
                    }
                }
            };
            Single singleOnErrorReturn = singleA.map(new Function() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker$e$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return SyncDelayedOnboardingWorker.e.e(anonymousClass5, obj);
                }
            }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker$e$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return SyncDelayedOnboardingWorker.e.d(list, (Throwable) obj);
                }
            });
            int i5 = f5350d + 85;
            f5351e = i5 % 128;
            if (i5 % 2 != 0) {
                return singleOnErrorReturn;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ListenableWorker.Result d(List list, Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(th, "");
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure(new Data.Builder().putString(SyncDelayedOnboardingWorker.DELAYED_ONBOARDING_SYNC_WORKER_ERROR_DATA, th.getMessage()).putInt(SyncDelayedOnboardingWorker.DELAYED_ONBOARDING_SYNC_WORKER_UNSUCCESSFUL_SYNC_COUNT, list.size()).build());
            int i3 = f5350d + 107;
            f5351e = i3 % 128;
            int i4 = i3 % 2;
            return resultFailure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.f5352c = iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createWork$lambda$3$lambda$0(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5339e + 105;
        f5337c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f5337c + 39;
        f5339e = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource createWork$lambda$3$lambda$1(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5339e + 65;
        f5337c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f5339e + 125;
        f5337c = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createWork$lambda$3$lambda$2() {
        int i2 = 2 % 2;
        int i3 = f5337c + 75;
        f5339e = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("Delayed onboardings sync finished.", new Object[0]);
        int i5 = f5337c + 91;
        f5339e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
    }

    @Override // androidx.work.RxWorker
    public final Single<ListenableWorker.Result> createWork() {
        int i2 = 2 % 2;
        i syncHandler = getSyncHandler();
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleA = syncHandler.a();
        final d dVar = d.f5345a;
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleDoOnSubscribe = singleA.doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SyncDelayedOnboardingWorker.createWork$lambda$3$lambda$0(dVar, obj);
            }
        });
        final e eVar = new e(syncHandler);
        Single<ListenableWorker.Result> singleDoFinally = singleDoOnSubscribe.flatMap(new Function() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SyncDelayedOnboardingWorker.createWork$lambda$3$lambda$1(eVar, obj);
            }
        }).doFinally(new Action() { // from class: com.incode.welcome_sdk.commons.services.SyncDelayedOnboardingWorker$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Action
            public final void run() {
                SyncDelayedOnboardingWorker.createWork$lambda$3$lambda$2();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "");
        int i3 = f5337c + 87;
        f5339e = i3 % 128;
        if (i3 % 2 == 0) {
            return singleDoFinally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        int i2 = f5338d + 7;
        f5336a = i2 % 128;
        int i3 = i2 % 2;
    }
}
