package o.dt;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.l;
import o.i.c;
import o.m.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23332c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f23333d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23334e = 0;

    private static String $$f(short s2, int i2, int i3) {
        byte[] bArr = $$d;
        int i4 = i2 * 4;
        int i5 = (s2 * 3) + 4;
        int i6 = 121 - (i3 * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        int i8 = -1;
        if (bArr == null) {
            i5++;
            i6 = i7 + i6;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i6;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            int i9 = bArr[i5];
            i5++;
            i6 += i9;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23332c = 0;
        f23334e = 1;
        c();
        View.combineMeasuredStates(0, 0);
        int i2 = f23332c + 73;
        f23334e = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() throws Throwable {
        Object[] objArr = new Object[1];
        h(new int[]{-348894271, -394403688, -970599259, 681765107, -1193245904, 1796305336, 1008309958, 235575812, 2109898415, 411388271, -641888440, -298913163, 132402771, 724133588}, 28 - TextUtils.indexOf("", "", 0, 0), objArr);
        super(((String) objArr[0]).intern(), f.f26436a, true);
    }

    static void c() {
        f23333d = new int[]{-1040459075, 954109136, 9838394, -1943065394, 769102824, -1100927902, 767519883, -1145193472, -1190850476, 1675360808, 791882681, 2008021129, 658166047, 2138342097, -1263779503, -699838365, -432839412, 437098661};
    }

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f23333d;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - TextUtils.indexOf("", "", i6, i6), (char) Color.red(i6), 11 - ImageFormat.getBitsPerPixel(i6), -328001469, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 2;
                    i5 = 989264422;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23333d;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - ExpandableListView.getPackedPositionChild(j2), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 12, -328001469, false, $$f(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i10++;
                j2 = 0;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c2] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = $11 + 91;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                lVar.f19942e ^= iArr4[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (52697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, -1416256172, false, $$f(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 230, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51004), View.getDefaultSize(0, 0) + 9, -330018025, false, $$f(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i17 = $10 + 55;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$d = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
        $$e = 76;
    }
}
