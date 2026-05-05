package fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.List;
import o.a.g;
import o.ap.h;
import o.ea.j;
import o.es.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements o.es.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f18622a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f18623b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f18624c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18625d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f18626e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18627f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18628g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18629h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18630i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r9, int r10, short r11) {
        /*
            int r0 = r10 * 3
            int r8 = 4 - r0
            byte[] r7 = fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.c.$$c
            int r0 = r9 * 3
            int r6 = 72 - r0
            int r5 = r11 * 2
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L2c
            r1 = r8
            r6 = r5
            r2 = r3
        L16:
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r7[r8]
            r1 = r8
            r8 = r0
            goto L16
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.c.$$g(byte, int, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f18628g = 1408396775;
        init$0();
        f18627f = 0;
        f18629h = 1;
        f18625d = 0;
        f18630i = 1;
        e();
        Process.getGidForName("");
        int i2 = f18627f + 107;
        f18629h = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static c d() {
        int i2 = 2 % 2;
        int i3 = f18625d + 11;
        f18630i = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static void e() {
        f18623b = (char) 48459;
        f18626e = (char) 3218;
        f18622a = (char) 38592;
        f18624c = (char) 25793;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ETB, 117, 49, -107};
        $$b = 104;
    }

    static void init$1() {
        $$d = new byte[]{49, 53, Ascii.ETB, 7, MessagePack.Code.BIN16, 57, 6, MessagePack.Code.INT64, 58, MessagePack.Code.EXT16, 19};
        $$e = 163;
    }

    static void init$2() {
        $$c = new byte[]{101, -104, -88, -105};
        $$f = 60;
    }

    private static void j(short s2, short s3, short s4, Object[] objArr) {
        int i2 = s3 * 3;
        int i3 = 101 - s4;
        byte[] bArr = $$a;
        int i4 = s2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4 = i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i6 = i4 + 1;
                i3 += bArr[i6];
                i4 = i6;
            }
        }
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i6 = $10 + 123;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 % 2;
        }
        while (gVar.f19924d < cArr.length) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            cArr3[i5] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i10 = 58224;
            int i11 = i5;
            while (i11 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i12 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) f18622a) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f18624c);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 269;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5) + 1);
                        int iRgb = (-16777205) - Color.rgb(i5, i5, i5);
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(i14, cIndexOf, iRgb, -1995022631, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f18623b) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18626e)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 270, (char) (TextUtils.lastIndexOf("", '0') + 1), 11 - TextUtils.indexOf("", ""), -1995022631, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 270;
                char cGreen = (char) Color.green(0);
                int defaultSize = 11 - View.getDefaultSize(0, 0);
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$g2 = $$g(b6, b7, b7);
                i3 = 2;
                objA3 = o.d.d.a(minimumFlingVelocity, cGreen, defaultSize, -2074123590, false, str$$g2, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void l(byte b2, int i2, int i3, Object[] objArr) {
        int i4 = i3 * 7;
        byte[] bArr = $$d;
        int i5 = i2 + 4;
        int i6 = (b2 * 10) + 101;
        byte[] bArr2 = new byte[8 - i4];
        int i7 = 7 - i4;
        int i8 = -1;
        if (bArr == null) {
            i6 = (i5 + i6) - 6;
            i5 = i5;
        }
        while (true) {
            int i9 = i5 + 1;
            i8++;
            bArr2[i8] = (byte) i6;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i6 = (i6 + bArr[i9]) - 6;
                i5 = i9;
            }
        }
    }

    @Override // o.es.b
    public final void a(Activity activity, String str) {
        int i2 = 2 % 2;
        int i3 = f18630i + 29;
        f18625d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.es.c
    public final void a(c.a<String> aVar) {
        int i2 = 2 % 2;
        int i3 = f18625d + 31;
        f18630i = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.es.c
    public final void b(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f18630i + 91;
        f18625d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.es.c
    public final void c(c.a<List<o.es.e>> aVar) {
        int i2 = 2 % 2;
        int i3 = f18625d + 29;
        f18630i = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.es.c
    public final void d(Activity activity, c.a<Object> aVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f18625d + 53;
        f18630i = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0650  */
    @Override // o.es.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(o.es.c.a<o.es.c.e> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.antelophcelibrary.wallet.paymentresources.cardmanager.digitalcard.samsungpay.c.d(o.es.c$a):void");
    }

    @Override // o.es.c
    public final /* synthetic */ void e(Activity activity, c.InterfaceC0350c interfaceC0350c, j jVar, o.ep.d dVar, o.es.e eVar, h.e eVar2, o.ea.h hVar) {
        int i2 = 2 % 2;
        int i3 = f18625d + 103;
        int i4 = i3 % 128;
        f18630i = i4;
        if (i3 % 2 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = i4 + 17;
        f18625d = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.es.c
    public final void e(c.a<String> aVar) {
        int i2 = 2 % 2;
        int i3 = f18630i + 93;
        f18625d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
