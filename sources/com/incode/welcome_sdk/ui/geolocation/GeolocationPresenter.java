package com.incode.welcome_sdk.ui.geolocation;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.util.Strings;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.GeolocationUnavailableException;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ax;
import com.incode.welcome_sdk.results.GeolocationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.geolocation.GeolocationContract;
import com.incode.welcome_sdk.ui.geolocation.OnDeviceGeolocationResult;
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
public final class GeolocationPresenter extends BaseModulePresenter implements GeolocationContract.Presenter {

    /* JADX INFO: renamed from: i */
    private static int f14282i = 0;

    /* JADX INFO: renamed from: j */
    private static int f14283j = 1;

    /* JADX INFO: renamed from: a */
    private OnDeviceGeolocationResult.FetchingState f14284a;

    /* JADX INFO: renamed from: b */
    private final GeolocationContract.View f14285b;

    /* JADX INFO: renamed from: c */
    private GeolocationManager f14286c;

    /* JADX INFO: renamed from: d */
    private final IncodeWelcomeRepository f14287d;

    /* JADX INFO: renamed from: e */
    private final CompositeDisposable f14288e;

    /* JADX INFO: renamed from: f */
    private GeolocationResult f14289f;

    /* JADX INFO: renamed from: h */
    private LocationFetcher f14290h;

    public static final /* synthetic */ GeolocationContract.View access$getView$p(GeolocationPresenter geolocationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14283j + 81;
        f14282i = i3 % 128;
        int i4 = i3 % 2;
        GeolocationContract.View view = geolocationPresenter.f14285b;
        if (i4 == 0) {
            return view;
        }
        throw null;
    }

    public static final /* synthetic */ void access$handleResult(GeolocationPresenter geolocationPresenter, OnDeviceGeolocationResult onDeviceGeolocationResult) {
        int i2 = 2 % 2;
        int i3 = f14282i + 15;
        f14283j = i3 % 128;
        int i4 = i3 % 2;
        geolocationPresenter.b(onDeviceGeolocationResult);
        int i5 = f14283j + 63;
        f14282i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GeolocationPresenter(IncodeWelcomeRepository incodeWelcomeRepository, GeolocationContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f14287d = incodeWelcomeRepository;
        this.f14285b = view;
        this.f14288e = new CompositeDisposable();
        GeolocationManager geolocationManager = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getGeolocationManager();
        Intrinsics.checkNotNullExpressionValue(geolocationManager, "");
        this.f14286c = geolocationManager;
        this.f14284a = OnDeviceGeolocationResult.FetchingState.f14342d;
    }

    static final class b extends Lambda implements Function1<OnDeviceGeolocationResult, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f14297b = 1;

        /* JADX INFO: renamed from: e */
        private static int f14298e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(OnDeviceGeolocationResult onDeviceGeolocationResult) {
            int i2 = 2 % 2;
            int i3 = f14297b + 9;
            f14298e = i3 % 128;
            int i4 = i3 % 2;
            b(onDeviceGeolocationResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f14298e + 111;
            f14297b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return unit;
        }

        private void b(OnDeviceGeolocationResult onDeviceGeolocationResult) {
            int i2 = 2 % 2;
            int i3 = f14297b + 35;
            f14298e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(onDeviceGeolocationResult, "");
            GeolocationPresenter.access$handleResult(GeolocationPresenter.this, onDeviceGeolocationResult);
            int i5 = f14297b + 87;
            f14298e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14300a = 1;

        /* JADX INFO: renamed from: d */
        private static int f14301d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14300a + 113;
            f14301d = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f14300a + 45;
            f14301d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
            return unit;
        }

        private void b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14300a + 13;
            f14301d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNull(th);
                if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
                    int i4 = f14301d + 113;
                    f14300a = i4 % 128;
                    int i5 = i4 % 2;
                    GeolocationPresenter.access$getView$p(GeolocationPresenter.this).showNoNetworkMessage();
                    return;
                }
                return;
            }
            Intrinsics.checkNotNull(th);
            ThrowableExtensionsKt.isNoConnectivityException(th);
            throw null;
        }

        c() {
            super(1);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14283j + 79;
        f14282i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f14282i + 97;
        f14283j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14283j + 57;
        f14282i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f14282i + 125;
        f14283j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void onCreate() {
        int i2 = 2 % 2;
        LocationFetcher iLocationFetcher = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getILocationFetcher();
        this.f14290h = iLocationFetcher;
        if (iLocationFetcher == null) {
            int i3 = f14283j + 39;
            f14282i = i3 % 128;
            int i4 = i3 % 2;
            this.f14284a = OnDeviceGeolocationResult.FetchingState.f14340b;
            this.f14285b.showLocationUnavailable();
            int i5 = f14282i + 41;
            f14283j = i5 % 128;
            int i6 = i5 % 2;
        }
        CompositeDisposable compositeDisposable = this.f14288e;
        Observable<OnDeviceGeolocationResult> observableObserveOn = IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final b bVar = new b();
        Consumer<? super OnDeviceGeolocationResult> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationPresenter.d(bVar, obj);
            }
        };
        final c cVar = new c();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationPresenter.e(cVar, obj);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void onStart() {
        int i2 = 2 % 2;
        if (this.f14290h != null) {
            if (!this.f14285b.checkLocationPermissions()) {
                this.f14285b.showLocationDisabled();
                return;
            }
            int i3 = f14283j + 25;
            f14282i = i3 % 128;
            if (i3 % 2 == 0) {
                onPermissionsGranted();
                int i4 = f14282i + 25;
                f14283j = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            onPermissionsGranted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void onContinue() {
        int i2 = 2 % 2;
        int i3 = WhenMappings.f14292d[this.f14284a.ordinal()];
        if (i3 == 1) {
            if (!this.f14285b.checkLocationPermissions()) {
                this.f14285b.requestPermissions();
                return;
            }
            int i4 = f14282i + 7;
            f14283j = i4 % 128;
            int i5 = i4 % 2;
            onPermissionsGranted();
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            publishResult(new GeolocationResult(ResultCode.SUCCESS, new GeolocationUnavailableException(), null, 0.0d, 0.0d, 28, null));
            int i6 = f14282i + 65;
            f14283j = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        GeolocationResult geolocationResult = this.f14289f;
        if (geolocationResult == null) {
            int i8 = f14282i + 67;
            f14283j = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            geolocationResult = null;
        }
        publishResult(geolocationResult);
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void onPermissionsGranted() {
        int i2 = 2 % 2;
        int i3 = f14283j + 15;
        f14282i = i3 % 128;
        if (i3 % 2 == 0) {
            getUserLocation();
            int i4 = f14282i + 3;
            f14283j = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getUserLocation();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void getUserLocation() {
        int i2 = 2 % 2;
        int i3 = f14283j + 7;
        f14282i = i3 % 128;
        if (i3 % 2 == 0) {
            this.f14286c.getUserLocation();
        } else {
            this.f14286c.getUserLocation();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14283j + 75;
        int i4 = i3 % 128;
        f14282i = i4;
        int i5 = i3 % 2;
        LocationFetcher locationFetcher = this.f14290h;
        if (locationFetcher != null) {
            locationFetcher.stopAllLocationUpdates();
        } else {
            int i6 = i4 + 27;
            f14283j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
        }
        this.f14288e.clear();
        int i8 = f14282i + 87;
        f14283j = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 79 / 0;
        }
    }

    private final void b(OnDeviceGeolocationResult onDeviceGeolocationResult) {
        int i2 = 2 % 2;
        int i3 = f14283j + 75;
        f14282i = i3 % 128;
        int i4 = i3 % 2;
        this.f14284a = onDeviceGeolocationResult.f14325a;
        int i5 = WhenMappings.f14292d[onDeviceGeolocationResult.f14325a.ordinal()];
        if (i5 == 1) {
            this.f14285b.showWaitingForLocation();
            return;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                this.f14285b.showLocationUnavailable();
                return;
            } else {
                if (i5 != 4) {
                    return;
                }
                this.f14285b.showNoNetworkMessage();
                return;
            }
        }
        this.f14289f = new GeolocationResult(ResultCode.SUCCESS, null, onDeviceGeolocationResult.f14328d, onDeviceGeolocationResult.f14326b, onDeviceGeolocationResult.f14327c, 2, null);
        String str = onDeviceGeolocationResult.f14336l;
        if (str != null) {
            d(str);
            this.f14285b.showCurrentLocation(str);
        }
        if (!IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
            int i6 = f14283j + 89;
            f14282i = i6 % 128;
            int i7 = i6 % 2;
            e(onDeviceGeolocationResult);
            return;
        }
        if (Strings.isEmptyOrWhitespace(onDeviceGeolocationResult.f14336l)) {
            int i8 = f14282i + 79;
            f14283j = i8 % 128;
            if (i8 % 2 != 0) {
                this.f14285b.showLocationUnavailable();
            } else {
                this.f14285b.showLocationUnavailable();
                int i9 = 99 / 0;
            }
        }
    }

    private final void d(String str) {
        int i2 = 2 % 2;
        int i3 = f14282i + 77;
        f14283j = i3 % 128;
        int i4 = i3 % 2;
        this.f14287d.setCurrentLocation(str);
        int i5 = f14283j + 97;
        f14282i = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class d extends Lambda implements Function1<ax, String> {

        /* JADX INFO: renamed from: a */
        private static int f14303a = 0;

        /* JADX INFO: renamed from: b */
        private static int f14304b = 1;

        /* JADX INFO: renamed from: c */
        private static int f14305c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14306d = 0;

        /* JADX INFO: renamed from: e */
        public static final d f14307e = new d();

        private static String c(ax axVar) {
            int i2 = 2 % 2;
            int i3 = f14305c + 41;
            f14303a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(axVar, "");
                axVar.d();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(axVar, "");
            String strD = axVar.d();
            int i4 = f14305c + 69;
            f14303a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return strD;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ String invoke(ax axVar) {
            int i2 = 2 % 2;
            int i3 = f14305c + 71;
            f14303a = i3 % 128;
            int i4 = i3 % 2;
            String strC = c(axVar);
            int i5 = f14305c + 3;
            f14303a = i5 % 128;
            if (i5 % 2 == 0) {
                return strC;
            }
            throw null;
        }

        static {
            int i2 = f14306d + 39;
            f14304b = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    public static final String b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14282i + 47;
        f14283j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i5 = f14283j + 7;
        f14282i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    static final class a extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14294a = 1;

        /* JADX INFO: renamed from: c */
        private static int f14295c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f14295c + 105;
            f14294a = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f14295c + 45;
            f14294a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void b(String str) {
            int i2 = 2 % 2;
            int i3 = f14295c + 19;
            f14294a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                GeolocationPresenter.access$getView$p(GeolocationPresenter.this).onServerResponse(str);
                int i4 = 4 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                GeolocationPresenter.access$getView$p(GeolocationPresenter.this).onServerResponse(str);
            }
            int i5 = f14294a + 73;
            f14295c = i5 % 128;
            int i6 = i5 % 2;
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14308a = 1;

        /* JADX INFO: renamed from: b */
        private static int f14309b = 1;

        /* JADX INFO: renamed from: c */
        public static final e f14310c = new e();

        /* JADX INFO: renamed from: d */
        private static int f14311d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14312e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14309b + 53;
            f14311d = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f14309b + 15;
            f14311d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14311d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f14309b = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th);
            if (i4 == 0) {
                int i5 = 95 / 0;
            }
        }

        static {
            int i2 = f14308a + 9;
            f14312e = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        e() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14283j + 55;
        f14282i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14282i + 55;
        f14283j = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14283j + 79;
        f14282i = i3 % 128;
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

    private final void e(OnDeviceGeolocationResult onDeviceGeolocationResult) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f14288e;
        Observable<ax> observableSendGeolocation = this.f14287d.sendGeolocation(onDeviceGeolocationResult.f14326b, onDeviceGeolocationResult.f14327c, onDeviceGeolocationResult.f14329e, onDeviceGeolocationResult.f14331g, onDeviceGeolocationResult.f14333i, onDeviceGeolocationResult.f14332h, onDeviceGeolocationResult.f14334j, onDeviceGeolocationResult.f14330f, onDeviceGeolocationResult.f14337m, onDeviceGeolocationResult.f14338n, onDeviceGeolocationResult.f14335k);
        final d dVar = d.f14307e;
        Observable observableObserveOn = observableSendGeolocation.map(new Function() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return GeolocationPresenter.b(dVar, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationPresenter.a(aVar, obj);
            }
        };
        final e eVar = e.f14310c;
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationPresenter.c(eVar, obj);
            }
        }));
        int i3 = f14283j + 81;
        f14282i = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.Presenter
    public final void publishResult(GeolocationResult geolocationResult) {
        int i2 = 2 % 2;
        int i3 = f14283j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14282i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(geolocationResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getGeolocationBus(), geolocationResult);
        } else {
            Intrinsics.checkNotNullParameter(geolocationResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getGeolocationBus(), geolocationResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        private static int f14291a = 0;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f14292d;

        /* JADX INFO: renamed from: e */
        private static int f14293e = 1;

        static {
            int[] iArr = new int[OnDeviceGeolocationResult.FetchingState.values().length];
            try {
                iArr[OnDeviceGeolocationResult.FetchingState.f14342d.ordinal()] = 1;
                int i2 = f14293e + 107;
                f14291a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnDeviceGeolocationResult.FetchingState.f14343e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnDeviceGeolocationResult.FetchingState.f14340b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OnDeviceGeolocationResult.FetchingState.f14341c.ordinal()] = 4;
                int i5 = f14293e + 47;
                f14291a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            f14292d = iArr;
        }
    }
}
