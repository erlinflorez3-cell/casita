package o.fc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.text.Typography;
import o.a.g;
import o.a.o;
import o.cw.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends o.eu.d<o.fk.d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f25780f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25781g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25782j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char[] f25783k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static long f25784l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f25785m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char f25786n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f25787o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f25788p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f25789q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f25790s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f25791t = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25792h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r7, int r8, short r9) {
        /*
            int r7 = 105 - r7
            byte[] r6 = o.fc.d.$$d
            int r0 = r9 * 3
            int r5 = r0 + 1
            int r0 = r8 * 4
            int r0 = 3 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r6 != 0) goto L29
            r1 = r0
            r7 = r5
            r2 = r3
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
        L17:
            byte r1 = (byte) r7
            r4[r2] = r1
            int r2 = r2 + 1
            int r1 = r0 + 1
            if (r2 != r5) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r6[r1]
            goto L14
        L29:
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fc.d.$$j(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25781g = -250991707;
        f25782j = -971713890;
        f25790s = 0;
        f25789q = 1;
        f25791t = 0;
        f25788p = 1;
        t();
        ImageFormat.getBitsPerPixel(0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.getOffsetBefore("", 0);
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.getCapsMode("", 0, 0);
        View.getDefaultSize(0, 0);
        Color.rgb(0, 0, 0);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getKeyRepeatDelay();
        int i2 = f25790s + 107;
        f25789q = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    public d(String str, String str2, boolean z2) {
        super(str, str2, z2);
        this.f25792h = 1;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i2 = 2 % 2;
        e eVar = new e();
        int i3 = f25791t + 97;
        f25788p = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (-1) - (((-1) - i8) & ((-1) - i5));
        int i11 = (~((-1) - (((-1) - i8) & ((-1) - i9)))) | (~i10);
        int i12 = ~((i9 + i5) - (i9 & i5));
        int i13 = (i11 + i12) - (i11 & i12);
        int i14 = ~(i8 | i2);
        int i15 = ~(i2 | i5);
        int i16 = (i15 + i14) - (i15 & i14);
        int i17 = (i10 + i9) - (i10 & i9);
        int i18 = i5 + i4 + i3 + (988256597 * i7) + ((-695401848) * i6);
        int i19 = i18 * i18;
        int i20 = (((-880163897) * i5) - 1270611968) + ((-1462879173) * i4) + (i13 * 291357638) + (291357638 * i16) + ((-291357638) * i17) + ((-1171521536) * i3) + (479985664 * i7) + (1063256064 * i6) + (1273561088 * i19);
        int i21 = (i5 * (-1367684995)) + 376186498 + (i4 * (-1367684423)) + (i13 * (-286)) + (i16 * (-286)) + (i17 * 286) + (i3 * (-1367684709)) + (i7 * 1512018807) + (i6 * 1127043160) + (i19 * (-418185216));
        return i20 + ((i21 * i21) * 1903099904) != 1 ? c(objArr) : b(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25791t + 55;
        f25788p = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f A[PHI: r4
  0x002f: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:60:0x02c3, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(android.content.Context r22, o.fk.d r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fc.d.d(android.content.Context, o.fk.d):boolean");
    }

    static void init$0() {
        $$d = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
        $$e = 94;
    }

    private static a p() {
        int i2 = 2 % 2;
        a aVar = new a();
        int i3 = f25791t + 11;
        f25788p = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    static void t() {
        f25780f = (char) 27774;
        f25787o = (char) 10212;
        f25786n = (char) 51391;
        f25785m = (char) 16472;
        f25783k = new char[]{28168, 34750, 48491, 54072, 51448, 65176, 5236, 2606, 9141, 23014, 20265, 25898, 39648, 45237, 42560, 56375, 62965, 60338, 349, 14175, 11399, 17107, 30740, 28164, 34709, 48582, 54025, 51535, 65228, 5261, 2561, 8198, 22985, 20329, 25916, 39678, 45241, 42602, 56433, 62972, 60347, 356, 14142, 11489, 17133, 30824, 28196, 34814, 48613, 54099, 51480, 65228, 5341, 2641, Typography.mdash, 22994, 20379, 25867, 39707, 45258, 42638, 56390, 61960, 60369, 384, 14143, 38033, 32045, 18428, 10668, 12890, 1078, 61161, 61606, 55659, 41776, 46587, 40849, 24702, 30185, 40026, 38039, 32052, 18430, 10657, 12920, 1085, 61122, 61601, 55670, 41785, 42728, 20308, 30097, 7158, 3, 13912, 56454, 49865, 60160, 37209, 34689, 44508, 21051, 30813, 28297, 5327, 15647, 9063, 51623, 39530, 29654, 18703, 10062, 15510, 2815, 57370, 65097, 55198, 44481, 47877, 37136, 28383, 17564, 21009, 10317, 398, 8180, 62771, 50036, 55522, 46774, 35950, 27040, 32771, 47830, 54446, 53085, 63744, 5073, 3483, 9287, 38022, 32035, 18405, 10669, 12900, 1037, 61160, 61606, 55661, 38037, 32041, 18426, 10630, 12911, 1084, 61170, 61587, 55659, 41778, 46585, 40884, 24703, 18945, 23781, 9909, 3929, 4361, 64471, 52668, 54853, 47153, 33493, 38021, 32100, 18195, 10700, 13224, 1115, 60941, 61659, 55957, 41820, 46584, 40942, 24613, 19050, 23781, 9910, 3952, 4398, 64501, 52669, 54905, 47150, 33533, 38073, 32126, 18290, 10646, 13262, 59663, 249, 14898, 21606, 20471, 31224, 37685, 36157, 42170, 57081, 51251, 57964, 7605, 14316, 8495, 23341, 29348, 27860, 34314, 45077, 43908, 50652, 65295};
        f25784l = 9100021698651389260L;
    }

    private static e u() {
        int iNextInt = new Random().nextInt(2031313740);
        int id = (int) Thread.currentThread().getId();
        int i2 = f25781g * 982868164;
        f25781g = i2;
        return (e) c(iNextInt, id, -1348183227, 1348183228, new Object[0], (int) Thread.currentThread().getId(), i2);
    }

    private static void v(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 37;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 != 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[i6] = cArr[gVar.f19924d];
            } else {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i9 = i6;
            while (i9 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f25786n) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f25785m)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(270 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1995022631, false, $$j((byte) 36, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f25780f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f25787o)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(View.resolveSize(0, 0) + 270, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), View.MeasureSpec.getSize(0) + 11, -1995022631, false, $$j((byte) 36, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                objA3 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 270, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - TextUtils.indexOf("", "", 0, 0), -2074123590, false, $$j((byte) 33, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void w(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 91;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f25783k[i2 >> i6])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(743 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 632508977, false, $$j((byte) ($$e & 7), b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f25784l), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 5;
                        byte b4 = (byte) (b3 - 5);
                        objA2 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 766, (char) (12470 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 12 - ExpandableListView.getPackedPositionGroup(0L), 1946853218, false, $$j(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(387 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, 39570797, false, $$j(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f25783k[i2 + i7])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    int i8 = 743 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12;
                    int i10 = $$e;
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(i8, scrollBarFadeDuration, i9, 632508977, false, $$j((byte) ((i10 + 7) - (i10 | 7)), b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f25784l), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b8 = (byte) 5;
                    byte b9 = (byte) (b8 - 5);
                    objA5 = o.d.d.a(766 - View.MeasureSpec.getSize(0), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12470), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1946853218, false, $$j(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a(387 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.getDefaultSize(0, 0), 18 - (Process.myPid() >> 22), 39570797, false, $$j(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 387, (char) Color.blue(0), 18 - Gravity.getAbsoluteGravity(0, 0), 39570797, false, $$j(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
            int i11 = $11 + 109;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private o.ef.a x() throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        if (g() != null) {
            int i3 = f25791t + 33;
            f25788p = i3 % 128;
            int i4 = i3 % 2;
            if (g().get(0) != null) {
                aVar = g().get(0).m();
            }
        }
        o.ef.a aVar2 = new o.ef.a();
        Object[] objArr = new Object[1];
        w((char) (Drawable.resolveOpacity(0, 0) + 64822), 134 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        aVar2.a(((String) objArr[0]).intern(), aVar);
        o.ef.a aVar3 = new o.ef.a();
        Object[] objArr2 = new Object[1];
        v("窕Ꙩ禒⭌\ue01d\udfb9䲝崦", 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
        aVar3.a(((String) objArr2[0]).intern(), aVar2);
        o.ef.a aVar4 = new o.ef.a();
        Object[] objArr3 = new Object[1];
        w((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 141, View.MeasureSpec.getMode(0) + 9, objArr3);
        aVar4.a(((String) objArr3[0]).intern(), aVar3);
        int i5 = f25788p + 111;
        f25791t = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void a(int i2) {
        int i3 = 2 % 2;
        int i4 = f25791t + 109;
        f25788p = i4 % 128;
        if (i4 % 2 != 0) {
            this.f25792h = i2;
            return;
        }
        this.f25792h = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eu.d
    public final /* synthetic */ boolean a(Context context, o.ff.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25788p + 21;
        f25791t = i3 % 128;
        o.fk.d dVar = (o.fk.d) aVar;
        if (i3 % 2 == 0) {
            return d(context, dVar);
        }
        d(context, dVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    @Override // o.eu.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.a b(o.ek.e r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fc.d.b(o.ek.e):o.ef.a");
    }

    @Override // o.eu.d
    public final void b() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f25782j * 149989788;
        f25782j = i2;
        c(iUptimeMillis, i2, -320297295, 320297295, new Object[]{this}, (int) Process.getElapsedCpuTime(), (int) SystemClock.elapsedRealtime());
    }

    @Override // o.eu.d
    public final void b(o.dk.a aVar) {
        int i2 = 2 % 2;
        int i3 = f25791t + 99;
        f25788p = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.eu.a d() {
        int i2 = 2 % 2;
        int i3 = f25791t + 25;
        f25788p = i3 % 128;
        if (i3 % 2 == 0) {
            p();
            throw null;
        }
        a aVarP = p();
        int i4 = f25791t + 81;
        f25788p = i4 % 128;
        int i5 = i4 % 2;
        return aVarP;
    }

    @Override // o.eu.d
    public final /* synthetic */ o.cr.d e() {
        int i2 = 2 % 2;
        int i3 = f25791t + 103;
        f25788p = i3 % 128;
        Object obj = null;
        Object[] objArr = new Object[0];
        if (i3 % 2 == 0) {
            int iNextInt = new Random().nextInt(2031313740);
            int id = (int) Thread.currentThread().getId();
            int i4 = f25781g * 982868164;
            f25781g = i4;
            obj.hashCode();
            throw null;
        }
        int iNextInt2 = new Random().nextInt(2031313740);
        int id2 = (int) Thread.currentThread().getId();
        int i5 = f25781g * 982868164;
        f25781g = i5;
        e eVar = (e) c(iNextInt2, id2, -1348183227, 1348183228, objArr, (int) Thread.currentThread().getId(), i5);
        int i6 = f25791t + 23;
        f25788p = i6 % 128;
        if (i6 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // o.eu.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ff.e m() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fc.d.m():o.ff.e");
    }

    public final int s() {
        int i2 = 2 % 2;
        int i3 = f25791t;
        int i4 = i3 + 115;
        f25788p = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f25792h;
        int i7 = i3 + 1;
        f25788p = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
