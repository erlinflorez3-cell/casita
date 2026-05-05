package o.bp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.a.o;
import o.ea.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f21495a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f21496c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f21497e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21498f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21499h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21500i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21501j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21503d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21502b = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r8, byte r9, byte r10) {
        /*
            byte[] r7 = o.bp.b.$$c
            int r6 = 105 - r8
            int r2 = r10 * 4
            int r1 = 1 - r2
            int r0 = r9 * 3
            int r0 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L29
            r2 = r0
            r1 = r4
        L15:
            int r6 = r6 + r0
            r0 = r2
        L17:
            byte r2 = (byte) r6
            r5[r1] = r2
            int r2 = r0 + 1
            if (r1 != r3) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L15
        L29:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.b.$$e(int, byte, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f21500i = 0;
        f21501j = 1;
        f21498f = 0;
        f21499h = 1;
        e();
        SystemClock.elapsedRealtimeNanos();
        Process.getThreadPriority(0);
        TextUtils.getCapsMode("", 0, 0);
        f21495a = new b();
        int i2 = f21501j + 107;
        f21500i = i2 % 128;
        int i3 = i2 % 2;
    }

    private b() {
    }

    public static b a() {
        int i2 = 2 % 2;
        int i3 = f21499h + 53;
        f21498f = i3 % 128;
        int i4 = i3 % 2;
        b bVar = f21495a;
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return bVar;
    }

    private static void c(long j2, long j3) throws Throwable {
        int i2 = 2 % 2;
        long j4 = j2 ^ (j3 << 32);
        int i3 = f21499h + 49;
        f21498f = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Method method = f.class.getMethod("a", null);
                method.setAccessible(true);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    g((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16777203) - Color.rgb(0, 0, 0), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    g((char) KeyEvent.normalizeMetaState(0), 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                    Object[] objArr3 = {((String) objArr2[0]).intern()};
                    Object[] objArr4 = new Object[1];
                    g((char) (30907 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) + 74, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
                    Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    g((char) (30907 - Color.argb(0, 0, 0, 0)), 74 - Drawable.resolveOpacity(0, 0), 5 - MotionEvent.axisFromString(""), objArr6);
                    Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    g((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 80, TextUtils.getCapsMode("", 0, 0) + 8, objArr7);
                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                    int i4 = f21499h + 89;
                    f21498f = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                Method method6 = f.class.getMethod("a", null);
                method6.setAccessible(true);
                if (((Boolean) method6.invoke(null, null)).booleanValue()) {
                    Object[] objArr9 = new Object[1];
                    g((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16777203) - Color.rgb(0, 0, 0), objArr9);
                    String strIntern2 = ((String) objArr9[0]).intern();
                    Constructor declaredConstructor2 = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor2.setAccessible(true);
                    Object objNewInstance2 = declaredConstructor2.newInstance(null);
                    Object[] objArr22 = new Object[1];
                    g((char) KeyEvent.normalizeMetaState(0), 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - ((Process.getThreadPriority(0) + 20) >> 6), objArr22);
                    Object[] objArr32 = {((String) objArr22[0]).intern()};
                    Object[] objArr42 = new Object[1];
                    g((char) (30907 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) + 74, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr42);
                    Method method22 = StringBuilder.class.getMethod(((String) objArr42[0]).intern(), String.class);
                    method22.setAccessible(true);
                    Object objInvoke3 = method22.invoke(objNewInstance2, objArr32);
                    Object[] objArr52 = {Long.valueOf(j4)};
                    Object[] objArr62 = new Object[1];
                    g((char) (30907 - Color.argb(0, 0, 0, 0)), 74 - Drawable.resolveOpacity(0, 0), 5 - MotionEvent.axisFromString(""), objArr62);
                    Method method32 = StringBuilder.class.getMethod(((String) objArr62[0]).intern(), Long.TYPE);
                    method32.setAccessible(true);
                    Object objInvoke22 = method32.invoke(objInvoke3, objArr52);
                    Object[] objArr72 = new Object[1];
                    g((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 80, TextUtils.getCapsMode("", 0, 0) + 8, objArr72);
                    Method method42 = StringBuilder.class.getMethod(((String) objArr72[0]).intern(), null);
                    method42.setAccessible(true);
                    Object[] objArr82 = {strIntern2, method42.invoke(objInvoke22, null)};
                    Method method52 = f.class.getMethod("c", String.class, Object.class);
                    method52.setAccessible(true);
                    method52.invoke(null, objArr82);
                    int i42 = f21499h + 89;
                    f21498f = i42 % 128;
                    int i52 = i42 % 2;
                }
            }
            a().f21503d = (int) j4;
            a().f21502b = true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void e() {
        f21497e = new char[]{38074, 43467, 60977, 11419, 25070, 42553, 58498, 14797, 32289, 48256, 61895, 13871, 29844, 38037, 43457, 60970, 11448, 25029, 42547, 58525, 14827, 32301, 48272, 61899, 38037, 43457, 60970, 11448, 25029, 42547, 58525, 14827, 32301, 48272, 61899, 13920, 29911, 35212, 52788, 3229, 16870, 34353, 50316, 6654, 24176, 38016, 43461, 60973, 11392, 25058, 42547, 58521, 14787, 32262, 48273, 61914, 13861, 29849, 35288, 52771, 3228, 16818, 34409, 50398, 6648, 24101, 40083, 53757, 5643, 21645, 27120, 44587, 60634, 8634, 60456, 53615, 38549, 21550, 6527, 56963, 38022, 43467, 60941, 11396, 25048, 42549, 58520, 14799};
        f21496c = 5070786710032591268L;
    }

    private static void g(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 113;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f21497e[i2 * i6])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a((-16776474) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 632508977, false, $$e((byte) (-$$c[2]), b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f21496c), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b3 = (byte) 5;
                        byte b4 = (byte) (b3 - 5);
                        objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 766, (char) (12470 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, 1946853218, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 387, (char) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                int i7 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f21497e[i2 + i7])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    objA4 = o.d.d.a(743 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 632508977, false, $$e((byte) (-$$c[2]), b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f21496c), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b8 = (byte) 5;
                    byte b9 = (byte) (b8 - 5);
                    objA5 = o.d.d.a(766 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ImageFormat.getBitsPerPixel(0) + 12471), 12 - TextUtils.indexOf("", "", 0), 1946853218, false, $$e(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA6 = o.d.d.a(387 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            int i8 = $11 + 101;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA7 = o.d.d.a(387 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 17 - ExpandableListView.getPackedPositionChild(0L), 39570797, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{17, -84, -78, -70};
        $$b = 109;
    }

    static void init$1() {
        $$c = new byte[]{91, 84, -6, Ascii.ETB};
        $$d = 156;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 101
            int r0 = r10 + 4
            byte[] r7 = o.bp.b.$$a
            int r1 = r9 * 4
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2b
            r8 = r6
            r1 = r0
            r3 = r4
        L14:
            int r8 = r8 + r0
            r0 = r1
            r2 = r3
        L17:
            int r3 = r2 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            if (r3 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L26:
            int r1 = r0 + 1
            r0 = r7[r1]
            goto L14
        L2b:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bp.b.k(int, int, int, java.lang.Object[]):void");
    }

    public final int a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21498f + 125;
        f21499h = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            g((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            g((char) (ViewConfiguration.getTapTimeout() >> 16), 12 - TextUtils.lastIndexOf("", '0'), ImageFormat.getBitsPerPixel(0) + 12, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (this.f21502b) {
            return this.f21503d;
        }
        try {
            Object[] objArr3 = {context, 0};
            Object objA = o.d.d.a(-1397104390);
            if (objA == null) {
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 260;
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + MessagePack.Code.ARRAY32);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                k(b2, b3, (byte) (b3 - 1), objArr4);
                objA = o.d.d.a(packedPositionGroup, modifierMetaStateMask, edgeSlop, 2050753183, false, (String) objArr4[0], new Class[]{Context.class, Integer.TYPE});
            }
            this.f21503d = ((Integer) ((Method) objA).invoke(null, objArr3)).intValue();
            this.f21502b = true;
            if (f.a()) {
                Object[] objArr5 = new Object[1];
                g((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, TextUtils.indexOf("", "", 0) + 13, objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                g((char) TextUtils.indexOf("", ""), (-16777192) - Color.rgb(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, objArr6);
                f.c(strIntern2, sb.append(((String) objArr6[0]).intern()).append(this.f21503d).toString());
            }
            int i5 = this.f21503d;
            int i6 = f21499h + 97;
            f21498f = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
