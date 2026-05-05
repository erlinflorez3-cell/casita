package o.bc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.h;
import o.ab.e;
import o.ab.j;
import o.cg.f;
import o.ef.a;
import o.fm.g;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<InterfaceC0338b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f20877f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20878g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20879j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static byte[] f20880k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20881l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static short[] f20882m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20883n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20884o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20885r = 0;

    /* JADX INFO: renamed from: o.bc.b$b, reason: collision with other inner class name */
    public interface InterfaceC0338b {
        void d(o.bg.c cVar);

        void e(o.bg.c cVar);
    }

    static final class c extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20886b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20887c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20888d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static char f20889f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f20890g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f20891h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f20892i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20893j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20894k = 0;

        private static String $$d(byte b2, int i2, int i3) {
            byte[] bArr = $$a;
            int i4 = 4 - (i3 * 2);
            int i5 = i2 + 102;
            int i6 = b2 * 3;
            byte[] bArr2 = new byte[i6 + 1];
            int i7 = -1;
            if (bArr == null) {
                i5 = (-i5) + i6;
                i4++;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i5;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i5 = (-bArr[i4]) + i5;
                i4++;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20890g = 859566141;
            f20892i = 468364565;
            f20887c = -1543598223;
            f20888d = 1520607541;
            f20886b = -785574387;
            f20893j = 0;
            f20894k = 1;
            f20891h = new char[]{64528, 64531, 64576, 64582, 64614, 64535, 64624, 64592, 64579, 64578, 64597, 64541, 64587, 64540, 64522, 64595, 64630, 64577, 64585, 64609, 64525, 64527, 64631, 64598, 64583, 64586, 64526, 64593, 64599, 64588, 64523, 64532, 64534, 64524, 64580, 64584};
            f20889f = (char) 51641;
        }

        c(b bVar) {
            super(bVar, true);
        }

        public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) throws Throwable {
            int i8 = (i6 + i3) - (i6 & i3);
            int i9 = ~i3;
            int i10 = ~i2;
            int i11 = ~((-1) - (((-1) - i9) & ((-1) - i10)));
            int i12 = ~i6;
            int i13 = (-1) - (((-1) - i11) & ((-1) - (~((-1) - (((-1) - i12) & ((-1) - i2))))));
            int i14 = ~((i10 + i6) - (i10 & i6));
            int i15 = (-1) - (((-1) - i13) & ((-1) - i14));
            int i16 = ~(i2 | ((-1) - (((-1) - i12) & ((-1) - i3))));
            int i17 = (i16 + i14) - (i16 & i14);
            int i18 = i6 + i3 + i7 + (1881146393 * i4) + ((-1035018111) * i5);
            int i19 = i18 * i18;
            int i20 = (i6 * (-928100048)) + 945860906 + (i3 * (-928100048)) + (i8 * (-189)) + (i15 * (-189)) + (i17 * 189) + (i7 * (-928100237)) + (i4 * (-1331189957)) + (i5 * 1329932787) + (i19 * 1550319616);
            if (((i6 * (-1924067824)) - 304087040) + ((-1924067824) * i3) + (i8 * (-674303503)) + ((-674303503) * i15) + (674303503 * i17) + (1696595968 * i7) + (1612709888 * i4) + ((-182452224) * i5) + ((-1611137024) * i19) + (i20 * i20 * 1690828800) != 1) {
                return e(objArr);
            }
            c cVar = (c) objArr[0];
            int i21 = 2 % 2;
            a aVar = new a();
            Object[] objArr2 = new Object[1];
            v((ViewConfiguration.getFadingEdgeLength() >> 16) + 18, "\u0016\u001e\u0015\u001d\u0014\u0004\u0004\u0003\u001b\u0011\u0005\u000e\u0007\u000b\u0010#\u001a\u0003", (byte) (15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = {cVar.j()};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int priority = Thread.currentThread().getPriority();
            int i22 = o.en.b.f24088c * (-1721916949);
            o.en.b.f24088c = i22;
            Object[] objArr4 = {(g) o.en.b.a(-568976488, elapsedCpuTime, objArr3, iUptimeMillis, 568976490, priority, i22)};
            int i23 = g.f26061f * 390633709;
            g.f26061f = i23;
            aVar.a(strIntern, (Long) g.b((int) Thread.currentThread().getId(), new Random().nextInt(983859859), Thread.activeCount(), i23, 540695712, -540695709, objArr4));
            Object[] objArr5 = new Object[1];
            v(View.MeasureSpec.makeMeasureSpec(0, 0) + 22, "\u0007\u001a\u001b\u0004\u0001\u0014\u001b\u000b\u0018\u001c\u001e\u0016\n\u0004\u001d\u0010\u0007\u000b\u0010#\u001a\u0003", (byte) (57 - View.resolveSize(0, 0)), objArr5);
            aVar.b(((String) objArr5[0]).intern(), true);
            int i24 = f20894k + 103;
            f20893j = i24 % 128;
            int i25 = i24 % 2;
            return aVar;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f20893j;
            int i4 = i3 + 49;
            f20894k = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            int i6 = i3 + 111;
            f20894k = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
            $$b = 26;
        }

        private static void v(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i6 = $11 + 49;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            h hVar = new h();
            char[] cArr2 = f20891h;
            int i8 = 421932776;
            float f2 = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 77;
                    $10 = i10 % 128;
                    int i11 = i10 % i4;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objA = o.d.d.a(i8);
                        if (objA == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA = o.d.d.a(271 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -811348851, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9++;
                        i4 = 2;
                        i8 = 421932776;
                        f2 = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(f20889f)};
            Object objA2 = o.d.d.a(421932776);
            char c2 = '\n';
            if (objA2 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objA2 = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 270, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 10 - TextUtils.indexOf((CharSequence) "", '0'), -811348851, false, $$d(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i12 = $11 + 81;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + 1];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = hVar;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[c2] = hVar;
                        objArr4[9] = hVar;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = hVar;
                        objArr4[6] = hVar;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = hVar;
                        objArr4[3] = hVar;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = hVar;
                        objArr4[0] = hVar;
                        Object objA3 = o.d.d.a(219124184);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            objA3 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 824, (char) KeyEvent.keyCodeFromString(""), MotionEvent.axisFromString("") + 12, -611683395, false, $$d(b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 9))), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                            Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA4 = o.d.d.a(-634864343);
                            if (objA4 == null) {
                                byte b8 = (byte) 0;
                                c2 = '\n';
                                objA4 = o.d.d.a(218 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Color.alpha(0), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), 212688716, false, $$d(b8, (byte) (7 | b8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = '\n';
                            }
                            int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                            int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i14];
                        } else {
                            c2 = '\n';
                            if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i15 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i15];
                                cArr4[hVar.f19926b + 1] = cArr2[i16];
                            } else {
                                int i17 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i18 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i17];
                                cArr4[hVar.f19926b + 1] = cArr2[i18];
                            }
                        }
                    }
                    hVar.f19926b += 2;
                }
            }
            for (int i19 = 0; i19 < i2; i19++) {
                int i20 = $11 + 77;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            String str3 = new String(cArr4);
            int i22 = $11 + 51;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            objArr[0] = str3;
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v(19 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u001e\u0002\u0007\u0013\u0005\u0006\f\u0001\u0002#\u0001\u0011\u0001\u001e\b#\f\u0001㗷", (byte) (74 - TextUtils.indexOf((CharSequence) "", '0')), objArr);
            o.cg.b bVar = new o.cg.b(context, 3, ((String) objArr[0]).intern());
            int i3 = f20893j + 61;
            f20894k = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        @Override // o.ab.j
        public final void a(a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20894k + 5;
            f20893j = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20894k + 89;
            f20893j = i3 % 128;
            int i4 = i3 % 2;
            ((b) e()).g().e(cVar);
            int i5 = f20894k + 117;
            f20893j = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20894k + 25;
            f20893j = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                ((b) e()).g().d(cVar);
                obj.hashCode();
                throw null;
            }
            ((b) e()).g().d(cVar);
            int i4 = f20893j + 57;
            f20894k = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void e(a aVar) throws Throwable {
            a aVarD;
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20893j + 75;
            f20894k = i3 % 128;
            if (i3 % 2 == 0) {
                aVarD = j().e().d();
                Object[] objArr = new Object[1];
                v(126 >> TextUtils.lastIndexOf("", '2', 0, 1), "\u001f\u001d\u0019\u0018\u0014\u0000\u000f\u001c!\u001c\u000b\u0013", (byte) (PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION % (ViewConfiguration.getTouchSlop() >> 48)), objArr);
                obj = objArr[0];
            } else {
                aVarD = j().e().d();
                Object[] objArr2 = new Object[1];
                v(TextUtils.lastIndexOf("", '0', 0, 0) + 13, "\u001f\u001d\u0019\u0018\u0014\u0000\u000f\u001c!\u001c\u000b\u0013", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 41), objArr2);
                obj = objArr2[0];
            }
            aVar.a(((String) obj).intern(), aVarD);
            int i4 = f20893j + 3;
            f20894k = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20894k + 115;
            int i4 = i3 % 128;
            f20893j = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 97;
            f20894k = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final a m() throws o.ef.b {
            int i2 = f20888d * (-1107658117);
            f20888d = i2;
            int i3 = f20887c * 1723785710;
            f20887c = i3;
            int i4 = (-1788670181) * f20892i;
            f20892i = i4;
            int i5 = (-2132034646) * f20890g;
            f20890g = i5;
            return (a) c(i2, -797356193, i4, new Object[]{this}, i5, 797356194, i3);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20893j + 85;
            f20894k = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v(4 - Gravity.getAbsoluteGravity(0, 0), "\u000b\u001c\u000f\u0006", (byte) (80 - Color.red(0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20894k + 65;
            f20893j = i5 % 128;
            if (i5 % 2 == 0) {
                return strIntern;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int priority = Thread.currentThread().getPriority();
            int iMyUid = Process.myUid();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = (-501649781) * f20886b;
            f20886b = i2;
            return (byte[][]) c(priority, 358234591, elapsedCpuTime, new Object[]{this}, i2, -358234591, iMyUid);
        }

        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            j().e().f().e(new o.dk.a(h()));
            int i3 = f20894k + 23;
            f20893j = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 16 / 0;
            }
        }

        @Override // o.ab.j
        public final void t() throws Throwable {
            int i2 = 2 % 2;
            o.dj.c.c(h());
            j().e().f().e(new o.dk.a(h()));
            int i3 = f20894k + 111;
            f20893j = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, short r9, int r10) {
        /*
            int r7 = r10 * 4
            int r1 = r7 + 1
            int r0 = r8 * 3
            int r6 = r0 + 4
            int r5 = 104 - r9
            byte[] r4 = o.bc.b.$$d
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L27
            r0 = r7
            r1 = r2
        L13:
            int r0 = -r0
            int r5 = r5 + r0
            int r6 = r6 + 1
        L17:
            byte r0 = (byte) r5
            r3[r1] = r0
            if (r1 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r4[r6]
            goto L13
        L27:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bc.b.$$j(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20884o = 0;
        f20885r = 1;
        f20883n = 0;
        f20881l = 1;
        k();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        SystemClock.currentThreadTimeMillis();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        View.MeasureSpec.getSize(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionType(0L);
        View.getDefaultSize(0, 0);
        int i2 = f20885r + 107;
        f20884o = i2 % 128;
        int i3 = i2 % 2;
    }

    public b(Context context, InterfaceC0338b interfaceC0338b, o.en.b bVar) {
        super(context, interfaceC0338b, bVar, o.bg.e.f21115m);
    }

    static void init$0() {
        $$d = new byte[]{75, Utf8.REPLACEMENT_BYTE, 5, -84};
        $$e = 137;
    }

    static void k() {
        f20879j = -386064984;
        f20878g = 1150422418;
        f20877f = -397368765;
        f20880k = new byte[]{117, 123, -128, 121, -115, 115, -95, 81, 116, -120, -108, 97, 114, 126, -128, 115, -115, 115, 122, -109, 105, -115, -94, 104, 116, -120, 116};
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bc.b.q(short, int, int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        c cVar = new c(this);
        int i3 = f20881l + 31;
        f20883n = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20881l + 1;
        f20883n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1402007515 - TextUtils.getOffsetBefore("", 0), 1396527219 + TextUtils.getOffsetAfter("", 0), (-32) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) TextUtils.getTrimmedLength(""), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20883n + 113;
        f20881l = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final void o() {
        int i2 = 2 % 2;
        int i3 = f20881l + 77;
        f20883n = i3 % 128;
        if (i3 % 2 != 0) {
            a();
            int i4 = 68 / 0;
        } else {
            a();
        }
        int i5 = f20881l + 89;
        f20883n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }
}
