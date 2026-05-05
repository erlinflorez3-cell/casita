package o.u;

import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import java.util.Random;
import o.m.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26836a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26837c = -477952783;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26838e = 2139791047;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26839g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26840b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<h> f26841d;

    public e(boolean z2, List<h> list) {
        this.f26840b = z2;
        this.f26841d = list;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws CloneNotSupportedException {
        int i8 = i3 | i7;
        int i9 = ~((i8 + i4) - (i8 & i4));
        int i10 = ~i3;
        int i11 = ~i7;
        int i12 = ~((i10 + i11) - (i10 & i11));
        int i13 = ~i4;
        int i14 = ~((i10 + i13) - (i10 & i13));
        int i15 = (i14 + i12) - (i14 & i12);
        int i16 = ~((i11 + i13) - (i11 & i13));
        int i17 = (i15 + i16) - (i15 & i16);
        int i18 = (i13 + i12) - (i13 & i12);
        int i19 = i3 + i7 + i2 + (105149790 * i5) + ((-719480883) * i6);
        int i20 = i19 * i19;
        int i21 = (i3 * (-424837635)) + 281018368 + ((-424837635) * i7) + (1798143484 * i9) + (i17 * (-1798143484)) + ((-1798143484) * i18) + (2071986176 * i2) + ((-654311424) * i5) + (1702887424 * i6) + ((-155189248) * i20);
        int i22 = (i3 * 910058005) + 1460508013 + (i7 * 910058005) + (i9 * (-484)) + (i17 * 484) + (i18 * 484) + (i2 * 910058489) + (i5 * (-759332242)) + (i6 * (-1121784475)) + (i20 * 1086324736);
        int i23 = i21 + (i22 * i22 * (-1925185536));
        if (i23 != 1) {
            return i23 != 2 ? b(objArr) : d(objArr);
        }
        int i24 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        e eVar = (e) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f26836a + 99;
        f26839g = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        if (i4 == 0) {
            int i5 = 10 / 0;
        }
        return Boolean.valueOf(zEquals);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26839g + 71;
        f26836a = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = eVar.f26840b;
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        return Boolean.valueOf(z2);
    }

    public final boolean c() {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        return ((Boolean) a((int) SystemClock.uptimeMillis(), -692343172, iMaxMemory, new Random().nextInt(), new Object[]{this}, (int) Runtime.getRuntime().totalMemory(), 692343174)).booleanValue();
    }

    protected final Object clone() throws CloneNotSupportedException {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iActiveCount = Thread.activeCount();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = (-826666886) * f26838e;
        f26838e = i3;
        return a(iActiveCount, 1349302471, iUptimeMillis, i2, new Object[]{this}, i3, -1349302470);
    }

    public final boolean equals(Object obj) {
        int id = (int) Thread.currentThread().getId();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f26837c * 1684090896;
        f26837c = i2;
        return ((Boolean) a(iUptimeMillis, 314487981, id, iElapsedRealtime, new Object[]{this, obj}, i2, -314487981)).booleanValue();
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26839g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26836a = i3 % 128;
        if (i3 % 2 == 0) {
            super.finalize();
        } else {
            super.finalize();
            int i4 = 14 / 0;
        }
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26836a + 51;
        f26839g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26839g;
        int i4 = ((63 | i3) << 1) - (i3 ^ 63);
        f26836a = i4 % 128;
        if (i4 % 2 == 0) {
            return super.toString();
        }
        super.toString();
        throw null;
    }
}
