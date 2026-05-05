package o.dk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.antelopsecurecmodule.ScmJni;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.a.i;
import o.a.k;
import o.d.d;
import o.ea.f;
import o.ef.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23147a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23148b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23149c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23150d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23151e = 0;

    /* JADX INFO: renamed from: f */
    public static int f23152f = 0;

    /* JADX INFO: renamed from: g */
    private static boolean f23153g = false;

    /* JADX INFO: renamed from: i */
    private static int f23154i = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f23155j = null;

    /* JADX INFO: renamed from: k */
    private static int f23156k = 0;

    /* JADX INFO: renamed from: l */
    private static char f23157l = 0;

    /* JADX INFO: renamed from: m */
    private static boolean f23158m = false;

    /* JADX INFO: renamed from: n */
    private static long f23159n = 0;

    /* JADX INFO: renamed from: o */
    private static long f23160o = 0;

    /* JADX INFO: renamed from: p */
    private static int f23161p = 0;

    /* JADX INFO: renamed from: q */
    private static int f23162q = 0;

    /* JADX INFO: renamed from: r */
    private static int f23163r = 0;

    /* JADX INFO: renamed from: s */
    private static int f23164s = 0;

    /* JADX INFO: renamed from: h */
    private final ScmJni f23165h;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, byte r11) {
        /*
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r8 = o.dk.a.$$a
            int r0 = r9 * 2
            int r7 = r0 + 3
            int r6 = 122 - r10
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2a
            r0 = r3
            r2 = r4
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r7 = r7 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r6
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r8[r7]
            goto L15
        L2a:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dk.a.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23152f = 1868176307;
        f23148b = -287059619;
        f23147a = 660135076;
        f23150d = -2074744104;
        f23149c = 1278370378;
        f23151e = 835246332;
        f23164s = 0;
        f23163r = 1;
        f23161p = 0;
        f23162q = 1;
        a();
        b();
        ViewConfiguration.getEdgeSlop();
        int i2 = f23163r + 107;
        f23164s = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public a(Context context) {
        this.f23165h = new ScmJni(context);
    }

    static void a() {
        f23159n = 1747953790115140381L;
    }

    static void b() {
        f23155j = new char[]{2541, 2525, 2499, 2532, 2496, 2503, 2537, 2508, 2527, 2510, 2523, 2557, 2498, 2521, 2334, 2520, 2497, 2487, 2506, 2305, 2522, 2548, 2542, 2529, 2524, 2507, 2509, 2528, 2535, 2501, 2486, 2504, 2559, 2500, 2505, 2502, 2307, 2331, 2538, 2554, 2534};
        f23154i = 2040400190;
        f23153g = true;
        f23158m = true;
        f23160o = -6016285614915832113L;
        f23156k = 1564493270;
        f23157l = (char) 17878;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        try {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                t((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                t(128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, "\u009b¦\u008f\u0096\u008f\u0089\u0093\u0089\u0095\u008f\u0093\u009a\u008a\u0085\u0086\u008f\u0082\u0089\u0083\u008f¥\u008f\u009b¦\u008f\u0096\u008f\u0095\u0086\u008f\u008a\u008a\u0089\u008f \u0083\u008b\u008f¥\u008f¤\u009b\u008b\u0088\u0090\u008b\u0088\u008f\u0082\u0089\u0083\u008f\u008d \u0093\u008f\u0090\u0091\u008f\u0099\u0086\u008d\u008f\u008c\u008f\u008e\u0085\u0086\u0092\u0090\u0086\u0093\u0091\u0085\u008f", objArr3);
                f.c(strIntern, String.format(((String) objArr3[0]).intern(), str, str2));
                int i3 = f23162q + 65;
                f23161p = i3 % 128;
                int i4 = i3 % 2;
            }
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr4 = new Object[1];
            t(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "\u0095\u009d\u0085\u0091\u0086\u0093\u0089\u0082\u0086\u008d\u008a\u008a¡ \u0083\u008b", objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) str);
            Object[] objArr5 = new Object[1];
            t(Color.alpha(0) + 127, null, null, "\u0089\u0093\u0089¨\u008d §\u009b\u0093 ", objArr5);
            aVar2.a(((String) objArr5[0]).intern(), (Object) str2);
            aVar.a(50, 0, aVar2.e(), null, null, null, null);
            return null;
        } catch (b e2) {
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                t(127 - View.resolveSize(0, 0), null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                u((char) (63553 - TextUtils.getOffsetAfter("", 0)), "민䀭ꂛ凉䅤鯁鋓䡸療蘀\uf587ᴺ횧頍ퟑ섓巎\u0fe3焿㵏㇣嘹溜\uec2d賨ꬻ넿嗦输荼詵觝家ꕖ蟥\ue1db\uf5da륟ﶗ芢啠凴反\u2e6d㬝낿扷渼ꆪ⓱쯌ꎑ洮솈뛤犦", "猙苦隸ꛆ", "\uf5aa\uea55䆭\u05f8", View.getDefaultSize(0, 0), objArr7);
                f.e(strIntern2, ((String) objArr7[0]).intern(), e2);
                int i5 = f23162q + 97;
                f23161p = i5 % 128;
                int i6 = i5 % 2;
            }
            return null;
        }
    }

    private static byte[] d(byte[] bArr) {
        Object[] objArr = {bArr};
        int i2 = f23151e * 1463628945;
        f23151e = i2;
        int i3 = 1625579106 * f23149c;
        f23149c = i3;
        int i4 = f23150d * (-736202846);
        f23150d = i4;
        int i5 = (-468198012) * f23147a;
        f23147a = i5;
        return (byte[]) e(i3, i5, objArr, -228205291, 228205291, i2, i4);
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~((-1) - (((-1) - (~i6)) & ((-1) - i5)));
        int i9 = ~((-1) - (((-1) - (~i5)) & ((-1) - i4)));
        int i10 = (-1) - (((-1) - i9) & ((-1) - i8));
        int i11 = ~i4;
        int i12 = i9 | (~((i11 + i5) - (i11 & i5)));
        int i13 = i5 + i4 + i2 + (762724209 * i7) + (1201824936 * i3);
        int i14 = i13 * i13;
        int i15 = ((-126223985) * i5) + 43253760 + (1339426419 * i4) + ((-1465650404) * i8) + (1465650404 * i10) + (1414658446 * i12) + ((-1540882432) * i2) + (1302855680 * i7) + (1514143744 * i3) + (1905524736 * i14);
        int i16 = ((i5 * 162561953) - 555857873) + (i4 * 162559997) + (i8 * 1956) + (i10 * (-1956)) + (i12 * 978) + (i2 * 162560975) + (i7 * 701011807) + (i3 * 237771736) + (i14 * (-223608832));
        if (i15 + (i16 * i16 * 703332352) == 1) {
            return d(objArr);
        }
        byte[] bArr = (byte[]) objArr[0];
        int i17 = 2 % 2;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        int i18 = length - 16;
        byte[] bArr2 = new byte[i18];
        int i19 = f23161p + 39;
        f23162q = i19 % 128;
        int i20 = i19 % 2;
        for (int i21 = 0; i21 < i18; i21++) {
            bArr2[i21] = (byte) ((bArr[i21 + 16] ^ bArr[i21]) ^ ((i21 + 42) % 256));
        }
        int i22 = length - 17;
        while (i22 > 0) {
            int i23 = f23162q + 9;
            f23161p = i23 % 128;
            int i24 = i23 % 2;
            if (bArr2[i22] == -128) {
                break;
            }
            i22--;
        }
        return Arrays.copyOf(bArr2, i22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0016, code lost:
    
        if (r11.length == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x001a, code lost:
    
        if (r11.length == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x001d, code lost:
    
        r0 = new java.lang.Object[1];
        v("녲Ꮱ\ue035넘틧ĕ抍䕁듀풑栺䢧먿\udf0c湚丌ꇟ쇴珄呹ꝡ쑃祹寕괬컳纁愰邵\uf083", -android.text.TextUtils.lastIndexOf("", '0', 0, 0), r0);
        r8 = java.lang.Class.forName((java.lang.String) r0[0]).getDeclaredConstructor(null).newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x003e, code lost:
    
        r4 = 16;
        r7 = new byte[16];
        r1 = o.dk.a.f23162q + 73;
        o.dk.a.f23161p = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x004b, code lost:
    
        r0 = new java.lang.Object[1];
        v("ڣ픢ḩۍᐠ庱鲟\u1af0ͽቘ阷ᜅ෨", 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), r0);
        java.util.Random.class.getMethod((java.lang.String) r0[0], byte[].class).invoke(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006f, code lost:
    
        r3 = r11.length + 17;
        r0 = r3 % 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0074, code lost:
    
        if (r0 <= 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0076, code lost:
    
        r3 = r3 + (16 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0079, code lost:
    
        r2 = new byte[r3];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007c, code lost:
    
        if (r5 >= 16) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007e, code lost:
    
        r2[r5] = r7[r5];
        r5 = r5 + 1;
        r1 = o.dk.a.f23162q + 113;
        o.dk.a.f23161p = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008d, code lost:
    
        if ((r1 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008f, code lost:
    
        r0 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0095, code lost:
    
        if (r5 >= r11.length) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0097, code lost:
    
        r2[r5 + 16] = r11[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a0, code lost:
    
        r2[r11.length + 16] = -128;
        r5 = r11.length + 17;
        r1 = o.dk.a.f23161p + 3;
        o.dk.a.f23162q = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b2, code lost:
    
        if (r5 >= r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b4, code lost:
    
        r1 = o.dk.a.f23161p + 105;
        o.dk.a.f23162q = r1 % 128;
        r1 = r1 % 2;
        r2[r5] = 0;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c2, code lost:
    
        if (r4 >= r3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c4, code lost:
    
        r1 = o.dk.a.f23162q + 73;
        o.dk.a.f23161p = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cd, code lost:
    
        if ((r1 % 2) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00cf, code lost:
    
        r2[r4] = (byte) ((r2[r4 << 47] ^ r2[r4]) ^ ((r4 >> 114) % 18425));
        r4 = r4 + 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e1, code lost:
    
        r2[r4] = (byte) ((r2[r4 - 16] ^ r2[r4]) ^ ((r4 + 26) % 256));
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f3, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f4, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f5, code lost:
    
        r0 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f9, code lost:
    
        if (r0 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fc, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] e(byte[] r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dk.a.e(byte[]):byte[]");
    }

    static void init$0() {
        $$a = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$b = 64;
    }

    private static void t(int i2, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object obj = str3;
        if (str3 != null) {
            char[] charArray = str3.toCharArray();
            int i5 = $10 + 57;
            $11 = i5 % 128;
            obj = charArray;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
                obj = charArray;
            }
        }
        char[] cArr = (char[]) obj;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f23155j;
        if (cArr2 != null) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 21;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 594, (char) (13181 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -1225586509, false, $$c(b2, (byte) ((b2 + 55) - (55 & b2)), b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 2;
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
        Object[] objArr3 = {Integer.valueOf(f23154i)};
        Object objA2 = d.a(-1503702982);
        if (objA2 == null) {
            objA2 = d.a(KeyEvent.normalizeMetaState(0) + 32, (char) (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23158m) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i12 = $11 + 13;
            $10 = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                int i15 = $10 + 123;
                $11 = i15 % 128;
                int i16 = i15 % i13;
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b3 = (byte) 0;
                    objA3 = d.a(KeyEvent.normalizeMetaState(0) + 458, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 11 - TextUtils.getOffsetBefore("", 0), -1923924106, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 49))), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i13 = 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f23153g) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i17 = $11 + 123;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = d.a(1540807955);
            if (objA4 == null) {
                byte b4 = (byte) 0;
                objA4 = d.a(457 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1923924106, false, $$c(b4, (byte) (49 | b4), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static void u(char c2, String str, String str2, String str3, int i2, Object[] objArr) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11 + 65;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj = null;
        Object charArray = str6;
        if (str6 != null) {
            int i7 = i5 + 25;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str6.toCharArray();
                throw null;
            }
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i8 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1)) + 106;
                    char defaultSize = (char) View.getDefaultSize(i8, i8);
                    int iIndexOf = 11 - TextUtils.indexOf("", "", i8, i8);
                    byte b2 = (byte) i8;
                    String str$$c = $$c(b2, (byte) (57 | b2), b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i8] = Object.class;
                    objA = d.a(i9, defaultSize, iIndexOf, -155898465, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    int doubleTapTimeout = 847 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char cIndexOf = (char) (6488 - TextUtils.indexOf("", "", i8));
                    int i10 = (TypedValue.complexToFloat(i8) > 0.0f ? 1 : (TypedValue.complexToFloat(i8) == 0.0f ? 0 : -1)) + 12;
                    byte b3 = (byte) i8;
                    String str$$c2 = $$c(b3, (byte) (54 | b3), b3);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i8] = Object.class;
                    objA2 = d.a(doubleTapTimeout, cIndexOf, i10, -694521287, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i11 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i8] = iVar;
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    int longPressTimeout = 458 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i8));
                    int gidForName = Process.getGidForName("") + 12;
                    byte b4 = (byte) i8;
                    String str$$c3 = $$c(b4, (byte) (56 | b4), b4);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i8] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objA3 = d.a(longPressTimeout, bitsPerPixel, gidForName, 1804962841, false, str$$c3, clsArr3);
                }
                ((Method) objA3).invoke(null, objArr4);
                int i12 = cArr3[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i8] = Integer.valueOf(i12);
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 639;
                    char cArgb = (char) (65100 - Color.argb(i8, i8, i8, i8));
                    int edgeSlop = 12 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b5 = (byte) i8;
                    byte b6 = b5;
                    String str$$c4 = $$c(b5, b6, b6);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i8] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objA4 = d.a(fadingEdgeLength, cArgb, edgeSlop, 1636969060, false, str$$c4, clsArr4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f23156k) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23160o ^ 740602047300126166L))) ^ ((long) ((char) (((long) f23157l) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i13 = $10 + 3;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                obj = null;
                i8 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i15 = $10 + 65;
        $11 = i15 % 128;
        if (i15 % 2 != 0) {
            objArr[0] = str7;
        } else {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static void v(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        Object charArray = str2 != null ? str2.toCharArray() : str2;
        k kVar = new k();
        char[] cArrC = k.c(f23159n ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i3 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23159n)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(Color.alpha(0) + 229, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51004), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1749983833, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 15))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i3] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(Color.argb(0, 0, 0, 0) + 675, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, 522683165, false, $$c(b3, (byte) (8 | b3), b3), new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(int r26, int r27, java.lang.String r28, byte[] r29, byte[] r30, byte[] r31, byte[][] r32) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dk.a.a(int, int, java.lang.String, byte[], byte[], byte[], byte[][]):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.dk.a.f23162q
            int r1 = r0 + 111
            int r0 = r1 % 128
            o.dk.a.f23161p = r0
            int r1 = r1 % r8
            r7 = 0
            r3 = 0
            r12 = r18
            if (r1 == 0) goto L7a
            boolean r1 = o.ea.f.a()
            r0 = 54
            int r0 = r0 / r7
            if (r1 == 0) goto L60
        L1b:
            int r0 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r0 = r0 >> 16
            int r2 = 127 - r0
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            t(r2, r3, r3, r0, r1)
            r0 = r1[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r0.intern()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = android.os.Process.getThreadPriority(r7)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r2 = 127 - r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u008f\u0096\u008f\u009b\u009a\u0093\u0089\u0093\u0081\u0083 \u008c¤\u009b\u008b\u0088\u0090\u008b\u0088"
            t(r2, r3, r3, r0, r1)
            r0 = r1[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r5, r0)
        L60:
            r15 = 0
            r16 = 0
            r10 = 14
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r17
            java.lang.String r2 = r9.a(r10, r11, r12, r13, r14, r15, r16)
            int r0 = o.dk.a.f23161p
            int r1 = r0 + 3
            int r0 = r1 % 128
            o.dk.a.f23162q = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L81
            return r2
        L7a:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L60
            goto L1b
        L81:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dk.a.b(java.lang.String):java.lang.String");
    }

    public final void b(String str, String str2) {
        int iMyTid = Process.myTid();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i2 = f23148b * (-1682837595);
        f23148b = i2;
        int i3 = f23152f * 1101516236;
        f23152f = i3;
        e(iMaxMemory, i3, new Object[]{this, str, str2}, -615792644, 615792645, iMyTid, i2);
    }

    public final String c(String str) {
        int i2 = 2 % 2;
        int i3 = f23162q + 77;
        f23161p = i3 % 128;
        int i4 = i3 % 2;
        String strA = a(12, 6, str, null, null, null, null);
        int i5 = f23161p + 13;
        f23162q = i5 % 128;
        if (i5 % 2 != 0) {
            return strA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final byte[] c(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23161p + 27;
        f23162q = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            t(Color.rgb(0, 0, 0) + 16777343, null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            t((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u008f\u0096\u008f\u0085\u0086\u0097\u0095\u0086\u0088\u0099\u0092©\u009e\u0082\u008b¤\u0082", objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(o.dl.d.e(bArr)).toString());
            int i5 = f23161p + 49;
            f23162q = i5 % 128;
            int i6 = i5 % 2;
        }
        byte[] bArrE = e(bArr);
        Object[] objArr3 = {this.f23165h.c(bArrE)};
        int i7 = f23151e * 1463628945;
        f23151e = i7;
        int i8 = 1625579106 * f23149c;
        f23149c = i8;
        int i9 = f23150d * (-736202846);
        f23150d = i9;
        int i10 = (-468198012) * f23147a;
        f23147a = i10;
        byte[] bArr2 = (byte[]) e(i8, i10, objArr3, -228205291, 228205291, i7, i9);
        o.by.b.d(bArr);
        o.by.b.d(bArrE);
        return bArr2;
    }

    public final void d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23161p + 117;
        f23162q = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f23161p + 7;
            f23162q = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            t(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "\ue848紳쀞觟ꋉ\ue95b挀ꍏ큠䦓祧\uf305貿껊뙔ﰾꘊⱗ줷\ue9e2", "猙苦隸ꛆ", "搬\uf46c⯮ꋿ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f23162q + 37;
            f23161p = i7 % 128;
            int i8 = i7 % 2;
        }
        ScmJni scmJni = this.f23165h;
        ScmJni.f18676c = false;
        scmJni.spn(true, "");
    }

    public final void d(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        try {
            if (f.a()) {
                Object[] objArr = new Object[1];
                t(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                t(127 - View.resolveSize(0, 0), null, null, "\u0096\u008f\u0095\u009d\u008f\u008a\u008a¡ \u0083\u008b\u008f\u0090\u0091\u008f\u0085\u0091\u0086\u0093\u0089\u0088\u0086\u008a\u009f\u008b\u0094\u0085\u0091\u0086\u0093\u008a\u0083\u009a\u009b\u0085\u0091\u0082\u008f\u0092\u008b\u009e\u008f\u0090\u0091\u008f\u0099\u0086\u008d\u008f\u008c\u008f\u008e\u0085\u0086\u0092\u0090\u0086\u0093\u0091\u0085\u008f", objArr2);
                StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern()).append(str);
                Object[] objArr3 = new Object[1];
                u((char) (ViewConfiguration.getTapTimeout() >> 16), "ꒋధ﵆\uf68a苨ᵠ⪬", "猙苦隸ꛆ", "ꧩ瘸□뛜", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1586087766, objArr3);
                f.c(strIntern, sbAppend.append(((String) objArr3[0]).intern()).append(i2).toString());
            }
            o.ef.a aVar = new o.ef.a();
            Object[] objArr4 = new Object[1];
            t((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u0095\u009d\u0085\u0091\u0086\u0093\u0089\u0082\u0086\u008d\u008a\u008a¡ \u0083\u008b", objArr4);
            aVar.a(((String) objArr4[0]).intern(), (Object) str);
            Object[] objArr5 = new Object[1];
            u((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 26570), "㭎㽭\ufe6f", "猙苦隸ꛆ", "녘ᵋ줂\uec67", 35474353 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
            aVar.c(((String) objArr5[0]).intern(), i2);
            a(50, 0, aVar.e(), null, null, null, null);
            int i4 = f23161p + 93;
            f23162q = i4 % 128;
            int i5 = i4 % 2;
        } catch (b e2) {
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                t(126 - Process.getGidForName(""), null, null, "\u0088\u008b\u008a\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                t(127 - TextUtils.getOffsetAfter("", 0), null, null, "\u008c\u008f\u0099\u0086\u008d\u008f\u0091\u0093\u008f\u0085\u0091\u0086\u0093\u0089\u0088\u0086\u008a\u009f\u008b\u0094\u0085\u0091\u0086\u0093\u008a\u0083\u009a\u009b\u0085\u0091\u0082\u008f\u0092\u008b\u009e\u008f\u008e\u0085\u0086\u0092\u0090\u0086\u0093\u0091\u0085\u008f\u008b\u008d\u0086¤£\u008f\u0085\u0091\u0086\u0093\u008a\u008b\u0082\u009f\u008b\u008f\u0085\u0091\u009b¢\u008f", objArr7);
                f.e(strIntern2, ((String) objArr7[0]).intern(), e2);
            }
            int i6 = f23161p + 17;
            f23162q = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final String e(String str) {
        int i2 = 2 % 2;
        int i3 = f23161p + 13;
        f23162q = i3 % 128;
        return i3 % 2 == 0 ? a(88, 4, str, null, null, null, null) : a(12, 5, str, null, null, null, null);
    }
}
