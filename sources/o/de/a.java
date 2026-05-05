package o.de;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.h;
import o.a.k;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f22901b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f22902c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22903e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f22904f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22905g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22906j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22907a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f22908d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r9, byte r10, int r11) {
        /*
            byte[] r8 = o.de.a.$$c
            int r0 = r9 * 2
            int r0 = r0 + 4
            int r7 = 114 - r11
            int r1 = r10 * 3
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2b
            r3 = r4
            r2 = r0
        L13:
            int r1 = -r0
            int r1 = r1 + r7
            int r0 = r2 + 1
            r2 = r3
            r7 = r1
        L19:
            byte r1 = (byte) r7
            int r3 = r2 + 1
            r5[r2] = r1
            if (r3 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r1 = r8[r0]
            r2 = r0
            r0 = r1
            goto L13
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.a.$$g(byte, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f22904f = -23884878;
        init$0();
        f22905g = 0;
        f22906j = 1;
        f22902c = new char[]{64637, 64593, 64597, 64619, 64580, 64585, 64588, 64598, 64592, 64523, 64616, 64576, 64586, 64584, 64634, 64621, 64579, 64577, 64528, 64636, 64590, 64578, 64540, 64587, 64583, 64631, 64599, 64533, 64604, 64630, 64629, 64582, 64589, 64595, 64591, 64614};
        f22901b = (char) 51641;
        f22903e = 8442416591861347332L;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] a(android.content.Context r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.a.a(android.content.Context, int, int):java.lang.Object[]");
    }

    private static void h(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f22902c;
        int i6 = 421932776;
        float f2 = 0.0f;
        int i7 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 45;
                $10 = i9 % 128;
                int i10 = i9 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 12 - (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)), -811348851, false, $$g(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 12)))), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 2;
                    i6 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f22901b)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(271 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), 11 - View.combineMeasuredStates(0, 0), -811348851, false, $$g(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 12)))), new Class[]{Integer.TYPE});
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
                hVar.f19925a = cArr[hVar.f19926b + i7];
                if (hVar.f19927c == hVar.f19925a) {
                    int i11 = $10 + 121;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c % b2);
                        cArr4[hVar.f19926b] = (char) (hVar.f19925a / b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i7] = (char) (hVar.f19925a - b2);
                    }
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
                    objArr4[i7] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -611683395, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c2 = 11;
                            objA4 = o.d.d.a(218 - KeyEvent.normalizeMetaState(0), (char) TextUtils.indexOf("", ""), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), 212688716, false, $$g(b9, b10, (byte) (b10 + 5)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i12];
                        int i13 = $11 + 93;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i15 = $11 + 61;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i17 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i18 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i17];
                            cArr4[hVar.f19926b + 1] = cArr2[i18];
                        } else {
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            i7 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        }
                    }
                    i7 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f22903e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 47;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22903e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(229 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (51052 - AndroidCharacter.getMirror('0')), View.MeasureSpec.getSize(0) + 9, 1749983833, false, $$g(b2, b3, (byte) (7 | b3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16777228, 522683165, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        $$a = new byte[]{45, 113, 111, 122};
        $$b = 146;
    }

    static void init$1() {
        $$d = new byte[]{80, 70, 7, 82, 65, MessagePack.Code.EXT32, -10, 65, MessagePack.Code.EXT32, 65, -14, 65, -75, 75, MessagePack.Code.FLOAT32, 64, -14};
        $$e = 155;
    }

    static void init$2() {
        $$c = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
        $$f = 202;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r9, byte r10, byte r11, java.lang.Object[] r12) {
        /*
            int r0 = r11 * 4
            int r8 = 3 - r0
            int r0 = r9 * 3
            int r7 = 101 - r0
            byte[] r6 = o.de.a.$$a
            int r5 = r10 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r6 != 0) goto L2c
            r1 = r8
            r0 = r3
        L15:
            int r7 = r7 + r1
        L16:
            byte r1 = (byte) r7
            r4[r0] = r1
            if (r0 != r5) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L23:
            int r8 = r8 + 1
            r2 = r6[r8]
            int r0 = r0 + 1
            r1 = r7
            r7 = r2
            goto L15
        L2c:
            r0 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.a.k(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r1 = r9 + 1
            int r0 = 111 - r7
            byte[] r7 = o.de.a.$$d
            int r6 = 17 - r8
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L2a
            r1 = r6
            r3 = r9
            r2 = r4
        L10:
            int r0 = -r3
            int r6 = r6 + r0
            int r1 = r1 + 1
            r0 = r6
            r6 = r1
        L16:
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r2 != r9) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r10[r4] = r0
            return
        L23:
            int r2 = r2 + 1
            r3 = r7[r6]
            r1 = r6
            r6 = r0
            goto L10
        L2a:
            r2 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.a.l(int, int, int, java.lang.Object[]):void");
    }

    public final void a(Context context) {
        int i2 = 2 % 2;
        if (this.f22907a != 0) {
            int i3 = f22906j + 39;
            f22905g = i3 % 128;
            int i4 = i3 % 2;
            this.f22907a = 0;
            Object[] objArr = new Object[1];
            h(46 - ImageFormat.getBitsPerPixel(0), C1561oA.Yd("|\fzt\u0006x\u0006\u0001\u0005Թ\u0003|\u000e\u0001\u000e\t\rՁ\"\"\u0014\u000f\u0011$#\n$'\u0018\u0014/\u0010,\u0018\u001d!\u001b4\u001f'\u001f5*7>#䦤", (short) (FB.Xd() ^ 13871)), (byte) (MotionEvent.axisFromString("") + 58), objArr);
            String strIntern = ((String) objArr[0]).intern();
            short sXd = (short) (OY.Xd() ^ 28061);
            short sXd2 = (short) (OY.Xd() ^ 3843);
            int[] iArr = new int["(6-<:51{2??F8BI\u0004\u001aGGN@TQ".length()];
            QB qb = new QB("(6-<:51{2??F8BI\u0004\u001aGGN@TQ");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) + sXd2);
                i5++;
            }
            Object[] objArr2 = {strIntern, 0};
            Method method = Class.forName(new String(iArr, 0, i5)).getMethod(ZO.xd("`YV\u0019#\u001b\u0012MTQ\u001fPJ{0E\u0014-\u0013'", (short) (OY.Xd() ^ 4256), (short) (OY.Xd() ^ 1345)), Class.forName(Jg.Wd("}\u0012\u0006NU1\u0006o,\u0010\u0014\u0013K_D\u001a", (short) (C1633zX.Xd() ^ (-30021)), (short) (C1633zX.Xd() ^ (-2161)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
                Object[] objArr3 = new Object[1];
                i(C1626yg.Ud("叇笋\ue9a0ᡦ뎎鮳̼夕ཡᙈ睵潼䃕", (short) (Od.Xd() ^ (-30749)), (short) (Od.Xd() ^ (-6400))), TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr3);
                editorEdit.putInt(((String) objArr3[0]).intern(), this.f22907a).commit();
                int i6 = f22906j + 13;
                f22905g = i6 % 128;
                int i7 = i6 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(android.content.Context r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.a.b(android.content.Context):int");
    }

    public final d c(Context context) throws Throwable {
        int i2 = 2 % 2;
        d dVar = this.f22908d;
        if (dVar != null) {
            int i3 = f22906j + 65;
            f22905g = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return dVar;
        }
        int i5 = 47 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        byte offsetAfter = (byte) (57 - TextUtils.getOffsetAfter("", 0));
        Object[] objArr = new Object[1];
        short sXd = (short) (C1580rY.Xd() ^ (-21336));
        short sXd2 = (short) (C1580rY.Xd() ^ (-12609));
        int[] iArr = new int["fx\u001bEk#_p(ǡY\u0006H_ OdʪQb\u0005GY\u001eS;\b>A\u0003LB\u0013\u001e6p\u001aWw0;q\u001c;s\u001f忏".length()];
        QB qb = new QB("fx\u001bEk#_p(ǡY\u0006H_ OdʪQb\u0005GY\u001eS;\b>A\u0003LB\u0013\u001e6p\u001aWw0;q\u001c;s\u001f忏");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK(xuXd.CK(iKK) - ((i6 * sXd2) ^ sXd));
            i6++;
        }
        h(i5, new String(iArr, 0, i6), offsetAfter, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(ZO.xd("A>g\bYR*V/\u001e[:6\f:TVcK!\u00161I", (short) (ZN.Xd() ^ 10951), (short) (ZN.Xd() ^ 8461)));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("=erJt\t) `k~\u00014*#p", (short) (C1607wl.Xd() ^ 7277), (short) (C1607wl.Xd() ^ 25410))), Integer.TYPE};
        Object[] objArr2 = {strIntern, 0};
        short sXd3 = (short) (ZN.Xd() ^ 2857);
        int[] iArr2 = new int["-d\"\u0018e2\u001fQ\u0002]\u0002V\t\u000e\u000bg\u0018'`'".length()];
        QB qb2 = new QB("-d\"\u0018e2\u001fQ\u0002]\u0002V\t\u000e\u000bg\u0018'`'");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd3 + i7)));
            i7++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i7), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            i(EO.Od("ᵐ㬸레掕㱶\ue0f4赮៹抔ซ뒕\ue7f0䌤", (short) (FB.Xd() ^ 941)), TextUtils.indexOf("", "", 0, 0), objArr3);
            String string = sharedPreferences.getString(((String) objArr3[0]).intern(), "");
            c cVar = new c();
            e eVar = new e();
            b bVar = new b();
            if (string.equals(eVar.b())) {
                int i8 = f22906j + 9;
                f22905g = i8 % 128;
                if (i8 % 2 != 0) {
                    this.f22908d = eVar;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                this.f22908d = eVar;
            } else if (string.equals(bVar.b())) {
                int i9 = f22906j;
                int i10 = i9 + 47;
                f22905g = i10 % 128;
                int i11 = i10 % 2;
                this.f22908d = bVar;
                int i12 = i9 + 41;
                f22905g = i12 % 128;
                int i13 = i12 % 2;
            } else {
                this.f22908d = cVar;
            }
            return this.f22908d;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void d(Context context) throws Throwable {
        int i2 = 2 % 2;
        this.f22908d = new c();
        Object[] objArr = new Object[1];
        h(47 - (ViewConfiguration.getEdgeSlop() >> 16), C1561oA.Qd("YfSKZKVOQǑKCRCNGIǉZXHAARO4LM<6O.H257/F/5+?2=B%꾾", (short) (C1580rY.Xd() ^ (-15885))), (byte) (Color.blue(0) + 57), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(C1593ug.zd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (C1633zX.Xd() ^ (-2629)), (short) (C1633zX.Xd() ^ (-15845)))).getMethod(C1561oA.Kd("CBR2HBTHH5XLNN\\PZPSb", (short) (OY.Xd() ^ 1959)), Class.forName(C1561oA.od("<2F0{9-91v\u001b;8.2*", (short) (C1607wl.Xd() ^ 6750))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            i(Wg.Zd("\uf5a4츏⪇ꑊ⊥鵥⍹篆黡᮶駔꜋틋", (short) (C1499aX.Xd() ^ (-26620)), (short) (C1499aX.Xd() ^ (-20267))), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            editorEdit.putString(((String) objArr3[0]).intern(), this.f22908d.b()).commit();
            a(context);
            int i3 = f22905g + 63;
            f22906j = i3 % 128;
            int i4 = i3 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void d(Context context, o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        c cVar2 = new c();
        e eVar = new e();
        b bVar = new b();
        if (e.a(cVar)) {
            int i3 = f22905g + 25;
            f22906j = i3 % 128;
            if (i3 % 2 == 0) {
                this.f22908d = eVar;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.f22908d = eVar;
        } else if (b.e(cVar)) {
            int i4 = f22906j + 65;
            f22905g = i4 % 128;
            int i5 = i4 % 2;
            this.f22908d = bVar;
        } else {
            this.f22908d = cVar2;
        }
        Object[] objArr = new Object[1];
        h(TextUtils.indexOf("", "", 0) + 47, C1561oA.Xd("\u0019(\u0017\u0011\"\u0015\"\u001d!؇\u001f\u0019*\u001d*%)؏>>0+-@?&@C40K,H49=7P;C;QFSZ?矗", (short) (FB.Xd() ^ 11956)), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 57), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(Wg.vd("FRGTXQK\u0014P[Y^V^c\u001c8caf^pk", (short) (OY.Xd() ^ 30324))).getMethod(hg.Vd("+(6\u0014( 0\" \u000b,\u001e\u001e\u001c(\u001a\"\u0016\u0017$", (short) (ZN.Xd() ^ 9104), (short) (ZN.Xd() ^ 21429)), Class.forName(Qg.kd("|r\u0007p<ymyq7[{xnrj", (short) (C1580rY.Xd() ^ (-29145)), (short) (C1580rY.Xd() ^ (-2937)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            i(C1561oA.ud("ꄹꆌ◌윷浚ᨂ뿞䟓銦㥃\udf49᱈澰", (short) (FB.Xd() ^ 14944)), View.MeasureSpec.getMode(0), objArr3);
            editorEdit.putString(((String) objArr3[0]).intern(), this.f22908d.b()).commit();
            int i6 = f22905g + 87;
            f22906j = i6 % 128;
            int i7 = i6 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22906j + 97;
        f22905g = i3 % 128;
        int i4 = i3 % 2;
        this.f22907a = b(context) + 1;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 47;
        byte deadChar = (byte) (57 - KeyEvent.getDeadChar(0, 0));
        Object[] objArr = new Object[1];
        short sXd = (short) (FB.Xd() ^ 1682);
        int[] iArr = new int["\u0004\u0011\u0002y\r}\r\u0006\fę\n\u0002\u0015\u0006\u0015\u000e\u0014ġ)'\u001b\u0014\u0018)*\u000f+,\u001f\u00196\u0015r\\ceaxekeyp{\u0005g龱".length()];
        QB qb = new QB("\u0004\u0011\u0002y\r}\r\u0006\fę\n\u0002\u0015\u0006\u0015\u000e\u0014ġ)'\u001b\u0014\u0018)*\u000f+,\u001f\u00196\u0015r\\ceaxekeyp{\u0005g龱");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i5));
            i5++;
        }
        h(iMakeMeasureSpec, new String(iArr, 0, i5), deadChar, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(C1561oA.Yd("_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t", (short) (C1633zX.Xd() ^ (-22640))));
        Class<?>[] clsArr = {Class.forName(Xg.qd("F>T@\u000eMCQK\u00139[ZRXR", (short) (C1633zX.Xd() ^ (-14375)), (short) (C1633zX.Xd() ^ (-15760)))), Integer.TYPE};
        Object[] objArr2 = {strIntern, 0};
        short sXd2 = (short) (C1607wl.Xd() ^ 15269);
        short sXd3 = (short) (C1607wl.Xd() ^ 7870);
        int[] iArr2 = new int["8K\u0012'\u0014C\f\u0016Kng\u0012I_\"M.Y\u00136".length()];
        QB qb2 = new QB("8K\u0012'\u0014C\f\u0016Kng\u0012I_\"M.Y\u00136");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd3) ^ sXd2));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            i(ZO.xd("\ua631쓩꼸厸\ue442彩Ćﭯ㷍\u20f6\u0e7d壶볉", (short) (Od.Xd() ^ (-16725)), (short) (Od.Xd() ^ (-27532))), TextUtils.getCapsMode("", 0, 0), objArr3);
            editorEdit.putInt(((String) objArr3[0]).intern(), this.f22907a).commit();
            int i7 = f22906j + 13;
            f22905g = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
