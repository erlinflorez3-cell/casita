package o.ce;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements X509TrustManager {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22187b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22188e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22189f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22190g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22191h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509TrustManager f22192a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22194d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0017). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r8 = o.ce.c.$$a
            int r0 = r11 * 4
            int r7 = 120 - r0
            int r0 = r9 * 4
            int r0 = r0 + 3
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2e
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
            if (r3 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r0]
            int r3 = r3 + 1
            r2 = r0
            r0 = r1
            goto L17
        L2e:
            r3 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ce.c.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22190g = 0;
        f22189f = 1;
        f22188e = 0;
        f22191h = 1;
        b();
        int i2 = f22189f + 93;
        f22190g = i2 % 128;
        int i3 = i2 % 2;
    }

    c(X509TrustManager x509TrustManager, String str, String str2) {
        this.f22192a = x509TrustManager;
        this.f22194d = str;
        this.f22193c = str2;
    }

    static void b() {
        f22187b = new char[]{56506, 56540, 56538, 56555, 56550, 56548, 56551, 56551, 56535, 56544, 56563, 56564, 56563, 56547, 56544, 56558, 56561, 56563, 56560, 56419, 56420, 56418, 56421, 56413, 56410, 56425, 56434, 56427, 56425, 56417, 56417, 56433, 56434, 56433, 56426, 56418, 56384, 56356, 56356, 56366, 56404, 56426, 56388, 56383, 56418, 56425, 56433, 56428, 56421, 56421, 56420, 56416, 56424, 56426, 56384, 56382, 56423, 56425, 56384, 56392, 56431, 56431, 56433, 56433, 56434, 56433, 56426, 56418, 56478, 56517, 56520, 56500, 56543, 56575, 56723, 56737, 56733, 56734, 56734, 56734, 56734, 56444, 56443, 56734, 56741, 56749, 56744, 56737, 56737, 56736, 56732, 56740, 56742, 56444, 56705, 56746, 56742, 56734, 56737, 56741, 56744, 56740, 56740, 56744, 56742, 56744, 56705, 56705, 56737, 56737, 56739, 56444, 56442, 56737, 56739, 56444, 56708, 56749, 56749, 56750, 56749, 56742, 56734, 56444, 56707, 56742, 56741, 56750, 56743, 56741, 56707, 56443, 56734, 56741, 56749, 56744, 56737, 56737, 56736, 56732, 56740, 56742, 56444, 56705, 56746, 56742, 56734, 56737, 56741, 56744, 56740, 56740, 56744, 56742, 56744, 56705, 56705, 56737, 56737, 56739, 56444, 56442, 56739, 56741, 56444, 56705, 56744, 56747, 56708, 56708, 56744, 56736, 56444, 56707, 56740, 56737, 56739, 56344, 56756, 56749, 56744, 56748, 56744, 56708, 56441, 56738, 56750, 56742, 56745, 56749, 56755, 56751, 56748, 56752, 56750, 56752, 56713, 56441, 56729, 56745, 56747, 56729, 56543, 56381, 56389, 56391, 56349, 56348, 56388, 56393, 56392, 56393, 56393, 56354, 56354, 56386, 56386, 56388, 56349, 56347, 56388, 56390, 56349, 56354, 56393, 56396, 56357, 56357, 56393, 56385, 56349, 56356, 56389, 56386, 56388, 56368, 56372, 56386, 56382, 56383, 56383, 56383, 56383, 56349, 56348, 56383, 56390, 56398, 56393, 56386, 56386, 56385, 56381, 56389, 56391, 56349, 56348, 56388, 56393, 56392, 56393, 56393, 56354, 56354, 56386, 56386, 56388, 56349, 56347, 56386, 56388, 56349, 56357, 56398, 56398, 56399, 56398, 56391, 56383, 56349, 56356, 56391, 56390, 56399, 56392, 56390, 56356, 56348, 56383, 56390, 56398, 56393, 56386, 56386, 56331, 56731, 56729, 56713, 56425, 56441, 56736, 56736, 56735, 56736, 56715, 56419, 56436, 56728, 56732, 56728, 56733, 56740, 56717, 56470};
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034 A[PHI: r2 r4
  0x0034: PHI (r2v4 int) = (r2v0 int), (r2v5 int) binds: [B:15:0x0074, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:15:0x0074, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String e(java.lang.String r9, java.security.Principal r10) throws java.lang.Throwable {
        /*
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.ce.c.f22191h
            int r1 = r0 + 31
            int r0 = r1 % 128
            o.ce.c.f22188e = r0
            int r1 = r1 % r8
            r7 = -1
            r0 = 313(0x139, float:4.39E-43)
            java.lang.String r6 = "\u0000"
            r5 = 0
            r3 = 1
            if (r1 == 0) goto L57
            java.lang.String r4 = r10.getName()
            int r2 = r4.indexOf(r9)
            int[] r1 = new int[]{r0, r3, r5, r3}
            java.lang.Object[] r0 = new java.lang.Object[r3]
            i(r6, r1, r3, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r1 = r4.indexOf(r0, r2)
            if (r1 != r7) goto L38
        L34:
            int r1 = r4.length()
        L38:
            r3 = 0
            if (r2 < 0) goto L78
            int r0 = r9.length()
            int r0 = r0 + r2
            if (r1 < r0) goto L78
            int r0 = r9.length()
            int r2 = r2 + r0
            java.lang.String r2 = r4.substring(r2, r1)
            int r0 = o.ce.c.f22191h
            int r1 = r0 + 59
            int r0 = r1 % 128
            o.ce.c.f22188e = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L77
            return r2
        L57:
            java.lang.String r4 = r10.getName()
            int r2 = r4.indexOf(r9)
            int[] r1 = new int[]{r0, r3, r5, r3}
            java.lang.Object[] r0 = new java.lang.Object[r3]
            i(r6, r1, r5, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r1 = r4.indexOf(r0, r2)
            if (r1 != r7) goto L38
            goto L34
        L77:
            throw r3
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ce.c.e(java.lang.String, java.security.Principal):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:10:0x0036, B:12:0x0047, B:13:0x0078, B:29:0x00d3, B:31:0x00eb, B:32:0x0119, B:44:0x019b, B:46:0x01ac, B:47:0x01e1, B:37:0x0136, B:39:0x014f, B:40:0x0184), top: B:78:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:10:0x0036, B:12:0x0047, B:13:0x0078, B:29:0x00d3, B:31:0x00eb, B:32:0x0119, B:44:0x019b, B:46:0x01ac, B:47:0x01e1, B:37:0x0136, B:39:0x014f, B:40:0x0184), top: B:78:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(java.lang.String r23, int[] r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ce.c.i(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
        $$b = 252;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int i2 = 2 % 2;
        int i3 = f22188e + 31;
        f22191h = i3 % 128;
        int i4 = i3 % 2;
        this.f22192a.checkClientTrusted(x509CertificateArr, str);
        int i5 = f22191h + 33;
        f22188e = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws Throwable {
        String strIntern;
        Object obj;
        short sXd = (short) (C1633zX.Xd() ^ (-16970));
        short sXd2 = (short) (C1633zX.Xd() ^ (-29040));
        int[] iArr = new int["Kڟe;́ȯ/iؒ\u001f_ɸ\u000b¸%\u05f8;\u0017".length()];
        QB qb = new QB("Kڟe;́ȯ/iؒ\u001f_ɸ\u000b¸%\u05f8;\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        int i3 = 2 % 2;
        int i4 = f22191h + 15;
        f22188e = i4 % 128;
        int i5 = i4 % 2;
        try {
            this.f22192a.checkServerTrusted(x509CertificateArr, str);
            X509Certificate x509Certificate = x509CertificateArr[0];
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("),Q^E%\u001aBe\u0010(n|]U$\u001b\u000eUg\u0010\u0012\tdQY \u000bAL\u0012u.8", (short) (C1607wl.Xd() ^ 9611), (short) (C1607wl.Xd() ^ 12463))).getMethod(C1626yg.Ud("?x\ts\u001d\\BEr>yp", (short) (Od.Xd() ^ (-14664)), (short) (Od.Xd() ^ (-3439))), new Class[0]);
            try {
                method.setAccessible(true);
                Principal principal = (Principal) method.invoke(x509Certificate, objArr);
                Object[] objArr2 = new Object[1];
                i(Ig.wd(".v\u0005", (short) (C1580rY.Xd() ^ (-23444))), new int[]{68, 3, 0, 0}, true, objArr2);
                if (!this.f22194d.equals(e(((String) objArr2[0]).intern(), principal))) {
                    if (f.a()) {
                        int i6 = f22191h + 31;
                        f22188e = i6 % 128;
                        int i7 = i6 % 2;
                        String strZd = Wg.Zd("ܤдY:W1ا˿֘èCߚӲ\u0017ӛܴ6K)J'ط\u001e?Ā֑é0\u0011&߄˜ܵɅ۞\u001a7\u0010и\u000f,ù\"٫!ה\u0017t\u0016ծɆ)\u0007 |йܒТٻ\u0013٬żfí׆z\u001cxӠޱˉܢ\u000b܋\u0002b\u007fѥvϖtͿk\t߉~ֲ}ԣsQr", (short) (ZN.Xd() ^ 15916), (short) (ZN.Xd() ^ 1663));
                        if (i7 != 0) {
                            Object[] objArr3 = new Object[1];
                            i(str2, new int[]{0, 18, 0, 2}, false, objArr3);
                            strIntern = ((String) objArr3[0]).intern();
                            Object[] objArr4 = new Object[1];
                            i(strZd, new int[]{202, 92, 91, 33}, true, objArr4);
                            obj = objArr4[0];
                        } else {
                            Object[] objArr5 = new Object[1];
                            i(str2, new int[]{0, 18, 0, 2}, true, objArr5);
                            strIntern = ((String) objArr5[0]).intern();
                            Object[] objArr6 = new Object[1];
                            i(strZd, new int[]{202, 92, 91, 33}, false, objArr6);
                            obj = objArr6[0];
                        }
                        f.d(strIntern, ((String) obj).intern());
                    }
                    Object[] objArr7 = new Object[1];
                    i(C1561oA.Xd("4חט7ךכ:םמןנ?עABCDקF", (short) (C1633zX.Xd() ^ (-721))), new int[]{294, 19, 178, 19}, true, objArr7);
                    Object[] objArr8 = {((String) objArr7[0]).intern()};
                    Constructor<?> constructor = Class.forName(Wg.vd("\u0017\r!\u000bV\u001b\f\t*&\u001c&*]\u0012\u0013/0h|\u001e*+\u001f+-&#5%\u0004601;>275", (short) (FB.Xd() ^ 25227))).getConstructor(Class.forName(Qg.kd("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018", (short) (Od.Xd() ^ (-23344)), (short) (Od.Xd() ^ (-2890)))));
                    try {
                        constructor.setAccessible(true);
                        throw ((CertificateException) constructor.newInstance(objArr8));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Object[] objArr9 = new Object[1];
                i(EO.Od("\u0089Ң", (short) (Od.Xd() ^ (-27863))), new int[]{71, 2, 25, 0}, false, objArr9);
                String strE = e(((String) objArr9[0]).intern(), principal);
                if (this.f22193c.isEmpty()) {
                    return;
                }
                int i8 = f22188e + 97;
                f22191h = i8 % 128;
                int i9 = i8 % 2;
                if (this.f22193c.equals(strE)) {
                    return;
                }
                int i10 = f22191h + 1;
                f22188e = i10 % 128;
                int i11 = i10 % 2;
                if (f.a()) {
                    Object[] objArr10 = new Object[1];
                    i(str2, new int[]{0, 18, 0, 2}, true, objArr10);
                    String strIntern2 = ((String) objArr10[0]).intern();
                    Object[] objArr11 = new Object[1];
                    i(C1561oA.Qd("\u0004̑\u0002\u0001\u007f̍}|̊z̈x̆vut̂́qponml˺ji˷˶fe˳c˱˰`ˮ˭]\\[˩˨˧˦VˤTSRˠP˞N˜LK˙I˗G˕EDCˑː@?>=<;ˉ98ˆ˅54˂2ˀʿ/ʽʼ,+*)(ʶ&%ʳʲʱ! \u001fʭʬʫ", (short) (C1607wl.Xd() ^ 30312)), new int[]{73, 104, 186, 0}, false, objArr11);
                    f.d(strIntern2, ((String) objArr11[0]).intern());
                    int i12 = f22191h + 109;
                    f22188e = i12 % 128;
                    int i13 = i12 % 2;
                }
                int[] iArr2 = {177, 25, 194, 24};
                Object[] objArr12 = new Object[1];
                short sXd3 = (short) (C1633zX.Xd() ^ (-24675));
                short sXd4 = (short) (C1633zX.Xd() ^ (-20650));
                int[] iArr3 = new int["ӫӬhijkӱmnoӵqrstuvӼxӾӿ{ԁԂԃ".length()];
                QB qb2 = new QB("ӫӬhijkӱmnoӵqrstuvӼxӾӿ{ԁԂԃ");
                int i14 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr3[i14] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i14)) - sXd4);
                    i14++;
                }
                i(new String(iArr3, 0, i14), iArr2, false, objArr12);
                Object[] objArr13 = {((String) objArr12[0]).intern()};
                Constructor<?> constructor2 = Class.forName(C1561oA.od("\u0003x\rvB\u0007wt\u0006\u0002w\u0002\u00069mnz{4Hiuvjfha^p`?q[\\fi]b`", (short) (C1607wl.Xd() ^ 20916))).getConstructor(Class.forName(C1561oA.Kd("D<R>\fKAOI\u00117YXPVP", (short) (C1607wl.Xd() ^ 26585))));
                try {
                    constructor2.setAccessible(true);
                    throw ((CertificateException) constructor2.newInstance(objArr13));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (CertificateException e5) {
            if (f.a()) {
                Object[] objArr14 = new Object[1];
                i(str2, new int[]{0, 18, 0, 2}, true, objArr14);
                String strIntern3 = ((String) objArr14[0]).intern();
                Object[] objArr15 = new Object[1];
                i(hg.Vd("VUTξνμλOιMLζεIγGFEίCBA@ΪΩ=Χ;Υ987ΡΠ43210/.-,ΖΕ)Γ'&%", (short) (C1607wl.Xd() ^ 30239), (short) (C1607wl.Xd() ^ 20554)), new int[]{18, 50, 126, 0}, false, objArr15);
                f.e(strIntern3, ((String) objArr15[0]).intern(), e5);
            }
            throw e5;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        int i2 = 2 % 2;
        int i3 = f22188e + 67;
        f22191h = i3 % 128;
        int i4 = i3 % 2;
        X509Certificate[] acceptedIssuers = this.f22192a.getAcceptedIssuers();
        int i5 = f22191h + 75;
        f22188e = i5 % 128;
        if (i5 % 2 == 0) {
            return acceptedIssuers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
