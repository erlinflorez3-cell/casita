package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.CustomWatchlistResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract;
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
public final class CustomWatchlistPresenter extends BaseModulePresenter implements CustomWatchlistContract.Presenter {

    /* JADX INFO: renamed from: a */
    private static int f13180a = 0;

    /* JADX INFO: renamed from: b */
    private static int f13181b = 1;

    /* JADX INFO: renamed from: c */
    private final CompositeDisposable f13182c;

    /* JADX INFO: renamed from: d */
    private final CustomWatchlistContract.View f13183d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcomeRepository f13184e;

    public static final /* synthetic */ CustomWatchlistContract.View access$getView$p(CustomWatchlistPresenter customWatchlistPresenter) {
        int i2 = 2 % 2;
        int i3 = f13180a + 81;
        int i4 = i3 % 128;
        f13181b = i4;
        int i5 = i3 % 2;
        CustomWatchlistContract.View view = customWatchlistPresenter.f13183d;
        int i6 = i4 + 105;
        f13180a = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CustomWatchlistPresenter(IncodeWelcomeRepository incodeWelcomeRepository, CustomWatchlistContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f13184e = incodeWelcomeRepository;
        this.f13183d = view;
        this.f13182c = new CompositeDisposable();
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f13185a = 1;

        /* JADX INFO: renamed from: e */
        private static int f13186e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f13186e + 59;
            f13185a = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.d(th, "Couldn't process custom watchlist", new Object[0]);
            CustomWatchlistPresenter.access$getView$p(CustomWatchlistPresenter.this).onCustomWatchlistProcessed(new CustomWatchlistResult(ResultCode.ERROR, false, 2, null));
            int i3 = f13186e + 63;
            f13185a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f13188b = 1;

        /* JADX INFO: renamed from: e */
        private static int f13189e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f13189e + 113;
            f13188b = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            int i5 = f13188b + 35;
            f13189e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            CustomWatchlistPresenter.access$getView$p(CustomWatchlistPresenter.this).onCustomWatchlistProcessed(new CustomWatchlistResult(ResultCode.SUCCESS, responseSuccess.isSuccess()));
            int i3 = f13188b + 77;
            f13189e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
        }

        c() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f13181b + 47;
        f13180a = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f13180a + 23;
        f13181b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f13181b + 115;
        f13180a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f13180a + 11;
        f13181b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract.Presenter
    public final void processCustomWatchlist() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f13182c;
        Observable<ResponseSuccess> observableObserveOn = this.f13184e.processCustomWatchlist().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final c cVar = new c();
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CustomWatchlistPresenter.a(cVar, obj);
            }
        };
        final a aVar = new a();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CustomWatchlistPresenter.d(aVar, obj);
            }
        }));
        int i3 = f13180a + 113;
        f13181b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f13180a + 59;
        f13181b = i3 % 128;
        int i4 = i3 % 2;
        this.f13182c.clear();
        int i5 = f13180a + 59;
        f13181b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract.Presenter
    public final void publishResult(CustomWatchlistResult customWatchlistResult) {
        int i2 = 2 % 2;
        int i3 = f13181b + 123;
        f13180a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(customWatchlistResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getCustomWatchlistBus(), customWatchlistResult);
        int i5 = f13180a + 85;
        f13181b = i5 % 128;
        int i6 = i5 % 2;
    }
}
