package com.google.crypto.tink.integration.android;

import com.google.crypto.tink.Aead;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
public final class AndroidKeystoreAesGcm implements Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final String TAG = "AndroidKeystoreAesGcm";
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final SecretKey key;

    public AndroidKeystoreAesGcm(String keyId) throws Throwable {
        String strVd = Wg.vd("\f8-:6/)\u000f(;\u00144.0\"", (short) (FB.Xd() ^ 30131));
        Class<?> cls = Class.forName(Qg.kd("UK_I\u0015YJGXTJTX\f(AT-MGI;", (short) (ZN.Xd() ^ 18417), (short) (ZN.Xd() ^ 12467)));
        Class<?>[] clsArr = {Class.forName(hg.Vd("7-A+v4(4,q\u001663)-%", (short) (C1499aX.Xd() ^ (-18186)), (short) (C1499aX.Xd() ^ (-3220))))};
        Object[] objArr = {strVd};
        short sXd = (short) (FB.Xd() ^ 13256);
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
            KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {null};
            Method method = Class.forName(C1561oA.yd(",$6\"k2! ?=1=?t\u000f*+\u0006$  \u0014", (short) (C1580rY.Xd() ^ (-24777)))).getMethod(Xg.qd(":>15", (short) (C1580rY.Xd() ^ (-3316)), (short) (C1580rY.Xd() ^ (-25341))), Class.forName(C1561oA.Yd("\u001b\u0013)\u0015b)\u001c\u001b.,$06k\n%:\u0015737+j\u00148+/\u001fA=A5!3E5B;K=K", (short) (C1633zX.Xd() ^ (-17532)))));
            try {
                method.setAccessible(true);
                method.invoke(keyStore, objArr2);
                Object[] objArr3 = {keyId, null};
                Method method2 = Class.forName(Jg.Wd("P\b+\u0018pH8Fhcl\u0006K\u0010;UwS\u0003\u000e\u0011\u0012", (short) (ZN.Xd() ^ 3470), (short) (ZN.Xd() ^ 4196))).getMethod(C1626yg.Ud("\u0002N\u001cC\u0007'", (short) (Od.Xd() ^ (-24356)), (short) (Od.Xd() ^ (-550))), Class.forName(ZO.xd("V)coMMWw\f,DM\tq7y", (short) (C1580rY.Xd() ^ (-31638)), (short) (C1580rY.Xd() ^ (-7267)))), char[].class);
                try {
                    method2.setAccessible(true);
                    SecretKey secretKey = (SecretKey) ((Key) method2.invoke(keyStore, objArr3));
                    this.key = secretKey;
                    if (secretKey == null) {
                        throw new InvalidKeyException(Ig.wd("(\nkYR\t\u001cN2ia4\u0006\u0015\u0012\u001fC,e|q\u0012_\\t(\u0004\u0004N6>i\bc\u0014OYe", (short) (OY.Xd() ^ 29197)) + keyId);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    AndroidKeystoreAesGcm(String keyId, KeyStore keyStore) throws Throwable {
        Class<?> cls = Class.forName(EO.Od("8\bj2&\u00102P\u0019voXHr\u00048\u0019\\V}7n", (short) (C1633zX.Xd() ^ (-29535))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-5052));
        int[] iArr = new int["MCWA\rJ>JB\b,LI?C;".length()];
        QB qb = new QB("MCWA\rJ>JB\b,LI?C;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = char[].class;
        Object[] objArr = {keyId, null};
        short sXd2 = (short) (ZN.Xd() ^ 20075);
        short sXd3 = (short) (ZN.Xd() ^ 18058);
        int[] iArr2 = new int["RQa9Ti".length()];
        QB qb2 = new QB("RQa9Ti");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SecretKey secretKey = (SecretKey) ((Key) method.invoke(keyStore, objArr));
            this.key = secretKey;
            if (secretKey == null) {
                throw new InvalidKeyException(C1561oA.od("l\u0006\u0019\u0012\u0012\f\u000e\u007f9{x\u0005\u0004\u0004\b2}\u007fpr-\u0001so)sl\u007f%{lvi HB7\u001c", (short) (C1607wl.Xd() ^ 24979)) + keyId);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private byte[] decryptInternal(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, ciphertext, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.key, gCMParameterSpec);
        cipher.updateAAD(associatedData);
        return cipher.doFinal(ciphertext, 12, ciphertext.length - 12);
    }

    private byte[] encryptInternal(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr = new byte[plaintext.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.key);
        cipher.updateAAD(associatedData);
        cipher.doFinal(plaintext, 0, plaintext.length, bArr, 12);
        System.arraycopy(cipher.getIV(), 0, bArr, 0, 12);
        return bArr;
    }

    private static void sleepRandomAmount() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return decryptInternal(ciphertext, associatedData);
        } catch (ProviderException e2) {
            String str = TAG;
            sleepRandomAmount();
            return decryptInternal(ciphertext, associatedData);
        } catch (AEADBadTagException e3) {
            throw e3;
        } catch (GeneralSecurityException e4) {
            String str2 = TAG;
            sleepRandomAmount();
            return decryptInternal(ciphertext, associatedData);
        }
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        try {
            return encryptInternal(plaintext, associatedData);
        } catch (GeneralSecurityException | ProviderException e2) {
            String str = TAG;
            sleepRandomAmount();
            return encryptInternal(plaintext, associatedData);
        }
    }
}
