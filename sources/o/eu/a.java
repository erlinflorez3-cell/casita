package o.eu;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.g;
import o.a.k;
import o.a.l;
import o.a.m;
import o.eu.d;
import o.ff.a;
import o.fn.c;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a<T extends o.ff.a, U extends o.eu.d<T>> {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    private static char f25428c = 0;

    /* JADX INFO: renamed from: d */
    private static char f25429d = 0;

    /* JADX INFO: renamed from: e */
    private static char f25430e = 0;

    /* JADX INFO: renamed from: f */
    private static int f25431f = 0;

    /* JADX INFO: renamed from: g */
    private static int f25432g = 0;

    /* JADX INFO: renamed from: h */
    private static int f25433h = 0;

    /* JADX INFO: renamed from: i */
    private static char[] f25434i = null;

    /* JADX INFO: renamed from: j */
    private static char f25435j = 0;

    /* JADX INFO: renamed from: k */
    private static int f25436k = 0;

    /* JADX INFO: renamed from: a */
    private final String f25437a;

    /* JADX INFO: renamed from: b */
    private final String f25438b;

    /* JADX INFO: renamed from: o.eu.a$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c */
        private static int f25439c = 0;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f25440d;

        /* JADX INFO: renamed from: e */
        private static int f25441e = 1;

        static {
            int[] iArr = new int[d.values().length];
            f25440d = iArr;
            try {
                iArr[d.f25443b.ordinal()] = 1;
                int i2 = f25441e;
                int i3 = (((i2 + 15) - (15 & i2)) << 1) - (i2 ^ 15);
                f25439c = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25440d[d.f25446e.ordinal()] = 2;
                int i6 = f25441e;
                int i7 = (i6 ^ 11) + (((-1) - (((-1) - i6) | ((-1) - 11))) << 1);
                f25439c = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25440d[d.f25442a.ordinal()] = 3;
                int i10 = f25441e + 19;
                f25439c = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25440d[d.f25444c.ordinal()] = 4;
                int i13 = f25441e;
                int i14 = ((i13 + 85) - (85 | i13)) + ((-1) - (((-1) - i13) & ((-1) - 85)));
                f25439c = i14 % 128;
                int i15 = i14 % 2;
                int i16 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25440d[d.f25445d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25440d[d.f25449h.ordinal()] = 6;
                int i17 = f25439c + 3;
                f25441e = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class d extends Enum<d> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final d f25442a;

        /* JADX INFO: renamed from: b */
        public static final d f25443b;

        /* JADX INFO: renamed from: c */
        public static final d f25444c;

        /* JADX INFO: renamed from: d */
        public static final d f25445d;

        /* JADX INFO: renamed from: e */
        public static final d f25446e;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ d[] f25447f;

        /* JADX INFO: renamed from: g */
        private static long f25448g = 0;

        /* JADX INFO: renamed from: h */
        public static final d f25449h;

        /* JADX INFO: renamed from: j */
        private static int[] f25450j = null;

        /* JADX INFO: renamed from: l */
        private static int f25451l = 0;

        /* JADX INFO: renamed from: m */
        private static int f25452m = 0;

        /* JADX INFO: renamed from: n */
        private static int f25453n = 0;

        /* JADX INFO: renamed from: o */
        private static int f25454o = 0;

        /* JADX INFO: renamed from: i */
        private final String f25455i;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, byte r9, int r10) {
            /*
                int r7 = r9 + 107
                int r2 = r10 * 4
                int r1 = 1 - r2
                byte[] r6 = o.eu.a.d.$$a
                int r0 = r8 * 3
                int r5 = r0 + 4
                byte[] r4 = new byte[r1]
                r3 = 0
                int r2 = 0 - r2
                if (r6 != 0) goto L29
                r0 = r5
                r7 = r2
                r1 = r3
            L16:
                int r5 = r5 + 1
                int r7 = r7 + r0
            L19:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r2) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                int r1 = r1 + 1
                r0 = r6[r5]
                goto L16
            L29:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eu.a.d.$$c(int, byte, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25453n = 0;
            f25454o = 1;
            f25452m = 0;
            f25451l = 1;
            d();
            Object[] objArr = new Object[1];
            k("핃픎῝\uf3c6怮\ue878\u0c91隺⭮扵້铧⦡掛", TextUtils.indexOf("", "", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p(new int[]{1247816279, 38023521, -1752294891, 78870364, 113293844, 950795527}, (Process.myTid() >> 22) + 10, objArr2);
            f25443b = new d(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k("䪡䫬䌔ᓽ㳢툭\uebbc골", KeyEvent.getDeadChar(0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            p(new int[]{-1461885162, -2012368615}, TextUtils.indexOf("", "", 0) + 4, objArr4);
            f25446e = new d(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            k("\ue1ba\ue1ec\uf062墹辙⡬\ua7ee嚻", TextUtils.getOffsetAfter("", 0), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            p(new int[]{-808679759, 293350014}, (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr6);
            f25442a = new d(strIntern3, 2, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            k("펵폥蹒䛵\uf1b5黛릣\ue008", ViewConfiguration.getScrollBarSize() >> 8, objArr7);
            String strIntern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            k("\udd9f\uddef崛\u2066⋼쉍\udf30벞", AndroidCharacter.getMirror('0') - '0', objArr8);
            f25444c = new d(strIntern4, 3, ((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            p(new int[]{-1216644581, 826943934}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, objArr9);
            String strIntern5 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            p(new int[]{-443824863, -1373211209}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3, objArr10);
            f25445d = new d(strIntern5, 4, ((String) objArr10[0]).intern());
            Object[] objArr11 = new Object[1];
            k("\ue87e\ue829✂\uf40a壹ᢔଢ଼晇", KeyEvent.getDeadChar(0, 0), objArr11);
            String strIntern6 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            p(new int[]{-773778461, 1816228772}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr12);
            f25449h = new d(strIntern6, 5, ((String) objArr12[0]).intern());
            f25447f = c();
            int i2 = f25453n + 43;
            f25454o = i2 % 128;
            int i3 = i2 % 2;
        }

        private d(String str, int i2, String str2) {
            super(str, i2);
            this.f25455i = str2;
        }

        public static d b(String str) throws Throwable {
            int i2 = 2 % 2;
            for (d dVar : values()) {
                if (str.equals(dVar.f25455i)) {
                    int i3 = f25451l;
                    int i4 = i3 + 69;
                    f25452m = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 109;
                    f25452m = i6 % 128;
                    int i7 = i6 % 2;
                    return dVar;
                }
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            k("䰺䱪⭃\u0dfa咰줁\uf2a7럚눗囷\uf0e2뗟냁圄\uf637뉧뚡兆\uf468냻땻厘\uf5d0뺲묠嶙ﬕ뽾매幯論봓뿢墫ﺃ뮏븈嫴ﳭ릘볞嬯\ue233ꙛꋊ䔛\ue02e", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
            throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
        }

        private static /* synthetic */ d[] c() {
            int i2 = 2 % 2;
            int i3 = f25451l + 9;
            int i4 = i3 % 128;
            f25452m = i4;
            int i5 = i3 % 2;
            d[] dVarArr = {f25443b, f25446e, f25442a, f25444c, f25445d, f25449h};
            int i6 = i4 + 43;
            f25451l = i6 % 128;
            int i7 = i6 % 2;
            return dVarArr;
        }

        static void d() {
            f25448g = 7625223783300984296L;
            f25450j = new int[]{-1196775849, -1256392186, 1471840860, 1316402344, -847472977, 475434785, 1788275289, -1537511803, 472650832, -1209267355, -489612552, -1967307445, 947868407, -638536452, -1652644577, 1332268296, 1315771878, -551241659};
        }

        static void init$0() {
            $$a = new byte[]{114, MessagePack.Code.FIXEXT8, -31, MessagePack.Code.FIXEXT4};
            $$b = 165;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 111;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            k kVar = new k();
            char[] cArrC = k.c(f25448g ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i6 = $10 + 85;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25448g)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 228, (char) (51004 - (ViewConfiguration.getPressedStateDuration() >> 16)), (Process.myTid() >> 22) + 9, 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a(View.resolveSize(0, 0) + 675, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, 522683165, false, $$c(b4, (byte) ((b4 + 7) - (7 & b4)), b4), new Class[]{Object.class, Object.class});
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

        private static void p(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f25450j;
            int i5 = 989264422;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 95;
                    $11 = i8 % 128;
                    if (i8 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objA = o.d.d.a(i5);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(TextUtils.indexOf("", "") + 675, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - (ViewConfiguration.getEdgeSlop() >> 16), -328001469, false, $$c(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 14))), b2), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b3 = (byte) 0;
                            objA2 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 674, (char) Color.blue(0), 12 - (ViewConfiguration.getScrollBarSize() >> 8), -328001469, false, $$c(b3, (byte) ((b3 + Ascii.SO) - (b3 & Ascii.SO)), b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i7++;
                    }
                    i3 = 2;
                    i5 = 989264422;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f25450j;
            char c2 = '0';
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $11 + 77;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b4 = (byte) i6;
                            objA3 = o.d.d.a(TextUtils.getTrimmedLength("") + 675, (char) ((-1) - TextUtils.indexOf("", c2)), 12 - Color.green(i6), -328001469, false, $$c(b4, (byte) (14 | b4), b4), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    } else {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                        Object objA4 = o.d.d.a(989264422);
                        if (objA4 == null) {
                            byte b5 = (byte) 0;
                            objA4 = o.d.d.a(676 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, -328001469, false, $$c(b5, (byte) ((b5 + Ascii.SO) - (b5 & Ascii.SO)), b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        i9++;
                    }
                    c2 = '0';
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, i6, iArr4, i6, length2);
            lVar.f19941d = i6;
            while (lVar.f19941d < iArr.length) {
                cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i11 = $11 + 85;
                $10 = i11 % 128;
                int i12 = 2;
                int i13 = i11 % 2;
                int i14 = 0;
                while (i14 < 16) {
                    int i15 = $10 + 57;
                    $11 = i15 % 128;
                    int i16 = i15 % i12;
                    lVar.f19942e ^= iArr4[i14];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b6 = (byte) 0;
                        objA5 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 301, (char) (52697 - Gravity.getAbsoluteGravity(0, 0)), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1416256172, false, $$c(b6, (byte) ((b6 + Ascii.FF) - (12 & b6)), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i14++;
                    i12 = 2;
                }
                int i17 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i17;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i18 = lVar.f19942e;
                int i19 = lVar.f19940a;
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
                    byte b7 = (byte) 0;
                    objA6 = o.d.d.a(AndroidCharacter.getMirror('0') + 181, (char) (51004 - (ViewConfiguration.getScrollBarSize() >> 8)), 9 - (ViewConfiguration.getTapTimeout() >> 16), -330018025, false, $$c(b7, (byte) (10 | b7), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
                i6 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25452m + 47;
            f25451l = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            if (i4 == 0) {
                int i5 = 28 / 0;
            }
            int i6 = f25452m + 123;
            f25451l = i6 % 128;
            int i7 = i6 % 2;
            return dVar;
        }

        public static d[] values() {
            int i2 = 2 % 2;
            int i3 = f25451l + 63;
            f25452m = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            d[] dVarArr = (d[]) f25447f.clone();
            int i4 = f25452m + 103;
            f25451l = i4 % 128;
            if (i4 % 2 != 0) {
                return dVarArr;
            }
            throw null;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f25452m + 37;
            f25451l = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f25455i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, int r9, byte r10) {
        /*
            int r8 = r8 + 69
            int r0 = r9 * 4
            int r7 = r0 + 4
            byte[] r6 = o.eu.a.$$c
            int r5 = r10 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r6 != 0) goto L29
            r0 = r7
            r2 = r3
        L13:
            int r8 = r8 + r7
            int r7 = r0 + 1
        L16:
            byte r0 = (byte) r8
            r4[r2] = r0
            if (r2 != r5) goto L21
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L21:
            int r2 = r2 + 1
            r1 = r6[r7]
            r0 = r7
            r7 = r8
            r8 = r1
            goto L13
        L29:
            r2 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eu.a.$$g(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25433h = 0;
        f25436k = 1;
        f25431f = 0;
        f25432g = 1;
        d();
        ExpandableListView.getPackedPositionType(0L);
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getEdgeSlop();
        int i2 = f25433h + 123;
        f25436k = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public a() throws Throwable {
        Object[] objArr = new Object[1];
        u("\uf222ࢺ읁쏝\ud8e2ᐕ", TextUtils.getOffsetAfter("", 0) + 6, objArr);
        this.f25437a = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        u("ࡵ脣硼䀪鞕逯", 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        this.f25438b = ((String) objArr2[0]).intern();
    }

    static void d() {
        f25429d = (char) 40115;
        f25428c = (char) 23779;
        f25430e = (char) 15288;
        f25435j = (char) 34131;
        f25434i = new char[]{56742, 56756, 56739, 56741, 56742, 56715, 56500, 56534, 56539, 56558, 56550, 56548, 56552, 56551, 56545, 56554, 56501, 56559, 56566, 56559, 56464, 56514, 56550, 56554, 56550, 56555, 56562, 56555, 56551, 56554, 56564, 56566, 56522, 56524, 56559, 56552, 56517, 56522, 56561, 56553, 56553, 56563, 56557, 56552};
    }

    public static o.eu.d e(o.ef.a aVar) throws Throwable {
        Object objA;
        a bVar;
        int i2 = 2 % 2;
        int i3 = f25432g + 7;
        f25431f = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                u("陻乾縉犱离䛋捓톤辰蟫찲牝ە㨿", 126 % TextUtils.indexOf((CharSequence) "", (char) 3, 0), objArr);
                Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
                int i4 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i4;
                objA = o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
            } else {
                Object[] objArr3 = new Object[1];
                u("陻乾縉犱离䛋捓톤辰蟫찲牝ە㨿", 12 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
                Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
                int i5 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i5;
                objA = o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            }
            d dVarB = d.b((String) objA);
            int i6 = f25432g + 107;
            f25431f = i6 % 128;
            int i7 = i6 % 2;
            switch (AnonymousClass4.f25440d[dVarB.ordinal()]) {
                case 1:
                    bVar = new o.ez.d();
                    break;
                case 2:
                    bVar = new o.fd.a();
                    break;
                case 3:
                    bVar = new o.fc.a();
                    break;
                case 4:
                    bVar = new o.fa.e();
                    break;
                case 5:
                    bVar = new o.ew.b();
                    break;
                case 6:
                    bVar = new o.fb.b();
                    break;
                default:
                    Object[] objArr5 = new Object[1];
                    u("흴⬆柶撫쨰읠䐊朇痢枚ݓ兙ᵾᒧ錥\u1cfd앤䵗ꢜ\u0d11陻乾縉犱离䛋捓톤밭ᴾ뗲笤䘴瘫", TextUtils.getCapsMode("", 0, 0) + 34, objArr5);
                    throw new o.ef.b(((String) objArr5[0]).intern());
            }
            o.eu.d dVarA = bVar.a(aVar);
            new o.fn.e();
            dVarA.a(o.fn.e.d(aVar));
            return dVarA;
        } catch (IllegalArgumentException unused) {
            Object[] objArr6 = new Object[1];
            u("ࡵ脣燐艄륹ꄴ擅⨕痢枚ݓ兙ᵾᒧ錥\u1cfd앤䵗ꢜ\u0d11陻乾縉犱离䛋捓톤밭ᴾ뗲笤䘴瘫", View.MeasureSpec.makeMeasureSpec(0, 0) + 34, objArr6);
            throw new o.ef.b(((String) objArr6[0]).intern());
        }
    }

    static void init$0() {
        $$c = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$f = 1;
    }

    private static void u(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            int i5 = $10 + 19;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            char[] charArray = str2.toCharArray();
            int i7 = $10 + 89;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i9 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i10 = $11 + 63;
            $10 = i10 % 128;
            int i11 = 58224;
            if (i10 % i3 != 0) {
                cArr3[1] = cArr[gVar.f19924d];
                cArr3[i9] = cArr[gVar.f19924d % 1];
            } else {
                cArr3[i9] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
            }
            int i12 = i9;
            while (i12 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i9];
                int i13 = (c3 + i11) ^ ((c3 << 4) + ((char) (((long) f25430e) ^ (-7511683281764982996L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f25435j);
                    objArr2[i3] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i9] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iMakeMeasureSpec = 270 - View.MeasureSpec.makeMeasureSpec(i9, i9);
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', i9, i9));
                        int longPressTimeout = 11 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b2 = (byte) ($$f - 1);
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i9] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iMakeMeasureSpec, cLastIndexOf, longPressTimeout, -1995022631, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i9]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (((long) f25429d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f25428c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 271;
                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iCombineMeasuredStates = 11 - View.combineMeasuredStates(0, 0);
                        byte b4 = (byte) ($$f - 1);
                        byte b5 = b4;
                        objA2 = o.d.d.a(iLastIndexOf, c4, iCombineMeasuredStates, -1995022631, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i11 -= 40503;
                    i12++;
                    i3 = 2;
                    i9 = 0;
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
                int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 270;
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int i16 = 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                i3 = 2;
                byte b6 = (byte) ($$f + 2);
                byte b7 = (byte) (b6 - 3);
                objA3 = o.d.d.a(i15, cResolveSizeAndState, i16, -2074123590, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 71;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i7 = 0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr = f25434i;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 61;
                $10 = i13 % 128;
                int i14 = i13 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int maximumDrawingCacheSize = 249 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i7) + 1);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 11;
                        int i15 = $$f;
                        byte b2 = (byte) (i15 - 1);
                        objA = o.d.d.a(maximumDrawingCacheSize, bitsPerPixel, pressedStateDuration, 1376582792, false, $$g((byte) ((i15 + 46) - (i15 & 46)), b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i12++;
                    i3 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i16 = $11 + 37;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 3 / 3;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i9];
        System.arraycopy(cArr, i8, cArr3, 0, i9);
        if (bArr != null) {
            char[] cArr4 = new char[i9];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i9) {
                if (bArr[mVar.f19943d] == 1) {
                    int i18 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i19 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 836;
                        char pressedStateDuration2 = (char) (27279 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 11;
                        int i20 = $$f;
                        byte b3 = (byte) (i20 - 1);
                        objA3 = o.d.d.a(mode, pressedStateDuration2, iIndexOf, -1210801192, false, $$g((byte) ((i20 + 50) - (50 & i20)), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35715), 11 - (Process.myTid() >> 22), 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            int i21 = $10 + 71;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i9];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i9);
            int i23 = i9 - i11;
            System.arraycopy(cArr5, 0, cArr3, i23, i11);
            System.arraycopy(cArr5, i11, cArr3, 0, i23);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i9];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i9) {
                    break;
                }
                cArr6[mVar.f19943d] = cArr3[(i9 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i24 = 0;
            while (true) {
                mVar.f19943d = i24;
                if (mVar.f19943d >= i9) {
                    break;
                }
                int i25 = $11 + 101;
                $10 = i25 % 128;
                int i26 = i25 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i24 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public o.ef.a a(U u2) throws Throwable {
        o.ef.a aVar;
        int i2 = 2 % 2;
        new o.fn.e();
        c cVarI = u2.i();
        if (cVarI != null) {
            int i3 = f25431f + 97;
            f25432g = i3 % 128;
            if (i3 % 2 == 0) {
                aVar = o.fn.e.d(cVarI);
                int i4 = 26 / 0;
            } else {
                aVar = o.fn.e.d(cVarI);
            }
        } else {
            aVar = new o.ef.a();
            int i5 = f25432g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f25431f = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr = new Object[1];
        u("칚⛬踝鐆둷熈⪂\uf3b5", 8 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) u2.c());
        Object[] objArr2 = new Object[1];
        v(null, new int[]{0, 6, 194, 4}, true, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int iNextInt = new Random().nextInt();
        o.eu.d.f25463d = 883403134 * o.eu.d.f25463d;
        o.eu.d.f25461b = o.eu.d.f25461b * (-1930243941);
        aVar.a(strIntern, o.eu.d.d(-2137010787, r10, 2137010788, r12, (int) Runtime.getRuntime().freeMemory(), new Object[]{u2}, iNextInt));
        Object[] objArr3 = new Object[1];
        v("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{6, 10, 0, 4}, true, objArr3);
        aVar.b(((String) objArr3[0]).intern(), u2.j());
        Object[] objArr4 = new Object[1];
        u("陻乾縉犱离䛋捓톤辰蟫찲牝ە㨿", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, objArr4);
        aVar.a(((String) objArr4[0]).intern(), (Object) b().e());
        List<T> listG = u2.g();
        if (listG != null) {
            o.ef.c cVar = new o.ef.c();
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                cVar.a(a(it.next()));
            }
            Object[] objArr5 = new Object[1];
            v("\u0001\u0000\u0000\u0000", new int[]{16, 4, 0, 1}, true, objArr5);
            aVar.a(((String) objArr5[0]).intern(), cVar);
        }
        return aVar;
    }

    public o.ef.a a(T t2) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        u("\uf222ࢺ읁쏝\ud8e2ᐕ", TextUtils.getCapsMode("", 0, 0) + 6, objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) t2.b().a());
        Object[] objArr2 = new Object[1];
        u("ࡵ脣硼䀪鞕逯", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, objArr2);
        aVar.c(((String) objArr2[0]).intern(), (int) t2.a());
        int i3 = f25432g + 73;
        f25431f = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    public U a(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        u("칚⛬踝鐆둷熈⪂\uf3b5", 8 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        int i3 = 0;
        Object[] objArr2 = {aVar, ((String) objArr[0]).intern()};
        int i4 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i4;
        String str = (String) o.ef.a.a(-781664457, objArr2, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
        Object[] objArr3 = new Object[1];
        Object obj = null;
        v(null, new int[]{0, 6, 194, 4}, true, objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i5 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i5;
        String str2 = (String) o.ef.a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
        Object[] objArr5 = new Object[1];
        v("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{6, 10, 0, 4}, true, objArr5);
        U u2 = (U) d(str, str2, aVar.h(((String) objArr5[0]).intern()).booleanValue());
        Object[] objArr6 = new Object[1];
        v("\u0001\u0000\u0000\u0000", new int[]{16, 4, 0, 1}, true, objArr6);
        if (aVar.d(((String) objArr6[0]).intern())) {
            Object[] objArr7 = new Object[1];
            v("\u0001\u0000\u0000\u0000", new int[]{16, 4, 0, 1}, true, objArr7);
            Object[] objArr8 = {aVar, ((String) objArr7[0]).intern()};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int iMyUid = Process.myUid();
            int i6 = o.ef.a.f23780n * (-1229108307);
            o.ef.a.f23780n = i6;
            o.ef.c cVar = (o.ef.c) o.ef.a.a(-1398121910, objArr8, iMyUid, i6, 1398121917, iUptimeMillis, iElapsedRealtime);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i7 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i7;
                int i8 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i8;
                if (i3 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i8, i7, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                    break;
                }
                int i9 = f25432g + 87;
                f25431f = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(d(cVar.d(i3)));
                i3++;
            }
            u2.c(arrayList);
            int i11 = f25432g + 105;
            f25431f = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 5;
            }
        }
        int i13 = f25431f + 115;
        f25432g = i13 % 128;
        if (i13 % 2 != 0) {
            return u2;
        }
        obj.hashCode();
        throw null;
    }

    protected abstract T a(o.ff.b bVar, short s2);

    protected abstract d b();

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    protected abstract U d(String str, String str2, boolean z2);

    public T d(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25431f + 45;
        f25432g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u("ࡵ脣硼䀪鞕逯", (KeyEvent.getMaxKeyCode() >> 16) + 5, objArr);
        short sShortValue = aVar.l(((String) objArr[0]).intern()).shortValue();
        try {
            Object[] objArr2 = new Object[1];
            u("\uf222ࢺ읁쏝\ud8e2ᐕ", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, objArr2);
            Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
            int i5 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i5;
            o.ff.b bVarE = o.ff.b.e((String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority()));
            int i6 = f25432g + 77;
            f25431f = i6 % 128;
            int i7 = i6 % 2;
            return (T) a(bVarE, sShortValue);
        } catch (IllegalArgumentException unused) {
            Object[] objArr4 = new Object[1];
            v("\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{20, 24, 0, 8}, true, objArr4);
            throw new o.ef.b(((String) objArr4[0]).intern());
        }
    }
}
