package o.bg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import o.a.l;
import o.d.d;
import o.dd.g;
import o.dd.h;
import o.en.f;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f21061a = 0;

    /* JADX INFO: renamed from: b */
    public static int f21062b = 0;

    /* JADX INFO: renamed from: c */
    public static int f21063c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21064d = 0;

    /* JADX INFO: renamed from: e */
    public static int f21065e = 0;

    /* JADX INFO: renamed from: g */
    public static int f21066g = 0;

    /* JADX INFO: renamed from: h */
    public static int f21067h = 0;

    /* JADX INFO: renamed from: i */
    public static int f21068i = 0;

    /* JADX INFO: renamed from: j */
    public static int f21069j = 0;

    /* JADX INFO: renamed from: p */
    private static int[] f21070p = null;

    /* JADX INFO: renamed from: q */
    private static int f21071q = 0;

    /* JADX INFO: renamed from: r */
    private static int f21072r = 0;

    /* JADX INFO: renamed from: t */
    private static int f21073t = 0;

    /* JADX INFO: renamed from: w */
    private static int f21074w = 0;

    /* JADX INFO: renamed from: f */
    private boolean f21075f;

    /* JADX INFO: renamed from: k */
    private g f21076k;

    /* JADX INFO: renamed from: l */
    private boolean f21077l;

    /* JADX INFO: renamed from: m */
    private List<i> f21078m;

    /* JADX INFO: renamed from: n */
    private g f21079n;

    /* JADX INFO: renamed from: o */
    private Long f21080o;

    /* JADX INFO: renamed from: s */
    private boolean f21081s;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, short r10) {
        /*
            int r7 = r9 + 4
            byte[] r6 = o.bg.b.$$a
            int r0 = r8 * 3
            int r5 = 1 - r0
            int r0 = r10 * 2
            int r4 = r0 + 117
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r6 != 0) goto L28
            r1 = r2
            r0 = r7
        L13:
            int r7 = r7 + r4
            r4 = r7
            r7 = r0
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            int r0 = r7 + 1
            r7 = r6[r0]
            goto L13
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.b.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21067h = 904264875;
        f21066g = -1039675324;
        f21069j = 322897431;
        f21068i = -142131303;
        f21062b = 864817102;
        f21065e = -1026247848;
        f21061a = -890991407;
        f21064d = 1593784073;
        f21063c = -1259817851;
        f21073t = 0;
        f21074w = 1;
        f21072r = 0;
        f21071q = 1;
        o();
        ImageFormat.getBitsPerPixel(0);
        int i2 = f21073t + 93;
        f21074w = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        Context context = (Context) objArr[1];
        o.en.b bVar2 = (o.en.b) objArr[2];
        g gVar = (g) objArr[3];
        int i2 = 2 % 2;
        new h();
        if (bVar.f21076k != null) {
            try {
                if (h.c(context, bVar2, gVar) >= h.c(context, bVar2, bVar.f21076k)) {
                    return null;
                }
                int i3 = f21071q + 77;
                f21072r = i3 % 128;
                int i4 = i3 % 2;
            } catch (f e2) {
                if (o.ea.f.a()) {
                    Object[] objArr2 = new Object[1];
                    u(new int[]{942737419, 295446966, -823595434, 2038697285, 1698973354, -2031953570, 2108502369, -1979143513, 309379675, 1500319117, -823595434, 2038697285, 519481088, -1800119719}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 25, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    u(new int[]{1887664985, 977030464, -1671913974, -412262863, 1055726270, 1501178008, -733023374, -2029457622, -1958850788, -1540545165, -1750345430, -551188699, -359709377, -1789279592, -401185828, -1155359923, -239035539, -20635733, -1236792276, 6838392, 1317553791, -1112581768, -1118649122, 258707868, -1059094087, 411656025}, View.combineMeasuredStates(0, 0) + 52, objArr3);
                    o.ea.f.e(strIntern, ((String) objArr3[0]).intern(), e2);
                }
            }
        }
        bVar.f21076k = gVar;
        if (o.ea.f.a()) {
            Object[] objArr4 = new Object[1];
            u(new int[]{942737419, 295446966, -823595434, 2038697285, 1698973354, -2031953570, 2108502369, -1979143513, 309379675, 1500319117, -823595434, 2038697285, 519481088, -1800119719}, View.MeasureSpec.makeMeasureSpec(0, 0) + 25, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            u(new int[]{1887664985, 977030464, -1671913974, -412262863, 1055726270, 1501178008, -733023374, -2029457622, -1958850788, -1540545165, 506135005, -1141630412, 951684772, -77675879, 1963212093, 1561777734, 1055726270, 1501178008, -733023374, -2029457622, -40957761, 4636831, -1371092366, -1722908268, -26717867, -1386844755, 1556209242, 513761122}, 56 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5);
            o.ea.f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(bVar.f21076k).toString());
            int i5 = f21071q + 109;
            f21072r = i5 % 128;
            int i6 = i5 % 2;
        }
        return null;
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~i6;
        int i12 = ~(i11 | i3);
        int i13 = (i10 + i12) - (i10 & i12);
        int i14 = (~((i3 + i8) - (i3 & i8))) | (~((i9 + i11) - (i9 & i11)));
        int i15 = ~(i2 | i6);
        int i16 = (i14 + i15) - (i14 & i15);
        int i17 = i15 | i13;
        int i18 = i2 + i6 + i7 + ((-1585779005) * i5) + (640148872 * i4);
        int i19 = i18 * i18;
        int i20 = (i2 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i13) + ((-224423437) * i16) + (224423437 * i17) + (84410368 * i7) + (1159200768 * i5) + ((-734003200) * i4) + (2089549824 * i19);
        int i21 = (i2 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i13 * (-1802)) + (i16 * (-901)) + (i17 * 901) + (i7 * (-1291221671)) + (i5 * (-1079815989)) + (i4 * 669414472) + (i19 * 145489920);
        int i22 = i20 + (i21 * i21 * (-1699479552));
        if (i22 == 1) {
            b bVar = (b) objArr[0];
            int i23 = 2 % 2;
            int i24 = f21072r + 29;
            int i25 = i24 % 128;
            f21071q = i25;
            int i26 = i24 % 2;
            g gVar = bVar.f21076k;
            int i27 = i25 + 73;
            f21072r = i27 % 128;
            int i28 = i27 % 2;
            return gVar;
        }
        if (i22 != 2) {
            return b(objArr);
        }
        b bVar2 = (b) objArr[0];
        int i29 = 2 % 2;
        int i30 = f21071q + 77;
        int i31 = i30 % 128;
        f21072r = i31;
        if (i30 % 2 != 0) {
            bVar2.f21075f = true;
        } else {
            bVar2.f21075f = false;
        }
        bVar2.f21076k = null;
        bVar2.f21079n = null;
        bVar2.f21078m = null;
        bVar2.f21080o = null;
        bVar2.f21077l = false;
        bVar2.f21081s = false;
        int i32 = i31 + 35;
        f21071q = i32 % 128;
        int i33 = i32 % 2;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{111, -103, -70, 103};
        $$b = 133;
    }

    static void o() {
        f21070p = new int[]{-690496531, -815609389, 1267583503, -435030396, 1120277657, 1822550395, 1126573118, 1784198541, -1568434577, 147962360, -167051576, 241701979, -617303065, 1185947504, -1186317979, -1534399780, -1787992889, -488101767};
    }

    private static void u(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f21070p;
        int i4 = 989264422;
        float f2 = 0.0f;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = d.a(675 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, -328001469, false, $$c(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f21070p;
        if (iArr6 != null) {
            int i7 = $10 + 37;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i8])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    int maximumDrawingCacheSize = 675 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    char defaultSize = (char) View.getDefaultSize(i5, i5);
                    int size = 12 - View.MeasureSpec.getSize(i5);
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a(maximumDrawingCacheSize, defaultSize, size, -328001469, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                }
                iArr2[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i8++;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, i5, iArr5, i5, length3);
        lVar.f19941d = i5;
        int i9 = $11 + 41;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 2 % 4;
        }
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 105;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    lVar.f19942e ^= iArr5[i11];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = d.a(2098218801);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 300, (char) (52696 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1416256172, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i11 += 11;
                } else {
                    lVar.f19942e ^= iArr5[i11];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = d.a(((Process.getThreadPriority(0) + 20) >> 6) + 301, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52696), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -1416256172, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i11++;
                }
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 - 1);
                objA5 = d.a(230 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (51004 - Color.argb(0, 0, 0, 0)), View.MeasureSpec.getSize(0) + 9, -330018025, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final g a() {
        int i2 = 1638453650 * f21065e;
        f21065e = i2;
        int i3 = f21062b * 36621504;
        f21062b = i3;
        int i4 = f21068i * 241773600;
        f21068i = i4;
        return (g) c(-968128923, new Object[]{this}, i2, (int) Runtime.getRuntime().maxMemory(), i4, 968128924, i3);
    }

    public final void a(g gVar) {
        int i2 = 2 % 2;
        int i3 = f21072r + 43;
        int i4 = i3 % 128;
        f21071q = i4;
        if (i3 % 2 == 0) {
            this.f21079n = gVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f21079n = gVar;
        int i5 = i4 + 75;
        f21072r = i5 % 128;
        int i6 = i5 % 2;
    }

    public final g b() {
        int i2 = 2 % 2;
        int i3 = f21072r + 61;
        int i4 = i3 % 128;
        f21071q = i4;
        int i5 = i3 % 2;
        g gVar = this.f21079n;
        int i6 = i4 + 53;
        f21072r = i6 % 128;
        if (i6 % 2 == 0) {
            return gVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void b(Context context, o.en.b bVar, g gVar) {
        int i2 = f21063c * (-1736728553);
        f21063c = i2;
        int i3 = f21064d * 798932806;
        f21064d = i3;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i4 = f21061a * 1360672158;
        f21061a = i4;
        c(-717841723, new Object[]{this, context, bVar, gVar}, i2, i4, iElapsedRealtime, 717841723, i3);
    }

    public final void b(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f21071q + 19;
        f21072r = i3 % 128;
        if (i3 % 2 == 0) {
            this.f21075f = z2;
            return;
        }
        this.f21075f = z2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(List<i> list) {
        int i2 = 2 % 2;
        int i3 = f21072r + 57;
        f21071q = i3 % 128;
        if (i3 % 2 != 0) {
            this.f21078m = list;
        } else {
            this.f21078m = list;
            throw null;
        }
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f21071q + 97;
        f21072r = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f21077l;
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        return z2;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f21071q + 99;
        f21072r = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f21075f;
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.bg.b.f21071q
            int r1 = r0 + 59
            int r0 = r1 % 128
            o.bg.b.f21072r = r0
            int r1 = r1 % r6
            r5 = 0
            if (r1 == 0) goto L6c
            boolean r1 = o.ea.f.a()
            r0 = 29
            int r0 = r0 / r5
            if (r1 == 0) goto L5d
        L18:
            int r0 = o.bg.b.f21071q
            int r1 = r0 + 109
            int r0 = r1 % 128
            o.bg.b.f21072r = r0
            int r1 = r1 % r6
            r0 = 14
            int[] r2 = new int[r0]
            r2 = {x0074: FILL_ARRAY_DATA , data: [942737419, 295446966, -823595434, 2038697285, 1698973354, -2031953570, 2108502369, -1979143513, 309379675, 1500319117, -823595434, 2038697285, 519481088, -1800119719} // fill-array
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0, r5, r5)
            int r1 = 25 - r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            u(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r0.intern()
            r0 = 12
            int[] r2 = new int[r0]
            r2 = {x0094: FILL_ARRAY_DATA , data: [-817208748, -1017419895, 1671050299, -296962808, 1094815352, 863489701, 1317553791, -1112581768, -15940927, 1787010517, 2109653419, 1582280111} // fill-array
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r1 = 21 - r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            u(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.d(r3, r0)
        L5d:
            r2 = 0
            r7.f21076k = r2
            int r0 = o.bg.b.f21072r
            int r1 = r0 + 117
            int r0 = r1 % 128
            o.bg.b.f21071q = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L73
            return
        L6c:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L5d
            goto L18
        L73:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bg.b.e():void");
    }

    public final void f() {
        int i2 = 2 % 2;
        int i3 = f21071q + 77;
        int i4 = i3 % 128;
        f21072r = i4;
        if (i3 % 2 != 0) {
            this.f21077l = false;
        } else {
            this.f21077l = true;
        }
        int i5 = i4 + 99;
        f21071q = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
    }

    public final boolean g() {
        int i2 = 2 % 2;
        int i3 = f21072r;
        int i4 = i3 + 91;
        f21071q = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f21081s;
        int i6 = i3 + 29;
        f21071q = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final void h() {
        int i2 = 2 % 2;
        int i3 = f21071q + 91;
        f21072r = i3 % 128;
        this.f21081s = i3 % 2 == 0;
    }

    public final Long i() {
        Long l2;
        int i2 = 2 % 2;
        int i3 = f21072r;
        int i4 = i3 + 35;
        f21071q = i4 % 128;
        if (i4 % 2 == 0) {
            l2 = this.f21080o;
            int i5 = 72 / 0;
        } else {
            l2 = this.f21080o;
        }
        int i6 = i3 + 117;
        f21071q = i6 % 128;
        if (i6 % 2 != 0) {
            return l2;
        }
        throw null;
    }

    public final List<i> j() {
        List<i> list;
        int i2 = 2 % 2;
        int i3 = f21072r;
        int i4 = i3 + 55;
        f21071q = i4 % 128;
        if (i4 % 2 == 0) {
            list = this.f21078m;
            int i5 = 75 / 0;
        } else {
            list = this.f21078m;
        }
        int i6 = i3 + 75;
        f21071q = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final void k() {
        int i2 = (-1147357663) * f21069j;
        f21069j = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f21066g * (-2117190377);
        f21066g = i3;
        int i4 = 1957287060 * f21067h;
        f21067h = i4;
        c(961351511, new Object[]{this}, i2, i4, i3, -961351509, iMaxMemory);
    }
}
