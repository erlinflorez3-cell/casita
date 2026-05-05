package o.p002do;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.l;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23201a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23202b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23203c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f23204d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f23205e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f23206f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f23207g = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, byte r10) {
        /*
            int r7 = r10 * 3
            int r1 = r7 + 1
            int r6 = r8 + 69
            int r0 = r9 * 3
            int r5 = 4 - r0
            byte[] r4 = o.p002do.c.$$a
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L28
            r1 = r6
            r6 = r7
            r0 = r2
        L14:
            int r5 = r5 + 1
            int r6 = r6 + r1
            r1 = r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r1 = r4[r5]
            goto L14
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p002do.c.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23207g = 177362746;
        f23206f = 362420365;
        f23205e = new int[]{-790743016, 1354074674, -709803964, 867529077, 645952383, 776604999, -2134642418, 1612891705, 692964986, 755771300, 1375110161, 1073221410, -1713487286, -1804706164, -471279961, 1306613862, 1709031146, 802240134};
        f23204d = (char) 32167;
        f23203c = (char) 30254;
        f23202b = (char) 8601;
        f23201a = (char) 65151;
    }

    public static Object[] e(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = f23206f * (-2124723481);
            f23206f = i4;
            int i5 = ~((377363463 + i4) - (377363463 & i4));
            int i6 = 301041861 + (((i5 + 1055511485) - (i5 & 1055511485)) * (-366));
            int i7 = ~(i4 | 1056956351);
            int i8 = i3 + i6 + (((i7 + 375918597) - (i7 & 375918597)) * 366);
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >>> 17);
            return objArr;
        }
        int i11 = 20;
        try {
            Object[] objArr2 = new Object[1];
            h(new int[]{-1650187110, 1019142066, 1933809840, -478184369, 869913119, -1409114662, 1207144016, 2111529902, 70237746, 1985940346, -1195057674, 1991195502, -1087705346, 1893894282, 1099563266, -1629313522, 927574721, 619889670, -1671776231, 1424485509}, 39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            i("섵轏鶵푞셳♰\ude30ғ塏\u1a7d곔\uf28c웦뗲䯛尡䃧䓲鶵푞셳♰\ude30ғ塏\u1a7dᾦ\ue362ൄ勈붨স", 31 - Gravity.getAbsoluteGravity(0, 0), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                h(new int[]{-1650187110, 1019142066, 1933809840, -478184369, 869913119, -1409114662, 1207144016, 2111529902, 70237746, 1985940346, -1195057674, 1991195502, -1087705346, 1893894282, 1099563266, -1629313522, 927574721, 619889670, -1671776231, 1424485509}, 38 - View.MeasureSpec.getSize(0), objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                i("\u9949f\uf129ᚵ䃧䓲鶵푞셳♰\ude30ғ塏\u1a7dᾦ\ue362ﲎ뻐ꙁ퐷탷槗癤ꗰ룇✧ꖘ戱凤㱢﹎硼", 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    h(new int[]{-1650187110, 1019142066, 1933809840, -478184369, 869913119, -1409114662, 1207144016, 2111529902, 70237746, 1985940346, -1195057674, 1991195502, -1087705346, 1893894282, 1099563266, -1629313522, 927574721, 619889670, -1671776231, 1424485509}, Gravity.getAbsoluteGravity(0, 0) + 38, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        i("鑵\ue3bc탷槗癤ꗰ즁橱⭑剝ḻ앝䵾Ḷ໓\u17fb蘨哆ḻ앝굥鷫緩迦", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        i("ᔺ퀿눉\uf026䴍\uea87ᅨ蝃ᔺ퀿翻鋜苆✯ᔺ퀿㡆ϒ", TextUtils.indexOf("", "") + 17, objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            i("鑵\ue3bc탷槗癤ꗰ즁橱⭑剝ḻ앝䵾Ḷ໓\u17fb蘨哆ḻ앝굥鷫緩迦", TextUtils.lastIndexOf("", '0', 0) + 24, objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            h(new int[]{-885967397, -1631079560, 1314926265, 1081118661, 1056696407, 1101205488, -559066953, -469375282}, 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                h(new int[]{2032912798, -1220081298, -186639207, 1033051444, -773037253, 1277930034, -1663858775, -1289933529, -1770745993, 1868840730, 1314926265, 1081118661, -618339311, -258197899, -1081804873, -390471861, -254005508, 595308514}, 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                h(new int[]{-885967397, -1631079560, 1314926265, 1081118661, 2087883981, -357222843, 1660554672, 2117108575}, 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                i("鑵\ue3bc탷槗癤ꗰ즁橱⭑剝ḻ앝䵾Ḷ໓\u17fbԣ呯큰成䴍\uea87ᅨ蝃ᔺ퀿䉊ᮈ\ue399㛦", 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                h(new int[]{1599278467, -1660104589, -2064245211, -250642209, -669101027, 467954112}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i12 = 0;
                                while (i12 < length) {
                                    Object obj = objArr19[i12];
                                    Object[] objArr20 = new Object[1];
                                    h(new int[]{1680897841, -518408110, 1969976507, 1297197245}, KeyEvent.normalizeMetaState(0) + 5, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        int[] iArr = new int[i11];
                                        // fill-array-data instruction
                                        iArr[0] = -1650187110;
                                        iArr[1] = 1019142066;
                                        iArr[2] = -1907844704;
                                        iArr[3] = 1145318375;
                                        iArr[4] = -1686311122;
                                        iArr[5] = -1559591238;
                                        iArr[6] = -716186530;
                                        iArr[7] = -1715456701;
                                        iArr[8] = 561717529;
                                        iArr[9] = -364516395;
                                        iArr[10] = 402204837;
                                        iArr[11] = 240226275;
                                        iArr[12] = -1763486164;
                                        iArr[13] = -138412955;
                                        iArr[14] = 1503046493;
                                        iArr[15] = 1592963935;
                                        iArr[16] = 1595133346;
                                        iArr[17] = 1878464216;
                                        iArr[18] = -371800633;
                                        iArr[19] = 1152499108;
                                        Object[] objArr22 = new Object[1];
                                        h(iArr, (ViewConfiguration.getTapTimeout() >> 16) + 37, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        h(new int[]{603067259, -1020774450, 928363902, 1027587974, -169669870, 2126231250}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            i("鑵\ue3bc탷槗癤ꗰ즁橱⭑剝ḻ앝䵾Ḷ໓\u17fbԣ呯猘ݳ跸ࠕ苆✯鎞\ue7d5\uf356ૄ", 28 - KeyEvent.getDeadChar(0, 0), objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            i("멛ힱ딶腖鹖יִ敫捣ࢰ孳⠑ᆬ", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                int[] iArr2 = new int[i11];
                                                // fill-array-data instruction
                                                iArr2[0] = -1650187110;
                                                iArr2[1] = 1019142066;
                                                iArr2[2] = -1907844704;
                                                iArr2[3] = 1145318375;
                                                iArr2[4] = -1686311122;
                                                iArr2[5] = -1559591238;
                                                iArr2[6] = -716186530;
                                                iArr2[7] = -1715456701;
                                                iArr2[8] = 561717529;
                                                iArr2[9] = -364516395;
                                                iArr2[10] = 402204837;
                                                iArr2[11] = 240226275;
                                                iArr2[12] = -1763486164;
                                                iArr2[13] = -138412955;
                                                iArr2[14] = 1503046493;
                                                iArr2[15] = 1592963935;
                                                iArr2[16] = 1595133346;
                                                iArr2[17] = 1878464216;
                                                iArr2[18] = -371800633;
                                                iArr2[19] = 1152499108;
                                                Object[] objArr27 = new Object[1];
                                                h(iArr2, 36 - TextUtils.lastIndexOf("", '0'), objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                i("ᔺ퀿汣\ue092ࢰ孳鹖יִ\udbf1ܯ켂\uf656贄\ue76f嚜兙崁餟\uef9a氧", 18 - ExpandableListView.getPackedPositionChild(0L), objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                int i13 = 0;
                                                for (int i14 = 2; i13 < i14; i14 = 2) {
                                                    Object obj2 = objArr3[i13];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        i("⠚᪒륉睮㷛鏆\ue44b\u1afe窮엻叡\ue0bc\udf84鼃ᶪ䰟켂\uf656㧍搇\ude76垄姪笻멇䗧ꔭ뵞恀奮ಀ듀鹖יִ", 34 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        h(new int[]{-1984099105, 1706415486, 1567156232, 1666112399, -1232878789, 1411446577, -956945921, -1552439216, -1834847363, -224429494, 213346461, -1317076848}, Color.green(0) + 23, objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i15 = f23207g * (-1388789191);
                                                            f23207g = i15;
                                                            int i16 = i3 + 1178290950 + (((~((-1) - (((-1) - (-277725195)) & ((-1) - (~i15))))) | (-400422828)) * (-591)) + (((i15 - 277725195) - (i15 & (-277725195))) * 591) + 16;
                                                            int i17 = i16 ^ (i16 << 13);
                                                            int i18 = i17 ^ (i17 >>> 17);
                                                            return objArr31;
                                                        }
                                                        i13++;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i12++;
                                                i11 = 20;
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
        Object[] objArr32 = {new int[1], new int[]{i2}, null, new int[]{i2}};
        int iMyPid = Process.myPid();
        int i19 = ~iMyPid;
        int i20 = i3 + 2047007473 + (((-1) - (((-1) - (~(((-9831441) + i19) - ((-9831441) & i19)))) & ((-1) - 687979462))) * 220) + (((-1) - (((-1) - (~((-1) - (((-1) - i19) & ((-1) - (-83772474)))))) & ((-1) - 761920495))) * (-440)) + (((-1) - (((-1) - iMyPid) & ((-1) - (-9831441)))) * 220);
        int i21 = i20 ^ (i20 << 13);
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr32[0])[0] = i22 ^ (i22 << 5);
        return objArr32;
    }

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23205e;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 7;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objA = d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        objA = d.a(Gravity.getAbsoluteGravity(i6, i6) + 675, (char) ((-1) - TextUtils.indexOf("", c2)), Color.alpha(i6) + 12, -328001469, false, $$c((byte) ($$b & 124), b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i3++;
                    c2 = '0';
                    i5 = 989264422;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23205e;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i8 = 0; i8 < length3; i8++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(((byte) KeyEvent.getModifierMetaStateMask()) + 676, (char) TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -328001469, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 124))), b3, b3), new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i9 = $10 + 71;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                lVar.f19942e ^= iArr4[i11];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(301 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52697), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -1416256172, false, $$c((byte) ($$b & 122), b4, b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i11++;
            }
            int i13 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i13;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i14 = lVar.f19942e;
            int i15 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = d.a(228 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 51004), 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -330018025, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 120))), b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p002do.c.i(java.lang.String, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
        $$b = 183;
    }
}
