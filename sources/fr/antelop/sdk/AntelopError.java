package fr.antelop.sdk;

import android.graphics.Color;
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
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.l;
import o.a.m;
import o.by.c;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18685a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f18686b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18687c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f18688d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18689e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18690f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f18691g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18692h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18693i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f18694j = 0;
    private final c innerError;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r7, short r8, short r9) {
        /*
            int r7 = r7 + 4
            int r6 = r8 * 3
            int r0 = r6 + 1
            int r5 = r9 + 116
            byte[] r4 = fr.antelop.sdk.AntelopError.$$c
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r4 != 0) goto L24
            r0 = r6
            r1 = r2
        L11:
            int r5 = r5 + r0
        L12:
            int r7 = r7 + 1
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r6) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L1f:
            int r1 = r1 + 1
            r0 = r4[r7]
            goto L11
        L24:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.AntelopError.$$e(int, short, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f18694j = 2057054827;
        f18693i = 1553175732;
        f18692h = -277201547;
        f18690f = -1692770074;
        init$0();
        f18685a = 0;
        f18691g = 1;
        f18689e = 0;
        f18687c = 1;
        d();
        f18686b = new int[]{1627580287, 402476893, 1921112190, -874005801, -1243187486, -370806360, 464500421, -420481378, -1650398111, 353182675, -1875960239, -1545129439, 604780066, -225008149, 1398678238, -202765300, 2101416569, 1856897433};
        int i2 = f18691g + 3;
        f18685a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
    }

    public AntelopError(c cVar) {
        this.innerError = cVar;
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x011e: ARITH (r10 I:??[int, boolean]) = (r7 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:10:0x011e */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] a(int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.AntelopError.a(int, int):java.lang.Object[]");
    }

    static void d() {
        f18688d = new char[]{56523, 56348, 56329, 56322, 56337, 56345, 56348, 56341, 56340, 56345, 56328, 56327, 56348, 56348, 56343, 56338, 56345, 56346, 56338, 56570, 56426, 56419, 56428, 56428, 56425, 56424, 56404, 56408, 56430, 56409, 56402, 56417, 56425, 56428, 56421, 56420, 56425, 56499, 56558, 56555, 56547, 56532, 56505, 56528, 56561, 56526, 56521, 56550, 56556, 56560, 56555, 56553, 56551, 56503, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56528, 56555, 56548, 56546, 56553, 56563, 56553, 56553, 56561, 56553, 56555, 56562, 56563, 56556, 56521, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56405, 56407, 56406, 56505, 56560, 56553, 56521, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56522, 56557, 56563, 56553, 56546, 56548, 56546, 56546, 56553, 56551, 56545, 56551, 56552, 56548, 56521, 56527, 56537, 56342, 56348, 56382, 56372, 56365, 56369, 56374, 56373, 56342, 56348, 56382, 56372, 56365, 56369, 56374, 56373, 56366, 56370, 56377, 56345, 56348, 56385, 56385, 56348, 56344, 56371, 56374, 56379, 56372, 56371, 56344, 56340, 56367, 56366, 56374};
    }

    static void init$0() {
        $$a = new byte[]{53, 102, 82, Ascii.ETB};
        $$b = 35;
    }

    static void init$1() {
        $$c = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
        $$d = 254;
    }

    private static void k(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 97;
        $11 = i5 % 128;
        Object bytes = str2;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr2 = f18688d;
        int i11 = -1;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            while (i6 < length) {
                int i12 = $11 + 33;
                $10 = i12 % 128;
                if (i12 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objA = d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i11;
                            byte b3 = (byte) (b2 + 1);
                            objA = d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 249, (char) ((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) - 1), 11 - Color.argb(0, 0, 0, 0), 1376582792, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i6 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objA2 = d.a(-2071388435);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(250 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 11, 1376582792, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i3 = 2;
                i11 = -1;
                j2 = 0;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr2, i7, cArr4, 0, i8);
        if (bArr != null) {
            char[] cArr5 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = d.a(120026474);
                    if (objA3 == null) {
                        objA3 = d.a(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = d.a(1632715197);
                    if (objA4 == null) {
                        byte b6 = (byte) (-1);
                        objA4 = d.a(836 - TextUtils.getTrimmedLength(""), (char) (27279 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1210801192, false, $$e(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i14] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr5[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = d.a(21 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35715), View.combineMeasuredStates(0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i10 > 0) {
            char[] cArr6 = new char[i8];
            System.arraycopy(cArr4, 0, cArr6, 0, i8);
            int i15 = i8 - i10;
            System.arraycopy(cArr6, 0, cArr4, i15, i10);
            System.arraycopy(cArr6, i10, cArr4, 0, i15);
        }
        if (z2) {
            int i16 = $10 + 87;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr = new char[i8];
                i2 = 0;
            } else {
                i2 = 0;
                cArr = new char[i8];
            }
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr[mVar.f19943d] = cArr4[(i8 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr4 = cArr;
        }
        if (i9 > 0) {
            int i17 = 0;
            while (true) {
                mVar.f19943d = i17;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                i17 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 2
            int r8 = 3 - r0
            int r2 = r9 * 4
            int r1 = 1 - r2
            int r0 = r10 * 4
            int r7 = 100 - r0
            byte[] r6 = fr.antelop.sdk.AntelopError.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r6 != 0) goto L2e
            r0 = r3
            r2 = r4
        L17:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r7
            int r8 = r8 + 1
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L2b:
            r0 = r6[r8]
            goto L17
        L2e:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.AntelopError.l(short, byte, byte, java.lang.Object[]):void");
    }

    private static void m(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f18686b;
        int i5 = 989264422;
        int i6 = -1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 67;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objA = d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objA = d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 674, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 12, -328001469, false, $$e(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objA2 = d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(675 - Color.alpha(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, -328001469, false, $$e(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i3 = 2;
                i5 = 989264422;
                i6 = -1;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f18686b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                Object objA3 = d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = d.a(AndroidCharacter.getMirror('0') + 627, (char) ((-1) - Process.getGidForName("")), TextUtils.getOffsetBefore("", i7) + 12, -328001469, false, $$e(b6, b7, (byte) (b7 + 5)), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i10++;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i7, iArr4, i7, length2);
        lVar.f19941d = i7;
        while (lVar.f19941d < iArr.length) {
            int i11 = $10 + 125;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objA4 = d.a(301 - (Process.myTid() >> 22), (char) (52696 - Process.getGidForName("")), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1416256172, false, $$e(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i13++;
                int i15 = $10 + 47;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i17;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i18 = lVar.f19942e;
            int i19 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) (-1);
                byte b11 = (byte) (b10 + 1);
                objA5 = d.a(KeyEvent.getDeadChar(0, 0) + 229, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 51004), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, -330018025, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            int i20 = $11 + 7;
            $10 = i20 % 128;
            int i21 = i20 % 2;
        }
        String str = new String(cArr2, 0, i2);
        int i22 = $10 + 93;
        $11 = i22 % 128;
        if (i22 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    public final AntelopErrorCode getCode() {
        int i2 = 2 % 2;
        int i3 = f18687c + 79;
        f18689e = i3 % 128;
        int i4 = i3 % 2;
        AntelopErrorCode antelopErrorCodeC = this.innerError.c();
        int i5 = f18687c + 91;
        f18689e = i5 % 128;
        if (i5 % 2 == 0) {
            return antelopErrorCodeC;
        }
        throw null;
    }

    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f18687c + 27;
        f18689e = i3 % 128;
        int i4 = i3 % 2;
        String strD = this.innerError.d();
        int i5 = f18689e + 23;
        f18687c = i5 % 128;
        int i6 = i5 % 2;
        return strD;
    }

    public final int getReason() {
        int i2 = 2 % 2;
        int i3 = f18687c + 61;
        f18689e = i3 % 128;
        int i4 = i3 % 2;
        c cVar = this.innerError;
        if (i4 == 0) {
            return cVar.b();
        }
        cVar.b();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("AntelopError").append(this.innerError.toString()).toString();
        int i3 = f18689e + 103;
        f18687c = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
