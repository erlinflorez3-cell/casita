package o.ap;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.k;
import o.a.l;
import o.a.n;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements o.ap.b<b, C0332e> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f20467a = 0;

    /* JADX INFO: renamed from: b */
    private static int f20468b = 0;

    /* JADX INFO: renamed from: d */
    private static int[] f20469d = null;

    /* JADX INFO: renamed from: e */
    private static long f20470e = 0;

    /* JADX INFO: renamed from: f */
    private static int f20471f = 0;

    /* JADX INFO: renamed from: i */
    private static int f20472i = 0;

    /* JADX INFO: renamed from: c */
    private final b f20473c;

    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f20474a = 0;

        /* JADX INFO: renamed from: b */
        private static boolean f20475b = false;

        /* JADX INFO: renamed from: c */
        private static int f20476c = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f20477d = null;

        /* JADX INFO: renamed from: e */
        private static boolean f20478e = false;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, int r10, int r11) {
            /*
                int r0 = r10 * 3
                int r8 = 4 - r0
                byte[] r7 = o.ap.e.b.$$a
                int r0 = r9 * 4
                int r6 = 1 - r0
                int r0 = r11 * 2
                int r0 = 115 - r0
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r7 != 0) goto L2b
                r0 = r6
                r3 = r8
                r2 = r4
            L16:
                int r0 = -r0
                int r8 = r8 + r0
                int r3 = r3 + 1
                r1 = r2
            L1b:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r2 != r6) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L28:
                r0 = r7[r3]
                goto L16
            L2b:
                r1 = r4
                r3 = r8
                r8 = r0
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.e.b.$$c(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20474a = -1270219434;
            f20477d = new char[]{2317, 2307, 2555, 2557, 2322, 2545, 2319, 2512, 2538, 2524, 2513, 2519, 2544, 2350, 2314, 2539, 2540, 2523, 2537, 2522, 2558, 2543, 2541, 2517, 2515, 2525, 2516, 2520, 2320, 2503, 2536, 2312, 2551, 2316, 2534, 2331, 2334, 2526, 2514};
            f20476c = 2040400206;
            f20475b = true;
            f20478e = true;
        }

        public static Object[] c(Context context, int i2, int i3) {
            if (context == null) {
                Object[] objArr = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2}};
                int i4 = ~i2;
                int i5 = i3 + (-517815144) + (((~((-1) - (((-1) - (-214787745)) & ((-1) - i4)))) | (-463360278)) * (-983)) + (((-1) - (((-1) - (~((-1) - (((-1) - i4) & ((-1) - (-463360278)))))) & ((-1) - 319951125))) * 983);
                int i6 = i5 ^ (i5 << 13);
                int i7 = i6 ^ (i6 >>> 17);
                return objArr;
            }
            try {
                Object[] objArr2 = new Object[1];
                f(38 - TextUtils.getOffsetAfter("", 0), "ￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001e", false, 168 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getMode(0) + 24, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                long j2 = 0;
                Object[] objArr4 = new Object[1];
                f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, "￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9", false, Color.green(0) + 162, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    f(38 - KeyEvent.normalizeMetaState(0), "ￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001e", false, 167 - Process.getGidForName(""), 24 - Color.green(0), objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    g(((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, null, "\u0093\u0092\u0091\u0090\u008f\u008e\u0089\u008c\u008b\u008a\u0089\u0088\u0087\u0082\u008d\u0081\u0085\u0089\u008c\u008b\u008a\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38, "ￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001e", false, Color.blue(0) + 168, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            Object[] objArr10 = new Object[1];
                            f((Process.myTid() >> 22) + 23, "\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013", false, 178 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            f((ViewConfiguration.getTouchSlop() >> 8) + 17, "\u0001\u0010￬�\uffff\u0007�\u0003\u0001￩�\n�\u0003\u0001\u000e\u0003", false, 177 - Drawable.resolveOpacity(0, 0), 15 - TextUtils.lastIndexOf("", '0', 0, 0), objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                f((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22, "\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013", false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 177, 1 - (Process.myTid() >> 22), objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                g(ExpandableListView.getPackedPositionType(0L) + 127, null, null, "\u0090\u0099\u0096\u008d\u0090\u0093\u0096\u0098\u0097\u0096\u0095\u0094\u0090\u0093", objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    f(32 - ((byte) KeyEvent.getModifierMetaStateMask()), "ￌ\u000e\u000bￌ￮\uffff\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012", false, 175 - ExpandableListView.getPackedPositionType(0L), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    f(TextUtils.getCapsMode("", 0, 0) + 14, "\uffff�￬\u0010\u0001\u0003\u000b\u0002\n￥\u0001\u0003�\u0007", true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 177, 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    f(30 - TextUtils.getOffsetBefore("", 0), "\n\u0002\u0000\uffefￍ\f\u000fￍ\u0013\r\u0004\u0013\r\u000e\u0002ￍ\u0003\b\u000e\u0011\u0003\r\u0000\u000e\u0005\r￨\u0004\u0006\u0000", true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 173, TextUtils.indexOf("", "") + 23, objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    g(ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, "\u009a\u0090\u008a\u0092\u0094\u0096\u0088\u0093\u008c\u009a", objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i8 = 0;
                                    while (i8 < length) {
                                        Object obj = objArr19[i8];
                                        Object[] objArr20 = new Object[1];
                                        f(TextUtils.getOffsetBefore("", 0) + 5, "\uffff\ufff6\ufffb\ufff4\u001e", true, 135 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 5, objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[0]).intern()};
                                            Object[] objArr22 = new Object[1];
                                            g(127 - ExpandableListView.getPackedPositionType(j2), null, null, "\u009e\u008a\u008b\u0094\u0097\u0096 \u0090\u0094\u0096\u0097\u008c\u009f\u008c\u0094\u008a\u0090\u0081\u009d\u0094\u008a\u0090\u0097\u009d\u009e\u0094\u008c\u008a\u0092\u0097\u0090\u009a\u009d\u0096\u009c\u0096\u009b", objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                            Object[] objArr23 = new Object[1];
                                            g(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u0090\u0097\u0088\u0096\u0094\u009a\u0088¡\u0094\u0090\u0093", objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[1];
                                                f((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, "ￊ\t\fￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005\u000b\u000e\u0000\n�\u0001\u000e\u0011\u0010�\n\u0003\u0005\uffef", true, TextUtils.indexOf("", "", 0, 0) + 177, 19 - KeyEvent.keyCodeFromString(""), objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                                Object[] objArr25 = new Object[1];
                                                g(ImageFormat.getBitsPerPixel(0) + 128, null, null, "\u009e\u0096\u008a\u008a\u0087\u0090\u0094\u009e¢\u008b\u0094", objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                    Object[] objArr27 = new Object[1];
                                                    g(127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u009e\u008a\u008b\u0094\u0097\u0096 \u0090\u0094\u0096\u0097\u008c\u009f\u008c\u0094\u008a\u0090\u0081\u009d\u0094\u008a\u0090\u0097\u009d\u009e\u0094\u008c\u008a\u0092\u0097\u0090\u009a\u009d\u0096\u009c\u0096\u009b", objArr27);
                                                    Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                    Object[] objArr28 = new Object[1];
                                                    g(127 - KeyEvent.normalizeMetaState(0), null, null, "\u0090\u0094\u0096\u0097\u008c\u009f\u008c\u0094\u008a\u0090\u0081\u0090\u0094\u0096\u008a\u0090\u0088\u0090\u0093", objArr28);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    for (int i9 = 0; i9 < 2; i9++) {
                                                        Object obj2 = objArr3[i9];
                                                        try {
                                                            Object[] objArr29 = new Object[1];
                                                            f((ViewConfiguration.getDoubleTapTimeout() >> 16) + 34, "\u0015ￏ\ufff9ￖ\uffd1ￚ￤\u0006\u0013\u0015\n\u0007\n\u0004\u0002\u0015\u0006\u000b\u0002\u0017\u0002ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001aￏ\u0004\u0006\u0013", false, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 173, ImageFormat.getBitsPerPixel(0) + 18, objArr29);
                                                            Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[1];
                                                            g((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "§\u0096¦\u008c\u0097\u0088\u008c\u008a\u0095¥¥¤£\u0094\u0097\u0090\u009b\u0091\u0092\u0084\u0094\u0090\u0093", objArr30);
                                                            if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[]{i ^ (i << 5)}, new int[]{i2}, null, new int[]{i2 ^ 1}};
                                                                int i10 = ~i2;
                                                                int i11 = (~((-1) - (((-1) - (-624809235)) & ((-1) - i10)))) | 19775490;
                                                                int i12 = ~(((-53338788) + i10) - ((-53338788) & i10));
                                                                int i13 = (-680832691) + (((i11 + i12) - (i11 & i12)) * (-1136)) + (((-1) - (((-1) - ((~(((-624809235) + i2) - ((-624809235) & i2))) | (~((-53338788) | i2)))) & ((-1) - (~(658372531 | i10))))) * (-568));
                                                                int i14 = ~((-1) - (((-1) - 624809234) & ((-1) - i10)));
                                                                int i15 = ~((i10 + 53338787) - (i10 & 53338787));
                                                                int i16 = i3 + i13 + ((((i15 + i14) - (i15 & i14)) | (~((-19775491) | i2))) * 568) + 16;
                                                                int i17 = i16 ^ (i16 << 13);
                                                                int i18 = i17 ^ (i17 >>> 17);
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
                                                    i8++;
                                                    j2 = 0;
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
            int i19 = ~i2;
            int i20 = 1290857022 + (((-1) - (((-1) - 277068349) & ((-1) - i19))) * (-757)) + ((~((-1) - (((-1) - (-124011841)) & ((-1) - i2)))) * 1514);
            int i21 = (-1) - (((-1) - (~((-1) - (((-1) - i19) & ((-1) - (-401079673)))))) & ((-1) - 277067832));
            int i22 = ~(i2 | 401080189);
            int i23 = i3 + i20 + (((i22 + i21) - (i22 & i21)) * 757);
            int i24 = i23 ^ (i23 << 13);
            int i25 = i24 ^ (i24 >>> 17);
            return objArr32;
        }

        private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
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
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f20474a)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(269 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 11 - View.resolveSize(0, 0), -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.getOffsetBefore("", 0) + 522, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 11 - MotionEvent.axisFromString(""), 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i9 = $10 + 99;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[nVar.f19944a] = cArr2[nVar.f19944a * i2];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 522, (char) TextUtils.indexOf("", ""), View.combineMeasuredStates(0, 0) + 12, 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } else {
                        cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                        Object[] objArr5 = {nVar, nVar};
                        Object objA4 = o.d.d.a(-202660535);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(523 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, 627984172, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                }
                int i10 = $11 + 23;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static void g(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            o.a.f fVar = new o.a.f();
            char[] cArr3 = f20477d;
            char c2 = '0';
            int i4 = 0;
            if (cArr3 != null) {
                int i5 = $11 + 57;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf("", c2) + 13182), 11 - TextUtils.getCapsMode("", i4, i4), -1225586509, false, $$c(b2, b3, (byte) (24 | b3)), new Class[]{Integer.TYPE});
                        }
                        cArr[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i6++;
                        c2 = '0';
                        i4 = 0;
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
            Object[] objArr3 = {Integer.valueOf(f20476c)};
            Object objA2 = o.d.d.a(-1503702982);
            float f2 = 0.0f;
            if (objA2 == null) {
                objA2 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f20478e) {
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a(458 - KeyEvent.normalizeMetaState(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + 11, -1923924106, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 21)))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i9 = $11 + 1;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    f2 = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!f20475b) {
                fVar.f19923e = iArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                int i11 = $11 + 75;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i13 = $10 + 123;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            fVar.f19923e = cArr2.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i15 = $10 + 19;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(458 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), 11 - View.combineMeasuredStates(0, 0), -1923924106, false, $$c(b6, b7, (byte) (21 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        static void init$0() {
            $$a = new byte[]{44, -120, 71, -108};
            $$b = 73;
        }
    }

    /* JADX INFO: renamed from: o.ap.e$e */
    public static final class C0332e {

        /* JADX INFO: renamed from: a */
        public static int f20479a = 48559642;

        /* JADX INFO: renamed from: c */
        public static int f20480c = 2139428757;

        /* JADX INFO: renamed from: d */
        public static int f20481d = -1191258904;

        /* JADX INFO: renamed from: e */
        public static int f20482e = -634113792;

        /* JADX INFO: renamed from: f */
        private static int f20483f = 0;

        /* JADX INFO: renamed from: g */
        private static int f20484g = 1;

        /* JADX INFO: renamed from: b */
        private final EnumC0333e f20485b;

        /* JADX INFO: renamed from: h */
        private final byte[] f20486h;

        /* JADX INFO: renamed from: i */
        private final byte[] f20487i;

        /* JADX INFO: renamed from: j */
        private final byte[] f20488j;

        /* JADX INFO: renamed from: o.ap.e$e$e */
        public static final class EnumC0333e extends Enum<EnumC0333e> {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            public static final EnumC0333e f20489a;

            /* JADX INFO: renamed from: b */
            public static final EnumC0333e f20490b;

            /* JADX INFO: renamed from: c */
            private static final /* synthetic */ EnumC0333e[] f20491c;

            /* JADX INFO: renamed from: d */
            private static int f20492d = 0;

            /* JADX INFO: renamed from: e */
            private static long f20493e = 0;

            /* JADX INFO: renamed from: f */
            private static int f20494f = 0;

            /* JADX INFO: renamed from: i */
            private static int f20495i = 0;

            /* JADX INFO: renamed from: j */
            private static int f20496j = 0;

            /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(int r8, byte r9, int r10) {
                /*
                    byte[] r7 = o.ap.e.C0332e.EnumC0333e.$$a
                    int r0 = r10 + 4
                    int r6 = r8 * 2
                    int r2 = r6 + 1
                    int r1 = r9 * 7
                    int r5 = 114 - r1
                    byte[] r4 = new byte[r2]
                    r3 = 0
                    if (r7 != 0) goto L28
                    r5 = r6
                    r2 = r0
                    r1 = r3
                L14:
                    int r5 = r5 + r0
                    r0 = r2
                L16:
                    byte r2 = (byte) r5
                    r4[r1] = r2
                    int r2 = r0 + 1
                    if (r1 != r6) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L23:
                    int r1 = r1 + 1
                    r0 = r7[r2]
                    goto L14
                L28:
                    r1 = r3
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ap.e.C0332e.EnumC0333e.$$c(int, byte, int):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f20496j = 0;
                f20494f = 1;
                f20492d = 0;
                f20495i = 1;
                e();
                Object[] objArr = new Object[1];
                g("ᡈ櫺莫᠅莲并\uea7eᶹ", KeyEvent.getMaxKeyCode() >> 16, objArr);
                f20489a = new EnumC0333e(((String) objArr[0]).intern(), 0);
                Object[] objArr2 = new Object[1];
                g("钧㳊ꂯ铱䭚ࡖ쥬", TextUtils.lastIndexOf("", '0') + 1, objArr2);
                f20490b = new EnumC0333e(((String) objArr2[0]).intern(), 1);
                f20491c = a();
                int i2 = f20496j + 11;
                f20494f = i2 % 128;
                int i3 = i2 % 2;
            }

            private EnumC0333e(String str, int i2) {
                super(str, i2);
            }

            private static /* synthetic */ EnumC0333e[] a() {
                EnumC0333e[] enumC0333eArr;
                int i2 = 2 % 2;
                int i3 = f20495i;
                int i4 = i3 + 29;
                f20492d = i4 % 128;
                if (i4 % 2 != 0) {
                    enumC0333eArr = new EnumC0333e[3];
                    enumC0333eArr[0] = f20489a;
                    enumC0333eArr[1] = f20490b;
                } else {
                    enumC0333eArr = new EnumC0333e[]{f20489a, f20490b};
                }
                int i5 = i3 + 81;
                f20492d = i5 % 128;
                if (i5 % 2 == 0) {
                    return enumC0333eArr;
                }
                throw null;
            }

            static void e() {
                f20493e = -5506710175458351438L;
            }

            private static void g(String str, int i2, Object[] objArr) throws Throwable {
                Object charArray;
                String str2 = str;
                int i3 = 2 % 2;
                if (str2 != null) {
                    int i4 = $10 + 75;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        str2.toCharArray();
                        throw null;
                    }
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                k kVar = new k();
                char[] cArrC = k.c(f20493e ^ (-5882309809461882246L), (char[]) charArray, i2);
                kVar.f19939c = 4;
                while (kVar.f19939c < cArrC.length) {
                    int i5 = $10 + 31;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    kVar.f19938a = kVar.f19939c - 4;
                    int i7 = kVar.f19939c;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f20493e)};
                        Object objA = o.d.d.a(-1093976004);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(229 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (51004 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 9, 1749983833, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {kVar, kVar};
                        Object objA2 = o.d.d.a(-912105096);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(View.getDefaultSize(0, 0) + 675, (char) TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 522683165, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                $$a = new byte[]{Ascii.SYN, -5, 39, 97};
                $$b = JfifUtil.MARKER_RST7;
            }

            public static EnumC0333e valueOf(String str) {
                int i2 = 2 % 2;
                int i3 = f20492d + 63;
                f20495i = i3 % 128;
                int i4 = i3 % 2;
                EnumC0333e enumC0333e = (EnumC0333e) Enum.valueOf(EnumC0333e.class, str);
                int i5 = f20495i + 77;
                f20492d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
                return enumC0333e;
            }

            public static EnumC0333e[] values() {
                int i2 = 2 % 2;
                int i3 = f20495i + 49;
                f20492d = i3 % 128;
                int i4 = i3 % 2;
                EnumC0333e[] enumC0333eArr = (EnumC0333e[]) f20491c.clone();
                int i5 = f20492d + 35;
                f20495i = i5 % 128;
                int i6 = i5 % 2;
                return enumC0333eArr;
            }
        }

        public C0332e(EnumC0333e enumC0333e, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f20485b = enumC0333e;
            this.f20487i = bArr;
            this.f20488j = bArr2;
            this.f20486h = bArr3;
        }

        public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = (-1) - (((-1) - i2) & ((-1) - i3));
            int i9 = ~i7;
            int i10 = (i8 + i9) - (i8 & i9);
            int i11 = ~(i9 | i2);
            int i12 = (~i8) | i11;
            int i13 = (-1) - (((-1) - i11) & ((-1) - (~((-1) - (((-1) - (~i2)) & ((-1) - (~i3)))))));
            int i14 = i2 + i3 + i4 + (1699743442 * i5) + (2071835342 * i6);
            int i15 = i14 * i14;
            int i16 = ((i2 * (-557635572)) - 1375207424) + ((-557635572) * i3) + (i10 * (-2106796043)) + (2106796043 * i12) + ((-2106796043) * i13) + (1630535680 * i4) + ((-648019968) * i5) + ((-1801453568) * i6) + (1296564224 * i15);
            int i17 = ((i2 * (-355764420)) - 259725689) + (i3 * (-355764420)) + (i10 * 521) + (i12 * (-521)) + (i13 * 521) + (i4 * (-355763899)) + (i5 * 2119243930) + (i6 * (-943812730)) + (i15 * (-597164032));
            if (i16 + (i17 * i17 * 58195968) == 1) {
                return e(objArr);
            }
            C0332e c0332e = (C0332e) objArr[0];
            int i18 = 2 % 2;
            int i19 = f20484g;
            int i20 = i19 + 25;
            f20483f = i20 % 128;
            int i21 = i20 % 2;
            byte[] bArr = c0332e.f20487i;
            int i22 = (i19 ^ 55) + (((i19 + 55) - (i19 | 55)) << 1);
            f20483f = i22 % 128;
            int i23 = i22 % 2;
            return bArr;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            C0332e c0332e = (C0332e) objArr[0];
            int i2 = 2 % 2;
            int i3 = f20483f + 107;
            f20484g = i3 % 128;
            int i4 = i3 % 2;
            byte[] bArr = c0332e.f20486h;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f20481d * 914066893;
            f20481d = i5;
            int i6 = ~i5;
            int i7 = ((i6 - 1451192642) - (i6 | (-1451192642))) | (i6 ^ (-1451192642));
            int i8 = i7 ^ (-342740978);
            int i9 = i7 & (-342740978);
            int i10 = (~((i9 + i8) - (i9 & i8))) * (-116);
            int i11 = (143936092 ^ i10) + ((i10 & 143936092) << 1);
            int i12 = -(-(((-1) - (((-1) - ((-1451192642) ^ i5)) & ((-1) - ((-1) - (((-1) - (-1451192642)) | ((-1) - i5)))))) * 116));
            int i13 = (((i11 + i12) - (i11 & i12)) << 1) - (i12 ^ i11);
            int i14 = ~((i5 + 342740977) - (i5 & 342740977));
            int i15 = (-1451229170) ^ i14;
            int i16 = i14 & (-1451229170);
            int i17 = -(-(((i16 + i15) - (i16 & i15)) * 116));
            int i18 = (((-1) - (((-1) - i13) & ((-1) - i17))) << 1) - (i17 ^ i13);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i19 = 1056905215 ^ iElapsedRealtime;
            int i20 = (-1) - (((-1) - 1056905215) | ((-1) - iElapsedRealtime));
            int i21 = ~((i20 + i19) - (i20 & i19));
            int i22 = (~iElapsedRealtime) | (-1054672827);
            int i23 = i22 ^ (-782438470);
            int i24 = i22 & (-782438470);
            int i25 = ~((i24 + i23) - (i24 & i23));
            int i26 = (((i21 + i25) - (i21 | i25)) | (i21 ^ i25)) * (-318);
            int i27 = ((-1165931691) ^ i26) + ((i26 & (-1165931691)) << 1);
            int i28 = ~((-1) - (((-1) - (-1054672827)) & ((-1) - iElapsedRealtime)));
            int i29 = 274466746 ^ i28;
            int i30 = (i28 + 274466746) - (i28 | 274466746);
            int i31 = i27 + (((i30 + i29) - (i30 & i29)) * (-318));
            int i32 = ~((-1) - (((-1) - ((iElapsedRealtime + 1054672826) - (iElapsedRealtime | 1054672826))) & ((-1) - (1054672826 ^ iElapsedRealtime))));
            if (i18 > i31 + ((((i32 + 782438469) - (i32 | 782438469)) | (782438469 ^ i32)) * 318)) {
                return bArr;
            }
            throw null;
        }

        public final byte[] a() {
            int i2 = f20482e * 625366416;
            f20482e = i2;
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = f20480c * (-750632915);
            f20480c = i4;
            return (byte[]) e(813638732, -813638732, i3, new Object[]{this}, elapsedCpuTime, i4, i2);
        }

        public final EnumC0333e b() {
            int i2 = 2 % 2;
            int i3 = f20484g + 115;
            int i4 = i3 % 128;
            f20483f = i4;
            int i5 = i3 % 2;
            EnumC0333e enumC0333e = this.f20485b;
            int i6 = (((i4 + 37) - (37 & i4)) << 1) - (i4 ^ 37);
            f20484g = i6 % 128;
            int i7 = i6 % 2;
            return enumC0333e;
        }

        public final byte[] d() {
            int i2 = 2 % 2;
            int i3 = f20483f;
            int i4 = i3 + 15;
            f20484g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.f20488j;
            int i5 = (((-1) - (((-1) - i3) & ((-1) - 85))) << 1) - (i3 ^ 85);
            f20484g = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }

        public final byte[] e() {
            int iMyPid = Process.myPid();
            int i2 = f20479a * (-1314284388);
            f20479a = i2;
            return (byte[]) e(-1723726926, 1723726927, i2, new Object[]{this}, Thread.activeCount(), (int) Runtime.getRuntime().freeMemory(), iMyPid);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, byte r10) {
        /*
            int r0 = 121 - r8
            byte[] r8 = o.ap.e.$$a
            int r2 = r9 * 4
            int r1 = 1 - r2
            int r7 = r10 + 4
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2c
            r2 = r4
            r1 = r7
            r3 = r5
        L14:
            int r0 = -r2
            int r7 = r7 + r0
            r2 = r3
            r0 = r7
            r7 = r1
        L19:
            byte r1 = (byte) r0
            r6[r2] = r1
            int r1 = r7 + 1
            int r3 = r2 + 1
            if (r2 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r2 = r8[r1]
            r7 = r0
            goto L14
        L2c:
            r2 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ap.e.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20472i = 0;
        f20471f = 1;
        f20468b = 0;
        f20467a = 1;
        c();
        TextUtils.indexOf("", "");
        int i2 = f20472i + 65;
        f20471f = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public e(b bVar) {
        this.f20473c = bVar;
    }

    static void c() {
        f20470e = -5122705019746782463L;
        f20469d = new int[]{-1988312138, 85234886, 1548720899, -785855162, 416549051, 1633999572, -1425808023, 263285582, -381591289, 1665030252, -712023540, -1023484781, -1089231204, 794833168, -1259374000, 1451142828, 62429857, -1165144828};
    }

    private static C0332e d(o.ef.a aVar) throws Throwable {
        byte[] bArr;
        byte[] bArr2;
        C0332e.EnumC0333e enumC0333e;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            g(C1561oA.yd("䤾Ꝟ䣷䃃꓀졒ȫ袽뺽乻ࡷᛱ䃶챍繡ѝ튾䈞ః徭呸뿳釱肁욍䘄‛溤梗Ⰳ", (short) (C1607wl.Xd() ^ 24879)), KeyEvent.keyCodeFromString("") + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h(new int[]{-1154924870, 1293154229, 1212494224, 1398009234, -1546643621, 24605403, 1687540373, 249390357}, 12 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        h(new int[]{795362437, 134756489, -78127715, 1657821081, 856240582, -255358920, 19982599, -90060220, -269074936, -677691217, 299132251, 1155607217}, 22 - TextUtils.indexOf("", "", 0, 0), objArr3);
        String strS = aVar.s(((String) objArr3[0]).intern());
        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1;
        Object[] objArr4 = new Object[1];
        short sXd = (short) (C1580rY.Xd() ^ (-1768));
        int[] iArr = new int["㍴立㏑踵꾩妰탅讪뀤\udfcd囈".length()];
        QB qb = new QB("㍴立㏑踵꾩妰탅讪뀤\udfcd囈");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        g(new String(iArr, 0, i3), minimumFlingVelocity, objArr4);
        String strS2 = aVar.s(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        g(Xg.qd("\ueeb8露\uef10\ue4dc\uea48\uf841⍤옷求瘾괱偃\uea63ﱘ⼾\uda30聘檔릟咕ﺐ\uf07f㮞\ude9f璗溣薕", (short) (Od.Xd() ^ (-7413)), (short) (Od.Xd() ^ (-7958))), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr5);
        String strS3 = aVar.s(((String) objArr5[0]).intern());
        byte[] bArr3 = null;
        if (strS != null) {
            int i4 = f20468b + 21;
            f20467a = i4 % 128;
            int i5 = i4 % 2;
            enumC0333e = C0332e.EnumC0333e.f20489a;
            Object[] objArr6 = {strS, 10};
            Method declaredMethod = Class.forName(Jg.Wd("b J\t2\\\f\"y-r\"s\\(j\u0011\u0012<", (short) (C1499aX.Xd() ^ (-25057)), (short) (C1499aX.Xd() ^ (-1416)))).getDeclaredMethod(C1626yg.Ud("GvgV2|", (short) (FB.Xd() ^ 6866), (short) (FB.Xd() ^ 9306)), Class.forName(ZO.xd("\b6LJ\u0015)QtBy\u000eB\u001b!3?", (short) (C1499aX.Xd() ^ (-11153)), (short) (C1499aX.Xd() ^ (-25723)))), Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                bArr = (byte[]) declaredMethod.invoke(null, objArr6);
                if (strS2 != null) {
                    int i6 = f20468b + 27;
                    f20467a = i6 % 128;
                    if (i6 % 2 == 0) {
                        short sXd2 = (short) (Od.Xd() ^ (-31845));
                        int[] iArr2 = new int["_5Iv+pWh\u000e\u0018\u00174GYX\u0004A\u007fe".length()];
                        QB qb2 = new QB("_5Iv+pWh\u000e\u0018\u00174GYX\u0004A\u007fe");
                        int i7 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd2 + i7)));
                            i7++;
                        }
                        Object[] objArr7 = {strS2, 71};
                        Method declaredMethod2 = Class.forName(new String(iArr2, 0, i7)).getDeclaredMethod(C1561oA.Qd("ttq|pp", (short) (C1607wl.Xd() ^ 20551)), Class.forName(EO.Od("\n:1|QTm\u0003Ni%,XAF&", (short) (Od.Xd() ^ (-3658)))), Integer.TYPE);
                        try {
                            declaredMethod2.setAccessible(true);
                            bArr2 = (byte[]) declaredMethod2.invoke(null, objArr7);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        short sXd3 = (short) (Od.Xd() ^ (-7388));
                        short sXd4 = (short) (Od.Xd() ^ (-25872));
                        int[] iArr3 = new int["\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\"\"\u0018\u001c^s\u0014'\u001akj".length()];
                        QB qb3 = new QB("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\"\"\u0018\u001c^s\u0014'\u001akj");
                        int i8 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i8] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i8)) - sXd4);
                            i8++;
                        }
                        Object[] objArr8 = {strS2, 10};
                        Method declaredMethod3 = Class.forName(new String(iArr3, 0, i8)).getDeclaredMethod(C1561oA.Kd("\u0017\u0019\u0018%\u001b\u001d", (short) (C1607wl.Xd() ^ 13186)), Class.forName(C1561oA.od("G=Q;\u0007D8D<\u0002&FC9=5", (short) (C1580rY.Xd() ^ (-30358)))), Integer.TYPE);
                        try {
                            declaredMethod3.setAccessible(true);
                            bArr2 = (byte[]) declaredMethod3.invoke(null, objArr8);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                } else {
                    bArr2 = null;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } else {
            bArr = null;
            bArr2 = null;
            enumC0333e = null;
        }
        if (strS3 != null) {
            int i9 = f20468b + 35;
            f20467a = i9 % 128;
            int i10 = i9 % 2;
            if (enumC0333e != null) {
                Object[] objArr9 = new Object[1];
                g(Qg.kd("䧌젃䨌ᵚ꾦꜋\udfd5鎪쑸⣥喭֧刹늨\udbe7鿲\ud84e㒜凤↪嚄뺹쟵鯓\udc18䂆緎淶橓䪖ଯ\uf017\uf0bc촨礯樘溝坍\uef41ﰡ\uf47b\ud946擿癇苚", (short) (C1633zX.Xd() ^ (-20963)), (short) (C1633zX.Xd() ^ (-24002))), 1 - Color.blue(0), objArr9);
                throw new o.ef.b(((String) objArr9[0]).intern());
            }
            enumC0333e = C0332e.EnumC0333e.f20490b;
            Object[] objArr10 = {strS3, 10};
            Method declaredMethod4 = Class.forName(Wg.Zd("\u0003@\u0015\u000f:%}s*\u0019,\u001cO\f\u0012\u0018piM", (short) (C1580rY.Xd() ^ (-18750)), (short) (C1580rY.Xd() ^ (-29961)))).getDeclaredMethod(Wg.vd("/1,9+-", (short) (OY.Xd() ^ 21905)), Class.forName(C1561oA.Xd("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005", (short) (C1499aX.Xd() ^ (-24850)))), Integer.TYPE);
            try {
                declaredMethod4.setAccessible(true);
                bArr3 = (byte[]) declaredMethod4.invoke(null, objArr10);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        if (enumC0333e != null) {
            return new C0332e(enumC0333e, bArr, bArr2, bArr3);
        }
        Object[] objArr11 = new Object[1];
        g(hg.Vd("䒊\ue64a䑂㴖첈윺\uf2e9끉샚䴠蒾⨆㪈쭋ﺓ뱢곭愣烕䘥㚺\udf6c\uea89련̆敏鳤釸抐歐ἅᚖ하\uef95꣺郡弦絾ତ⋈턨\uf380锟", (short) (C1580rY.Xd() ^ (-2792)), (short) (C1580rY.Xd() ^ (-9066))), Gravity.getAbsoluteGravity(0, 0) + 1, objArr11);
        throw new o.ef.b(((String) objArr11[0]).intern());
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $11 + 39;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f20470e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i8 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f20470e)};
                Object objA = o.d.d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a(230 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (51004 - (ViewConfiguration.getLongPressTimeout() >> 16)), 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1749983833, false, $$c((byte) 14, b2, (byte) (b2 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = o.d.d.a(-912105096);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a((-16776541) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 12 - Drawable.resolveOpacity(0, 0), 522683165, false, $$c((byte) 7, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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

    private static void h(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f20469d;
        int i4 = 989264422;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 675, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -328001469, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 989264422;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f20469d;
        if (iArr6 != null) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i5 = 0;
            }
            while (i5 < length) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i5])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.indexOf("", "", i6, i6) + 675, (char) TextUtils.getOffsetBefore("", i6), 12 - Color.argb(i6, i6, i6, i6), -328001469, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i5] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i5])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(674 - MotionEvent.axisFromString(""), (char) TextUtils.indexOf("", ""), Process.getGidForName("") + 13, -328001469, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i5] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i5++;
                }
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, i6, iArr5, i6, length3);
        lVar.f19941d = i6;
        int i10 = $11 + 31;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (lVar.f19941d < iArr.length) {
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            for (int i12 = 0; i12 < 16; i12++) {
                lVar.f19942e ^= iArr5[i12];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 2;
                    byte b9 = (byte) (b8 - 2);
                    objA4 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 301, (char) (AndroidCharacter.getMirror('0') + 52649), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1416256172, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i13 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i13;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i14 = lVar.f19942e;
            int i15 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 229;
                char cIndexOf = (char) (51003 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i16 = 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte length4 = (byte) $$a.length;
                byte b10 = (byte) (length4 - 4);
                objA5 = o.d.d.a(windowTouchSlop, cIndexOf, i16, -330018025, false, $$c(length4, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{117, -127, -11, 113};
        $$b = 36;
    }

    @Override // o.ap.b
    public final /* synthetic */ C0332e a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20468b + 47;
        f20467a = i3 % 128;
        if (i3 % 2 == 0) {
            d(aVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0332e c0332eD = d(aVar);
        int i4 = f20468b + 15;
        f20467a = i4 % 128;
        int i5 = i4 % 2;
        return c0332eD;
    }

    @Override // o.ap.b
    public final void e(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20467a + 73;
        f20468b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            g("칉㑪츀엍㇏啢݈ᗋ䯀퍿赸鯳엽奕୦ǲ忙윺鄜螟\ud997䴓Ἆඟ厠쬘ꔬ\uf3b6\uedae넛", (-16777215) - Color.rgb(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h(new int[]{305271852, 1481289532, 1213534795, 573068807, 848380104, -1679907621, -565737685, 530788825}, 13 - ImageFormat.getBitsPerPixel(0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        g("Ὧ揬Ἐᰂ䅛˶\ude98敆髦蓿咴\ueb7fᓇ\u0eda", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        g("梐뉛棙觛\ue1bb퍳䭾얟\ued39啮셦䮱按\udf44䝙톷豈", TextUtils.getOffsetAfter("", 0) + 1, objArr4);
        aVar.a(strIntern2, (Object) ((String) objArr4[0]).intern());
        int i4 = f20467a + 57;
        f20468b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
