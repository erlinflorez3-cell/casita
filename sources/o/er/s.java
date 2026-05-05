package o.er;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.R;
import java.lang.reflect.Method;
import o.an.a;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25161b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25162c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f25163d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25164e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25165i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r8 = 1 - r0
            int r0 = r10 * 2
            int r7 = 121 - r0
            byte[] r6 = o.er.s.$$a
            int r0 = r9 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L2a
            r7 = r8
            r0 = r5
            r2 = r3
        L16:
            int r5 = r5 + 1
            int r7 = r7 + r0
            r1 = r2
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r5]
            goto L16
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.s.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25162c = 0;
        f25165i = 1;
        f25164e = 0;
        f25161b = 1;
        a();
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f25162c + 103;
        f25165i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public s(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void a() {
        f25163d = new int[]{1188742708, -666208640, 943610046, -2105406829, -2085842025, 1668742180, -1261592358, -1365507089, 1309233945, 1930343375, -1266228534, 82863122, 715629150, -1538975751, 250840116, 168090358, 1351306098, 1181724448};
    }

    private String d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25164e + 93;
        f25161b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f25010g.a().b();
            throw null;
        }
        String strB = this.f25010g.a().b();
        if (strB != null) {
            return strB;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f(new int[]{542515603, -274289305, -159786804, 1081168190, -1098406738, -1570436983, -1191805170, -890834537, -1406606025, 2050389569, -604569369, -1705435865}, 22 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(new int[]{-1627238850, 621514094, -1769468385, -764620594, 280226024, -626825162, 1070633565, -1444816078, -154822205, -1302287361, 1718556406, -218922643, -1752175410, -510401361, -952104788, -2034388567, 1679160178, -489988154, 2004513467, -134279475, 839966048, -937163597, -1860024775, -708654343, 1465783886, 1497526069, -1635221954, 1929221585, 1718556406, -218922643, 2010878111, -599191297, -133751533, -411323568, 1851157188, -818243416, 431565785, 1448418252, -952104788, -2034388567, 987138401, 413323011, -1263349232, 1774154464, 1202556658, -1914449370, 481014408, -1990974764, 1699524659, -1454188509, -1246069330, -855391988, 940419067, 63808114, -257816035, 1037506361}, (ViewConfiguration.getLongPressTimeout() >> 16) + 110, objArr2);
            o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
            int i4 = f25161b + 17;
            f25164e = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr3 = new Object[1];
        f(new int[]{-372979301, 717740384, -1769468385, -764620594, 280226024, -626825162, 1070633565, -1444816078, 1119884342, -847405676}, Drawable.resolveOpacity(0, 0) + 17, objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i3;
        int i4 = 2 % 2;
        o.a.l lVar = new o.a.l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = f25163d;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $11 + 107;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i3 = 0;
            }
            while (i3 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i3])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 675, (char) ((SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) - 1), 12 - Gravity.getAbsoluteGravity(0, 0), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = 989264422;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f25163d;
        if (iArr6 != null) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i6 = 0;
            }
            while (i6 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i6])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - View.resolveSizeAndState(i7, i7, i7), (char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - TextUtils.indexOf((CharSequence) "", '0'), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i6] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i6++;
                i7 = 0;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, i7, iArr5, i7, length3);
        lVar.f19941d = i7;
        while (lVar.f19941d < iArr.length) {
            int i10 = $11 + 19;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            o.a.l.a(iArr5);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 69;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                lVar.f19942e ^= iArr5[i12];
                Object[] objArr4 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - Gravity.getAbsoluteGravity(0, 0), (char) (52697 - KeyEvent.getDeadChar(0, 0)), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1416256172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i12++;
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            o.a.l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(229 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51003), 9 - (Process.myTid() >> 22), -330018025, false, $$c(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{113, 60, -124, 107};
        $$b = 75;
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25164e + 59;
        f25161b = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f25164e + 33;
        f25161b = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public final o.y.j<o.eb.i> e() throws Throwable {
        int i2 = 2 % 2;
        String strD = d();
        o.ep.d dVar = this.f25009a;
        boolean zC = c();
        a.c cVar = a.c.f20370e;
        o.eb.c cVar2 = new o.eb.c() { // from class: o.er.s.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f25166a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f25167d = 0;

            @Override // o.eb.c
            public final int getThemeResource() {
                int i3 = 2 % 2;
                int i4 = f25167d + 3;
                f25166a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = R.style.antelopSecurePinDisplayThemeInternal;
                int i7 = f25166a + 1;
                f25167d = i7 % 128;
                int i8 = i7 % 2;
                return i6;
            }
        };
        Object[] objArr = new Object[1];
        f(new int[]{2036032597, 585863752, 1044944751, -507398615, -375391167, -1173979356, -1082266982, 748190961, -699119973, -1998299730}, 17 - ExpandableListView.getPackedPositionType(0L), objArr);
        o.y.j<o.eb.i> jVar = new o.y.j<>(strD, dVar, zC, cVar, cVar2, ((String) objArr[0]).intern());
        int i3 = f25164e + 47;
        f25161b = i3 % 128;
        if (i3 % 2 != 0) {
            return jVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25161b + 7;
        f25164e = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.a()};
        int i5 = f25161b + 37;
        f25164e = i5 % 128;
        if (i5 % 2 == 0) {
            return cVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
