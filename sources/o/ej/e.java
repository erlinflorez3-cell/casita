package o.ej;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import o.a.o;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23972a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23973b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f23974c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f23975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f23976e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23977h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23978i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, short r10) {
        /*
            byte[] r7 = o.ej.e.$$a
            int r2 = r8 * 2
            int r1 = 1 - r2
            int r0 = r9 * 2
            int r6 = 3 - r0
            int r0 = r10 + 99
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            r2 = -1
            if (r7 != 0) goto L29
            r0 = r3
            r1 = r6
        L16:
            int r6 = r6 + r0
        L17:
            int r2 = r2 + 1
            int r1 = r1 + 1
            byte r0 = (byte) r6
            r5[r2] = r0
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r7[r1]
            goto L16
        L29:
            r1 = r6
            r6 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ej.e.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23977h = 0;
        f23978i = 1;
        d();
        TextUtils.lastIndexOf("", '0', 0);
        View.combineMeasuredStates(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getScrollBarSize();
        f23975d = new Object();
        f23972a = false;
        f23974c = null;
        int i2 = f23978i + 93;
        f23977h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
    }

    public static d b(Context context) throws Throwable {
        d dVar;
        c cVar;
        Object[] objArr = new Object[1];
        f((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38958), 9 - Process.getGidForName(""), 17 - View.MeasureSpec.getSize(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        synchronized (f23975d) {
            if (f23972a) {
                throw new b();
            }
            if (f23974c == null) {
                o.ea.c.a();
                File file = new File(o.ea.b.a(context));
                Object[] objArr2 = new Object[1];
                f((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36222), ViewConfiguration.getKeyRepeatTimeout() >> 16, 10 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                File file2 = new File(file, ((String) objArr2[0]).intern());
                try {
                    byte[] bArr = new byte[20];
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    int i2 = bufferedInputStream.read(bArr, 0, 20);
                    bufferedInputStream.close();
                    if (i2 != 20) {
                        throw new IOException();
                    }
                    byte b2 = bArr[4];
                    byte b3 = bArr[18];
                    if (b2 == 2 && b3 == -73) {
                        if (f.a()) {
                            Object[] objArr3 = new Object[1];
                            f((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 27 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 46, objArr3);
                            f.c(strIntern, ((String) objArr3[0]).intern());
                        }
                        cVar = c.f23961d;
                    } else if (b2 == 1 && b3 == 40) {
                        if (f.a()) {
                            Object[] objArr4 = new Object[1];
                            f((char) (9761 - MotionEvent.axisFromString("")), View.resolveSize(0, 0) + 73, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46, objArr4);
                            f.c(strIntern, ((String) objArr4[0]).intern());
                        }
                        cVar = c.f23962e;
                    } else if (b3 == 3) {
                        if (f.a()) {
                            Object[] objArr5 = new Object[1];
                            f((char) View.resolveSizeAndState(0, 0, 0), 119 - (ViewConfiguration.getJumpTapTimeout() >> 16), 40 - KeyEvent.getDeadChar(0, 0), objArr5);
                            f.c(strIntern, ((String) objArr5[0]).intern());
                        }
                        cVar = c.f23959b;
                    } else {
                        if (b3 != 62) {
                            if (f.a()) {
                                Object[] objArr6 = new Object[1];
                                f((char) ((ViewConfiguration.getTapTimeout() >> 16) + 10923), 202 - (ViewConfiguration.getPressedStateDuration() >> 16), AndroidCharacter.getMirror('0') + 3, objArr6);
                                f.d(strIntern, ((String) objArr6[0]).intern());
                            }
                            f23972a = true;
                            throw new b();
                        }
                        if (f.a()) {
                            Object[] objArr7 = new Object[1];
                            f((char) View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 158, TextUtils.indexOf("", "", 0, 0) + 43, objArr7);
                            f.c(strIntern, ((String) objArr7[0]).intern());
                        }
                        cVar = c.f23958a;
                    }
                    f23974c = new d(file2, cVar);
                } catch (IOException e2) {
                    if (f.a()) {
                        Object[] objArr8 = new Object[1];
                        f((char) (TextUtils.getOffsetBefore("", 0) + 26293), 252 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (Process.myTid() >> 22) + 57, objArr8);
                        f.e(strIntern, ((String) objArr8[0]).intern(), e2);
                    }
                    f23972a = true;
                    throw new b();
                }
            }
            dVar = f23974c;
        }
        return dVar;
    }

    static void d() {
        f23976e = new char[]{6563, 42648, 26389, 10118, 58399, 42167, 25905, 9706, 57919, 41691, 3218, 46021, 29272, 13021, 61770, 45537, 28736, 12541, 63358, 46998, 30221, 13958, 62725, 46481, 29752, 13501, 64304, 38037, 11247, 60022, 43720, 26983, 10692, 59468, 43219, 28508, 12205, 60940, 44731, 27942, 11651, 60436, 44191, 25406, 8803, 58080, 41320, 25075, 8280, 57563, 42778, 26527, 9834, 59024, 42287, 26044, 9220, 58507, 47892, 31637, 15018, 63853, 47604, 30770, 14571, 65392, 49143, 32274, 16124, 64886, 48536, 31803, 15518, 45751, 3533, 52308, 36074, 20293, 4070, 52846, 36593, 18814, 2447, 51246, 34969, 19204, 2977, 51766, 35517, 17692, 1089, 50370, 34634, 18385, 1658, 50937, 33080, 16829, 'H', 49330, 33549, 17310, 550, 49833, 40246, 23991, 7304, 57167, 40918, 24080, 7881, 55634, 39381, 22576, 6363, 56146, 39866, 23065, 6844, 38037, 11247, 60022, 43720, 26983, 10692, 59468, 43219, 28508, 12205, 60940, 44731, 27942, 11651, 60436, 44191, 25406, 8803, 58080, 41320, 25075, 8280, 57563, 42778, 26527, 9834, 59024, 42287, 26044, 9220, 58507, 47892, 31637, 15018, 63853, 47604, 30770, 14546, 65306, 49036, 38037, 11247, 60022, 43720, 26983, 10692, 59468, 43219, 28508, 12205, 60940, 44731, 27942, 11651, 60436, 44191, 25406, 8803, 58080, 41320, 25075, 8280, 57563, 42778, 26527, 9834, 59024, 42287, 26044, 9220, 58507, 47892, 31637, 15018, 63853, 47604, 30770, 14546, 65306, 49036, 32365, 16124, 64886, 48702, 324, 49373, 32867, 17356, 879, 49895, 33400, 17911, 1286, 50343, 33808, 18317, 1832, 50879, 34356, 18837, 2248, 51275, 35779, 19288, 2803, 51824, 36273, 19764, 3265, 52284, 36767, 20235, 3748, 52778, 37310, 20798, 4175, 54208, 37707, 21212, 4709, 54697, 38256, 21739, 5122, 55169, 38680, 22157, 5668, 55722, 39205, 22700, 7123, 56140, 61984, 19802, 36035, 52349, 4050, 20337, 36601, 52838, 2537, 18712, 35001, 51214, 2963, 19254, 35489, 51754, 1419, 17622, 33877, 51165, 1862, 18157, 34414, 49583, 298, 16607, 32788, 50062, 777, 17073, 33336, 56763, 7527, 23629, 40914, 57166, 7875, 24127, 39417, 55662, 6387, 22550, 39809, 56074, 6855, 23091, 38334, 54573, 5301, 22494, 38725, 54998, 5639, 20985, 37246, 53475, 4194, 38046, 11235, 60000, 43753, 26993, 10695, 59404, 43209, 28509};
        f23973b = 4477540349065177994L;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $11 + 107;
            $10 = i6 % 128;
            if (i6 % i4 != 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f23976e[i2 * i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(742 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f23973b), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 767, (char) (12470 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(387 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 18 - TextUtils.indexOf("", ""), 39570797, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(f23976e[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 742, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 12, 632508977, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f23973b), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objA5 = o.d.d.a(766 - Color.argb(0, 0, 0, 0), (char) (12470 - (ViewConfiguration.getEdgeSlop() >> 16)), Process.getGidForName("") + 13, 1946853218, false, $$c(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objA6 = o.d.d.a(387 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 18 - TextUtils.indexOf("", "", 0), 39570797, false, $$c(b12, b13, (byte) ((-1) - (((-1) - b13) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i9 = $11 + 59;
        $10 = i9 % 128;
        int i10 = 2;
        int i11 = i9 % 2;
        while (oVar.f19947b < i3) {
            int i12 = $10 + 55;
            $11 = i12 % 128;
            if (i12 % i10 == 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = new Object[i10];
                objArr8[1] = oVar;
                objArr8[0] = oVar;
                Object objA7 = o.d.d.a(-723636472);
                if (objA7 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    objA7 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 387, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), AndroidCharacter.getMirror('0') - 30, 39570797, false, $$c(b14, b15, (byte) ((-1) - (((-1) - b15) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA7).invoke(null, objArr8);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr9 = {oVar, oVar};
            Object objA8 = o.d.d.a(-723636472);
            if (objA8 == null) {
                int deadChar = 387 - KeyEvent.getDeadChar(0, 0);
                char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iIndexOf = TextUtils.indexOf("", "", 0) + 18;
                byte b16 = (byte) 0;
                byte b17 = b16;
                String str$$c = $$c(b16, b17, (byte) (6 | b17));
                i10 = 2;
                objA8 = o.d.d.a(deadChar, c3, iIndexOf, 39570797, false, str$$c, new Class[]{Object.class, Object.class});
            } else {
                i10 = 2;
            }
            ((Method) objA8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
        $$b = 172;
    }
}
