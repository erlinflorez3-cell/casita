package o.el;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.zip.CRC32;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import o.a.q;
import o.ea.f;
import o.ea.g;
import o.ej.b;
import o.ej.c;
import o.ej.d;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f24059a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24060b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f24061e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f24062f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24063h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24064j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24066d;

    /* JADX INFO: renamed from: o.el.e$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f24067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f24068c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f24069d = 0;

        static {
            int[] iArr = new int[c.values().length];
            f24067b = iArr;
            try {
                iArr[c.f23961d.ordinal()] = 1;
                int i2 = f24068c;
                int i3 = (-1) - (((-1) - i2) | ((-1) - 27));
                int i4 = (i2 | 27) & (~i3);
                int i5 = i3 << 1;
                int i6 = (i4 & i5) + ((i4 + i5) - (i4 & i5));
                f24069d = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24067b[c.f23962e.ordinal()] = 2;
                int i8 = f24069d;
                int i9 = (((-1) - (((-1) - i8) | ((-1) - 20))) + (i8 | 20)) - 1;
                f24068c = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24067b[c.f23959b.ordinal()] = 3;
                int i12 = f24068c + 75;
                f24069d = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24067b[c.f23958a.ordinal()] = 4;
                int i14 = f24068c;
                int i15 = (i14 + 35) - (35 | i14);
                int i16 = i14 ^ 35;
                int i17 = (i15 - (~(-(-((i16 + i15) - (i16 & i15)))))) - 1;
                f24069d = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r8 = r8 + 4
            int r0 = r7 * 2
            int r7 = 1 - r0
            int r6 = r9 + 71
            byte[] r5 = o.el.e.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L27
            r2 = r3
            r0 = r8
        L11:
            int r8 = r8 + r6
            r1 = r2
            r6 = r8
            r8 = r0
        L15:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r0 = r8 + 1
            r8 = r5[r0]
            goto L11
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.el.e.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24062f = 0;
        f24064j = 1;
        f24060b = 0;
        f24063h = 1;
        a();
        e();
        int i2 = f24064j + 63;
        f24062f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
    }

    public e(Context context, long j2) throws Throwable {
        String strValueOf;
        String strValueOf2;
        try {
            Object[] objArr = new Object[1];
            g("⩋텏\udc49\udb6d옳촙젞\uf72b\uf22c倫\ue4de\ue3f0\ueeec闌邠龥骲膫赝衙띟뉻뤅ꐜꌦ긻", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64271, objArr);
            String strValueOf3 = String.valueOf(((Random) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextLong());
            try {
                d dVarB = o.ej.e.b(context);
                int i2 = AnonymousClass3.f24067b[dVarB.e().ordinal()];
                if (i2 == 1) {
                    Object[] objArr2 = new Object[1];
                    i("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 10, 58, 0}, false, objArr2);
                    strValueOf3 = ((String) objArr2[0]).intern();
                } else if (i2 == 2) {
                    Object[] objArr3 = new Object[1];
                    i("\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{10, 10, 98, 0}, false, objArr3);
                    strValueOf3 = ((String) objArr3[0]).intern();
                } else if (i2 == 3) {
                    Object[] objArr4 = new Object[1];
                    i("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001", new int[]{20, 10, 73, 0}, true, objArr4);
                    strValueOf3 = ((String) objArr4[0]).intern();
                } else if (i2 == 4) {
                    Object[] objArr5 = new Object[1];
                    i("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{30, 9, 0, 0}, true, objArr5);
                    strValueOf3 = ((String) objArr5[0]).intern();
                }
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    i("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{39, 17, 0, 2}, true, objArr6);
                    String strIntern = ((String) objArr6[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    i("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{56, 46, 0, 0}, false, objArr7);
                    f.c(strIntern, sb.append(((String) objArr7[0]).intern()).append(strValueOf3).toString());
                }
                strValueOf = o.dl.d.e(o.dl.d.e(o.eh.e.d(strValueOf3), o.eh.e.d(String.valueOf(j2))));
                String strD = d(dVarB.a());
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    i("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{39, 17, 0, 2}, true, objArr8);
                    String strIntern2 = ((String) objArr8[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr9 = new Object[1];
                    i("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{102, 46, 50, 17}, true, objArr9);
                    f.c(strIntern2, sb2.append(((String) objArr9[0]).intern()).append(strD).toString());
                }
                strValueOf2 = o.dl.d.e(o.dl.d.e(o.eh.e.d(strD), o.eh.e.d(String.valueOf(j2 + 1000))));
                if (f.a() && !strValueOf3.equals(strD)) {
                    Object[] objArr10 = new Object[1];
                    i("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{39, 17, 0, 2}, true, objArr10);
                    String strIntern3 = ((String) objArr10[0]).intern();
                    Object[] objArr11 = new Object[1];
                    i("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{148, 44, 0, 7}, true, objArr11);
                    f.d(strIntern3, ((String) objArr11[0]).intern());
                }
            } catch (IOException | b e2) {
                if (f.a()) {
                    Object[] objArr12 = new Object[1];
                    i("\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{39, 17, 0, 2}, true, objArr12);
                    String strIntern4 = ((String) objArr12[0]).intern();
                    Object[] objArr13 = new Object[1];
                    i("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{192, 51, 35, 0}, false, objArr13);
                    f.e(strIntern4, ((String) objArr13[0]).intern(), e2);
                }
                try {
                    Object[] objArr14 = new Object[1];
                    g("⩋텏\udc49\udb6d옳촙젞\uf72b\uf22c倫\ue4de\ue3f0\ueeec闌邠龥骲膫赝衙띟뉻뤅ꐜꌦ긻", 64272 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr14);
                    strValueOf = String.valueOf(((Random) Class.forName((String) objArr14[0]).getDeclaredConstructor(null).newInstance(null)).nextLong());
                    try {
                        Object[] objArr15 = new Object[1];
                        g("⩋텏\udc49\udb6d옳촙젞\uf72b\uf22c倫\ue4de\ue3f0\ueeec闌邠龥骲膫赝衙띟뉻뤅ꐜꌦ긻", ExpandableListView.getPackedPositionType(0L) + 64271, objArr15);
                        strValueOf2 = String.valueOf(((Random) Class.forName((String) objArr15[0]).getDeclaredConstructor(null).newInstance(null)).nextLong());
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            this.f24065c = strValueOf;
            this.f24066d = strValueOf2;
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void a() {
        f24059a = 3853448482509367150L;
    }

    private static String d(File file) throws IOException {
        int i2 = 2 % 2;
        CRC32 crc32 = new CRC32();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[16384];
        while (true) {
            int i3 = fileInputStream.read(bArr);
            if (i3 <= 0) {
                break;
            }
            int i4 = f24063h + 43;
            f24060b = i4 % 128;
            crc32.update(bArr, i4 % 2 != 0 ? 1 : 0, i3);
        }
        String lowerCase = String.valueOf(crc32.getValue()).toLowerCase(g.d());
        int i5 = f24060b + 61;
        f24063h = i5 % 128;
        if (i5 % 2 != 0) {
            return lowerCase;
        }
        throw null;
    }

    static void e() {
        f24061e = new char[]{56501, 56555, 56556, 56556, 56555, 56556, 56557, 56557, 56556, 56558, 56522, 56341, 56339, 56339, 56340, 56343, 56344, 56344, 56343, 56343, 56511, 56575, CharCompanionObject.MIN_LOW_SURROGATE, CharCompanionObject.MIN_LOW_SURROGATE, 56322, 56322, 56322, 56574, 56574, 56573, 56474, 56498, 56498, 56500, 56499, 56501, 56501, 56501, 56503, 56497, 56539, 56546, 56560, 56561, 56555, 56548, 56556, 56556, 56532, 56539, 56555, 56554, 56558, 56551, 56538, 56544, 56489, 56539, 56552, 56544, 56538, 56551, 56558, 56554, 56555, 56539, 56532, 56556, 56556, 56548, 56555, 56561, 56560, 56521, 56486, 56486, 56518, 56554, 56549, 56546, 56513, 56513, 56553, 56560, 56562, 56555, 56548, 56555, 56522, 56516, 56548, 56554, 56557, 56516, 56523, 56555, 56550, 56560, 56557, 56514, 56493, 56493, 56530, 56354, 56355, 56349, 56342, 56350, 56350, 56326, 56333, 56349, 56348, 56352, 56345, 56332, 56338, 56346, 56333, 56555, 56543, 56543, 56564, 56351, 56354, 56344, 56349, 56573, 56566, 56351, 56348, 56342, 56566, 56572, 56355, 56347, 56349, 56356, 56357, 56350, 56563, 56563, 56340, 56343, 56348, 56568, 56536, 56536, 56504, 56558, 56551, 56538, 56544, 56552, 56539, 56541, 56549, 56555, 56554, 56551, 56518, 56522, 56561, 56558, 56519, 56519, 56553, 56514, 56521, 56556, 56550, 56557, 56554, 56548, 56516, 56513, 56546, 56549, 56554, 56518, 56486, 56486, 56521, 56560, 56561, 56555, 56548, 56556, 56556, 56532, 56539, 56555, 56507, 56574, 56331, 56323, 56573, 56330, 56337, 56333, 56334, 56574, 56567, 56335, 56335, 56327, 56334, 56340, 56339, 56556, 56521, 56521, 56550, 56326, 56328, 56333, 56331, 56327, 56549, 56557, 56340, 56554, 56548, 56328, 56329, 56327, 56330, 56552, 56553, 56333, 56328, 56548, 56548, 56548, 56551, 56334, 56340, 56335, 56329, 56335, 56336, 56337, 56345};
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i3 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(View.resolveSize(0, 0) + 731, (char) (7933 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getScrollBarSize() >> 8) + 11, 355847088, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f24059a ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 837, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27279), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2145994442, false, $$c(b4, b5, (byte) ((b5 + 7) - (7 | b5))), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(836 - TextUtils.getOffsetAfter("", 0), (char) ((Process.myTid() >> 22) + 27279), MotionEvent.axisFromString("") + 12, -2145994442, false, $$c(b6, b7, (byte) ((b7 + 7) - (7 | b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void i(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f24061e;
        if (cArr != null) {
            int i9 = $10 + 117;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(249 - (ViewConfiguration.getScrollBarSize() >> 8), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 11, 1376582792, false, $$c(b2, b3, (byte) (45 & b3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    i4 = 0;
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i12 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.getDefaultSize(0, 0), 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA3 = o.d.d.a(836 - KeyEvent.keyCodeFromString(""), (char) (View.MeasureSpec.getMode(0) + 27279), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), -1210801192, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 49)))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - View.MeasureSpec.getMode(0), (char) (TextUtils.indexOf("", "", 0) + 35715), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i14, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i14);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i15 = 0;
            while (true) {
                mVar.f19943d = i15;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i16 = $11 + 109;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] / iArr[2]);
                    i15 = mVar.f19943d / 0;
                } else {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i15 = mVar.f19943d + 1;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{94, -66, 120, 126};
        $$b = 195;
    }

    public final String b() {
        String str;
        int i2 = 2 % 2;
        int i3 = f24060b + 77;
        int i4 = i3 % 128;
        f24063h = i4;
        if (i3 % 2 == 0) {
            str = this.f24065c;
            int i5 = 57 / 0;
        } else {
            str = this.f24065c;
        }
        int i6 = i4 + 29;
        f24060b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f24060b;
        int i4 = i3 + 41;
        f24063h = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f24066d;
        int i5 = i3 + 59;
        f24063h = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
