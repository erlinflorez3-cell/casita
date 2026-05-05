package o.bt;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.l;
import o.d.d;
import o.ea.c;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21648a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f21649b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f21650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21651d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21652h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21653j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f21654e = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, short r10) {
        /*
            int r7 = r10 * 3
            int r1 = r7 + 1
            int r0 = r9 * 3
            int r6 = 4 - r0
            byte[] r5 = o.bt.e.$$a
            int r0 = r8 * 2
            int r0 = r0 + 117
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L29
            r2 = r6
            r1 = r3
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r2 = r2 + 1
        L19:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L15
        L29:
            r1 = r3
            r2 = r6
            r6 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bt.e.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21652h = 0;
        f21653j = 1;
        f21651d = 0;
        f21648a = 1;
        b();
        ViewConfiguration.getWindowTouchSlop();
        Process.getGidForName("");
        f21650c = new e();
        int i2 = f21652h + 29;
        f21653j = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private e() {
    }

    public static String a() {
        int i2 = 2 % 2;
        int i3 = f21651d + 113;
        f21648a = i3 % 128;
        int i4 = i3 % 2;
        c.a();
        String strB = o.ea.b.b();
        int i5 = f21648a + 23;
        f21651d = i5 % 128;
        int i6 = i5 % 2;
        return strB;
    }

    public static boolean a(Context context) {
        int i2 = 2 % 2;
        int i3 = f21651d + 73;
        f21648a = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        c.a();
        if (i4 == 0) {
            o.ea.b.c(context);
            obj.hashCode();
            throw null;
        }
        boolean zC = o.ea.b.c(context);
        int i5 = f21648a + 11;
        f21651d = i5 % 128;
        if (i5 % 2 == 0) {
            return zC;
        }
        obj.hashCode();
        throw null;
    }

    static void b() {
        f21649b = new int[]{1270596815, -1404524456, -217561248, -1711305677, -1154627404, 449624803, 1297731420, 1296145910, 1013934138, -2030739812, 1892352001, -2014376417, 1336052042, 1087158887, -933799926, 817029090, 843416576, 368790649};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        r1 = o.bt.e.f21648a + 91;
        o.bt.e.f21651d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        o.ea.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return o.ea.b.i(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (o.bw.a.e(r6, ((java.lang.String) r0[0]).intern()) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        o.ea.c.a();
        o.ea.b.i(r6);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r0 = new java.lang.Object[1];
        f(new int[]{-1732118009, -157243334, -145194474, -87982951, 2091612850, 1011903338, -145194474, -87982951, 1969877566, -704828885, -2057537301, -1112716427, -196395716, -1182651116, -1865520875, 768261664, -1083715421, 599262528, 1927572726, 1715292847, -1140754195, 1456101513, -1384305598, -134142646, -1590728158, 75418771, -1715835805, 50613352}, android.graphics.Color.blue(0) + 55, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        throw new o.bw.d(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (o.bw.a.e(r6, ((java.lang.String) r0[0]).intern()) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bt.e.b(android.content.Context):boolean");
    }

    public static e c() {
        int i2 = 2 % 2;
        int i3 = f21648a + 75;
        f21651d = i3 % 128;
        int i4 = i3 % 2;
        e eVar = f21650c;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        return eVar;
    }

    public static String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21648a + 7;
        f21651d = i3 % 128;
        int i4 = i3 % 2;
        c.a();
        String strE = o.ea.b.e();
        int i5 = f21648a + 77;
        f21651d = i5 % 128;
        int i6 = i5 % 2;
        return strE;
    }

    public static boolean e(Context context) {
        int i2 = 2 % 2;
        int i3 = f21651d + 97;
        f21648a = i3 % 128;
        int i4 = i3 % 2;
        c.a();
        if (i4 != 0) {
            int iMyPid = Process.myPid();
            int i5 = o.ea.b.f23486g * (-1109751392);
            o.ea.b.f23486g = i5;
            int i6 = o.ea.b.f23489j * 110056700;
            o.ea.b.f23489j = i6;
            int i7 = o.ea.b.f23488i * 1232850784;
            o.ea.b.f23488i = i7;
            return ((Boolean) o.ea.b.a(i5, 1161837834, iMyPid, new Object[]{context}, i7, i6, -1161837830)).booleanValue();
        }
        int iMyPid2 = Process.myPid();
        int i8 = o.ea.b.f23486g * (-1109751392);
        o.ea.b.f23486g = i8;
        int i9 = o.ea.b.f23489j * 110056700;
        o.ea.b.f23489j = i9;
        int i10 = o.ea.b.f23488i * 1232850784;
        o.ea.b.f23488i = i10;
        int i11 = 67 / 0;
        return ((Boolean) o.ea.b.a(i8, 1161837834, iMyPid2, new Object[]{context}, i10, i9, -1161837830)).booleanValue();
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21649b;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 676;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(j2);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13;
                        byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 14)));
                        byte b3 = (byte) (b2 - 2);
                        objA = d.a(iIndexOf, packedPositionType, iIndexOf2, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $11 + 7;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 989264422;
                    j2 = 0;
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
        int[] iArr5 = f21649b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    int i12 = 674 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1));
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12;
                    byte b4 = (byte) ($$b & 14);
                    byte b5 = (byte) (b4 - 2);
                    objA2 = d.a(i12, windowTouchSlop, maximumFlingVelocity, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            int i13 = $10 + 95;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = $11 + 47;
            $10 = i15 % 128;
            int i16 = 2;
            int i17 = i15 % 2;
            int i18 = 0;
            while (i18 < 16) {
                int i19 = $10 + 99;
                $11 = i19 % 128;
                int i20 = i19 % i16;
                lVar.f19942e ^= iArr4[i18];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    int fadingEdgeLength = 301 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char absoluteGravity = (char) (52697 - Gravity.getAbsoluteGravity(0, 0));
                    int pressedStateDuration = 11 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = d.a(fadingEdgeLength, absoluteGravity, pressedStateDuration, -1416256172, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i18++;
                i16 = 2;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
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
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = d.a(ExpandableListView.getPackedPositionChild(0L) + 230, (char) (51005 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 9, -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
        $$b = 67;
    }

    public final void c(Long l2) {
        int i2 = 2 % 2;
        int i3 = f21651d + 103;
        f21648a = i3 % 128;
        int i4 = i3 % 2;
        c.a();
        long jLongValue = l2.longValue() - o.ea.b.f();
        if (f.a()) {
            Object[] objArr = new Object[1];
            f(new int[]{365061890, -1899978830, 832834029, -1669569122, 1598556750, 426773059, 171502936, 1665269768}, KeyEvent.getDeadChar(0, 0) + 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(new int[]{-209580193, 1148030780, 881286683, 527368124, -117337004, 1696795126, -963361477, 661069221, -1348455811, -1054129570, 1850189306, -831425611, 661888414, 372457180, 833521189, 1817502895}, Color.blue(0) + 30, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(jLongValue).toString());
        }
        if (Math.abs(jLongValue) < 60) {
            this.f21654e = null;
            return;
        }
        int i5 = f21648a + 97;
        f21651d = i5 % 128;
        int i6 = i5 % 2;
        this.f21654e = Long.valueOf(jLongValue);
    }

    public final Long d() {
        int i2 = 2 % 2;
        int i3 = f21651d;
        int i4 = i3 + 35;
        f21648a = i4 % 128;
        int i5 = i4 % 2;
        Long l2 = this.f21654e;
        int i6 = i3 + 17;
        f21648a = i6 % 128;
        if (i6 % 2 != 0) {
            return l2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
