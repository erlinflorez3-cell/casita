package fr.antelop.sdk.util;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.g;
import o.a.h;
import o.a.k;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class DateHelper {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final String FULL_DATE_FORMAT = "d MMMM yyyy HH'h'mm";
    private static final String LASTWEEK_DATE_FORMAT = "EEEE HH'h'mm";
    private static final String TIME_FORMAT = "HH'h'mm";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f19617a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f19618b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f19619c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f19620d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f19621e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19622f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f19623g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f19624h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19625i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19626j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f19627k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19628l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19629m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19630n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19631o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f19632p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f19633q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f19634r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f19635s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f19636t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f19637u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f19638v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f19639w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f19640x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f19641y = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r6, short r7, byte r8) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 1
            int r7 = 114 - r7
            int r0 = r6 * 2
            int r6 = 3 - r0
            byte[] r5 = fr.antelop.sdk.util.DateHelper.$$c
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r5 != 0) goto L2a
            r0 = r6
            r7 = r8
            r2 = r3
        L14:
            int r6 = r6 + r7
            r1 = r2
            r7 = r6
            r6 = r0
        L18:
            byte r0 = (byte) r7
            int r2 = r1 + 1
            r4[r1] = r0
            int r0 = r6 + 1
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r6 = r5[r0]
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.DateHelper.$$e(short, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19641y = 1225589063;
        f19640x = -319723722;
        f19639w = 250211774;
        f19638v = 701313504;
        f19637u = -1829194135;
        f19636t = -1121914369;
        f19635s = 1441657220;
        f19634r = 907207121;
        f19633q = -566517500;
        f19632p = -653199727;
        f19631o = 1210549918;
        f19630n = -1351404332;
        f19629m = 1113481017;
        f19628l = -1646981196;
        init$0();
        f19626j = 0;
        f19627k = 1;
        f19622f = 0;
        f19625i = 1;
        d();
        f19619c = 7984855321333287436L;
        int i2 = f19627k + 123;
        f19626j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void A(String str, int i2, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $10 + 29;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f19623g;
        long j2 = 0;
        int i7 = 421932776;
        char c2 = '0';
        int i8 = 1;
        if (cArr2 != null) {
            int i9 = $10 + 19;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objA = d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        objA = d.a((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 269, (char) ((-1) - TextUtils.indexOf("", c2, 0)), TextUtils.indexOf("", "", 0) + 11, -811348851, false, $$e(b3, (byte) ((b3 + Ascii.FF) - (12 & b3)), b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    j2 = 0;
                    i7 = 421932776;
                    c2 = '0';
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
        Object[] objArr3 = {Integer.valueOf(f19624h)};
        Object objA2 = d.a(421932776);
        char c3 = '\f';
        if (objA2 == null) {
            byte b4 = (byte) 0;
            objA2 = d.a(KeyEvent.keyCodeFromString("") + 270, (char) TextUtils.getTrimmedLength(""), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -811348851, false, $$e(b4, (byte) (12 | b4), b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        char c4 = 3;
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
            int i12 = $10 + 45;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 3;
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i8];
                if (hVar.f19927c == hVar.f19925a) {
                    int i14 = $11 + 33;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c + b2);
                        cArr4[hVar.f19926b >> i8] = (char) (hVar.f19925a + b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c3] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[c4] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = d.a(219124184);
                    if (objA3 == null) {
                        int iRgb = Color.rgb(0, 0, 0) + 16778041;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 11;
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        String str$$e = $$e(b5, b6, (byte) (b6 - 3));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[i8] = Object.class;
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
                        objA3 = d.a(iRgb, cLastIndexOf, jumpTapTimeout, -611683395, false, str$$e, clsArr);
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = hVar;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = hVar;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = hVar;
                        objArr5[4] = hVar;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i8] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = d.a(-634864343);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 5);
                            c4 = 3;
                            objA4 = d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + JfifUtil.MARKER_SOS, (char) (AndroidCharacter.getMirror('0') - '0'), 11 - View.resolveSize(0, 0), 212688716, false, $$e(b7, b8, (byte) (b8 - 5)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c4 = 3;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else {
                        c4 = 3;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                            int i18 = $11 + 101;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                        } else {
                            int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i20];
                            i8 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i21];
                        }
                    }
                    i8 = 1;
                }
                hVar.f19926b += 2;
                c3 = '\f';
            }
        }
        for (int i22 = 0; i22 < i2; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void B(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i4 = $11 + 113;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 19;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 3 / 3;
        }
        while (gVar.f19924d < cArr.length) {
            cArr3[i6] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = i6;
            while (i10 < 16) {
                int i11 = $11 + 29;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i13 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f19617a) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f19620d);
                    objArr2[2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = d.a(1603517628);
                    if (objA == null) {
                        int i15 = 270 - (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1));
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int mirror = ';' - AndroidCharacter.getMirror('0');
                        byte b2 = (byte) i6;
                        String str$$e = $$e(b2, (byte) ((b2 + 45) - (45 & b2)), b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = d.a(i15, maxKeyCode, mirror, -1995022631, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f19621e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f19618b)};
                    Object objA2 = d.a(1603517628);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(ExpandableListView.getPackedPositionGroup(0L) + 270, (char) Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, -1995022631, false, $$e(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 45))), b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = d.a(1390051551);
            if (objA3 == null) {
                byte b4 = (byte) 0;
                objA3 = d.a(270 - Color.argb(0, 0, 0, 0), (char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0') + 12, -2074123590, false, $$e(b4, $$c[1], b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void C(int r8, short r9, int r10, java.lang.Object[] r11) {
        /*
            int r7 = r9 + 4
            byte[] r6 = fr.antelop.sdk.util.DateHelper.$$a
            int r0 = r10 + 97
            int r5 = r8 * 4
            int r1 = r5 + 1
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L27
            r2 = r7
            r1 = r3
        L11:
            int r0 = -r0
            int r7 = r7 + r0
        L13:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r2 = r2 + 1
            if (r1 != r5) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L22:
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L11
        L27:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.DateHelper.C(int, short, int, java.lang.Object[]):void");
    }

    static void d() {
        f19621e = (char) 11970;
        f19618b = (char) 9247;
        f19617a = (char) 28649;
        f19620d = (char) 53996;
        f19623g = new char[]{51643, 64604, 51641, 64593, 64618, 64579, 51645, 51638, 64577, 64638, 64584, 64580, 64559, 51644, 64594, 64605, 64620, 64586, 64517, 64578, 64576, 51639, 64582, 64629, 64588, 51642, 64612, 64619, 64543, 64523, 64630, 64598, 64522, 64611, 64590, 64632, 64625, 64587, 64597, 64585, 64599, 64589, 51640, 64592, 64591, 64595, 51646, 64634, 64614};
        f19624h = (char) 51640;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] d(android.content.Context r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 8737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.DateHelper.d(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e A[PHI: r3 r4 r5 r7
  0x003e: PHI (r3v4 java.util.Calendar) = (r3v2 java.util.Calendar), (r3v6 java.util.Calendar) binds: [B:11:0x00a0, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r4v3 java.util.Calendar) = (r4v0 java.util.Calendar), (r4v4 java.util.Calendar) binds: [B:11:0x00a0, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r5v2 java.util.Calendar) = (r5v0 java.util.Calendar), (r5v3 java.util.Calendar) binds: [B:11:0x00a0, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r7v2 java.util.Calendar) = (r7v0 java.util.Calendar), (r7v3 java.util.Calendar) binds: [B:11:0x00a0, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String formatToYesterdayOrToday(java.util.Date r13, java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.util.DateHelper.formatToYesterdayOrToday(java.util.Date, java.lang.String, java.lang.String):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 45;
    }

    static void init$1() {
        $$c = new byte[]{82, 42, -87, -21};
        $$d = 172;
    }

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str2.toCharArray();
            int i6 = $11 + 5;
            $10 = i6 % 128;
            obj = charArray;
            if (i6 % 2 != 0) {
                int i7 = 4 / 4;
                obj = charArray;
            }
        } else {
            obj = str2;
        }
        k kVar = new k();
        char[] cArrC = k.c(f19619c ^ (-5882309809461882246L), (char[]) obj, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i8 = $10 + 69;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19619c)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(229 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((-16726212) - Color.rgb(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 9, 1749983833, false, $$e(b2, (byte) ((b2 + 7) - (7 & b2)), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA2 = d.a(675 - Color.argb(0, 0, 0, 0), (char) View.resolveSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, 522683165, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
}
