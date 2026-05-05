package o.cs;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.EmvApplicationActivationMethodType;
import java.lang.reflect.Method;
import o.a.g;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.ea.d<EmvApplicationActivationMethodType> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22571e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f22572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ c[] f22574i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char f22575k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char f22576l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char f22577m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f22578n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f22579o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f22580p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f22581q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f22582r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f22583t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22584f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22585j;

    /* JADX INFO: renamed from: o.cs.c$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f22586a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f22587b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f22588d;

        static {
            int[] iArr = new int[c.values().length];
            f22588d = iArr;
            try {
                iArr[c.f22567a.ordinal()] = 1;
                int i2 = f22586a + 77;
                f22587b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22588d[c.f22570d.ordinal()] = 2;
                int i4 = f22587b + 97;
                f22586a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22588d[c.f22571e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22588d[c.f22572g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22588d[c.f22573h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22588d[c.f22568b.ordinal()] = 6;
                int i7 = f22586a;
                int i8 = (i7 ^ 57) + (((-1) - (((-1) - i7) | ((-1) - 57))) << 1);
                f22587b = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22588d[c.f22569c.ordinal()] = 7;
                int i10 = f22586a + 87;
                f22587b = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, byte r11) {
        /*
            byte[] r8 = o.cs.c.$$a
            int r0 = r9 * 3
            int r7 = 1 - r0
            int r6 = 78 - r11
            int r0 = r10 * 4
            int r5 = 3 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2b
            r1 = r7
            r0 = r5
            r2 = r3
        L14:
            int r5 = r5 + r1
            r1 = r2
            r6 = r5
            r5 = r0
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r0 = r5 + 1
            r1 = r8[r0]
            r5 = r6
            goto L14
        L2b:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cs.c.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22582r = 0;
        f22583t = 1;
        f22580p = 0;
        f22581q = 1;
        a();
        Object[] objArr = new Object[1];
        u("༲챱\ue947먤ﮦ\uf52a", 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        u("兟꽭柌֔\ue5c1ㄨ", TextUtils.getOffsetAfter("", 0) + 5, objArr2);
        f22570d = new c(strIntern, 0, ((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        u("蔌袔莳\uebdc\uea3f\udb1f冸椹鱊黖᩵\uf33e\ud9fe䞦", 13 - View.MeasureSpec.getMode(0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        u("ꄱ랚\ue7b1鯒鲜\udea8\uebc0픿τᛳᄭ⋤ㄎ曰", 14 - KeyEvent.getDeadChar(0, 0), objArr4);
        f22568b = new c(strIntern2, 1, ((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        u("ꋤ䶍䴷黗", MotionEvent.axisFromString("") + 4, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        u("찟俭㧲뜑", TextUtils.getTrimmedLength("") + 3, objArr6);
        f22567a = new c(strIntern3, 2, ((String) objArr6[0]).intern(), true);
        Object[] objArr7 = new Object[1];
        s("뭵ɬ줛郏忥⚰\uec49ꬍ爝㧴肒久ᕫ\udc36鯁", 47407 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        s("뭵쑰䕃왛䜵쀤䄁싡䏱쳎䷍캵侄좈䡿쥮", 32531 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
        f22569c = new c(strIntern4, 3, ((String) objArr8[0]).intern(), false);
        Object[] objArr9 = new Object[1];
        u("㢻㜯퐓㲱", 3 - TextUtils.getOffsetBefore("", 0), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        s("뭷챥啠", 30467 - TextUtils.getOffsetBefore("", 0), objArr10);
        f22571e = new c(strIntern5, 4, ((String) objArr10[0]).intern(), false);
        Object[] objArr11 = new Object[1];
        u("槫ȅ침瀭늁萸籮똴힝䚴绒ꄎ", 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        s("뭹\uec7cᕜ븩\ue705ࣸ뇂\udaabΑꭢ\udc41ԯ긎", 22302 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr12);
        f22572g = new c(strIntern6, 5, ((String) objArr12[0]).intern(), true);
        Object[] objArr13 = new Object[1];
        u("ǃ癅ꏃ詫", 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        u("杶䀨⎰槶", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, objArr14);
        f22573h = new c(strIntern7, 6, ((String) objArr14[0]).intern(), false);
        f22574i = c();
        int i2 = f22582r + 101;
        f22583t = i2 % 128;
        int i3 = i2 % 2;
    }

    private c(String str, int i2, String str2, boolean z2) {
        this.f22585j = str2;
        this.f22584f = z2;
    }

    static void a() {
        f22578n = 8509806813079516793L;
        f22577m = (char) 28790;
        f22576l = (char) 20322;
        f22575k = (char) 56906;
        f22579o = (char) 40941;
    }

    public static c c(String str) throws Throwable {
        c[] cVarArrValues;
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = f22580p + 19;
        f22581q = i4 % 128;
        if (i4 % 2 == 0) {
            cVarArrValues = values();
            length = cVarArrValues.length;
            i2 = 1;
        } else {
            cVarArrValues = values();
            length = cVarArrValues.length;
            i2 = 0;
        }
        while (i2 < length) {
            c cVar = cVarArrValues[i2];
            if (str.equals(cVar.f22585j)) {
                int i5 = f22581q + 29;
                f22580p = i5 % 128;
                int i6 = i5 % 2;
                return cVar;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        s("뭥휱掵\ufe1fયꕹ㇉䱶\ud8da歕蜧Ꭳ긆㪘唌\ue1ee簦裠᭎럔쎤帶\ueaa3ԍ釞ⰷ뢸", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27763, objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    private static /* synthetic */ c[] c() {
        c[] cVarArr;
        int i2 = 2 % 2;
        int i3 = f22581q;
        int i4 = i3 + 45;
        f22580p = i4 % 128;
        if (i4 % 2 != 0) {
            cVarArr = new c[45];
            cVarArr[0] = f22570d;
            cVarArr[1] = f22568b;
            cVarArr[3] = f22567a;
            cVarArr[4] = f22569c;
            cVarArr[3] = f22571e;
            cVarArr[4] = f22572g;
            cVarArr[106] = f22573h;
        } else {
            cVarArr = new c[]{f22570d, f22568b, f22567a, f22569c, f22571e, f22572g, f22573h};
        }
        int i5 = i3 + 57;
        f22580p = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
        $$b = 68;
    }

    private static void s(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 41;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        int i5 = $11 + 69;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (qVar.f19948a < cArr.length) {
            int i7 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 731, (char) (Color.red(0) + 7933), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 355847088, false, $$c(b2, b3, (byte) (7 | b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f22578n ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(836 - (Process.myTid() >> 22), (char) (TextUtils.lastIndexOf("", '0', 0) + 27280), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, -2145994442, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (27278 - MotionEvent.axisFromString("")), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -2145994442, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 59;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        if (str2 != null) {
            int i7 = i4 + 85;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i9 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i9] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i10 = $10 + 11;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 58224;
            int i13 = i9;
            while (i13 < 16) {
                int i14 = $10 + 77;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i9];
                int i16 = (c3 + i12) ^ ((c3 << 4) + ((char) (((long) f22575k) ^ (-7511683281764982996L))));
                int i17 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f22579o);
                    objArr2[2] = Integer.valueOf(i17);
                    objArr2[1] = Integer.valueOf(i16);
                    objArr2[i9] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int mode = 270 - View.MeasureSpec.getMode(i9);
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int defaultSize = 11 - View.getDefaultSize(i9, i9);
                        byte b2 = (byte) i9;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, (byte) (9 | b3));
                        Class[] clsArr = new Class[4];
                        clsArr[i9] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(mode, cMyPid, defaultSize, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i9]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f22577m) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f22576l)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 271, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1995022631, false, $$c(b4, b5, (byte) (9 | b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i12 -= 40503;
                    i13++;
                    i9 = 0;
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
                objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 270, (char) ExpandableListView.getPackedPositionType(0L), (KeyEvent.getMaxKeyCode() >> 16) + 11, -2074123590, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f22581q + 95;
        f22580p = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        if (i4 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f22581q + 69;
        f22580p = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c[] cVarArr = (c[]) f22574i.clone();
        int i4 = f22580p + 67;
        f22581q = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return cVarArr;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f22581q;
        int i4 = i3 + 75;
        f22580p = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f22584f;
        int i6 = i3 + 89;
        f22580p = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final EmvApplicationActivationMethodType d() {
        int i2 = 2 % 2;
        int i3 = f22580p + 17;
        f22581q = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass3.f22588d[ordinal()]) {
            case 1:
                return EmvApplicationActivationMethodType.Sms;
            case 2:
                return EmvApplicationActivationMethodType.Email;
            case 3:
                EmvApplicationActivationMethodType emvApplicationActivationMethodType = EmvApplicationActivationMethodType.App;
                int i5 = f22580p + 103;
                f22581q = i5 % 128;
                int i6 = i5 % 2;
                return emvApplicationActivationMethodType;
            case 4:
                EmvApplicationActivationMethodType emvApplicationActivationMethodType2 = EmvApplicationActivationMethodType.OutboundCall;
                int i7 = f22581q + 39;
                f22580p = i7 % 128;
                if (i7 % 2 == 0) {
                    return emvApplicationActivationMethodType2;
                }
                throw null;
            case 5:
                return EmvApplicationActivationMethodType.Ivr;
            case 6:
                return EmvApplicationActivationMethodType.OnlineBanking;
            case 7:
                return EmvApplicationActivationMethodType.CustomerService;
            default:
                Object[] objArr = new Object[1];
                s("뭵\ue030ඖꥭ훅牁齼쒄恡跇⥆嘾\uf390ό䒴\ue01aവ꫁홼珼鼚쐀憁贁⫟噉\uf330ᢇ䐛\ue1fe\u0d45\uaa3bힿ猞飶쑢愩躡⨕埱\uf34fᠽ䖹\ue114\u0eecꩠퟑ粫頎엮慌軧⮣圕ﳩᠷ䖄", 23398 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                throw new IllegalArgumentException(String.format(((String) objArr[0]).intern(), name()));
        }
    }

    @Override // o.ea.a
    public final /* synthetic */ Object e() {
        int i2 = 2 % 2;
        int i3 = f22580p + 11;
        f22581q = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationActivationMethodType emvApplicationActivationMethodTypeD = d();
        int i5 = f22581q + 21;
        f22580p = i5 % 128;
        if (i5 % 2 == 0) {
            return emvApplicationActivationMethodTypeD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
