package o.bh;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.l;
import o.a.o;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
final class c extends o.ad.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f21183b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f21184e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21185f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f21186g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21187h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21188i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21189j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21190d;

    private static String $$j(short s2, byte b2, byte b3) {
        int i2 = s2 + 99;
        int i3 = b3 * 3;
        byte[] bArr = $$h;
        int i4 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += i4;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i4 + 1;
            i2 += bArr[i7];
            i4 = i7;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f21189j = 0;
        f21187h = 1;
        f21185f = 0;
        f21188i = 1;
        a();
        ViewConfiguration.getScrollDefaultDelay();
        int i2 = f21189j + 41;
        f21187h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    c(Context context, o.h.d dVar, boolean z2) {
        super(context, dVar);
        this.f21190d = z2;
    }

    static void a() {
        f21183b = new int[]{1419639703, -2053171190, 760772096, -222578043, -304282359, -1947825262, -1363227323, -482808516, -525595359, 358094665, 1676720380, 1135907525, -1918812654, 588552470, -897240121, 450340311, 1852741835, -468836458};
        f21184e = new char[]{38043, 9771, 61927, 33657, 24110, 59848, 47979, 30266, 470, 54113, 28213, 14813, 52094, 34361, 20945, 58218, 48640, 18909, 7031, 54809, 25043, 13170, 52747, 39376, 11042, 58949, 45462, 17277, 7711, 43460, 31606, 13825, 49628, 37740, 11791, 63919, 35707, 17940, 4519, 41851, 32268, 2536, 56164, 38425, 8635, 62309, 36375, 22966, 60279, 42524, 29158, 846, 56835, 27104, 15181, 63003, 33196, 21318, 60947, 47551, 19294, 1561, 53681, 25418, 15954, 51641, 39763, 22264, 57778, 45903, 20220, 6589, 43862, 26353, 38035, 9782, 61890, 33662, 24117, 59849, 47978, 30330, 451, 54136, 28198, 14738, 52043, 34355, 20938, 58221, 48676, 18897, 7026, 54805, 25070, 13160, 52764, 39377, 11107, 58892, 38033, 9773, 61908, 33662, 24127, 59854, 47994, 30229, 466, 54136, 28218, 14805, 52073, 34353, 20938, 58221, 48701, 18902, 38040, 9785, 61904, 33645, 24180, 59852, 47983, 30266, 453, 54054, 28165, 14789, 52089, 34340, 20955, 58217, 27442, 55701, 3690, 31947, 41351, 5728, 17619, 35204, 65091, 11456, 37260, 50813, 13536, 31126, 44659, 7368, 48985, 3561, 55845, 43195, 30188, 49674, 37033, 24056, 10772, 63651, 17911, 4639, 57532, 44539, 31251, 51368, 38338, 25119, 12469, 64987, 18961, 6320, 58825, 45586, 224, 52615, 39508, 26800, 13767, 33362, 20669, 7635, 59908, 47282, 1473, 53856, 41132, 28107, 14959, 34999, 21972, 8803, 61627, 48592, 2600, 55456, 42457, 29303, 49317, 36307, 23158, 10379, 62940, 38043, 9771, 61927, 33657, 24110, 59848, 47979, 30266, 470, 54113, 28213, 14813, 52094, 34361, 20945, 58218, 48640, 18909, 7031, 54809, 25043, 13170, 52747, 39376, 11042, 58949, 45462, 17277, 7684, 43408, 31615, 13841, 49606, 37744, 11779, 63906, 35694, 17929, 4525, 41845, 32278, 2465, 56185, 38418, 8682, 62323, 36369, 22954, 60262, 42525, 29118, 856, 56922, 27049, 15197, 63060, 33195, 21318, 60949, 47536, 19295, 1556, 53691, 25408, 15954, 51682, 39686, 22253, 57775, 45908, 20198, 6577, 43852, 26364, 12735, 50015, 40683, 10660, 64343, 46827, 16828, 4888, 44787, 31132, 2910, 50913, 37274, 9041, 65186, 35226, 23379, 5869, 41375, 29529, 3820, 55681, 27478};
        f21186g = 171962266992322136L;
    }

    static void init$0() {
        $$a = new byte[]{64, -9, -71, 106};
        $$b = 123;
    }

    static void init$1() {
        $$d = new byte[]{39, 4, 32, -80};
        $$e = 162;
    }

    static void init$2() {
        $$h = new byte[]{119, -86, Ascii.SYN, 102};
        $$i = 57;
    }

    private static void n(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21183b;
        long j2 = 0;
        int i5 = 989264422;
        int i6 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 23;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(675 - (ViewConfiguration.getScrollDefaultDelay() >> i6), (char) ExpandableListView.getPackedPositionGroup(j2), AndroidCharacter.getMirror('0') - '$', -328001469, false, $$j($$h[i3], b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "") + 675, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -328001469, false, $$j($$h[2], b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                }
                i7++;
                i3 = 2;
                j2 = 0;
                i5 = 989264422;
                i6 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f21183b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(675 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) TextUtils.indexOf("", "", 0), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -328001469, false, $$j($$h[2], b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i9++;
                int i10 = $11 + 31;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c2] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i12 = $11 + 29;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            for (int i14 = 0; i14 < 16; i14++) {
                lVar.f19942e ^= iArr4[i14];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(301 - TextUtils.indexOf("", "", 0, 0), (char) (52697 - TextUtils.indexOf("", "")), TextUtils.lastIndexOf("", '0', 0) + 12, -1416256172, false, $$j((byte) 20, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
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
                byte b6 = (byte) 0;
                objA5 = o.d.d.a(230 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (51004 - View.getDefaultSize(0, 0)), 9 - TextUtils.indexOf("", ""), -330018025, false, $$j((byte) 18, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21184e[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - View.MeasureSpec.getSize(0), (char) Color.red(0), (ViewConfiguration.getEdgeSlop() >> 16) + 12, 632508977, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21186g), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int iCombineMeasuredStates = 766 - View.combineMeasuredStates(0, 0);
                    char scrollBarFadeDuration = (char) (12470 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 12;
                    int i8 = $$i;
                    byte b4 = (byte) ((i8 + 7) - (i8 | 7));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(iCombineMeasuredStates, scrollBarFadeDuration, deadChar, 1946853218, false, $$j(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(TextUtils.indexOf("", "", 0) + 387, (char) Drawable.resolveOpacity(0, 0), 18 - (Process.myTid() >> 22), 39570797, false, $$j((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
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
        int i9 = $11 + 51;
        $10 = i9 % 128;
        while (true) {
            int i10 = i9 % 2;
            if (oVar.f19947b >= i3) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 388, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) + 18, 39570797, false, $$j((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i9 = $10 + 71;
            $11 = i9 % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(byte r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r0 = r0 + 98
            int r1 = r10 * 2
            int r8 = r1 + 1
            byte[] r7 = o.bh.c.$$a
            int r1 = r9 * 2
            int r6 = 4 - r1
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2f
            r1 = r6
            r3 = r8
            r2 = r4
        L16:
            int r6 = r6 + r3
            int r1 = r1 + 1
            r0 = r6
            r6 = r1
        L1b:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r8) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L2a:
            r3 = r7[r6]
            r1 = r6
            r6 = r0
            goto L16
        L2f:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.c.q(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(int r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.bh.c.$$d
            int r0 = r9 * 2
            int r7 = r0 + 98
            int r0 = r11 * 2
            int r6 = r0 + 1
            int r0 = r10 * 2
            int r0 = r0 + 4
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2f
            r2 = r0
            r7 = r6
            r3 = r4
        L16:
            int r1 = -r0
            int r0 = r2 + 1
            int r7 = r7 + r1
            r2 = r3
        L1b:
            byte r1 = (byte) r7
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r6) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L2a:
            r1 = r8[r0]
            r2 = r0
            r0 = r1
            goto L16
        L2f:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.c.r(int, int, short, java.lang.Object[]):void");
    }

    @Override // o.ad.e
    public final boolean b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21188i + 5;
        f21185f = i3 % 128;
        if (i3 % 2 != 0) {
            super.b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((!super.b()) || this.f20162c.equals(o.f.a.f25705e)) {
            return false;
        }
        int i4 = f21188i + 39;
        f21185f = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // o.ad.e
    public final boolean b(o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        if (b()) {
            if (this.f21190d) {
                int i3 = f21188i + 17;
                f21185f = i3 % 128;
                int i4 = i3 % 2;
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    n(new int[]{-1298255914, -113734495, -1827922493, -1807940787, -772565766, -1375232529, -1793357114, 680449750, 437076077, -695945184, 1238563237, 1280575979, 126325720, 1641195390, -2058839253, -511278045, -1501328347, 1150860773, -703800200, 1679084451}, TextUtils.lastIndexOf("", '0', 0) + 39, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    n(new int[]{932145259, 1118774985, -2048458420, 935710742, -1176793441, 1041326382, -1242487241, -2089181004, 1081842150, -1334148841, 861290422, -873727958, 1769539341, 1498577254, -1341121425, 1455220168, -781711, -2069655088, 1238563237, 1280575979, 126325720, 1641195390, 738309718, 1114660879, 16387954, 349974773, 1324101064, 2050230984, 970809080, 34289539, -18406763, 681376653, 654284521, -873225947, 1946664285, -1958656801, -195345590, -926523178, -963232628, 608161492, -647460299, 1695711329, 1004069778, -909492777}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 87, objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                return true;
            }
            if (dVar != null) {
                int i5 = f21185f + 29;
                f21188i = i5 % 128;
                if (i5 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    n(new int[]{-1298255914, -113734495, -1827922493, -1807940787, -772565766, -1375232529, -1793357114, 680449750, 437076077, -695945184, 1238563237, 1280575979, 126325720, 1641195390, -2058839253, -511278045, -1501328347, 1150860773, -703800200, 1679084451}, TextUtils.lastIndexOf("", '0', 0) + 39, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    p((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 203 - ExpandableListView.getPackedPositionGroup(0L), 98 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                    f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05c9  */
    @Override // o.ad.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.c.d():boolean");
    }
}
