package o.bv;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
final class i {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f21754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f21755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f21756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f21758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f21759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f21760g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ i[] f21761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f21762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21763k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21764l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static char[] f21765m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21766n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21767o = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21768h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r2 = r6 * 2
            int r1 = 1 - r2
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r0 = r7 * 4
            int r7 = 120 - r0
            byte[] r6 = o.bv.i.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2c
            r1 = r8
            r0 = r4
        L17:
            int r7 = r7 + r1
        L18:
            byte r1 = (byte) r7
            r5[r0] = r1
            int r8 = r8 + 1
            if (r0 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r0 = r0 + 1
            r2 = r6[r8]
            r1 = r7
            r7 = r2
            goto L17
        L2c:
            r0 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.i.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21766n = 0;
        f21764l = 1;
        f21763k = 0;
        f21767o = 1;
        c();
        Object[] objArr = new Object[1];
        p("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{0, 9, 0, 8}, true, objArr);
        f21755b = new i(((String) objArr[0]).intern(), 0, 0);
        Object[] objArr2 = new Object[1];
        p("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{9, 8, 0, 7}, false, objArr2);
        f21757d = new i(((String) objArr2[0]).intern(), 1, 10);
        Object[] objArr3 = new Object[1];
        p("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{17, 14, 0, 3}, true, objArr3);
        f21758e = new i(((String) objArr3[0]).intern(), 2, 20);
        Object[] objArr4 = new Object[1];
        p("\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{31, 8, 160, 0}, true, objArr4);
        f21756c = new i(((String) objArr4[0]).intern(), 3, 30);
        Object[] objArr5 = new Object[1];
        p("\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{39, 7, 0, 6}, true, objArr5);
        f21754a = new i(((String) objArr5[0]).intern(), 4, 40);
        Object[] objArr6 = new Object[1];
        p("\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{46, 12, 0, 4}, true, objArr6);
        f21762j = new i(((String) objArr6[0]).intern(), 5, 50);
        Object[] objArr7 = new Object[1];
        p("\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{58, 7, 0, 0}, false, objArr7);
        f21760g = new i(((String) objArr7[0]).intern(), 6, 60);
        Object[] objArr8 = new Object[1];
        p(null, new int[]{65, 13, 136, 12}, true, objArr8);
        f21759f = new i(((String) objArr8[0]).intern(), 7, 70);
        f21761i = d();
        int i2 = f21766n + 27;
        f21764l = i2 % 128;
        int i3 = i2 % 2;
    }

    private i(String str, int i2, int i3) {
        this.f21768h = i3;
    }

    static void c() {
        f21765m = new char[]{56502, 56551, 56545, 56550, 56554, 56549, 56555, 56539, 56531, 56504, 56554, 56546, 56554, 56558, 56555, 56554, 56542, 56498, 56554, 56546, 56540, 56548, 56555, 56557, 56559, 56563, 56555, 56539, 56539, 56556, 56554, 56322, 56708, 56712, 56711, 56705, 56714, 56718, 56438, 56500, 56554, 56550, 56555, 56562, 56539, 56534, 56500, 56559, 56557, 56532, 56532, 56552, 56541, 56543, 56559, 56545, 56540, 56548, 56486, 56539, 56558, 56563, 56558, 56555, 56554, 56429, 56442, 56445, 56431, 56433, 56430, 56438, 56439, 56395, 56444, 56439, 56406, 56428};
    }

    private static /* synthetic */ i[] d() {
        int i2 = 2 % 2;
        int i3 = f21763k;
        int i4 = i3 + 79;
        f21767o = i4 % 128;
        int i5 = i4 % 2;
        i[] iVarArr = {f21755b, f21757d, f21758e, f21756c, f21754a, f21762j, f21760g, f21759f};
        int i6 = i3 + 73;
        f21767o = i6 % 128;
        int i7 = i6 % 2;
        return iVarArr;
    }

    static void init$0() {
        $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
        $$b = 170;
    }

    private static void p(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
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
        char[] cArr = f21765m;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i5 < length) {
                int i10 = $11 + 45;
                $10 = i10 % 128;
                if (i10 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(249 - ExpandableListView.getPackedPositionGroup(j2), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 1376582792, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i5])};
                    Object objA2 = o.d.d.a(-2071388435);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 250, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 1376582792, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
                j2 = 0;
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
                    int i11 = $10 + 25;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 11, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i13 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(120026474);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getOffsetAfter("", 0), 10 - (ViewConfiguration.getScrollBarSize() >> 8), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr6 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA5 = o.d.d.a(1632715197);
                    if (objA5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA5 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 836, (char) (27280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1210801192, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA5).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr7 = {mVar, mVar};
                Object objA6 = o.d.d.a(-1041906996);
                if (objA6 == null) {
                    objA6 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, (char) (35715 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i15 = $10 + 5;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i7];
                System.arraycopy(cArr3, 1, cArr5, 1, i7);
                System.arraycopy(cArr5, 1, cArr3, i7 << i9, i9);
                System.arraycopy(cArr5, i9, cArr3, 1, i7 * i9);
                i2 = 0;
            } else {
                char[] cArr6 = new char[i7];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr6, 0, i7);
                int i16 = i7 - i9;
                System.arraycopy(cArr6, 0, cArr3, i16, i9);
                System.arraycopy(cArr6, i9, cArr3, 0, i16);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i7];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i17 = $11 + 91;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr7[mVar.f19943d] = cArr3[(mVar.f19943d + i7) % 0];
                    i2 = mVar.f19943d >>> 1;
                } else {
                    cArr7[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr7;
        }
        if (i8 > 0) {
            mVar.f19943d = 0;
            while (mVar.f19943d < i7) {
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
                int i18 = $11 + 115;
                $10 = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static i valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21767o + 107;
        f21763k = i3 % 128;
        int i4 = i3 % 2;
        i iVar = (i) Enum.valueOf(i.class, str);
        if (i4 != 0) {
            int i5 = 73 / 0;
        }
        return iVar;
    }

    public static i[] values() {
        int i2 = 2 % 2;
        int i3 = f21763k + 31;
        f21767o = i3 % 128;
        int i4 = i3 % 2;
        i[] iVarArr = (i[]) f21761i.clone();
        int i5 = f21763k + 83;
        f21767o = i5 % 128;
        if (i5 % 2 != 0) {
            return iVarArr;
        }
        throw null;
    }

    public final int b() {
        int i2 = 2 % 2;
        int i3 = f21763k + 79;
        f21767o = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f21768h;
        if (i4 == 0) {
            int i6 = 47 / 0;
        }
        return i5;
    }
}
