package o.eb;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static long f23583a = 0;

    /* JADX INFO: renamed from: b */
    private static int[] f23584b = null;

    /* JADX INFO: renamed from: c */
    private static char f23585c = 0;

    /* JADX INFO: renamed from: d */
    private static int f23586d = 0;

    /* JADX INFO: renamed from: e */
    private static int f23587e = 0;

    /* JADX INFO: renamed from: f */
    private static int f23588f = 0;

    /* JADX INFO: renamed from: g */
    public static int f23589g = 0;

    /* JADX INFO: renamed from: h */
    public static int f23590h = 0;

    /* JADX INFO: renamed from: i */
    public static int f23591i = 0;

    /* JADX INFO: renamed from: j */
    public static int f23592j = 0;

    /* JADX INFO: renamed from: k */
    public static int f23593k = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r9, byte r10, short r11) {
        /*
            int r8 = r11 * 3
            int r1 = r8 + 1
            byte[] r7 = o.eb.a.$$c
            int r6 = r9 + 65
            int r0 = r10 * 3
            int r5 = 3 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L29
            r1 = r5
            r2 = r3
        L13:
            int r6 = r6 + r5
            r5 = r1
        L15:
            int r1 = r5 + 1
            byte r0 = (byte) r6
            r4[r2] = r0
            if (r2 != r8) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r2 = r2 + 1
            r0 = r7[r1]
            r5 = r6
            r6 = r0
            goto L13
        L29:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.a.$$g(int, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23593k = 1015545828;
        f23592j = 1598386653;
        f23591i = 164709941;
        f23590h = 712883239;
        f23589g = 904791958;
        init$0();
        f23587e = 0;
        f23588f = 1;
        f23584b = new int[]{-977562893, -1251373582, 1621415730, 1245856788, 1475667448, -1073511642, 1252521222, -200984948, -68133523, -323827543, 1995004062, 2136987468, -777863681, 1354870268, -122133106, -2081664140, -29543384, 129203127};
        f23583a = 740602047300126166L;
        f23586d = 1564493270;
        f23585c = (char) 17791;
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0bd9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.app.Activity r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.a.c(android.app.Activity):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:197|130|(1:132)(4:134|186|135|(8:137|138|191|143|(2:145|152)(4:146|189|147|148)|(5:188|154|(1:156)(5:170|193|171|172|(2:159|(2:161|(1:163)(1:167))(0)))|157|(0))|176|177)(1:139))|133|191|143|(0)(0)|(0)|176|177) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0561, code lost:
    
        if ((r1 != null) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0563, code lost:
    
        r4 = new java.lang.Object[]{new int[]{r28 ^ (r28 << 5)}, new int[]{r27}, r1, new int[]{r27 ^ 20}};
        r8 = o.eb.a.f23593k * 947696942;
        o.eb.a.f23593k = r8;
        r7 = ~r8;
        r28 = r28 + ((((2052985041 + (((-1) - (((-1) - (~((-1) - (((-1) - 33710947) & ((-1) - r7))))) & ((-1) - 644437074))) * (-328))) + ((r8 | 644437074) * 164)) + (((-1) - (((-1) - ((-1) - (((-1) - (~(r8 | (-33710948)))) & ((-1) - 33570882)))) & ((-1) - (~((r7 + 644577139) - (r7 & 644577139)))))) * 164)) + 16);
        r28 = r28 ^ (r28 << 13);
        r28 = r28 ^ (r28 >>> 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x05de, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05e1, code lost:
    
        if (r1 != null) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d0 A[Catch: Exception -> 0x051b, TRY_LEAVE, TryCatch #3 {Exception -> 0x051b, blocks: (B:143:0x04aa, B:146:0x04d0, B:148:0x050c, B:150:0x0514, B:151:0x051a, B:147:0x04da), top: B:191:0x04aa, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x051e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] c(int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.a.c(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
        $$b = 31;
    }

    static void init$1() {
        $$d = new byte[]{Ascii.EM, -93, 95, -122, 60, MessagePack.Code.EXT8, -10, 52, MessagePack.Code.BIN32, 60, MessagePack.Code.BIN16, -16, 60, MessagePack.Code.BIN32};
        $$e = 5;
    }

    static void init$2() {
        $$c = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$f = 51;
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        char c2 = 2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f23584b;
        long j2 = 0;
        int i4 = 989264422;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11;
            int i7 = i6 + 87;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i6 + 115;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionGroup(j2) + 675, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 11 - MotionEvent.axisFromString(""), -328001469, false, $$g((byte) (-$$c[c2]), b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i11++;
                    c2 = 2;
                    j2 = 0;
                    i4 = 989264422;
                    i5 = 0;
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
        int[] iArr5 = f23584b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 25;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(Color.argb(0, 0, 0, 0) + 675, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - TextUtils.getOffsetAfter("", 0), -328001469, false, $$g((byte) (-$$c[2]), b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i12 >>>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a((ViewConfiguration.getScrollBarSize() >> 8) + 675, (char) TextUtils.indexOf("", ""), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -328001469, false, $$g((byte) (-$$c[2]), b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i12++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i14 = $10 + 29;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                lVar.f19942e ^= iArr4[i16];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(301 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 52697), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1416256172, false, $$g((byte) ($$f + 3), b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
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
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b6 = (byte) 0;
                objA5 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 229, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51004), Color.red(0) + 9, -330018025, false, $$g((byte) ($$f + 1), b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            int i20 = $10 + 37;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 5 % 3;
            }
        }
        String str = new String(cArr2, 0, i2);
        int i22 = $11 + 15;
        $10 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    private static void m(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 79;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object obj = null;
        Object charArray3 = str4;
        if (str4 != null) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str4.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i8 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            int i9 = $11 + 39;
            $10 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i8) + 107;
                    char c3 = (char) (TypedValue.complexToFraction(i8, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i8, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iArgb = Color.argb(i8, i8, i8, i8) + 11;
                    byte b2 = (byte) i8;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i8] = Object.class;
                    objA = o.d.d.a(iIndexOf, c3, iArgb, -155898465, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    int iResolveSize = View.resolveSize(i8, i8) + 847;
                    char c4 = (char) (6489 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iMyPid = 12 - (Process.myPid() >> 22);
                    int i11 = $$f;
                    byte b4 = (byte) ((i11 + 15) - (i11 | 15));
                    byte b5 = (byte) (b4 - 3);
                    String str$$g2 = $$g(b4, b5, b5);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i8] = Object.class;
                    objA2 = o.d.d.a(iResolveSize, c4, iMyPid, -694521287, false, str$$g2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                int i12 = cArr3[iVar.f19932b % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i12);
                objArr4[i8] = iVar;
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    int i13 = 459 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int maximumFlingVelocity = 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b6 = (byte) ((-1) - (((-1) - $$f) | ((-1) - 5)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(i13, windowTouchSlop, maximumFlingVelocity, 1804962841, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    int offsetBefore = 639 - TextUtils.getOffsetBefore("", 0);
                    char c5 = (char) (65101 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iIndexOf2 = 11 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b8 = (byte) 0;
                    String str$$g3 = $$g((byte) 57, b8, b8);
                    i3 = 2;
                    objA4 = o.d.d.a(offsetBefore, c5, iIndexOf2, 1636969060, false, str$$g3, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i3 = 2;
                }
                obj = null;
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f23583a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f23586d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f23585c) ^ 740602047300126166L))));
                iVar.f19932b++;
                i8 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(short r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.eb.a.$$a
            int r0 = r10 * 2
            int r7 = 4 - r0
            int r2 = 106 - r11
            int r6 = r9 * 4
            int r0 = r6 + 1
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r8 != 0) goto L2b
            r0 = r6
            r3 = r7
            r2 = r4
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            int r3 = r3 + 1
            r1 = r2
        L19:
            byte r0 = (byte) r7
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            r0 = r8[r3]
            goto L14
        L2b:
            r1 = r4
            r3 = r7
            r7 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.a.n(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r0 = r8 * 5
            int r8 = r0 + 1
            int r0 = r7 * 5
            int r7 = 13 - r0
            int r6 = r9 + 97
            byte[] r5 = o.eb.a.$$d
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L2c
            r0 = r8
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            int r6 = r6 + (-5)
            r1 = r2
        L18:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            int r7 = r7 + 1
            if (r2 != r8) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L29:
            r0 = r5[r7]
            goto L13
        L2c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eb.a.o(byte, short, short, java.lang.Object[]):void");
    }
}
