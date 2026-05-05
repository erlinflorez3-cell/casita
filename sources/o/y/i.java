package o.y;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.as.e;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends e {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static char f27183k = 0;

    /* JADX INFO: renamed from: l */
    private static int f27184l = 0;

    /* JADX INFO: renamed from: m */
    private static int f27185m = 0;

    /* JADX INFO: renamed from: n */
    private static int f27186n = 0;

    /* JADX INFO: renamed from: o */
    private static char[] f27187o = null;

    /* JADX INFO: renamed from: s */
    private static int f27188s = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(byte r8, byte r9, short r10) {
        /*
            int r0 = r8 * 3
            int r8 = 3 - r0
            int r0 = r9 * 3
            int r7 = 1 - r0
            int r6 = 111 - r10
            byte[] r5 = o.y.i.$$k
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r6
            r2 = r3
            r6 = r7
        L14:
            int r6 = r6 + r0
            r1 = r2
        L16:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            int r8 = r8 + 1
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r8]
            goto L14
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.i.$$m(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27184l = 0;
        f27188s = 1;
        f27185m = 0;
        f27186n = 1;
        o();
        TextUtils.lastIndexOf("", '0');
        TextUtils.getTrimmedLength("");
        int i2 = f27184l + 87;
        f27188s = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(boolean z2, o.ep.d dVar, o.ep.i iVar) throws Throwable {
        Object[] objArr = new Object[1];
        C(Color.argb(0, 0, 0, 0) + 17, "\u0017\u0001\u0005\u0015\u0014\r\u0010\n\u0014\u000b\u0007\u0016\u0000\u000f\u0003\u0004㘺", (byte) (View.resolveSizeAndState(0, 0, 0) + 70), objArr);
        super(((String) objArr[0]).intern(), dVar, z2, iVar);
    }

    private static void C(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f27187o;
        int i5 = 421932776;
        long j2 = 0;
        int i6 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(Process.getGidForName("") + 271, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1))), 10 - Process.getGidForName(""), -811348851, false, $$m(b3, b4, (byte) (9 | b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i5 = 421932776;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f27183k)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - Drawable.resolveOpacity(0, 0), -811348851, false, $$m(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 9)))), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        int i8 = 13;
        if (i3 > 1) {
            int i9 = $11 + 23;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                int i10 = $11 + 79;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i6];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i6] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[i8];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i6] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 825;
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        String str$$m = $$m(b7, b8, b8);
                        Class[] clsArr = new Class[i8];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objA3 = o.d.d.a(i12, packedPositionGroup, iIndexOf, -611683395, false, str$$m, clsArr);
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            c2 = 11;
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + JfifUtil.MARKER_SOS, (char) TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") + 11, 212688716, false, $$m(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
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
                            i6 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        }
                    }
                    i6 = 1;
                }
                hVar.f19926b += 2;
                i8 = 13;
            }
        }
        for (int i18 = 0; i18 < i2; i18++) {
            int i19 = $10 + 13;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$k = new byte[]{Ascii.VT, -11, 98, 72};
        $$l = 217;
    }

    static void o() {
        f27187o = new char[]{51645, 64620, 64588, 64586, 64625, 64578, 64634, 64585, 51646, 64590, 64593, 64576, 51642, 64614, 64599, 64589, 64630, 64582, 51643, 64609, 64580, 64587, 51644, 64592, 64577};
        f27183k = (char) 51642;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r10, o.x.f r11) throws fr.antelop.sdk.exception.WalletValidationException {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.y.i.f27185m
            int r1 = r0 + 81
            int r0 = r1 % 128
            o.y.i.f27186n = r0
            int r1 = r1 % r8
            r5 = 0
            if (r1 != 0) goto L1c
            boolean r1 = o.ea.f.a()
            r0 = 25
            int r0 = r0 / r5
            if (r1 != 0) goto L22
        L18:
            r9.b(r10, r11)
            return
        L1c:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L18
        L22:
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r7 = r0 + 33
            long r3 = android.os.Process.getElapsedCpuTime()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r0 = r0 + 73
            byte r2 = (byte) r0
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u0006\u0001\u0001\u0010\u000b\u0013\f\u0010\u0018\r\u000e\u0010\u0000\u0007\u0000\f\u0016\u0005\n\u0017\u0013\u0004\u0000\u0004\u0006\u000e\u0018\u0010\f\u0006\f\u000b㙉"
            C(r7, r0, r2, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.String r0 = ""
            int r0 = android.view.KeyEvent.keyCodeFromString(r0)
            int r3 = r0 + 6
            r1 = -16777203(0xffffffffff00000d, float:-1.7014145E38)
            int r0 = android.graphics.Color.rgb(r5, r5, r5)
            int r1 = r1 - r0
            byte r2 = (byte) r1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u0015\u000e\u0006\f\u000b\f"
            C(r3, r0, r2, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r4, r0)
            int r0 = o.y.i.f27186n
            int r1 = r0 + 19
            int r0 = r1 % 128
            o.y.i.f27185m = r0
            int r1 = r1 % r8
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.i.a(android.content.Context, o.x.f):void");
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f27185m + 123;
        f27186n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        C(KeyEvent.normalizeMetaState(0) + 17, "\u0015\u0010\u0012\u0016\n\f\u0000\u0004\u0006\u000e\u0018\u0010\f\u0006\f\u000b㙂", (byte) (68 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f27186n + 65;
        f27185m = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    @Override // o.y.e
    public final e.c n() {
        int i2 = 2 % 2;
        int i3 = f27186n + 105;
        f27185m = i3 % 128;
        int i4 = i3 % 2;
        e.c cVar = e.c.f20618d;
        int i5 = f27185m + 57;
        f27186n = i5 % 128;
        if (i5 % 2 != 0) {
            return cVar;
        }
        throw null;
    }
}
