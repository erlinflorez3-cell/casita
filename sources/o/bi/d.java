package o.bi;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f21253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f21254b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f21255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f21256d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21257g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21258h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21259i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21260j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21261e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r0 = r7 * 2
            int r7 = 3 - r0
            int r0 = r9 + 99
            int r6 = r8 * 4
            int r1 = r6 + 1
            byte[] r5 = o.bi.d.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L26
            r2 = r7
            r1 = r3
        L13:
            int r7 = r7 + r0
        L14:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r6) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L1f:
            int r2 = r2 + 1
            int r1 = r1 + 1
            r0 = r5[r2]
            goto L13
        L26:
            r1 = r3
            r2 = r7
            r7 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi.d.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21258h = 0;
        f21259i = 1;
        f21257g = 0;
        f21260j = 1;
        c();
        Object[] objArr = new Object[1];
        f((char) View.MeasureSpec.getMode(0), TextUtils.indexOf("", "", 0), 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 17173), Color.alpha(0) + 5, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, objArr2);
        f21256d = new d(strIntern, ((String) objArr2[0]).intern());
        f21255c = d();
        int i2 = f21258h + 35;
        f21259i = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, String str2) {
        this.f21261e = str2;
    }

    static void c() {
        f21254b = new char[]{38077, 28737, 23828, 15042, 1948, 55208, 13172, 7713, 31223, 17577};
        f21253a = 8278754551481266229L;
    }

    private static /* synthetic */ d[] d() {
        int i2 = 2 % 2;
        int i3 = f21260j + 103;
        f21257g = i3 % 128;
        if (i3 % 2 == 0) {
            return new d[]{f21256d};
        }
        d[] dVarArr = new d[0];
        dVarArr[0] = f21256d;
        return dVarArr;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 11;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21254b[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - View.MeasureSpec.getSize(0), (char) ((-1) - MotionEvent.axisFromString("")), (KeyEvent.getMaxKeyCode() >> 16) + 12, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21253a), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 766, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12470), ExpandableListView.getPackedPositionType(0L) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 39570797, false, $$c(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 6)))), new Class[]{Object.class, Object.class});
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
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(388 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-16777198) - Color.rgb(0, 0, 0), 39570797, false, $$c(b8, b9, (byte) ((b9 + 6) - (6 & b9))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 37;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{123, 10, 108, -85};
        $$b = 72;
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21260j + 101;
        f21257g = i3 % 128;
        int i4 = i3 % 2;
        d dVar = (d) Enum.valueOf(d.class, str);
        if (i4 != 0) {
            int i5 = 16 / 0;
        }
        return dVar;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f21257g + 125;
        f21260j = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = f21255c;
        if (i4 != 0) {
            return (d[]) dVarArr.clone();
        }
        throw null;
    }

    public final String a() {
        String str;
        int i2 = 2 % 2;
        int i3 = f21260j + 19;
        int i4 = i3 % 128;
        f21257g = i4;
        if (i3 % 2 != 0) {
            str = this.f21261e;
            int i5 = 32 / 0;
        } else {
            str = this.f21261e;
        }
        int i6 = i4 + 57;
        f21260j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
