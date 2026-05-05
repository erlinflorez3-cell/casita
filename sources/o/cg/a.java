package o.cg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.l;
import o.a.o;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22239a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22240b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f22241c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f22242e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22243g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f22244d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r9, int r10, short r11) {
        /*
            int r0 = r11 + 99
            byte[] r8 = o.cg.a.$$c
            int r1 = r9 * 3
            int r7 = 3 - r1
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2c
            r2 = r4
            r3 = r5
        L15:
            int r0 = -r0
            int r0 = r0 + r2
            r2 = r3
        L18:
            int r7 = r7 + 1
            byte r1 = (byte) r0
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r7]
            r2 = r0
            r0 = r1
            goto L15
        L2c:
            r2 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.a.$$e(byte, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f22239a = 0;
        f22243g = 1;
        f22240b = new char[]{33279, 2500, 37353, 6639, 41367, 10641, 45479, 14669, 49510, 18804, 53616, 22798, 57661, 26937, 61657, 30920, 228, 29603, 64417, 25492, 60318, 21472, 56313, 43127, 8319, 47222, 12366, 34877, '5', 38943, 4321, 31099, 61819, 26972, 57664, 22784, 53563, 18702, 49632, 14832, 45526, 10712, 41386, 6569, 37275, 2167, 32881, 63578, 28734, 59450, 24580, 55381, 20651, 51339, 16619, 47264, 12478, 43147, 9069, 39785, 4878, 35677, 811, 31517, 62298, 27622, 58366, 23500, 54210, 19378, 50061, 15261, 45675, 10861, 41565, 6697, 37502, 2572, 33286, 64185, 29400, 60106, 25262, 55995, 21135, 52581, 17787, 48397, 13586, 44340, 9475, 40212, 5630, 38040, 7296, 33954, 3242, 46278, 15491, 42227, 11282, 54281, 23596, 50238, 19530, 62562, 31868, 58838, 28046, 5559, 40389, 1484, 36277, 13814, 48456, 9568, 44407, 21780, 56689, 17705, 52931, 30422, 65157, 26298, 61142, 38652, 7906, 34333, 3611, 46655, 15905, 37979, 7239, 33912, 3185, 46105, 15372, 42028, 11409, 54465, 23806, 50410, 19615, 62651, 31907, 58692, 27913, 5449, 40214, 1282, 36135, 13603, 48589, 9708, 57435, 26698, 61550, 30805, 49169, 18432, 53285, 22744, 41155, 10482, 45263, 14476, 32950, 2218, 37201, 6468, 24958, 58011, 27271, 62136, 31409, 49881, 19148, 53996, 23121, 41473, 10814, 45610, 14943, 33403, 2659, 37764, 7113, 25530, 60372, 29570, 64451, 17383, 51990, 21299, 56110, 9045, 43844, 13145, 47258, 128, 35004, 4263, 39122, 57576, 43321, 8488, 47372, 12599, 35187, 354, 39239, 4538, 59809, 24976, 63913, 29153, 51676, 16838, 12679, 47502, 8629, 43427, 4569, 39391, 499, 35075, 28937, 63788, 63050, 32303, 58881, 28187, 54887, 5147, 39939, 1057, 35881, 13331, 48221, 9318, 44183, 21660, 56488, 17574, 52436, 29932, 64680, 25880, 60681, 38195, 7494, 34057, 3419, 46440, 15756, 42407, 11693, 54751, 24003, 50684, 19985, 62993, 32307, 58893, 28253, 5746, 40566, 1688, 36506, 13988, 38037, 7300, 33978, 3246, 46284, 15564, 42228, 11282, 54313, 23612, 50238, 19543, 62591, 31843, 58769, 28044, 5539, 40389, 1473};
        f22242e = 7105382611980590305L;
        f22241c = new int[]{-1962879341, -103744471, 1565586082, -193381146, -1117190877, -876446958, -1422567269, 891815324, 10063798, -1184119614, -2093769764, 445413214, -850741875, -543736818, -721481078, 166518750, -1859757698, -78464650};
    }

    public a(c cVar) {
        this(cVar, cVar.name());
    }

    public a(c cVar, String str) {
        super(str);
        this.f22244d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x03c1 A[Catch: all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0477, blocks: (B:3:0x0016, B:7:0x0056, B:9:0x007d, B:10:0x014f, B:12:0x01b1, B:20:0x020a, B:22:0x0279, B:21:0x023f, B:27:0x028d, B:32:0x030c, B:40:0x03c1, B:42:0x03e7, B:34:0x032d, B:38:0x0399, B:30:0x02cd), top: B:50:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r18, long r19, long r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.a.b(android.content.Context, long, long):void");
    }

    public static Object[] d(Context context, int i2, int i3) {
        if (context == null) {
            Object[] objArr = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int iMyUid = Process.myUid();
            int i4 = ~iMyUid;
            int i5 = ~(713491603 | i4);
            int i6 = ~((-1) - (((-1) - i4) & ((-1) - 715082975)));
            int i7 = ~((-1) - (((-1) - iMyUid) & ((-1) - (-1591373))));
            int i8 = i3 + 83441005 + (((-1) - (((-1) - (-715082976)) & ((-1) - i5))) * (-712)) + (((i7 + i6) - (i7 & i6)) * (-712)) + ((35343581 | i5) * IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT);
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            return objArr;
        }
        try {
            long j2 = 0;
            Object[] objArr2 = new Object[1];
            f((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 93, 38 - Color.green(0), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            Object[] objArr4 = new Object[1];
            h(new int[]{1743226246, -1033344955, -2001516418, 447465935, 1460798396, -1851685703, 2102826538, 1996513298, -806869890, -758287375, -2001516418, 447465935, 302791684, -1385127459, -1868927809, 1690284050}, 31 - Drawable.resolveOpacity(0, 0), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                f((char) Drawable.resolveOpacity(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 92, 38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                h(new int[]{128500313, -103076897, -806869890, -758287375, -2001516418, 447465935, 302791684, -1385127459, 972334285, 225752541, -474887665, -1071853996, 548330556, -1674010479, -251850793, -2133320509}, View.resolveSize(0, 0) + 31, objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    f((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 93, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 37, objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        f((char) (200 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 130, TextUtils.indexOf((CharSequence) "", '0', 0) + 24, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        int i11 = 8;
                        Object[] objArr11 = new Object[1];
                        f((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29902), 154 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            f((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 199), 131 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            h(new int[]{962390847, 1373537564, -357586988, 282048360, 834726775, -2090822440, 1403879973, 2112294295}, 14 - (Process.myPid() >> 22), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                f((char) (View.resolveSize(0, 0) + 30216), 170 - ExpandableListView.getPackedPositionChild(0L), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                f((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15787), 203 - ExpandableListView.getPackedPositionChild(0L), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                h(new int[]{-1642640121, 42522316, -1904206908, 873463139, 730422940, -1783662157, 749167838, 2034194482, -78589655, 1351189657, -357586988, 282048360, -460129334, -1251280910, 332323092, 1106613160}, (ViewConfiguration.getEdgeSlop() >> 16) + 30, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                f((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42245), 218 - (ViewConfiguration.getEdgeSlop() >> 16), 10 - ExpandableListView.getPackedPositionType(0L), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i12 = 0;
                                while (i12 < length) {
                                    Object obj = objArr19[i12];
                                    Object[] objArr20 = new Object[1];
                                    f((char) (25313 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), 229 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 5, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        f((char) (32899 - KeyEvent.keyCodeFromString("")), 233 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> i11) + 37, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        h(new int[]{-975230624, -80209104, 1593993837, 1305641671, 719781819, -693030876}, 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            h(new int[]{-1642640121, 42522316, -1904206908, 873463139, 730422940, -1783662157, 749167838, 2034194482, 965433029, -1055923197, 219324003, -268685459, -691267410, 498860954}, View.MeasureSpec.makeMeasureSpec(0, 0) + 28, objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            h(new int[]{-941632094, -1826321390, 1716278381, -2043501776, 2108350894, -115540872}, 11 - View.getDefaultSize(0, 0), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                f((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 32899), Color.blue(0) + 233, 37 - TextUtils.getCapsMode("", 0, 0), objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                f((char) View.getDefaultSize(0, 0), 269 - TextUtils.lastIndexOf("", '0'), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i13 = 0; i13 < 2; i13++) {
                                                    Object obj2 = objArr3[i13];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        h(new int[]{-590290259, -279816595, 1610168448, 22719191, -942007156, 464993280, 35110864, -1049498211, -1454828250, 2068523084, 1464170884, -807726480, -1304355377, -2122874985, -2134507900, 722737776, -1547941673, -2052959344}, 34 - Color.green(0), objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        h(new int[]{-446663909, -2145129131, -421867754, 2113407278, -1243750219, -578957292, 1720359109, 123962659, -568157826, 2131291580, 1095472990, -539469988}, 23 - View.combineMeasuredStates(0, 0), objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i14 = (int) Runtime.getRuntime().totalMemory();
                                                            int i15 = ~i14;
                                                            int i16 = i3 + (-1055121635) + (((-1) - (((-1) - (~((205981864 + i15) - (205981864 & i15)))) & ((-1) - 270575365))) * 184) + (((i14 + 4391072) - (i14 & 4391072)) * (-184)) + ((~((-472166158) | i15)) * 184) + 16;
                                                            int i17 = i16 ^ (i16 << 13);
                                                            int i18 = i17 ^ (i17 >>> 17);
                                                            ((int[]) objArr31[0])[0] = i18 ^ (i18 << 5);
                                                            return objArr31;
                                                        }
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                i12++;
                                                j2 = 0;
                                                i11 = 8;
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
        int iMyUid2 = Process.myUid();
        int i19 = ~iMyUid2;
        int i20 = (-1) - (((-1) - ((~(((-49693250) + i19) - ((-49693250) & i19))) | 42074625)) & ((-1) - (~((628454772 + i19) - (628454772 & i19)))));
        int i21 = (-1488734165) + (((~((-1) - (((-1) - iMyUid2) & ((-1) - (-620836149))))) | i20) * 590) + (i20 * (-1180));
        int i22 = ~((-1) - (((-1) - (-628454773)) & ((-1) - i19)));
        int i23 = ~((i19 + 49693249) - (i19 & 49693249));
        int i24 = i3 + i21 + (((i22 + i23) - (i22 & i23)) * 590);
        int i25 = i24 ^ (i24 << 13);
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr32[0])[0] = i26 ^ (i26 << 5);
        return objArr32;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f22240b[i2 >> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 743, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22242e), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 767, (char) (12470 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.indexOf("", "", 0) + 12, 1946853218, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 18, 39570797, false, $$e(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f22240b[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(741 - ExpandableListView.getPackedPositionChild(0L), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.getDefaultSize(0, 0) + 12, 632508977, false, $$e(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f22242e), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(766 - TextUtils.getOffsetAfter("", 0), (char) (12470 - Color.blue(0)), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1946853218, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 387, (char) Color.alpha(0), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 39570797, false, $$e(b12, b13, (byte) ((b13 + 6) - (6 & b13))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i9 = $11 + 79;
        $10 = i9 % 128;
        int i10 = 2;
        if (i9 % 2 != 0) {
            int i11 = 2 / 5;
        }
        while (oVar.f19947b < i3) {
            int i12 = $11 + 115;
            $10 = i12 % 128;
            if (i12 % i10 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = new Object[i10];
                objArr8[1] = oVar;
                objArr8[0] = oVar;
                Object objA7 = o.d.d.a(-723636472);
                if (objA7 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    objA7 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 387, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 19, 39570797, false, $$e(b14, b15, (byte) ((-1) - (((-1) - b15) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objA7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr9 = {oVar, oVar};
            Object objA8 = o.d.d.a(-723636472);
            if (objA8 == null) {
                int iRgb = Color.rgb(0, 0, 0) + 16777603;
                char cMyTid = (char) (Process.myTid() >> 22);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 18;
                byte b16 = (byte) 0;
                byte b17 = b16;
                String str$$e = $$e(b16, b17, (byte) (6 | b17));
                i10 = 2;
                objA8 = o.d.d.a(iRgb, cMyTid, touchSlop, 39570797, false, str$$e, new Class[]{Object.class, Object.class});
            } else {
                i10 = 2;
            }
            ((Method) objA8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22241c;
        int i4 = 989264422;
        float f2 = 0.0f;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = o.d.d.a(675 - (TypedValue.complexToFloat(i5) > f2 ? 1 : (TypedValue.complexToFloat(i5) == f2 ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0') + 13, -328001469, false, $$e(b2, b3, (byte) ((b3 + Ascii.SYN) - (b3 & Ascii.SYN))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 989264422;
                    f2 = 0.0f;
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
        int[] iArr5 = f22241c;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(View.MeasureSpec.getSize(0) + 675, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0) + 12, -328001469, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 22)))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i7])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(676 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 12 - (ViewConfiguration.getScrollBarSize() >> 8), -328001469, false, $$e(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 22)))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i7++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i9 = $10 + 83;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i11 = $10 + 19;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 / 4;
            }
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = $11 + 85;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 301, (char) (52697 - (Process.myTid() >> 22)), 11 - KeyEvent.normalizeMetaState(0), -1416256172, false, $$e(b8, b9, (byte) (20 | b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
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
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a(229 - (ViewConfiguration.getTouchSlop() >> 8), (char) (51004 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 9 - KeyEvent.normalizeMetaState(0), -330018025, false, $$e(b10, b11, (byte) ((-1) - (((-1) - b11) & ((-1) - 18)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r6 = r9 * 5
            int r1 = r6 + 1
            int r0 = r7 * 5
            int r5 = 9 - r0
            byte[] r4 = o.cg.a.$$a
            int r0 = r8 * 2
            int r0 = 115 - r0
            byte[] r3 = new byte[r1]
            r2 = -1
            if (r4 != 0) goto L2e
            r1 = r5
            r0 = r6
        L15:
            int r0 = -r0
            int r5 = r5 + r0
            int r5 = r5 + (-5)
            int r1 = r1 + 1
        L1b:
            int r2 = r2 + 1
            byte r0 = (byte) r5
            r3[r2] = r0
            if (r2 != r6) goto L2b
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            r10[r0] = r1
            return
        L2b:
            r0 = r4[r1]
            goto L15
        L2e:
            r1 = r5
            r5 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.a.i(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{76, -80, -89, 46, 60, MessagePack.Code.EXT8, -19, Base64.padSymbol, MessagePack.Code.BIN8};
        $$b = 113;
    }

    static void init$1() {
        $$c = new byte[]{60, 66, -100, 104};
        $$d = 242;
    }

    public final c c() {
        int i2 = 2 % 2;
        int i3 = f22243g;
        int i4 = i3 + 13;
        f22239a = i4 % 128;
        int i5 = i4 % 2;
        c cVar = this.f22244d;
        int i6 = i3 + 89;
        f22239a = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }
}
