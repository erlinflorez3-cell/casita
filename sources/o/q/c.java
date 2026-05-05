package o.q;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.f;
import o.a.k;
import o.m.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f26701a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26702b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26703c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26704d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26705e = 0;

    /* JADX INFO: renamed from: g */
    private static final BigDecimal f26706g;

    /* JADX INFO: renamed from: l */
    private static int f26707l = 0;

    /* JADX INFO: renamed from: m */
    private static char[] f26708m = null;

    /* JADX INFO: renamed from: p */
    private static int f26709p = 0;

    /* JADX INFO: renamed from: q */
    private static boolean f26710q = false;

    /* JADX INFO: renamed from: r */
    private static int f26711r = 0;

    /* JADX INFO: renamed from: s */
    private static long f26712s = 0;

    /* JADX INFO: renamed from: t */
    private static boolean f26713t = false;

    /* JADX INFO: renamed from: w */
    private static int f26714w = 0;

    /* JADX INFO: renamed from: y */
    private static int f26715y = 0;

    /* JADX INFO: renamed from: f */
    private short f26716f;

    /* JADX INFO: renamed from: h */
    private o f26717h;

    /* JADX INFO: renamed from: i */
    private BigDecimal f26718i;

    /* JADX INFO: renamed from: j */
    private BigDecimal f26719j;

    /* JADX INFO: renamed from: n */
    private Integer f26721n;

    /* JADX INFO: renamed from: k */
    private BigDecimal f26720k = f26706g;

    /* JADX INFO: renamed from: o */
    private Integer f26722o = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = 114 - r6
            int r0 = r8 + 4
            byte[] r5 = o.q.c.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L26
            r6 = r7
            r2 = r0
            r1 = r3
        L12:
            int r6 = r6 + r0
            r0 = r2
        L14:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r7) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L12
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.c.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26704d = -1971504275;
        f26705e = 137944387;
        f26702b = -1811964608;
        f26703c = 2027875066;
        f26701a = 2144468059;
        f26714w = 0;
        f26715y = 1;
        f26709p = 0;
        f26711r = 1;
        l();
        TextUtils.lastIndexOf("", '0');
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        f26706g = BigDecimal.ZERO;
        int i2 = f26714w + 75;
        f26715y = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public c(short s2, BigDecimal bigDecimal, o oVar, BigDecimal bigDecimal2, Integer num) {
        this.f26716f = s2;
        this.f26719j = bigDecimal;
        this.f26717h = oVar;
        this.f26718i = bigDecimal2;
        this.f26721n = num;
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~((~i3) | i9);
        int i11 = (-1) - (((-1) - i3) & ((-1) - i9));
        int i12 = i7 + i5 + i4 + ((-189913888) * i6) + ((-1809372279) * i2);
        int i13 = i12 * i12;
        int i14 = (((-554582804) * i7) - 1671495680) + (10634006 * i5) + (i8 * 282608405) + (282608405 * i10) + ((-282608405) * i11) + ((-271974400) * i4) + (952107008 * i6) + (1092222976 * i2) + ((-70844416) * i13);
        int i15 = (i7 * 986545540) + 223666697 + (i5 * 986543778) + (i8 * (-881)) + (i10 * (-881)) + (i11 * 881) + (i4 * 986544659) + (i6 * 1843362976) + (i2 * (-1872984789)) + (i13 * (-2050686976));
        if (i14 + (i15 * i15 * 1179713536) == 1) {
            return a(objArr);
        }
        c cVar = (c) objArr[0];
        int i16 = 2 % 2;
        int i17 = f26711r + 17;
        int i18 = i17 % 128;
        f26709p = i18;
        int i19 = i17 % 2;
        BigDecimal bigDecimal = cVar.f26718i;
        int i20 = i18 + 1;
        f26711r = i20 % 128;
        int i21 = i20 % 2;
        return bigDecimal;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26709p;
        int i4 = i3 + 63;
        f26711r = i4 % 128;
        int i5 = i4 % 2;
        BigDecimal bigDecimal = cVar.f26720k;
        if (i5 == 0) {
            int i6 = 22 / 0;
        }
        int i7 = i3 + 35;
        f26711r = i7 % 128;
        if (i7 % 2 != 0) {
            return bigDecimal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{39, 50, 101, -97};
        $$b = 248;
    }

    static void l() {
        f26708m = new char[]{2129, 2126, 2086, 2098, 2122, 2099, 2109, 2138, 2108, 2120, 2157, 2097, 2111, 2096, 2156, 2123, 2102, 2106, 2433, 2162, 2124, 2125, 2131, 2127, 2084, 2121, 2146, 2165, 2105, 2158, 2140, 2141};
        f26707l = 2040400289;
        f26713t = true;
        f26710q = true;
        f26712s = 1606700298549913692L;
    }

    private static void u(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 73;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = str4;
        if (str4 != null) {
            int i7 = i4 + 91;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            byte[] bytes = str4.getBytes("ISO-8859-1");
            int i9 = $11 + 61;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        Object charArray = str3;
        if (str3 != null) {
            int i11 = $11 + 77;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f26708m;
        long j2 = 0;
        if (cArr2 != null) {
            int i12 = $11 + 121;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(Color.alpha(0) + 593, (char) (13182 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1))), 11 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), -1225586509, false, $$c((byte) 47, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i14] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i14++;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f26707l)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - Drawable.resolveOpacity(0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        int i15 = 41;
        int i16 = 1540807955;
        if (f26710q) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i17 = $11 + 105;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[fVar.f19923e + fVar.f19922a] + i2] >> iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b3 = (byte) i15;
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(458 - Color.alpha(0), (char) View.resolveSizeAndState(0, 0, 0), 10 - MotionEvent.axisFromString(""), -1923924106, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        objA4 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 458, (char) TextUtils.getTrimmedLength(""), Color.green(0) + 11, -1923924106, false, $$c((byte) 41, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                i15 = 41;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f26713t) {
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
        int i18 = $11 + 67;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr6 = {fVar, fVar};
            Object objA5 = o.d.d.a(i16);
            if (objA5 == null) {
                byte b6 = (byte) 0;
                objA5 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 457, (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 12, -1923924106, false, $$c((byte) 41, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            i16 = 1540807955;
        }
        objArr[0] = new String(cArr6);
    }

    private static void v(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 17;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 75;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f26712s ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i9 = $10 + 65;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i11 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f26712s)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 229, (char) ((Process.myPid() >> 22) + 51004), 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1749983833, false, $$c((byte) 7, b2, (byte) (b2 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 676, (char) View.MeasureSpec.getSize(0), 11 - TextUtils.lastIndexOf("", '0'), 522683165, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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

    public final BigDecimal a() {
        int iActiveCount = Thread.activeCount();
        int i2 = (-696035060) * f26701a;
        f26701a = i2;
        int i3 = f26703c * 1745089391;
        f26703c = i3;
        return (BigDecimal) a((int) SystemClock.uptimeMillis(), iActiveCount, i2, -834340607, i3, 834340607, new Object[]{this});
    }

    @Override // o.q.a
    public final void a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if (aVar == null) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                u(127 - (KeyEvent.getMaxKeyCode() >> 16), null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, "\u0096\u0085\u0087\u0089\u0091\u0089\u008d\u0085\u008c\u0093\u0086\u008e\u0091\u0087\u0082\u008d\u0092\u008a\u0091\u0090\u0086\u008e\u0095\u0093\u008e\u0086\u0093\u0094\u0093\u0086\u008e\u0091\u0087\u0082\u008d\u0092\u008a\u0091\u0090\u0086\u008e\u008f\u0085\u008d\u008e\u0087\u0089\u0085\u008d", objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                return;
            }
            return;
        }
        Object[] objArr3 = new Object[1];
        v("㪅㫵뒕컒ᚚ\ue2af䧿⟠퉸갂쨊Ặ\uebc0藩펓瘱茬﵈룧憳颀툕聛奂뀈쮢榪냖䥺⌑焨ꮉ曈ᣮ", Color.blue(0), objArr3);
        BigDecimal bigDecimalM = aVar.m(((String) objArr3[0]).intern());
        if (bigDecimalM != null) {
            int i3 = f26709p + 27;
            f26711r = i3 % 128;
            int i4 = i3 % 2;
            if (this.f26718i != null) {
                if (o.ea.f.a()) {
                    Object[] objArr4 = new Object[1];
                    u(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    String strIntern2 = ((String) objArr4[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    v("샺삈絆܅쓨プ꽙셟⠍旉ᡩ\uf810ᆥ䰽ǲ邒祕㒞檎蜂拮ᯪ别뿥䨢ȶ뮌噁댏\ueac0ꍀ䴴鲠턢铲斤萚릓ﶅᰒ\uedcfꀞ\ue522㓧핹霳캷⭎㸟翞㙐쏂➮昪ῲ类ར人\u0081鄜磟㔝栀覻恱ᱤ冩ꁭ䤎ӆ륖墋늕\ueb52ꋸ侻驪펥詵昗菇먎\uf35cộ\ueb3a", Color.blue(0), objArr5);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(bigDecimalM.doubleValue()).toString());
                }
                this.f26720k = bigDecimalM;
            }
        }
        Object[] objArr6 = new Object[1];
        u(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, null, "\u008d\u0085\u0087\u0086\u0092\u008e\u008f\u008d\u0085\u0098\u0084\u0092\u0097\u0087\u0086\u0085\u0084\u0083\u0082\u008c", objArr6);
        Integer numG = aVar.g(((String) objArr6[0]).intern());
        if (numG == null || this.f26721n == null) {
            return;
        }
        int i5 = f26709p + 7;
        f26711r = i5 % 128;
        if (i5 % 2 == 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr7 = new Object[1];
            u(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr8 = new Object[1];
            v("Ｆｔ\u2efb咸萌瀳喾㮸៑㙴墍˷\u2e79ᾀ䄖橵䚉朣⩪緥崲䡗ዏ䔂痾冋ﭨ겦賓륽\ue3a4럓ꍼ芟퐖齃믆\uea2e뵡\ue6f5툓\uf3a3ꗆ츀\ueaa5쒎蹞톩ǃⱴ皽㤶ᠦ㖝式Yヰᴒ䁭毦䝖暹⣹猈徦侖ᅎ媅益坫殮ꉬ贄뢦", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            o.ea.f.c(strIntern3, sb2.append(((String) objArr8[0]).intern()).append(numG).toString());
        }
        this.f26722o = numG;
    }

    public final short b() {
        int i2 = 2 % 2;
        int i3 = f26709p + 87;
        int i4 = i3 % 128;
        f26711r = i4;
        int i5 = i3 % 2;
        short s2 = this.f26716f;
        int i6 = i4 + 87;
        f26709p = i6 % 128;
        int i7 = i6 % 2;
        return s2;
    }

    @Override // o.q.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26709p + 19;
        f26711r = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        u(((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008c", objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f26711r + 17;
        f26709p = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.q.a
    public final o.ef.a d() throws Throwable {
        String strIntern;
        double dDoubleValue;
        int i2 = 2 % 2;
        try {
            o.ef.a aVar = new o.ef.a();
            if (this.f26718i != null) {
                int i3 = f26709p + 91;
                f26711r = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    v("㪅㫵뒕컒ᚚ\ue2af䧿⟠퉸갂쨊Ặ\uebc0藩펓瘱茬﵈룧憳颀툕聛奂뀈쮢榪냖䥺⌑焨ꮉ曈ᣮ", ViewConfiguration.getLongPressTimeout() << 107, objArr);
                    strIntern = ((String) objArr[0]).intern();
                    dDoubleValue = this.f26720k.doubleValue();
                } else {
                    Object[] objArr2 = new Object[1];
                    v("㪅㫵뒕컒ᚚ\ue2af䧿⟠퉸갂쨊Ặ\uebc0藩펓瘱茬﵈룧憳颀툕聛奂뀈쮢榪냖䥺⌑焨ꮉ曈ᣮ", ViewConfiguration.getLongPressTimeout() >> 16, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    dDoubleValue = this.f26720k.doubleValue();
                }
                aVar.c(strIntern, dDoubleValue);
                int i4 = f26709p + 61;
                f26711r = i4 % 128;
                int i5 = i4 % 2;
            }
            if (this.f26721n != null) {
                Object[] objArr3 = new Object[1];
                u(Process.getGidForName("") + 128, null, null, "\u008d\u0085\u0087\u0086\u0092\u008e\u008f\u008d\u0085\u0098\u0084\u0092\u0097\u0087\u0086\u0085\u0084\u0083\u0082\u008c", objArr3);
                aVar.a(((String) objArr3[0]).intern(), (Object) this.f26722o);
            }
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                u(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr5 = new Object[1];
                v("鮦鯖츓둇ሄ\ue621\uf26f鱳獊횺캏ꔋ䫰ｸ휟춸∜蟈뱤\uda3c㦩ꢯ蒈\ue290ᅾ넶洵ୱ\ue846妄疬၍잴戩", ViewConfiguration.getTapTimeout() >> 16, objArr5);
                o.ea.f.c(strIntern2, sb.append(((String) objArr5[0]).intern()).append(aVar).toString());
            }
            return aVar;
        } catch (o.ef.b e2) {
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                u((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                u(128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, "\u0086\u008e\u0091\u0087\u0082\u008d\u0092\u008a\u0091\u0090\u0086\u008e\u008f\u0087\u0086\u0091\u008d\u008c", objArr7);
                o.ea.f.e(strIntern3, ((String) objArr7[0]).intern(), e2);
            }
            return new o.ef.a();
        }
    }

    public final BigDecimal e() {
        int i2 = 2 % 2;
        int i3 = f26711r + 113;
        int i4 = i3 % 128;
        f26709p = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BigDecimal bigDecimal = this.f26719j;
        int i5 = i4 + 3;
        f26711r = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    @Override // o.q.a
    public final void e(a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26709p + 55;
        int i4 = i3 % 128;
        f26711r = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z2 = aVar instanceof c;
            obj.hashCode();
            throw null;
        }
        if (!(aVar instanceof c)) {
            int i5 = i4 + 15;
            f26709p = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            u(TextUtils.getOffsetAfter("", 0) + 127, null, null, "\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v("\udd5c\udd29差➸\u0efb䀘ℷ伤㖰䕣퉜癒ం沈쯮Ỳ擡ᐤꂎॹ罕㭑頹", ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        c cVar = (c) aVar;
        this.f26716f = cVar.f26716f;
        this.f26719j = cVar.f26719j;
        this.f26717h = cVar.f26717h;
        BigDecimal bigDecimal = cVar.f26718i;
        this.f26718i = bigDecimal;
        Integer num = cVar.f26721n;
        this.f26721n = num;
        if (bigDecimal == null) {
            this.f26720k = f26706g;
            int i6 = f26709p + 13;
            f26711r = i6 % 128;
            int i7 = i6 % 2;
        }
        if (num == null) {
            this.f26722o = 0;
            int i8 = f26711r + 83;
            f26709p = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f26709p + 49;
            f26711r = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null) {
            int i5 = f26711r + 5;
            f26709p = i5 % 128;
            int i6 = i5 % 2;
            if (getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f26716f == cVar.f26716f && Objects.equals(this.f26719j, cVar.f26719j) && Objects.equals(this.f26718i, cVar.f26718i)) {
                    int i7 = f26711r + 125;
                    f26709p = i7 % 128;
                    int i8 = i7 % 2;
                    if (Objects.equals(this.f26721n, cVar.f26721n) && this.f26717h == cVar.f26717h) {
                        int i9 = f26711r + 103;
                        f26709p = i9 % 128;
                        int i10 = i9 % 2;
                        return true;
                    }
                }
                int i11 = f26711r + 61;
                f26709p = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        return false;
    }

    public final o f() {
        int i2 = 2 % 2;
        int i3 = f26711r + 113;
        int i4 = i3 % 128;
        f26709p = i4;
        int i5 = i3 % 2;
        o oVar = this.f26717h;
        int i6 = i4 + 61;
        f26711r = i6 % 128;
        if (i6 % 2 != 0) {
            return oVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer g() {
        int i2 = 2 % 2;
        int i3 = f26711r + 109;
        f26709p = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.f26722o;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        return num;
    }

    public final BigDecimal h() {
        int i2 = (-62757511) * f26702b;
        f26702b = i2;
        int iNextInt = new Random().nextInt();
        int i3 = f26705e * (-1802221721);
        f26705e = i3;
        int i4 = f26704d * (-1767993704);
        f26704d = i4;
        return (BigDecimal) a(i4, i2, iNextInt, -340587862, i3, 340587863, new Object[]{this});
    }

    public final Integer i() {
        int i2 = 2 % 2;
        int i3 = f26709p;
        int i4 = i3 + 47;
        f26711r = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.f26721n;
        int i6 = i3 + 107;
        f26711r = i6 % 128;
        if (i6 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BigDecimal j() {
        int i2 = 2 % 2;
        Integer num = this.f26721n;
        if (num != null) {
            int i3 = f26711r + 59;
            f26709p = i3 % 128;
            int i4 = i3 % 2;
            if (num.intValue() <= this.f26722o.intValue()) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                int i5 = f26711r + 69;
                f26709p = i5 % 128;
                int i6 = i5 % 2;
                return bigDecimal;
            }
        }
        BigDecimal bigDecimal2 = this.f26718i;
        if (bigDecimal2 == null) {
            return this.f26719j;
        }
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(this.f26720k);
        BigDecimal bigDecimal3 = this.f26719j;
        return bigDecimal3 == null ? bigDecimalSubtract.max(BigDecimal.ZERO) : bigDecimalSubtract.min(bigDecimal3).max(BigDecimal.ZERO);
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        u(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "\u009b\u009a\u0087\u008a\u0086\u0085\u008d\u0087\u0089\u0099\u0082\u0087\u0082\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append((int) this.f26716f);
        Object[] objArr2 = new Object[1];
        u((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, null, "\u009b\u0087\u0086\u0092\u008e\u0084\u009e\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u009d\u0082\u0084\u0093\u009c", objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(this.f26719j);
        Object[] objArr3 = new Object[1];
        u(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "\u009b\u0085\u008c\u0083 \u0087\u008d\u008e\u008c\u008c\u0092\u009f\u0083\u0095\u0086\u0085\u008d\u008d\u0092\u008f\u008d\u0085\u009a\u0087\u008e\u0093\u009c", objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(this.f26717h).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f26711r + 67;
        f26709p = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
