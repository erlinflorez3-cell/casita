package o.ap;

import android.graphics.Color;
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
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f20459a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f20460b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f20461c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f20462d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f20463e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20464g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20465h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20466j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            byte[] r8 = o.ap.d.$$a
            int r0 = r10 * 6
            int r7 = 73 - r0
            int r2 = r11 * 3
            int r1 = 1 - r2
            int r0 = r9 * 3
            int r6 = r0 + 4
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2f
            r2 = r7
            r1 = r4
            r0 = r6
        L18:
            int r6 = r6 + r2
            int r0 = r0 + 1
            r7 = r6
            r6 = r0
        L1d:
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r1 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            int r1 = r1 + 1
            r2 = r8[r6]
            r0 = r6
            r6 = r7
            goto L18
        L2f:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.d.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20466j = 0;
        f20465h = 1;
        f20460b = 0;
        f20464g = 1;
        b();
        ExpandableListView.getPackedPositionForChild(0, 0);
        int i2 = f20466j + 69;
        f20465h = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        f20462d = new char[]{2481, 2456, 2439, 2437, 2458, 2480, 2463, 2433, 2460, 2446, 2478, 2448, 2441, 2488, 2496, 2497, 2462, 2447, 2440, 2434, 2444, 2435, 2494};
        f20463e = 2040400371;
        f20461c = true;
        f20459a = true;
    }

    public static o.ef.a e(o.ea.h hVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20460b + 9;
        f20464g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u0088\u0089\u008d\u0082\u0083\u008c\u0082\u0088\u0089\u008b\u008a\u008a\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0082\u0083\u0083\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u008a\u008a\u0089\u0088\u0087\u0087\u0086\u0088\u0089\u0084\u0084\u008e\u0089\u008d\u0082\u0083\u008c\u0082\u0088\u0089\u008a", objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.ef.a aVar = new o.ef.a();
        Object[] objArr3 = new Object[1];
        f(127 - ExpandableListView.getPackedPositionGroup(0L), null, null, "\u008f\u0089\u0084\u0082\u0083", objArr3);
        aVar.a(((String) objArr3[0]).intern(), (Object) hVar.a());
        Object[] objArr4 = new Object[1];
        f(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0090\u0089\u0084\u0082\u0083", objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        o.ea.h.f23529c = o.ea.h.f23529c * (-593550375);
        o.ea.h.f23532f = o.ea.h.f23532f * 669591005;
        o.ea.h.f23533g = o.ea.h.f23533g * 848311122;
        aVar.a(strIntern2, o.ea.h.e(r9, Process.myUid(), new Object[]{hVar}, r12, r13, 2086386304, -2086386303));
        Object[] objArr5 = new Object[1];
        f(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u0093\u0092\u0082\u0091", objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        o.ea.h.f23527a = o.ea.h.f23527a * (-1373774128);
        o.ea.h.f23528b = o.ea.h.f23528b * 1620262981;
        o.ea.h.f23530d = o.ea.h.f23530d * 2044819142;
        o.ea.h.f23531e = o.ea.h.f23531e * (-611124542);
        aVar.a(strIntern3, o.ea.h.e(r9, r10, new Object[]{hVar}, r12, r13, 207950346, -207950346));
        Object[] objArr6 = new Object[1];
        f(127 - View.resolveSize(0, 0), null, null, "\u0089\u0092\u008c\u0092\u008a", objArr6);
        aVar.a(((String) objArr6[0]).intern(), (Object) hVar.b());
        Object[] objArr7 = new Object[1];
        f(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0093\u0088\u0092\u0084\u0095\u0094\u0091", objArr7);
        aVar.a(((String) objArr7[0]).intern(), (Object) hVar.e());
        Object[] objArr8 = new Object[1];
        f(175 - AndroidCharacter.getMirror('0'), null, null, "\u0089\u0087\u0094\u0097\u0083\u008c\u0092\u008a\u0094\u0096", objArr8);
        String strIntern4 = ((String) objArr8[0]).intern();
        int iActiveCount = Thread.activeCount();
        int iActiveCount2 = Thread.activeCount();
        aVar.a(strIntern4, o.ea.h.e((int) Process.getElapsedCpuTime(), new Random().nextInt(), new Object[]{hVar}, iActiveCount, iActiveCount2, 1042765141, -1042765139));
        int i4 = f20464g + 111;
        f20460b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return aVar;
    }

    private static void f(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $10 + 29;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f20462d;
        long j2 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(593 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (13182 - (SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, -1225586509, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    j2 = -1;
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
        Object[] objArr3 = {Integer.valueOf(f20463e)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33, (char) Color.red(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f20459a) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(View.getDefaultSize(0, 0) + 458, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f20461c) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = $10 + 13;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i13 = $10 + 17;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[fVar.f19923e >> fVar.f19922a] >> i2] << iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 458, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 11, -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 459, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - TextUtils.lastIndexOf("", '0', 0), -1923924106, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.NAK, 117, 119, 110};
        $$b = 197;
    }
}
