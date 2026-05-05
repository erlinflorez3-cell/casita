package o.ap;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import o.a.g;
import o.a.l;
import o.ab.j;
import o.ap.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class f<TRRequest, TRResponse, TR extends b<TRRequest, TRResponse>> extends o.ab.e<a<TRResponse>> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static char f20497k = 0;

    /* JADX INFO: renamed from: l */
    private static char f20498l = 0;

    /* JADX INFO: renamed from: n */
    private static char f20499n = 0;

    /* JADX INFO: renamed from: p */
    private static int f20500p = 0;

    /* JADX INFO: renamed from: q */
    private static char f20501q = 0;

    /* JADX INFO: renamed from: r */
    private static int f20502r = 0;

    /* JADX INFO: renamed from: s */
    private static int f20503s = 0;

    /* JADX INFO: renamed from: t */
    private static int f20504t = 0;

    /* JADX INFO: renamed from: f */
    final TR f20505f;

    /* JADX INFO: renamed from: g */
    o.i.d f20506g;

    /* JADX INFO: renamed from: j */
    TRResponse f20507j;

    /* JADX INFO: renamed from: m */
    String f20508m;

    /* JADX INFO: renamed from: o */
    String f20509o;

    /* JADX INFO: renamed from: o.ap.f$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: b */
        private static int f20510b = 1;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f20511c;

        /* JADX INFO: renamed from: d */
        private static int f20512d = 0;

        static {
            int[] iArr = new int[o.bg.a.values().length];
            f20511c = iArr;
            try {
                iArr[o.bg.a.aA.ordinal()] = 1;
                int i2 = f20510b + 19;
                f20512d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20511c[o.bg.a.aB.ordinal()] = 2;
                int i5 = f20510b + 101;
                f20512d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 8 / 0;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a<TRResponse> {
        void a(o.bg.c cVar);

        void b(TRResponse trresponse);
    }

    static final class c<TRRequest, TRResponse> extends j<f<TRRequest, TRResponse, ?>> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20513b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20514c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20515d = 0;

        /* JADX INFO: renamed from: f */
        public static int f20516f = 0;

        /* JADX INFO: renamed from: g */
        private static int[] f20517g = null;

        /* JADX INFO: renamed from: h */
        public static int f20518h = 0;

        /* JADX INFO: renamed from: i */
        public static int f20519i = 0;

        /* JADX INFO: renamed from: j */
        private static int f20520j = 0;

        /* JADX INFO: renamed from: l */
        private static int f20521l = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(int r7, int r8, int r9) {
            /*
                int r0 = r7 * 2
                int r7 = r0 + 117
                int r0 = r8 * 3
                int r6 = r0 + 1
                int r0 = r9 * 4
                int r0 = 3 - r0
                byte[] r5 = o.ap.f.c.$$a
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r5 != 0) goto L2a
                r7 = r6
                r2 = r0
                r1 = r3
            L16:
                int r7 = r7 + r0
                r0 = r2
            L18:
                int r2 = r0 + 1
                byte r0 = (byte) r7
                r4[r1] = r0
                int r1 = r1 + 1
                if (r1 != r6) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L27:
                r0 = r5[r2]
                goto L16
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ap.f.c.$$d(int, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20516f = -572245109;
            f20518h = 1717015851;
            f20519i = 1113819043;
            f20513b = -1859772777;
            f20515d = -939115265;
            f20514c = 936075040;
            f20520j = 0;
            f20521l = 1;
            f20517g = new int[]{537056750, -1272613694, -914060865, -606599416, -1124034484, -2090228648, 1264154231, -124911114, -555619022, -2021025336, 103466150, -1869219265, -770712856, 973807397, 1490276509, 1479541018, -680827931, -328057507};
        }

        c(f<TRRequest, TRResponse, ?> fVar) {
            super(fVar, true);
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f20521l + 123;
            int i4 = i3 % 128;
            f20520j = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 111;
            f20521l = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i6;
            int i9 = (i8 + i3) - (i8 & i3);
            int i10 = ~i9;
            int i11 = ~i2;
            int i12 = (-1) - (((-1) - i10) & ((-1) - (~((i11 + i3) - (i11 & i3)))));
            int i13 = (i9 + i11) - (i9 & i11);
            int i14 = ~i3;
            int i15 = (~((i2 + i3) - (i2 & i3))) | (~((i8 + i14) - (i8 & i14)));
            int i16 = i3 + i6 + i7 + ((-1311665080) * i5) + (1761575915 * i4);
            int i17 = i16 * i16;
            int i18 = ((-2073022045) * i3) + 412680192 + (1917570655 * i6) + (i12 * (-1995296350)) + (1995296350 * i13) + ((-1995296350) * i15) + ((-77725696) * i7) + (175112192 * i5) + ((-649461760) * i4) + (1783169024 * i17);
            int i19 = ((i3 * 1226044109) - 1701849991) + (i6 * 1226043089) + (i12 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i13 * (-510)) + (i15 * TypedValues.PositionType.TYPE_POSITION_TYPE) + (i7 * 1226043599) + (i5 * (-858626504)) + (i4 * 1069087493) + (i17 * 1627848704);
            if (i18 + (i19 * i19 * 739704832) != 1) {
                return b(objArr);
            }
            c cVar = (c) objArr[0];
            int i20 = 2 % 2;
            o.cg.j jVar = new o.cg.j(((f) cVar.e()).f20508m, ((f) cVar.e()).f20506g);
            int i21 = f20520j + 19;
            f20521l = i21 % 128;
            int i22 = i21 % 2;
            return jVar;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.NAK, 117, 119, 110};
            $$b = 247;
        }

        private static void v(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f20517g;
            int i5 = 989264422;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 97;
                    $10 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 675;
                            char cGreen = (char) Color.green(0);
                            int windowTouchSlop = 12 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i11 = $$b;
                            byte b2 = (byte) ((i11 + 10) - (i11 | 10));
                            byte b3 = (byte) (b2 - 2);
                            objA = o.d.d.a(i10, cGreen, windowTouchSlop, -328001469, false, $$d(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i7++;
                        i3 = 2;
                        i5 = 989264422;
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
            int[] iArr5 = f20517g;
            long j2 = 0;
            if (iArr5 != null) {
                int i12 = $10 + 1;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i14 = 0;
                while (i14 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i14])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        int scrollBarFadeDuration = 675 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i15 = 13 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                        byte b4 = (byte) ($$b & 10);
                        byte b5 = (byte) (b4 - 2);
                        objA2 = o.d.d.a(scrollBarFadeDuration, touchSlop, i15, -328001469, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i14++;
                    j2 = 0;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                int i16 = $11 + 47;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i18 = $10 + 19;
                $11 = i18 % 128;
                int i19 = 2;
                int i20 = i18 % 2;
                int i21 = 0;
                while (i21 < 16) {
                    int i22 = $10 + 117;
                    $11 = i22 % 128;
                    int i23 = i22 % i19;
                    lVar.f19942e ^= iArr4[i21];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        int i24 = 302 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        char c2 = (char) (52698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iGreen = 11 - Color.green(0);
                        byte b6 = (byte) ($$b & 1);
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(i24, c2, iGreen, -1416256172, false, $$d(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i21++;
                    i19 = 2;
                }
                int i25 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i25;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i26 = lVar.f19942e;
                int i27 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr5 = {lVar, lVar};
                Object objA4 = o.d.d.a(986820978);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 229, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51004), 9 - View.resolveSize(0, 0), -330018025, false, $$d(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ab.j
        public final o.cg.f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v(new int[]{63424426, 460366285, 1363503493, 815348307, -1842794231, -190482982, 22628222, 1585769892, -1566424996, 421101233}, (Process.myTid() >> 22) + 19, objArr);
            o.cg.b bVar = new o.cg.b(context, 32, ((String) objArr[0]).intern());
            int i3 = f20520j + 29;
            f20521l = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20520j + 33;
            f20521l = i3 % 128;
            if (i3 % 2 != 0) {
                ((f) e()).f20507j = (TRResponse) ((f) e()).f20505f.a(aVar);
            } else {
                ((f) e()).f20507j = (TRResponse) ((f) e()).f20505f.a(aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20521l + 121;
            f20520j = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 5001) {
                return i2 != 5002 ? super.b(i2) : o.bg.a.aB;
            }
            o.bg.a aVar = o.bg.a.aA;
            int i6 = f20520j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f20521l = i6 % 128;
            if (i6 % 2 != 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20521l + 63;
            f20520j = i3 % 128;
            int i4 = i3 % 2;
            ((f) e()).g().a(cVar);
            int i5 = f20520j + 7;
            f20521l = i5 % 128;
            if (i5 % 2 != 0) {
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
            int i3 = f20520j + 55;
            f20521l = i3 % 128;
            int i4 = i3 % 2;
            ((f) e()).g().b(((f) e()).f20507j);
            int i5 = f20521l + 47;
            f20520j = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = f20513b * 792677976;
            f20513b = i2;
            int i3 = f20519i * (-1409776866);
            f20519i = i3;
            int i4 = f20518h * 1357842473;
            f20518h = i4;
            int i5 = (-452864701) * f20516f;
            f20516f = i5;
            return (o.cg.j) c(i2, new Object[]{this}, -1995938373, i5, i4, 1995938374, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            v(new int[]{199848506, -1566570799, 887469474, 1846274106}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((f) e()).f20509o);
            try {
                TR tr = ((f) e()).f20505f;
                h();
                tr.e(aVar);
                int i3 = f20521l + 21;
                f20520j = i3 % 128;
                int i4 = i3 % 2;
            } catch (b.e e2) {
                if (e2.d().c() == AntelopErrorCode.GooglePayWalletNotAvailable) {
                    f().d(o.bg.a.aD);
                } else {
                    f().d(o.bg.a.f21032a);
                }
            }
            return aVar;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20520j + 83;
            f20521l = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                v(new int[]{-906178459, 712863093, 1166407662, 198619660, 1123776847, 2058707577, 1762097371, -1604641501, 1443535932, -1881681000, -452710015, 1861624803}, 123 >>> (ViewConfiguration.getTapTimeout() / 79), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(new int[]{-906178459, 712863093, 1166407662, 198619660, 1123776847, 2058707577, 1762097371, -1604641501, 1443535932, -1881681000, -452710015, 1861624803}, (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20520j + 105;
            f20521l = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int id = (int) Thread.currentThread().getId();
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = f20514c * 2134899726;
            f20514c = i2;
            int i3 = 1578043654 * f20515d;
            f20515d = i3;
            return (byte[][]) c(id, new Object[]{this}, -2101004543, i3, i2, 2101004543, elapsedCpuTime);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20520j + 59;
            f20521l = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = AnonymousClass5.f20511c[f().c().ordinal()];
                throw null;
            }
            int i5 = AnonymousClass5.f20511c[f().c().ordinal()];
            if (i5 == 1) {
                j().c(h(), ((f) e()).f20509o);
                return;
            }
            if (i5 != 2) {
                super.s();
                return;
            }
            j().d(h(), ((f) e()).f20509o);
            int i6 = f20520j + 79;
            f20521l = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static String $$j(int i2, short s2, short s3) {
        int i3 = s3 * 3;
        int i4 = 72 - (i2 * 3);
        byte[] bArr = $$d;
        int i5 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i3;
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i5 + 1;
            i4 += bArr[i7];
            i5 = i7;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20503s = 0;
        f20504t = 1;
        f20502r = 0;
        f20500p = 1;
        m();
        Process.myPid();
        ViewConfiguration.getMaximumDrawingCacheSize();
        int i2 = f20504t + 105;
        f20503s = i2 % 128;
        int i3 = i2 % 2;
    }

    public f(Context context, a<TRResponse> aVar, o.en.b bVar, TR tr) {
        super(context, aVar, bVar, o.bg.e.f21121s);
        this.f20505f = tr;
    }

    static void init$0() {
        $$d = new byte[]{Ascii.ETB, 121, MessagePack.Code.FALSE, Ascii.SI};
        $$e = 220;
    }

    private c<TRRequest, TRResponse> l() {
        int i2 = 2 % 2;
        c<TRRequest, TRResponse> cVar = new c<>(this);
        int i3 = f20500p + 75;
        f20502r = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    static void m() {
        f20499n = (char) 15755;
        f20498l = (char) 47261;
        f20497k = (char) 54284;
        f20501q = (char) 24912;
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            cArr3[i4] = cArr[gVar.f19924d];
            int i5 = 1;
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = $10 + 27;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i4;
            while (i9 < 16) {
                char c2 = cArr3[i5];
                char c3 = cArr3[i4];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f20497k) ^ (-7511683281764982996L))));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f20501q);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int packedPositionGroup = 270 - ExpandableListView.getPackedPositionGroup(0L);
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10;
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 1);
                        String str$$j = $$j(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(packedPositionGroup, keyRepeatDelay, i12, -1995022631, false, str$$j, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[i5] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f20499n) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20498l)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1995022631, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i13 = $11 + 95;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(270 - TextUtils.indexOf("", "", 0), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -2074123590, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final void b(o.i.d dVar, String str, String str2) {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f20502r + 93;
            f20500p = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                u("樀슾㽘꽚⾰嚬뺃ᓪ䪖蘙㙮鑄⬨⥹䡇\u2e79", 86 >>> TextUtils.lastIndexOf("", (char) 21, 0, 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                u("铿崄樀슾㽘꽚⾰嚬뺃ᓪ", 22 >>> KeyEvent.normalizeMetaState(1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                u("樀슾㽘꽚⾰嚬뺃ᓪ䪖蘙㙮鑄⬨⥹䡇\u2e79", TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                u("铿崄樀슾㽘꽚⾰嚬뺃ᓪ", KeyEvent.normalizeMetaState(0) + 10, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        this.f20508m = str;
        this.f20506g = dVar;
        this.f20509o = str2;
        a();
        int i4 = f20500p + 1;
        f20502r = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20500p + 109;
        f20502r = i3 % 128;
        if (i3 % 2 == 0) {
            return l();
        }
        l();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20500p + 5;
        f20502r = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            u("樀슾㽘꽚⾰嚬뺃ᓪ䪖蘙㙮鑄⬨⥹䡇\u2e79", 4 % (ViewConfiguration.getMinimumFlingVelocity() + 67), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            u("樀슾㽘꽚⾰嚬뺃ᓪ䪖蘙㙮鑄⬨⥹䡇\u2e79", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
