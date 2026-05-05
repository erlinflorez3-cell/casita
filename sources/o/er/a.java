package o.er;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends o.eq.e {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char E = 0;
    private static int F = 0;
    private static char[] H = null;
    private static int I = 0;

    /* JADX INFO: renamed from: f */
    public static int f24749f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24750g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24751h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24752i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24753j = 0;

    /* JADX INFO: renamed from: k */
    public static int f24754k = 0;

    /* JADX INFO: renamed from: l */
    public static int f24755l = 0;

    /* JADX INFO: renamed from: m */
    public static int f24756m = 0;

    /* JADX INFO: renamed from: n */
    public static int f24757n = 0;

    /* JADX INFO: renamed from: o */
    public static int f24758o = 0;
    private final ac A;
    private final j B;
    private final j C;
    private final j D;

    /* JADX INFO: renamed from: p */
    private final j f24759p;

    /* JADX INFO: renamed from: q */
    private final j f24760q;

    /* JADX INFO: renamed from: r */
    private final j f24761r;

    /* JADX INFO: renamed from: s */
    private final j f24762s;

    /* JADX INFO: renamed from: t */
    private final j f24763t;

    /* JADX INFO: renamed from: u */
    private final e f24764u;

    /* JADX INFO: renamed from: v */
    private final j f24765v;

    /* JADX INFO: renamed from: w */
    private final j f24766w;

    /* JADX INFO: renamed from: x */
    private final i f24767x;

    /* JADX INFO: renamed from: y */
    private final i f24768y;

    /* JADX INFO: renamed from: z */
    private final j f24769z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, byte r10, byte r11) {
        /*
            int r8 = r10 + 4
            int r0 = r11 * 2
            int r7 = r0 + 1
            byte[] r6 = o.er.a.$$d
            int r5 = 111 - r9
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L26
            r0 = r7
            r2 = r3
        L11:
            int r0 = -r0
            int r5 = r5 + r0
            r1 = r2
        L14:
            byte r0 = (byte) r5
            int r8 = r8 + 1
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r6[r8]
            goto L11
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.a.$$g(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24757n = 1493874587;
        f24754k = 487221883;
        f24756m = 1647091669;
        f24755l = -389229231;
        f24758o = 2006364785;
        f24753j = -1701478464;
        f24751h = 1977049138;
        f24749f = 723503397;
        f24750g = -1017678517;
        f24752i = -3327494;
        F = 0;
        I = 1;
        H = new char[]{64599, 64596, 64579, 64589, 64588, 64594, 64595, 64605, 64582, 64517, 64592, 64583, 64591, 64580, 64576, 64587, 64597, 64586, 64584, 64578, 64585, 64598, 64577, 64593, 64604};
        E = (char) 51642;
    }

    public a(String str) {
        super(str);
        this.f24761r = new j(false, null);
        this.f24760q = new j(false, null);
        this.f24763t = new j(false, null);
        this.f24762s = new j(false, null);
        this.f24759p = new j(false, null);
        this.f24768y = new i(false, null);
        this.f24767x = new i(false, null);
        this.f24766w = new j(false, null);
        this.f24764u = new e(false, null, false);
        this.f24765v = new j(false, null);
        this.B = new j(false, null);
        this.D = new j(false, null);
        this.A = new ac(false, null, new ArrayList());
        this.C = new j(false, null);
        this.f24769z = new j(false, null);
    }

    public a(String str, j jVar, j jVar2, j jVar3, j jVar4, j jVar5, i iVar, i iVar2, j jVar6, e eVar, j jVar7, ac acVar, j jVar8, j jVar9) {
        super(str);
        this.f24761r = jVar;
        this.f24760q = jVar2;
        this.f24763t = jVar3;
        this.f24762s = jVar4;
        this.f24759p = jVar5;
        this.f24768y = iVar;
        this.f24767x = iVar2;
        this.f24766w = jVar6;
        this.f24764u = eVar;
        this.f24765v = jVar7;
        this.B = new j(false, null);
        this.D = new j(true, null);
        this.A = acVar;
        this.C = jVar8;
        this.f24769z = jVar9;
    }

    private static EmvApplication B() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        G(60 - View.combineMeasuredStates(0, 0), "\u0018\u0002\u0018\t\u0003\u0012\u0018\u0005\r\u0012\u0002\u0014\u000e\u0013\u0010\b\b\u000e㙅㙅\u0018\u0000\r\u0012\u0018\u0003\u0012\u0010\u0018\u0006\u0017\u0001\u000f\f\u0015\u0017\u0005\u0013\u0012\u0016\u0006\u000e\u0013\u000e\f\t\u0011\u0012\u0018\u000b\u0018\u0007\u0018\u0002\u0004\n\r\u0003\u0015\u0014", (byte) (Color.argb(0, 0, 0, 0) + 91), objArr);
        throw new RuntimeException(((String) objArr[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void G(int r25, java.lang.String r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.a.G(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~((i8 + i3) - (i8 & i3));
        int i10 = ~i5;
        int i11 = ~((i10 + i3) - (i10 & i3));
        int i12 = (i9 + i11) - (i9 & i11);
        int i13 = ~((~i3) | i4);
        int i14 = (-1) - (((-1) - i11) & ((-1) - ((i13 + i9) - (i13 & i9))));
        int i15 = i3 + i4 + i6 + ((-1814252664) * i2) + (2073254503 * i7);
        int i16 = i15 * i15;
        int i17 = ((-223937157) * i3) + 1943797760 + (1745420935 * i4) + (i12 * 1162804602) + (1162804602 * i9) + ((-1162804602) * i14) + ((-1386741760) * i6) + ((-1631584256) * i2) + ((-1368915968) * i7) + ((-1053032448) * i16);
        int i18 = (i3 * (-1919122223)) + 1408767311 + (i4 * (-1919121035)) + (i12 * (-594)) + (i9 * (-594)) + (i14 * 594) + (i6 * (-1919121629)) + (i2 * (-390511720)) + (i7 * 1804971285) + (i16 * 255066112);
        int i19 = i17 + (i18 * i18 * 379846656);
        if (i19 == 1) {
            return c(objArr);
        }
        if (i19 == 2) {
            return d(objArr);
        }
        if (i19 == 3) {
            return b(objArr);
        }
        int i20 = 2 % 2;
        Object[] objArr2 = new Object[1];
        G(58 - TextUtils.lastIndexOf("", '0', 0), "\u0004\u0013㘣㘣\u000f\u0007\u0006\u0013\u0012\u0003\u0004\b\u0012\r\u0018\u0003\b\u000b\u0018\u0003\u0012\u0010\u000e\t\u0018\u0006\u0010\u0012\u0018\b\u0003\u0013\u000f\u0015\r\u0013\n\u0013\u0018\r\u0018\u0007\u0007\u0016\u0004\u0005\u0018\u0002\u0018\t\u0003\u0012\u0018\u0005\r\u0012\u0002\u0014㘖", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 46), objArr2);
        throw new RuntimeException(((String) objArr2[0]).intern());
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = I + 51;
        F = i3 % 128;
        if (i3 % 2 == 0) {
            return B();
        }
        B();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 93;
        F = i4 % 128;
        int i5 = i4 % 2;
        j jVar = aVar.f24759p;
        if (i5 != 0) {
            int i6 = 11 / 0;
        }
        int i7 = i3 + 61;
        F = i7 % 128;
        int i8 = i7 % 2;
        return jVar;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = I + 19;
        int i4 = i3 % 128;
        F = i4;
        int i5 = i3 % 2;
        j jVar = aVar.f24765v;
        int i6 = i4 + 123;
        I = i6 % 128;
        if (i6 % 2 != 0) {
            return jVar;
        }
        throw null;
    }

    static void init$0() {
        $$d = new byte[]{93, 121, -117, 60};
        $$e = 147;
    }

    @Override // o.eq.b
    public final o.en.e D() {
        int i2 = 2 % 2;
        int i3 = I + 3;
        F = i3 % 128;
        if (i3 % 2 != 0) {
            o.en.e eVar = o.en.e.f24191e;
            throw null;
        }
        o.en.e eVar2 = o.en.e.f24191e;
        int i4 = I + 37;
        F = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return eVar2;
    }

    @Override // o.eq.e
    public final j a() {
        int i2 = 2 % 2;
        int i3 = F + 63;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        j jVar = this.f24760q;
        int i6 = i4 + 97;
        F = i6 % 128;
        int i7 = i6 % 2;
        return jVar;
    }

    @Override // o.eq.b
    public final o.eq.b b(String str) {
        int i2 = 2 % 2;
        a aVar = new a(str);
        int i3 = I + 25;
        F = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.e
    public final j b() {
        int i2 = 2 % 2;
        int i3 = F + 69;
        int i4 = i3 % 128;
        I = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j jVar = this.f24762s;
        int i5 = i4 + 81;
        F = i5 % 128;
        int i6 = i5 % 2;
        return jVar;
    }

    @Override // o.eq.e
    public final j c() {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 85;
        I = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        j jVar = this.f24761r;
        int i5 = i3 + 49;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            return jVar;
        }
        throw null;
    }

    @Override // o.eq.b
    public final o.eu.d<? extends o.ff.a> c(String str) {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 65;
        I = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 111;
        I = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return null;
    }

    @Override // o.eq.e
    public final j d() {
        j jVar;
        int i2 = 2 % 2;
        int i3 = I + 35;
        int i4 = i3 % 128;
        F = i4;
        if (i3 % 2 != 0) {
            jVar = this.f24763t;
            int i5 = 69 / 0;
        } else {
            jVar = this.f24763t;
        }
        int i6 = i4 + 71;
        I = i6 % 128;
        int i7 = i6 % 2;
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fr.antelop.sdk.card.emvapplication.EmvApplication, java.lang.Object] */
    @Override // o.ea.a
    public final /* synthetic */ EmvApplication e() throws Throwable {
        int i2 = f24757n * 1263002533;
        f24757n = i2;
        int iActiveCount = Thread.activeCount();
        ?? B = b((int) Runtime.getRuntime().maxMemory(), 1931138004, -1931138001, i2, new Object[]{this}, iActiveCount, (int) SystemClock.uptimeMillis());
        return B;
    }

    @Override // o.eq.e
    public final i f() {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 103;
        I = i4 % 128;
        int i5 = i4 % 2;
        i iVar = this.f24767x;
        int i6 = i3 + 25;
        I = i6 % 128;
        int i7 = i6 % 2;
        return iVar;
    }

    @Override // o.eq.e
    public final j g() {
        j jVar;
        int i2 = 2 % 2;
        int i3 = I + 105;
        int i4 = i3 % 128;
        F = i4;
        if (i3 % 2 != 0) {
            jVar = this.f24766w;
            int i5 = 99 / 0;
        } else {
            jVar = this.f24766w;
        }
        int i6 = i4 + 19;
        I = i6 % 128;
        int i7 = i6 % 2;
        return jVar;
    }

    @Override // o.eq.e
    public final i h() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 113;
        F = i4 % 128;
        int i5 = i4 % 2;
        i iVar = this.f24768y;
        int i6 = i3 + 43;
        F = i6 % 128;
        int i7 = i6 % 2;
        return iVar;
    }

    @Override // o.eq.e
    public final j i() {
        int i2 = f24749f * (-2110954310);
        f24749f = i2;
        int i3 = f24751h * 196900627;
        f24751h = i3;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i4 = f24753j * 180922917;
        f24753j = i4;
        return (j) b(iElapsedRealtime, -984784827, 984784828, i2, new Object[]{this}, i3, i4);
    }

    @Override // o.eq.e
    public final e j() {
        int i2 = 2 % 2;
        int i3 = F + 13;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        e eVar = this.f24764u;
        int i6 = i4 + 111;
        F = i6 % 128;
        if (i6 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    @Override // o.eq.e
    public final j l() {
        int i2 = f24758o * 561404235;
        f24758o = i2;
        int i3 = f24755l * 1425490601;
        f24755l = i3;
        int i4 = f24756m * (-1214202915);
        f24756m = i4;
        int i5 = f24754k * 1846612302;
        f24754k = i5;
        return (j) b(i4, 544987011, -544987009, i2, new Object[]{this}, i3, i5);
    }

    @Override // o.eq.e
    public final ac m() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 59;
        F = i4 % 128;
        int i5 = i4 % 2;
        ac acVar = this.A;
        int i6 = i3 + 85;
        F = i6 % 128;
        int i7 = i6 % 2;
        return acVar;
    }

    @Override // o.eq.e
    public final j n() {
        int i2 = 2 % 2;
        int i3 = F + 51;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        j jVar = this.C;
        int i6 = i4 + 83;
        F = i6 % 128;
        if (i6 % 2 == 0) {
            return jVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eq.e
    public final j o() {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 113;
        I = i4 % 128;
        int i5 = i4 % 2;
        j jVar = this.f24769z;
        int i6 = i3 + 117;
        I = i6 % 128;
        int i7 = i6 % 2;
        return jVar;
    }

    @Override // o.eq.b
    public final String q() {
        int i2 = f24752i * (-1857091369);
        f24752i = i2;
        int i3 = f24750g * 1384149030;
        f24750g = i3;
        return (String) b((int) Runtime.getRuntime().freeMemory(), -89652029, 89652029, i2, new Object[]{this}, i3, new Random().nextInt());
    }

    @Override // o.eq.b
    public final boolean s() {
        int i2 = 2 % 2;
        int i3 = F;
        int i4 = i3 + 105;
        I = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        I = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }
}
