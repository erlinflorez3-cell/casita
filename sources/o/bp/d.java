package o.bp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.TimeoutException;
import o.a.q;
import o.dd.g;
import o.e.xC5286$c;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xC5286$c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f21504a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f21505f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f21506g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21507h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21508i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21509j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21510l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21512c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f21514e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21511b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21513d = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r0 = r6 * 2
            int r1 = 3 - r0
            int r2 = r8 * 2
            int r0 = 1 - r2
            int r8 = r7 + 71
            byte[] r7 = o.bp.d.$$c
            byte[] r6 = new byte[r0]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r5
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r8
            r2 = r3
            r8 = r1
            r1 = r0
        L1a:
            byte r0 = (byte) r8
            r6[r2] = r0
            int r3 = r2 + 1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            int r0 = r1 + 1
            r1 = r7[r0]
            goto L15
        L2c:
            r2 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.d.$$g(int, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f21509j = 0;
        f21510l = 1;
        f21507h = 0;
        f21508i = 1;
        e();
        SystemClock.elapsedRealtimeNanos();
        f21504a = new d();
        int i2 = f21510l + 125;
        f21509j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    private d() {
    }

    private static void a(Context context, long j2, long j3) throws Throwable {
        int i2 = 2 % 2;
        long j4 = j2 ^ (j3 << 32);
        int i3 = f21508i + 25;
        f21507h = i3 % 128;
        int i4 = i3 % 2;
        try {
            Method method = f.class.getMethod("a", null);
            method.setAccessible(true);
            if (((Boolean) method.invoke(null, null)).booleanValue()) {
                Object[] objArr = new Object[1];
                k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", (KeyEvent.getMaxKeyCode() >> 16) + 20639, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(null);
                Object[] objArr2 = new Object[1];
                k("룦큪槙脹᪺돠쭁撹ﰨᕦ껖오徃\ue8f3C馡ㅄ䨶\ue39a笫钗ⷰ䕊\ude9e瘓轷ᣗ끫짐", (Process.myPid() >> 22) + 26783, objArr2);
                Object[] objArr3 = {((String) objArr2[0]).intern()};
                Object[] objArr4 = new Object[1];
                k("룵繡㗮\ueb7eꋮ塩", TextUtils.lastIndexOf("", '0', 0, 0) + 50822, objArr4);
                Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(objNewInstance, objArr3);
                Object[] objArr5 = {Long.valueOf(j4)};
                Object[] objArr6 = new Object[1];
                k("룵繡㗮\ueb7eꋮ塩", MotionEvent.axisFromString("") + 50822, objArr6);
                Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                method3.setAccessible(true);
                Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                Object[] objArr7 = new Object[1];
                k("룠\udca6災闷⦒䴬\ue2d4ٸ", 25693 - TextUtils.getCapsMode("", 0, 0), objArr7);
                Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                method4.setAccessible(true);
                Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                Method method5 = f.class.getMethod("c", String.class, Object.class);
                method5.setAccessible(true);
                method5.invoke(null, objArr8);
                int i5 = f21508i + 61;
                f21507h = i5 % 128;
                int i6 = i5 % 2;
            }
            d().f21512c = (int) j4;
            Object objInvoke3 = context;
            if (d().f21513d) {
                return;
            }
            if (context == null) {
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                Object[] objArr9 = new Object[1];
                o(b2, b3, b3, objArr9);
                Method method6 = o.en.b.class.getMethod((String) objArr9[0], null);
                method6.setAccessible(true);
                Object objInvoke4 = method6.invoke(null, null);
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr10 = new Object[1];
                o(b4, b5, b5, objArr10);
                Method method7 = o.en.b.class.getMethod((String) objArr10[0], null);
                method7.setAccessible(true);
                objInvoke3 = method7.invoke(objInvoke4, null);
            }
            if (objInvoke3 != null) {
                int i7 = f21508i + 97;
                f21507h = i7 % 128;
                int i8 = i7 % 2;
                Method method8 = o.dc.d.class.getMethod("a", null);
                method8.setAccessible(true);
                Object objInvoke5 = method8.invoke(null, null);
                Object[] objArr11 = {o.az.a.class.getField("b").get(null), g.class.getField("z").get(null)};
                Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, g.class);
                declaredConstructor2.setAccessible(true);
                Object[] objArr12 = {objInvoke3, declaredConstructor2.newInstance(objArr11), true};
                Method method9 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                method9.setAccessible(true);
                method9.invoke(objInvoke5, objArr12);
                d().f21513d = true;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static d d() {
        int i2 = 2 % 2;
        int i3 = f21508i + 23;
        int i4 = i3 % 128;
        f21507h = i4;
        int i5 = i3 % 2;
        d dVar = f21504a;
        int i6 = i4 + 1;
        f21508i = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    static void e() {
        f21505f = 4606752159567033819L;
        f21506g = new char[]{56489, 56547, 56556, 56550, 56550, 56548, 56553, 56537, 56539, 56561, 56559, 56499, 56550, 56556, 56547, 56544, 56559, 56561, 56539, 56537, 56553, 56548, 56514, 56486, 56486, 56523, 56556, 56549, 56558, 56512, 56575, 56325, 56572, 56569, 56328, 56330, 56564, 56562, 56322, 56573, 56539, 56511, 56511, 56546, 56324, 56325, 56333, 56332, 56329, 56557, 56521, 56338, 56344, 56335, 56332, 56347, 56349, 56327, 56325, 56341, 56336, 56321, 56575, 56342, 56351};
    }

    static void init$0() {
        $$a = new byte[]{120, -15, 89, -97};
        $$b = 154;
    }

    static void init$1() {
        $$d = new byte[]{117, -10, 112, 71};
        $$e = 82;
    }

    static void init$2() {
        $$c = new byte[]{46, -113, 33, 42};
        $$f = 104;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 93;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            int i6 = i4 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
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
            int i8 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.indexOf("", "", 0) + 731, (char) (7934 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 11 - Drawable.resolveOpacity(0, 0), 355847088, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21505f ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 836, (char) (27279 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -2145994442, false, $$g(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 7))), b4), new Class[]{Object.class, Object.class});
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
                byte b5 = (byte) 0;
                objA3 = o.d.d.a((-16776380) - Color.rgb(0, 0, 0), (char) (27279 - Color.green(0)), Color.green(0) + 11, -2145994442, false, $$g(b5, (byte) ((b5 + 7) - (7 & b5)), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i9 = $11 + 109;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[Catch: all -> 0x01fe, TryCatch #0 {all -> 0x01fe, blocks: (B:12:0x003d, B:14:0x004e, B:15:0x007f, B:31:0x00da, B:33:0x00f2, B:34:0x0123, B:47:0x01b1, B:49:0x01c2, B:50:0x01f6, B:40:0x0145, B:42:0x015e, B:43:0x019a), top: B:76:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e A[Catch: all -> 0x01fe, TryCatch #0 {all -> 0x01fe, blocks: (B:12:0x003d, B:14:0x004e, B:15:0x007f, B:31:0x00da, B:33:0x00f2, B:34:0x0123, B:47:0x01b1, B:49:0x01c2, B:50:0x01f6, B:40:0x0145, B:42:0x015e, B:43:0x019a), top: B:76:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(java.lang.String r23, int[] r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.d.m(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r0 = r7 * 2
            int r7 = r0 + 4
            int r0 = r8 * 3
            int r2 = r0 + 97
            byte[] r6 = o.bp.d.$$a
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2e
            r2 = r7
            r0 = r3
            r1 = r4
        L18:
            int r0 = -r0
            int r7 = r7 + 1
            int r2 = r2 + r0
        L1c:
            byte r0 = (byte) r2
            r5[r1] = r0
            if (r1 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L29:
            int r1 = r1 + 1
            r0 = r6[r7]
            goto L18
        L2e:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.d.n(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(short r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = o.bp.d.$$d
            int r0 = r8 * 14
            int r5 = 113 - r0
            int r0 = r10 * 2
            int r4 = r0 + 4
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L2b
            r5 = r7
            r0 = r4
            r1 = r2
        L16:
            int r4 = r4 + 1
            int r5 = r5 + r0
        L19:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r11[r2] = r0
            return
        L26:
            int r1 = r1 + 1
            r0 = r6[r4]
            goto L16
        L2b:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.d.o(short, int, short, java.lang.Object[]):void");
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f21508i + 69;
        f21507h = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f21507h + 91;
            f21508i = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", TextUtils.lastIndexOf("", '0', 0, 0) + 20640, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            m("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{50, 15, 44, 0}, false, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f21508i + 49;
            f21507h = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 2;
            }
        }
        return this.f21512c;
    }

    public final int a(Context context) throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", ImageFormat.getBitsPerPixel(0) + 20640, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            m("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{0, 11, 0, 4}, true, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        synchronized (this.f21514e) {
            if (this.f21511b) {
                return this.f21512c;
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", Color.alpha(0) + 20639, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                k("룳ꛞ蒾\ue24b쁇⸐\u0dfa殞䦃띗锧\uf4b1튍プṕ簡娖맢ꞹ薝\ue318섽\u20f1ໂ沈䨣꠶阄\uf5c4펢ㅵὑ紝峴뫄", ExpandableListView.getPackedPositionType(0L) + 7727, objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            try {
                Object[] objArr5 = {context, this};
                Object objA = o.d.d.a(1091117274);
                if (objA == null) {
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 377;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int i2 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    n(b2, b3, b3, objArr6);
                    objA = o.d.d.a(keyRepeatTimeout, cIndexOf, i2, -1752382785, false, (String) objArr6[0], new Class[]{Context.class, xC5286$c.class});
                }
                ((Method) objA).invoke(null, objArr5);
                if (!this.f21511b) {
                    try {
                        this.f21514e.wait(30000L);
                        if (f.a()) {
                            Object[] objArr7 = new Object[1];
                            k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", (ViewConfiguration.getWindowTouchSlop() >> 8) + 20639, objArr7);
                            String strIntern3 = ((String) objArr7[0]).intern();
                            Object[] objArr8 = new Object[1];
                            m("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{11, 18, 0, 0}, false, objArr8);
                            f.c(strIntern3, ((String) objArr8[0]).intern());
                        }
                    } catch (InterruptedException unused) {
                        throw new TimeoutException();
                    }
                }
                if (f.a()) {
                    Object[] objArr9 = new Object[1];
                    k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", (KeyEvent.getMaxKeyCode() >> 16) + 20639, objArr9);
                    String strIntern4 = ((String) objArr9[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr10 = new Object[1];
                    m("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{29, 21, 25, 0}, false, objArr10);
                    f.c(strIntern4, sb.append(((String) objArr10[0]).intern()).append(this.f21512c).toString());
                }
                return this.f21512c;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // o.e.xC5286$c
    public final void b(int i2) throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            k("룆\ue864ᧅ䤽窱⯪孚貨㰏海黋츮美", TextUtils.indexOf("", "") + 20639, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            k("룻诟\ude8c↔瑯䝙討\udef2⇈璼䞅詷\udd41‚瓼䟭誡\udd92⁻獇䘄諏\udddf₤玉䙠褠\udc16\u20fc玅䛯觏", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13092, objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(i2).toString());
        }
        synchronized (this.f21514e) {
            this.f21511b = true;
            this.f21512c = i2;
            this.f21514e.notifyAll();
        }
    }
}
