package o.ed;

import android.os.Process;
import android.os.SystemClock;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import o.by.b;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23678a = -1962253061;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23679b = 313434467;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23680c = -1209732049;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23681d = -1554723096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23682e = 269466648;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23683f = 1282331887;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23684h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23685i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f23686j;

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23684h + 67;
        f23685i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.finalize();
            obj.hashCode();
            throw null;
        }
        super.finalize();
        int i4 = f23684h;
        int i5 = ((119 | i4) << 1) - (i4 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED);
        f23685i = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) throws CloneNotSupportedException {
        int i8 = ~i7;
        int i9 = ~i2;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~(i8 | i3);
        int i12 = ~i3;
        int i13 = (i12 + i7) - (i12 & i7);
        int i14 = ~(i2 | i13);
        int i15 = (-1) - (((-1) - (i10 | i11)) & ((-1) - i14));
        int i16 = i14 | (~((-1) - (((-1) - ((-1) - (((-1) - i8) & ((-1) - i12)))) & ((-1) - i9))));
        int i17 = (~i13) | i11;
        int i18 = i7 + i3 + i6 + ((-573665793) * i5) + ((-1595597844) * i4);
        int i19 = i18 * i18;
        int i20 = ((-1787860089) * i7) + 959184896 + (1033409659 * i3) + ((-1473697548) * i15) + (1473697548 * i16) + ((-1410634874) * i17) + ((-377225216) * i6) + (1316749312 * i5) + (833617920 * i4) + (497221632 * i19);
        int i21 = ((i7 * 2143800573) - 1595758) + (i3 * 2143800249) + (i15 * (-324)) + (i16 * ExifDirectoryBase.TAG_TILE_OFFSETS) + (i17 * 162) + (i6 * 2143800411) + (i5 * 1405922725) + (i4 * (-1943733020)) + (i19 * 1827733504);
        int i22 = i20 + (i21 * i21 * (-911933440));
        if (i22 == 1) {
            return c(objArr);
        }
        if (i22 != 2) {
            int i23 = 2 % 2;
            d dVar = ((a) objArr[0]).f23686j;
            throw null;
        }
        int i24 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final b c() {
        int i2 = f23681d * (-140374812);
        f23681d = i2;
        int i3 = f23680c * 466889542;
        f23680c = i3;
        int iActiveCount = Thread.activeCount();
        int i4 = (-1086244315) * f23679b;
        f23679b = i4;
        return (b) e(i2, 1325109365, i4, iActiveCount, i3, new Object[]{this}, -1325109365);
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = f23682e * 1150304890;
        f23682e = i2;
        int i3 = f23678a * (-1810030081);
        f23678a = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = 1754944991 * f23683f;
        f23683f = i4;
        return e(i2, -902281563, i4, priority, i3, new Object[]{this}, 902281565);
    }

    public final int e() {
        int i2 = 2 % 2;
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23684h + 17;
        f23685i = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            super.equals(obj);
            obj2.hashCode();
            throw null;
        }
        boolean zEquals = super.equals(obj);
        int i4 = f23684h + 23;
        f23685i = i4 % 128;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    protected final void finalize() throws Throwable {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iMyUid = Process.myUid();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        e(iFreeMemory, 357735400, (int) Runtime.getRuntime().maxMemory(), iUptimeMillis, iMyUid, new Object[]{this}, -357735399);
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f23684h + 1;
        f23685i = i3 % 128;
        if (i3 % 2 != 0) {
            return super.hashCode();
        }
        super.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23685i + 113;
        f23684h = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f23684h;
        int i6 = ((-1) - (((-1) - i5) | ((-1) - 97))) + ((i5 + 97) - (i5 & 97));
        f23685i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return string;
    }
}
