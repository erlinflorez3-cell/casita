package o.fj;

import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static int f25900a = 1031433444;

    /* JADX INFO: renamed from: b */
    public static int f25901b = 1093246554;

    /* JADX INFO: renamed from: c */
    public static int f25902c = 924060081;

    /* JADX INFO: renamed from: d */
    public static int f25903d = -307878386;

    /* JADX INFO: renamed from: e */
    public static int f25904e = 1700898952;

    /* JADX INFO: renamed from: f */
    public static int f25905f = -346572633;

    /* JADX INFO: renamed from: g */
    public static int f25906g = -1652127514;

    /* JADX INFO: renamed from: h */
    public static int f25907h = 1274867798;

    /* JADX INFO: renamed from: i */
    public static int f25908i = -1387216880;

    /* JADX INFO: renamed from: j */
    public static int f25909j = -909510034;

    /* JADX INFO: renamed from: n */
    public static int f25910n = -5790237;

    /* JADX INFO: renamed from: s */
    private static int f25911s = 1;

    /* JADX INFO: renamed from: t */
    private static int f25912t = 0;

    /* JADX INFO: renamed from: k */
    private boolean f25913k;

    /* JADX INFO: renamed from: l */
    private boolean f25914l;

    /* JADX INFO: renamed from: m */
    private boolean f25915m;

    /* JADX INFO: renamed from: o */
    private boolean f25916o;

    /* JADX INFO: renamed from: p */
    private final List<o.eq.b> f25917p = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final List<d> f25918q = new ArrayList();

    /* JADX INFO: renamed from: o.fj.b$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b */
        private static int f25919b = 0;

        /* JADX INFO: renamed from: c */
        private static int f25920c = 1;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f25921d;

        static {
            int[] iArr = new int[o.eq.d.values().length];
            f25921d = iArr;
            try {
                iArr[o.eq.d.f24731b.ordinal()] = 1;
                int i2 = f25919b;
                int i3 = (i2 ^ 55) + (((-1) - (((-1) - i2) | ((-1) - 55))) << 1);
                f25920c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25921d[o.eq.d.f24730a.ordinal()] = 2;
                int i6 = f25919b + 103;
                f25920c = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25921d[o.eq.d.f24733d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25921d[o.eq.d.f24732c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25921d[o.eq.d.f24734e.ordinal()] = 5;
                int i9 = f25919b;
                int i10 = (i9 ^ 121) + (((-1) - (((-1) - i9) | ((-1) - 121))) << 1);
                f25920c = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25921d[o.eq.d.f24736h.ordinal()] = 6;
                int i12 = f25919b + 63;
                f25920c = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        o.eq.d dVar = (o.eq.d) objArr[1];
        o.eq.b bVar2 = (o.eq.b) objArr[2];
        int i2 = 2 % 2;
        int i3 = f25911s;
        int i4 = ((i3 | 91) << 1) - (i3 ^ 91);
        f25912t = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = AnonymousClass4.f25921d[dVar.ordinal()];
            obj.hashCode();
            throw null;
        }
        int i6 = AnonymousClass4.f25921d[dVar.ordinal()];
        if (i6 == 1) {
            bVar.f25917p.add(bVar2);
            int i7 = f25911s;
            int i8 = (((-1) - (((-1) - i7) & ((-1) - 81))) << 1) - (i7 ^ 81);
            f25912t = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 31 / 0;
            }
            return null;
        }
        if (i6 == 2) {
            bVar.f25915m = true;
            return null;
        }
        if (i6 == 3) {
            int i10 = f25911s + 123;
            f25912t = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        if (i6 == 4) {
            bVar.f25913k = true;
            int i12 = f25911s;
            int i13 = (i12 ^ 77) + ((i12 & 77) << 1);
            f25912t = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        if (i6 == 5) {
            bVar.f25913k = true;
            int i15 = f25912t + 3;
            f25911s = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = f25912t + 29;
        f25911s = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25912t;
        int i4 = i3 + 39;
        f25911s = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        boolean z2 = bVar.f25913k;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = (((-1) - (((-1) - i3) & ((-1) - 27))) << 1) - (i3 ^ 27);
        f25911s = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25911s;
        int i4 = i3 + 7;
        f25912t = i4 % 128;
        if (i4 % 2 != 0) {
            bVar.f25916o = false;
        } else {
            bVar.f25916o = true;
        }
        int i5 = (i3 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED) + (((i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (i3 | PanasonicMakernoteDirectory.TAG_BURST_SPEED)) << 1);
        f25912t = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25911s;
        int i4 = i3 + 57;
        f25912t = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z2 = bVar.f25913k;
            throw null;
        }
        if (bVar.f25913k || bVar.f25915m) {
            return true;
        }
        int i5 = (i3 ^ 39) + ((i3 & 39) << 1);
        f25912t = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return false;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = (-1) - (((-1) - (~i2)) & ((-1) - i8));
        int i10 = ~((i9 + i4) - (i9 & i4));
        int i11 = ~i4;
        int i12 = ~((i8 + i11) - (i8 & i11));
        int i13 = ~(i8 | i2);
        int i14 = (-1) - (((-1) - ((i13 + i12) - (i13 & i12))) & ((-1) - (~(i11 | i2))));
        int i15 = ~((-1) - (((-1) - i11) & ((-1) - i5)));
        int i16 = (i15 + i2) - (i15 & i2);
        int i17 = i5 + i2 + i3 + ((-946781377) * i7) + ((-59450693) * i6);
        int i18 = i17 * i17;
        int i19 = (((-143250568) * i5) - 346488832) + (357422218 * i2) + (i10 * (-1897147255)) + ((-1897147255) * i14) + (1897147255 * i16) + ((-2040397824) * i3) + ((-1205993472) * i7) + ((-1651113984) * i6) + ((-884408320) * i18);
        int i20 = ((i5 * 358501064) - 1042343473) + (i2 * 358500518) + (i10 * (-273)) + (i14 * (-273)) + (i16 * 273) + (i3 * 358500791) + (i7 * (-249165559)) + (i6 * 1905372845) + (i18 * 573505536);
        int i21 = i19 + (i20 * i20 * (-553189376));
        return i21 != 1 ? i21 != 2 ? i21 != 3 ? i21 != 4 ? e(objArr) : a(objArr) : c(objArr) : b(objArr) : d(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        d dVar = (d) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25912t;
        int i4 = (((i3 + 29) - (29 & i3)) << 1) - (i3 ^ 29);
        f25911s = i4 % 128;
        if (i4 % 2 != 0) {
            bVar.f25918q.add(dVar);
            return null;
        }
        bVar.f25918q.add(dVar);
        throw null;
    }

    public final void a() {
        int iMyTid = Process.myTid();
        int i2 = 1938864622 * f25907h;
        f25907h = i2;
        e(-439738306, i2, iMyTid, 439738309, new Object[]{this}, (int) Runtime.getRuntime().maxMemory(), Thread.activeCount());
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f25911s;
        int i4 = (((i3 + 19) - (19 & i3)) << 1) - (i3 ^ 19);
        f25912t = i4 % 128;
        int i5 = i4 % 2;
        this.f25914l = true;
    }

    public final void b(o.eq.d dVar, o.eq.b bVar) {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int id = (int) Thread.currentThread().getId();
        int iNextInt = new Random().nextInt();
        int i2 = f25910n * 338152958;
        f25910n = i2;
        e(678627396, id, iMaxMemory, -678627392, new Object[]{this, dVar, bVar}, i2, iNextInt);
    }

    public final void c(d dVar) {
        int id = (int) Thread.currentThread().getId();
        int i2 = f25904e * 1927270547;
        f25904e = i2;
        int i3 = f25902c * 1291554296;
        f25902c = i3;
        int i4 = f25901b * (-673355590);
        f25901b = i4;
        e(-1392211334, i2, id, 1392211334, new Object[]{this, dVar}, i4, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r5 = o.fj.b.f25911s
            r2 = r5 ^ 41
            r0 = 41
            int r1 = r5 + r0
            r0 = r0 | r5
            int r1 = r1 - r0
            r4 = 1
            int r1 = r1 << r4
            int r2 = r2 + r1
            int r0 = r2 % 128
            o.fj.b.f25912t = r0
            int r2 = r2 % r6
            if (r2 != 0) goto L76
            boolean r0 = r7.f25913k
            r3 = 0
            if (r0 != 0) goto L3d
            boolean r0 = r7.f25915m
            if (r0 != 0) goto L3d
            r0 = 55
            r2 = r5 & r0
            r0 = 55
            int r1 = r5 + r0
            r0 = r0 & r5
            int r1 = r1 - r0
            int r2 = r2 + r1
            int r0 = r2 % 128
            o.fj.b.f25912t = r0
            int r2 = r2 % r6
            if (r2 == 0) goto L58
            boolean r1 = r7.f25914l
            r0 = 90
            int r0 = r0 / r3
            if (r1 != 0) goto L3d
        L39:
            boolean r0 = r7.f25916o
            if (r0 == 0) goto L5d
        L3d:
            r0 = 39
            int r1 = (-1) - r5
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r2 = (-1) - r1
            r1 = 39
            int r0 = r5 + r1
            r5 = r5 & r1
            int r0 = r0 - r5
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.fj.b.f25912t = r0
            int r2 = r2 % r6
            if (r2 == 0) goto L57
            r0 = 74
            int r0 = r0 / r3
        L57:
            return r4
        L58:
            boolean r0 = r7.f25914l
            if (r0 == 0) goto L39
            goto L3d
        L5d:
            r0 = 97
            int r1 = (-1) - r5
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r2 = (-1) - r1
            r0 = 97
            int r1 = (-1) - r5
            int r0 = (-1) - r0
            r1 = r1 & r0
            int r0 = (-1) - r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            o.fj.b.f25912t = r0
            int r2 = r2 % r6
            return r3
        L76:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.b.c():boolean");
    }

    public final boolean d() {
        int i2 = f25900a * 2074538373;
        f25900a = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int priority = Thread.currentThread().getPriority();
        int i3 = f25905f * (-1617323965);
        f25905f = i3;
        return ((Boolean) e(-1239314065, iMaxMemory, i2, 1239314066, new Object[]{this}, i3, priority)).booleanValue();
    }

    public final List<d> e() {
        int i2 = 2 % 2;
        int i3 = f25912t;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 59))) + (i3 | 59);
        int i5 = i4 % 128;
        f25911s = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        List<d> list = this.f25918q;
        int i6 = (i5 ^ 35) + (((i5 + 35) - (i5 | 35)) << 1);
        f25912t = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final boolean g() {
        int i2 = f25906g * (-267698009);
        f25906g = i2;
        int i3 = 722878737 * f25909j;
        f25909j = i3;
        int i4 = f25908i * (-1124062688);
        f25908i = i4;
        return ((Boolean) e(-147280184, i3, i2, 147280186, new Object[]{this}, (int) Runtime.getRuntime().freeMemory(), i4)).booleanValue();
    }

    public final List<o.eq.b> h() {
        int i2 = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~((-1) - (((-1) - (iIdentityHashCode & (-1605036118))) & ((-1) - ((-1605036118) ^ iIdentityHashCode))));
        int i4 = 1612205871 ^ i3;
        int i5 = (1612205871 + i3) - (1612205871 | i3);
        int i6 = 881573193 + (((i5 + i4) - (i5 & i4)) * (-658));
        int i7 = ((i6 - 1790370598) - (i6 | (-1790370598))) + ((-1790370598) | i6);
        int i8 = ((i3 & 1074284549) | (1074284549 ^ i3)) * 658;
        int i9 = (i7 ^ i8) + (((-1) - (((-1) - i8) | ((-1) - i7))) << 1);
        int i10 = f25903d * 1238843900;
        f25903d = i10;
        int i11 = ~i10;
        int i12 = i11 ^ (-77364909);
        int i13 = (i11 - 77364909) - (i11 | (-77364909));
        int i14 = ~((i13 + i12) - (i13 & i12));
        int i15 = (i14 + 76029472) - (i14 & 76029472);
        int i16 = ~((-1) - (((-1) - (1958543023 ^ i10)) & ((-1) - ((-1) - (((-1) - 1958543023) | ((-1) - i10))))));
        int i17 = ((-1) - (((-1) - (i15 & i16)) & ((-1) - (i15 ^ i16)))) * 717;
        int i18 = ((-528150845) ^ i17) + ((i17 & (-528150845)) << 1);
        int i19 = ~i10;
        int i20 = 1958543023 ^ i19;
        int i21 = (i19 + 1958543023) - (i19 | 1958543023);
        int i22 = (-1) - (((-1) - (~((i21 + i20) - (i21 & i20)))) & ((-1) - 76029472));
        int i23 = ~((-1) - (((-1) - ((i10 - 77364909) - (i10 | (-77364909)))) & ((-1) - ((-77364909) ^ i10))));
        int i24 = -(-(((-1) - (((-1) - (i23 & i22)) & ((-1) - (i22 ^ i23)))) * 717));
        int i25 = (i18 ^ i24) + (((i24 + i18) - (i24 | i18)) << 1);
        List<o.eq.b> list = this.f25917p;
        if (i9 <= i25) {
            int i26 = 78 / 0;
        }
        return list;
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f25912t;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 5))) << 1) - (i3 ^ 5);
        int i5 = i4 % 128;
        f25911s = i5;
        int i6 = i4 % 2;
        boolean z2 = this.f25916o;
        int i7 = i5 + 59;
        f25912t = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 31 / 0;
        }
        return z2;
    }
}
