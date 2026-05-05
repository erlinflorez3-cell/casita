package o.et;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.lang.reflect.Method;
import o.a.k;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends c {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static final byte[] $$l = null;
    private static final int $$o = 0;
    private static final byte[] $$p = null;
    private static final int $$q = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int B = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25376g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f25377i = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f25378x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f25379z = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f25380h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f25381j;

    private static String $$r(byte b2, byte b3, int i2) {
        int i3 = 3 - (b2 * 4);
        int i4 = b3 * 4;
        byte[] bArr = $$l;
        int i5 = (i2 * 7) + 107;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i3 + i5;
            i3 = i3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i3 + 1;
            i5 = bArr[i8] + i5;
            i3 = i8;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        B = 0;
        f25379z = 1;
        f25376g = 0;
        f25378x = 1;
        b();
        KeyEvent.keyCodeFromString("");
        int i2 = B + 83;
        f25379z = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    public i(String str, String str2, int i2, String str3) {
        super(str, o.dp.b.f23220i, str2, i2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void O(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 99
            byte[] r6 = o.et.i.$$g
            int r0 = r8 * 3
            int r5 = 4 - r0
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r6 != 0) goto L2b
            r0 = r5
            r7 = r2
            r1 = r3
        L16:
            int r5 = r5 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L26:
            int r1 = r1 + 1
            r0 = r6[r5]
            goto L16
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.i.O(byte, byte, int, java.lang.Object[]):void");
    }

    private static void Q(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f25377i ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25377i)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - View.getDefaultSize(0, 0), (char) (KeyEvent.keyCodeFromString("") + 51004), 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1749983833, false, $$r(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 675, (char) Color.green(0), Color.red(0) + 12, 522683165, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void R(int r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = 97 - r0
            byte[] r7 = o.et.i.$$p
            int r0 = r10 * 4
            int r6 = r0 + 1
            int r0 = r9 * 4
            int r5 = r0 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L2c
            r2 = r5
            r1 = r3
        L15:
            int r5 = r5 + 1
            int r8 = r8 + r2
        L18:
            byte r0 = (byte) r8
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L27:
            r0 = r7[r5]
            r2 = r8
            r8 = r0
            goto L15
        L2c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.i.R(int, int, byte, java.lang.Object[]):void");
    }

    static void b() {
        f25377i = -1744451081070385895L;
    }

    private o.fc.d d(String str) {
        int i2 = 2 % 2;
        o.fc.d dVar = new o.fc.d(k(), str, false);
        Integer num = this.f25380h;
        if (num != null) {
            int i3 = f25376g + 85;
            f25378x = i3 % 128;
            if (i3 % 2 == 0) {
                dVar.a(num.intValue());
                int i4 = 45 / 0;
            } else {
                dVar.a(num.intValue());
            }
        }
        int i5 = f25376g + 47;
        f25378x = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return dVar;
    }

    static void init$0() {
        $$g = new byte[]{113, 10, 2, -109};
        $$h = 140;
    }

    static void init$1() {
        $$p = new byte[]{85, Ascii.RS, 127, 42};
        $$q = 21;
    }

    static void init$2() {
        $$l = new byte[]{5, Ascii.SO, 124, -17};
        $$o = JfifUtil.MARKER_RST7;
    }

    @Override // o.et.c
    public final byte[] F() {
        int i2 = 2 % 2;
        int i3 = f25378x + 91;
        f25376g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25376g + 91;
        f25378x = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceVts;
        int i5 = f25378x + 25;
        f25376g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return emvApplicationType;
    }

    @Override // o.et.c
    protected final c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        i iVar = new i(str, str2, i2, str3);
        int i4 = f25376g + 101;
        f25378x = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte r22) {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.et.i.b(byte):void");
    }

    public final Integer c() {
        int i2 = 2 % 2;
        int i3 = f25376g;
        int i4 = i3 + 7;
        f25378x = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.f25380h;
        int i5 = i3 + 91;
        f25378x = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // o.eq.b
    public final /* synthetic */ o.eu.d c(String str) {
        int i2 = 2 % 2;
        int i3 = f25376g + 73;
        f25378x = i3 % 128;
        int i4 = i3 % 2;
        o.fc.d dVarD = d(str);
        int i5 = f25376g + 5;
        f25378x = i5 % 128;
        int i6 = i5 % 2;
        return dVarD;
    }

    public final void d(Integer num) {
        int i2 = 2 % 2;
        int i3 = f25376g;
        int i4 = i3 + 9;
        f25378x = i4 % 128;
        int i5 = i4 % 2;
        this.f25380h = num;
        int i6 = i3 + 87;
        f25378x = i6 % 128;
        int i7 = i6 % 2;
    }
}
