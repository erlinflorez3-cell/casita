package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
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

/* JADX INFO: loaded from: classes7.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final Object keyCreationLock = new Object();
    private KeyStore keyStore;
    private final String keyUri;

    public static final class Builder {
        KeyStore keyStore;
        String keyUri = null;

        public Builder() {
            this.keyStore = null;
            if (!AndroidKeystoreKmsClient.isAtLeastM()) {
                throw new IllegalStateException(C1561oA.yd("$\u001c\u0019\u0019Qs\u001e\u00150.%!Y\u0006\u001d29;37'b//m\u0010:1<:1-u$sDDr>6UDN", (short) (OY.Xd() ^ 16302)));
            }
            short sXd = (short) (C1580rY.Xd() ^ (-228));
            int[] iArr = new int["\u0010>5DB=9!<Q,NJNB".length()];
            QB qb = new QB("\u0010>5DB=9!<Q,NJNB");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (ZN.Xd() ^ 8703);
            short sXd3 = (short) (ZN.Xd() ^ 25659);
            int[] iArr2 = new int["\u001d\u0011\u0006P\u001d>\u0010\u000f\u0001]P; URH<\u0016\u0017rqD".length()];
            QB qb2 = new QB("\u001d\u0011\u0006P\u001d>\u0010\u000f\u0001]P; URH<\u0016\u0017rqD");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            try {
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.Xd("_WmY'f\\jd,Rtskqk", (short) (C1607wl.Xd() ^ 21820)));
                Object[] objArr = {str};
                short sXd4 = (short) (C1633zX.Xd() ^ (-7976));
                int[] iArr3 = new int["\\[kA_egU[QT".length()];
                QB qb3 = new QB("\\[kA_egU[QT");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                    this.keyStore = keyStore;
                    Class<?> cls2 = Class.forName(Qg.kd("I?S=\tM>;LH>HL\u007f\u001c5H!A;=/", (short) (OY.Xd() ^ 10316), (short) (OY.Xd() ^ 8061)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(hg.Vd("B8L6\u0002F74EA7AEx\u0015.A\u001a:46(e\r/ \"\u00100*,\u001e\b\u0018(\u0016!\u0018&\u0016\"", (short) (C1633zX.Xd() ^ (-25724)), (short) (C1633zX.Xd() ^ (-25955))));
                    Object[] objArr2 = {null};
                    Method method = cls2.getMethod(C1561oA.ud("Z\\MO", (short) (FB.Xd() ^ 21673)), clsArr2);
                    try {
                        method.setAccessible(true);
                        method.invoke(keyStore, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (IOException | GeneralSecurityException e4) {
                throw new IllegalStateException(e4);
            }
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }

        public Builder setKeyStore(KeyStore val) {
            if (val == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.keyStore = val;
            return this;
        }

        public Builder setKeyUri(String val) {
            if (val == null || !val.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("val must start with android-keystore://");
            }
            this.keyUri = val;
            return this;
        }
    }

    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    private AndroidKeystoreKmsClient(Builder builder) {
        this.keyUri = builder.keyUri;
        this.keyStore = builder.keyStore;
    }

    /* synthetic */ AndroidKeystoreKmsClient(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String uri) {
        this(new Builder().setKeyUri(uri));
    }

    static boolean generateKeyIfNotExist(String keyUri) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (androidKeystoreKmsClient.hasKey(keyUri)) {
                return false;
            }
            generateNewAesGcmKeyWithoutExistenceCheck(keyUri);
            return true;
        }
    }

    public static void generateNewAeadKey(String keyUri) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (androidKeystoreKmsClient.hasKey(keyUri)) {
                throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", keyUri));
            }
            generateNewAesGcmKeyWithoutExistenceCheck(keyUri);
        }
    }

    static void generateNewAesGcmKeyWithoutExistenceCheck(String keyUri) throws Throwable {
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(C1561oA.Yd("!/&53.*s3.C>@<@4\n\u007f\u0001", (short) (FB.Xd() ^ 16905)), keyUri);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(Xg.qd("!&5", (short) (FB.Xd() ^ 29739), (short) (FB.Xd() ^ 19350)), Jg.Wd("\u0002\nUId4\u0015M}w'm\u0007[4", (short) (C1580rY.Xd() ^ (-26054)), (short) (C1580rY.Xd() ^ (-32676))));
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(strValidateKmsKeyUriAndRemovePrefix, 3);
        Object[] objArr = {256};
        Method method = Class.forName(ZO.xd("TyA\u000b?\u001ae]\u0003&\t\u001d\n\u00187%o\u0014\u0018\u0011-5:[#\u0018y,G\u00060C&6`(\u007f5me\u0011yM\u0004Z0F,Q\u0018K\u0015n", (short) (C1580rY.Xd() ^ (-21616)), (short) (C1580rY.Xd() ^ (-13376)))).getMethod(C1626yg.Ud("\u0014o|5t\"\u0016)7P", (short) (FB.Xd() ^ 23094), (short) (FB.Xd() ^ 19786)), Integer.TYPE);
        try {
            method.setAccessible(true);
            KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr);
            Object[] objArr2 = {new String[]{Ig.wd("$Y\u0010", (short) (ZN.Xd() ^ 24553))}};
            Method method2 = Class.forName(EO.Od("s(\u0010\u0007\u001cbik[RN>iZ}aJ\"D0d\"+2?$cJxx3Zd Bo\u001e:NIZc/.\u0007S&!#N?l]", (short) (C1580rY.Xd() ^ (-7420)))).getMethod(C1561oA.Qd("j[i6_aT[<]QQ^", (short) (ZN.Xd() ^ 26789)), String[].class);
            try {
                method2.setAccessible(true);
                KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr2);
                String[] strArr = {C1593ug.zd("r\u0015v\t\r\u000e\u0014\u001a\u0014", (short) (C1633zX.Xd() ^ (-7382)), (short) (C1633zX.Xd() ^ (-7917)))};
                short sXd = (short) (C1499aX.Xd() ^ (-22380));
                int[] iArr = new int[".:/<81+s8)&73)37j' 3,,&(\u001aa}\u0017*v\u0014\u001c|\r\u001d\u000b\u0016\r\u001b\u000b\u0017v\u0013\u0007\u0004C`\u0013\u0006\b~~\u000b".length()];
                QB qb = new QB(".:/<81+s8)&73)37j' 3,,&(\u001aa}\u0017*v\u0014\u001c|\r\u001d\u000b\u0016\r\u001b\u000b\u0017v\u0013\u0007\u0004C`\u0013\u0006\b~~\u000b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr3 = {strArr};
                Method method3 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("\u0004v\u0007X\u0003x\t\u0011\t\u000e\u0004\u000b\u000bm\u007f\u0004\u0005\u000b\u0011\u000b\u0018", (short) (C1580rY.Xd() ^ (-24046))), String[].class);
                try {
                    method3.setAccessible(true);
                    KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(Wg.Zd("s3~Y*tJd}<\u0010vF\u0012jDH~K0yO v=RE4\u001c;+\u0005:\u0001f(\u0001N2vU\bu>\u0011'\u0015\u0018`Y&vU", (short) (Od.Xd() ^ (-13574)), (short) (Od.Xd() ^ (-20982)))).getMethod(C1561oA.Xd("Vj_c\\", (short) (Od.Xd() ^ (-12100))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        keyGenerator.init((KeyGenParameterSpec) method4.invoke(builder4, objArr4));
                        keyGenerator.generateKey();
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
    }

    public static Aead getOrGenerateNewAeadKey(String keyUri) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (!androidKeystoreKmsClient.hasKey(keyUri)) {
                generateNewAesGcmKeyWithoutExistenceCheck(keyUri);
            }
        }
        return androidKeystoreKmsClient.getAead(keyUri);
    }

    public static boolean isAtLeastM() {
        return true;
    }

    private static void sleepRandomAmount() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static Aead validateAead(Aead aead) throws Throwable {
        byte[] bArrRandBytes = Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrRandBytes, aead.decrypt(aead.encrypt(bArrRandBytes, bArr), bArr))) {
            return aead;
        }
        Object[] objArr = {Wg.vd("YXfgio\u001craT\u00102`WfdOK\b4Od_aMQE\u001b\u0002HRH\t\u0011\t\u000e\u0004\u000b\u000bLrts\u0004\f\u0004\t~uu(xp+z|l,enrw}%$\u001d,-\u001c#\"]\u0010\u001e\u0015Q\u0018!%* G\n\u000b\u000fK\u001f\u0013\u0013\u0015\u0013\u0010\u0016C\u0006\u0014vAG=JNOC2DpD8GJB;", (short) (C1633zX.Xd() ^ (-13524)))};
        Constructor<?> constructor = Class.forName(Qg.kd("pfzd0tebsoeos'C\\oHhbdV5gQR\\_SXV", (short) (C1499aX.Xd() ^ (-4361)), (short) (C1499aX.Xd() ^ (-12913)))).getConstructor(Class.forName(hg.Vd("\"\u0018,\u0016a\u001f\u0013\u001f\u0017\\\u0001!\u001e\u0014\u0018\u0010", (short) (Od.Xd() ^ (-2391)), (short) (Od.Xd() ^ (-2325)))));
        try {
            constructor.setAccessible(true);
            throw ((KeyStoreException) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public synchronized void deleteKey(String keyUri) throws GeneralSecurityException {
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(C1561oA.ud("\u0013\u001f\u0014!\u001d\u0016\u0010W\u0015\u000e!\u001a\u001a\u0014\u0016\b[ON", (short) (C1607wl.Xd() ^ 26042)), keyUri);
        KeyStore keyStore = this.keyStore;
        Class<?> cls = Class.forName(C1561oA.yd("\u0018\u0010\"\u000eW\u001e\r\f\u001b\u0019\r\u0019\u001bPj\u00067\u00120,, ", (short) (C1580rY.Xd() ^ (-2929))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("-%;'t4*82y BA9?9", (short) (C1499aX.Xd() ^ (-32115))))};
        Object[] objArr = {strValidateKmsKeyUriAndRemovePrefix};
        short sXd = (short) (OY.Xd() ^ 22579);
        short sXd2 = (short) (OY.Xd() ^ 25298);
        int[] iArr = new int["RT\\VfX9cjiq".length()];
        QB qb = new QB("RT\\VfX9cjiq");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(keyStore, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001f  */
    @Override // com.google.crypto.tink.KmsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean doesSupport(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L25
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto Le
            monitor-exit(r3)
            return r2
        Le:
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1f
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r4.toLowerCase(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "android-keystore://"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L25
            goto L21
        L1f:
            r2 = 0
            goto L23
        L21:
            if (r0 == 0) goto L1f
        L23:
            monitor-exit(r3)
            return r2
        L25:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.doesSupport(java.lang.String):boolean");
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String uri) throws GeneralSecurityException {
        String str = this.keyUri;
        if (str != null && !str.equals(uri)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.keyUri, uri));
        }
        return validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, uri), this.keyStore));
    }

    synchronized boolean hasKey(String keyUri) throws GeneralSecurityException {
        KeyStore keyStore;
        Object[] objArr;
        Method method;
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(Jg.Wd("yC,\u0019)\u0002o\u0017h\u0002\teuSE\u001b~\u0016\u0005", (short) (C1580rY.Xd() ^ (-27836)), (short) (C1580rY.Xd() ^ (-20963))), keyUri);
        try {
            keyStore = this.keyStore;
            Class<?> cls = Class.forName(ZO.xd("HT`\u0015R\u0003#D2\\O}G\u0016RrsTOc3\u001f", (short) (C1499aX.Xd() ^ (-21606)), (short) (C1499aX.Xd() ^ (-16435))));
            Class<?>[] clsArr = {Class.forName(C1626yg.Ud("\u0019}hEgLGd%rJ$$\u0014\u000f\u0003", (short) (C1499aX.Xd() ^ (-23651)), (short) (C1499aX.Xd() ^ (-24655))))};
            objArr = new Object[]{strValidateKmsKeyUriAndRemovePrefix};
            short sXd = (short) (C1607wl.Xd() ^ 28671);
            int[] iArr = new int["\u0003`+ z=T\u0010\u00068-lO".length()];
            QB qb = new QB("\u0003`+ z=T\u0010\u00068-lO");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NullPointerException unused) {
            String str = TAG;
            EO.Od("dL0\r oP\u001e\u001fv\u0005Mleo\u000fjM\u0007\"o\u0019:fr\u001a-v\n\"CR}(*-\u000fFMCNm5q\u0012\u000eY{xQ1\n\u0017_u IE\t|&~70\u0012\u007fHe3\f%T\u001c/;f\u000f3\u001b", (short) (FB.Xd() ^ 11549));
            try {
                sleepRandomAmount();
                String strQd = C1561oA.Qd("\u0012>3@<5/\u0015.A\u001a:46(", (short) (C1607wl.Xd() ^ 1105));
                Class<?> cls2 = Class.forName(C1593ug.zd("0(>*w>10CA9EK\u0001\u001f:O*LHL@", (short) (C1499aX.Xd() ^ (-14215)), (short) (C1499aX.Xd() ^ (-3239))));
                Class<?>[] clsArr2 = new Class[1];
                short sXd2 = (short) (C1633zX.Xd() ^ (-2092));
                int[] iArr2 = new int["xn\u0003l8uium3Wwtjnf".length()];
                QB qb2 = new QB("xn\u0003l8uium3Wwtjnf");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = {strQd};
                Method declaredMethod = cls2.getDeclaredMethod(C1561oA.Kd("xw\b]\u0004\n\fy\b}\u0001", (short) (OY.Xd() ^ 13350)), clsArr2);
                try {
                    declaredMethod.setAccessible(true);
                    KeyStore keyStore2 = (KeyStore) declaredMethod.invoke(null, objArr2);
                    this.keyStore = keyStore2;
                    Class<?> cls3 = Class.forName(Wg.Zd("7]\u0012;\u001f\u0014Da;f|IbV#[5.\u007f:T\b", (short) (C1580rY.Xd() ^ (-20326)), (short) (C1580rY.Xd() ^ (-7944))));
                    Class<?>[] clsArr3 = {Class.forName(C1561oA.Xd("@8N:\bNA@SQIU[\u0011/J_:\\X\\P\u00109]PTDfbfZFXjZg`pbp", (short) (C1499aX.Xd() ^ (-9439))))};
                    Object[] objArr3 = {null};
                    short sXd3 = (short) (FB.Xd() ^ 20848);
                    int[] iArr3 = new int[",0#'".length()];
                    QB qb3 = new QB(",0#'");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((sXd3 ^ i4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Method method2 = cls3.getMethod(new String(iArr3, 0, i4), clsArr3);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(keyStore2, objArr3);
                        KeyStore keyStore3 = this.keyStore;
                        short sXd4 = (short) (ZN.Xd() ^ 26228);
                        short sXd5 = (short) (ZN.Xd() ^ 3121);
                        int[] iArr4 = new int["[QeO\u001b_PM^ZPZ^\u0012.GZ3SMOA".length()];
                        QB qb4 = new QB("[QeO\u001b_PM^ZPZ^\u0012.GZ3SMOA");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(((sXd4 + i5) + xuXd4.CK(iKK4)) - sXd5);
                            i5++;
                        }
                        Object[] objArr4 = {strValidateKmsKeyUriAndRemovePrefix};
                        Method method3 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1561oA.ud("9DBG3:>B\u000f95,=", (short) (OY.Xd() ^ 31912)), Class.forName(hg.Vd("ndxb.k_kc)Mmj`d\\", (short) (C1633zX.Xd() ^ (-9087)), (short) (C1633zX.Xd() ^ (-18026)))));
                        try {
                            method3.setAccessible(true);
                            return ((Boolean) method3.invoke(keyStore3, objArr4)).booleanValue();
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (IOException e6) {
                throw new GeneralSecurityException(e6);
            }
        }
        return ((Boolean) method.invoke(keyStore, objArr)).booleanValue();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String unused) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }
}
