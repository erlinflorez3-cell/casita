package o.bf;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.EligibilityDenialReason;
import java.lang.reflect.Method;
import o.a.l;
import o.a.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
final class e implements o.ea.d<EligibilityDenialReason> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f21011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f21012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f21013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f21016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f21017g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f21018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f21019j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int[] f21020l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ e[] f21021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21022n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21023o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f21024r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f21025s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f21026t = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21027h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21028k;

    /* JADX INFO: renamed from: o.bf.e$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21029a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21030c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f21031e;

        static {
            int[] iArr = new int[e.values().length];
            f21031e = iArr;
            try {
                iArr[e.f21012b.ordinal()] = 1;
                int i2 = f21029a;
                int i3 = (i2 ^ 125) + (((i2 + 125) - (i2 | 125)) << 1);
                f21030c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21031e[e.f21011a.ordinal()] = 2;
                int i6 = f21030c;
                int i7 = ((i6 + 87) - (87 | i6)) + ((i6 + 87) - (i6 & 87));
                f21029a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21031e[e.f21015e.ordinal()] = 3;
                int i10 = f21030c + 99;
                f21029a = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 3;
                } else {
                    int i12 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21031e[e.f21013c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21031e[e.f21014d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21031e[e.f21017g.ordinal()] = 6;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21031e[e.f21018i.ordinal()] = 7;
                int i14 = f21030c;
                int i15 = ((-1) - (((-1) - i14) | ((-1) - 39))) + (i14 | 39);
                f21029a = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21031e[e.f21016f.ordinal()] = 8;
                int i17 = f21030c;
                int i18 = (i17 ^ 47) + ((i17 & 47) << 1);
                f21029a = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21031e[e.f21019j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, int r8, int r9) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 113
            int r0 = r7 * 3
            int r1 = 3 - r0
            int r7 = r9 * 3
            int r0 = r7 + 1
            byte[] r6 = o.bf.e.$$a
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r6 != 0) goto L2c
            r3 = r4
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r8
            r2 = r3
            r8 = r1
            r1 = r0
        L1a:
            int r0 = r1 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r7) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            r1 = r6[r0]
            goto L15
        L2c:
            r2 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bf.e.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21026t = 0;
        f21025s = 1;
        f21022n = 0;
        f21024r = 1;
        c();
        Object[] objArr = new Object[1];
        q(14 - Color.argb(0, 0, 0, 0), "￫\r\b\b\u0007\n\f�￼\uffe7\u000b￦\u0007\f", false, Color.argb(0, 0, 0, 0) + 149, 8 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        f21012b = new e(((String) objArr[0]).intern(), 0, 4301, 10);
        Object[] objArr2 = new Object[1];
        q((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, "￭￼\t\n\u0000\u0006\u0005￥\u0006\u000b￪\f\u0007\u0007\u0006\t\u000b￼\ufffb￦\n", false, (ViewConfiguration.getScrollBarSize() >> 8) + 150, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, objArr2);
        f21011a = new e(((String) objArr2[0]).intern(), 1, 4302, 9);
        Object[] objArr3 = new Object[1];
        p(new int[]{-1084745606, 2010500140, 95477450, 1533060196, -1031782985, -1269107275}, 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        f21014d = new e(((String) objArr3[0]).intern(), 2, 4303, 8);
        Object[] objArr4 = new Object[1];
        q(15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\uffe7￼\uffff\uffe7�\ufffe\r\u000b\b\t\t\u000e￬\r\b", true, 148 - Color.red(0), (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr4);
        f21015e = new e(((String) objArr4[0]).intern(), 3, 4304, 3);
        Object[] objArr5 = new Object[1];
        q((-16777201) - Color.rgb(0, 0, 0), "\u000f\n\n\t\f\u000e\uffff\ufffe￢�\uffff￨\t\u000e￭", false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 147, 8 - Gravity.getAbsoluteGravity(0, 0), objArr5);
        f21013c = new e(((String) objArr5[0]).intern(), 4, 4305, 2);
        Object[] objArr6 = new Object[1];
        p(new int[]{-1339771850, 73489778, -64259416, -1215952137, -186206199, 1203451547, -1122711939, -1092674865}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr6);
        f21017g = new e(((String) objArr6[0]).intern(), 5, 4306, 7);
        Object[] objArr7 = new Object[1];
        p(new int[]{-1339771850, 73489778, -1734602816, -1055582124, 1518266996, -9835627, 1126230054, -633388339, 841412833, 2036214755}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19, objArr7);
        f21018i = new e(((String) objArr7[0]).intern(), 6, 4307, 5);
        Object[] objArr8 = new Object[1];
        p(new int[]{371082593, 1104819858, 94584589, -968314749, -1639024, -2141457819, -889982545, 864532814}, 14 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
        f21016f = new e(((String) objArr8[0]).intern(), 7, 4308, 6);
        Object[] objArr9 = new Object[1];
        q(TextUtils.getCapsMode("", 0, 0) + 24, "￼\u000e�\b\u000b￩\u0004�￬\u0012ￛ�\ufffe\r\u000b\b\t\t\u000e￬\r\b\uffe7\r", true, 148 - TextUtils.indexOf("", "", 0, 0), Color.blue(0) + 6, objArr9);
        f21019j = new e(((String) objArr9[0]).intern(), 8, 4309, 4);
        f21021m = b();
        int i2 = f21025s + 79;
        f21026t = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private e(String str, int i2, int i3, int i4) {
        this.f21027h = i3;
        this.f21028k = i4;
    }

    public static e b(int i2) {
        e[] eVarArrValues;
        int length;
        int i3;
        int i4 = 2 % 2;
        int i5 = f21022n + 49;
        f21024r = i5 % 128;
        if (i5 % 2 == 0) {
            eVarArrValues = values();
            length = eVarArrValues.length;
            i3 = 1;
        } else {
            eVarArrValues = values();
            length = eVarArrValues.length;
            i3 = 0;
        }
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                int i6 = f21022n + 13;
                f21024r = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = f21024r;
            int i9 = i8 + 93;
            int i10 = i9 % 128;
            f21022n = i10;
            if (i9 % 2 != 0) {
                int i11 = eVarArrValues[i3].f21027h;
                obj.hashCode();
                throw null;
            }
            e eVar = eVarArrValues[i3];
            if (eVar.f21027h == i2) {
                int i12 = i10 + 15;
                f21024r = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 85 / 0;
                }
                return eVar;
            }
            i3++;
            int i14 = i8 + 7;
            f21022n = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    private static /* synthetic */ e[] b() {
        int i2 = 2 % 2;
        int i3 = f21024r;
        int i4 = i3 + 59;
        f21022n = i4 % 128;
        int i5 = i4 % 2;
        e[] eVarArr = {f21012b, f21011a, f21014d, f21015e, f21013c, f21017g, f21018i, f21016f, f21019j};
        int i6 = i3 + 53;
        f21022n = i6 % 128;
        int i7 = i6 % 2;
        return eVarArr;
    }

    static void c() {
        f21020l = new int[]{-582362899, 1468097065, -1377732120, 1063949227, 1072996373, -759922214, 1173067196, -1384233385, 1777300290, -1667554640, -984215355, 1297951766, 1836282330, 934119643, -890313970, -804070868, 1026673725, -2039207209};
        f21023o = -1270219466;
    }

    static void init$0() {
        $$a = new byte[]{67, Ascii.SI, 99, -76};
        $$b = 161;
    }

    private static void p(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21020l;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 675;
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iRed = 12 - Color.red(0);
                        byte length2 = (byte) $$a.length;
                        objA = o.d.d.a(maxKeyCode, windowTouchSlop, iRed, -328001469, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length3 = iArr2.length;
        int[] iArr4 = new int[length3];
        int[] iArr5 = f21020l;
        if (iArr5 != null) {
            int length4 = iArr5.length;
            int[] iArr6 = new int[length4];
            int i7 = 0;
            while (i7 < length4) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    int minimumFlingVelocity = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte length5 = (byte) $$a.length;
                    objA2 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 675, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), minimumFlingVelocity, -328001469, false, $$c((byte) i5, length5, (byte) (length5 - 4)), new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i7++;
                int i8 = $11 + 93;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i5 = 0;
            }
            int i10 = $11 + 15;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iArr5 = iArr6;
            i5 = 0;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length3);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                lVar.f19942e ^= iArr4[i12];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 3);
                    objA3 = o.d.d.a(300 - Process.getGidForName(""), (char) (52697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, -1416256172, false, $$c(b2, b3, (byte) (b3 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i12++;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 + 2);
                objA4 = o.d.d.a(229 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (51004 - View.resolveSize(0, 0)), 8 - TextUtils.indexOf((CharSequence) "", '0'), -330018025, false, $$c(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 69;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f21023o)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 270, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 522, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $10 + 33;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(Color.argb(0, 0, 0, 0) + 522, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21022n + 47;
        f21024r = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        e eVar = (e) Enum.valueOf(e.class, str);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f21022n + 23;
        f21024r = i5 % 128;
        if (i5 % 2 != 0) {
            return eVar;
        }
        obj.hashCode();
        throw null;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = f21024r + 41;
        f21022n = i3 % 128;
        int i4 = i3 % 2;
        e[] eVarArr = f21021m;
        if (i4 == 0) {
            return (e[]) eVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EligibilityDenialReason a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21024r + 83;
        f21022n = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass5.f21031e[ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        switch (AnonymousClass5.f21031e[ordinal()]) {
            case 1:
                return EligibilityDenialReason.OsNotSupported;
            case 2:
                return EligibilityDenialReason.OsVersionNotSupported;
            case 3:
                return EligibilityDenialReason.NfcNotSupported;
            case 4:
                return EligibilityDenialReason.HceNotSupported;
            case 5:
            case 6:
                return EligibilityDenialReason.DeviceNotAllowed;
            case 7:
                EligibilityDenialReason eligibilityDenialReason = EligibilityDenialReason.DeviceSupportExpired;
                int i5 = f21022n + 79;
                f21024r = i5 % 128;
                int i6 = i5 % 2;
                return eligibilityDenialReason;
            case 8:
                return EligibilityDenialReason.RootNotAllowed;
            case 9:
                EligibilityDenialReason eligibilityDenialReason2 = EligibilityDenialReason.ProductNotSupportedBySdk;
                int i7 = f21022n + 23;
                f21024r = i7 % 128;
                int i8 = i7 % 2;
                return eligibilityDenialReason2;
            default:
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                p(new int[]{-182545074, 1985041236, -2034736610, -1116723743, 1695056364, 2125589445, 124407438, 709669744, 1933239514, -532558659}, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    final int d() {
        int i2 = 2 % 2;
        int i3 = f21024r + 21;
        int i4 = i3 % 128;
        f21022n = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.f21028k;
        int i6 = i4 + 67;
        f21024r = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
        return i5;
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21022n + 27;
        f21024r = i3 % 128;
        if (i3 % 2 == 0) {
            a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EligibilityDenialReason eligibilityDenialReasonA = a();
        int i4 = f21024r + 11;
        f21022n = i4 % 128;
        int i5 = i4 % 2;
        return eligibilityDenialReasonA;
    }
}
