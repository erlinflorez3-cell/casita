package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes8.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int i2) {
        return this.zaa.get(i2, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int zab(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i2 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.zaa.size()) {
                    i2 = -1;
                    break;
                }
                int iKeyAt = this.zaa.keyAt(i3);
                if (iKeyAt > minApkVersion && this.zaa.get(iKeyAt) == 0) {
                    break;
                }
                i3++;
            }
            iZaa = i2 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i2;
            this.zaa.put(minApkVersion, iZaa);
        }
        return iZaa;
    }

    public final void zac() {
        this.zaa.clear();
    }
}
