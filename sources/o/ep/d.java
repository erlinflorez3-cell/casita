package o.ep;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.card.emvapplication.EmvApplicationGroup;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import o.a.m;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char[] J = null;
    private static int N = 0;
    private static int O = 0;
    private static int Q = 0;
    private static int R = 0;

    /* JADX INFO: renamed from: a */
    public static int f24449a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24450b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24451c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24452d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24453e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24454f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24455g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24456h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24457i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24458j = 0;

    /* JADX INFO: renamed from: k */
    public static int f24459k = 0;

    /* JADX INFO: renamed from: l */
    public static int f24460l = 0;

    /* JADX INFO: renamed from: m */
    public static int f24461m = 0;

    /* JADX INFO: renamed from: n */
    public static int f24462n = 0;

    /* JADX INFO: renamed from: o */
    public static int f24463o = 0;

    /* JADX INFO: renamed from: p */
    public static int f24464p = 0;

    /* JADX INFO: renamed from: q */
    public static int f24465q = 0;

    /* JADX INFO: renamed from: r */
    public static int f24466r = 0;

    /* JADX INFO: renamed from: s */
    public static int f24467s = 0;
    private final String A;
    private final String B;
    private final String C;
    private final boolean D;
    private final o.cc.d E = new o.cc.d(o.en.b.c());
    private final o.dx.f F;
    private f G;
    private final o.dx.d H;
    private LinkedHashMap<String, a> I;
    private o.er.f K;
    private c L;
    private final boolean M;

    /* JADX INFO: renamed from: t */
    private final String f24468t;

    /* JADX INFO: renamed from: u */
    private final String f24469u;

    /* JADX INFO: renamed from: v */
    private o.en.e f24470v;

    /* JADX INFO: renamed from: w */
    private final String f24471w;

    /* JADX INFO: renamed from: x */
    private final String f24472x;

    /* JADX INFO: renamed from: y */
    private final String f24473y;

    /* JADX INFO: renamed from: z */
    private final byte[] f24474z;

    /* JADX INFO: renamed from: o.ep.d$2 */
    final class AnonymousClass2 implements o.cc.c {

        /* JADX INFO: renamed from: a */
        private static int f24475a = 0;

        /* JADX INFO: renamed from: c */
        private static int f24476c = 1;

        /* JADX INFO: renamed from: e */
        public static int f24477e = -224954045;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ OperationCallback f24478b;

        AnonymousClass2(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24475a + 89;
            f24476c = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (operationCallback != null) {
                f24477e *= -1166372848;
                System.identityHashCode(this);
                operationCallback.onSuccess(null);
            }
            int i5 = f24475a;
            int i6 = (i5 ^ 55) + (((-1) - (((-1) - i5) | ((-1) - 55))) << 1);
            f24476c = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24475a;
            int i4 = ((5 | i3) << 1) - (i3 ^ 5);
            f24476c = i4 % 128;
            int i5 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = (((i3 + 63) - (63 & i3)) << 1) - (i3 ^ 63);
                f24476c = i6 % 128;
                int i7 = i6 % 2;
                operationCallback.onError(o.by.c.b(cVar).a());
            }
            int i8 = f24476c;
            int i9 = ((101 | i8) << 1) - (i8 ^ 101);
            f24475a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX INFO: renamed from: o.ep.d$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b */
        private static int f24480b = 1;

        /* JADX INFO: renamed from: d */
        private static int f24481d = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f24482e;

        static {
            int[] iArr = new int[o.eq.d.values().length];
            f24482e = iArr;
            try {
                iArr[o.eq.d.f24730a.ordinal()] = 1;
                int i2 = f24481d;
                int i3 = ((i2 + 55) - (55 | i2)) + ((i2 + 55) - (i2 & 55));
                f24480b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24482e[o.eq.d.f24731b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24482e[o.eq.d.f24733d.ordinal()] = 3;
                int i5 = f24480b + 73;
                f24481d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24482e[o.eq.d.f24736h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24482e[o.eq.d.f24734e.ordinal()] = 5;
                int i7 = f24481d;
                int i8 = (i7 & 47) + ((i7 + 47) - (i7 & 47));
                f24480b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24482e[o.eq.d.f24732c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: o.ep.d$4 */
    final class AnonymousClass4 implements o.cc.c {

        /* JADX INFO: renamed from: a */
        private static int f24483a = 0;

        /* JADX INFO: renamed from: e */
        private static int f24484e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ OperationCallback f24485b;

        AnonymousClass4(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24483a + 51;
            int i4 = i3 % 128;
            f24484e = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i5 = ((-1) - (((-1) - i4) | ((-1) - 105))) + ((-1) - (((-1) - i4) & ((-1) - 105)));
                f24483a = i5 % 128;
                int i6 = i5 % 2;
                operationCallback.onSuccess(null);
                int i7 = f24484e;
                int i8 = ((37 | i7) << 1) - (i7 ^ 37);
                f24483a = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = f24484e + 99;
            f24483a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 90 / 0;
            }
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24483a;
            int i4 = (((i3 + 55) - (55 & i3)) << 1) - (i3 ^ 55);
            int i5 = i4 % 128;
            f24484e = i5;
            int i6 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i7 = (i5 ^ 31) + (((-1) - (((-1) - i5) | ((-1) - 31))) << 1);
                f24483a = i7 % 128;
                int i8 = i7 % 2;
                operationCallback.onError(o.by.c.b(cVar).a());
                int i9 = f24484e;
                int i10 = ((i9 + 37) - (37 | i9)) + ((-1) - (((-1) - i9) & ((-1) - 37)));
                f24483a = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = f24483a + 117;
            f24484e = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r2 = r8 + 1
            int r0 = r7 * 4
            int r1 = r0 + 116
            int r0 = r6 * 4
            int r0 = 4 - r0
            byte[] r7 = o.ep.d.$$a
            byte[] r6 = new byte[r2]
            r5 = 0
            if (r7 != 0) goto L2d
            r4 = r0
            r2 = r8
            r3 = r5
        L16:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L1a:
            byte r2 = (byte) r1
            r6[r3] = r2
            if (r3 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L25:
            r2 = r7[r0]
            int r3 = r3 + 1
            r4 = r0
            r0 = r2
            r2 = r1
            goto L16
        L2d:
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.d.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24466r = -1170718811;
        f24465q = -597367874;
        f24464p = 1905462400;
        f24467s = -1451182584;
        f24459k = -535995318;
        f24460l = -1952593892;
        f24462n = 406627240;
        f24461m = 1776862721;
        f24463o = 347266531;
        f24458j = 1071964016;
        f24455g = -616431659;
        f24456h = 1235615242;
        f24457i = -1245377552;
        f24454f = 1818765918;
        f24453e = -639719684;
        f24450b = -1973567330;
        f24451c = 1256286070;
        f24449a = 1063877571;
        f24452d = -276941841;
        Q = 0;
        O = 1;
        N = 0;
        R = 1;
        F();
        int i2 = Q + 83;
        O = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public d(String str, o.en.e eVar, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, byte[] bArr, String str8, o.dx.d dVar, o.dx.f fVar, f fVar2, boolean z2) {
        this.f24468t = str;
        this.f24470v = eVar;
        this.f24473y = str2;
        this.f24469u = str3;
        this.f24472x = str4;
        this.f24471w = str5;
        this.A = str6;
        this.B = str7;
        this.D = bool.booleanValue();
        this.f24474z = bArr;
        this.C = str8;
        this.H = dVar;
        this.F = fVar;
        this.G = fVar2;
        this.M = z2;
    }

    static void F() {
        J = new char[]{56505, 56555, 56553, 56558, 56539, 56534, 56555, 56553, 56530, 56505, 56524, 56482, 56493, 56493, 56514, 56550, 56516, 56520, 56562, 56562, 56560, 56540, 56499, 56486, 56486, 56521, 56524, 56482, 56493, 56493, 56514, 56550, 56516, 56514, 56555, 56553, 56530, 56497, 56486, 56486, 56520, 56562, 56562, 56560, 56540, 56538, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56548, 56566, 56558, 56537, 56545, 56556, 56556, 56346, 56351, 56345, 56348, 56561, 56498, 56552, 56556, 56550, 56540, 56549, 56498, 56553, 56558, 56558, 56553, 56513, 56486, 56521, 56554, 56555, 56555, 56558, 56561, 56563, 56521, 56522, 56561, 56558, 56519, 56521, 56558, 56516, 56522, 56556, 56552, 56556, 56550, 56540, 56541, 56548, 56555, 56557, 56559, 56563, 56555, 56555, 56521, 56519, 56558, 56556, 56558, 56555, 56439, 56706, 56433, 56431, 56705, 56444, 56431, 56704, 56418, 56706, 56710, 56435, 56412, 56706, 56435, 56705, 56435, 56704, 56446, 56707, 56445, 56704, 56405, 56444, 56445, 56505, 56556, 56556, 56540, 56532, 56549, 56547, 56555, 56560, 56560, 56541, 56540, 56560, 56562, 56562, 56520, 56486, 56486, 56497, 56530, 56553, 56555, 56514, 56516, 56550, 56514, 56493, 56493, 56482, 56524, 56521, 56486, 56486, 56499, 56540, 56560, 56562, 56562, 56520, 56516, 56550, 56514, 56493, 56493, 56482, 56524, 56481, 56530, 56553, 56555, 56490, 56540, 56555, 56559, 56560, 56521, 56512, 56551, 56553, 56514, 56513, 56553, 56558, 56553, 56550, 56558, 56558, 56556, 56558, 56560, 56521, 56523, 56555, 56550, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56519, 56516, 56558, 56521, 56521, 56555, 56555, 56563, 56559, 56557, 56555, 56548};
    }

    private void I() throws Throwable {
        int i2 = 2 % 2;
        int i3 = N + 87;
        R = i3 % 128;
        if (i3 % 2 == 0) {
            C();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (C()) {
            int i4 = R + 73;
            N = i4 % 128;
            int i5 = i4 % 2;
        } else {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            P("\u0001\u0000\u0001\u0000", new int[]{187, 4, 0, 0}, false, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
    }

    private static void P(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        boolean z3;
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i6 = 0;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = J;
        long j2 = 0;
        if (cArr != null) {
            int i11 = $11 + 75;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForChild(i6, i6) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == j2 ? 0 : -1)) + 250, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i13++;
                    i6 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i7, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i8) {
                if (bArr[mVar.f19943d] == 1) {
                    int i14 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a((Process.myTid() >> 22) + 11, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA3 = o.d.d.a(836 - Color.green(0), (char) (27280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -1210801192, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 21, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35715), View.resolveSizeAndState(0, 0, 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i16 = $11 + 91;
            $10 = i16 % 128;
            i2 = 2;
            int i17 = i16 % 2;
            cArr3 = cArr4;
        } else {
            i2 = 2;
        }
        if (i10 > 0) {
            int i18 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $11 = i18 % 128;
            if (i18 % i2 == 0) {
                char[] cArr5 = new char[i8];
                z3 = true;
                System.arraycopy(cArr3, 1, cArr5, 1, i8);
                System.arraycopy(cArr5, 1, cArr3, i8 << i10, i10);
                i3 = 0;
                System.arraycopy(cArr5, i10, cArr3, 0, i8 + i10);
            } else {
                z3 = true;
                i3 = 0;
                char[] cArr6 = new char[i8];
                System.arraycopy(cArr3, 0, cArr6, 0, i8);
                int i19 = i8 - i10;
                System.arraycopy(cArr6, 0, cArr3, i19, i10);
                System.arraycopy(cArr6, i10, cArr3, 0, i19);
            }
        } else {
            z3 = true;
            i3 = 0;
        }
        if ((!z2) != z3) {
            char[] cArr7 = new char[i8];
            mVar.f19943d = i3;
            while (mVar.f19943d < i8) {
                int i20 = $10 + 31;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr7[mVar.f19943d] = cArr3[mVar.f19943d + i8];
                    i4 = mVar.f19943d / 0;
                } else {
                    cArr7[mVar.f19943d] = cArr3[(i8 - mVar.f19943d) - 1];
                    i4 = mVar.f19943d + 1;
                }
                mVar.f19943d = i4;
            }
            cArr3 = cArr7;
        }
        if (i9 > 0) {
            int i21 = 0;
            while (true) {
                mVar.f19943d = i21;
                if (mVar.f19943d >= i8) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i21 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        d dVar = (d) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        LinkedHashMap<String, a> linkedHashMap = dVar.I;
        Object obj = null;
        if (linkedHashMap == null) {
            int i3 = N + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            R = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Iterator<a> it = linkedHashMap.values().iterator();
        int i5 = N + 1;
        R = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            int i7 = N + 49;
            R = i7 % 128;
            if (i7 % 2 == 0) {
                it.next().h().equals(str);
                obj.hashCode();
                throw null;
            }
            a next = it.next();
            if (next.h().equals(str)) {
                return new EmvApplicationGroup(next);
            }
        }
        return null;
    }

    public static d a(String str, o.en.e eVar, String str2) {
        int i2 = 2 % 2;
        d dVar = new d(str, eVar, null, null, null, null, null, str2, Boolean.FALSE, null, null, null, null, null, false);
        dVar.c(new LinkedHashMap<>());
        dVar.L = new c(null, null, null, null, str2);
        int i3 = N + 89;
        R = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = N + 31;
        R = i3 % 128;
        int i4 = i3 % 2;
        f fVar = dVar.G;
        if (i4 != 0) {
            return fVar;
        }
        throw null;
    }

    private d b(o.eq.d dVar) {
        int i2 = 2 % 2;
        d dVar2 = new d(this.f24468t, this.f24470v, this.f24473y, this.f24469u, this.f24472x, this.f24471w, this.A, this.B, Boolean.valueOf(this.D), this.f24474z, this.C, this.H, this.F, this.G, this.M);
        if (this.I != null) {
            LinkedHashMap<String, a> linkedHashMap = new LinkedHashMap<>();
            Iterator<Map.Entry<String, a>> it = this.I.entrySet().iterator();
            while (it.hasNext()) {
                int i3 = R + 41;
                N = i3 % 128;
                if (i3 % 2 != 0) {
                    Map.Entry<String, a> next = it.next();
                    linkedHashMap.put(next.getKey(), next.getValue().d(dVar));
                    throw null;
                }
                Map.Entry<String, a> next2 = it.next();
                linkedHashMap.put(next2.getKey(), next2.getValue().d(dVar));
                int i4 = N + 63;
                R = i4 % 128;
                int i5 = i4 % 2;
            }
            dVar2.I = linkedHashMap;
        }
        dVar2.L = this.L;
        dVar2.K = this.K;
        return dVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (java.util.Objects.equals(r4.G, o.ep.f.f24513e) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r4.E.b(r3, r4, r2, new o.ep.d.AnonymousClass2(r4));
        r2 = o.ep.d.R + 55;
        o.ep.d.N = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if ((r2 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r0 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (java.util.Objects.equals(r4.G, o.ep.f.f24513e) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState;
        r1 = new java.lang.Object[1];
        P("\u0001\u0000\u0001\u0000", new int[]{187, 4, 0, 0}, false, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r3, ((java.lang.String) r1[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            r5 = 0
            r4 = r9[r5]
            o.ep.d r4 = (o.ep.d) r4
            r6 = 1
            r3 = r9[r6]
            android.content.Context r3 = (android.content.Context) r3
            r8 = 2
            r0 = r9[r8]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            r0 = 3
            r7 = r9[r0]
            fr.antelop.sdk.util.OperationCallback r7 = (fr.antelop.sdk.util.OperationCallback) r7
            int r0 = r8 % r8
            int r0 = o.ep.d.N
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.ep.d.R = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L4f
            r4.I()
            o.ep.f r1 = r4.G
            o.ep.f r0 = o.ep.f.f24513e
            boolean r1 = java.util.Objects.equals(r1, r0)
            r0 = 80
            int r0 = r0 / r5
            if (r1 != 0) goto L5d
        L35:
            o.cc.d r1 = r4.E
            o.ep.d$2 r0 = new o.ep.d$2
            r0.<init>()
            r1.b(r3, r4, r2, r0)
            int r0 = o.ep.d.R
            int r2 = r0 + 55
            int r0 = r2 % 128
            o.ep.d.N = r0
            int r2 = r2 % r8
            r1 = 0
            if (r2 == 0) goto L4e
            r0 = 47
            int r0 = r0 / r5
        L4e:
            return r1
        L4f:
            r4.I()
            o.ep.f r1 = r4.G
            o.ep.f r0 = o.ep.f.f24513e
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L5d
            goto L35
        L5d:
            fr.antelop.sdk.exception.WalletValidationException r4 = new fr.antelop.sdk.exception.WalletValidationException
            fr.antelop.sdk.exception.WalletValidationErrorCode r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.WrongState
            r1 = 187(0xbb, float:2.62E-43)
            r0 = 4
            int[] r2 = new int[]{r1, r0, r5, r5}
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "\u0001\u0000\u0001\u0000"
            P(r0, r2, r5, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r4.<init>(r3, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.d.c(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        d dVar2 = new d(dVar.f24468t, dVar.f24470v, dVar.f24473y, dVar.f24469u, dVar.f24472x, dVar.f24471w, dVar.A, dVar.B, Boolean.FALSE, dVar.f24474z, dVar.C, dVar.H, dVar.F, dVar.G, dVar.M);
        dVar2.I = dVar.I;
        dVar2.L = dVar.L;
        dVar2.K = dVar.K;
        int i3 = R + 55;
        N = i3 % 128;
        if (i3 % 2 == 0) {
            return dVar2;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        String strIntern;
        String str;
        int i8 = ~i2;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
        int i10 = ~i7;
        int i11 = i9 | (~((i10 + i3) - (i10 & i3)));
        int i12 = ~((i10 + i2) - (i10 & i2));
        int i13 = i11 | i12;
        int i14 = ~i3;
        int i15 = (-1) - (((-1) - i12) & ((-1) - (~(i14 | i2))));
        int i16 = ~((-1) - (((-1) - i7) & ((-1) - (i8 | i14))));
        int i17 = ~(((i14 + i10) - (i14 & i10)) | i2);
        int i18 = (i16 + i17) - (i16 & i17);
        int i19 = i3 + i2 + i4 + ((-1369571145) * i5) + ((-720088171) * i6);
        int i20 = i19 * i19;
        int i21 = (((-954023988) * i3) - 252706816) + ((-260227018) * i2) + ((-346898485) * i13) + (i15 * 346898485) + (346898485 * i18) + ((-607125504) * i4) + (565182464 * i5) + (1611661312 * i6) + ((-409206784) * i20);
        int i22 = ((i3 * (-1931095572)) - 2087550970) + (i2 * (-1931094842)) + (i13 * (-365)) + (i15 * 365) + (i18 * 365) + (i4 * (-1931095207)) + (i5 * (-789048161)) + (i6 * 356376013) + (i20 * 423362560);
        switch (i21 + (i22 * i22 * (-1901854720))) {
            case 1:
                d dVar = (d) objArr[0];
                int i23 = 2 % 2;
                int i24 = R + 101;
                int i25 = i24 % 128;
                N = i25;
                int i26 = i24 % 2;
                o.dx.f fVar = dVar.F;
                int i27 = i25 + 33;
                R = i27 % 128;
                int i28 = i27 % 2;
                return fVar;
            case 2:
                d dVar2 = (d) objArr[0];
                String str2 = (String) objArr[1];
                int i29 = 2 % 2;
                int i30 = R + 3;
                N = i30 % 128;
                int i31 = i30 % 2;
                if (o.ea.f.a()) {
                    int i32 = N + 105;
                    R = i32 % 128;
                    if (i32 % 2 == 0) {
                        Object[] objArr2 = new Object[1];
                        P("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 9, 0, 5}, true, objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                        Object[] objArr3 = new Object[1];
                        P("\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{9, 54, 0, 0}, false, objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[5];
                        objArr4[0] = dVar2.f24468t;
                        objArr4[0] = str2;
                        str = String.format(strIntern2, objArr4);
                    } else {
                        Object[] objArr5 = new Object[1];
                        P("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 9, 0, 5}, true, objArr5);
                        strIntern = ((String) objArr5[0]).intern();
                        Object[] objArr6 = new Object[1];
                        P("\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{9, 54, 0, 0}, true, objArr6);
                        str = String.format(((String) objArr6[0]).intern(), dVar2.f24468t, str2);
                    }
                    o.ea.f.c(strIntern, str);
                }
                if (str2 == null) {
                    WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
                    Object[] objArr7 = new Object[1];
                    P(null, new int[]{63, 5, 42, 5}, true, objArr7);
                    throw new WalletValidationException(walletValidationErrorCode, ((String) objArr7[0]).intern());
                }
                if (dVar2.I == null) {
                    WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unknown;
                    Object[] objArr8 = new Object[1];
                    P(null, new int[]{63, 5, 42, 5}, true, objArr8);
                    throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr8[0]).intern());
                }
                dVar2.I();
                a aVar = dVar2.I.get(str2);
                if (aVar == null) {
                    WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Unknown;
                    Object[] objArr9 = new Object[1];
                    P(null, new int[]{63, 5, 42, 5}, true, objArr9);
                    throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr9[0]).intern());
                }
                if (!aVar.e()) {
                    WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
                    Object[] objArr10 = new Object[1];
                    P(null, new int[]{63, 5, 42, 5}, true, objArr10);
                    throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr10[0]).intern());
                }
                o.en.b bVarC = o.en.b.c();
                if (bVarC.s()) {
                    Object[] objArr11 = {bVarC};
                    int i33 = o.en.b.f24090e * (-1580596594);
                    o.en.b.f24090e = i33;
                    int i34 = o.en.b.f24087b * (-2071415875);
                    o.en.b.f24087b = i34;
                    ((o.fr.e) o.en.b.a(342371170, i33, objArr11, i34, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().c(dVar2.f24468t, str2);
                    return null;
                }
                WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.WrongState;
                Object[] objArr12 = new Object[1];
                P("\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{68, 6, 0, 5}, true, objArr12);
                String strIntern3 = ((String) objArr12[0]).intern();
                Object[] objArr13 = new Object[1];
                P("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{74, 42, 0, 28}, true, objArr13);
                throw new WalletValidationException(walletValidationErrorCode5, strIntern3, ((String) objArr13[0]).intern());
            case 3:
                return a(objArr);
            case 4:
                d dVar3 = (d) objArr[0];
                int i35 = 2 % 2;
                int i36 = R + 35;
                int i37 = i36 % 128;
                N = i37;
                int i38 = i36 % 2;
                LinkedHashMap<String, a> linkedHashMap = dVar3.I;
                if (linkedHashMap == null) {
                    int i39 = i37 + 73;
                    R = i39 % 128;
                    int i40 = i39 % 2;
                    return 0;
                }
                Iterator<a> it = linkedHashMap.values().iterator();
                int i41 = -1;
                while (it.hasNext()) {
                    int i42 = R + 61;
                    N = i42 % 128;
                    int i43 = i42 % 2;
                    int iJ = it.next().j();
                    if (i41 == -1 || iJ < i41) {
                        i41 = iJ;
                    }
                }
                return Integer.valueOf(Math.max(0, i41));
            case 5:
                return b(objArr);
            case 6:
                return e(objArr);
            case 7:
                return d(objArr);
            case 8:
                return g(objArr);
            case 9:
                d dVar4 = (d) objArr[0];
                o.er.f fVar2 = (o.er.f) objArr[1];
                int i44 = 2 % 2;
                int i45 = R;
                int i46 = i45 + 51;
                N = i46 % 128;
                int i47 = i46 % 2;
                dVar4.K = fVar2;
                int i48 = i45 + 37;
                N = i48 % 128;
                int i49 = i48 % 2;
                return null;
            default:
                return c(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0019, code lost:
    
        if (r2.I == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x001b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x001e, code lost:
    
        if (r2.I == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0021, code lost:
    
        r1 = r2.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0023, code lost:
    
        if (r1 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0027, code lost:
    
        if (r1 != o.ep.f.f24511c) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002b, code lost:
    
        return fr.antelop.sdk.card.CardStatus.TermsAndConditionsValidationRequired;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x002c, code lost:
    
        r1 = r2.I.values().iterator();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x003b, code lost:
    
        if (r1.hasNext() == true) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
    
        if (r2 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0040, code lost:
    
        r2 = o.eq.d.c(r2, r1.next().f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004f, code lost:
    
        r1 = o.ep.d.AnonymousClass3.f24482e[r2.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0057, code lost:
    
        if (r1 == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0059, code lost:
    
        if (r1 == 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005c, code lost:
    
        if (r1 == 3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005f, code lost:
    
        if (r1 == 4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0062, code lost:
    
        if (r1 == 5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0064, code lost:
    
        r1 = o.ep.d.R + 113;
        o.ep.d.N = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x006e, code lost:
    
        r2 = fr.antelop.sdk.card.CardStatus.Locked;
        r1 = o.ep.d.N + 47;
        o.ep.d.R = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0079, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007c, code lost:
    
        return fr.antelop.sdk.card.CardStatus.ActivationRefused;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007f, code lost:
    
        return fr.antelop.sdk.card.CardStatus.Activating;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0082, code lost:
    
        return fr.antelop.sdk.card.CardStatus.ActivationRequired;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0085, code lost:
    
        return fr.antelop.sdk.card.CardStatus.Active;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r7) {
        /*
            r6 = 0
            r2 = r7[r6]
            o.ep.d r2 = (o.ep.d) r2
            r3 = 2
            int r0 = r3 % r3
            int r1 = o.ep.d.R
            r4 = 1
            int r1 = r1 + r4
            int r0 = r1 % 128
            o.ep.d.N = r0
            int r1 = r1 % r3
            r5 = 0
            if (r1 == 0) goto L1c
            java.util.LinkedHashMap<java.lang.String, o.ep.a> r1 = r2.I
            r0 = 32
            int r0 = r0 / r6
            if (r1 != 0) goto L21
        L1b:
            return r5
        L1c:
            java.util.LinkedHashMap<java.lang.String, o.ep.a> r0 = r2.I
            if (r0 != 0) goto L21
            goto L1b
        L21:
            o.ep.f r1 = r2.G
            if (r1 == 0) goto L2c
            o.ep.f r0 = o.ep.f.f24511c
            if (r1 != r0) goto L2c
            fr.antelop.sdk.card.CardStatus r0 = fr.antelop.sdk.card.CardStatus.TermsAndConditionsValidationRequired
            return r0
        L2c:
            java.util.LinkedHashMap<java.lang.String, o.ep.a> r0 = r2.I
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
            r2 = r5
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == r4) goto L40
            if (r2 != 0) goto L4f
            return r5
        L40:
            java.lang.Object r0 = r1.next()
            o.ep.a r0 = (o.ep.a) r0
            o.eq.d r0 = r0.f()
            o.eq.d r2 = o.eq.d.c(r2, r0)
            goto L37
        L4f:
            int[] r1 = o.ep.d.AnonymousClass3.f24482e
            int r0 = r2.ordinal()
            r1 = r1[r0]
            if (r1 == r4) goto L83
            if (r1 == r3) goto L80
            r0 = 3
            if (r1 == r0) goto L7d
            r0 = 4
            if (r1 == r0) goto L7a
            r0 = 5
            if (r1 == r0) goto L6e
            int r0 = o.ep.d.R
            int r1 = r0 + 113
            int r0 = r1 % 128
            o.ep.d.N = r0
            int r1 = r1 % r3
            return r5
        L6e:
            fr.antelop.sdk.card.CardStatus r2 = fr.antelop.sdk.card.CardStatus.Locked
            int r0 = o.ep.d.N
            int r1 = r0 + 47
            int r0 = r1 % 128
            o.ep.d.R = r0
            int r1 = r1 % r3
            return r2
        L7a:
            fr.antelop.sdk.card.CardStatus r0 = fr.antelop.sdk.card.CardStatus.ActivationRefused
            return r0
        L7d:
            fr.antelop.sdk.card.CardStatus r0 = fr.antelop.sdk.card.CardStatus.Activating
            return r0
        L80:
            fr.antelop.sdk.card.CardStatus r0 = fr.antelop.sdk.card.CardStatus.ActivationRequired
            return r0
        L83:
            fr.antelop.sdk.card.CardStatus r0 = fr.antelop.sdk.card.CardStatus.Active
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.d.e(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.s()) {
            int i3 = N + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            R = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = (-1580596594) * o.en.b.f24090e;
        o.en.b.f24090e = i4;
        int i5 = (-2071415875) * o.en.b.f24087b;
        o.en.b.f24087b = i5;
        String strC = ((o.fr.e) o.en.b.a(342371170, i4, new Object[]{bVarC}, i5, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().c(dVar.f24468t);
        if (strC != null) {
            int i6 = N + 101;
            int i7 = i6 % 128;
            R = i7;
            int i8 = i6 % 2;
            LinkedHashMap<String, a> linkedHashMap = dVar.I;
            if (linkedHashMap != null) {
                int i9 = i7 + 7;
                N = i9 % 128;
                int i10 = i9 % 2;
                if (linkedHashMap.containsKey(strC)) {
                    int i11 = N + 125;
                    R = i11 % 128;
                    int i12 = i11 % 2;
                    return strC;
                }
            }
        }
        return dVar.w();
    }

    static void init$0() {
        $$a = new byte[]{93, 121, -117, 60};
        $$b = 182;
    }

    public final LinkedHashMap<String, a> A() {
        int i2 = 2 % 2;
        int i3 = N;
        int i4 = i3 + 49;
        R = i4 % 128;
        int i5 = i4 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        int i6 = i3 + 45;
        R = i6 % 128;
        if (i6 % 2 != 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String B() {
        int i2 = 2 % 2;
        int i3 = N + 79;
        R = i3 % 128;
        int i4 = i3 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap == null) {
            return null;
        }
        Iterator<a> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            int i5 = N + 3;
            R = i5 % 128;
            int i6 = i5 % 2;
            for (o.et.c cVar : it.next().c()) {
                int i7 = o.et.c.f25352u * (-461147492);
                o.et.c.f25352u = i7;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i8 = o.et.c.f25355y * 1590723469;
                o.et.c.f25355y = i8;
                if (((byte[]) o.et.c.d(-2031214237, new Object[]{cVar}, i7, 2031214243, elapsedCpuTime, iElapsedRealtime, i8)) != null) {
                    int i9 = o.et.c.f25352u * (-461147492);
                    o.et.c.f25352u = i9;
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                    int i10 = o.et.c.f25355y * 1590723469;
                    o.et.c.f25355y = i10;
                    return new String((byte[]) o.et.c.d(-2031214237, new Object[]{cVar}, i9, 2031214243, elapsedCpuTime2, iElapsedRealtime2, i10), StandardCharsets.UTF_8);
                }
            }
            int i11 = R + 7;
            N = i11 % 128;
            int i12 = i11 % 2;
        }
        return null;
    }

    public final boolean C() {
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 9;
        N = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.M;
        int i6 = i3 + 27;
        N = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final CardStatus D() {
        int i2 = f24461m * (-222457364);
        f24461m = i2;
        int i3 = f24462n * 325900588;
        f24462n = i3;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i4 = f24460l * 323941697;
        f24460l = i4;
        return (CardStatus) e(1555433584, -1555433578, new Object[]{this}, i3, iElapsedRealtime, i4, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001b, code lost:
    
        if (y().hasNext() == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001d, code lost:
    
        r2 = y().next().iterator().next();
        r1 = o.ep.d.R + 23;
        o.ep.d.N = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (y().hasNext() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r1 = new java.lang.Object[1];
        P(null, new int[]{63, 5, 42, 5}, true, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r3, ((java.lang.String) r1[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.eq.b G() throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.ep.d.N
            int r1 = r0 + 61
            int r0 = r1 % 128
            o.ep.d.R = r0
            int r1 = r1 % r3
            r6 = 0
            r5 = 1
            if (r1 != 0) goto L3b
            java.util.Iterator r0 = r7.y()
            boolean r1 = r0.hasNext()
            r0 = 93
            int r0 = r0 / r6
            if (r1 != r5) goto L46
        L1d:
            java.util.Iterator r0 = r7.y()
            java.lang.Object r0 = r0.next()
            o.ep.a r0 = (o.ep.a) r0
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            o.eq.b r2 = (o.eq.b) r2
            int r0 = o.ep.d.R
            int r1 = r0 + 23
            int r0 = r1 % 128
            o.ep.d.N = r0
            int r1 = r1 % r3
            return r2
        L3b:
            java.util.Iterator r0 = r7.y()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L46
            goto L1d
        L46:
            fr.antelop.sdk.exception.WalletValidationException r4 = new fr.antelop.sdk.exception.WalletValidationException
            fr.antelop.sdk.exception.WalletValidationErrorCode r3 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory
            r2 = 63
            r1 = 42
            r0 = 5
            int[] r2 = new int[]{r2, r0, r1, r0}
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 0
            P(r0, r2, r5, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r4.<init>(r3, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.d.G():o.eq.b");
    }

    public final d H() {
        int priority = Thread.currentThread().getPriority();
        int i2 = f24459k * (-265870313);
        f24459k = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = f24467s * 971716978;
        f24467s = i4;
        return (d) e(-635724502, 635724509, new Object[]{this}, i2, i3, i4, priority);
    }

    public final Drawable a(Context context) {
        int i2 = 2 % 2;
        int i3 = N + 93;
        R = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        o.dx.d dVar = this.H;
        if (dVar == null) {
            return null;
        }
        Drawable drawableE = dVar.e(context);
        int i4 = N + 81;
        R = i4 % 128;
        if (i4 % 2 != 0) {
            return drawableE;
        }
        obj.hashCode();
        throw null;
    }

    public final a a(String str) {
        int i2 = 2 % 2;
        int i3 = N + 93;
        int i4 = i3 % 128;
        R = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap != null) {
            return linkedHashMap.get(str);
        }
        int i5 = i4 + 31;
        int i6 = i5 % 128;
        N = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 1;
        R = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final d a() {
        int i2 = 2 % 2;
        int i3 = N + 73;
        R = i3 % 128;
        if (i3 % 2 == 0) {
            b(o.eq.d.f24734e);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        d dVarB = b(o.eq.d.f24734e);
        int i4 = R + 121;
        N = i4 % 128;
        int i5 = i4 % 2;
        return dVarB;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = N;
        int i4 = i3 + 79;
        R = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24468t;
        int i6 = i3 + 73;
        R = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void b(String str) throws Throwable {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int iNextInt = new Random().nextInt(447334669);
        int i2 = f24450b * (-374828056);
        f24450b = i2;
        e(1214821643, -1214821641, new Object[]{this, str}, iNextInt, i2, Process.myUid(), iUptimeMillis);
    }

    public final void b(f fVar) {
        int i2 = 2 % 2;
        int i3 = R + 63;
        int i4 = i3 % 128;
        N = i4;
        int i5 = i3 % 2;
        this.G = fVar;
        int i6 = i4 + 41;
        R = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final d c() {
        int i2 = 2 % 2;
        d dVar = new d(this.f24468t, this.f24470v, this.f24473y, this.f24469u, this.f24472x, this.f24471w, this.A, this.B, Boolean.valueOf(this.D), this.f24474z, this.C, this.H, this.F, this.G, this.M);
        dVar.I = this.I;
        dVar.L = this.L;
        dVar.K = this.K;
        int i3 = R + 31;
        N = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    public final <T extends o.eq.b> T c(Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = N + 17;
        R = i3 % 128;
        if (i3 % 2 == 0) {
            y();
            throw null;
        }
        Iterator<a> itY = y();
        while (itY.hasNext()) {
            for (T t2 : itY.next()) {
                if (cls.isInstance(t2)) {
                    return t2;
                }
            }
        }
        int i4 = N + 55;
        R = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void c(LinkedHashMap<String, a> linkedHashMap) {
        int i2 = 2 % 2;
        int i3 = N + 3;
        R = i3 % 128;
        if (i3 % 2 != 0) {
            this.I = linkedHashMap;
            return;
        }
        this.I = linkedHashMap;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c(c cVar) {
        int i2 = 2 % 2;
        int i3 = N + 113;
        R = i3 % 128;
        if (i3 % 2 != 0) {
            this.L = cVar;
        } else {
            this.L = cVar;
            int i4 = 95 / 0;
        }
    }

    public final void c(o.er.f fVar) throws Throwable {
        int i2 = f24465q * (-1171275229);
        f24465q = i2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = f24466r * 916793080;
        f24466r = i3;
        e(957561169, -957561160, new Object[]{this, fVar}, iMaxMemory, elapsedCpuTime, i3, i2);
    }

    public final boolean c(String str) {
        int i2 = 2 % 2;
        int i3 = R + 105;
        N = i3 % 128;
        int i4 = i3 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap == null) {
            return false;
        }
        Iterator<a> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            int i5 = R + 9;
            N = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = {it.next(), str};
                int iActiveCount = Thread.activeCount();
                int i6 = a.f24398a * (-579709169);
                a.f24398a = i6;
                int i7 = a.f24402e * (-1921349572);
                a.f24402e = i7;
                int i8 = 91 / 0;
                if (((Boolean) a.e(1475540925, objArr, (int) SystemClock.uptimeMillis(), -1475540925, iActiveCount, i7, i6)).booleanValue()) {
                    return true;
                }
            } else {
                Object[] objArr2 = {it.next(), str};
                int iActiveCount2 = Thread.activeCount();
                int i9 = a.f24398a * (-579709169);
                a.f24398a = i9;
                int i10 = a.f24402e * (-1921349572);
                a.f24402e = i10;
                if (((Boolean) a.e(1475540925, objArr2, (int) SystemClock.uptimeMillis(), -1475540925, iActiveCount2, i10, i9)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(d dVar) {
        int i2 = 2 % 2;
        if (this == dVar) {
            int i3 = N + 87;
            R = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (this.M == dVar.M && Objects.equals(this.f24468t, dVar.f24468t)) {
            int i5 = R + 93;
            N = i5 % 128;
            int i6 = i5 % 2;
            if (Objects.equals(this.L, dVar.L) && Objects.equals(this.K, dVar.K) && Objects.equals(this.f24473y, dVar.f24473y) && Objects.equals(this.f24469u, dVar.f24469u) && Objects.equals(this.H, dVar.H)) {
                int i7 = R + 75;
                N = i7 % 128;
                if (i7 % 2 != 0) {
                    Objects.equals(this.f24471w, dVar.f24471w);
                    throw null;
                }
                if (Objects.equals(this.f24471w, dVar.f24471w) && Objects.equals(this.A, dVar.A) && Objects.equals(this.B, dVar.B) && Objects.equals(Boolean.valueOf(this.D), Boolean.valueOf(dVar.D)) && Arrays.equals(this.f24474z, dVar.f24474z)) {
                    int i8 = N + 69;
                    R = i8 % 128;
                    int i9 = i8 % 2;
                    if (Objects.equals(this.C, dVar.C) && Objects.equals(this.G, dVar.G) && Objects.equals(this.F, dVar.F)) {
                        int i10 = N + 121;
                        R = i10 % 128;
                        int i11 = i10 % 2;
                        return true;
                    }
                }
            }
        }
        int i12 = R + 91;
        N = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        int i3 = R + 59;
        N = i3 % 128;
        int i4 = i3 % 2;
        d dVarC = c();
        int i5 = R + 19;
        N = i5 % 128;
        if (i5 % 2 == 0) {
            return dVarC;
        }
        throw null;
    }

    public final Boolean d() {
        int i2 = 2 % 2;
        int i3 = R + 33;
        N = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(this.D);
        int i5 = R + 103;
        N = i5 % 128;
        int i6 = i5 % 2;
        return boolValueOf;
    }

    public final void d(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        I();
        this.E.e(context, this.f24468t, new o.cc.c() { // from class: o.ep.d.4

            /* JADX INFO: renamed from: a */
            private static int f24483a = 0;

            /* JADX INFO: renamed from: e */
            private static int f24484e = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ OperationCallback f24485b;

            AnonymousClass4(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // o.cc.c
            public final void a() {
                int i22 = 2 % 2;
                int i3 = f24483a + 51;
                int i4 = i3 % 128;
                f24484e = i4;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    int i5 = ((-1) - (((-1) - i4) | ((-1) - 105))) + ((-1) - (((-1) - i4) & ((-1) - 105)));
                    f24483a = i5 % 128;
                    int i6 = i5 % 2;
                    operationCallback2.onSuccess(null);
                    int i7 = f24484e;
                    int i8 = ((37 | i7) << 1) - (i7 ^ 37);
                    f24483a = i8 % 128;
                    int i9 = i8 % 2;
                }
                int i10 = f24484e + 99;
                f24483a = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 90 / 0;
                }
            }

            @Override // o.cc.c
            public final void e(o.bg.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24483a;
                int i4 = (((i3 + 55) - (55 & i3)) << 1) - (i3 ^ 55);
                int i5 = i4 % 128;
                f24484e = i5;
                int i6 = i4 % 2;
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    int i7 = (i5 ^ 31) + (((-1) - (((-1) - i5) | ((-1) - 31))) << 1);
                    f24483a = i7 % 128;
                    int i8 = i7 % 2;
                    operationCallback2.onError(o.by.c.b(cVar).a());
                    int i9 = f24484e;
                    int i10 = ((i9 + 37) - (37 | i9)) + ((-1) - (((-1) - i9) & ((-1) - 37)));
                    f24483a = i10 % 128;
                    int i11 = i10 % 2;
                }
                int i12 = f24483a + 117;
                f24484e = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        int i3 = R + 21;
        N = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void d(String str) throws Throwable {
        String strIntern;
        String str2;
        int i2 = 2 % 2;
        int i3 = N + 91;
        R = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = N + 41;
            R = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                P("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 9, 0, 5}, true, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                P("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new int[]{141, 46, 0, 0}, false, objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[4];
                objArr3[0] = this.f24468t;
                objArr3[0] = str;
                str2 = String.format(strIntern2, objArr3);
            } else {
                Object[] objArr4 = new Object[1];
                P("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 9, 0, 5}, true, objArr4);
                strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                P("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new int[]{141, 46, 0, 0}, false, objArr5);
                str2 = String.format(((String) objArr5[0]).intern(), this.f24468t, str);
            }
            o.ea.f.c(strIntern, str2);
        }
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr6 = new Object[1];
            P(null, new int[]{63, 5, 42, 5}, true, objArr6);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr6[0]).intern());
        }
        if (this.I == null) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unknown;
            Object[] objArr7 = new Object[1];
            P(null, new int[]{63, 5, 42, 5}, true, objArr7);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr7[0]).intern());
        }
        I();
        a aVar = this.I.get(str);
        if (aVar == null) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Unknown;
            Object[] objArr8 = new Object[1];
            P(null, new int[]{63, 5, 42, 5}, true, objArr8);
            throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr8[0]).intern());
        }
        if (!aVar.e()) {
            WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
            Object[] objArr9 = new Object[1];
            P(null, new int[]{63, 5, 42, 5}, true, objArr9);
            throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr9[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (bVarC.s()) {
            Object[] objArr10 = {bVarC};
            int i6 = o.en.b.f24090e * (-1580596594);
            o.en.b.f24090e = i6;
            int i7 = o.en.b.f24087b * (-2071415875);
            o.en.b.f24087b = i7;
            ((o.fr.e) o.en.b.a(342371170, i6, objArr10, i7, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().d(this.f24468t, str);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.WrongState;
        Object[] objArr11 = new Object[1];
        P("\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{68, 6, 0, 5}, true, objArr11);
        String strIntern3 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        P("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{74, 42, 0, 28}, true, objArr12);
        throw new WalletValidationException(walletValidationErrorCode5, strIntern3, ((String) objArr12[0]).intern());
    }

    public final void d(o.en.e eVar) {
        int i2 = 2 % 2;
        int i3 = N + 121;
        R = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24470v = eVar;
        } else {
            this.f24470v = eVar;
            int i4 = 17 / 0;
        }
    }

    public final EmvApplicationGroup e(String str) {
        int id = (int) Thread.currentThread().getId();
        int i2 = f24453e * 1386187316;
        f24453e = i2;
        int i3 = f24454f * 464282923;
        f24454f = i3;
        return (EmvApplicationGroup) e(324309083, -324309080, new Object[]{this, str}, i2, i3, (int) Runtime.getRuntime().totalMemory(), id);
    }

    public final d e() {
        int i2 = 2 % 2;
        int i3 = N + 113;
        R = i3 % 128;
        int i4 = i3 % 2;
        o.eq.d dVar = o.eq.d.f24732c;
        if (i4 != 0) {
            return b(dVar);
        }
        b(dVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void e(Context context, boolean z2, OperationCallback<Void> operationCallback) throws Throwable {
        Object[] objArr = {this, context, Boolean.valueOf(z2), operationCallback};
        int i2 = f24452d * (-1246855258);
        f24452d = i2;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i3 = f24449a * (-1196439380);
        f24449a = i3;
        e(1880222667, -1880222667, objArr, iMyPid, iMyUid, i3, i2);
    }

    public final String f() {
        String str;
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 75;
        N = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f24471w;
            int i5 = 48 / 0;
        } else {
            str = this.f24471w;
        }
        int i6 = i3 + 93;
        N = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = R + 43;
        int i4 = i3 % 128;
        N = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f24472x;
        int i5 = i4 + 91;
        R = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = R + 95;
        int i4 = i3 % 128;
        N = i4;
        int i5 = i3 % 2;
        String str = this.f24473y;
        int i6 = i4 + 15;
        R = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean h(String str) {
        int i2 = 2 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap == null) {
            return false;
        }
        Iterator<a> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            int i3 = N + 11;
            R = i3 % 128;
            if (i3 % 2 == 0) {
                it.next().h().equals(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (it.next().h().equals(str)) {
                return true;
            }
        }
        int i4 = R + 57;
        N = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final o.en.e i() {
        o.en.e eVar;
        int i2 = 2 % 2;
        int i3 = R + 111;
        int i4 = i3 % 128;
        N = i4;
        if (i3 % 2 != 0) {
            eVar = this.f24470v;
            int i5 = 29 / 0;
        } else {
            eVar = this.f24470v;
        }
        int i6 = i4 + 109;
        R = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = N;
        int i4 = i3 + 93;
        R = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f24469u;
        int i5 = i3 + 71;
        R = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final o.dx.f k() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f24451c * (-406850263);
        f24451c = i3;
        return (o.dx.f) e(-268701458, 268701459, new Object[]{this}, i3, new Random().nextInt(559253932), new Random().nextInt(), i2);
    }

    public final o.dx.d l() {
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 105;
        N = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        o.dx.d dVar = this.H;
        int i5 = i3 + 29;
        N = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    public final Short m() {
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 27;
        N = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.f24474z;
        if (bArr != null) {
            return Short.valueOf(o.ei.a.a(bArr));
        }
        int i6 = i3 + 29;
        int i7 = i6 % 128;
        N = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 95;
        R = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 47;
        N = i4 % 128;
        int i5 = i4 % 2;
        String str = this.B;
        int i6 = i3 + 33;
        N = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String o() {
        int i2 = 2 % 2;
        int i3 = R + 5;
        N = i3 % 128;
        int i4 = i3 % 2;
        String str = this.A;
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
        return str;
    }

    public final f p() {
        int i2 = f24455g * 1257510192;
        f24455g = i2;
        int i3 = f24458j * (-785443339);
        f24458j = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = f24463o * (-1273864872);
        f24463o = i4;
        return (f) e(1155975806, -1155975801, new Object[]{this}, i3, iFreeMemory, i4, i2);
    }

    public final String q() {
        int id = (int) Thread.currentThread().getId();
        int iMyUid = Process.myUid();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = f24464p * 734577306;
        f24464p = i2;
        return (String) e(-198342416, 198342424, new Object[]{this}, iMyUid, iFreeMemory, i2, id);
    }

    public final o.er.f r() {
        int i2 = 2 % 2;
        int i3 = N + 111;
        int i4 = i3 % 128;
        R = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        o.er.f fVar = this.K;
        int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        N = i5 % 128;
        int i6 = i5 % 2;
        return fVar;
    }

    public final c s() {
        int i2 = 2 % 2;
        int i3 = R + 123;
        int i4 = i3 % 128;
        N = i4;
        int i5 = i3 % 2;
        c cVar = this.L;
        int i6 = i4 + 63;
        R = i6 % 128;
        if (i6 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    public final int t() {
        int i2 = 2 % 2;
        int i3 = N;
        int i4 = i3 + 97;
        R = i4 % 128;
        int i5 = i4 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap != null) {
            int i6 = i3 + 23;
            R = i6 % 128;
            int i7 = i6 % 2;
            return linkedHashMap.size();
        }
        int i8 = i3 + 91;
        R = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    public final boolean u() {
        int i2 = 2 % 2;
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap == null) {
            int i3 = R + 113;
            N = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Iterator<a> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            int i5 = R + 77;
            N = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().e();
                throw null;
            }
            if (it.next().e()) {
                int i6 = N + 125;
                R = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 54 / 0;
                }
                return true;
            }
        }
        return false;
    }

    public final Map<String, EmvApplicationGroup> v() {
        int i2 = 2 % 2;
        int i3 = N;
        int i4 = i3 + 95;
        R = i4 % 128;
        int i5 = i4 % 2;
        if (this.I != null) {
            HashMap map = new HashMap();
            for (String str : this.I.keySet()) {
                map.put(str, new EmvApplicationGroup(this.I.get(str)));
            }
            return map;
        }
        int i6 = i3 + 57;
        R = i6 % 128;
        if (i6 % 2 != 0) {
            return Collections.emptyMap();
        }
        Collections.emptyMap();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String w() {
        LinkedHashMap<String, a> linkedHashMap;
        int i2 = 2 % 2;
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.s()) {
            return null;
        }
        int i3 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i3;
        int i4 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i4;
        String strE = ((o.fr.e) o.en.b.a(342371170, i3, new Object[]{bVarC}, i4, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().e(this.f24468t);
        if (strE != null && (linkedHashMap = this.I) != null && linkedHashMap.containsKey(strE)) {
            return strE;
        }
        LinkedHashMap<String, a> linkedHashMap2 = this.I;
        if (linkedHashMap2 != null) {
            a aVar = null;
            for (a aVar2 : linkedHashMap2.values()) {
                if (aVar == null) {
                    int i5 = N + 5;
                    R = i5 % 128;
                    int i6 = i5 % 2;
                    aVar = aVar2;
                }
                if (aVar2.e()) {
                    return aVar2.h();
                }
            }
            if (aVar != null) {
                int i7 = R + 57;
                N = i7 % 128;
                int i8 = i7 % 2;
                return aVar.h();
            }
        }
        return null;
    }

    public final void x() throws Throwable {
        int i2 = 2 % 2;
        int i3 = R + 9;
        N = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            P("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{0, 9, 0, 5}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            P(null, new int[]{116, 25, 142, 18}, true, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        I();
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            P("\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{68, 6, 0, 5}, true, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            P("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{74, 42, 0, 28}, true, objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        int i4 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i4;
        int i5 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i5;
        ((o.fr.e) o.en.b.a(342371170, i4, new Object[]{bVarC}, i5, -342371167, Process.myUid(), new Random().nextInt(460146032))).a().b(this.f24468t);
        int i6 = N + 125;
        R = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
    }

    public final Iterator<a> y() {
        int i2 = 2 % 2;
        int i3 = R + 105;
        N = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinkedHashMap<String, a> linkedHashMap = this.I;
        if (linkedHashMap != null) {
            return linkedHashMap.values().iterator();
        }
        Iterator<a> itEmptyIterator = Collections.emptyIterator();
        int i4 = N + 39;
        R = i4 % 128;
        int i5 = i4 % 2;
        return itEmptyIterator;
    }

    public final int z() {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f24457i * (-1048349694);
        f24457i = i2;
        int iMyUid = Process.myUid();
        int i3 = f24456h * 1809045599;
        f24456h = i3;
        return ((Integer) e(-1115375899, 1115375903, new Object[]{this}, i2, iMyUid, i3, iUptimeMillis)).intValue();
    }
}
