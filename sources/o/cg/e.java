package o.cg;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.a.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<String, String> f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f22291b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<String, String> f22292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f22293d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22294e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22295h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22296i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, int r11) {
        /*
            int r0 = r10 * 2
            int r8 = 4 - r0
            byte[] r7 = o.cg.e.$$a
            int r6 = r11 + 102
            int r0 = r9 * 2
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2a
            r2 = r3
            r1 = r8
        L13:
            int r8 = r8 + r6
            int r0 = r1 + 1
            r6 = r8
            r8 = r0
        L18:
            byte r0 = (byte) r6
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r8]
            r1 = r8
            r8 = r0
            goto L13
        L2a:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.e.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22296i = 0;
        f22295h = 1;
        c();
        TextUtils.indexOf("", "", 0);
        MotionEvent.axisFromString("");
        TextUtils.getTrimmedLength("");
        KeyEvent.normalizeMetaState(0);
        TypedValue.complexToFloat(0);
        Process.myTid();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getWindowTouchSlop();
        Color.alpha(0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getLongPressTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf("", "");
        Color.rgb(0, 0, 0);
        Process.getElapsedCpuTime();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.argb(0, 0, 0, 0);
        Drawable.resolveOpacity(0, 0);
        Color.green(0);
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getScrollBarSize();
        KeyEvent.getDeadChar(0, 0);
        ImageFormat.getBitsPerPixel(0);
        ExpandableListView.getPackedPositionGroup(0L);
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        f(8 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0011\u0000 \u0014\u0001\t\u0006 ", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 23), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f(View.getDefaultSize(0, 0) + 4, "\u0011\u0000 \u0014", (byte) (106 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
        map.put(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        g("澁濌\uda5a᧸諾紴벊恆쪷混\uf76b갑炜直尀鷀", ViewConfiguration.getWindowTouchSlop() >> 8, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        f(8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0011\u0000 \u0014\u0002\u001b\b ", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 84), objArr4);
        map.put(strIntern2, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        g("氎汃騝妿뮪㰣ጉ揉諳Ⳡ壨Β", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        f(Color.red(0) + 4, "\u0011\u0000 \u0014", (byte) (107 - ExpandableListView.getPackedPositionGroup(0L)), objArr6);
        map.put(strIntern3, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        g("ꀰꁽ뢩笋ጏ钆瀧꿷ꡇ葅㯆悼뼭顛떲六", View.resolveSizeAndState(0, 0, 0), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        f(KeyEvent.normalizeMetaState(0) + 8, "\u0011\u0000 \u0014\u0002\u001b\b ", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 85), objArr8);
        map.put(strIntern4, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        g("㉂㈔缑벣蹷২᷿㷫濳ᤫ嘒", ViewConfiguration.getTapTimeout() >> 16, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        f((Process.myTid() >> 22) + 3, "\u0017\u0014㗌", (byte) (TextUtils.indexOf("", "", 0, 0) + 3), objArr10);
        map.put(strIntern5, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        f((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, "\u0017\u0014\u000f\u0002\b\t\u001e\u001b\u001d\u0014㘦", (byte) (83 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        g("ﭥדּ柿ꑍḑ馎\ue2e6\uf4b8省褰ꤋ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
        map.put(strIntern6, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        f((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, "\u0017\u000b\u0018\u000e\u0017\u0005\u0004\u0000\u0019\u000e\u0005#\u0007\u0015", (byte) (107 - TextUtils.indexOf((CharSequence) "", '0')), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        f((ViewConfiguration.getTapTimeout() >> 16) + 6, "\u0017\u000b\u0018\u000e\u0017\u0005", (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 96), objArr14);
        map.put(strIntern7, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        f(11 - TextUtils.indexOf("", "", 0, 0), "\t\u0016\u0002\u0004\u0002\u001d\u0011\u001f\u001b\u000b㘕", (byte) (71 - KeyEvent.getDeadChar(0, 0)), objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        g("㫊㪀윲җ⩵귻⹐", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
        map.put(strIntern8, ((String) objArr16[0]).intern());
        f22290a = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        Object[] objArr17 = new Object[1];
        f(ExpandableListView.getPackedPositionChild(0L) + 4, "\u001b\u0013㗮", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        f(3 - (ViewConfiguration.getScrollBarSize() >> 8), "\u001b\u0013㗮", (byte) (15 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr18);
        map2.put(strIntern9, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        f(2 - MotionEvent.axisFromString(""), "\u000f\u0014㙇", (byte) (108 - KeyEvent.keyCodeFromString("")), objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        f(TextUtils.getOffsetBefore("", 0) + 3, "\u000f\u0014㙇", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 107), objArr20);
        map2.put(strIntern10, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        g("ὄἀ塦鯉⺽ꤶ멸ႈ䣶릕\uf183ꪖ7碞蠓鬥", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        g("ὄἀ塦鯉⺽ꤶ멸ႈ䣶릕\uf183ꪖ7碞蠓鬥", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr22);
        map2.put(strIntern11, ((String) objArr22[0]).intern());
        f22292c = Collections.unmodifiableMap(map2);
        int i2 = f22296i + 117;
        f22295h = i2 % 128;
        int i3 = i2 % 2;
    }

    static void c() {
        f22293d = new char[]{51640, 64615, 64535, 64634, 51643, 64609, 64592, 64532, 64523, 64617, 64623, 51645, 64616, 64611, 64630, 51641, 51642, 64620, 51646, 64625, 64599, 64614, 64627, 64629, 64520, 64621, 64608, 64598, 51644, 64624, 64533, 64577, 64576, 64541, 64637, 64612};
        f22291b = (char) 51641;
        f22294e = -8241715879975235172L;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 43;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f22293d;
        int i7 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(TextUtils.indexOf("", "") + 270, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i7 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f22291b)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - Gravity.getAbsoluteGravity(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), 11 - TextUtils.indexOf("", "", 0), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 % 3;
                    }
                    i4 = 2;
                } else {
                    Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -611683395, false, $$c(b7, b8, (byte) ((b8 + 9) - (9 & b8))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + JfifUtil.MARKER_SOS, (char) View.resolveSizeAndState(0, 0, 0), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 212688716, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i11 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i11];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i12 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i12];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else {
                        int i14 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i14];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                        int i16 = $10 + 71;
                        $11 = i16 % 128;
                        i4 = 2;
                        int i17 = i16 % 2;
                    }
                    i4 = 2;
                }
                hVar.f19926b += i4;
            }
        }
        for (int i18 = 0; i18 < i2; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 33;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22294e ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        int i8 = $10 + 125;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (kVar.f19939c < cArrC.length) {
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22294e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 229, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 51004), View.MeasureSpec.getSize(0) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(676 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 12, 522683165, false, $$c(b4, b5, (byte) ((b5 + Ascii.FF) - (12 & b5))), new Class[]{Object.class, Object.class});
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

    static void init$0() {
        $$a = new byte[]{120, 46, 101, 90};
        $$b = 47;
    }
}
