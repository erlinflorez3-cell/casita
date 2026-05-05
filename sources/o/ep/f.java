package o.ep;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements o.en.a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ f[] f24510a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f24511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f24512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f24513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f24514f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f24515g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24516h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f24517i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f24518j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f24519l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24520b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            int r0 = r10 * 2
            int r8 = 1 - r0
            int r0 = r11 + 4
            byte[] r7 = o.ep.f.$$a
            int r6 = r9 + 102
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L28
            r6 = r8
            r1 = r0
            r3 = r4
        L12:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L16:
            int r3 = r2 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            int r1 = r0 + 1
            if (r3 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r7[r1]
            goto L12
        L28:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.f.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24518j = 0;
        f24519l = 1;
        f24516h = 0;
        f24515g = 1;
        d();
        Object[] objArr = new Object[1];
        k(8 - TextUtils.lastIndexOf("", '0', 0), "\u0004\u0006\u0017\u0003\t\u000e\u0015\n㘬", (byte) (Color.green(0) + 46), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k(Gravity.getAbsoluteGravity(0, 0) + 9, "\u0002\u0010\n\r\u000f\u0012\u0017\u000b㙖", (byte) (View.resolveSize(0, 0) + 120), objArr2);
        f24513e = new f(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k(TextUtils.lastIndexOf("", '0') + 11, "\u0001\u000b\u0004\u0006\u0017\u0003\t\u000e\u0015\n", (byte) (34 - Color.blue(0)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        k(11 - (Process.myPid() >> 22), "\u0001\u0015\u000b\u0000\u0013\f\u000e\u0011\u0010\u0016㙊", (byte) (TextUtils.getOffsetAfter("", 0) + 107), objArr4);
        f24511c = new f(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        k(7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0006\f\u0007\u0017\u0001\n㙤", (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 102), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        k((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, "\b\f\u0000\u0007\b\u0012㘒", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 52), objArr6);
        f24512d = new f(strIntern3, 2, ((String) objArr6[0]).intern());
        f24510a = c();
        int i2 = f24519l + 47;
        f24518j = i2 % 128;
        int i3 = i2 % 2;
    }

    private f(String str, int i2, String str2) {
        this.f24520b = str2;
    }

    private static /* synthetic */ f[] c() {
        int i2 = 2 % 2;
        int i3 = f24515g;
        int i4 = i3 + 9;
        f24516h = i4 % 128;
        int i5 = i4 % 2;
        f[] fVarArr = {f24513e, f24511c, f24512d};
        int i6 = i3 + 7;
        f24516h = i6 % 128;
        int i7 = i6 % 2;
        return fVarArr;
    }

    static void d() {
        f24514f = new char[]{64598, 64627, 64611, 64630, 64577, 64624, 64586, 64631, 64579, 64580, 64634, 64576, 64620, 64608, 64617, 64596, 64618, 64612, 64585, 64609, 64593, 64625, 64592, 64588, 64597};
        f24517i = (char) 51642;
    }

    static void init$0() {
        $$a = new byte[]{121, -71, 80, 66};
        $$b = 29;
    }

    private static void k(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $10 + 51;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f24514f;
        int i7 = 421932776;
        float f2 = 0.0f;
        int i8 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 270, (char) (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -811348851, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i7 = 421932776;
                    f2 = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(f24517i)};
        Object objA2 = o.d.d.a(421932776);
        long j2 = 0;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 271, (char) (KeyEvent.getMaxKeyCode() >> 16), (-16777205) - Color.rgb(0, 0, 0), -811348851, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i10 = $10 + 67;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                i3 = i2 + 71;
                cArr4[i3] = (char) (cArr[i3] << b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i11 = $10 + 37;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i8];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        objA3 = o.d.d.a(825 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 11 - ExpandableListView.getPackedPositionType(j2), -611683395, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 43))), b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(218 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 212688716, false, $$c((byte) ($$b >>> 2), b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[i14];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else {
                        int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr2[i16];
                        i8 = 1;
                        cArr4[hVar.f19926b + 1] = cArr2[i17];
                    }
                    i8 = 1;
                }
                hVar.f19926b += 2;
                j2 = 0;
            }
        }
        int i18 = 0;
        while (i18 < i2) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            i18++;
            int i19 = $10 + 71;
            $11 = i19 % 128;
            int i20 = i19 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public static f valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f24516h + 83;
        f24515g = i3 % 128;
        int i4 = i3 % 2;
        f fVar = (f) Enum.valueOf(f.class, str);
        if (i4 != 0) {
            return fVar;
        }
        throw null;
    }

    public static f[] values() {
        int i2 = 2 % 2;
        int i3 = f24516h + 79;
        f24515g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        f[] fVarArr = (f[]) f24510a.clone();
        int i4 = f24515g + 45;
        f24516h = i4 % 128;
        if (i4 % 2 == 0) {
            return fVarArr;
        }
        throw null;
    }

    @Override // o.en.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24515g + 9;
        int i4 = i3 % 128;
        f24516h = i4;
        int i5 = i3 % 2;
        String str = this.f24520b;
        int i6 = i4 + 35;
        f24515g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
