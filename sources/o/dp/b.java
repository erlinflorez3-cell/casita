package o.dp;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.g;
import o.a.q;
import okio.Utf8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f23214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f23215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f23216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f23217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f23218f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f23219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f23220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f23221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f23222k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char f23223l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f23224m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f23225n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f23226o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f23227p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f23228q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f23229r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f23230s = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23231g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 + 69
            int r2 = r5 * 4
            int r1 = 1 - r2
            int r0 = r6 * 2
            int r6 = 4 - r0
            byte[] r5 = o.dp.b.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r5 != 0) goto L29
            r0 = r7
            r1 = r3
            r7 = r2
        L16:
            int r6 = r6 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L16
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dp.b.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23227p = 0;
        f23229r = 1;
        f23228q = 0;
        f23230s = 1;
        c();
        Object[] objArr = new Object[1];
        t("쒝搃䕉篽Ც瘬㿓⑇卜Ⅲﴛ훲サึ", 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        u("摾빏퀒\ueaccಎ❛礌", 55870 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        f23215c = new b(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        u("摾㬲\uda9c穯᧴뢺堈ﾓ", 24421 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        t("ⱚ㺥㝮㋅", KeyEvent.normalizeMetaState(0) + 4, objArr4);
        f23217e = new b(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        t("铭뢜虩\ufff4絕洨黻ԥ㭾\uf12d籙䕳", 10 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        t("쐌镍絒\uecc0霪䴂㠢毪\ued7c\uea3eఔኡ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, objArr6);
        f23216d = new b(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        t("༗栖빜ꉦﴛ훲サึ", 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        u("摣偑ఏ\uf8d3뒰慢崸ৡ엎", 13367 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
        f23214b = new b(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        t("铭뢜虩\ufff4絕洨༗栖빜ꉦ", 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        t("쐌镍絒\uecc0霪䴂謌㿑笯떴㺡잼㸤ኁ", 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
        f23213a = new b(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        u("摺쪴㦐棷\udfd6\u0e3d紶걯ፘ䆭", 44771 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        u("摤赉똆\udfef", 59699 - TextUtils.getCapsMode("", 0, 0), objArr12);
        f23219h = new b(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        t("奔\uec06쀊綊ﴛ훲サึ", TextUtils.indexOf((CharSequence) "", '0', 0) + 9, objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        t("ࢹ۞ἇ隒", TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr14);
        f23220i = new b(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        t("\ude91딨\ud8bf⹃孱\u20fa\uef86썡", KeyEvent.getDeadChar(0, 0) + 7, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        u("摹\uebf3筷", TextUtils.getTrimmedLength("") + 36739, objArr16);
        f23218f = new b(strIntern8, 7, ((String) objArr16[0]).intern());
        f23221j = b();
        int i2 = f23229r + 95;
        f23227p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private b(String str, int i2, String str2) {
        this.f23231g = str2;
    }

    private static /* synthetic */ b[] b() {
        int i2 = 2 % 2;
        int i3 = f23230s;
        int i4 = i3 + 87;
        f23228q = i4 % 128;
        int i5 = i4 % 2;
        b[] bVarArr = {f23215c, f23217e, f23216d, f23214b, f23213a, f23219h, f23220i, f23218f};
        int i6 = i3 + 25;
        f23228q = i6 % 128;
        if (i6 % 2 == 0) {
            return bVarArr;
        }
        throw null;
    }

    static void c() {
        f23222k = (char) 54373;
        f23224m = (char) 13133;
        f23223l = (char) 50405;
        f23226o = (char) 25985;
        f23225n = -3473697990971463300L;
    }

    static void init$0() {
        $$a = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$b = 175;
    }

    private static void t(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 105;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i5 + 123;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 46 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = $11 + 77;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) f23223l) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f23226o)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - KeyEvent.normalizeMetaState(0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, -1995022631, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f23222k) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23224m)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(270 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), -1995022631, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
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
                objA3 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 269, (char) View.resolveSizeAndState(0, 0, 0), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2074123590, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 3;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (str2 != null) {
            int i7 = i5 + 1;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $10 + 73;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 730, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7932), 11 - (ViewConfiguration.getTapTimeout() >> 16), 355847088, false, $$c(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i9] = ((Long) ((Method) objA).invoke(obj, objArr2)).longValue() + f23225n + 4743694005979712847L;
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 836, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27280), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2145994442, false, $$c(b4, b5, (byte) (9 | b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(obj, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(731 - Color.red(0), (char) (7932 - ExpandableListView.getPackedPositionChild(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 355847088, false, $$c(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f23225n ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(836 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27278 - TextUtils.lastIndexOf("", '0')), Color.rgb(0, 0, 0) + 16777227, -2145994442, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 9)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                obj = null;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr6 = {qVar, qVar};
            Object objA5 = o.d.d.a(1452497747);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a(836 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (27278 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 11, -2145994442, false, $$c(b10, b11, (byte) ((b11 + 9) - (9 & b11))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23228q + 87;
        f23230s = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        int i5 = f23228q + 95;
        f23230s = i5 % 128;
        if (i5 % 2 != 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static b[] values() {
        int i2 = 2 % 2;
        int i3 = f23230s + 103;
        f23228q = i3 % 128;
        int i4 = i3 % 2;
        b[] bVarArr = (b[]) f23221j.clone();
        int i5 = f23230s + 85;
        f23228q = i5 % 128;
        int i6 = i5 % 2;
        return bVarArr;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f23228q + 29;
        int i4 = i3 % 128;
        f23230s = i4;
        int i5 = i3 % 2;
        String str = this.f23231g;
        int i6 = i4 + 39;
        f23228q = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
