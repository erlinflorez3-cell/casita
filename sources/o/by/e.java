package o.by;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.n;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    private static final char[] f21828b;

    /* JADX INFO: renamed from: c */
    public static int f21829c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21830d = 0;

    /* JADX INFO: renamed from: e */
    public static int f21831e = 0;

    /* JADX INFO: renamed from: h */
    private static char[] f21832h = null;

    /* JADX INFO: renamed from: k */
    private static int f21833k = 0;

    /* JADX INFO: renamed from: l */
    private static int f21834l = 0;

    /* JADX INFO: renamed from: m */
    private static int f21835m = 0;

    /* JADX INFO: renamed from: n */
    private static int f21836n = 0;

    /* JADX INFO: renamed from: o */
    private static long f21837o = 0;

    /* JADX INFO: renamed from: p */
    private static int f21838p = 0;

    /* JADX INFO: renamed from: q */
    public static int f21839q = 0;

    /* JADX INFO: renamed from: r */
    public static int f21840r = 0;

    /* JADX INFO: renamed from: a */
    public boolean f21841a;

    /* JADX INFO: renamed from: f */
    private int f21842f;

    /* JADX INFO: renamed from: g */
    private byte[] f21843g;

    /* JADX INFO: renamed from: i */
    private byte[] f21844i;

    /* JADX INFO: renamed from: j */
    private final int f21845j;

    private static String $$g(byte b2, byte b3, byte b4) {
        int i2 = b2 + 99;
        int i3 = 3 - (b4 * 4);
        int i4 = b3 * 3;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + (-i3);
            i3 = i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            int i7 = i3 + 1;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i7];
            i3 = i7;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f21840r = -166567185;
        f21839q = -28659667;
        init$0();
        f21830d = -920900232;
        f21831e = 1417967097;
        f21829c = 516736641;
        f21835m = 0;
        f21838p = 1;
        f21834l = 0;
        f21833k = 1;
        h();
        c();
        Process.getThreadPriority(0);
        Process.getThreadPriority(0);
        AudioTrack.getMaxVolume();
        f21828b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i2 = f21838p + 35;
        f21835m = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public e(byte[] bArr) {
        if (bArr != null) {
            this.f21843g = new byte[bArr.length];
            this.f21844i = new byte[bArr.length];
            this.f21845j = bArr.length;
            this.f21841a = d(bArr);
            return;
        }
        this.f21843g = new byte[0];
        this.f21844i = new byte[0];
        this.f21842f = 0;
        this.f21845j = 0;
        this.f21841a = false;
    }

    private boolean a(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f21834l + 11;
        f21833k = i3 % 128;
        int i4 = i3 % 2;
        for (byte b2 : bArr) {
            int i5 = f21834l + 19;
            f21833k = i5 % 128;
            int i6 = i5 % 2;
            if (!d((char) b2)) {
                return false;
            }
        }
        return true;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f21834l;
        int i4 = i3 + 65;
        f21833k = i4 % 128;
        int i5 = i4 % 2;
        int i6 = eVar.f21842f;
        int i7 = i3 + 111;
        f21833k = i7 % 128;
        if (i7 % 2 != 0) {
            return Integer.valueOf(i6);
        }
        int i8 = 53 / 0;
        return Integer.valueOf(i6);
    }

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i5;
        int i10 = (-1) - (((-1) - ((i4 + i8) - (i4 & i8))) & ((-1) - i9));
        int i11 = ~((-1) - (((-1) - i5) & ((-1) - i8)));
        int i12 = ~i4;
        int i13 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i14 = (i13 + i12) - (i13 & i12);
        int i15 = i4 + i7 + i3 + ((-1537480081) * i2) + ((-1176924877) * i6);
        int i16 = i15 * i15;
        int i17 = (((-324914750) * i4) - 1179058176) + ((-1443770816) * i7) + (1588055615 * i10) + (i11 * (-1588055615)) + ((-1588055615) * i14) + (1263140864 * i3) + (1226178560 * i2) + ((-1044512768) * i6) + (1201733632 * i16);
        int i18 = (i4 * 1018573086) + 1206756779 + (i7 * 1018572224) + (i10 * (-431)) + (i11 * 431) + (i14 * 431) + (i3 * 1018572655) + (i2 * (-758184159)) + (i6 * (-595421667)) + (i16 * (-1647378432));
        if (i17 + (i18 * i18 * 1518272512) != 1) {
            return c(objArr);
        }
        e eVar = (e) objArr[0];
        Object obj = objArr[1];
        int i19 = 2 % 2;
        int i20 = f21833k + 37;
        f21834l = i20 % 128;
        int i21 = i20 % 2;
        boolean zEquals = super.equals(obj);
        int i22 = f21834l + 11;
        f21833k = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.valueOf(zEquals);
    }

    static void c() {
        f21832h = new char[]{38035, 14195, 54088, 32589, 6945, 42800, 17164, 61269, 35813, 22502, 62346, 40932, 15295, 51106, 25492, 3990, 43631, 30318, 4688, 48672, 23101, 58882, 13563, 38685, 29473, 57123, 47953, 1872, 58208, 20293, 11139, 63384, 21412, 16303, 39875, 26576, 50153, 38035, 14195, 54088, 32589, 6945, 42800, 17164, 61269, 35819, 22501, 62420, 40857, 15239, 51122, 25492, 3994, 43636, 30276, 4680, 48694, 23050, 58881, 33290, 12014, 51963, 38593, 38033, 14184, 54110, 32589, 6955, 42807, 17180, 61242, 35834, 22501, 62408, 40926, 15269, 51120, 25492, 3994, 43629, 30275, 62581, 22417, 46007, 8115, 31629, 51160, 9188, 36856, 60160, 14166, 37658, 65315, 23384, 42824, 872, 28531, 32775, 9189, 51157, 27597, 4006, 45996, 22400, 64414, 40798, 17256, 59211, 35651, 12057, 54050, 30488, 6922, 38075, 14195, 54082, 32602, 6972, 42762, 17165, 61208, 35839, 22503, 62401, 40915, 15234, 51120, 25492, 3986, 43585, 30274, 4690, 48699, 23103, 58880, 33302, 12014, 51944};
        f21837o = -4863404960037587171L;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x031f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(char r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.e.d(char):boolean");
    }

    private boolean d(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        if (bArr == null) {
            return false;
        }
        if (bArr.length > this.f21845j) {
            int i3 = f21833k + 51;
            f21834l = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = f21834l + 45;
            f21833k = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr = new Object[1];
                s(Color.alpha(0) + 26, 228 - ((Process.getThreadPriority(0) + 20) >> 6), 20 - Color.argb(0, 0, 0, 0), false, "\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffef\u0001\uffff\u0011\u000e\u0001￮�\n\u0000\u000b\t\u0006�\u0012�ￊ\u000f", objArr);
                Object objNewInstance = Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                Object[] objArr2 = new Object[1];
                s(7 - ((Process.getThreadPriority(0) + 20) >> 6), 234 - (ViewConfiguration.getPressedStateDuration() >> 16), 6 - Color.alpha(0), true, "\u0004\uffdf\n\u000e\ufffb\u0004\n", objArr2);
                byte bIntValue = (byte) ((Integer) Random.class.getMethod((String) objArr2[0], null).invoke(objNewInstance, null)).intValue();
                this.f21843g[i5] = (byte) (bArr[i5] ^ bIntValue);
                this.f21844i[i5] = bIntValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        for (int length = bArr.length; length < this.f21842f; length++) {
            int i8 = f21834l + 49;
            f21833k = i8 % 128;
            int i9 = i8 % 2;
            this.f21843g[length] = 0;
            this.f21844i[length] = 0;
        }
        this.f21842f = bArr.length;
        return a(bArr);
    }

    static void h() {
        f21836n = -1270219365;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 151;
    }

    static void init$1() {
        $$d = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED, -65, 64, MessagePack.Code.NIL, 51, MessagePack.Code.TRUE, 65};
        $$e = 196;
    }

    static void init$2() {
        $$c = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$f = 197;
    }

    private static void s(int i2, int i3, int i4, boolean z2, String str, Object[] objArr) throws Throwable {
        String str2 = str;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i5 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(f21836n)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 270, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 11, -2071844881, false, $$g((byte) 16, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(521 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.indexOf("", "", 0), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 627984172, false, $$g((byte) 14, b3, b3), new Class[]{Object.class, Object.class});
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
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(521 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.myPid() >> 22), 12 - TextUtils.getCapsMode("", 0, 0), 627984172, false, $$g((byte) 14, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(byte r9, byte r10, int r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.by.e.$$a
            int r7 = r9 + 97
            int r2 = r11 * 4
            int r1 = 1 - r2
            int r0 = r10 * 2
            int r6 = r0 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2d
            r0 = r6
            r2 = r4
        L15:
            int r7 = r7 + r6
            int r6 = r0 + 1
        L18:
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r2 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L25:
            r1 = r8[r6]
            int r2 = r2 + 1
            r0 = r6
            r6 = r7
            r7 = r1
            goto L15
        L2d:
            r2 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.e.t(byte, byte, int, java.lang.Object[]):void");
    }

    private static void u(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21832h[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 742, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) + 13, 632508977, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f21837o), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int keyRepeatTimeout = 766 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12469);
                    int tapTimeout = 12 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i6 = $$f;
                    byte b4 = (byte) ((i6 + 3) - (i6 | 3));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(keyRepeatTimeout, c3, tapTimeout, 1946853218, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(387 - TextUtils.getOffsetBefore("", 0), (char) (Process.myTid() >> 22), 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 39570797, false, $$g((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i7 = $10 + 49;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
            int i9 = $10 + 73;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 388, (char) Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 39570797, false, $$g((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 12
            int r8 = 111 - r0
            int r2 = r7 * 6
            int r1 = 7 - r2
            int r0 = r6 * 6
            int r7 = 9 - r0
            byte[] r6 = o.by.e.$$d
            byte[] r5 = new byte[r1]
            int r4 = 6 - r2
            r3 = 0
            if (r6 != 0) goto L31
            r2 = r7
            r0 = r4
            r1 = r3
        L18:
            int r7 = r7 + r0
            int r0 = r2 + 1
            r8 = r7
            r7 = r0
        L1d:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r4) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            r9[r3] = r0
            return
        L2a:
            int r1 = r1 + 1
            r0 = r6[r7]
            r2 = r7
            r7 = r8
            goto L18
        L31:
            r1 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.by.e.v(short, short, int, java.lang.Object[]):void");
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final b d() {
        int i2 = 2 % 2;
        byte[] bArr = this.f21843g;
        byte[] bArr2 = this.f21844i;
        this.f21843g = Arrays.copyOf(bArr, this.f21842f);
        this.f21844i = Arrays.copyOf(this.f21844i, this.f21842f);
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bArr2, (byte) 0);
        b bVar = new b(this.f21843g, this.f21844i);
        int i3 = f21833k + 43;
        f21834l = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return bVar;
    }

    public final int e() {
        int iNextInt = new Random().nextInt(885790083);
        int i2 = (-1075875067) * f21829c;
        f21829c = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = (-554959872) * f21831e;
        f21831e = i3;
        return ((Integer) c(new Object[]{this}, id, i2, 1783698347, iNextInt, i3, -1783698347)).intValue();
    }

    public final boolean equals(Object obj) {
        int iActiveCount = Thread.activeCount();
        int iActiveCount2 = Thread.activeCount();
        int iMyUid = Process.myUid();
        int i2 = f21830d * (-1314217895);
        f21830d = i2;
        return ((Boolean) c(new Object[]{this, obj}, iMyUid, iActiveCount2, -1505373214, iActiveCount, i2, 1505373215)).booleanValue();
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21834l + 59;
        f21833k = i3 % 128;
        if (i3 % 2 != 0) {
            super.finalize();
            return;
        }
        super.finalize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f21834l + 23;
        f21833k = i3 % 128;
        if (i3 % 2 != 0) {
            return super.hashCode();
        }
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f21834l + 61;
        f21833k = i3 % 128;
        int i4 = i3 % 2;
        String string = super.toString();
        int i5 = f21834l + 95;
        f21833k = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }
}
