package o.az;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.l;
import o.ab.j;
import o.dd.g;
import o.ea.f;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends o.ab.e<c> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static int f20802f = 0;

    /* JADX INFO: renamed from: g */
    private static int[] f20803g = null;

    /* JADX INFO: renamed from: l */
    private static int f20804l = 0;

    /* JADX INFO: renamed from: m */
    private static int f20805m = 0;

    /* JADX INFO: renamed from: o */
    private static int f20806o = 0;

    /* JADX INFO: renamed from: j */
    protected final g f20807j;

    public interface c {
        void b(o.bg.c cVar, o.by.g gVar);

        void c(o.bg.c cVar, o.by.g gVar);
    }

    public static abstract class d<Command extends e> extends j<Command> {

        /* JADX INFO: renamed from: b */
        public static int f20808b = 1857795129;

        /* JADX INFO: renamed from: c */
        public static int f20809c = 21994900;

        /* JADX INFO: renamed from: d */
        private static int f20810d = 0;

        /* JADX INFO: renamed from: i */
        private static int f20811i = 1;

        public d(Command command) {
            super(command, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~((~i4) | i5);
            int i9 = ~i5;
            int i10 = ~i3;
            int i11 = ~((i9 + i10) - (i9 & i10));
            int i12 = (i11 + i8) - (i11 & i8);
            int i13 = i5 | i3;
            int i14 = i5 + i3 + i7 + ((-39394691) * i6) + ((-2104995841) * i2);
            int i15 = i14 * i14;
            int i16 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i3) + ((-1126725195) * i8) + (i12 * 1126725195) + (1126725195 * i13) + ((-754188288) * i7) + ((-1529085952) * i6) + ((-319553536) * i2) + ((-289079296) * i15);
            int i17 = ((i5 * 1773844906) - 1404835566) + (i3 * 1773844906) + (i8 * (-613)) + (i12 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i13 * IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME) + (i7 * 1773845519) + (i6 * 1055723859) + (i2 * 1996616689) + (i15 * (-1450508288));
            if (i16 + (i17 * i17 * (-778371072)) == 1) {
                return d(objArr);
            }
            d dVar = (d) objArr[0];
            o.bg.c cVar = (o.bg.c) objArr[1];
            int i18 = 2 % 2;
            int i19 = f20810d + 103;
            f20811i = i19 % 128;
            int i20 = i19 % 2;
            ((e) dVar.e()).g().b(cVar, dVar.i());
            int i21 = f20811i;
            int i22 = (i21 ^ 121) + ((i21 & 121) << 1);
            f20810d = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f20810d + 23;
            f20811i = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            int i4 = 72 / 0;
            return null;
        }

        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = f20809c * (-1232200860);
            f20809c = i2;
            int iNextInt = new Random().nextInt();
            int iMyUid = Process.myUid();
            a((int) SystemClock.uptimeMillis(), new Object[]{this, cVar}, 1168010318, i2, -1168010318, iMyUid, iNextInt);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20811i + 37;
            f20810d = i3 % 128;
            int i4 = i3 % 2;
            if (((e) e()).o()) {
                int i5 = f20811i;
                int i6 = ((-1) - (((-1) - i5) | ((-1) - 107))) + ((i5 + 107) - (i5 & 107));
                f20810d = i6 % 128;
                int i7 = i6 % 2;
                b bVarH = ((e) e()).h();
                Object[] objArr = {(e) e()};
                int i8 = 516688844 * o.ab.e.f20096d;
                o.ab.e.f20096d = i8;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i9 = 899848972 * o.ab.e.f20095c;
                o.ab.e.f20095c = i9;
                int i10 = 1346498534 * o.ab.e.f20094b;
                o.ab.e.f20094b = i10;
                Object[] objArr2 = {bVarH, (Context) o.ab.e.e(i8, objArr, i9, elapsedCpuTime, i10, -353890328, 353890328)};
                int i11 = o.c.a.f21922i * 1809095941;
                o.c.a.f21922i = i11;
                int i12 = o.c.a.f21923j * (-208500124);
                o.c.a.f21923j = i12;
                o.c.a.e(objArr2, 367855230, (int) Runtime.getRuntime().freeMemory(), i11, i12, -367855229, (int) SystemClock.uptimeMillis());
                int i13 = f20811i;
                int i14 = (i13 ^ 23) + (((-1) - (((-1) - i13) | ((-1) - 23))) << 1);
                f20810d = i14 % 128;
                int i15 = i14 % 2;
            }
            ((e) e()).d().e().a(((e) e()).f20807j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            System.identityHashCode(this);
            Process.getElapsedCpuTime();
            ((e) e()).g().c(cVar, i());
            int i3 = f20810d;
            int i4 = (i3 ^ 39) + (((i3 + 39) - (i3 | 39)) << 1);
            f20811i = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int iMyPid = Process.myPid();
            int iMyUid = Process.myUid();
            int i2 = f20808b * (-388570961);
            f20808b = i2;
            return (o.cg.j) a(Thread.currentThread().getPriority(), new Object[]{this}, 99779772, iMyPid, -99779771, i2, iMyUid);
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20810d + 115;
            f20811i = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r8, int r9, byte r10) {
        /*
            int r0 = r8 * 2
            int r8 = r0 + 4
            int r2 = r9 * 4
            int r1 = 1 - r2
            int r0 = r10 * 2
            int r0 = r0 + 117
            byte[] r7 = o.az.e.$$d
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r7 != 0) goto L2c
            r3 = r5
            r2 = r8
        L17:
            int r0 = -r0
            int r8 = r8 + r0
            int r2 = r2 + 1
            r1 = r3
        L1c:
            byte r0 = (byte) r8
            r6[r1] = r0
            int r3 = r1 + 1
            if (r1 != r4) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L29:
            r0 = r7[r2]
            goto L17
        L2c:
            r1 = r5
            r2 = r8
            r8 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.az.e.$$j(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20806o = 0;
        f20804l = 1;
        f20802f = 0;
        f20805m = 1;
        k();
        ViewConfiguration.getTapTimeout();
        int i2 = f20806o + 41;
        f20804l = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
    }

    public e(Context context, c cVar, b bVar, g gVar) {
        super(context, cVar, bVar, o.bg.e.f21115m);
        this.f20807j = gVar;
    }

    static void init$0() {
        $$d = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
        $$e = 136;
    }

    static void k() {
        f20803g = new int[]{-1064344409, 1988935091, -1326668284, -1460456190, -831865660, 1582364278, 882846365, 528499536, -646834794, -1203413306, -1759668364, 1293336140, 2029450788, -1879677260, -1600360780, 1983997836, 595393385, -1478874988};
    }

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f20803g;
        int i5 = 989264422;
        char c2 = '0';
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 9;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 59;
                $11 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objA = o.d.d.a(i5);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(674 - TextUtils.lastIndexOf("", c2, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.CR, -328001469, false, $$j(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    i5 = 989264422;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f20803g;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 47;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objA2 = o.d.d.a(676 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -328001469, false, $$j(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 674, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.lastIndexOf("", '0') + 13, -328001469, false, $$j(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        while (lVar.f19941d < iArr.length) {
            int i14 = $11 + 81;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i16 = 0;
            while (i16 < 16) {
                int i17 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    lVar.f19942e ^= iArr4[i16];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(300 - MotionEvent.axisFromString(""), (char) (ExpandableListView.getPackedPositionChild(0L) + 52698), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1416256172, false, $$j(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i16 += 27;
                } else {
                    lVar.f19942e ^= iArr4[i16];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objA5 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 301, (char) (MotionEvent.axisFromString("") + 52698), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1416256172, false, $$j(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i16++;
                }
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objA6 = o.d.d.a(230 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (51004 - TextUtils.getCapsMode("", 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 10, -330018025, false, $$j(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final void l() {
        int i2 = 2 % 2;
        int i3 = f20802f + 115;
        f20805m = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            q(new int[]{213076078, -413321044, -1837682876, -335995076, -81154828, 138831173, -984669749, 996251929, 1712547175, -597264510}, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q(new int[]{-718564068, -1645242233, -1248895184, -153718777, 128122785, -1651060262, 340945195, -713287249, -106867102, 664738880, -1526526855, -733660622, -1417422709, 1238485530}, 27 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f20807j).toString());
            int i5 = f20805m + 31;
            f20802f = i5 % 128;
            int i6 = i5 % 2;
        }
        a();
    }

    public final void m() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20802f + 49;
        f20805m = i3 % 128;
        if (i3 % 2 == 0) {
            f();
            int i4 = 47 / 0;
        } else {
            f();
        }
        int i5 = f20802f + 51;
        f20805m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    protected abstract boolean o();
}
