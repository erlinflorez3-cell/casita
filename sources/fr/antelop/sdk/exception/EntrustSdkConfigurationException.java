package fr.antelop.sdk.exception;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.o;
import o.d.d;

/* JADX INFO: loaded from: classes5.dex */
public final class EntrustSdkConfigurationException extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f19463a = 0;

    /* JADX INFO: renamed from: b */
    private static int f19464b = 0;

    /* JADX INFO: renamed from: c */
    private static int f19465c = 0;

    /* JADX INFO: renamed from: d */
    private static short[] f19466d = null;

    /* JADX INFO: renamed from: e */
    private static byte[] f19467e = null;

    /* JADX INFO: renamed from: f */
    private static char[] f19468f = null;

    /* JADX INFO: renamed from: g */
    private static int f19469g = 0;

    /* JADX INFO: renamed from: h */
    private static int f19470h = 0;

    /* JADX INFO: renamed from: i */
    private static long f19471i = 0;

    /* JADX INFO: renamed from: j */
    private static int f19472j = 0;

    /* JADX INFO: renamed from: k */
    public static int f19473k = 0;

    /* JADX INFO: renamed from: l */
    public static int f19474l = 0;

    /* JADX INFO: renamed from: m */
    private static int f19475m = 0;

    /* JADX INFO: renamed from: n */
    public static int f19476n = 0;

    /* JADX INFO: renamed from: o */
    public static int f19477o = 0;
    private final EntrustSdkErrorCode code;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r7, short r8, byte r9) {
        /*
            int r0 = r8 * 4
            int r2 = 3 - r0
            byte[] r8 = fr.antelop.sdk.exception.EntrustSdkConfigurationException.$$c
            int r0 = r7 + 99
            int r1 = r9 * 2
            int r7 = r1 + 1
            byte[] r6 = new byte[r7]
            r5 = 0
            if (r8 != 0) goto L2a
            r3 = r7
            r4 = r5
        L13:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L16:
            int r2 = r2 + 1
            byte r1 = (byte) r0
            int r4 = r3 + 1
            r6[r3] = r1
            if (r4 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L13
        L2a:
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.exception.EntrustSdkConfigurationException.$$e(short, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19477o = -1504344852;
        f19476n = -1790422840;
        f19474l = 947336569;
        f19473k = -618801527;
        init$0();
        f19469g = 0;
        f19475m = 1;
        f19470h = 0;
        f19472j = 1;
        c();
        f19465c = -686190495;
        f19463a = 1150422449;
        f19464b = -1785081175;
        f19467e = new byte[]{72, 72};
        int i2 = f19475m + 87;
        f19469g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public EntrustSdkConfigurationException(EntrustSdkErrorCode entrustSdkErrorCode, String str) {
        super(str);
        this.code = entrustSdkErrorCode;
    }

    static void c() {
        f19468f = new char[]{38043, 44277, 58462, 15819, 30016, 36547, 50733, 8121, 22327, 26772, 41017, 63585, 12780, 18808, 33487, 55901, 5062, 11043, 27838, 38021, 44263, 58483, 15834, 30027, 36568, 50733, 8088, 22333, 26772, 41022, 63595, 12768, 18787, 33485, 55897, 5079, 11060, 20220, 30343, 15889, 59315, 44834, 21680, 7233, 50591, 36178, 45818, 31291, 8741, 60296, 37659, 22704, '6', 38109, 44277, 58467, 15837, 29965, 36573, 50735, 8108, 22332, 26755, 40982, 63521, 12774, 18803, 33480, 55883, 5077, 11113, 27822, 42012, 64899, 13589, 19811, 34544, 56949, 6025, 12121, 24763, 47152, 61860, 2319, 17040, 39430, 53849, 60398, 9052, 25795, 48213, 62895, 3372, 62893, 52696, 34139, 38109, 44278, 58472, 15809, 30017, 36505, 50745, 8103, 22305, 26825, 40977, 63595, 12784, 18808, 33487, 55890, 5021, 11040, 27822, 42012, 64899, 13589, 19823, 34497, 56951, 6088, 12123, 24748, 47150, 61875, 2318, 38109, 44277, 58467, 15837, 29965, 36573, 50735, 8108, 22332, 26755, 40982, 63521, 12774, 18803, 33480, 55883, 5077, 11113, 27822, 42012, 64899, 13589, 19811, 34544, 56949, 6025, 12110, 24764, 47139, 61877, 2307, 17040, 39445, 53849, 60405, 9024};
        f19471i = -8034642490000757626L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:220|141|(1:143)(1:165)|144|(1:146)(6:148|221|149|(1:151)(1:155)|152|(2:154|156)(8:157|(2:161|166)(1:160)|219|167|(3:170|(1:172)(1:177)|(1:174)(1:168))(5:178|217|179|180|181)|(4:223|185|(2:187|188)(4:194|213|195|196)|(2:190|(2:192|193)))|200|201))|147|219|167|(0)(0)|(0)|200|201) */
    /* JADX WARN: Removed duplicated region for block: B:170:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0520 A[Catch: Exception -> 0x0507, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0507, blocks: (B:167:0x04da, B:178:0x0520, B:180:0x0571, B:183:0x0583, B:184:0x0589, B:179:0x052a), top: B:219:0x04da, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x058a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] c(int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.exception.EntrustSdkConfigurationException.c(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, 59, -113, -1};
        $$b = 156;
    }

    static void init$1() {
        $$c = new byte[]{53, 97, -95, 41};
        $$d = 166;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.exception.EntrustSdkConfigurationException.p(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void q(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f19468f[i2 + i5])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = d.a(742 - (ViewConfiguration.getTouchSlop() >> 8), (char) (Process.myTid() >> 22), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f19471i), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 766, (char) (ImageFormat.getBitsPerPixel(0) + 12471), (ViewConfiguration.getLongPressTimeout() >> 16) + 12, 1946853218, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    int i6 = 388 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int iLastIndexOf = 17 - TextUtils.lastIndexOf("", '0');
                    int i7 = $$d;
                    byte b6 = (byte) 0;
                    objA3 = d.a(i6, cMyTid, iLastIndexOf, 39570797, false, $$e((byte) ((i7 + 31) - (i7 | 31)), b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 81;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = d.a(387 - (Process.myPid() >> 22), (char) KeyEvent.keyCodeFromString(""), 18 - View.MeasureSpec.getMode(0), 39570797, false, $$e((byte) ((-1) - (((-1) - $$d) | ((-1) - 31))), b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 81 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = d.a(-723636472);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    objA5 = d.a(387 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 18 - (ViewConfiguration.getTapTimeout() >> 16), 39570797, false, $$e((byte) ($$d & 31), b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i10 = $10 + 107;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(byte r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 4
            int r8 = 4 - r0
            byte[] r7 = fr.antelop.sdk.exception.EntrustSdkConfigurationException.$$a
            int r0 = r9 * 4
            int r6 = r0 + 1
            int r0 = r10 * 4
            int r0 = 100 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2d
            r0 = r6
            r1 = r8
            r3 = r4
        L16:
            int r0 = -r0
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L1b:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r6) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L2a:
            r0 = r7[r1]
            goto L16
        L2d:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.exception.EntrustSdkConfigurationException.r(byte, int, short, java.lang.Object[]):void");
    }

    public final EntrustSdkErrorCode getCode() {
        int i2 = 2 % 2;
        int i3 = f19470h + 117;
        f19472j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder("EntrustSdkConfigurationException{code=").append(this.code);
        String string = "";
        Object[] objArr = new Object[1];
        p((short) (ViewConfiguration.getWindowTouchSlop() >> 8), 1819566612 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 8492 - AndroidCharacter.getMirror('0'), (-61) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern());
        if (super.getMessage() != null) {
            string = new StringBuilder(", message=").append(super.getMessage()).toString();
            int i3 = f19470h + 39;
            f19472j = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            }
        }
        String string2 = sbAppend2.append(string).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i5 = f19470h + 81;
        f19472j = i5 % 128;
        if (i5 % 2 != 0) {
            return string2;
        }
        throw null;
    }
}
