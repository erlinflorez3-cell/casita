package o.ax;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.l;
import o.a.n;
import o.ab.j;
import o.bg.c;
import o.cg.f;
import o.ep.h;
import o.i.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.ab.e<b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static final byte[] $$l = null;
    private static final int $$m = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20740m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f20741n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20742o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f20743p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f20744q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20745r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20746s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f20747t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f20748v = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f20749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20750g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    h f20751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f20752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f20753l;

    /* JADX INFO: renamed from: o.ax.e$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20754b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20755c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f20756d;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20756d = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20754b + 77;
                f20755c = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20756d[o.bg.a.aB.ordinal()] = 2;
                int i5 = f20755c;
                int i6 = ((i5 + 11) - (11 | i5)) + ((-1) - (((-1) - i5) & ((-1) - 11)));
                f20754b = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class a extends j<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20757b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20758c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20759d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20760f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char[] f20761g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f20762h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int[] f20763i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f20764j = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f20765o = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static int f20766v = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(int r6, short r7, short r8) {
            /*
                int r0 = 121 - r6
                int r3 = r8 * 4
                int r2 = 1 - r3
                int r1 = r7 * 2
                int r8 = r1 + 4
                byte[] r7 = o.ax.e.a.$$k
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r7 != 0) goto L2e
                r1 = r8
                r3 = r4
                r2 = r5
            L16:
                int r0 = -r3
                int r8 = r8 + r0
                int r1 = r1 + 1
                r0 = r8
                r8 = r1
            L1c:
                byte r1 = (byte) r0
                r6[r2] = r1
                if (r2 != r4) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L27:
                int r2 = r2 + 1
                r3 = r7[r8]
                r1 = r8
                r8 = r0
                goto L16
            L2e:
                r2 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ax.e.a.$$m(int, short, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f20766v = 269997020;
            init$0();
            f20764j = -845896467;
            f20757b = 1987446577;
            f20759d = 1203996123;
            f20758c = 1571371831;
            f20760f = 0;
            f20765o = 1;
            f20763i = new int[]{1286577453, 1136558709, 1473056054, 1854655445, 1633468964, 1653077958, 1260290544, 1845125445, -285424865, 1245169326, 42583553, 1536470485, 1971117719, -771556546, 838357163, 233598993, 138208733, 1672969354};
            f20761g = new char[]{51643, 64599, 64582, 64580, 51644, 51645, 64620, 51646, 64577};
            f20762h = (char) 51644;
        }

        a(e eVar) {
            super(eVar, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void A(int r30, java.lang.String r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 880
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ax.e.a.A(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void B(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r2 = r8 * 3
                int r1 = 1 - r2
                int r0 = r7 * 5
                int r8 = r0 + 101
                byte[] r7 = o.ax.e.a.$$a
                int r0 = r6 * 2
                int r6 = r0 + 4
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L32
                r2 = r6
                r0 = r3
                r1 = r4
            L18:
                int r0 = -r0
                int r6 = r6 + r0
                int r0 = r2 + 1
                r8 = r6
                r6 = r0
            L1e:
                byte r0 = (byte) r8
                r5[r1] = r0
                if (r1 != r3) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r9[r4] = r0
                return
            L2b:
                int r1 = r1 + 1
                r0 = r7[r6]
                r2 = r6
                r6 = r8
                goto L18
            L32:
                r1 = r4
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ax.e.a.B(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r3 = r8 * 5
                int r2 = 6 - r3
                int r0 = r6 * 12
                int r0 = r0 + 99
                int r1 = r7 * 5
                int r8 = r1 + 4
                byte[] r7 = o.ax.e.a.$$d
                byte[] r6 = new byte[r2]
                int r5 = 5 - r3
                r4 = 0
                if (r7 != 0) goto L31
                r1 = r8
                r3 = r5
                r2 = r4
            L18:
                int r8 = r8 + r3
                int r0 = r8 + (-4)
                int r8 = r1 + 1
            L1d:
                byte r1 = (byte) r0
                r6[r2] = r1
                if (r2 != r5) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r4)
                r9[r4] = r0
                return
            L2a:
                int r2 = r2 + 1
                r3 = r7[r8]
                r1 = r8
                r8 = r0
                goto L18
            L31:
                r2 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ax.e.a.E(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~i4;
            int i9 = ~(i8 | i5);
            int i10 = ~((i6 + i5) - (i6 & i5));
            int i11 = (-1) - (((-1) - i9) & ((-1) - i10));
            int i12 = ~i6;
            int i13 = ~i5;
            int i14 = ~((-1) - (((-1) - ((-1) - (((-1) - i12) & ((-1) - i13)))) & ((-1) - i4)));
            int i15 = (i11 + i14) - (i11 & i14);
            int i16 = (-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i6)))))))) & ((-1) - i10));
            int i17 = (-1) - (((-1) - ((-1) - (((-1) - (~((i5 + i4) - (i5 & i4)))) & ((-1) - (~(i12 | i5)))))) & ((-1) - (~((i8 | i13) | i6))));
            int i18 = i4 + i6 + i2 + (1880080305 * i3) + (458392769 * i7);
            int i19 = i18 * i18;
            int i20 = ((766573918 * i4) - Integer.MIN_VALUE) + (1582236324 * i6) + (i15 * (-407831203)) + (815662406 * i16) + ((-407831203) * i17) + (1174405120 * i2) + (1711276032 * i3) + ((-973078528) * i7) + (68288512 * i19);
            int i21 = ((i4 * 319678698) - 2002258816) + (i6 * 319678284) + (i15 * 207) + (i16 * (-414)) + (i17 * 207) + (i2 * 319678491) + (i3 * (-161570901)) + (i7 * (-1160779685)) + (i19 * (-1109000192));
            if (i20 + (i21 * i21 * (-1432485888)) == 1) {
                return b(objArr);
            }
            a aVar = (a) objArr[0];
            int i22 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((e) aVar.e()).f20750g, ((e) aVar.e()).f20749f);
            int i23 = f20765o + 65;
            f20760f = i23 % 128;
            int i24 = i23 % 2;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
            a aVar = (a) objArr[0];
            o.ef.a aVar2 = (o.ef.a) objArr[1];
            int i2 = 2 % 2;
            int i3 = f20765o + 69;
            f20760f = i3 % 128;
            int i4 = i3 % 2;
            e eVar = (e) aVar.e();
            Object[] objArr2 = new Object[1];
            z(new int[]{-579033506, 871258942, -983870547, -755496325, 564524882, 313267310}, 11 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            Object[] objArr3 = {aVar2, ((String) objArr2[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            eVar.f20753l = (String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            int i6 = f20765o + 49;
            f20760f = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 30 / 0;
            }
            return null;
        }

        static void init$0() {
            $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
            $$b = 125;
        }

        static void init$1() {
            $$d = new byte[]{106, 120, -13, -92, MessagePack.Code.TRUE, 60, 8, MessagePack.Code.EXT16, 57};
            $$e = 247;
        }

        static void init$2() {
            $$k = new byte[]{124, 69, -84, MessagePack.Code.STR8};
            $$l = 184;
        }

        private static void z(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f20763i;
            int i5 = 989264422;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int i8 = $10 + 87;
                int i9 = i8 % 128;
                $11 = i9;
                if (i8 % 2 == 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                }
                int i10 = i9 + 93;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = $10 + 79;
                    $11 = i13 % 128;
                    if (i13 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i12])};
                            Object objA = o.d.d.a(i5);
                            if (objA == null) {
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                objA = o.d.d.a(MotionEvent.axisFromString("") + 676, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, -328001469, false, $$m(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr2[i12] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                            i12 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i12])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(676 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "") + 12, -328001469, false, $$m(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr2[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i12++;
                    }
                    i3 = 2;
                    i5 = 989264422;
                    i7 = 0;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f20763i;
            if (iArr5 != null) {
                int i14 = $11 + 33;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i16 = 0;
                while (i16 < length3) {
                    int i17 = $11 + 47;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 675, (char) (TextUtils.indexOf((CharSequence) "", '0') + i6), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, -328001469, false, $$m(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i16] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i16++;
                    i6 = 1;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            lVar.f19941d = 0;
            int i19 = $10 + 57;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 4 % 3;
            }
            while (lVar.f19941d < iArr.length) {
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i21 = 0;
                for (int i22 = 16; i21 < i22; i22 = 16) {
                    lVar.f19942e ^= iArr4[i21];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 2;
                        byte b9 = (byte) (b8 - 2);
                        objA4 = o.d.d.a(300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 52697), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1416256172, false, $$m(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i21++;
                }
                int i23 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i23;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i24 = lVar.f19942e;
                int i25 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr6 = {lVar, lVar};
                Object objA5 = o.d.d.a(986820978);
                if (objA5 == null) {
                    int i26 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 229;
                    char minimumFlingVelocity = (char) (51004 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int scrollDefaultDelay = 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte length4 = (byte) $$k.length;
                    byte b10 = (byte) (length4 - 4);
                    objA5 = o.d.d.a(i26, minimumFlingVelocity, scrollDefaultDelay, -330018025, false, $$m(length4, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            z(new int[]{1233596881, -1039666140, -2076558177, -1056962818, 341382800, -590121752, -45160408, 420024598, -469049062, -1893596274}, ((Process.getThreadPriority(0) + 20) >> 6) + 19, objArr);
            o.cg.b bVar = new o.cg.b(context, 40, ((String) objArr[0]).intern());
            int i3 = f20765o + 107;
            f20760f = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = f20759d * 125863675;
            f20759d = i2;
            int i3 = (-119708988) * f20757b;
            f20757b = i3;
            int i4 = 1718633555 * f20764j;
            f20764j = i4;
            b(i3, i4, 1661942639, i2, new Object[]{this, aVar}, -1661942638, (int) SystemClock.uptimeMillis());
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20760f + 115;
            f20765o = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 5001) {
                return o.bg.a.aA;
            }
            if (i2 != 5002) {
                return super.b(i2);
            }
            o.bg.a aVar = o.bg.a.aB;
            int i6 = f20765o + 95;
            f20760f = i6 % 128;
            int i7 = i6 % 2;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x01ea  */
        @Override // o.ab.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o.bg.c r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1006
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ax.e.a.b(o.bg.c):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20760f + 107;
            f20765o = i3 % 128;
            int i4 = i3 % 2;
            ((e) e()).g().b(((e) e()).f20753l);
            int i5 = f20765o + 97;
            f20760f = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int iMyPid = Process.myPid();
            int iMyTid = Process.myTid();
            int i2 = f20758c * (-1242380105);
            f20758c = i2;
            return (o.cg.j) b(iMyTid, i2, 28747800, iMyPid, new Object[]{this}, -28747800, (int) Runtime.getRuntime().freeMemory());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            z(new int[]{-162584509, 158593403}, 2 - TextUtils.indexOf("", "", 0), objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((e) e()).f20751j.a());
            Object[] objArr2 = new Object[1];
            A(((byte) KeyEvent.getModifierMetaStateMask()) + 7, "\u0000\u0005\u0002\u0007\u0007\u0006", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 88), objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((e) e()).f20752k);
            Object[] objArr3 = new Object[1];
            z(new int[]{-582547667, 1519826982, -449473632, 690998542}, 7 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            aVar.a(((String) objArr3[0]).intern(), (Object) ((e) e()).f20751j.g());
            int i3 = f20765o + 91;
            f20760f = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20760f + 61;
            f20765o = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                z(new int[]{-579033506, 871258942, -1394964233, 954075471, -616767364, 607498523}, 39 >> Process.getGidForName(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                z(new int[]{-579033506, 871258942, -1394964233, 954075471, -616767364, 607498523}, 9 - Process.getGidForName(""), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20760f + 97;
            int i4 = i3 % 128;
            f20765o = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 85;
            f20760f = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20760f + 49;
            f20765o = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass2.f20756d[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((e) e()).f20752k);
                return;
            }
            if (i5 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((e) e()).f20752k);
            int i6 = f20760f + 7;
            f20765o = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public interface b {
        void b(String str);

        void b(c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r8, byte r9, short r10) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            int r0 = r9 * 3
            int r7 = 1 - r0
            byte[] r6 = o.ax.e.$$l
            int r0 = r10 * 2
            int r5 = r0 + 67
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r5
            r2 = r3
            r5 = r7
        L16:
            int r5 = r5 + r0
            int r8 = r8 + 1
            r1 = r2
        L1a:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r8]
            goto L16
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ax.e.$$n(int, byte, short):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f20745r = 0;
        f20748v = 1;
        f20744q = 0;
        f20746s = 1;
        o();
        MotionEvent.axisFromString("");
        TextUtils.indexOf((CharSequence) "", '0', 0);
        AndroidCharacter.getMirror('0');
        TextUtils.indexOf("", "", 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Process.getGidForName("");
        int i2 = f20748v + 37;
        f20745r = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(Context context, b bVar, o.en.b bVar2) {
        super(context, bVar, bVar2, o.bg.e.f21124v);
        this.f20753l = null;
    }

    static void init$0() {
        $$d = new byte[]{Ascii.VT, -11, 98, 72};
        $$e = 122;
    }

    static void init$1() {
        $$j = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$k = 36;
    }

    static void init$2() {
        $$l = new byte[]{76, -80, -89, 46};
        $$m = 85;
    }

    private a l() {
        int i2 = 2 % 2;
        a aVar = new a(this);
        int i3 = f20744q + 87;
        f20746s = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void o() {
        f20742o = -1270219443;
        f20741n = new char[]{2328, 2335, 2332, 2309, 2319, 2312, 2363, 2320, 2318, 2331, 2366, 2306, 2305, 2373, 2307, 2352, 2334, 2317, 2351, 2368, 2376, 2358, 2381};
        f20740m = 2040400243;
        f20743p = true;
        f20747t = true;
    }

    private static void u(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 5;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f20742o)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(270 - View.MeasureSpec.getMode(0), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2071844881, false, $$n(b2, b3, (byte) ((b3 + Ascii.CAN) - (24 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(523 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), Color.argb(0, 0, 0, 0) + 12, 627984172, false, $$n(b4, b5, (byte) ((b5 + Ascii.ETB) - (23 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            int i9 = $10 + 55;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (!(!z2)) {
            int i11 = $10 + 55;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            int i13 = $10 + 97;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (nVar.f19944a < i2) {
                int i15 = $10 + 41;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[nVar.f19944a * i2];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 522, (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getTapTimeout() >> 16) + 12, 627984172, false, $$n(b6, b7, (byte) ((b7 + Ascii.ETB) - (23 & b7))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(522 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), View.combineMeasuredStates(0, 0) + 12, 627984172, false, $$n(b8, b9, (byte) ((b9 + Ascii.ETB) - (23 & b9))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(short r9, byte r10, byte r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.ax.e.$$d
            int r7 = r9 * 2
            int r1 = r7 + 1
            int r2 = r11 + 4
            int r0 = r10 + 98
            byte[] r6 = new byte[r1]
            r5 = 0
            if (r8 != 0) goto L2a
            r4 = r5
            r3 = r7
        L11:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L14:
            int r2 = r2 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            r12[r5] = r0
            return
        L25:
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L11
        L2a:
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ax.e.w(short, byte, byte, java.lang.Object[]):void");
    }

    private static void x(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f20741n;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(593 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (13229 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, -1225586509, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(f20740m)};
        Object objA2 = o.d.d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 32, (char) ExpandableListView.getPackedPositionType(0L), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f20747t) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA3 = o.d.d.a(458 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + 10, -1923924106, false, $$n(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f20743p) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i5 = $11 + 19;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i7 = $10 + 113;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) / fVar.f19922a] / i2] * iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 458, (char) (Process.getGidForName("") + 1), 11 - View.getDefaultSize(0, 0), -1923924106, false, $$n(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(1540807955);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 458, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, -1923924106, false, $$n(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void y(int r9, byte r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = o.ax.e.$$j
            int r7 = r11 * 4
            int r1 = r7 + 1
            int r0 = r10 * 4
            int r6 = 4 - r0
            int r0 = r9 * 3
            int r0 = 98 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r8 != 0) goto L2d
            r3 = r7
            r2 = r4
        L15:
            int r6 = r6 + 1
            int r0 = -r0
            int r0 = r0 + r3
        L19:
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L26:
            r1 = r8[r6]
            int r2 = r2 + 1
            r3 = r0
            r0 = r1
            goto L15
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ax.e.y(int, byte, short, java.lang.Object[]):void");
    }

    public final void b(d dVar, String str, h hVar, String str2) {
        int i2 = 2 % 2;
        int i3 = f20744q + 29;
        f20746s = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            u(16 - TextUtils.lastIndexOf("", '0', 0), "\t￼\b\b\n\uffde\t\ufffe\ufff1\u0014￼\u0007\u000b\u000e\u0004\uffdf\uffff", true, (ViewConfiguration.getPressedStateDuration() >> 16) + 187, ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            u((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 32, "ￕ\uffc8\u000b\t\u001a\f\uffc8\u001c\u0017\uffc8\f\u0011\u001b\u0018\u0014\t!\uffc8￢\uffc8\f\u0017￬\u0011\u001b\u0018\u0014\t!\ufffe\u000b\u0016\uffc8", false, 175 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 20 - KeyEvent.keyCodeFromString(""), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(hVar).toString());
            int i4 = f20746s + 81;
            f20744q = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        this.f20750g = str;
        this.f20749f = dVar;
        this.f20751j = hVar;
        this.f20752k = str2;
        a();
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20744q + 91;
        f20746s = i3 % 128;
        if (i3 % 2 != 0) {
            return l();
        }
        l();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x07a4  */
    @Override // o.ab.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ax.e.e():java.lang.String");
    }
}
