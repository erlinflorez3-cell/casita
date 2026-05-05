package o.bo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends o.bv.d {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f21480a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f21481b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21482c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f21483d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21485f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21486h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21487i = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r10, int r11, int r12) {
        /*
            int r0 = r12 * 2
            int r9 = r0 + 1
            byte[] r8 = o.bo.g.$$c
            int r7 = 105 - r11
            int r6 = r10 + 4
            byte[] r5 = new byte[r9]
            r4 = 0
            if (r8 != 0) goto L2a
            r3 = r6
            r0 = r9
            r2 = r4
        L12:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
            r7 = r6
            r6 = r3
        L17:
            int r3 = r6 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r2 != r9) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            r0 = r8[r3]
            r6 = r7
            goto L12
        L2a:
            r1 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bo.g.$$e(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21485f = 0;
        f21486h = 1;
        f21482c = 0;
        f21487i = 1;
        e();
        Process.getElapsedCpuTime();
        ViewConfiguration.getScrollDefaultDelay();
        ExpandableListView.getPackedPositionChild(0L);
        f21484e = new Object();
        int i2 = f21485f + 95;
        f21486h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
    }

    public static void a(Context context) throws Throwable {
        d cVar;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            n((char) (View.MeasureSpec.getSize(0) + 22515), TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetBefore("", 0) + 35, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (37369 - MotionEvent.axisFromString("")), Gravity.getAbsoluteGravity(0, 0) + 106, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.bv.b bVarD = d(context);
        if (bVarD == null) {
            if (!(!o.ea.f.a())) {
                int i3 = f21482c + 73;
                f21487i = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr3 = new Object[1];
                n((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22515), TextUtils.getTrimmedLength(""), 35 - Color.green(0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                n((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 141, 61 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
                o.ea.f.d(strIntern2, ((String) objArr4[0]).intern());
                return;
            }
            return;
        }
        o.bk.e eVarD = o.bk.e.d(context);
        o.bk.a aVarD = eVarD.d();
        o.bk.c cVarA = eVarD.a();
        if ((bVarD instanceof o.bv.c) && aVarD != null) {
            cVar = new b(context, (o.bv.c) bVarD, aVarD);
        } else {
            if (!(bVarD instanceof o.bv.e) || cVarA == null) {
                if (o.ea.f.a()) {
                    int i5 = f21482c + 107;
                    f21487i = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr5 = new Object[1];
                    n((char) (TextUtils.indexOf("", "", 0) + 22515), ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    n((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 57364), 202 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 77, objArr6);
                    o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
                }
                int i7 = f21487i + 61;
                f21482c = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            cVar = new c(context, (o.bv.e) bVarD, cVarA);
        }
        f21481b = cVar;
    }

    public static void c() throws Throwable {
        int i2 = 2 % 2;
        if (!(!o.ea.f.a())) {
            Object[] objArr = new Object[1];
            n((char) (22515 - (ViewConfiguration.getScrollBarSize() >> 8)), ViewConfiguration.getScrollBarSize() >> 8, 34 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((char) (ViewConfiguration.getTapTimeout() >> 16), 279 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 5, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f21482c + 63;
            f21487i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 4;
            }
        }
        d dVar = f21481b;
        if (dVar != null) {
            int i5 = f21487i + 23;
            f21482c = i5 % 128;
            int i6 = i5 % 2;
            dVar.b();
            int i7 = f21482c + 101;
            f21487i = i7 % 128;
            int i8 = i7 % 2;
        }
        f21481b = null;
    }

    static void e() {
        f21480a = new char[]{50001, 55073, 60376, 65430, 37400, 42701, 47756, 19745, 25032, 30107, 2106, 7368, 12442, 51971, 57282, 62344, 34343, 39629, 44696, 16683, 22005, 27018, 31776, 4308, 9360, 16168, 54214, 59268, 64011, 36545, 41620, 46398, 18894, 23942, 28722, 41142, 46305, 34831, 40062, 61936, 50443, 55623, 11983, 540, 5727, 27632, 32535, 21322, 43241, 48153, 36941, 58834, 63761, 52569, 8936, 13852, 2635, 8186, 29474, 18267, 23795, 45061, 33871, 39417, 60693, 49493, 54970, 10844, 15876, 5097, 26411, 31569, 20717, 42045, 47180, 36336, 57634, 62788, 51894, 56893, 12882, 2034, 6937, 28484, 17656, 22574, 44125, 33249, 38189, 59739, 65218, 53819, 9811, 15333, 3887, 25433, 30965, 19509, 40986, 46581, 35105, 40285, 62087, 50731, 55901, 12171, 1402, 4408, 11716, 14725, 21561, 24786, 31902, 35595, 42965, 45958, 52786, 56034, 63121, 3370, 6621, 13714, 16447, 23748, 26780, 34592, 37887, 44948, 47668, 55005, 58009, 63782, 5583, 8623, 15414, 18630, 25736, 29482, 36812, 39832, 46640, 38016, 32962, 48190, 43135, 50627, 61736, 60772, 6897, 13871, 8828, 24520, 19224, 26475, 40144, 34855, 42088, 53701, 52542, 63846, 5850, 517, 15982, 11214, 18215, 29539, 26844, 33845, 45141, 44492, 55612, 62834, 58064, 7734, 2658, 10186, 21325, 20267, 25755, 36866, 35950, 47514, 54528, 49523, 65173, 59933, 1638, 13254, 12063, 23403, 28884, 27661, 38973, 46551, 41245, 56701, 51928, 58886, 4734, 4050, 15113, 22395, 29845, 24791, 23595, 18538, 9686, 4413, 3441, 64228, 54842, 49769, 49117, 43789, 34686, 31941, 26674, 17533, 12752, 11563, 6515, 63183, 57872, 56955, 52187, 42802, 37750, 35017, 25632, 20544, 19929, 14633, 5479, 709, 65059, 60023, 51167, 45912, 44862, 33934, 28695, 27771, 22927, 13578, 8544, 7891, 2579, 58934, 54220, 53017, 47972, 37073, 35868, 30831, 21962, 16656, 15726, 10884, 1564, 62053, 61387, 56086, 46946, 44225, 38916, 29822, 25030, 23814, 18788, 9911, 4637, 3630, 64445, 55057, 50025, 47283, 37915, 32869, 32191, 38036, 32971, 48173, 43134, 50638};
        f21483d = -5886787312491724633L;
    }

    static void init$0() {
        $$c = new byte[]{82, 42, -87, -21};
        $$d = 116;
    }

    private static void n(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 111;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 5;
        }
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21480a[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = o.d.d.a(743 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 11 - ImageFormat.getBitsPerPixel(0), 632508977, false, $$e(b2, (byte) (6 & b2), (byte) 0), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21483d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (5 & b3);
                    objA2 = o.d.d.a(View.resolveSize(0, 0) + 766, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12470), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1946853218, false, $$e(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 387, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 83;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 388, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 18, 39570797, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                int i9 = 58 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr6 = {oVar, oVar};
                Object objA5 = o.d.d.a(-723636472);
                if (objA5 == null) {
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (b9 + 1);
                    objA5 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 387, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 18 - View.MeasureSpec.getSize(0), 39570797, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    public final d e(Context context) {
        synchronized (f21484e) {
            d dVar = f21481b;
            if (dVar != null) {
                return dVar;
            }
            a(context);
            return f21481b;
        }
    }
}
