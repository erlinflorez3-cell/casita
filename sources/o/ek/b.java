package o.ek;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Random;
import o.ea.m;
import o.ep.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static int f24001a = 819429856;

    /* JADX INFO: renamed from: b */
    public static int f24002b = -977953632;

    /* JADX INFO: renamed from: c */
    public static int f24003c = -1504328254;

    /* JADX INFO: renamed from: d */
    public static int f24004d = -5295943;

    /* JADX INFO: renamed from: e */
    public static int f24005e = -161757847;

    /* JADX INFO: renamed from: f */
    public static int f24006f = -1939618985;

    /* JADX INFO: renamed from: j */
    private static int f24007j = 0;

    /* JADX INFO: renamed from: k */
    private static int f24008k = 1;

    /* JADX INFO: renamed from: g */
    private d f24009g;

    /* JADX INFO: renamed from: h */
    private final String f24010h;

    /* JADX INFO: renamed from: i */
    private f f24011i;

    static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static long f24012a = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f24013b = null;

        /* JADX INFO: renamed from: c */
        private static int f24014c = 0;

        /* JADX INFO: renamed from: d */
        private static int f24015d = 0;

        /* JADX INFO: renamed from: e */
        private static int f24016e = 0;

        /* JADX INFO: renamed from: i */
        private static int f24017i = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r7, int r8, short r9) {
            /*
                int r0 = r9 * 2
                int r6 = r0 + 4
                int r5 = r7 * 4
                int r1 = r5 + 1
                int r0 = r8 + 99
                byte[] r4 = o.ek.b.c.$$a
                byte[] r3 = new byte[r1]
                r1 = -1
                if (r4 != 0) goto L27
                r2 = r6
            L12:
                int r0 = -r0
                int r6 = r6 + r0
                int r2 = r2 + 1
            L16:
                int r1 = r1 + 1
                byte r0 = (byte) r6
                r3[r1] = r0
                if (r1 != r5) goto L24
                java.lang.String r1 = new java.lang.String
                r0 = 0
                r1.<init>(r3, r0)
                return r1
            L24:
                r0 = r4[r2]
                goto L12
            L27:
                r2 = r6
                r6 = r0
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ek.b.c.$$c(int, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24016e = 0;
            f24017i = 1;
            f24015d = 0;
            f24014c = 1;
            a();
            AndroidCharacter.getMirror('0');
            ExpandableListView.getPackedPositionForChild(0, 0);
            SystemClock.uptimeMillis();
            SystemClock.uptimeMillis();
            ExpandableListView.getPackedPositionForChild(0, 0);
            Gravity.getAbsoluteGravity(0, 0);
            KeyEvent.getMaxKeyCode();
            View.MeasureSpec.getMode(0);
            Color.rgb(0, 0, 0);
            ViewConfiguration.getScrollBarSize();
            ViewConfiguration.getMaximumDrawingCacheSize();
            TextUtils.indexOf("", "", 0, 0);
            int i2 = f24016e + 125;
            f24017i = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
        }

        static void a() {
            f24013b = new char[]{38033, 54941, 4252, 21180, 40067, 57040, 38022, 54937, 4252, 21173, 40121, 57077, 6344, 23284, 33985, 50915, 16, 16908, 35891, 52784, 2143, 19023, 46204, 63087, 12381, 29580, 48523, 65440, 14771, 31683, 28559, 11655, 60313, 43437, 26497, 9688, 58335, 41468, 32755, 15863, 64306, 47391, 30505, 13625, 62272, 45420, 20345, 3444, 52034, 34959, 18073, 1193, 49840, 32993, 24286, 38039, 54943, 4225, 21173, 40089, 57024, 6343, 23268, 34027, 50927, '*', 16903, 35889, 52769, 2136, 19059, 46182, 63101, 12410, 29581, 48537, 38043, 54930, 4248, 21177, 40102, 57053, 6338, 23216, 34033, 50936, 31, 16924, 35887, 52791, 2070, 19014, 46205, 63086, 12334, 29595, 48523, 65446, 14754, 31632, 42443, 59336, 8638, 25522, 44378, 38044, 54921, 4226, 21172};
            f24012a = 276911909950707452L;
        }

        static b d(o.ef.a aVar) throws Throwable {
            f fVarValueOf;
            int i2 = 2 % 2;
            int i3 = f24015d + 33;
            f24014c = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr = new Object[1];
                f((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 6 - KeyEvent.keyCodeFromString(""), objArr);
                Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
                int i5 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i5;
                String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
                Object[] objArr3 = new Object[1];
                f((char) (ViewConfiguration.getLongPressTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 7, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                String strS = aVar.s(((String) objArr3[0]).intern());
                d dVar = null;
                if (strS != null) {
                    try {
                        fVarValueOf = f.valueOf(strS);
                    } catch (IllegalArgumentException unused) {
                        fVarValueOf = (f) m.a(f.class, strS);
                    }
                } else {
                    fVarValueOf = null;
                }
                Object[] objArr4 = new Object[1];
                f((char) (Color.blue(0) + 64280), KeyEvent.keyCodeFromString("") + 30, TextUtils.lastIndexOf("", '0', 0, 0) + 26, objArr4);
                Object[] objArr5 = {aVar, ((String) objArr4[0]).intern(), null};
                int i6 = o.ef.a.f23773g * 1081559339;
                o.ef.a.f23773g = i6;
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i7 = (-1705304066) * o.ef.a.f23772f;
                o.ef.a.f23772f = i7;
                String str2 = (String) o.ef.a.a(1581939473, objArr5, i7, (int) SystemClock.uptimeMillis(), -1581939469, i6, iMaxMemory);
                Object[] objArr6 = new Object[1];
                f((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 54 - TextUtils.lastIndexOf("", '0', 0, 0), AndroidCharacter.getMirror('0') - 27, objArr6);
                o.ep.b bVar = (o.ep.b) aVar.b(o.ep.b.class, ((String) objArr6[0]).intern(), null);
                if (str2 != null) {
                    int i8 = f24015d + 43;
                    f24014c = i8 % 128;
                    int i9 = i8 % 2;
                    if (bVar != null) {
                        dVar = new d(str2, bVar);
                    }
                }
                return new b(str, fVarValueOf, dVar);
            } catch (IllegalArgumentException unused2) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr7 = new Object[1];
                f((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), '|' - AndroidCharacter.getMirror('0'), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
                StringBuilder sbAppend = sb.append(((String) objArr7[0]).intern());
                Object[] objArr8 = new Object[1];
                f((char) View.MeasureSpec.getSize(0), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, objArr8);
                String strIntern = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                f((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 105 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 4 - Color.green(0), objArr9);
                throw new o.ef.b(sbAppend.append(aVar.a(strIntern, ((String) objArr9[0]).intern())).toString());
            }
        }

        static o.ef.a e(b bVar) throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            f((char) View.resolveSizeAndState(0, 0, 0), Color.red(0), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) bVar.e());
            Object[] objArr2 = new Object[1];
            f((char) (KeyEvent.getMaxKeyCode() >> 16), Color.red(0) + 6, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i3 = b.f24004d * 569944664;
            b.f24004d = i3;
            int i4 = b.f24006f * (-1346157139);
            b.f24006f = i4;
            String strName = null;
            if (((f) b.d(610079497, new Random().nextInt(1924945379), i4, i3, (int) Runtime.getRuntime().totalMemory(), new Object[]{bVar}, -610079496)) != null) {
                int i5 = f24014c + 93;
                f24015d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = b.f24004d * 569944664;
                    b.f24004d = i6;
                    int i7 = b.f24006f * (-1346157139);
                    b.f24006f = i7;
                    ((f) b.d(610079497, new Random().nextInt(1924945379), i7, i6, (int) Runtime.getRuntime().totalMemory(), new Object[]{bVar}, -610079496)).name();
                    throw null;
                }
                int i8 = b.f24004d * 569944664;
                b.f24004d = i8;
                int i9 = b.f24006f * (-1346157139);
                b.f24006f = i9;
                strName = ((f) b.d(610079497, new Random().nextInt(1924945379), i9, i8, (int) Runtime.getRuntime().totalMemory(), new Object[]{bVar}, -610079496)).name();
            }
            aVar.a(strIntern, (Object) strName);
            int i10 = b.f24002b * (-62673846);
            b.f24002b = i10;
            int i11 = b.f24001a * 807637659;
            b.f24001a = i11;
            int i12 = b.f24005e * 1657864810;
            b.f24005e = i12;
            int i13 = b.f24003c * 22404768;
            b.f24003c = i13;
            if (((d) b.d(723456885, i12, i11, i10, i13, new Object[]{bVar}, -723456885)) != null) {
                int i14 = f24014c + 73;
                f24015d = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr3 = new Object[1];
                f((char) (TextUtils.getOffsetBefore("", 0) + 64280), 30 - (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 25, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                int i16 = b.f24002b * (-62673846);
                b.f24002b = i16;
                int i17 = b.f24001a * 807637659;
                b.f24001a = i17;
                int i18 = b.f24005e * 1657864810;
                b.f24005e = i18;
                int i19 = b.f24003c * 22404768;
                b.f24003c = i19;
                aVar.a(strIntern2, (Object) ((d) b.d(723456885, i18, i17, i16, i19, new Object[]{bVar}, -723456885)).d());
                Object[] objArr4 = new Object[1];
                f((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 'g' - AndroidCharacter.getMirror('0'), 22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
                String strIntern3 = ((String) objArr4[0]).intern();
                int i20 = b.f24002b * (-62673846);
                b.f24002b = i20;
                int i21 = b.f24001a * 807637659;
                b.f24001a = i21;
                int i22 = b.f24005e * 1657864810;
                b.f24005e = i22;
                int i23 = b.f24003c * 22404768;
                b.f24003c = i23;
                aVar.a(strIntern3, (Object) ((d) b.d(723456885, i22, i21, i20, i23, new Object[]{bVar}, -723456885)).e().a());
            }
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(char r21, int r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ek.b.c.f(char, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{35, 9, MessagePack.Code.STR32, -91};
            $$b = 186;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b */
        private static int f24018b = 1;

        /* JADX INFO: renamed from: e */
        private static int f24019e = 0;

        /* JADX INFO: renamed from: c */
        private final o.ep.b f24020c;

        /* JADX INFO: renamed from: d */
        private final String f24021d;

        public d(String str, o.ep.b bVar) {
            this.f24021d = str;
            this.f24020c = bVar;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f24019e;
            int i4 = (i3 ^ 121) + (((i3 + 121) - (i3 | 121)) << 1);
            int i5 = i4 % 128;
            f24018b = i5;
            int i6 = i4 % 2;
            String str = this.f24021d;
            int i7 = i5 + 123;
            f24019e = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }

        public final o.ep.b e() {
            int i2 = 2 % 2;
            int i3 = f24019e;
            int i4 = (i3 ^ 73) + (((-1) - (((-1) - i3) | ((-1) - 73))) << 1);
            int i5 = i4 % 128;
            f24018b = i5;
            int i6 = i4 % 2;
            o.ep.b bVar = this.f24020c;
            int i7 = i5 + 57;
            f24019e = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 76 / 0;
            }
            return bVar;
        }
    }

    b(String str, f fVar, d dVar) {
        this.f24010h = str;
        this.f24011i = fVar;
        this.f24009g = dVar;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24007j;
        int i4 = (i3 ^ 77) + (((-1) - (((-1) - i3) | ((-1) - 77))) << 1);
        f24008k = i4 % 128;
        int i5 = i4 % 2;
        d dVar = bVar.f24009g;
        if (i5 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i2;
        int i9 = (i8 + i7) - (i8 & i7);
        int i10 = ~((i9 + i5) - (i9 & i5));
        int i11 = ~((-1) - (((-1) - (~i7)) & ((-1) - i2)));
        int i12 = ~i5;
        int i13 = i11 | (~(i12 | i2));
        int i14 = ~((-1) - (((-1) - i12) & ((-1) - i7)));
        int i15 = i2 + i7 + i4 + ((-1568348280) * i3) + (1617068012 * i6);
        int i16 = i15 * i15;
        int i17 = (((-430874860) * i2) - 739508224) + (1544986862 * i7) + (i10 * 987930861) + ((-987930861) * i13) + (987930861 * i14) + (557056000 * i4) + ((-1885339648) * i3) + (1743781888 * i6) + (858456064 * i16);
        int i18 = (i2 * (-973781596)) + 539565670 + (i7 * (-973779706)) + (i10 * 945) + (i13 * (-945)) + (i14 * 945) + (i4 * (-973780651)) + (i3 * 424585256) + (i6 * 537576796) + (i16 * 1078394880);
        return i17 + ((i18 * i18) * 192741376) != 1 ? a(objArr) : d(objArr);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24008k;
        int i4 = (i3 & 51) + ((-1) - (((-1) - i3) & ((-1) - 51)));
        int i5 = i4 % 128;
        f24007j = i5;
        int i6 = i4 % 2;
        f fVar = bVar.f24011i;
        int i7 = i5 + 37;
        f24008k = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 92 / 0;
        }
        return fVar;
    }

    public final d c() {
        int i2 = f24002b * (-62673846);
        f24002b = i2;
        int i3 = f24001a * 807637659;
        f24001a = i3;
        int i4 = 1657864810 * f24005e;
        f24005e = i4;
        int i5 = 22404768 * f24003c;
        f24003c = i5;
        return (d) d(723456885, i4, i3, i2, i5, new Object[]{this}, -723456885);
    }

    public final f d() {
        int i2 = f24004d * 569944664;
        f24004d = i2;
        int i3 = f24006f * (-1346157139);
        f24006f = i3;
        return (f) d(610079497, new Random().nextInt(1924945379), i3, i2, (int) Runtime.getRuntime().totalMemory(), new Object[]{this}, -610079496);
    }

    public final void d(d dVar) {
        int i2 = 2 % 2;
        int i3 = f24007j;
        int i4 = (i3 & 123) + (i3 | 123);
        int i5 = i4 % 128;
        f24008k = i5;
        int i6 = i4 % 2;
        this.f24009g = dVar;
        int i7 = i5 + 95;
        f24007j = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void d(f fVar) {
        int i2 = 2 % 2;
        int i3 = f24007j;
        int i4 = i3 + 73;
        f24008k = i4 % 128;
        if (i4 % 2 == 0) {
            this.f24011i = fVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f24011i = fVar;
        int i5 = (((i3 + 77) - (77 & i3)) << 1) - (i3 ^ 77);
        f24008k = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f24008k + 37;
        int i4 = i3 % 128;
        f24007j = i4;
        int i5 = i3 % 2;
        String str = this.f24010h;
        int i6 = (i4 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED) + ((i4 & PanasonicMakernoteDirectory.TAG_BURST_SPEED) << 1);
        f24008k = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return str;
    }
}
