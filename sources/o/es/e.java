package o.es;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.f;
import o.a.k;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f25318f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f25319g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25320i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f25321j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25322k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25323l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f25324m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f25325n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f25328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f25330e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f25331h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            int r7 = 114 - r7
            int r0 = r6 * 3
            int r6 = 3 - r0
            byte[] r5 = o.es.e.$$a
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L27
            r0 = r8
            r2 = r3
        L13:
            int r7 = r7 + r0
            r1 = r2
        L15:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            int r6 = r6 + 1
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r5[r6]
            goto L13
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.es.e.$$c(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25324m = 1654295627;
        f25323l = 0;
        f25322k = 1;
        f25319g = new char[]{2314, 2309, 2558, 2556, 2358, 2547, 2305, 2307, 2545, 2546, 2317, 2544, 2557, 2316, 2353, 2356, 2332, 2324, 2550, 2548, 2312, 2339, 2361, 2321, 2323, 2376, 2327, 2341, 2304, 2551, 2326, 2372, 2336, 2306, 2319, 2315, 2345, 2313, 2349, 2318, 2350, 2338};
        f25320i = 2040400228;
        f25321j = true;
        f25318f = true;
        f25325n = -50538338283805891L;
    }

    public e(String str, Long l2, String str2) {
        this.f25329d = str;
        this.f25330e = l2;
        this.f25326a = str2;
        this.f25328c = d.f25311c;
        this.f25327b = null;
        this.f25331h = Boolean.FALSE;
    }

    public e(String str, Long l2, String str2, Integer num, d dVar) {
        this.f25329d = str;
        this.f25330e = l2;
        this.f25326a = str2;
        this.f25327b = num;
        this.f25328c = dVar;
        this.f25331h = Boolean.FALSE;
    }

    public e(String str, Long l2, String str2, Integer num, d dVar, Boolean bool) {
        this.f25329d = str;
        this.f25330e = l2;
        this.f25326a = str2;
        this.f25327b = num;
        this.f25328c = dVar;
        this.f25331h = bool;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] b(android.content.Context r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.es.e.b(android.content.Context, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$b = 118;
    }

    private static void o(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 81;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i7 = i4 + 117;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str4.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f25319g;
        long j2 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(593 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 13180), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -1225586509, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 47))), b2), new Class[]{Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f25320i)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        char c2 = '0';
        if (f25318f) {
            int i9 = $10 + 105;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
                fVar.f19922a = 1;
            } else {
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
                fVar.f19922a = 0;
            }
            while (fVar.f19922a < fVar.f19923e) {
                int i10 = $11 + 57;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b3 = (byte) 0;
                    objA3 = o.d.d.a(457 - TextUtils.lastIndexOf("", c2, 0, 0), (char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionChild(0L) + 12, -1923924106, false, $$c(b3, (byte) (41 | b3), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                c2 = '0';
            }
            objArr[0] = new String(cArr);
            return;
        }
        if (f25321j) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i12 = $11 + 7;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b4 = (byte) 0;
                    objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 458, (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, -1923924106, false, $$c(b4, (byte) ((b4 + 41) - (41 & b4)), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i14 = $11 + 91;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            fVar.f19922a++;
            int i16 = $11 + 39;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        String str5 = new String(cArr6);
        int i18 = $10 + 89;
        $11 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str5;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f25325n ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (true) {
            obj = null;
            if (kVar.f19939c >= cArrC.length) {
                break;
            }
            int i4 = $11 + 85;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i6 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25325n)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(229 - Color.blue(0), (char) (51004 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, 1749983833, false, $$c(b2, (byte) ((b2 + 7) - (7 & b2)), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = o.d.d.a(Process.getGidForName("") + 676, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), 522683165, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        int i7 = $11 + 77;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str3;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public final d a() {
        int i2 = 2 % 2;
        int i3 = f25323l + 33;
        int i4 = i3 % 128;
        f25322k = i4;
        int i5 = i3 % 2;
        d dVar = this.f25328c;
        int i6 = i4 + 113;
        f25323l = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    public final Integer b() {
        int i2 = 2 % 2;
        int i3 = f25323l;
        int i4 = i3 + 5;
        f25322k = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.f25327b;
        int i6 = i3 + 63;
        f25322k = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f25322k + 59;
        int i4 = i3 % 128;
        f25323l = i4;
        int i5 = i3 % 2;
        String str = this.f25329d;
        int i6 = i4 + 107;
        f25322k = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f25322k;
        int i4 = i3 + 51;
        f25323l = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f25326a;
        int i5 = i3 + 3;
        f25323l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long e() {
        int i2 = 2 % 2;
        int i3 = f25323l;
        int i4 = i3 + 67;
        f25322k = i4 % 128;
        int i5 = i4 % 2;
        Long l2 = this.f25330e;
        int i6 = i3 + 121;
        f25322k = i6 % 128;
        int i7 = i6 % 2;
        return l2;
    }

    public final Boolean h() {
        int i2 = 2 % 2;
        int i3 = f25322k;
        int i4 = i3 + 55;
        f25323l = i4 % 128;
        int i5 = i4 % 2;
        Boolean bool = this.f25331h;
        int i6 = i3 + 85;
        f25323l = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }
}
