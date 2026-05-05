package com.incode.welcome_sdk.ui.geolocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Looper;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.ui.geolocation.OnDeviceGeolocationResult;
import com.incode.welcome_sdk.ui.geolocation.helpers.LocationCallback;
import com.incode.welcome_sdk.ui.geolocation.helpers.Task;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationManager {

    /* JADX INFO: renamed from: c */
    private static int f14266c = 0;

    /* JADX INFO: renamed from: g */
    private static int f14267g = 1;

    /* JADX INFO: renamed from: a */
    private final CompositeDisposable f14268a;

    /* JADX INFO: renamed from: b */
    private final LocationFetcher f14269b;

    /* JADX INFO: renamed from: d */
    private final CompositeDisposable f14270d;

    /* JADX INFO: renamed from: e */
    private final Context f14271e;

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = i8 | i5;
        int i12 = (~i11) | i10;
        int i13 = ~i5;
        int i14 = (~(i7 | i11)) | (~(i9 | i13)) | (~(i13 | i2));
        int i15 = i2 + i5 + i4 + ((-1017789379) * i6) + (461141949 * i3);
        int i16 = i15 * i15;
        int i17 = ((-551480932) * i2) + 431816704 + ((-1613042074) * i5) + ((-1061561142) * i12) + (i14 * (-1616703077)) + ((-1616703077) * i10) + (1065222144 * i4) + ((-1727660032) * i6) + (1912995840 * i3) + ((-1005256704) * i16);
        int i18 = ((i2 * (-1063000396)) - 360994079) + (i5 * (-1063001374)) + (i12 * (-978)) + (i14 * 489) + (i10 * 489) + (i4 * (-1063000885)) + (i6 * (-90181537)) + (i3 * (-1548859681)) + (i16 * 816250880);
        return i17 + ((i18 * i18) * 1493368832) != 1 ? c(objArr) : d(objArr);
    }

    public GeolocationManager(Context context, LocationFetcher locationFetcher) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f14271e = context;
        this.f14269b = locationFetcher;
        this.f14270d = new CompositeDisposable();
        this.f14268a = new CompositeDisposable();
    }

    public static final /* synthetic */ Context access$getContext$p(GeolocationManager geolocationManager) {
        int i2 = 2 % 2;
        int i3 = f14267g + 13;
        int i4 = i3 % 128;
        f14266c = i4;
        int i5 = i3 % 2;
        Context context = geolocationManager.f14271e;
        int i6 = i4 + 85;
        f14267g = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ LocationFetcher access$getLocationFetcher$p(GeolocationManager geolocationManager) {
        int i2 = 2 % 2;
        int i3 = f14267g + 79;
        f14266c = i3 % 128;
        int i4 = i3 % 2;
        LocationFetcher locationFetcher = geolocationManager.f14269b;
        if (i4 == 0) {
            return locationFetcher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$parseLocation(GeolocationManager geolocationManager, Location location) {
        int i2 = 2 % 2;
        int i3 = f14266c + 115;
        f14267g = i3 % 128;
        int i4 = i3 % 2;
        geolocationManager.a(location);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f14267g + 71;
        f14266c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
    }

    public static final /* synthetic */ void access$processGeolocationResult(GeolocationManager geolocationManager, Address address, double d2, double d3) {
        int i2 = 2 % 2;
        int i3 = f14267g + 109;
        f14266c = i3 % 128;
        int i4 = i3 % 2;
        e(address, d2, d3);
        int i5 = f14266c + 53;
        f14267g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void b(final GeolocationManager geolocationManager, Location location) {
        int i2 = 2 % 2;
        int i3 = f14266c + 31;
        f14267g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(geolocationManager, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(geolocationManager, "");
        if (location != null) {
            geolocationManager.a(location);
            int i4 = f14266c + 101;
            f14267g = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Timber.Forest.v("getLastLocation is null", new Object[0]);
        geolocationManager.e();
        LocationCallback locationCallback = new LocationCallback() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$getUserLocation$1$locationCallback$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f14279a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f14280e = 0;

            @Override // com.incode.welcome_sdk.ui.geolocation.helpers.LocationCallback
            public final void onLocationResult(Location location2) {
                int i6 = 2 % 2;
                int i7 = f14280e + 51;
                f14279a = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(location2, "");
                Timber.Forest.v("onLocationResult:%s", location2);
                GeolocationManager.access$parseLocation(this.f14281d, location2);
                GeolocationManager.access$getLocationFetcher$p(this.f14281d).removeLocationUpdates(this);
                int i9 = f14280e + 121;
                f14279a = i9 % 128;
                int i10 = i9 % 2;
            }
        };
        LocationFetcher locationFetcher = geolocationManager.f14269b;
        Looper mainLooper = geolocationManager.f14271e.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "");
        locationFetcher.requestLocationUpdates(locationCallback, mainLooper);
    }

    public final void getUserLocation() {
        int i2 = 2 % 2;
        int i3 = f14267g + 91;
        f14266c = i3 % 128;
        int i4 = i3 % 2;
        LocationFetcher locationFetcher = this.f14269b;
        if (locationFetcher == null) {
            IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().onNext(new OnDeviceGeolocationResult(OnDeviceGeolocationResult.FetchingState.f14340b, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, 16382, null));
            return;
        }
        locationFetcher.getLastLocation().addOnSuccessListener(new Task.OnSuccessListener() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda0
            @Override // com.incode.welcome_sdk.ui.geolocation.helpers.Task.OnSuccessListener
            public final void onSuccess(Object obj) {
                GeolocationManager.b(this.f$0, (Location) obj);
            }
        });
        int i5 = f14266c + 93;
        f14267g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        GeolocationManager geolocationManager = (GeolocationManager) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(geolocationManager, "");
        IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().onNext(new OnDeviceGeolocationResult(OnDeviceGeolocationResult.FetchingState.f14340b, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, 16382, null));
        LocationFetcher locationFetcher = geolocationManager.f14269b;
        if (locationFetcher == null) {
            int i3 = f14267g + 113;
            f14266c = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = f14267g + 35;
        f14266c = i5 % 128;
        if (i5 % 2 == 0) {
            locationFetcher.stopAllLocationUpdates();
            return null;
        }
        locationFetcher.stopAllLocationUpdates();
        throw null;
    }

    private final void e() {
        int i2 = 2 % 2;
        IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().onNext(new OnDeviceGeolocationResult(OnDeviceGeolocationResult.FetchingState.f14342d, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, 16382, null));
        this.f14268a.add(Completable.timer(15L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Action
            public final void run() {
                GeolocationManager.b(this.f$0);
            }
        }));
        int i3 = f14266c + 29;
        f14267g = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        GeolocationManager geolocationManager = (GeolocationManager) objArr[0];
        double dDoubleValue = ((Number) objArr[1]).doubleValue();
        double dDoubleValue2 = ((Number) objArr[2]).doubleValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(geolocationManager, "");
        try {
            List<Address> fromLocation = new Geocoder(geolocationManager.f14271e, Locale.getDefault()).getFromLocation(dDoubleValue, dDoubleValue2, 1);
            List<Address> list = fromLocation;
            if (list != null) {
                int i3 = f14266c + 15;
                f14267g = i3 % 128;
                if (i3 % 2 == 0) {
                    list.isEmpty();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!list.isEmpty()) {
                    int i4 = f14266c + 107;
                    f14267g = i4 % 128;
                    if (i4 % 2 == 0) {
                        Address address = fromLocation.get(1);
                        Timber.Forest.d("Address: %s", address);
                        return address;
                    }
                    Address address2 = fromLocation.get(0);
                    Timber.Forest.d("Address: %s", address2);
                    return address2;
                }
            }
        } catch (IOException e2) {
            Timber.Forest.e(e2);
        }
        return new Address(Locale.getDefault());
    }

    static final class a extends Lambda implements Function1<Address, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f14272d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14273e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ double f14274a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ double f14275b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Address address) {
            int i2 = 2 % 2;
            int i3 = f14272d + 111;
            f14273e = i3 % 128;
            int i4 = i3 % 2;
            b(address);
            Unit unit = Unit.INSTANCE;
            int i5 = f14273e + 43;
            f14272d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Address address) {
            int i2 = 2 % 2;
            int i3 = f14273e + 103;
            f14272d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(address, "");
            if (!com.incode.welcome_sdk.commons.httpinterceptors.e.c(GeolocationManager.access$getContext$p(GeolocationManager.this))) {
                IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().onNext(new OnDeviceGeolocationResult(OnDeviceGeolocationResult.FetchingState.f14341c, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, 16382, null));
                return;
            }
            GeolocationManager.access$processGeolocationResult(GeolocationManager.this, address, this.f14275b, this.f14274a);
            int i5 = f14273e + 23;
            f14272d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d2, double d3) {
            super(1);
            this.f14275b = d2;
            this.f14274a = d3;
        }
    }

    public static final void d(GeolocationManager geolocationManager) {
        int i2 = 2 % 2;
        int i3 = f14266c + 57;
        f14267g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(geolocationManager, "");
            geolocationManager.c();
            int i4 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(geolocationManager, "");
            geolocationManager.c();
        }
        int i5 = f14267g + 9;
        f14266c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14266c + 75;
        f14267g = i3 % 128;
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

    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f14277d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14278e = 0;

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14277d + 95;
            f14278e = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            int i5 = f14278e + 45;
            f14277d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14278e + 61;
            f14277d = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 8 / 0;
            }
            return unit;
        }

        e(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14266c + 67;
        f14267g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 69 / 0;
        }
    }

    private final void a(Location location) {
        int i2 = 2 % 2;
        final double latitude = location.getLatitude();
        final double longitude = location.getLongitude();
        CompositeDisposable compositeDisposable = this.f14270d;
        Observable observableDoFinally = Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GeolocationManager.b(this.f$0, latitude, longitude);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Action
            public final void run() {
                GeolocationManager.d(this.f$0);
            }
        });
        final a aVar = new a(latitude, longitude);
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationManager.c(aVar, obj);
            }
        };
        final e eVar = new e(Timber.Forest);
        compositeDisposable.add(observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationManager$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GeolocationManager.b(eVar, obj);
            }
        }));
        int i3 = f14267g + 39;
        f14266c = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void e(Address address, double d2, double d3) {
        int i2 = 2 % 2;
        int i3 = f14266c + 27;
        f14267g = i3 % 128;
        int i4 = i3 % 2;
        String thoroughfare = address.getThoroughfare();
        String subThoroughfare = address.getSubThoroughfare();
        String locality = address.getLocality();
        String subLocality = address.getSubLocality();
        String adminArea = address.getAdminArea();
        String subAdminArea = address.getSubAdminArea();
        String postalCode = address.getPostalCode();
        String countryCode = address.getCountryCode();
        String countryName = address.getCountryName();
        IncodeWelcome.AddressFields addressFields = new IncodeWelcome.AddressFields(thoroughfare, subLocality == null ? subAdminArea : subLocality, postalCode, locality, adminArea, countryName);
        IncodeWelcome.Companion.getInstance().getOnDeviceGeolocationResultBus().onNext(new OnDeviceGeolocationResult(OnDeviceGeolocationResult.FetchingState.f14343e, addressFields, d2, d3, thoroughfare, subThoroughfare, locality, subLocality, adminArea, subAdminArea, postalCode, countryCode, countryName, StringUtils.joinNonBlankStringArray(new String[]{addressFields.getCity(), addressFields.getState(), addressFields.getCountryName()}, ", ")));
        int i5 = f14266c + 111;
        f14267g = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f14267g + 37;
        f14266c = i3 % 128;
        if (i3 % 2 == 0) {
            this.f14268a.clear();
            int i4 = f14266c + 17;
            f14267g = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f14268a.clear();
        throw null;
    }

    public static final Address b(GeolocationManager geolocationManager, double d2, double d3) {
        Object[] objArr = {geolocationManager, Double.valueOf(d2), Double.valueOf(d3)};
        int iE = bf.a.e();
        return (Address) b(objArr, -343291019, bf.a.e(), bf.a.e(), 343291019, bf.a.e(), iE);
    }

    public static final void b(GeolocationManager geolocationManager) {
        Object[] objArr = {geolocationManager};
        int iE = bf.a.e();
        b(objArr, -114978139, bf.a.e(), bf.a.e(), 114978140, bf.a.e(), iE);
    }
}
