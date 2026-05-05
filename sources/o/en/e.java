package o.en;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import fr.antelop.sdk.Product;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements o.ea.a<Product>, a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f24189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f24190c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f24191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f24192f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f24193g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ e[] f24194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f24195i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f24196k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f24197l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f24198m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f24199n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f24200o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Product f24201a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24202d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24203j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            int r0 = r10 * 4
            int r7 = r0 + 4
            int r0 = r8 * 3
            int r0 = r0 + 69
            byte[] r6 = o.en.e.$$a
            int r2 = r9 * 4
            int r1 = 1 - r2
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r1 = -1
            if (r6 != 0) goto L2b
            r2 = r7
        L17:
            int r0 = -r0
            int r7 = r7 + r0
            int r2 = r2 + 1
        L1b:
            int r1 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r6[r2]
            goto L17
        L2b:
            r2 = r7
            r7 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.e.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24199n = 0;
        f24197l = 1;
        f24198m = 0;
        f24200o = 1;
        c();
        ViewConfiguration.getPressedStateDuration();
        Object[] objArr = new Object[1];
        p("㝨늠꒕袁", 3 - Color.argb(0, 0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Product product = Product.Hce;
        Object[] objArr2 = new Object[1];
        p("灮菢꒕袁", 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        p("儎\uf638㢻펵憚\uef6e\uedd2Ｎ좬\u1adf삝\uf54a忪咇\ua8db諾冸㬤ꧪⰤ憚\uef6e\uedd2Ｎ좬\u1adfᘾ贀乳㵧ꋹ\ue5e4\uea7e볞윈퐰淵뒛ꎘ⓿꒕袁", KeyEvent.normalizeMetaState(0) + 41, objArr3);
        f24190c = new e(strIntern, 0, product, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        p("㻵袂쨻ꅜ", (ViewConfiguration.getLongPressTimeout() >> 16) + 3, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Product product2 = Product.Sca;
        Object[] objArr5 = new Object[1];
        p("듋ት쨻ꅜ", Color.alpha(0) + 3, objArr5);
        f24189b = new e(strIntern3, 1, product2, ((String) objArr5[0]).intern(), null);
        Object[] objArr6 = new Object[1];
        p("о覰㞪鹵\ufbcf榤⫽夃ᾋ곂眧\udc1d", 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr6);
        String strIntern4 = ((String) objArr6[0]).intern();
        Product product3 = Product.DigitalCard;
        Object[] objArr7 = new Object[1];
        p("ɝ뎝㞪鹵\ufbcf榤⫽夃ᾋ곂眧\udc1d", TextUtils.indexOf("", "", 0) + 11, objArr7);
        f24191e = new e(strIntern4, 2, product3, ((String) objArr7[0]).intern(), null);
        f24194h = j();
        int i2 = f24199n + 41;
        f24197l = i2 % 128;
        int i3 = i2 % 2;
    }

    private e(String str, int i2, Product product, String str2, String str3) {
        this.f24201a = product;
        this.f24202d = str2;
        this.f24203j = str3;
    }

    static void c() {
        f24193g = (char) 40848;
        f24195i = (char) 45424;
        f24192f = (char) 32093;
        f24196k = (char) 47923;
    }

    public static e d(String str) {
        int i2 = 2 % 2;
        int i3 = f24198m + 79;
        f24200o = i3 % 128;
        int i4 = i3 % 2;
        for (e eVar : values()) {
            if (eVar.toString().equals(str)) {
                int i5 = f24200o + 3;
                f24198m = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 24 / 0;
                }
                return eVar;
            }
        }
        return null;
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 178;
    }

    private static /* synthetic */ e[] j() {
        int i2 = 2 % 2;
        int i3 = f24200o + 73;
        int i4 = i3 % 128;
        f24198m = i4;
        int i5 = i3 % 2;
        e[] eVarArr = {f24190c, f24189b, f24191e};
        int i6 = i4 + 65;
        f24200o = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return eVarArr;
    }

    private static void p(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[0] = cArr[gVar.f19924d];
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 15;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) f24192f) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f24196k)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f24193g) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24195i)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 270, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
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
                byte b6 = (byte) 1;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 270, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static e valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f24200o + 51;
        f24198m = i3 % 128;
        int i4 = i3 % 2;
        e eVar = (e) Enum.valueOf(e.class, str);
        int i5 = f24198m + 117;
        f24200o = i5 % 128;
        int i6 = i5 % 2;
        return eVar;
    }

    public static e[] values() {
        int i2 = 2 % 2;
        int i3 = f24198m + 45;
        f24200o = i3 % 128;
        int i4 = i3 % 2;
        e[] eVarArr = f24194h;
        if (i4 != 0) {
            return (e[]) eVarArr.clone();
        }
        throw null;
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24200o;
        int i4 = i3 + 97;
        f24198m = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24202d;
        int i6 = i3 + 21;
        f24198m = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Class<?> b() {
        int i2 = 2 % 2;
        String str = this.f24203j;
        Class<?> cls = null;
        if (str != null) {
            int i3 = f24200o + 101;
            f24198m = i3 % 128;
            int i4 = i3 % 2;
            try {
                cls = Class.forName(str);
                int i5 = f24200o + 97;
                f24198m = i5 % 128;
                int i6 = i5 % 2;
            } catch (ClassNotFoundException unused) {
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    p("浬칔\ud8ac묃ｧ\uf2e1彚ꋍ\uea7e볞\ue2fd\uf09e", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    p("鉿\uf504⠬ޚ洧㹺嵠㊚\uf668땠㥜肚度꺱\uddec䚏鐷÷䝀ế⍄︶꙽\udf8bㄙ㪛\uf125랧⛕\ued0b燠덾\uda2a컉洧㹺嵠㊚\uf668땠䴯氊斋螃㒷邲嘽\ue537녘\uf49c\uddec䚏嵷뺪ㄙ㪛⋭跴萚ጮ眧\udc1d", KeyEvent.getDeadChar(0, 0) + 61, objArr2);
                    o.ea.f.d(strIntern, String.format(((String) objArr2[0]).intern(), this, this.f24203j));
                }
            }
        }
        return cls;
    }

    public final boolean c(List<d> list) {
        int i2 = 2 % 2;
        int i3 = f24200o + 11;
        f24198m = i3 % 128;
        if (i3 % 2 != 0) {
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<d> it = list.iterator();
        int i4 = f24198m + 37;
        f24200o = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            if (it.next().b() == this) {
                return true;
            }
        }
        return false;
    }

    public final Product d() {
        int i2 = 2 % 2;
        int i3 = f24198m + 97;
        int i4 = i3 % 128;
        f24200o = i4;
        int i5 = i3 % 2;
        Product product = this.f24201a;
        int i6 = i4 + 123;
        f24198m = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return product;
    }

    @Override // o.ea.a
    public final /* synthetic */ Product e() {
        int i2 = 2 % 2;
        int i3 = f24200o + 67;
        f24198m = i3 % 128;
        if (i3 % 2 == 0) {
            return d();
        }
        d();
        throw null;
    }
}
