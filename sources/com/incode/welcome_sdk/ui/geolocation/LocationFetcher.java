package com.incode.welcome_sdk.ui.geolocation;

import android.location.Location;
import android.os.Looper;
import com.incode.welcome_sdk.ui.geolocation.helpers.LocationCallback;
import com.incode.welcome_sdk.ui.geolocation.helpers.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface LocationFetcher {
    Task<Location> getLastLocation();

    void removeLocationUpdates(LocationCallback locationCallback);

    void requestLocationUpdates(LocationCallback locationCallback, Looper looper);

    void stopAllLocationUpdates();
}
