package o.h;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.k;
import o.g.a;
import o.m.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26250a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26251d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f26252e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f26253f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f26254g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f26255h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26256b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r0 = r7 * 3
            int r7 = 4 - r0
            int r2 = r6 * 3
            int r1 = 1 - r2
            int r0 = r5 * 7
            int r6 = 114 - r0
            byte[] r5 = o.h.d.$$c
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r5 != 0) goto L2b
            r0 = r2
            r1 = r3
        L17:
            int r0 = -r0
            int r6 = r6 + r0
            int r7 = r7 + 1
        L1b:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L17
        L2b:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.d.$$e(byte, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f26255h = -240518703;
        f26254g = 1989861025;
        f26253f = -1259287659;
        init$0();
        f26250a = 0;
        f26251d = 1;
        f26252e = -5912329992011956700L;
    }

    public d(a aVar) {
        this.f26256b = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:96|29|(1:31)(4:32|94|33|(7:35|93|41|(2:43|50)(4:44|85|45|46)|(8:52|89|53|(1:55)(1:74)|(2:57|58)(5:67|87|68|69|70)|59|(1:61)(1:66)|(2:64|65))|75|76)(1:36))|40|93|41|(0)(0)|(0)|75|76) */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x013a: ARITH (r9 I:??[int, boolean]) = (r8 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:10:0x013a */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0464 A[Catch: Exception -> 0x0498, TRY_LEAVE, TryCatch #5 {Exception -> 0x0498, blocks: (B:41:0x0443, B:44:0x0464, B:46:0x0489, B:48:0x0491, B:49:0x0497, B:45:0x046e), top: B:93:0x0443, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x049b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.d.d(int, int):java.lang.Object[]");
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f26252e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26252e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(229 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ImageFormat.getBitsPerPixel(0) + 51005), 9 - KeyEvent.getDeadChar(0, 0), 1749983833, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 675, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (KeyEvent.getMaxKeyCode() >> 16) + 12, 522683165, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        String str3 = new String(cArrC, 4, cArrC.length - 4);
        int i9 = $10 + 81;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
        $$b = 196;
    }

    static void init$1() {
        $$c = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$d = 192;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r0 = r7 * 4
            int r7 = 100 - r0
            int r6 = r9 * 2
            int r0 = r6 + 1
            byte[] r5 = o.h.d.$$a
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L2e
            r1 = r8
            r7 = r6
            r2 = r3
        L16:
            int r7 = r7 + r8
            int r8 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r6) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L29:
            r0 = r5[r8]
            r1 = r8
            r8 = r0
            goto L16
        L2e:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.d.j(short, short, byte, java.lang.Object[]):void");
    }

    public final String a() {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.f26256b.h()) {
            int i3 = f26250a + 57;
            f26251d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 6 / 0;
            }
            return null;
        }
        int i5 = f26251d + 49;
        f26250a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f26256b.c();
        }
        this.f26256b.c();
        obj.hashCode();
        throw null;
    }

    public final i b() {
        int i2 = 2 % 2;
        int i3 = f26251d + 63;
        f26250a = i3 % 128;
        int i4 = i3 % 2;
        a aVar = this.f26256b;
        if (i4 == 0) {
            return aVar.b();
        }
        aVar.b();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final a c() {
        int i2 = 2 % 2;
        int i3 = f26251d;
        int i4 = i3 + 55;
        f26250a = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.f26256b;
        int i6 = i3 + 51;
        f26250a = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26251d + 71;
        f26250a = i3 % 128;
        int i4 = i3 % 2;
        if (!this.f26256b.h()) {
            return null;
        }
        int i5 = f26250a + 125;
        f26251d = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArrE = this.f26256b.e();
        int i7 = f26250a + 115;
        f26251d = i7 % 128;
        int i8 = i7 % 2;
        return bArrE;
    }
}
