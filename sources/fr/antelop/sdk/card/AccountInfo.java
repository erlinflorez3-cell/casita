package fr.antelop.sdk.card;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.a.j;
import o.a.o;
import o.d.d;
import o.er.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountInfo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;
    public static int H = 0;
    public static int I = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18858a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f18859b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18860c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f18861d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18862e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18863f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f18864g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f18865h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18866i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f18867j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f18868k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f18869l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f18870m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f18871n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f18872o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f18873p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f18874q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f18875r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f18876s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f18877t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f18878u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f18879v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f18880w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f18881x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f18882y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f18883z = 0;
    private final f innerAccountInfo;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r2 = r6 * 3
            int r1 = 1 - r2
            int r7 = 105 - r7
            byte[] r6 = fr.antelop.sdk.card.AccountInfo.$$c
            int r0 = r5 * 3
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L28
            r0 = r2
            r1 = r3
        L15:
            int r5 = r5 + 1
            int r7 = r7 + r0
        L18:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r6[r5]
            int r1 = r1 + 1
            goto L15
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.AccountInfo.$$e(byte, byte, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        I = 726128008;
        H = 483396567;
        G = 518937027;
        F = 850766793;
        E = 1731751692;
        D = -214812385;
        C = -1889727654;
        B = -385496320;
        A = 1761739739;
        f18883z = -2099563289;
        f18882y = 792034916;
        f18881x = 1145887127;
        f18880w = -1207717;
        f18879v = 1435898953;
        f18878u = -1039675324;
        f18877t = -1147357663;
        f18876s = -142131303;
        f18875r = -1026247848;
        f18874q = 469807758;
        f18873p = 1053077289;
        f18872o = -2055834052;
        f18870m = 1092938900;
        f18869l = 908907891;
        f18868k = 708807250;
        init$0();
        f18863f = 0;
        f18871n = 1;
        f18865h = 0;
        f18866i = 1;
        b();
        f18858a = -2066042066;
        f18862e = 1150422503;
        f18860c = 1852843826;
        f18861d = new byte[]{19, Ascii.SYN, -18, 6, MessagePack.Code.NEGFIXINT_PREFIX, -30, Ascii.GS, Ascii.GS, Ascii.SUB, Ascii.SUB, Ascii.SUB};
        int i2 = f18871n + 23;
        f18863f = i2 % 128;
        int i3 = i2 % 2;
    }

    public AccountInfo(f fVar) {
        this.innerAccountInfo = fVar;
    }

    private static void J(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        long j2;
        int i5;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f18862e)};
            Object objA = d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = d.a(Color.blue(0) + 238, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44531), ExpandableListView.getPackedPositionChild(0L) + 12, 35969549, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z2 = true;
            } else {
                int i7 = $10 + 3;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z2 = false;
            }
            if (z2) {
                byte[] bArr = f18861d;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objA2 = d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = d.a(628 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28649), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1621469864, false, $$e(b5, b6, (byte) (b6 + 2)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f18861d;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f18858a)};
                    Object objA3 = d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = d.a(239 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') + 44483), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, 35969549, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f18862e) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f18859b[i2 + ((int) (((long) f18858a) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f18862e) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                int i10 = ((i2 + iIntValue) - 2) + ((int) (((long) f18858a) ^ j2));
                if (z2) {
                    int i11 = $11 + 87;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jVar.f19936d = i10 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f18860c), sb};
                Object objA4 = d.a(1819197256);
                if (objA4 == null) {
                    objA4 = d.a(KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 5358), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f18861d;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 73;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z3 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f18861d;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        int i16 = $10 + 55;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        short[] sArr = f18859b;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

    private static void K(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 113;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f18864g[i2 / i7])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(742 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 12, 632508977, false, $$e(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f18867j), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 766, (char) (12470 - (ViewConfiguration.getPressedStateDuration() >> 16)), 11 - TextUtils.lastIndexOf("", '0', 0), 1946853218, false, $$e(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = d.a(TextUtils.indexOf("", "", 0, 0) + 387, (char) (ViewConfiguration.getTapTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 19, 39570797, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f18864g[i2 + i8])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = d.a(742 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), KeyEvent.normalizeMetaState(0) + 12, 632508977, false, $$e(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f18867j), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 766, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12471), View.combineMeasuredStates(0, 0) + 12, 1946853218, false, $$e(b10, b11, (byte) (b11 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = d.a(387 - (ViewConfiguration.getTouchSlop() >> 8), (char) Color.blue(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 39570797, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i9 = $11 + 17;
        $10 = i9 % 128;
        int i10 = 2;
        int i11 = i9 % 2;
        while (oVar.f19947b < i3) {
            int i12 = $11 + 21;
            $10 = i12 % 128;
            if (i12 % i10 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = new Object[i10];
                objArr8[1] = oVar;
                objArr8[0] = oVar;
                Object objA7 = d.a(-723636472);
                if (objA7 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    objA7 = d.a(387 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 18 - View.combineMeasuredStates(0, 0), 39570797, false, $$e(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objA7).invoke(null, objArr8);
                int i13 = 62 / 0;
                i10 = 2;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr9 = {oVar, oVar};
                Object objA8 = d.a(-723636472);
                if (objA8 == null) {
                    int longPressTimeout = 387 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 18;
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    String str$$e = $$e(b16, b17, b17);
                    i10 = 2;
                    objA8 = d.a(longPressTimeout, cLastIndexOf, iResolveOpacity, 39570797, false, str$$e, new Class[]{Object.class, Object.class});
                } else {
                    i10 = 2;
                }
                ((Method) objA8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void L(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r1 = r7 * 3
            int r0 = 1 - r1
            byte[] r7 = fr.antelop.sdk.card.AccountInfo.$$a
            int r6 = r8 + 4
            int r5 = r9 + 97
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L28
            r0 = r2
            r1 = r3
        L13:
            int r5 = r5 + r0
        L14:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r6 = r6 + 1
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L23:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L13
        L28:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.AccountInfo.L(short, int, short, java.lang.Object[]):void");
    }

    static void b() {
        char[] cArr = new char[1884];
        ByteBuffer.wrap("\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0001ù\u0085À\u0002¨¶·0\u009f³f-NªU\u0019=«\u0004*ìÖËDÓßºM\u0082ÑiyqÙX^ ó\u000fu\u0017ÿ\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0001ù\u0085À\u0002¨¶·0\u009f³f-NªU\u0019=º\u0004'ìÂËSÓåºZ\u0082ÒiTqÉXZ ö\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0001ù\u0085À\u0002¨¶·0\u009f³f-NªU\u0019=¹\u00047ìÜËU¼\u009e[FsÀ\nN\"\u008e9HÑÆèI\u0080ä\u009fy·üN2fæ}j\u0015å,iÄ\u0097ã\u001cû\u008a\u0092\u0015ª¾A\u0007Y\u0088p\u0019\b¥'0?«Ö$ÔÆ3\b\u001b\u0095b\u0006JÖQ\u0019¹\u0096\u0080[è¹÷?ß®&55VÒ\u0098ú\u0005\u0083\u0096«F°\u009eX\ba\u0088\tw\u0016\u00ad>#Çºï9\u0094Ýs\u0005[\u009e\"\u001d\n\u0083\u0011\u0014ù\u008eÀA¨\u0080·\u0010\u009f\u0097f1N´U#=\u008e\u0004/ìÆËW\u000bÛì\u0003Ä\u0085½\u000b\u0095\u0090\u008e\u0005f\u0081_G7¸(9\u0000¾ùwÑ¨Ê)¢®\u009b&sÖT\u001eLÏ%W\u008c\rk\u0082C\u0000:\u008d\u0012\u0010\t\u0083\u0094Ýs\u0005[\u0083\"\r\n\u0096\u0011\u0003ù\u0087ÀA¨°·?\u009f´fqN¬U#=§\u0004;ìäË{Ó\u0097ºP\u0082ÇiKqßX\u0003 ñ\u000fy\u0017ôþjÆð\u00adiµæ\u0094Ýs\u0005[\u0083\"\r\n\u0096\u0011\u0003ù\u0087ÀA¨°·?\u009f´fqN¬U#=§\u0004;ìäË{Ó\u0097ºN\u0082ÐiIqÚ\u0094Ýs\u0005[\u0083\"\r\n\u0096\u0011\u0003ù\u0087ÀA¨¾·?\u009f¸fqN®U/=¨\u0004 ì×Ë[ÓÏºh\u0082ïiVqØXA â\u000f8\u0017éþq\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\bù\u008fÀ\u0003¨§·1\u009f¯f;N±U22kÕòý?\u0084÷¬|·ä_mfá\u000e\u0017\u0011Õ9^ÀÆè]5)Ò¦ú.\u0083¸«2°ýX1a¾\t\u0013RÇµ\u001c\u009d\u0092ä\u000bÌ\u009b×S?\u0096\u0006\u001dn¤q)Y³ =\u0088«\u0093(ûµÂ9*Û¶ÉQFyÂ\u0000^(Ä3U\u0094\u0080s\u0019[Ô\"\u000e\n\u0090\u0011\tù\u008eÀ\u001b¨±·\"\u009fôf3N£U(=¿\u0004(ìÓËUÓÎºK\u0082ÐiCqØÿÓ\u0018U0ÒIAnP\u0089Á¡ZØßðYëÇ\u0003L:\u0092RsMýe{\u009c¢´r¯ðÇ6þø\u0016\u00051\u0086)\u001d@\u008bx^\u0093\u0093\u008b\b¢\u0089Únõ¢í)\u0004§<5W\u008bO?f¬\u009eÕ¶{ÑÚÉIàÞ\u0018P3Ý+NBåzv|©\u009b8³£Ê&â ù>\u0011µ(k@\u008a_\u0004w\u0082\u008e[¦\u008b½\tÕÏì\u0001\u0004ü#\u007f;äRrj§\u0081j\u0099ñ°pÈ\u0097ç[ÿÐ\u0016^.ÌEr]ÆtU\u008c,¤\u0082Ã'Û°ò'\n©!.9·\u0097rpãXx!ý\t{\u0012åúnÃ°«Q´ß\u009cYe\u0080MPVÒ>\u0014\u0007Úï'È¤Ð?¹©\u0081|j¤r5[ð#\u0001\f\u0097\u0014\u0003\u0091GvÖ^M'È\u000fN\u0014Ðü[Å\u0085\u00add²ê\u009alcµKePç8!\u0001ïé\u0012Î\u0091Ö\n¿\u009c\u0087Il\u0091t\u0000]Å%;\n²\u0012<\u0094\u0082s\u0013[\u0088\"\r\n\u008b\u0011\u0015ù\u009eÀ@¨¡·/\u009f©fpN U\"=ä\u0004*ì×ËTÓÏºY\u0082\u008ciTqÅX\u0000 ÿ\u000fu\u0017ù\u0094\u0082s\u0013[\u0088\"\r\n\u008b\u0011\u0015ù\u009eÀ@¨¡·/\u009f©fpN U\"=ä\u0004*ì×ËTÓÏºY\u0082\u008ciTqÅX\u0000 ÿ\u000fx\u0017ù\u0094\u0084s\u0014[\u0095\"\u0006\n\u0091\u0011\u0000\u0094Ýs\u0006[\u0088\"\u0011\n\u0081\u0011Iù\u0087À\u0001¨¶·#\u009f¶f;N±\u0094\u0084s\u0014[\u0095\"\u0006\n\u0085\u0011\u0013ù\u008fÀ\u001d¨¦,vËÐãW\u009aÄ²L©ÊA]xÄ\u0010~\u000fû\u0094\u0087s\u0018[\u0091\"\u0010\n\u008d\u0011\u0011ù\u0084\u0094\u0091s\u001e[\u0088\"\u0011\n\u008f\u0011\u000fù\u009fÀ\u0003\u0094\u0080s\u0019[Ô\"\u000e\n\u0090\u0011\tù\u008eÀ\u001b¨±·\"\u009fôf:N§U0=£\u0004-ì×\u0094\u0084s\u0014[\u0095\"\u0006\nÚ\u0011Pù\u009a\u0094\u0095s\u0013[\u0094\"\u001b\n\u0090\u0011\u000fù\u0089.«É-áª\u0098%°®«1C·z\u000f\u0012\u0094\rP%Ò´$S¢{%\u0002ª*!1¾Ù8à\u0080\u0088\u001b\u0097ß¿]F°nEuÃ\u0081PfÉN\u00047Þ\u001f@\u0004Ùì^ÕË½a¢ò\u008a$sã[}@ò(\u007f\u0011òXA¿Ò\u0097Q±\u0081V4~¸\u0007l/\u00824!Ü¶å(\u008d\u0089\u0092\tº\u008dCLk\u0096p\u001b\u0018\u008a!\\ÉÃîlöú\u009fc§ýLq)\u000fÎ¤æ\"\u009f°·1¬³D2}ò\u0015=\n®\"-ÛÂó\u001cè\u008f\u0080\u001f¹\u009eQzvªn`\u0007í?lÔºÌnåª\u009d\u0018O/¨\u0084\u0080\u0002ù\u0090Ñ\u0011Ê\u0093\"\u0012\u001bÒs\u001dl\u008eD\r½â\u0095<\u008e¯æ?ß¾7Z\u0010\u008a\b@aÍYL²\u009aªN\u0083\u008aû8ÔÕÌ0%¶\u0094\u0080s\u0019[Ô\"\u0016\n\u0083\u0011\u0014ù\u008eÀ\u0019¨³·$\u009f¿èÜ\u000fP'ß^SvÍmF\u0085Ð¼O\u0094\u0084s\u0014[\u0095\"\u0006\nÚ\u0011P\u0094\u0080s\u0017[\u0094\"\u001d\n\u008a\u0011\u0013\u0094\u0080s\u0019[Ô\"\u000e\n\u0090\u0011\tù\u008eÀ\u001b¨±·\"\u009fôf<N°U'=¤\u0004*\u0094\u0080s\u0019[Ô\"\u0015\n\u0087\u0011\u0014ù\u0084À\u000b¨¾·x\u009f«f;N¯U3\u0094\u0080s\u0019[Ô\"\r\n\u0087\u0011\u0005ù\u009fÀ\u001c¨·`ç\u0087~¯³Ö{þðåh\rá4m\\\u009bCAkÏ\u0092VºÁ¡TÉÎð]\u0094\u0094s\u0003[\u0096\"\u0012\n½\u0011\u001eùÒÀX\u0094\u0080s\u0019[Ô\"\u001c\n\u0097\u0011\u000fù\u0086À\n¨ü·0\u009f³f0N¥U#=¸\u0004>ìÀË_ÓÔºJíò\nt\"ó[|s÷hh\u0080î¹&ÑÆÎUæÖ\u001f\u00167Â,DDÃ}L\u0095§²8ª¾á8\u0006¾.9W¶\u007f=d¢\u008c$µ\u009cÝ\u0007ÂÃêA\u0013Ü;\u001c \u008fH\fq¼\u0099g¾£¦!Ï¼÷h\u001cî\u0004i-æUMzÒbT\u008bì³WØ\u0093À\u0011\u0094\u0095s\u0013[\u0094\"\u001b\n\u0090\u0011\u000fù\u0089ÀA¨µ·9\u009fµf9N®U#=\u0095\u0004=ìÖË]Ó\u0095ºY\u0082ÇiHqÏX\\ û\u000fu\u0094\u0095s\u0013[\u0094\"\u001b\n\u0090\u0011\u000fù\u0089ÀA¨¤·4\u009fµf&NúUp=º\u0004aìÄËTÓÕºF\u0082\u009ai\u0010qÚ\rGêËÂG»Ë\u0093\\\u0088Ñ`\u0017YÏ1d.ï\u0006Wÿë×`Ìü¤w\u009dòu\u0005R»J\u0010#Ô\u001bFðÛè\u001fÁ\u0099¹.\u0096¡\u008e:g¥_34\u008b, \u0005äý\u0096<½Û$óé\u008a!¢°¹4Q£h?\u0000\u0080\u001f\n7\u0083Î\u0006æ\u008d\u0094\u0080s\u0019[Ô\"\u001c\n\u008d\u0011\tù\u009eÀ\u0007¨¿·7\u009f½f;NìU$=¿\u0004'ìÞËRÓ\u0094ºX\u0082ËiHqÍXK à\u000ff\u0017èþwÆì\u00adrTõ³^\u009bØâJÊËÑI9È\u0000\u0005hìw(_ª¸8_¡wl\u000e¤&/=·Õ>ì²\u0084D\u009b\u008a³\u000bJ\u0095b\ny\u0092\u0011\u0013(\u008fÀ$ççÿf\u0086©a<I¦0%\u0018à-âÊaâê\u009bs³µ¨l@åyt\u0011\u0085\u000e^&ÆßJ÷Îì\u0012\u0084Ã½EU¤r?j°-!Ê±â5\u009b©³n¨¬@?yâ\u0011\u001d\u000e\u0095&\u0011ß\u0092÷\u000bì\u0081\u0084\u0011½\u009f'©À9è½\u0091!¹æ¢?J¦sj\u001b\u009e\u0004\u001d,\u009bÕ\u0011ý·æ\u000f\u008e\u0081·\t_ýxn`ñ\u0094\u0083s\u0013[\u0097\"\u000b\nÌ\u0011\u0015ù\u008cÀ@¨¾·5\u009f¾f\u0001N¦U#=¤\u0004=ìÛËBÓÃ\u0094\u0080s\u0019[Ô\"\u0015\n\u0087\u0011\u0014ù\u0084À\u000b¨¾·x\u009f»f0N¦U4=¥\u0004'ìÖË\u0018ÓËº[\u0082ÏiSqÎ\u0094\u0080s\u0019[Ô\"\u001c\n\u008d\u0011\tù\u009eÀ@¨£·3\u009f·f+NìU'=¼\u0004*ìíËXÓÛºS\u0082Ç\u0094\u0080s\u0019[Ô\"\u0011\n\u0086\u0011\u000bùÄÀ\f¨§·?\u009f¶f:NìU =£\u0004 ìÕËSÓÈºN\u0082ÐiOqÄXZ\u0094\u0080s\u0019[Ô\"\u000e\n\u0090\u0011\tù\u008eÀ\u001b¨±·\"\u009fôf<N·U/=¦\u0004*ì\u009cËPÓÓºP\u0082ÅiCqØX^ à\u000f\u007f\u0017ôþj\u0094\u0080s\u0019[Ô\"\r\n\u009b\u0011\u0015ù\u009eÀ\u000b¨¿·x\u009f¸f+N«U*=®\u0004`ìÔË_ÓÔºY\u0082ÇiTqÚX\\ û\u000fx\u0017î²\u009fU\u0006}Ë\u0004\u0012,\u00847\nß\u0081æ\u0014\u008e \u0091\u0016¹ @9h©sw\u001b·\"$ÊÄíEõÁ\u009c\u000f¤ÛOPWÛ~V\u0006è){1õØsàô\u008bw\u0093á\u0094\u0080s\u0019[Ô\"\b\n\u0087\u0011\bù\u008eÀ\u0001¨ ·x\u009f¸f+N«U*=®\u0004`ìÔË_ÓÔºY\u0082ÇiTqÚX\\ û\u000fx\u0017îbX\u0085Á\u00ad\fÔÐü_çÐ\u000fV6Ù^xAÑif\u0090ê¸q£óË<òô\u001a\u001f=\u0087%\u000eL\u0082tT\u009f\u0098\u0087\u001b®\u0098Ö-ù«á0\b¶0([·C<j¢\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0017ù\u008fÀ\u0003¨§·\t\u009fªf7N²U#\u0080&géOd6ó\u001e6\u0005îí~Ôö¼B£È\u008bUr\u008aZ[AÜ)B\u0010Ðø+ß¬Ç/®¡\u0096\u0006}ºe4L»4\u0010\u001b\u0089\u0007¹àvÈû±l\u0099©\u0082qjáSi;Ý$W\fÊõ\u0015ÝÁÆG®À\u0097S\u007f²k4\u008cû¤vÝáõ$îü\u0006l?äWPHÚ`G\u0099\u0098±ZªÊÂNûÒ\u0013?\u0094Ýs\u0005[\u0083\"\r\nÍ\u0011\u0017ù\u008fÀ\u0003¨§·\t\u009f®f,N£U%=¯q½\u0096e¾ãÇmïöôc\u001cç%!MÞR_zØ\u0083\u0011«Î°OØÈáM\t\u008d.;6»_2g®\u008c)\u0094©½\u0011Å\u0096ê\u0013ò\u0098\u001b\u000b#\u0085H9P\u009by\u000b\u0081\u007f©ãÎ4Öíÿm»Ã\\\ft\u0081\r\u0016%Ó>\u001aÖ\u0087ï\u0004\u0087\u0093\u0098/°´I3\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0004ù\u0099À\u001a¨\u008d·\"\u009f³f3N§íö\n9\"´[#sæh>\u0080®¹&Ñ\u0092Î\u0018æ\u0085\u001fZ7\u008b,\u001eD\u0095}\u0003\u0095ö²qªõÃpûû\u0010iþ`\u0019¸1>H°`+{¾\u0093:ªüÂ\u0003Ý\u0082õ\u0005\fÌ$\u0013?\u0092W\u0015n\u0091\u0086|¡ÿ¹aÐìès\u0003ÿ\u001br2áJpeÁ}I\u0094Ê¬\u0011ÇÈßX\u009e yïQb(õ\u00000\u001bùódÊç¢N½È\u0095DlÆg\u008a\u0080E¨ÈÑ_ù\u009aâS\nÎ3M[âDxlÿ\u0095f\u0094Ýs\u0012[\u009f\"\b\nÍ\u0011\u0004ù\u0099À\u001a¨¿·3\u009f½f0'¸Àwèú\u0091m¹¨¢aJüs\u007f\u001bØ\u0004A,ÖÕ^Ï`(¯\u0000\"yµQpJ¹¢$\u009b§ó\u0019ì\u0086Ä\u0014=\u0084ë9\fö${]ìu)nà\u0086}¿þ×FÈÕà_\u0019Ó1V*Ága\u0080®¨#Ñ´ùqâ¸\n%3¦[1D\u0083l\u000b\u0095\u0087çw\u0000¸(1Q y)bã\u008a$³«Û\u000fÄ\u0092ì\u001c\u0015\u009b=\t&\u0088N\u0013wË\u009f6¸ä rÉ»ñj\u001aÿ\u0002t+ï\u0002üå:Íµ´+\u009cì\u00870o¢V!>\u0097!\u0018\t\u008cð\fØÌÃ%«\u0098\u0092\u001bzÀ]\u007fEú,m\u0014æÿcçÍÎ`¶ß\u0099S\u0081ÞhMï\u0016\bÍ CYÚqJj\u0082\u0082H»ÊÓiÌòäc\u001dá5z2¶Õdýè\u0084*¬¬«ÀL\u001bd\u0095\u001d\f5\u009c.TÆ\u0084ÿ\u0016\u0097£\u0088- èY.q¾j+\u0002¤\u0019JþÛÖD¯Í\u0087Q\u009cÖtVM\u009f%j:æ\u0012iëåÃ{Øð°f\u0089ùaCF\u009a^\n\u009e\u0019y\u0098Q\u001f(¾\u0000)\u001b¤ó>Ê¶¢7½¢\u0095)l÷D6_®ßÉ8\u0007\u0010\u009ai\tAÙZ\u001f²\u009b\u008b\u001eã¯ü#Ô\u0091-)\u0005¹\u001e6v»O9§Õ\u0080\f\u0098ÖñGÉÚ)îÎdæñ\u009fe·ï¬lDõ}s\u0015Ç\n[\u0094Ýs\u0013[\u008e\"\u001d\nÍ\u0011\u000bù\u0085À\u001b¨¼·\"\u009f©\u0094Ýs\u0012[\u009b\"\n\n\u0083\u0011Iù\u008eÀ\u0001¨¥·8\u009f¶f1N£U\"=¹\u0004aì\u009cËRÓÊº\u0011\u0082ÃiVqÚX] ¼\u000fn\u0017÷þrî\u0010\tË!EXÜpLk\u0084\u0083DºÓÒjÍòåy\u001cõ4`¼ã[OsÀ\nL\"Ò9YÑÏèPµIR\u0086z\u000f\u0003\u009e+\u00170ÝØ\u0013á\u0093\u00895\u0096¡¾aGºo$t½\u001c8%³ÍJêÇò]\u009b\u0085£UHÇPLy\u0095\u00016.\u00ad6mßåç{\u008c¼\u0094s½óE\u0085m\u0010\n\u0081\u0012\u001c;\u009fÃ\u0000è\u008aðT\u0099«¡'N£V?\u007f¿\u0007?,»".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1884);
        f18864g = cArr;
        f18867j = 4957631396611191670L;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x1a48  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x2492  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x2512 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0cb9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(android.content.Context r39, int r40, int r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.AccountInfo.d(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{37, -107, Ascii.NAK, -25};
        $$b = 40;
    }

    static void init$1() {
        $$c = new byte[]{68, -108, -67, 58};
        $$d = 81;
    }

    public final String getAccountLabel() {
        int i2 = 2 % 2;
        int i3 = f18866i + 95;
        f18865h = i3 % 128;
        int i4 = i3 % 2;
        f fVar = this.innerAccountInfo;
        if (i4 == 0) {
            return fVar.c();
        }
        fVar.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountNumber() {
        int i2 = 2 % 2;
        int i3 = f18866i + 3;
        f18865h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerAccountInfo};
        int iActiveCount = Thread.activeCount();
        int i5 = f.f24986b * (-319723722);
        f.f24986b = i5;
        int i6 = f.f24990f * 1454362011;
        f.f24990f = i6;
        int i7 = f.f24991i * (-733680792);
        f.f24991i = i7;
        String str = (String) f.c(1370509635, i5, i6, objArr, -1370509633, i7, iActiveCount);
        int i8 = f18866i + 65;
        f18865h = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public final String getIssuerAccountId() {
        int i2 = 2 % 2;
        int i3 = f18866i + 61;
        f18865h = i3 % 128;
        int i4 = i3 % 2;
        String strB = this.innerAccountInfo.b();
        int i5 = f18865h + 59;
        f18866i = i5 % 128;
        int i6 = i5 % 2;
        return strB;
    }

    public final boolean hasEcomStaticToken() {
        int i2 = 2 % 2;
        int i3 = f18865h + 97;
        f18866i = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = this.innerAccountInfo.a();
        int i5 = f18866i + 91;
        f18865h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return zA;
    }

    public final String toString() {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("AccountInfo{accountNumber='");
        Object[] objArr = {this.innerAccountInfo};
        int iActiveCount = Thread.activeCount();
        int i3 = f.f24986b * (-319723722);
        f.f24986b = i3;
        int i4 = f.f24990f * 1454362011;
        f.f24990f = i4;
        int i5 = f.f24991i * (-733680792);
        f.f24991i = i5;
        String string = sb.append((String) f.c(1370509635, i3, i4, objArr, -1370509633, i5, iActiveCount)).append("', issuerAccountId='").append(this.innerAccountInfo.b()).append("', accountLabel=").append(this.innerAccountInfo.c()).append("'}").toString();
        int i6 = f18866i + 29;
        f18865h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return string;
    }
}
