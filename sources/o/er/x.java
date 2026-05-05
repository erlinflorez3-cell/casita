package o.er;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25241b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25242c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f25243d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25244e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25245f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f25246h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static short[] f25247i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f25248j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f25249k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25250l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f25251m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f25252n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f25253o = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 + 102
            int r0 = r5 * 3
            int r1 = 3 - r0
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r5 = o.er.x.$$c
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L29
            r2 = r3
            r0 = r1
        L13:
            int r1 = -r1
            int r1 = r1 + r7
            r7 = r1
            r1 = r0
        L17:
            int r0 = r1 + 1
            byte r1 = (byte) r7
            r4[r2] = r1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r2 = r2 + 1
            r1 = r5[r0]
            goto L13
        L29:
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.$$g(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f25251m = -993572836;
        f25249k = -1922290879;
        init$0();
        f25253o = 0;
        f25250l = 1;
        f25245f = 0;
        f25252n = 1;
        e();
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.indexOf("", "", 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getFadingEdgeLength();
        ImageFormat.getBitsPerPixel(0);
        int i2 = f25253o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25250l = i2 % 128;
        int i3 = i2 % 2;
    }

    public x(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void e() {
        f25242c = 827588092;
        f25241b = 1150422466;
        f25244e = 1051432584;
        f25243d = new byte[]{92, -82, -106, -103, -88, -93, -66, -113, -87, -111, -81, -94, -100, -88, MessagePack.Code.FIXSTR_PREFIX, -71, -120, -89, -106, MessagePack.Code.FIXARRAY_PREFIX, -79, -117, -79, -128, -101, -110, MessagePack.Code.FLOAT64, 114, -93, -107, -84, MessagePack.Code.FLOAT64, 78, 103, 97, 105, 103, 122, 84, 96, 120, 113, 64, 127, 110, 104, -119, 68, 117, 106, 109, 104, 115, 110, 113, 124, 110, MessagePack.Code.UINT64, 44, -106, -103, 95, -116, 112, 41, 125, 106, 122, -77, 16, 119, -76, 38, 108, -114, -128, -103, 110, 112, 16, 124, 126, 102, 124, 115, 109, 121, 113, -114, 89, 116, 103, 97, -122, 93, 114, 99, 122, -3, -1, -25, -3, -16, MessagePack.Code.INT32, -2, -10, -17, 76, -84, -11, -28, -26, -25, 78, -106, -8, -11, -17, -30, -31, Ascii.FF, Utf8.REPLACEMENT_BYTE, -84, -26, -31, -3, -13, -17, 76, -18, -95, -9, 62, -83, -25, 78, -86, -23, -16, -17, -10, -3, -17, 76, -83, Ascii.GS, 16, -17, -15, -111, -3, -1, -25, -3, -16, MessagePack.Code.INT32, -2, -10, Ascii.SI, MessagePack.Code.MAP16, -11, -28, -26, 7, MessagePack.Code.FALSE, -13, MessagePack.Code.NEGFIXINT_PREFIX, 93, Ascii.GS, 36, 3, 42, 17, 3, 96, MessagePack.Code.NEVER_USED, 75, 50, 3, 37, MessagePack.Code.BIN16, 17, 19, Ascii.ESC, 17, 36, 6, Ascii.DC2, 42, 35, -14, 41, Ascii.CAN, Ascii.SUB, 59, -10, 39, Ascii.DC4, 74, 85, 73, 94, 116, 43, 85, 76, 92, 71, 123, 120, 6, 89, -100, Ascii.ETB, 70, 71, 64, 83, 75, 80, 76, -95, -104, -88, -109, MessagePack.Code.EXT8, MessagePack.Code.BIN8, 102, MessagePack.Code.FIXARRAY_PREFIX, -68, -108, -17, 124, -126, -76, -106, 76, 79, 59, 96, 17, 59, 94, 87, Ascii.GS, 75, 65, 59, 74, 71, 79, 49};
        f25246h = new char[]{64619, 64609, 64586, 64585, 64584, 64610, 64607, 64629, 64603, 64588, 64589, 64578, 64604, 64580, 64533, 64590, 64597, 64608, 64579, 64592, 64631, 64614, 64630, 64577, 64611, 64517, 64523, 64606, 64539, 64595, 64520, 64613, 64605, 64616, 64529, 64612, 64541, 64598, 64617, 64625, 64596, 64599, 64593, 64582, 64618, 64576, 64615, 64531, 64587};
        f25248j = (char) 51640;
    }

    static void init$0() {
        $$a = new byte[]{3, 32, 122, 114};
        $$b = 74;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.GS, 50, -104, 42, 59, MessagePack.Code.EXT8, -6, 45, MessagePack.Code.BIN32, 56, -19};
        $$e = 147;
    }

    static void init$2() {
        $$c = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
        $$f = 109;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.p(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void q(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = i5 + 7;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i8 = i5 + 61;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f25246h;
        long j2 = 0;
        int i9 = 421932776;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(i9);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(Color.blue(0) + 270, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 12, -811348851, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    int i11 = $11 + 85;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    j2 = 0;
                    i9 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f25248j)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(271 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -811348851, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i13 = $11 + 79;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                i3 = i2 + 69;
                cArr4[i3] = (char) (cArr[i3] * b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    int i14 = $10 + 3;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
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
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (Process.myPid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, -611683395, false, $$g(b7, b8, (byte) ((b8 + 9) - (9 & b8))), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i16 = $10 + 13;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + JfifUtil.MARKER_SOS;
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int mirror = AndroidCharacter.getMirror('0') - '%';
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            String str$$g = $$g(b9, b10, (byte) (7 | b10));
                            c2 = 11;
                            objA4 = o.d.d.a(scrollBarFadeDuration, deadChar, mirror, 212688716, false, str$$g, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i18];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i19 = $10 + 87;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i21 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i22 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i21];
                            cArr4[hVar.f19926b + 1] = cArr2[i22];
                        } else {
                            int i23 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i24 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i23];
                            cArr4[hVar.f19926b + 1] = cArr2[i24];
                        }
                    }
                }
                hVar.f19926b += 2;
                int i25 = $10 + 71;
                $11 = i25 % 128;
                int i26 = i25 % 2;
            }
        }
        for (int i27 = 0; i27 < i2; i27++) {
            int i28 = $11 + 99;
            $10 = i28 % 128;
            int i29 = i28 % 2;
            cArr4[i27] = (char) (cArr4[i27] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(byte r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.er.x.$$a
            int r0 = r9 + 98
            int r7 = r11 * 3
            int r2 = r7 + 1
            int r1 = r10 * 3
            int r6 = 4 - r1
            byte[] r5 = new byte[r2]
            r4 = 0
            if (r8 != 0) goto L2b
            r3 = r7
            r2 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r3
            int r6 = r6 + 1
        L17:
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r2 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L24:
            int r2 = r2 + 1
            r1 = r8[r6]
            r3 = r0
            r0 = r1
            goto L13
        L2b:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.r(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(byte r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r0 = r10 * 10
            int r7 = r0 + 101
            int r2 = r8 * 7
            int r1 = 8 - r2
            byte[] r6 = o.er.x.$$d
            int r0 = r9 * 7
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            int r3 = 7 - r2
            r2 = 0
            if (r6 != 0) goto L2f
            r0 = r3
            r1 = r2
        L17:
            int r0 = -r0
            int r7 = r7 + r0
            int r5 = r5 + 1
            int r7 = r7 + (-6)
        L1d:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r3) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            r11[r2] = r0
            return
        L2a:
            r0 = r6[r5]
            int r1 = r1 + 1
            goto L17
        L2f:
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.s(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x06b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a(java.util.List<o.er.w> r32, fr.antelop.sdk.util.OperationCallback<java.util.List<fr.antelop.sdk.digitalcard.TokenRequestor>> r33, o.eo.c r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.a(java.util.List, fr.antelop.sdk.util.OperationCallback, o.eo.c):void");
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        boolean zC;
        int i2 = 2 % 2;
        int i3 = f25252n + 41;
        f25245f = i3 % 128;
        if (i3 % 2 != 0) {
            zC = super.c();
            int i4 = 24 / 0;
        } else {
            zC = super.c();
        }
        int i5 = f25245f + 115;
        f25252n = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r31, final fr.antelop.sdk.util.OperationCallback<java.util.List<fr.antelop.sdk.digitalcard.TokenRequestor>> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.x.e(android.content.Context, fr.antelop.sdk.util.OperationCallback):void");
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f25252n + 77;
        f25245f = i3 % 128;
        if (i3 % 2 == 0) {
            return new c[]{this.f25010g.i()};
        }
        c[] cVarArr = new c[0];
        cVarArr[0] = this.f25010g.i();
        return cVarArr;
    }
}
