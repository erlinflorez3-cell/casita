package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.a.o;
import o.d.d;
import o.er.x;

/* JADX INFO: loaded from: classes5.dex */
public final class PushToTokenRequestorService {
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f19112a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f19113b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f19114c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f19115d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f19116e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f19117f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f19118g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f19119h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f19120i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f19121j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f19122k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f19123l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f19124m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f19125n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f19126o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f19127p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f19128q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f19129r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f19130s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f19131t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f19132u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f19133v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f19134w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f19135x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f19136y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f19137z = 0;
    private final x innerPushToTokenRequestorService;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r8, short r9, byte r10) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 4
            byte[] r7 = fr.antelop.sdk.digitalcard.PushToTokenRequestorService.$$c
            int r6 = r9 + 99
            int r5 = r10 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L27
            r2 = r8
            r0 = r5
            r1 = r3
        L14:
            int r8 = r8 + r0
            int r2 = r2 + 1
        L17:
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r1 != r5) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r1 = r1 + 1
            r0 = r7[r2]
            goto L14
        L27:
            r1 = r3
            r2 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.PushToTokenRequestorService.$$e(byte, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        L = -333670647;
        K = 605030958;
        J = -220192549;
        I = -238875700;
        H = -1020361290;
        G = 949079184;
        F = 627810834;
        E = 353702605;
        D = -197474548;
        C = -1893606999;
        B = -1794007008;
        A = 2020421947;
        f19137z = -1502946745;
        f19136y = -1017326188;
        f19135x = 171495463;
        f19134w = 148617692;
        f19133v = 1275670744;
        f19132u = -583288565;
        f19131t = -867243620;
        f19130s = 1825050658;
        f19129r = -1207625022;
        f19128q = 382782623;
        f19127p = -1030685680;
        f19126o = 221644665;
        f19125n = -582674365;
        f19124m = 120505454;
        f19123l = 1836459496;
        f19122k = 1001377649;
        f19119h = 862304746;
        f19118g = 1750984105;
        init$0();
        f19117f = 0;
        f19120i = 1;
        f19115d = 0;
        f19121j = 1;
        b();
        f19116e = new char[]{38039, 26653, 28035, 24856, 26267, 31244, 32657, 29454, 38083, 38082, 38088};
        f19113b = 4801536129118005360L;
        int i2 = f19117f + 11;
        f19120i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
    }

    public PushToTokenRequestorService(x xVar) {
        this.innerPushToTokenRequestorService = xVar;
    }

    private static void M(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i6 = $11 + 39;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 77;
            $11 = i8 % 128;
            if (i8 % i4 == 0) {
                int i9 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f19116e[i2 * i9])};
                    Object objA = d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(Color.alpha(0) + 742, (char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, 632508977, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f19113b), Integer.valueOf(c2)};
                    Object objA2 = d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = d.a(765 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (12471 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1946853218, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 388, (char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 39570797, false, $$e(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
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
                int i10 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f19116e[i2 + i10])};
                Object objA4 = d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 741, (char) KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) + 12, 632508977, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(f19113b), Integer.valueOf(c2)};
                Object objA5 = d.a(-1567654649);
                if (objA5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objA5 = d.a(766 - View.MeasureSpec.getSize(0), (char) (MotionEvent.axisFromString("") + 12471), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, 1946853218, false, $$e(b9, b10, (byte) (b10 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = d.a(387 - Color.red(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, 39570797, false, $$e(b11, (byte) ((b11 + 6) - (6 & b11)), b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                objA7 = d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 388, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 18, 39570797, false, $$e(b12, (byte) (6 | b12), b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void N(int r21, char r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.PushToTokenRequestorService.N(int, char, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void O(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 101 - r7
            int r0 = r8 * 2
            int r6 = 1 - r0
            int r0 = r9 * 3
            int r5 = 4 - r0
            byte[] r4 = fr.antelop.sdk.digitalcard.PushToTokenRequestorService.$$a
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r4 != 0) goto L29
            r0 = r7
            r7 = r6
            r1 = r2
        L14:
            int r7 = r7 + r0
            int r5 = r5 + 1
        L17:
            byte r0 = (byte) r7
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r10[r2] = r0
            return
        L26:
            r0 = r4[r5]
            goto L14
        L29:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.PushToTokenRequestorService.O(int, int, short, java.lang.Object[]):void");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] a(android.content.Context r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 14210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.PushToTokenRequestorService.a(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void b() {
        char[] cArr = new char[1884];
        ByteBuffer.wrap("×±Å\u009có7àÚ\u009e)\u008c\u0007¹\u0095W8DÊrn`\u000b\u001d\u008f\u000b>8ïÖkÄ\u0000ñ\u009aï*\u009c×\u008a\u007f¸\u0015U\u009fC)pÄno\u001c\u000b\t§Æ\u0016Ô;â\u0090ñ}\u008f\u008e\u009d ¨2F\u009fUmcÉq¬\f(\u001a\u0099)HÇÝÕªà)þ\u009a\u008dJ\u009bÏ©±D\u0015R\u009eag\u007fÍ\u0094Ý\u0086ð°[£¶ÝEÏkúù\u0014T\u0007¦1\u0002#g^ãHR{\u0083\u0095\u0015\u0087q²ü¬WÕ\u0018Ç\"ñ\u0082âv\u009c\u0080\u008e¤»<U\u0099FrpÍb®\u001fz\t\u0098:vÔÏÆ©ó1í\u0098\u009eh\u0088Íº\u0090W\u000bA\u0092rilÓ\u001e¤\u000b\u0019%\u008c\u0094Ý\u0086ñ°J££ÝEÏhúñ\u0014\u0016\u0007²1\u0016#a^à\u0094Ý\u0086ñ°J££ÝEÏ\u007fúÿ\u0014U\u0007ì1\u0014#|^ÿHJ|¨n\u0092X/KÖ5~'\u000b\u0012\u0087übïåÙWË6¶\u008a 9\u0093Ì}Wo\u001cZ\u0093D ÷\u009aå Ó\u0000Àô¾Y¬.\u0099¼wPdéRJ@+=ø+\u0011\u0018òöCä!Ñ·Ï]¼êªHLÐ^½h\u0019{î\u0005E\u001746\u0084$¾\u0012\u001e\u0001ê\u007fGm0X¢¶N¥ù\u0093T\u00819üæê\rÙà7R%$\u0010\u009d\u000e }ªkWY6´\u0098¢\u001a\u0091¬\u008fXý2è\u0099Æ\u001d5ñ#J\u00113.\u000f<5\n\u0095\u0019agÌu»@)®Å½r\u008bß\u0099²ämò\u0086Ák/Ù=¯\b\u0016\u0016«e!sÂAª¬\u0011º\u0094ÍçßÝé}ú\u0089\u0084$\u0096S£ÁM-^\u0094h7zV\u0007\u0085\u0011l\"\u008fÌ>Þ\\ëÍõc\u0086\u0091\u0090\f¢}OæY~j\u008dt(\u0006\u0010\u0013ç=e-û?Ö\t}\u001a\u0090dcvDCÕ\u00ads¾\u0091\u0088%\u009a]çÓñoÂ\u008e\u0094\u0080\u0086û°\u0010£¢Ý\u001fÏeúú\u0014\\\u0007ì1\f#a^ãHNvëd\u0086R(AÄ?x-U\u0018\u008fö*åÁ\u0094Ý\u0086ä°L£¯Ý\tÏ#úð\u0014Q\u0007®1\u0001#}^éHI{¨\u0095\u0003\u0087e²á\u0094\u009c\u0086ñ°S£µÝ\u0019Ïj.õ<\u008e\ne\u0019Ågmu\u0016@\u0087®8½Ô\u008be\u0099Uä\u0088ò.ÁÇ/f=\u001b\b\u0086\u0016\"eßs`A\r¬¼º1\u0094\u0095\u0086ñ°P£¹\u0094\u0082\u0086ñ°L£³Ý\u0003Ï\u007fúâ\u0014\u0016\u0007±1\u001d#}^¾HX{¸\u0095H\u0087l²÷¬Vß«É\u0007û$\u0016Ë\u0000F3\u00ad-L_bJÏd[\u0097¿\u0081#³a®ØØGË\u008bå\f\u0017e\u0002Ä<(/³Y\nKgfÖ\u0094\u0082\u0086ñ°L£³Ý\u0003Ï\u007fúâ\u0014\u0016\u0007±1\u001d#}^¾HX{¸\u0095H\u0087l²÷¬Vß«É\u0007û$\u0016Ë\u0000F3\u00ad-L_bJÏd[\u0097¿\u0081#³a®ØØGË\u008bå\b\u0017e\u0002Ä<(/¹Y\nBïP\u009cf!uÞ\u000bn\u0019\u0012,\u008fÂ{ÑÜçpõ\u0010\u0088Ó\u009e5\u00adÕC%Q\u0001d\u009az;\tÆ\u001fj-IÀ³Ö4å\u009bûl\u0089\u0018\u009cª\u0094\u0082\u0086ñ°L£³Ý\u0003Ï\u007fúâ\u0014\u0016\u0007±1\u001d#}^¾HX{¸\u0095H\u0087l²÷¬Vß«É\u0007û$\u0016Þ\u0000Y3ö-\u000e_eJÍ+\u001b9h\u000fÕ\u001c*b\u009apæE{«\u008f¸(\u008e\u0084\u009cäá'÷ÁÄ!*Ñ8õ\rn\u0013Ï`2v\u009eD½©G¿À\u008co\u0092\u0096àþõTõÖç¥Ñ\u0018Âç¼W®+\u009b¶uBfåPIB)?ê)\f\u001aìô\u001cæ8Ó£Í\u0002¾ÿ¨S\u009apw\u008aa\rR¢L[>>+\u0099½þ¯\u008c\u0099+\u008aÂôcæ\u0010\u0094Ý\u0086ä°L£¯Ý\tÏ#úû\u0014W\u0007¦1\u0011#b^õHIU\u0015GgqÀb)\u001c\u009c\u000eè;bÕÚÆ'\u0094µ\u0086ñ°P£¹Ý\u0007Ïcúâ\u0014Q\u0007\u00ad1\n\u0094\u0087\u0086ú°U£®Ý\u0005Ï{úø\u0094\u0091\u0086ü°L£¯Ý\u0007Ïeúã\u0014U\u0094\u0080\u0086û°\u0010£°Ý\u0018Ïcúò\u0014M\u0007¡1\u0010# ^ôH_{ª\u0095\u000f\u0087k²÷\u0082\u0017\u0090e¦Âµ+ËÁÙ©ìu\u0094\u0095\u0086ñ°P£¥Ý\u0018Ïeúõ\u0094\u0095\u0086ñ°P£¥Ý\u0018Ïeúõ\u0014g\u0007º1\\#8{ôi\u0090_1LÄ2y \u0004\u0015\u0094û\u0006èÛÞ=ÌY±®§m\u0094\u0089^ªLÑz:i\u009a\u00172\u0005I0ØÞgÍ\u008bû:é\n\u0094×\u0082\u007f±\u0092_)MN\u0094\u0081\u0086ð°U\u0094³\u0086ä°N£àÝ8Ïyúø\u0014L\u0007«1\t#k^°H\\{³\u0095\u0014\u0087(²Ñ¬\\ß¬É\u000fûg\u0016É\u0094³\u0086ú°Z£²Ý\u0005Ïeúò\u0014\u0018\u0007\u00911 #E^°HX{©\u0095\u000f\u0087d²æ¬\u0014ß¸É\u000fûx\u0016\u008c\u0000N3à-T\u0094³\u0086ú°Z£²Ý\u0005Ïeúò\u0014\u0018\u0007\u00911 #E^°HX{©\u0095\u000f\u0087d²æ¬\u0014ß¸É\u000fûx\u0016\u008c\u0000N3à-T_[J\u0098d\u0004¶\u008a¤ñ\u0092\u001a\u0081¢ÿ\u0001ítØø6E%©\u0013\u001c\u0001a\u0094\u0095\u0086û°R£¤Ý\fÏeúå\u0014PàÄò¶Ä\u0011×ø©\u0012»zI¡[Ômq~\u0082\u0000#\u0012X\u0094\u0080\u0086û°\u0010£°Ý\u0018Ïcúò\u0014M\u0007¡1\u0010# ^òHH{½\u0095\b\u0087l\u0094\u0080\u0086û°\u0010£«Ý\u000fÏ~úø\u0014]\u0007®1J#\u007f^õHW{©\u0014\u0019\u0006b0\u0089#*]\u0096Oözz\u0094Ó\u0087>\u0094\u0080\u0086û°\u0010£¢Ý\u001fÏeúú\u0014\\\u0007ì1\u0014#|^ÿH^{©\u0095\u0005\u0087|6($]\u0012î\u0001\u0010\u007f\u0089mÈX\u0012¶²üªîÑØ:Ë\u0088µ5§O\u0092Ð|voÆY(KM6Ô w\u0013\u0093ý>ïRÚÊÄw·\u009a¡>\u0094\u0095\u0086ñ°P£¥Ý\u0018Ïeúõ\u0014\u0017\u0007±1\u0000#e^¿H]{¹\u0095\b\u0087m²à¬]ß½\u0094\u0095\u0086ñ°P£¥Ý\u0018Ïeúõ\u0014g\u0007º1\\#8^¿HI{¸\u0095\r\u0087W²ê¬\fßèÉOûm\u0016É\u0000X3½-\u0010_mJÍdo\u0097¢\u0081D³0\u0094\u0095\u0086ñ°P£¥Ý\u0018Ïeúõ\u0014\u0017\u0007¥1\u000b#a^÷HV{¹\u00959\u0087{²ö¬_ßñÉ\u0007ûo\u0016Â\u0000S3ª-\u000b_gä\u0002öfÀÇÓ2\u00ad\u008f¿ò\u008abd\u0080w#A\u0091Sö.\u007f8\u0095\u000b}å\u0081÷°ÂsÜÁ¯&¹\u008f\u008b¥f\rpÑ\u0094\u0095\u0086û°Q£§Ý\u0006Ïiú¹\u0014K\u0007¦1\u000f#Q^÷HJ{´\u0095\t\u0087f²÷¬kß¦ÉXû<\u0016\u0083\u0000Q3½-\f_aJÜdY\u0097¹\u0081#³~®\u0090Ø\u0004\u0094\u0080\u0086û°\u0010£¢Ý\u0005Ïcúâ\u0014T\u0007\u00ad1\u0005#j^õHH\u0094\u0080\u0086û°\u0010£¢Ý\u0005Ïcúâ\u0014Q\u0007¯1\u0005#i^õH\u0014{¾\u0095\u0013\u0087a²þ¬PßðÉ\u0006ûc\u0016Â\u0000Q3½-\u0010_tJÜdY\u0097´\u0081\b^£LêzJi¢\u0017\u0015\u0005u0âÞ\u0005ÍªûLé(\u0094\u0080\u0086û°\u0010£¢Ý\u001fÏeúú\u0014\\\u0007ì1\u0000#g^ãHJ{°\u0095\u0007\u0087q²¼¬]ßº¾&¬Q\u009aí\u0089\u0014÷ç\u0094\u009b\u0086ú°W£´ÝDÏ\u007fúà\u0014[\u0007ì1\u0015#k^ýHO{ñ\u0095\u0016\u0087z²ý¬Dß\u00ad\u0094\u0083\u0086ñ°S£µÝDÏdúá\u0014\u0016\u0007¯1\u0005#g^þHQ{¹\u0095\u001f\u0087{\u0094\u0083\u0086ñ°S£µÝDÏ\u007fúð\u0014\u0016\u0007¤1\u0005#e^õHe{¿\u0095\u0007\u0087e²÷¬Fß¿¸²ªÀ\u009cb\u008f\u0084ñuãNÖÁ8'+\u009f\u001d6\u000f[rþdoW\u0088¹9«J\u009eÊ\u0080qó\u0096>J,1\u001aÚ\tawÅe´P2¾\u0097\u00add\u009b\u0080\u0089¥ô4â\u0094Ñd?Ã-«\u0018<\u0006ÐuecÏQ\u00ad¼\u0013ª\u0098èÆú½ÌVßä¡C³%\u0086¤hP{õMG_%\"£4R\u0007ûéVû*Î\u008bÐ\u001c£ùµK\u0087)\u0094\u0080\u0086û°\u0010£¯Ý\u000eÏaú¸\u0014Z\u0007·1\r#b^ôH\u0014{º\u0095\u000f\u0087f²õ¬Qß¬É\u0010ûx\u0016Å\u0000X3¬¾\f¬w\u009a\u009c\u0089<÷\u0094åïÐ~>Á--\u001b\u009c\t¬t~bÃQ9¿\u0086\u00adà\u00980\u0086Þõ;ã\u0082Ñá<E*È\u0019$\u0007\u009cuá`LNÈ\u0094\u0080\u0086û°\u0010£³Ý\u0013Ï\u007fúâ\u0014]\u0007¯1J#l^åHS{°\u0095\u0002\u0087&²ô¬]ß°É\u0007ûo\u0016Þ\u0000F3ª-\u000b_jJÚ+á9\u009a\u000fq\u001cÒbrp\u001eE\u0083«<¸Î\u008eZ\u009c\ná\u0089÷/Ä\u0093*e8\u001c\r\u009a\u00139`Ûv/D\r©¤¿9\u008cÞ\u0092fà\u0017õ¿Û#(Ò>s\f\u0013Ò\tÀrö\u0099å?\u009b\u0086\u0089ë¼{RÞA9wÃeå\u0018l\u000eÚ=9Ó\u008bÁ¯ô}êÔ\u00999\u008f\u008e½æPWFÏu#k\u0082\u0019ã\fS\u0094\u0080\u0086û°\u0010£¶Ý\u000fÏbúò\u0014W\u0007°1;#j^üHQ{±\u0095H\u0087j²ç¬]ß²É\u0004û$\u0016Ê\u0000_3¶-\u0005_aJÜd@\u0097¨\u0081\u0015³h®Ü\u0094Ý\u0086ð°[£¶ÝEÏ}úó\u0014U\u0007·1;#~^ùHJ{¹Y\u0017K:}\u0091n|\u0010\u008f\u0002µ73Ù\u0091ÊcüËî°\u0093u\u0085\u0092¶wXßJ§\u007f:a\u009f\u0012z\u0004Î6\u009fÛ\u0001Í\u0099þ|àÑ\u0092ª\u0094Ý\u0086ð°[£¶ÝEÏ\u007fúù\u0014[\u0007©1\u0001#z^¿H]{¹\u0095\b\u0087q²ö\u0094Ý\u0086ð°[£¶ÝEÏ\u007fúù\u0014[\u0007©1\u0001#z^¿HK{¹\u0095\u000b\u0087}²ö½\b¯2\u0099\u0092\u008afô\u0090æ¨Ó&=\u0080.b\u0018î\n¯w7a\u008eRj¼Ö+\u00839¹\u000f\u0019\u001cíb@p7E¥«I¸ð\u008eS\u009c2áá÷\bÄë*Z85\r\u0093\u0013\u0007`ávRD8©\u009d¿\u000b\u008cÙ\u0092Xà?õ\u0092Û\u001b(ã>}\f)\u0011\u0093g\u0001tÿZ\u000e¨-½\u009b\u0094Ý\u0086ð°[£¶ÝEÏnúå\u0014L\u0007\u009d1\u0003#~^ã\u0094Ý\u0086ð°[£¶ÝEÏnúå\u0014L\u0007\u009d1\u0010#g^ýH_ºÈ¨å\u009eN\u008d£óPájÔì:N)¼\u001f\u0014\ropªfMUº»\u0007©{\u009cè\u0082Mñ¯ç\u0010Õm8Ý*g8]\u000eý\u001d\tc¤qÓDAª\u00ad¹\u0014\u008f·\u009dÖà\u0005öìÅ\u000f+¾9Ð\f[\u0012úa\u0002wµEÜ¨r¾é\u008d\u0010\u0093\u0087áÔôzÚã)N?µ\rÓ\u0094Ý\u0086ð°[£¶ÝEÏnúå\u0014L\u0007£1\u0007#m^õs¢a\u008fW$DÉ::(\u0011\u001d\u009aó3àÚÖbÄ\u0003¹\u0080ÑfÃKõàæ\r\u0098þ\u008aÕ¿^Q÷B\u0014tºfÒ\u001bE\u0094Ý\u0086ð°[£¶ÝEÏnúå\u0014L\u0007\u00ad1\u0016#g^õæ\u0010ô=Â\u0096Ñ{¯\u0088½£\u0088(f\u0081uyCÄQ°,:\u0094Ý\u0086ð°[£¶ÝEÏnúå\u0014L\u0007²1\u0003#o^ùHJ{¿Ln^Chè{\u0005\u0005ö\u0017Ý\"VÌÿß.é¾ûÐ\u0086F\u0094Ý\u0086ð°_£´Ý\u000bÏ#úò\u0014W\u0007µ1\n#b^ÿH[{¸\u0095\u0015\u0087'²¼¬Lß¼ÉOûh\u0016ß\u0000B3³\u0094Ý\u0086ù°P£´ÝEÏ{úÿ\u0014V\u0007¦1\u000b#y^ãH\u0015{\u009e\u0095\u0015\u0087|²Á¬\\ß¿É\u0012ûo\u0016È\u0000p3·-\u000e_`JËdBS.A\u0017w¿d\\\u001aú\bÐ=\fÓ¤ÀAöøä\u008f\u0099\u0017\u008fºCMQ}g×to\nß\u0094Ý\u0086ä°L£¯Ý\tÏ#úå\u0014]\u0007®1\u0002#!^ýH[{¬\u0095\u0015\u0094\u0095\u0086æ°_£¬Ý\u0006Ïcúõ\u0014\u0016\u0007¥1\u000b#b^ôH\\{µ\u0095\u0015\u0087`²¼¬Gß±\u0094\u009e\u0086ý°\\£\u0087Ý&ÏIúÅ\u0014g\u0007 1\u0017#z^¾HI{³p°b\u009cT'GÎ9(+\f\u001e\u009eð1ãÆÕhÇ<º\u009e¬8\u009fÕqnc\u0006V\u008cHw;Ë-`\u001f\u000b\u0094\u0090\u0086ø°K£¥Ý\u0019Ïxú÷\u0014[\u0007©1\u0017ìªþ\u0086È=ÛÔ¥2·\u0016\u0082\u008el:\u007fÛIg[\nx\u009aj·\\\u0018Oó1L#d\u0016µø\u0010ëòÝMÏ%²¸¤\u001c\u0097ÿyRk`^û@\u00173é%\b\u0017,ú\u009bì\u0001ßìÁ\u000b³;¦\u0084\u0088\u001b\u0094Ý\u0086ä°L£¯Ý\tÏ#úõ\u0014H\u0007·1\r#`^öHU«\u0002¹L\u008få\u009c\u0013â»ðÒÅR+çGqU\\cóp\u0018\u000e§\u001c\u008f)WÇýÔ\u001dâ«ð\u008d\u008dL\u009bä¨\u001fF¬TÍaR\u007fý\f\u0001\u001aã(ÅÅuÓèà[þþ\u008c\u0087\u0099a·óD\u001bRþ`Ç}m\u000bý\u0018\n6½ÄÚÑoï\u0092ü\u000e\u008aú\u0098ÃµmC\u008fP\tn¿|Ý\to".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1884);
        f19114c = cArr;
        f19112a = 3529426824176699028L;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY;
    }

    static void init$1() {
        $$c = new byte[]{17, -84, -78, -70};
        $$d = 156;
    }

    public final DigitalCardServiceStatus getStatus() {
        int i2 = 2 % 2;
        int i3 = f19121j + 27;
        f19115d = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerPushToTokenRequestorService.c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.innerPushToTokenRequestorService.c()) {
            return DigitalCardServiceStatus.Disabled;
        }
        DigitalCardServiceStatus digitalCardServiceStatus = DigitalCardServiceStatus.Active;
        int i4 = f19121j + 45;
        f19115d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return digitalCardServiceStatus;
    }

    public final void getTokenRequestors(Context context, OperationCallback<List<TokenRequestor>> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19115d + 81;
        f19121j = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerPushToTokenRequestorService.e(context, operationCallback);
            return;
        }
        this.innerPushToTokenRequestorService.e(context, operationCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
