package o;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class apparatus implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f20557a;

    public apparatus(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f20557a = cancellableContinuationImpl;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f20557a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.m8980constructorimpl(location));
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
