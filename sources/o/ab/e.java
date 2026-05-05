package o.ab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.a.q;
import o.by.g;
import o.ea.f;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e<CB> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f20093a = 0;

    /* JADX INFO: renamed from: b */
    public static int f20094b = 0;

    /* JADX INFO: renamed from: c */
    public static int f20095c = 0;

    /* JADX INFO: renamed from: d */
    public static int f20096d = 0;

    /* JADX INFO: renamed from: e */
    public static int f20097e = 0;

    /* JADX INFO: renamed from: h */
    public static int f20098h = 0;

    /* JADX INFO: renamed from: i */
    public static int f20099i = 0;

    /* JADX INFO: renamed from: k */
    private static int f20100k = 0;

    /* JADX INFO: renamed from: m */
    private static long f20101m = 0;

    /* JADX INFO: renamed from: p */
    private static int f20102p = 0;

    /* JADX INFO: renamed from: f */
    private final g f20103f = new g();

    /* JADX INFO: renamed from: g */
    private final CB f20104g;

    /* JADX INFO: renamed from: j */
    private final o.en.b f20105j;

    /* JADX INFO: renamed from: l */
    private o.bg.c f20106l;

    /* JADX INFO: renamed from: n */
    private Context f20107n;

    /* JADX INFO: renamed from: o */
    private c<?> f20108o;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r0 = r7 * 7
            int r0 = 78 - r0
            int r1 = r8 * 2
            int r2 = 3 - r1
            byte[] r8 = o.ab.e.$$c
            int r3 = r6 * 4
            int r1 = 1 - r3
            byte[] r7 = new byte[r1]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2e
            r4 = r6
            r3 = r5
        L17:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L1a:
            byte r1 = (byte) r0
            r7[r3] = r1
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L27:
            int r2 = r2 + 1
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L17
        L2e:
            r3 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.e.$$i(int, short, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f20099i = 2121153106;
        f20098h = -1010967079;
        f20093a = -1286195193;
        f20097e = 1610856331;
        f20094b = -172571696;
        f20095c = -233586473;
        f20096d = 629935057;
        f20100k = 0;
        f20102p = 1;
        f20101m = 8953441642338437992L;
    }

    public e(Context context, CB cb, o.en.b bVar, o.bg.e eVar) {
        this.f20107n = context;
        this.f20104g = cb;
        this.f20105j = bVar;
        this.f20106l = new o.bg.c(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void F(byte r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r2 = r10 * 2
            int r1 = 1 - r2
            int r8 = r8 + 4
            byte[] r7 = o.ab.e.$$a
            int r0 = r9 * 5
            int r0 = 106 - r0
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r8
            r2 = r5
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L18:
            byte r0 = (byte) r8
            r6[r1] = r0
            int r3 = r3 + 1
            int r2 = r1 + 1
            if (r1 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r11[r5] = r0
            return
        L29:
            r0 = r7[r3]
            goto L15
        L2c:
            r1 = r5
            r3 = r8
            r8 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.e.F(byte, int, short, java.lang.Object[]):void");
    }

    private static void G(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 35;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 731, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 7933), TextUtils.lastIndexOf("", '0', 0) + 12, 355847088, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20101m ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 836, (char) (27279 - (ViewConfiguration.getScrollBarSize() >> 8)), Drawable.resolveOpacity(0, 0) + 11, -2145994442, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                byte b7 = b6;
                objA3 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 836, (char) (27280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -2145994442, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void J(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.ab.e.$$g
            int r0 = r11 * 5
            int r7 = r0 + 1
            int r0 = r10 * 14
            int r0 = r0 + 97
            int r6 = r9 + 4
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L2e
            r3 = r6
            r1 = r7
            r2 = r4
        L14:
            int r0 = -r1
            int r6 = r6 + r0
            int r0 = r6 + (-9)
            r6 = r3
        L19:
            int r3 = r6 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r7) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L2a:
            r1 = r8[r3]
            r6 = r0
            goto L14
        L2e:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.e.J(int, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (i6 + i10) - (i6 & i10);
        int i12 = ~i6;
        int i13 = i10 | (~((-1) - (((-1) - i12) & ((-1) - i7))));
        int i14 = ~((-1) - (((-1) - i9) & ((-1) - (i12 | i8))));
        int i15 = (-1) - (((-1) - i8) & ((-1) - i6));
        int i16 = ~((i2 + i15) - (i2 & i15));
        int i17 = (i16 + i14) - (i16 & i14);
        int i18 = i7 + i6 + i4 + ((-619979367) * i3) + (68302741 * i5);
        int i19 = i18 * i18;
        int i20 = (i7 * 561304900) + 382271488 + (561304900 * i6) + ((-1585293958) * i11) + (792646979 * i13) + ((-792646979) * i17) + ((-231342080) * i4) + (1615200256 * i3) + ((-1821507584) * i5) + (428933120 * i19);
        int i21 = ((i7 * (-96142684)) - 56799437) + (i6 * (-96142684)) + (i11 * 1642) + (i13 * (-821)) + (i17 * 821) + (i4 * (-96141863)) + (i3 * (-1380774991)) + (i5 * (-1175232947)) + (i19 * (-118947840));
        if (i20 + (i21 * i21 * (-1369505792)) != 1) {
            return e(objArr);
        }
        e eVar = (e) objArr[0];
        o.bg.c cVar = (o.bg.c) objArr[1];
        int i22 = 2 % 2;
        int i23 = f20100k;
        int i24 = i23 + 67;
        f20102p = i24 % 128;
        int i25 = i24 % 2;
        eVar.f20106l = cVar;
        int i26 = i23 + 75;
        f20102p = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f20100k;
        int i4 = i3 + 117;
        f20102p = i4 % 128;
        int i5 = i4 % 2;
        Context context = eVar.f20107n;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 39;
        f20102p = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return context;
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
        $$b = 190;
    }

    static void init$1() {
        $$g = new byte[]{53, 97, -95, 41, 56, MessagePack.Code.NIL, -28, 65, MessagePack.Code.BIN8};
        $$h = 27;
    }

    static void init$2() {
        $$c = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$f = 106;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0078 A[PHI: r10
  0x0078: PHI (r10v16 long) = (r10v0 long), (r10v21 long) binds: [B:85:0x0407, B:65:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x040b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ab.e.a():void");
    }

    public final Context b() {
        int i2 = f20096d * 516688844;
        f20096d = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f20095c * 899848972;
        f20095c = i3;
        int i4 = f20094b * 1346498534;
        f20094b = i4;
        return (Context) e(i2, new Object[]{this}, i3, elapsedCpuTime, i4, -353890328, 353890328);
    }

    public abstract c<?> c();

    public final void c(o.bg.c cVar) {
        int i2 = (-1744555904) * f20097e;
        f20097e = i2;
        int i3 = f20093a * (-218124776);
        f20093a = i3;
        int i4 = 961571546 * f20098h;
        f20098h = i4;
        int i5 = 254319963 * f20099i;
        f20099i = i5;
        e(i2, new Object[]{this, cVar}, i4, i3, i5, -1028009023, 1028009024);
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final o.bg.c d() {
        int i2 = 2 % 2;
        int i3 = f20102p;
        int i4 = i3 + 125;
        f20100k = i4 % 128;
        int i5 = i4 % 2;
        o.bg.c cVar = this.f20106l;
        int i6 = i3 + 9;
        f20100k = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    public abstract String e();

    public final void e(Context context) {
        int i2 = 2 % 2;
        int i3 = f20100k + 9;
        int i4 = i3 % 128;
        f20102p = i4;
        int i5 = i3 % 2;
        this.f20107n = context;
        int i6 = i4 + 63;
        f20100k = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void f() throws Throwable {
        String strE;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20102p + 5;
        f20100k = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f20102p + 27;
            f20100k = i5 % 128;
            if (i5 % 2 != 0) {
                strE = e();
                Object[] objArr = new Object[1];
                G("왃\uf667ꘆ嘿۬㚄\ue6bf靝䜌眢", 10790 % TextUtils.getOffsetAfter("", 0), objArr);
                obj = objArr[0];
            } else {
                strE = e();
                Object[] objArr2 = new Object[1];
                G("왃\uf667ꘆ嘿۬㚄\ue6bf靝䜌眢", TextUtils.getOffsetAfter("", 0) + 12329, objArr2);
                obj = objArr2[0];
            }
            f.c(strE, ((String) obj).intern());
        }
        int i6 = f20100k + 63;
        f20102p = i6 % 128;
        int i7 = i6 % 2;
    }

    public final CB g() {
        int i2 = 2 % 2;
        int i3 = f20100k + 81;
        f20102p = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f20104g;
        }
        throw null;
    }

    public final o.en.b h() {
        int i2 = 2 % 2;
        int i3 = f20102p + 109;
        int i4 = i3 % 128;
        f20100k = i4;
        int i5 = i3 % 2;
        o.en.b bVar = this.f20105j;
        int i6 = i4 + 79;
        f20102p = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 26 / 0;
        }
        return bVar;
    }

    public final c<?> i() {
        int i2 = 2 % 2;
        int i3 = f20102p + 89;
        f20100k = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f20108o;
        }
        throw null;
    }

    public final g j() {
        int i2 = 2 % 2;
        int i3 = f20102p + 67;
        f20100k = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f20103f;
        }
        throw null;
    }
}
