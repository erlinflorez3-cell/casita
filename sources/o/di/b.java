package o.di;

import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static int f23026a = -1412163153;

    /* JADX INFO: renamed from: b */
    public static int f23027b = -200446773;

    /* JADX INFO: renamed from: c */
    public static int f23028c = -160296533;

    /* JADX INFO: renamed from: d */
    public static int f23029d = -419483044;

    /* JADX INFO: renamed from: e */
    public static int f23030e = -1053203979;

    /* JADX INFO: renamed from: l */
    private static int f23031l = 1;

    /* JADX INFO: renamed from: n */
    private static int f23032n = 0;

    /* JADX INFO: renamed from: f */
    private final o.by.g f23033f;

    /* JADX INFO: renamed from: g */
    private final boolean f23034g;

    /* JADX INFO: renamed from: h */
    private final o.dd.e f23035h;

    /* JADX INFO: renamed from: i */
    private final Long f23036i;

    /* JADX INFO: renamed from: j */
    private final boolean f23037j;

    b(boolean z2) {
        this(z2, null);
    }

    public b(boolean z2, o.dd.e eVar) {
        this.f23033f = new o.by.g();
        this.f23037j = z2;
        this.f23034g = false;
        this.f23036i = null;
        this.f23035h = eVar;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (-1) - (((-1) - (~((i8 | i9) | i10))) & ((-1) - (~((-1) - (((-1) - i4) & ((-1) - i6))))));
        int i12 = ~(i3 | i6);
        int i13 = i11 | i12;
        int i14 = ~((i8 + i6) - (i8 & i6));
        int i15 = i12 | i8 | (~((i9 + i10) - (i9 & i10)));
        int i16 = i4 + i6 + i2 + (1349231875 * i5) + (1735201104 * i7);
        int i17 = i16 * i16;
        int i18 = ((-413510627) * i4) + 1558183936 + (237349861 * i6) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i15) + ((-88080384) * i2) + ((-1337982976) * i5) + (469762048 * i7) + (1272971264 * i17);
        int i19 = ((i4 * 236314795) - 374860141) + (i6 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i15 * 836) + (i2 * 236313959) + (i5 * (-66979019)) + (i7 * (-1872492752)) + (i17 * (-417333248));
        return i18 + ((i19 * i19) * 639631360) != 1 ? a(objArr) : e(objArr);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23032n;
        int i4 = i3 + 33;
        f23031l = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = bVar.f23037j;
        int i6 = i3 + 41;
        f23031l = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        int i7 = 70 / 0;
        return Boolean.valueOf(z2);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23032n;
        int i4 = (i3 ^ 73) + (((-1) - (((-1) - i3) | ((-1) - 73))) << 1);
        f23031l = i4 % 128;
        int i5 = i4 % 2;
        o.dd.e eVar = bVar.f23035h;
        if (i5 == 0) {
            int i6 = 10 / 0;
        }
        int i7 = i3 + 37;
        f23031l = i7 % 128;
        if (i7 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean a() {
        int i2 = 1985992943 * f23026a;
        f23026a = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = (-603574452) * f23029d;
        f23029d = i3;
        return ((Boolean) a(priority, i2, 846237084, new Object[]{this}, i3, -846237084, new Random().nextInt())).booleanValue();
    }

    public final o.by.g b() {
        int i2 = 2 % 2;
        int i3 = f23032n;
        int i4 = (i3 ^ 73) + (((i3 + 73) - (i3 | 73)) << 1);
        f23031l = i4 % 128;
        int i5 = i4 % 2;
        o.by.g gVar = this.f23033f;
        if (i5 == 0) {
            int i6 = 53 / 0;
        }
        return gVar;
    }

    public final Long c() {
        int i2 = 2 % 2;
        int i3 = f23031l + 97;
        f23032n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f23036i;
        }
        throw null;
    }

    public final o.dd.e d() {
        int i2 = (-891032732) * f23027b;
        f23027b = i2;
        int i3 = f23030e * 1071354274;
        f23030e = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = f23028c * 1175147630;
        f23028c = i4;
        return (o.dd.e) a(i3, i2, -551405895, new Object[]{this}, iFreeMemory, 551405896, i4);
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f23031l + 39;
        f23032n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f23034g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
