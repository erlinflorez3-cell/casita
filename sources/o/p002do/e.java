package o.p002do;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.k;
import o.a.m;
import o.dl.c;
import o.ei.d;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23209a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f23210c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f23211d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23212e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            int r3 = r7 * 4
            int r2 = 1 - r3
            byte[] r7 = o.p002do.e.$$a
            int r6 = 120 - r6
            int r0 = r5 * 3
            int r1 = 3 - r0
            byte[] r5 = new byte[r2]
            r4 = 0
            int r3 = 0 - r3
            if (r7 != 0) goto L2b
            r2 = r4
            r0 = r1
        L15:
            int r1 = -r1
            int r1 = r1 + r6
            r6 = r1
            r1 = r0
        L19:
            byte r0 = (byte) r6
            r5[r2] = r0
            int r0 = r1 + 1
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r2 = r2 + 1
            r1 = r7[r0]
            goto L15
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p002do.e.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23212e = 0;
        f23209a = 1;
        f23211d = -1914396213034808899L;
        f23210c = new char[]{56483, 56509, 56533, 56359, 56473, 56505, 56509, 56511, 56476, 56502, 56474, 56507, 56564, 56413, 56411, 56420, 56480, 56507, 56509, 56511, 56483, 56511, 56504, 56501, 56501, 56561, 56560, 56559, 56476, 56501, 56508, 56509, 56476, 56502, 56499, 56508, 56515, 56332, 56329, 56575, 56473, 56501, 56483, 56511, 56503, 56501, 56475, 56504, 56511, 56509, 56538, 56378};
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23209a + 89;
        f23212e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        g("\u0000\u0000\u0001\u0001", new int[]{12, 4, 162, 3}, false, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f("藶ﺾ箢藏政䰜鈿䄫", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        byte[] bArrC = d.c(((String) objArr2[0]).intern(), bArr4);
        Object[] objArr3 = new Object[1];
        g("\u0001\u0000\u0001\u0001", new int[]{16, 4, 0, 0}, true, objArr3);
        byte[] bArrC2 = d.c(strIntern, bArrC, d.c(((String) objArr3[0]).intern(), bArr5));
        Object[] objArr4 = new Object[1];
        g("\u0001\u0000", new int[]{10, 2, 0, 2}, true, objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        g("\u0000\u0001", new int[]{2, 2, 117, 2}, false, objArr5);
        byte[] bArrC3 = d.c(((String) objArr5[0]).intern(), bArr2);
        Object[] objArr6 = new Object[1];
        g("\u0000\u0001\u0001\u0001", new int[]{20, 4, 0, 2}, true, objArr6);
        byte[] bArrC4 = d.c(((String) objArr6[0]).intern(), bArr3);
        Object[] objArr7 = new Object[1];
        f("崍泂懰崸\uf743噌\u0cff\udfee", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr7);
        byte[] bArrC5 = d.c(strIntern2, bArrC3, bArrC4, d.c(((String) objArr7[0]).intern(), null), bArrC2);
        Object[] objArr8 = new Object[1];
        f("\u0eeb\uda21\ue569ໝ䆠䈰", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr8);
        String strIntern3 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        g("\u0000\u0000", new int[]{8, 2, 0, 1}, true, objArr9);
        byte[] bArrC6 = d.c(strIntern3, d.c(((String) objArr9[0]).intern(), bArr), bArrC5);
        int i5 = f23212e + 107;
        f23209a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return bArrC6;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23209a + 113;
        f23212e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("棦ಂ㮏棑靵㏌", Color.rgb(0, 0, 0) + 16777217, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f("벹䆢\uedc0벀\uda23\uda7e䎋郩", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        byte[] bArrC = d.c(((String) objArr2[0]).intern(), bArr);
        Object[] objArr3 = new Object[1];
        f("컁\udc36쯇컴䞷ﱻ\u0ee2\udd87", View.resolveSizeAndState(0, 0, 0) + 1, objArr3);
        byte[] bArrC2 = d.c(((String) objArr3[0]).intern(), bArr2);
        Object[] objArr4 = new Object[1];
        g("\u0001\u0001\u0001\u0000", new int[]{24, 4, 50, 0}, false, objArr4);
        byte[] bArrC3 = d.c(((String) objArr4[0]).intern(), bArr3);
        Object[] objArr5 = new Object[1];
        g("\u0000\u0000\u0000\u0001", new int[]{28, 4, 0, 0}, true, objArr5);
        byte[] bArrC4 = d.c(((String) objArr5[0]).intern(), bArr4);
        Object[] objArr6 = new Object[1];
        f("度㽍ࢮ器\ua4cc㼑鎷䃛", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr6);
        byte[] bArrC5 = d.c(((String) objArr6[0]).intern(), bArr5);
        Object[] objArr7 = new Object[1];
        g("\u0001\u0001\u0000\u0000", new int[]{32, 4, 0, 1}, true, objArr7);
        byte[] bArrC6 = d.c(strIntern, bArrC, bArrC2, bArrC3, bArrC4, bArrC5, d.c(((String) objArr7[0]).intern(), bArr6));
        int i5 = f23212e + 121;
        f23209a = i5 % 128;
        int i6 = i5 % 2;
        return bArrC6;
    }

    public static c b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) throws Throwable {
        int i2 = 2 % 2;
        c cVar = new c();
        Object[] objArr = new Object[1];
        f("䁃ⶹ턮䁶똸\ue692숁ᅠ", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        d.c(((String) objArr[0]).intern(), bArr);
        Object[] objArr2 = new Object[1];
        g("\u0000\u0000", new int[]{50, 2, 127, 2}, false, objArr2);
        d.c(((String) objArr2[0]).intern(), bArr2);
        Object[] objArr3 = new Object[1];
        f("벹䆢\uedc0벀\uda23\uda7e䎋郩", 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        d.c(((String) objArr3[0]).intern(), bArr3);
        Object[] objArr4 = new Object[1];
        g("\u0000\u0000\u0000\u0001", new int[]{28, 4, 0, 0}, true, objArr4);
        d.c(((String) objArr4[0]).intern(), bArr4);
        Object[] objArr5 = new Object[1];
        f("度㽍ࢮ器\ua4cc㼑鎷䃛", 1 - (Process.myTid() >> 22), objArr5);
        d.c(((String) objArr5[0]).intern(), bArr5);
        Object[] objArr6 = new Object[1];
        g("\u0001\u0001\u0000\u0000", new int[]{32, 4, 0, 1}, true, objArr6);
        d.c(((String) objArr6[0]).intern(), bArr6);
        int i3 = f23212e + 67;
        f23209a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return cVar;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23209a + 57;
        f23212e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("棦ಂ㮏棑靵㏌", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        g("\u0000\u0001\u0001\u0000", new int[]{42, 4, 0, 2}, true, objArr2);
        byte[] bArrC = d.c(((String) objArr2[0]).intern(), bArr);
        Object[] objArr3 = new Object[1];
        g("\u0001\u0000\u0001\u0000", new int[]{46, 4, 0, 1}, false, objArr3);
        byte[] bArrC2 = d.c(((String) objArr3[0]).intern(), bArr2);
        Object[] objArr4 = new Object[1];
        f("摯栖\ue73b摖\uf397킁\uf052⌿", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        byte[] bArrC3 = d.c(strIntern, bArrC, bArrC2, d.c(((String) objArr4[0]).intern(), bArr3));
        int i5 = f23209a + 31;
        f23212e = i5 % 128;
        int i6 = i5 % 2;
        return bArrC3;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte b2, byte[] bArr3, byte[] bArr4) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23212e + 69;
        f23209a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("피骔\ue18f픊Ţ䃍", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        g("\u0000\u0000", new int[]{0, 2, 0, 0}, true, objArr2);
        byte[] bArrC = d.c(((String) objArr2[0]).intern(), bArr);
        Object[] objArr3 = new Object[1];
        g("\u0000\u0001", new int[]{2, 2, 117, 2}, false, objArr3);
        byte[] bArrC2 = d.c(((String) objArr3[0]).intern(), bArr2);
        Object[] objArr4 = new Object[1];
        f("㲈忱ﳊ㲰쐁銸", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        byte[] bArrC3 = d.c(((String) objArr4[0]).intern(), b2);
        Object[] objArr5 = new Object[1];
        f("藶ﺾ箢藏政䰜鈿䄫", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
        byte[] bArrC4 = d.c(((String) objArr5[0]).intern(), bArr3);
        Object[] objArr6 = new Object[1];
        g("\u0000\u0001\u0000\u0001", new int[]{4, 4, 0, 2}, false, objArr6);
        byte[] bArrC5 = d.c(strIntern, bArrC, bArrC2, bArrC3, bArrC4, d.c(((String) objArr6[0]).intern(), bArr4));
        Object[] objArr7 = new Object[1];
        f("\u0eeb\uda21\ue569ໝ䆠䈰", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        g("\u0000\u0000", new int[]{8, 2, 0, 1}, true, objArr8);
        byte[] bArrC6 = d.c(((String) objArr8[0]).intern(), c.a());
        Object[] objArr9 = new Object[1];
        g("\u0001\u0000", new int[]{10, 2, 0, 2}, true, objArr9);
        String strIntern3 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        g("\u0000\u0000\u0001\u0001", new int[]{12, 4, 162, 3}, false, objArr10);
        byte[] bArrC7 = d.c(strIntern2, bArrC6, d.c(strIntern3, d.c(((String) objArr10[0]).intern(), bArrC5)));
        int i5 = f23212e + 89;
        f23209a = i5 % 128;
        int i6 = i5 % 2;
        return bArrC7;
    }

    public static byte[] e(byte b2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23212e + 9;
        f23209a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("棦ಂ㮏棑靵㏌", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f("\ue9a7륅詅\ue99f⋄⻀", -((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        byte[] bArrC = d.c(((String) objArr2[0]).intern(), b2);
        Object[] objArr3 = new Object[1];
        f("譢\ueac7읂譛焰⮛", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr3);
        byte[] bArrC2 = d.c(((String) objArr3[0]).intern(), bArr);
        Object[] objArr4 = new Object[1];
        g("\u0000\u0001\u0001\u0001", new int[]{36, 4, 77, 0}, false, objArr4);
        byte[] bArrC3 = d.c(((String) objArr4[0]).intern(), bArr2);
        Object[] objArr5 = new Object[1];
        g("\u0000\u0001", new int[]{40, 2, 0, 0}, true, objArr5);
        byte[] bArrC4 = d.c(strIntern, bArrC, bArrC2, bArrC3, d.c(((String) objArr5[0]).intern(), bArr3));
        int i5 = f23209a + 113;
        f23212e = i5 % 128;
        int i6 = i5 % 2;
        return bArrC4;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 85;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i5 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f23211d ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i9 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f23211d)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 228, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51004), View.MeasureSpec.getSize(0) + 9, 1749983833, false, $$c(b2, (byte) (13 | b2), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 675, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), 522683165, false, $$c(b3, (byte) (6 | b3), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i10 = $11 + 39;
                $10 = i10 % 128;
                int i11 = i10 % 2;
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

    private static void g(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = 0;
        Object bytes = str2;
        if (str2 != null) {
            int i6 = $11 + 99;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 45 / 0;
                bytes = str2.getBytes("ISO-8859-1");
            } else {
                bytes = str2.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr = f23210c;
        float f2 = 0.0f;
        if (cArr != null) {
            int i12 = $10 + 81;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int i15 = 249 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
                        char c2 = (char) (1 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)));
                        int size = View.MeasureSpec.getSize(i5) + 11;
                        byte length2 = (byte) $$a.length;
                        objA = o.d.d.a(i15, c2, size, 1376582792, false, $$c((byte) i5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i14] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i14++;
                    i5 = 0;
                    f2 = 0.0f;
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
        char[] cArr3 = new char[i9];
        System.arraycopy(cArr, i8, cArr3, 0, i9);
        if (bArr != null) {
            char[] cArr4 = new char[i9];
            mVar.f19943d = 0;
            char c3 = 0;
            while (mVar.f19943d < i9) {
                if (bArr[mVar.f19943d] == 1) {
                    int i16 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getTouchSlop() >> 8), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA3 = o.d.d.a(836 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ImageFormat.getBitsPerPixel(0) + 27280), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1210801192, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(Process.getGidForName("") + 22, (char) (35715 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i9];
            System.arraycopy(cArr3, 0, cArr5, 0, i9);
            int i18 = i9 - i11;
            System.arraycopy(cArr5, 0, cArr3, i18, i11);
            System.arraycopy(cArr5, i11, cArr3, 0, i18);
            int i19 = $11 + 19;
            $10 = i19 % 128;
            i2 = 2;
            int i20 = i19 % 2;
        } else {
            i2 = 2;
        }
        if (z2) {
            int i21 = $11 + 27;
            $10 = i21 % 128;
            int i22 = i21 % i2;
            char[] cArr6 = new char[i9];
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i9) {
                    break;
                }
                int i24 = $10 + 73;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    i3 = 1;
                    cArr6[mVar.f19943d] = cArr3[(i9 % mVar.f19943d) >> 1];
                } else {
                    i3 = 1;
                    cArr6[mVar.f19943d] = cArr3[(i9 - mVar.f19943d) - 1];
                }
                i23 = mVar.f19943d + i3;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i25 = 0;
            while (true) {
                mVar.f19943d = i25;
                if (mVar.f19943d >= i9) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i25 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{103, 35, 47, 90};
        $$b = 205;
    }
}
