package o.g;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import o.g.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f26226a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f26227b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26228c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26229d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f26230e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26231g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26232h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26233i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$d(short r5, int r6, int r7) {
        /*
            int r0 = r7 * 3
            int r7 = 4 - r0
            int r2 = r5 * 4
            int r1 = 1 - r2
            int r0 = r6 * 6
            int r0 = 73 - r0
            byte[] r6 = o.g.g.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2c
            r0 = r3
            r1 = r7
            r2 = r4
        L18:
            int r0 = -r0
            int r7 = r7 + r0
            int r1 = r1 + 1
        L1c:
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r2 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r2 = r2 + 1
            r0 = r6[r1]
            goto L18
        L2c:
            r2 = r4
            r1 = r7
            r7 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.g.$$d(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26233i = 0;
        f26232h = 1;
        f26228c = 0;
        f26231g = 1;
        g();
        PointF.length(0.0f, 0.0f);
        int i2 = f26233i + 87;
        f26232h = i2 % 128;
        int i3 = i2 % 2;
    }

    public g(a.b bVar, Date date, d dVar) {
        super(bVar, date, dVar);
    }

    static void g() {
        f26230e = new char[]{2501, 2527, 2524};
        f26229d = 2040400143;
        f26227b = true;
        f26226a = true;
    }

    static void init$0() {
        $$a = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
        $$b = 192;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f26230e;
        long j2 = 0;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(593 - Color.blue(i4), (char) (TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 13182), 12 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), -1225586509, false, $$d(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    j2 = 0;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f26229d)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - View.combineMeasuredStates(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        int i6 = 1540807955;
        if (f26226a) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i9 = $10 + 33;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(Color.green(0) + 458, (char) (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") + 12, -1923924106, false, $$d(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i11 = 0;
        if (f26227b) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(i6);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 458, (char) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1923924106, false, $$d(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i12 = $10 + 27;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i6 = 1540807955;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i11;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $11 + 47;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[fVar.f19923e << fVar.f19922a] << i2] / iIntValue);
                i11 = fVar.f19922a >> 1;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i11 = fVar.f19922a + 1;
            }
        }
    }

    @Override // o.g.a
    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f26231g + 27;
        f26228c = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = m().a().d();
        int i5 = f26231g + 1;
        f26228c = i5 % 128;
        int i6 = i5 % 2;
        return bArrD;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int i2 = 2 % 2;
        int i3 = f26228c + 45;
        f26231g = i3 % 128;
        int i4 = i3 % 2;
        o.m.i iVar = o.m.i.f26493a;
        if (i4 != 0) {
            return iVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.g.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(b().toString());
        Object[] objArr = new Object[1];
        k((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u0081", objArr);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        k((Process.myTid() >> 22) + 127, null, null, "\u0083\u0082", objArr2);
        StringBuilder sbAppend3 = sbAppend2.append(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0081", objArr3);
        String string = sbAppend3.append(((String) objArr3[0]).intern()).toString();
        int i3 = f26231g + 61;
        f26228c = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    @Override // o.g.a
    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26231g + 93;
        f26228c = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = m().a().d();
        int i5 = f26228c + 77;
        f26231g = i5 % 128;
        int i6 = i5 % 2;
        return bArrD;
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f26231g + 85;
        f26228c = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = m().a().d();
        int i5 = f26231g + 53;
        f26228c = i5 % 128;
        int i6 = i5 % 2;
        return bArrD;
    }

    @Override // o.g.a
    public final String j() {
        int i2 = 2 % 2;
        int i3 = f26231g;
        int i4 = i3 + 81;
        f26228c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 103;
        f26228c = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }
}
