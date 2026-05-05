package o.ad;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.m;
import o.g.a;
import o.m.h;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends o.u.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f20137a = 0;

    /* JADX INFO: renamed from: b */
    public static int f20138b = 0;

    /* JADX INFO: renamed from: d */
    public static int f20139d = 0;

    /* JADX INFO: renamed from: h */
    public static int f20140h = 0;

    /* JADX INFO: renamed from: i */
    public static int f20141i = 0;

    /* JADX INFO: renamed from: j */
    public static int f20142j = 0;

    /* JADX INFO: renamed from: m */
    private static char[] f20143m = null;

    /* JADX INFO: renamed from: n */
    private static int f20144n = 0;

    /* JADX INFO: renamed from: o */
    private static int f20145o = 0;

    /* JADX INFO: renamed from: p */
    public static int f20146p = 0;

    /* JADX INFO: renamed from: f */
    private boolean f20147f;

    /* JADX INFO: renamed from: g */
    private final a f20148g;

    /* JADX INFO: renamed from: k */
    private boolean f20149k;

    /* JADX INFO: renamed from: l */
    private boolean f20150l;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r8, short r9, int r10) {
        /*
            int r8 = r8 + 4
            int r2 = r10 * 3
            int r1 = 1 - r2
            int r0 = r9 * 4
            int r7 = r0 + 116
            byte[] r6 = o.ad.d.$$c
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2b
            r0 = r8
            r7 = r3
            r2 = r4
        L16:
            int r8 = r8 + r7
            r7 = r8
            r8 = r0
        L19:
            byte r1 = (byte) r7
            int r0 = r8 + 1
            r5[r2] = r1
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r2 = r2 + 1
            r8 = r6[r0]
            goto L16
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.d.$$e(byte, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f20146p = 1638059452;
        init$0();
        f20142j = 2075925779;
        f20141i = -2106850203;
        f20140h = -1597392852;
        f20137a = -1487383667;
        f20138b = -519686842;
        f20139d = 1749743546;
        f20144n = 0;
        f20145o = 1;
        f20143m = new char[]{56505, 56555, 56550, 56551, 56558, 56555, 56547, 56532, 56539, 56558, 56550, 56548, 56556, 56555, 56548, 56553, 56558, 56558, 56537, 56511, 56567, 56562, 56563, 56570, 56567, 56559, 56544, 56551, 56572, 56550, 56546, 56566, 56567, 56570, 56570, 56561, 56568, 56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56526, 56561, 56528, 56505, 56532, 56547, 56555, 56558, 56471, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56521, 56548, 56547, 56555, 56558, 56523, 56529, 56563, 56553, 56546, 56550, 56555, 56554, 56523, 56521, 56556, 56563, 56562, 56555, 56553, 56561, 56553, 56553, 56563, 56553, 56546, 56548, 56555, 56327, 56717, 56716, 56471, 56527, 56561, 56560, 56553, 56521, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56522, 56557, 56563, 56553, 56546, 56548, 56546, 56546, 56553, 56551, 56545, 56551, 56552, 56548, 56472, 56505, 56563, 56529, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56526, 56558, 56551, 56547, 56554, 56555, 56550, 56546};
    }

    private d(boolean z2, List<h> list, a aVar) {
        super(z2, list);
        this.f20148g = aVar;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (-1) - (((-1) - (~((i8 + i3) - (i8 & i3)))) & ((-1) - i10));
        int i12 = ~(i9 | i2);
        int i13 = (~i3) | i8;
        int i14 = (-1) - (((-1) - (~((i13 + i5) - (i13 & i5)))) & ((-1) - i12));
        int i15 = i2 + i5 + i6 + (531708263 * i4) + ((-608630064) * i7);
        int i16 = i15 * i15;
        int i17 = (i2 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i10 * (-1010133554)) + (i11 * (-1010133554)) + ((-1010133554) * i14) + ((-1238368256) * i6) + ((-45088768) * i4) + ((-419430400) * i7) + ((-1471938560) * i16);
        int i18 = ((i2 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i10 * 282) + (i11 * 282) + (i14 * 282) + (i6 * (-1679524245)) + (i4 * (-166744051)) + (i7 * 2062148848) + (i16 * (-865337344));
        int i19 = i17 + (i18 * i18 * (-1617166336));
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 == 2) {
            return e(objArr);
        }
        int i20 = 2 % 2;
        d dVar = new d(true, null, (a) objArr[0]);
        int i21 = f20144n + 79;
        f20145o = i21 % 128;
        int i22 = i21 % 2;
        return dVar;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20145o;
        int i4 = i3 + 37;
        f20144n = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = dVar.f20147f;
        int i6 = i3 + 125;
        f20144n = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        int i7 = 65 / 0;
        return Boolean.valueOf(z2);
    }

    public static d c(List<h> list) {
        int i2 = 2 % 2;
        d dVar = new d(false, list, null);
        int i3 = f20144n + 73;
        f20145o = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:193|136|(1:138)(4:139|186|140|(7:142|191|149|(2:151|158)(4:152|189|153|154)|(4:188|160|(2:162|163)(4:168|184|169|170)|(2:166|167))|174|175)(2:143|147))|148|191|149|(0)(0)|(0)|174|175) */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x014a: ARITH (r10 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:113:0x014a */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0468 A[Catch: Exception -> 0x049c, TRY_LEAVE, TryCatch #4 {Exception -> 0x049c, blocks: (B:149:0x0445, B:152:0x0468, B:154:0x048d, B:156:0x0495, B:157:0x049b, B:153:0x0472), top: B:191:0x0445, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ad.d.d(int, int):java.lang.Object[]");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20145o + 125;
        int i4 = i3 % 128;
        f20144n = i4;
        int i5 = i3 % 2;
        dVar.f20149k = true;
        int i6 = i4 + 87;
        f20145o = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return null;
    }

    public static d e(a aVar) {
        Object[] objArr = {aVar};
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i2 = f20139d * (-574484331);
        f20139d = i2;
        int i3 = f20138b * 1826095378;
        f20138b = i3;
        return (d) a(objArr, -1494054554, iMyPid, i2, 1494054554, iMyUid, i3);
    }

    public static d h() {
        int i2 = 2 % 2;
        d dVar = new d(true, null, null);
        int i3 = f20144n + 125;
        f20145o = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return dVar;
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -87, -21};
        $$b = 49;
    }

    static void init$1() {
        $$c = new byte[]{53, 97, -95, 41};
        $$d = 244;
    }

    private static void q(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = $11 + 19;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = f20143m;
        int i11 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i11;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(249 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, 1376582792, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    i11 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr2, i7, cArr4, 0, i8);
        if (bArr != null) {
            char[] cArr5 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                int i12 = $10 + 9;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(10 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) TextUtils.indexOf("", "", 0, 0), 9 - ((byte) KeyEvent.getModifierMetaStateMask()), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (-b4);
                        objA3 = o.d.d.a(836 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27279 - (ViewConfiguration.getTapTimeout() >> 16)), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1210801192, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, (char) (KeyEvent.normalizeMetaState(0) + 35715), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i16 = $11 + 105;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr4 = cArr5;
        }
        if (i10 > 0) {
            int i18 = $11 + 61;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i8];
            System.arraycopy(cArr4, 0, cArr6, 0, i8);
            int i20 = i8 - i10;
            System.arraycopy(cArr6, 0, cArr4, i20, i10);
            System.arraycopy(cArr6, i10, cArr4, 0, i20);
            int i21 = $10 + 33;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 4 / 4;
            }
        }
        if (z2) {
            int i23 = $11 + 61;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr = new char[i8];
                i2 = 1;
                mVar.f19943d = 1;
            } else {
                i2 = 1;
                cArr = new char[i8];
                mVar.f19943d = 0;
            }
            while (mVar.f19943d < i8) {
                cArr[mVar.f19943d] = cArr4[(i8 - mVar.f19943d) - i2];
                mVar.f19943d += i2;
                i2 = 1;
            }
            cArr4 = cArr;
        }
        if (i9 > 0) {
            mVar.f19943d = 0;
            while (mVar.f19943d < i8) {
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
                int i24 = $11 + 33;
                $10 = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void r(byte b2, short s2, byte b3, Object[] objArr) {
        int i2 = (s2 * 2) + 100;
        byte[] bArr = $$a;
        int i3 = b3 * 3;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += -i3;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 += -bArr[i4];
                i4++;
            }
        }
    }

    public final i a() {
        int i2 = 2 % 2;
        a aVar = this.f20148g;
        if (aVar != null) {
            i iVarB = aVar.b();
            int i3 = f20145o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f20144n = i3 % 128;
            int i4 = i3 % 2;
            return iVarB;
        }
        int i5 = f20144n + 123;
        f20145o = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        int i6 = 40 / 0;
        return null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f20144n;
        int i4 = i3 + 3;
        f20145o = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.f20148g;
        if (aVar == null) {
            int i6 = i3 + 97;
            f20145o = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        if (aVar.h()) {
            int i8 = f20145o + 39;
            f20144n = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        String strC = this.f20148g.c();
        int i10 = f20144n + 67;
        f20145o = i10 % 128;
        if (i10 % 2 != 0) {
            return strC;
        }
        throw null;
    }

    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f20145o;
        int i4 = i3 + 53;
        f20144n = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        a aVar = this.f20148g;
        if (aVar != null) {
            if (aVar.h()) {
                return null;
            }
            return this.f20148g.e();
        }
        int i5 = i3 + 7;
        f20144n = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f20145o + 101;
        int i4 = i3 % 128;
        f20144n = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        a aVar = this.f20148g;
        if (aVar != null) {
            if (aVar.h()) {
                return this.f20148g.e();
            }
            return null;
        }
        int i5 = i4 + 65;
        f20145o = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final boolean f() {
        int i2 = (-231849454) * f20137a;
        f20137a = i2;
        int i3 = f20140h * (-1119816026);
        f20140h = i3;
        int iNextInt = new Random().nextInt(1133826221);
        int i4 = f20141i * (-828000951);
        f20141i = i4;
        return ((Boolean) a(new Object[]{this}, 647439991, i2, iNextInt, -647439990, i3, i4)).booleanValue();
    }

    public final void g() {
        int i2 = 2 % 2;
        int i3 = f20144n;
        int i4 = i3 + 21;
        f20145o = i4 % 128;
        int i5 = i4 % 2;
        this.f20147f = true;
        int i6 = i3 + 33;
        f20145o = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String i() {
        int i2 = 2 % 2;
        int i3 = f20145o + 101;
        f20144n = i3 % 128;
        int i4 = i3 % 2;
        a aVar = this.f20148g;
        Object obj = null;
        if (aVar == null || !aVar.h()) {
            return null;
        }
        int i5 = f20144n + 117;
        f20145o = i5 % 128;
        int i6 = i5 % 2;
        String strC = this.f20148g.c();
        int i7 = f20144n + 3;
        f20145o = i7 % 128;
        if (i7 % 2 != 0) {
            return strC;
        }
        obj.hashCode();
        throw null;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f20145o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f20144n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        a aVar = this.f20148g;
        if (aVar == null || !aVar.h()) {
            return null;
        }
        int i4 = f20144n + 55;
        f20145o = i4 % 128;
        if (i4 % 2 != 0) {
            return this.f20148g.j();
        }
        this.f20148g.j();
        obj.hashCode();
        throw null;
    }

    public final void k() {
        int i2 = 1609597881 * f20142j;
        f20142j = i2;
        a(new Object[]{this}, 1619693479, i2, (int) SystemClock.uptimeMillis(), -1619693477, Process.myTid(), (int) SystemClock.elapsedRealtime());
    }

    public final boolean l() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f20145o + 41;
        int i4 = i3 % 128;
        f20144n = i4;
        if (i3 % 2 != 0) {
            z2 = this.f20150l;
            int i5 = 27 / 0;
        } else {
            z2 = this.f20150l;
        }
        int i6 = i4 + 101;
        f20145o = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final void n() {
        int i2 = 2 % 2;
        int i3 = f20144n + 37;
        int i4 = i3 % 128;
        f20145o = i4;
        int i5 = i3 % 2;
        this.f20150l = true;
        int i6 = i4 + 59;
        f20144n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
    }

    public final boolean o() {
        int i2 = 2 % 2;
        int i3 = f20145o + 11;
        int i4 = i3 % 128;
        f20144n = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f20149k;
        int i6 = i4 + 29;
        f20145o = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }
}
