package o.en;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import o.a.n;

/* JADX INFO: loaded from: classes6.dex */
public class f extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f24204a = null;

    /* JADX INFO: renamed from: c */
    private static int f24205c = 0;

    /* JADX INFO: renamed from: d */
    private static long f24206d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24207e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24208f = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, byte r10) {
        /*
            int r0 = r9 * 4
            int r7 = 3 - r0
            byte[] r6 = o.en.f.$$a
            int r5 = r10 * 4
            int r0 = r5 + 1
            int r4 = 115 - r8
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r6 != 0) goto L28
            r1 = r4
            r4 = r5
            r0 = r2
        L14:
            int r4 = r4 + r1
            r1 = r0
        L16:
            byte r0 = (byte) r4
            int r7 = r7 + 1
            r3[r1] = r0
            int r0 = r1 + 1
            if (r1 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L25:
            r1 = r6[r7]
            goto L14
        L28:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.f.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24208f = -829960561;
        f24207e = -332388363;
        f24204a = new char[]{56602, 41295, 9658, 43019, 11376, 45192, 14135, 48007, 16355, 33355, 1710, 34067, 2412, 36303, 4218, 38035, 6373, 40762, 25476, 59300, 27216, 61171, 27988, 61746, 30094, 63494, 31945, 49322, 18184, 52102, 19974, 53883, 22238, 54541, 22885, 56794, 41001, 9354, 42339, 55600, 23969, 53371, 21558, 51346, 20326, 50141, 18361, 64010, 32428, 64878, 28973, 62852, 26737, 60613, 24812, 59217, 7041, 40859, 4630, 38642, 5446, 35133, 3481, 32874, 1152, 47241, 16213, 46035, 13943, 59214, 39790, 8164, 37444, 5721, 35476, 3332, 33246, 1427, 47143, 15571, 49000, 13068, 47023, 10757, 44748, 8867, 42254, 22992, 56729, 20529, 54473, 22390, 51990, 20409, 49667, 18117, 64130, 32039, 61918, 29806, 38037, 59593, 27706, 57784, 26091, 63815, 32429, 61953, 30309, 52185, 20243, 52377, 16628, 50261, 22961, 56597, 20832, 9789, 23148, 56964, 21300, 55115, 19427, 52236, 16608, 50383, 31101, 64926, 32290, 62033, 30452, 60172, 28656, 58316, 25615, 39150, 7414, 37221, 5513, 38435, 2639, 36587, 791, 34713, 15320, 48242, 12437, 38017, 59589, 27689, 57734, 26091, 63824, 32435, 61970, 30311, 52175, 59378, 39898, 7971, 37504, 5867, 43082, 54299, 20723, 56643, 22844, 50580, 17019, 52887, 19128, 63242, 29673, 61525, 31782, 63619, 25979, 57735, 28091, 60024, 5785, 37506, 7962, 39930, 6225, 33848, 143, 36208, 2517, 46500, 38022, 59587, 27660, 57745, 26110, 63809, 32391, 61970, 30320, 52189, 20263, 3840, 29532, 63413, 31256, 65133, 25296, 58663, 27024, 60884, 20556, 54457, 22297, 56166, 24519, 49706, 18054, 51942, 19757, 45470, 38037, 59593, 27706, 57787, 26111, 63814, 32428, 61957, 30305, 52168, 20230, 52429, 16554, 50180, 22918, 56578, 20859, 54946, 10765, 44641, 9178, 42789, 9354};
        f24206d = -4396634238645114708L;
        f24205c = -1270219406;
    }

    public f(String str) {
        super(str);
    }

    public static Object[] a(Context context, int i2, int i3) {
        Object obj = null;
        if (context == null) {
            Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
            int i4 = f24207e * (-1137799656);
            f24207e = i4;
            int i5 = (((~((-1) - (((-1) - (-382112914)) & ((-1) - i4)))) | 123975605) * 262) + 557297977;
            int i6 = ~i4;
            int i7 = i3 + i5 + (((~((i6 - 382112914) - (i6 & (-382112914)))) | 123975605) * 262);
            int i8 = i7 ^ (i7 << 13);
            int i9 = i8 ^ (i8 >>> 17);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            g((char) (KeyEvent.normalizeMetaState(0) + 18818), ExpandableListView.getPackedPositionChild(0L) + 1, 38 - TextUtils.indexOf("", "", 0), objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            char c2 = '0';
            Object[] objArr4 = new Object[1];
            g((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12755), 38 - (Process.myTid() >> 22), 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
            try {
                Object[] objArr5 = {((String) objArr4[0]).intern()};
                Object[] objArr6 = new Object[1];
                g((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 18818), ViewConfiguration.getKeyRepeatDelay() >> 16, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37, objArr6);
                objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                Object[] objArr7 = new Object[1];
                g((char) (29695 - TextUtils.getTrimmedLength("")), 69 - (ViewConfiguration.getFadingEdgeLength() >> 16), 31 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
                try {
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Object[] objArr9 = new Object[1];
                    g((char) (ExpandableListView.getPackedPositionGroup(0L) + 18818), TextUtils.getCapsMode("", 0, 0), 38 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
                    objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        Object[] objArr10 = new Object[1];
                        h(23 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t", false, 206 - View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, objArr10);
                        Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        g((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 100, View.getDefaultSize(0, 0) + 17, objArr11);
                        Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                        try {
                            Object[] objArr12 = new Object[1];
                            h(22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t", false, 206 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getEdgeSlop() >> 16), objArr12);
                            Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            h(View.MeasureSpec.getSize(0) + 14, "\u0002\u0004\u0002\u0011￭\ufffe\u0000\b\ufffe\u0004\u0002￫\ufffe\n", false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 204, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                h(34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0003\u0005\uffff\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012", true, 203 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                h(AndroidCharacter.getMirror('0') - '\"', "\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000b\u0002\n￥", true, 205 - View.MeasureSpec.getMode(0), 10 - KeyEvent.getDeadChar(0, 0), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                g((char) (45741 - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 116, 30 - View.getDefaultSize(0, 0), objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                g((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 147, 9 - ImageFormat.getBitsPerPixel(0), objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i10 = 0;
                                while (i10 < length) {
                                    Object obj2 = objArr19[i10];
                                    Object[] objArr20 = new Object[1];
                                    g((char) (Color.argb(0, 0, 0, 0) + 29528), 157 - TextUtils.indexOf("", ""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 5, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        h(37 - TextUtils.getOffsetAfter("", 0), "\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010", true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 205, Color.green(0) + 11, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        h(10 - TextUtils.lastIndexOf("", c2, 0, 0), "\u0007\ufffa\r\f\u0007￢\r\ufffe\u0000\ufffe￼", true, Color.blue(0) + 208, 8 - MotionEvent.axisFromString(""), objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(obj, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            g((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 15577), (Process.myPid() >> 22) + 162, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            Object[] objArr25 = new Object[1];
                                            g((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getTouchSlop() >> 8) + 190, 11 - TextUtils.indexOf("", ""), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj2, null))};
                                                Object[] objArr27 = new Object[1];
                                                h((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, "\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001\uffffￊ\u0015\u0010", true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 205, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                g((char) (Process.getGidForName("") + 39830), 201 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr3.length;
                                                for (int i11 = 0; i11 < 2; i11++) {
                                                    Object obj3 = objArr3[i11];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        h(33 - TextUtils.indexOf((CharSequence) "", '0'), "\u0015\u0013\u0006\u0004ￏ\u001a\u0015\n\u0013\u0016\u0004\u0006\u0014ￏ\u0002\u0017\u0002\u000b\u0006\u0015\u0002\u0004\n\u0007\n\u0015\u0013\u0006￤ￚ\uffd1ￖ\ufff9ￏ", true, View.getDefaultSize(0, 0) + 200, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        g((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 219, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, objArr30);
                                                        if (obj3.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                            int i12 = f24208f * (-1348188126);
                                                            f24208f = i12;
                                                            int i13 = ~i12;
                                                            int i14 = i3 + ((((-456006367) + (((~((-1) - (((-1) - 535527163) & ((-1) - i13)))) | 142620858) * (-828))) + (((i13 + 535527163) - (i13 & 535527163)) * (-828))) - 1034860288);
                                                            int i15 = i14 ^ (i14 << 13);
                                                            int i16 = i15 ^ (i15 >>> 17);
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
                                                i10++;
                                                obj = null;
                                                c2 = '0';
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
        Object[] objArr32 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
        int i17 = ~i2;
        int i18 = i3 + (-456006367) + (((~((-1) - (((-1) - (-2099275)) & ((-1) - i17)))) | 680247296) * (-828)) + (((-1) - (((-1) - i17) & ((-1) - (-2099275)))) * (-828)) + 1738198872;
        int i19 = i18 ^ (i18 << 13);
        int i20 = i19 ^ (i19 >>> 17);
        return objArr32;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.f.g(char, int, int, java.lang.Object[]):void");
    }

    private static void h(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i6 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f24205c)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(270 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int gidForName = Process.getGidForName("") + 523;
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11;
                    int i8 = $$b;
                    byte b4 = (byte) ((i8 + 3) - (i8 | 3));
                    byte b5 = (byte) (b4 - 2);
                    objA2 = o.d.d.a(gidForName, tapTimeout, i7, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i9 = $11 + 83;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $11 + 93;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[nVar.f19944a * i2];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        int trimmedLength = 522 - TextUtils.getTrimmedLength("");
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iRgb = (-16777204) - Color.rgb(0, 0, 0);
                        byte b6 = (byte) ($$b & 3);
                        byte b7 = (byte) (b6 - 2);
                        objA3 = o.d.d.a(trimmedLength, cResolveOpacity, iRgb, 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        int iLastIndexOf = 521 - TextUtils.lastIndexOf("", '0', 0, 0);
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int modifierMetaStateMask = 11 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b8 = (byte) ($$b & 3);
                        byte b9 = (byte) (b8 - 2);
                        objA4 = o.d.d.a(iLastIndexOf, cKeyCodeFromString, modifierMetaStateMask, 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{34, -117, -98, -86};
        $$b = 14;
    }
}
