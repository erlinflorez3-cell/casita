package com.incode.welcome_sdk.ui.geolocation.impl;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import com.incode.welcome_sdk.ui.geolocation.helpers.LocationCallback;
import com.incode.welcome_sdk.ui.geolocation.helpers.Task;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class HuaweiLocationFetcherImpl implements LocationFetcher {

    /* JADX INFO: renamed from: b */
    private static int f14362b = 0;

    /* JADX INFO: renamed from: d */
    private static int f14363d = 1;

    /* JADX INFO: renamed from: a */
    private final FusedLocationProviderClient f14364a;

    /* JADX INFO: renamed from: e */
    private final Map<LocationCallback, com.huawei.hms.location.LocationCallback> f14365e;

    public HuaweiLocationFetcherImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
        this.f14364a = fusedLocationProviderClient;
        this.f14365e = new HashMap();
    }

    public static final void d(Task task, Location location) {
        int i2 = 2 % 2;
        int i3 = f14362b + 15;
        f14363d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(task, "");
            task.onSuccess(location);
        } else {
            Intrinsics.checkNotNullParameter(task, "");
            task.onSuccess(location);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final Task<Location> getLastLocation() {
        int i2 = 2 % 2;
        final Task<Location> task = new Task<>();
        this.f14364a.getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: com.incode.welcome_sdk.ui.geolocation.impl.HuaweiLocationFetcherImpl$$ExternalSyntheticLambda0
            public final void onSuccess(Object obj) {
                HuaweiLocationFetcherImpl.d(task, (Location) obj);
            }
        });
        int i3 = f14363d + 91;
        f14362b = i3 % 128;
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
        com.huawei.hms.location.LocationCallback locationCallback2 = new com.huawei.hms.location.LocationCallback() { // from class: com.incode.welcome_sdk.ui.geolocation.impl.HuaweiLocationFetcherImpl$requestLocationUpdates$huaweiLocationCallback$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14366b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f14367c = 0;

            public final void onLocationAvailability(LocationAvailability locationAvailability) {
                int i3 = 2 % 2;
                int i4 = f14367c + 35;
                f14366b = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(locationAvailability, "");
                Timber.Forest.v("HuaweiLocationFetcher onLocationAvailability:%s", locationAvailability);
                super.onLocationAvailability(locationAvailability);
                int i6 = f14367c + 1;
                f14366b = i6 % 128;
                int i7 = i6 % 2;
            }

            public final void onLocationResult(LocationResult locationResult) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(locationResult, "");
                Timber.Forest.v("HuaweiLocationFetcher onLocationResult", new Object[0]);
                for (Location location : locationResult.getLocations()) {
                    if (location != null) {
                        int i4 = f14366b + 83;
                        f14367c = i4 % 128;
                        int i5 = i4 % 2;
                        locationCallback.onLocationResult(location);
                    }
                }
                int i6 = f14367c + 61;
                f14366b = i6 % 128;
                int i7 = i6 % 2;
            }
        };
        this.f14365e.put(locationCallback, locationCallback2);
        this.f14364a.requestLocationUpdates(locationRequestCreate, locationCallback2, looper);
        int i3 = f14362b + 9;
        f14363d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final void removeLocationUpdates(LocationCallback locationCallback) {
        com.huawei.hms.location.LocationCallback locationCallback2;
        int i2 = 2 % 2;
        int i3 = f14362b + 123;
        f14363d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(locationCallback, "");
            locationCallback2 = this.f14365e.get(locationCallback);
            int i4 = 92 / 0;
            if (locationCallback2 == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(locationCallback, "");
            locationCallback2 = this.f14365e.get(locationCallback);
            if (locationCallback2 == null) {
                return;
            }
        }
        Timber.Forest.v("HuaweiLocationFetcher removeLocationUpdates", new Object[0]);
        this.f14364a.removeLocationUpdates(locationCallback2);
        this.f14365e.remove(locationCallback);
        int i5 = f14362b + 115;
        f14363d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 3;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.LocationFetcher
    public final void stopAllLocationUpdates() {
        int i2 = 2 % 2;
        int i3 = f14362b + 1;
        f14363d = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.Forest.v("HuaweiLocationFetcher stopAllLocationUpdates", new Object[0]);
        } else {
            Timber.Forest.v("HuaweiLocationFetcher stopAllLocationUpdates", new Object[0]);
        }
        Iterator<Map.Entry<LocationCallback, com.huawei.hms.location.LocationCallback>> it = this.f14365e.entrySet().iterator();
        while (it.hasNext()) {
            this.f14364a.removeLocationUpdates(it.next().getValue());
        }
        int i4 = f14363d + 13;
        f14362b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
