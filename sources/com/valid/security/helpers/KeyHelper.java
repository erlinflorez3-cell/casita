package com.valid.security.helpers;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.braze.Constants;
import com.dynatrace.android.agent.Global;
import com.valid.security.BuildConfig;
import com.valid.security.entities.AesKey;
import com.valid.security.entities.Digest;
import com.valid.security.entities.RsaOaepKey;
import com.valid.security.entities.RsaPkcs1Key;
import com.valid.security.helpers.CipherHelperImp;
import com.valid.security.utils.SecurityUtils;
import com.valid.utils.VsshLogger;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Calendar;
import javax.crypto.KeyGenerator;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openssl.PEMDecryptorProvider;
import org.spongycastle.openssl.PEMEncryptedKeyPair;
import org.spongycastle.openssl.PEMException;
import org.spongycastle.openssl.PEMKeyPair;
import org.spongycastle.openssl.PEMParser;
import org.spongycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.spongycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;
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
public final class KeyHelper {
    private static final String TAG = Wg.vd("Xcd$gQ_[Q\u001abSL]]SY]\u0015NFLSGOO\r)>Q#?\u0002\u0005|\t", (short) (FB.Xd() ^ ((1482527851 ^ 1955121392) ^ 752173066)));

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    static {
        try {
            Security.addProvider(new BouncyCastleProvider());
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    public static String buildPublicKeyAsString(String str) {
        int iXd;
        int i2;
        int i3;
        int i4;
        String str2;
        int iXd2;
        int i5;
        String strUd;
        int i6;
        int i7;
        int i8;
        int iXd3;
        if (str == null || str.isEmpty()) {
            return str;
        }
        String strKd = Qg.kd("1", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (86869291 ^ (-1522707792)))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1344892145 ^ (-1047341148)))));
        int i9 = 4;
        int i10 = 1;
        if (Integer.parseInt(strKd) != 0) {
            iXd = 1;
            i2 = 1;
        } else {
            iXd = Od.Xd() ^ (429662157 ^ 1583450803);
            i2 = 4;
        }
        int i11 = i2 + i2 + i2;
        int i12 = Integer.parseInt(strKd);
        int iXd4 = C1499aX.Xd() ^ (-1134250577);
        short sXd = (short) (ZN.Xd() ^ (874273221 ^ 874255096));
        short sXd2 = (short) (ZN.Xd() ^ iXd4);
        int[] iArr = new int[Global.BLANK.length()];
        QB qb = new QB(Global.BLANK);
        int i13 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i13] = xuXd.fK(sXd + i13 + xuXd.CK(iKK) + sXd2);
            i13++;
        }
        String str3 = new String(iArr, 0, i13);
        int i14 = 0;
        int iXd5 = Od.Xd() ^ (1553530516 ^ 459631311);
        if (i12 != 0) {
            iXd2 = ZN.Xd() ^ (148784019 ^ 995392870);
            str2 = strKd;
            i4 = 1;
            i3 = 0;
        } else {
            iXd += i11;
            i3 = 13;
            i4 = 2;
            str2 = str3;
            iXd2 = iXd5;
        }
        String strConcat = null;
        if (iXd2 != 0) {
            iXd /= i3 << i4;
            strUd = C1561oA.ud("q\u0004qcyFQEERd\u0001\u0012\u0007\tԎK\u0019OK\u0006kYka\u0014~", (short) (OY.Xd() ^ (Od.Xd() ^ 1207809237)));
            str2 = strKd;
            i5 = 0;
        } else {
            i5 = iXd2 + 11;
            strUd = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i6 = i5 + iXd5;
            str3 = str2;
        } else {
            strConcat = CipherHelperImp.AnonymousClass2.concat(iXd, strUd).concat(str);
            i6 = i5 + 12;
        }
        if (i6 != 0) {
            i7 = (1884104183 ^ 1727669942) ^ 381092701;
        } else {
            i14 = i6 + 14;
            i7 = 1;
            strKd = str3;
        }
        if (Integer.parseInt(strKd) != 0) {
            i8 = i14 + 10;
            iXd3 = 1;
        } else {
            i8 = i14 + 11;
            iXd3 = C1607wl.Xd() ^ 1849955292;
        }
        if (i8 != 0) {
            i7 += iXd3;
            i10 = 4;
        } else {
            i9 = iXd3;
        }
        return strConcat.concat(CipherHelperImp.AnonymousClass2.concat(i7 / (i9 + i10), C1561oA.yd("n\u001e\u0014\u0002\u0018N{r`Q1\u001a\u001f\u001d0gew{u\u0018.$2\u0018", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (243326452 ^ (-1366281297)))))));
    }

    private static String generateHash(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Digest.SHA_256.getName());
            messageDigest.update(str.getBytes());
            return SecurityUtils.getHexStringFromByteArray(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return null;
        }
    }

    public static Key generateRandomKey3Des() {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        String strYd = C1561oA.Yd("!", (short) (OY.Xd() ^ ((563520528 ^ 1043528823) ^ 530848232)));
        String strQd = Xg.qd("dc{\f\r\f", (short) (C1499aX.Xd() ^ (1097024438 ^ (-1097024904))), (short) (C1499aX.Xd() ^ (1758747007 ^ (-1758732777))));
        try {
            int i6 = 1;
            if (Integer.parseInt(strYd) != 0) {
                i4 = (1098402199 ^ 320464912) ^ 1382130048;
                str = strYd;
                i2 = 1;
                i3 = 1;
            } else {
                short sXd = (short) (OY.Xd() ^ ((1684149010 ^ 1734932586) ^ 51020645));
                short sXd2 = (short) (OY.Xd() ^ ((1756768794 ^ 181411097) ^ 1650869235));
                int[] iArr = new int["j[".length()];
                QB qb = new QB("j[");
                int i7 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i7] = xuXd.fK(xuXd.CK(iKK) - ((i7 * sXd2) ^ sXd));
                    i7++;
                }
                str = new String(iArr, 0, i7);
                i2 = 252;
                i3 = 4;
                i4 = 15;
            }
            if (i4 != 0) {
                i6 = i3 + i3;
            } else {
                strYd = str;
            }
            if (Integer.parseInt(strYd) != 0) {
                i5 = 0;
            } else {
                i2 += i3 + i6;
                i5 = (789491120 ^ 1036028163) ^ 315499709;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance(BuildConfig.AnonymousClass1.equals(strQd, i2 / (i5 << 2)));
            keyGenerator.init(976470695 ^ 976470543);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return null;
        }
    }

    public static Key generateRandomKeyAes(AesKey aesKey) {
        String strUd;
        int i2;
        int i3;
        int i4;
        short sXd = (short) (FB.Xd() ^ (C1499aX.Xd() ^ (472830165 ^ (-1605748300))));
        short sXd2 = (short) (FB.Xd() ^ (104140157 ^ 104163602));
        int[] iArr = new int[",".length()];
        QB qb = new QB(",");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd2) + sXd)));
            i5++;
        }
        String str = new String(iArr, 0, i5);
        if (aesKey == null) {
            throw new IllegalArgumentException();
        }
        try {
            int i6 = 4;
            int i7 = 1;
            if (Integer.parseInt(str) != 0) {
                i3 = (1061541994 ^ 1172948283) ^ 2058100052;
                strUd = str;
                i2 = 1;
                i4 = 1;
            } else {
                strUd = C1626yg.Ud("\bp", (short) (FB.Xd() ^ (71779773 ^ 71772480)), (short) (FB.Xd() ^ (1273470184 ^ 1273484493)));
                i2 = 80;
                i3 = 14;
                i4 = 4;
            }
            if (i3 != 0) {
                i4 += i4 + i4;
            } else {
                str = strUd;
            }
            if (Integer.parseInt(str) != 0) {
                i6 = i4;
            } else {
                i2 += i4;
                i7 = 389679000 ^ 389679002;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance(CipherHelperImp.AnonymousClass2.concat(i2 / (i6 << i7), Ig.wd("\u0011XE", (short) (C1607wl.Xd() ^ ((1292365758 ^ 1092178159) ^ 203351219)))));
            keyGenerator.init(aesKey.getKeySize().intValue());
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return null;
        }
    }

    private static KeyPair generateRsaKeyPair(int i2) throws Throwable {
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String strOd = EO.Od("'", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (529291755 ^ (-772106619)))));
        String strQd = C1561oA.Qd("BA/", (short) (FB.Xd() ^ ((2142590809 ^ 2046032278) ^ 105303745)));
        try {
            int i10 = Integer.parseInt(strOd);
            String strZd = C1593ug.zd("h", (short) (C1499aX.Xd() ^ ((1714213189 ^ 1239773849) ^ (-801757943))), (short) (C1499aX.Xd() ^ (1110918330 ^ (-1110930595))));
            if (i10 != 0) {
                i4 = (2145676488 ^ 1136155200) ^ 1012676231;
                str = strOd;
                i3 = 1;
            } else {
                i3 = 22;
                i4 = 12;
                str = strZd;
            }
            if (i4 != 0) {
                i6 = i3 + i3;
                i5 = 0;
                str = strOd;
            } else {
                i5 = i4 + 4;
                i6 = 1;
            }
            if (Integer.parseInt(str) != 0) {
                i8 = i5 + 9;
                i9 = 1;
                i7 = 1;
                strZd = str;
            } else {
                i7 = i3 + i6 + 11;
                i8 = i5 + 11;
                i9 = 851826754 ^ 851826753;
            }
            if (i8 != 0) {
                i7 += i9 + i9;
            } else {
                strOd = strZd;
            }
            String strEquals = BuildConfig.AnonymousClass1.equals(strQd, i7 / (Integer.parseInt(strOd) == 0 ? (2016568820 ^ 2043467586) ^ 33469112 : 1));
            Class<?> cls = Class.forName(C1561oA.od("KAU?\u000bO@=NJ@JN\u0002\u001e7J 07?\u001308.:(:46", (short) (Od.Xd() ^ ((1982013929 ^ 451098414) ^ (-1824546276)))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Kd("]UkW%dZhb*Prqioi", (short) (FB.Xd() ^ (937445 ^ 922371))));
            Object[] objArr = {strEquals};
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("]H\u000fiF\"\f03\u0010H", (short) (C1499aX.Xd() ^ (180892928 ^ (-180894373))), (short) (C1499aX.Xd() ^ ((423135226 ^ 1502677362) ^ (-1084854359)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                short sXd = (short) (ZN.Xd() ^ ((1948027163 ^ 546791497) ^ 1418439296));
                int[] iArr = new int["\t\u0001\u0017\u0003P\u0017\n\t\u001c\u001a\u0012\u001e$Y\u007f\u0013\u0012%#\u0017\u0005\u0015#\u001a&%".length()];
                QB qb = new QB("\t\u0001\u0017\u0003P\u0017\n\t\u001c\u001a\u0012\u001e$Y\u007f\u0013\u0012%#\u0017\u0005\u0015#\u001a&%");
                int i11 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i11] = xuXd.fK(xuXd.CK(iKK) - (sXd + i11));
                    i11++;
                }
                Object[] objArr2 = new Object[0];
                Constructor<?> constructor = Class.forName(new String(iArr, 0, i11)).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    Object objNewInstance = constructor.newInstance(objArr2);
                    Class<?> cls2 = Class.forName(Wg.vd("\u000b\u0001\u0019\u0003R\u0017\f\t\u000e\n\u0004\u000e\u0016Ii\u0003\n_sz\u0007Z{\u0004myk}{}", (short) (C1607wl.Xd() ^ ((1430693938 ^ 1084534336) ^ 367134990))));
                    Class<?>[] clsArr2 = new Class[(587395088 ^ 1581332339) ^ 2101593953];
                    clsArr2[0] = Integer.TYPE;
                    clsArr2[1] = Class.forName(Qg.kd("4*>(s8)&73)37j\u000f \u001d.*\u001c\b\u0016\"\u0017!\u001e", (short) (ZN.Xd() ^ ((184893741 ^ 676334025) ^ 592803107)), (short) (ZN.Xd() ^ ((563800856 ^ 2131565891) ^ 1587000101))));
                    Object[] objArr3 = new Object[1826816201 ^ 1826816203];
                    objArr3[0] = Integer.valueOf(i2);
                    objArr3[1] = objNewInstance;
                    Method method = cls2.getMethod(hg.Vd(">B<F:1;7G1", (short) (FB.Xd() ^ (1890149801 ^ 1890136110)), (short) (FB.Xd() ^ ((1400227370 ^ 346794233) ^ 1205733010))), clsArr2);
                    try {
                        method.setAccessible(true);
                        method.invoke(keyPairGenerator, objArr3);
                        Object[] objArr4 = new Object[0];
                        Method method2 = Class.forName(C1561oA.ud("B8L6\u0002F74EA7AEx\u0015.A\u0017'.6\n'/%1\u001f1+-", (short) (OY.Xd() ^ ((1385572958 ^ 475690190) ^ 1322022296)))).getMethod(C1561oA.yd("'&0(.\u001e2$\u0013.C\u001b%.8", (short) (OY.Xd() ^ ((1955917855 ^ 173368643) ^ 2126629024))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            return (KeyPair) method2.invoke(keyPairGenerator, objArr4);
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
        } catch (NoSuchAlgorithmException e6) {
            VsshLogger.logError(TAG, e6.getMessage(), e6);
            return null;
        }
    }

    public static KeyPair generateRsaKeyPair(RsaOaepKey rsaOaepKey) {
        try {
            if (rsaOaepKey != null) {
                return generateRsaKeyPair(rsaOaepKey.getKeySize());
            }
            throw new IllegalArgumentException();
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static KeyPair generateRsaKeyPair(RsaPkcs1Key rsaPkcs1Key) {
        try {
            if (rsaPkcs1Key != null) {
                return generateRsaKeyPair(rsaPkcs1Key.getKeySize());
            }
            throw new IllegalArgumentException();
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static String getFingerPrint(Context context) throws Throwable {
        String string;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int iNextInt;
        int i7;
        String str2;
        int i8;
        String strValueOf;
        StringBuilder sbAppend;
        int i9;
        String string2;
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        String strYd = C1561oA.Yd("^", (short) (OY.Xd() ^ ((554734663 ^ 1898216844) ^ 1345643331)));
        int i10 = Integer.parseInt(strYd);
        short sXd = (short) (C1633zX.Xd() ^ ((927789932 ^ 1817265629) ^ (-1528674550)));
        short sXd2 = (short) (C1633zX.Xd() ^ ((813948282 ^ 1141413980) ^ (-1955268107)));
        int[] iArr = new int["E]O\u0006P\u000b\u001e\u000f\u0012^e[Mg\\\u000f\u0012+p'XYfgj#6'9.Qob".length()];
        QB qb = new QB("E]O\u0006P\u000b\u001e\u000f\u0012^e[Mg\\\u000f\u0012+p'XYfgj#6'9.Qob");
        int i11 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i11] = xuXd.fK((xuXd.CK(iKK) - (sXd + i11)) + sXd2);
            i11++;
        }
        String str3 = new String(iArr, 0, i11);
        int iXd = FB.Xd() ^ (1557160904 ^ 54463742);
        if (i10 != 0) {
            sharedPreferences = null;
            string = null;
        } else {
            string = sharedPreferences.getString(CipherHelperImp.AnonymousClass2.concat(iXd, str3), "");
        }
        boolean zEquals = string.equals("");
        int i12 = 15;
        String strWd = Jg.Wd("~=", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (310056513 ^ (-603067075)))), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951497427))));
        int i13 = 0;
        int i14 = 1;
        if (zEquals) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(ZO.xd("\u0015`.V^>\fH\n3Zl\u0019\u0010 U32\u001dM\"\u001fV\rI_", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1575002855 ^ 1818862123))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134237167)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
                if (Integer.parseInt(strYd) != 0) {
                    str2 = strYd;
                    i7 = 15;
                    iNextInt = 1;
                } else {
                    iNextInt = secureRandom.nextInt();
                    i7 = iXd;
                    str2 = strWd;
                }
                if (i7 != 0) {
                    strValueOf = String.valueOf(iNextInt);
                    sbAppend = new StringBuilder();
                    str2 = strYd;
                    i8 = 0;
                } else {
                    i8 = i7 + 11;
                    strValueOf = null;
                    sbAppend = null;
                }
                if (Integer.parseInt(str2) != 0) {
                    i9 = i8 + 11;
                    int i15 = (814705655 ^ 814705623) / 11;
                } else {
                    sbAppend = sbAppend.append(Calendar.getInstance().getTimeInMillis());
                    i9 = i8 + 10;
                    str2 = strWd;
                }
                if (i9 != 0) {
                    string2 = sbAppend.append(strValueOf).toString();
                    str2 = strYd;
                } else {
                    string2 = null;
                }
                if (Integer.parseInt(str2) != 0) {
                    editorEdit = null;
                    string = null;
                } else {
                    string = generateHash(string2);
                    editorEdit = sharedPreferences.edit();
                }
                editorEdit.putString(CipherHelperImp.AnonymousClass2.concat(iXd, str3), string);
                editorEdit.apply();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(C1626yg.Ud("D\u001c$!Ql\u0004?.D\u007f!\u001e\u0017\nj}]Y*\u000e@E", (short) (C1633zX.Xd() ^ ((348248091 ^ 1799661149) ^ (-2139445185))), (short) (C1633zX.Xd() ^ ((1559641693 ^ 843756897) ^ (-1857866517))))).getMethod(Ig.wd("\u00011<d\u000eh\r\u000ba5<i(2/S|\u0010", (short) (C1633zX.Xd() ^ (199521619 ^ (-199491602)))), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr2);
            if (Integer.parseInt(strYd) != 0) {
                i12 = (1158049685 ^ 419042550) ^ 1576827758;
                str = strYd;
                i2 = 0;
                i3 = 0;
            } else {
                i2 = 22;
                i3 = 22;
                str = strWd;
            }
            int i16 = 4;
            if (i12 != 0) {
                i5 = i3 + i2 + i2;
                str = strYd;
                i4 = 4;
            } else {
                i13 = i12 + 5;
                i4 = 1;
                i5 = 1;
            }
            if (Integer.parseInt(str) != 0) {
                i6 = i13 + 7;
                strWd = str;
            } else {
                i5 += i4 + i4;
                i6 = i13 + 14;
            }
            if (i6 != 0) {
                i14 = 4;
            } else {
                strYd = strWd;
                i16 = 1;
            }
            if (Integer.parseInt(strYd) == 0) {
                i5 /= i16 + (i14 + i16);
            }
            String string3 = Settings.Secure.getString(contentResolver, CipherHelperImp.AnonymousClass2.concat(i5, EO.Od(")\b@@oX|)`W", (short) (FB.Xd() ^ (1041188315 ^ 1041174528)))));
            if (string == null) {
                return null;
            }
            return string3.concat(C1561oA.Qd("#", (short) (FB.Xd() ^ ((2017761264 ^ 1192893159) ^ 1063169928)))).concat(string);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static PrivateKey getPrivateKeyFromString(String str, String str2) throws IOException {
        Object object;
        String strOd;
        int i2;
        int i3;
        JcePEMDecryptorProviderBuilder jcePEMDecryptorProviderBuilder;
        PEMDecryptorProvider pEMDecryptorProviderBuild;
        int i4;
        JcaPEMKeyConverter jcaPEMKeyConverter;
        KeyPair keyPair;
        int iXd = FB.Xd() ^ (-1609512755);
        int iXd2 = C1607wl.Xd() ^ (698743851 ^ (-1205963789));
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int["9".length()];
        QB qb = new QB("9");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
            i5++;
        }
        String str3 = new String(iArr, 0, i5);
        if (str2 == null) {
            str2 = "";
        }
        if (str != null) {
            try {
                PEMParser pEMParser = new PEMParser(new StringReader(str));
                int i6 = 78625289 ^ 78625284;
                if (Integer.parseInt(str3) != 0) {
                    strOd = str3;
                    object = null;
                    i2 = 5;
                } else {
                    object = pEMParser.readObject();
                    strOd = C1561oA.od("^", (short) (C1580rY.Xd() ^ ((250435938 ^ 1369103373) ^ (-1601673200))));
                    i2 = i6;
                }
                if (i2 != 0) {
                    jcePEMDecryptorProviderBuilder = new JcePEMDecryptorProviderBuilder();
                    i3 = 0;
                } else {
                    i3 = 5 + i2;
                    object = null;
                    str3 = strOd;
                    jcePEMDecryptorProviderBuilder = null;
                }
                if (Integer.parseInt(str3) != 0) {
                    i4 = i3 + i6;
                    pEMDecryptorProviderBuild = null;
                } else {
                    pEMDecryptorProviderBuild = jcePEMDecryptorProviderBuilder.build(str2.toCharArray());
                    i4 = i3 + 7;
                }
                if (i4 != 0) {
                    jcaPEMKeyConverter = new JcaPEMKeyConverter();
                } else {
                    pEMDecryptorProviderBuild = null;
                    jcaPEMKeyConverter = null;
                }
                keyPair = jcaPEMKeyConverter.getKeyPair(object instanceof PEMEncryptedKeyPair ? ((PEMEncryptedKeyPair) object).decryptKeyPair(pEMDecryptorProviderBuild) : (PEMKeyPair) object);
            } catch (PEMException e2) {
                VsshLogger.logError(TAG, e2.getMessage(), e2);
                return null;
            }
        } else {
            keyPair = null;
        }
        if (keyPair == null) {
            return null;
        }
        return keyPair.getPrivate();
    }

    public static PublicKey getPublicKeyFromString(String str) throws IOException {
        Object object;
        int i2;
        JcaPEMKeyConverter jcaPEMKeyConverter;
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        PublicKey publicKey = null;
        if (str != null && !str.isEmpty()) {
            try {
                PEMParser pEMParser = new PEMParser(new StringReader(str));
                if (Integer.parseInt(C1561oA.Kd(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, (short) (Od.Xd() ^ ((665727578 ^ 2127496292) ^ (-1499541917))))) != 0) {
                    i2 = (272736709 ^ 1407461021) ^ 1134921555;
                    object = null;
                } else {
                    object = pEMParser.readObject();
                    i2 = 6;
                }
                if (i2 != 0) {
                    jcaPEMKeyConverter = new JcaPEMKeyConverter();
                } else {
                    jcaPEMKeyConverter = null;
                    object = null;
                }
                if (object instanceof SubjectPublicKeyInfo) {
                    subjectPublicKeyInfo = (SubjectPublicKeyInfo) object;
                } else {
                    if (!(object instanceof X509CertificateHolder)) {
                        return null;
                    }
                    subjectPublicKeyInfo = ((X509CertificateHolder) object).getSubjectPublicKeyInfo();
                }
                publicKey = jcaPEMKeyConverter.getPublicKey(subjectPublicKeyInfo);
                return publicKey;
            } catch (IllegalArgumentException | PEMException e2) {
                VsshLogger.logError(TAG, e2.getMessage(), e2);
            }
        }
        return publicKey;
    }

    private static SharedPreferences getSharedPreferences(Context context) throws Throwable {
        try {
            String strConcat = CipherHelperImp.AnonymousClass2.concat(575841624 ^ 575841626, Wg.Zd("YuKc&HED!EH.\u0018\u0012h\u0013m\u0005\f4\u007fjEB=9D4\u0013\u00065\u0012v\u0014z\b\u0002", (short) (Od.Xd() ^ (1001060385 ^ (-1001051635))), (short) (Od.Xd() ^ (722117062 ^ (-722126821)))));
            Class<?> cls = Class.forName(C1561oA.Xd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (C1607wl.Xd() ^ (1332815035 ^ 1332830926))));
            Class<?>[] clsArr = new Class[(139278813 ^ 1762015733) ^ 1632305194];
            short sXd = (short) (Od.Xd() ^ ((1099040436 ^ 920661130) ^ (-2002941813)));
            int[] iArr = new int["\u001c\u0012&\u0010[\u0019\r\u0019\u0011Vz\u001b\u0018\u000e\u0012\n".length()];
            QB qb = new QB("\u001c\u0012&\u0010[\u0019\r\u0019\u0011Vz\u001b\u0018\u000e\u0012\n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = new Object[(704934902 ^ 669838967) ^ 233348483];
            objArr[0] = strConcat;
            objArr[1] = 0;
            Method method = cls.getMethod(Qg.kd("vs\u0002_sk{mkVwiigsemabo", (short) (FB.Xd() ^ (619332428 ^ 619331756)), (short) (FB.Xd() ^ (508955598 ^ 508980194))), clsArr);
            try {
                method.setAccessible(true);
                return (SharedPreferences) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static String getStringFromPrivateKey(PrivateKey privateKey) throws IOException {
        PemWriter pemWriter;
        int iXd;
        PemWriter pemWriter2 = null;
        if (privateKey == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        short sXd = (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (1932526174 ^ (-494148014))));
        short sXd2 = (short) (C1633zX.Xd() ^ ((757939455 ^ 1738036463) ^ (-1253381819)));
        int[] iArr = new int["e".length()];
        QB qb = new QB("e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        if (Integer.parseInt(new String(iArr, 0, i2)) != 0) {
            iXd = C1633zX.Xd() ^ (396898169 ^ (-1677282116));
            stringWriter = null;
            pemWriter = null;
        } else {
            pemWriter = new PemWriter(stringWriter);
            iXd = 12;
        }
        if (iXd != 0) {
            int iXd2 = C1499aX.Xd() ^ (1362219910 ^ (-313177236));
            short sXd3 = (short) (FB.Xd() ^ (605592206 ^ 605595549));
            int[] iArr2 = new int["\u0012\u007f\u0001\u0010\u0011QD\u00166J\u0001".length()];
            QB qb2 = new QB("\u0012\u007f\u0001\u0010\u0011QD\u00166J\u0001");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            pemWriter.writeObject(new PemObject(CipherHelperImp.AnonymousClass2.concat(iXd2, new String(iArr2, 0, i3)), privateKey.getEncoded()));
            pemWriter2 = pemWriter;
        }
        pemWriter2.flush();
        pemWriter2.close();
        return stringWriter.toString();
    }

    public static String getStringFromPublicKey(PublicKey publicKey) throws IOException {
        PemWriter pemWriter;
        int i2;
        PemWriter pemWriter2 = null;
        if (publicKey == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        if (Integer.parseInt(C1561oA.yd("u", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951465656))))) != 0) {
            i2 = (358756487 ^ 1962525682) ^ 1637610364;
            stringWriter = null;
            pemWriter = null;
        } else {
            pemWriter = new PemWriter(stringWriter);
            i2 = 6;
        }
        if (i2 != 0) {
            pemWriter.writeObject(new PemObject(CipherHelperImp.AnonymousClass2.concat(1, C1561oA.Yd("\u001f(-\u00150ŋCicc", (short) (FB.Xd() ^ ((1118494601 ^ 2094445012) ^ 1048334627)))), publicKey.getEncoded()));
            pemWriter2 = pemWriter;
        }
        pemWriter2.flush();
        pemWriter2.close();
        return stringWriter.toString();
    }

    public static byte[] signData(byte[] bArr, PrivateKey privateKey) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Signature signature;
        String strQd = Xg.qd(Global.QUESTION, (short) (C1633zX.Xd() ^ (34626216 ^ (-34611567))), (short) (C1633zX.Xd() ^ ((1708632198 ^ 1610101653) ^ (-976192130))));
        int i8 = 0;
        byte[] bArrSign = new byte[0];
        String strWd = Jg.Wd("\u0019nO%H*6E*\u0010T/.\u0006\"xU;$\u0003oN;", (short) (Od.Xd() ^ (65506723 ^ (-65529805))), (short) (Od.Xd() ^ (375159827 ^ (-375150430))));
        try {
            int i9 = Integer.parseInt(strQd);
            int i10 = 5;
            short sXd = (short) (ZN.Xd() ^ ((1536788906 ^ 34376946) ^ 1502965956));
            short sXd2 = (short) (ZN.Xd() ^ ((1592383338 ^ 2079932171) ^ 621865984));
            int[] iArr = new int["6p".length()];
            QB qb = new QB("6p");
            int i11 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i11] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((i11 * sXd2) + sXd)));
                i11++;
            }
            String str2 = new String(iArr, 0, i11);
            int i12 = 1;
            if (i9 != 0) {
                str = strQd;
                i2 = 1;
            } else {
                i2 = 1666592731 ^ 1666592717;
                i10 = 1781146198 ^ 1781146200;
                str = str2;
            }
            int i13 = 2;
            if (i10 != 0) {
                str = strQd;
                i3 = 0;
                i4 = 11;
            } else {
                i3 = i10 + 11;
                i4 = 0;
                i2 = 1;
                i13 = 1;
            }
            if (Integer.parseInt(str) != 0) {
                i5 = i3 + 8;
                i6 = 1;
            } else {
                i2 += i4 << i13;
                i5 = i3 + 10;
                i6 = 798448017 ^ 798448021;
                str = str2;
            }
            if (i5 != 0) {
                i2 += i6 << 2;
                str = strQd;
            } else {
                i8 = i5 + 5;
            }
            if (Integer.parseInt(str) != 0) {
                i7 = i8 + 11;
                str2 = str;
            } else {
                i7 = i8 + 6;
                i12 = 1162219761 ^ 1162219741;
            }
            Signature signature2 = null;
            if (i7 != 0) {
                signature = Signature.getInstance(BuildConfig.AnonymousClass1.equals(strWd, i2 / i12));
            } else {
                signature = null;
                strQd = str2;
            }
            if (Integer.parseInt(strQd) == 0) {
                signature.initSign(privateKey);
                signature2 = signature;
            }
            signature2.update(bArr);
            bArrSign = signature2.sign();
            return bArrSign;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return bArrSign;
        }
    }

    public static boolean verifySignature(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        Signature signature;
        int i8;
        String strUd = C1626yg.Ud("D", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69956775)), (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69937235)));
        boolean zVerify = false;
        String strWd = Ig.wd("a-3Ja\u000b\u0017\u0010\u000fO,H\u0001}\u001c;Lj&vN/Q", (short) (Od.Xd() ^ (1688824953 ^ (-1688822253))));
        try {
            int i9 = Integer.parseInt(strUd);
            String strOd = EO.Od("h\u001d", (short) (ZN.Xd() ^ ((1318636465 ^ 1679055926) ^ 713857461)));
            int i10 = 1;
            if (i9 != 0) {
                str = strUd;
                i2 = 1;
                i4 = 1;
                i3 = 4;
            } else {
                i2 = 650052309 ^ 650052213;
                i3 = (581379442 ^ 1096523721) ^ 1677507253;
                str = strOd;
                i4 = 4;
            }
            if (i3 != 0) {
                i2 += i4 << 2;
                str = strUd;
                i5 = 0;
            } else {
                i5 = i3 + 7;
            }
            if (Integer.parseInt(str) != 0) {
                i6 = i5 + 15;
                strOd = str;
            } else {
                i6 = i5 + 8;
                i10 = 1561566389 ^ 1561566357;
            }
            Signature signature2 = null;
            if (i6 != 0) {
                signature = Signature.getInstance(BuildConfig.AnonymousClass1.equals(strWd, i2 / i10));
                i7 = 0;
            } else {
                i7 = i6 + 9;
                strUd = strOd;
                signature = null;
            }
            if (Integer.parseInt(strUd) != 0) {
                i8 = i7 + 4;
            } else {
                signature.initVerify(publicKey);
                i8 = i7 + 9;
                signature2 = signature;
            }
            if (i8 != 0) {
                signature2.update(bArr);
            }
            zVerify = signature2.verify(bArr2);
            return zVerify;
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return zVerify;
        }
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
            }
            return bArr3;
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }
}
