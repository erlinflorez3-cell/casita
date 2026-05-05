package fr.antelop.sdk.settings;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodUsage;
import fr.antelop.sdk.authentication.CustomerAuthenticationPattern;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.io.encoding.Base64;
import o.a.f;
import o.a.h;
import o.a.l;
import o.d.d;
import o.ea.m;
import o.fm.a;
import o.fm.b;
import o.fm.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSettings {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f19519a = 0;

    /* JADX INFO: renamed from: b */
    private static int[] f19520b = null;

    /* JADX INFO: renamed from: d */
    private static int f19521d = 0;
    private final Limits limits;
    private final Locale locale;
    private final Security security;

    public static final class Limits {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        public static int A = 0;
        public static int B = 0;
        public static int C = 0;
        public static int D = 0;
        public static int E = 0;
        public static int F = 0;
        public static int G = 0;
        public static int H = 0;
        public static int I = 0;
        public static int J = 0;
        public static int K = 0;
        public static int L = 0;
        public static int M = 0;

        /* JADX INFO: renamed from: a */
        private static boolean f19522a = false;

        /* JADX INFO: renamed from: b */
        private static boolean f19523b = false;

        /* JADX INFO: renamed from: c */
        private static int f19524c = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f19525d = null;

        /* JADX INFO: renamed from: e */
        private static int f19526e = 0;

        /* JADX INFO: renamed from: f */
        private static int f19527f = 0;

        /* JADX INFO: renamed from: g */
        private static byte[] f19528g = null;

        /* JADX INFO: renamed from: h */
        private static char[] f19529h = null;

        /* JADX INFO: renamed from: i */
        private static short[] f19530i = null;

        /* JADX INFO: renamed from: j */
        private static int f19531j = 0;

        /* JADX INFO: renamed from: k */
        private static int f19532k = 0;

        /* JADX INFO: renamed from: l */
        private static int f19533l = 0;

        /* JADX INFO: renamed from: m */
        private static int f19534m = 0;

        /* JADX INFO: renamed from: n */
        private static char f19535n = 0;

        /* JADX INFO: renamed from: o */
        private static int f19536o = 0;

        /* JADX INFO: renamed from: p */
        public static int f19537p = 0;

        /* JADX INFO: renamed from: q */
        public static int f19538q = 0;

        /* JADX INFO: renamed from: r */
        public static int f19539r = 0;

        /* JADX INFO: renamed from: s */
        public static int f19540s = 0;

        /* JADX INFO: renamed from: t */
        public static int f19541t = 0;

        /* JADX INFO: renamed from: u */
        public static int f19542u = 0;

        /* JADX INFO: renamed from: v */
        public static int f19543v = 0;

        /* JADX INFO: renamed from: w */
        public static int f19544w = 0;

        /* JADX INFO: renamed from: x */
        public static int f19545x = 0;

        /* JADX INFO: renamed from: y */
        public static int f19546y = 0;

        /* JADX INFO: renamed from: z */
        public static int f19547z = 0;
        private final a innerLimits;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r6, short r7, byte r8) {
            /*
                int r0 = r8 * 2
                int r8 = 1 - r0
                int r0 = r7 + 67
                int r7 = r6 + 4
                byte[] r6 = fr.antelop.sdk.settings.WalletSettings.Limits.$$c
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L28
                r2 = r8
                r3 = r4
            L11:
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L14:
                int r7 = r7 + 1
                byte r1 = (byte) r0
                int r3 = r2 + 1
                r5[r2] = r1
                if (r3 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L23:
                r1 = r6[r7]
                r2 = r0
                r0 = r1
                goto L11
            L28:
                r2 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.Limits.$$e(short, short, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            M = -1758791039;
            L = 2144976807;
            K = -461147492;
            J = 1474882897;
            I = 233228099;
            H = -194145052;
            G = -1456200553;
            F = -1585533096;
            E = 2104252135;
            D = 1762233649;
            C = -1573443141;
            B = -535201699;
            A = -354170740;
            f19547z = -2116931135;
            f19546y = -1574178566;
            f19545x = 309016619;
            f19544w = 1159178404;
            f19543v = 668388661;
            f19542u = 1302615303;
            f19541t = 1295605988;
            f19540s = -1506756070;
            f19539r = 964700603;
            f19538q = 1075278514;
            f19537p = 752857613;
            init$0();
            f19536o = 0;
            f19532k = 1;
            f19533l = 0;
            f19534m = 1;
            d();
            f19525d = new char[]{2446};
            f19526e = 2040400328;
            f19523b = true;
            f19522a = true;
            int i2 = f19536o + 21;
            f19532k = i2 % 128;
            int i3 = i2 % 2;
        }

        public Limits(a aVar) {
            this.innerLimits = aVar;
        }

        private static void N(String str, int i2, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            h hVar = new h();
            char[] cArr2 = f19529h;
            int i6 = 421932776;
            int i7 = -1;
            int i8 = 1;
            if (cArr2 != null) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = $10 + 59;
                    $11 = i12 % 128;
                    if (i12 % i4 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                            Object objA = d.a(i6);
                            if (objA == null) {
                                byte b3 = (byte) i7;
                                objA = d.a(270 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.alpha(0), Process.getGidForName("") + 12, -811348851, false, $$e(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 35))), (byte) 0), new Class[]{Integer.TYPE});
                            }
                            cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i11])};
                        Object objA2 = d.a(421932776);
                        if (objA2 == null) {
                            byte b4 = (byte) (-1);
                            objA2 = d.a(269 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((Process.getThreadPriority(0) + 20) >> 6), 11 - ExpandableListView.getPackedPositionGroup(0L), -811348851, false, $$e(b4, (byte) ((-1) - (((-1) - b4) | ((-1) - 35))), (byte) 0), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i11++;
                    }
                    i4 = 2;
                    i6 = 421932776;
                    i7 = -1;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(f19535n)};
            Object objA3 = d.a(421932776);
            if (objA3 == null) {
                byte b5 = (byte) (-1);
                objA3 = d.a(270 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -811348851, false, $$e(b5, (byte) (35 & b5), (byte) 0), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                char c2 = 3;
                int i13 = $10 + 3;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + i8];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = hVar;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = hVar;
                        objArr5[9] = hVar;
                        objArr5[8] = Integer.valueOf(cCharValue);
                        objArr5[7] = hVar;
                        objArr5[6] = hVar;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = hVar;
                        objArr5[c2] = hVar;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i8] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = d.a(219124184);
                        if (objA4 == null) {
                            byte b6 = (byte) (-1);
                            objA4 = d.a(825 - TextUtils.indexOf("", "", 0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.resolveSizeAndState(0, 0, 0) + 11, -611683395, false, $$e(b6, (byte) (44 & b6), (byte) 0), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                            int i15 = $10 + 93;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA5 = d.a(-634864343);
                            if (objA5 == null) {
                                byte b7 = (byte) (-1);
                                c2 = 3;
                                objA5 = d.a(218 - KeyEvent.normalizeMetaState(0), (char) Color.argb(0, 0, 0, 0), 11 - TextUtils.indexOf("", "", 0), 212688716, false, $$e(b7, (byte) ((b7 + 42) - (42 | b7)), (byte) 0), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = 3;
                            }
                            int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        } else {
                            c2 = 3;
                            if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i18 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i18];
                                cArr4[hVar.f19926b + 1] = cArr2[i19];
                            } else {
                                int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i20];
                                i8 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i21];
                            }
                        }
                        i8 = 1;
                    }
                    hVar.f19926b += 2;
                }
            }
            int i22 = 0;
            while (i22 < i2) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                i22++;
                int i23 = $11 + 117;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 5 % 2;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Removed duplicated region for block: B:136:0x024a A[PHI: r4
  0x024a: PHI (r4v20 int) = (r4v3 int), (r4v23 int) binds: [B:139:0x025f, B:135:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0262 A[PHI: r4
  0x0262: PHI (r4v4 int) = (r4v3 int), (r4v23 int) binds: [B:139:0x025f, B:135:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void O(short r24, int r25, byte r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 861
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.Limits.O(short, int, byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void P(int r8, byte r9, int r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = fr.antelop.sdk.settings.WalletSettings.Limits.$$a
                int r0 = r10 + 4
                int r2 = r9 * 4
                int r1 = 1 - r2
                int r6 = r8 + 97
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L29
                r2 = r0
                r1 = r4
            L13:
                int r6 = r6 + r0
                r0 = r2
            L15:
                int r2 = r0 + 1
                byte r0 = (byte) r6
                r5[r1] = r0
                if (r1 != r3) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L24:
                int r1 = r1 + 1
                r0 = r7[r2]
                goto L13
            L29:
                r1 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.Limits.P(int, byte, int, java.lang.Object[]):void");
        }

        private static void Q(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i4 = $10 + 17;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            f fVar = new f();
            char[] cArr3 = f19525d;
            int i6 = -1;
            int i7 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                        Object objA = d.a(1618406102);
                        if (objA == null) {
                            int iIndexOf = TextUtils.indexOf("", "") + 593;
                            char touchSlop = (char) (13181 - (ViewConfiguration.getTouchSlop() >> 8));
                            int bitsPerPixel = 10 - ImageFormat.getBitsPerPixel(i7);
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objA = d.a(iIndexOf, touchSlop, bitsPerPixel, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i8++;
                        i6 = -1;
                        i7 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(f19526e)};
            Object objA2 = d.a(-1503702982);
            long j2 = 0;
            if (objA2 == null) {
                objA2 = d.a(32 - Drawable.resolveOpacity(0, 0), (char) Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            int i9 = 1540807955;
            if (f19522a) {
                fVar.f19923e = bArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i10 = $11 + 1;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = d.a(1540807955);
                    if (objA3 == null) {
                        objA3 = d.a(458 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 12 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), -1923924106, false, $$e((byte) (-1), (byte) (-$$c[1]), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    j2 = 0;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (f19523b) {
                int i12 = $10 + 63;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    fVar.f19923e = cArr2.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 1;
                } else {
                    fVar.f19923e = cArr2.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                }
                while (fVar.f19922a < fVar.f19923e) {
                    cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = d.a(i9);
                    if (objA4 == null) {
                        objA4 = d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 458, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 11 - TextUtils.getCapsMode("", 0, 0), -1923924106, false, $$e((byte) (-1), (byte) (-$$c[1]), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                    i9 = 1540807955;
                }
                objArr[0] = new String(cArr);
                return;
            }
            int i13 = 0;
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i13;
                if (fVar.f19922a >= fVar.f19923e) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i13 = fVar.f19922a + 1;
                }
            }
        }

        static void d() {
            f19524c = -508138932;
            f19527f = 1150422430;
            f19531j = -509274998;
            f19528g = new byte[]{101, MessagePack.Code.FIXEXT1, -127, MessagePack.Code.FIXEXT4, 96, -69, 125, 110, -20, 110, -108, MessagePack.Code.UINT64, MessagePack.Code.UINT64, -94, -66, MessagePack.Code.NEVER_USED, -73, MessagePack.Code.FIXSTR_PREFIX, -72, -80, -75, -73, -16, -113, MessagePack.Code.BIN16, -94, -78, -73, -77, -15, -121, -87, 119, -65, -122, -89, -118, -3, 97, 113, 112, 119, -92, -116, -89, MessagePack.Code.EXT32, 76, -93, -89, 113, -77, 123, 116, -90, MessagePack.Code.UINT32, 100, -121, -87, 119, MessagePack.Code.UINT64, 100, -121, -87, 119, MessagePack.Code.UINT64, 55, -108, 58, -87, 48, -121, -98, Ascii.CR, -87, -94, 58, -87, 48, -89, 126, 125, 76, 77, 54, -95, 57, -90, 59, Ascii.ETB, 109, 95, 93, 111, -115, Ascii.GS, 117, 5, -117, 113, 2, -93, -17, 114, -119, Ascii.RS, MessagePack.Code.UINT64, MessagePack.Code.NIL, Ascii.RS, -107, -31, Ascii.NAK, 46, 45, -111, 58, 76, Ascii.DC2, MessagePack.Code.NEGFIXINT_PREFIX, 16, -76, 19, -69, -93, MessagePack.Code.INT8, -8, 41, -65, MessagePack.Code.NIL, 4, 41, -79, 33, -93, -75, 40, -80, -28, -21, -21, -23, MessagePack.Code.UINT64, -28, MessagePack.Code.ARRAY16, -28, -19, MessagePack.Code.UINT64, MessagePack.Code.MAP32, -83, -107, -126, -109, -88, -67, 113, -89, -100, -84, -107, -79, 126, -82, -103, 7, MessagePack.Code.FIXEXT4, Ascii.SO, MessagePack.Code.FIXEXT2, 7, -4, -68, -2, MessagePack.Code.INT32, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT8, -15, -3, 10, MessagePack.Code.INT32, MessagePack.Code.FIXEXT2, -5, 43, -2, MessagePack.Code.EXT16, Ascii.SI, MessagePack.Code.FIXEXT1, 3, 5, Ascii.NAK, -106, 8, 1, Ascii.NAK, MessagePack.Code.FALSE, -19, MessagePack.Code.INT32, MessagePack.Code.FIXEXT8, 6, MessagePack.Code.MAP16, 7, 34, 34, -91, 62, 64, -123, -108, 58, -110, 54, 67, 122, 52, -89, 34, Ascii.SYN, Ascii.NAK, 92, 40, 19, 57, 33, 33, 37, 32, -10, Ascii.US, 124, 40, 19, 59, 40, 33, Ascii.SYN, -1, 108, Base64.padSymbol, 60, 39, 16, 56, Ascii.ETB, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115, -115};
            f19529h = new char[]{64638, 64595, 64543, 64585, 64632, 64523, 64592, 64591, 64597, 64637, 64612, 64593, 64590, 64522, 64588, 64587, 64629, 64618, 64598, 64619, 64578, 64611, 64586, 64620, 64517, 64625, 64580, 64579, 64594, 64599, 64589, 64559, 64576, 64582, 64577, 64584};
            f19535n = (char) 51641;
        }

        /* JADX WARN: Removed duplicated region for block: B:504:0x0b58  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x0d56  */
        /* JADX WARN: Removed duplicated region for block: B:519:0x0d97  */
        /* JADX WARN: Removed duplicated region for block: B:555:0x10f1 A[LOOP:5: B:837:0x1084->B:555:0x10f1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:589:0x11aa A[Catch: Exception -> 0x1334, IOException -> 0x13b6, all -> 0x1604, TryCatch #3 {IOException -> 0x13b6, blocks: (B:586:0x1199, B:587:0x119c, B:589:0x11aa, B:590:0x11e7, B:592:0x11fe, B:593:0x123e, B:594:0x1250, B:596:0x1279, B:598:0x12c0, B:600:0x12e3, B:602:0x1306, B:604:0x1326, B:607:0x1330), top: B:791:0x1199 }] */
        /* JADX WARN: Removed duplicated region for block: B:592:0x11fe A[Catch: Exception -> 0x1334, IOException -> 0x13b6, all -> 0x1604, TryCatch #3 {IOException -> 0x13b6, blocks: (B:586:0x1199, B:587:0x119c, B:589:0x11aa, B:590:0x11e7, B:592:0x11fe, B:593:0x123e, B:594:0x1250, B:596:0x1279, B:598:0x12c0, B:600:0x12e3, B:602:0x1306, B:604:0x1326, B:607:0x1330), top: B:791:0x1199 }] */
        /* JADX WARN: Removed duplicated region for block: B:596:0x1279 A[Catch: IOException -> 0x13b6, all -> 0x1604, TryCatch #3 {IOException -> 0x13b6, blocks: (B:586:0x1199, B:587:0x119c, B:589:0x11aa, B:590:0x11e7, B:592:0x11fe, B:593:0x123e, B:594:0x1250, B:596:0x1279, B:598:0x12c0, B:600:0x12e3, B:602:0x1306, B:604:0x1326, B:607:0x1330), top: B:791:0x1199 }] */
        /* JADX WARN: Removed duplicated region for block: B:658:0x1380 A[Catch: Exception -> 0x138b, IOException -> 0x13b7, all -> 0x1604, TryCatch #1 {IOException -> 0x13b7, blocks: (B:656:0x137a, B:658:0x1380, B:659:0x1381, B:637:0x135d, B:638:0x1360, B:642:0x1364, B:644:0x136a, B:645:0x136b, B:649:0x136f, B:651:0x1375, B:652:0x1376, B:661:0x1383, B:663:0x1389, B:664:0x138a, B:665:0x138b, B:666:0x13b3), top: B:788:0x0ddd }] */
        /* JADX WARN: Removed duplicated region for block: B:659:0x1381 A[Catch: Exception -> 0x138b, IOException -> 0x13b7, all -> 0x1604, TryCatch #1 {IOException -> 0x13b7, blocks: (B:656:0x137a, B:658:0x1380, B:659:0x1381, B:637:0x135d, B:638:0x1360, B:642:0x1364, B:644:0x136a, B:645:0x136b, B:649:0x136f, B:651:0x1375, B:652:0x1376, B:661:0x1383, B:663:0x1389, B:664:0x138a, B:665:0x138b, B:666:0x13b3), top: B:788:0x0ddd }] */
        /* JADX WARN: Removed duplicated region for block: B:694:0x17ca  */
        /* JADX WARN: Removed duplicated region for block: B:700:0x1984 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:858:0x10f0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r32, int r33, int r34, int r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 9285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.Limits.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{125, 113, 52, MessagePack.Code.FLOAT32};
            $$b = 42;
        }

        static void init$1() {
            $$c = new byte[]{117, -6, 58, MessagePack.Code.MAP32};
            $$d = 109;
        }

        public final WalletSettingsValue<BigDecimal> getMaxPaymentAmount() {
            int i2 = 2 % 2;
            int i3 = f19534m + 83;
            f19533l = i3 % 128;
            int i4 = i3 % 2;
            WalletSettingsValue<BigDecimal> walletSettingsValueE = this.innerLimits.e();
            int i5 = f19533l + 97;
            f19534m = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return walletSettingsValueE;
        }
    }

    public static final class Locale {
        private final b innerLocale;

        public Locale(b bVar) {
            this.innerLocale = bVar;
        }

        public final WalletSettingsValue<Currency> getCurrency() {
            return this.innerLocale.d();
        }
    }

    public static final class Security {
        private final o.fm.d authenticationPatterns;
        private final j innerSecurity;

        public Security(j jVar, o.fm.d dVar) {
            this.innerSecurity = jVar;
            this.authenticationPatterns = dVar;
        }

        @Deprecated
        public final WalletSettingsValue<Boolean> arePaymentsGeolocated() {
            return this.innerSecurity.e();
        }

        public final WalletSettingsValue<Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> getCustomerAuthenticationMethods() {
            return this.innerSecurity.d();
        }

        public final WalletSettingsValue<Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod>> getCustomerAuthenticationMethods(CustomerAuthenticationMethodUsage... customerAuthenticationMethodUsageArr) {
            return this.innerSecurity.b(customerAuthenticationMethodUsageArr);
        }

        public final WalletSettingsValue<Map<String, CustomerAuthenticationPattern>> getCustomerAuthenticationPatterns() {
            return new WalletSettingsValue<>(m.a(this.authenticationPatterns.c()), WalletSettingsRights.ReadOnly);
        }

        public final WalletSettingsValue<TransactionStartCondition> getTransactionStartCondition() {
            Object[] objArr = {this.innerSecurity};
            int i2 = j.f26096b * (-2102023267);
            j.f26096b = i2;
            return (WalletSettingsValue) j.c((int) SystemClock.uptimeMillis(), Process.myPid(), 224860623, -224860623, (int) Runtime.getRuntime().maxMemory(), objArr, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r9, int r10, short r11) {
        /*
            byte[] r8 = fr.antelop.sdk.settings.WalletSettings.$$c
            int r0 = r10 * 4
            int r7 = 1 - r0
            int r0 = r9 * 2
            int r6 = 3 - r0
            int r0 = r11 * 2
            int r5 = 121 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2a
            r0 = r7
            r2 = r3
        L15:
            int r0 = -r0
            int r5 = r5 + r0
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            int r6 = r6 + 1
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r8[r6]
            goto L15
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.$$e(short, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        f19521d = 0;
        f19519a = 1;
        f19520b = new int[]{1999245481, -628877651, -1566507830, -1329405829, -2102297641, -425398185, 89687422, -409823635, 181604559, 555573121, -1974197689, -1448866098, -1915645129, -1893710137, 548581173, 1974637314, -1655463904, -565939601};
    }

    public WalletSettings(Limits limits, Security security, Locale locale) {
        this.limits = limits;
        this.security = security;
        this.locale = locale;
    }

    private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f19520b;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11;
            int i7 = i6 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i6 + 117;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(674 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.resolveSizeAndState(0, 0, 0), 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), -328001469, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i11++;
                    i4 = 989264422;
                    j2 = 0;
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
        int[] iArr5 = f19520b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objA2 = d.a(TextUtils.getTrimmedLength("") + 675, (char) ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, -328001469, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i12++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                lVar.f19942e ^= iArr4[i13];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = d.a(301 - KeyEvent.getDeadChar(0, 0), (char) (52698 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, -1416256172, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
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
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = d.a(229 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 51004), TextUtils.indexOf((CharSequence) "", '0', 0) + 10, -330018025, false, $$e(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02f5 A[Catch: all -> 0x0413, TRY_LEAVE, TryCatch #0 {all -> 0x0413, blocks: (B:50:0x000d, B:54:0x004d, B:56:0x0074, B:57:0x0133, B:59:0x0181, B:64:0x01cb, B:69:0x0223, B:74:0x02ca, B:76:0x02f5, B:78:0x031c, B:79:0x0391, B:82:0x03de, B:72:0x027a), top: B:90:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r16, long r17, long r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.settings.WalletSettings.d(android.content.Context, long, long):void");
    }

    private static void e(byte b2, byte b3, byte b4, Object[] objArr) {
        int i2 = b2 + 4;
        int i3 = 115 - (b4 * 2);
        byte[] bArr = $$a;
        int i4 = b3 * 5;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 5;
        }
        while (true) {
            i5++;
            i2++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i2]) - 5;
        }
    }

    static void init$0() {
        $$a = new byte[]{53, 97, -95, 41, MessagePack.Code.BIN8, 57, 19, MessagePack.Code.TRUE, 60};
        $$b = 71;
    }

    static void init$1() {
        $$c = new byte[]{90, 91, 103, -77};
        $$d = JfifUtil.MARKER_RST7;
    }

    public final Limits limits() {
        int i2 = 2 % 2;
        int i3 = f19519a;
        int i4 = i3 + 87;
        f19521d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Limits limits = this.limits;
        int i5 = i3 + 71;
        f19521d = i5 % 128;
        int i6 = i5 % 2;
        return limits;
    }

    public final Locale locale() {
        int i2 = 2 % 2;
        int i3 = f19519a + 29;
        f19521d = i3 % 128;
        int i4 = i3 % 2;
        Locale locale = this.locale;
        if (i4 != 0) {
            int i5 = 21 / 0;
        }
        return locale;
    }

    public final Security security() {
        int i2 = 2 % 2;
        int i3 = f19521d + 77;
        f19519a = i3 % 128;
        int i4 = i3 % 2;
        Security security = this.security;
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        return security;
    }
}
