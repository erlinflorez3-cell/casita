package o.er;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25153b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f25154c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f25155d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25156e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25157f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25158h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25159i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25160j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r0 = r7 * 6
            int r0 = r0 + 67
            int r1 = r8 * 4
            int r8 = 3 - r1
            byte[] r7 = o.er.r.$$a
            int r2 = r6 * 3
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2f
            r3 = r4
            r1 = r8
            r2 = r5
        L18:
            int r0 = -r3
            int r8 = r8 + r0
            r0 = r8
            r8 = r1
        L1c:
            byte r1 = (byte) r0
            r6[r2] = r1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            int r1 = r8 + 1
            int r2 = r2 + 1
            r3 = r7[r1]
            r8 = r0
            goto L18
        L2f:
            r2 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.r.$$c(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25157f = 0;
        f25160j = 1;
        f25158h = 0;
        f25159i = 1;
        e();
        Color.red(0);
        int i2 = f25157f + 107;
        f25160j = i2 % 128;
        int i3 = i2 % 2;
    }

    public r(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    private String a() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        String strA = this.f25010g.j().a();
        if (strA == null) {
            int i3 = f25158h + 47;
            f25159i = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                int i5 = f25159i + 61;
                f25158h = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    k(71 / View.getDefaultSize(0, 0), null, null, "\u0083\u0089\u008b\u008c\u0084\u0083\u008f\u0082\u008e\u008b\u008a\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                    strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    k(90 << View.resolveSizeAndState(1, 0, 1), null, null, "\u0082\u0084\u0083\u008a\u008a\u008d\u009a\u0095\u0092\u008a\u0091\u008d\u0095\u008e\u0082\u0095\u008a\u0099\u0091\u008d\u009c\u0083\u009b\u0095\u0083\u0092\u008a\u0095\u0083\u0087\u0097\u0095\u0096\u0095\u009b\u0083\u008a\u008d\u008b\u0089\u008e\u0087\u0087\u008d\u0095\u0083\u0086\u008d\u0082\u0095\u0082\u0084\u0083\u008a\u008a\u008d\u009a\u0095\u0082\u008e\u008b\u008a\u008d\u008c\u008b\u008a\u0089\u008d\u0095\u0087\u0086\u0089\u0095\u008a\u0083\u0090\u0095\u008e\u008a\u0095\u0083\u0099\u0098\u008d\u0082\u0097\u0095\u0096\u0095\u0083\u0086\u008d\u0094\u0082\u0084\u0083\u008a\u008a\u008d\u0093\u0082\u008e\u008b\u008a\u008d\u0089\u008b\u008a\u0082\u0083\u0092\u008a\u0091\u0088\u008a\u0083\u0090", objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    k(127 - View.getDefaultSize(0, 0), null, null, "\u0083\u0089\u008b\u008c\u0084\u0083\u008f\u0082\u008e\u008b\u008a\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    k(View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0082\u0084\u0083\u008a\u008a\u008d\u009a\u0095\u0092\u008a\u0091\u008d\u0095\u008e\u0082\u0095\u008a\u0099\u0091\u008d\u009c\u0083\u009b\u0095\u0083\u0092\u008a\u0095\u0083\u0087\u0097\u0095\u0096\u0095\u009b\u0083\u008a\u008d\u008b\u0089\u008e\u0087\u0087\u008d\u0095\u0083\u0086\u008d\u0082\u0095\u0082\u0084\u0083\u008a\u008a\u008d\u009a\u0095\u0082\u008e\u008b\u008a\u008d\u008c\u008b\u008a\u0089\u008d\u0095\u0087\u0086\u0089\u0095\u008a\u0083\u0090\u0095\u008e\u008a\u0095\u0083\u0099\u0098\u008d\u0082\u0097\u0095\u0096\u0095\u0083\u0086\u008d\u0094\u0082\u0084\u0083\u008a\u008a\u008d\u0093\u0082\u008e\u008b\u008a\u008d\u0089\u008b\u008a\u0082\u0083\u0092\u008a\u0091\u0088\u008a\u0083\u0090", objArr4);
                    obj = objArr4[0];
                }
                o.ea.f.d(strIntern, ((String) obj).intern());
            }
            Object[] objArr5 = new Object[1];
            k(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "\u0082\u008e\u008b\u008a\u008d\u0089\u008b\u008a\u0082\u0083\u0092\u008a\u0091\u008d\u009d\u008e\u0082", objArr5);
            strA = ((String) objArr5[0]).intern();
        }
        int i6 = f25159i + 87;
        f25158h = i6 % 128;
        int i7 = i6 % 2;
        return strA;
    }

    static void e() {
        f25154c = new char[]{2316, 2537, 2528, 2517, 2306, 2536, 2514, 2308, 2530, 2515, 2540, 2513, 2532, 2518, 2546, 2542, 2512, 2543, 2551, 2313, 2343, 2344, 2544, 2533, 2539, 2519, 2531, 2529, 2534};
        f25153b = 2040400199;
        f25156e = true;
        f25155d = true;
    }

    static void init$0() {
        $$a = new byte[]{94, -66, 120, 126};
        $$b = 56;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i4 = 2;
        int i5 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr3 = f25154c;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 25;
                $10 = i8 % 128;
                if (i8 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - KeyEvent.keyCodeFromString(""), (char) (13181 - Gravity.getAbsoluteGravity(i6, i6)), 11 - View.MeasureSpec.getSize(i6), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i7 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 593, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13182), View.MeasureSpec.getSize(0) + 11, -1225586509, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i4 = 2;
                i6 = 0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(f25153b)};
        Object objA3 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA3 == null) {
            objA3 = o.d.d.a(32 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        if (f25155d) {
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA4 = o.d.d.a(458 - Color.argb(0, 0, 0, 0), (char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                j2 = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!f25156e) {
            int i9 = 0;
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i9;
                if (fVar.f19922a >= fVar.f19923e) {
                    break;
                }
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i9 = fVar.f19922a + 1;
            }
            String str5 = new String(cArr6);
            int i10 = $10 + 101;
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
                objArr[0] = str5;
                return;
            } else {
                int i11 = 44 / 0;
                objArr[0] = str5;
                return;
            }
        }
        int i12 = $10 + 7;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            i3 = 0;
        } else {
            i3 = 0;
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
        }
        fVar.f19922a = i3;
        while (fVar.f19922a < fVar.f19923e) {
            cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr6 = {fVar, fVar};
            Object objA5 = o.d.d.a(1540807955);
            if (objA5 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objA5 = o.d.d.a(Color.rgb(0, 0, 0) + 16777674, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Color.argb(0, 0, 0, 0) + 11, -1923924106, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f25159i + 115;
        f25158h = i3 % 128;
        int i4 = i3 % 2;
        e eVarJ = this.f25010g.j();
        if (i4 == 0) {
            return eVarJ.d();
        }
        eVarJ.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25159i + 31;
        f25158h = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f25159i + 113;
        f25158h = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public final o.y.b d() {
        int i2 = 2 % 2;
        o.y.b bVar = new o.y.b(a(), this.f25009a, c());
        int i3 = f25159i + 95;
        f25158h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return bVar;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25159i + 3;
        f25158h = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.j()};
        int i5 = f25158h + 109;
        f25159i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return cVarArr;
    }
}
