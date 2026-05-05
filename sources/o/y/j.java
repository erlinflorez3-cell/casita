package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.CardDisplay;
import fr.antelop.sdk.card.EcomStaticTokenDisplay;
import fr.antelop.sdk.card.ICardDisplay;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.Iterator;
import o.an.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class j<P> extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int B = 0;
    private static int D = 0;

    /* JADX INFO: renamed from: m */
    public static int f27189m = 0;

    /* JADX INFO: renamed from: o */
    public static int f27190o = 0;

    /* JADX INFO: renamed from: p */
    public static int f27191p = 0;

    /* JADX INFO: renamed from: q */
    public static int f27192q = 0;

    /* JADX INFO: renamed from: s */
    public static int f27193s = 0;

    /* JADX INFO: renamed from: t */
    public static int f27194t = 0;

    /* JADX INFO: renamed from: u */
    public static int f27195u = 0;

    /* JADX INFO: renamed from: x */
    private static int f27196x = 0;

    /* JADX INFO: renamed from: z */
    private static int f27197z = 0;

    /* JADX INFO: renamed from: k */
    P f27198k;

    /* JADX INFO: renamed from: l */
    final o.eb.d<P> f27199l;

    /* JADX INFO: renamed from: n */
    CancellationSignal f27200n;

    /* JADX INFO: renamed from: v */
    private final boolean f27201v;

    /* JADX INFO: renamed from: w */
    private final a.c f27202w;

    /* JADX INFO: renamed from: y */
    private final String f27203y;

    /* JADX INFO: renamed from: o.y.j$5 */
    public class AnonymousClass5 implements a.b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c */
        private static int f27204c = 0;

        /* JADX INFO: renamed from: d */
        private static char f27205d = 0;

        /* JADX INFO: renamed from: e */
        private static long f27206e = 0;

        /* JADX INFO: renamed from: f */
        private static int f27207f = 0;

        /* JADX INFO: renamed from: g */
        private static short[] f27208g = null;

        /* JADX INFO: renamed from: h */
        private static int f27209h = 0;

        /* JADX INFO: renamed from: i */
        private static int f27210i = 0;

        /* JADX INFO: renamed from: j */
        private static byte[] f27211j = null;

        /* JADX INFO: renamed from: k */
        public static int f27212k = 0;

        /* JADX INFO: renamed from: l */
        public static int f27213l = 0;

        /* JADX INFO: renamed from: m */
        private static int f27214m = 0;

        /* JADX INFO: renamed from: n */
        public static int f27215n = 0;

        /* JADX INFO: renamed from: o */
        private static int f27216o = 0;

        /* JADX INFO: renamed from: p */
        public static int f27217p = 0;

        /* JADX INFO: renamed from: q */
        public static int f27218q = 0;

        /* JADX INFO: renamed from: r */
        public static int f27219r = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Context f27221b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r9, short r10, byte r11) {
            /*
                int r0 = r11 * 3
                int r8 = r0 + 1
                int r7 = r9 + 4
                int r6 = 122 - r10
                byte[] r5 = o.y.j.AnonymousClass5.$$c
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L26
                r0 = r6
                r6 = r8
                r2 = r3
            L12:
                int r6 = r6 + r0
                r1 = r2
            L14:
                int r2 = r1 + 1
                int r7 = r7 + 1
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r2 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                r0 = r5[r7]
                goto L12
            L26:
                r1 = r3
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.$$g(int, short, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f27219r = 322973042;
            f27218q = 52933405;
            f27217p = 273492607;
            f27215n = 454982252;
            f27213l = 2139866563;
            f27212k = 2073498872;
            init$0();
            f27216o = 0;
            f27214m = 1;
            f27206e = 740602047300126166L;
            f27204c = 508362592;
            f27205d = (char) 17878;
            f27209h = -448665136;
            f27210i = 1150422411;
            f27207f = 1130606752;
            f27211j = new byte[]{-124, -127, 109, -126, 81, 84, -123, 124, 123, -120, -97, 108, 88, -126, 80, -103, MessagePack.Code.FIXEXT1, 121, 100, -17, MessagePack.Code.NEVER_USED, -100, MessagePack.Code.FIXEXT4, -20, 100, -18, 102, MessagePack.Code.FLOAT32, -73, MessagePack.Code.BIN8, 59, MessagePack.Code.FIXEXT2, -24, -92, -81, 124, 127, 126, -21, 99, -18, -127, -6, -99, -16, -82, -11, -15, -8, -5, -97, -86, MessagePack.Code.EXT16, -99, -124, Ascii.SO, -97, -8, -87, -85, MessagePack.Code.BIN8, MessagePack.Code.BIN8, -110, -98, -67, -80, -105, MessagePack.Code.FLOAT32, MessagePack.Code.EXT16, -91, -71, MessagePack.Code.ARRAY32, MessagePack.Code.FLOAT64, -94, MessagePack.Code.UINT32, -94, 115, MessagePack.Code.STR16, MessagePack.Code.FALSE, -65, MessagePack.Code.UINT32, MessagePack.Code.NEVER_USED, -107, -69, -107, -110, MessagePack.Code.UINT32, -109, -122, -19, -111, MessagePack.Code.MAP32, 83, Ascii.SO, -81, -83, -111, MessagePack.Code.MAP32, -106, -101, -99, 8, -104, -100, -18, 69, -21, 80, -23, 62, 71, -84, 80, 67, -21, 80, -23, 94, 39, Ascii.FS, -19, -20, -17, 88, MessagePack.Code.NEGFIXINT_PREFIX, 95, -127, 108, MessagePack.Code.MAP32, -120, -94, MessagePack.Code.BIN32, 105, MessagePack.Code.FIXEXT16, 122, MessagePack.Code.NEVER_USED, MessagePack.Code.ARRAY32, MessagePack.Code.NIL, MessagePack.Code.TRUE, 103, 118, MessagePack.Code.FIXARRAY_PREFIX, 86, MessagePack.Code.NEVER_USED, -111, 17, 96, 69, 71, 99, 42, 117, Ascii.US, 98, 102, 125, 124, 40, 51, Ascii.US, 105, 125, -18, -90, 42, 17, 121, 42, 99, 44, 53, 86, 103, 102, 125, Ascii.DC2, 122, 45, 114, Ascii.SO, -12, 71, -12, -118, -118, -71, -78, -119, -77, -127, MessagePack.Code.FIXSTR_PREFIX, -122, -78, MessagePack.Code.ARRAY32, 68, -122, 118};
        }

        AnonymousClass5(Context context) {
            context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x037d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r26, int r27, int r28, int r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1900
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{101, -29, 17, 95};
            $$b = 78;
        }

        static void init$1() {
            $$d = new byte[]{39, 4, 32, -80, 65, MessagePack.Code.UINT8, -23, 75, MessagePack.Code.FLOAT64, 65, -75, 75, MessagePack.Code.NIL, 74, -16};
            $$e = 206;
        }

        static void init$2() {
            $$c = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
            $$f = 76;
        }

        private static void s(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            int i4 = $11;
            int i5 = i4 + 75;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            Object charArray = str6;
            if (str6 != null) {
                int i7 = i4 + 49;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object obj = null;
            Object charArray3 = str4;
            if (str4 != null) {
                int i9 = $10 + 103;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    str4.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray3 = str4.toCharArray();
            }
            o.a.i iVar = new o.a.i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            while (iVar.f19932b < length3) {
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) (-1);
                        objA = o.d.d.a(Color.green(0) + 106, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -155898465, false, $$g(b2, (byte) (57 & b2), (byte) 0), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b3 = (byte) (-1);
                        objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 848, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 6488), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -694521287, false, $$g(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 54))), (byte) 0), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b4 = (byte) (-1);
                        objA3 = o.d.d.a(TextUtils.indexOf("", "") + 458, (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 12, 1804962841, false, $$g(b4, (byte) ((-1) - (((-1) - b4) | ((-1) - 56))), (byte) 0), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 639, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65099), 12 - View.MeasureSpec.getSize(0), 1636969060, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    obj = null;
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f27206e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f27204c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f27205d) ^ 740602047300126166L))));
                    iVar.f19932b++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x0223 A[PHI: r4
  0x0223: PHI (r4v14 int) = (r4v3 int), (r4v17 int) binds: [B:136:0x0239, B:132:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x023b A[PHI: r4
  0x023b: PHI (r4v4 int) = (r4v3 int), (r4v17 int) binds: [B:136:0x0239, B:132:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void t(short r28, int r29, int r30, int r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 834
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.t(short, int, int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void u(int r8, short r9, byte r10, java.lang.Object[] r11) {
            /*
                int r8 = r8 * 3
                int r3 = r8 + 1
                int r0 = r9 * 2
                int r2 = 3 - r0
                int r1 = r10 + 97
                byte[] r7 = o.y.j.AnonymousClass5.$$a
                byte[] r6 = new byte[r3]
                r5 = 0
                if (r7 != 0) goto L2d
                r3 = r8
                r0 = r2
                r4 = r5
            L14:
                int r1 = -r2
                int r1 = r1 + r3
                r3 = r4
                r2 = r0
            L18:
                byte r0 = (byte) r1
                r6[r3] = r0
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r11[r5] = r0
                return
            L27:
                int r0 = r2 + 1
                r2 = r7[r0]
                r3 = r1
                goto L14
            L2d:
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.u(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0021 -> B:17:0x0010). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void v(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r6 = 14 - r9
                int r1 = r8 + 1
                byte[] r5 = o.y.j.AnonymousClass5.$$d
                int r0 = r7 + 98
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r5 != 0) goto L26
                r0 = r8
                r1 = r6
                r2 = r3
            L10:
                int r0 = -r0
                int r6 = r6 + r0
            L12:
                byte r0 = (byte) r6
                int r1 = r1 + 1
                r4[r2] = r0
                if (r2 != r8) goto L21
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L21:
                int r2 = r2 + 1
                r0 = r5[r1]
                goto L10
            L26:
                r2 = r3
                r1 = r6
                r6 = r0
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.v(int, int, byte, java.lang.Object[]):void");
        }

        @Override // o.an.a.b
        public final void b(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27216o + 125;
            f27214m = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                o.ea.f.a();
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                s((char) (16532 - ((Process.getThreadPriority(0) + 20) >> 6)), "\ue0cb\udda0▝䵋\uf2b2寴\ue947\uf671챤䀺\u244bʪ✪⩨拹ﻭ嫱㦃⏩꺲蛿渍櫵鰣\u98e48婞ᆘᬢ", "\u0000\u0000\u0000\u0000", "臤퇁钶\ued40", (KeyEvent.getMaxKeyCode() >> 16) - 1227767423, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                s((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "ꤰ簁딮擨왊웮偶험囙晆ﾊ煷㑼ꪼ뜐㌲舖Ꭓ机㙢Ꚅࠛ\ued30䡋", "\u0000\u0000\u0000\u0000", "곙濆\udfce잿", (-1) - ExpandableListView.getPackedPositionChild(0L), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            if (j.b(j.this) != null) {
                int i4 = f27214m + 83;
                f27216o = i4 % 128;
                int i5 = i4 % 2;
                if (cVar.c() == o.bg.a.az) {
                    Object[] objArr3 = {j.this};
                    int i6 = j.f27191p * (-311821329);
                    j.f27191p = i6;
                    int i7 = j.f27192q * 647721012;
                    j.f27192q = i7;
                    int i8 = (-2023056016) * j.f27193s;
                    j.f27193s = i8;
                    int i9 = j.f27195u * 741771336;
                    j.f27195u = i9;
                    j.a(i8, i7, i6, objArr3, -1491993691, 1491993692, i9);
                    j.d(j.this).onAuthenticationDeclined();
                    return;
                }
                Object[] objArr4 = {j.this};
                int i10 = j.f27189m * 118597738;
                j.f27189m = i10;
                int i11 = j.f27190o * (-1802455652);
                j.f27190o = i11;
                int i12 = (-1397008291) * j.f27194t;
                j.f27194t = i12;
                ((o.x.f) j.a(i12, i11, i10, objArr4, 222334649, -222334649, Thread.currentThread().getPriority())).onError(o.by.c.b(cVar));
            }
            int i13 = f27216o + 57;
            f27214m = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:305:0x06de  */
        /* JADX WARN: Removed duplicated region for block: B:404:0x125a  */
        @Override // o.an.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 5700
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.c(java.lang.String):void");
        }
    }

    private static String $$j(int i2, int i3, short s2) {
        int i4 = i3 * 4;
        int i5 = 115 - (i2 * 2);
        int i6 = 4 - (s2 * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6++;
            i5 += i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i6];
            i6++;
            i5 += b2;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27195u = -8978890;
        f27193s = -776544085;
        f27192q = 1011722379;
        f27191p = 170516938;
        f27194t = -1388789191;
        f27190o = 813584255;
        f27189m = 490653149;
        A = 0;
        f27197z = 1;
        D = 0;
        B = 1;
        n();
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getScrollBarSize();
        int i2 = f27197z + 41;
        A = i2 % 128;
        int i3 = i2 % 2;
    }

    public j(String str, o.ep.d dVar, boolean z2, a.c cVar, o.eb.d<P> dVar2, String str2) {
        super(str, dVar);
        this.f27201v = z2;
        this.f27202w = cVar;
        this.f27199l = dVar2;
        this.f27203y = str2;
    }

    private static void C(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 85;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.n nVar = new o.a.n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i9 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f27196x)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(Color.red(0) + 270, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2071844881, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 522;
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iGreen = 12 - Color.green(0);
                    byte b4 = (byte) ((-1) - (((-1) - $$e) | ((-1) - 1)));
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(tapTimeout, capsMode, iGreen, 627984172, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    int packedPositionChild = 521 - ExpandableListView.getPackedPositionChild(0L);
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int iIndexOf = 12 - TextUtils.indexOf("", "");
                    byte b6 = (byte) ((-1) - (((-1) - $$e) | ((-1) - 1)));
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a(packedPositionChild, bitsPerPixel, iIndexOf, 627984172, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            int i10 = $11 + 1;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - i6)));
        int i12 = ((-1) - (((-1) - i10) & ((-1) - i11))) | (~((i9 + i6) - (i9 & i6)));
        int i13 = i11 | i4;
        int i14 = ~i6;
        int i15 = (-1) - (((-1) - ((~((-1) - (((-1) - i4) & ((-1) - ((-1) - (((-1) - i14) & ((-1) - i5))))))) | (~((i8 | i14) | i9)))) & ((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - i5)))) & ((-1) - i6))))));
        int i16 = i5 + i6 + i3 + ((-1329026341) * i2) + ((-1277752516) * i7);
        int i17 = i16 * i16;
        int i18 = ((1212708917 * i5) - 1912602624) + ((-659060787) * i6) + ((-1871769704) * i12) + (i13 * 935884852) + (935884852 * i15) + (276824064 * i3) + (494927872 * i2) + (1577058304 * i7) + ((-1783103488) * i17);
        int i19 = (i5 * 595972471) + 129777640 + (i6 * 595971967) + (i12 * (-504)) + (i13 * 252) + (i15 * 252) + (i3 * 595972219) + (i2 * (-1341978823)) + (i7 * 731850196) + (i17 * 1869086720);
        if (i18 + (i19 * i19 * (-846725120)) != 1) {
            return b(objArr);
        }
        j jVar = (j) objArr[0];
        int i20 = 2 % 2;
        int i21 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        D = i21 % 128;
        int i22 = i21 % 2;
        jVar.e();
        int i23 = D + 103;
        B = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    static /* synthetic */ void a(j jVar) {
        Object[] objArr = {jVar};
        int i2 = f27191p * (-311821329);
        f27191p = i2;
        int i3 = f27192q * 647721012;
        f27192q = i3;
        int i4 = (-2023056016) * f27193s;
        f27193s = i4;
        int i5 = f27195u * 741771336;
        f27195u = i5;
        a(i4, i3, i2, objArr, -1491993691, 1491993692, i5);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        j jVar = (j) objArr[0];
        int i2 = 2 % 2;
        int i3 = D + 59;
        B = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = jVar.i();
        int i5 = D + 29;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            return fVarI;
        }
        throw null;
    }

    static /* synthetic */ o.x.f b(j jVar) {
        int i2 = 2 % 2;
        int i3 = D + 75;
        B = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = jVar.i();
        int i5 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        D = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f c(j jVar) {
        int i2 = 2 % 2;
        int i3 = B + 35;
        D = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = jVar.i();
        int i5 = B + 83;
        D = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f d(j jVar) {
        int i2 = 2 % 2;
        int i3 = B + 47;
        D = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = jVar.i();
        int i5 = D + 7;
        B = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f e(j jVar) {
        int i2 = f27189m * 118597738;
        f27189m = i2;
        int i3 = f27190o * (-1802455652);
        f27190o = i3;
        int i4 = (-1397008291) * f27194t;
        f27194t = i4;
        return (o.x.f) a(i4, i3, i2, new Object[]{jVar}, 222334649, -222334649, Thread.currentThread().getPriority());
    }

    static void init$0() {
        $$d = new byte[]{124, 69, -84, MessagePack.Code.STR8};
        $$e = 247;
    }

    static void n() {
        f27196x = -1270219300;
    }

    @Override // o.y.c
    final void a_() throws Throwable {
        int i2 = 2 % 2;
        int i3 = D + 91;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        if (this.f27201v) {
            int i6 = i4 + 55;
            D = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        String str = this.f27203y;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        C(TextUtils.lastIndexOf("", '0') + 19, "\ufffe\nￊ\u000e\u001c\u000b￭ￊ\u0016\u000b\u001e\u0013\u0011\u0013￮ￊ\u000f\u0012", true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 285, ExpandableListView.getPackedPositionGroup(0L) + 1, objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(((c) this).f27088r.b());
        Object[] objArr2 = new Object[1];
        C((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, "\u0012\u0017ￃ\u0016\u0018\u0013\u0013\u0012\u0015\u0017ￃ\u0003ￃ\u0007\u0012\b\u0016ￃ\u0011", false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 291, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, objArr2);
        throw new WalletValidationException(walletValidationErrorCode, str, sbAppend.append(((String) objArr2[0]).intern()).append(this.f27202w.name()).toString());
    }

    @Override // o.x.i
    public final String c() {
        int i2 = 2 % 2;
        int i3 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        D = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f27203y;
        }
        throw null;
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        int i2 = 2 % 2;
        new o.an.a(context, new a.b() { // from class: o.y.j.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c */
            private static int f27204c = 0;

            /* JADX INFO: renamed from: d */
            private static char f27205d = 0;

            /* JADX INFO: renamed from: e */
            private static long f27206e = 0;

            /* JADX INFO: renamed from: f */
            private static int f27207f = 0;

            /* JADX INFO: renamed from: g */
            private static short[] f27208g = null;

            /* JADX INFO: renamed from: h */
            private static int f27209h = 0;

            /* JADX INFO: renamed from: i */
            private static int f27210i = 0;

            /* JADX INFO: renamed from: j */
            private static byte[] f27211j = null;

            /* JADX INFO: renamed from: k */
            public static int f27212k = 0;

            /* JADX INFO: renamed from: l */
            public static int f27213l = 0;

            /* JADX INFO: renamed from: m */
            private static int f27214m = 0;

            /* JADX INFO: renamed from: n */
            public static int f27215n = 0;

            /* JADX INFO: renamed from: o */
            private static int f27216o = 0;

            /* JADX INFO: renamed from: p */
            public static int f27217p = 0;

            /* JADX INFO: renamed from: q */
            public static int f27218q = 0;

            /* JADX INFO: renamed from: r */
            public static int f27219r = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Context f27221b;

            private static String $$g(int v2, short v3, byte v4) {
                /*
                    int r0 = r11 * 3
                    int r8 = r0 + 1
                    int r7 = r9 + 4
                    int r6 = 122 - r10
                    byte[] r5 = o.y.j.AnonymousClass5.$$c
                    byte[] r4 = new byte[r8]
                    r3 = 0
                    if (r5 != 0) goto L26
                    r0 = r6
                    r6 = r8
                    r2 = r3
                L12:
                    int r6 = r6 + r0
                    r1 = r2
                L14:
                    int r2 = r1 + 1
                    int r7 = r7 + 1
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    if (r2 != r8) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L23:
                    r0 = r5[r7]
                    goto L12
                L26:
                    r1 = r3
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.$$g(int, short, byte):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                f27219r = 322973042;
                f27218q = 52933405;
                f27217p = 273492607;
                f27215n = 454982252;
                f27213l = 2139866563;
                f27212k = 2073498872;
                init$0();
                f27216o = 0;
                f27214m = 1;
                f27206e = 740602047300126166L;
                f27204c = 508362592;
                f27205d = (char) 17878;
                f27209h = -448665136;
                f27210i = 1150422411;
                f27207f = 1130606752;
                f27211j = new byte[]{-124, -127, 109, -126, 81, 84, -123, 124, 123, -120, -97, 108, 88, -126, 80, -103, MessagePack.Code.FIXEXT1, 121, 100, -17, MessagePack.Code.NEVER_USED, -100, MessagePack.Code.FIXEXT4, -20, 100, -18, 102, MessagePack.Code.FLOAT32, -73, MessagePack.Code.BIN8, 59, MessagePack.Code.FIXEXT2, -24, -92, -81, 124, 127, 126, -21, 99, -18, -127, -6, -99, -16, -82, -11, -15, -8, -5, -97, -86, MessagePack.Code.EXT16, -99, -124, Ascii.SO, -97, -8, -87, -85, MessagePack.Code.BIN8, MessagePack.Code.BIN8, -110, -98, -67, -80, -105, MessagePack.Code.FLOAT32, MessagePack.Code.EXT16, -91, -71, MessagePack.Code.ARRAY32, MessagePack.Code.FLOAT64, -94, MessagePack.Code.UINT32, -94, 115, MessagePack.Code.STR16, MessagePack.Code.FALSE, -65, MessagePack.Code.UINT32, MessagePack.Code.NEVER_USED, -107, -69, -107, -110, MessagePack.Code.UINT32, -109, -122, -19, -111, MessagePack.Code.MAP32, 83, Ascii.SO, -81, -83, -111, MessagePack.Code.MAP32, -106, -101, -99, 8, -104, -100, -18, 69, -21, 80, -23, 62, 71, -84, 80, 67, -21, 80, -23, 94, 39, Ascii.FS, -19, -20, -17, 88, MessagePack.Code.NEGFIXINT_PREFIX, 95, -127, 108, MessagePack.Code.MAP32, -120, -94, MessagePack.Code.BIN32, 105, MessagePack.Code.FIXEXT16, 122, MessagePack.Code.NEVER_USED, MessagePack.Code.ARRAY32, MessagePack.Code.NIL, MessagePack.Code.TRUE, 103, 118, MessagePack.Code.FIXARRAY_PREFIX, 86, MessagePack.Code.NEVER_USED, -111, 17, 96, 69, 71, 99, 42, 117, Ascii.US, 98, 102, 125, 124, 40, 51, Ascii.US, 105, 125, -18, -90, 42, 17, 121, 42, 99, 44, 53, 86, 103, 102, 125, Ascii.DC2, 122, 45, 114, Ascii.SO, -12, 71, -12, -118, -118, -71, -78, -119, -77, -127, MessagePack.Code.FIXSTR_PREFIX, -122, -78, MessagePack.Code.ARRAY32, 68, -122, 118};
            }

            AnonymousClass5(Context context2) {
                context = context2;
            }

            /* JADX WARN: Removed duplicated region for block: B:128:0x037d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(android.content.Context r26, int r27, int r28, int r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1900
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.d(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{101, -29, 17, 95};
                $$b = 78;
            }

            static void init$1() {
                $$d = new byte[]{39, 4, 32, -80, 65, MessagePack.Code.UINT8, -23, 75, MessagePack.Code.FLOAT64, 65, -75, 75, MessagePack.Code.NIL, 74, -16};
                $$e = 206;
            }

            static void init$2() {
                $$c = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
                $$f = 76;
            }

            private static void s(char c2, String str, String str2, String str3, int i22, Object[] objArr) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i3 = 2 % 2;
                int i4 = $11;
                int i5 = i4 + 75;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                Object charArray = str6;
                if (str6 != null) {
                    int i7 = i4 + 49;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    charArray = str6.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str5;
                if (str5 != null) {
                    charArray2 = str5.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object obj = null;
                Object charArray3 = str4;
                if (str4 != null) {
                    int i9 = $10 + 103;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        str4.toCharArray();
                        obj.hashCode();
                        throw null;
                    }
                    charArray3 = str4.toCharArray();
                }
                o.a.i iVar = new o.a.i();
                int length = cArr.length;
                char[] cArr3 = new char[length];
                int length2 = cArr2.length;
                char[] cArr4 = new char[length2];
                System.arraycopy(cArr, 0, cArr3, 0, length);
                System.arraycopy(cArr2, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c2);
                cArr4[2] = (char) (cArr4[2] + ((char) i22));
                int length3 = ((char[]) charArray3).length;
                char[] cArr5 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr2 = {iVar};
                        Object objA = o.d.d.a(540069882);
                        if (objA == null) {
                            byte b2 = (byte) (-1);
                            objA = o.d.d.a(Color.green(0) + 106, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -155898465, false, $$g(b2, (byte) (57 & b2), (byte) 0), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                        Object[] objArr3 = {iVar};
                        Object objA2 = o.d.d.a(2068572);
                        if (objA2 == null) {
                            byte b3 = (byte) (-1);
                            objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 848, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 6488), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -694521287, false, $$g(b3, (byte) ((-1) - (((-1) - b3) | ((-1) - 54))), (byte) 0), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA3 = o.d.d.a(-1122996612);
                        if (objA3 == null) {
                            byte b4 = (byte) (-1);
                            objA3 = o.d.d.a(TextUtils.indexOf("", "") + 458, (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 12, 1804962841, false, $$g(b4, (byte) ((-1) - (((-1) - b4) | ((-1) - 56))), (byte) 0), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA4 = o.d.d.a(-1223178239);
                        if (objA4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 639, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65099), 12 - View.MeasureSpec.getSize(0), 1636969060, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        obj = null;
                        cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                        cArr3[iIntValue2] = iVar.f19933e;
                        cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f27206e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f27204c) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f27205d) ^ 740602047300126166L))));
                        iVar.f19932b++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr5);
            }

            /* JADX WARN: Removed duplicated region for block: B:133:0x0223 A[PHI: r4
  0x0223: PHI (r4v14 int) = (r4v3 int), (r4v17 int) binds: [B:136:0x0239, B:132:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:137:0x023b A[PHI: r4
  0x023b: PHI (r4v4 int) = (r4v3 int), (r4v17 int) binds: [B:136:0x0239, B:132:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void t(short r28, int r29, int r30, int r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 834
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.t(short, int, int, int, byte, java.lang.Object[]):void");
            }

            private static void u(int v2, short v3, byte v4, Object[] v5) {
                /*
                    int r8 = r8 * 3
                    int r3 = r8 + 1
                    int r0 = r9 * 2
                    int r2 = 3 - r0
                    int r1 = r10 + 97
                    byte[] r7 = o.y.j.AnonymousClass5.$$a
                    byte[] r6 = new byte[r3]
                    r5 = 0
                    if (r7 != 0) goto L2d
                    r3 = r8
                    r0 = r2
                    r4 = r5
                L14:
                    int r1 = -r2
                    int r1 = r1 + r3
                    r3 = r4
                    r2 = r0
                L18:
                    byte r0 = (byte) r1
                    r6[r3] = r0
                    int r4 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r11[r5] = r0
                    return
                L27:
                    int r0 = r2 + 1
                    r2 = r7[r0]
                    r3 = r1
                    goto L14
                L2d:
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.u(int, short, byte, java.lang.Object[]):void");
            }

            private static void v(int v2, int v3, byte v4, Object[] v5) {
                /*
                    int r6 = 14 - r9
                    int r1 = r8 + 1
                    byte[] r5 = o.y.j.AnonymousClass5.$$d
                    int r0 = r7 + 98
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    if (r5 != 0) goto L26
                    r0 = r8
                    r1 = r6
                    r2 = r3
                L10:
                    int r0 = -r0
                    int r6 = r6 + r0
                L12:
                    byte r0 = (byte) r6
                    int r1 = r1 + 1
                    r4[r2] = r0
                    if (r2 != r8) goto L21
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r10[r3] = r0
                    return
                L21:
                    int r2 = r2 + 1
                    r0 = r5[r1]
                    goto L10
                L26:
                    r2 = r3
                    r1 = r6
                    r6 = r0
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.v(int, int, byte, java.lang.Object[]):void");
            }

            @Override // o.an.a.b
            public final void b(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i3 = f27216o + 125;
                f27214m = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    o.ea.f.a();
                    obj.hashCode();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    s((char) (16532 - ((Process.getThreadPriority(0) + 20) >> 6)), "\ue0cb\udda0▝䵋\uf2b2寴\ue947\uf671챤䀺\u244bʪ✪⩨拹ﻭ嫱㦃⏩꺲蛿渍櫵鰣\u98e48婞ᆘᬢ", "\u0000\u0000\u0000\u0000", "臤퇁钶\ued40", (KeyEvent.getMaxKeyCode() >> 16) - 1227767423, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    s((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "ꤰ簁딮擨왊웮偶험囙晆ﾊ煷㑼ꪼ뜐㌲舖Ꭓ机㙢Ꚅࠛ\ued30䡋", "\u0000\u0000\u0000\u0000", "곙濆\udfce잿", (-1) - ExpandableListView.getPackedPositionChild(0L), objArr2);
                    o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                }
                if (j.b(j.this) != null) {
                    int i4 = f27214m + 83;
                    f27216o = i4 % 128;
                    int i5 = i4 % 2;
                    if (cVar.c() == o.bg.a.az) {
                        Object[] objArr3 = {j.this};
                        int i6 = j.f27191p * (-311821329);
                        j.f27191p = i6;
                        int i7 = j.f27192q * 647721012;
                        j.f27192q = i7;
                        int i8 = (-2023056016) * j.f27193s;
                        j.f27193s = i8;
                        int i9 = j.f27195u * 741771336;
                        j.f27195u = i9;
                        j.a(i8, i7, i6, objArr3, -1491993691, 1491993692, i9);
                        j.d(j.this).onAuthenticationDeclined();
                        return;
                    }
                    Object[] objArr4 = {j.this};
                    int i10 = j.f27189m * 118597738;
                    j.f27189m = i10;
                    int i11 = j.f27190o * (-1802455652);
                    j.f27190o = i11;
                    int i12 = (-1397008291) * j.f27194t;
                    j.f27194t = i12;
                    ((o.x.f) j.a(i12, i11, i10, objArr4, 222334649, -222334649, Thread.currentThread().getPriority())).onError(o.by.c.b(cVar));
                }
                int i13 = f27216o + 57;
                f27214m = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:305:0x06de  */
            /* JADX WARN: Removed duplicated region for block: B:404:0x125a  */
            @Override // o.an.a.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c(java.lang.String r30) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 5700
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.j.AnonymousClass5.c(java.lang.String):void");
            }
        }, bVar).c(dVar, g(), ((c) this).f27088r.b(), this.f27202w);
        int i3 = D + 33;
        B = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void c(Context context, o.x.f fVar, P p2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = D + 55;
        B = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            int i4 = B + 123;
            D = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            C((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, "\u0007￼\u000f\u0004\u0002\u0004\uffdf\u0000\r\u0010\ufffe\u0000￮\r\u0000\t\t￤\u0014￼\u0007\u000b\u000e\u0004\uffdf\uffff\r￼\uffde", true, 300 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0') + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C(12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\ufffb\ufff7\u000b\n\ufffe\ufffb\u0004\n\uffff\ufff9\ufff7\n", false, 305 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i6 = D + 97;
            B = i6 % 128;
            int i7 = i6 % 2;
        }
        this.f27198k = p2;
        this.f27199l.setProcessCallback(fVar);
        b(context, fVar);
    }

    public final fr.antelop.sdk.CancellationSignal l() {
        int i2 = 2 % 2;
        CancellationSignal cancellationSignal = this.f27200n;
        if (cancellationSignal == null || cancellationSignal.isCanceled()) {
            int i3 = B + 45;
            D = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        fr.antelop.sdk.CancellationSignal cancellationSignal2 = new fr.antelop.sdk.CancellationSignal(this.f27200n);
        int i5 = D + 89;
        B = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return cancellationSignal2;
    }

    public final ICardDisplay m() {
        int i2 = 2 % 2;
        int i3 = D + 33;
        B = i3 % 128;
        int i4 = i3 % 2;
        if (((c) this).f27088r.r() == null || !((c) this).f27088r.r().a()) {
            CardDisplay cardDisplay = new CardDisplay(((c) this).f27088r);
            int i5 = D + 69;
            B = i5 % 128;
            int i6 = i5 % 2;
            return cardDisplay;
        }
        o.er.b bVar = (o.er.b) ((c) this).f27088r.c(o.er.b.class);
        if (bVar != null) {
            int i7 = D + 71;
            B = i7 % 128;
            if (i7 % 2 == 0) {
                bVar.B();
                throw null;
            }
            if (bVar.B() != null) {
                Object[] objArr = {bVar.B()};
                int iMyUid = Process.myUid();
                int i8 = (-1370859174) * o.ep.e.f24489e;
                o.ep.e.f24489e = i8;
                int i9 = o.ep.e.f24487a * (-1102038409);
                o.ep.e.f24487a = i9;
                if (((o.ep.b) o.ep.e.e(i8, 17017849, iMyUid, objArr, i9, (int) Runtime.getRuntime().totalMemory(), -17017848)) != o.ep.b.f24426d) {
                    return new EcomStaticTokenDisplay(bVar.B());
                }
            }
        }
        int i10 = D + 65;
        B = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final o.dx.d o() {
        int i2 = 2 % 2;
        Object obj = null;
        if (((c) this).f27088r.r() != null) {
            int i3 = B + 57;
            D = i3 % 128;
            int i4 = i3 % 2;
            if (((c) this).f27088r.r().a()) {
                int i5 = B + 85;
                D = i5 % 128;
                if (i5 % 2 != 0) {
                    ((c) this).f27088r.A();
                    obj.hashCode();
                    throw null;
                }
                if (((c) this).f27088r.A() != null) {
                    Iterator<o.ep.a> it = ((c) this).f27088r.A().values().iterator();
                    while (it.hasNext()) {
                        int i6 = D + 23;
                        B = i6 % 128;
                        int i7 = i6 % 2;
                        for (o.eq.b bVar : it.next().a()) {
                            int i8 = B + 47;
                            D = i8 % 128;
                            int i9 = i8 % 2;
                            if (bVar instanceof o.er.b) {
                                o.ep.e eVarB = ((o.er.b) bVar).B();
                                if (eVarB != null) {
                                    return eVarB.b();
                                }
                                int i10 = D + 51;
                                B = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
