package o.cl;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import o.a.o;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22433a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22434b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22435c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22436d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22437e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22438j = 0;

    /* JADX INFO: renamed from: o.cl.a$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f22439b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f22440c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f22441e = 0;

        static {
            int[] iArr = new int[d.values().length];
            f22440c = iArr;
            try {
                iArr[d.f22457d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22440c[d.f22455b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22440c[d.f22454a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22440c[d.f22456c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22440c[d.f22458e.ordinal()] = 5;
                int i2 = f22439b;
                int i3 = (i2 ^ 93) + (((i2 + 93) - (i2 | 93)) << 1);
                f22441e = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22440c[d.f22463j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22440c[d.f22461h.ordinal()] = 7;
                int i5 = f22441e + 55;
                f22439b = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22440c[d.f22460g.ordinal()] = 8;
                int i8 = f22441e + 47;
                f22439b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22440c[d.f22459f.ordinal()] = 9;
                int i10 = f22441e + 43;
                f22439b = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 2;
                }
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22440c[d.f22462i.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 * 2
            int r6 = 3 - r0
            int r5 = 105 - r8
            byte[] r4 = o.cl.a.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r7
            r1 = r2
        L13:
            int r0 = -r0
            int r5 = r5 + r0
        L15:
            int r6 = r6 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r4[r6]
            goto L13
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cl.a.$$c(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22433a = 0;
        f22438j = 1;
        f22436d = 0;
        f22435c = 1;
        a();
        ViewConfiguration.getFadingEdgeLength();
        SystemClock.currentThreadTimeMillis();
        TextUtils.lastIndexOf("", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.lastIndexOf("", '0');
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getScrollBarSize();
        Color.green(0);
        ViewConfiguration.getJumpTapTimeout();
        int i2 = f22433a + 69;
        f22438j = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    a() {
    }

    static void a() {
        f22434b = new char[]{38050, 8024, 33581, 14108, 48123, 12198, 54151, 17992, 51799, 32267, 58086, 38623, 6816, 36172, 12611, 42297, 10502, 56773, 16816, 62851, 34766, 3092, 36973, 9329, 43195, 15614, 49375, 21800, 55557, 27988, 61835, 34180, 2536, 40501, 8732, 46707, 14849, 52952, 21177, 59020, 27497, 65399, 33622, 6067, 39812, 12240, 46125, 14401, 52275, 20721, 38070, 8035, 33541, 14131, 48070, 12171, 54190, 17989, 51825, 32299, 58064, 38654, 38038, 8003, 33573, 14099, 48102, 12203, 54158, 18009, 51795, 32280, 58086, 38070, 8035, 33541, 14131, 48070, 12171, 54190, 17989, 51827, 32297, 58049, 38645, 6791, 36164, 12662, 11326, 42987, 15245, 36795, 846, 38659, 27430, 65267, 29433, 50849, 23109, 11879, 41492, 13782, 38075, 8007, 33586, 14101, 48097, 12217, 54155, 18040, 51806, 32271, 58018, 38606, 6845, 36138, 12614, 42303, 10502, 56783, 16816, 62871, 30843, 60452, 36871, 1210, 35013, 15490, 42855, 11086, 57146, 17391, 63440, 31738, 61339, 37470, 1637, 35337, 16050, 41643, 22210, 55646, 19803, 61709, 26091, 59854, 40371, 'f', 46082, 14361, 44051, 20696, 50342, 18650, 62333, 26424, 60226, 40926, 987, 46989, 14955, 44622, 21043, 50918, 19074, 65179, 25233, 5449, 39213, 3343, 45564, 9662, 38055, 8004, 33575, 14082, 48098, 12207, 54145, 18030, 51799, 32270, 58018, 38636, 6835, 36198, 12631, 42303, 10568, 56714};
        f22437e = 4823983460693057322L;
    }

    static c<? extends o.eq.b> b(d dVar, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22436d + 85;
        f22435c = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            f((char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f((char) (Color.rgb(0, 0, 0) + 16782171), 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(dVar).toString());
        }
        switch (AnonymousClass2.f22440c[dVar.ordinal()]) {
            case 1:
                return new o.cp.c();
            case 2:
                return new o.cn.a();
            case 3:
                return new o.ct.b();
            case 4:
                return new o.cq.b();
            case 5:
                return new o.cj.d();
            case 6:
                return new o.ch.a();
            case 7:
                return new o.cm.b();
            case 8:
                return new o.co.b();
            case 9:
                o.co.e eVar = new o.co.e();
                int i5 = f22436d + 63;
                f22435c = i5 % 128;
                if (i5 % 2 != 0) {
                    return eVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 10:
                Object[] objArr3 = new Object[1];
                f((char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 50, TextUtils.indexOf("", "", 0, 0) + 12, objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    Object[] objArr4 = new Object[1];
                    f((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 62, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, objArr4);
                    return new o.ck.c(((String) objArr4[0]).intern());
                }
                Object[] objArr5 = new Object[1];
                f((char) (ViewConfiguration.getPressedStateDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 73, Color.rgb(0, 0, 0) + 16777231, objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    Object[] objArr6 = new Object[1];
                    f((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47272), TextUtils.getOffsetBefore("", 0) + 88, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, objArr6);
                    return new o.ck.c(((String) objArr6[0]).intern());
                }
                Object[] objArr7 = new Object[1];
                f((char) TextUtils.getCapsMode("", 0, 0), 102 - Color.alpha(0), 70 - Gravity.getAbsoluteGravity(0, 0), objArr7);
                throw new RuntimeException(((String) objArr7[0]).intern());
            default:
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr8 = new Object[1];
                f((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 172 - KeyEvent.getDeadChar(0, 0), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
                throw new UnsupportedOperationException(sb2.append(((String) objArr8[0]).intern()).append(dVar.name()).toString());
        }
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f22434b[i2 - i6])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(741 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ImageFormat.getBitsPerPixel(0) + 13, 632508977, false, $$c(b2, (byte) (6 | b2), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f22437e), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 5);
                        objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 767, (char) (12469 - TextUtils.lastIndexOf("", '0')), Drawable.resolveOpacity(0, 0) + 12, 1946853218, false, $$c(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(388 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f22434b[i2 + i7])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(741 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 632508977, false, $$c(b7, (byte) ((b7 + 6) - (6 & b7)), b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f22437e), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    objA5 = o.d.d.a(766 - View.MeasureSpec.getMode(0), (char) (Color.rgb(0, 0, 0) + 16789686), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 1946853218, false, $$c(b8, b9, (byte) (b9 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 387, (char) TextUtils.indexOf("", "", 0, 0), (-16777198) - Color.rgb(0, 0, 0), 39570797, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i8 = $11 + 79;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 387, (char) (ViewConfiguration.getTapTimeout() >> 16), 18 - TextUtils.getOffsetBefore("", 0), 39570797, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i10 = $10 + 75;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void init$0() {
        $$a = new byte[]{64, -9, -71, 106};
        $$b = 51;
    }
}
