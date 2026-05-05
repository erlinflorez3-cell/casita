package n0;

import android.location.Location;
import c1.wrap;
import f0.tongue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pair implements m0.pair {

    /* JADX INFO: renamed from: a */
    public final double f19890a;

    /* JADX INFO: renamed from: b */
    public final double f19891b;

    /* JADX INFO: renamed from: c */
    public final double f19892c;

    /* JADX INFO: renamed from: d */
    public final tongue f19893d;

    public pair(Location location, tongue tongueVar) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        double altitude = location.getAltitude();
        this.f19890a = latitude;
        this.f19891b = longitude;
        this.f19892c = altitude;
        this.f19893d = tongueVar;
    }

    @Override // m0.pair
    public final List a() {
        return wrap.f2518b.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Double.compare(this.f19890a, pairVar.f19890a) == 0 && Double.compare(this.f19891b, pairVar.f19891b) == 0 && Double.compare(this.f19892c, pairVar.f19892c) == 0 && Intrinsics.areEqual(this.f19893d, pairVar.f19893d);
    }

    public final int hashCode() {
        return this.f19893d.hashCode() + ((Double.hashCode(this.f19892c) + ((Double.hashCode(this.f19891b) + (Double.hashCode(this.f19890a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MockLocationResult(latitude=" + this.f19890a + ", longitude=" + this.f19891b + ", altitude=" + this.f19892c + ", deviceContext=" + this.f19893d + ")";
    }
}
