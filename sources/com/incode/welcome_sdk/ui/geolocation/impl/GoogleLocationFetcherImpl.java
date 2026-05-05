package com.incode.welcome_sdk.ui.geolocation.impl;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import com.incode.welcome_sdk.ui.geolocation.helpers.LocationCallback;
import com.incode.welcome_sdk.ui.geolocation.helpers.Task;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class GoogleLocationFetcherImpl implements LocationFetcher {

    /* JADX INFO: renamed from: c */
    private static int f14352c = 1;

    /* JADX INFO: renamed from: e */
    private static int f14353e = 0;

    /* JADX INFO: renamed from: a */
    private final Map<LocationCallback, com.google.android.gms.location.LocationCallback> f14354a;

    /* JADX INFO: renamed from: b */
    private final FusedLocationProviderClient f14355b;

    public GoogleLocationFetcherImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
        this.f14355b = fusedLocationProviderClient;
        this.f14354a = new HashMap();
    }

    static final class e extends Lambda implements Function1<Location, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f14356b = 0;

        /* JADX INFO: renamed from: d */
        private static int f14357d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Task<Location> f14358a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Location location) {
            int i2 = 2 % 2;
            int i3 = f14356b + 1;
            f14357d = i3 % 128;
            int i4 = i3 % 2;
            c(location);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f14356b + 87;
            f14357d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Location location) {
            int i2 = 2 % 2;
            int i3 = f14357d + 21;
            f14356b = i3 % 128;
            if (i3 % 2 != 0) {
                this.f14358a.onSuccess(location);
                int i4 = 32 / 0;
            } else {
                this.f14358a.onSuccess(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Task<Location> task) {
            super(1);
            this.f14358a = task;
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14352c + 5;
        f14353e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14353e + 25;
        f14352c = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final Task<Location> getLastLocation() {
        int i2 = 2 % 2;
        Task<Location> task = new Task<>();
        com.google.android.gms.tasks.Task<Location> lastLocation = this.f14355b.getLastLocation();
        final e eVar = new e(task);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: com.incode.welcome_sdk.ui.geolocation.impl.GoogleLocationFetcherImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GoogleLocationFetcherImpl.d(eVar, obj);
            }
        });
        int i3 = f14352c + 93;
        f14353e = i3 % 128;
        if (i3 % 2 == 0) {
            return task;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final void requestLocationUpdates(final LocationCallback locationCallback, Looper looper) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(locationCallback, "");
        Intrinsics.checkNotNullParameter(looper, "");
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(100);
        locationRequestCreate.setInterval(2000L);
        Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "");
        com.google.android.gms.location.LocationCallback locationCallback2 = new com.google.android.gms.location.LocationCallback() { // from class: com.incode.welcome_sdk.ui.geolocation.impl.GoogleLocationFetcherImpl$requestLocationUpdates$googleLocationCallback$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14359b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f14360c = 1;

            @Override // com.google.android.gms.location.LocationCallback
            public final void onLocationAvailability(LocationAvailability locationAvailability) {
                int i3 = 2 % 2;
                int i4 = f14360c + 71;
                f14359b = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(locationAvailability, "");
                    Timber.Forest.v("GoogleLocationFetcher onLocationAvailability:%s", locationAvailability);
                } else {
                    Intrinsics.checkNotNullParameter(locationAvailability, "");
                    Timber.Forest.v("GoogleLocationFetcher onLocationAvailability:%s", locationAvailability);
                }
                super.onLocationAvailability(locationAvailability);
                int i5 = f14360c + 109;
                f14359b = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.google.android.gms.location.LocationCallback
            public final void onLocationResult(LocationResult locationResult) {
                int i3 = 2 % 2;
                int i4 = f14359b + 25;
                f14360c = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(locationResult, "");
                Timber.Forest.v("GoogleLocationFetcher onLocationResult", new Object[0]);
                int i6 = f14359b + 17;
                f14360c = i6 % 128;
                int i7 = i6 % 2;
                for (Location location : locationResult.getLocations()) {
                    if (location != null) {
                        locationCallback.onLocationResult(location);
                    }
                }
            }
        };
        this.f14354a.put(locationCallback, locationCallback2);
        this.f14355b.requestLocationUpdates(locationRequestCreate, locationCallback2, looper);
        int i3 = f14353e + 67;
        f14352c = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final void removeLocationUpdates(LocationCallback locationCallback) {
        int i2 = 2 % 2;
        int i3 = f14352c + 115;
        f14353e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(locationCallback, "");
            this.f14354a.get(locationCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(locationCallback, "");
        com.google.android.gms.location.LocationCallback locationCallback2 = this.f14354a.get(locationCallback);
        if (locationCallback2 != null) {
            Timber.Forest.v("GoogleLocationFetcher removeLocationUpdates", new Object[0]);
            this.f14355b.removeLocationUpdates(locationCallback2);
            this.f14354a.remove(locationCallback);
        }
        int i4 = f14353e + 41;
        f14352c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final void stopAllLocationUpdates() {
        int i2 = 2 % 2;
        int i3 = f14353e + 17;
        f14352c = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.v("GoogleLocationFetcher stopAllLocationUpdates", new Object[0]);
        Iterator<Map.Entry<LocationCallback, com.google.android.gms.location.LocationCallback>> it = this.f14354a.entrySet().iterator();
        while (it.hasNext()) {
            int i5 = f14352c + 99;
            f14353e = i5 % 128;
            int i6 = i5 % 2;
            this.f14355b.removeLocationUpdates(it.next().getValue());
        }
    }
}
