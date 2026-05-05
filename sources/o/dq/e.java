package o.dq;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.transaction.hce.HceTransactionStatus;
import java.lang.reflect.Method;
import o.a.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Enum<e> implements o.ea.d<HceTransactionStatus> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static final e f23282a;

    /* JADX INFO: renamed from: b */
    public static final e f23283b;

    /* JADX INFO: renamed from: c */
    public static final e f23284c;

    /* JADX INFO: renamed from: d */
    public static final e f23285d;

    /* JADX INFO: renamed from: e */
    public static final e f23286e;

    /* JADX INFO: renamed from: f */
    public static final e f23287f;

    /* JADX INFO: renamed from: g */
    private static char[] f23288g = null;

    /* JADX INFO: renamed from: h */
    private static int f23289h = 0;

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ e[] f23290i;

    /* JADX INFO: renamed from: k */
    private static int f23291k = 0;

    /* JADX INFO: renamed from: l */
    private static boolean f23292l = false;

    /* JADX INFO: renamed from: m */
    private static int f23293m = 0;

    /* JADX INFO: renamed from: n */
    private static boolean f23294n = false;

    /* JADX INFO: renamed from: o */
    private static int f23295o = 0;

    /* JADX INFO: renamed from: q */
    private static int f23296q = 0;

    /* JADX INFO: renamed from: j */
    private final int f23297j;

    /* JADX INFO: renamed from: o.dq.e$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        private static int f23298a = 1;

        /* JADX INFO: renamed from: c */
        private static int f23299c = 0;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f23300d;

        static {
            int[] iArr = new int[e.values().length];
            f23300d = iArr;
            try {
                iArr[e.f23282a.ordinal()] = 1;
                int i2 = f23298a + 85;
                f23299c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23300d[e.f23284c.ordinal()] = 2;
                int i4 = f23299c;
                int i5 = ((i4 + 75) - (75 | i4)) + (i4 | 75);
                f23298a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 4;
                } else {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23300d[e.f23286e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23300d[e.f23285d.ordinal()] = 4;
                int i8 = f23299c;
                int i9 = (i8 ^ 97) + (((-1) - (((-1) - i8) | ((-1) - 97))) << 1);
                f23298a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23300d[e.f23283b.ordinal()] = 5;
                int i12 = f23299c;
                int i13 = (i12 ^ 81) + ((i12 & 81) << 1);
                f23298a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23300d[e.f23287f.ordinal()] = 6;
                int i15 = f23299c;
                int i16 = (((-1) - (((-1) - i15) & ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED))) << 1) - (i15 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED);
                f23298a = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 94 / 0;
                }
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 1
            int r0 = r10 * 6
            int r7 = r0 + 67
            byte[] r6 = o.dq.e.$$a
            int r0 = r9 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r6 != 0) goto L2b
            r0 = r8
            r7 = r5
            r2 = r3
        L16:
            int r5 = r5 + 1
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1b:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L28:
            r0 = r6[r5]
            goto L16
        L2b:
            r1 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dq.e.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23295o = 0;
        f23296q = 1;
        f23293m = 0;
        f23291k = 1;
        b();
        Object[] objArr = new Object[1];
        Object obj = null;
        p(127 - Color.alpha(0), null, null, "\u0093\u0082\u0092\u0091\u0090\u0082\u008f", objArr);
        f23282a = new e(((String) objArr[0]).intern(), 0, 1);
        Object[] objArr2 = new Object[1];
        p(127 - (Process.myTid() >> 22), null, null, "\u0082\u0095\u0091\u0082\u0094\u0082\u0081", objArr2);
        f23284c = new e(((String) objArr2[0]).intern(), 1, 2);
        Object[] objArr3 = new Object[1];
        p(127 - TextUtils.indexOf("", ""), null, null, "\u0088\u0083\u0082\u0092\u008c\u0086\u0083\u0096", objArr3);
        f23286e = new e(((String) objArr3[0]).intern(), 2, 3);
        Object[] objArr4 = new Object[1];
        p(MotionEvent.axisFromString("") + 128, null, null, "\u0098\u0098\u0083\u0086\u0086\u008d\u0097", objArr4);
        f23285d = new e(((String) objArr4[0]).intern(), 3, 4);
        Object[] objArr5 = new Object[1];
        p(126 - Process.getGidForName(""), null, null, "\u0088\u0083\u009a\u008b\u0083\u008c\u0099", objArr5);
        f23283b = new e(((String) objArr5[0]).intern(), 4, 5);
        Object[] objArr6 = new Object[1];
        p(126 - TextUtils.lastIndexOf("", '0', 0), null, null, "\u0088\u0083\u0098\u009a\u0083\u009c\u0083\u009b", objArr6);
        f23287f = new e(((String) objArr6[0]).intern(), 5, 6);
        f23290i = a();
        int i2 = f23295o + 53;
        f23296q = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private e(String str, int i2, int i3) {
        super(str, i2);
        this.f23297j = i3;
    }

    private static /* synthetic */ e[] a() {
        int i2 = 2 % 2;
        int i3 = f23293m;
        int i4 = i3 + 81;
        f23291k = i4 % 128;
        int i5 = i4 % 2;
        e[] eVarArr = {f23282a, f23284c, f23286e, f23285d, f23283b, f23287f};
        int i6 = i3 + 9;
        f23291k = i6 % 128;
        if (i6 % 2 != 0) {
            return eVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f23288g = new char[]{2482, 2475, 2466, 2449, 2473, 2468, 2453, 2469, 2553, 2483, 2470, 2477, 2450, 2527, 2504, 2496, 2472, 2478, 2464, 2476, 2448, 2501, 2484, 2452, 2500, 2455, 2487, 2451};
        f23289h = 2040400153;
        f23292l = true;
        f23294n = true;
    }

    public static e d(int i2) {
        int i3 = 2 % 2;
        int i4 = f23293m + 35;
        f23291k = i4 % 128;
        int i5 = i4 % 2;
        for (e eVar : values()) {
            if (eVar.f23297j == i2) {
                return eVar;
            }
        }
        int i6 = f23291k + 7;
        f23293m = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{17, -84, -78, -70};
        $$b = JfifUtil.MARKER_APP1;
    }

    private static void p(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = $11 + 115;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = str4;
        if (str4 != null) {
            byte[] bytes = str4.getBytes("ISO-8859-1");
            int i8 = $11 + 41;
            $10 = i8 % 128;
            obj = bytes;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
                obj = bytes;
            }
        }
        byte[] bArr = (byte[]) obj;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f23288g;
        long j2 = 0;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i11 % 128;
                int i12 = i11 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(641 - AndroidCharacter.getMirror(c2), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13181), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 10, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i4 = 2;
                    j2 = 0;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f23289h)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(31 - MotionEvent.axisFromString(""), (char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        int i13 = 1540807955;
        if (f23294n) {
            int i14 = $11 + 23;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i16 = $11 + 23;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 3 % 5;
            }
            while (fVar.f19922a < fVar.f19923e) {
                int i18 = $11 + 77;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - Color.blue(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f23292l) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i20 = $11 + 25;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[fVar.f19923e % fVar.f19922a] >> i2] << iIntValue);
                    i3 = fVar.f19922a >> 1;
                } else {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i3 = fVar.f19922a + 1;
                }
                fVar.f19922a = i3;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i21 = $10 + 77;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(i13);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA4 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 457, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 10 - MotionEvent.axisFromString(""), -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i13 = 1540807955;
        }
        objArr[0] = new String(cArr6);
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23291k + 73;
        f23293m = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) Enum.valueOf(e.class, str);
        if (i4 == 0) {
            return eVar;
        }
        throw null;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = f23291k + 87;
        f23293m = i3 % 128;
        int i4 = i3 % 2;
        e[] eVarArr = (e[]) f23290i.clone();
        int i5 = f23291k + 47;
        f23293m = i5 % 128;
        int i6 = i5 % 2;
        return eVarArr;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f23291k;
        int i4 = i3 + 43;
        f23293m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f23297j;
        int i7 = i3 + 59;
        f23293m = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final HceTransactionStatus d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23291k + 115;
        f23293m = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass2.f23300d[ordinal()]) {
            case 1:
                return HceTransactionStatus.OnGoing;
            case 2:
                return HceTransactionStatus.Unknown;
            case 3:
                return HceTransactionStatus.Declined;
            case 4:
                HceTransactionStatus hceTransactionStatus = HceTransactionStatus.Success;
                int i5 = f23293m + 9;
                f23291k = i5 % 128;
                if (i5 % 2 != 0) {
                    return hceTransactionStatus;
                }
                throw null;
            case 5:
                return HceTransactionStatus.Cleared;
            case 6:
                HceTransactionStatus hceTransactionStatus2 = HceTransactionStatus.Reversed;
                int i6 = f23291k + 43;
                f23293m = i6 % 128;
                int i7 = i6 % 2;
                return hceTransactionStatus2;
            default:
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                p((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, null, "\u0089\u008e\u0083\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23293m + 115;
        f23291k = i3 % 128;
        int i4 = i3 % 2;
        HceTransactionStatus hceTransactionStatusD = d();
        int i5 = f23291k + 87;
        f23293m = i5 % 128;
        int i6 = i5 % 2;
        return hceTransactionStatusD;
    }
}
