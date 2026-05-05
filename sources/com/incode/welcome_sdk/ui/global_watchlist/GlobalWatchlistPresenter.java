package com.incode.welcome_sdk.ui.global_watchlist;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.results.GlobalWatchlistResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class GlobalWatchlistPresenter extends BaseModulePresenter implements GlobalWatchlistContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14399b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14400g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GlobalWatchlistContract.View f14401a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompositeDisposable f14402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f14403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PublishSubject<GlobalWatchlistResult> f14404e;

    public static final /* synthetic */ GlobalWatchlistContract.View access$getView$p(GlobalWatchlistPresenter globalWatchlistPresenter) {
        int i2 = 2 % 2;
        int i3 = f14399b + 87;
        f14400g = i3 % 128;
        int i4 = i3 % 2;
        GlobalWatchlistContract.View view = globalWatchlistPresenter.f14401a;
        if (i4 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalWatchlistPresenter(GlobalWatchlistContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f14401a = view;
        this.f14403d = incodeWelcomeRepository;
        this.f14402c = new CompositeDisposable();
        this.f14404e = IncodeWelcome.Companion.getInstance().getGlobalWatchlistBus();
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14405b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14406d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14405b + 41;
            f14406d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.Throwable r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14405b
                int r1 = r0 + 51
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14406d = r0
                int r1 = r1 % r5
                r2 = 0
                java.lang.String r4 = "Couldn't process GlobalWatchlist"
                r3 = 1
                if (r1 == 0) goto L60
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r1.e(r7, r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7)
                if (r0 == 0) goto L36
            L22:
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14405b
                int r1 = r0 + 43
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14406d = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L72
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.this
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract$View r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.access$getView$p(r0)
                r0.showNoNetworkMessage()
            L36:
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.this
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract$View r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.access$getView$p(r0)
                r0.hideProcessing()
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.this
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract$View r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.access$getView$p(r0)
                r0.showResult(r2)
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter r2 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.this
                com.incode.welcome_sdk.results.GlobalWatchlistResult r1 = new com.incode.welcome_sdk.results.GlobalWatchlistResult
                com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.ERROR
                r1.<init>(r0)
                r1.error = r7
                r2.publishResult(r1)
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14406d
                int r1 = r0 + 57
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.f14405b = r0
                int r1 = r1 % r5
                return
            L60:
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r1.e(r7, r4, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isNoConnectivityException(r7)
                r0 = r0 ^ r3
                if (r0 == r3) goto L36
                goto L22
            L72:
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.this
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract$View r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.access$getView$p(r0)
                r0.showNoNetworkMessage()
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter.a.e(java.lang.Throwable):void");
        }

        a() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<ResponseBody, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14408b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14409c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            int i2 = 2 % 2;
            int i3 = f14408b + 45;
            f14409c = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f14409c + 45;
            f14408b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e() {
            int i2 = 2 % 2;
            GlobalWatchlistPresenter.access$getView$p(GlobalWatchlistPresenter.this).hideProcessing();
            GlobalWatchlistPresenter.access$getView$p(GlobalWatchlistPresenter.this).showResult(true);
            GlobalWatchlistPresenter.this.publishResult(new GlobalWatchlistResult(ResultCode.SUCCESS));
            int i3 = f14409c + 39;
            f14408b = i3 % 128;
            int i4 = i3 % 2;
        }

        c() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14400g + 15;
        f14399b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14400g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14399b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14400g + 37;
        f14399b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14400g + 99;
        f14399b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.Presenter
    public final void submitWatchlist(GlobalWatchlistModel globalWatchlistModel) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(globalWatchlistModel, "");
        this.f14401a.hideForm();
        this.f14401a.showProcessing();
        CompositeDisposable compositeDisposable = this.f14402c;
        Single<ResponseBody> singleObserveOn = this.f14403d.addGlobalWatchlistData(globalWatchlistModel).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final c cVar = new c();
        Consumer<? super ResponseBody> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GlobalWatchlistPresenter.b(cVar, obj);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GlobalWatchlistPresenter.a(aVar, obj);
            }
        }));
        int i3 = f14400g + 33;
        f14399b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.Presenter
    public final void publishResult(GlobalWatchlistResult globalWatchlistResult) {
        int i2 = 2 % 2;
        int i3 = f14399b + 63;
        f14400g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(globalWatchlistResult, "");
        publishResult(this.f14404e, globalWatchlistResult);
        int i5 = f14400g + 3;
        f14399b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14399b + 87;
        f14400g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f14402c.clear();
            obj.hashCode();
            throw null;
        }
        this.f14402c.clear();
        int i4 = f14399b + 37;
        f14400g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
