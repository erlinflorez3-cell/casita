package o.m;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.ForeignCurrencySupport;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f26568a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static o f26569b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o f26570c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f26571d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f26572f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26573g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f26574h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f26575i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f26576j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26577l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f26578n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26579o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26580e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, int r10) {
        /*
            byte[] r7 = o.m.o.$$a
            int r6 = r9 * 4
            int r1 = r6 + 1
            int r0 = r8 * 3
            int r5 = 3 - r0
            int r0 = r10 * 3
            int r4 = r0 + 69
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r7 != 0) goto L2a
            r1 = r4
            r0 = r2
            r4 = r6
        L16:
            int r4 = r4 + r1
            r1 = r0
        L18:
            int r5 = r5 + 1
            byte r0 = (byte) r4
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L27:
            r1 = r7[r5]
            goto L16
        L2a:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.o.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26579o = 0;
        f26578n = 1;
        f26573g = 0;
        f26577l = 1;
        a();
        Object[] objArr = new Object[1];
        k("翼⭳䊏፯ᗹ䶳뇷䙀浔࠳", ExpandableListView.getPackedPositionGroup(0L) + 9, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k("뢄寱", 2 - KeyEvent.keyCodeFromString(""), objArr2);
        f26569b = new o(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k("짦ᶎᘘ\ueffc낂ԇ쐻ᶻ", 6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k("ﰫᅢ䦛\ueee3", Process.getGidForName("") + 4, objArr4);
        f26570c = new o(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        k("\ua63c\ud85a杙膉௲簻Ꝟ´", 7 - Color.argb(0, 0, 0, 0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k("껮ێ\u0db2왋", 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
        f26568a = new o(strIntern3, 2, ((String) objArr6[0]).intern());
        f26571d = c();
        int i2 = f26579o + 59;
        f26578n = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private o(String str, int i2, String str2) {
        this.f26580e = str2;
    }

    public static o a(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26573g + 57;
        f26577l = i3 % 128;
        int i4 = i3 % 2;
        for (o oVar : values()) {
            if (oVar.f26580e.equals(str)) {
                int i5 = f26573g + 77;
                f26577l = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 0;
                }
                return oVar;
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        k("폀\uef79૦\udf0d슽鴥菃⟣惾乚ᧇ쇒இ뉻\uf1efꗂ䍥ဲ\uf408\uda90㦚ⵀ᥀쳪鲃㪶苻Ő꿆탓㐚ᛙ哵쥪\uef72橭啱䯶", KeyEvent.normalizeMetaState(0) + 38, objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void a() {
        f26572f = (char) 28486;
        f26575i = (char) 47135;
        f26574h = (char) 19711;
        f26576j = (char) 37330;
    }

    private static /* synthetic */ o[] c() {
        int i2 = 2 % 2;
        int i3 = f26573g + 43;
        f26577l = i3 % 128;
        if (i3 % 2 != 0) {
            return new o[]{f26569b, f26570c, f26568a};
        }
        o[] oVarArr = new o[4];
        oVarArr[0] = f26569b;
        oVarArr[1] = f26570c;
        oVarArr[5] = f26568a;
        return oVarArr;
    }

    static void init$0() {
        $$a = new byte[]{44, -120, 71, -108};
        $$b = 238;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.g gVar = new o.a.g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $10 + 35;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d / i6];
            } else {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i8 = 58224;
            int i9 = i6;
            while (i9 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f26574h) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f26576j)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.red(0), 11 - View.MeasureSpec.getMode(0), -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f26572f) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26575i)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 271, (char) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i6 = 0;
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
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 270, (char) (Process.myPid() >> 22), TextUtils.getTrimmedLength("") + 11, -2074123590, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static o valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f26577l + 115;
        f26573g = i3 % 128;
        int i4 = i3 % 2;
        o oVar = (o) Enum.valueOf(o.class, str);
        if (i4 != 0) {
            int i5 = 73 / 0;
        }
        return oVar;
    }

    public static o[] values() {
        int i2 = 2 % 2;
        int i3 = f26577l + 91;
        f26573g = i3 % 128;
        int i4 = i3 % 2;
        o[] oVarArr = f26571d;
        if (i4 == 0) {
            return (o[]) oVarArr.clone();
        }
        o[] oVarArr2 = (o[]) oVarArr.clone();
        int i5 = 78 / 0;
        return oVarArr2;
    }

    public final ForeignCurrencySupport e() {
        int i2 = 2 % 2;
        Object obj = null;
        if (equals(f26569b)) {
            int i3 = f26577l + 43;
            f26573g = i3 % 128;
            if (i3 % 2 == 0) {
                return ForeignCurrencySupport.No;
            }
            ForeignCurrencySupport foreignCurrencySupport = ForeignCurrencySupport.No;
            obj.hashCode();
            throw null;
        }
        if (equals(f26570c)) {
            return ForeignCurrencySupport.LowValueTransactions;
        }
        if (!equals(f26568a)) {
            return null;
        }
        int i4 = f26573g + 109;
        f26577l = i4 % 128;
        int i5 = i4 % 2;
        return ForeignCurrencySupport.All;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f26577l + 83;
        int i4 = i3 % 128;
        f26573g = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f26580e;
        int i5 = i4 + 25;
        f26577l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
