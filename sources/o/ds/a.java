package o.ds;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23317a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23318b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23319c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23320d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23321e = 0;

    private static String $$c(int i2, short s2, byte b2) {
        int i3 = s2 * 3;
        byte[] bArr = $$a;
        int i4 = 120 - (b2 * 4);
        int i5 = 4 - (i2 * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i4 += i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i4 += b3;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23318b = 0;
        f23317a = 1;
        f23319c = 0;
        f23321e = 1;
        c();
        int i2 = f23318b + 61;
        f23317a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void c() {
        f23320d = new char[]{56490, 56547, 56553, 56551, 56560, 56554, 56546, 56555, 56558, 56556, 56558, 56539, 56536, 56558, 56563, 56561, 56560, 56565, 56547, 56535, 56551, 56551, 56548, 56550, 56555, 56527, 56348, 56340, 56332, 56340, 56342, 56326, 56333, 56339, 56337, 56346, 56340, 56332, 56341, 56344, 56342, 56344, 56346, 56563, 56528, 56528, 56556, 56339, 56344, 56348, 56352, 56566, 56564, 56349, 56339, 56337, 56346, 56340, 56332, 56341, 56344, 56342, 56344, 56561, 56558, 56338, 56344, 56349, 56347, 56346, 56351, 56496, 56554, 56554, 56546, 56514, 56516, 56557, 56556, 56555, 56556, 56515, 56516, 56558, 56558, 56560, 56523, 56519, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56563, 56522, 56515, 56554, 56555, 56558, 56563, 56558, 56560, 56558, 56514, 56515, 56554, 56555, 56558, 56554, 56546, 56554, 56562, 56522, 56486, 56486, 56521, 56560, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56540, 56556, 56554, 56546, 56554, 56562, 56544, 56381, 56373, 56365, 56373, 56375, 56359, 56366, 56372, 56370, 56379, 56373, 56365, 56374, 56377, 56375, 56377, 56379, 56340, 56561, 56561, 56337, 56370, 56373, 56374, 56368, 56335, 56334, 56373, 56381, 56380, 56372, 56333, 56332, 56366, 56375, 56384, 56377, 56368, 56372, 56338, 56337, 56376, 56372, 56365, 56369, 56337, 56341, 56382, 56372, 56370, 56379, 56373, 56365, 56374, 56377, 56375, 56377, 56338, 56331, 56370, 56372, 56333, 56341, 56382, 56380, 56339, 56341, 56382, 56372, 56370, 56379, 56373, 56365, 56374, 56377, 56375, 56377, 56338, 56568, 56568, 56337, 56372, 56374, 56375, 56371, 56374, 56373, 56334, 56341, 56377, 56369, 56372, 56501, 56555, 56564, 56566, 56558, 56555, 56555, 56562, 56528, 56526, 56565, 56563, 56565, 56562, 56553, 56561, 56567, 56558, 56560, 56570, 56529, 56527, 56568, 56570, 56529, 56521, 56555, 56564, 56568, 56564, 56568, 56563, 56562, 56567, 56568, 56529, 56493, 56493, 56528, 56567, 56565, 56563, 56565, 56562, 56553, 56561, 56567, 56558, 56560, 56554, 56547, 56563, 56561, 56553, 56561, 56569};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0349, code lost:
    
        if (r3 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x034b, code lost:
    
        if (r10 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x034d, code lost:
    
        r2 = o.ds.a.f23319c + 75;
        o.ds.a.f23321e = r2 % 128;
        r2 = r2 % 2;
        r21 = new java.lang.Object[]{r0, r3.b()};
        r23 = o.dq.c.aa * 1028486063;
        o.dq.c.aa = r23;
        r25 = android.os.Process.myPid();
        r19 = o.dq.c.ad * 1511617071;
        o.dq.c.ad = r19;
        r20 = o.dq.c.ae * (-456636140);
        o.dq.c.ae = r20;
        o.dq.c.e(r19, r20, r21, -1484062829, r23, 1484062858, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x038c, code lost:
    
        if (r3.s() == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x038e, code lost:
    
        r0.e(r3.s().b());
        r23 = new java.lang.Object[]{r3.s()};
        r19 = o.ep.c.f24438e * 574268897;
        o.ep.c.f24438e = r19;
        r5 = (int) java.lang.Thread.currentThread().getId();
        r25 = o.ep.c.f24436c * 1169734117;
        o.ep.c.f24436c = r25;
        r21 = o.ep.c.f24434a * (-2104816085);
        o.ep.c.f24434a = r21;
        r0.a((java.lang.String) o.ep.c.c(r19, r5, r21, 1241915024, r23, -1241915024, r25));
        r23 = new java.lang.Object[]{r3.s()};
        r19 = o.ep.c.f24440h * (-581252450);
        o.ep.c.f24440h = r19;
        r5 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r25 = o.ep.c.f24441i * 151058815;
        o.ep.c.f24441i = r25;
        r21 = o.ep.c.f24439f * (-518773767);
        o.ep.c.f24439f = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0410, code lost:
    
        if (((fr.antelop.sdk.card.CardDisplay) o.ep.c.c(r19, r5, r21, -465660215, r23, 465660217, r25)) == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0412, code lost:
    
        r23 = new java.lang.Object[]{r3.s()};
        r19 = o.ep.c.f24440h * (-581252450);
        o.ep.c.f24440h = r19;
        r5 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r25 = o.ep.c.f24441i * 151058815;
        o.ep.c.f24441i = r25;
        r21 = o.ep.c.f24439f * (-518773767);
        o.ep.c.f24439f = r21;
        r0.h(((fr.antelop.sdk.card.CardDisplay) o.ep.c.c(r19, r5, r21, -465660215, r23, 465660217, r25)).getLayoutDescription());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0444, code lost:
    
        r23 = new java.lang.Object[]{r3.s()};
        r19 = o.ep.c.f24440h * (-581252450);
        o.ep.c.f24440h = r19;
        r5 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r25 = o.ep.c.f24441i * 151058815;
        o.ep.c.f24441i = r25;
        r21 = o.ep.c.f24439f * (-518773767);
        o.ep.c.f24439f = r21;
        r21 = new java.lang.Object[]{r0, ((fr.antelop.sdk.card.CardDisplay) o.ep.c.c(r19, r5, r21, -465660215, r23, 465660217, r25)).getLabel()};
        r23 = android.os.Process.myTid();
        r25 = o.dq.c.I * (-1080485619);
        o.dq.c.I = r25;
        r19 = 1126145498 * o.dq.c.G;
        o.dq.c.G = r19;
        r20 = 1706398790 * o.dq.c.N;
        o.dq.c.N = r20;
        o.dq.c.e(r19, r20, r21, 1732468454, r23, -1732468435, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04a6, code lost:
    
        if (r3.r() == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04a8, code lost:
    
        r22 = new java.lang.Object[]{r3.r()};
        r25 = java.lang.Thread.activeCount();
        r20 = o.er.f.f24986b * (-319723722);
        o.er.f.f24986b = r20;
        r21 = o.er.f.f24990f * 1454362011;
        o.er.f.f24990f = r21;
        r24 = o.er.f.f24991i * (-733680792);
        o.er.f.f24991i = r24;
        r21 = new java.lang.Object[]{r0, (java.lang.String) o.er.f.c(1370509635, r20, r21, r22, -1370509633, r24, r25)};
        r23 = o.dq.c.ak * (-2064707720);
        o.dq.c.ak = r23;
        r25 = new java.util.Random().nextInt();
        r19 = java.lang.Thread.currentThread().getPriority();
        r20 = 706525032 * o.dq.c.ai;
        o.dq.c.ai = r20;
        o.dq.c.e(r19, r20, r21, 1490363620, r23, -1490363587, r25);
        r21 = new java.lang.Object[]{r0, r3.r().b()};
        r23 = new java.util.Random().nextInt(1179011416);
        r25 = android.os.Process.myPid();
        r19 = (-1589156953) * o.dq.c.A;
        o.dq.c.A = r19;
        r20 = (-1913514185) * o.dq.c.H;
        o.dq.c.H = r20;
        o.dq.c.e(r19, r20, r21, -223877226, r23, 223877241, r25);
        r21 = new java.lang.Object[]{r0, r3.r().c()};
        r23 = java.lang.Thread.currentThread().getPriority();
        r25 = o.dq.c.f23248h * (-815798093);
        o.dq.c.f23248h = r25;
        o.dq.c.e((int) java.lang.Runtime.getRuntime().maxMemory(), (int) java.lang.Runtime.getRuntime().freeMemory(), r21, 294276602, r23, -294276598, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x057e, code lost:
    
        r0.o(r10.h());
        r23 = o.ep.a.f24399b * (-193681782);
        o.ep.a.f24399b = r23;
        r3 = (int) android.os.SystemClock.elapsedRealtime();
        r5 = (int) android.os.Process.getElapsedCpuTime();
        r21 = o.ep.a.f24400c * (-1292223516);
        o.ep.a.f24400c = r21;
        r0.k((java.lang.String) o.ep.a.e(-579306999, new java.lang.Object[]{r10}, r21, 579307000, r23, r5, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x05b8, code lost:
    
        r4.d(r28, r0, o.bs.a.f21593e);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05c6, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05ca, code lost:
    
        r10 = null;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05cf, code lost:
    
        r3 = r12.iterator();
        r1 = o.ds.a.f23319c + 105;
        o.ds.a.f23321e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05e1, code lost:
    
        if (r3.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x05e3, code lost:
    
        r4.d(r28, (o.dq.c) r3.next(), o.bs.a.f21593e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05f1, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05f9, code lost:
    
        if (r1.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05fb, code lost:
    
        r21 = new java.lang.Object[]{r4, (java.lang.String) r1.next()};
        r22 = new java.util.Random().nextInt();
        r23 = o.bs.d.f21617d * 635033288;
        o.bs.d.f21617d = r23;
        r17 = o.bs.d.f21615b * 716764378;
        o.bs.d.f21615b = r17;
        r19 = o.bs.d.f21614a * (-1681288992);
        o.bs.d.f21614a = r19;
        o.bs.d.e(r17, -1697204815, r19, 1697204816, r21, r22, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0633, code lost:
    
        r2 = r16.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x063b, code lost:
    
        if (r2.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x063d, code lost:
    
        r4.c((java.lang.String) r2.next(), o.bs.a.f21590a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0649, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x064a, code lost:
    
        o.ea.f.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x064d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x025a, code lost:
    
        r20.close();
        r1 = o.ds.a.f23319c + 61;
        o.ds.a.f23321e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x026b, code lost:
    
        if (r7.isEmpty() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x026d, code lost:
    
        r1 = o.ds.a.f23319c + 125;
        o.ds.a.f23321e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0276, code lost:
    
        if ((r1 % 2) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x027c, code lost:
    
        if (o.ea.f.a() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027e, code lost:
    
        r0 = new java.lang.Object[1];
        f("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 25, 0, 0}, false, r0);
        r3 = ((java.lang.String) r0[0]).intern();
        r1 = new java.lang.Object[1];
        f("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{230, 56, 7, 0}, true, r1);
        o.ea.f.c(r3, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ae, code lost:
    
        r13 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b6, code lost:
    
        if (r13.hasNext() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b8, code lost:
    
        r0 = (o.dq.c) r13.next();
        r21 = new java.lang.Object[]{r29.e(), r0.x()};
        r3 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r24 = o.em.d.f24073d * (-674039927);
        o.em.d.f24073d = r24;
        r2 = (o.eq.b) o.em.d.a(-1500124824, 1500124825, r21, android.os.Process.myPid(), r3, r24, (int) java.lang.Runtime.getRuntime().maxMemory());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f6, code lost:
    
        if (r2 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02fc, code lost:
    
        if (r2.A() == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02fe, code lost:
    
        r3 = r29.e().g();
        r23 = android.os.Process.myUid();
        r21 = java.lang.Thread.currentThread().getPriority();
        r19 = java.lang.Thread.activeCount();
        r20 = o.eq.b.f24699e * (-280241304);
        o.eq.b.f24699e = r20;
        r3 = r3.get((java.lang.String) o.eq.b.e(r19, r20, r21, -688819955, r23, 688819957, new java.lang.Object[]{r2}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0335, code lost:
    
        if (r3 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0337, code lost:
    
        r5 = o.ds.a.f23319c + 105;
        o.ds.a.f23321e = r5 % 128;
        r5 = r5 % 2;
        r10 = r3.a(r2.A());
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230 A[Catch: all -> 0x064e, TryCatch #1 {all -> 0x064e, blocks: (B:34:0x014d, B:36:0x0158, B:38:0x015e, B:41:0x01a1, B:43:0x01a7, B:45:0x01ad, B:46:0x01df, B:48:0x01f2, B:49:0x01f5, B:57:0x0206, B:54:0x0200, B:60:0x020d, B:64:0x0221, B:79:0x0245, B:70:0x0230, B:81:0x0256, B:82:0x0259, B:67:0x022a), top: B:139:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245 A[Catch: all -> 0x064e, TRY_ENTER, TryCatch #1 {all -> 0x064e, blocks: (B:34:0x014d, B:36:0x0158, B:38:0x015e, B:41:0x01a1, B:43:0x01a7, B:45:0x01ad, B:46:0x01df, B:48:0x01f2, B:49:0x01f5, B:57:0x0206, B:54:0x0200, B:60:0x020d, B:64:0x0221, B:79:0x0245, B:70:0x0230, B:81:0x0256, B:82:0x0259, B:67:0x022a), top: B:139:0x014d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<o.dq.c> e(android.content.Context r28, o.en.b r29, o.ef.a r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ds.a.e(android.content.Context, o.en.b, o.ef.a):java.util.List");
    }

    private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
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
        char[] cArr = f23320d;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 248, (char) Color.alpha(i4), 10 - TextUtils.lastIndexOf("", '0', i4), 1376582792, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
                    j2 = 0;
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
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                int i12 = $11 + 67;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0, 0), 9 - TextUtils.indexOf((CharSequence) "", '0', 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 836, (char) (27279 - View.MeasureSpec.getMode(0)), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1210801192, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 21, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35714), 11 - Color.alpha(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i16 = $11 + 61;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i18 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i18, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i18);
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
            int i19 = 0;
            while (true) {
                mVar.f19943d = i19;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i20 = $10 + 49;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i19 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{42, MessagePack.Code.FLOAT64, -71, 92};
        $$b = 71;
    }
}
