package androidx.security.crypto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
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

/* JADX INFO: loaded from: classes4.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    private final String mKeyAlias;
    private final KeyGenParameterSpec mKeyGenParameterSpec;

    public enum KeyScheme {
        AES256_GCM
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return 300;
    }

    MasterKey(String str, Object obj) {
        this.mKeyAlias = str;
        this.mKeyGenParameterSpec = (KeyGenParameterSpec) obj;
    }

    public boolean isKeyStoreBacked() {
        short sXd = (short) (C1633zX.Xd() ^ (-30068));
        short sXd2 = (short) (C1633zX.Xd() ^ (-5159));
        int[] iArr = new int["+\b.k(Q|\u0013n2<\fGy\u001d".length()];
        QB qb = new QB("+\b.k(Q|\u0013n2<\fGy\u001d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(ZO.xd("6]\u000f9Q\u0005l\fh\u007fi2@\u00199?.:\u001e\u000e7J", (short) (FB.Xd() ^ 4607), (short) (FB.Xd() ^ 16007)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1626yg.Ud("n8\u0018hWB/\u000e*7z\u0007\u0014$\u000ez", (short) (C1633zX.Xd() ^ (-15481)), (short) (C1633zX.Xd() ^ (-30189))));
            Object[] objArr = {str};
            short sXd3 = (short) (C1607wl.Xd() ^ 22885);
            int[] iArr2 = new int["=\f-%R\u0003k@\u000b#+".length()];
            QB qb2 = new QB("=\f-%R\u0003k@\u000b#+");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                Class<?> cls2 = Class.forName(EO.Od("R\u0019}K\u000b%tM&1,S#_^\u0015\u0006?+\u0010i\u0003", (short) (C1607wl.Xd() ^ 32244)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.Qd("(\u001e2\u001cg,\u001d\u001a+'\u001d'+^z\u0014'\u007f \u001a\u001c\u000eKr\u0015\u0006\bu\u0016\u0010\u0012\u0004m}\u000e{\u0007}\f{\b", (short) (Od.Xd() ^ (-745))));
                Object[] objArr2 = {null};
                Method method = cls2.getMethod(C1593ug.zd("\u0014\u0018\u000b\u000f", (short) (Od.Xd() ^ (-13246)), (short) (Od.Xd() ^ (-2484))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    String str2 = this.mKeyAlias;
                    Class<?> cls3 = Class.forName(C1561oA.od("\u0010\u0006\u001a\u0004O\u0014\u0005\u0002\u0013\u000f\u0005\u000f\u0013Fb{\u000fg\b\u0002\u0004u", (short) (C1607wl.Xd() ^ 14605)));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(C1561oA.Kd("6.D0}=3A;\u0003)KJBHB", (short) (C1580rY.Xd() ^ (-20404))));
                    Object[] objArr3 = {str2};
                    short sXd4 = (short) (FB.Xd() ^ 6313);
                    short sXd5 = (short) (FB.Xd() ^ 14879);
                    int[] iArr3 = new int["XsmDl_Eu}:r\u0015H".length()];
                    QB qb3 = new QB("XsmDl_Eu}:r\u0015H");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Method method2 = cls3.getMethod(new String(iArr3, 0, i4), clsArr3);
                    try {
                        method2.setAccessible(true);
                        return ((Boolean) method2.invoke(keyStore, objArr3)).booleanValue();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        return keyGenParameterSpec != null && Api23Impl.isUserAuthenticationRequired(keyGenParameterSpec);
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec = this.mKeyGenParameterSpec;
        if (keyGenParameterSpec == null) {
            return 0;
        }
        return Api23Impl.getUserAuthenticationValidityDurationSeconds(keyGenParameterSpec);
    }

    public boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT < 28 || (keyGenParameterSpec = this.mKeyGenParameterSpec) == null) {
            return false;
        }
        return Api28Impl.isStrongBoxBacked(keyGenParameterSpec);
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.mKeyAlias + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }

    String getKeyAlias() {
        return this.mKeyAlias;
    }

    public static final class Builder {
        boolean mAuthenticationRequired;
        final Context mContext;
        final String mKeyAlias;
        KeyGenParameterSpec mKeyGenParameterSpec;
        KeyScheme mKeyScheme;
        boolean mRequestStrongBoxBacked;
        int mUserAuthenticationValidityDurationSeconds;

        public Builder(Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        public Builder(Context context, String str) throws Throwable {
            short sXd = (short) (C1499aX.Xd() ^ (-8518));
            int[] iArr = new int["\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96".length()];
            QB qb = new QB("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1607wl.Xd() ^ 9743);
            short sXd3 = (short) (C1607wl.Xd() ^ 25514);
            int[] iArr2 = new int["VUe3cda_ZYmcjj@mmtfzw".length()];
            QB qb2 = new QB("VUe3cda_ZYmcjj@mmtfzw");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
                this.mKeyAlias = str;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Builder setKeyScheme(KeyScheme keyScheme) {
            if (AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme[keyScheme.ordinal()] == 1) {
                if (this.mKeyGenParameterSpec != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.mKeyScheme = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
        }

        public Builder setUserAuthenticationRequired(boolean z2) {
            return setUserAuthenticationRequired(z2, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }

        public Builder setUserAuthenticationRequired(boolean z2, int i2) {
            this.mAuthenticationRequired = z2;
            this.mUserAuthenticationValidityDurationSeconds = i2;
            return this;
        }

        public Builder setRequestStrongBoxBacked(boolean z2) {
            this.mRequestStrongBoxBacked = z2;
            return this;
        }

        public Builder setKeyGenParameterSpec(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.mKeyScheme != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (!this.mKeyAlias.equals(Api23Impl.getKeystoreAlias(keyGenParameterSpec))) {
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.mKeyAlias + " vs " + Api23Impl.getKeystoreAlias(keyGenParameterSpec));
            }
            this.mKeyGenParameterSpec = keyGenParameterSpec;
            return this;
        }

        public MasterKey build() throws GeneralSecurityException, IOException {
            return Api23Impl.build(this);
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static String getKeystoreAlias(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
                Class<?> cls = Class.forName(C1561oA.ud("\u007f\f\u0001\u000e\n\u0003|E\nzw\t\u0005z\u0005\t<xq\u0005}}wyk3Oh{HemN^n\\g^l\\hHdXU", (short) (C1499aX.Xd() ^ (-21610))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (FB.Xd() ^ 27189);
                int[] iArr = new int["wv\u0003Zq\u0007}\u007f\b\f{X\u0001~s\u0007".length()];
                QB qb = new QB("wv\u0003Zq\u0007}\u007f\b\f{X\u0001~s\u0007");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    return (String) method.invoke(keyGenParameterSpec, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            static MasterKey build(Builder builder) throws Throwable {
                if (builder.mKeyScheme == null && builder.mKeyGenParameterSpec == null) {
                    short sXd = (short) (OY.Xd() ^ 16893);
                    int[] iArr = new int["\u000b\u001f\u0014\u0018\u0011UWO\u0014\u0013\u001f \u001a\u001aV\u001a\u001e *.\"]2%5\r(=\f+5\u0018*<,92B4B$B87tEIwL?O'BW2CIGPI\u0013".length()];
                    QB qb = new QB("\u000b\u001f\u0014\u0018\u0011UWO\u0014\u0013\u001f \u001a\u001aV\u001a\u001e *.\"]2%5\r(=\f+5\u0018*<,92B4B$B87tEIwL?O'BW2CIGPI\u0013");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                        i2++;
                    }
                    throw new IllegalArgumentException(new String(iArr, 0, i2));
                }
                if (builder.mKeyScheme == KeyScheme.AES256_GCM) {
                    KeyGenParameterSpec.Builder builder2 = new KeyGenParameterSpec.Builder(builder.mKeyAlias, 3);
                    Object[] objArr = {new String[]{Wg.vd("pmx", (short) (Od.Xd() ^ (-30726)))}};
                    Method method = Class.forName(Qg.kd("FRGTPIC\fPA>OKAKO\u0003?8KDD>@2y\u0016/B\u000f,4\u0015%5#.%3#/\u000f+\u001f\u001c[x+\u001e \u0017\u0017#", (short) (OY.Xd() ^ 5714), (short) (OY.Xd() ^ 28024))).getMethod(hg.Vd("\u001d\u000e\u001ch\u0012\u0014\u0007\u000en\u0010\u0004\u0004\u0011", (short) (Od.Xd() ^ (-23488)), (short) (Od.Xd() ^ (-29063))), String[].class);
                    try {
                        method.setAccessible(true);
                        KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method.invoke(builder2, objArr);
                        String[] strArr = {C1561oA.ud("\u00177\u0017')(,0(", (short) (ZN.Xd() ^ 8455))};
                        short sXd2 = (short) (C1499aX.Xd() ^ (-8919));
                        int[] iArr2 = new int["3?8E=64|M>?PH>LP\u0010LI\\QQOQO\u00177P_,MUBRfT[RdTlLl`Y\u0019:lkmhhp".length()];
                        QB qb2 = new QB("3?8E=64|M>?PH>LP\u0010LI\\QQOQO\u00177P_,MUBRfT[RdTlLl`Y\u0019:lkmhhp");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                            i3++;
                        }
                        Object[] objArr2 = {strArr};
                        Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Yd("naqCmcs{sxnuuXjnou{u\u0003", (short) (C1499aX.Xd() ^ (-16407))), String[].class);
                        try {
                            method2.setAccessible(true);
                            KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method2.invoke(builder3, objArr2);
                            Object[] objArr3 = {256};
                            Method method3 = Class.forName(Xg.qd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\#\u0016\u0015(&\u001e*0e$\u001f4/1-1%n\r(=\f+5\u0018*<,92B4B$B87x\u0018LAE>@N", (short) (C1607wl.Xd() ^ 9154), (short) (C1607wl.Xd() ^ 8163))).getMethod(Jg.Wd("EC~\"g\b\u000eo-D", (short) (C1633zX.Xd() ^ (-1061)), (short) (C1633zX.Xd() ^ (-28078))), Integer.TYPE);
                            try {
                                method3.setAccessible(true);
                                KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method3.invoke(builder4, objArr3);
                                if (builder.mAuthenticationRequired) {
                                    Object[] objArr4 = {true};
                                    Method method4 = Class.forName(ZO.xd("?^'\u0019Sb<P\u0007fcz*Y\u0007<2\u0007(\u0012^s\fyS\u007f|#d5<\u001fZLUAr\fz\u0019l,MY\u000b\u007f7Z9/M3K", (short) (C1499aX.Xd() ^ (-28640)), (short) (C1499aX.Xd() ^ (-29968)))).getMethod(C1626yg.Ud("fh*L]Q^!4\u000f\u0013gt\u00154@\u001b[\u007f\n\u001ev\u0004kN|Mu\u001b", (short) (C1580rY.Xd() ^ (-17595)), (short) (C1580rY.Xd() ^ (-9820))), Boolean.TYPE);
                                    try {
                                        method4.setAccessible(true);
                                        method4.invoke(builder5, objArr4);
                                        if (Build.VERSION.SDK_INT >= 30) {
                                            Api30Impl.setUserAuthenticationParameters(builder5, builder.mUserAuthenticationValidityDurationSeconds, 3);
                                        } else {
                                            int i4 = builder.mUserAuthenticationValidityDurationSeconds;
                                            Class<?> cls = Class.forName(Ig.wd("pNV|\u001aN\u001d_M{w0ab9dk#eQ\u0014m\u0007\u0006\u0011U\u0015}$D6$mY\u0001&\u0013n\\_p:\u0004z\u001bG\u007fkM)h,]", (short) (C1499aX.Xd() ^ (-25240))));
                                            Class<?>[] clsArr = {Integer.TYPE};
                                            Object[] objArr5 = {Integer.valueOf(i4)};
                                            Method method5 = cls.getMethod(EO.Od("\u001eGzt\u000e5\u0018`8t`\u0006>HKl O^\u001e_\"\u0005\u000e]>(\u0004\\\u001c#\u0007WG\u001biC\u0006\u0019+5\u001f;^", (short) (ZN.Xd() ^ 22503)), clsArr);
                                            try {
                                                method5.setAccessible(true);
                                                method5.invoke(builder5, objArr5);
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 28 && builder.mRequestStrongBoxBacked) {
                                    Context context = builder.mContext;
                                    Object[] objArr6 = new Object[0];
                                    Method method6 = Class.forName(C1561oA.Qd("5A6C?82z/:8=-5:r\u0007205%72", (short) (C1499aX.Xd() ^ (-24150)))).getMethod(C1593ug.zd("a`pM_bkbihQfthon|", (short) (C1607wl.Xd() ^ 4915), (short) (C1607wl.Xd() ^ 25075)), new Class[0]);
                                    try {
                                        method6.setAccessible(true);
                                        PackageManager packageManager = (PackageManager) method6.invoke(context, objArr6);
                                        Object[] objArr7 = {C1561oA.od("S_Ta]VP\u0019RJZK]FVH\u0010TTQMKC=IQ7B;NGGAC5", (short) (C1499aX.Xd() ^ (-10748)))};
                                        Method method7 = Class.forName(C1561oA.Kd("7E<KID@\u000bANNUGQX\u0013VT\u00169KNWNUT=R`T[Zh", (short) (C1499aX.Xd() ^ (-8044)))).getMethod(C1561oA.Xd("SM`AhceW`:ZWkmk_", (short) (ZN.Xd() ^ 2830)), Class.forName(Wg.Zd("fl'/\u0019t\u000f9_7y8So\u0012\u0018", (short) (OY.Xd() ^ 19856), (short) (OY.Xd() ^ 12391))));
                                        try {
                                            method7.setAccessible(true);
                                            if (((Boolean) method7.invoke(packageManager, objArr7)).booleanValue()) {
                                                Api28Impl.setIsStrongBoxBacked(builder5);
                                            }
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    } catch (InvocationTargetException e5) {
                                        throw e5.getCause();
                                    }
                                }
                                Object[] objArr8 = new Object[0];
                                Method method8 = Class.forName(Wg.vd("]iboohf/gXYjj`nr:vs\u0007\u0004\u0004\u0002\u0004i1Qj\u0002Nowl|\u0011~\u000e\u0005\u0017\u0007\u0007f\u0007z{;\\\u000f\u0016\u0018\u0013\u0013#", (short) (ZN.Xd() ^ 30854))).getMethod(Qg.kd("\b\u001a\r\u000f\u0006", (short) (C1499aX.Xd() ^ (-16514)), (short) (C1499aX.Xd() ^ (-19262))), new Class[0]);
                                try {
                                    method8.setAccessible(true);
                                    builder.mKeyGenParameterSpec = (KeyGenParameterSpec) method8.invoke(builder5, objArr8);
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
                }
                if (builder.mKeyGenParameterSpec != null) {
                    return new MasterKey(MasterKeys.getOrCreate(builder.mKeyGenParameterSpec), builder.mKeyGenParameterSpec);
                }
                throw new NullPointerException(hg.Vd("Yr\u0006RowXhxfqhvfrRnb_\u001bqZk\u0017dj`_\u0012RVcS_\fM_RTK\u000e\u000e\u0004FJFCJ", (short) (C1580rY.Xd() ^ (-18430)), (short) (C1580rY.Xd() ^ (-26869))));
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static void setIsStrongBoxBacked(KeyGenParameterSpec.Builder builder) throws Throwable {
                    short sXd = (short) (FB.Xd() ^ 22200);
                    short sXd2 = (short) (FB.Xd() ^ 24589);
                    int[] iArr = new int["=KBQOJF\u0011WJI\\ZR^d\u001aXShceaeY#A\\q@_iL^p`mfvhvXvlk-L\u0001uyrt\u0003".length()];
                    QB qb = new QB("=KBQOJF\u0011WJI\\ZR^d\u001aXShceaeY#A\\q@_iL^p`mfvhvXvlk-L\u0001uyrt\u0003");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                        i2++;
                    }
                    Object[] objArr = {true};
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("{lzNwVvsome?ks<Z[b[Y", (short) (FB.Xd() ^ 3079)), Boolean.TYPE);
                    try {
                        method.setAccessible(true);
                        method.invoke(builder, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }

            static class Api30Impl {
                private Api30Impl() {
                }

                static void setUserAuthenticationParameters(KeyGenParameterSpec.Builder builder, int i2, int i3) throws Throwable {
                    Class<?> cls = Class.forName(C1561oA.Kd("O]Tca\\X#i\\[nldpv,jezuwswk5Sn\u0004Rq{^p\u0003r\u007fx\tz\tj\t~}?^\u0013\b\f\u0005\u0007\u0015", (short) (C1499aX.Xd() ^ (-8954))));
                    Class<?>[] clsArr = {Integer.TYPE, Integer.TYPE};
                    Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
                    Method method = cls.getMethod(Wg.Zd("^\u001b\tOJR=q\u0004\u0019iL4O\"\u0003^\u0006YE\"\u001a\t~Km?4\u0004%\u0004", (short) (C1580rY.Xd() ^ (-14629)), (short) (C1580rY.Xd() ^ (-2025))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(builder, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.security.crypto.MasterKey$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean isUserAuthenticationRequired(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud(".[\u001d\u001b69\u001c\n2A\u007fB1;q\u001d\u0016\u001d#WV\bez{B/I%\u001a\u0010\u0006AHvY:\u0010Ge!O\u0005QX", (short) (OY.Xd() ^ 29194), (short) (OY.Xd() ^ 18779))).getMethod(Ig.wd("\u001fQ/0g\u001f\u001cv2\u0005\nn%\u0016B\u0019VK\u0018`\u0001VNT\u0015\u0014c5", (short) (ZN.Xd() ^ 30190)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(keyGenParameterSpec, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static int getUserAuthenticationValidityDurationSeconds(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("9K\"trqO9cVY.\fgS\u001dT\u0013q&\u0005\u0007\u0005L OM*C\u0012\u0015>\u0003\u0019+^KH\u001aK=?Ax7", (short) (FB.Xd() ^ 22619), (short) (FB.Xd() ^ 28075))).getMethod(ZO.xd(";7\u000b-'&Cr&Ure\u000e^.c\u000fh5v\u0001:!\bPu+G\u00178t\u0004t,Y_\u001c1:\\3\\g=", (short) (C1499aX.Xd() ^ (-19052)), (short) (C1499aX.Xd() ^ (-9530))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(keyGenParameterSpec, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isStrongBoxBacked(KeyGenParameterSpec keyGenParameterSpec) throws Throwable {
            short sXd = (short) (C1633zX.Xd() ^ (-3516));
            int[] iArr = new int["\u001a~x${K\u0018;DWM\u0004PKDpz8kU\u0013Q`a\bz;\u0003O0`\u0011\u0015E\u0016M4\u0006:\u001f&qUBd".length()];
            QB qb = new QB("\u001a~x${K\u0018;DWM\u0004PKDpz8kU\u0013Q`a\bz;\u0003O0`\u0011\u0015E\u0016M4\u0006:\u001f&qUBd");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("1:\u00199620(\u0002.6~\u001d\u001e%\u001e\u001c", (short) (FB.Xd() ^ 28297)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(keyGenParameterSpec, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
