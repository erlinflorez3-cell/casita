package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.f;
import o.a.k;
import o.a.o;
import o.ep.d;
import o.ep.i;
import o.eq.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class Token {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19251a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19252b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f19253c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f19254d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f19255e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19256f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f19257g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f19258h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19259i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19260j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19261k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19262l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19263m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19264n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19265o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f19266p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f19267q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f19268r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f19269s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f19270t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f19271u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f19272v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f19273w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f19274x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f19275y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f19276z = 0;
    private final d digitalCard;
    private final e emvApplication;
    private final i innerToken;

    public enum Status {
        Active,
        Suspended,
        Inactive
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenServiceProvider {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        private static final /* synthetic */ TokenServiceProvider[] $VALUES;
        public static final TokenServiceProvider MDES;
        public static final TokenServiceProvider VTS;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f19277a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f19278b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static long f19279c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f19280d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f19281e = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, int r7, short r8) {
            /*
                int r2 = r6 * 2
                int r1 = 1 - r2
                int r0 = r7 * 7
                int r7 = r0 + 107
                int r0 = r8 * 2
                int r6 = 4 - r0
                byte[] r5 = fr.antelop.sdk.digitalcard.Token.TokenServiceProvider.$$a
                byte[] r4 = new byte[r1]
                r3 = 0
                int r2 = 0 - r2
                if (r5 != 0) goto L2a
                r0 = r2
                r1 = r3
            L17:
                int r7 = r7 + r0
                int r6 = r6 + 1
            L1a:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r2) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                int r1 = r1 + 1
                r0 = r5[r6]
                goto L17
            L2a:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.TokenServiceProvider.$$c(int, int, short):java.lang.String");
        }

        private static /* synthetic */ TokenServiceProvider[] $values() {
            int i2 = 2 % 2;
            int i3 = f19281e;
            int i4 = i3 + 103;
            f19278b = i4 % 128;
            int i5 = i4 % 2;
            TokenServiceProvider[] tokenServiceProviderArr = {MDES, VTS};
            int i6 = i3 + 65;
            f19278b = i6 % 128;
            int i7 = i6 % 2;
            return tokenServiceProviderArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f19277a = 0;
            f19280d = 1;
            f19278b = 0;
            f19281e = 1;
            e();
            Object[] objArr = new Object[1];
            f("\uf7ca\uf787茞嗂쾣\ud81b\ue305\ude33", View.MeasureSpec.getMode(0) + 1, objArr);
            MDES = new TokenServiceProvider(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            f("䊏䋙걷\ue275\uf762咤\uf492", 1 - View.MeasureSpec.getMode(0), objArr2);
            VTS = new TokenServiceProvider(((String) objArr2[0]).intern(), 1);
            $VALUES = $values();
            int i2 = f19280d + 9;
            f19277a = i2 % 128;
            int i3 = i2 % 2;
        }

        private TokenServiceProvider(String str, int i2) {
        }

        static void e() {
            f19279c = 7550782851724921147L;
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            Object charArray = str2 != null ? str2.toCharArray() : str2;
            k kVar = new k();
            char[] cArrC = k.c(f19279c ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i6 = $11 + 31;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19279c)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(229 - TextUtils.getOffsetBefore("", 0), (char) (51004 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 9 - Gravity.getAbsoluteGravity(0, 0), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(675 - View.MeasureSpec.getMode(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 522683165, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        static void init$0() {
            $$a = new byte[]{Ascii.NAK, 117, 119, 110};
            $$b = 19;
        }

        public static TokenServiceProvider valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f19278b + 123;
            f19281e = i3 % 128;
            int i4 = i3 % 2;
            TokenServiceProvider tokenServiceProvider = (TokenServiceProvider) Enum.valueOf(TokenServiceProvider.class, str);
            int i5 = f19278b + 49;
            f19281e = i5 % 128;
            if (i5 % 2 != 0) {
                return tokenServiceProvider;
            }
            throw null;
        }

        public static TokenServiceProvider[] values() {
            int i2 = 2 % 2;
            int i3 = f19278b + 63;
            f19281e = i3 % 128;
            int i4 = i3 % 2;
            TokenServiceProvider[] tokenServiceProviderArr = $VALUES;
            if (i4 != 0) {
                return (TokenServiceProvider[]) tokenServiceProviderArr.clone();
            }
            TokenServiceProvider[] tokenServiceProviderArr2 = (TokenServiceProvider[]) tokenServiceProviderArr.clone();
            int i5 = 40 / 0;
            return tokenServiceProviderArr2;
        }
    }

    public enum Type {
        SecureElement,
        Hce,
        CardOnFile,
        QRCode,
        Other
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r8 = 105 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 + 4
            byte[] r5 = fr.antelop.sdk.digitalcard.Token.$$c
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r5 != 0) goto L29
            r1 = r8
            r0 = r3
            r2 = r6
        L12:
            int r6 = r6 + r1
            r1 = r0
            r8 = r6
            r6 = r2
        L16:
            int r2 = r6 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r1 = r5[r2]
            r6 = r8
            goto L12
        L29:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.$$g(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        J = 1351790947;
        I = 47199186;
        H = 1579696732;
        G = -42106507;
        F = -2032431146;
        E = -2017318445;
        D = -1245377552;
        C = 1921347209;
        B = -1900022854;
        A = 1274668323;
        f19276z = 1313973940;
        f19275y = 1714082230;
        f19274x = -1678946153;
        f19273w = 1845617895;
        f19272v = 692187901;
        f19271u = -746201138;
        f19270t = 595581881;
        f19269s = 273370951;
        f19268r = -1469316589;
        f19267q = -1946485676;
        f19266p = 2080848099;
        f19265o = -2007915114;
        f19264n = 369602155;
        f19263m = -312998041;
        f19262l = 596288721;
        f19261k = 204305460;
        init$0();
        f19256f = 0;
        f19260j = 1;
        f19259i = 0;
        f19258h = 1;
        d();
        f19253c = new char[]{2503, 2511, 2487, 2510, 2523, 2486, 2509, 2504, 2315, 2314, 2544};
        f19255e = 2040400186;
        f19251a = true;
        f19252b = true;
        int i2 = f19260j + 59;
        f19256f = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Token(d dVar, e eVar, i iVar) {
        this.digitalCard = dVar;
        this.emvApplication = eVar;
        this.innerToken = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void K(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r1 = r7 * 4
            int r0 = 1 - r1
            byte[] r7 = fr.antelop.sdk.digitalcard.Token.$$a
            int r6 = r6 + 97
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L2c
            r2 = r8
            r1 = r4
        L15:
            int r6 = r6 + r8
            int r8 = r2 + 1
        L18:
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r1 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L25:
            int r1 = r1 + 1
            r0 = r7[r8]
            r2 = r8
            r8 = r0
            goto L15
        L2c:
            r1 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.K(short, int, int, java.lang.Object[]):void");
    }

    private static void L(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 111;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f19254d[i2 >>> i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(742 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, 632508977, false, $$g(b2, b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f19257g), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 766, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12469), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), 1946853218, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(View.resolveSize(0, 0) + 387, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 39570797, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f19254d[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 742, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 632508977, false, $$g(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 6)))), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f19257g), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    objA5 = o.d.d.a(766 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12469), 12 - (Process.myTid() >> 22), 1946853218, false, $$g(b10, b11, (byte) (b11 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    objA6 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 387, (char) ((-1) - MotionEvent.axisFromString("")), Color.red(0) + 18, 39570797, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i9 = $11 + 75;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr8 = {oVar, oVar};
                Object objA7 = o.d.d.a(-723636472);
                if (objA7 == null) {
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    objA7 = o.d.d.a(387 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 39570797, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objA7).invoke(null, objArr8);
                int i10 = 53 / 0;
            } else {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr9 = {oVar, oVar};
                Object objA8 = o.d.d.a(-723636472);
                if (objA8 == null) {
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    objA8 = o.d.d.a(388 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, 39570797, false, $$g(b16, b17, b17), new Class[]{Object.class, Object.class});
                }
                ((Method) objA8).invoke(null, objArr9);
            }
        }
        String str = new String(cArr);
        int i11 = $11 + 111;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void M(int r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = fr.antelop.sdk.digitalcard.Token.$$d
            int r0 = r10 * 79
            int r7 = r0 + 4
            int r0 = r9 * 79
            int r6 = 80 - r0
            int r0 = r11 * 2
            int r0 = r0 + 100
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2e
            r0 = r6
            r3 = r7
            r2 = r4
        L16:
            int r7 = r7 + r0
            int r3 = r3 + 1
            int r7 = r7 + (-4)
            r1 = r2
        L1c:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r5[r1] = r0
            if (r2 != r6) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L2b:
            r0 = r8[r3]
            goto L16
        L2e:
            r1 = r4
            r3 = r7
            r7 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.M(int, short, short, java.lang.Object[]):void");
    }

    private static void N(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
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
        f fVar = new f();
        char[] cArr2 = f19253c;
        int i5 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(593 - Color.green(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13181), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -1225586509, false, $$g(b2, b3, (byte) ((b3 + 38) - (38 & b3))), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = -1;
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
        Object[] objArr3 = {Integer.valueOf(f19255e)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a((Process.myTid() >> 22) + 32, (char) View.combineMeasuredStates(0, 0), 10 - MotionEvent.axisFromString(""), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f19252b) {
            int i7 = $11 + 7;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA3 = o.d.d.a(458 - TextUtils.getCapsMode("", 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, -1923924106, false, $$g(b4, b5, (byte) ((b5 + 32) - (32 & b5))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f19251a) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            int i9 = $11 + 85;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (fVar.f19922a < fVar.f19923e) {
                int i11 = $10 + 1;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[fVar.f19923e * fVar.f19922a] / i2] + iIntValue);
                    i3 = fVar.f19922a;
                } else {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i3 = fVar.f19922a + 1;
                }
                fVar.f19922a = i3;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            int i12 = $10 + 77;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = o.d.d.a(1540807955);
            if (objA4 == null) {
                byte b6 = (byte) (-1);
                byte b7 = (byte) (b6 + 1);
                objA4 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 457, (char) TextUtils.getOffsetBefore("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, -1923924106, false, $$g(b6, b7, (byte) ((-1) - (((-1) - b7) & ((-1) - 32)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i14 = $11 + 9;
            $10 = i14 % 128;
            int i15 = i14 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x1166  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x1225  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x16b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0bba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(android.content.Context r34, int r35, int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.b(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void d() {
        char[] cArr = new char[1955];
        ByteBuffer.wrap("\u0094\u0093i\u0007o lQbñ`\u009ce4{áxE~ò|Òq\bwÏt^JüH\u0082M/Cú@xF\u001cD\u008dY.\u0094\u0097i\u0005o¥lSbí`\u0090e4{\u009dxO~à|\u0090q/wßt@Jí\u0094\u0098i\bo²lBb°`\u0099e1{¡xM~¯|¯q\"wÅtYJíH\u008avö\u008b`\u008dÌ\u008e \u0080\u0087\u0082ñ\u0087I\u0099Û\u009a\u000f\u009c\u008d\u009eâ\u0093^\u0095\u0098\u0096/¨\u0081ªï(\u009eÕNÓâÐ\u0016ÞòÜÑÙ|ÇàÄ\rÂ¤ÀÖÍkË\u009dÈ1öªôÀñeÿ\u0088ü2úCøÞåYã\u0090à,îXìñéj\u0094Ýi\ro¡lUb±`\u0092e?{£xN~ç|\u0095q(wÞtrJøH\u008eM2CÜ@KF\u0017D\u009eY7_Ã\\kR\u001e\u0094Ýi\ro¡lUb±`\u0092e?{£xN~ç|\u0095q(wÞtrJûH\u009eM,CÚÆÓ;\u0014=³>^0¿2\u009671)¥*Q,ã.\u0097#z%ß&L\u0018ê\u001a\u008d\u001f*\u0011Þ\u0012i\u0014\u0015\u0016¿\u000b)\rÏ\u000ee\u0000\u0000\u0002º\u00070yÜ\u0094Ýi\fo°l@b±`\u0091e7{áxZ~ó|\u0093q+\u0094Ýi\fo°l@b±`\u0086e9{¢x\u0004~ñ|\u008eq4wÆ\u0094Ýi\u001ao l@bÿ`\u0087e4{àxx~Ç|±q4wÀtHJÌH\u0086M6CØ\u0094Ýi\u001ao½lPbê`\u0090e={àxF~è|\u009eqtwÚtDJêH\u0089M C\u0097@gF\u001c\u0094\u0090i\u0000o£lMbñ`\u008d~¨\u0083o\u0085È\u0086%\u0088\u009f\u008aå\u008fH\u0091\u0095\u0092=\u0094\u009d\u0096ç\u009b\u0001\u009d\u00ad\u009e= \u0090¢ç§a©\u0081ªL¬h®þ³]µ ¶G¸lºË¿WÁªÂ\u0001ÄgÆÁ\u0094Ýi\u001ao½lPbê`\u0090e={àxH~è|\u0092qtwØtHJåH\u0092M\u0014Cô@9F\u0003D\u009cY*_Ð\u0094Ýi\u001ao½lPbê`\u0090e={àxF~è|\u009eqtwÚtDJêH\u0089M'CÔ@aF%D£Y5_Ò\\pR\nPÿU?+Ä\u008ess£u\u000fvûx\u001fz5\u007f\u009ba\fbñdHf'k\u0090mkn÷i\u0003\u0094\u0085\u0092i\u0091Â\u009fh\u009d\u001f\u0098¿\u0086(\u0085\u0087\u0083j\u0081\u0010\u008c«\u008aA\u0094\u009ci\fo¥lPbû`Ûe>{ªx^\u0094Ýi\u0019o¶lLbý`Úe6{¦xF~ä|\u008fq\"wÅtYJíH\u008aM1\u0094\u009ci\fo©lVbí`\u0093\u0097 j¦lJoóaLc:f\u0094x\u001a{é}U\u007frr\u0096twwãI]K!N\u0083@zCÀE¦G<Z\u0080\\rtk\u0089ò\u008fT\u008c¤\u0094\u0082i\fo¶lPb÷`\u0086e${áxY~ø|\u008fquwÔtIJ¦H\u0083M'CÛ@aF\u0014DÀY\"_Ð\\jRTP·U-+À(c.\",¿!G'ç$V:\u00168¦=P3ñ1\u00956\u001d4¯\tS\u0094\u0082i\fo¶lPb÷`\u0086e${áxY~ø|\u008fquwÔtIJ¦H\u0083M'CÛ@aF\u0014DÀY\"_Ð\\jRTP·U-+À(c.\",¿!G'ç$V:\u00128¦=P3ñ1\u009f6\u001dô\"\t¬\u000f\u0016\fð\u0002W\u0000&\u0005\u0084\u001bA\u0018ù\u001eX\u001c/\u0011Õ\u0017t\u0014é*\u0006(#-\u0087#{ Á&´$`9\u0097?o<\u00912¹0\u00005\u0085\u0094\u0082i\fo¶lPb÷`\u0086e${áxY~ø|\u008fquwÔtIJ¦H\u0083M'CÛ@aF\u0014DÀY7_Ï\\1R\u0016P°U/\u0094\u0082i\fo¶lPb÷`\u0086e${áxY~ø|\u008fquwÔtIJ¦H\u0083M'CÛ@aF\u0014DÀY7_Ï\\1R\u0017P²U/\u0094\u0082i\fo¶lPb÷`\u0086e${áxY~ø|\u008fquwÔtIJ¦H\u0083M'CÛ@aF\u0014DÀY7_Ï\\1R\u0017P¿U/\u0099ÝdRbòa\u0002o´mÊ\u0094®i(\u0094Ýi\u0019o¶lLbý`Úe={ xN~ô|\u0090q>wÅ\\\b¡\u0087§'¤×ªu¨\f\u00ad¹³0°Òê\u0088\u00171\u0011\u0097\u0012g\u001cÎ\u001e§\u001b\u0019\u0005\u009b\u0006x\u0000ÒÓó.s(Û+9%\u0085'ö\"J\u0081ã|szÄy>w\u0081uîpWnÐG\tº\u008f¼c¿Ú±e³\u0013¶½¨3«À\u00ad|¯[¢¶¤Z§Ò\u0099h\u009b\r\u009e®\u0094\u0084i\u000bo«l[b¦`Ãe Ý¹  &\u0086%j+À)°,\u001f¿éBpDÖG:I\u0090KàNOPìS.UÅW¶\u0094\u0095i\foªlFbì`\u009ce3{\u0090xR~¹|Êq\u0004w\u0080t\u0019\u0094\u0080i\u0006oêlSbì`\u009ae4{ºxI~õ|Òq6wÙtIJíH\u008b\u0094\u0081i\ro¯\u0094³i\u0019o´l\u0003bÌ`\u0080e>{»xC~ì|\u0099q{wÐtBJúHÇM\u0001CÑ@fF\u001cD\u0083Y \u008aÉw}qÚr+|\u008b~æ{Ne\u0095f\u0003`¿bÍo\u0001i®j\"T\u009bVñSL]ã^\bXfZæG\u001fA¢B]L6ÝÒ f&Á%0+\u0090)ý,U2\u008e1\u00187¤5Ö8\u001a>µ=9\u0003\u0080\u0001ê\u0004W\nø\t\u0013\u000f}\rý\u0010\u0004\u0016¹\u0015F\u001b-\u0019ï\u001c\u001bbþaË\u009cM\u009a¡\u0099\u0000\u0097´\u0095Ì\u0090\u007f\u008eó\u008d\u0000\u008b¸\u0089Ò²ÐOCIíJ\u0002D½FÙCf]â\u0094\u0084i\u000bo«l[b¦`ÃêÇ\u0017O\u0011í\u0012\u0007\u001c±\u001eÇè'\u0015¡\u0013M\u0010ô\u001eK\u001c=\u0019\u0093\u0007\u001d\u0004î\u0002R\u0000u\r\u009e\u000bc\bë6A4$\u001e¡ã'åËæièÚê¦ï\u001fñ\u008bògô\u008eö¬û\u001fýúþy\u0094\u0080i\u0006oêlPbû`\u0096e%{½xO\\@¡Æ§*¤\u0081ª+¨\\\u00adü³k°Ä¶1´N¹ô¿\u0012¼\u0098\u0082+\u0080S\u0094\u0094i\u001co¨lObÁ`\u008deh{ù\u0094\u0080i\u0006oêlAbë`\u009ce<{«x\u0004~ç|\u0095q5wÑtHJúH\u0097M0CÐ@zF\u0007¹äD}BÛA7O\u009dMíHBV\u0091U(S\u0094Qæ\\\u0005Z Y9g\u0097eó`An¡m\u0006Ó\\.Å(c+\u008f%%'U\"ú<Y?\u009b9p;\u00036½0\f3\u0080\r*\u000fq\nó\u0004H\u0007ë\u0001\u0095\u0003@\u001eé\u0018\u0007\u001b³\u0015Á\u0017q\u0012æl=o·i\u008ck'\u0094\u0095i\foªlFbì`\u009ce3{àxM~î|\u0093q<wÚtHJ×H\u0094M&CÒ@;F\u0014D\u008bY+_Å\\mR\u0013P²ít\u0010í\u0016K\u0015§\u001b\r\u0019}\u001cÒ\u0002\u0001\u0001½\u0007\u0002\u0005r\bÂ\u000eo\rú3\u00191)4Õ::9\u009a?ê=7 \u0092&1À4=§;\n8å6S411Þ/\u001d,ï*K(\u0002%\u009d#g ä\u001eF\u001c(\u0019\u0086\u0017G\u0014Í\u0012ê\u0010y\rË\u000bf\bÛ\u0006µ\u0004\u0015\u0001\u009f\u007fc|Äz\u0083x\u0001u®s\u0005ia\u0094ç\u0092\u000b\u0091 \u009f\u0010\u009d{\u0098Å\u0086B\u0085¤\u0083\u0001\u0081y\u008cß\u008a%\u0094\u0080i\u0006oêlAbñ`\u009ae${¦xG~à|\u009bq>w\u0098tOJýH\u008eM.CÝ@:F\u0015D\u0087Y+_Ç\\zR\bP¡U>+Â(h.\t\u0094³i\u0007o lQbñ`\u009ce4{âxR~¹|Ê\u0094\u0080i\u0006oêlAbë`\u009ce<{«x\u0004~å|\u0095q(wÆtAJéH\u009eMlCÐ@p\u0094\u0086i\fo·lWb³ÄÙ9E?ï<\u00152ò0Ä5d+î(F.²,Û!t'\u0081$B\u001aº\u0018×\u001do\u0013\u008b\u0010%\u0089ÖtYrüq\u0003\u007få}Èxrf´e\u0012cµaÀl`j\u0088i\u001dW¤UÁ\u0094\u0083i\fo©lVb°`\u0086e6{áxL~à|\u0097q>wétNJéH\u008aM'CË@u°\"M\u00adK\bH÷F\u0011D'A\u0097_@\\çZCX9U¥SsPénGl5i\u008agldÌÖ\u0089+\u000f-ã.A ò\"\u008e'79£:O<¦>\u00943<5Û6V\bî\n\u0087\u000f/\u0001\u009e\u0002l\u0004\u001f\u0006\u008a\u001b9\u001dÍtç\u0089a\u008f\u008d\u008c&\u0082\u0096\u0080ý\u0085C\u009b\u0086\u0098<\u009e\u0083\u009cö\u0091I\u0097ÿ\u0094+ª\u0099¨ä\u00adz£° \u0012¦y¤ì\u0094\u0080i\u0006oêlLbú`\u0098e~{\u00adx_~è|\u0090q?w\u0098tKJáH\u0089M%CÜ@fF\u0003D\u009cY,_Î\\k\u0004´ù2ÿÞügòØð®õ\u0000ë\u008eè}îÁìæá\rç÷äpÚÐØ·ÝXÓëÐIÖ)Ô½É\u0014ÏæÌ[Â<À\u008cÅ\u0016»ë\u0094\u0080i\u0006oêlPbç`\u0086e${ªxG~¯|\u009eq.wßtAJìHÉM$CÐ@zF\u0014D\u008bY7_Ð\\mR\u0013P¿U8.µÓ3ÕßÖeØÒÚ³ß\u0011Á\u009fÂrÄëÆ¬Ë\u0016Í÷Î6ðßò§÷\u001eùàúEühþ½ã\u0019åûæMè*ê\u0096ï\t\u0091ì\u0092Z\u0094&\u0096\u0099^æ£`¥\u008c¦3¨\u009dªý¯R±Æ²>´É¶ø»H½¹¾'\u0080\u008a\u0082¯\u0087B\u0089¶\u008a\u001c\u008cr\u008eí\u0093Q\u0095¶\u0096\u000b\u0098u\u009aÙ\u009f^\u0094\u0080i\u0006oêlUbû`\u009be4{ xX~Þ|\u0098q7wÝt@J¦H\u0085M7CÐ@xF\u0017DÀY#_É\\qR\u001dP´U>+Û(t.\u0014,¶!Cü¶\u0001f\u0007Ê\u0004>\nÚ\bï\r^\u0013É\u00104\u0016µ\u0014ç\u0019Y\u001f\u00ad\u001c#\u0094Ýi\ro¡lUb±`\u0086e?{¬xA~ä|\u0088qtwÔtLJûH\u0082M CØ@zF\u0017D±Y\"_Å\\qR\u0003Pµ\u0094Ýi\ro¡lUb±`\u0086e?{¬xA~ä|\u0088qtwÑtHJæH\u009eM&f\u0007\u009b×\u009d{\u009e\u008f\u0090k\u0092\\\u0097å\u0089v\u008a\u009b\u008c>\u008eR\u0083®\u0085\u001d\u0086\u0092¸?ºH¿ü\u0094Ýi\u001ao½lPb±`\u0084e5{¢x_~Þ|\u0088q)w×tNJí\u0094Ýi\u001ao½lPbê`\u0090e={àxF~è|\u009eqtwÚtDJêH\u0084M\u001dCÔ@uF\u001fD\u0082Y*_Ã\\@R\u001eP´U.+Þ(a.\",©!R'ÿ$|:J8°=Q\u0094Ýi\ro¡lUb±`\u0097e#{»xu~æ|\u008cq(\u0094Ýi\ro¡lUb±`\u0097e#{»xu~õ|\u0095q6wÓ\u0094Ýi\ro¡lUb±`\u0086e?{¬xA~ä|\u0088qtwÔt^JüH\u0081M-CÕ@pF\u0016D\u009cY!\u0094Ýi\u001ao½lPbê`\u0090e={àxF~è|\u009eqtwÚtDJêH\u0085M1CÍ@rF\u001cD\u0082Y!_Å\\mR%P»U\"+Â((.\u000e,·\u0005\u008dø]þñý\u0005óáñÇôsêëé\u001bï²íÏàn\u0094Ýi\ro¡lUb±`\u0097e#{»xM~ø|\u008eq4~>\u0083î\u0085B\u0086¶\u0088R\u008at\u008fÀ\u0091X\u0092¤\u0094\u0007\u0096x\u009bÖ\u0094Ýi\ro¡lUb±`\u0097e#{»xE~ó|\u0095q>ëY\u0016\u0089\u0010%\u0013Ñ\u001d5\u001f\u0013\u001a§\u0004?\u0007Ø\u0001h\u0003\u000b\u000e¸a7\u009cç\u009aK\u0099¿\u0097[\u0095}\u0090É\u008eQ\u008d°\u008b\f\u0089w\u0084Ø\u0082,\u0081¤\u0094Ýi\ro¡lUb±`\u0097e#{»xu~è|\u0091q>\u0094Ýi\ro¥lWbÿ`Úe4{ x]~ï|\u0090q4w×tIJûHÈMlCÁ@vF\\D\u008cY6_Ô\\t\u0094Ýi\u0004oªlWb±`\u0082e9{¡xN~î|\u008bq(w\u0099toJûH\u0093M\u0011CÑ@uF\u0001D\u008bY!_æ\\pR\u0016PµU)+Ù\u0094Ýi\u0019o¶lLbý`Úe9{ xZ~î|\u008eq/wÅ\u0094Âi\u000fo¢l\u0003b¤\u0005Öø\u0012þ½ýGóöñÑô(ê¡éMïìíØà=æÜåVÛð\u0094\u0095i\u001bo¥lObò`\u009ae3{áxM~î|\u0090q?wÐtDJûH\u008fMlCÊ@{\u0094\u009ei\u0000o¦ldbÒ`°e\u0003{\u0090xH~ò|\u0088quwÅtB<çÁ6Ç\u008aÄzÊ\u008bÈ¢Í\u000fÓ\u0091ÐyÖÚÔ\u0099Ù\u0002ßãÜsâ×à¾å\u000bë\u00adèVî$ì¸\u0094\u0090i\u0005o±lFbí`\u0081e1{¬xA~ò\u0004\u0018ùÉÿuü\u0085òtð]õúë\u007fè\u0081î0ìJ¯âR2T\u009aWhYÀ[å^\u000b@\u009fCbEÐG¯J\u000bLèOvqÄs÷vSxâ{[}c\u007f°b\ndïgSikk\u0096n\u001e\u0010ø\u0094Ýi\u0019o¶lLbý`Úe3{¿x_~è|\u0092q=wÙ\u0094µi\u0006o¨lGbø`\u009ce#{§\u007ff\u0082¶\u0084\u001e\u0087ì\u0089D\u008ba\u008e\u0086\u0090\u001d\u0093â\u0095Y\u0097h\u009a\u0090\u009c\u007f\u009fù¡U£5¦\u0095¨g«Ü\u00adç¯6²\u008b´i·\u008b¹ñ»E¾\u0094À\u007fÃÐÅèÇ\u000eÊåÌJÏÀÑ°Ó\u000eÖìØ\\Ú?Ýúß\u001câÿäJæ5é\u0084ë\u001bîö".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1955);
        f19254d = cArr;
        f19257g = -2519181527280227991L;
    }

    static void init$0() {
        $$a = new byte[]{106, -29, 108, MessagePack.Code.MAP32};
        $$b = 44;
    }

    static void init$1() {
        $$d = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4, 16, MessagePack.Code.NIL, 55, 17, 10, -11, Ascii.VT, 7, 5, MessagePack.Code.FALSE, 73, -11, Ascii.VT, MessagePack.Code.EXT8, 58, 9, 2, 6, Ascii.SI, -15, Ascii.SI, -5, 2, Ascii.NAK, -10, MessagePack.Code.UINT32, 74, 2, -13, 17, 9, -14, 6, Ascii.NAK, -7, 10, 3, -7, 16, 3, 10, 2, 1, 1, MessagePack.Code.BIN32, 42, 34, -13, 17, 9, -14, 6, Ascii.NAK, -7, 10, 3, MessagePack.Code.STR8, 48, 3, 10, 2, 1, 1, Ascii.VT, -75, 39, 41, 7, -9, 3, Ascii.SI, MessagePack.Code.STR32, 48, 3, 10, 2, 1, 1, Ascii.VT};
        $$e = 151;
    }

    static void init$2() {
        $$c = new byte[]{90, -4, -67, Ascii.NAK};
        $$f = 242;
    }

    public final void delete(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19258h + 107;
        f19259i = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.innerToken, this.emvApplication.h(), this.digitalCard, context, operationCallback};
            int i4 = i.f24584b * 1756233953;
            i.f24584b = i4;
            int i5 = i.f24589g * 1181160184;
            i.f24589g = i5;
            int i6 = i.f24591i * 1839442224;
            i.f24591i = i6;
            i.d(i6, 675603548, i4, (int) Process.getElapsedCpuTime(), i5, objArr, -675603546);
            return;
        }
        Object[] objArr2 = {this.innerToken, this.emvApplication.h(), this.digitalCard, context, operationCallback};
        int i7 = i.f24584b * 1756233953;
        i.f24584b = i7;
        int i8 = i.f24589g * 1181160184;
        i.f24589g = i8;
        int i9 = i.f24591i * 1839442224;
        i.f24591i = i9;
        i.d(i9, 675603548, i7, (int) Process.getElapsedCpuTime(), i8, objArr2, -675603546);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDeviceName() {
        int i2 = 2 % 2;
        int i3 = f19258h + 79;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        String strL = this.innerToken.l();
        int i5 = f19258h + 115;
        f19259i = i5 % 128;
        int i6 = i5 % 2;
        return strL;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f19259i + 87;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerToken};
        int iNextInt = new Random().nextInt(829335317);
        int i5 = i.f24595m * 1091325868;
        i.f24595m = i5;
        String str = (String) i.d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), i5, objArr, 2118374413);
        int i6 = f19259i + 77;
        f19258h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final SecureTokenDelete getSecureTokenDelete() {
        int i2 = 2 % 2;
        SecureTokenDelete secureTokenDelete = new SecureTokenDelete(this.innerToken.d(this.emvApplication.h(), this.digitalCard));
        int i3 = f19259i + 41;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        return secureTokenDelete;
    }

    public final SecureTokenResume getSecureTokenResume() {
        int i2 = 2 % 2;
        SecureTokenResume secureTokenResume = new SecureTokenResume(this.innerToken.b(this.emvApplication.h(), this.digitalCard));
        int i3 = f19258h + 83;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        return secureTokenResume;
    }

    public final SecureTokenSuspend getSecureTokenSuspend() {
        int i2 = 2 % 2;
        SecureTokenSuspend secureTokenSuspend = new SecureTokenSuspend(this.innerToken.e(this.emvApplication.h(), this.digitalCard));
        int i3 = f19259i + 47;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        return secureTokenSuspend;
    }

    public final Status getStatus() throws Throwable {
        int i2 = 2 % 2;
        if (this.innerToken.o() == null) {
            int i3 = f19259i + 57;
            f19258h = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = f19258h + 95;
        f19259i = i5 % 128;
        if (i5 % 2 == 0) {
            return this.innerToken.o().e();
        }
        this.innerToken.o().e();
        throw null;
    }

    public final String getTokenRequestorId() {
        int i2 = 2 % 2;
        int i3 = f19258h + 117;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        i iVar = this.innerToken;
        if (i4 == 0) {
            return iVar.e();
        }
        iVar.e();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Drawable getTokenRequestorLogo(Context context) {
        int i2 = 2 % 2;
        int i3 = f19259i + 101;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableC = this.innerToken.c(context);
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
        return drawableC;
    }

    public final String getTokenRequestorName() {
        int i2 = 2 % 2;
        int i3 = f19259i + 109;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        String strF = this.innerToken.f();
        int i5 = f19258h + 101;
        f19259i = i5 % 128;
        if (i5 % 2 == 0) {
            return strF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.antelop.sdk.digitalcard.Token.TokenServiceProvider getTokenServiceProvider() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.Token.getTokenServiceProvider():fr.antelop.sdk.digitalcard.Token$TokenServiceProvider");
    }

    public final Type getType() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19258h + 71;
        f19259i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerToken};
            int i4 = i.f24600s * (-948551921);
            i.f24600s = i4;
            int i5 = i.f24599r * (-1934953559);
            i.f24599r = i5;
            int id = (int) Thread.currentThread().getId();
            int i6 = i.f24598p * 1898373301;
            i.f24598p = i6;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.innerToken};
        int i7 = i.f24600s * (-948551921);
        i.f24600s = i7;
        int i8 = i.f24599r * (-1934953559);
        i.f24599r = i8;
        int id2 = (int) Thread.currentThread().getId();
        int i9 = i.f24598p * 1898373301;
        i.f24598p = i9;
        if (((i.d) i.d(id2, -38470119, i7, i9, i8, objArr2, 38470128)) == null) {
            return null;
        }
        Object[] objArr3 = {this.innerToken};
        int i10 = i.f24600s * (-948551921);
        i.f24600s = i10;
        int i11 = i.f24599r * (-1934953559);
        i.f24599r = i11;
        int id3 = (int) Thread.currentThread().getId();
        int i12 = i.f24598p * 1898373301;
        i.f24598p = i12;
        Type typeC = ((i.d) i.d(id3, -38470119, i10, i12, i11, objArr3, 38470128)).c();
        int i13 = f19259i + 81;
        f19258h = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 68 / 0;
        }
        return typeC;
    }

    public final boolean isAntelopToken() {
        int i2 = 2 % 2;
        int i3 = f19258h + 125;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerToken};
        int i5 = i.f24594l * (-1627566601);
        i.f24594l = i5;
        if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i5, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr, -1662058970)) == null) {
            return false;
        }
        Object[] objArr2 = {this.innerToken};
        int i6 = i.f24594l * (-1627566601);
        i.f24594l = i6;
        if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i6, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr2, -1662058970)) != i.c.f24664a) {
            return false;
        }
        int i7 = f19259i + 109;
        f19258h = i7 % 128;
        return i7 % 2 != 0;
    }

    public final boolean isApplePayToken() {
        int i2 = 2 % 2;
        int i3 = f19258h + 105;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerToken};
        int i5 = i.f24594l * (-1627566601);
        i.f24594l = i5;
        if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i5, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr, -1662058970)) != null) {
            Object[] objArr2 = {this.innerToken};
            int i6 = i.f24594l * (-1627566601);
            i.f24594l = i6;
            if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i6, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr2, -1662058970)) == i.c.f24668e) {
                int i7 = f19259i + 93;
                f19258h = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        int i9 = f19259i + 89;
        f19258h = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final boolean isGooglePayToken() {
        int i2 = 2 % 2;
        int i3 = f19258h + 93;
        f19259i = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerToken};
        int i5 = i.f24594l * (-1627566601);
        i.f24594l = i5;
        if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i5, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr, -1662058970)) != null) {
            Object[] objArr2 = {this.innerToken};
            int i6 = i.f24594l * (-1627566601);
            i.f24594l = i6;
            if (((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i6, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr2, -1662058970)) == i.c.f24665b) {
                int i7 = f19258h + 85;
                f19259i = i7 % 128;
                return i7 % 2 == 0;
            }
        }
        return false;
    }

    public final void resume(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19259i + 51;
        f19258h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerToken, this.emvApplication.h(), this.digitalCard, context, operationCallback};
        int iActiveCount = Thread.activeCount();
        int i5 = i.f24593k * 128340111;
        i.f24593k = i5;
        int i6 = i.f24601t * 1405276525;
        i.f24601t = i6;
        i.d(i6, 972375778, iActiveCount, (int) Runtime.getRuntime().maxMemory(), i5, objArr, -972375770);
        int i7 = f19258h + 87;
        f19259i = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
    }

    public final void suspend(Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19258h + 43;
        f19259i = i3 % 128;
        if (i3 % 2 == 0) {
            this.innerToken.a(this.emvApplication.h(), this.digitalCard, context, operationCallback);
        } else {
            this.innerToken.a(this.emvApplication.h(), this.digitalCard, context, operationCallback);
            int i4 = 57 / 0;
        }
    }

    public final String toString() {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder("Token{tokenServiceProvider=").append(getTokenServiceProvider()).append(", tokenId='").append(getId()).append("', tokenRequestorId='").append(getTokenRequestorId()).append("', tokenRequestorName='").append(getTokenRequestorName()).append("', tokenRequestorLogoUrl=");
        Object[] objArr = {this.innerToken};
        int id = (int) Thread.currentThread().getId();
        int iMyPid = Process.myPid();
        int i3 = (-1717583902) * i.f24597o;
        i.f24597o = i3;
        int i4 = i.f24596n * (-154475842);
        i.f24596n = i4;
        StringBuilder sbAppend2 = sbAppend.append((String) i.d(i3, 539787049, id, i4, iMyPid, objArr, -539787043)).append(", tokenRequestorType=");
        Object[] objArr2 = {this.innerToken};
        int i5 = i.f24594l * (-1627566601);
        i.f24594l = i5;
        String string = sbAppend2.append((i.c) i.d((int) Runtime.getRuntime().freeMemory(), 1662058975, i5, (int) Runtime.getRuntime().maxMemory(), (int) Runtime.getRuntime().totalMemory(), objArr2, -1662058970)).append(", type=").append(getType()).append(", status=").append(getStatus()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i6 = f19259i + 59;
        f19258h = i6 % 128;
        if (i6 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
