package com.valid.security.managers;

import com.google.common.primitives.Bytes;
import com.valid.security.BuildConfig;
import com.valid.security.entities.RsaPkcs1Key;
import com.valid.security.utils.SecurityUtils;
import com.valid.utils.VsshLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ValidSecurityImp implements ValidSecurity {
    private static final String TAG = C1561oA.Qd("\u007f\u000b\bG\u000fx\u0003~xA\u0006vs\u0005\u0001v\u0001\u00058viugliuu/V`jf`N_\\mi_im<_a", (short) (FB.Xd() ^ (ZN.Xd() ^ 864683063)));

    public class Exception extends RuntimeException {
    }

    public ValidSecurityImp() {
        Security.addProvider(new BouncyCastleProvider());
    }

    private static void executeChiperDirectly(byte[] bArr, List<String> list, Cipher cipher) {
        byte[] bArrDoFinal = new byte[0];
        try {
            bArrDoFinal = cipher.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        if (bArrDoFinal != null) {
            list.add(SecurityUtils.getHexStringFromByteArray(bArrDoFinal));
        }
    }

    private static void executeChiperInBlocks(byte[] bArr, List<String> list, Cipher cipher, Integer num) {
        int iIntValue = 0;
        while (iIntValue < bArr.length) {
            int iIntValue2 = num.intValue() + iIntValue;
            if (iIntValue2 > bArr.length) {
                iIntValue2 = bArr.length;
            }
            byte[] bArrDoFinal = new byte[0];
            try {
                bArrDoFinal = cipher.doFinal(Arrays.copyOfRange(bArr, iIntValue, iIntValue2));
            } catch (BadPaddingException | IllegalBlockSizeException e2) {
                VsshLogger.logError(TAG, e2.getMessage(), e2);
            }
            if (bArrDoFinal != null) {
                list.add(SecurityUtils.getHexStringFromByteArray(bArrDoFinal));
            }
            iIntValue += num.intValue();
        }
    }

    private static IvParameterSpec generateInitVector(Cipher cipher) throws Throwable {
        String strKd;
        int i2;
        int i3;
        String strZd = C1593ug.zd("\u0005", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864688175))), (short) (C1580rY.Xd() ^ ((96013032 ^ 1432757576) ^ (-1356796009))));
        byte[] bArr = null;
        String strOd = C1561oA.od("tg^Ji%'0", (short) (C1607wl.Xd() ^ (1888864222 ^ 1888856115)));
        try {
            int i4 = (1353535932 ^ 1747951744) ^ 948105528;
            if (Integer.parseInt(strZd) != 0) {
                strKd = strZd;
                i3 = 1;
                i2 = 1;
            } else {
                strKd = C1561oA.Kd("jl", (short) (C1499aX.Xd() ^ (1608384688 ^ (-1608398421))));
                i2 = 99;
                i3 = i4;
                i4 = 10;
            }
            if (i4 != 0) {
                i2 += i3 + i3;
                strKd = strZd;
            }
            String strEquals = BuildConfig.AnonymousClass1.equals(strOd, i2 / (Integer.parseInt(strKd) == 0 ? (2070355592 ^ 1469527926) ^ 753936858 : 1));
            short sXd = (short) (C1499aX.Xd() ^ (588077785 ^ (-588055215)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((24711511 ^ 175670156) ^ (-184658063)));
            int[] iArr = new int["\u0007y\u0001U\u0018W{ckbK\u0003{*AAq}lM,5vXUM".length()];
            QB qb = new QB("\u0007y\u0001U\u0018W{ckbK\u0003{*AAq}lM,5vXUM");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(((i5 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i5++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i5));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Xd("\\TjV$cYga)Oqphnh", (short) (ZN.Xd() ^ ((1785251906 ^ 301960232) ^ 2073515022))));
            Object[] objArr = {strEquals};
            short sXd3 = (short) (C1499aX.Xd() ^ (1692398859 ^ (-1692380589)));
            int[] iArr2 = new int["30>\u0012>BB.2&'".length()];
            QB qb2 = new QB("30>\u0012>BB.2&'");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK((sXd3 ^ i6) + xuXd2.CK(iKK2));
                i6++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i6), clsArr);
            try {
                declaredMethod.setAccessible(true);
                SecureRandom secureRandom = (SecureRandom) declaredMethod.invoke(null, objArr);
                int blockSize = cipher.getBlockSize();
                if (Integer.parseInt(strZd) == 0) {
                    bArr = new byte[blockSize];
                    Object[] objArr2 = {bArr};
                    Method method = Class.forName(Qg.kd("%\u001b/\u0019d)\u001a\u0017($\u001a$([\u007f\u0011\u000e\u001f\u001b\rx\u0007\u0013\b\u0012\u000f", (short) (FB.Xd() ^ (1923750666 ^ 1923776316)), (short) (FB.Xd() ^ (1126670791 ^ 1126693137)))).getMethod(hg.Vd("ZPb]*`ZJW", (short) (Od.Xd() ^ ((81388222 ^ 2033319650) ^ (-2112378556))), (short) (Od.Xd() ^ (449049508 ^ (-449024384)))), byte[].class);
                    try {
                        method.setAccessible(true);
                        method.invoke(secureRandom, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return new IvParameterSpec(bArr);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (NoSuchAlgorithmException e4) {
            VsshLogger.logError(TAG, e4.getMessage(), e4);
            return null;
        }
    }

    @Override // com.valid.security.managers.ValidSecurity
    public byte[] decryptLargeRsa(List<String> list, Key key, Cipher cipher) {
        byte[] bArrConcat = new byte[0];
        int iXd = OY.Xd() ^ (1712196620 ^ 1646593254);
        try {
            cipher.init(iXd, key);
        } catch (InvalidKeyException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        byte[] bArrDoFinal = new byte[0];
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                bArrDoFinal = cipher.doFinal(SecurityUtils.getByteArrayFromHexString(it.next()));
            } catch (BadPaddingException | IllegalBlockSizeException e3) {
                VsshLogger.logError(TAG, e3.getMessage(), e3);
            }
            byte[][] bArr = new byte[iXd][];
            if (Integer.parseInt(C1561oA.ud("8", (short) (C1607wl.Xd() ^ ((1224168568 ^ 937037254) ^ 2133666386)))) == 0) {
                bArr[0] = bArrConcat;
            }
            bArr[1] = bArrDoFinal;
            bArrConcat = Bytes.concat(bArr);
        }
        return bArrConcat;
    }

    @Override // com.valid.security.managers.ValidSecurity
    public byte[] decryptRsa(byte[] bArr, Key key, Cipher cipher) {
        try {
            cipher.init(ZN.Xd() ^ 864698098, key);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return new byte[0];
        }
    }

    @Override // com.valid.security.managers.ValidSecurity
    public byte[] decryptWithIv(byte[] bArr, Key key, Cipher cipher) {
        byte[] bArrDoFinal;
        byte[] bArrCopyOf = new byte[0];
        short sXd = (short) (FB.Xd() ^ (FB.Xd() ^ 1609522914));
        int[] iArr = new int["Q".length()];
        QB qb = new QB("Q");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        if (Integer.parseInt(new String(iArr, 0, i2)) != 0) {
            bArrDoFinal = null;
        } else {
            bArrDoFinal = bArrCopyOf;
            bArrCopyOf = Arrays.copyOf(bArr, cipher.getBlockSize());
        }
        try {
            cipher.init(ZN.Xd() ^ (750739813 ^ 523591575), key, new IvParameterSpec(bArrCopyOf));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        byte[] bArrCopyOfRange = new byte[0];
        if (bArr.length != 0) {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, cipher.getBlockSize(), bArr.length);
        }
        try {
            bArrDoFinal = cipher.doFinal(bArrCopyOfRange);
            return bArrDoFinal;
        } catch (BadPaddingException | IllegalBlockSizeException e3) {
            VsshLogger.logError(TAG, e3.getMessage(), e3);
            return bArrDoFinal;
        }
    }

    @Override // com.valid.security.managers.ValidSecurity
    public List<String> encryptLargeRsa(byte[] bArr, Key key, Cipher cipher) {
        RsaPkcs1Key rsaPkcs1KeyValueOf = RsaPkcs1Key.valueOf(((RSAKey) key).getModulus().bitLength());
        if (rsaPkcs1KeyValueOf == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            cipher.init(1, key);
        } catch (InvalidKeyException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
        }
        if (bArr.length <= rsaPkcs1KeyValueOf.getMaxDataLength()) {
            executeChiperDirectly(bArr, arrayList, cipher);
        } else {
            executeChiperInBlocks(bArr, arrayList, cipher, Integer.valueOf(rsaPkcs1KeyValueOf.getMaxDataLength()));
        }
        return arrayList;
    }

    @Override // com.valid.security.managers.ValidSecurity
    public byte[] encryptRsa(byte[] bArr, Key key, Cipher cipher) {
        try {
            cipher.init(1, key);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException | BadPaddingException | IllegalBlockSizeException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return new byte[0];
        }
    }

    @Override // com.valid.security.managers.ValidSecurity
    public byte[] encryptWithSymmetricCipher(byte[] bArr, Key key, Cipher cipher) {
        int i2;
        byte[][] bArr2;
        char c2;
        String strYd = C1561oA.Yd(")", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831075645)));
        char c3 = 0;
        byte[] bArr3 = new byte[0];
        try {
            IvParameterSpec ivParameterSpecGenerateInitVector = generateInitVector(cipher);
            byte[] iv = null;
            if (Integer.parseInt(strYd) != 0) {
                ivParameterSpecGenerateInitVector = null;
            } else {
                cipher.init(1, key, ivParameterSpecGenerateInitVector);
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            if (ivParameterSpecGenerateInitVector == null || ivParameterSpecGenerateInitVector.getIV() == null) {
                return bArrDoFinal;
            }
            byte[][] bArr4 = new byte[139497330 ^ 139497328][];
            if (Integer.parseInt(strYd) != 0) {
                i2 = 2062946254 ^ 2062946250;
                bArr2 = null;
                c2 = 1;
            } else {
                iv = ivParameterSpecGenerateInitVector.getIV();
                i2 = 1006317274 ^ 1006317268;
                bArr2 = bArr4;
                c2 = 0;
            }
            if (i2 != 0) {
                bArr2[c2] = iv;
                bArr2 = bArr4;
                c3 = 1;
            }
            bArr2[c3] = bArrDoFinal;
            return Bytes.concat(bArr4);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e2) {
            VsshLogger.logError(TAG, e2.getMessage(), e2);
            return bArr3;
        }
    }
}
