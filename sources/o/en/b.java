package o.en;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import com.google.zxing.pdf417.PDF417Common;
import fr.antelop.sdk.card.Card;
import fr.antelop.sdk.card.CreateCardRequestBuilder;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import fr.antelop.sdk.digitalcard.DigitalCard;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.settings.WalletSettings;
import fr.antelop.sdk.util.OperationCallback;
import io.sentry.HttpStatusCodeRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;
import o.a.k;
import o.a.l;
import o.bc.b;
import o.bh.d;
import o.cd.d;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int D = 0;

    /* JADX INFO: renamed from: a */
    public static int f24086a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24087b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24088c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24089d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24090e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24091f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24092g = 0;

    /* JADX INFO: renamed from: h */
    public static int f24093h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24094i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24095j = 0;

    /* JADX INFO: renamed from: m */
    public static int f24096m = 0;

    /* JADX INFO: renamed from: n */
    public static int f24097n = 0;

    /* JADX INFO: renamed from: o */
    private static final Semaphore f24098o;

    /* JADX INFO: renamed from: u */
    private static char[] f24099u = null;

    /* JADX INFO: renamed from: v */
    private static long f24100v = 0;

    /* JADX INFO: renamed from: w */
    private static final b f24101w;

    /* JADX INFO: renamed from: y */
    private static int f24102y = 0;

    /* JADX INFO: renamed from: z */
    private static int f24103z = 0;

    /* JADX INFO: renamed from: k */
    private boolean f24104k;

    /* JADX INFO: renamed from: l */
    private boolean f24105l;

    /* JADX INFO: renamed from: p */
    private Context f24106p;

    /* JADX INFO: renamed from: q */
    private o.fm.g f24107q;

    /* JADX INFO: renamed from: r */
    private o.eo.e f24108r;

    /* JADX INFO: renamed from: s */
    private o.fr.e f24109s;

    /* JADX INFO: renamed from: t */
    private o.em.d f24110t;

    /* JADX INFO: renamed from: x */
    private o.cc.d f24111x;

    /* JADX INFO: renamed from: o.en.b$2 */
    public class AnonymousClass2 implements o.cc.c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int[] f24112a = null;

        /* JADX INFO: renamed from: b */
        private static long f24113b = 0;

        /* JADX INFO: renamed from: d */
        private static int f24114d = 0;

        /* JADX INFO: renamed from: f */
        private static int f24115f = 0;

        /* JADX INFO: renamed from: g */
        public static int f24116g = 0;

        /* JADX INFO: renamed from: h */
        public static int f24117h = 0;

        /* JADX INFO: renamed from: i */
        public static int f24118i = 0;

        /* JADX INFO: renamed from: j */
        public static int f24119j = 0;

        /* JADX INFO: renamed from: k */
        public static int f24120k = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f24122e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(short r8, byte r9, int r10) {
            /*
                int r2 = r8 * 4
                int r1 = 1 - r2
                byte[] r8 = o.en.b.AnonymousClass2.$$c
                int r0 = r9 * 2
                int r7 = r0 + 4
                int r6 = 121 - r10
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r8 != 0) goto L2e
                r6 = r3
                r1 = r7
                r2 = r4
            L16:
                int r7 = r7 + r6
                int r0 = r1 + 1
                r1 = r2
                r6 = r7
                r7 = r0
            L1c:
                byte r0 = (byte) r6
                r5[r1] = r0
                int r2 = r1 + 1
                if (r1 != r3) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L29:
                r0 = r8[r7]
                r1 = r7
                r7 = r0
                goto L16
            L2e:
                r1 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.en.b.AnonymousClass2.$$g(short, byte, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f24120k = -827474909;
            f24119j = 716090485;
            f24118i = -224369276;
            f24117h = -1521863491;
            f24116g = -785443339;
            init$0();
            f24114d = 0;
            f24115f = 1;
            f24113b = 2632062672379965606L;
            f24112a = new int[]{-709484073, 317994825, 1178951768, -699635019, 28960596, 712720761, 542527384, 1575977355, 1758789399, -1292536486, 1597140095, -680961279, 1829146288, -1690873986, 586003398, 95309274, 530706796, -742468096};
        }

        AnonymousClass2(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        public static void a(Context context, long j2, long j3) throws Throwable {
            int i2 = 2 % 2;
            long j4 = j2 ^ (j3 << 32);
            int i3 = f24115f + 43;
            f24114d = i3 % 128;
            int i4 = i3 % 2;
            try {
                Method method = o.ea.f.class.getMethod("a", null);
                method.setAccessible(true);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    l("횊➼훏䔍襘䲕䜏嶛濷즄᷒\udb81쀮幥遹僦璹⋤⓴ꕼﬤ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    l("\uda2cꄶ\uda5e쎋雘匓冫儊祏伓ɉ촿첹\ud8eb迧䙾砒ꑬ㭲동\uf783㇄ꀆ⽾捲뵎\u2dbf飮黸د夨ᐏਖ਼鎾웻臆膌Ἔ牂ﴩ㲨\ue88fￚ皧ꠉ瑤歽\ue3d2➎쇵郵彆匉䵄ᶟ죘컳훞褞䐱稬", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
                    Object[] objArr3 = {((String) objArr2[0]).intern()};
                    Object[] objArr4 = new Object[1];
                    m(new int[]{1772474376, -1279511369, 78533135, 1152369342}, View.resolveSize(0, 0) + 6, objArr4);
                    Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    m(new int[]{1772474376, -1279511369, 78533135, 1152369342}, TextUtils.indexOf("", "", 0, 0) + 6, objArr6);
                    Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    m(new int[]{-170048866, 2094395469, -1226399091, 993064450}, 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = o.ea.f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                }
                int i5 = $$e;
                byte b2 = (byte) ((-1) - (((-1) - i5) | ((-1) - 5)));
                byte b3 = (byte) 0;
                Object[] objArr9 = new Object[1];
                n(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 6))), b3, objArr9);
                Class<?> cls = Class.forName((String) objArr9[0]);
                byte b4 = b3;
                byte b5 = (byte) (b4 + 1);
                Object[] objArr10 = new Object[1];
                n(b3, b4, b5, objArr10);
                Method method6 = cls.getMethod((String) objArr10[0], null);
                method6.setAccessible(true);
                Object objInvoke3 = method6.invoke(null, null);
                int i6 = (int) j4;
                byte b6 = (byte) ((i5 + 5) - (5 | i5));
                Object[] objArr11 = new Object[1];
                n(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b3, objArr11);
                Class.forName((String) objArr11[0]).getField("b").setInt(objInvoke3, i6);
                byte b7 = (byte) (5 & i5);
                Object[] objArr12 = new Object[1];
                n(b7, (byte) (6 | b7), b3, objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                n(b3, b4, b5, objArr13);
                Method method7 = cls2.getMethod((String) objArr13[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(null, null);
                byte b8 = (byte) (5 & i5);
                Object[] objArr14 = new Object[1];
                n(b8, (byte) ((b8 + 6) - (6 & b8)), b3, objArr14);
                Object objInvoke5 = context;
                if (Class.forName((String) objArr14[0]).getField("d").getBoolean(objInvoke4)) {
                    return;
                }
                if (context == null) {
                    byte b9 = (byte) (b3 + 1);
                    Object[] objArr15 = new Object[1];
                    n(b3, b9, b9, objArr15);
                    Method method8 = b.class.getMethod((String) objArr15[0], null);
                    method8.setAccessible(true);
                    Object objInvoke6 = method8.invoke(null, null);
                    Object[] objArr16 = new Object[1];
                    n(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 8))), (byte) (5 & i5), objArr16);
                    Method method9 = b.class.getMethod((String) objArr16[0], null);
                    method9.setAccessible(true);
                    objInvoke5 = method9.invoke(objInvoke6, null);
                }
                if (objInvoke5 != null) {
                    byte b10 = (byte) (b3 + 1);
                    Object[] objArr17 = new Object[1];
                    n(b3, b10, b10, objArr17);
                    Method method10 = b.class.getMethod((String) objArr17[0], null);
                    method10.setAccessible(true);
                    Object objInvoke7 = method10.invoke(null, null);
                    Object[] objArr18 = new Object[1];
                    n(b3, b4, b5, objArr18);
                    Method method11 = b.class.getMethod((String) objArr18[0], null);
                    method11.setAccessible(true);
                    if (((Boolean) method11.invoke(objInvoke7, null)).booleanValue()) {
                        int i7 = f24115f + 71;
                        f24114d = i7 % 128;
                        int i8 = i7 % 2;
                        byte length = (byte) $$d.length;
                        Object[] objArr19 = new Object[1];
                        n(b3, length, (byte) ((length + 7) - (7 | length)), objArr19);
                        b.class.getMethod((String) objArr19[0], null).setAccessible(true);
                        if (!(!((Boolean) r0.invoke(objInvoke7, null)).booleanValue())) {
                            Method method12 = o.dc.d.class.getMethod("a", null);
                            method12.setAccessible(true);
                            Object objInvoke8 = method12.invoke(null, null);
                            Object[] objArr20 = {o.az.a.class.getField("b").get(null), o.dd.g.class.getField("z").get(null)};
                            Constructor declaredConstructor2 = o.dd.e.class.getDeclaredConstructor(o.az.a.class, o.dd.g.class);
                            declaredConstructor2.setAccessible(true);
                            Object[] objArr21 = {objInvoke5, declaredConstructor2.newInstance(objArr20), true};
                            Method method13 = o.dc.d.class.getMethod("b", Context.class, o.dd.e.class, Boolean.TYPE);
                            method13.setAccessible(true);
                            method13.invoke(objInvoke8, objArr21);
                            byte b11 = (byte) (5 & i5);
                            Object[] objArr22 = new Object[1];
                            n(b11, (byte) ((-1) - (((-1) - b11) & ((-1) - 6))), b3, objArr22);
                            Class<?> cls3 = Class.forName((String) objArr22[0]);
                            Object[] objArr23 = new Object[1];
                            n(b3, b4, b5, objArr23);
                            Method method14 = cls3.getMethod((String) objArr23[0], null);
                            method14.setAccessible(true);
                            Object objInvoke9 = method14.invoke(null, null);
                            byte b12 = (byte) ((i5 + 5) - (i5 | 5));
                            Object[] objArr24 = new Object[1];
                            n(b12, (byte) ((b12 + 6) - (6 & b12)), b3, objArr24);
                            Class.forName((String) objArr24[0]).getField("d").setBoolean(objInvoke9, true);
                            int i9 = f24115f + 1;
                            f24114d = i9 % 128;
                            int i10 = i9 % 2;
                            return;
                        }
                    }
                    Method method15 = o.ea.f.class.getMethod("a", null);
                    method15.setAccessible(true);
                    if (((Boolean) method15.invoke(null, null)).booleanValue()) {
                        Object[] objArr25 = new Object[1];
                        l("횊➼훏䔍襘䲕䜏嶛濷즄᷒\udb81쀮幥遹僦璹⋤⓴ꕼﬤ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr25);
                        String strIntern2 = ((String) objArr25[0]).intern();
                        Object[] objArr26 = new Object[1];
                        l("瀠햔灒뜩㠝\ufdd6衪ﬆꂎ㮱게ᓾ暵걉™龿툞탎閷樘嶏䕦ໃ\uf6bf쥾짬荺䄯㓴犍\uf7ed췎ꁕ\ue71c栾堇⮀殟\udc8f⓶隼鰽儊꼪ȮÇ얺㩚趙땖㸷蚞契㧩덂ᄳ擪ꉽ⟚鷪큯휚頮案寅宖\u0cf0\uf4c3읎찯腂缺㈣炳\uf597쯺", Process.myPid() >> 22, objArr26);
                        Object[] objArr27 = {strIntern2, ((String) objArr26[0]).intern()};
                        Method method16 = o.ea.f.class.getMethod("c", String.class, Object.class);
                        method16.setAccessible(true);
                        method16.invoke(null, objArr27);
                    }
                    int i11 = f24115f + 103;
                    f24114d = i11 % 128;
                    int i12 = i11 % 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:203|143|(1:145)(4:146|204|147|(8:149|155|201|156|(2:159|(1:161)(1:157))(4:164|194|165|166)|(4:200|170|(2:172|179)(4:173|196|174|175)|(2:184|185))|181|182)(1:150))|154|155|201|156|(0)(0)|(0)|181|182) */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0137: ARITH (r4 I:??[int, boolean]) = (r6 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:125:0x0137 */
        /* JADX WARN: Removed duplicated region for block: B:159:0x043e  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x044e A[Catch: Exception -> 0x043a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x043a, blocks: (B:156:0x041a, B:164:0x044e, B:166:0x047b, B:168:0x0483, B:169:0x0489, B:165:0x0458), top: B:201:0x041a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:200:0x048a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(int r23, int r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1562
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.en.b.AnonymousClass2.e(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{76, -81, MessagePack.Code.EXT16, -107};
            $$b = 87;
        }

        static void init$1() {
            $$d = new byte[]{95, MessagePack.Code.FALSE, -107, -90, MessagePack.Code.BIN8, 57, 19, MessagePack.Code.TRUE, 60};
            $$e = 91;
        }

        static void init$2() {
            $$c = new byte[]{85, Ascii.RS, 127, 42};
            $$f = 199;
        }

        private static void l(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 77;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            k kVar = new k();
            char[] cArrC = k.c(f24113b ^ (-5882309809461882246L), (char[]) charArray, i2);
            int i6 = 4;
            kVar.f19939c = 4;
            while (true) {
                obj = null;
                if (kVar.f19939c >= cArrC.length) {
                    break;
                }
                kVar.f19938a = kVar.f19939c - i6;
                int i7 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i6]), Long.valueOf(kVar.f19938a), Long.valueOf(f24113b)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 229, (char) (51004 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 10, 1749983833, false, $$g(b2, b3, (byte) ((b3 + Ascii.SO) - (14 & b3))), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 675, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0) + 12, 522683165, false, $$g(b4, b5, (byte) (7 | b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    i6 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str3 = new String(cArrC, 4, cArrC.length - 4);
            int i8 = $11 + 69;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                objArr[0] = str3;
            } else {
                obj.hashCode();
                throw null;
            }
        }

        private static void m(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f24112a;
            int i5 = 989264422;
            int i6 = 1;
            int i7 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 27;
                    $11 = i9 % 128;
                    int i10 = i9 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - TextUtils.indexOf("", "", i7, i7), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), -328001469, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i8++;
                        i3 = 2;
                        i5 = 989264422;
                        i7 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i11 = $10 + 35;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = f24112a;
            long j2 = 0;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    int i14 = $11 + i6;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(676 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, -328001469, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                        i13 <<= 1;
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 676, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -328001469, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        i13++;
                    }
                    j2 = 0;
                    i6 = 1;
                }
                iArr5 = iArr6;
            }
            char c2 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            lVar.f19941d = 0;
            while (lVar.f19941d < iArr.length) {
                cArr[c2] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    lVar.f19942e ^= iArr4[i15];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(301 - ExpandableListView.getPackedPositionType(0L), (char) (52697 - ExpandableListView.getPackedPositionGroup(0L)), Process.getGidForName("") + 12, -1416256172, false, $$g(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i15++;
                    int i19 = $10 + 83;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                }
                int i21 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i21;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i22 = lVar.f19942e;
                int i23 = lVar.f19940a;
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
                    byte b10 = (byte) 0;
                    objA5 = o.d.d.a(229 - View.resolveSize(0, 0), (char) ((Process.myTid() >> 22) + 51004), 9 - KeyEvent.normalizeMetaState(0), -330018025, false, $$g(b10, b10, (byte) $$c.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                c2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void n(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = r7 * 5
                int r7 = 9 - r0
                int r0 = r8 * 2
                int r6 = r0 + 97
                int r1 = r9 * 5
                int r0 = 6 - r1
                byte[] r5 = o.en.b.AnonymousClass2.$$d
                byte[] r4 = new byte[r0]
                int r3 = 5 - r1
                r2 = 0
                if (r5 != 0) goto L2f
                r0 = r6
                r6 = r3
                r1 = r2
            L18:
                int r7 = r7 + 1
                int r6 = r6 + r0
                int r6 = r6 + (-5)
            L1d:
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r1 != r3) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r2)
                r10[r2] = r0
                return
            L2a:
                int r1 = r1 + 1
                r0 = r5[r7]
                goto L18
            L2f:
                r1 = r2
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: o.en.b.AnonymousClass2.n(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void o(byte r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r0 = r7 * 2
                int r7 = r0 + 4
                int r0 = r9 * 4
                int r6 = r0 + 100
                int r1 = r8 * 2
                int r0 = 1 - r1
                byte[] r5 = o.en.b.AnonymousClass2.$$a
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r5 != 0) goto L2d
                r0 = r7
                r1 = r3
            L17:
                int r7 = r7 + 1
                int r0 = -r0
                int r6 = r6 + r0
            L1b:
                byte r0 = (byte) r6
                r4[r1] = r0
                if (r1 != r2) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L28:
                r0 = r5[r7]
                int r1 = r1 + 1
                goto L17
            L2d:
                r1 = r3
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.en.b.AnonymousClass2.o(byte, short, byte, java.lang.Object[]):void");
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24114d + 99;
            int i4 = i3 % 128;
            f24115f = i4;
            int i5 = i3 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = i4 + 81;
                f24114d = i6 % 128;
                int i7 = i6 % 2;
                operationCallback.onSuccess(null);
            }
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i3 = f24114d + 1;
                f24115f = i3 % 128;
                if (i3 % 2 == 0) {
                    operationCallback.onError(o.by.c.b(cVar).a());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                operationCallback.onError(o.by.c.b(cVar).a());
            }
            int i4 = f24115f + 101;
            f24114d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: o.en.b$3 */
    final class AnonymousClass3 implements o.cc.c {

        /* JADX INFO: renamed from: a */
        private static int f24123a = 0;

        /* JADX INFO: renamed from: b */
        private static int f24124b = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f24126e;

        AnonymousClass3(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // o.cc.c
        public final void a() {
            int i2 = 2 % 2;
            int i3 = f24123a;
            int i4 = i3 + 15;
            f24124b = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                throw null;
            }
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i5 = i3 + 33;
                f24124b = i5 % 128;
                if (i5 % 2 == 0) {
                    operationCallback.onSuccess(null);
                    int i6 = 0 / 0;
                } else {
                    operationCallback.onSuccess(null);
                }
            }
            int i7 = f24123a;
            int i8 = ((i7 + 31) - (31 | i7)) + ((-1) - (((-1) - i7) & ((-1) - 31)));
            f24124b = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.cc.c
        public final void e(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24123a;
            int i4 = ((i3 + 57) - (57 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 57)));
            f24124b = i4 % 128;
            int i5 = i4 % 2;
            OperationCallback operationCallback = operationCallback;
            if (operationCallback != null) {
                int i6 = ((45 | i3) << 1) - (i3 ^ 45);
                f24124b = i6 % 128;
                int i7 = i6 % 2;
                operationCallback.onError(o.by.c.b(cVar).a());
                int i8 = f24123a + 69;
                f24124b = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 5;
                }
            }
            int i10 = f24124b + 95;
            f24123a = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    /* JADX INFO: renamed from: o.en.b$5 */
    final class AnonymousClass5 implements b.InterfaceC0338b {

        /* JADX INFO: renamed from: a */
        private static int f24127a = 0;

        /* JADX INFO: renamed from: b */
        private static int f24128b = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f24130e;

        AnonymousClass5(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        @Override // o.bc.b.InterfaceC0338b
        public final void d(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24128b;
            int i4 = (i3 & 35) + ((i3 + 35) - (i3 & 35));
            f24127a = i4 % 128;
            int i5 = i4 % 2;
            if (cVar.e().c()) {
                int i6 = f24127a;
                int i7 = (i6 ^ 123) + (((-1) - (((-1) - i6) | ((-1) - 123))) << 1);
                f24128b = i7 % 128;
                if (i7 % 2 == 0) {
                    b.c();
                    b.r();
                    throw null;
                }
                b.c();
                b.r();
                int i8 = f24128b;
                int i9 = (i8 ^ 73) + (((-1) - (((-1) - i8) | ((-1) - 73))) << 1);
                f24127a = i9 % 128;
                int i10 = i9 % 2;
            }
            operationCallback.onSuccess(null);
            int i11 = f24127a + 41;
            f24128b = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.bc.b.InterfaceC0338b
        public final void e(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24127a + 49;
            f24128b = i3 % 128;
            int i4 = i3 % 2;
            if (cVar.e().c()) {
                int i5 = f24128b + 57;
                f24127a = i5 % 128;
                if (i5 % 2 != 0) {
                    b.c();
                    b.r();
                    throw null;
                }
                b.c();
                b.r();
            }
            operationCallback.onError(o.by.c.b(cVar).a());
            int i6 = f24128b + 121;
            f24127a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 43 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, byte r6, int r7) {
        /*
            int r2 = r7 * 2
            int r1 = 1 - r2
            int r7 = r6 + 99
            byte[] r6 = o.en.b.$$a
            int r0 = r5 * 2
            int r5 = r0 + 4
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r6 != 0) goto L2a
            r7 = r5
            r1 = r2
            r0 = r3
        L16:
            int r5 = r5 + 1
            int r7 = r7 + r1
            r1 = r0
        L1a:
            byte r0 = (byte) r7
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r1 = r6[r5]
            goto L16
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24096m = -1290475052;
        f24097n = -220192549;
        f24093h = -1794222287;
        f24092g = 1023994390;
        f24091f = 579824033;
        f24094i = -1882530190;
        f24095j = 1860938961;
        f24087b = 147275824;
        f24090e = -1372940797;
        f24088c = 1937293420;
        f24086a = -1748522430;
        f24089d = 460106413;
        D = 0;
        A = 1;
        f24102y = 0;
        f24103z = 1;
        B();
        ViewConfiguration.getKeyRepeatDelay();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getGlobalActionKeyTimeout();
        TypedValue.complexToFloat(0);
        Color.alpha(0);
        ViewConfiguration.getZoomControlsTimeout();
        f24098o = new Semaphore(1);
        f24101w = new b();
        int i2 = A + 111;
        D = i2 % 128;
        int i3 = i2 % 2;
    }

    private b() {
    }

    static void B() {
        char[] cArr = new char[1158];
        ByteBuffer.wrap("\u0094»Jì(|\u000fÇí@Ì\u0095¢3\u0081\u008eg\u001eEg$æ\u0094\u009bJì({\u000fÖí[Ì£¢>\u0081\u008bg\bEgâ-<Z^Íy`\u009bíº\u0015Ô\u0088÷=\u0011¾3ÑR\u0004l¹\u008f$©\u0091È\u001cê·\u0005!'DAÐ`}\u0082ëÝ\u001aÿÄ\u001e18ªZ×uK\u0097á¶jÐ\u0080ó\u0001\r¦,!NPh\u0084\u008bc¥ìÄ\u001dæ\u0088\u00011#ä}Ý\u009cJ¾ýÙpû\u009d\u001a\u00054¸W-qN\u0093Í²zÌãïT\t\u0093(5J¨dØ\u0087A¡à\u0006®ØÙºN\u009dã\u007fn^\u00960\u000b\u0013¾õ=×R¶\u0087\u0088:k§M\u0011,\u008b\u000e\"á´Ãß¥N\u0084ùf`9×\u001b\u0002ú¯Ü.¾D\u0091Ós~Ré4\u0010\u0017Çé4È¨ªÙ\u008cAoþA` \u0082\u0002\u0015å¶Ç3\u0099^xÈZy#;ýN\u009fÊ¸\u007fZú{\u001b;,åY\u0087Ý hBíc\f\rÙ.dÈùêÚ\u008bLµêVzp\u008c\u0011\n3º¼[b.\u0000ª'\u001fÅ\u009aä{\u008a®©\u0013O\u008em¸\f/2\u0097Ñ\u0002÷ë\u0096|´Û[\u000eys\u001fî>)Ü\u008f\u0083r¡â@[fÚ\u0004\u009d+!É\u0090è\b\u008e÷\u00adiSËr\\\u0010?6ºÕ\u0017û\u0081\u009ap¸Ë_F}Í#»Â>à\u008a\u0087\u0007¥ñD`j\u009e\tK/0Í\u00adì\u0011\u0092\u009b±pWúv[\u0014Ü:»Ù*\u0010zÎ\u001c¬\u009d\u008b\u001di¬H_&È\u0005lãåÁ\u008d *\u009e¸};[Ý:\t\u0018£÷)\u0094±Jã(`\u000fÆ\u0018\u0016ÆP¤Í\u0083}aä@\u0005\u00ad\u0001sG\u0011Ú6jÔóõ\u0012\u009bÖ¸/^¥|\u0086\u001dX#éÀbæÆ\u0087\u0004¥³J8hH\u000eß/hÍñ\u0092J°ÖQ%w¹\u0015È:XØãùu\u009f\u0092¼\u001fB©c8\u0001\u0006'ÄÄcêç\u008b\u0013©\u009fN4l³2Â\u0094¦Jê(w\u000f\u0082íUÌ«¢$\u0081\u0087g\u001cE\"$ñ\u001aCùÀß&¾ò\u009c\u000bs\u0081Q¢7|\u0016ÍôF«â\u0089\"h\u0090N\u001d,t\u0003ûáQÀÛ¦-\u0085¼{\u0007Z\u0096\u0094¦Jç(`\u000fÏíAÌâ¢3\u0081\u008cg\u0016E\"$ñ\u001aMùÜß&¾»\u009c\u0016s\u009bQí7|\u0016Ñô\u0012«´\u00893h\u008eN\u001b,f\u0003óáVÀÛ¦-\u0085¼{BZ\u009b8ñ\u001e2ýÐÓW²³\u0090'w\u008bU\u0000\u000bgêö\u0094\u0081Jç(f\u000fìíWÌº¢&\u0081¶g\u0000Ec$ü\u001aQùÓß!¾¦\u009c\u000bs\u009dQì7Q\u0016Ãô@«¦\u0089rhØNR\u0083Á]³?2\u0018¸ú\u0003Ûîµr\u0096âpTR73¨\r\u0005î\u0087Èu©ò\u008b_dÉF¸ \u0005\u0001\u0097ã\u0014¼ò\u009eO\u007fÒ\u0094\u0080Jç(a\u000fÇíFÌ\u008c¢7\u0081\u009ag\u0006EV$à\u001aCùÜß1¾³\u009c\u0001s\u0086Që7}\u0016Ìôq«£\u0089 h\u0086\u0094\u0091Jã(`\u000fÆíAÌâ¢\u007f\u0081Âg\u001bEl$ñ\u001aNùÇß&¾·\u009c,s\u009dQö7B\u0016Ðô]«´\u0089;h\u0091N\u001b,m\u0003üáGÀÖ¦\u0001\u0085³{\u0010Z\u00968ñ\u001e(ý\u0082\u0094\u0096Jë(u\u000fËíFÌ£¢>\u0081¡g\u0013Ep$ö\u001aQù\u0092ßo¾ò\u009c\u000bs\u009cQá7~\u0016×ôV«§\u0089\u001ch\u008dN\u0006,R\u0003àáMÀÄ¦+\u0085¡{\u000bZ\u009d8ì\u001ewýÆÓq²£\u0090 w\u0086U\u0001\u000b8ê²\u0094ÿJ\u008d(\f\u000f\u008bí9ÌÚ¢\\\u0081¨g5EH$\u009b\u001a)ùªßL¾ñ\u009cls¢QÈÈ!\u0016StÒSR±ï\u0090\u0011þ\u008fÝ\";§\u0019ÚxeF÷¥t\u0083\u0092âFÀû/f\rUkÇJd¨â÷?Õ\u00824l\u0012æuØ«\u0080É\u000bî\u008c\f--ÝCQ`ä\u0086~¤\fÅ\u0089û$\u0018²>C\u0017\u0095Éç«f\u008cçn_O´!\u0013\u0002\u0092ä\u0002Æn§û\u0099AzÓ\\6=»\u001f\rð\u009cÒ¢´?\u0095\u0082wW(¯\n$ë£Í\u0002¯r\u0080þbKCÑ%#\u0006¦ø\u000bÙ\u009d»ì\u009d[~ÆP\b1âÏ\u0089\u0011ðsoTÕ¶M\u0097´ù\rÚ\u009e<\u0002\u001ez\u0094\u009aJã(|\u000fÆí^Ì§¢\u001e\u0081\u008dg\u0015Em$ç\u001aV\u0094\u009aJã(|\u000fÆí^Ì§¢\u0016\u0081\u0087g\u001eEg$æ\u001aG\u0094\u009aJã(|\u000fÆí^Ì§¢\u0016\u0081\u0087g\u001eEg$æ\u001aGù\u0092ßo¾ò\u009c\u0007s\u008aQá7w\u0016ÒôF««\u0089=h\u008cNR,u\u0003úáGÀÜ¦b\u0085´{\u000eZ\u00878ñ\u001ezýËÓ\\²¥\u0090rw\u0083U\u0011\u000bvêûÈT¯Ó\u008d6l»B\r!\u009c\u0007ÎåaÄÉºb\u0099°\u007f=^\u0094<\u001b\u0012fñ÷×P\u0094\u0086Jð({\u000fÅíUÌ§¢ \u0081¡g\u0013Ep$ö\u001afù×ß.¾·\u009c\u0016s\u0097Q¢7?\u0016\u0082ôQ«£\u0089 h\u0086N;,f\u0003²á\u0018À\u0092Ê\u000b\u0014}vöQH³Ø\u0092*ü\u00adß,9\u009e\u001býz{Dú§O\u0081«à>Â\u009b-\u001a\u000f/i²H\u000fªÜõ.×\u00ad6\u000b\u0010¶rë]?¿\u0095\u009e\u001f\u0094\u0086Jð({\u000fÅíUÌ§¢ \u0081¡g\u0013Ep$ö\u001anùÝß!¾¹\u009cBsßQ¢7q\u0016Ãô@«¦\u0089\u001bh\u0086NR,8\u0003²\u0094\u0082Jç(`\u000fÑí[Ì±¢&\u0081\u008bg\u001cEe$²\u001aWùÂß&¾³\u009c\u0016s\u0097Qæ72\u0016ÕôS«®\u0089>h\u0087N\u0006,\"\u0003ñáMÀÜ¦$\u0085»{\u0005Z\u00878ð\u001esýÖÓ[²\u00ad\u0090<\u0094\u009bJñ(@\u000f×í\\Ì¬¢;\u0081\u008cg\u0015E*$»\u001a\u0002ù\u009fßb¾\u009b\u009c\fs\u0086Qç7`\u0016ÐôG«²\u0089&h\u0087N\u0016,G\u0003êáAÀ×¦2\u0085¦{\u000bZ\u009d8ì\u001e2ýÕÓZ²«\u0090>w\u0087UR\u000buêóÈK¯Æ\u008d+l¼B\u0005!Ò\u0007äå}ÄÐº\u0012\u0099µ\u007f3^\u008e<\u001e\u0012gñæ×\u0002¶Ç\u00942K¶)\u0003\b\u0086îçÌ2£Î\u0081]`¡F9\u0094\u0080Jç(c\u000f×íWÌ±¢&\u0081¤g\u001dEp$Å\u001aCùÞß.¾·\u009c\u0016s§Qò7v\u0016ÃôF«§\u0089rhÏNR,c\u0003ááIÀ\u0092¦$\u0085½{\u0010ZÒ8ñ\u001ewýÏÓS²²\u0090:w\u008dU\u0000\u000bg\u0094\u0080Jç(c\u000f×íWÌ±¢&\u0081¤g\u001dEp$Å\u001aCùÞß.¾·\u009c\u0016s§Qò7v\u0016ÃôF«§\u0089rhÏNR,q\u0003÷áOÀÓ¦2\u0085º{\rZ\u00808ç\u001e2ýÃÓQ²³\u0090'w\u008bU\u0000\u000bgêöôY*>H§o\u001e\u008d\u008a¬hÂîáz\u0007Í%¯D.z\u0089\u0099<¿úÞgü×\u0013N1/W\u009ev\u000b\u0094\u008fËzéÿ\b^.\u008bLöck\u0081\u0089 \u000eÆ÷ån\u001bÚ:XX>~ë\u009d\b³\u008eÒvðê\u0017K5Ãk´\u008a9¨\u009eÚ¯\u0004îfiAÝ£X\u0082¹ì\u000fÏ\u009d)\u001e\u000bxjÞTY·Ý\u0091)ð©Ò\u000f=\u0098\u001fÞyyXÕº@å¸Ç)&\u008e\u0094\u0091Jð(w\u000fÃíFÌ§¢\u0011\u0081\u0083g\u0000Ef\u001d5Ãh¡ö\u0086HdÅE +½\b\"î\u0090Ìó\u00adu\u0093äp_V³7>\u0015\u008dú\u001dØl¾ô\u009fO}Å\"\u0005\u0000°á\u0015Ç\u0090\u0094\u0097Jì(`\u000fÍí^Ì®¢\u0016\u0081\u008bg\u0015Ek$æ\u001aCùÞß\u0001¾³\u009c\u0010s\u0096\u001cóÂ\u0081 \u0000\u0087\u0092e D×*w\tèï}Í\u0001¬\u009a\u00920q\u0083WE6Ø\u0014hûñÙ\u0090¿5\u009e§|7#Ë\u0001AàêÆ`¤-\u008b\u0090idHù.\u0004\rÝówÒç°\u0091\u0096\u0011u¶[t:í\u0018Pÿ¤Ýz\u0083\u000bb\u0080@d'§\u0005AäÀ\fÒÒµ°&\u0097\u0082u\u0005Tã:h\u0019ôÿIÝ7¼©\u0082\u0004a\u0081G|&Ã\u0004QëÒÉ´¯3".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1158);
        f24099u = cArr;
        f24100v = 1018362526565681794L;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void C(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.C(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0249 A[PHI: r2
  0x0249: PHI (r2v46 java.lang.String) = (r2v31 java.lang.String), (r2v54 java.lang.String) binds: [B:115:0x0372, B:98:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(int r16, int r17, java.lang.Object[] r18, int r19, int r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.a(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24102y + 123;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int priority = Thread.currentThread().getPriority();
        int i5 = f24088c * (-1721916949);
        f24088c = i5;
        X509Certificate x509CertificateL = ((o.fm.g) a(-568976488, elapsedCpuTime, new Object[]{bVar}, iUptimeMillis, 568976490, priority, i5)).l();
        int i6 = f24102y + 11;
        f24103z = i6 % 128;
        if (i6 % 2 != 0) {
            return x509CertificateL;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24102y + 23;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        o.fm.g gVar = bVar.f24107q;
        if (i4 != 0) {
            return gVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24102y + 41;
        int i4 = i3 % 128;
        f24103z = i4;
        int i5 = i3 % 2;
        o.fr.e eVar = bVar.f24109s;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f24102y = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public static b c() {
        int i2 = 2 % 2;
        int i3 = f24103z + 35;
        int i4 = i3 % 128;
        f24102y = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = f24101w;
        int i5 = i4 + 123;
        f24103z = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return bVar;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24103z + 71;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        String strJ = bVar.f24107q.j();
        int i5 = f24102y + 125;
        f24103z = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return strJ;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24103z + 113;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        Context context = bVar.f24106p;
        if (i4 != 0) {
            int i5 = 12 / 0;
        }
        return context;
    }

    public static void e(Context context, boolean z2) {
        int i2 = 2 % 2;
        new o.cd.d();
        d.C0347d c0347dB = o.cd.d.b(context);
        if (!(!z2)) {
            int i3 = f24102y + 93;
            f24103z = i3 % 128;
            int i4 = i3 % 2;
            c0347dB.e();
            return;
        }
        c0347dB.b();
        int i5 = f24103z + 67;
        f24102y = i5 % 128;
        int i6 = i5 % 2;
    }

    static void init$0() {
        $$a = new byte[]{54, MessagePack.Code.BIN8, MessagePack.Code.UINT64, -16};
        $$b = 211;
    }

    public static void r() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 9;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24102y + 111;
            f24103z = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            C((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (TextUtils.indexOf("", "", 0) + 24793), 971 - Process.getGidForName(""), 44 - View.combineMeasuredStates(0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f24103z + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f24102y = i7 % 128;
            int i8 = i7 % 2;
        }
        f24098o.release();
    }

    public static void t() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24103z + 95;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24102y + 101;
            f24103z = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            C((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1) - ExpandableListView.getPackedPositionChild(0L), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) TextUtils.getCapsMode("", 0, 0), (-16776329) - Color.rgb(0, 0, 0), 42 - Drawable.resolveOpacity(0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f24102y + 49;
            f24103z = i7 % 128;
            int i8 = i7 % 2;
        }
        f24098o.acquire();
        if (o.ea.f.a()) {
            Object[] objArr3 = new Object[1];
            C((char) TextUtils.getOffsetBefore("", 0), ViewConfiguration.getFadingEdgeLength() >> 16, 11 - TextUtils.getCapsMode("", 0, 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            C((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.alpha(0) + PDF417Common.NUMBER_OF_CODEWORDS, 43 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
            o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            int i9 = f24103z + 41;
            f24102y = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public final Card a(String str) throws Throwable {
        int i2 = 2 % 2;
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            C((char) Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 223, TextUtils.indexOf("", "", 0) + 4, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            C((char) View.resolveSize(0, 0), (-1) - Process.getGidForName(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            C((char) (106 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 503 - Color.alpha(0), Process.getGidForName("") + 19, objArr3);
            o.ea.f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(str).toString());
        }
        o.ep.d dVar = this.f24110t.g().get(str);
        if (dVar != null) {
            int i3 = f24102y + 1;
            f24103z = i3 % 128;
            int i4 = i3 % 2;
            if (dVar.i() == e.f24190c) {
                Card card = new Card(dVar);
                int i5 = f24103z + 13;
                f24102y = i5 % 128;
                int i6 = i5 % 2;
                return card;
            }
        }
        int i7 = f24103z + 105;
        f24102y = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final Map<String, Card> a(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24103z + 97;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) View.MeasureSpec.getMode(0), ViewConfiguration.getFadingEdgeLength() >> 16, MotionEvent.axisFromString("") + 12, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            C((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 424 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 36 - TextUtils.indexOf("", ""), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z2).toString());
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, o.ep.d> entry : this.f24110t.e(z2).entrySet()) {
            if (entry.getValue().i() == e.f24190c) {
                map.put(entry.getKey(), new Card(entry.getValue()));
            }
            int i5 = f24102y + 89;
            f24103z = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 4;
            }
        }
        return map;
    }

    public final void a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 73;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24103z + 65;
            f24102y = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            C((char) View.resolveSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) View.getDefaultSize(0, 0), 608 - Color.alpha(0), View.MeasureSpec.getSize(0) + 12, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        new o.dt.d();
        o.dt.d.b().e();
        this.f24110t.a();
        this.f24110t.f().a();
        this.f24110t.b(context);
        int i7 = f24103z + 49;
        f24102y = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 66 / 0;
        }
    }

    public final void a(Context context, CreateCardRequestBuilder createCardRequestBuilder, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 107;
        f24103z = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (createCardRequestBuilder == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            C((char) (19999 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1017 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24 - View.MeasureSpec.getSize(0), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (o.ea.f.a()) {
            int i4 = f24103z + 75;
            f24102y = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            C((char) (Process.myTid() >> 22), TextUtils.indexOf("", ""), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            C((char) TextUtils.getCapsMode("", 0, 0), 1040 - (KeyEvent.getMaxKeyCode() >> 16), 9 - MotionEvent.axisFromString(""), objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            int i6 = f24102y + 109;
            f24103z = i6 % 128;
            int i7 = i6 % 2;
        }
        o.z.c cVarBuild = createCardRequestBuilder.build();
        cVarBuild.y();
        this.f24111x.b(context, cVarBuild, new o.cc.c() { // from class: o.en.b.3

            /* JADX INFO: renamed from: a */
            private static int f24123a = 0;

            /* JADX INFO: renamed from: b */
            private static int f24124b = 1;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ OperationCallback f24126e;

            AnonymousClass3(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // o.cc.c
            public final void a() {
                int i22 = 2 % 2;
                int i32 = f24123a;
                int i42 = i32 + 15;
                f24124b = i42 % 128;
                Object obj2 = null;
                if (i42 % 2 == 0) {
                    throw null;
                }
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    int i52 = i32 + 33;
                    f24124b = i52 % 128;
                    if (i52 % 2 == 0) {
                        operationCallback2.onSuccess(null);
                        int i62 = 0 / 0;
                    } else {
                        operationCallback2.onSuccess(null);
                    }
                }
                int i72 = f24123a;
                int i8 = ((i72 + 31) - (31 | i72)) + ((-1) - (((-1) - i72) & ((-1) - 31)));
                f24124b = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }

            @Override // o.cc.c
            public final void e(o.bg.c cVar) {
                int i22 = 2 % 2;
                int i32 = f24123a;
                int i42 = ((i32 + 57) - (57 | i32)) + ((-1) - (((-1) - i32) & ((-1) - 57)));
                f24124b = i42 % 128;
                int i52 = i42 % 2;
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    int i62 = ((45 | i32) << 1) - (i32 ^ 45);
                    f24124b = i62 % 128;
                    int i72 = i62 % 2;
                    operationCallback2.onError(o.by.c.b(cVar).a());
                    int i8 = f24123a + 69;
                    f24124b = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 % 5;
                    }
                }
                int i10 = f24124b + 95;
                f24123a = i10 % 128;
                int i11 = i10 % 2;
            }
        }, e.f24190c);
    }

    public final synchronized boolean a() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f24103z + 21;
        int i4 = i3 % 128;
        f24102y = i4;
        int i5 = i3 % 2;
        z2 = this.f24104k;
        int i6 = i4 + 77;
        f24103z = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        return z2;
    }

    public final DigitalCard b(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 105;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            C((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSize(0, 0) + 223, (Process.myPid() >> 22) + 4, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            C((char) View.getDefaultSize(0, 0), (-1) - TextUtils.lastIndexOf("", '0', 0), Color.argb(0, 0, 0, 0) + 11, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            C((char) (View.getDefaultSize(0, 0) + 23732), 520 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - Color.alpha(0), objArr3);
            o.ea.f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(str).toString());
            int i5 = f24103z + 7;
            f24102y = i5 % 128;
            int i6 = i5 % 2;
        }
        o.ep.d dVar = this.f24110t.g().get(str);
        if (dVar == null) {
            return null;
        }
        int i7 = f24103z + 5;
        f24102y = i7 % 128;
        int i8 = i7 % 2;
        if (dVar.i() != e.f24191e) {
            return null;
        }
        DigitalCard digitalCard = new DigitalCard(dVar);
        int i9 = f24102y + 29;
        f24103z = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 15 / 0;
        }
        return digitalCard;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, fr.antelop.sdk.digitalcard.DigitalCard> b(boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.b(boolean):java.util.Map");
    }

    public final o.fj.b b(Context context, o.ep.d dVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            C((char) (24205 - Color.red(0)), Process.getGidForName("") + 722, 28 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(dVar.b()).toString());
            int i3 = f24102y + 71;
            f24103z = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
        }
        o.fj.b bVarE = this.f24110t.e(context, dVar);
        int i5 = o.fj.b.f25906g * (-267698009);
        o.fj.b.f25906g = i5;
        int i6 = 722878737 * o.fj.b.f25909j;
        o.fj.b.f25909j = i6;
        int i7 = o.fj.b.f25908i * (-1124062688);
        o.fj.b.f25908i = i7;
        if (((Boolean) o.fj.b.e(-147280184, i6, i5, 147280186, new Object[]{bVarE}, (int) Runtime.getRuntime().freeMemory(), i7)).booleanValue()) {
            this.f24109s.a().d(this.f24110t.g());
            int i8 = f24103z + 111;
            f24102y = i8 % 128;
            int i9 = i8 % 2;
        }
        e(context);
        return bVarE;
    }

    public final synchronized o.fj.e b(Context context, o.ef.a aVar) {
        o.fj.e eVar;
        boolean z2;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24103z + 5;
            f24102y = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            C((char) (TextUtils.lastIndexOf("", '0', 0) + 1), KeyEvent.normalizeMetaState(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (47036 - View.getDefaultSize(0, 0)), 126 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 7, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        eVar = new o.fj.e();
        try {
            o.fj.c cVarA = this.f24107q.a(context, aVar, false);
            o.fj.b bVarD = this.f24110t.d(context, aVar);
            List<String> listE = this.f24110t.e(context, aVar);
            eVar.c(this.f24107q.e().e());
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = o.fj.e.f25940b * 589618332;
            o.fj.e.f25940b = i6;
            int i7 = o.fj.e.f25942d * 1486431314;
            o.fj.e.f25942d = i7;
            o.fj.e.c(1873578411, i7, -1873578410, i5, (int) Process.getElapsedCpuTime(), new Object[]{eVar, cVarA}, i6);
            int i8 = o.fj.e.f25943e * 1313410593;
            o.fj.e.f25943e = i8;
            int i9 = o.fj.e.f25939a * (-1428871075);
            o.fj.e.f25939a = i9;
            int iMyTid = Process.myTid();
            int i10 = o.fj.e.f25944j * (-490041921);
            o.fj.e.f25944j = i10;
            o.fj.e.c(-1548073825, iMyTid, 1548073827, i8, i10, new Object[]{eVar, bVarD}, i9);
            Iterator<String> it = listE.iterator();
            while (it.hasNext()) {
                Object[] objArr3 = {eVar.j(), new o.fj.d(it.next(), o(), o.fj.a.f25890h)};
                int id = (int) Thread.currentThread().getId();
                int i11 = o.fj.b.f25904e * 1927270547;
                o.fj.b.f25904e = i11;
                int i12 = o.fj.b.f25902c * 1291554296;
                o.fj.b.f25902c = i12;
                int i13 = o.fj.b.f25901b * (-673355590);
                o.fj.b.f25901b = i13;
                o.fj.b.e(-1392211334, i11, id, 1392211334, objArr3, i13, i12);
            }
            if (listE.isEmpty()) {
                int i14 = 2 % 2;
                z2 = false;
            } else {
                int i15 = f24103z + 35;
                f24102y = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 2 % 2;
                }
                z2 = true;
            }
            eVar.b(z2);
            new o.ds.a();
            eVar.c(o.ds.a.e(context, this, aVar));
            int i17 = o.fj.b.f25906g * (-267698009);
            o.fj.b.f25906g = i17;
            int i18 = o.fj.b.f25909j * 722878737;
            o.fj.b.f25909j = i18;
            int i19 = o.fj.b.f25908i * (-1124062688);
            o.fj.b.f25908i = i19;
            if (((Boolean) o.fj.b.e(-147280184, i18, i17, 147280186, new Object[]{bVarD}, (int) Runtime.getRuntime().freeMemory(), i19)).booleanValue()) {
                int i20 = f24103z + 23;
                f24102y = i20 % 128;
                int i21 = i20 % 2;
                this.f24109s.a().d(this.f24110t.g());
            }
            if (!this.f24110t.g().isEmpty()) {
                eVar.a(this.f24110t.c());
            }
            e(context);
            if (!(!o.ea.f.a())) {
                int i22 = f24102y + 67;
                f24103z = i22 % 128;
                int i23 = i22 % 2;
                Object[] objArr4 = new Object[1];
                C((char) KeyEvent.keyCodeFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - Color.argb(0, 0, 0, 0), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                C((char) (44970 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.lastIndexOf("", '0', 0) + 132, TextUtils.indexOf((CharSequence) "", '0', 0) + 17, objArr5);
                o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
                int i24 = 2 % 2;
            }
            int id2 = (int) Thread.currentThread().getId();
            int i25 = o.fj.e.f25941c * 1901926681;
            o.fj.e.f25941c = i25;
            o.fj.e.c(-1835443082, (int) Runtime.getRuntime().freeMemory(), 1835443082, id2, (int) Runtime.getRuntime().maxMemory(), new Object[]{eVar, true}, i25);
        } catch (f e2) {
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                C((char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getEdgeSlop() >> 16, 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                C((char) (10460 - View.MeasureSpec.getMode(0)), Process.getGidForName("") + 148, (Process.myPid() >> 22) + 59, objArr7);
                o.ea.f.e(strIntern3, ((String) objArr7[0]).intern(), e2);
                int i26 = 2 % 2;
            }
            int id3 = (int) Thread.currentThread().getId();
            int i27 = o.fj.e.f25941c * 1901926681;
            o.fj.e.f25941c = i27;
            o.fj.e.c(-1835443082, (int) Runtime.getRuntime().freeMemory(), 1835443082, id3, (int) Runtime.getRuntime().maxMemory(), new Object[]{eVar, false}, i27);
        }
        return eVar;
    }

    public final o.fr.e b() {
        int i2 = (-1580596594) * f24090e;
        f24090e = i2;
        int i3 = (-2071415875) * f24087b;
        f24087b = i3;
        return (o.fr.e) a(342371170, i2, new Object[]{this}, i3, -342371167, Process.myUid(), new Random().nextInt(460146032));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context, o.cc.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void b(Context context) {
        Object[] objArr;
        Method method;
        int i2 = 2 % 2;
        int i3 = f24103z + 69;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24103z + 121;
            f24102y = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            C((char) ExpandableListView.getPackedPositionType(0L), Color.green(0), 11 - Color.blue(0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            C((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "") + 10, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            int i7 = 2 % 2;
        }
        ?? dVar = new o.cc.d(this);
        this.f24111x = dVar;
        try {
            objArr = new Object[0];
            method = Class.forName(hg.Vd("#/$1-& h\u001d(&+\u001b#(`t \u001e#\u0013% ", (short) (C1607wl.Xd() ^ 21769), (short) (C1607wl.Xd() ^ 25133))).getMethod(C1561oA.ud("liwCqpkg`]ochf:echXje", (short) (C1499aX.Xd() ^ (-10958))), new Class[0]);
        } catch (f e2) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                C((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ViewConfiguration.getEdgeSlop() >> 16, 11 - KeyEvent.normalizeMetaState(0), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                C((char) (30390 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 21, View.resolveSize(0, 0) + 60, objArr5);
                o.ea.f.e(strIntern2, ((String) objArr5[0]).intern(), e2);
                int i8 = 2 % 2;
            }
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                C((char) View.MeasureSpec.makeMeasureSpec(0, 0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, ImageFormat.getBitsPerPixel(0) + 12, objArr6);
                String strIntern3 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                C((char) (View.resolveSizeAndState(0, 0, 0) + 37429), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 81, 44 - ExpandableListView.getPackedPositionType(0L), objArr7);
                o.ea.f.d(strIntern3, ((String) objArr7[0]).intern());
            }
            this.f24107q = new o.fm.g();
            this.f24110t = new o.em.d();
            this.f24109s = new o.fr.e();
            this.f24108r = new o.eo.e();
            this.f24107q.b((Context) dVar);
            this.f24110t.b((Context) dVar);
            this.f24109s.c((Context) dVar);
            this.f24108r.e(dVar);
        }
        try {
            method.setAccessible(true);
            this.f24106p = (Context) method.invoke(context, objArr);
            o.fm.g gVar = new o.fm.g();
            this.f24107q = gVar;
            gVar.e(context);
            o.em.d dVar2 = new o.em.d();
            this.f24110t = dVar2;
            int i9 = o.em.d.f24071b * (-710503470);
            o.em.d.f24071b = i9;
            int iNextInt = new Random().nextInt();
            int i10 = o.em.d.f24070a * 1729749904;
            o.em.d.f24070a = i10;
            o.em.d.a(1773301533, -1773301533, new Object[]{dVar2, context}, i10, i9, iNextInt, (int) Runtime.getRuntime().totalMemory());
            o.fr.e eVar = new o.fr.e();
            this.f24109s = eVar;
            eVar.a(context);
            o.eo.e eVar2 = new o.eo.e();
            this.f24108r = eVar2;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i11 = o.eo.e.f24306d * 259485876;
            o.eo.e.f24306d = i11;
            int i12 = o.eo.e.f24307e * 1989512331;
            o.eo.e.f24307e = i12;
            int i13 = 335404225 * o.eo.e.f24305c;
            o.eo.e.f24305c = i13;
            o.eo.e.c(iElapsedRealtime, i13, i12, 548140208, -548140207, new Object[]{eVar2, context}, i11);
            this.f24104k = true;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void b(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 123;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f24102y + 75;
            f24103z = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            C((char) ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (38994 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1139 - View.MeasureSpec.makeMeasureSpec(0, 0), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        new o.bc.b(context, new b.InterfaceC0338b() { // from class: o.en.b.5

            /* JADX INFO: renamed from: a */
            private static int f24127a = 0;

            /* JADX INFO: renamed from: b */
            private static int f24128b = 1;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ OperationCallback f24130e;

            AnonymousClass5(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            @Override // o.bc.b.InterfaceC0338b
            public final void d(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24128b;
                int i42 = (i32 & 35) + ((i32 + 35) - (i32 & 35));
                f24127a = i42 % 128;
                int i52 = i42 % 2;
                if (cVar.e().c()) {
                    int i62 = f24127a;
                    int i7 = (i62 ^ 123) + (((-1) - (((-1) - i62) | ((-1) - 123))) << 1);
                    f24128b = i7 % 128;
                    if (i7 % 2 == 0) {
                        b.c();
                        b.r();
                        throw null;
                    }
                    b.c();
                    b.r();
                    int i8 = f24128b;
                    int i9 = (i8 ^ 73) + (((-1) - (((-1) - i8) | ((-1) - 73))) << 1);
                    f24127a = i9 % 128;
                    int i10 = i9 % 2;
                }
                operationCallback.onSuccess(null);
                int i11 = f24127a + 41;
                f24128b = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            @Override // o.bc.b.InterfaceC0338b
            public final void e(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24127a + 49;
                f24128b = i32 % 128;
                int i42 = i32 % 2;
                if (cVar.e().c()) {
                    int i52 = f24128b + 57;
                    f24127a = i52 % 128;
                    if (i52 % 2 != 0) {
                        b.c();
                        b.r();
                        throw null;
                    }
                    b.c();
                    b.r();
                }
                operationCallback.onError(o.by.c.b(cVar).a());
                int i62 = f24128b + 121;
                f24127a = i62 % 128;
                if (i62 % 2 != 0) {
                    int i7 = 43 / 0;
                }
            }
        }, this).o();
    }

    public final EmvApplication c(String str) throws Throwable {
        int i2 = 2 % 2;
        if (str == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            C((char) (57710 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getPressedStateDuration() >> 16) + 546, TextUtils.getOffsetAfter("", 0) + 14, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            C((char) TextUtils.getOffsetBefore("", 0), ViewConfiguration.getLongPressTimeout() >> 16, Color.alpha(0) + 11, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            C((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33536), 561 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38, objArr3);
            o.ea.f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(str).toString());
            int i3 = f24102y + 37;
            f24103z = i3 % 128;
            int i4 = i3 % 2;
        }
        Object[] objArr4 = {this.f24110t, str};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = o.em.d.f24073d * (-674039927);
        o.em.d.f24073d = i5;
        o.eq.b bVar = (o.eq.b) o.em.d.a(-1500124824, 1500124825, objArr4, Process.myPid(), iMaxMemory, i5, (int) Runtime.getRuntime().maxMemory());
        if (bVar == null) {
            return null;
        }
        EmvApplication emvApplicationE = bVar.e();
        int i6 = f24102y + 57;
        f24103z = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
        return emvApplicationE;
    }

    public final void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 33;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0') + 1, ImageFormat.getBitsPerPixel(0) + 12, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (23315 - KeyEvent.normalizeMetaState(0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + HttpStatusCodeRange.DEFAULT_MAX, 10 - Color.alpha(0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24103z + 25;
            f24102y = i5 % 128;
            int i6 = i5 % 2;
        }
        new o.dt.d();
        o.dt.d.b().e();
        this.f24110t.a();
        this.f24110t.f().a();
        this.f24110t.b(context);
    }

    public final void c(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24103z + 95;
        f24102y = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) (ViewConfiguration.getTouchSlop() >> 8), ViewConfiguration.getFadingEdgeLength() >> 16, 10 - MotionEvent.axisFromString(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            C((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 750 - Color.alpha(0), 27 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i4 = f24102y + 3;
            f24103z = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr3 = {this.f24110t.e(context, str)};
        int i6 = o.fj.b.f25906g * (-267698009);
        o.fj.b.f25906g = i6;
        int i7 = o.fj.b.f25909j * 722878737;
        o.fj.b.f25909j = i7;
        int i8 = o.fj.b.f25908i * (-1124062688);
        o.fj.b.f25908i = i8;
        if (((Boolean) o.fj.b.e(-147280184, i7, i6, 147280186, objArr3, (int) Runtime.getRuntime().freeMemory(), i8)).booleanValue()) {
            int i9 = f24102y + 69;
            f24103z = i9 % 128;
            int i10 = i9 % 2;
            this.f24109s.a().d(this.f24110t.g());
            int i11 = f24102y + 65;
            f24103z = i11 % 128;
            int i12 = i11 % 2;
        }
        e(context);
    }

    public final o.fm.g d() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int priority = Thread.currentThread().getPriority();
        int i2 = f24088c * (-1721916949);
        f24088c = i2;
        return (o.fm.g) a(-568976488, elapsedCpuTime, new Object[]{this}, iUptimeMillis, 568976490, priority, i2);
    }

    public final void d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24103z + 13;
        f24102y = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ViewConfiguration.getKeyRepeatTimeout() >> 16, 11 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 620, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i4 = f24102y + 91;
            f24103z = i4 % 128;
            int i5 = i4 % 2;
        }
        o.dj.a.c(context);
        o.dj.c.e(context);
        new o.dt.d();
        o.dt.d.b().e();
        o.fm.g gVar = this.f24107q;
        if (gVar != null) {
            int i6 = f24102y + 109;
            f24103z = i6 % 128;
            if (i6 % 2 == 0) {
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int i7 = o.fm.g.f26058c * 186554553;
                o.fm.g.f26058c = i7;
                int i8 = o.fm.g.f26064i * 1606129317;
                o.fm.g.f26064i = i8;
                o.fm.g.b(i8, priority, i7, iActiveCount, -181456863, 181456864, new Object[]{gVar, context});
                obj.hashCode();
                throw null;
            }
            int iActiveCount2 = Thread.activeCount();
            int priority2 = Thread.currentThread().getPriority();
            int i9 = o.fm.g.f26058c * 186554553;
            o.fm.g.f26058c = i9;
            int i10 = o.fm.g.f26064i * 1606129317;
            o.fm.g.f26064i = i10;
            o.fm.g.b(i10, priority2, i9, iActiveCount2, -181456863, 181456864, new Object[]{gVar, context});
        }
        o.bh.d dVar = new o.bh.d();
        try {
            dVar.c(context);
            dVar.e(context);
        } catch (d.c e2) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                C((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 10 - TextUtils.lastIndexOf("", '0'), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                C((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.MeasureSpec.getMode(0) + IptcDirectory.TAG_CAPTION, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 59, objArr4);
                o.ea.f.e(strIntern2, ((String) objArr4[0]).intern(), e2);
            }
        }
        new o.bb.d(context);
        o.bb.d.a(context);
        o.em.d dVar2 = this.f24110t;
        if (dVar2 != null) {
            int i11 = f24102y + 71;
            f24103z = i11 % 128;
            if (i11 % 2 == 0) {
                dVar2.a();
                this.f24110t.f().e();
                Object[] objArr5 = {this.f24110t};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i12 = o.em.d.f24074e * 402155285;
                o.em.d.f24074e = i12;
                int i13 = o.em.d.f24072c * 123611159;
                o.em.d.f24072c = i13;
                o.em.d.a(1314848325, -1314848323, objArr5, i13, iFreeMemory, i12, Thread.currentThread().getPriority());
                this.f24110t.b();
                obj.hashCode();
                throw null;
            }
            dVar2.a();
            this.f24110t.f().e();
            Object[] objArr6 = {this.f24110t};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i14 = o.em.d.f24074e * 402155285;
            o.em.d.f24074e = i14;
            int i15 = o.em.d.f24072c * 123611159;
            o.em.d.f24072c = i15;
            o.em.d.a(1314848325, -1314848323, objArr6, i15, iFreeMemory2, i14, Thread.currentThread().getPriority());
            this.f24110t.b();
        }
        o.fr.e eVar = this.f24109s;
        if (eVar != null) {
            eVar.d();
        }
        o.eo.e eVar2 = this.f24108r;
        if (eVar2 != null) {
            eVar2.a();
            int i16 = f24103z + 89;
            f24102y = i16 % 128;
            int i17 = i16 % 2;
        }
        o.fm.g gVar2 = this.f24107q;
        if (gVar2 != null) {
            gVar2.b(context);
        }
        o.em.d dVar3 = this.f24110t;
        if (dVar3 != null) {
            dVar3.b(context);
        }
        o.fr.e eVar3 = this.f24109s;
        if (eVar3 != null) {
            eVar3.c(context);
        }
        o.eo.e eVar4 = this.f24108r;
        if (eVar4 != null) {
            int i18 = f24103z + 23;
            f24102y = i18 % 128;
            if (i18 % 2 != 0) {
                eVar4.e(context);
                obj.hashCode();
                throw null;
            }
            eVar4.e(context);
        }
        o.bk.e.d(context).e(context);
    }

    public final void d(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 73;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.getDefaultSize(0, 0), 10 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            C((char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 693, 29 - Color.argb(0, 0, 0, 0), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            int i5 = f24103z + 71;
            f24102y = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr3 = {this.f24110t.d(context, str)};
        int i7 = o.fj.b.f25906g * (-267698009);
        o.fj.b.f25906g = i7;
        int i8 = o.fj.b.f25909j * 722878737;
        o.fj.b.f25909j = i8;
        int i9 = o.fj.b.f25908i * (-1124062688);
        o.fj.b.f25908i = i9;
        if (((Boolean) o.fj.b.e(-147280184, i8, i7, 147280186, objArr3, (int) Runtime.getRuntime().freeMemory(), i9)).booleanValue()) {
            this.f24109s.a().d(this.f24110t.g());
        }
        e(context);
    }

    public final void d(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24103z + 87;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        C((char) TextUtils.indexOf("", ""), View.MeasureSpec.getMode(0) + 223, TextUtils.getOffsetAfter("", 0) + 4, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            Object[] objArr2 = new Object[1];
            C((char) View.MeasureSpec.getMode(0), Process.myTid() >> 22, 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            C((char) (View.combineMeasuredStates(0, 0) + 34043), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 205, (Process.myTid() >> 22) + 17, objArr3);
            o.ea.f.c(strIntern2, sb.append(((String) objArr3[0]).intern()).append(str).toString());
        }
        if (str == null) {
            throw new WalletValidationException(WalletValidationErrorCode.Mandatory, strIntern);
        }
        if (!s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            C((char) (ImageFormat.getBitsPerPixel(0) + 36020), 228 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr4);
            String strIntern3 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            C((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14756), Color.rgb(0, 0, 0) + 16777449, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
            throw new WalletValidationException(walletValidationErrorCode, strIntern3, ((String) objArr5[0]).intern());
        }
        Object[] objArr6 = {this.f24110t.j(), str};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = o.ek.e.f24022a * (-1511445380);
        o.ek.e.f24022a = i5;
        int iNextInt = new Random().nextInt();
        int i6 = o.ek.e.f24023b * (-859027871);
        o.ek.e.f24023b = i6;
        if (((Boolean) o.ek.e.b(elapsedCpuTime, 1095925120, i6, i5, objArr6, iNextInt, -1095925119)).booleanValue()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr7 = new Object[1];
            C((char) Drawable.resolveOpacity(0, 0), 275 - (ViewConfiguration.getTapTimeout() >> 16), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern, ((String) objArr7[0]).intern());
        }
        o.ep.d dVar = this.f24110t.g().get(str);
        if (dVar == null) {
            throw new WalletValidationException(WalletValidationErrorCode.Unknown, strIntern);
        }
        if (dVar.i() != e.f24190c) {
            throw new WalletValidationException(WalletValidationErrorCode.Unexpected, strIntern);
        }
        if (!dVar.u()) {
            throw new WalletValidationException(WalletValidationErrorCode.WrongState, strIntern);
        }
        Object[] objArr8 = {dVar};
        int i7 = o.ep.d.f24455g * 1257510192;
        o.ep.d.f24455g = i7;
        int i8 = o.ep.d.f24458j * (-785443339);
        o.ep.d.f24458j = i8;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i9 = o.ep.d.f24463o * (-1273864872);
        o.ep.d.f24463o = i9;
        if (((o.ep.f) o.ep.d.e(1155975806, -1155975801, objArr8, i8, iFreeMemory, i9, i7)) != o.ep.f.f24513e) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr9 = new Object[1];
            C((char) Color.alpha(0), 308 - TextUtils.getOffsetBefore("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, objArr9);
            throw new WalletValidationException(walletValidationErrorCode3, strIntern, ((String) objArr9[0]).intern());
        }
        this.f24109s.a().d(str);
        int i10 = f24103z + 65;
        f24102y = i10 % 128;
        int i11 = i10 % 2;
    }

    public final o.em.d e() {
        int i2 = 2 % 2;
        int i3 = f24103z;
        int i4 = i3 + 81;
        f24102y = i4 % 128;
        int i5 = i4 % 2;
        o.em.d dVar = this.f24110t;
        int i6 = i3 + 63;
        f24102y = i6 % 128;
        int i7 = i6 % 2;
        return dVar;
    }

    public final void e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 73;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            C((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (ViewConfiguration.getTouchSlop() >> 8), 777 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 40, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f24107q.b(context);
        this.f24110t.b(context);
        if (!(!this.f24109s.e())) {
            int i5 = f24102y + 107;
            f24103z = i5 % 128;
            if (i5 % 2 == 0) {
                this.f24109s.c(context);
                int i6 = 57 / 0;
            } else {
                this.f24109s.c(context);
            }
        }
        this.f24108r.e(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0015, code lost:
    
        if (r13 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001b, code lost:
    
        if (o.ea.f.a() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001d, code lost:
    
        r1 = o.en.b.f24103z + 83;
        o.en.b.f24102y = r1 % 128;
        r1 = r1 % 2;
        r0 = new java.lang.Object[1];
        C((char) android.view.View.MeasureSpec.getMode(0), android.view.View.getDefaultSize(0, 0), 11 - android.text.TextUtils.indexOf("", "", 0), r0);
        r4 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        C((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1075 - android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.indexOf("", "", 0) + 17, r0);
        o.ea.f.c(r4, ((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r3 = new o.z.b(r13);
        r3.e();
        r11.f24111x.b(r12, r3, new o.en.b.AnonymousClass2(r11), o.en.e.f24191e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r13 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory;
        r0 = new java.lang.Object[1];
        C((char) (35204 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.drew.metadata.photoshop.PhotoshopDirectory.TAG_SLICES, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 26, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        throw new fr.antelop.sdk.exception.WalletValidationException(r4, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.content.Context r12, java.lang.String r13, fr.antelop.sdk.util.OperationCallback<java.lang.Void> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.en.b.f24102y
            int r1 = r0 + 13
            int r0 = r1 % 128
            o.en.b.f24103z = r0
            int r1 = r1 % r2
            r7 = 1
            java.lang.String r8 = ""
            r6 = 0
            if (r1 != 0) goto L7a
            r0 = 18
            int r0 = r0 / r6
            if (r13 == 0) goto L7d
        L17:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L65
            int r0 = o.en.b.f24103z
            int r1 = r0 + 83
            int r0 = r1 % 128
            o.en.b.f24102y = r0
            int r1 = r1 % r2
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            char r3 = (char) r0
            int r2 = android.view.View.getDefaultSize(r6, r6)
            int r0 = android.text.TextUtils.indexOf(r8, r8, r6)
            int r1 = 11 - r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            C(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            char r3 = (char) r0
            int r0 = android.graphics.Color.argb(r6, r6, r6, r6)
            int r2 = 1075 - r0
            int r0 = android.text.TextUtils.indexOf(r8, r8, r6)
            int r1 = r0 + 17
            java.lang.Object[] r0 = new java.lang.Object[r7]
            C(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ea.f.c(r4, r0)
        L65:
            o.z.b r3 = new o.z.b
            r3.<init>(r13)
            r3.e()
            o.cc.d r2 = r11.f24111x
            o.en.b$2 r1 = new o.en.b$2
            r1.<init>()
            o.en.e r0 = o.en.e.f24191e
            r2.b(r12, r3, r1, r0)
            return
        L7a:
            if (r13 == 0) goto L7d
            goto L17
        L7d:
            fr.antelop.sdk.exception.WalletValidationException r5 = new fr.antelop.sdk.exception.WalletValidationException
            fr.antelop.sdk.exception.WalletValidationErrorCode r4 = fr.antelop.sdk.exception.WalletValidationErrorCode.Mandatory
            long r9 = android.os.SystemClock.elapsedRealtime()
            r2 = 0
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r0 = 35204(0x8984, float:4.9331E-41)
            int r0 = r0 - r1
            char r3 = (char) r0
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r2 = r0 + 1050
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r8, r0)
            int r1 = r0 + 26
            java.lang.Object[] r0 = new java.lang.Object[r7]
            C(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r5.<init>(r4, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.e(android.content.Context, java.lang.String, fr.antelop.sdk.util.OperationCallback):void");
    }

    public final void e(String str) throws Throwable {
        int i2 = f24093h * (-163821843);
        f24093h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = f24097n * (-204943166);
        f24097n = i4;
        a(-1857014006, i2, new Object[]{this, str}, iFreeMemory, 1857014012, i3, i4);
    }

    public final void e(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f24102y + 77;
        f24103z = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24105l = z2;
            o.c.a.e(z2);
        } else {
            this.f24105l = z2;
            o.c.a.e(z2);
            int i4 = 44 / 0;
        }
    }

    public final String f() {
        int iNextInt = new Random().nextInt();
        int iActiveCount = Thread.activeCount();
        int iMyUid = Process.myUid();
        int i2 = f24089d * 2028490856;
        f24089d = i2;
        return (String) a(1484095091, iNextInt, new Object[]{this}, iActiveCount, -1484095091, iMyUid, i2);
    }

    public final Map<String, o.ep.d> g() {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, o.ep.d>> it = this.f24110t.g().entrySet().iterator();
        int i3 = f24102y + 63;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f24102y + 85;
            f24103z = i5 % 128;
            if (i5 % 2 == 0) {
                Map.Entry<String, o.ep.d> next = it.next();
                map.put(next.getKey(), next.getValue());
                int i6 = 19 / 0;
            } else {
                Map.Entry<String, o.ep.d> next2 = it.next();
                map.put(next2.getKey(), next2.getValue());
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.h():void");
    }

    public final String i() throws Throwable {
        int i2 = 2 % 2;
        if (!(!o.ea.f.a())) {
            Object[] objArr = new Object[1];
            C((char) Color.red(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, KeyEvent.getDeadChar(0, 0) + 11, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            C((char) (5972 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 376 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 24, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Object[] objArr3 = {this.f24109s.a()};
        int i3 = o.fr.c.f26141d * (-1971829739);
        o.fr.c.f26141d = i3;
        int i4 = o.fr.c.f26142e * 624053279;
        o.fr.c.f26142e = i4;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = o.fr.c.f26138a * 241563593;
        o.fr.c.f26138a = i5;
        String str = (String) o.fr.c.e(1824317076, iMaxMemory, i3, i5, objArr3, i4, -1824317074);
        if (str == null) {
            int iNextInt = new Random().nextInt();
            int iActiveCount = Thread.activeCount();
            int iMyUid = Process.myUid();
            int i6 = f24089d * 2028490856;
            f24089d = i6;
            String str2 = (String) a(1484095091, iNextInt, new Object[]{this}, iActiveCount, -1484095091, iMyUid, i6);
            int i7 = f24102y + 19;
            f24103z = i7 % 128;
            int i8 = i7 % 2;
            return str2;
        }
        if (this.f24110t.g().keySet().contains(str)) {
            return str;
        }
        int i9 = f24103z + 91;
        f24102y = i9 % 128;
        int i10 = i9 % 2;
        this.f24109s.a().a((String) null);
        int iNextInt2 = new Random().nextInt();
        int iActiveCount2 = Thread.activeCount();
        int iMyUid2 = Process.myUid();
        int i11 = f24089d * 2028490856;
        f24089d = i11;
        return (String) a(1484095091, iNextInt2, new Object[]{this}, iActiveCount2, -1484095091, iMyUid2, i11);
    }

    public final o.eo.e j() {
        int i2 = 2 % 2;
        int i3 = f24103z;
        int i4 = i3 + 93;
        f24102y = i4 % 128;
        int i5 = i4 % 2;
        o.eo.e eVar = this.f24108r;
        int i6 = i3 + 13;
        f24102y = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return eVar;
    }

    public final String k() {
        int i2 = 2 % 2;
        int i3 = f24102y + 115;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        o.fm.g gVar = this.f24107q;
        if (i4 != 0) {
            return gVar.g();
        }
        gVar.g();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WalletSettings l() {
        int i2 = 2 % 2;
        WalletSettings walletSettings = new WalletSettings(new WalletSettings.Limits(d().b()), new WalletSettings.Security(d().c(), d().a()), new WalletSettings.Locale(d().d()));
        int i3 = f24103z + 47;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        return walletSettings;
    }

    public final String m() {
        int i2 = (-753814041) * f24095j;
        f24095j = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i3 = f24094i * 968490782;
        f24094i = i3;
        return (String) a(721620061, i2, new Object[]{this}, iUptimeMillis, -721620057, i3, Process.myTid());
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = f24103z + 91;
        f24102y = i3 % 128;
        if (i3 % 2 != 0) {
            this.f24107q.f();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strF = this.f24107q.f();
        int i4 = f24103z + 3;
        f24102y = i4 % 128;
        int i5 = i4 % 2;
        return strF;
    }

    public final String o() {
        int i2 = 2 % 2;
        int i3 = f24102y + 75;
        f24103z = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f24107q};
            int i4 = o.fm.g.f26062g * 917650304;
            o.fm.g.f26062g = i4;
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = o.fm.g.f26063h * (-918422679);
            o.fm.g.f26063h = i5;
            int i6 = o.fm.g.f26065j * (-2029725721);
            o.fm.g.f26065j = i6;
            throw null;
        }
        Object[] objArr2 = {this.f24107q};
        int i7 = o.fm.g.f26062g * 917650304;
        o.fm.g.f26062g = i7;
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i8 = o.fm.g.f26063h * (-918422679);
        o.fm.g.f26063h = i8;
        int i9 = o.fm.g.f26065j * (-2029725721);
        o.fm.g.f26065j = i9;
        String str = (String) o.fm.g.b(i9, iMaxMemory2, i8, i7, -1062169248, 1062169250, objArr2);
        int i10 = f24103z + 5;
        f24102y = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 93 / 0;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<fr.antelop.sdk.Product> p() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.en.b.p():java.util.List");
    }

    public final Context q() {
        int i2 = (-1339268403) * f24086a;
        f24086a = i2;
        return (Context) a(-1657581939, i2, new Object[]{this}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid());
    }

    public final boolean s() throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f24102y + 59;
        f24103z = i3 % 128;
        int i4 = i3 % 2;
        try {
            t();
            z2 = this.f24105l;
            try {
                r();
                int i5 = f24103z + 47;
                f24102y = i5 % 128;
                int i6 = i5 % 2;
            } catch (InterruptedException unused) {
                if (o.ea.f.a()) {
                    Object[] objArr = new Object[1];
                    C((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 10 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    C((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + LeicaMakernoteDirectory.TAG_CCD_VERSION, ExpandableListView.getPackedPositionChild(0L) + 72, objArr2);
                    o.ea.f.d(strIntern, ((String) objArr2[0]).intern());
                }
            }
        } catch (InterruptedException unused2) {
            z2 = false;
        }
        return z2;
    }

    public final String u() {
        int i2 = 2 % 2;
        int i3 = f24103z + 115;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        String strN = n();
        int i5 = f24102y + 3;
        f24103z = i5 % 128;
        if (i5 % 2 != 0) {
            return strN;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final X509Certificate v() {
        int i2 = 2 % 2;
        int i3 = f24103z + 87;
        f24102y = i3 % 128;
        int i4 = i3 % 2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int priority = Thread.currentThread().getPriority();
        int i5 = f24088c * (-1721916949);
        f24088c = i5;
        X509Certificate x509CertificateK = ((o.fm.g) a(-568976488, elapsedCpuTime, new Object[]{this}, iUptimeMillis, 568976490, priority, i5)).k();
        int i6 = f24103z + 113;
        f24102y = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return x509CertificateK;
    }

    public final String w() throws Throwable {
        int i2 = 2 % 2;
        try {
            StringBuilder sb = new StringBuilder();
            int i3 = (-637535876) * f24091f;
            f24091f = i3;
            int id = (int) Thread.currentThread().getId();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = f24092g * 1321308741;
            f24092g = i4;
            byte[] bArrD = o.eh.e.d(sb.append((String) a(63409599, i3, new Object[]{this}, id, -63409594, iMaxMemory, i4)).append(o.bk.e.d(this.f24106p).b()).toString().getBytes(StandardCharsets.UTF_8));
            Class<?> cls = Class.forName(C1561oA.yd("hvixzum8\u0005\u0005vzAVr\u0006\\.)", (short) (C1580rY.Xd() ^ (-28045))));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr = {bArrD, 10};
            short sXd = (short) (C1633zX.Xd() ^ (-19037));
            int[] iArr = new int["6@6C9;+G,NMEKE".length()];
            QB qb = new QB("6@6C9;+G,NMEKE");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
                i5++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i5), clsArr);
            try {
                declaredMethod.setAccessible(true);
                String strSubstring = ((String) declaredMethod.invoke(null, objArr)).substring(0, 24);
                int i6 = f24102y + 39;
                f24103z = i6 % 128;
                if (i6 % 2 != 0) {
                    return strSubstring;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (o.bk.d unused) {
            if (!o.ea.f.a()) {
                return "";
            }
            Object[] objArr2 = new Object[1];
            C((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ViewConfiguration.getKeyRepeatDelay() >> 16, 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            C((char) (34918 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1092 - Color.green(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46, objArr3);
            o.ea.f.d(strIntern, ((String) objArr3[0]).intern());
            return "";
        }
    }

    public final X509Certificate x() {
        int iNextInt = new Random().nextInt();
        int i2 = 403932859 * f24096m;
        f24096m = i2;
        return (X509Certificate) a(1828373187, iNextInt, new Object[]{this}, i2, -1828373180, new Random().nextInt(1734004265), Thread.activeCount());
    }

    public final String y() {
        int i2 = (-637535876) * f24091f;
        f24091f = i2;
        int id = (int) Thread.currentThread().getId();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f24092g * 1321308741;
        f24092g = i3;
        return (String) a(63409599, i2, new Object[]{this}, id, -63409594, iMaxMemory, i3);
    }

    public final void z() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24102y + 67;
        f24103z = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            s();
            throw null;
        }
        if (s()) {
            int i4 = f24102y + 49;
            f24103z = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr = new Object[1];
        C((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36018), 227 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 6, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        C((char) (14756 - (ViewConfiguration.getLongPressTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 232, 42 - View.combineMeasuredStates(0, 0), objArr2);
        throw new WalletValidationException(walletValidationErrorCode, strIntern, ((String) objArr2[0]).intern());
    }
}
