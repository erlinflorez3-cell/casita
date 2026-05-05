package o.bh;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.o;
import o.cg.f;

/* JADX INFO: loaded from: classes6.dex */
final class g extends f {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f21210h = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f21211k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21212l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21213m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21214n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21215o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f21216f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21217i;

    interface b {
        void k();

        void l();
    }

    private static String $$g(int i2, short s2, int i3) {
        int i4 = i3 * 3;
        byte[] bArr = $$c;
        int i5 = 105 - i2;
        int i6 = s2 + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 += -i6;
            i6 = i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            int i8 = i6 + 1;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i8];
            i6 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21215o = 0;
        f21214n = 1;
        f21213m = 0;
        f21212l = 1;
        b();
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0');
        ViewConfiguration.getDoubleTapTimeout();
        ViewConfiguration.getWindowTouchSlop();
        Process.myPid();
        int i2 = f21214n + 25;
        f21215o = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    g(Context context, boolean z2, b bVar) {
        super(context, 2);
        this.f21216f = bVar;
        this.f21217i = z2;
    }

    private static void C(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21210h[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    objA = o.d.d.a(742 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 632508977, false, $$g((byte) 6, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21211k), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) (-1);
                    objA2 = o.d.d.a(766 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (12470 - TextUtils.indexOf("", "", 0)), View.resolveSize(0, 0) + 12, 1946853218, false, $$g((byte) 5, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA3 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 387, (char) ExpandableListView.getPackedPositionGroup(0L), 17 - ImageFormat.getBitsPerPixel(0), 39570797, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 85;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA4 = o.d.d.a(386 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 18 - TextUtils.getCapsMode("", 0, 0), 39570797, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void b() {
        f21210h = new char[]{38067, 2042, 45648, 11994, 55592, 30084, 57348, 37750, 4037, 47711, 22173, 49435, 32134, 59598, 39757, 14277, 41524, 24204, 51462, 25678, 4299, 33606, 16307, 43534, 18077, 61924, 38045, 2039, 45640, 11994, 55600, 30080, 57424, 37758, 4041, 47685, 22197, 49437, 32151, 59625, 39745, 14296, 41516, 24265, 51485, 25712, 4238, 33619, 16303, 43549, 18073, 61924, 27720, 6299, 35708, 10189, 53782, 19810, 63974, 37966, 171, 45857, 12181, 56041, 30069, 57804, 39993, 2289, 47901, 22120, 49890, 32084, 59838, 33846, 12438, 41952, 24187, 51917, 25966, 4540, 35859, 16175, 44020, 17998, 62136, 28027, 6535, 46318, 10107, 54210, 20034, 64173, 38145, 407, 20641, 50140, 30316, 60155, 7455, 45493, 9332, 22360, 52193, 32379, 37534, 1318, 47541, 11417, 24420, 62450, 26133, 39661, 3363, 41026, 54526, 18277, 64397, 28197, 33465, 13782, 43048, 56485, 20290, 58279, 5689, 35159, 15809, 20594, 50322, 30492, 60342, 7876, 45383, 9704, 22606, 52372, 32571, 37467, 1755, 47471, 11661, 16391, 62639, 26562, 39518, 3751, 41219, 54658, 18532, 64330, 28637, 33382, 13965, 43279, 56758, 28876, 58200, 13192, 41189, 7893, 36277, 14361, 42125, 21368, 65502, 27218, 6458, 34182, 12299, 56550, 19202, 63454, 25271, 4373, 48535, 10365, 54465, 17225, 60963, 39560, 2322, 46505, 8264, 52444, 31676, 58892, 37524, 358, 44481, 22613, 51054, 29629, 7682, 35554, 14711, 42391, 20649, 65335, 27541, 5745, 33505, 12613, 56374, 18614, 63259, 25583, 56923, 19761, 63630, 25628, 37878, 16198, 43670, 55736, 17679, 61571, 7283, 35803, 14161, 41519, 53639, 32030, 59626, 5135, 33756, 11946, 23068, 51610, 30048, 57536, 3161, 47907, 9930, 21019, 49650, 27972, 39123, 2017, 45873, 56977, 19041, 63975, 25921, 36915, 16290, 43792, 55011, 17017, 38080, 1964, 45596, 11906, 55661, 30165, 57408, 37671, 3995, 47617, 22250, 49499, 32195, 59557, 39709, 14222, 41587, 24282, 51532};
        f21211k = -2272598556695591015L;
    }

    static void init$0() {
        $$c = new byte[]{108, -10, -111, 117};
        $$f = 249;
    }

    @Override // o.cg.f
    public final String a() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21212l + 21;
        f21213m = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            C((char) (ViewConfiguration.getScrollDefaultDelay() - 97), 8191 << (ViewConfiguration.getEdgeSlop() + 123), 45 << TextUtils.getOffsetAfter("", 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            C((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 248, 19 - TextUtils.getOffsetAfter("", 0), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f21212l + 49;
        f21213m = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // o.cg.f
    public final boolean c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21213m + 5;
        f21212l = i3 % 128;
        int i4 = i3 % 2;
        if (this.f21217i) {
            if (o.ea.f.a()) {
                int i5 = f21213m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f21212l = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                C((char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                C((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 26 - Color.blue(0), 67 - MotionEvent.axisFromString(""), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            g();
        } else if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            C((char) Drawable.resolveOpacity(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0'), 26 - View.combineMeasuredStates(0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            C((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 50213), TextUtils.indexOf("", "") + 94, ImageFormat.getBitsPerPixel(0) + 64, objArr4);
            o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
        }
        boolean zC = super.c();
        if (o.bu.e.a().d() != null) {
            o.bu.e.a().d().d(this.f22308d);
        }
        if (!zC) {
            return false;
        }
        int i7 = f.f22297a * (-1205835066);
        f.f22297a = i7;
        int iMyUid = Process.myUid();
        int priority = Thread.currentThread().getPriority();
        String str = (String) f.c(iMyUid, i7, (int) Process.getElapsedCpuTime(), priority, -1637849138, 1637849138, new Object[]{this});
        Object[] objArr5 = new Object[1];
        C((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42753), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 157, (ViewConfiguration.getEdgeSlop() >> 16) + 2, objArr5);
        if (!str.equals(((String) objArr5[0]).intern())) {
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                C((char) Color.blue(0), ViewConfiguration.getLongPressTimeout() >> 16, 26 - Drawable.resolveOpacity(0, 0), objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                C((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19141), 205 - TextUtils.indexOf((CharSequence) "", '0', 0), 42 - TextUtils.indexOf("", ""), objArr7);
                o.ea.f.c(strIntern3, ((String) objArr7[0]).intern());
            }
            this.f21216f.k();
            return true;
        }
        if (o.ea.f.a()) {
            Object[] objArr8 = new Object[1];
            C((char) Color.green(0), ViewConfiguration.getMaximumFlingVelocity() >> 16, TextUtils.indexOf((CharSequence) "", '0') + 27, objArr8);
            String strIntern4 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            C((char) (35402 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 159, 46 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            o.ea.f.c(strIntern4, ((String) objArr9[0]).intern());
        }
        this.f22309e = true;
        this.f21216f.l();
        return false;
    }

    @Override // o.cg.f
    public final void d() throws o.ef.b, o.bt.b, o.bu.c, o.bw.d {
        int i2 = 2 % 2;
        if (!this.f21217i) {
            int i3 = f21212l;
            int i4 = i3 + 7;
            f21213m = i4 % 128;
            z = !(i4 % 2 != 0);
            int i5 = i3 + 17;
            f21213m = i5 % 128;
            int i6 = i5 % 2;
        }
        e(z);
        l();
        m();
        o();
        n();
        k();
    }
}
