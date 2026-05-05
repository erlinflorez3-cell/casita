package o.bk;

import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21309a = 230971194;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21310c = 936668138;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21311e = 38277252;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21312h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21313j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21314b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21315d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21316f;

    public c(String str, String str2, String str3) {
        this.f21314b = str;
        this.f21315d = str2;
        this.f21316f = str3;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f21313j;
        int i4 = ((i3 + 43) - (43 | i3)) + ((i3 + 43) - (43 & i3));
        f21312h = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (cVar == obj) {
            int i5 = (i3 & 41) + ((i3 + 41) - (i3 & 41));
            f21312h = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj != null) {
            int i6 = (i3 ^ 9) + ((i3 & 9) << 1);
            f21312h = i6 % 128;
            int i7 = i6 % 2;
            if (cVar.getClass() == obj.getClass()) {
                c cVar2 = (c) obj;
                if (cVar.f21314b.equals(cVar2.f21314b)) {
                    int i8 = f21312h + 85;
                    f21313j = i8 % 128;
                    int i9 = i8 % 2;
                    if (cVar.f21315d.equals(cVar2.f21315d) && cVar.f21316f.equals(cVar2.f21316f)) {
                        int i10 = f21312h;
                        int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
                        f21313j = i11 % 128;
                        int i12 = i11 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f21312h;
        int i4 = (i3 ^ 91) + (((i3 + 91) - (i3 | 91)) << 1);
        int i5 = i4 % 128;
        f21313j = i5;
        int i6 = i4 % 2;
        String str = cVar.f21315d;
        if (i6 != 0) {
            int i7 = 61 / 0;
        }
        int i8 = ((i5 + 49) - (49 | i5)) + ((i5 + 49) - (i5 & 49));
        f21312h = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 50 / 0;
        }
        return str;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~((-1) - (((-1) - ((~i4) | i3)) & ((-1) - i6)));
        int i9 = ~((-1) - (((-1) - (~i3)) & ((-1) - i4)));
        int i10 = ~i6;
        int i11 = (-1) - (((-1) - i9) & ((-1) - (~(i10 | i4))));
        int i12 = ~((-1) - (((-1) - i10) & ((-1) - i3)));
        int i13 = i4 + i3 + i5 + ((-1568348280) * i2) + (1617068012 * i7);
        int i14 = i13 * i13;
        int i15 = (((-430874860) * i4) - 739508224) + (1544986862 * i3) + (i8 * 987930861) + ((-987930861) * i11) + (987930861 * i12) + (557056000 * i5) + ((-1885339648) * i2) + (1743781888 * i7) + (858456064 * i14);
        int i16 = (i4 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i8 * 945) + (i11 * (-945)) + (i12 * 945) + (i5 * (-973780651)) + (i2 * 424585256) + (i7 * 537576796) + (i14 * 1078394880);
        return i15 + ((i16 * i16) * 192741376) != 1 ? c(objArr) : b(objArr);
    }

    public final String b() {
        int iMyTid = Process.myTid();
        int i2 = f21310c * 1985526646;
        f21310c = i2;
        return (String) d((int) SystemClock.uptimeMillis(), 1235691696, -1235691696, i2, iMyTid, new Object[]{this}, (int) SystemClock.uptimeMillis());
    }

    public final String d() {
        String str;
        int i2 = 2 % 2;
        int i3 = f21312h;
        int i4 = (i3 ^ 65) + (((-1) - (((-1) - i3) | ((-1) - 65))) << 1);
        f21313j = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f21316f;
            int i5 = 39 / 0;
        } else {
            str = this.f21316f;
        }
        int i6 = (i3 ^ 17) + ((i3 & 17) << 1);
        f21313j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f21313j;
        int i4 = (i3 ^ 117) + (((-1) - (((-1) - i3) | ((-1) - 117))) << 1);
        f21312h = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f21314b;
        if (i5 == 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f21309a * (-932458023);
        f21309a = i2;
        int i3 = 2059042023 * f21311e;
        f21311e = i3;
        return ((Boolean) d(i3, -1547925274, 1547925275, i2, elapsedCpuTime, new Object[]{this, obj}, (int) Runtime.getRuntime().maxMemory())).booleanValue();
    }
}
