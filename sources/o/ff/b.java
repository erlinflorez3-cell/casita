package o.ff;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.i;
import o.a.n;
import o.d.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f25845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f25846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f25847e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25848g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f25849h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f25850i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f25851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f25852k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25853l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f25854m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25855n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25856o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25857f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r0 = 122 - r7
            int r1 = r8 * 4
            int r8 = 4 - r1
            byte[] r7 = o.ff.b.$$a
            int r2 = r6 * 2
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2b
            r3 = r5
            r2 = r4
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            int r8 = r8 + 1
        L19:
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            int r3 = r3 + 1
            r1 = r7[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2b:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ff.b.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25855n = 0;
        f25856o = 1;
        f25854m = 0;
        f25853l = 1;
        e();
        Object[] objArr = new Object[1];
        q(12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\r\u000f\b\uffef\uffff\u0010\u0003\u000e�ￛ\ufffe\uffff", true, 282 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        p((char) (48238 - TextUtils.getOffsetBefore("", 0)), "꒱伅蚓覬穒榄⿕ᬐ\uf57c⣙湤ｩ쏱", "\u0000\u0000\u0000\u0000", "筫汏滥厼", (-445886597) - View.combineMeasuredStates(0, 0), objArr2);
        f25845c = new b(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        q(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, "\uffff\uffdf\u0004\u000e\ufffe￼\r\uffff\u0000\uffff\ufff0\t\u0010\u000e\u0000", false, AndroidCharacter.getMirror('0') + 233, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        p((char) (24332 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "ட넒꾒▓Ệ빧₰ඵ뇎俏凘䪎빃ᶠ垄\uda9a", "\u0000\u0000\u0000\u0000", "줆硽ಥ╟", KeyEvent.getMaxKeyCode() >> 16, objArr4);
        f25844b = new b(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        q(AndroidCharacter.getMirror('0') - 26, "\r\u0007\bￜ�\ufffe\f￮\f\f\ufffe￼￼\u000e￬\f\f\ufffe\u0005\r￼\ufffa", true, 283 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        p((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\uf88d긆埛峻\uf18b胹\uf56c踨仛氕듎\uef5a妓눠\ue99bꝘ嗘ⳛ垉惯\uda5f䎤椫\ue2c9", "\u0000\u0000\u0000\u0000", "䪫筆ꌀ彀", ViewConfiguration.getJumpTapTimeout() >> 16, objArr6);
        f25846d = new b(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        p((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "㑶\udf97继迤\u0d64죲쯞ႉᥚ뼏롾\ueff2k儭⢆ⵈꠛ숞嘓獨\ue90f", "\u0000\u0000\u0000\u0000", "\u2000擳숐导", (ViewConfiguration.getWindowTouchSlop() >> 8) + 275051296, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        p((char) View.getDefaultSize(0, 0), "魨\u2b75㋻犩ʳ獖稻껉䍙彄თ餷剧磌૪翥ﵥ몇\ue850黎쟟ী㚾", "\u0000\u0000\u0000\u0000", "\u2fec톰ం쿰", 47296559 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
        f25847e = new b(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        q(22 - TextUtils.getTrimmedLength(""), "\u0006\u0003\u0006￭\u000b\u000b�\u0004\f\ufffb\ufff9\f\u0006\u0007ￛ￼�\u000b￭\u0006\u000f\u0007", true, 284 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        p((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), "\ua97d\uf627믙ꔵ鍫⮅\ue0dc뫛\u1af7槷黹\ued36ॴ磊䇡怠됽䖧\uf1a4⎎칒뢤\udd0e臂", "\u0000\u0000\u0000\u0000", "풹Պ䤀แ", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
        f25843a = new b(strIntern5, 4, ((String) objArr10[0]).intern());
        f25851j = c();
        int i2 = f25855n + 107;
        f25856o = i2 % 128;
        int i3 = i2 % 2;
    }

    private b(String str, int i2, String str2) {
        this.f25857f = str2;
    }

    private static /* synthetic */ b[] c() {
        int i2 = 2 % 2;
        int i3 = f25854m + 97;
        int i4 = i3 % 128;
        f25853l = i4;
        int i5 = i3 % 2;
        b[] bVarArr = {f25845c, f25844b, f25846d, f25847e, f25843a};
        int i6 = i4 + 35;
        f25854m = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
        return bVarArr;
    }

    public static b e(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25854m + 17;
        f25853l = i3 % 128;
        int i4 = i3 % 2;
        for (b bVar : values()) {
            if (str.equals(bVar.f25857f)) {
                int i5 = f25854m + 19;
                f25853l = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 98 / 0;
                }
                return bVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        p((char) (ExpandableListView.getPackedPositionGroup(0L) + 36217), "ㅐ\uefc1\ueecf霷\u0c74ڝṝ譌頲鯂\u196eᰬ쨺\udeca찕拸᪆큷唇햄쌲\uea9cꋴ\ud930㧬ﰌ\ue146䄪薁埃䫏ᗅꟺ\ue670\uf61c㈏圬醠韟趩", "\u0000\u0000\u0000\u0000", "줟楈禵\ue88d", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void e() {
        f25850i = 740602047300126166L;
        f25848g = 1564493270;
        f25849h = (char) 45807;
        f25852k = -1270219345;
    }

    static void init$0() {
        $$a = new byte[]{113, 60, -124, 107};
        $$b = 103;
    }

    private static void p(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj = str4;
        if (str4 != null) {
            char[] charArray3 = str4.toCharArray();
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray3;
        }
        i iVar = new i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) obj).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(106 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, -155898465, false, $$c(b2, (byte) ((b2 + 57) - (57 & b2)), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(846 - TextUtils.lastIndexOf("", '0'), (char) ((Process.myPid() >> 22) + 6488), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, -694521287, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 54))), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(TextUtils.indexOf("", "", 0, 0) + 458, (char) TextUtils.indexOf("", "", 0, 0), 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1804962841, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 56))), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = d.a(-1223178239);
                if (objA4 == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 639;
                    char mode = (char) (65100 - View.MeasureSpec.getMode(0));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12;
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    String str$$c = $$c(b5, b6, b6);
                    i3 = 2;
                    objA4 = d.a(windowTouchSlop, mode, iKeyCodeFromString, 1636969060, false, str$$c, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f25850i ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25848g) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25849h) ^ 740602047300126166L))));
                iVar.f19932b++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i6 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f25852k)};
                Object objA = d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(270 - View.resolveSize(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2071844881, false, $$c(b2, (byte) (7 | b2), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = d.a(-202660535);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(522 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.resolveSize(0, 0) + 12, 627984172, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 9))), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i7 = $11 + 73;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $11 + 23;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[(i2 / nVar.f19944a) / 0];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = d.a(-202660535);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = d.a(Color.alpha(0) + 522, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (Process.myPid() >> 22) + 12, 627984172, false, $$c(b4, (byte) (9 | b4), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = d.a(-202660535);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 522, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 11 - TextUtils.lastIndexOf("", '0', 0, 0), 627984172, false, $$c(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 9))), b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f25854m + 11;
        f25853l = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        int i5 = f25853l + 93;
        f25854m = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }

    public static b[] values() {
        int i2 = 2 % 2;
        int i3 = f25853l + 91;
        f25854m = i3 % 128;
        int i4 = i3 % 2;
        b[] bVarArr = (b[]) f25851j.clone();
        int i5 = f25853l + 91;
        f25854m = i5 % 128;
        if (i5 % 2 == 0) {
            return bVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f25854m;
        int i4 = i3 + 115;
        f25853l = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f25857f;
        int i5 = i3 + 111;
        f25853l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
