package o.bi;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.q;
import o.ab.e;
import o.ab.j;
import o.by.g;
import o.cg.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21218f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f21219j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21220k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f21221l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f21222m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21223n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21224o = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f21225t = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f21226g;

    static final class c extends j<a> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f21227b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f21228c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f21229d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f21230f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f21231g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f21232h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static long f21233i = 0;

        private static String $$d(byte b2, byte b3, short s2) {
            byte[] bArr = $$a;
            int i2 = 78 - (b2 * 7);
            int i3 = s2 * 4;
            int i4 = (b3 * 3) + 4;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 = i4 + (-i3);
                i4++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                int i6 = bArr[i4];
                i2 += -i6;
                i4++;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21231g = -92627766;
            f21227b = -246940915;
            f21228c = -974754159;
            f21229d = 2033054583;
            f21230f = 0;
            f21232h = 1;
            f21233i = 430834793987044813L;
        }

        c(a aVar) {
            super(aVar, true);
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f21230f + 69;
            int i4 = i3 % 128;
            f21232h = i4;
            if (i3 % 2 == 0) {
                int i5 = 52 / 0;
            }
            int i6 = i4 + 91;
            f21230f = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i5;
            int i9 = ~((-1) - (((-1) - i8) & ((-1) - i4)));
            int i10 = (-1) - (((-1) - (~(i8 | i3))) & ((-1) - i9));
            int i11 = ~i4;
            int i12 = ~(i11 | i5);
            int i13 = (-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - i12)))) & ((-1) - (~(i11 | i3))));
            int i14 = (-1) - (((-1) - ((~((-1) - (((-1) - (~i3)) & ((-1) - i11)))) | i9)) & ((-1) - i12));
            int i15 = i5 + i4 + i6 + ((-369695973) * i2) + (1794320298 * i7);
            int i16 = i15 * i15;
            int i17 = ((-1820121865) * i5) + 1478230016 + (776760710 * i4) + ((-1698084721) * i10) + ((-1731255050) * i13) + (865627525 * i14) + ((-88866816) * i6) + (217841664 * i2) + ((-410517504) * i7) + ((-175177728) * i16);
            int i18 = ((i5 * 1872133577) - 2052485254) + (i4 * 1872135674) + (i10 * 2097) + (i13 * (-1398)) + (i14 * IptcDirectory.TAG_UNIQUE_DOCUMENT_ID) + (i6 * 1872134975) + (i2 * (-1328892763)) + (i7 * (-1296121642)) + (i16 * (-1691287552));
            return i17 + ((i18 * i18) * (-1729036288)) != 1 ? c(objArr) : e(objArr);
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f21230f + 25;
            f21232h = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            int i4 = 19 / 0;
            return null;
        }

        static void init$0() {
            $$a = new byte[]{103, 35, 47, 90};
            $$b = 39;
        }

        private static void v(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 19;
            int i5 = i4 % 128;
            $11 = i5;
            int i6 = i4 % 2;
            if (str2 != null) {
                int i7 = i5 + 47;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i9 = $10 + 35;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = qVar.f19948a;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            int minimumFlingVelocity = 731 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 7933);
                            int windowTouchSlop = 11 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 1)));
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a(minimumFlingVelocity, cNormalizeMetaState, windowTouchSlop, 355847088, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() + (f21233i * 4743694005979712847L);
                        Object[] objArr3 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(836 - Color.green(0), (char) (27279 - KeyEvent.keyCodeFromString("")), TextUtils.indexOf((CharSequence) "", '0') + 12, -2145994442, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i11 = qVar.f19948a;
                    Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA3 = o.d.d.a(-1011865131);
                    if (objA3 == null) {
                        int i12 = 732 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7933);
                        int i13 = 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i14 = $$b;
                        byte b6 = (byte) ((i14 + 1) - (i14 | 1));
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(i12, c2, i13, 355847088, false, $$d(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i11] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f21233i ^ 4743694005979712847L);
                    Object[] objArr5 = {qVar, qVar};
                    Object objA4 = o.d.d.a(1452497747);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(836 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (27278 - TextUtils.lastIndexOf("", '0', 0, 0)), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2145994442, false, $$d(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = o.d.d.a(1452497747);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(836 - KeyEvent.getDeadChar(0, 0), (char) (27279 - (ViewConfiguration.getTapTimeout() >> 16)), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2145994442, false, $$d(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        @Override // o.ab.j
        public final f a(Context context) {
            int i2 = 2 % 2;
            o.bi.c cVar = new o.bi.c(context);
            int i3 = f21232h + 13;
            f21230f = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f21230f + 91;
            f21232h = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21230f + 85;
            f21232h = i3 % 128;
            if (i3 % 2 != 0) {
                ((a) e()).g().c();
            } else {
                ((a) e()).g().c();
                int i4 = 33 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f21232h + 75;
            f21230f = i3 % 128;
            int i4 = i3 % 2;
            ((a) e()).g().c();
            int i5 = f21230f + 67;
            f21232h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int iMyTid = Process.myTid();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = f21229d * 660303327;
            f21229d = i2;
            return (o.cg.j) d(i2, iMyTid, 1295365189, -1295365189, new Object[]{this}, iFreeMemory, (int) Thread.currentThread().getId());
        }

        @Override // o.ab.j
        public final boolean l() {
            int i2 = 2 % 2;
            int i3 = f21232h;
            int i4 = i3 + 25;
            f21230f = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 73;
            f21230f = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v("\uf8f0㈾浑顺펉໑", 51929 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((a) e()).f21226g);
            int i3 = f21232h + 41;
            f21230f = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21232h + 29;
            f21230f = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("\uf8e6\uf064\ue9e8\ue16e\udafa퉨쯇썶볶둵극ꕗ", 2179 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f21230f + 121;
            f21232h = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 994657402 * f21228c;
            f21228c = i2;
            int i3 = f21227b * 29686894;
            f21227b = i3;
            int iMyPid = Process.myPid();
            int i4 = f21231g * 193400577;
            f21231g = i4;
            return (byte[][]) d(iMyPid, i2, 1249878037, -1249878036, new Object[]{this}, i3, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() {
            int i2 = 2 % 2;
            int i3 = f21232h + 43;
            f21230f = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = {(a) e()};
                int i4 = e.f20096d * 516688844;
                e.f20096d = i4;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i5 = e.f20095c * 899848972;
                e.f20095c = i5;
                int i6 = e.f20094b * 1346498534;
                e.f20094b = i6;
                o.c.a.h((Context) e.e(i4, objArr, i5, elapsedCpuTime, i6, -353890328, 353890328));
                Object[] objArr2 = {i()};
                int i7 = g.f21850a * (-1858193773);
                g.f21850a = i7;
                int i8 = g.f21853d * 1414328504;
                g.f21853d = i8;
                int i9 = g.f21852c * (-2003308375);
                g.f21852c = i9;
                int i10 = g.f21854e * 1746513136;
                g.f21854e = i10;
                g.e(objArr2, i8, i9, i10, i7, -192268551, 192268551);
                return;
            }
            Object[] objArr3 = {(a) e()};
            int i11 = e.f20096d * 516688844;
            e.f20096d = i11;
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i12 = e.f20095c * 899848972;
            e.f20095c = i12;
            int i13 = e.f20094b * 1346498534;
            e.f20094b = i13;
            o.c.a.h((Context) e.e(i11, objArr3, i12, elapsedCpuTime2, i13, -353890328, 353890328));
            Object[] objArr4 = {i()};
            int i14 = g.f21850a * (-1858193773);
            g.f21850a = i14;
            int i15 = g.f21853d * 1414328504;
            g.f21853d = i15;
            int i16 = g.f21852c * (-2003308375);
            g.f21852c = i16;
            int i17 = g.f21854e * 1746513136;
            g.f21854e = i17;
            g.e(objArr4, i15, i16, i17, i14, -192268551, 192268551);
            int i18 = 5 / 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() {
            int i2 = 2 % 2;
            int i3 = f21230f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21232h = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {(a) e()};
            int i5 = 516688844 * e.f20096d;
            e.f20096d = i5;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i6 = 899848972 * e.f20095c;
            e.f20095c = i6;
            int i7 = 1346498534 * e.f20094b;
            e.f20094b = i7;
            o.c.a.h((Context) e.e(i5, objArr, i6, elapsedCpuTime, i7, -353890328, 353890328));
            Object[] objArr2 = {i()};
            int i8 = g.f21850a * (-1858193773);
            g.f21850a = i8;
            int i9 = 1414328504 * g.f21853d;
            g.f21853d = i9;
            int i10 = (-2003308375) * g.f21852c;
            g.f21852c = i10;
            int i11 = 1746513136 * g.f21854e;
            g.f21854e = i11;
            g.e(objArr2, i9, i10, i11, i8, -192268551, 192268551);
            int i12 = f21230f + 29;
            f21232h = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 95 / 0;
            }
        }

        @Override // o.ab.j
        public final boolean y() {
            int i2 = 2 % 2;
            int i3 = f21232h + 117;
            int i4 = i3 % 128;
            f21230f = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 101;
            f21232h = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }
    }

    public interface d {
        void c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r9, byte r10, short r11) {
        /*
            int r0 = r11 * 6
            int r8 = r0 + 67
            byte[] r7 = o.bi.a.$$d
            int r6 = r10 * 3
            int r0 = r6 + 1
            int r5 = r9 + 4
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L2b
            r2 = r5
            r0 = r6
            r1 = r3
        L14:
            int r0 = -r0
            int r5 = r5 + r0
            r8 = r5
            r5 = r2
        L18:
            int r2 = r5 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r1 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r7[r2]
            r5 = r8
            goto L14
        L2b:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi.a.$$j(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21220k = 0;
        f21225t = 1;
        f21223n = 0;
        f21224o = 1;
        l();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.elapsedRealtimeNanos();
        int i2 = f21220k + 11;
        f21225t = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public a(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21110h);
    }

    static void init$0() {
        $$d = new byte[]{85, Ascii.RS, 127, 42};
        $$e = 45;
    }

    static void l() {
        f21219j = new char[]{2098, 2067, 2074, 2050, 2081, 2071, 2101, 2073, 2075, 2072, 2066};
        f21218f = 2040399990;
        f21221l = true;
        f21222m = true;
    }

    private c o() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f21223n + 73;
        f21224o = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    private static void q(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f21219j;
        int i5 = -1;
        float f2 = 0.0f;
        if (cArr3 != null) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 11;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            int longPressTimeout = 593 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            char longPressTimeout2 = (char) (13181 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int i9 = 11 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1));
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(longPressTimeout, longPressTimeout2, i9, -1225586509, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i7 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(593 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (13181 - ExpandableListView.getPackedPositionType(0L)), 10 - MotionEvent.axisFromString(""), -1225586509, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i3 = 2;
                i5 = -1;
                f2 = 0.0f;
            }
            cArr3 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(f21218f)};
        Object objA3 = o.d.d.a(-1503702982);
        if (objA3 == null) {
            objA3 = o.d.d.a(32 - TextUtils.indexOf("", ""), (char) View.resolveSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f21222m) {
            int i10 = $10 + 61;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 458, (char) (Process.myTid() >> 22), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1923924106, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i12 = 0;
        if (f21221l) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objA5 = o.d.d.a(View.MeasureSpec.getMode(0) + 458, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1923924106, false, $$j(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            String str5 = new String(cArr5);
            int i13 = $11 + 81;
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                objArr[0] = str5;
                return;
            } else {
                int i14 = 35 / 0;
                objArr[0] = str5;
                return;
            }
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i12;
            if (fVar.f19922a >= fVar.f19923e) {
                String str6 = new String(cArr6);
                int i15 = $10 + 121;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                objArr[0] = str6;
                return;
            }
            cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            i12 = fVar.f19922a + 1;
        }
    }

    public final void a(o.bi.d dVar) {
        int i2 = 2 % 2;
        int i3 = f21223n + 89;
        f21224o = i3 % 128;
        if (i3 % 2 != 0) {
            this.f21226g = dVar.a();
            a();
        } else {
            this.f21226g = dVar.a();
            a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f21223n + 83;
        f21224o = i3 % 128;
        int i4 = i3 % 2;
        c cVarO = o();
        int i5 = f21224o + 117;
        f21223n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return cVarO;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21223n + 21;
        f21224o = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            q(46 << TextUtils.getOffsetAfter("", 1), null, null, "\u008b\u008a\u0086\u0089\u0089\u0088\u0087\u0084\u0082\u0083\u0083\u0086\u0085\u0082\u0084\u0082\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q(127 - TextUtils.getOffsetAfter("", 0), null, null, "\u008b\u008a\u0086\u0089\u0089\u0088\u0087\u0084\u0082\u0083\u0083\u0086\u0085\u0082\u0084\u0082\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
