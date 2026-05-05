package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Random;
import o.a.f;
import o.a.o;
import o.d.d;
import o.ea.m;
import o.m.i;
import o.x.j;
import o.y.k;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureTokenSuspend implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static int A = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f19215a = null;

    /* JADX INFO: renamed from: b */
    private static int f19216b = 0;

    /* JADX INFO: renamed from: c */
    private static boolean f19217c = false;

    /* JADX INFO: renamed from: d */
    private static char[] f19218d = null;

    /* JADX INFO: renamed from: e */
    private static boolean f19219e = false;

    /* JADX INFO: renamed from: f */
    private static long f19220f = 0;

    /* JADX INFO: renamed from: g */
    private static int f19221g = 0;

    /* JADX INFO: renamed from: h */
    private static int f19222h = 0;

    /* JADX INFO: renamed from: i */
    private static int f19223i = 0;

    /* JADX INFO: renamed from: j */
    private static int f19224j = 0;

    /* JADX INFO: renamed from: k */
    public static int f19225k = 0;

    /* JADX INFO: renamed from: l */
    public static int f19226l = 0;

    /* JADX INFO: renamed from: m */
    public static int f19227m = 0;

    /* JADX INFO: renamed from: n */
    public static int f19228n = 0;

    /* JADX INFO: renamed from: o */
    public static int f19229o = 0;

    /* JADX INFO: renamed from: p */
    public static int f19230p = 0;

    /* JADX INFO: renamed from: q */
    public static int f19231q = 0;

    /* JADX INFO: renamed from: r */
    public static int f19232r = 0;

    /* JADX INFO: renamed from: s */
    public static int f19233s = 0;

    /* JADX INFO: renamed from: t */
    public static int f19234t = 0;

    /* JADX INFO: renamed from: u */
    public static int f19235u = 0;

    /* JADX INFO: renamed from: v */
    public static int f19236v = 0;

    /* JADX INFO: renamed from: w */
    public static int f19237w = 0;

    /* JADX INFO: renamed from: x */
    public static int f19238x = 0;

    /* JADX INFO: renamed from: y */
    public static int f19239y = 0;

    /* JADX INFO: renamed from: z */
    public static int f19240z = 0;
    private final k innerTokenSuspendProcess;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r7, int r8, short r9) {
        /*
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureTokenSuspend.$$c
            int r0 = r9 * 4
            int r5 = 3 - r0
            int r0 = r8 + 67
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L27
            r0 = r7
            r1 = r5
            r2 = r3
        L14:
            int r5 = r5 + r0
        L15:
            byte r0 = (byte) r5
            r4[r2] = r0
            int r1 = r1 + 1
            if (r2 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r2 = r2 + 1
            r0 = r6[r1]
            goto L14
        L27:
            r2 = r3
            r1 = r5
            r5 = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenSuspend.$$e(int, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        A = -1696968718;
        f19240z = 1418534693;
        f19239y = -1868642150;
        f19238x = 1034166546;
        f19237w = 1776373430;
        f19236v = 633024748;
        f19235u = 2024787127;
        f19234t = 710160611;
        f19233s = 253627838;
        f19232r = -938990395;
        f19231q = -370325563;
        f19230p = -1261526070;
        f19229o = 1927781976;
        f19228n = -2069219541;
        f19227m = 116605563;
        f19226l = -948466795;
        f19225k = 823960288;
        init$0();
        f19222h = 0;
        f19221g = 1;
        f19224j = 0;
        f19223i = 1;
        e();
        f19215a = new char[]{2459, 2435, 2443, 2434, 2463, 2442, 2433, 2444, 2511, 2510, 2484};
        f19216b = 2040400382;
        f19217c = true;
        f19219e = true;
        int i2 = f19221g + 39;
        f19222h = i2 % 128;
        int i3 = i2 % 2;
    }

    public SecureTokenSuspend(k kVar) {
        this.innerTokenSuspendProcess = kVar;
    }

    private static void B(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        int i5 = $11 + 103;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            int i8 = i6 + 23;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f19215a;
        if (cArr2 != null) {
            int i10 = $10 + 113;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = d.a(593 - Color.red(0), (char) (13181 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.getMode(0) + 11, -1225586509, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i12++;
                    int i13 = $10 + 49;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
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
        Object[] objArr3 = {Integer.valueOf(f19216b)};
        Object objA2 = d.a(-1503702982);
        long j2 = 0;
        if (objA2 == null) {
            objA2 = d.a(TextUtils.indexOf((CharSequence) "", '0') + 33, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 11 - Color.green(0), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f19219e) {
            int i15 = $11 + 85;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(458 - Color.alpha(0), (char) ((-1) - ExpandableListView.getPackedPositionChild(j2)), TextUtils.indexOf("", "") + 11, -1923924106, false, $$e(b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 6))), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f19217c) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i17 = $10 + 99;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e / 0) * fVar.f19922a] >> i2] % iIntValue);
                    i3 = fVar.f19922a % 0;
                } else {
                    cArr5[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i3 = fVar.f19922a + 1;
                }
                fVar.f19922a = i3;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i18 = $10 + 69;
        $11 = i18 % 128;
        int i19 = i18 % 2;
        fVar.f19923e = cArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = d.a(1540807955);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = d.a(458 - Gravity.getAbsoluteGravity(0, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1923924106, false, $$e(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 6))), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static void C(int i2, char c2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f19218d[i2 + i5])};
                Object objA = d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = d.a(742 - TextUtils.indexOf("", "", 0), (char) View.MeasureSpec.getSize(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, 632508977, false, $$e(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 32))), b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f19220f), Integer.valueOf(c2)};
                Object objA2 = d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = d.a(TextUtils.lastIndexOf("", '0') + 767, (char) (12470 - TextUtils.getTrimmedLength("")), View.resolveSize(0, 0) + 12, 1946853218, false, $$e(b3, (byte) ((b3 + 33) - (33 & b3)), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = d.a(-723636472);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = d.a(TextUtils.indexOf("", "", 0, 0) + 387, (char) View.combineMeasuredStates(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 39570797, false, $$e(b4, (byte) ((b4 + 38) - (38 & b4)), b4), new Class[]{Object.class, Object.class});
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
        while (oVar.f19947b < i3) {
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = d.a(-723636472);
            if (objA4 == null) {
                byte b5 = (byte) 0;
                objA4 = d.a(AndroidCharacter.getMirror('0') + 339, (char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 39570797, false, $$e(b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 38))), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i8 = $10 + 89;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void D(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 101 - r8
            int r0 = r7 * 3
            int r7 = 1 - r0
            int r0 = r6 * 2
            int r6 = 3 - r0
            byte[] r5 = fr.antelop.sdk.digitalcard.SecureTokenSuspend.$$a
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r5 != 0) goto L2a
            r0 = r7
            r2 = r3
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L16:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            int r6 = r6 + 1
            if (r2 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r9[r3] = r0
            return
        L27:
            r0 = r5[r6]
            goto L13
        L2a:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenSuspend.D(short, byte, int, java.lang.Object[]):void");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] b(android.content.Context r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 13499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureTokenSuspend.b(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void e() {
        char[] cArr = new char[1886];
        ByteBuffer.wrap("[z¡x¯¢µø²^¸_\u0086\u008c\u008cÆ\u0089y\u0097¢\u009dæ\u009a\u0005àQî¿ôÊñvÿ¡ÅþÂ\u0012ÈMÖ\u0092Ü÷Ù`'ª-ì*\u00170Z\u0094Ýnß`\u0005z_}ùwøI+CaFÞX\u0005RAU¢/ö!\u0018;|>Ü0\u0012\nN\r\u008f\u0007ý\u00196\u0013}\u0016×è\tâN¹¶C´MnW4P\u0092Z\u0093d@n\nkµun\u007f*xÉ\u0002\u009d\fs\u0016\u0014\u0013§\u001dg'#\u0010\u0085ê\u0090äAþ\u0002ù¡óªÍsÇ1Â\u0097ÜWÖ\u0015Ñ¦«¡¥p¿8º\u0089´\\\u008e\u001a\u0089û\u0083©\u009dA\u00975\u0092\u008dlQf\u0006aî{²u`\u0094ÝnÞ`\u0014zJ}ùwûI#C#FÊX\u0011RGU¡\u0094ÝnÞ`\u0014zJ}ùwìI-C`F\u0094X\u0013RZU¾/î\u0094ÝnÈ`\u0004zJ}·wíI C\"FèX%ReU¾/è!\";H>Ô0\u0016\nJ\u0094ÝnÈ`\u0019zZ}¢wúI)C\"FÖX\nRJUþ/ò!.;n>Û0\u0000\n\u0005\r£\u0007öÊä0¦>s$3#Í)\u0093©\u0005S\u0010]ÁG\u0082@zJ\"tñ~ú{\u0000eÒo\u009eh&\u0012(\u001cú\u0006¹\u0003\u0018\rì7¾0%:/$û.º+\u0019Õ\u0088ß\u0091ØdÂ.Ìíö¤ó\u0000ýÈ|K\u0086^\u0088\u008f\u0092Ì\u00954\u009fl¡¿«´®N°\u009cºÐ½hÇfÉ´Ó÷ÖVØ¢âðåkï\u007fñ¢ûöþRñP\u000bE\u0005\u0094\u001f×\u0018/\u0012w,¤&¯#[=\u00877Ç0sJ\u007fD£^ã[VU\u008aoËh(bB|\u0086vòsK\u008d\u009f\u0087×\u0080p\u009af\u0094£÷À\rÂ\u0003\u0018\u0019B\u001eä\u0014ì*< }%Ò;\u00191@6©LðB.N\u0096´ÂºX ]§µ\u00adà\u0093>\u0099\u007f\u009c\u0082\u0082\u001d\u0088Q\u008f´õü\u0094\u009cnÞ`\u0001zZ}³w±I*ChFÎ\u0094ÝnË`\u0012zF}µw°I\"CdFÖX\u0006R[U¨/í!3;i>Ø0\u0011\u0094\u009cnÞ`\rz\\}¥wù\u0094\u0080nÔ`NzY}¤wðI CxFÙX\u0017R\u0006U¼/ÿ!);y>Ó0\u0003\nH\r¤\u0007ì\u00194\u0013j\u0016Æ\u0094\u0095nÞ`\u000ezPûë\u0001·\u000f{\u00153\u0012Ö\u0018\u0085&Y,J) 7s=2:\u0096@\u0095NJTKQ¸_ne bÌh\u0097v\u0001|\u0001y\u00ad\u0087a\u008dm\u008aÜ\u0090\u0090\u009eC¤\u0002¡\u0081¯rµ<²Î¸\u00adÆ[Ì\u0005É±×rÝ(Úöà\u0096îX\u0093Qi\rgÁ}\u0089zlp?NãDðA\u001a_ÉU\u0088R,(/&ð<ñ9\u00027Ô\r\u009a\nv\u0000-\u001e»\u0014»\u0011\u0017ïÛå×âfø*öùÌ¸É;ÇÈÝ\u0086ÚtÐ\u0017®å¤¿¡\u000b¿Èµ\u0098²LFë¼·²{¨3¯Ö¥\u0085\u009bY\u0091J\u0094 \u008as\u00802\u0087\u0096ý\u0095óJéKì¸ânØ ßÌÕ\u0097Ë\u0001Á\u0014Ä²::0 7Ë-\u0098`×\u009a\u008b\u0094G\u008e\u000f\u0089ê\u0083¹½e·v²\u009c¬O¦\u000e¡ªÛ©ÕvÏwÊ\u0084ÄRþ\u001cùðó«í=ç(â\u008e\u001c\u0006\u0016\u0013\u0011ç\u000b®.¸ÔäÚ(À`Ç\u0085ÍÖó\nù\u0019üóâ èaïÅ\u0095Æ\u009b\u0019\u0081\u0018\u0084ë\u008a=°s·\u009f½Ä£R©G¬áRiX}_\u008aEÁ\u0094\u0082nÞ`\u0012zZ}¿wìI0C#FÉX\u001aR[Uÿ/ü!#;\">Ñ0\u0007\nI\r¥\u0007þ\u0019h\u0013}\u0016ÛèSâGå½ÿû\u0094\u0084nÙ`\u000fzQ}¥wù\u0094ÝnË`\u0012zF}µw°I)CbFÞX\u0016RDU´/í\u0094\u0084nÙ`\u000fzQ}±wêI!C~FÎCG¹,·ü\u00ad¢ªI \u0002\u009eÂ\u0094\u0096\u0091'\u008fÿ\u001bÐá\u0082ï\\õ\u0010òîø¿Æ}#7Ùu×´ÍàÊ\u001dÀPþ\u0097ôÆq\u0006\u008bR\u0085È\u009fß\u0098\"\u0092v¬¦¦þ£_½\u0091·\u0080°3Ê}Ä·ÞãÛPÕ\u0081\u0019îã³íe÷;ð\u0084úÃÄ^\u0094\u0095nÞ`\u000ezL}¤wöI'!ÎÛ\u0085ÕUÏ\u0017ÈÿÂ\u00adü|ö\tó\u0099í\u0000çE\u0094\u0095nÞ`\u000ezL}¤wöI'CRFÂX[R\u001eU\u008e/¨!s\u0094\u0080nÔ`NzY}¤wðI CxFÙX\u0017R\u0006U¼/ñ!#;i>Ù\u0094\u0081nß`\u000bj\u0081\u0090ù\u009e\"\u0084;\u0083¶\u0089Ø·\u0018½K¸á¦<¬\u007f«ÃÑÊß\u001aÅLÀ§Î\u0013ôqó\u0090ùÄç\u0019íX\u0094³nÕ`\u0004z[}¹wöI C-FéX'RcUñ/ü!2;e>Ù0\u0016\n\u000b\r¶\u0007ö\u00194\u0013/\u0016ÌèEâ\u001c$\u0096ÞðÐ!Ê~Í\u009cÇÓù\u0005ó\böÌè\u0002âFåÔ\u009fÙ\u0091\u0017\u008b@\u008eü\u00803º.½\u0093·Ó©\u0011£\n¦éX`R9U©O\u008bAP©\u0001SU]ÏGÀ@6Jlt¡~û{Ze\u0090oÌ\u0094\u0095nÔ`\fzM}°wöI7Ceöz\f'\u0002ñ\u0018¯\u001f\u0010\u0015W\u0094\u0080nÚ`\u000ezJ}¾wêéÜ\u0013\u0088\u001d\u0012\u0007\u0005\u0000ø\n¬4|>$;\u0085%K/Z(ïR°\\zF>C\u008d\u0094\u0080nÔ`NzB}³wíI*ChFÖXMRYU´/ó!2\u0094\u0080nÔ`NzZ}³wüI1C\u007fFß\u0094\u0080nÔ`NzK}£wöI(CiF\u0094X\u0013RZU¾/ú!2;o>Á\u0094\u0094nÎ`\fzE}\u0089wçI|C;\u0094\u0080nÔ`NzK}£wöI(CiF\u0094X\u0005RAU¿/ù!\";~>Å0\u0010\nB\r¾\u0007íã³\u0019ø\u0017(\rj\n\u0082\u0000Ð>\u00014\u00041ï/!%e\"ØXßV\u0004LDIöG6}dz\u0095\u0094\u0095nÞ`\u000ezL}¤wöI'CRFÂX[R\u001eUþ/í!#;g>ê0\u001a\n\u0013\ræ\u0007¶\u0019!\u0013j\u0016Úè\u0018âXåºÿûñ\u001eËvÎ\u008fÀJ\u0094\u0095nÞ`\u000ezL}¤wöI'C\"FÝX\fRGU¶/ò!\";S>Æ0\u0006\n@\rÿ\u0007þ\u0019#\u0013a\u0016Ñè\u000fâCå°ÍN7\u00059Õ#\u0097$\u007f.-\u0010ü\u001aù\u001f\u0017\u0001Ú\u000b\u009c\frv}xªb§gAiÏS\u0092Td^:@¥JâO\u001föN\f\u000f\u0002Ô\u0018\u0095\u001fa\u0015!+°!¥$\u0005:Ó0¬7mM5CôY¸\\\u0000RÜh¯osez{«qût\b\u008aÃ\u0080\u009f\u0087m\u009d1\u0093ó©¶¬3¢ß¸Æ¿?\u0097·mãcyy|~\u008etÇJ\u0007@VEâ[5Q{V\u0083,Û¬_V\u000bX\u0091B\u0094EfO/qï{»~\b`Ýj\u0090mk\u0017o\u0019ú\u0003¦\u0006\u0003\bÑ2\u00905!? !ð+¾.\fÐÇÚ\u0087Ý|Ç5É÷ó¿ö\u001ci|\u0093\u001a\u009dË\u0087\u0094\u0080v\u008a9´ï¾ï»\r¥\u0094¯Ñ\u0094\u0080nÔ`NzK}£wöI(CiF\u0094X\u0007RAU¢/î!+;m>Ì0L\nB\r´Ê·0ï>\"$l#Ê\u0081o{!uýo©h\fb\u0018\\ÆV\u009aS`MæG¹@H:\u001f4\u009e.\u0088+3%ù\u001f¯\u0018W\u0094\u0083nÞ`\rz\\}øw÷I3C#F×X\u0002RAU¿/õ!\";u>Æ\u0094\u0083nÞ`\rz\\}øwìI\"C#FÜX\u0002RCU´/Á!$;m>Ø0\u0007\nY\r±¸ÈB\u0095LFV\u0017Q³[§eiohj\u009dtK~\u0007yÅ\u0003±\ri\u0017)\u0012\u008d\u001c@&\u0014!â\u0094\u0080nÔ`NzB}³wíI*ChFÖXMRIU¿/ú!5;c>Ü0\u0006\n\u0005\r¡\u0007ü\u0019+\u0013z\u0016Ð\u0094\u0080nÔ`NzK}¹wðI0C#FËX\u0006REU¤/°!&;z>Ñ0=\nE\r±\u0007ô\u0019#5+Ï\u007fÁåÛíÜ\u0019ÖYèÁâÄçdù¡óïô\u001e\u008e\u001b\u0080\u008a\u009aÎ\u009fp\u0091®«å¬\t¦B¸\u009f²Í·qI¢\u00826xbvølïk\u0012aF_\u0096UÎPoN¡D°C\u00059]7\u0098-Ö(g&ú\u001cû\u001b\u000f\u0011A\u000f\u0097\u0005Ü\u0000pþ»ôîó\fé@ç\u0083\u0094\u0080nÔ`NzZ}¯wìI0ChF×XMRJU¤/÷!+;h>\u009b0\u0004\nB\r¾\u0007þ\u0019#\u0013}\u0016Äè\u000fâCå½ÿì\u0094\u0080nÔ`NzZ}¯wìI0ChF×X<RMU©/ê!i;n>À0\u000b\nG\r´\u0007·\u0019 \u0013f\u0016Úè\u001aâOå¡ÿèñ3ËgÎÙÀ\b\u0094\u0080nÔ`Nz_}³wñI CbFÈXMRJU¤/÷!+;h>\u009b0\u0004\nB\r¾\u0007þ\u0019#\u0013}\u0016Äè\u000fâCå½ÿìT½®é sºb½\u008e·Ì\u0089\u001d\u0083_\u0086õ\u0098\u0001\u0092q\u0095\u0080ïÈá\u0017û\u001fþêð*Ê\u007fÍ\u0081ÇÀÙUÓTÖà(.\"p%\u008b?×1\f\u000bA\u000eã\u0000/\u001alG\r½\u000f³Õ©\u008f®)¤>\u009añ\u0090°\u0095\u001f\u008bì\u0081\u0088\u0086hü>òòe¬\u009f®\u0091t\u008b.\u008c\u0088\u0086\u009d¸Z²\u001f· ©w£-¤\u008fÞ\u008dÐWÊ\u000eÏ¡Áqû;üÏö\u008cèhâ\u0019ç \u0019b\u0013\"\u0014Æ©\u0012S\u0010]ÊG\u0090@6J#tä~¡{\u001eeÉo\u0093h1\u00126\u001cí\u0006\u00ad\u0003\u0003\rÉ\u0092¸hºf`|:{\u009cq\u0089ONE\u000b@´^cT9S\u009b)\u008a'G=\u00048¥6cv{\u008cn\u0082¿\u0098ü\u009f_\u0095H«\u0087¡Æ¤iº\u009a°ú·\u0005ÍYÃ\u0082ÙÏ\u0094ÝnÈ`\u0019zZ}¢wúI)C\"FÖX\nRJUþ/ò!.;n>Ö0=\nF\r±\u0007õ\u0019*\u0013`\u0016×è\"âNå¶ÿúñ4ËiÎèÀ\rÚ@Ý¿×î©n£z¦Ù\u000f\u009fõ\u009dûGá\u001dæ»ì¿ÒuØ;Ý§ÃFÉ\u001aÎà\u0094Ýnß`\u0005z_}ùwýI7CyFåX\u0017RAU¼/û\u0094Ýnß`\u0005z_}ùwìI+CnFÑX\u0006R\\Uþ/ü!4;x>Ó0\r\nG\r´\u0007ü\u00194\u0013k`!\u009a4\u0094å\u008e¦\u0089^\u0083\u0006½Õ·Þ²*¬ö¦¶¡\u0002Û\u000eÕÒÏ\u0092Ê+Äíþ£ùJó\níÖç\u0097â-\u001có\u0016\u0089\u0011E\u000b\n\u0005Ô?Ü:84ï\u0094Ýnß`\u0005z_}ùwýI7CyFÛX\u0000RKU´\u008bÍqÏ\u007f\u0015eObéhíV'\\iYÍG\nMJJ®Ýd'f)¼3æ4@>D\u0000\u008e\nÀ\u000fn\u0011¿\u001bö\u001c\u00060öÊôÄ.ÞtÙÒÓÖí\u001cçRâþü:öjñ\u009f\u0094Ýnß`\u0005z_}ùwýI7CyFÌX\u000eR[U¶\u0094Ýnß`\u0005z_}ùwýI7CyFÊX\u0004RIU¸/î!$\u0094Ýnß`\u0005z_}ùwýI7CyFåX\nREU´\u0094Ýnß`\u0001z]}·w°I CbFÍX\rRDU¾/ÿ!#;\u007f>\u009a0L\nS\r²\u0007¶\u0019$\u0013|\u0016Àè\u0016\u0094ÝnÖ`\u000ez]}ùwèI-CcFÞX\fR_U¢/±!\u0005;\u007f>Á01\nC\r±\u0007ë\u0019#\u0013k\u0016òè\u0012âFå·ÿýñ3\u0094ÝnË`\u0012zF}µw°I-CbFÊX\fRZU¥/í\u009eædùj\"p-wÈ\u0094ÝnË`\u0012zF}µw°I7ChFÖX\u0005R\u0007U¼/ÿ!7;\u007f\u0094\u0095nÉ`\u0001zE}ºwðI'C#FÝX\fRDUµ/ø!.;\u007f>Ý0L\nX\r¿\u0094\u009enÒ`\u0002zn}\u009awÚI\u0017CRFØX\u0010R\\Uÿ/í!(ZM N®\u0084´Ú³i¹b\u0087±\u008dù\u0088C\u0096\u0092\u009cç\u009b\"áaï³õùðFþ\u0081Ä\u0095Ã8Éd×º\u009eàd§jep<wÕ}\u009bCUI\u001eL¡R`;ËÁÈÏ\u0002Õ\\ÒïØäæ=ìnéÂ÷\u0001ýMfþ\u009cü\u0092\"\u0088~\u008f\u0094\u0085\u0093»\u0003±A´îª. g§\u009dÝÜÓ\u0000É\\Ì¹Âoølÿ\u0083õ\u0095ë\u0004á\\äç\u001a-\u0010'\u0017\u0088\rÖ\u0003\u000e\u0094ÝnË`\u0012zF}µw°I'C}FÏX\nRFU·/ñ|þ\u0086\u009f\u0088G\u0092\u0006\u0095û\u009f½¡|«.\u00867|c\u0091<k>eà\u007f¼xVrQLÈF\u0085C(]áWæP@*\r$É>\u008b;=5ï\u000f¯\bB\u0002W\u001cÄ\u0016\u009b\u0013'í³çûà\u001dú\u001aôÏÎ\u0082ËxÅðß\u00adØPÒ\b¬Î¦\u009e£>½ì·±°\"\u008a\u0016\u0084Ç\u009e\u0084\u009b%\u0095öo«hh".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1886);
        f19218d = cArr;
        f19220f = -8322342954078933317L;
    }

    static void init$0() {
        $$a = new byte[]{7, 42, -92, 85};
        $$b = 104;
    }

    static void init$1() {
        $$c = new byte[]{85, Ascii.RS, 127, 42};
        $$d = 131;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19223i + 103;
        f19224j = i3 % 128;
        int i4 = i3 % 2;
        List<i> listD = this.innerTokenSuspendProcess.d();
        if (i4 == 0) {
            return m.b(listD);
        }
        m.b(listD);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        int i2 = 2 % 2;
        int i3 = f19223i + 19;
        f19224j = i3 % 128;
        int i4 = i3 % 2;
        k kVar = this.innerTokenSuspendProcess;
        if (i4 == 0) {
            return kVar.g();
        }
        kVar.g();
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19224j + 19;
        int i4 = i3 % 128;
        f19223i = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 43;
        f19224j = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19223i + 99;
        f19224j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.innerTokenSuspendProcess};
            int i4 = o.x.i.f26925h * 601961010;
            o.x.i.f26925h = i4;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iNextInt = new Random().nextInt(1592817291);
            int i5 = o.x.i.f26927j * 826423998;
            o.x.i.f26927j = i5;
            int i6 = 72 / 0;
            if (!((Boolean) o.x.i.c(-571425008, i4, 571425009, iFreeMemory, i5, iNextInt, objArr)).booleanValue()) {
                return true;
            }
        } else {
            Object[] objArr2 = {this.innerTokenSuspendProcess};
            int i7 = o.x.i.f26925h * 601961010;
            o.x.i.f26925h = i7;
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int iNextInt2 = new Random().nextInt(1592817291);
            int i8 = o.x.i.f26927j * 826423998;
            o.x.i.f26927j = i8;
            if (!((Boolean) o.x.i.c(-571425008, i7, 571425009, iFreeMemory2, i8, iNextInt2, objArr2)).booleanValue()) {
                return true;
            }
        }
        int i9 = f19223i + 67;
        f19224j = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerTokenSuspendProcess.e(context, new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerTokenSuspendProcess));
        int i3 = f19223i + 33;
        f19224j = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerTokenSuspendProcess.e(context, new j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerTokenSuspendProcess));
        int i3 = f19223i + 73;
        f19224j = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19224j + 87;
        f19223i = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerTokenSuspendProcess.e(context, customerAuthenticationCredentials);
        } else {
            this.innerTokenSuspendProcess.e(context, customerAuthenticationCredentials);
            throw null;
        }
    }
}
