package o.er;

import android.graphics.Color;
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
import fr.antelop.sdk.R;
import java.lang.reflect.Method;
import o.an.a;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f24998b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f24999c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f25000d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25001e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25002f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25003j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, int r11) {
        /*
            int r0 = r9 * 4
            int r9 = 4 - r0
            int r8 = r11 + 99
            int r0 = r10 * 2
            int r7 = r0 + 1
            byte[] r6 = o.er.g.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L27
            r3 = r4
            r2 = r9
        L13:
            int r9 = r9 + r8
            int r2 = r2 + 1
            r1 = r3
        L17:
            byte r0 = (byte) r9
            int r3 = r1 + 1
            r5[r1] = r0
            if (r3 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r8 = r6[r2]
            goto L13
        L27:
            r1 = r4
            r2 = r9
            r9 = r8
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.g.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25002f = 0;
        f25003j = 1;
        f25001e = 0;
        f24998b = 1;
        a();
        Color.argb(0, 0, 0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        Color.red(0);
        int i2 = f25002f + 63;
        f25003j = i2 % 128;
        int i3 = i2 % 2;
    }

    public g(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void a() {
        f24999c = new char[]{38075, 7041, 35494, 14784, 43252, 24352, 52797, 32075, 60542, 40115, 953, 45758, 8670, 53479, 18181, 63032, 25969, 5242, 33930, 2979, 47839, 10736, 55529, 51722, 17685, 54307, 26491, 63084, 392, 37035, 9155, 45803, 49692, 23846, 60465, 32592, 36448, 6546, 43185, 15315, 19152, 55814, 21822, 58461, 30569, 34401, 4504, 41115, 13273, 17138, 53767, 28001, 64521, 3883, 40635, 10659, 47281, 52181, 23286, 59932, 25980, 62551, 1897, 38597, 8623, 45258, 50118, 21169, 57872, 32050, 35917, 8045, 44684, 14758, 18643, 56233, 27420, 64018, 29986, 33857, 6013, 42637, 12716, 16513, 54250, 25354, 61987, 3400, 39952, 12150, 48777, 51626, 22739, 60384, 31503, 35364, 1372, 37994, 10102, 46801, 49657, 20635, 58315, 29454, 33317, 7431, 44158, 16257, 20137, 55795, 26834, 64496, 2846, 39486, 5463, 42093, 14224, 18155, 53696, 24802, 62384, 790, 37423, 11597, 48244, 53187, 24246, 59844, 30972, 34843, 6935, 43555, 9562, 38044, 7040, 35479, 14788, 43251, 24343, 52788, 32092, 60532, 40067, 953, 45742, 8655, 53503, 18189, 63022, 25932, 61862, 32409, 61357, 23766, 52693, 14877, 43832, 6238, 35169, 63873, 26302, 55177, 17628, 46574, 8709, 37695, 'V', 29037};
        f25000d = 4542404667005606895L;
    }

    private String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25001e + 3;
        f24998b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f25010g.c().b();
            throw null;
        }
        String strB = this.f25010g.c().b();
        if (strB != null) {
            return strB;
        }
        if (o.ea.f.a()) {
            int i4 = f25001e + 17;
            f24998b = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            i((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i((char) (24223 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 110, objArr2);
            o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = new Object[1];
        i((char) Color.blue(0), 133 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static void i(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        int i5 = 0;
        oVar.f19947b = 0;
        int i6 = $11 + 3;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 53;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f24999c[i2 + i10])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    int i11 = 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b2 = (byte) i5;
                    byte b3 = b2;
                    String str$$c = $$c(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Integer.TYPE;
                    objA = o.d.d.a((TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 742, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), i11, 632508977, false, str$$c, clsArr);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i10), Long.valueOf(f25000d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.indexOf("", "") + 766, (char) (12471 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 12 - (ViewConfiguration.getTapTimeout() >> 16), 1946853218, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 18, 39570797, false, $$c(b6, b7, (byte) (6 | b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i12 = $10 + 109;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i5 = 0;
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
            int i14 = $11 + 51;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(View.getDefaultSize(0, 0) + 387, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 39570797, false, $$c(b8, b9, (byte) ((b9 + 6) - (6 & b9))), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objA4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 388, (char) (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, 39570797, false, $$c(b10, b11, (byte) ((b11 + 6) - (6 & b11))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{40, 101, 74, -30};
        $$b = 88;
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25001e + 81;
        f24998b = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f25001e + 1;
        f24998b = i5 % 128;
        int i6 = i5 % 2;
        return zC;
    }

    public final o.y.j<o.eb.b> d() throws Throwable {
        int i2 = 2 % 2;
        String strE = e();
        o.ep.d dVar = this.f25009a;
        boolean zC = c();
        a.c cVar = a.c.f20367a;
        o.eb.e eVar = new o.eb.e() { // from class: o.er.g.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f25004a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f25005c = 1;

            @Override // o.eb.e
            public final int getThemeResource(o.eb.b bVar) throws Throwable {
                int i3 = 2 % 2;
                int i4 = f25004a;
                int i5 = (((i4 + 53) - (53 & i4)) << 1) - (i4 ^ 53);
                f25005c = i5 % 128;
                int i6 = i5 % 2;
                o.eb.b.d();
                if (i6 == 0) {
                    int i7 = R.style.antelopSecureCardDisplayThemeInternal;
                    throw null;
                }
                int i8 = R.style.antelopSecureCardDisplayThemeInternal;
                int i9 = f25004a;
                int i10 = (((-1) - (((-1) - i9) & ((-1) - 69))) << 1) - (i9 ^ 69);
                f25005c = i10 % 128;
                int i11 = i10 % 2;
                return i8;
            }
        };
        Object[] objArr = new Object[1];
        i((char) (TextUtils.lastIndexOf("", '0') + 25880), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 150, Process.getGidForName("") + 19, objArr);
        o.y.j<o.eb.b> jVar = new o.y.j<>(strE, dVar, zC, cVar, eVar, ((String) objArr[0]).intern());
        int i3 = f25001e + 89;
        f24998b = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    @Override // o.er.h
    public final c[] h() {
        int i2 = 2 % 2;
        int i3 = f24998b + 51;
        f25001e = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = {this.f25010g.c()};
        int i5 = f24998b + 27;
        f25001e = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }
}
