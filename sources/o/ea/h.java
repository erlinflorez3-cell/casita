package o.ea;

import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.util.Address;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23527a = -1676078029;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23528b = -2130290057;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23529c = 1617817514;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23530d = -1247856732;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23531e = 1267121212;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23532f = -688240357;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23533g = 953134073;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f23534k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f23535n = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f23537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f23538j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f23539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f23540m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f23541o;

    public h(Address address) {
        this.f23538j = address.getLine1();
        this.f23537i = address.getLine2();
        this.f23536h = address.getAdministrativeArea();
        this.f23540m = address.getCountryCode();
        this.f23541o = address.getLocality();
        this.f23539l = address.getPostalCode();
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23534k;
        int i4 = (i3 & PanasonicMakernoteDirectory.TAG_BURST_SPEED) + ((-1) - (((-1) - i3) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED)));
        f23535n = i4 % 128;
        int i5 = i4 % 2;
        String str = hVar.f23539l;
        int i6 = (i3 & 99) + (i3 | 99);
        f23535n = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23535n + 81;
        int i4 = i3 % 128;
        f23534k = i4;
        int i5 = i3 % 2;
        String str = hVar.f23537i;
        int i6 = (((-1) - (((-1) - i4) & ((-1) - 9))) << 1) - (i4 ^ 9);
        f23535n = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = (-1) - (((-1) - (~i6)) & ((-1) - i7));
        int i9 = ~((i8 + i4) - (i8 & i4));
        int i10 = ~((-1) - (((-1) - (~i7)) & ((-1) - i6)));
        int i11 = ~i4;
        int i12 = (-1) - (((-1) - i10) & ((-1) - (~((-1) - (((-1) - i11) & ((-1) - i6))))));
        int i13 = ~((i11 + i7) - (i11 & i7));
        int i14 = i6 + i7 + i5 + ((-1568348280) * i2) + (1617068012 * i3);
        int i15 = i14 * i14;
        int i16 = (((-430874860) * i6) - 739508224) + (1544986862 * i7) + (i9 * 987930861) + ((-987930861) * i12) + (987930861 * i13) + (557056000 * i5) + ((-1885339648) * i2) + (1743781888 * i3) + (858456064 * i15);
        int i17 = (i6 * (-973781596)) + 539565670 + (i7 * (-973779706)) + (i9 * 945) + (i12 * (-945)) + (i13 * 945) + (i5 * (-973780651)) + (i2 * 424585256) + (i3 * 537576796) + (i15 * 1078394880);
        int i18 = i16 + (i17 * i17 * 192741376);
        return i18 != 1 ? i18 != 2 ? e(objArr) : a(objArr) : c(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23535n;
        int i4 = (i3 ^ 125) + (((-1) - (((-1) - i3) | ((-1) - 125))) << 1);
        int i5 = i4 % 128;
        f23534k = i5;
        int i6 = i4 % 2;
        String str = hVar.f23541o;
        int i7 = (((-1) - (((-1) - i5) & ((-1) - 73))) << 1) - (i5 ^ 73);
        f23535n = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f23534k + 21;
        int i4 = i3 % 128;
        f23535n = i4;
        int i5 = i3 % 2;
        String str = this.f23538j;
        int i6 = ((-1) - (((-1) - i4) | ((-1) - 37))) + ((-1) - (((-1) - i4) & ((-1) - 37)));
        f23534k = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f23535n;
        int i4 = i3 + 83;
        f23534k = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.f23536h;
        int i5 = i3 + 9;
        f23534k = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String c() {
        int i2 = f23529c * (-593550375);
        f23529c = i2;
        int i3 = f23532f * 669591005;
        f23532f = i3;
        int i4 = f23533g * 848311122;
        f23533g = i4;
        return (String) e(i4, Process.myUid(), new Object[]{this}, i2, i3, 2086386304, -2086386303);
    }

    public final String d() {
        int i2 = f23527a * (-1373774128);
        f23527a = i2;
        int i3 = f23528b * 1620262981;
        f23528b = i3;
        int i4 = f23530d * 2044819142;
        f23530d = i4;
        int i5 = f23531e * (-611124542);
        f23531e = i5;
        return (String) e(i4, i5, new Object[]{this}, i2, i3, 207950346, -207950346);
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f23535n;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 117))) + ((-1) - (((-1) - i3) & ((-1) - 117)));
        f23534k = i4 % 128;
        if (i4 % 2 == 0) {
            return this.f23540m;
        }
        throw null;
    }

    public final String i() {
        int iActiveCount = Thread.activeCount();
        int iActiveCount2 = Thread.activeCount();
        return (String) e((int) Process.getElapsedCpuTime(), new Random().nextInt(), new Object[]{this}, iActiveCount, iActiveCount2, 1042765141, -1042765139);
    }
}
