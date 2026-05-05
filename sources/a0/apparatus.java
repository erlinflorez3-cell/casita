package a0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes.dex */
public final class apparatus implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ taste f75a;

    public apparatus(taste tasteVar) {
        this.f75a = tasteVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (((Boolean) this.f75a.f83e.invoke(location)).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f75a.f82d, null, null, new tongue(this.f75a, location, null), 3, null);
        }
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
