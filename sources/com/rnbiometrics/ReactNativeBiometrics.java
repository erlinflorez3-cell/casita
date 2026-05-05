package com.rnbiometrics;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.concurrent.ExecutorService;
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

/* JADX INFO: loaded from: classes5.dex */
public class ReactNativeBiometrics extends ReactContextBaseJavaModule {
    protected String biometricKeyAlias;

    public ReactNativeBiometrics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.biometricKeyAlias = "biometric_key";
    }

    private int getAllowedAuthenticators(boolean z2) {
        return (!z2 || isCurrentSDK29OrEarlier()) ? 15 : 32783;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BiometricPrompt.PromptInfo getPromptInfo(String str, String str2, boolean z2) {
        BiometricPrompt.PromptInfo.Builder title = new BiometricPrompt.PromptInfo.Builder().setTitle(str);
        title.setAllowedAuthenticators(getAllowedAuthenticators(z2));
        if (!z2 || isCurrentSDK29OrEarlier()) {
            title.setNegativeButtonText(str2);
        }
        return title.build();
    }

    private boolean isCurrentSDK29OrEarlier() {
        return Build.VERSION.SDK_INT <= 29;
    }

    private boolean isCurrentSDKMarshmallowOrLater() {
        return true;
    }

    @ReactMethod
    public void biometricKeysExist(Promise promise) throws Throwable {
        try {
            boolean zDoesBiometricKeyExist = doesBiometricKeyExist();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("keysExist", zDoesBiometricKeyExist);
            promise.resolve(writableNativeMap);
        } catch (Exception e2) {
            promise.reject("Error checking if biometric key exists: " + e2.getMessage(), "Error checking if biometric key exists: " + e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.react.bridge.Promise] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.react.bridge.Promise] */
    @ReactMethod
    public void createKeys(ReadableMap readableMap, Promise promise) throws Throwable {
        ?? r1 = 24712;
        String strKd = C1561oA.Kd("0O]^`f\u0013[Zd\\jZn`\u001chcxs!qq$ftkzxso,\u0004s\u0002\u0004z\u0002\u0002\b5x|\u0005\t\u0012;RKN", (short) (ZN.Xd() ^ 24712));
        try {
            r1 = promise;
            if (!isCurrentSDKMarshmallowOrLater()) {
                r1.reject(strKd, strKd);
                return;
            }
            deleteBiometricKey();
            String strZd = Wg.Zd("\u0001GY", (short) (ZN.Xd() ^ 31025), (short) (ZN.Xd() ^ 20746));
            String strXd = C1561oA.Xd("+YP_]XT<WlGiei]", (short) (Od.Xd() ^ (-17957)));
            Class<?> cls = Class.forName(Wg.vd("\n\u007f\u0018\u0002Q\u0016\u000b\b\r\t\u0003\r\u0015Hh\u0002\t^ry\u0006Yz\u0003lxj|z|", (short) (C1607wl.Xd() ^ 3836)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Qg.kd(".$8\"m+\u001f+#h\r-* $\u001c", (short) (C1633zX.Xd() ^ (-26740)), (short) (C1633zX.Xd() ^ (-7063))));
            clsArr[1] = Class.forName(hg.Vd("tj~h4qeqi/Sspfjb", (short) (FB.Xd() ^ 30580), (short) (FB.Xd() ^ 31844)));
            Object[] objArr = {strZd, strXd};
            short sXd = (short) (Od.Xd() ^ (-26162));
            int[] iArr = new int["1.<\u0010488$0$%".length()];
            QB qb = new QB("1.<\u0010488$0$%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(this.biometricKeyAlias, 4);
                String[] strArr = new String[1];
                strArr[0] = C1561oA.yd("\u0019\u000f\tuswy", (short) (C1633zX.Xd() ^ (-25841)));
                Object[] objArr2 = {strArr};
                Method method = Class.forName(C1561oA.Yd(" .%42-)s:-,?=5AG|;6KFHDH<\u0006$?T#BL/ASCPIYKY;YON\u0010/cX\\UWe", (short) (C1633zX.Xd() ^ (-14387)))).getMethod(Xg.qd("\\O_0VUTcee", (short) (C1580rY.Xd() ^ (-27046)), (short) (C1580rY.Xd() ^ (-28101))), String[].class);
                try {
                    method.setAccessible(true);
                    KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr2);
                    String[] strArr2 = new String[1];
                    strArr2[0] = Jg.Wd("p2\u0005o4", (short) (C1580rY.Xd() ^ (-28602)), (short) (C1580rY.Xd() ^ (-19737)));
                    Object[] objArr3 = {strArr2};
                    Method method2 = Class.forName(ZO.xd("\frw(x%N3\u0015O0o~\u000e(9-f1xF\u00054\f\u0017\u0010\u0005L:\u0010?zxA~(\u0011jkKQ\u001e\u0013|\u0007C1>\rn2UJ", (short) (C1499aX.Xd() ^ (-12777)), (short) (C1499aX.Xd() ^ (-14683)))).getMethod(C1626yg.Ud("\u0003\fs/v{Z%\u0018|j|\u007f9Jw5\"JY", (short) (C1580rY.Xd() ^ (-6790)), (short) (C1580rY.Xd() ^ (-15995))), String[].class);
                    try {
                        method2.setAccessible(true);
                        KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr3);
                        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4);
                        Class<?> cls2 = Class.forName(Ig.wd("\u0017Mo/rH\u0019@ObXv%(=\"\u000e_~|0fAB3QN8 ]Q<\b|e\u0014uSyZm4\u001f6~O&!'JCvW", (short) (C1499aX.Xd() ^ (-2119))));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(EO.Od("V\u0007}D\t\u0014.3\u0019UbW\f2(\u000b%1#bQsed?Rg>'i#9Uji\u0010HI\bnl", (short) (ZN.Xd() ^ 7603)));
                        Object[] objArr4 = {rSAKeyGenParameterSpec};
                        short sXd2 = (short) (OY.Xd() ^ 21335);
                        int[] iArr2 = new int["\f|\u000bV\u0001z\u0002\u0004y\u0004vz\\l|julzjvVrfc".length()];
                        QB qb2 = new QB("\f|\u000bV\u0001z\u0002\u0004y\u0004vz\\l|julzjvVrfc");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Method method3 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                        try {
                            method3.setAccessible(true);
                            KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr4);
                            short sXd3 = (short) (C1633zX.Xd() ^ (-22427));
                            short sXd4 = (short) (C1633zX.Xd() ^ (-23190));
                            int[] iArr3 = new int["\u0017%\u001c+)$ j1$#64,8>s2-B=?;?3|\u001b6K\u001a9C&8J:G@PBP2PFE\u0007&ZOSLN\\".length()];
                            QB qb3 = new QB("\u0017%\u001c+)$ j1$#64,8>s2-B=?;?3|\u001b6K\u001a9C&8J:G@PBP2PFE\u0007&ZOSLN\\");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                                i4++;
                            }
                            Object[] objArr5 = {true};
                            Method method4 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.od("\u0007w\u0006e\u0003s\u007fM\u0001~qmuzngdvjomPbmpck][", (short) (C1499aX.Xd() ^ (-10507))), Boolean.TYPE);
                            try {
                                method4.setAccessible(true);
                                KeyGenParameterSpec.Builder builder5 = (KeyGenParameterSpec.Builder) method4.invoke(builder4, objArr5);
                                Object[] objArr6 = new Object[0];
                                Method method5 = Class.forName(C1561oA.Kd("3A8GE@<\u0007M@?RPHTZ\u0010NI^Y[W[O\u00197Rg6U_BTfVc\\l^lNlba#Bvkohjx", (short) (OY.Xd() ^ 7336))).getMethod(Wg.Zd("D\u0017{\u0012-", (short) (OY.Xd() ^ 9135), (short) (OY.Xd() ^ LeicaMakernoteDirectory.TAG_CONTROLLER_BOARD_VERSION)), new Class[0]);
                                try {
                                    method5.setAccessible(true);
                                    KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) method5.invoke(builder5, objArr6);
                                    Class<?> cls3 = Class.forName(C1561oA.Xd("{s\nuC\n|{\u000f\r\u0005\u0011\u0017Lj\u0006\u001br\u0005\u000e\u0018m\r\u0017\u000f\u001d\r!\u001d!", (short) (ZN.Xd() ^ 22477)));
                                    Class<?>[] clsArr3 = new Class[1];
                                    clsArr3[0] = Class.forName(Wg.vd("h^v`0tif{wq{\u00047\u007f{sp>P~x\u0004\u0006\u007f\n\u0001\u0005jz\u000f|\f\u0003\u0015\u0005\u0015t\u0015\t\n", (short) (C1633zX.Xd() ^ (-9547))));
                                    Object[] objArr7 = {keyGenParameterSpec};
                                    Method method6 = cls3.getMethod(Qg.kd("RVPZNEOK[E", (short) (ZN.Xd() ^ 5483), (short) (ZN.Xd() ^ 23653)), clsArr3);
                                    try {
                                        method6.setAccessible(true);
                                        method6.invoke(keyPairGenerator, objArr7);
                                        Object[] objArr8 = new Object[0];
                                        Method method7 = Class.forName(hg.Vd("f\\pZ&j[Xie[ei\u001d9Re;KRZ.KSIUCUOQ", (short) (OY.Xd() ^ 1206), (short) (OY.Xd() ^ 6671))).getMethod(C1561oA.ud("\u0012\u000f\u0017\r\u0019\u0007\u0019\tm\u0007\u001ao\u007f\u0007\u000f", (short) (C1607wl.Xd() ^ 17660)), new Class[0]);
                                        try {
                                            method7.setAccessible(true);
                                            Object[] objArr9 = {((KeyPair) method7.invoke(keyPairGenerator, objArr8)).getPublic().getEncoded(), 0};
                                            Method declaredMethod2 = Class.forName(C1561oA.yd("\u000e\u001a\u0013 \u0018\u0011\u000fW*( \"^q\u0014%\"qr", (short) (C1580rY.Xd() ^ (-1948)))).getDeclaredMethod(C1561oA.Yd(" * -#%\u00151\u001687/5/", (short) (C1580rY.Xd() ^ (-7239))), byte[].class, Integer.TYPE);
                                            try {
                                                declaredMethod2.setAccessible(true);
                                                String strReplaceAll = ((String) declaredMethod2.invoke(null, objArr9)).replaceAll(Xg.qd("m", (short) (OY.Xd() ^ 17945), (short) (OY.Xd() ^ 15010)), "").replaceAll(Jg.Wd(",", (short) (C1499aX.Xd() ^ (-15349)), (short) (C1499aX.Xd() ^ (-17342))), "");
                                                WritableNativeMap writableNativeMap = new WritableNativeMap();
                                                writableNativeMap.putString(ZO.xd("^YRLxq\f\u0011'", (short) (OY.Xd() ^ 12150), (short) (OY.Xd() ^ 1247)), strReplaceAll);
                                                r1.resolve(writableNativeMap);
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
        } catch (Exception e11) {
            r1.reject(C1626yg.Ud(",7%\u001aeK\u0012\u0010\u001fz\u001d&`;|o\u001cn\u000fK<dT\u0003e<\\=\u0016O_TT\u0004o\u0006eG", (short) (C1633zX.Xd() ^ (-1088)), (short) (C1633zX.Xd() ^ (-8554))) + e11.getMessage(), Ig.wd("\"#rMVG14\u0013OX+\f\u0001\u0014pp-\bzJ\u00166rc.C~\u00145F%\u0005!:z", (short) (C1580rY.Xd() ^ (-11382))));
        }
    }

    @ReactMethod
    public void createSignature(final ReadableMap readableMap, final Promise promise) {
        if (isCurrentSDKMarshmallowOrLater()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.rnbiometrics.ReactNativeBiometrics.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    try {
                        String string = readableMap.getString(ZO.xd("e]\u0011Y&b3;d]I\u0019-", (short) (Od.Xd() ^ (-7715)), (short) (Od.Xd() ^ (-26677))));
                        String string2 = readableMap.getString(C1626yg.Ud("RF\u001cH~^_", (short) (ZN.Xd() ^ 18798), (short) (ZN.Xd() ^ 27769)));
                        String string3 = readableMap.getString(Ig.wd("*[\u0019/W:mvC\u0005\u0004bu\u000f\u0018o", (short) (FB.Xd() ^ 22628)));
                        boolean z2 = readableMap.getBoolean(EO.Od("\u0011i9\"\r/*\u0015Ojpfa\\-I0*h6\u0019Y", (short) (C1633zX.Xd() ^ (-10427))));
                        Signature signature = Signature.getInstance(C1561oA.Qd("\u001f\u0013\u000bz||=.8+\u0014\u0014\u0001", (short) (C1580rY.Xd() ^ (-13369))));
                        short sXd = (short) (ZN.Xd() ^ 30749);
                        short sXd2 = (short) (ZN.Xd() ^ 13884);
                        int[] iArr = new int["\u001bI@OMHD,G\\7YUYM".length()];
                        QB qb = new QB("\u001bI@OMHD,G\\7YUYM");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                            i2++;
                        }
                        String str = new String(iArr, 0, i2);
                        Class<?> cls = Class.forName(C1561oA.od("9/C-x=.+<8.8<o\f%8\u00111+-\u001f", (short) (ZN.Xd() ^ 30778)));
                        Class<?>[] clsArr = new Class[1];
                        short sXd3 = (short) (OY.Xd() ^ 17089);
                        int[] iArr2 = new int["g_ua/ndrl4Z|{sys".length()];
                        QB qb2 = new QB("g_ua/ndrl4Z|{sys");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                            i3++;
                        }
                        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                        Object[] objArr = {str};
                        Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("R:-k>-\u0012&#\u0004'", (short) (C1499aX.Xd() ^ (-23433)), (short) (C1499aX.Xd() ^ (-30554))), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                            short sXd4 = (short) (C1607wl.Xd() ^ 9149);
                            int[] iArr3 = new int["3+A-zA43FD<HN\u0004\"=R-OKOC".length()];
                            QB qb3 = new QB("3+A-zA43FD<HN\u0004\"=R-OKOC");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                                i4++;
                            }
                            Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                            Class<?>[] clsArr2 = new Class[1];
                            short sXd5 = (short) (C1633zX.Xd() ^ (-26406));
                            int[] iArr4 = new int["SK]I\u0013YHGVTHTV\f&ArMkgg[\u0017@`SSCa]]Q\u0019+9)2+7)3".length()];
                            QB qb4 = new QB("SK]I\u0013YHGVTHTV\f&ArMkgg[\u0017@`SSCa]]Q\u0019+9)2+7)3");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
                                i5++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
                            Object[] objArr2 = {null};
                            Method method = cls2.getMethod(Qg.kd("\u0019\u001b\f\u000e", (short) (C1580rY.Xd() ^ (-18980)), (short) (C1580rY.Xd() ^ (-2935))), clsArr2);
                            try {
                                method.setAccessible(true);
                                method.invoke(keyStore, objArr2);
                                String str2 = ReactNativeBiometrics.this.biometricKeyAlias;
                                Class<?> cls3 = Class.forName(hg.Vd("mcwa-qb_plblp$@YlEe_aS", (short) (FB.Xd() ^ 6290), (short) (FB.Xd() ^ 2604)));
                                Class<?>[] clsArr3 = new Class[2];
                                short sXd6 = (short) (C1580rY.Xd() ^ (-14361));
                                int[] iArr5 = new int["\f\u0002\u0016\u007fK\t|\t\u0001Fj\u000b\b}\u0002y".length()];
                                QB qb5 = new QB("\f\u0002\u0016\u007fK\t|\t\u0001Fj\u000b\b}\u0002y");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(sXd6 + i6 + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                clsArr3[0] = Class.forName(new String(iArr5, 0, i6));
                                clsArr3[1] = char[].class;
                                Object[] objArr3 = {str2, null};
                                Method method2 = cls3.getMethod(C1561oA.yd("]\\h@_t", (short) (C1580rY.Xd() ^ (-26853))), clsArr3);
                                try {
                                    method2.setAccessible(true);
                                    signature.initSign((PrivateKey) ((Key) method2.invoke(keyStore, objArr3)));
                                    BiometricPrompt.CryptoObject cryptoObject = new BiometricPrompt.CryptoObject(signature);
                                    CreateSignatureCallback createSignatureCallback = new CreateSignatureCallback(promise, string2);
                                    FragmentActivity fragmentActivity = (FragmentActivity) ReactNativeBiometrics.this.getCurrentActivity();
                                    short sXd7 = (short) (OY.Xd() ^ 30732);
                                    int[] iArr6 = new int["A9O;\tQQGK\u000eDQQGZXYMW^\u00191eSReeaeg".length()];
                                    QB qb6 = new QB("A9O;\tQQGK\u000eDQQGZXYMW^\u00191eSReeaeg");
                                    int i7 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (((sXd7 + sXd7) + sXd7) + i7));
                                        i7++;
                                    }
                                    Class<?> cls4 = Class.forName(new String(iArr6, 0, i7));
                                    Object[] objArr4 = new Object[0];
                                    Method declaredMethod2 = cls4.getDeclaredMethod(Xg.qd("1)<\u001906060 5@415\u0017K98KKGK", (short) (C1633zX.Xd() ^ (-13949)), (short) (C1633zX.Xd() ^ (-32712))), new Class[0]);
                                    try {
                                        declaredMethod2.setAccessible(true);
                                        new BiometricPrompt(fragmentActivity, (ExecutorService) declaredMethod2.invoke(null, objArr4), createSignatureCallback).authenticate(ReactNativeBiometrics.this.getPromptInfo(string, string3, z2), cryptoObject);
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
                    } catch (Exception e6) {
                        promise.reject(Jg.Wd("6daW?m>\r\u0010\u0018pnl\u0007T>;//\u001d\u0001[:", (short) (C1499aX.Xd() ^ (-14625)), (short) (C1499aX.Xd() ^ (-9367))) + e6.getMessage(), ZO.xd("P?\u00069bC%\u0017e+\u0014V0\nwQQ&\u0013J\u000e\\5{{3\u001aR", (short) (Od.Xd() ^ (-27171)), (short) (Od.Xd() ^ (-7812))) + e6.getMessage());
                    }
                }
            });
        } else {
            promise.reject("Cannot generate keys on android versions below 6.0", "Cannot generate keys on android versions below 6.0");
        }
    }

    protected boolean deleteBiometricKey() throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 15563);
        int[] iArr = new int["a>h\u0010\u0010g@h^oI\u000bUdM".length()];
        QB qb = new QB("a>h\u0010\u0010g@h^oI\u000bUdM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(C1561oA.Qd("\\RfP\u001c`QN_[Q[_\u0013/H[4TNPB", (short) (FB.Xd() ^ 25771)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd("ph~j8wm{u=c\u0006\u0005|\u0003|", (short) (ZN.Xd() ^ 23075), (short) (ZN.Xd() ^ 1795)));
            Object[] objArr = {str};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.od("hesGkoo[g[\\", (short) (ZN.Xd() ^ 10592)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                Class<?> cls2 = Class.forName(C1561oA.Kd("80F2\u007fF98KIAMS\t'BW2TPTH", (short) (C1499aX.Xd() ^ (-2069))));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(Wg.Zd("c/\u00175tn5\u0006[+vU\u000e\u0016\u0006tLzn\u001c\u0014:M).t+\u000fb0\bN}AFhH\u0015v\u001b\u000b", (short) (C1633zX.Xd() ^ (-17284)), (short) (C1633zX.Xd() ^ (-16814))));
                Object[] objArr2 = {null};
                Method method = cls2.getMethod(C1561oA.Xd("%)\u001c ", (short) (C1607wl.Xd() ^ 32128)), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    String str2 = this.biometricKeyAlias;
                    Class<?> cls3 = Class.forName(Wg.vd("H@R>\u0010VED[YMYc\u00193NG\"@<D8", (short) (OY.Xd() ^ 28997)));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(Qg.kd("9/C-x6*6.s\u001885+/'", (short) (C1633zX.Xd() ^ (-10559)), (short) (C1633zX.Xd() ^ (-27117))));
                    Object[] objArr3 = {str2};
                    Method method2 = cls3.getMethod(hg.Vd("\u001e\u001e$\u001c*\u001ax!&#)", (short) (Od.Xd() ^ (-2006)), (short) (Od.Xd() ^ (-10105))), clsArr3);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(keyStore, objArr3);
                        return true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void deleteKeys(Promise promise) {
        if (!doesBiometricKeyExist()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("keysDeleted", false);
            promise.resolve(writableNativeMap);
        } else {
            if (!deleteBiometricKey()) {
                promise.reject("Error deleting biometric key from keystore", "Error deleting biometric key from keystore");
                return;
            }
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putBoolean("keysDeleted", true);
            promise.resolve(writableNativeMap2);
        }
    }

    protected boolean doesBiometricKeyExist() throws Throwable {
        String strUd = C1561oA.ud("\u00073(51*$\n#6\u000f/)+\u001d", (short) (C1607wl.Xd() ^ 1492));
        try {
            Class<?> cls = Class.forName(C1561oA.yd("\n\u007f\u0018\u0002Q\u0016\u000b\b\r\t\u0003\r\u0015Hh\u0002\ta\u0006\u007f\u0006w", (short) (C1607wl.Xd() ^ 291)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Yd("}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n", (short) (C1580rY.Xd() ^ (-11075))));
            Object[] objArr = {strUd};
            short sXd = (short) (C1580rY.Xd() ^ (-30304));
            short sXd2 = (short) (C1580rY.Xd() ^ (-14182));
            int[] iArr = new int[",+;\u00117=?-;14".length()];
            QB qb = new QB(",+;\u00117=?-;14");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                short sXd3 = (short) (ZN.Xd() ^ 27500);
                short sXd4 = (short) (ZN.Xd() ^ 17891);
                int[] iArr2 = new int["3NzTx%N\u0019\"FT\u000f+\bZK\u000fHHz\f<".length()];
                QB qb2 = new QB("3NzTx%N\u0019\"FT\u000f+\bZK\u000fHHz\f<");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(ZO.xd("o#{\u000b>7\u0004N{\u0019C\u0019z\u00073#\u000f\u0015`9=irYK4\fe\b[E#\u0007p}(PUO)R", (short) (FB.Xd() ^ 10439), (short) (FB.Xd() ^ 23701)));
                Object[] objArr2 = {null};
                Method method = cls2.getMethod(C1626yg.Ud("0_\u0006A", (short) (Od.Xd() ^ (-7430)), (short) (Od.Xd() ^ (-23063))), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    String str = this.biometricKeyAlias;
                    short sXd5 = (short) (C1607wl.Xd() ^ 24083);
                    int[] iArr3 = new int["P CE\n\u0003P.\u0012\u001e\u0017D\u001bUb&\u0002UN\u0001E\u0010".length()];
                    QB qb3 = new QB("P CE\n\u0003P.\u0012\u001e\u0017D\u001bUb&\u0002UN\u0001E\u0010");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                        i4++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(EO.Od("Nrw<\u000b'2X!%FK\u0015\u001czW", (short) (OY.Xd() ^ 4072)));
                    Object[] objArr3 = {str};
                    short sXd6 = (short) (C1580rY.Xd() ^ (-28325));
                    int[] iArr4 = new int["OZX]IPTX%OKBS".length()];
                    QB qb4 = new QB("OZX]IPTX%OKBS");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    Method method2 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
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
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeBiometrics";
    }

    @ReactMethod
    public void isSensorAvailable(ReadableMap readableMap, Promise promise) {
        try {
            if (!isCurrentSDKMarshmallowOrLater()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("available", false);
                writableNativeMap.putString("error", "Unsupported android version");
                promise.resolve(writableNativeMap);
                return;
            }
            int iCanAuthenticate = BiometricManager.from(getReactApplicationContext()).canAuthenticate(getAllowedAuthenticators(readableMap.getBoolean("allowDeviceCredentials")));
            if (iCanAuthenticate == 0) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putBoolean("available", true);
                writableNativeMap2.putString("biometryType", "Biometrics");
                promise.resolve(writableNativeMap2);
                return;
            }
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            writableNativeMap3.putBoolean("available", false);
            if (iCanAuthenticate == 1) {
                writableNativeMap3.putString("error", "BIOMETRIC_ERROR_HW_UNAVAILABLE");
            } else if (iCanAuthenticate == 11) {
                writableNativeMap3.putString("error", "BIOMETRIC_ERROR_NONE_ENROLLED");
            } else if (iCanAuthenticate == 12) {
                writableNativeMap3.putString("error", "BIOMETRIC_ERROR_NO_HARDWARE");
            }
            promise.resolve(writableNativeMap3);
        } catch (Exception e2) {
            promise.reject("Error detecting biometrics availability: " + e2.getMessage(), "Error detecting biometrics availability: " + e2.getMessage());
        }
    }

    @ReactMethod
    public void simplePrompt(final ReadableMap readableMap, final Promise promise) {
        if (isCurrentSDKMarshmallowOrLater()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.rnbiometrics.ReactNativeBiometrics.2
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    try {
                        String string = readableMap.getString(C1626yg.Ud("v3:#Y|A\u00040\u0015\u001cKf", (short) (C1499aX.Xd() ^ (-1446)), (short) (C1499aX.Xd() ^ (-15143))));
                        ReadableMap readableMap2 = readableMap;
                        short sXd = (short) (C1633zX.Xd() ^ (-29536));
                        int[] iArr = new int["}H%{\u000bUQ\u0012f8/\u0016IZK+".length()];
                        QB qb = new QB("}H%{\u000bUQ\u0012f8/\u0016IZK+");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                            i2++;
                        }
                        String string2 = readableMap2.getString(new String(iArr, 0, i2));
                        boolean z2 = readableMap.getBoolean(EO.Od(">\u001ciU\\M\u001bT}\\`\u00182\u001b.I\u001f\u000bXX\u001ai", (short) (FB.Xd() ^ 7641)));
                        SimplePromptCallback simplePromptCallback = new SimplePromptCallback(promise);
                        FragmentActivity fragmentActivity = (FragmentActivity) ReactNativeBiometrics.this.getCurrentActivity();
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.Qd("vl\u0001j6|znp1epnbson`hm&<nZWhf`bb", (short) (ZN.Xd() ^ 24137))).getDeclaredMethod(C1593ug.zd("vn\u0002^u{u{uez\u0006yvz\\\u0011~}\u0011\u0011\r\u0011", (short) (C1607wl.Xd() ^ 29380), (short) (C1607wl.Xd() ^ 20406)), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            new BiometricPrompt(fragmentActivity, (ExecutorService) declaredMethod.invoke(null, objArr), simplePromptCallback).authenticate(ReactNativeBiometrics.this.getPromptInfo(string, string2, z2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Exception e3) {
                        Promise promise2 = promise;
                        String strOd = C1561oA.od("X\u0005\u0004\u007f\u0002.qu~zui\u0001osk#npc`j\u001d^dif]kh^W\u0013bc_\\^a&\u000b", (short) (ZN.Xd() ^ 31578));
                        promise2.reject(strOd + e3.getMessage(), strOd + e3.getMessage());
                    }
                }
            });
        } else {
            promise.reject("Cannot display biometric prompt on android versions below 6.0", "Cannot display biometric prompt on android versions below 6.0");
        }
    }
}
