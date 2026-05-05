package o.t;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o.a.l;
import o.ea.f;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f26798b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f26802f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26803g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f26804h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f26805i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f26806j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f26807k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f26808l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26809m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f26810o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f26811a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, int r10, int r11) {
        /*
            byte[] r8 = o.t.b.$$a
            int r0 = r11 * 2
            int r7 = r0 + 67
            int r2 = r10 * 4
            int r1 = 1 - r2
            int r0 = r9 * 2
            int r6 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r8 != 0) goto L2f
            r0 = r7
            r2 = r4
            r1 = r6
        L18:
            int r0 = -r0
            int r6 = r6 + r0
            r7 = r6
            r6 = r1
        L1c:
            byte r0 = (byte) r7
            r5[r2] = r0
            int r1 = r6 + 1
            if (r2 != r3) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            int r2 = r2 + 1
            r0 = r8[r1]
            r6 = r7
            goto L18
        L2f:
            r2 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.b.$$c(byte, int, int):java.lang.String");
    }

    static {
        String strIntern;
        init$0();
        $10 = 0;
        $11 = 1;
        f26808l = 0;
        f26810o = 1;
        f26807k = 0;
        f26809m = 1;
        b();
        d();
        TextUtils.indexOf("", "");
        View.MeasureSpec.getSize(0);
        KeyEvent.getDeadChar(0, 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        ViewConfiguration.getKeyRepeatTimeout();
        Object[] objArr = new Object[1];
        p(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "¢\u009b\u0096", objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        f26801e = strIntern2;
        int i2 = f26808l + 113;
        f26810o = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            n(new int[]{-2072335149, 545826126, 1964684071, -1418697036, -525100162, 1006543876}, 8 << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else {
            Object[] objArr3 = new Object[1];
            n(new int[]{-2072335149, 545826126, 1964684071, -1418697036, -525100162, 1006543876}, 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
            strIntern = ((String) objArr3[0]).intern();
        }
        f26800d = strIntern;
        StringBuilder sb = new StringBuilder();
        Object[] objArr4 = new Object[1];
        p(127 - Gravity.getAbsoluteGravity(0, 0), null, null, "¡\u0094\u0083\u009f", objArr4);
        StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(strIntern2);
        Object[] objArr5 = new Object[1];
        p(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "¡", objArr5);
        f26799c = sbAppend.append(((String) objArr5[0]).intern()).append(strIntern).toString();
    }

    static void b() {
        f26802f = new int[]{136983337, 677784020, 2094924364, -1371099188, -297924327, -1286514943, -976653934, -90133759, 831129611, 1879047577, -1379254692, 837236667, 481339466, -1926433860, 154793810, 1828143226, -1061711538, 1889944109};
    }

    public static Cipher c() throws Throwable {
        PrivateKey privateKey;
        String str;
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            n(new int[]{1337140754, -825132641, -973592678, 844315326, 496346530, 1845977266, 1697019204, -1565641826}, AndroidCharacter.getMirror('0') - '!', objArr);
            String strIntern = ((String) objArr[0]).intern();
            Class<?> cls = Class.forName(Wg.Zd(";}3U\"?1\u0007\u0019\u000edh-yV\t\u001d.o6)s", (short) (C1499aX.Xd() ^ (-17399)), (short) (C1499aX.Xd() ^ (-26082))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Xd("PH^J\u0018WM[U\u001dCed\\b\\", (short) (OY.Xd() ^ 32286)));
            Object[] objArr2 = {strIntern};
            Method declaredMethod = cls.getDeclaredMethod(Wg.vd("\u0014\u0011\u001fr\u0017\u001b\u001b\u0007#\u0017\u0018", (short) (FB.Xd() ^ 16971)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr2);
                Class<?> cls2 = Class.forName(Qg.kd("e[oY%iZWhdZdh\u001c8Qd=]WYK", (short) (OY.Xd() ^ 20168), (short) (OY.Xd() ^ 18639)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(hg.Vd("G=Q;\u0007K<9JF<FJ}\u001a3F\u001f?9;-j\u00124%'\u00155/1#\r\u001d-\u001b&\u001d+\u001b'", (short) (C1607wl.Xd() ^ 30264), (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE_START)));
                Object[] objArr3 = {null};
                Method method = cls2.getMethod(C1561oA.ud(",.\u001f!", (short) (C1633zX.Xd() ^ (-27288))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr3);
                    try {
                        Object[] objArr4 = new Object[1];
                        p(127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, null, C1561oA.yd("ӑӖӈӍӊӋӌӑӏӁӌӊӂӘ", (short) (C1499aX.Xd() ^ (-22109))), objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Class<?> cls3 = Class.forName(C1561oA.Yd(".&<(u</.A?7CI~\u001d8M(JFJ>", (short) (OY.Xd() ^ 14688)));
                        Class<?>[] clsArr3 = new Class[2];
                        clsArr3[0] = Class.forName(Xg.qd("WOeQ\u001f^Tb\\$Jlkcic", (short) (C1499aX.Xd() ^ (-10884)), (short) (C1499aX.Xd() ^ (-10929))));
                        clsArr3[1] = char[].class;
                        Object[] objArr5 = {strIntern2, null};
                        short sXd = (short) (C1580rY.Xd() ^ (-11759));
                        short sXd2 = (short) (C1580rY.Xd() ^ (-7544));
                        int[] iArr = new int["L`mbr%".length()];
                        QB qb = new QB("L`mbr%");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                            i3++;
                        }
                        Method method2 = cls3.getMethod(new String(iArr, 0, i3), clsArr3);
                        try {
                            method2.setAccessible(true);
                            Key key = (Key) method2.invoke(keyStore, objArr5);
                            int i4 = f26809m + 35;
                            f26807k = i4 % 128;
                            int i5 = i4 % 2;
                            String strXd = ZO.xd("Ӳ؟ؘĔѠϔӄ۾\u07b4߲ߓҡȇئϕőןθƛڂ", (short) (C1607wl.Xd() ^ 6073), (short) (C1607wl.Xd() ^ 2315));
                            if (i5 != 0) {
                                privateKey = (PrivateKey) key;
                                Object[] objArr6 = new Object[1];
                                p(KeyEvent.getDeadChar(0, 0) * 12, null, null, strXd, objArr6);
                                str = (String) objArr6[0];
                            } else {
                                privateKey = (PrivateKey) key;
                                Object[] objArr7 = new Object[1];
                                p(127 - KeyEvent.getDeadChar(0, 0), null, null, strXd, objArr7);
                                str = (String) objArr7[0];
                            }
                            try {
                                Object[] objArr8 = {str.intern()};
                                Object[] objArr9 = new Object[1];
                                q(new int[]{-685446571, 902153098, 1570346932, 1633339083, -1558266942, 191720847, -24627923, -1143396759, 820849182, 614011179}, 19 - TextUtils.getCapsMode("", 0, 0), objArr9);
                                Class<?> cls4 = Class.forName((String) objArr9[0]);
                                Object[] objArr10 = new Object[1];
                                q(new int[]{1460521121, 1553151958, 2012474661, -1191429975, 1183620300, -1640951963}, 11 - TextUtils.getOffsetBefore("", 0), objArr10);
                                Cipher cipher = (Cipher) cls4.getMethod((String) objArr10[0], String.class).invoke(null, objArr8);
                                cipher.init(2, privateKey);
                                Provider provider = cipher.getProvider();
                                Object[] objArr11 = new Object[1];
                                n(new int[]{-1704039889, -1639881395, -1783554947, 1724901744, -795053933, 1399338613, -1057872255, 670620801}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, objArr11);
                                String strIntern3 = ((String) objArr11[0]).intern();
                                Object[] objArr12 = new Object[1];
                                n(new int[]{-973196460, -2025008575, 643668207, -2029262968, -1143313345, 2114657176, -615566237, -309709672, -1143075432, -831199497, -178628263, 617249044, 1394339114, -1567345675, -1227727204, -265960145, -1711600234, 709472090, 2126325950, 1942017311, -1442308845, 683774045, 1306900907, 177311459, -1175540658, 1835622949, 2136585674, -1680477251, 538572902, -1171059022, -1671764605, -911787150}, MotionEvent.axisFromString("") + 65, objArr12);
                                provider.setProperty(strIntern3, ((String) objArr12[0]).intern());
                                return cipher;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (RuntimeException e3) {
                        throw new d(e3.getMessage());
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e6) {
            if (f.a()) {
                Object[] objArr13 = new Object[1];
                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 31 - (Process.myPid() >> 22), objArr13);
                String strIntern4 = ((String) objArr13[0]).intern();
                Object[] objArr14 = new Object[1];
                n(new int[]{1402051525, 1784380476, -272256558, -1845699041, -839340942, 45177154, -1806589587, -1273356468, 1359754960, 442842235, -1044743247, -976026324}, KeyEvent.normalizeMetaState(0) + 24, objArr14);
                f.e(strIntern4, ((String) objArr14[0]).intern(), e6);
                int i6 = f26809m + 109;
                f26807k = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 2;
                }
            }
            throw new d(e6.getMessage());
        }
    }

    private static int c_(BiometricManager biometricManager) {
        int iCanAuthenticate;
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT >= 30) {
            int i3 = f26807k + 115;
            f26809m = i3 % 128;
            iCanAuthenticate = biometricManager.canAuthenticate(i3 % 2 == 0 ? PanasonicMakernoteDirectory.TAG_BURST_SPEED : 15);
            int i4 = f26809m + 55;
            f26807k = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iCanAuthenticate = biometricManager.canAuthenticate();
        }
        int i6 = f26809m + 69;
        f26807k = i6 % 128;
        int i7 = i6 % 2;
        return iCanAuthenticate;
    }

    static void d() {
        f26798b = new int[]{-341830981, 1101167804, -1551458100, 1830020026, 300505874, 1229681466, 680200427, -1866937574, 75568063, -2073794750, -883073694, -1939626371, -935399334, -916984024, 637675909, 1805334822, -1862947061, -1363006949};
        f26806j = new char[]{2433, 2167, 2455, 2165, 2440, 2443, 2166, 2164, 2437, 2436, 2520, 2509, 2434, 2442, 2435, 2445, 2457, 2494, 2466, 2489, 2476, 2469, 2162, 2439, 2432, 2163, 2471, 2447, 2444, 2160, 2454, 2161, 2507, 2470, 2472, 2479, 2505, 2468, 2438};
        f26803g = 2040400376;
        f26805i = true;
        f26804h = true;
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -87, -21};
        $$b = 250;
    }

    private static void n(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26798b;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.alpha(0) + 675, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), -328001469, false, $$c(b2, b3, (byte) (27 | b3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 75;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
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
        int[] iArr5 = f26798b;
        char c2 = '0';
        if (iArr5 != null) {
            int i9 = $11 + 3;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 11;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objA2 = o.d.d.a(674 - TextUtils.indexOf("", c2, i5), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, -328001469, false, $$c(b4, b5, (byte) (27 | b5)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i11--;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 676, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 12 - Color.blue(0), -328001469, false, $$c(b6, b7, (byte) ((b7 + Ascii.ESC) - (b7 & Ascii.ESC))), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                c2 = '0';
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
            int i13 = $10 + 53;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            int i16 = 0;
            while (i16 < 16) {
                int i17 = $11 + 53;
                $10 = i17 % 128;
                int i18 = i17 % i14;
                lVar.f19942e ^= iArr4[i16];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(300 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (52697 - View.resolveSizeAndState(0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, -1416256172, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 26)))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i16++;
                i14 = 2;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
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
                byte b11 = b10;
                objA5 = o.d.d.a(230 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (51005 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 9, -330018025, false, $$c(b10, b11, (byte) ((-1) - (((-1) - b11) & ((-1) - 25)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void p(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 93;
        $11 = i5 % 128;
        Object bytes = str4;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        int i6 = 0;
        Object charArray = str3;
        if (str3 != null) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 84 / 0;
                charArray = str3.toCharArray();
            } else {
                charArray = str3.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f26806j;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 53;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objA = o.d.d.a(593 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13181), MotionEvent.axisFromString("") + 12, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                    Object objA2 = o.d.d.a(1618406102);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + IptcDirectory.TAG_BY_LINE, (char) (13182 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -1225586509, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i3 = 2;
                i6 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f26803g)};
        Object objA3 = o.d.d.a(-1503702982);
        if (objA3 == null) {
            objA3 = o.d.d.a(32 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
        int i11 = 1540807955;
        if (f26804h) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA4 = o.d.d.a((Process.myPid() >> 22) + 458, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.indexOf("", "", 0) + 11, -1923924106, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            String str5 = new String(cArr4);
            int i12 = $11 + 41;
            $10 = i12 % 128;
            if (i12 % 2 == 0) {
                objArr[0] = str5;
                return;
            } else {
                int i13 = 20 / 0;
                objArr[0] = str5;
                return;
            }
        }
        int i14 = 0;
        if (f26805i) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr6 = {fVar, fVar};
                Object objA5 = o.d.d.a(i11);
                if (objA5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA5 = o.d.d.a(458 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), TextUtils.indexOf("", "") + 11, -1923924106, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                i11 = 1540807955;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i14;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i14 = fVar.f19922a + 1;
            }
        }
    }

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f26802f;
        int i3 = 989264422;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objA = o.d.d.a(i3);
                    if (objA == null) {
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", '0', i4, i4) + 676, (char) TextUtils.getCapsMode("", i4, i4), 12 - View.MeasureSpec.getSize(i4), -328001469, false, $$c(b2, b3, (byte) ((b3 + Ascii.ESC) - (b3 & Ascii.ESC))), new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = 989264422;
                    i4 = 0;
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
        int[] iArr5 = f26802f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i6])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(675 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 12, -328001469, false, $$c(b4, b5, (byte) ((b5 + Ascii.ESC) - (b5 & Ascii.ESC))), new Class[]{Integer.TYPE});
                }
                iArr6[i6] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
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
            for (int i7 = 0; i7 < 16; i7++) {
                lVar.f19942e ^= iArr4[i7];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(301 - (KeyEvent.getMaxKeyCode() >> 16), (char) (52697 - Color.red(0)), Color.alpha(0) + 11, -1416256172, false, $$c(b6, b7, (byte) ((b7 + Ascii.SUB) - (26 & b7))), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i8 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i8;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i9 = lVar.f19942e;
            int i10 = lVar.f19940a;
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
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(KeyEvent.keyCodeFromString("") + 229, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 51004), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, -330018025, false, $$c(b8, b9, (byte) ((-1) - (((-1) - b9) & ((-1) - 25)))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // o.t.a
    public final void a() throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f26807k + 15;
        f26809m = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            f.a();
            obj2.hashCode();
            throw null;
        }
        if (f.a()) {
            int i4 = f26807k + 125;
            f26809m = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 105 >> (ViewConfiguration.getScrollBarSize() >> 82), objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                n(new int[]{-782061589, -4258785, -886634700, 695341704}, 5 / View.MeasureSpec.getSize(0), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 31 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                n(new int[]{-782061589, -4258785, -886634700, 695341704}, View.MeasureSpec.getSize(0) + 5, objArr4);
                obj = objArr4[0];
            }
            f.c(strIntern, ((String) obj).intern());
        }
        try {
            Object[] objArr5 = new Object[1];
            n(new int[]{1337140754, -825132641, -973592678, 844315326, 496346530, 1845977266, 1697019204, -1565641826}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Class<?> cls = Class.forName(C1626yg.Ud("hq\u0013xbn\tyXSs\u001ao*\t\u0002wG\u001e0\u0001|", (short) (C1633zX.Xd() ^ (-19739)), (short) (C1633zX.Xd() ^ (-19833))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Ig.wd("R\u001a\u0001K\bi\u000b?i\u001cGFyb{R", (short) (C1499aX.Xd() ^ (-25844))));
            Object[] objArr6 = {strIntern2};
            Method declaredMethod = cls.getDeclaredMethod(EO.Od("tCdY\u001fP#)\u0002DF", (short) (FB.Xd() ^ 29390)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr6);
                Class<?> cls2 = Class.forName(C1561oA.Qd("\u0007|\u0011zF\u000b{x\n\u0006{\u0006\n=Yr\u0006^~xzl", (short) (OY.Xd() ^ 15838)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1593ug.zd("g_ua/uhgzxp|\u00038Vq\u0007a\u0004\u007f\u0004w7`\u0005w{k\u000e\n\u000e\u0002m\u007f\u0012\u0002\u000f\b\u0018\n\u0018", (short) (FB.Xd() ^ 3853), (short) (FB.Xd() ^ 22589)));
                Object[] objArr7 = {null};
                Method method = cls2.getMethod(C1561oA.od("\u0012\u0014\u0005\u0007", (short) (Od.Xd() ^ (-27012))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr7);
                    Object[] objArr8 = new Object[1];
                    p(Color.green(0) + 127, null, null, C1561oA.Kd("ترإجثخرظظجععسً", (short) (C1499aX.Xd() ^ (-846))), objArr8);
                    String strIntern3 = ((String) objArr8[0]).intern();
                    Class<?> cls3 = Class.forName(Wg.Zd(";m\u0018BdKtK\u0019/\u0004JdZL\bS\u0007ewW\u0006", (short) (OY.Xd() ^ 24169), (short) (OY.Xd() ^ 3111)));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(C1561oA.Xd("/'=)v6,:4{\"DC;A;", (short) (C1499aX.Xd() ^ (-8747))));
                    Object[] objArr9 = {strIntern3};
                    short sXd = (short) (C1499aX.Xd() ^ (-2656));
                    int[] iArr = new int["<<B:P@\u001fGTQW".length()];
                    QB qb = new QB("<<B:P@\u001fGTQW");
                    int i5 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
                        i5++;
                    }
                    Method method2 = cls3.getMethod(new String(iArr, 0, i5), clsArr3);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(keyStore, objArr9);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            if (f.a()) {
                Object[] objArr10 = new Object[1];
                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
                String strIntern4 = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                p(127 - (ViewConfiguration.getTouchSlop() >> 8), null, null, Qg.kd("طخبختحػـتثثةض؞؟طئ", (short) (C1633zX.Xd() ^ (-5906)), (short) (C1633zX.Xd() ^ (-3577))), objArr11);
                f.e(strIntern4, ((String) objArr11[0]).intern(), e5);
            }
            throw new d(e5.getMessage());
        }
    }

    @Override // o.t.a
    public final void a(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26809m + 125;
        f26807k = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (f.a()) {
            Object[] objArr = new Object[1];
            n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            n(new int[]{-1452690407, -254793806, 2134263466, 2145962591, 1085984121, -1920823755}, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(o.dl.d.e(bArr)).toString());
            int i4 = f26807k + 91;
            f26809m = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
        }
        this.f26811a = bArr;
        int i6 = f26809m + 115;
        f26807k = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.t.a
    public final boolean a(Context context) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i3 = f26807k + 79;
            f26809m = i3 % 128;
            int i4 = i3 % 2;
            Class<?> cls = Class.forName(hg.Vd("@LANJC=\u0006:ECH8@E}\u0012=;@0B=", (short) (C1580rY.Xd() ^ (-28542)), (short) (C1580rY.Xd() ^ (-16776))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 29682);
            int[] iArr = new int["XNbL\u0018UIUM\u0013'OCTS".length()];
            QB qb = new QB("XNbL\u0018UIUM\u0013'OCTS");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(sXd + i5 + xuXd.CK(iKK));
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i5));
            Object[] objArr = {BiometricManager.class};
            Method method = cls.getMethod(C1561oA.yd("QN\\:g``PO4EQ\\NGH", (short) (Od.Xd() ^ (-9570))), clsArr);
            try {
                method.setAccessible(true);
                BiometricManager biometricManager = (BiometricManager) method.invoke(context, objArr);
                if (biometricManager != null && c_(biometricManager) == 0) {
                    int i6 = f26807k + 41;
                    f26809m = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                if (f.a()) {
                    int i8 = f26807k + 89;
                    f26809m = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr2 = new Object[1];
                    n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr2);
                    String strIntern2 = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    p(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, C1561oA.Yd("ЀϮЁЁЁϺЂϼϼϼϻϾϾϹϹЈЃЂЇЅЌЀЇІЉЌГГЇДГЏИЖИИИИЗЕСДСУМвКК", (short) (ZN.Xd() ^ 26207)), objArr3);
                    f.c(strIntern2, ((String) objArr3[0]).intern());
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            short sXd2 = (short) (C1607wl.Xd() ^ 18962);
            short sXd3 = (short) (C1607wl.Xd() ^ 19051);
            int[] iArr2 = new int["x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"".length()];
            QB qb2 = new QB("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"");
            int i10 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i10] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i10)) + sXd3);
                i10++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i10));
            Class<?>[] clsArr2 = {Class.forName(Jg.Wd("?aG~\u001c7\u0011rDO=K\u0015\u0004D", (short) (C1580rY.Xd() ^ (-15081)), (short) (C1580rY.Xd() ^ (-27444))))};
            Object[] objArr4 = {FingerprintManager.class};
            short sXd4 = (short) (C1499aX.Xd() ^ (-1644));
            short sXd5 = (short) (C1499aX.Xd() ^ (-1553));
            int[] iArr3 = new int["$\u0018UkuOs\u0017\u001fJ\u001e\u00173]\u0003x".length()];
            QB qb3 = new QB("$\u0018UkuOs\u0017\u001fJ\u001e\u00173]\u0003x");
            int i11 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i11] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((i11 * sXd5) + sXd4)));
                i11++;
            }
            Method method2 = cls2.getMethod(new String(iArr3, 0, i11), clsArr2);
            try {
                method2.setAccessible(true);
                FingerprintManager fingerprintManager = (FingerprintManager) method2.invoke(context, objArr4);
                Object[] objArr5 = new Object[1];
                n(new int[]{-985495474, -1136522172, -693934837, 1283498504}, 8 - (Process.myTid() >> 22), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Class<?> cls3 = Class.forName(C1626yg.Ud("z\u0016\u001eW\bb\u007fnIQ\u0017>\u001eo\u0018\u000bN\u0004G$\u001a>\\", (short) (FB.Xd() ^ 7679), (short) (FB.Xd() ^ 24297)));
                Class<?>[] clsArr3 = new Class[1];
                short sXd6 = (short) (Od.Xd() ^ (-26675));
                int[] iArr4 = new int["\n1x\u0004Pa2\u00181T\u007f~1*3\u000b".length()];
                QB qb4 = new QB("\n1x\u0004Pa2\u00181T\u007f~1*3\u000b");
                int i12 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i12] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i12 % C1561oA.Xd.length] ^ (sXd6 + i12)));
                    i12++;
                }
                clsArr3[0] = Class.forName(new String(iArr4, 0, i12));
                Object[] objArr6 = {strIntern3};
                Method method3 = cls3.getMethod(EO.Od("Br42X0\r=!\n\u001aE\u0019\u0016\b'", (short) (OY.Xd() ^ 30521)), clsArr3);
                try {
                    method3.setAccessible(true);
                    KeyguardManager keyguardManager = (KeyguardManager) method3.invoke(context, objArr6);
                    if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
                        if (f.a()) {
                            Object[] objArr7 = new Object[1];
                            n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 31 - Color.alpha(0), objArr7);
                            String strIntern4 = ((String) objArr7[0]).intern();
                            Object[] objArr8 = new Object[1];
                            p(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, C1561oA.od("̑˽̎̌̊́̇˿˽˻˸˴̇˷˯˷˳˰˷˳˩˧˰˭˻ˣ˸˩˩˩˩˧˥ˣˠ˜˦˗ˢˢ˙˭˓ˑ", (short) (Od.Xd() ^ (-31280))), objArr8);
                            f.c(strIntern4, ((String) objArr8[0]).intern());
                        }
                    } else {
                        if (fingerprintManager != null && fingerprintManager.hasEnrolledFingerprints()) {
                            return true;
                        }
                        if (f.a()) {
                            int i13 = f26809m + 103;
                            f26807k = i13 % 128;
                            if (i13 % 2 != 0) {
                                Object[] objArr9 = new Object[1];
                                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) * 89, objArr9);
                                strIntern = ((String) objArr9[0]).intern();
                                Object[] objArr10 = new Object[1];
                                p(78 >>> (KeyEvent.getMaxKeyCode() * 106), null, null, C1561oA.Qd("йХждвЩЯЧХУРСПИЖУМЙМИНЏДБВГИЖЈГАЊБЍЍЋЉЇЄЀЊϻІІϽБϷϵ", (short) (C1580rY.Xd() ^ (-30410))), objArr10);
                                obj = objArr10[0];
                            } else {
                                Object[] objArr11 = new Object[1];
                                n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr11);
                                strIntern = ((String) objArr11[0]).intern();
                                Object[] objArr12 = new Object[1];
                                p((KeyEvent.getMaxKeyCode() >> 16) + 127, null, null, C1593ug.zd("ݵݣݶݶݶݯݷݱݱݱݰݳݳݮݮݽݸݷݼݺށݵݼݻݾށވވݼމވބލދލލލލތފޖމޖޘޑާޏޏ", (short) (C1633zX.Xd() ^ (-19364)), (short) (C1633zX.Xd() ^ (-23778))), objArr12);
                                obj = objArr12[0];
                            }
                            f.c(strIntern, ((String) obj).intern());
                        }
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        return false;
    }

    @Override // o.t.a
    public final boolean c(Context context) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, ((byte) KeyEvent.getModifierMetaStateMask()) + 32, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            int i3 = f26809m + 27;
            f26807k = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr2 = {BiometricManager.class};
                Method method = Class.forName(Wg.vd("@NETJEA\f:GGN8BI\u00042__fPda", (short) (Od.Xd() ^ (-27834)))).getMethod(hg.Vd("khvTyrrbiN_kn`YZ", (short) (C1633zX.Xd() ^ (-29830)), (short) (C1633zX.Xd() ^ (-30258))), Class.forName(Qg.kd("^ThR\u001e[O[S\u0019-UIZY", (short) (FB.Xd() ^ 24435), (short) (FB.Xd() ^ 3936))));
                try {
                    method.setAccessible(true);
                    obj.hashCode();
                    throw null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Class<?> cls = Class.forName(C1561oA.Kd(" .%42-)s*77>0:A{\u0012??F8LI", (short) (FB.Xd() ^ 1015)));
            Class<?>[] clsArr = {Class.forName(Wg.Zd("(!=:a\u0007m>5NH\u0006\u0006>\u0011", (short) (C1633zX.Xd() ^ (-20320)), (short) (C1633zX.Xd() ^ (-30610))))};
            Object[] objArr3 = {BiometricManager.class};
            short sXd = (short) (C1580rY.Xd() ^ (-27368));
            int[] iArr = new int["`_oOvqsenUhv{ojm".length()];
            QB qb = new QB("`_oOvqsenUhv{ojm");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                BiometricManager biometricManager = (BiometricManager) method2.invoke(context, objArr3);
                if (biometricManager != null) {
                    int iC_ = c_(biometricManager);
                    if (iC_ == 0 || iC_ == 11) {
                        return true;
                    }
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        n(new int[]{424238796, 1970326136, 1894896592, -1265493145, 2109334126, -1469824299, -1369295073, -451979733, 1047674678, 1058632862, 1510137590, -1437388098, 587310646, -332090609, 1126428795, -1952383039, 100081293, 103057742, 2045015782, -164991646, -30223184, -800156730, 2120316089, 445765173, 715768729, 1825165346, 1031994877, -47336804}, (-16777163) - Color.rgb(0, 0, 0), objArr4);
                        f.c(strIntern, ((String) objArr4[0]).intern());
                    }
                } else if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    n(new int[]{424238796, 1970326136, 1894896592, -1265493145, 2109334126, -1469824299, -1369295073, -451979733, 1047674678, 1058632862, 1510137590, -1437388098, 587310646, -332090609, 1126428795, -1952383039, 100081293, 103057742, 2045015782, -164991646, -30223184, -800156730, 2120316089, 445765173, 715768729, 1825165346, 1031994877, -47336804}, TextUtils.getTrimmedLength("") + 53, objArr5);
                    f.c(strIntern, ((String) objArr5[0]).intern());
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            int i5 = f26809m + 21;
            f26807k = i5 % 128;
            if (i5 % 2 != 0) {
                short sXd2 = (short) (Od.Xd() ^ (-30109));
                short sXd3 = (short) (Od.Xd() ^ (-26045));
                int[] iArr2 = new int["Tf[\u0006xdn\u0012[*\u001c\u0015D\u0005@Q8d\nW]^.".length()];
                QB qb2 = new QB("Tf[\u0006xdn\u0012[*\u001c\u0015D\u0005@Q8d\nW]^.");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd3) + sXd2)));
                    i6++;
                }
                Object[] objArr6 = {FingerprintManager.class};
                Method method3 = Class.forName(new String(iArr2, 0, i6)).getMethod(Ig.wd("\u001dk\r\u0010}2\u000bt)3KrC@\u000e.", (short) (ZN.Xd() ^ 26743)), Class.forName(C1626yg.Ud("\u000b.q#CR{U6zT_&Gw", (short) (ZN.Xd() ^ 13354), (short) (ZN.Xd() ^ 1495))));
                try {
                    method3.setAccessible(true);
                    obj.hashCode();
                    throw null;
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            Class<?> cls2 = Class.forName(C1561oA.ud("\u0001\r\u0002\u000f\u000b\u0004}Fz\u0006\u0004\tx\u0001\u0006>R}{\u0001p\u0003}", (short) (C1499aX.Xd() ^ (-13093))));
            Class<?>[] clsArr2 = new Class[1];
            short sXd4 = (short) (OY.Xd() ^ 18299);
            int[] iArr3 = new int["\u001e\u0014(\u0012e#\u0017##h|%!21".length()];
            QB qb3 = new QB("\u001e\u0014(\u0012e#\u0017##h|%!21");
            int i7 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i7));
                i7++;
            }
            clsArr2[0] = Class.forName(new String(iArr3, 0, i7));
            Object[] objArr7 = {FingerprintManager.class};
            Method method4 = cls2.getMethod(C1561oA.Yd("\u0014\u0013#\u0003*%'\u0019\"\t\u001c*/#\u001e!", (short) (C1633zX.Xd() ^ (-23923))), clsArr2);
            try {
                method4.setAccessible(true);
                FingerprintManager fingerprintManager = (FingerprintManager) method4.invoke(context, objArr7);
                if (fingerprintManager != null && fingerprintManager.isHardwareDetected()) {
                    int i8 = f26807k + 19;
                    f26809m = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr8 = new Object[1];
                    n(new int[]{1756278757, -1327768298, -777732326, 166265127, -1201301663, 1395509905, 2023223256, -553207500, 788247632, 1739798299, -464596161, -1682378433, 1103231517, 726698871, -367724780, 439318098, -934275743, -1389063470}, 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                    if (ContextCompat.checkSelfPermission(context, ((String) objArr8[0]).intern()) == 0) {
                        int i10 = f26807k + 63;
                        f26809m = i10 % 128;
                        return i10 % 2 != 0;
                    }
                    if (f.a()) {
                        int i11 = f26809m + 27;
                        f26807k = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr9 = new Object[1];
                        p(KeyEvent.normalizeMetaState(0) + 127, null, null, Xg.qd("ϑοϒϒϒϋϓύύύύϔϘϏϘϕϓϒϛϙϝϖϒϔϕϕϥϝϠϝϤϢϩϝϤϣϦϩϰϰϤϱϰϲϲϲϲϲϲϲϲϳϳϳϳϳ", (short) (C1580rY.Xd() ^ (-14767)), (short) (C1580rY.Xd() ^ (-4335))), objArr9);
                        f.c(strIntern, ((String) objArr9[0]).intern());
                    }
                } else if (f.a()) {
                    Object[] objArr10 = new Object[1];
                    p(View.resolveSize(0, 0) + 127, null, null, Jg.Wd("ĀŲȍǺ˱͎͟σкӉԻ֨؎ڝڏݽݤ߯êɍ˔ʼζЩвҪ֎֚\u05fe،ۡݥݞÙŔŀǘ̖εДПԔӿ\u058b٢٧ۏݛ\u07b3¶ÀĬȣȈʐ", (short) (C1499aX.Xd() ^ (-23394)), (short) (C1499aX.Xd() ^ (-30357))), objArr10);
                    f.c(strIntern, ((String) objArr10[0]).intern());
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] c(javax.crypto.Cipher r11) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, o.t.d, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.b.c(javax.crypto.Cipher):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.b.e():boolean");
    }

    @Override // o.t.a
    public final byte[] e(Context context) throws Throwable {
        String strIntern;
        String strIntern2;
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String strIntern3 = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n(new int[]{1215412613, 1792267587, 1854528735, -2019458984}, ((Process.getThreadPriority(0) + 20) >> 6) + 8, objArr2);
            f.c(strIntern3, ((String) objArr2[0]).intern());
        }
        try {
            int scrollBarFadeDuration = 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            short sXd = (short) (Od.Xd() ^ (-22576));
            short sXd2 = (short) (Od.Xd() ^ (-11725));
            int[] iArr = new int["ܓվր".length()];
            QB qb = new QB("ܓվր");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            Object[] objArr3 = new Object[1];
            p(scrollBarFadeDuration, null, null, new String(iArr, 0, i3), objArr3);
            String strIntern4 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            n(new int[]{1337140754, -825132641, -973592678, 844315326, 496346530, 1845977266, 1697019204, -1565641826}, 15 - Color.green(0), objArr4);
            String strIntern5 = ((String) objArr4[0]).intern();
            Class<?> cls = Class.forName(C1626yg.Ud("RN#9Nx\u0018\u0018 `\n{{H)Mm(3aqQS+(L\n\u0019g\n", (short) (C1607wl.Xd() ^ 5412), (short) (C1607wl.Xd() ^ 5099)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Ig.wd("c4\u0019bmfu1Vs\u001d\u001adcnD", (short) (FB.Xd() ^ 1812)));
            clsArr[1] = Class.forName(EO.Od("\u000e]t{P3\u0010\u00061(&+xcfG", (short) (C1633zX.Xd() ^ (-32080))));
            Object[] objArr5 = {strIntern4, strIntern5};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("52@\u00148<<(4()", (short) (Od.Xd() ^ (-21784))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr5);
                Object[] objArr6 = new Object[1];
                p(127 - ExpandableListView.getPackedPositionType(0L), null, null, C1593ug.zd("ϧϮϢϩϨϫϮϵϵϩ϶϶ϰЈ", (short) (C1499aX.Xd() ^ (-23669)), (short) (C1499aX.Xd() ^ (-29714))), objArr6);
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(((String) objArr6[0]).intern(), 3);
                Object[] objArr7 = {true};
                Method method = Class.forName(C1561oA.od(",8-:6/)q6'$51'15h%\u001e1**$&\u0018_{\u0015(t\u0012\u001az\u000b\u001b\t\u0014\u000b\u0019\t\u0015t\u0011\u0005\u0002A^\u0011\u0004\u0006||\t", (short) (C1607wl.Xd() ^ 9780))).getMethod(C1561oA.Kd("`ScEdWe5jj_]gnd_^rhooThuzoymm", (short) (ZN.Xd() ^ 20003)), Boolean.TYPE);
                try {
                    method.setAccessible(true);
                    KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr7);
                    Object[] objArr8 = {new String[]{f26801e}};
                    Method method2 = Class.forName(Wg.Zd(" EtW\u000eL`^m\u0018[\u00028\u0004X\u0012oe9\u0012AV\u000bR\u000f\u0010F\u0015r\u0015h\u0006\u0001G5Y};\u0003Iz!Z\u0005[Q8\u0001=\u0016F\r2", (short) (OY.Xd() ^ 31806), (short) (OY.Xd() ^ PhotoshopDirectory.TAG_THUMBNAIL_OLD))).getMethod(C1561oA.Xd("`Sc2]aV_Be[]l", (short) (ZN.Xd() ^ 26702)), String[].class);
                    try {
                        method2.setAccessible(true);
                        KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr8);
                        Object[] objArr9 = {new String[]{f26800d}};
                        Method method3 = Class.forName(Wg.vd("\f\u001a\r\u001c\u0016\u0011\tS\u0016\t\u0004\u0017\u0011\t\u0011\u0017H\u0007}\u0013\n\f\u0004\bwA[v\bVq{ZlzjslxjtVpfa#>rcg\\^h", (short) (C1499aX.Xd() ^ (-27987)))).getMethod(Qg.kd("\u0012\u0003\u0011`\t|\u000b\u0011\u0007\n}\u0003\u0001aqsrvzr}", (short) (Od.Xd() ^ (-26605)), (short) (Od.Xd() ^ (-19718))), String[].class);
                        try {
                            method3.setAccessible(true);
                            KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr9);
                            Object[] objArr10 = {2048};
                            Method method4 = Class.forName(hg.Vd("S_Ta]VP\u0019]NK\\XNX\\\u0010LEXQQKM?\u0007#<O\u001c9A\"2B0;2@0<\u001c8,)h\u00068+-$$0", (short) (C1633zX.Xd() ^ (-582)), (short) (C1633zX.Xd() ^ (-32557)))).getMethod(C1561oA.ud("0!/\u0005\u001e1\n\u001f/\u0019", (short) (C1607wl.Xd() ^ 22496)), Integer.TYPE);
                            try {
                                method4.setAccessible(true);
                                KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method4.invoke(builder4, objArr10);
                                short sXd3 = (short) (FB.Xd() ^ 16671);
                                int[] iArr2 = new int["jxo~tok6tgfyogsyG\u0006\u0001\u0016\t\u000b\u0007\u000bv@^y\u0007Ut~9K]MRK[MS5SI@\u0002!Ubf_ag".length()];
                                QB qb2 = new QB("jxo~tok6tgfyogsyG\u0006\u0001\u0016\t\u000b\u0007\u000bv@^y\u0007Ut~9K]MRK[MS5SI@\u0002!Ubf_ag");
                                int i4 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                                    i4++;
                                }
                                Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
                                Object[] objArr11 = {-1};
                                Method method5 = cls2.getMethod(C1561oA.Yd("\u0016\t\u0019z\u001a\r\u001bj  \u0015\u0013\u001d$\u001a\u0015\u0014(\u001e%%\u000e\u001a&$ &28\u000464$8.55\u001b.-::1A", (short) (ZN.Xd() ^ 29754)), Integer.TYPE);
                                try {
                                    method5.setAccessible(true);
                                    KeyGenParameterSpec.Builder builder6 = (KeyGenParameterSpec.Builder) method5.invoke(builder5, objArr11);
                                    short sXd4 = (short) (Od.Xd() ^ (-11280));
                                    short sXd5 = (short) (Od.Xd() ^ (-19686));
                                    int[] iArr3 = new int["x\u0007}\r\u000b\u0006\u0002L\u0013\u0006\u0005\u0018\u0016\u000e\u001a U\u0014\u000f$\u001f!\u001d!\u0015^|\u0018-{\u001b%\b\u001a,\u001c)\"2$2\u00142('h\b<15.0>".length()];
                                    QB qb3 = new QB("x\u0007}\r\u000b\u0006\u0002L\u0013\u0006\u0005\u0018\u0016\u000e\u001a U\u0014\u000f$\u001f!\u001d!\u0015^|\u0018-{\u001b%\b\u001a,\u001c)\"2$2\u00142('h\b<15.0>");
                                    int i5 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i5] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i5)) + sXd5);
                                        i5++;
                                    }
                                    Class<?> cls3 = Class.forName(new String(iArr3, 0, i5));
                                    Object[] objArr12 = new Object[0];
                                    Method method6 = cls3.getMethod(Jg.Wd("\u001e\u0016\taF", (short) (C1499aX.Xd() ^ (-7249)), (short) (C1499aX.Xd() ^ (-7630))), new Class[0]);
                                    try {
                                        method6.setAccessible(true);
                                        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method6.invoke(builder6, objArr12);
                                        short sXd6 = (short) (C1607wl.Xd() ^ 16774);
                                        short sXd7 = (short) (C1607wl.Xd() ^ 31688);
                                        int[] iArr4 = new int["l\u0012$\u0015o\u0018k\fgv6\u0002}7\u007f<\u0014OJzc !tf4@zx\f".length()];
                                        QB qb4 = new QB("l\u0012$\u0015o\u0018k\fgv6\u0002}7\u007f<\u0014OJzc !tf4@zx\f");
                                        int i6 = 0;
                                        while (qb4.YK()) {
                                            int iKK4 = qb4.KK();
                                            Xu xuXd4 = Xu.Xd(iKK4);
                                            iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd7) + sXd6)));
                                            i6++;
                                        }
                                        Class<?> cls4 = Class.forName(new String(iArr4, 0, i6));
                                        Class<?>[] clsArr2 = new Class[1];
                                        clsArr2[0] = Class.forName(C1626yg.Ud("\u0016RYP\b\u00011ag\u0003\u000392lAEpu;%m\u007f)j\u0015m\u0012qZY\u0006sU\u000e^+\u001el\"\u0018!", (short) (Od.Xd() ^ (-7829)), (short) (Od.Xd() ^ (-1684))));
                                        Object[] objArr13 = {keyGenParameterSpec};
                                        Method method7 = cls4.getMethod(Ig.wd("Z.\u0007m2u)%\u0014>", (short) (OY.Xd() ^ 18438)), clsArr2);
                                        try {
                                            method7.setAccessible(true);
                                            method7.invoke(keyPairGenerator, objArr13);
                                            Class<?> cls5 = Class.forName(EO.Od("l;TYp\u000bR+\u007f\u000by-\u000194v_\"m@\f\u000bAHq\u0015(k\u000b\"\u0019\\w", (short) (FB.Xd() ^ 2076)));
                                            Class<?>[] clsArr3 = new Class[0];
                                            Object[] objArr14 = new Object[0];
                                            short sXd8 = (short) (ZN.Xd() ^ 21040);
                                            int[] iArr5 = new int["\u0016\u0013\u001b\u0011\u001d\u000b\u001d\rq\u000b\u001es\u0004\u000b\u0013".length()];
                                            QB qb5 = new QB("\u0016\u0013\u001b\u0011\u001d\u000b\u001d\rq\u000b\u001es\u0004\u000b\u0013");
                                            int i7 = 0;
                                            while (qb5.YK()) {
                                                int iKK5 = qb5.KK();
                                                Xu xuXd5 = Xu.Xd(iKK5);
                                                iArr5[i7] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i7 + xuXd5.CK(iKK5));
                                                i7++;
                                            }
                                            Method method8 = cls5.getMethod(new String(iArr5, 0, i7), clsArr3);
                                            try {
                                                method8.setAccessible(true);
                                                KeyPair keyPair = (KeyPair) method8.invoke(keyPairGenerator, objArr14);
                                                if (f.a()) {
                                                    int i8 = f26807k + 11;
                                                    f26809m = i8 % 128;
                                                    if (i8 % 2 == 0) {
                                                        Object[] objArr15 = new Object[1];
                                                        n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, TextUtils.getOffsetBefore("", 0) + 16, objArr15);
                                                        strIntern = ((String) objArr15[0]).intern();
                                                        Object[] objArr16 = new Object[1];
                                                        p(20 >> (ViewConfiguration.getDoubleTapTimeout() / 33), null, null, C1593ug.zd("ϝϞϦ϶ϷϤϣϭϯϯϮϮϸϿϪϲЃϽ", (short) (Od.Xd() ^ (-7933)), (short) (Od.Xd() ^ (-16433))), objArr16);
                                                        strIntern2 = ((String) objArr16[0]).intern();
                                                    } else {
                                                        Object[] objArr17 = new Object[1];
                                                        n(new int[]{-1275749911, -1213842778, 657542139, 1839773007, 189323975, -442925162, 1780310523, -1096511671, -1095902365, -1550566995, -1180433594, -1410979750, -1119576285, 486349349, 1402409929, -662864238}, 31 - TextUtils.getOffsetBefore("", 0), objArr17);
                                                        strIntern = ((String) objArr17[0]).intern();
                                                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127;
                                                        short sXd9 = (short) (OY.Xd() ^ 3813);
                                                        int[] iArr6 = new int["ͪͩͯͽͼͧͤͬͬͪͧͥͭͲ͛͡Ͱͨ".length()];
                                                        QB qb6 = new QB("ͪͩͯͽͼͧͤͬͬͪͧͥͭͲ͛͡Ͱͨ");
                                                        int i9 = 0;
                                                        while (qb6.YK()) {
                                                            int iKK6 = qb6.KK();
                                                            Xu xuXd6 = Xu.Xd(iKK6);
                                                            iArr6[i9] = xuXd6.fK(sXd9 + sXd9 + i9 + xuXd6.CK(iKK6));
                                                            i9++;
                                                        }
                                                        Object[] objArr18 = new Object[1];
                                                        p(doubleTapTimeout, null, null, new String(iArr6, 0, i9), objArr18);
                                                        strIntern2 = ((String) objArr18[0]).intern();
                                                    }
                                                    f.c(strIntern, strIntern2);
                                                }
                                                return keyPair.getPublic().getEncoded();
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } catch (InvocationTargetException e9) {
                    throw e9.getCause();
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e11) {
            throw new d(e11.getMessage(), e11);
        }
    }
}
