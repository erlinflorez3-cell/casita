package o.ew;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.m;
import o.eu.a;
import o.fe.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a<e, d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25499a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25500b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25501c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25502d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25503e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f25504g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25505h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25506k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f25507m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25508o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25509f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f25510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25511j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$d(short r8, short r9, int r10) {
        /*
            int r0 = r10 * 4
            int r7 = r0 + 116
            int r2 = r8 * 2
            int r1 = 1 - r2
            byte[] r6 = o.ew.b.$$a
            int r0 = r9 * 4
            int r5 = 4 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2a
            r0 = r2
            r1 = r3
        L17:
            int r7 = r7 + r0
            int r5 = r5 + 1
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r5]
            int r1 = r1 + 1
            goto L17
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ew.b.$$d(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25501c = 1550619895;
        f25502d = 1755517493;
        f25500b = -642183988;
        f25503e = 298476216;
        f25499a = -1937258142;
        f25507m = 0;
        f25508o = 1;
        f25505h = 0;
        f25506k = 1;
        a();
        int i2 = f25508o + 85;
        f25507m = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public b() throws Throwable {
        Object[] objArr = new Object[1];
        l("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 20, 0, 0}, false, objArr);
        this.f25510i = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        l("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{20, 32, 162, 0}, true, objArr2);
        this.f25509f = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        l("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{52, 28, 97, 12}, true, objArr3);
        this.f25511j = ((String) objArr3[0]).intern();
    }

    private static e a(boolean z2, o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        e eVar = new e(false, bVar, s2);
        int i3 = f25505h + 109;
        f25506k = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a() {
        f25504g = new char[]{56501, 56552, 56559, 56544, 56534, 56553, 56553, 56555, 56553, 56554, 56558, 56556, 56558, 56536, 56537, 56562, 56561, 56561, 56556, 56555, 56331, 56723, 56723, 56724, 56443, 56442, 56720, 56718, 56720, 56716, 56715, 56717, 56715, 56715, 56440, 56444, 56713, 56715, 56718, 56717, 56723, 56724, 56726, 56727, 56444, 56445, 56723, 56715, 56717, 56724, 56725, 56718, 56545, 56394, 56397, 56396, 56402, 56403, 56405, 56406, 56379, 56382, 56397, 56392, 56401, 56402, 56402, 56403, 56378, 56377, 56399, 56397, 56399, 56395, 56394, 56396, 56394, 56394, 56375, 56379, 56564, 56434, 56416, 56413, 56430, 56414, 56422, 56429, 56428, 56438, 56430, 56431, 56438, 56437, 56430, 56428, 56436, 56418};
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        b bVar = (b) objArr[0];
        o.eu.d dVar = (o.eu.d) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25506k + 65;
        f25505h = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarB = bVar.b((d) dVar);
        int i5 = f25505h + 117;
        f25506k = i5 % 128;
        if (i5 % 2 != 0) {
            return aVarB;
        }
        throw null;
    }

    private o.ef.a b(d dVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25505h + 79;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(dVar);
        Object[] objArr = new Object[1];
        l("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{80, 18, 131, 10}, false, objArr);
        aVarA.c(((String) objArr[0]).intern(), dVar.s());
        int i5 = f25506k + 63;
        f25505h = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        throw null;
    }

    private static d b(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        d dVar = new d(str, str2, z2);
        int i3 = f25505h + 11;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    private e b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25505h + 103;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) super.d(aVar);
        Object[] objArr = new Object[1];
        l("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{20, 32, 162, 0}, true, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        eVar.b(((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        Object[] objArr3 = new Object[1];
        l("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{52, 28, 97, 12}, true, objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i7 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i7;
        int i8 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i8;
        eVar.d(((Integer) o.ef.a.a(1122077797, objArr4, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i7, i8)).intValue());
        Object[] objArr5 = new Object[1];
        l("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 20, 0, 0}, false, objArr5);
        Object[] objArr6 = {aVar, ((String) objArr5[0]).intern()};
        int i9 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i9;
        int i10 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i10;
        eVar.e(((Integer) o.ef.a.a(1122077797, objArr6, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i9, i10)).intValue());
        int i11 = f25506k + 73;
        f25505h = i11 % 128;
        int i12 = i11 % 2;
        return eVar;
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~((~i7) | i3);
        int i9 = ~i5;
        int i10 = (-1) - (((-1) - i8) & ((-1) - (~((-1) - (((-1) - i9) & ((-1) - i3))))));
        int i11 = ~i3;
        int i12 = ~((i11 + i9) - (i11 & i9));
        int i13 = ~(i11 | i7);
        int i14 = (i12 + i13) - (i12 & i13);
        int i15 = ~((-1) - (((-1) - i9) & ((-1) - i7)));
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = ~((-1) - (((-1) - i5) & ((-1) - i11)));
        int i18 = (i17 + i13) - (i17 & i13);
        int i19 = i7 + i3 + i2 + (1039959776 * i4) + ((-2046201414) * i6);
        int i20 = i19 * i19;
        int i21 = ((357140864 * i7) - 8388608) + ((-1785926397) * i3) + ((-2146011519) * i10) + (i16 * 2146011519) + (2146011519 * i18) + ((-1788870656) * i2) + ((-201326592) * i4) + ((-406847488) * i6) + (529399808 * i20);
        int i22 = ((i7 * 868240256) - 1765242424) + (i3 * 868238279) + (i10 * (-659)) + (i16 * 659) + (i18 * 659) + (i2 * 868239597) + (i4 * 817356128) + (i6 * 406493490) + (i20 * 645267456);
        if (i21 + (i22 * i22 * 681705472) != 1) {
            return b(objArr);
        }
        b bVar = (b) objArr[0];
        o.ef.a aVar = (o.ef.a) objArr[1];
        int i23 = 2 % 2;
        int i24 = f25505h + 97;
        f25506k = i24 % 128;
        int i25 = i24 % 2;
        d dVarC = bVar.c(aVar);
        int i26 = f25505h + 27;
        f25506k = i26 % 128;
        int i27 = i26 % 2;
        return dVarC;
    }

    private d c(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25505h + 43;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) super.a(aVar);
        Object[] objArr = new Object[1];
        l("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{80, 18, 131, 10}, false, objArr);
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i5 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i5;
        int i6 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i6;
        dVar.e(((Integer) o.ef.a.a(1122077797, objArr2, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i5, i6)).intValue());
        int i7 = f25505h + 91;
        f25506k = i7 % 128;
        if (i7 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    private o.ef.a d(e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25506k + 73;
        f25505h = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarA = super.a(eVar);
        Object[] objArr = new Object[1];
        l("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 20, 0, 0}, false, objArr);
        aVarA.c(((String) objArr[0]).intern(), eVar.i());
        Object[] objArr2 = new Object[1];
        l("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{20, 32, 162, 0}, true, objArr2);
        aVarA.c(((String) objArr2[0]).intern(), eVar.j());
        Object[] objArr3 = new Object[1];
        l("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{52, 28, 97, 12}, true, objArr3);
        aVarA.c(((String) objArr3[0]).intern(), eVar.g());
        int i5 = f25506k + 103;
        f25505h = i5 % 128;
        if (i5 % 2 == 0) {
            return aVarA;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{111, -103, -70, 103};
        $$b = 22;
    }

    private static void l(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 17;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object obj = null;
        Object bytes = str2;
        if (str2 != null) {
            int i8 = i6 + 91;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                obj.hashCode();
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i9 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        char[] cArr = f25504g;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + 115;
                $11 = i15 % 128;
                int i16 = i15 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i9;
                        byte b3 = b2;
                        objA = o.d.d.a(249 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 1), KeyEvent.normalizeMetaState(i9) + 11, 1376582792, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i14] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i14++;
                    i3 = 2;
                    i9 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr, i10, cArr3, 0, i11);
        if (bArr != null) {
            int i17 = $11 + 3;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr4 = new char[i11];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i11) {
                if (bArr[mVar.f19943d] == 1) {
                    int i19 = $11 + 91;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 11, (char) Color.red(0), 9 - ImageFormat.getBitsPerPixel(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i22 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(836 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 27280), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1210801192, false, $$d(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i22] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35715), TextUtils.getOffsetBefore("", 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i13 > 0) {
            int i23 = $11 + 87;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            char[] cArr5 = new char[i11];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i11);
            int i25 = i11 - i13;
            System.arraycopy(cArr5, 0, cArr3, i25, i13);
            System.arraycopy(cArr5, i13, cArr3, 0, i25);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i11];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i11) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i11 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i12 > 0) {
            int i26 = $11 + 23;
            $10 = i26 % 128;
            int i27 = i26 % 2 != 0 ? 1 : 0;
            while (true) {
                mVar.f19943d = i27;
                if (mVar.f19943d >= i11) {
                    break;
                }
                int i28 = $11 + 123;
                $10 = i28 % 128;
                if (i28 % 2 != 0) {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] << iArr[4]);
                    i27 = mVar.f19943d << 1;
                } else {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i27 = mVar.f19943d + 1;
                }
            }
        }
        String str3 = new String(cArr3);
        int i29 = $11 + 103;
        $10 = i29 % 128;
        int i30 = i29 % 2;
        objArr[0] = str3;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.eu.d dVar) throws o.ef.b {
        int i2 = f25499a * (-32009225);
        f25499a = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = f25503e * (-2079282016);
        f25503e = i3;
        int i4 = f25500b * 1118103075;
        f25500b = i4;
        return (o.ef.a) c(iFreeMemory, new Object[]{this, dVar}, -1695672755, i3, i2, i4, 1695672755);
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ef.a a(o.ff.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25506k + 51;
        f25505h = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVarD = d((e) aVar);
        int i5 = f25505h + 125;
        f25506k = i5 % 128;
        int i6 = i5 % 2;
        return aVarD;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d a(o.ef.a aVar) throws o.ef.b {
        int i2 = f25502d * 2056642868;
        f25502d = i2;
        int iMyUid = Process.myUid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f25501c * 1843762545;
        f25501c = i3;
        return (o.eu.d) c(iMyUid, new Object[]{this, aVar}, -1321750349, iMaxMemory, i2, i3, 1321750350);
    }

    @Override // o.eu.a
    public final /* bridge */ /* synthetic */ o.ff.a a(o.ff.b bVar, short s2) {
        int i2 = 2 % 2;
        int i3 = f25506k + 47;
        f25505h = i3 % 128;
        int i4 = i3 % 2;
        e eVarA = a(false, bVar, s2);
        int i5 = f25506k + 53;
        f25505h = i5 % 128;
        if (i5 % 2 == 0) {
            return eVarA;
        }
        throw null;
    }

    @Override // o.eu.a
    public final a.d b() {
        a.d dVar;
        int i2 = 2 % 2;
        int i3 = f25506k + 31;
        f25505h = i3 % 128;
        if (i3 % 2 != 0) {
            dVar = a.d.f25445d;
            int i4 = 91 / 0;
        } else {
            dVar = a.d.f25445d;
        }
        int i5 = f25506k + 71;
        f25505h = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.eu.d d(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f25505h + 33;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        d dVarB = b(str, str2, z2);
        int i5 = f25506k + 5;
        f25505h = i5 % 128;
        int i6 = i5 % 2;
        return dVarB;
    }

    @Override // o.eu.a
    public final /* synthetic */ o.ff.a d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25505h + 55;
        f25506k = i3 % 128;
        int i4 = i3 % 2;
        e eVarB = b(aVar);
        int i5 = f25506k + 59;
        f25505h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return eVarB;
    }
}
