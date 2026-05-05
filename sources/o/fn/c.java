package o.fn;

import android.os.SystemClock;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26110a = 738783438;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f26111b = 15298743;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26112c = 598552528;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26113d = 1047847018;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26114e = -1765212633;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26115j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26116k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Date f26117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f26119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f26120i;

    public c(String str, int i2, Date date, Date date2) {
        this.f26120i = str;
        this.f26118g = i2;
        this.f26119h = date;
        this.f26117f = date2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26115j;
        int i4 = ((i3 + 65) - (65 | i3)) + ((i3 + 65) - (i3 & 65));
        int i5 = i4 % 128;
        f26116k = i5;
        int i6 = i4 % 2;
        int i7 = cVar.f26118g;
        int i8 = i5 + 1;
        f26115j = i8 % 128;
        if (i8 % 2 == 0) {
            return Integer.valueOf(i7);
        }
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~((-1) - (((-1) - (~i4)) & ((-1) - i8)));
        int i10 = (-1) - (((-1) - ((i7 + i9) - (i7 & i9))) & ((-1) - (~((i3 + i4) - (i3 & i4)))));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
        int i12 = ~(i8 | i4);
        int i13 = (i12 + i11) - (i12 & i11);
        int i14 = ~((i4 + i7) - (i4 & i7));
        int i15 = (i14 + i13) - (i14 & i13);
        int i16 = i7 + i3 + i5 + (1351532378 * i6) + (1237199896 * i2);
        int i17 = i16 * i16;
        int i18 = ((-211156802) * i7) + 1314914304 + ((-491389116) * i3) + (2007367491 * i10) + (i15 * (-2007367491)) + ((-2007367491) * i9) + (1796210688 * i5) + ((-1818230784) * i6) + ((-914358272) * i2) + ((-2051670016) * i17);
        int i19 = ((i7 * 406040238) - 634933780) + (i3 * 406038884) + (i10 * (-677)) + (i15 * 677) + (i9 * 677) + (i5 * 406039561) + (i6 * 1283666474) + (i2 * 1712827608) + (i17 * (-77201408));
        if (i18 + (i19 * i19 * 1831469056) == 1) {
            return a(objArr);
        }
        c cVar = (c) objArr[0];
        int i20 = 2 % 2;
        int i21 = f26115j;
        int i22 = ((-1) - (((-1) - i21) | ((-1) - 23))) + (i21 | 23);
        int i23 = i22 % 128;
        f26116k = i23;
        int i24 = i22 % 2;
        String str = cVar.f26120i;
        int i25 = (i23 ^ 105) + (((-1) - (((-1) - i23) | ((-1) - 105))) << 1);
        f26115j = i25 % 128;
        int i26 = i25 % 2;
        return str;
    }

    public final int a() {
        int i2 = f26112c * (-665734691);
        f26112c = i2;
        int id = (int) Thread.currentThread().getId();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f26110a * 798041572;
        f26110a = i3;
        return ((Integer) b(new Object[]{this}, i3, -682160894, i2, id, iMaxMemory, 682160895)).intValue();
    }

    public final Date b() {
        int i2 = 2 % 2;
        int i3 = f26116k + 47;
        f26115j = i3 % 128;
        int i4 = i3 % 2;
        Date date = this.f26117f;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        return date;
    }

    public final Date d() {
        int i2 = 2 % 2;
        int i3 = f26115j;
        int i4 = (i3 ^ 117) + (((i3 + 117) - (117 | i3)) << 1);
        f26116k = i4 % 128;
        int i5 = i4 % 2;
        Date date = this.f26119h;
        int i6 = (((i3 + 59) - (59 & i3)) << 1) - (i3 ^ 59);
        f26116k = i6 % 128;
        if (i6 % 2 != 0) {
            return date;
        }
        throw null;
    }

    public final String e() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f26114e * 1488666621;
        f26114e = i2;
        int i3 = f26111b * (-93354780);
        f26111b = i3;
        int i4 = f26113d * (-729426029);
        f26113d = i4;
        return (String) b(new Object[]{this}, i4, 1651825128, iUptimeMillis, i2, i3, -1651825128);
    }

    public final void e(int i2) {
        int i3 = 2 % 2;
        int i4 = f26116k;
        int i5 = (i4 ^ 67) + ((67 & i4) << 1);
        f26115j = i5 % 128;
        int i6 = i5 % 2;
        this.f26118g = i2;
        int i7 = i4 + 3;
        f26115j = i7 % 128;
        int i8 = i7 % 2;
    }
}
