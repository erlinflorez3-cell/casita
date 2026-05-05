package o.en;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends Enum<d> implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static d f24167a = null;

    /* JADX INFO: renamed from: b */
    private static d f24168b = null;

    /* JADX INFO: renamed from: c */
    private static d f24169c = null;

    /* JADX INFO: renamed from: d */
    private static d f24170d = null;

    /* JADX INFO: renamed from: e */
    private static d f24171e = null;

    /* JADX INFO: renamed from: g */
    private static d f24172g = null;

    /* JADX INFO: renamed from: h */
    private static d f24173h = null;

    /* JADX INFO: renamed from: i */
    private static d f24174i = null;

    /* JADX INFO: renamed from: j */
    private static d f24175j = null;

    /* JADX INFO: renamed from: l */
    private static int f24176l = 0;

    /* JADX INFO: renamed from: m */
    private static char[] f24177m = null;

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ d[] f24178n;

    /* JADX INFO: renamed from: o */
    private static int f24179o = 0;

    /* JADX INFO: renamed from: p */
    private static int f24180p = 0;

    /* JADX INFO: renamed from: q */
    private static int f24181q = 0;

    /* JADX INFO: renamed from: r */
    private static byte[] f24182r = null;

    /* JADX INFO: renamed from: s */
    private static short[] f24183s = null;

    /* JADX INFO: renamed from: t */
    private static int f24184t = 0;

    /* JADX INFO: renamed from: u */
    private static int f24185u = 0;

    /* JADX INFO: renamed from: y */
    private static int f24186y = 0;

    /* JADX INFO: renamed from: f */
    private final String f24187f;

    /* JADX INFO: renamed from: k */
    private final e f24188k;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, int r8, byte r9) {
        /*
            int r0 = r9 * 4
            int r9 = 1 - r0
            int r8 = r8 + 4
            int r0 = r7 + 103
            byte[] r7 = o.en.d.$$a
            byte[] r6 = new byte[r9]
            r5 = 0
            if (r7 != 0) goto L29
            r2 = r8
            r4 = r5
        L11:
            int r0 = -r0
            int r0 = r0 + r8
            r8 = r2
            r3 = r4
        L15:
            int r2 = r8 + 1
            int r4 = r3 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r4 != r9) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            r1 = r7[r2]
            r8 = r0
            r0 = r1
            goto L11
        L29:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.d.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24185u = 0;
        f24186y = 1;
        f24184t = 0;
        f24180p = 1;
        e();
        Object[] objArr = new Object[1];
        v("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{0, 19, 162, 0}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        w((short) View.MeasureSpec.getMode(0), 1421706468 + (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2073653668, (-45) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-125) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr2);
        f24170d = new d(strIntern, 0, ((String) objArr2[0]).intern(), e.f24190c);
        Object[] objArr3 = new Object[1];
        v("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{19, 13, 0, 0}, true, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        v("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{32, 15, 188, 0}, false, objArr4);
        f24167a = new d(strIntern2, 1, ((String) objArr4[0]).intern(), e.f24190c);
        Object[] objArr5 = new Object[1];
        v("\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{47, 7, 77, 2}, false, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        w((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1421706488 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2073653668 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) - 58, (byte) ((-54) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr6);
        f24171e = new d(strIntern3, 2, ((String) objArr6[0]).intern(), e.f24190c);
        Object[] objArr7 = new Object[1];
        v("\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{54, 6, 0, 0}, false, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        v("\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{60, 7, 7, 0}, false, objArr8);
        f24169c = new d(strIntern4, 3, ((String) objArr8[0]).intern(), e.f24190c);
        Object[] objArr9 = new Object[1];
        w((short) TextUtils.getOffsetAfter("", 0), 1421706495 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2073653667, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 57, (byte) (Gravity.getAbsoluteGravity(0, 0) + 53), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        v("\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{67, 10, 133, 6}, false, objArr10);
        f24168b = new d(strIntern5, 4, ((String) objArr10[0]).intern(), e.f24190c);
        Object[] objArr11 = new Object[1];
        v("\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{77, 6, 69, 1}, false, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        w((short) View.getDefaultSize(0, 0), 1421706503 - Gravity.getAbsoluteGravity(0, 0), 2073653668 - ExpandableListView.getPackedPositionType(0L), Gravity.getAbsoluteGravity(0, 0) - 59, (byte) (119 - Gravity.getAbsoluteGravity(0, 0)), objArr12);
        f24173h = new d(strIntern6, 5, ((String) objArr12[0]).intern(), e.f24190c);
        Object[] objArr13 = new Object[1];
        w((short) View.combineMeasuredStates(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1421706508, 2073653678 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-56) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (View.MeasureSpec.getMode(0) + 111), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        v("\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{83, 10, 42, 2}, false, objArr14);
        f24175j = new d(strIntern7, 6, ((String) objArr14[0]).intern(), e.f24189b);
        Object[] objArr15 = new Object[1];
        v("\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{93, 11, 0, 11}, false, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        v("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{104, 12, 0, 4}, true, objArr16);
        f24172g = new d(strIntern8, 7, ((String) objArr16[0]).intern(), e.f24189b);
        Object[] objArr17 = new Object[1];
        v("\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{116, 11, 100, 0}, false, objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        v("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{127, 12, 105, 0}, true, objArr18);
        f24174i = new d(strIntern9, 8, ((String) objArr18[0]).intern(), e.f24191e);
        f24178n = c();
        int i2 = f24186y + 45;
        f24185u = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private d(String str, int i2, String str2, e eVar) {
        super(str, i2);
        this.f24187f = str2;
        this.f24188k = eVar;
    }

    private static /* synthetic */ d[] c() {
        int i2 = 2 % 2;
        int i3 = f24180p + 121;
        int i4 = i3 % 128;
        f24184t = i4;
        int i5 = i3 % 2;
        d[] dVarArr = {f24170d, f24167a, f24171e, f24169c, f24168b, f24173h, f24175j, f24172g, f24174i};
        int i6 = i4 + 91;
        f24180p = i6 % 128;
        int i7 = i6 % 2;
        return dVarArr;
    }

    public static d e(String str) {
        int i2 = 2 % 2;
        d[] dVarArrValues = values();
        int length = dVarArrValues.length;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                int i4 = f24180p + 19;
                f24184t = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            d dVar = dVarArrValues[i3];
            if (dVar.f24187f.equals(str)) {
                int i5 = f24180p + 71;
                f24184t = i5 % 128;
                if (i5 % 2 == 0) {
                    return dVar;
                }
                obj.hashCode();
                throw null;
            }
            i3++;
        }
    }

    static void e() {
        f24177m = new char[]{56323, 56717, 56715, 56708, 56716, 56717, 56718, 56725, 56716, 56441, 56705, 56717, 56719, 56726, 56725, 56704, 56441, 56710, 56439, 56498, 56555, 56563, 56546, 56545, 56555, 56557, 56564, 56563, 56542, 56535, 56548, 56533, 56322, 56705, 56704, 56718, 56720, 56714, 56719, 56720, 56713, 56711, 56724, 56723, 56718, 56719, 56711, 56537, 56377, 56362, 56354, 56369, 56358, 56357, 56484, 56533, 56548, 56541, 56549, 56563, 56487, 56524, 56523, 56537, 56545, 56540, 56538, 56551, 56395, 56393, 56398, 56400, 56394, 56393, 56394, 56393, 56407, 56531, 56346, 56346, 56361, 56348, 56347, 56502, 56556, 56564, 56566, 56565, 56574, 56567, 56565, 56322, 56323, 56489, 56540, 56548, 56556, 56563, 56555, 56535, 56539, 56559, 56562, 56564, 56490, 56524, 56516, 56524, 56531, 56532, 56530, 56527, 56523, 56532, 56530, 56523, 56532, 56378, 56396, 56396, 56402, 56398, 56394, 56379, 56374, 56397, 56399, 56534, 56372, 56370, 56363, 56378, 56382, 56367, 56371, 56375, 56369, 56369, 56367};
        f24179o = -271550831;
        f24176l = 1150422479;
        f24181q = -1057717463;
        f24182r = new byte[]{-3, Ascii.RS, -15, -2, 2, -2, Ascii.SO, Ascii.GS, -5, -31, 2, 2, -1, Ascii.CR, Ascii.SI, 5, -27, Ascii.NAK, Ascii.CR, -12, 74, 69, -77, -86, 94, 70, -65, 64, 68, -80, -71, -93, 92, -70, -93, 5, 3, 17, MessagePack.Code.NEGFIXINT_PREFIX, -8, 1, Ascii.FS, -14, 3, -17, Ascii.CR, -26, -17, -16, -115, -115, -115, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, -5, 39, 97};
        $$b = 67;
    }

    private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f24177m;
        int i10 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i10;
                        objA = o.d.d.a(249 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1376582792, false, $$c((byte) 13, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    int i11 = $11 + 97;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 % 2;
                    }
                    i10 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - (ViewConfiguration.getEdgeSlop() >> 16), (char) Color.blue(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i3 = 2;
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) (-1);
                        objA3 = o.d.d.a(836 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.getOffsetBefore("", 0) + 27279), 11 - (Process.myTid() >> 22), -1210801192, false, $$c((byte) 17, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    int i15 = $10 + 41;
                    $11 = i15 % 128;
                    i3 = 2;
                    int i16 = i15 % 2;
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = new Object[i3];
                objArr5[1] = mVar;
                objArr5[0] = mVar;
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - Color.blue(0), (char) (35715 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i17 = $10 + 53;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                char[] cArr5 = new char[i7];
                i2 = 0;
                System.arraycopy(cArr3, 1, cArr5, 0, i7);
                System.arraycopy(cArr5, 1, cArr3, i7 << i9, i9);
                System.arraycopy(cArr5, i9, cArr3, 0, i7 - i9);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i7];
                System.arraycopy(cArr3, 0, cArr6, 0, i7);
                int i18 = i7 - i9;
                System.arraycopy(cArr6, 0, cArr3, i18, i9);
                System.arraycopy(cArr6, i9, cArr3, 0, i18);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i7];
            mVar.f19943d = i2;
            int i19 = $10 + 11;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            while (mVar.f19943d < i7) {
                cArr7[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                mVar.f19943d++;
            }
            cArr3 = cArr7;
        }
        if (i8 > 0) {
            int i21 = $11 + 89;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i7) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f24180p + 107;
        f24184t = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        int i5 = f24180p + 73;
        f24184t = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f24180p + 1;
        f24184t = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = f24178n;
        if (i4 == 0) {
            return (d[]) dVarArr.clone();
        }
        d[] dVarArr2 = (d[]) dVarArr.clone();
        int i5 = 65 / 0;
        return dVarArr2;
    }

    private static void w(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2;
        int i6 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24176l)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                int bitsPerPixel = 237 - ImageFormat.getBitsPerPixel(0);
                char size = (char) (44531 - View.MeasureSpec.getSize(0));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                byte b3 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 5)));
                byte b4 = (byte) (-b3);
                objA = o.d.d.a(bitsPerPixel, size, iResolveOpacity, 35969549, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i7 != 0) {
                int i8 = $11;
                int i9 = i8 + 101;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f24182r;
                if (bArr != null) {
                    int i10 = i8 + 99;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objA2 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 12 - (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)), 1621469864, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i12++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $11 + 79;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    byte[] bArr3 = f24182r;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f24179o)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        int iAxisFromString = MotionEvent.axisFromString("") + 239;
                        char cMyTid = (char) ((Process.myTid() >> 22) + 44531);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 12;
                        byte b7 = (byte) ($$b & 5);
                        byte b8 = (byte) (-b7);
                        objA3 = o.d.d.a(iAxisFromString, cMyTid, iIndexOf, 35969549, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24176l) ^ (-7649639543924978291L))));
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) f24183s[i2 + ((int) (((long) f24179o) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24176l) ^ (-7649639543924978291L))));
                    int i15 = $10 + 45;
                    $11 = i15 % 128;
                    i5 = 2;
                    int i16 = i15 % 2;
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - i5) + ((int) (((long) f24179o) ^ (-7649639543924978291L))) + i7;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24181q), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0) + 5358), 11 - View.MeasureSpec.getSize(0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f24182r;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = $10 + 35;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $11 + 45;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        int i22 = $11 + 113;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = f24182r;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f24183s;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24180p;
        int i4 = i3 + 25;
        f24184t = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24187f;
        int i6 = i3 + 51;
        f24184t = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final e b() {
        int i2 = 2 % 2;
        int i3 = f24184t + 77;
        f24180p = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f24188k;
        }
        throw null;
    }
}
