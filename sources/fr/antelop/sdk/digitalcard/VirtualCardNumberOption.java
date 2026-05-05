package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.exception.WalletValidationDomain;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.k;
import o.a.m;
import o.a.q;
import o.d.d;
import o.ea.f;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class VirtualCardNumberOption {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f19308a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f19309b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f19310c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f19311d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19312e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f19313f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f19314g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char f19315h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19316i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f19317j = 0;
    private final Integer maxPaymentNumber;
    private final String name;
    private final String validityDurationFormat;

    public static final class Builder {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f19318a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char[] f19319b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f19320c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f19321d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f19322e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f19323f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f19324g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f19325h = 0;
        private Integer maxPaymentNumber;
        private String name;
        private String validityDurationFormat;

        public enum ValidityUnit {
            Hour("h"),
            Day("d"),
            Year("y");

            final String format;

            ValidityUnit(String str) {
                this.format = str;
            }
        }

        private static String $$g(int i2, int i3, int i4) {
            int i5 = i3 * 4;
            int i6 = 3 - (i4 * 2);
            byte[] bArr = $$c;
            int i7 = 120 - i2;
            byte[] bArr2 = new byte[i5 + 1];
            int i8 = -1;
            if (bArr == null) {
                i7 = (-i7) + i5;
            }
            while (true) {
                i8++;
                i6++;
                bArr2[i8] = (byte) i7;
                if (i8 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = (-bArr[i6]) + i7;
            }
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f19325h = 352188783;
            f19324g = -865212639;
            init$0();
            f19320c = 0;
            f19323f = 1;
            f19322e = 0;
            f19321d = 1;
            d();
            f19318a = 4463480455001232926L;
            int i2 = f19323f + 25;
            f19320c = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void a(Context context, long j2, long j3) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f19322e + 89;
            int i4 = i3 % 128;
            f19321d = i4;
            long j4 = i3 % 2 == 0 ? j2 / (j3 << 26) : j2 ^ (j3 << 32);
            int i5 = i4 + 43;
            f19322e = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    Method method = f.class.getMethod("a", null);
                    method.setAccessible(true);
                    if (((Boolean) method.invoke(null, null)).booleanValue()) {
                        Object[] objArr = new Object[1];
                        i("嬙颓\udc64ွ喡襕촫ʏ䙚먰\ufffa㍑眣", View.combineMeasuredStates(0, 0) + 50093, objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        Object[] objArr2 = new Object[1];
                        i("嬣ꮿ먼誌餥\ue9f5\uf864죓\udf6d⸳㺳\u0d11ᶆ汦糦䍔厁ꈃ녿膤递\ue085\uf770쟋홖⛂㖲Ѿᓕ", (Process.myTid() >> 22) + 61583, objArr2);
                        Object[] objArr3 = {(String) objArr2[0]};
                        Object[] objArr4 = new Object[1];
                        i("嬰䐘敓ڟ⟛율", 7993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
                        Method method2 = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                        method2.setAccessible(true);
                        Object objInvoke = method2.invoke(objNewInstance, objArr3);
                        Object[] objArr5 = {Long.valueOf(j4)};
                        Object[] objArr6 = new Object[1];
                        i("嬰䐘敓ڟ⟛율", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7992, objArr6);
                        Method method3 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                        method3.setAccessible(true);
                        Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                        Object[] objArr7 = new Object[1];
                        i("嬥\ua631ꄜ갈꼟ꩳ땥끟", 64784 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr7);
                        Method method4 = StringBuilder.class.getMethod((String) objArr7[0], null);
                        method4.setAccessible(true);
                        Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                        Method method5 = f.class.getMethod("c", String.class, Object.class);
                        method5.setAccessible(true);
                        method5.invoke(null, objArr8);
                    }
                } else {
                    Method method6 = f.class.getMethod("a", null);
                    method6.setAccessible(true);
                    if (((Boolean) method6.invoke(null, null)).booleanValue()) {
                        Object[] objArr9 = new Object[1];
                        i("嬙颓\udc64ွ喡襕촫ʏ䙚먰\ufffa㍑眣", View.combineMeasuredStates(0, 0) + 50093, objArr9);
                        String strIntern2 = ((String) objArr9[0]).intern();
                        Constructor declaredConstructor2 = StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        Object objNewInstance2 = declaredConstructor2.newInstance(null);
                        Object[] objArr22 = new Object[1];
                        i("嬣ꮿ먼誌餥\ue9f5\uf864죓\udf6d⸳㺳\u0d11ᶆ汦糦䍔厁ꈃ녿膤递\ue085\uf770쟋홖⛂㖲Ѿᓕ", (Process.myTid() >> 22) + 61583, objArr22);
                        Object[] objArr32 = {(String) objArr22[0]};
                        Object[] objArr42 = new Object[1];
                        i("嬰䐘敓ڟ⟛율", 7993 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr42);
                        Method method22 = StringBuilder.class.getMethod((String) objArr42[0], String.class);
                        method22.setAccessible(true);
                        Object objInvoke3 = method22.invoke(objNewInstance2, objArr32);
                        Object[] objArr52 = {Long.valueOf(j4)};
                        Object[] objArr62 = new Object[1];
                        i("嬰䐘敓ڟ⟛율", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7992, objArr62);
                        Method method32 = StringBuilder.class.getMethod((String) objArr62[0], Long.TYPE);
                        method32.setAccessible(true);
                        Object objInvoke22 = method32.invoke(objInvoke3, objArr52);
                        Object[] objArr72 = new Object[1];
                        i("嬥\ua631ꄜ갈꼟ꩳ땥끟", 64784 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr72);
                        Method method42 = StringBuilder.class.getMethod((String) objArr72[0], null);
                        method42.setAccessible(true);
                        Object[] objArr82 = {strIntern2, method42.invoke(objInvoke22, null)};
                        Method method52 = f.class.getMethod("c", String.class, Object.class);
                        method52.setAccessible(true);
                        method52.invoke(null, objArr82);
                    }
                }
                int i6 = $$e;
                byte b2 = (byte) ((i6 + 3) - (3 | i6));
                byte b3 = (byte) (-b2);
                Object[] objArr10 = new Object[1];
                j(b2, b3, (byte) (-b3), objArr10);
                Class<?> cls = Class.forName((String) objArr10[0]);
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 + 4);
                byte b6 = (byte) (b5 - 4);
                Object[] objArr11 = new Object[1];
                j(b4, b5, b6, objArr11);
                Method method7 = cls.getMethod((String) objArr11[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(null, null);
                byte b7 = (byte) ((i6 + 3) - (3 | i6));
                byte b8 = (byte) (-b7);
                Object[] objArr12 = new Object[1];
                j(b7, b8, (byte) (-b8), objArr12);
                Class.forName((String) objArr12[0]).getField("d").setInt(objInvoke4, (int) j4);
                byte b9 = (byte) ((i6 + 3) - (3 | i6));
                byte b10 = (byte) (-b9);
                Object[] objArr13 = new Object[1];
                j(b9, b10, (byte) (-b10), objArr13);
                Class<?> cls2 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                j(b4, b5, b6, objArr14);
                Method method8 = cls2.getMethod((String) objArr14[0], null);
                method8.setAccessible(true);
                Object objInvoke5 = method8.invoke(null, null);
                byte b11 = (byte) (i6 & 3);
                byte b12 = (byte) (-b11);
                Object[] objArr15 = new Object[1];
                j(b11, b12, (byte) (-b12), objArr15);
                Class.forName((String) objArr15[0]).getField("b").setBoolean(objInvoke5, true);
                int i7 = f19322e + 101;
                f19321d = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 93 / 0;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static void d() {
            f19319b = new char[]{56328, 56728, 56729, 56721, 56723, 56731, 56712, 56705, 56720, 56728, 56731, 56724, 56723, 56728, 56711, 56710, 56731, 56731, 56726, 56559, 56434, 56712, 56435, 56428, 56443, 56707, 56710, 56447, 56446, 56707, 56716, 56708, 56445, 56710, 56710, 56707, 56706, 56498, 56550, 56556, 56560, 56555, 56553, 56551, 56548, 56558, 56555, 56547, 56532, 56505, 56528, 56561, 56526, 56505, 56555, 56548, 56546, 56553, 56563, 56553, 56553, 56561, 56553, 56555, 56562, 56563, 56556, 56521, 56523, 56554, 56555, 56550, 56546, 56553, 56563, 56529, 56523, 56558, 56555, 56547, 56548, 56521, 56525, 56552, 56553, 56560, 56555, 56552, 56525, 56529, 56566, 56566, 56529, 56503, 56558, 56559, 56503, 56553, 56521, 56529, 56566, 56566, 56529, 56525, 56552, 56555, 56560, 56553, 56552, 56525, 56522, 56557, 56563, 56553, 56546, 56548, 56546, 56546, 56553, 56551, 56545, 56551, 56552, 56548, 56521, 56527, 56561, 56537, 56405, 56442, 56442, 56405, 56401, 56428, 56431, 56436, 56429, 56428, 56401, 56397, 56424, 56423, 56431, 56434, 56399, 56405, 56439, 56429, 56422, 56426, 56431, 56430, 56399, 56405, 56439, 56429, 56422, 56426, 56431, 56430, 56423, 56427, 56434};
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:(2:87|32)|(8:34|44|96|45|(2:47|48)(4:51|94|52|53)|(5:90|57|(1:59)(5:60|97|61|62|(3:(1:69)(1:74)|70|(2:75|76)))|66|(0))|72|73)(4:35|85|36|(7:38|96|45|(0)(0)|(0)|72|73)(1:39))|43|44|96|45|(0)(0)|(0)|72|73) */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0429  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0437 A[Catch: Exception -> 0x0433, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0433, blocks: (B:45:0x0407, B:51:0x0437, B:53:0x0466, B:55:0x046e, B:56:0x0474, B:52:0x0441), top: B:96:0x0407, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0475 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(int r21, int r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1471
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberOption.Builder.d(int, int):java.lang.Object[]");
        }

        private static void i(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 41;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
            while (qVar.f19948a < cArr.length) {
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 730, (char) (ImageFormat.getBitsPerPixel(0) + 7934), 10 - TextUtils.lastIndexOf("", '0', 0), 355847088, false, $$g((byte) 49, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f19318a ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = d.a(TextUtils.indexOf("", "", 0, 0) + 836, (char) (27278 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -2145994442, false, $$g((byte) ($$c[3] - 1), b3, b3), new Class[]{Object.class, Object.class});
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
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = d.a(1452497747);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27279), (ViewConfiguration.getTapTimeout() >> 16) + 11, -2145994442, false, $$g((byte) ($$c[3] - 1), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str3 = new String(cArr2);
            int i9 = $10 + 87;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str3;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SUB, -20, MessagePack.Code.NIL, 88};
            $$b = 145;
        }

        static void init$1() {
            $$d = new byte[]{101, -104, -88, -105, MessagePack.Code.BIN32, 59, Ascii.NAK, MessagePack.Code.BIN16, 59};
            $$e = 197;
        }

        static void init$2() {
            $$c = new byte[]{47, MessagePack.Code.BIN8, Ascii.FS, 43};
            $$f = 72;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void j(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r0 = r8 + 4
                byte[] r8 = fr.antelop.sdk.digitalcard.VirtualCardNumberOption.Builder.$$d
                int r1 = r7 * 14
                int r7 = r1 + 97
                int r6 = r9 * 5
                int r1 = r6 + 1
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r8 != 0) goto L2d
                r1 = r0
                r7 = r6
                r3 = r4
            L14:
                int r7 = r7 + r0
                int r7 = r7 + (-7)
                r0 = r1
                r2 = r3
            L19:
                byte r1 = (byte) r7
                r5[r2] = r1
                int r1 = r0 + 1
                int r3 = r2 + 1
                if (r2 != r6) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r10[r4] = r0
                return
            L2a:
                r0 = r8[r1]
                goto L14
            L2d:
                r2 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberOption.Builder.j(short, short, byte, java.lang.Object[]):void");
        }

        private static void k(int[] iArr, String str, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            String str2 = str;
            int i3 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = f19319b;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objA = d.a(-2071388435);
                        if (objA == null) {
                            int iGreen = Color.green(i4) + 249;
                            char size = (char) View.MeasureSpec.getSize(i4);
                            int i10 = 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte length2 = (byte) $$c.length;
                            byte b2 = (byte) (length2 - 4);
                            objA = d.a(iGreen, size, i10, 1376582792, false, $$g(length2, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9++;
                        i4 = 0;
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
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i5, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                mVar.f19943d = 0;
                char c2 = 0;
                while (mVar.f19943d < i6) {
                    int i11 = $11 + 103;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    if (bArr[mVar.f19943d] == 1) {
                        int i13 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = d.a(120026474);
                        if (objA2 == null) {
                            objA2 = d.a(11 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", ""), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    } else {
                        int i14 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = d.a(1632715197);
                        if (objA3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objA3 = d.a(836 - Color.red(0), (char) (27278 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, -1210801192, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[mVar.f19943d];
                    Object[] objArr5 = {mVar, mVar};
                    Object objA4 = d.a(-1041906996);
                    if (objA4 == null) {
                        objA4 = d.a(21 - KeyEvent.normalizeMetaState(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 35716), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                int i15 = $11 + 111;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i17 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i17, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i17);
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr6 = new char[i6];
                while (true) {
                    mVar.f19943d = i2;
                    if (mVar.f19943d >= i6) {
                        break;
                    }
                    int i18 = $10 + 65;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i20 = $10 + 73;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (true) {
                    mVar.f19943d = i22;
                    if (mVar.f19943d >= i6) {
                        break;
                    }
                    int i23 = $10 + 53;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] / iArr[4]);
                        i22 = mVar.f19943d % 0;
                    } else {
                        cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                        i22 = mVar.f19943d + 1;
                    }
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(int r9, int r10, short r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = fr.antelop.sdk.digitalcard.VirtualCardNumberOption.Builder.$$a
                int r0 = r10 * 2
                int r7 = 100 - r0
                int r2 = r9 * 2
                int r1 = 1 - r2
                int r0 = r11 * 3
                int r6 = 4 - r0
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r8 != 0) goto L2f
                r7 = r3
                r2 = r6
                r0 = r4
            L18:
                int r7 = r7 + r6
                int r6 = r2 + 1
            L1b:
                byte r1 = (byte) r7
                r5[r0] = r1
                if (r0 != r3) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r12[r4] = r0
                return
            L28:
                r1 = r8[r6]
                int r0 = r0 + 1
                r2 = r6
                r6 = r1
                goto L18
            L2f:
                r0 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberOption.Builder.l(int, int, short, java.lang.Object[]):void");
        }

        public final VirtualCardNumberOption build() {
            int i2 = 2 % 2;
            VirtualCardNumberOption virtualCardNumberOption = new VirtualCardNumberOption(this.name, this.validityDurationFormat, this.maxPaymentNumber);
            int i3 = f19321d + 41;
            f19322e = i3 % 128;
            int i4 = i3 % 2;
            return virtualCardNumberOption;
        }

        public final Builder setMaxPaymentNumber(Integer num) {
            int i2 = 2 % 2;
            int i3 = f19322e + 75;
            int i4 = i3 % 128;
            f19321d = i4;
            int i5 = i3 % 2;
            this.maxPaymentNumber = num;
            int i6 = i4 + 61;
            f19322e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setName(String str) {
            int i2 = 2 % 2;
            int i3 = f19322e;
            int i4 = i3 + 125;
            f19321d = i4 % 128;
            int i5 = i4 % 2;
            this.name = str;
            int i6 = i3 + 21;
            f19321d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setValidityDuration(ValidityUnit validityUnit, int i2) {
            int i3 = 2 % 2;
            this.validityDurationFormat = new StringBuilder().append(i2).append(validityUnit.format).toString();
            int i4 = f19321d + 63;
            f19322e = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            int r0 = r8 + 102
            int r1 = r7 * 4
            int r8 = 4 - r1
            byte[] r7 = fr.antelop.sdk.digitalcard.VirtualCardNumberOption.$$a
            int r1 = r9 * 2
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L29
            r3 = r6
            r2 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r3
            int r8 = r8 + 1
        L17:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r1 = r7[r8]
            r3 = r0
            r0 = r1
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberOption.$$c(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19317j = 473256163;
        f19309b = -2032682068;
        f19308a = 706602223;
        f19311d = -280096056;
        f19310c = -735465151;
        f19314g = 0;
        f19316i = 1;
        f19312e = 4718460050142594293L;
        f19313f = new char[]{64612, 64585, 64580, 64584, 64637, 64609, 64533, 64605, 64629, 64582, 64593, 64618, 64577, 64523, 64536, 64579, 64591, 64619, 64578, 64540, 64615, 64587, 64588, 64517, 64586, 64576, 64583, 64604, 64528, 64614, 64624, 64521, 64599, 64592, 64597, 64630};
        f19315h = (char) 51641;
    }

    VirtualCardNumberOption(String str, String str2, Integer num) {
        this.name = str;
        this.validityDurationFormat = str2;
        this.maxPaymentNumber = num;
    }

    public static Object[] b(Context context, int i2, int i3) {
        Object[] objArr;
        Object[] objArr2;
        int iIndexOf;
        int i4;
        int i5;
        int i6;
        int i7 = i3;
        if (context == null) {
            Object[] objArr3 = {new int[1], new int[]{i2}, null, new int[]{i2}};
            int i8 = f19317j * 1608260191;
            f19317j = i8;
            int i9 = ~i8;
            int i10 = 1389000965 + (((-1) - (((-1) - (~(((-277889977) + i9) - ((-277889977) & i9)))) & ((-1) - (~((-1) - (((-1) - 400258045) & ((-1) - i8))))))) * (-272)) + (((-1) - (((-1) - (~(((-332485566) + i8) - ((-332485566) & i8)))) & ((-1) - 54595589))) * (-272));
            int i11 = ~(i8 | 332485565);
            int i12 = i10 + (((i11 + 345662456) - (i11 & 345662456)) * 272);
            int iMyTid = Process.myTid();
            int i13 = ~iMyTid;
            int i14 = (-(-(i12 * 561))) + ((~i13) * (-560));
            int i15 = ~i12;
            int i16 = (~((iMyTid + i15) - (iMyTid & i15))) * (-560);
            int i17 = i7 + (i14 ^ i16) + (((i16 + i14) - (i16 | i14)) << 1) + (((~(((-1) ^ i12) | i12)) | (~((-1) - (((-1) - (i13 ^ i12)) & ((-1) - (i12 & i13)))))) * 560);
            int i18 = i17 << 13;
            int i19 = (-1) - (((-1) - (i17 | i18)) | ((-1) - (~((i17 + i18) - (i17 | i18)))));
            int i20 = i19 >>> 17;
            int i21 = (-1) - (((-1) - ((~i19) & i20)) & ((-1) - ((~i20) & i19)));
            int i22 = i21 << 5;
            int i23 = ~((-1) - (((-1) - i21) | ((-1) - i22)));
            int i24 = i21 | i22;
            ((int[]) objArr3[0])[0] = (i24 + i23) - (i24 | i23);
            return objArr3;
        }
        try {
            int offsetBefore = TextUtils.getOffsetBefore("", 0);
            int i25 = (offsetBefore ^ 1) + (((-1) - (((-1) - offsetBefore) | ((-1) - 1))) << 1);
            Object[] objArr4 = new Object[1];
            k("䢌ṅｑ褑䣦被툹䫝ወ\ueea0硸钝ﲗ唷ẵ\uf15d䙌뭿쒭嬑\u2009\ue14e椷ꖢ诘䟋༫\u0ff8嗊귪뗢栴㼘ဦ寡눩餂癉ǆᳬ擱\udc82", i25, objArr4);
            objArr = (Object[]) Array.newInstance(Class.forName((String) objArr4[0]), 2);
            objArr2 = new Object[1];
            k("⌣㴐簷䪩⍠ꯑ儔襅祱춿ײַ圯露癳鶁㋈ⷲ頱䞐颯䯿술\uea04晵\ue061擏谏찟㸢躃㚝\uabff咺㍶\ud8a6", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        } catch (Throwable unused) {
        }
        try {
            try {
                Object[] objArr5 = {(String) objArr2[0]};
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                int i26 = f19310c * 1784619165;
                f19310c = i26;
                int i27 = absoluteGravity * 375;
                int i28 = ((-1) - (((-1) - i27) | ((-1) - (-747)))) + ((i27 - 747) - (i27 & (-747)));
                int i29 = ~absoluteGravity;
                int i30 = ~((-1) - (((-1) - i29) & ((-1) - 1)));
                int i31 = ~i26;
                int i32 = ~((-1) - (((-1) - (i31 ^ absoluteGravity)) & ((-1) - ((i31 + absoluteGravity) - (i31 | absoluteGravity)))));
                int i33 = ((-1) - (((-1) - (i30 ^ i32)) & ((-1) - ((i30 + i32) - (i30 | i32))))) * (-374);
                int i34 = (-2) ^ absoluteGravity;
                int i35 = absoluteGravity & (-2);
                int i36 = (((i28 ^ i33) + ((i28 & i33) << 1)) - (~((~((i34 + i35) - (i34 & i35))) * 748))) - 1;
                int i37 = ~((-1) - (((-1) - (i29 ^ (-2))) & ((-1) - ((i29 - 2) - (i29 | (-2))))));
                int i38 = -(-(((-1) - (((-1) - ((-1) - (((-1) - i37) | ((-1) - i32)))) & ((-1) - (i37 ^ i32)))) * 374));
                int i39 = (i36 ^ i38) + ((i36 & i38) << 1);
                Object[] objArr6 = new Object[1];
                k("䢌ṅｑ褑䣦被툹䫝ወ\ueea0硸钝ﲗ唷ẵ\uf15d䙌뭿쒭嬑\u2009\ue14e椷ꖢ诘䟋༫\u0ff8嗊귪뗢栴㼘ဦ寡눩餂癉ǆᳬ擱\udc82", i39, objArr6);
                objArr[0] = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                int i40 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i41 = f19311d * 908970537;
                f19311d = i41;
                int i42 = i40 * (-520);
                int i43 = (i42 ^ 16182) + ((i42 & 16182) << 1);
                int i44 = ~i40;
                int i45 = (-1) - (((-1) - (i44 ^ 31)) & ((-1) - ((i44 + 31) - (i44 | 31))));
                int i46 = i43 + ((~((-1) - (((-1) - (i45 ^ i41)) & ((-1) - (i45 & i41))))) * 521);
                int i47 = (~(((-32) ^ i40) | ((-1) - (((-1) - (-32)) | ((-1) - i40))))) * (-1042);
                int i48 = (i46 ^ i47) + (((i47 + i46) - (i47 | i46)) << 1);
                int i49 = (-32) ^ i40;
                int i50 = ((-32) + i40) - ((-32) | i40);
                int i51 = ~((i50 + i49) - (i50 & i49));
                int i52 = ~i40;
                int i53 = ~i41;
                int i54 = (i52 & i53) | (i52 ^ i53);
                int i55 = ~((-1) - (((-1) - ((-1) - (((-1) - i54) | ((-1) - 31)))) & ((-1) - (i54 ^ 31))));
                int i56 = ((-1) - (((-1) - (i55 & i51)) & ((-1) - (i51 ^ i55)))) * 521;
                int i57 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr7 = new Object[1];
                l("\u001a\u0011\u001f\u001e#\u0007\f\u0002\u0012\u000f\u001e\u001a\u0012\u0010#\u0019\f\u000f\u0003\u0012\u000e\u001e\u001c\u0012\u0011\u0012\u0001\u001d\u001b 㘄", (i48 ^ i56) + (((-1) - (((-1) - i48) | ((-1) - i56))) << 1), (byte) (((i57 + 6) - (6 | i57)) + ((i57 + 6) - (i57 & 6))), objArr7);
                try {
                    Object[] objArr8 = {(String) objArr7[0]};
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr9 = new Object[1];
                    k("䢌ṅｑ褑䣦被툹䫝ወ\ueea0硸钝ﲗ唷ẵ\uf15d䙌뭿쒭嬑\u2009\ue14e椷ꖢ诘䟋༫\u0ff8嗊귪뗢栴㼘ဦ寡눩餂癉ǆᳬ擱\udc82", (iMakeMeasureSpec & 1) + ((iMakeMeasureSpec + 1) - (iMakeMeasureSpec & 1)), objArr9);
                    objArr[1] = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance(objArr8);
                    try {
                        int iGreen = Color.green(0);
                        int i58 = ~iGreen;
                        int i59 = ~((i58 ^ (-24)) | ((i58 - 24) - ((-24) | i58)));
                        int i60 = ~i2;
                        int i61 = ((((iGreen * 483) + 5566) - (~(((~((-1) - (((-1) - (i58 ^ i60)) & ((-1) - ((-1) - (((-1) - i58) | ((-1) - i60))))))) | i59) * (-241)))) - 1) + ((23 | iGreen) * (-482));
                        int i62 = ~((-1) - (((-1) - ((-24) & iGreen)) & ((-1) - ((-24) ^ iGreen))));
                        int i63 = ~iGreen;
                        int i64 = i63 ^ i60;
                        int i65 = (i63 + i60) - (i63 | i60);
                        int i66 = (i65 + i64) - (i65 & i64);
                        int i67 = ~((i66 & 23) | (i66 ^ 23));
                        int i68 = i62 ^ i67;
                        int i69 = i67 & i62;
                        Object[] objArr10 = new Object[1];
                        l("\u0003\u0014\u000e\u001e\u001c\u0012\r\u000e\u0006\u001b\u0016\t\u001b\u0013\u0007\u0010\u0018\u0019\u0016\t\u001f\r㙗", i61 + (((i69 + i68) - (i69 & i68)) * 241), (byte) (104 - ExpandableListView.getPackedPositionChild(0L)), objArr10);
                        Class<?> cls = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        k("㖽\uee0d깲藟㗚磧茘䘢濠ấ⥃顗膢ꕯ侩ﶛ㭧䬯闇埛崿", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
                        Object objInvoke = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                        try {
                            int i70 = -TextUtils.lastIndexOf("", '0');
                            int i71 = ~i70;
                            int i72 = ~i2;
                            int i73 = ~((-1) - (((-1) - i71) & ((-1) - i72)));
                            int i74 = ~((-1) - (((-1) - ((-23) ^ i60)) & ((-1) - ((-23) & i60))));
                            int i75 = (i70 * 868) + 19096 + (((-1) - (((-1) - (i73 ^ i74)) & ((-1) - ((-1) - (((-1) - i73) | ((-1) - i74)))))) * (-867));
                            int i76 = ~i70;
                            int i77 = (-1) - (((-1) - (~((i76 ^ (-23)) | ((i76 - 23) - ((-23) | i76))))) & ((-1) - (~((-1) - (((-1) - i71) & ((-1) - i2))))));
                            int i78 = ~((-1) - (((-1) - (-23)) & ((-1) - i2)));
                            int i79 = i77 ^ i78;
                            int i80 = (-1) - (((-1) - i77) | ((-1) - i78));
                            int i81 = i75 + (((i79 + i80) - (i79 & i80)) * (-1734));
                            int i82 = (-1) - (((-1) - i71) & ((-1) - (-23)));
                            int i83 = ~((i82 + i60) - (i82 & i60));
                            int i84 = (-1) - (((-1) - i76) & ((-1) - 22));
                            int i85 = i84 ^ i2;
                            int i86 = (-1) - (((-1) - i84) | ((-1) - i2));
                            int i87 = (-1) - (((-1) - (~((i86 + i85) - (i86 & i85)))) & ((-1) - i83));
                            int i88 = (-23) ^ i70;
                            int i89 = (-23) & i70;
                            int i90 = (i88 + i89) - (i88 & i89);
                            int i91 = ~((-1) - (((-1) - ((i90 + i2) - (i90 | i2))) & ((-1) - (i90 ^ i2))));
                            int i92 = ((-1) - (((-1) - ((-1) - (((-1) - i87) | ((-1) - i91)))) & ((-1) - (i87 ^ i91)))) * 867;
                            Object[] objArr12 = new Object[1];
                            l("\u0003\u0014\u000e\u001e\u001c\u0012\r\u000e\u0006\u001b\u0016\t\u001b\u0013\u0007\u0010\u0018\u0019\u0016\t\u001f\r㙗", (i81 & i92) + (i92 | i81), (byte) (Process.getGidForName("") + 106), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            k("䨢ᝬᶿ‾䩅膆フ\ue3c3ၿ\ue7c4骎㶶︽導ﱧ塺䓻뉊", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod((String) objArr13[0], null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                k("樽釱Ꝭ䶹橜ܐ訖蹦の慓⁒偾\ude26\uda99䚔㗨擬㓜鳊鿶ʽ滣ㅌ慴ꥰ젩坍쬁眲≣\ueda7곍᷷龣ω皍뮯", 1 - Color.alpha(0), objArr15);
                                Class<?> cls3 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                k("䣗\ue059係贈䢰皳抨仵ኊჱ죳邀ﳈꬻ긝\uf543䘅䕵", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr16);
                                Object objInvoke2 = cls3.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                int i93 = scrollBarFadeDuration * (-743);
                                int i94 = ((i93 | (-743)) << 1) - (i93 ^ (-743));
                                int i95 = (-1) - (((-1) - (scrollBarFadeDuration ^ 1)) & ((-1) - ((-1) - (((-1) - scrollBarFadeDuration) | ((-1) - 1)))));
                                int i96 = ~i95;
                                int i97 = ~((scrollBarFadeDuration + i2) - (scrollBarFadeDuration & i2));
                                int i98 = ((i96 + i97) - (i96 | i97)) | (i96 ^ i97);
                                int i99 = (i2 + 1) - (1 | i2);
                                int i100 = (i2 ^ 1) | i99;
                                int i101 = ~i100;
                                int i102 = i94 + (((i98 ^ i101) | ((-1) - (((-1) - i98) | ((-1) - i101)))) * (-744));
                                int i103 = ~scrollBarFadeDuration;
                                int i104 = ~((i103 & (-2)) | (i103 ^ (-2)));
                                int i105 = i60 ^ i104;
                                int i106 = i104 & i60;
                                int i107 = -(-(((i106 + i105) - (i106 & i105)) * 744));
                                int i108 = (((i102 + i107) - (i102 & i107)) << 1) - (i107 ^ i102);
                                int i109 = ((i95 ^ i2) | ((-1) - (((-1) - i95) | ((-1) - i2)))) * 744;
                                int i110 = (i108 ^ i109) + (((i109 + i108) - (i109 | i108)) << 1);
                                Object[] objArr17 = new Object[1];
                                k("ᤀꀫﳐ㏠ᥡ㛊톪\uf03f䍓傉篮⸧괛\ueb43ᴨ䮱៑Ԇ읶\ue1af熀弹櫰Ἥ\uda4d麟ೱ땘ЏᎹ똟튛滂깷", i110, objArr17);
                                Class<?> cls4 = Class.forName((String) objArr17[0]);
                                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                int i111 = scrollBarSize * 758;
                                int i112 = (((-1) - (((-1) - i111) & ((-1) - (-756)))) << 1) - (i111 ^ (-756));
                                int i113 = ((scrollBarSize ^ i60) | (scrollBarSize & i60)) * (-757);
                                int i114 = (-1) - (((-1) - ((-2) ^ scrollBarSize)) & ((-1) - (((-2) + scrollBarSize) - ((-2) | scrollBarSize))));
                                int i115 = ((((i112 + i113) - (i112 & i113)) << 1) - (i113 ^ i112)) + ((~((-1) - (((-1) - (i114 & i2)) & ((-1) - (i114 ^ i2))))) * 1514);
                                int i116 = ~scrollBarSize;
                                int i117 = ~((i116 & (-2)) | (i116 ^ (-2)));
                                int i118 = (-2) ^ i72;
                                int i119 = (-2) & i72;
                                int i120 = ~((i118 + i119) - (i118 & i119));
                                int i121 = (i117 ^ i120) | ((i117 + i120) - (i117 | i120));
                                int i122 = (-1) - (((-1) - ((-1) - (((-1) - scrollBarSize) | ((-1) - 1)))) & ((-1) - (scrollBarSize ^ 1)));
                                int i123 = i122 ^ i2;
                                int i124 = (-1) - (((-1) - i122) | ((-1) - i2));
                                int i125 = ~((i124 + i123) - (i124 & i123));
                                int i126 = i121 ^ i125;
                                int i127 = (i125 + i121) - (i125 | i121);
                                int i128 = ((i127 + i126) - (i127 & i126)) * 757;
                                int i129 = ((i115 | i128) << 1) - (i128 ^ i115);
                                Object[] objArr18 = new Object[1];
                                k("褌䂲驁蘯西화뜸䗬퍑뀍ᵮ鮴㴑ெ", i129, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke2);
                                int length = objArr19.length;
                                int i130 = 0;
                                while (i130 < length) {
                                    Object obj = objArr19[i130];
                                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 6;
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                    int i131 = iLastIndexOf * 193;
                                    int i132 = ((-1) - (((-1) - i131) | ((-1) - 15633))) + (i131 | 15633);
                                    int i133 = ~iLastIndexOf;
                                    int i134 = i133 ^ 81;
                                    int i135 = (-1) - (((-1) - i133) | ((-1) - 81));
                                    int i136 = ~((i134 + i135) - (i134 & i135));
                                    int i137 = ((i72 ^ i136) | ((-1) - (((-1) - i136) | ((-1) - i72)))) * (-192);
                                    int i138 = (((-1) - (((-1) - i132) & ((-1) - i137))) << 1) - (i132 ^ i137);
                                    int i139 = ~iLastIndexOf;
                                    int i140 = ~((i139 ^ (-82)) | ((i139 - 82) - ((-82) | i139)));
                                    int i141 = (-82) ^ i60;
                                    int i142 = (-1) - (((-1) - (-82)) | ((-1) - i60));
                                    int i143 = ~((i141 + i142) - (i141 & i142));
                                    int i144 = i140 ^ i143;
                                    int i145 = (-1) - (((-1) - i143) | ((-1) - i140));
                                    int i146 = ((i144 + i145) - (i144 & i145)) * (-384);
                                    int i147 = (((-1) - (((-1) - i138) & ((-1) - i146))) << 1) - (i138 ^ i146);
                                    int i148 = (-1) - (((-1) - (i139 & (-82))) & ((-1) - (i139 ^ (-82))));
                                    int i149 = (-1) - (((-1) - (~(((-1) - (((-1) - i148) | ((-1) - i2))) | (i148 ^ i2)))) & ((-1) - (~((-1) - (((-1) - ((-1) - (((-1) - ((-82) ^ i72)) & ((-1) - ((-82) & i72))))) & ((-1) - iLastIndexOf))))));
                                    int i150 = (iLastIndexOf ^ 81) | ((iLastIndexOf + 81) - (iLastIndexOf | 81));
                                    int i151 = ~(((-1) - (((-1) - i150) | ((-1) - i2))) | (i150 ^ i2));
                                    byte b2 = (byte) (i147 + (((i149 & i151) | (i149 ^ i151)) * 192));
                                    Object[] objArr20 = new Object[1];
                                    l("\u0001\u0010\u0018\n㗳", iIndexOf2, b2, objArr20);
                                    try {
                                        Object[] objArr21 = {(String) objArr20[0]};
                                        Object[] objArr22 = new Object[1];
                                        k("鲻橥龰鸩鳑ﲋ님工용髝ᢏ莣⢶ℐ繏\ue678鉶켈ꐁ䰭\uf439镮ঐ닷忲㎬澎ᢙ膵\ud9fb핕罝\ueb6b搳㬴ꔙ䴸ɾ愡\u0bd6냞", 0 - (~TextUtils.getOffsetBefore("", 0)), objArr22);
                                        Class<?> cls5 = Class.forName((String) objArr22[0]);
                                        Object[] objArr23 = new Object[1];
                                        k("ྭ闏ų梠࿊̥Ⱉꭄ嗿敷虝用뮻\udeab\ue080", -MotionEvent.axisFromString(""), objArr23);
                                        Object objInvoke3 = cls5.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                        try {
                                            iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                                            int iNextInt = new Random().nextInt();
                                            int i152 = (capsMode * 960) - 182115;
                                            int i153 = ~((-1) - (((-1) - (-96)) & ((-1) - (~iNextInt))));
                                            int i154 = ~((capsMode ^ iNextInt) | (capsMode & iNextInt));
                                            int i155 = i153 ^ i154;
                                            int i156 = i153 & i154;
                                            int i157 = ((i155 + i156) - (i155 & i156)) * 959;
                                            i4 = (((i152 | i157) << 1) - (i157 ^ i152)) - (-92064);
                                            i5 = ~(((-96) + iNextInt) - ((-96) & iNextInt));
                                            int i158 = ~iNextInt;
                                            i6 = ~((i158 + capsMode) - (i158 & capsMode));
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            l("\u0003\u0014\u000e\u001e\u001c\u0012\r\u000e\u0006\u001b\u0016\t\u001b\u0013\u0007\u0010!\u0004\u0011\u001f\u0017\u0013\u0014\u0003\t\"\u001f\u001a", iIndexOf, (byte) (i4 + (((i5 + i6) - (i5 & i6)) * 959)), objArr24);
                                            Class<?> cls6 = Class.forName((String) objArr24[0]);
                                            int i159 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i160 = f19308a * (-1553366976);
                                            f19308a = i160;
                                            int i161 = i159 * 398;
                                            int i162 = (i161 ^ (-3960)) + ((i161 & (-3960)) << 1);
                                            int i163 = ~i159;
                                            int i164 = ~i160;
                                            int i165 = ~(i163 | i164);
                                            int i166 = ~i159;
                                            int i167 = ~((-1) - (((-1) - i166) & ((-1) - 10)));
                                            int i168 = i165 ^ i167;
                                            int i169 = (i165 + i167) - (i165 | i167);
                                            int i170 = (i168 + i169) - (i168 & i169);
                                            int i171 = ~((-1) - (((-1) - (i164 ^ 10)) & ((-1) - ((-1) - (((-1) - i164) | ((-1) - 10))))));
                                            int i172 = i170 ^ i171;
                                            int i173 = (-1) - (((-1) - i170) | ((-1) - i171));
                                            int i174 = ((i173 + i172) - (i173 & i172)) * (-397);
                                            int i175 = ((-1) - (((-1) - i162) | ((-1) - i174))) + ((i174 + i162) - (i174 & i162));
                                            int i176 = (~((i166 ^ 10) | ((i166 + 10) - (i166 | 10)))) * (-397);
                                            int i177 = (i175 ^ i176) + (((i176 + i175) - (i176 | i175)) << 1);
                                            int i178 = ~((-1) - (((-1) - (i163 ^ 10)) & ((-1) - (i163 & 10))));
                                            int i179 = ((i178 + i160) - (i178 | i160)) | (i160 ^ i178);
                                            int i180 = ~((-1) - (((-1) - ((i159 - 11) - (i159 | (-11)))) & ((-1) - ((-11) ^ i159))));
                                            int i181 = -(-(((i179 & i180) | (i179 ^ i180)) * 397));
                                            int i182 = (i177 ^ i181) + (((-1) - (((-1) - i181) | ((-1) - i177))) << 1);
                                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                            int i183 = scrollDefaultDelay * 141;
                                            int i184 = (((i183 - 16541) - ((-16541) & i183)) << 1) - (i183 ^ (-16541));
                                            int i185 = ~scrollDefaultDelay;
                                            int i186 = ~((i185 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (119 & i185));
                                            int i187 = ~scrollDefaultDelay;
                                            int i188 = ~((i187 ^ i2) | ((i187 + i2) - (i187 | i2)));
                                            int i189 = i184 + (((-1) - (((-1) - ((-1) - (((-1) - i186) | ((-1) - i188)))) & ((-1) - (i186 ^ i188)))) * (-280));
                                            int i190 = ~((i185 ^ i2) | (i185 & i2));
                                            int i191 = (-120) ^ i2;
                                            int i192 = (-120) & i2;
                                            int i193 = ~((i192 + i191) - (i192 & i191));
                                            int i194 = (i189 - (~(-(-(((i190 & i193) | (i190 ^ i193)) * 140))))) - 1;
                                            int i195 = i187 ^ (-120);
                                            int i196 = (-1) - (((-1) - i187) | ((-1) - (-120)));
                                            int i197 = ~((-1) - (((-1) - ((i195 + i196) - (i195 & i196))) & ((-1) - i2)));
                                            int i198 = ((i185 + i60) - (i185 | i60)) | (i185 ^ i60);
                                            int i199 = ~((-1) - (((-1) - (i198 & PanasonicMakernoteDirectory.TAG_BURST_SPEED)) & ((-1) - (i198 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED))));
                                            int i200 = (-1) - (((-1) - (i199 & i197)) & ((-1) - (i197 ^ i199)));
                                            int i201 = (-120) ^ i72;
                                            int i202 = (-120) & i72;
                                            int i203 = (i201 + i202) - (i201 & i202);
                                            int i204 = ~((-1) - (((-1) - ((scrollDefaultDelay + i203) - (scrollDefaultDelay | i203))) & ((-1) - (i203 ^ scrollDefaultDelay))));
                                            Object[] objArr25 = new Object[1];
                                            l("\u0006\u001c\u0015\u001a\u0007\u001c\u0002\u001e\u0002\b㙚", i182, (byte) ((i194 - (~((((i204 + i200) - (i204 | i200)) | (i200 ^ i204)) * 140))) - 1), objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                int iGreen2 = Color.green(0);
                                                int i205 = iGreen2 * (-755);
                                                int i206 = (((i205 - 755) - ((-755) & i205)) << 1) - (i205 ^ (-755));
                                                int i207 = ~iGreen2;
                                                int i208 = i207 ^ (-2);
                                                int i209 = i207 & (-2);
                                                int i210 = (~((i208 + i209) - (i208 & i209))) * 1512;
                                                int i211 = (i206 ^ i210) + (((i206 + i210) - (i206 | i210)) << 1);
                                                int i212 = ~(((i207 - 2) - (i207 | (-2))) | (i207 ^ (-2)));
                                                int i213 = ~(1 | iGreen2 | i2);
                                                int i214 = (i211 - (~(((-1) - (((-1) - ((i212 + i213) - (i212 | i213))) & ((-1) - (i212 ^ i213)))) * (-756)))) - 1;
                                                int i215 = (-1) - (((-1) - ((-1) - (((-1) - iGreen2) | ((-1) - 1)))) & ((-1) - (iGreen2 ^ 1)));
                                                int i216 = -(-((((i215 + i60) - (i215 | i60)) | (i215 ^ i60)) * 756));
                                                int i217 = (i214 ^ i216) + ((i216 & i214) << 1);
                                                Object[] objArr27 = new Object[1];
                                                k("鲻橥龰鸩鳑ﲋ님工용髝ᢏ莣⢶ℐ繏\ue678鉶켈ꐁ䰭\uf439镮ঐ닷忲㎬澎ᢙ膵\ud9fb핕罝\ueb6b搳㬴ꔙ䴸ɾ愡\u0bd6냞", i217, objArr27);
                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                int i218 = 18 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                int iRgb = Color.rgb(0, 0, 0);
                                                int i219 = f19309b * 127879306;
                                                f19309b = i219;
                                                int i220 = iRgb * 69;
                                                int i221 = ((i220 | (-1124079971)) << 1) - (i220 ^ (-1124079971));
                                                int i222 = ~iRgb;
                                                int i223 = (-1) - (((-1) - ((-1) - (((-1) - i222) | ((-1) - (-16777314))))) & ((-1) - (i222 ^ (-16777314))));
                                                int i224 = ~i219;
                                                int i225 = (~((-1) - (((-1) - ((-1) - (((-1) - i223) | ((-1) - i224)))) & ((-1) - (i223 ^ i224))))) | (~((-1) - (((-1) - (iRgb ^ 16777313)) & ((-1) - (iRgb & 16777313)))));
                                                int i226 = ~((i219 & 16777313) | (i219 ^ 16777313));
                                                int i227 = i221 + (((-1) - (((-1) - ((i226 + i225) - (i226 | i225))) & ((-1) - (i225 ^ i226)))) * (-68));
                                                int i228 = ~iRgb;
                                                int i229 = (i228 + i224) - (i228 & i224);
                                                int i230 = (~(((i229 + 16777313) - (i229 | 16777313)) | (i229 ^ 16777313))) * (-68);
                                                int i231 = ((i227 + i230) - (i227 | i230)) + (i230 | i227);
                                                int i232 = ~((-1) - (((-1) - ((-16777314) & i224)) & ((-1) - ((-16777314) ^ i224))));
                                                int i233 = (((i228 + i232) - (i228 | i232)) | (i228 ^ i232)) * 68;
                                                Object[] objArr28 = new Object[1];
                                                l("\u0013\u0018\u0013\u001b\u0002\b\u0007\u001c\u0018\u001a\"\b\u0015\u0010\u0015\n\u0004\b㙠", i218, (byte) ((i231 ^ i233) + ((i233 & i231) << 1)), objArr28);
                                                Object objInvoke4 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke3, objArr26);
                                                int length2 = objArr.length;
                                                for (int i234 = 0; i234 < 2; i234++) {
                                                    Object obj2 = objArr[i234];
                                                    try {
                                                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                        int i235 = windowTouchSlop * (-109);
                                                        int i236 = (i235 & 111) + ((-1) - (((-1) - i235) & ((-1) - 111)));
                                                        int i237 = ~windowTouchSlop;
                                                        int i238 = (-1) - (((-1) - i2) & ((-1) - 1));
                                                        int i239 = ((-1) - (((-1) - (~i238)) & ((-1) - i237))) * (-220);
                                                        int i240 = (((-1) - (((-1) - i236) & ((-1) - i239))) << 1) - (i236 ^ i239);
                                                        int i241 = ~((windowTouchSlop ^ 1) | ((-1) - (((-1) - windowTouchSlop) | ((-1) - 1))));
                                                        int i242 = ~i100;
                                                        int i243 = ((-1) - (((-1) - ((-1) - (((-1) - i241) | ((-1) - i242)))) & ((-1) - (i241 ^ i242)))) * 220;
                                                        int i244 = ((i240 | i243) << 1) - (i243 ^ i240);
                                                        int i245 = ~((i237 & 1) | (i237 ^ 1));
                                                        int i246 = ~((-1) - (((-1) - windowTouchSlop) & ((-1) - (-2))));
                                                        int i247 = (i244 - (~(((i246 & i245) | (i245 ^ i246)) * 110))) - 1;
                                                        Object[] objArr29 = new Object[1];
                                                        k("覍ꥷ\ue2a5莞觧㾙쿍䁒펟姏斚鸔㶀\ue202͚\ufbcf蝀చ\ud914冚\ue10f噼璅꽛䪔\uf0fcዖԄ钀\u1af2ꡗ拢﹏ꜭ䘄뢮堙셽", i247, objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int i248 = -TextUtils.getOffsetAfter("", 0);
                                                        int threadPriority = Process.getThreadPriority(0);
                                                        Object[] objArr30 = new Object[1];
                                                        l("\u0013\u0018\u000b\" \u001b\r\u001c\n\u000b\n\"㗎㗎\u000e\u0002\u0017\u0016\n\u0015 \u0004㘚", ((-1) - (((-1) - i248) | ((-1) - 23))) + ((i248 + 23) - (i248 & 23)), (byte) (35 - (~(-(((((threadPriority + 20) - (20 & threadPriority)) << 1) - (threadPriority ^ 20)) >> 6)))), objArr30);
                                                        if (obj2.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                            int i249 = ~i99;
                                                            Object[] objArr31 = {new int[1], new int[]{i2}, null, new int[]{(i249 + i238) - (i249 | i238)}};
                                                            int i250 = ~((-154876088) | i60);
                                                            int i251 = ~((-1) - (((-1) - (-154876088)) & ((-1) - i2)));
                                                            int i252 = 615478722 + (((i250 + 720897) - (i250 & 720897)) * (-245)) + (i251 * (-245)) + ((i251 | 523271934) * 245);
                                                            int i253 = (((i252 + 16) - (16 & i252)) << 1) - (i252 ^ 16);
                                                            int priority = Thread.currentThread().getPriority();
                                                            int i254 = (((i253 * 217) + (i7 * (-215))) - (~(-(-((~((i253 + priority) - (i253 & priority))) * JfifUtil.MARKER_SOI))))) - 1;
                                                            int i255 = ~i7;
                                                            int i256 = (i255 & i253) | (i253 ^ i255);
                                                            int i257 = ~priority;
                                                            int i258 = ((-1) - (((-1) - (i256 & i257)) & ((-1) - (i256 ^ i257)))) * (-216);
                                                            int i259 = (((i254 + i258) - (i254 & i258)) << 1) - (i254 ^ i258);
                                                            int i260 = i257 ^ i253;
                                                            int i261 = i253 & i257;
                                                            int i262 = ~((i261 + i260) - (i261 & i260));
                                                            int i263 = -(-(((-1) - (((-1) - (i262 & i7)) & ((-1) - (i7 ^ i262)))) * JfifUtil.MARKER_SOI));
                                                            int i264 = (i259 ^ i263) + (((i263 + i259) - (i263 | i259)) << 1);
                                                            int i265 = (i264 << 13) ^ i264;
                                                            int i266 = i265 >>> 17;
                                                            int i267 = ((~i265) & i266) | ((-1) - (((-1) - (~i266)) | ((-1) - i265)));
                                                            int i268 = i267 << 5;
                                                            int i269 = ~i268;
                                                            int i270 = (i269 + i267) - (i269 | i267);
                                                            int i271 = (~i267) & i268;
                                                            ((int[]) objArr31[0])[0] = (i271 + i270) - (i271 & i270);
                                                            return objArr31;
                                                        }
                                                    } catch (Throwable th2) {
                                                        Throwable cause = th2.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                int i272 = (i130 ^ (-62)) + (((i130 - 62) - (i130 | (-62))) << 1);
                                                i130 = (((-1) - (((-1) - i272) | ((-1) - 63))) << 1) + (i272 ^ 63);
                                                i7 = i7;
                                            } catch (Throwable th3) {
                                                Throwable cause2 = th3.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Throwable cause3 = th.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th5;
                                    }
                                }
                                i7 = i7;
                            } catch (Throwable th6) {
                                Throwable cause5 = th6.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            Throwable cause6 = th7.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        Throwable cause7 = th8.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th8;
                    }
                } catch (Throwable th9) {
                    Throwable cause8 = th9.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th9;
                }
            } catch (Throwable th10) {
                Throwable cause9 = th10.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th10;
            }
        } catch (Throwable unused2) {
        }
        Object[] objArr32 = {new int[1], new int[]{i2}, null, new int[]{i2}};
        int iActiveCount = Thread.activeCount();
        int i273 = ~((-1) - (((-1) - (-648366356)) & ((-1) - iActiveCount)));
        int i274 = (((i273 + 660809649) - (i273 & 660809649)) * 262) + 34916189;
        int i275 = ~((-1) - (((-1) - (~iActiveCount)) & ((-1) - (-648366356))));
        int i276 = i274 + (((i275 + 660809649) - (i275 & 660809649)) * 262);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i277 = (i276 * 217) + (i7 * (-215));
        int i278 = -(-((~((i276 ^ iElapsedRealtime) | ((i276 + iElapsedRealtime) - (i276 | iElapsedRealtime)))) * JfifUtil.MARKER_SOI));
        int i279 = (i277 ^ i278) + (((-1) - (((-1) - i277) | ((-1) - i278))) << 1);
        int i280 = ~i7;
        int i281 = (-1) - (((-1) - (i280 & i276)) & ((-1) - (i276 ^ i280)));
        int i282 = ~iElapsedRealtime;
        int i283 = ((i281 & i282) | (i281 ^ i282)) * (-216);
        int i284 = (((i279 + i283) - (i279 & i283)) << 1) - (i283 ^ i279);
        int i285 = ~iElapsedRealtime;
        int i286 = ~((-1) - (((-1) - ((-1) - (((-1) - i285) | ((-1) - i276)))) & ((-1) - (i285 ^ i276))));
        int i287 = i7 ^ i286;
        int i288 = (i286 + i7) - (i286 | i7);
        int i289 = i284 + (((i288 + i287) - (i288 & i287)) * JfifUtil.MARKER_SOI);
        int i290 = i289 << 13;
        int i291 = (-1) - (((-1) - ((i290 + i289) - (i290 & i289))) | ((-1) - (~((-1) - (((-1) - i289) | ((-1) - i290))))));
        int i292 = i291 ^ (i291 >>> 17);
        int i293 = i292 << 5;
        int i294 = (~i293) & i292;
        int i295 = ~i292;
        ((int[]) objArr32[0])[0] = (-1) - (((-1) - ((i295 + i293) - (i295 | i293))) & ((-1) - i294));
        return objArr32;
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 156;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 37;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i7 = i5 + 85;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        k kVar = new k();
        char[] cArrC = k.c(f19312e ^ (-5882309809461882246L), (char[]) charArray, i2);
        kVar.f19939c = 4;
        while (kVar.f19939c < cArrC.length) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            kVar.f19938a = kVar.f19939c - 4;
            int i10 = kVar.f19939c;
            try {
                Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f19312e)};
                Object objA = d.a(-1093976004);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 5);
                    objA = d.a((ViewConfiguration.getTouchSlop() >> 8) + 229, (char) (51004 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "") + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrC[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objA2 = d.a(-912105096);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = d.a(674 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getEdgeSlop() >> 16), 12 - Gravity.getAbsoluteGravity(0, 0), 522683165, false, $$c(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 12))), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
                int i11 = $11 + 53;
                $10 = i11 % 128;
                int i12 = i11 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(java.lang.String r29, int r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.VirtualCardNumberOption.l(java.lang.String, int, byte, java.lang.Object[]):void");
    }

    public final Integer getMaxPaymentNumber() {
        int i2 = 2 % 2;
        int i3 = f19316i;
        int i4 = i3 + 31;
        f19314g = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.maxPaymentNumber;
        int i5 = i3 + 83;
        f19314g = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getName() {
        int i2 = 2 % 2;
        int i3 = f19314g;
        int i4 = i3 + 113;
        f19316i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.name;
        int i6 = i3 + 97;
        f19316i = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getValidityDurationFormat() {
        int i2 = 2 % 2;
        int i3 = f19316i;
        int i4 = i3 + 49;
        f19314g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.validityDurationFormat;
        int i6 = i3 + 85;
        f19314g = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("VirtualCardNumberOption{name='").append(this.name).append("', validityDurationFormat='").append(this.validityDurationFormat).append("', maxPaymentNumber=").append(this.maxPaymentNumber).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f19316i + 79;
        f19314g = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public final void validate() throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19316i + 87;
        f19314g = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        if (str != null && !m.c.c(str, 0, 64)) {
            throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.VIRTUAL_CARD_NUMBER_OPTION, "`name` must contain between 0 and 64 char");
        }
        String str2 = this.validityDurationFormat;
        if (str2 != null) {
            int i4 = f19316i + 11;
            f19314g = i4 % 128;
            if (i4 % 2 == 0 ? !m.c.c(str2, 0, 10) : !m.c.c(str2, 1, 47)) {
                throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.VIRTUAL_CARD_NUMBER_OPTION, "`validityDurationFormat` must contain between 0 and 10 char");
            }
        }
        Integer num = this.maxPaymentNumber;
        if (num != null && num.intValue() > 10000) {
            throw new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.VIRTUAL_CARD_NUMBER_OPTION, "`maxPaymentNumber` must be equals or below 10000");
        }
    }
}
