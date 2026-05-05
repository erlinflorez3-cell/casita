package o.ep;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.digitalcard.Token;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.j;
import o.a.o;
import o.a.q;
import o.y.k;
import o.y.l;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static int G = 1;
    private static int H = 0;

    /* JADX INFO: renamed from: a */
    public static int f24583a = 591638780;

    /* JADX INFO: renamed from: b */
    public static int f24584b = 2020442766;

    /* JADX INFO: renamed from: c */
    public static int f24585c = 1491660547;

    /* JADX INFO: renamed from: d */
    public static int f24586d = -152752122;

    /* JADX INFO: renamed from: e */
    public static int f24587e = 1303583748;

    /* JADX INFO: renamed from: f */
    public static int f24588f = -1070324798;

    /* JADX INFO: renamed from: g */
    public static int f24589g = -1328066614;

    /* JADX INFO: renamed from: h */
    public static int f24590h = -830699606;

    /* JADX INFO: renamed from: i */
    public static int f24591i = 685650517;

    /* JADX INFO: renamed from: j */
    public static int f24592j = -1991523112;

    /* JADX INFO: renamed from: k */
    public static int f24593k = 1372764049;

    /* JADX INFO: renamed from: l */
    public static int f24594l = -543462943;

    /* JADX INFO: renamed from: m */
    public static int f24595m = 247159787;

    /* JADX INFO: renamed from: n */
    public static int f24596n = 107729101;

    /* JADX INFO: renamed from: o */
    public static int f24597o = -520865542;

    /* JADX INFO: renamed from: p */
    public static int f24598p = 1756977181;

    /* JADX INFO: renamed from: r */
    public static int f24599r = -1974426536;

    /* JADX INFO: renamed from: s */
    public static int f24600s = -186420835;

    /* JADX INFO: renamed from: t */
    public static int f24601t = -1507459201;
    private final o.dx.c A;
    private final d B;
    private b C;
    private final Long D;
    private final String E;
    private final String F;

    /* JADX INFO: renamed from: q */
    private final a f24602q;

    /* JADX INFO: renamed from: u */
    private final String f24603u;

    /* JADX INFO: renamed from: v */
    private final String f24604v;

    /* JADX INFO: renamed from: w */
    private final String f24605w;

    /* JADX INFO: renamed from: x */
    private final String f24606x;

    /* JADX INFO: renamed from: y */
    private final String f24607y;

    /* JADX INFO: renamed from: z */
    private final c f24608z;

    /* JADX INFO: renamed from: o.ep.i$1 */
    public class AnonymousClass1 implements o.x.f {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static boolean f24609b = false;

        /* JADX INFO: renamed from: c */
        private static char[] f24610c = null;

        /* JADX INFO: renamed from: e */
        private static int f24611e = 0;

        /* JADX INFO: renamed from: f */
        public static int f24612f = 0;

        /* JADX INFO: renamed from: g */
        private static int f24613g = 0;

        /* JADX INFO: renamed from: h */
        public static int f24614h = 0;

        /* JADX INFO: renamed from: i */
        private static int f24615i = 0;

        /* JADX INFO: renamed from: j */
        private static boolean f24616j = false;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ OperationCallback f24617a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r7, byte r8, short r9) {
            /*
                int r0 = r7 * 3
                int r7 = 3 - r0
                int r2 = r8 * 3
                int r1 = 1 - r2
                int r0 = r9 * 6
                int r0 = r0 + 67
                byte[] r6 = o.ep.i.AnonymousClass1.$$c
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r6 != 0) goto L2b
                r2 = r7
                r0 = r3
                r1 = r4
            L18:
                int r7 = r7 + r0
            L19:
                byte r0 = (byte) r7
                int r2 = r2 + 1
                r5[r1] = r0
                if (r1 != r3) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                int r1 = r1 + 1
                r0 = r6[r2]
                goto L18
            L2b:
                r1 = r4
                r2 = r7
                r7 = r0
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.$$e(int, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f24614h = 564309919;
            f24612f = 1026773184;
            init$0();
            f24613g = 0;
            f24615i = 1;
            f24610c = new char[]{2170, 2144, 2449, 2174, 2163, 2158, 2172, 2147, 2448, 2148, 2151, 2160, 2145, 2161, 2156, 2162, 2463, 2471, 2468, 2154, 2168, 2169, 2164, 2149, 2175, 2466};
            f24611e = 2040400341;
            f24609b = true;
            f24616j = true;
        }

        AnonymousClass1(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:124|189|125|(4:127|177|128|(7:130|188|137|(5:139|186|140|141|146)(1:145)|(7:176|148|(1:150)(7:151|184|152|153|(1:159)(1:165)|160|(2:163|164))|157|(0)(0)|160|(2:163|164))|166|167)(1:131))(1:135)|136|188|137|(0)(0)|(0)|166|167) */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0406 A[Catch: Exception -> 0x0443, TRY_LEAVE, TryCatch #6 {Exception -> 0x0443, blocks: (B:137:0x03e3, B:139:0x0406, B:141:0x0434, B:143:0x043c, B:144:0x0442, B:140:0x0410), top: B:188:0x03e3, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x04b3  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0512  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0451 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] c(int r23, int r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1437
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.c(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{60, -92, 19, MessagePack.Code.MAP16};
            $$b = 41;
        }

        static void init$1() {
            $$c = new byte[]{113, 10, 2, -109};
            $$d = 255;
        }

        private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i4 = $10 + 81;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object obj = str3;
            if (str3 != null) {
                char[] charArray = str3.toCharArray();
                int i6 = $11 + 83;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            o.a.f fVar = new o.a.f();
            char[] cArr2 = f24610c;
            char c2 = '0';
            int i8 = 0;
            if (cArr2 != null) {
                int i9 = $11 + 31;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i8;
                            byte b3 = b2;
                            objA = o.d.d.a(Gravity.getAbsoluteGravity(i8, i8) + 593, (char) (TextUtils.lastIndexOf("", c2, i8, i8) + 13182), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i11++;
                        c2 = '0';
                        i8 = 0;
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
            Object[] objArr3 = {Integer.valueOf(f24611e)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 32, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f24616j) {
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
                        objA3 = o.d.d.a(AndroidCharacter.getMirror('0') + 410, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0) + 11, -1923924106, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (f24609b) {
                int i12 = $10 + 59;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                fVar.f19923e = cArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i14 = $11 + 5;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 458, (char) View.resolveSizeAndState(0, 0, 0), 11 - TextUtils.getTrimmedLength(""), -1923924106, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i16 = 0;
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i16;
                if (fVar.f19922a >= fVar.f19923e) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i16 = fVar.f19922a + 1;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r0 = r8 * 2
                int r0 = r0 + 4
                byte[] r8 = o.ep.i.AnonymousClass1.$$a
                int r3 = r7 * 3
                int r2 = 1 - r3
                int r1 = r9 * 3
                int r7 = 100 - r1
                byte[] r6 = new byte[r2]
                r5 = 0
                int r4 = 0 - r3
                if (r8 != 0) goto L30
                r3 = r5
                r2 = r0
            L17:
                int r1 = -r0
                int r0 = r2 + 1
                int r1 = r1 + r7
                r7 = r1
            L1c:
                byte r1 = (byte) r7
                r6[r3] = r1
                if (r3 != r4) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r10[r5] = r0
                return
            L29:
                int r3 = r3 + 1
                r1 = r8[r0]
                r2 = r0
                r0 = r1
                goto L17
            L30:
                r3 = r5
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.l(short, short, short, java.lang.Object[]):void");
        }

        @Override // o.x.f
        public void onAuthenticationDeclined() {
            int i2 = 2 % 2;
            int i3 = f24615i + 35;
            f24613g = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.x.f
        public void onCustomerCredentialsInvalid(o.j.b bVar) {
            int i2 = 2 % 2;
            int i3 = f24615i + 125;
            f24613g = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 53 / 0;
            }
        }

        @Override // o.x.f
        public void onCustomerCredentialsRequired(List<o.m.h> list) {
            int i2 = 2 % 2;
            operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            int i3 = f24615i + 93;
            f24613g = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.x.f
        public void onError(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24613g + 25;
            f24615i = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                operationCallback.onError(cVar.a());
                obj.hashCode();
                throw null;
            }
            operationCallback.onError(cVar.a());
            int i4 = f24613g + 111;
            f24615i = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.x.f
        public void onProcessStart() {
            int i2 = 2 % 2;
            int i3 = f24615i + 27;
            f24613g = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.x.f
        public void onProcessSuccess() {
            int i2 = 2 % 2;
            int i3 = f24613g + 105;
            f24615i = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                operationCallback.onSuccess(null);
            } else {
                operationCallback.onSuccess(null);
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o.ep.i$2 */
    final class AnonymousClass2 implements o.x.f {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f24619a = 0;

        /* JADX INFO: renamed from: b */
        private static int f24620b = 0;

        /* JADX INFO: renamed from: c */
        private static int f24621c = 0;

        /* JADX INFO: renamed from: f */
        private static short[] f24622f = null;

        /* JADX INFO: renamed from: g */
        private static byte[] f24623g = null;

        /* JADX INFO: renamed from: h */
        private static int f24624h = 0;

        /* JADX INFO: renamed from: i */
        public static int f24625i = 0;

        /* JADX INFO: renamed from: j */
        private static int f24626j = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f24628e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r9, short r10, int r11) {
            /*
                int r8 = r11 + 4
                byte[] r7 = o.ep.i.AnonymousClass2.$$c
                int r6 = r10 * 4
                int r1 = r6 + 1
                int r0 = r9 + 103
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r7 != 0) goto L29
                r1 = r6
                r2 = r8
                r3 = r4
            L12:
                int r0 = -r1
                int r8 = r8 + r0
                r0 = r8
                r8 = r2
            L16:
                int r2 = r8 + 1
                byte r1 = (byte) r0
                r5[r3] = r1
                if (r3 != r6) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L23:
                r1 = r7[r2]
                int r3 = r3 + 1
                r8 = r0
                goto L12
            L29:
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.$$g(int, short, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f24625i = 2076948859;
            init$0();
            f24626j = 0;
            f24624h = 1;
            f24621c = 1580645682;
            f24619a = 1150422483;
            f24620b = -569771090;
            f24623g = new byte[]{-92, MessagePack.Code.FIXSTR_PREFIX, -81, -123, MessagePack.Code.FALSE, -92, -67, -83, -74, 114, 113, -9, MessagePack.Code.FIXARRAY_PREFIX, 109, -26, -73, -74, -71, -86, -94, -87, Ascii.RS, -22, Ascii.ESC, -18, -19, 2, -11, -16, 1, Ascii.DC4, -27, MessagePack.Code.INT16, Ascii.ESC, -23, -85, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.FIXARRAY_PREFIX, -75, -119, -116, -18, -72, -92, -68, 113, -28, MessagePack.Code.FLOAT32, -100, -66, MessagePack.Code.INT64, MessagePack.Code.EXT8, -2, -91, MessagePack.Code.EXT8, -4, -21, -103, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT2, MessagePack.Code.EXT8, MessagePack.Code.INT8, MessagePack.Code.STR32, MessagePack.Code.INT64, MessagePack.Code.BIN16, -115, -115, -115, -115};
        }

        AnonymousClass2(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        static void init$0() {
            $$a = new byte[]{7, -110, 9, 72};
            $$b = 109;
        }

        static void init$1() {
            $$d = new byte[]{3, 32, 122, 114, 64, MessagePack.Code.EXT16, -14, 67, -66};
            $$e = 63;
        }

        static void init$2() {
            $$c = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
            $$f = 220;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = r8 * 5
                int r8 = 106 - r0
                int r2 = r7 * 3
                int r1 = 1 - r2
                byte[] r7 = o.ep.i.AnonymousClass2.$$a
                int r0 = r9 * 4
                int r6 = 4 - r0
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L2f
                r0 = r6
                r2 = r4
            L17:
                int r8 = r8 + r6
                int r6 = r0 + 1
            L1a:
                byte r0 = (byte) r8
                r5[r2] = r0
                if (r2 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r10[r4] = r0
                return
            L27:
                int r2 = r2 + 1
                r1 = r7[r6]
                r0 = r6
                r6 = r8
                r8 = r1
                goto L17
            L2f:
                r2 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.k(int, short, int, java.lang.Object[]):void");
        }

        private static void l(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            int i5;
            boolean z2;
            int i6;
            int i7;
            int i8 = 2 % 2;
            j jVar = new j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24619a)};
                Object objA = o.d.d.a(-727631768);
                if (objA == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objA = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 238, (char) (44531 - (Process.myTid() >> 22)), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 35969549, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z3 = iIntValue == -1;
                float f2 = 0.0f;
                if (z3) {
                    byte[] bArr = f24623g;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                int trimmedLength = TextUtils.getTrimmedLength("") + IptcDirectory.TAG_COPYRIGHT_NOTICE;
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28649);
                                int i10 = (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 11;
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(trimmedLength, keyRepeatDelay, i10, 1621469864, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i9++;
                            f2 = 0.0f;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $11 + 49;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr3 = f24623g;
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f24621c)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b7 = (byte) 1;
                                byte b8 = (byte) (b7 - 1);
                                objA3 = o.d.d.a(238 - TextUtils.getCapsMode("", 0, 0), (char) (44531 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 35969549, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            long j3 = f24619a;
                            i7 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) * (-7649639543924978291L))) * ((int) ((j3 - 7649639543924978291L) - (j3 & (-7649639543924978291L))));
                        } else {
                            byte[] bArr4 = f24623g;
                            Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f24621c)};
                            Object objA4 = o.d.d.a(-727631768);
                            if (objA4 == null) {
                                byte b9 = (byte) 1;
                                byte b10 = (byte) (b9 - 1);
                                objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 237, (char) (TextUtils.indexOf((CharSequence) "", '0') + 44532), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, 35969549, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i7 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24619a) ^ (-7649639543924978291L)));
                        }
                        iIntValue = (byte) i7;
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f24622f[i2 + ((int) (((long) f24621c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24619a) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i12 = ((i2 + iIntValue) - 2) + ((int) (((long) f24621c) ^ j2));
                    if (z3) {
                        i5 = 1;
                    } else {
                        int i13 = $10 + 53;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i5 = 0;
                    }
                    jVar.f19936d = i12 + i5;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24620b), sb};
                    Object objA5 = o.d.d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (5358 - TextUtils.getTrimmedLength("")), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f24623g;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr6[i15] = (byte) (((long) bArr5[i15]) ^ (-7649639543924978291L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i16 = $11 + 15;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (z2) {
                            int i18 = $11 + 85;
                            $10 = i18 % 128;
                            if (i18 % 2 != 0) {
                                byte[] bArr7 = f24623g;
                                jVar.f19936d = jVar.f19936d;
                                i6 = jVar.f19935c - (((byte) (((byte) (((long) bArr7[r1]) % (-7649639543924978291L))) % s2)) ^ b2);
                            } else {
                                byte[] bArr8 = f24623g;
                                jVar.f19936d = jVar.f19936d - 1;
                                i6 = jVar.f19935c + (((byte) (((byte) (((long) bArr8[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2);
                            }
                            jVar.f19937e = (char) i6;
                        } else {
                            short[] sArr = f24622f;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void m(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r0 = r7 * 10
                int r7 = r0 + 101
                int r0 = r9 * 5
                int r6 = r0 + 4
                byte[] r5 = o.ep.i.AnonymousClass2.$$d
                int r1 = r8 * 5
                int r0 = 6 - r1
                byte[] r4 = new byte[r0]
                int r3 = 5 - r1
                r2 = 0
                if (r5 != 0) goto L30
                r0 = r3
                r7 = r6
                r1 = r2
            L18:
                int r6 = r6 + 1
                int r0 = -r0
                int r7 = r7 + r0
                int r7 = r7 + (-1)
            L1e:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r3) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r2)
                r10[r2] = r0
                return
            L2b:
                int r1 = r1 + 1
                r0 = r5[r6]
                goto L18
            L30:
                r1 = r2
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.m(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0234  */
        @Override // o.x.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onAuthenticationDeclined() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1109
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.onAuthenticationDeclined():void");
        }

        @Override // o.x.f
        public final void onCustomerCredentialsInvalid(o.j.b bVar) {
            int i2 = 2 % 2;
            int i3 = f24624h + 25;
            f24626j = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.x.f
        public final void onCustomerCredentialsRequired(List<o.m.h> list) {
            int i2 = 2 % 2;
            operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            int i3 = f24626j + 89;
            f24624h = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.x.f
        public final void onError(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24624h + 67;
            f24626j = i3 % 128;
            int i4 = i3 % 2;
            operationCallback.onError(cVar.a());
            int i5 = f24624h + 33;
            f24626j = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.x.f
        public final void onProcessStart() {
            int i2 = 2 % 2;
            int i3 = f24626j + 121;
            f24624h = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
        }

        @Override // o.x.f
        public final void onProcessSuccess() {
            int i2 = 2 % 2;
            int i3 = f24626j + 31;
            f24624h = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                operationCallback.onSuccess(null);
            } else {
                operationCallback.onSuccess(null);
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o.ep.i$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        private static int f24629a = 0;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f24630b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f24631c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f24632d;

        /* JADX INFO: renamed from: e */
        private static int f24633e = 1;

        static {
            int[] iArr = new int[b.values().length];
            f24630b = iArr;
            try {
                iArr[b.f24655e.ordinal()] = 1;
                int i2 = f24633e;
                int i3 = ((-1) - (((-1) - i2) | ((-1) - 97))) + (i2 | 97);
                f24629a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24630b[b.f24653c.ordinal()] = 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24630b[b.f24654d.ordinal()] = 3;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24630b[b.f24652a.ordinal()] = 4;
                int i7 = f24633e + 17;
                f24629a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.values().length];
            f24632d = iArr2;
            try {
                iArr2[d.f24681b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24632d[d.f24680a.ordinal()] = 2;
                int i10 = f24629a + 115;
                f24633e = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 % 2;
                } else {
                    int i12 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24632d[d.f24683d.ordinal()] = 3;
                int i13 = f24633e + 41;
                f24629a = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24632d[d.f24684e.ordinal()] = 4;
                int i15 = f24633e;
                int i16 = (i15 ^ 85) + (((-1) - (((-1) - i15) | ((-1) - 85))) << 1);
                f24629a = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24632d[d.f24682c.ordinal()] = 5;
                int i18 = f24629a;
                int i19 = (((i18 + 63) - (63 & i18)) << 1) - (i18 ^ 63);
                f24633e = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 2 % 2;
                }
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[a.values().length];
            f24631c = iArr3;
            try {
                iArr3[a.f24646e.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24631c[a.f24644b.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: renamed from: o.ep.i$5 */
    final class AnonymousClass5 implements o.x.f {

        /* JADX INFO: renamed from: a */
        public static int f24634a = 1855156858;

        /* JADX INFO: renamed from: b */
        public static int f24635b = 2083978435;

        /* JADX INFO: renamed from: c */
        public static int f24636c = -810863716;

        /* JADX INFO: renamed from: d */
        public static int f24637d = -1036600459;

        /* JADX INFO: renamed from: e */
        public static int f24638e = -1236159993;

        /* JADX INFO: renamed from: f */
        private static int f24639f = 0;

        /* JADX INFO: renamed from: h */
        private static int f24640h = 1;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ OperationCallback f24642i;

        AnonymousClass5(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
            int i8 = ~i5;
            int i9 = ~((i8 + i2) - (i8 & i2));
            int i10 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
            int i11 = ~i2;
            int i12 = ~i7;
            int i13 = (-1) - (((-1) - i11) & ((-1) - i12));
            int i14 = ((i10 + i9) - (i10 & i9)) | (~((i13 + i5) - (i13 & i5)));
            int i15 = ~((-1) - (((-1) - ((-1) - (((-1) - i8) & ((-1) - i11)))) & ((-1) - i12)));
            int i16 = (i11 + i5) - (i11 & i5);
            int i17 = (-1) - (((-1) - (~((-1) - (((-1) - i7) & ((-1) - i16))))) & ((-1) - i15));
            int i18 = ~i16;
            int i19 = (i18 + i9) - (i18 & i9);
            int i20 = i5 + i2 + i4 + ((-327997910) * i3) + ((-604038433) * i6);
            int i21 = i20 * i20;
            int i22 = ((i5 * 234895570) - 128974848) + (234895570 * i2) + (i14 * 695176798) + (695176798 * i17) + ((-347588399) * i19) + (582483968 * i4) + (36700160 * i3) + ((-297271296) * i6) + (1302134784 * i21);
            int i23 = (i5 * (-238133666)) + 182491156 + (i2 * (-238133666)) + (i14 * (-1294)) + (i17 * (-1294)) + (i19 * IptcDirectory.TAG_LANGUAGE_IDENTIFIER) + (i4 * (-238134313)) + (i3 * (-1022231738)) + (i6 * 4118089) + (i21 * (-35979264));
            int i24 = i22 + (i23 * i23 * 1404239872);
            if (i24 == 1) {
                int i25 = 2 % 2;
                int i26 = f24640h;
                int i27 = (i26 & 43) + ((-1) - (((-1) - i26) & ((-1) - 43)));
                f24639f = i27 % 128;
                int i28 = i27 % 2;
            } else if (i24 != 2) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                o.by.c cVar = (o.by.c) objArr[1];
                int i29 = 2 % 2;
                int i30 = f24640h;
                int i31 = ((i30 + 97) - (97 | i30)) + (i30 | 97);
                f24639f = i31 % 128;
                int i32 = i31 % 2;
                operationCallback.onError(cVar.a());
                int i33 = f24639f;
                int i34 = (((i33 + 11) - (11 & i33)) << 1) - (i33 ^ 11);
                f24640h = i34 % 128;
                int i35 = i34 % 2;
            } else {
                AnonymousClass5 anonymousClass52 = (AnonymousClass5) objArr[0];
                int i36 = 2 % 2;
                int i37 = f24640h;
                int i38 = ((41 | i37) << 1) - (i37 ^ 41);
                f24639f = i38 % 128;
                int i39 = i38 % 2;
                operationCallback.onSuccess(null);
                int i40 = f24639f;
                int i41 = (i40 & 27) + ((i40 + 27) - (i40 & 27));
                f24640h = i41 % 128;
                int i42 = i41 % 2;
            }
            return null;
        }

        @Override // o.x.f
        public final void onAuthenticationDeclined() {
            int i2 = 2 % 2;
            int i3 = f24640h;
            int i4 = ((41 | i3) << 1) - (i3 ^ 41);
            f24639f = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.x.f
        public final void onCustomerCredentialsInvalid(o.j.b bVar) {
            int id = (int) Thread.currentThread().getId();
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = f24635b * (-96147231);
            f24635b = i2;
            c(452361034, i2, iFreeMemory, -452361033, (int) SystemClock.uptimeMillis(), id, new Object[]{this, bVar});
        }

        @Override // o.x.f
        public final void onCustomerCredentialsRequired(List<o.m.h> list) {
            int i2 = 2 % 2;
            operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            int i3 = f24639f + 125;
            f24640h = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
        }

        @Override // o.x.f
        public final void onError(o.by.c cVar) {
            int i2 = f24636c * (-1399543051);
            f24636c = i2;
            int iActiveCount = Thread.activeCount();
            int i3 = f24638e * (-1894928727);
            f24638e = i3;
            c(-1560875225, i3, iActiveCount, 1560875225, new Random().nextInt(2051566442), i2, new Object[]{this, cVar});
        }

        @Override // o.x.f
        public final void onProcessStart() {
            int i2 = 2 % 2;
            int i3 = f24639f;
            int i4 = (((i3 + 103) - (103 & i3)) << 1) - (i3 ^ 103);
            f24640h = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
        }

        @Override // o.x.f
        public final void onProcessSuccess() {
            int iNextInt = new Random().nextInt(596598826);
            int i2 = f24637d * (-1351303762);
            f24637d = i2;
            int iMyTid = Process.myTid();
            int i3 = f24634a * (-800977605);
            f24634a = i3;
            c(390075205, iMyTid, i2, -390075203, i3, iNextInt, new Object[]{this});
        }
    }

    public static final class a extends Enum<a> implements o.ea.a<Token.TokenServiceProvider>, o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ a[] f24643a;

        /* JADX INFO: renamed from: b */
        public static final a f24644b;

        /* JADX INFO: renamed from: d */
        private static long f24645d = 0;

        /* JADX INFO: renamed from: e */
        public static final a f24646e;

        /* JADX INFO: renamed from: f */
        private static int f24647f = 0;

        /* JADX INFO: renamed from: g */
        private static int f24648g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24649h = 0;

        /* JADX INFO: renamed from: j */
        private static int f24650j = 0;

        /* JADX INFO: renamed from: c */
        private final String f24651c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r6, int r7, short r8) {
            /*
                int r4 = r6 * 4
                int r3 = 1 - r4
                int r0 = r8 * 7
                int r1 = r0 + 107
                byte[] r8 = o.ep.i.a.$$a
                int r0 = r7 * 4
                int r2 = 3 - r0
                byte[] r7 = new byte[r3]
                r6 = 0
                int r5 = 0 - r4
                if (r8 != 0) goto L2f
                r3 = r5
                r0 = r2
                r4 = r6
            L18:
                int r1 = -r2
                int r1 = r1 + r3
                r3 = r4
                r2 = r0
            L1c:
                int r0 = r2 + 1
                byte r2 = (byte) r1
                r7[r3] = r2
                int r4 = r3 + 1
                if (r3 != r5) goto L2b
                java.lang.String r0 = new java.lang.String
                r0.<init>(r7, r6)
                return r0
            L2b:
                r2 = r8[r0]
                r3 = r1
                goto L18
            L2f:
                r3 = r6
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.a.$$c(byte, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24650j = 0;
            f24647f = 1;
            f24649h = 0;
            f24648g = 1;
            b();
            Object[] objArr = new Object[1];
            i("鿸쮀龵\ud831璏ꛢ\ue8e0핒", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            i("鿸쮀龵\ud831璏ꛢ\ue8e0핒", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr2);
            f24646e = new a(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            i("轼䓽輪䜠ﯢ㧥닡", 1 - (Process.myPid() >> 22), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            i("轼䓽輪䜠ﯢ㧥닡", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr4);
            f24644b = new a(strIntern2, 1, ((String) objArr4[0]).intern());
            f24643a = c();
            int i2 = f24647f + 33;
            f24650j = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
            }
        }

        private a(String str, int i2, String str2) {
            super(str, i2);
            this.f24651c = str2;
        }

        static void b() {
            f24645d = -3146241427813880527L;
        }

        private static /* synthetic */ a[] c() {
            a[] aVarArr;
            int i2 = 2 % 2;
            int i3 = f24648g + 41;
            int i4 = i3 % 128;
            f24649h = i4;
            if (i3 % 2 != 0) {
                aVarArr = new a[3];
                aVarArr[0] = f24646e;
                aVarArr[0] = f24644b;
            } else {
                aVarArr = new a[]{f24646e, f24644b};
            }
            int i5 = i4 + 39;
            f24648g = i5 % 128;
            int i6 = i5 % 2;
            return aVarArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void i(java.lang.String r19, int r20, java.lang.Object[] r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.a.i(java.lang.String, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{69, -20, MessagePack.Code.INT64, -20};
            $$b = 61;
        }

        public static a valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24648g + 113;
            f24649h = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            int i5 = f24648g + 55;
            f24649h = i5 % 128;
            if (i5 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static a[] values() {
            int i2 = 2 % 2;
            int i3 = f24648g + 113;
            f24649h = i3 % 128;
            int i4 = i3 % 2;
            a[] aVarArr = (a[]) f24643a.clone();
            int i5 = f24649h + 47;
            f24648g = i5 % 128;
            if (i5 % 2 != 0) {
                return aVarArr;
            }
            throw null;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f24649h + 61;
            f24648g = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f24651c;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Token.TokenServiceProvider d() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24649h + 51;
            f24648g = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = AnonymousClass4.f24631c[ordinal()];
                throw null;
            }
            int i5 = AnonymousClass4.f24631c[ordinal()];
            if (i5 == 1) {
                return Token.TokenServiceProvider.MDES;
            }
            if (i5 != 2) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                i("즁\uef9e짔䳛傻㈨饏ꓖ㓝厌㝺ꈶ㎼噙㐕ꄠ㹤夽㪴걏㴋居", View.MeasureSpec.getSize(0) + 1, objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
            }
            Token.TokenServiceProvider tokenServiceProvider = Token.TokenServiceProvider.VTS;
            int i6 = f24649h + 121;
            f24648g = i6 % 128;
            if (i6 % 2 != 0) {
                return tokenServiceProvider;
            }
            throw null;
        }

        @Override // o.ea.a
        public final /* synthetic */ Token.TokenServiceProvider e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24649h + 73;
            f24648g = i3 % 128;
            int i4 = i3 % 2;
            Token.TokenServiceProvider tokenServiceProviderD = d();
            if (i4 == 0) {
                int i5 = 88 / 0;
            }
            return tokenServiceProviderD;
        }
    }

    public static final class b extends Enum<b> implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final b f24652a;

        /* JADX INFO: renamed from: c */
        public static final b f24653c;

        /* JADX INFO: renamed from: d */
        public static final b f24654d;

        /* JADX INFO: renamed from: e */
        public static final b f24655e;

        /* JADX INFO: renamed from: f */
        private static int f24656f = 0;

        /* JADX INFO: renamed from: g */
        private static char f24657g = 0;

        /* JADX INFO: renamed from: h */
        private static final /* synthetic */ b[] f24658h;

        /* JADX INFO: renamed from: i */
        private static int f24659i = 0;

        /* JADX INFO: renamed from: j */
        private static char[] f24660j = null;

        /* JADX INFO: renamed from: m */
        private static int f24661m = 0;

        /* JADX INFO: renamed from: n */
        private static int f24662n = 0;

        /* JADX INFO: renamed from: b */
        private final String f24663b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, short r10, int r11) {
            /*
                byte[] r8 = o.ep.i.b.$$a
                int r1 = r11 + 102
                int r0 = r10 * 2
                int r2 = 3 - r0
                int r3 = r9 * 4
                int r0 = 1 - r3
                byte[] r7 = new byte[r0]
                r6 = 0
                int r5 = 0 - r3
                if (r8 != 0) goto L2c
                r4 = r5
                r0 = r2
                r3 = r6
            L16:
                int r1 = -r2
                int r1 = r1 + r4
                r2 = r0
            L19:
                byte r0 = (byte) r1
                r7[r3] = r0
                int r0 = r2 + 1
                if (r3 != r5) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r7, r6)
                return r0
            L26:
                int r3 = r3 + 1
                r2 = r8[r0]
                r4 = r1
                goto L16
            L2c:
                r3 = r6
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.b.$$c(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24661m = 0;
            f24662n = 1;
            f24656f = 0;
            f24659i = 1;
            b();
            Object[] objArr = new Object[1];
            k(8 - View.resolveSizeAndState(0, 0, 0), "\u000b\u000e# \b!\u000b\u0019", (byte) (114 - TextUtils.lastIndexOf("", '0', 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7, "\t\u0002\u0011\u001d\u0002\u0006\f\u0013", (byte) (KeyEvent.normalizeMetaState(0) + 43), objArr2);
            f24654d = new b(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k(View.resolveSize(0, 0) + 6, "\u0007#\b!\u000b\u0019", (byte) (104 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k(7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0011\u001d\u0002\u0006\f\u0013", (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 60), objArr4);
            f24655e = new b(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            k(TextUtils.indexOf((CharSequence) "", '0', 0) + 10, "\u0000\u001e\u0014\u0003#\u0017\u000b\u0018㘁", (byte) (3 - TextUtils.getCapsMode("", 0, 0)), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            k(9 - View.MeasureSpec.getMode(0), " \f\"\u0012\u0015\u0000\u0018\u0015㗹", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27), objArr6);
            f24653c = new b(strIntern3, 2, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            k(TextUtils.indexOf("", "") + 7, "\u001c\u0018\u0005\u001c\u000b\u001b㙕", (byte) (86 - TextUtils.lastIndexOf("", '0')), objArr7);
            String strIntern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            k(7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0018\u0015\u0014\u0013\u0006\u0018㘻", (byte) (93 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr8);
            f24652a = new b(strIntern4, 3, ((String) objArr8[0]).intern());
            f24658h = c();
            int i2 = f24662n + 101;
            f24661m = i2 % 128;
            int i3 = i2 % 2;
        }

        private b(String str, int i2, String str2) {
            super(str, i2);
            this.f24663b = str2;
        }

        static void b() {
            f24660j = new char[]{64625, 64610, 64597, 64619, 64585, 64611, 64577, 64595, 64620, 64593, 64613, 64612, 64517, 64627, 64624, 64618, 64543, 64587, 64608, 64617, 64622, 64598, 64629, 64614, 64592, 64621, 64623, 64609, 64615, 64576, 64630, 64582, 64588, 64605, 64580, 64616};
            f24657g = (char) 51641;
        }

        private static /* synthetic */ b[] c() {
            int i2 = 2 % 2;
            int i3 = f24659i + 77;
            int i4 = i3 % 128;
            f24656f = i4;
            int i5 = i3 % 2;
            b[] bVarArr = {f24654d, f24655e, f24653c, f24652a};
            int i6 = i4 + 49;
            f24659i = i6 % 128;
            int i7 = i6 % 2;
            return bVarArr;
        }

        static void init$0() {
            $$a = new byte[]{34, 36, MessagePack.Code.EXT32, -5};
            $$b = 33;
        }

        private static void k(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2;
            int i5 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            o.a.h hVar = new o.a.h();
            char[] cArr2 = f24660j;
            long j2 = 0;
            int i6 = 8;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 25;
                    $10 = i8 % 128;
                    if (i8 % i4 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objA = o.d.d.a(421932776);
                            if (objA == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objA = o.d.d.a(270 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - ExpandableListView.getPackedPositionChild(j2)), (ViewConfiguration.getScrollBarSize() >> i6) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i7 %= 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objA2 = o.d.d.a(421932776);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 271, (char) (Process.myPid() >> 22), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i4 = 2;
                    j2 = 0;
                    i6 = 8;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(f24657g)};
            Object objA3 = o.d.d.a(421932776);
            if (objA3 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objA3 = o.d.d.a(270 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 11, -811348851, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE});
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
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    int i9 = $10 + 93;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + 1];
                    if (hVar.f19927c == hVar.f19925a) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    } else {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(219124184);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a(TextUtils.indexOf("", "") + 825, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -611683395, false, $$c(b9, b10, (byte) (9 | b10)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                            Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA5 = o.d.d.a(-634864343);
                            if (objA5 == null) {
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                objA5 = o.d.d.a(219 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, 212688716, false, $$c(b11, b12, (byte) ((-1) - (((-1) - b12) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                            int i11 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i11];
                        } else if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i12 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i12];
                            cArr4[hVar.f19926b + 1] = cArr2[i13];
                            int i14 = $10 + 125;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        }
                    }
                    hVar.f19926b += 2;
                }
            }
            int i18 = 0;
            while (i18 < i2) {
                int i19 = $11 + 81;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 16836);
                    i18 += 23;
                } else {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                    i18++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24659i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f24656f = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i4 == 0) {
                return bVar;
            }
            throw null;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f24659i + 101;
            f24656f = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = f24658h;
            if (i4 == 0) {
                return (b[]) bVarArr.clone();
            }
            b[] bVarArr2 = (b[]) bVarArr.clone();
            int i5 = 10 / 0;
            return bVarArr2;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f24656f + 27;
            f24659i = i3 % 128;
            int i4 = i3 % 2;
            String str = this.f24663b;
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
            return str;
        }

        public final Token.Status e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = AnonymousClass4.f24630b[ordinal()];
            if (i3 == 1) {
                Token.Status status = Token.Status.Active;
                int i4 = f24656f + 111;
                f24659i = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 76 / 0;
                }
                return status;
            }
            if (i3 == 2) {
                return Token.Status.Suspended;
            }
            if (i3 == 3) {
                return Token.Status.Inactive;
            }
            if (i3 == 4) {
                int i6 = f24656f + 29;
                f24659i = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            k(KeyEvent.getDeadChar(0, 0) + 18, "\u000f\f\u001b#\u0005\u001a!\u0007\u0018\u000b\r\u000e\u0004\n\u0019\u0018\u0011\r", (byte) ('q' - AndroidCharacter.getMirror('0')), objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }
    }

    public static final class c extends Enum<c> implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final c f24664a;

        /* JADX INFO: renamed from: b */
        public static final c f24665b;

        /* JADX INFO: renamed from: c */
        public static final c f24666c;

        /* JADX INFO: renamed from: d */
        private static c f24667d = null;

        /* JADX INFO: renamed from: e */
        public static final c f24668e;

        /* JADX INFO: renamed from: f */
        private static long f24669f = 0;

        /* JADX INFO: renamed from: h */
        private static final /* synthetic */ c[] f24670h;

        /* JADX INFO: renamed from: i */
        private static long f24671i = 0;

        /* JADX INFO: renamed from: j */
        private static char[] f24672j = null;

        /* JADX INFO: renamed from: k */
        private static int f24673k = 0;

        /* JADX INFO: renamed from: l */
        private static int f24674l = 0;

        /* JADX INFO: renamed from: m */
        private static int f24675m = 0;

        /* JADX INFO: renamed from: n */
        private static int f24676n = 0;

        /* JADX INFO: renamed from: o */
        private static char f24677o = 0;

        /* JADX INFO: renamed from: q */
        private static int f24678q = 0;

        /* JADX INFO: renamed from: g */
        private final String f24679g;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r9, short r10, short r11) {
            /*
                byte[] r8 = o.ep.i.c.$$a
                int r0 = r10 * 3
                int r7 = r0 + 4
                int r0 = r9 * 4
                int r6 = r0 + 1
                int r0 = r11 + 65
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r8 != 0) goto L28
                r3 = r4
                r2 = r7
            L13:
                int r0 = -r0
                int r7 = r7 + r0
                int r2 = r2 + 1
                r1 = r3
            L18:
                int r3 = r1 + 1
                byte r0 = (byte) r7
                r5[r1] = r0
                if (r3 != r6) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r0 = r8[r2]
                goto L13
            L28:
                r1 = r4
                r2 = r7
                r7 = r0
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.c.$$c(int, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24676n = 0;
            f24678q = 1;
            f24674l = 0;
            f24673k = 1;
            d();
            Object[] objArr = new Object[1];
            p((char) (View.MeasureSpec.getSize(0) + 42855), TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 8, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (15856 - TextUtils.indexOf("", "", 0)), Color.red(0) + 8, Color.red(0) + 9, objArr2);
            f24668e = new c(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            p((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - Color.argb(0, 0, 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            p((char) (38361 - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", "", 0) + 26, View.combineMeasuredStates(0, 0) + 10, objArr4);
            f24665b = new c(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            r((char) TextUtils.getCapsMode("", 0, 0), "\udf35ၿ⭓ࢠ咘ჳ㩨탢\udf1b谊", "\u0000\u0000\u0000\u0000", "⌧師鼺搚", AndroidCharacter.getMirror('0') - '0', objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            r((char) (ViewConfiguration.getTouchSlop() >> 8), "ꮅ龥≗脮܂廸骶ꝑ팝憏퉕", "\u0000\u0000\u0000\u0000", "쟷\uf5f1סּͬ", Process.getGidForName("") + 1106637256, objArr6);
            f24666c = new c(strIntern3, 2, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            p((char) (ViewConfiguration.getScrollBarSize() >> 8), 'T' - AndroidCharacter.getMirror('0'), Color.blue(0) + 12, objArr7);
            String strIntern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            p((char) (ImageFormat.getBitsPerPixel(0) + 1), 48 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr8);
            f24664a = new c(strIntern4, 3, ((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            r((char) ((-1) - Process.getGidForName("")), "鮌髬腼ꑢﾸ斶壗ᒴﻴ廎", "\u0000\u0000\u0000\u0000", "嵄ㇻ䱍䁏", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr9);
            String strIntern5 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            p((char) Color.green(0), 61 - Color.blue(0), 12 - View.getDefaultSize(0, 0), objArr10);
            f24667d = new c(strIntern5, 4, ((String) objArr10[0]).intern());
            f24670h = b();
            int i2 = f24676n + 37;
            f24678q = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
        }

        private c(String str, int i2, String str2) {
            super(str, i2);
            this.f24679g = str2;
        }

        private static /* synthetic */ c[] b() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f24673k + 21;
            int i4 = i3 % 128;
            f24674l = i4;
            if (i3 % 2 != 0) {
                cVarArr = new c[3];
                cVarArr[1] = f24668e;
                cVarArr[1] = f24665b;
                cVarArr[4] = f24666c;
                cVarArr[3] = f24664a;
                cVarArr[5] = f24667d;
            } else {
                cVarArr = new c[]{f24668e, f24665b, f24666c, f24664a, f24667d};
            }
            int i5 = i4 + 89;
            f24673k = i5 % 128;
            if (i5 % 2 != 0) {
                return cVarArr;
            }
            throw null;
        }

        static void d() {
            f24672j = new char[]{13268, 21839, 65201, 7, 43352, 12951, 21512, 64842, 43331, 53240, 25606, 39600, 13295, 43023, 52910, 26597, 39947, 38069, 62007, 22985, 42859, 3638, 38341, 62302, 23093, 41435, 284, 26558, 52288, 13026, 39871, 'L', 26360, 53165, 13386, 39672, 38075, 61995, 22997, 42873, 3647, 38354, 62297, 23093, 41422, 3940, 38451, 64968, 38075, 61963, 23029, 42841, 3615, 38386, 62289, 23043, 41443, 3908, 38426, 65017, 23390, 38065, 61972, 23023, 42831, 3601, 38399, 62298, 23067, 41469, 3928, 38423, 64997};
            f24671i = -1925853376361336232L;
            f24669f = 740602047300126166L;
            f24675m = 1564493270;
            f24677o = (char) 10590;
        }

        static void init$0() {
            $$a = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
            $$b = 169;
        }

        private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o oVar = new o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = $11 + 11;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f24672j[i2 + i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 742, (char) TextUtils.indexOf("", ""), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 632508977, false, $$c(b2, b3, (byte) ((b3 + 34) - (34 & b3))), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f24671i), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(765 - ImageFormat.getBitsPerPixel(0), (char) (12470 - Color.argb(0, 0, 0, 0)), MotionEvent.axisFromString("") + 13, 1946853218, false, $$c(b4, b5, (byte) ((b5 + 35) - (35 & b5))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(TextUtils.indexOf("", "") + 387, (char) Color.green(0), ((Process.getThreadPriority(0) + 20) >> 6) + 18, 39570797, false, $$c(b6, b7, (byte) ((b7 + 40) - (40 & b7))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i3];
            oVar.f19947b = 0;
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (oVar.f19947b < i3) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(387 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) + 18, 39570797, false, $$c(b8, b9, (byte) ((b9 + 40) - (40 & b9))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        private static void r(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            int i3 = 2 % 2;
            int i4 = $10 + 15;
            $11 = i4 % 128;
            Object charArray = str6;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str4;
            if (str4 != null) {
                int i5 = $11 + 61;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                    charArray2 = str4.toCharArray();
                } else {
                    charArray2 = str4.toCharArray();
                }
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str5;
            if (str5 != null) {
                int i7 = $11 + 33;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray3 = str5.toCharArray();
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
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 107, (char) Color.argb(0, 0, 0, 0), KeyEvent.keyCodeFromString("") + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 847, (char) (TextUtils.lastIndexOf("", '0', 0) + 6489), 12 - ExpandableListView.getPackedPositionType(0L), -694521287, false, $$c(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(458 - TextUtils.getOffsetAfter("", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 11, 1804962841, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 638, (char) (65100 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 12, 1636969060, false, $$c(b8, b9, (byte) (57 | b9)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f24669f ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24675m) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24677o) ^ 740602047300126166L))));
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

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24673k + 95;
            f24674l = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f24673k + 61;
            f24674l = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f24673k + 125;
            f24674l = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            c[] cVarArr = (c[]) f24670h.clone();
            int i4 = f24673k + 105;
            f24674l = i4 % 128;
            if (i4 % 2 == 0) {
                return cVarArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f24673k;
            int i4 = i3 + 41;
            f24674l = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            String str = this.f24679g;
            int i5 = i3 + 99;
            f24674l = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class d extends Enum<d> implements o.ea.a<Token.Type>, o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final d f24680a;

        /* JADX INFO: renamed from: b */
        public static final d f24681b;

        /* JADX INFO: renamed from: c */
        public static final d f24682c;

        /* JADX INFO: renamed from: d */
        public static final d f24683d;

        /* JADX INFO: renamed from: e */
        public static final d f24684e;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ d[] f24685g;

        /* JADX INFO: renamed from: h */
        private static char f24686h = 0;

        /* JADX INFO: renamed from: i */
        private static long f24687i = 0;

        /* JADX INFO: renamed from: j */
        private static int f24688j = 0;

        /* JADX INFO: renamed from: k */
        private static long f24689k = 0;

        /* JADX INFO: renamed from: l */
        private static int f24690l = 0;

        /* JADX INFO: renamed from: m */
        private static int f24691m = 0;

        /* JADX INFO: renamed from: n */
        private static int f24692n = 0;

        /* JADX INFO: renamed from: o */
        private static int f24693o = 0;

        /* JADX INFO: renamed from: f */
        private final String f24694f;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, byte r10, byte r11) {
            /*
                int r0 = r10 * 3
                int r8 = 3 - r0
                int r0 = r11 * 3
                int r7 = 1 - r0
                byte[] r6 = o.ep.i.d.$$a
                int r5 = r9 + 65
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r6 != 0) goto L28
                r0 = r7
                r2 = r3
            L13:
                int r0 = -r0
                int r5 = r5 + r0
                r1 = r2
            L16:
                int r8 = r8 + 1
                byte r0 = (byte) r5
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r0 = r6[r8]
                goto L13
            L28:
                r1 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.i.d.$$c(byte, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24690l = 0;
            f24693o = 1;
            f24691m = 0;
            f24692n = 1;
            d();
            Object[] objArr = new Object[1];
            q("⡩ᑒ偃鱨\ud87cО䀱谍젷㐢烝볛\uf8d2", (Process.myTid() >> 22) + 15373, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (TextUtils.getTrimmedLength("") + 14149), "ᥭ툢憬\uf005躯뫛\ue488諢䫾썭냽◺챢鮫", "벸㇕⺬冽", "堥鴟䔎ꄷ", KeyEvent.keyCodeFromString(""), objArr2);
            f24681b = new d(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            q("⡲졎\ue871", 57366 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            q("⡲睰陭", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24329, objArr4);
            f24680a = new d(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            p((char) (ViewConfiguration.getScrollBarSize() >> 8), "诤몑䬄旂撠谩뭕驪쿙청", "벸㇕⺬冽", "쑚͑ẗ唅", (-1) - TextUtils.lastIndexOf("", '0', 0), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            p((char) (Process.myPid() >> 22), "\ue222\ued52䌭\udd5f뫓蛙筛\uf044䰰娌瞃潑", "벸㇕⺬冽", "鳃熂ꇨ製", AndroidCharacter.getMirror('0') - '0', objArr6);
            f24683d = new d(strIntern3, 2, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            q("⡫\uf025飣ꂲ䥪ᇞ", 55374 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
            String strIntern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            q("⡫Ꮝ弳骚웪Ɇ", 15270 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
            f24684e = new d(strIntern4, 3, ((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            q("⡵歫긘\ue130ⓜ", 17188 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            String strIntern5 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            q("⡵\ue7dd뜔䝦ᚤ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53171, objArr10);
            f24682c = new d(strIntern5, 4, ((String) objArr10[0]).intern());
            f24685g = b();
            int i2 = f24693o + 107;
            f24690l = i2 % 128;
            int i3 = i2 % 2;
        }

        private d(String str, int i2, String str2) {
            super(str, i2);
            this.f24694f = str2;
        }

        private static /* synthetic */ d[] b() {
            int i2 = 2 % 2;
            int i3 = f24691m + 47;
            int i4 = i3 % 128;
            f24692n = i4;
            int i5 = i3 % 2;
            d[] dVarArr = {f24681b, f24680a, f24683d, f24684e, f24682c};
            int i6 = i4 + 11;
            f24691m = i6 % 128;
            if (i6 % 2 == 0) {
                return dVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void d() {
            f24687i = 6627621962503289198L;
            f24688j = 1564493270;
            f24686h = (char) 17878;
            f24689k = -3460050619988564619L;
        }

        static void init$0() {
            $$a = new byte[]{80, 70, 7, 82};
            $$b = 63;
        }

        private static void p(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            int i4 = $11 + 11;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            Object charArray = str6;
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object obj = str5;
            if (str5 != null) {
                int i6 = $11 + 51;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char[] charArray2 = str5.toCharArray();
                int i8 = $10 + 91;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                obj = charArray2;
            }
            char[] cArr2 = (char[]) obj;
            Object obj2 = null;
            Object charArray3 = str4;
            if (str4 != null) {
                int i10 = $11 + 71;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    str4.toCharArray();
                    obj2.hashCode();
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
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(106 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj2, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 848;
                        char c3 = (char) (6488 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 12;
                        byte b4 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                        byte b5 = (byte) (b4 - 3);
                        objA2 = o.d.d.a(i11, c3, offsetBefore, -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 459;
                        char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i12 = 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 1)));
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(packedPositionChild, c4, i12, 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        objA4 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 639, (char) (65100 - TextUtils.getOffsetAfter("", 0)), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1636969060, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 249))), b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    obj2 = null;
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f24687i ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24688j) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24686h) ^ 740602047300126166L))));
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

        private static void q(String str, int i2, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $11 + 113;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                char[] charArray = str2.toCharArray();
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            char[] cArr = (char[]) obj;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        int edgeSlop = 731 - (ViewConfiguration.getEdgeSlop() >> 16);
                        char packedPositionType = (char) (7933 - ExpandableListView.getPackedPositionType(0L));
                        int iArgb = 11 - Color.argb(0, 0, 0, 0);
                        int i11 = $$b;
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(edgeSlop, packedPositionType, iArgb, 355847088, false, $$c((byte) ((i11 + 6) - (i11 | 6)), b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f24689k ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(836 - Color.green(0), (char) (27327 - AndroidCharacter.getMirror('0')), 11 - TextUtils.indexOf("", ""), -2145994442, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 13))), b3, b3), new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            int i12 = $11 + 71;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 835, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27279), 10 - TextUtils.lastIndexOf("", '0'), -2145994442, false, $$c((byte) ((-1) - (((-1) - $$b) | ((-1) - 13))), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24692n + 5;
            f24691m = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            if (i4 == 0) {
                return dVar;
            }
            throw null;
        }

        public static d[] values() {
            int i2 = 2 % 2;
            int i3 = f24691m + 7;
            f24692n = i3 % 128;
            int i4 = i3 % 2;
            d[] dVarArr = (d[]) f24685g.clone();
            int i5 = f24691m + 121;
            f24692n = i5 % 128;
            int i6 = i5 % 2;
            return dVarArr;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f24692n + 47;
            f24691m = i3 % 128;
            int i4 = i3 % 2;
            String str = this.f24694f;
            if (i4 != 0) {
                int i5 = 84 / 0;
            }
            return str;
        }

        public final Token.Type c() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24692n + 1;
            f24691m = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass4.f24632d[ordinal()];
            if (i5 == 1) {
                Token.Type type = Token.Type.SecureElement;
                int i6 = f24691m + 97;
                f24692n = i6 % 128;
                int i7 = i6 % 2;
                return type;
            }
            if (i5 == 2) {
                return Token.Type.Hce;
            }
            if (i5 == 3) {
                Token.Type type2 = Token.Type.CardOnFile;
                int i8 = f24691m + 27;
                f24692n = i8 % 128;
                int i9 = i8 % 2;
                return type2;
            }
            if (i5 == 4) {
                return Token.Type.QRCode;
            }
            if (i5 == 5) {
                return Token.Type.Other;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            p((char) (59590 - TextUtils.lastIndexOf("", '0', 0)), "䇬랐ෘ牬襢罨돬䬺더ᕹ폫㩹銚䘺犩祻Ź鈂", "벸㇕⺬冽", "発畋잸狨", ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
        }

        @Override // o.ea.a
        public final /* synthetic */ Token.Type e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24691m + 29;
            f24692n = i3 % 128;
            int i4 = i3 % 2;
            Token.Type typeC = c();
            int i5 = f24692n + 121;
            f24691m = i5 % 128;
            if (i5 % 2 == 0) {
                return typeC;
            }
            throw null;
        }
    }

    public i(a aVar, String str, String str2, String str3, String str4, String str5, o.dx.c cVar, c cVar2, d dVar, b bVar, Long l2, String str6, String str7) {
        this.f24602q = aVar;
        this.f24604v = str;
        this.f24605w = str2;
        this.f24607y = str3;
        this.f24603u = str4;
        this.f24606x = str5;
        this.A = cVar;
        this.f24608z = cVar2;
        this.B = dVar;
        this.C = bVar;
        this.D = l2;
        this.F = str6;
        this.E = str7;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws WalletValidationException {
        i iVar = (i) objArr[0];
        o.er.i iVar2 = (o.er.i) objArr[1];
        o.ep.d dVar = (o.ep.d) objArr[2];
        Context context = (Context) objArr[3];
        OperationCallback operationCallback = (OperationCallback) objArr[4];
        int i2 = 2 % 2;
        int iMyTid = Process.myTid();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        ((o.y.i) d(Process.myTid(), -800061734, iMyTid, Process.myPid(), i3, new Object[]{iVar, iVar2, dVar}, 800061744)).a(context, new o.x.f() { // from class: o.ep.i.5

            /* JADX INFO: renamed from: a */
            public static int f24634a = 1855156858;

            /* JADX INFO: renamed from: b */
            public static int f24635b = 2083978435;

            /* JADX INFO: renamed from: c */
            public static int f24636c = -810863716;

            /* JADX INFO: renamed from: d */
            public static int f24637d = -1036600459;

            /* JADX INFO: renamed from: e */
            public static int f24638e = -1236159993;

            /* JADX INFO: renamed from: f */
            private static int f24639f = 0;

            /* JADX INFO: renamed from: h */
            private static int f24640h = 1;

            /* JADX INFO: renamed from: i */
            private /* synthetic */ OperationCallback f24642i;

            AnonymousClass5(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            public static /* synthetic */ Object c(int i22, int i32, int i4, int i5, int i6, int i7, Object[] objArr2) {
                int i8 = ~i5;
                int i9 = ~((i8 + i22) - (i8 & i22));
                int i10 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
                int i11 = ~i22;
                int i12 = ~i7;
                int i13 = (-1) - (((-1) - i11) & ((-1) - i12));
                int i14 = ((i10 + i9) - (i10 & i9)) | (~((i13 + i5) - (i13 & i5)));
                int i15 = ~((-1) - (((-1) - ((-1) - (((-1) - i8) & ((-1) - i11)))) & ((-1) - i12)));
                int i16 = (i11 + i5) - (i11 & i5);
                int i17 = (-1) - (((-1) - (~((-1) - (((-1) - i7) & ((-1) - i16))))) & ((-1) - i15));
                int i18 = ~i16;
                int i19 = (i18 + i9) - (i18 & i9);
                int i20 = i5 + i22 + i4 + ((-327997910) * i32) + ((-604038433) * i6);
                int i21 = i20 * i20;
                int i222 = ((i5 * 234895570) - 128974848) + (234895570 * i22) + (i14 * 695176798) + (695176798 * i17) + ((-347588399) * i19) + (582483968 * i4) + (36700160 * i32) + ((-297271296) * i6) + (1302134784 * i21);
                int i23 = (i5 * (-238133666)) + 182491156 + (i22 * (-238133666)) + (i14 * (-1294)) + (i17 * (-1294)) + (i19 * IptcDirectory.TAG_LANGUAGE_IDENTIFIER) + (i4 * (-238134313)) + (i32 * (-1022231738)) + (i6 * 4118089) + (i21 * (-35979264));
                int i24 = i222 + (i23 * i23 * 1404239872);
                if (i24 == 1) {
                    int i25 = 2 % 2;
                    int i26 = f24640h;
                    int i27 = (i26 & 43) + ((-1) - (((-1) - i26) & ((-1) - 43)));
                    f24639f = i27 % 128;
                    int i28 = i27 % 2;
                } else if (i24 != 2) {
                    AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr2[0];
                    o.by.c cVar = (o.by.c) objArr2[1];
                    int i29 = 2 % 2;
                    int i30 = f24640h;
                    int i31 = ((i30 + 97) - (97 | i30)) + (i30 | 97);
                    f24639f = i31 % 128;
                    int i322 = i31 % 2;
                    operationCallback.onError(cVar.a());
                    int i33 = f24639f;
                    int i34 = (((i33 + 11) - (11 & i33)) << 1) - (i33 ^ 11);
                    f24640h = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    AnonymousClass5 anonymousClass52 = (AnonymousClass5) objArr2[0];
                    int i36 = 2 % 2;
                    int i37 = f24640h;
                    int i38 = ((41 | i37) << 1) - (i37 ^ 41);
                    f24639f = i38 % 128;
                    int i39 = i38 % 2;
                    operationCallback.onSuccess(null);
                    int i40 = f24639f;
                    int i41 = (i40 & 27) + ((i40 + 27) - (i40 & 27));
                    f24640h = i41 % 128;
                    int i42 = i41 % 2;
                }
                return null;
            }

            @Override // o.x.f
            public final void onAuthenticationDeclined() {
                int i22 = 2 % 2;
                int i32 = f24640h;
                int i4 = ((41 | i32) << 1) - (i32 ^ 41);
                f24639f = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // o.x.f
            public final void onCustomerCredentialsInvalid(o.j.b bVar) {
                int id = (int) Thread.currentThread().getId();
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i22 = f24635b * (-96147231);
                f24635b = i22;
                c(452361034, i22, iFreeMemory, -452361033, (int) SystemClock.uptimeMillis(), id, new Object[]{this, bVar});
            }

            @Override // o.x.f
            public final void onCustomerCredentialsRequired(List<o.m.h> list) {
                int i22 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i32 = f24639f + 125;
                f24640h = i32 % 128;
                if (i32 % 2 == 0) {
                    int i4 = 52 / 0;
                }
            }

            @Override // o.x.f
            public final void onError(o.by.c cVar) {
                int i22 = f24636c * (-1399543051);
                f24636c = i22;
                int iActiveCount = Thread.activeCount();
                int i32 = f24638e * (-1894928727);
                f24638e = i32;
                c(-1560875225, i32, iActiveCount, 1560875225, new Random().nextInt(2051566442), i22, new Object[]{this, cVar});
            }

            @Override // o.x.f
            public final void onProcessStart() {
                int i22 = 2 % 2;
                int i32 = f24639f;
                int i4 = (((i32 + 103) - (103 & i32)) << 1) - (i32 ^ 103);
                f24640h = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 36 / 0;
                }
            }

            @Override // o.x.f
            public final void onProcessSuccess() {
                int iNextInt = new Random().nextInt(596598826);
                int i22 = f24637d * (-1351303762);
                f24637d = i22;
                int iMyTid2 = Process.myTid();
                int i32 = f24634a * (-800977605);
                f24634a = i32;
                c(390075205, iMyTid2, i22, -390075203, i32, iNextInt, new Object[]{this});
            }
        });
        int i4 = G;
        int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
        H = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 85))) + ((i3 + 85) - (i3 & 85));
        G = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
            if (iVar.A == null) {
                return null;
            }
        } else if (iVar.A == null) {
            return null;
        }
        String strB = iVar.A.b().b();
        int i6 = H + 47;
        G = i6 % 128;
        int i7 = i6 % 2;
        return strB;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        i iVar = (i) objArr[0];
        b bVar = (b) objArr[1];
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = ((i3 + 21) - (21 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 21)));
        H = i4 % 128;
        int i5 = i4 % 2;
        iVar.C = bVar;
        int i6 = i3 + 101;
        H = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i7;
        int i9 = ~i3;
        int i10 = ~i4;
        int i11 = ~((-1) - (((-1) - i9) & ((-1) - i10)));
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~((i3 + i7) - (i3 & i7));
        int i14 = i4 | i13;
        int i15 = (~(i4 | i7)) | (~((-1) - (((-1) - (i8 | i9)) & ((-1) - i10)))) | i13 | (~((-1) - (((-1) - i3) & ((-1) - i4))));
        int i16 = i3 + i7 + i6 + (1272450877 * i2) + ((-51365948) * i5);
        int i17 = i16 * i16;
        int i18 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i7) + ((-1175803474) * i12) + (i14 * 587901737) + (587901737 * i15) + ((-849346560) * i6) + ((-1881145344) * i2) + ((-578813952) * i5) + ((-124846080) * i17);
        int i19 = (i3 * 1187242746) + 1002376400 + (i7 * 1187242392) + (i12 * (-354)) + (i14 * 177) + (i15 * 177) + (i6 * 1187242569) + (i2 * (-1484311963)) + (i5 * 1141305060) + (i17 * 516358144);
        switch (i18 + (i19 * i19 * (-861863936))) {
            case 1:
                return d(objArr);
            case 2:
                return a(objArr);
            case 3:
                return e(objArr);
            case 4:
                i iVar = (i) objArr[0];
                o.er.i iVar2 = (o.er.i) objArr[1];
                int i20 = 2 % 2;
                k kVar = new k(iVar2.c(), (o.ep.d) objArr[2], iVar);
                int i21 = H + 65;
                G = i21 % 128;
                int i22 = i21 % 2;
                return kVar;
            case 5:
                i iVar3 = (i) objArr[0];
                int i23 = 2 % 2;
                int i24 = H;
                int i25 = (((-1) - (((-1) - i24) & ((-1) - 27))) << 1) - (i24 ^ 27);
                int i26 = i25 % 128;
                G = i26;
                int i27 = i25 % 2;
                c cVar = iVar3.f24608z;
                int i28 = (((-1) - (((-1) - i26) & ((-1) - 51))) << 1) - (i26 ^ 51);
                H = i28 % 128;
                int i29 = i28 % 2;
                return cVar;
            case 6:
                return b(objArr);
            case 7:
                return f(objArr);
            case 8:
                return i(objArr);
            case 9:
                return h(objArr);
            case 10:
                i iVar4 = (i) objArr[0];
                o.er.i iVar5 = (o.er.i) objArr[1];
                int i30 = 2 % 2;
                o.y.i iVar6 = new o.y.i(iVar5.c(), (o.ep.d) objArr[2], iVar4);
                System.identityHashCode(iVar4);
                System.identityHashCode(iVar4);
                return iVar6;
            default:
                return c(objArr);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 123;
        H = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        Long l2 = iVar.D;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 69;
        H = i6 % 128;
        if (i6 % 2 == 0) {
            return l2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = (i3 ^ 121) + (((i3 + 121) - (121 | i3)) << 1);
        G = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        String str = iVar.f24607y;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 73;
        G = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = H + 1;
        G = i3 % 128;
        int i4 = i3 % 2;
        String str = iVar.f24604v;
        if (i4 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = (i3 ^ 43) + ((43 & i3) << 1);
        G = i4 % 128;
        int i5 = i4 % 2;
        d dVar = iVar.B;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 9;
        G = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return dVar;
    }

    private static /* synthetic */ Object i(Object[] objArr) throws WalletValidationException {
        i iVar = (i) objArr[0];
        o.er.i iVar2 = (o.er.i) objArr[1];
        o.ep.d dVar = (o.ep.d) objArr[2];
        int i2 = 2 % 2;
        iVar.b(iVar2, dVar).c((Context) objArr[3], new o.x.f() { // from class: o.ep.i.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b */
            private static boolean f24609b = false;

            /* JADX INFO: renamed from: c */
            private static char[] f24610c = null;

            /* JADX INFO: renamed from: e */
            private static int f24611e = 0;

            /* JADX INFO: renamed from: f */
            public static int f24612f = 0;

            /* JADX INFO: renamed from: g */
            private static int f24613g = 0;

            /* JADX INFO: renamed from: h */
            public static int f24614h = 0;

            /* JADX INFO: renamed from: i */
            private static int f24615i = 0;

            /* JADX INFO: renamed from: j */
            private static boolean f24616j = false;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ OperationCallback f24617a;

            private static String $$e(int v2, byte v3, short v4) {
                /*
                    int r0 = r7 * 3
                    int r7 = 3 - r0
                    int r2 = r8 * 3
                    int r1 = 1 - r2
                    int r0 = r9 * 6
                    int r0 = r0 + 67
                    byte[] r6 = o.ep.i.AnonymousClass1.$$c
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L2b
                    r2 = r7
                    r0 = r3
                    r1 = r4
                L18:
                    int r7 = r7 + r0
                L19:
                    byte r0 = (byte) r7
                    int r2 = r2 + 1
                    r5[r1] = r0
                    if (r1 != r3) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L26:
                    int r1 = r1 + 1
                    r0 = r6[r2]
                    goto L18
                L2b:
                    r1 = r4
                    r2 = r7
                    r7 = r0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.$$e(int, byte, short):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f24614h = 564309919;
                f24612f = 1026773184;
                init$0();
                f24613g = 0;
                f24615i = 1;
                f24610c = new char[]{2170, 2144, 2449, 2174, 2163, 2158, 2172, 2147, 2448, 2148, 2151, 2160, 2145, 2161, 2156, 2162, 2463, 2471, 2468, 2154, 2168, 2169, 2164, 2149, 2175, 2466};
                f24611e = 2040400341;
                f24609b = true;
                f24616j = true;
            }

            AnonymousClass1(OperationCallback operationCallback) {
                operationCallback = operationCallback;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:124|189|125|(4:127|177|128|(7:130|188|137|(5:139|186|140|141|146)(1:145)|(7:176|148|(1:150)(7:151|184|152|153|(1:159)(1:165)|160|(2:163|164))|157|(0)(0)|160|(2:163|164))|166|167)(1:131))(1:135)|136|188|137|(0)(0)|(0)|166|167) */
            /* JADX WARN: Removed duplicated region for block: B:139:0x0406 A[Catch: Exception -> 0x0443, TRY_LEAVE, TryCatch #6 {Exception -> 0x0443, blocks: (B:137:0x03e3, B:139:0x0406, B:141:0x0434, B:143:0x043c, B:144:0x0442, B:140:0x0410), top: B:188:0x03e3, inners: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:145:0x0443  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x04b3  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x0512  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0451 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] c(int r23, int r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1437
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.c(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{60, -92, 19, MessagePack.Code.MAP16};
                $$b = 41;
            }

            static void init$1() {
                $$c = new byte[]{113, 10, 2, -109};
                $$d = 255;
            }

            private static void k(int i22, String str, int[] iArr, String str2, Object[] objArr2) throws Throwable {
                String str3 = str;
                String str4 = str2;
                int i3 = 2 % 2;
                Object bytes = str4;
                if (str4 != null) {
                    int i4 = $10 + 81;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    bytes = str4.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object obj = str3;
                if (str3 != null) {
                    char[] charArray = str3.toCharArray();
                    int i6 = $11 + 83;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    obj = charArray;
                }
                char[] cArr = (char[]) obj;
                o.a.f fVar = new o.a.f();
                char[] cArr2 = f24610c;
                char c2 = '0';
                int i8 = 0;
                if (cArr2 != null) {
                    int i9 = $11 + 31;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr22 = {Integer.valueOf(cArr2[i11])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) i8;
                                byte b3 = b2;
                                objA = o.d.d.a(Gravity.getAbsoluteGravity(i8, i8) + 593, (char) (TextUtils.lastIndexOf("", c2, i8, i8) + 13182), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i11] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                            i11++;
                            c2 = '0';
                            i8 = 0;
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
                Object[] objArr3 = {Integer.valueOf(f24611e)};
                Object objA2 = o.d.d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = o.d.d.a(View.combineMeasuredStates(0, 0) + 32, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                if (f24616j) {
                    fVar.f19923e = bArr.length;
                    char[] cArr4 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i22] - iIntValue);
                        Object[] objArr4 = {fVar, fVar};
                        Object objA3 = o.d.d.a(1540807955);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA3 = o.d.d.a(AndroidCharacter.getMirror('0') + 410, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0) + 11, -1923924106, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    }
                    objArr2[0] = new String(cArr4);
                    return;
                }
                if (f24609b) {
                    int i12 = $10 + 59;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    fVar.f19923e = cArr.length;
                    char[] cArr5 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        int i14 = $11 + 5;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                        Object[] objArr5 = {fVar, fVar};
                        Object objA4 = o.d.d.a(1540807955);
                        if (objA4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA4 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 458, (char) View.resolveSizeAndState(0, 0, 0), 11 - TextUtils.getTrimmedLength(""), -1923924106, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    objArr2[0] = new String(cArr5);
                    return;
                }
                int i16 = 0;
                fVar.f19923e = iArr.length;
                char[] cArr6 = new char[fVar.f19923e];
                while (true) {
                    fVar.f19922a = i16;
                    if (fVar.f19922a >= fVar.f19923e) {
                        objArr2[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                        i16 = fVar.f19922a + 1;
                    }
                }
            }

            private static void l(short v2, short v3, short v4, Object[] v5) {
                /*
                    int r0 = r8 * 2
                    int r0 = r0 + 4
                    byte[] r8 = o.ep.i.AnonymousClass1.$$a
                    int r3 = r7 * 3
                    int r2 = 1 - r3
                    int r1 = r9 * 3
                    int r7 = 100 - r1
                    byte[] r6 = new byte[r2]
                    r5 = 0
                    int r4 = 0 - r3
                    if (r8 != 0) goto L30
                    r3 = r5
                    r2 = r0
                L17:
                    int r1 = -r0
                    int r0 = r2 + 1
                    int r1 = r1 + r7
                    r7 = r1
                L1c:
                    byte r1 = (byte) r7
                    r6[r3] = r1
                    if (r3 != r4) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r10[r5] = r0
                    return
                L29:
                    int r3 = r3 + 1
                    r1 = r8[r0]
                    r2 = r0
                    r0 = r1
                    goto L17
                L30:
                    r3 = r5
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass1.l(short, short, short, java.lang.Object[]):void");
            }

            @Override // o.x.f
            public void onAuthenticationDeclined() {
                int i22 = 2 % 2;
                int i3 = f24615i + 35;
                f24613g = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // o.x.f
            public void onCustomerCredentialsInvalid(o.j.b bVar) {
                int i22 = 2 % 2;
                int i3 = f24615i + 125;
                f24613g = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 53 / 0;
                }
            }

            @Override // o.x.f
            public void onCustomerCredentialsRequired(List<o.m.h> list) {
                int i22 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i3 = f24615i + 93;
                f24613g = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // o.x.f
            public void onError(o.by.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24613g + 25;
                f24615i = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    operationCallback.onError(cVar.a());
                    obj.hashCode();
                    throw null;
                }
                operationCallback.onError(cVar.a());
                int i4 = f24613g + 111;
                f24615i = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override // o.x.f
            public void onProcessStart() {
                int i22 = 2 % 2;
                int i3 = f24615i + 27;
                f24613g = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override // o.x.f
            public void onProcessSuccess() {
                int i22 = 2 % 2;
                int i3 = f24613g + 105;
                f24615i = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    operationCallback.onSuccess(null);
                } else {
                    operationCallback.onSuccess(null);
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i3 = H;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 75))) << 1) - (i3 ^ 75);
        G = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return null;
    }

    public final String a() {
        int iNextInt = new Random().nextInt();
        int i2 = f24592j * 1317344399;
        f24592j = i2;
        int i3 = f24588f * (-400471327);
        f24588f = i3;
        int i4 = (-1076688547) * f24590h;
        f24590h = i4;
        return (String) d(i3, 1600156906, iNextInt, i4, i2, new Object[]{this}, -1600156903);
    }

    public final void a(o.er.i iVar, o.ep.d dVar, Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        int id = (int) Thread.currentThread().getId();
        int iNextInt = new Random().nextInt(981660771);
        ((k) d((int) SystemClock.uptimeMillis(), 460938540, id, Thread.activeCount(), iNextInt, new Object[]{this, iVar, dVar}, -460938536)).e(context, new o.x.f() { // from class: o.ep.i.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a */
            private static int f24619a = 0;

            /* JADX INFO: renamed from: b */
            private static int f24620b = 0;

            /* JADX INFO: renamed from: c */
            private static int f24621c = 0;

            /* JADX INFO: renamed from: f */
            private static short[] f24622f = null;

            /* JADX INFO: renamed from: g */
            private static byte[] f24623g = null;

            /* JADX INFO: renamed from: h */
            private static int f24624h = 0;

            /* JADX INFO: renamed from: i */
            public static int f24625i = 0;

            /* JADX INFO: renamed from: j */
            private static int f24626j = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ OperationCallback f24628e;

            private static String $$g(int v2, short v3, int v4) {
                /*
                    int r8 = r11 + 4
                    byte[] r7 = o.ep.i.AnonymousClass2.$$c
                    int r6 = r10 * 4
                    int r1 = r6 + 1
                    int r0 = r9 + 103
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r7 != 0) goto L29
                    r1 = r6
                    r2 = r8
                    r3 = r4
                L12:
                    int r0 = -r1
                    int r8 = r8 + r0
                    r0 = r8
                    r8 = r2
                L16:
                    int r2 = r8 + 1
                    byte r1 = (byte) r0
                    r5[r3] = r1
                    if (r3 != r6) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L23:
                    r1 = r7[r2]
                    int r3 = r3 + 1
                    r8 = r0
                    goto L12
                L29:
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.$$g(int, short, int):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                f24625i = 2076948859;
                init$0();
                f24626j = 0;
                f24624h = 1;
                f24621c = 1580645682;
                f24619a = 1150422483;
                f24620b = -569771090;
                f24623g = new byte[]{-92, MessagePack.Code.FIXSTR_PREFIX, -81, -123, MessagePack.Code.FALSE, -92, -67, -83, -74, 114, 113, -9, MessagePack.Code.FIXARRAY_PREFIX, 109, -26, -73, -74, -71, -86, -94, -87, Ascii.RS, -22, Ascii.ESC, -18, -19, 2, -11, -16, 1, Ascii.DC4, -27, MessagePack.Code.INT16, Ascii.ESC, -23, -85, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.FIXARRAY_PREFIX, -75, -119, -116, -18, -72, -92, -68, 113, -28, MessagePack.Code.FLOAT32, -100, -66, MessagePack.Code.INT64, MessagePack.Code.EXT8, -2, -91, MessagePack.Code.EXT8, -4, -21, -103, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT2, MessagePack.Code.EXT8, MessagePack.Code.INT8, MessagePack.Code.STR32, MessagePack.Code.INT64, MessagePack.Code.BIN16, -115, -115, -115, -115};
            }

            AnonymousClass2(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            static void init$0() {
                $$a = new byte[]{7, -110, 9, 72};
                $$b = 109;
            }

            static void init$1() {
                $$d = new byte[]{3, 32, 122, 114, 64, MessagePack.Code.EXT16, -14, 67, -66};
                $$e = 63;
            }

            static void init$2() {
                $$c = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
                $$f = 220;
            }

            private static void k(int v2, short v3, int v4, Object[] v5) {
                /*
                    int r0 = r8 * 5
                    int r8 = 106 - r0
                    int r2 = r7 * 3
                    int r1 = 1 - r2
                    byte[] r7 = o.ep.i.AnonymousClass2.$$a
                    int r0 = r9 * 4
                    int r6 = 4 - r0
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r7 != 0) goto L2f
                    r0 = r6
                    r2 = r4
                L17:
                    int r8 = r8 + r6
                    int r6 = r0 + 1
                L1a:
                    byte r0 = (byte) r8
                    r5[r2] = r0
                    if (r2 != r3) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r10[r4] = r0
                    return
                L27:
                    int r2 = r2 + 1
                    r1 = r7[r6]
                    r0 = r6
                    r6 = r8
                    r8 = r1
                    goto L17
                L2f:
                    r2 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.k(int, short, int, java.lang.Object[]):void");
            }

            private static void l(short s2, int i22, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
                long j2;
                int i5;
                boolean z2;
                int i6;
                int i7;
                int i8 = 2 % 2;
                j jVar = new j();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24619a)};
                    Object objA = o.d.d.a(-727631768);
                    if (objA == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objA = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 238, (char) (44531 - (Process.myTid() >> 22)), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 35969549, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    boolean z3 = iIntValue == -1;
                    float f2 = 0.0f;
                    if (z3) {
                        byte[] bArr = f24623g;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    int trimmedLength = TextUtils.getTrimmedLength("") + IptcDirectory.TAG_COPYRIGHT_NOTICE;
                                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28649);
                                    int i10 = (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1)) + 11;
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objA2 = o.d.d.a(trimmedLength, keyRepeatDelay, i10, 1621469864, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                                i9++;
                                f2 = 0.0f;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i11 = $11 + 49;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                byte[] bArr3 = f24623g;
                                Object[] objArr4 = {Integer.valueOf(i22), Integer.valueOf(f24621c)};
                                Object objA3 = o.d.d.a(-727631768);
                                if (objA3 == null) {
                                    byte b7 = (byte) 1;
                                    byte b8 = (byte) (b7 - 1);
                                    objA3 = o.d.d.a(238 - TextUtils.getCapsMode("", 0, 0), (char) (44531 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 35969549, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                long j3 = f24619a;
                                i7 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) * (-7649639543924978291L))) * ((int) ((j3 - 7649639543924978291L) - (j3 & (-7649639543924978291L))));
                            } else {
                                byte[] bArr4 = f24623g;
                                Object[] objArr5 = {Integer.valueOf(i22), Integer.valueOf(f24621c)};
                                Object objA4 = o.d.d.a(-727631768);
                                if (objA4 == null) {
                                    byte b9 = (byte) 1;
                                    byte b10 = (byte) (b9 - 1);
                                    objA4 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 237, (char) (TextUtils.indexOf((CharSequence) "", '0') + 44532), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, 35969549, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i7 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24619a) ^ (-7649639543924978291L)));
                            }
                            iIntValue = (byte) i7;
                            j2 = -7649639543924978291L;
                        } else {
                            j2 = -7649639543924978291L;
                            iIntValue = (short) (((short) (((long) f24622f[i22 + ((int) (((long) f24621c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24619a) ^ (-7649639543924978291L))));
                        }
                    } else {
                        j2 = -7649639543924978291L;
                    }
                    if (iIntValue > 0) {
                        int i12 = ((i22 + iIntValue) - 2) + ((int) (((long) f24621c) ^ j2));
                        if (z3) {
                            i5 = 1;
                        } else {
                            int i13 = $10 + 53;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            i5 = 0;
                        }
                        jVar.f19936d = i12 + i5;
                        Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24620b), sb};
                        Object objA5 = o.d.d.a(1819197256);
                        if (objA5 == null) {
                            objA5 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (5358 - TextUtils.getTrimmedLength("")), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        byte[] bArr5 = f24623g;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            for (int i15 = 0; i15 < length2; i15++) {
                                bArr6[i15] = (byte) (((long) bArr5[i15]) ^ (-7649639543924978291L));
                            }
                            bArr5 = bArr6;
                        }
                        if (bArr5 != null) {
                            int i16 = $11 + 15;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jVar.f19934b = 1;
                        while (jVar.f19934b < iIntValue) {
                            if (z2) {
                                int i18 = $11 + 85;
                                $10 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    byte[] bArr7 = f24623g;
                                    jVar.f19936d = jVar.f19936d;
                                    i6 = jVar.f19935c - (((byte) (((byte) (((long) bArr7[r1]) % (-7649639543924978291L))) % s2)) ^ b2);
                                } else {
                                    byte[] bArr8 = f24623g;
                                    jVar.f19936d = jVar.f19936d - 1;
                                    i6 = jVar.f19935c + (((byte) (((byte) (((long) bArr8[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2);
                                }
                                jVar.f19937e = (char) i6;
                            } else {
                                short[] sArr = f24622f;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            }
                            sb.append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            jVar.f19934b++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            private static void m(byte v2, int v3, short v4, Object[] v5) {
                /*
                    int r0 = r7 * 10
                    int r7 = r0 + 101
                    int r0 = r9 * 5
                    int r6 = r0 + 4
                    byte[] r5 = o.ep.i.AnonymousClass2.$$d
                    int r1 = r8 * 5
                    int r0 = 6 - r1
                    byte[] r4 = new byte[r0]
                    int r3 = 5 - r1
                    r2 = 0
                    if (r5 != 0) goto L30
                    r0 = r3
                    r7 = r6
                    r1 = r2
                L18:
                    int r6 = r6 + 1
                    int r0 = -r0
                    int r7 = r7 + r0
                    int r7 = r7 + (-1)
                L1e:
                    byte r0 = (byte) r7
                    r4[r1] = r0
                    if (r1 != r3) goto L2b
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r2)
                    r10[r2] = r0
                    return
                L2b:
                    int r1 = r1 + 1
                    r0 = r5[r6]
                    goto L18
                L30:
                    r1 = r2
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.m(byte, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:58:0x0234  */
            @Override // o.x.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onAuthenticationDeclined() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1109
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.i.AnonymousClass2.onAuthenticationDeclined():void");
            }

            @Override // o.x.f
            public final void onCustomerCredentialsInvalid(o.j.b bVar) {
                int i22 = 2 % 2;
                int i3 = f24624h + 25;
                f24626j = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.x.f
            public final void onCustomerCredentialsRequired(List<o.m.h> list) {
                int i22 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i3 = f24626j + 89;
                f24624h = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // o.x.f
            public final void onError(o.by.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24624h + 67;
                f24626j = i3 % 128;
                int i4 = i3 % 2;
                operationCallback.onError(cVar.a());
                int i5 = f24624h + 33;
                f24626j = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // o.x.f
            public final void onProcessStart() {
                int i22 = 2 % 2;
                int i3 = f24626j + 121;
                f24624h = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 31 / 0;
                }
            }

            @Override // o.x.f
            public final void onProcessSuccess() {
                int i22 = 2 % 2;
                int i3 = f24626j + 31;
                f24624h = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    operationCallback.onSuccess(null);
                } else {
                    operationCallback.onSuccess(null);
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i3 = H;
        int i4 = ((115 | i3) << 1) - (i3 ^ 115);
        G = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public final String b() {
        int iNextInt = new Random().nextInt(829335317);
        int i2 = f24595m * 1091325868;
        f24595m = i2;
        return (String) d((int) Runtime.getRuntime().freeMemory(), -2118374406, iNextInt, Thread.currentThread().getPriority(), i2, new Object[]{this}, 2118374413);
    }

    public final l b(o.er.i iVar, o.ep.d dVar) {
        int i2 = 2 % 2;
        l lVar = new l(iVar.b(), iVar.c(), dVar, this);
        int i3 = H + 59;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            return lVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void b(b bVar) {
        int i2 = f24585c * 37294137;
        f24585c = i2;
        int i3 = f24586d * (-1870870753);
        f24586d = i3;
        d((int) Process.getElapsedCpuTime(), 427626745, i2, Process.myUid(), i3, new Object[]{this, bVar}, -427626745);
    }

    public final Drawable c(Context context) {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = (((i3 + 61) - (61 & i3)) << 1) - (i3 ^ 61);
        G = i4 % 128;
        int i5 = i4 % 2;
        o.dx.c cVar = this.A;
        if (cVar == null) {
            int i6 = i3 + 111;
            G = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = (i3 ^ 43) + (((-1) - (((-1) - i3) | ((-1) - 43))) << 1);
        G = i8 % 128;
        int i9 = i8 % 2;
        Drawable drawableE = cVar.e(context);
        int i10 = H + 37;
        G = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 11 / 0;
        }
        return drawableE;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = G + 41;
        H = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f24605w;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final a d() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 59;
        H = i4 % 128;
        int i5 = i4 % 2;
        a aVar = this.f24602q;
        int i6 = (i3 ^ 99) + ((i3 & 99) << 1);
        H = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    public final o.y.i d(o.er.i iVar, o.ep.d dVar) {
        int iMyTid = Process.myTid();
        int i2 = (int) Runtime.getRuntime().totalMemory();
        return (o.y.i) d(Process.myTid(), -800061734, iMyTid, Process.myPid(), i2, new Object[]{this, iVar, dVar}, 800061744);
    }

    public final void d(o.er.i iVar, o.ep.d dVar, Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int iActiveCount = Thread.activeCount();
        int i2 = f24593k * 128340111;
        f24593k = i2;
        int i3 = f24601t * 1405276525;
        f24601t = i3;
        d(i3, 972375778, iActiveCount, (int) Runtime.getRuntime().maxMemory(), i2, new Object[]{this, iVar, dVar, context, operationCallback}, -972375770);
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = ((i3 + 89) - (89 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 89)));
        int i5 = i4 % 128;
        H = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.f24603u;
        int i6 = (((-1) - (((-1) - i5) & ((-1) - 3))) << 1) - (i5 ^ 3);
        G = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final k e(o.er.i iVar, o.ep.d dVar) {
        int id = (int) Thread.currentThread().getId();
        int iNextInt = new Random().nextInt(981660771);
        return (k) d((int) SystemClock.uptimeMillis(), 460938540, id, Thread.activeCount(), iNextInt, new Object[]{this, iVar, dVar}, -460938536);
    }

    public final void e(o.er.i iVar, o.ep.d dVar, Context context, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = f24584b * 1756233953;
        f24584b = i2;
        int i3 = f24589g * 1181160184;
        f24589g = i3;
        int i4 = f24591i * 1839442224;
        f24591i = i4;
        d(i4, 675603548, i2, (int) Process.getElapsedCpuTime(), i3, new Object[]{this, iVar, dVar, context, operationCallback}, -675603546);
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 27))) + ((-1) - (((-1) - i3) & ((-1) - 27)));
        G = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f24606x;
        int i5 = (i3 ^ 37) + ((i3 & 37) << 1);
        G = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String g() {
        int id = (int) Thread.currentThread().getId();
        int iMyPid = Process.myPid();
        int i2 = f24597o * (-1717583902);
        f24597o = i2;
        int i3 = (-154475842) * f24596n;
        f24596n = i3;
        return (String) d(i2, 539787049, id, i3, iMyPid, new Object[]{this}, -539787043);
    }

    public final c h() {
        int i2 = f24594l * (-1627566601);
        f24594l = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        return (c) d((int) Runtime.getRuntime().freeMemory(), 1662058975, i2, (int) Runtime.getRuntime().maxMemory(), i3, new Object[]{this}, -1662058970);
    }

    public final o.dx.c i() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = ((i3 + 121) - (121 | i3)) + (i3 | 121);
        G = i4 % 128;
        if (i4 % 2 != 0) {
            return this.A;
        }
        throw null;
    }

    public final d j() {
        int i2 = f24600s * (-948551921);
        f24600s = i2;
        int i3 = f24599r * (-1934953559);
        f24599r = i3;
        int id = (int) Thread.currentThread().getId();
        int i4 = 1898373301 * f24598p;
        f24598p = i4;
        return (d) d(id, -38470119, i2, i4, i3, new Object[]{this}, 38470128);
    }

    public final String l() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = i3 + 99;
        H = i4 % 128;
        int i5 = i4 % 2;
        String str = this.F;
        int i6 = ((-1) - (((-1) - i3) | ((-1) - 79))) + ((i3 + 79) - (i3 & 79));
        H = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String m() {
        int i2 = 2 % 2;
        int i3 = H;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 47))) << 1) - (i3 ^ 47);
        int i5 = i4 % 128;
        G = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.E;
        int i6 = i5 + 83;
        H = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Long n() {
        int iNextInt = new Random().nextInt();
        int i2 = f24587e * 565616564;
        f24587e = i2;
        int i3 = f24583a * (-1875702751);
        f24583a = i3;
        return (Long) d(i3, 1542329947, iNextInt, (int) Thread.currentThread().getId(), i2, new Object[]{this}, -1542329946);
    }

    public final b o() {
        int i2 = 2 % 2;
        int i3 = G;
        int i4 = (((i3 + 109) - (109 & i3)) << 1) - (i3 ^ 109);
        int i5 = i4 % 128;
        H = i5;
        int i6 = i4 % 2;
        b bVar = this.C;
        int i7 = ((-1) - (((-1) - i5) | ((-1) - 69))) + ((i5 + 69) - (i5 & 69));
        G = i7 % 128;
        int i8 = i7 % 2;
        return bVar;
    }
}
