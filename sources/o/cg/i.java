package o.cg;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.io.encoding.Base64;
import o.a.k;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f22351a = 0;

    /* JADX INFO: renamed from: b */
    public static int f22352b = 0;

    /* JADX INFO: renamed from: c */
    public static int f22353c = 0;

    /* JADX INFO: renamed from: d */
    public static int f22354d = 0;

    /* JADX INFO: renamed from: e */
    public static int f22355e = 0;

    /* JADX INFO: renamed from: h */
    private static final h f22356h;

    /* JADX INFO: renamed from: k */
    private static long f22357k = 0;

    /* JADX INFO: renamed from: p */
    private static char[] f22358p = null;

    /* JADX INFO: renamed from: q */
    private static int f22359q = 0;

    /* JADX INFO: renamed from: r */
    private static int f22360r = 0;

    /* JADX INFO: renamed from: s */
    private static int f22361s = 0;

    /* JADX INFO: renamed from: t */
    private static int f22362t = 0;

    /* JADX INFO: renamed from: f */
    private final d f22363f;

    /* JADX INFO: renamed from: g */
    private final o.ef.a f22364g;

    /* JADX INFO: renamed from: i */
    private final o.ef.a f22365i;

    /* JADX INFO: renamed from: j */
    private final h f22366j;

    /* JADX INFO: renamed from: l */
    private final String f22367l;

    /* JADX INFO: renamed from: m */
    private final Long f22368m;

    /* JADX INFO: renamed from: n */
    private final String f22369n;

    /* JADX INFO: renamed from: o */
    private final g f22370o;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, short r11) {
        /*
            byte[] r8 = o.cg.i.$$a
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r0 = 120 - r10
            int r2 = r11 * 2
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2c
            r2 = r4
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            r2 = r3
        L18:
            int r7 = r7 + 1
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r7]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.i.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22352b = 2106153231;
        f22351a = -1877823453;
        f22353c = -800469032;
        f22355e = -441249626;
        f22354d = 1714082230;
        f22360r = 0;
        f22359q = 1;
        f22362t = 0;
        f22361s = 1;
        h();
        Color.green(0);
        f22356h = h.f22342e;
        int i2 = f22360r + 11;
        f22359q = i2 % 128;
        int i3 = i2 % 2;
    }

    private i(d dVar, o.ef.a aVar, o.ef.a aVar2, h hVar, g gVar, String str, String str2, Long l2) {
        this.f22363f = dVar;
        this.f22364g = aVar;
        this.f22365i = aVar2;
        this.f22366j = hVar;
        this.f22370o = gVar;
        this.f22367l = str;
        this.f22369n = str2;
        this.f22368m = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0392 A[Catch: b -> 0x0528, TryCatch #4 {b -> 0x0528, blocks: (B:167:0x035d, B:169:0x0392, B:171:0x0398, B:172:0x03e0), top: B:222:0x035d }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a1 A[Catch: b -> 0x0524, TRY_LEAVE, TryCatch #1 {b -> 0x0524, blocks: (B:181:0x0431, B:184:0x0456, B:186:0x045c, B:187:0x0477, B:188:0x049b, B:190:0x04a1), top: B:216:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0566  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v146, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.cg.i a(android.content.Context r25, o.ef.a r26, int r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.i.a(android.content.Context, o.ef.a, int, java.lang.String):o.cg.i");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = i5 | i6;
        int i11 = (-1) - (((-1) - (~(((i8 + i9) - (i8 & i9)) | (~i3)))) & ((-1) - (~((i10 + i3) - (i10 & i3)))));
        int i12 = (~(i9 | i3)) | (~(i9 | i5));
        int i13 = (~(i3 | i6)) | i5;
        int i14 = i5 + i6 + i2 + (1661237432 * i7) + (961048624 * i4);
        int i15 = i14 * i14;
        int i16 = ((119520104 * i5) - 281083904) + ((-1329838950) * i6) + (i11 * 724679527) + (724679527 * i12) + ((-724679527) * i13) + ((-605159424) * i2) + ((-1559232512) * i7) + (1553989632 * i4) + (2020540416 * i15);
        int i17 = (i5 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i11 * (-595)) + (i12 * (-595)) + (i13 * 595) + (i2 * (-2040814133)) + (i7 * (-1614655000)) + (i4 * 500164112) + (i15 * 184877056);
        return i16 + ((i17 * i17) * 1800994816) != 1 ? c(objArr) : e(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        i iVar = (i) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f22362t + 121;
        f22361s = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (!iVar.f22365i.d(str)) {
                return -1;
            }
            o.ef.a aVarX = iVar.f22365i.x(str);
            Object[] objArr2 = new Object[1];
            u("캈싥컺\uda63ꋛ鍮쪽聤굫뻤ُ擭\u09d3ᵱ比\udb19", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            Object[] objArr3 = {aVarX, ((String) objArr2[0]).intern(), -1};
            int priority = Thread.currentThread().getPriority();
            int i5 = o.ef.a.f23777k * (-845283131);
            o.ef.a.f23777k = i5;
            int iIntValue = ((Integer) o.ef.a.a(1647814368, objArr3, (int) SystemClock.uptimeMillis(), (int) Thread.currentThread().getId(), -1647814363, priority, i5)).intValue();
            int i6 = f22362t + 13;
            f22361s = i6 % 128;
            int i7 = i6 % 2;
            return Integer.valueOf(iIntValue);
        } catch (o.ef.b unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.cg.i d(o.ef.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.i.d(o.ef.a):o.cg.i");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = f22361s + 83;
        int i4 = i3 % 128;
        f22362t = i4;
        int i5 = i3 % 2;
        Long l2 = iVar.f22368m;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 29;
        f22361s = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
        return l2;
    }

    static void h() {
        f22357k = -1526956260100568423L;
        char[] cArr = new char[601];
        ByteBuffer.wrap("ÜäÜRÜVÜQÜOÜ?ÜAÜOÜNÜUÜ1Ü\rÜ\rÜ0ÜPÜSÜ2Ü)ÜIÜQÜQÜ'Ü\u0014Ü\u0014Ü¹ÜóÜôÜôÜêÜêÜ\u0011Ý«Ý¯ÝªÝ¨Ý\u0098Ý\u009aÝ¨Ý§Ý®Ý\u008aÜfÜfÝ\u0089Ý³ÝªÝªÝ´Ý´Ý\u0089Ý\u0087Ý®Ý±Ý\u008aÝ\u0088Ý±Ý«Ý¬Ý¬Ý©Ý±Ý\u008aÝ\u0087Ý°Ý\u0089Ý\u0084Ý«Ý²Ý«Ý¦ÝªÝ¦Ý\u0082Ý\u0084Ý«Ý\u0087Ý\u0089Ý¬Ý«Ý´Ý\u00adÝ«Ý\u0089Ý\u0089Ý«Ý¬Ý±Ý¯Ý®Ý°Ý¬Ý\u0088ÜfÝ\u0089Ý¬Ý¬Ý´Ý®Ý«ÝªÝ\u0083Ý\u008aÝ®Ý¦Ý\u0082Ý\u0082Ý¤Ý¥Ý£Ý«Ý°Ý°Ý\u008aÝ\u0087Ý®Ý©Ü·ÜðÜóÜôÜìÜëÜÉÜÂÜäÜéÜÙÜ±ÜÉÜðÜðÜòÜÛÜ²Ü¦Ü¦ÜÊÜîÜçÜèÜÚÜØÜèÜêÜïÜëÜáÜÀÜÉÜëÜíÜôÜëÜìÜÉÜÆÜîÜðÜìÜÃÜÂÜäÜ·Ü\u000eÜ\u000eÜôÜ²ÜçÜæÜØÜ·Ü·ÜÎÜÑÜÎÜµÜÂÜæÜêÜæÜëÜòÜÛÜÞÜëÜãÜDÜJÜOÜTÜOÜ:Ü>ÜOÜVÜTÜ²ÜëÜôÜíÜëÜÉÜÉÜëÜìÜñÜïÜîÜðÜìÜÏÜ\u00adÜÁÜëÜïÜêÜèÜØÜÚÜèÜçÜîÜÊÜ¦Ü¦Ü¸ÜâÜôÜíÜÄÜÈÜèÜíÜòÜíÜèÜâÜÂÜÄÜëÜèÜçÜðÜìÜäÜäÜÂÜÄÜëÜÇÜÉÜ³ÜèÜÚÜØÜèÜêÜïÜëÜÁÜ\u00adÜÏÜìÜðÜîÜïÜñÜìÜëÜÉÜÉÜëÜíÜôÜëÜìÜÉÜÇÜëÜÄÜÂÜäÜäÜìÜðÜçÜèÜëÜÄÜÂÜÖÜ´ÜÇÜîÜìÜîÜóÜìÜìÜÉÜÄÜíÜôÜâÜ¸Ü¦Ü¦ÜÊÜîÜ»ÜìÜæÜìÜèÜìÜÊÜÇÜîÜñÜîÜçÜçÜçÜäÜÂÜÀÜêÜÉÜÂÜäÜèÜèÜìÜìÜäÜ¶ÜíÜéÜçÜÜÜÙÜìÜóÜêÜäÜæÜ´ÜçÜçÜîÜñÜîÜÇÜÊÜìÜèÜìÜæÜìÜËÜ\u00adÜ\u00adÜÇÜîÜñÜêÜãÜëÜÉÜÅÜçÜéÜíÜÆÜ¦Ü¦ÜÂÜäÜèÜçÜéÜíÜÆÜÉÜêÜÀÜÂÜäÜ\rÝ\u0092Ý\u0097Ý\u009cÝ\u0097Ý\u0092Ý\u008cÜ~Ý\u0083Ý\u0092Ý\u0094Ý\u009fÝ\u009eÝ\u009cÝ\u0098Ý\u0096Ý\u0098ÜàÜOÜOÜiÝ\u0096Ý\u008fÝ\u0088ÜeÜiÝ\u0090Ý\u008eÝ\u008cÝ\u008eÝ\u0093Ý\u008cÝ\u008cÜiÜdÝ\u008eÝ\u008eÝ\u0090ÜkÜbÝ\u0084Ý\u008bÝ\u008bÝ\u0086Ý\u008cÝ\u008cÝ\u0086ÜaÜiÝ\u008eÜdÜgÝ\u008eÝ\u008cÝ\u008eÝ\u0092Ý\u0094Ý\u0095Ý\u008aÝ\u0088ÜyÜtÝ\u0082Ý\u0088Ý\u008dÝ\u0092Ý\u008dÝ\u0088ÜhÜFÜFÜbÝ\u0088Ý\u008aÝ\u008fÝ\u008bÜ¶ÜèÜÂÜ¦Ü¦ÜÉÜëÜãÜâÜÂÜÊÜîÜëÜéÜìÜóÜêÜçÜîÜÕÜ\u00adÜÁÜëÜïÜ\u0090Ü¦Ü¦ÜËÜìÜæÜìÜèÜìÜÊÜÉÜôÜëÜÁÜÉÜóÜêÜêÜôÜôÜÉÜÉÜëÜäÜäÜçÜïÜíÜäÜÂÜ\u00adÜ\u00adÜÁÜëÜïÜêÜèÜ\u0090ÜÊÜôÜòÜÇÜÃÜêÜëÜèÜçÜëÜíÜÆÜ¦Ü¦ÜÂÜèÜêÜïÜëÜãÜäÜçÜçÜçÜîÜñÜîÜÙÜ9ÜAÜ2Ü5ÜBÜAÜ=Ü=Ü¶ÜèÜÂÜ¦Ü¦ÜÈÜèÜíÜòÜíÜèÜâÜÂÜ\u00adÜ\u00adÜÁÜëÜïÜ·ÜÙÜÞÜíÜäÜêÜòÜîÜìÜîÜèÜëÜïÜêÜèÜÂÜ¦Ü¦ÜµÜÞÜñ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 601);
        f22358p = cArr;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 198;
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 27;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f22357k ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22357k)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(230 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (51004 - TextUtils.getOffsetAfter("", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, 1749983833, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 13))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(675 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Process.myTid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 522683165, false, $$c(b3, (byte) (6 | b3), b3), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrC, 4, cArrC.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00c4 A[PHI: r11
  0x00c4: PHI (r11v3 char) = (r11v0 char), (r11v7 char) binds: [B:117:0x012b, B:110:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(java.lang.String r21, int[] r22, boolean r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.i.v(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    public final int a(String str) {
        int i2 = f22354d * (-379313138);
        f22354d = i2;
        int iMyTid = Process.myTid();
        int i3 = f22355e * 1893761032;
        f22355e = i3;
        int i4 = 1010539156 * f22353c;
        f22353c = i4;
        return ((Integer) b(iMyTid, i2, i4, 853933007, new Object[]{this, str}, -853933007, i3)).intValue();
    }

    public final String a() {
        String str;
        int i2 = 2 % 2;
        int i3 = f22362t + 109;
        int i4 = i3 % 128;
        f22361s = i4;
        if (i3 % 2 == 0) {
            str = this.f22369n;
            int i5 = 10 / 0;
        } else {
            str = this.f22369n;
        }
        int i6 = i4 + 19;
        f22362t = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return str;
    }

    public final o.ef.a b() {
        int i2 = 2 % 2;
        int i3 = f22362t;
        int i4 = i3 + 31;
        f22361s = i4 % 128;
        int i5 = i4 % 2;
        o.ef.a aVar = this.f22365i;
        int i6 = i3 + 111;
        f22361s = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    public final d c() {
        int i2 = 2 % 2;
        int i3 = f22361s + 19;
        int i4 = i3 % 128;
        f22362t = i4;
        int i5 = i3 % 2;
        d dVar = this.f22363f;
        int i6 = i4 + 63;
        f22361s = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f22361s + 125;
        int i4 = i3 % 128;
        f22362t = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f22367l;
        int i5 = i4 + 45;
        f22361s = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final o.ef.a e() {
        int i2 = 2 % 2;
        int i3 = f22362t + 57;
        f22361s = i3 % 128;
        int i4 = i3 % 2;
        o.ef.a aVar = this.f22364g;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        return aVar;
    }

    public final g f() {
        int i2 = 2 % 2;
        int i3 = f22361s + 35;
        f22362t = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f22370o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long i() {
        int i2 = 54917210 * f22351a;
        f22351a = i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f22352b * (-842077802);
        f22352b = i3;
        return (Long) b(iElapsedRealtime, i2, i3, -1938085664, new Object[]{this}, 1938085665, elapsedCpuTime);
    }

    public final h j() {
        int i2 = 2 % 2;
        int i3 = f22361s + 23;
        f22362t = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f22366j;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        return hVar;
    }
}
