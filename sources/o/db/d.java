package o.db;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Currency;
import o.a.o;
import o.en.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22739a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22740b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22741c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f22742d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22743e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22744h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, int r11) {
        /*
            int r0 = r11 * 3
            int r8 = 4 - r0
            int r2 = r9 * 2
            int r1 = 1 - r2
            byte[] r7 = o.db.d.$$a
            int r0 = 105 - r10
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2b
            r3 = r5
            r2 = r4
        L15:
            int r8 = r8 + 1
            int r0 = -r0
            int r0 = r0 + r2
        L19:
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r3 != r4) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            int r3 = r3 + 1
            r1 = r7[r8]
            r2 = r0
            r0 = r1
            goto L15
        L2b:
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.d.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22743e = 0;
        f22744h = 1;
        f22741c = 0;
        f22739a = 1;
        c();
        Process.getElapsedCpuTime();
        ViewConfiguration.getKeyRepeatDelay();
        ExpandableListView.getPackedPositionChild(0L);
        int i2 = f22744h + 107;
        f22743e = i2 % 128;
        int i3 = i2 % 2;
    }

    static void c() {
        f22740b = new char[]{54156, 48835, 2427, 39909, 26140, 61625, 17178, 11857, 47297, 2920, 38301, 24598, 38043, 63984, 20057, 56514, 8483, 46976, 1038, 26991, 65523, 19530, 53923, 10040, 46469, 6830, 28534, 64969, 16977, 53439, 9478, 35731, 6306, 27976, 62408, 16425, 54975, 15198, 34880, 7877, 25453, 61824, 18042, 54400, 14619, 36466, 7375, 39436, 63350, 16581, 53849, 12218, 47389, 2692, 26594, 61772, 17100, 56371, 10670, 15975, 21277, 58542, 30258, 35793, 7542, 44783, 50057, 21828, 59051, 30803, 36292, 8049, 45144, 50562, 22335, 59568, 31240, 36847, 8565, 45572, 51112, 22819, 60098, 31824, 37357, 8856, 38072, 63981, 20037, 56536, 8546, 47019, 1026, 26981, 65527, 19534, 53950, 10047, 46477, 6880, 28474, 64963, 16988, 53437, 9477, 35715, 6380, 27994, 62431, 16436, 54967, 15130, 34858, 7905, 25418, 61863, 17974, 54403, 14674, 36462, 7384, 24921, 63393, 17419, 43657, 16373, 35963, 4816, 26413, 62966, 23054, 44897, 15865, 33351, 4318, 25915, 52170, 22604, 44322};
        f22742d = -8630234585417516642L;
    }

    public static o.fm.b e(o.ef.a aVar) throws f {
        int i2 = 2 % 2;
        int i3 = f22741c + 97;
        f22739a = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f((char) (18226 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0), KeyEvent.getDeadChar(0, 0) + 12, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 13, 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            Object[] objArr3 = new Object[1];
            f((char) (3741 - View.getDefaultSize(0, 0)), ImageFormat.getBitsPerPixel(0) + 48, View.MeasureSpec.makeMeasureSpec(0, 0) + 12, objArr3);
            Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            try {
                Currency currency = Currency.getInstance((String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
                int i6 = f22739a + 81;
                f22741c = i6 % 128;
                int i7 = i6 % 2;
                return new o.fm.b(currency);
            } catch (IllegalArgumentException unused) {
                Object[] objArr5 = new Object[1];
                f((char) (43766 - View.getDefaultSize(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 59, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, objArr5);
                throw new f(((String) objArr5[0]).intern());
            }
        } catch (o.ef.b e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            f((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 86, 52 - TextUtils.indexOf((CharSequence) "", '0'), objArr6);
            throw new f(sb.append(((String) objArr6[0]).intern()).append(e2.getMessage()).toString());
        }
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f22740b[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 741, (char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 13, 632508977, false, $$c(b2, (byte) (6 | b2), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f22742d), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 5);
                    objA2 = o.d.d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 765, (char) (12470 - Color.blue(0)), 12 - Color.blue(0), 1946853218, false, $$c(b3, b4, (byte) (b4 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 18 - KeyEvent.keyCodeFromString(""), 39570797, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA4 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 387, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 18, 39570797, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $11 + 117;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.EM, -93, 95, -122};
        $$b = 30;
    }
}
