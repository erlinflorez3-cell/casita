package o.x;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import o.a.l;
import o.a.n;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26906a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26907b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26908d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f26909e;

    /* JADX INFO: renamed from: o.x.h$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f26910b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f26911c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f26912d;

        static {
            int[] iArr = new int[d.values().length];
            f26912d = iArr;
            try {
                iArr[d.f26913a.ordinal()] = 1;
                int i2 = f26910b + 71;
                f26911c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26912d[d.f26917e.ordinal()] = 2;
                int i5 = f26910b;
                int i6 = (((i5 + 105) - (105 & i5)) << 1) - (i5 ^ 105);
                f26911c = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26912d[d.f26915c.ordinal()] = 3;
                int i8 = f26911c;
                int i9 = ((i8 + 47) - (47 | i8)) + ((-1) - (((-1) - i8) & ((-1) - 47)));
                f26910b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26912d[d.f26916d.ordinal()] = 4;
                int i12 = f26910b;
                int i13 = (((i12 + 103) - (103 & i12)) << 1) - (i12 ^ 103);
                f26911c = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ d[] f26914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f26915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f26916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f26917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f26918f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f26919g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int[] f26920h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f26921i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f26922j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, short r10, int r11) {
            /*
                int r0 = r10 * 4
                int r8 = 4 - r0
                int r0 = r11 * 3
                int r7 = r0 + 1
                byte[] r6 = o.x.h.d.$$a
                int r0 = r9 * 2
                int r0 = 121 - r0
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L29
                r1 = r8
                r3 = r4
            L15:
                int r8 = r8 + r0
                int r1 = r1 + 1
                r2 = r3
            L19:
                int r3 = r2 + 1
                byte r0 = (byte) r8
                r5[r2] = r0
                if (r3 != r7) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                r0 = r6[r1]
                goto L15
            L29:
                r2 = r4
                r1 = r8
                r8 = r0
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.h.d.$$c(byte, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f26922j = 0;
            f26919g = 1;
            f26921i = 0;
            f26918f = 1;
            b();
            Object[] objArr = new Object[1];
            k(new int[]{-1373119985, 798250577, 1304254568, -901875154, 467394181, 412451422, -1834019118, -1860586438, -783498446, 818469563}, 18 - KeyEvent.keyCodeFromString(""), objArr);
            f26917e = new d(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k(new int[]{-1373119985, 798250577, -889030851, -1747280970, -1992131815, -2132156368, 45105180, -1928422636, -651250297, -176038967}, 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            f26915c = new d(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            k(new int[]{-1956310132, -632438087, 1513287303, -275050394, -543006574, -310212496, -188511128, 462617768, -31927390, -1408076125, -1976176630, -201087246, 616165777, -1300658751}, ExpandableListView.getPackedPositionGroup(0L) + 28, objArr3);
            f26916d = new d(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            k(new int[]{897247986, -681315005, 1766612248, 1342371364, -1498888178, 1594507526, 325781502, 1044363501, 1120685656, -1780618067, 1171646776, 1009036245}, 21 - TextUtils.getTrimmedLength(""), objArr4);
            f26913a = new d(((String) objArr4[0]).intern(), 3);
            f26914b = d();
            int i2 = f26922j + 43;
            f26919g = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private d(String str, int i2) {
        }

        static void b() {
            f26920h = new int[]{-148158038, 1581283655, 1891727622, -1661852861, 1636601468, 1565456239, -563909018, 932431766, 33192459, -53582705, -713094278, 1910222648, -1397088924, -1637060916, -612197874, -1961646592, 163489183, -1604180049};
        }

        private static /* synthetic */ d[] d() {
            int i2 = 2 % 2;
            int i3 = f26921i;
            int i4 = i3 + 113;
            f26918f = i4 % 128;
            int i5 = i4 % 2;
            d[] dVarArr = {f26917e, f26915c, f26916d, f26913a};
            int i6 = i3 + 61;
            f26918f = i6 % 128;
            if (i6 % 2 != 0) {
                return dVarArr;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{120, 46, 101, 90};
            $$b = 237;
        }

        private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f26920h;
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
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(KeyEvent.normalizeMetaState(0) + 675, (char) ((Process.getThreadPriority(0) + 20) >> 6), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i6++;
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
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
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f26920h;
            float f2 = 0.0f;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $10 + 71;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            objA2 = o.d.d.a((AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)) + 674, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', i5, i5) + 13, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a(675 - KeyEvent.getDeadChar(0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.combineMeasuredStates(0, 0) + 12, -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    }
                    i9++;
                    f2 = 0.0f;
                    i5 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i5, iArr4, i5, length2);
            lVar.f19941d = i5;
            while (lVar.f19941d < iArr.length) {
                int i11 = $10 + 105;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i13 = 0;
                for (int i14 = 16; i13 < i14; i14 = 16) {
                    lVar.f19942e ^= iArr4[i13];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        int i15 = 301 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52697);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 11;
                        byte b8 = (byte) ($$b & 3);
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(i15, minimumFlingVelocity, capsMode, -1416256172, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i13++;
                }
                int i16 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i16;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i17 = lVar.f19942e;
                int i18 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    byte b10 = (byte) 2;
                    byte b11 = (byte) (b10 - 2);
                    objA5 = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 229, (char) (51004 - (ViewConfiguration.getLongPressTimeout() >> 16)), 9 - KeyEvent.normalizeMetaState(0), -330018025, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f26918f + 65;
            f26921i = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            if (i4 == 0) {
                return dVar;
            }
            throw null;
        }

        public static d[] values() {
            int i2 = 2 % 2;
            int i3 = f26918f + 31;
            f26921i = i3 % 128;
            int i4 = i3 % 2;
            d[] dVarArr = (d[]) f26914b.clone();
            int i5 = f26918f + 121;
            f26921i = i5 % 128;
            int i6 = i5 % 2;
            return dVarArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, int r10) {
        /*
            int r2 = r8 + 4
            byte[] r8 = o.x.h.$$a
            int r0 = r9 * 2
            int r1 = 115 - r0
            int r0 = r10 * 4
            int r7 = r0 + 1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2b
            r0 = r2
            r3 = r7
            r4 = r5
        L14:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L18:
            int r4 = r3 + 1
            byte r0 = (byte) r1
            r6[r3] = r0
            int r0 = r2 + 1
            if (r4 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r2 = r8[r0]
            r3 = r1
            goto L14
        L2b:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.h.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26907b = 0;
        f26908d = 1;
        f26906a = -1270219463;
    }

    public h(d dVar) {
        this.f26909e = dVar;
    }

    private static void c(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f26906a)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 270, (char) (Process.myTid() >> 22), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a(522 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 11 - MotionEvent.axisFromString(""), 627984172, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
            int i11 = $10 + 99;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a(522 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 627984172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{49, 53, Ascii.ETB, 7};
        $$b = Mp4VideoDirectory.TAG_DEPTH;
    }

    public final d a() {
        int i2 = 2 % 2;
        int i3 = f26908d;
        int i4 = i3 + 115;
        f26907b = i4 % 128;
        int i5 = i4 % 2;
        d dVar = this.f26909e;
        int i6 = i3 + 55;
        f26907b = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    public final WalletValidationException b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AnonymousClass2.f26912d[this.f26909e.ordinal()];
        if (i3 == 1) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Unexpected;
            Object[] objArr = new Object[1];
            c((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, "\u000b\rￛ\u000b\u0004\ufff9\u0001\f\u0006�￼�\nￛ\u0006\u0007\u0001\f\ufff9\ufffb\u0001\f\u0006�\u0000\f\r\uffd9\n�\u0005\u0007\f", true, KeyEvent.normalizeMetaState(0) + 138, View.resolveSizeAndState(0, 0, 0) + 3, objArr);
            return new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (i3 == 2) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            c(View.resolveSizeAndState(0, 0, 0) + 6, "\u0006\ufffb\ufff1\u000e\uffff\u0006", true, Gravity.getAbsoluteGravity(0, 0) + 136, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, objArr2);
            WalletValidationException walletValidationException = new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
            int i4 = f26907b + 49;
            f26908d = i4 % 128;
            int i5 = i4 % 2;
            return walletValidationException;
        }
        if (i3 == 3) {
            return new WalletValidationException(WalletValidationErrorCode.WrongState, str);
        }
        if (i3 != 4) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            c((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, "ￃ\u0007\b\u0017\u0006\b\u0013\u001b\b\u0011\ufff8ￃ\uffdd\b\u0018\u000f\u0004\ufff9", true, ExpandableListView.getPackedPositionChild(0L) + 128, 11 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
            throw new UnsupportedOperationException(sb.append(((String) objArr3[0]).intern()).append(this.f26909e.name()).toString());
        }
        WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Unknown;
        Object[] objArr4 = new Object[1];
        c(28 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u000b\ufff8\ufffa\u0000\u000b\u0005￼\uffff\u000b\f\uffd8\t￼\u0004\u0006\u000b\n\fￚ\u0005\t￼\u000b\u000b\ufff8\uffe7\u0005\u0006\u0000", true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 139, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, objArr4);
        WalletValidationException walletValidationException2 = new WalletValidationException(walletValidationErrorCode3, ((String) objArr4[0]).intern());
        int i6 = f26907b + 113;
        f26908d = i6 % 128;
        int i7 = i6 % 2;
        return walletValidationException2;
    }
}
