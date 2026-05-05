package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECPoint;
import org.spongycastle.bcpg.ECDHPublicBCPGKey;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.operator.PGPPad;
import org.spongycastle.openpgp.operator.PublicKeyKeyEncryptionMethodGenerator;
import org.spongycastle.openpgp.operator.RFC6637Utils;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JcePublicKeyKeyEncryptionMethodGenerator extends PublicKeyKeyEncryptionMethodGenerator {
    private JcaPGPDigestCalculatorProviderBuilder digestCalculatorProviderBuilder;
    private OperatorHelper helper;
    private JcaPGPKeyConverter keyConverter;
    private SecureRandom random;

    public JcePublicKeyKeyEncryptionMethodGenerator(PGPPublicKey pGPPublicKey) {
        super(pGPPublicKey);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.keyConverter = new JcaPGPKeyConverter();
        this.digestCalculatorProviderBuilder = new JcaPGPDigestCalculatorProviderBuilder();
    }

    @Override // org.spongycastle.openpgp.operator.PublicKeyKeyEncryptionMethodGenerator
    protected byte[] encryptSessionInfo(PGPPublicKey pGPPublicKey, byte[] bArr) throws Throwable {
        String strVd = hg.Vd("JG", (short) (FB.Xd() ^ 677), (short) (FB.Xd() ^ 7824));
        try {
            if (pGPPublicKey.getAlgorithm() != 18) {
                Cipher cipherCreatePublicKeyCipher = this.helper.createPublicKeyCipher(pGPPublicKey.getAlgorithm());
                cipherCreatePublicKeyCipher.init(1, this.keyConverter.getPublicKey(pGPPublicKey), this.random);
                return cipherCreatePublicKeyCipher.doFinal(bArr);
            }
            ECDHPublicBCPGKey eCDHPublicBCPGKey = (ECDHPublicBCPGKey) pGPPublicKey.getPublicKeyPacket().getKey();
            X9ECParameters x9Parameters = PGPUtil.getX9Parameters(eCDHPublicBCPGKey.getCurveOID());
            AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(strVd);
            algorithmParametersCreateAlgorithmParameters.init(new X962Parameters(eCDHPublicBCPGKey.getCurveOID()).getEncoded());
            KeyPairGenerator keyPairGeneratorCreateKeyPairGenerator = this.helper.createKeyPairGenerator(strVd);
            AlgorithmParameterSpec parameterSpec = algorithmParametersCreateAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class);
            Class<?> cls = Class.forName(C1561oA.ud(":0D.y>/,=9/9=p\r&9\u000f\u001f&.\u0002\u001f'\u001d)\u0017)#%", (short) (C1607wl.Xd() ^ 24851)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.yd("QG_I\u0011UJGTPJTT\bPL<9\u0007\u0019?9DF8B9=\u001b+?-tk}muUuib", (short) (Od.Xd() ^ (-28536))));
            Object[] objArr = {parameterSpec};
            Method method = cls.getMethod(C1561oA.Yd("\u0012\u0018\u0014 \u0016\u000f\u001b\u0019+\u0017", (short) (OY.Xd() ^ 15775)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(keyPairGeneratorCreateKeyPairGenerator, objArr);
                Class<?> cls2 = Class.forName(Xg.qd("\u0016\u000e$\u0010]$\u0017\u0016)'\u001f+1f\u0005 5\r\u001f(2\b'1)7';7;", (short) (C1633zX.Xd() ^ (-18249)), (short) (C1633zX.Xd() ^ (-31209))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (OY.Xd() ^ 23389);
                short sXd2 = (short) (OY.Xd() ^ 18936);
                int[] iArr = new int["E0*\u000e\u001dx|Z@GL\u0010#\u0018\u0012".length()];
                QB qb = new QB("E0*\u000e\u001dx|Z@GL\u0010#\u0018\u0012");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Method method2 = cls2.getMethod(new String(iArr, 0, i2), clsArr2);
                try {
                    method2.setAccessible(true);
                    KeyPair keyPair = (KeyPair) method2.invoke(keyPairGeneratorCreateKeyPairGenerator, objArr2);
                    KeyAgreement keyAgreementCreateKeyAgreement = this.helper.createKeyAgreement(RFC6637Utils.getAgreementAlgorithm(pGPPublicKey.getPublicKeyPacket()));
                    keyAgreementCreateKeyAgreement.init(keyPair.getPrivate(), new UserKeyingMaterialSpec(RFC6637Utils.createUserKeyingMaterial(pGPPublicKey.getPublicKeyPacket(), new JcaKeyFingerprintCalculator())));
                    keyAgreementCreateKeyAgreement.doPhase(this.keyConverter.getPublicKey(pGPPublicKey), true);
                    SecretKey secretKeyGenerateSecret = keyAgreementCreateKeyAgreement.generateSecret(RFC6637Utils.getKeyEncryptionOID(eCDHPublicBCPGKey.getSymmetricKeyAlgorithm()).getId());
                    Cipher cipherCreateKeyWrapper = this.helper.createKeyWrapper(eCDHPublicBCPGKey.getSymmetricKeyAlgorithm());
                    cipherCreateKeyWrapper.init(3, secretKeyGenerateSecret, this.random);
                    byte[] bArrWrap = cipherCreateKeyWrapper.wrap(new SecretKeySpec(PGPPad.padSessionData(bArr), PGPUtil.getSymmetricCipherName(bArr[0])));
                    byte[] encoded = new MPInteger(new BigInteger(1, new X9ECPoint(x9Parameters.getCurve(), SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()).getPublicKeyData().getBytes()).getPoint().getEncoded(false))).getEncoded();
                    byte[] bArr2 = new byte[encoded.length + 1 + bArrWrap.length];
                    System.arraycopy(encoded, 0, bArr2, 0, encoded.length);
                    bArr2[encoded.length] = (byte) bArrWrap.length;
                    System.arraycopy(bArrWrap, 0, bArr2, encoded.length + 1, bArrWrap.length);
                    return bArr2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IOException e4) {
            throw new PGPException(C1626yg.Ud("5rm\u0002\u0004.\u001c)tN`*a\u0015\u001a_r]\u0004\u000bOS", (short) (C1580rY.Xd() ^ (-21633)), (short) (C1580rY.Xd() ^ (-8965))) + e4.getMessage(), e4);
        } catch (InvalidKeyException e5) {
            short sXd3 = (short) (C1633zX.Xd() ^ (-11745));
            int[] iArr2 = new int["T|C\u0001:\u001bv9\u000e\u0016\u000f\u000b\u0006".length()];
            QB qb2 = new QB("T|C\u0001:\u001bv9\u000e\u0016\u000f\u000b\u0006");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            throw new PGPException(new String(iArr2, 0, i3) + e5.getMessage(), e5);
        } catch (BadPaddingException e6) {
            throw new PGPException(EO.Od("R~u\u000fA\u007f\r>nun\u001d2", (short) (OY.Xd() ^ 2413)) + e6.getMessage(), e6);
        } catch (IllegalBlockSizeException e7) {
            throw new PGPException(C1561oA.Qd("OQPHIBL~@IK>ExK@P:\u000er", (short) (ZN.Xd() ^ 23447)) + e7.getMessage(), e7);
        } catch (GeneralSecurityException e8) {
            short sXd4 = (short) (Od.Xd() ^ (-3147));
            short sXd5 = (short) (Od.Xd() ^ (-25546));
            int[] iArr3 = new int["'j\u0018u3neX2\u0003&qF\u0006\u0005O4 _oyhOa\u0015#df\u0015\u0007Tiz".length()];
            QB qb3 = new QB("'j\u0018u3neX2\u0003&qF\u0006\u0005O4 _oyhOa\u0015#df\u0015\u0007Tiz");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                i4++;
            }
            throw new PGPException(new String(iArr3, 0, i4) + e8.getMessage(), e8);
        }
    }

    public JcePublicKeyKeyEncryptionMethodGenerator setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        this.keyConverter.setProvider(str);
        return this;
    }

    public JcePublicKeyKeyEncryptionMethodGenerator setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        this.keyConverter.setProvider(provider);
        return this;
    }

    public JcePublicKeyKeyEncryptionMethodGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
