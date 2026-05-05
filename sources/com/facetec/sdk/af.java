package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class af implements ZoomEncryptStrings, X509TrustManager {
    private static long B = 0;
    private static int C = 1;
    private static final String[] Code;
    private static int Z = 0;
    private final ArrayList<byte[]> I = new ArrayList<>();
    private final MessageDigest V;

    static {
        B();
        Code = new String[]{Code("칡얐츉ᕠ㒪胑\uf7f1卸\u0b7a獻닏ᦪ䒀븪硼\ude23臝蓥⟌ꍉ\udb66쌽\ue2a7榔ᒵัꡨ⸑准哳鞮\uf348ꭦ鍃勯릾\ue4d0\ude2d᠉绗⇶⓱응䌮筸掮苽ৰ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), Code("ໝ苏ຬ裉珌钷横䜒쯿㐧⽺ඣ萳塞\ue5d2쩿䄞쏃먓뜬ᮨ萲置緈퐦䥾㖕㩷酛ᎃਭ\ue704毞푹콋귩␟饔薑檆\ue161揙嫠圔뮐⓯ὀᶖ", Color.alpha(0)).intern()};
        int i2 = Z + 11;
        C = i2 % 128;
        int i3 = i2 % 2;
    }

    private af() throws Throwable {
        for (String str : Code) {
            ArrayList<byte[]> arrayList = this.I;
            short sXd = (short) (FB.Xd() ^ 14447);
            int[] iArr = new int["\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\"\"\u0018\u001c^s\u0014'\u001akj".length()];
            QB qb = new QB("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\"\"\u0018\u001c^s\u0014'\u001akj");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr = {str, 0};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Jg.Wd("kI\u001d\bB ", (short) (OY.Xd() ^ 11857), (short) (OY.Xd() ^ 31202)), Class.forName(Xg.qd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$#\u001b!\u001b", (short) (Od.Xd() ^ (-11578)), (short) (Od.Xd() ^ (-24249)))), Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                arrayList.add((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        short sXd2 = (short) (ZN.Xd() ^ 16277);
        short sXd3 = (short) (ZN.Xd() ^ 1747);
        int[] iArr2 = new int["㐔艄䚈\uf2a9鳅㊘\udd05\uecd8ꘞ䔦".length()];
        QB qb2 = new QB("㐔艄䚈\uf2a9鳅㊘\udd05\uecd8ꘞ䔦");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd3) + sXd2)));
            i4++;
        }
        this.V = MessageDigest.getInstance(Code(new String(iArr2, 0, i4), i3).intern());
    }

    static void B() {
        B = 8324899805143101780L;
    }

    private static String Code(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = Z + 31;
        int i5 = i4 % 128;
        C = i5;
        Object charArray = str;
        if (i4 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (str != null) {
            int i6 = i5 + 83;
            Z = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
                charArray = str.toCharArray();
            } else {
                charArray = str.toCharArray();
            }
        }
        char[] cArrI = eq.I(B, (char[]) charArray, i2);
        for (int i8 = 4; i8 < cArrI.length; i8++) {
            cArrI[i8] = (char) (((long) (cArrI[i8] ^ cArrI[i8 % 4])) ^ (((long) (i8 - 4)) * B));
        }
        return new String(cArrI, 4, cArrI.length - 4);
    }

    static X509TrustManager V() throws NoSuchAlgorithmException {
        int i2 = 2 % 2;
        af afVar = new af();
        int i3 = C + 109;
        Z = i3 % 128;
        int i4 = i3 % 2;
        return afVar;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws Throwable {
        int i2 = 2 % 2;
        String strIntern = Code(C1626yg.Ud("湚㚈ꞌჍ⳱툝갣탦筿㒔ݴ햶\ue44c䶦軸\uf494挫鈇釉씮빁ᨛ⥧\udbfd戙臑⫪쥫퐌ᔿ旼㸍㮸跰㵬껤뱛", (short) (FB.Xd() ^ 28386), (short) (FB.Xd() ^ 8458)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        short sXd = (short) (OY.Xd() ^ 15835);
        int[] iArr = new int["\t38}Php\u0005[;.!rw\u001b@\u0005\u001f}M5{\u001a\r;DY\u000bVrhANop(Fjd".length()];
        QB qb = new QB("\t38}Php\u0005[;.!rw\u001b@\u0005\u001f}M5{\u001a\r;DY\u000bVrhANop(Fjd");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Object[] objArr = {strIntern};
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(Class.forName(EO.Od("5ch1(,KY*2[T\u001e\rD\u0019", (short) (OY.Xd() ^ 25450))));
        try {
            constructor.setAccessible(true);
            throw ((CertificateException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(Code(C1561oA.Qd("믛倔밁ጶ\ue0f2騟⦛쥘", (short) (C1633zX.Xd() ^ (-11616))), View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            int length = trustManagers.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = Z + 19;
                C = i4 % 128;
                if (i4 % 2 == 0) {
                    ((X509TrustManager) trustManagers[i3]).checkServerTrusted(x509CertificateArr, str);
                    i3 += 114;
                } else {
                    ((X509TrustManager) trustManagers[i3]).checkServerTrusted(x509CertificateArr, str);
                    i3++;
                }
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            Class<?> cls = Class.forName(C1593ug.zd(".&<(u</.A?7CI~58FI\u0004\u001a=KNDBFA@TF", (short) (OY.Xd() ^ 26689), (short) (OY.Xd() ^ 18130)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 11312);
            int[] iArr = new int["\u0012\u000f\u001dw\u001c\b\u0011\r\u0006l\u0006\u0019".length()];
            QB qb = new QB("\u0012\u000f\u001dw\u001c\b\u0011\r\u0006l\u0006\u0019");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(sXd + sXd + i5 + xuXd.CK(iKK));
                i5++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
            try {
                method.setAccessible(true);
                byte[] bArrDigest = this.V.digest(((PublicKey) method.invoke(x509Certificate, objArr)).getEncoded());
                Iterator<byte[]> it = this.I.iterator();
                int i6 = C + 97;
                Z = i6 % 128;
                int i7 = i6 % 2;
                while (it.hasNext()) {
                    if (Arrays.equals(it.next(), bArrDigest)) {
                        return;
                    }
                }
                Object[] objArr2 = {Code(C1561oA.Kd("㋽ᤓ㍀ﻇ쁇︃\udbf4궍ӎ蝙餿直뇈䊟殯㡩\uf48b塊Ᏺ◝䗥ᾁ쥇\ue760膹쪬鎊", (short) (Od.Xd() ^ (-22605))), ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern()};
                Constructor<?> constructor = Class.forName(Wg.Zd("\u001f{\u0017sFmuUm\\Y\u0016!7\u0003fyq-(\\O$~}vrV{RD]J\u0002\u0013x\u0004kp", (short) (C1580rY.Xd() ^ (-14576)), (short) (C1580rY.Xd() ^ (-21863)))).getConstructor(Class.forName(C1561oA.Xd("vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003", (short) (C1633zX.Xd() ^ (-23100)))));
                try {
                    constructor.setAccessible(true);
                    throw ((CertificateException) constructor.newInstance(objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            Object[] objArr3 = {e4.toString()};
            Constructor<?> constructor2 = Class.forName(Wg.vd("H>R<\bL=:KG=GK~34`a\u001a.O[\\PLNGDVF%Wablochf", (short) (C1633zX.Xd() ^ (-7173)))).getConstructor(Class.forName(Qg.kd("\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y}\u001e\u001b\u0011\u0015\r", (short) (ZN.Xd() ^ 9858), (short) (ZN.Xd() ^ 7911))));
            try {
                constructor2.setAccessible(true);
                throw ((CertificateException) constructor2.newInstance(objArr3));
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        int i2 = 2 % 2;
        int i3 = C + 43;
        Z = i3 % 128;
        return new X509Certificate[i3 % 2 != 0 ? 1 : 0];
    }
}
