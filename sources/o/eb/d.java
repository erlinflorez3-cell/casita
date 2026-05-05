package o.eb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import o.a.f;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<P> extends j {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23613a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f23614b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f23615c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23616d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23617e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23618f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23619j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f23620o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f23621p = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r8, byte r9, short r10) {
        /*
            byte[] r7 = o.eb.d.$$l
            int r2 = r10 * 2
            int r1 = 1 - r2
            int r0 = r9 * 3
            int r6 = 4 - r0
            int r0 = r8 * 2
            int r0 = r0 + 67
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r7 != 0) goto L2b
            r1 = r6
            r0 = r3
        L18:
            int r6 = r6 + r0
            int r1 = r1 + 1
        L1b:
            int r2 = r2 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r7[r1]
            goto L18
        L2b:
            r1 = r6
            r6 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.d.$$n(byte, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23621p = -881810344;
        f23620o = -1607309548;
        init$0();
        f23618f = 0;
        f23619j = 1;
        f23615c = new int[]{-258028448, 1588563462, -1164459733, 1480127957, -648076848, 1640061686, 552571651, -569131834, -1975122525, 2035148683, -1915029833, 526147783, 192203561, 1256099857, -1893948517, 1040784748, 667535521, 833093363};
        f23617e = new char[]{2159, 2128, 2154, 2140, 2129, 2135, 2448, 2142, 2447, 2157, 2138, 2136, 2119, 2170, 2134, 2155, 2139, 2130, 2132, 2153, 2173, 2141, 2131, 2166, 2445, 2152, 2133, 2165, 2168, 2137, 2474, 2463, 2460, 2458, 2450, 2457, 2439, 2442, 2163, 2478, 2451, 2160, 2436, 2440, 2167, 2156};
        f23616d = 2040400334;
        f23613a = true;
        f23614b = true;
    }

    static void init$0() {
        $$d = new byte[]{80, 70, 7, 82};
        $$e = 144;
    }

    static void init$1() {
        $$j = new byte[]{6, 32, -91, MessagePack.Code.BIN16};
        $$k = 230;
    }

    static void init$2() {
        $$l = new byte[]{88, 0, 126, -69};
        $$m = 173;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 97
            int r2 = r7 * 4
            int r0 = 1 - r2
            byte[] r7 = o.eb.d.$$d
            int r1 = r6 + 4
            byte[] r6 = new byte[r0]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r5
            r0 = r1
        L13:
            int r1 = -r1
            int r1 = r1 + r8
            r2 = r3
            r8 = r1
            r1 = r0
        L18:
            int r0 = r1 + 1
            byte r1 = (byte) r8
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r9[r5] = r0
            return
        L29:
            r1 = r7[r0]
            goto L13
        L2c:
            r2 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.d.u(short, byte, short, java.lang.Object[]):void");
    }

    private static void v(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23615c;
        long j2 = 0;
        int i6 = 989264422;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i9 = $10 + 125;
                $11 = i9 % 128;
                if (i9 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objA = o.d.d.a(i6);
                        if (objA == null) {
                            int packedPositionType = 675 - ExpandableListView.getPackedPositionType(j2);
                            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(i7, i7, i7));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12;
                            byte b2 = $$l[1];
                            objA = o.d.d.a(packedPositionType, cRgb, keyRepeatDelay, -328001469, false, $$n((byte) 27, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int trimmedLength = TextUtils.getTrimmedLength("") + 675;
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 12;
                        byte b3 = $$l[1];
                        objA2 = o.d.d.a(trimmedLength, modifierMetaStateMask, touchSlop, -328001469, false, $$n((byte) 27, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i3++;
                }
                i4 = 2;
                j2 = 0;
                i6 = 989264422;
                i7 = 0;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23615c;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 15;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 675;
                        char cAlpha = (char) Color.alpha(0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 12;
                        byte b4 = $$l[1];
                        objA3 = o.d.d.a(iCombineMeasuredStates, cAlpha, tapTimeout, -328001469, false, $$n((byte) 27, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i10])};
                    Object objA4 = o.d.d.a(989264422);
                    if (objA4 == null) {
                        int touchSlop2 = 675 - (ViewConfiguration.getTouchSlop() >> 8);
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b5 = $$l[1];
                        objA4 = o.d.d.a(touchSlop2, tapTimeout2, iIndexOf, -328001469, false, $$n((byte) 27, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    i10++;
                }
            }
            int i12 = $11 + 7;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 % 4;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i14 = $11 + 71;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i16 = $11 + 71;
            $10 = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            int i19 = 0;
            while (i19 < 16) {
                int i20 = $11 + 47;
                $10 = i20 % 128;
                if (i20 % i17 != 0) {
                    lVar.f19942e ^= iArr4[i19];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        int iResolveSize = View.resolveSize(0, 0) + 301;
                        char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 52697);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 11;
                        byte b6 = $$l[1];
                        objA5 = o.d.d.a(iResolveSize, tapTimeout3, offsetAfter, -1416256172, false, $$n((byte) 26, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i19 += 74;
                } else {
                    lVar.f19942e ^= iArr4[i19];
                    Object[] objArr7 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA6 = o.d.d.a(2098218801);
                    if (objA6 == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 302;
                        char packedPositionType2 = (char) (52697 - ExpandableListView.getPackedPositionType(0L));
                        int iIndexOf2 = TextUtils.indexOf("", "") + 11;
                        byte b7 = $$l[1];
                        objA6 = o.d.d.a(packedPositionChild, packedPositionType2, iIndexOf2, -1416256172, false, $$n((byte) 26, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA6).invoke(null, objArr7)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i19++;
                }
                i17 = 2;
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr8 = {lVar, lVar};
            Object objA7 = o.d.d.a(986820978);
            if (objA7 == null) {
                int trimmedLength2 = 229 - TextUtils.getTrimmedLength("");
                char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 51004);
                int windowTouchSlop = 9 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b8 = $$l[1];
                objA7 = o.d.d.a(trimmedLength2, c2, windowTouchSlop, -330018025, false, $$n((byte) 25, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void w(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str4.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f23617e;
        long j2 = 0;
        float f2 = 0.0f;
        if (cArr3 != null) {
            int i6 = $10 + 67;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int i8 = 594 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1));
                        char c2 = (char) (13182 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)));
                        int i9 = 12 - (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1));
                        byte b2 = $$l[1];
                        byte b3 = b2;
                        objA = o.d.d.a(i8, c2, i9, -1225586509, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    j2 = 0;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f23616d)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a('P' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23614b) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i10 = $10 + 33;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e >>> 1) << fVar.f19922a] << i2] / iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 457;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iBlue = Color.blue(0) + 11;
                        byte b4 = $$l[1];
                        objA3 = o.d.d.a(i11, packedPositionType, iBlue, -1923924106, false, $$n((byte) 3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        int i12 = 459 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int keyRepeatTimeout = 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b5 = $$l[1];
                        objA4 = o.d.d.a(i12, deadChar, keyRepeatTimeout, -1923924106, false, $$n((byte) 3, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f23613a) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    int i13 = 458 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 11;
                    byte b6 = $$l[1];
                    objA5 = o.d.d.a(i13, c3, touchSlop, -1923924106, false, $$n((byte) 3, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i14 = $10 + 55;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = fVar.f19922a;
                int i16 = fVar.f19923e;
                cArr6[i15] = (char) (cArr3[iArr[0 - fVar.f19922a] - i2] >> iIntValue);
                i3 = fVar.f19922a;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i3 = fVar.f19922a + 1;
            }
            fVar.f19922a = i3;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void x(short r9, int r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.eb.d.$$j
            int r0 = r11 * 3
            int r7 = r0 + 101
            int r0 = r9 * 4
            int r6 = 1 - r0
            int r0 = r10 * 4
            int r5 = 4 - r0
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r8 != 0) goto L30
            r1 = r6
            r0 = r5
            r2 = r3
        L16:
            int r5 = r5 + r1
            int r0 = r0 + 1
            r1 = r2
            r7 = r5
            r5 = r0
        L1c:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r6) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L2b:
            r1 = r8[r5]
            r0 = r5
            r5 = r7
            goto L16
        L30:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.d.x(short, int, short, java.lang.Object[]):void");
    }

    public abstract void launch(Context context, P p2, String str, CancellationSignal cancellationSignal);

    @Override // o.eb.j
    public void onDisplayCancelled() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23619j + 71;
        f23618f = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f23618f + 79;
            f23619j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            w((KeyEvent.getMaxKeyCode() >> 16) + 127, null, null, "\u0092\u0090\u0083\u0085§\u009e\u0090\u0086\u009d\u008d\u0081\u0092\u0088\u0096\u0086¦\u0090\u0084\u0091\u008a\u0090\u0095", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w(Drawable.resolveOpacity(0, 0) + 127, null, null, "\u0083\u0090\u0092®\u0081\u0096\u0086¦¨\u0090\u008a\u0081\u009a\u0084\u0090\u008b\u0082\u00ad\u0090\u0084\u0091\u008a\u0090\u0095¨\u0090\u0084\u0091\u008b\u0081\u0090¬¨«¨\u0083\u0090\u008b\u0084\u0085\u0088\u0088\u0091\u0096¨\u008b\u0085ª¨©¨\u0083\u0090\u0092\u0092\u0090\u008a\u0082\u0081\u0099\u008d\u0081\u0092\u0088\u0096\u0086¦\u0082\u0085", objArr2);
            o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03e5  */
    @Override // o.eb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDisplayImpossible(o.by.c r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.d.onDisplayImpossible(o.by.c):void");
    }

    @Override // o.eb.j
    public void onDisplaySuccess() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23618f + 93;
        f23619j = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            w(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0092\u0090\u0083\u0085§\u009e\u0090\u0086\u009d\u008d\u0081\u0092\u0088\u0096\u0086¦\u0090\u0084\u0091\u008a\u0090\u0095", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v(new int[]{-777327815, -1273742792, -1415389596, -1761831476, -1681287313, 2036164394, 1693006729, 1160093524, 958105590, 703761793, 825262424, 2038802975, -945861819, 117718866, 763296631, 575496854, 505974191, 1893232067, 1461319668, 1970430949, -2107875416, -1204971217, 13300592, -1581561198, 2089367281, 945697458, 571503901, -521386454, 1619889703, -142818814, 1480547924, 1261711327, -1712895943, 897863335}, KeyEvent.keyCodeFromString("") + 67, objArr2);
            o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
        }
        int i4 = f23619j + 49;
        f23618f = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setProcessCallback(o.x.f r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.eb.d.f23619j
            int r1 = r0 + 21
            int r0 = r1 % 128
            o.eb.d.f23618f = r0
            int r1 = r1 % r10
            r9 = 0
            r7 = 0
            if (r1 == 0) goto L5e
            boolean r1 = o.ea.f.a()
            r0 = 51
            int r0 = r0 / r9
            if (r1 == 0) goto L52
        L19:
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r2 = 127 - r0
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = "\u0092\u0090\u0083\u0085§\u009e\u0090\u0086\u009d\u008d\u0081\u0092\u0088\u0096\u0086¦\u0090\u0084\u0091\u008a\u0090\u0095"
            w(r2, r7, r7, r0, r1)
            r0 = r1[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = r0.intern()
            r0 = 36
            int[] r5 = new int[r0]
            r5 = {x006a: FILL_ARRAY_DATA , data: [-1187808473, -2057437255, 1199592925, -178195205, -484732293, 1986523697, -1143133194, 1816680660, -1054696181, -786419109, -1056945195, -585845297, -1224442727, -222451976, -1050136744, 1571022464, -1251803861, 436822828, -1405949394, -2136065616, 1237123704, 732096903, -975549271, -898916489, -1294568243, 1579662244, 626117009, -373902282, -2099465714, 1006834539, 53247163, 428359103, 1298320255, 1193941115, 1058711737, 92018386} // fill-array
            long r3 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r1 = 70 - r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            v(r5, r1, r0)
            r0 = r0[r9]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.d(r6, r0)
        L52:
            int r0 = o.eb.d.f23618f
            int r1 = r0 + 59
            int r0 = r1 % 128
            o.eb.d.f23619j = r0
            int r1 = r1 % r10
            if (r1 == 0) goto L65
            return
        L5e:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L52
            goto L19
        L65:
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.d.setProcessCallback(o.x.f):void");
    }
}
