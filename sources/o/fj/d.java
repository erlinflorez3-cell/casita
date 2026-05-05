package o.fj;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Objects;
import o.a.l;
import o.a.n;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f25931c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25932e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25933f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25934g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25935h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25937b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25938d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, int r10, int r11) {
        /*
            byte[] r8 = o.fj.d.$$a
            int r2 = r10 * 2
            int r1 = 1 - r2
            int r0 = r11 * 3
            int r7 = 4 - r0
            int r0 = r9 * 2
            int r6 = 121 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2e
            r6 = r3
            r2 = r7
            r1 = r4
        L18:
            int r0 = -r7
            int r6 = r6 + r0
            int r7 = r2 + 1
        L1c:
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            int r1 = r1 + 1
            r0 = r8[r7]
            r2 = r7
            r7 = r0
            goto L18
        L2e:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fj.d.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25934g = 1532812721;
        f25935h = 0;
        f25933f = 1;
        f25931c = new int[]{-130149696, -2071109600, 99574581, -658768938, 1465602416, 1796795500, 1708225861, 935522386, 1515622325, -945492194, 1600987554, -587147536, 1967631908, 315840402, 1223565406, 677519278, 2074809590, -826824189};
        f25932e = -1270219431;
    }

    public d(String str, String str2, a aVar) {
        this.f25936a = str;
        this.f25938d = str2;
        this.f25937b = aVar;
    }

    public static Object[] a(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = ~i2;
            int i5 = i3 + 239234372 + (((1065013716 + i4) - (1065013716 & i4)) * (-757)) + ((~(1065343966 | i2)) * 1514) + (((-1) - (((-1) - (~(i2 | (-330251)))) & ((-1) - ((~(i4 | 386865694)) | 678478272)))) * 757);
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >>> 17);
            return objArr;
        }
        try {
            int i8 = 16;
            Object[] objArr2 = new Object[1];
            i(new int[]{-1141311656, 2022357467, 1413956548, 1399941560, -8360045, -92037282, -194246545, -666130428, -63727289, 2078184724, 946261746, 776170856, -837469297, -1907206311, 1418503526, -561629610, -1116318679, 1813655603, -1892462464, 1015860312}, 38 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            j((ViewConfiguration.getLongPressTimeout() >> 16) + 31, "￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9￨", false, KeyEvent.keyCodeFromString("") + 151, 27 - MotionEvent.axisFromString(""), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                i(new int[]{-1141311656, 2022357467, 1413956548, 1399941560, -8360045, -92037282, -194246545, -666130428, -63727289, 2078184724, 946261746, 776170856, -837469297, -1907206311, 1418503526, -561629610, -1116318679, 1813655603, -1892462464, 1015860312}, 38 - (Process.myPid() >> 22), objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                i(new int[]{1370495736, -506772789, -695549700, -683972084, -265109934, -1557277194, -981741296, 2030230662, 546137213, -505079469, 1937885709, 2006297128, 1378941989, -1579920629, 1829581145, 102974050}, 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    i(new int[]{-1141311656, 2022357467, 1413956548, 1399941560, -8360045, -92037282, -194246545, -666130428, -63727289, 2078184724, 946261746, 776170856, -837469297, -1907206311, 1418503526, -561629610, -1116318679, 1813655603, -1892462464, 1015860312}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        i(new int[]{-729732386, 2029525960, -1666902479, 1993272442, -1986236919, 695578, 1328067608, -1899609930, 236384059, -1482815200, -131284295, 1213135225}, 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        j((ViewConfiguration.getPressedStateDuration() >> 16) + 17, "\u0001\u000e\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￩�\n�\u0003", false, Color.blue(0) + 166, TextUtils.lastIndexOf("", '0', 0, 0) + 3, objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            i(new int[]{-729732386, 2029525960, -1666902479, 1993272442, -1986236919, 695578, 1328067608, -1899609930, 236384059, -1482815200, -131284295, 1213135225}, View.resolveSize(0, 0) + 23, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            j((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, "\ufffe￫\u0002\u0004\ufffe\b\u0000\ufffe￭\u0011\u0002\u0004\u0002\n", true, View.combineMeasuredStates(0, 0) + 165, (ViewConfiguration.getEdgeSlop() >> 16) + 12, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                i(new int[]{-729732386, 2029525960, -1666902479, 1993272442, -1986236919, 695578, 1328067608, -1899609930, -2109632572, -1667966428, 118680405, 1542796553, -449880424, 712679477, 2091461266, 1787305282, 206783274, -1635423353}, (ViewConfiguration.getTapTimeout() >> 16) + 33, objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                i(new int[]{-2054038480, 672448987, 118680405, 1542796553, -1932431565, 1853486216, -1588029555, 1963733415}, 14 - TextUtils.getOffsetAfter("", 0), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                i(new int[]{-729732386, 2029525960, -1666902479, 1993272442, -1986236919, 695578, 1328067608, -1899609930, -2109632572, -1667966428, 118680405, 1542796553, -1932431565, 1853486216, -1588029555, 1963733415}, (ViewConfiguration.getPressedStateDuration() >> 16) + 30, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                i(new int[]{-1781398930, -100705786, -1742096203, -1145304884, -1263711777, -1286449802}, 10 - TextUtils.getOffsetBefore("", 0), objArr18);
                                for (Object obj : (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2)) {
                                    Object[] objArr19 = new Object[1];
                                    j((ViewConfiguration.getEdgeSlop() >> i8) + 5, "\ufffb\ufff6\uffff\u001e\ufff4", false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 123, 3 - (ViewConfiguration.getFadingEdgeLength() >> i8), objArr19);
                                    try {
                                        Object[] objArr20 = {((String) objArr19[0]).intern()};
                                        Object[] objArr21 = new Object[1];
                                        j(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf", false, 167 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 17, objArr21);
                                        Class<?> cls5 = Class.forName(((String) objArr21[0]).intern());
                                        Object[] objArr22 = new Object[1];
                                        j(11 - View.combineMeasuredStates(0, 0), "\u0000\ufffe\r￢\u0007\f\r\ufffa\u0007￼\ufffe", false, View.MeasureSpec.makeMeasureSpec(0, 0) + 169, KeyEvent.keyCodeFromString("") + 11, objArr22);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr22[0]).intern(), String.class).invoke(null, objArr20);
                                        try {
                                            Object[] objArr23 = new Object[1];
                                            i(new int[]{-729732386, 2029525960, -1666902479, 1993272442, -1986236919, 695578, 1328067608, -1899609930, -1436739479, 1521895257, 1601176267, -610238934, 341924796, 1023817481}, 28 - ExpandableListView.getPackedPositionGroup(0L), objArr23);
                                            Class<?> cls6 = Class.forName(((String) objArr23[0]).intern());
                                            Object[] objArr24 = new Object[1];
                                            i(new int[]{1869277873, 2050250330, -1381356513, 999617767, 1189067916, 2073137490}, 11 - (ViewConfiguration.getScrollBarFadeDuration() >> i8), objArr24);
                                            try {
                                                Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr24[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr26 = new Object[1];
                                                j(TextUtils.lastIndexOf("", '0') + 38, "\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf", false, 165 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0) + 18, objArr26);
                                                Class<?> cls7 = Class.forName(((String) objArr26[0]).intern());
                                                Object[] objArr27 = new Object[1];
                                                i(new int[]{-314379451, 68650444, -1155103387, -1721496138, -1323253083, -676982464, 101051333, 1322883682, -71660474, -1307747740}, 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr27);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr27[0]).intern(), InputStream.class).invoke(objInvoke3, objArr25);
                                                int length = objArr3.length;
                                                for (int i9 = 0; i9 < 2; i9++) {
                                                    Object obj2 = objArr3[i9];
                                                    try {
                                                        Object[] objArr28 = new Object[1];
                                                        j(MotionEvent.axisFromString("") + 35, "\n\u0013\u0016\u0004\u0006\u0014ￏ\u0002\u0017\u0002\u000b\u0006\u0015\u0002\u0004\n\u0007\n\u0015\u0013\u0006￤ￚ\uffd1ￖ\ufff9ￏ\u0015\u0013\u0006\u0004ￏ\u001a\u0015", true, 161 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - KeyEvent.keyCodeFromString(""), objArr28);
                                                        Class<?> cls8 = Class.forName(((String) objArr28[0]).intern());
                                                        Object[] objArr29 = new Object[1];
                                                        j(24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\uffd1ￖ\ufff9\u0015\u0004\u0006\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1", true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 160, 13 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr29);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr29[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr30 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                            int i10 = ~iMaxMemory;
                                                            int i11 = ~((-1) - (((-1) - 765187124) & ((-1) - iMaxMemory)));
                                                            int i12 = i3 + 681548603 + (((i10 + 682346570) - (i10 & 682346570)) * 1444) + (((-1) - (((-1) - (~((iMaxMemory - 87039103) - (iMaxMemory & (-87039103))))) & ((-1) - ((i11 + 2099274) - (i11 & 2099274))))) * (-1444)) + 1267014794;
                                                            int i13 = i12 ^ (i12 << 13);
                                                            int i14 = i13 ^ (i13 >>> 17);
                                                            ((int[]) objArr30[0])[0] = i14 ^ (i14 << 5);
                                                            return objArr30;
                                                        }
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i8 = 16;
                                            } catch (Throwable th2) {
                                                Throwable cause2 = th2.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                Throwable cause5 = th5.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            Throwable cause6 = th6.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        Throwable cause7 = th7.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th7;
                    }
                } catch (Throwable th8) {
                    Throwable cause8 = th8.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th8;
                }
            } catch (Throwable th9) {
                Throwable cause9 = th9.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th9;
            }
        } catch (Throwable unused) {
        }
        Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
        int i15 = f25934g * 266066349;
        f25934g = i15;
        int i16 = ~((-1) - (((-1) - 972902015) & ((-1) - i15)));
        int i17 = i3 + 1376839281 + ((273745417 | i16) * (-476)) + (i16 * 952) + ((~((~i15) | 972902015)) * 476);
        int i18 = i17 ^ (i17 << 13);
        int i19 = i18 ^ (i18 >>> 17);
        return objArr31;
    }

    private static void i(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f25931c;
        int i5 = 989264422;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 53;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 107;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objA = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0', i6), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 11 - TextUtils.indexOf((CharSequence) "", '0', i6, i6), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(675 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 12, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i3 = 2;
                i5 = 989264422;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f25931c;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i11 = 0; i11 < length3; i11++) {
                int i12 = $10 + 81;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(675 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "") + 12, -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c2] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i14 = $10 + 81;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 / 4;
            }
            for (int i16 = 0; i16 < 16; i16++) {
                lVar.f19942e ^= iArr4[i16];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(301 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (52697 - (ViewConfiguration.getTouchSlop() >> 8)), 11 - View.resolveSize(0, 0), -1416256172, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
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
                int i20 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 228;
                char cArgb = (char) (51004 - Color.argb(0, 0, 0, 0));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 9;
                byte b10 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 11)));
                byte b11 = (byte) (b10 - 2);
                objA5 = o.d.d.a(i20, cArgb, windowTouchSlop, -330018025, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -10, MessagePack.Code.FIXEXT8, 7};
        $$b = 246;
    }

    private static void j(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i6 = $11 + 87;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (nVar.f19944a < i2) {
            int i8 = $11 + 103;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f25932e)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 3;
                    byte b3 = (byte) (b2 - 3);
                    objA = o.d.d.a(270 - View.MeasureSpec.getSize(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int iNormalizeMetaState = 522 - KeyEvent.normalizeMetaState(0);
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int deadChar = 12 - KeyEvent.getDeadChar(0, 0);
                    byte length = (byte) $$a.length;
                    byte b4 = (byte) (length - 4);
                    objA2 = o.d.d.a(iNormalizeMetaState, cMyPid, deadChar, 627984172, false, $$c(length, b4, b4), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i11 = $10 + 83;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i13 = $10 + 97;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 522;
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 12;
                    byte length2 = (byte) $$a.length;
                    byte b5 = (byte) (length2 - 4);
                    objA3 = o.d.d.a(longPressTimeout, mode, maxKeyCode, 627984172, false, $$c(length2, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final a a() {
        int i2 = 2 % 2;
        int i3 = f25933f + 89;
        f25935h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f25937b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f25935h + 125;
        f25933f = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f25938d;
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        return str;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f25933f + 49;
        int i4 = i3 % 128;
        f25935h = i4;
        int i5 = i3 % 2;
        String str = this.f25936a;
        int i6 = i4 + 85;
        f25933f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f25935h + 47;
            f25933f = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            return this.f25936a.equals(dVar.f25936a) && Objects.equals(this.f25938d, dVar.f25938d) && this.f25937b == dVar.f25937b;
        }
        int i5 = f25933f + 109;
        f25935h = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f25933f + 67;
        f25935h = i3 % 128;
        int i4 = i3 % 2;
        int iHash = Objects.hash(this.f25936a, this.f25938d, this.f25937b);
        int i5 = f25935h + 105;
        f25933f = i5 % 128;
        if (i5 % 2 != 0) {
            return iHash;
        }
        throw null;
    }
}
