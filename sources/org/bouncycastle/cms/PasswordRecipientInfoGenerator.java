package org.bouncycastle.cms;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.PasswordRecipient;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PasswordRecipientInfoGenerator implements RecipientInfoGenerator {
    private int blockSize;
    private int iterationCount;
    private ASN1ObjectIdentifier kekAlgorithm;
    private AlgorithmIdentifier keyDerivationAlgorithm;
    private int keySize;
    protected char[] password;
    private PasswordRecipient.PRF prf;
    private SecureRandom random;
    private byte[] salt;
    private int schemeID;

    protected PasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        this(aSN1ObjectIdentifier, cArr, getKeySize(aSN1ObjectIdentifier), ((Integer) PasswordRecipientInformation.BLOCKSIZES.get(aSN1ObjectIdentifier)).intValue());
    }

    protected PasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr, int i2, int i3) {
        this.password = cArr;
        this.schemeID = 1;
        this.kekAlgorithm = aSN1ObjectIdentifier;
        this.keySize = i2;
        this.blockSize = i3;
        this.prf = PasswordRecipient.PRF.HMacSHA1;
        this.iterationCount = 1024;
    }

    private static int getKeySize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Integer num = (Integer) PasswordRecipientInformation.KEYSIZES.get(aSN1ObjectIdentifier);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("cannot find key size for algorithm: " + aSN1ObjectIdentifier);
    }

    protected abstract byte[] calculateDerivedKey(int i2, AlgorithmIdentifier algorithmIdentifier, int i3) throws CMSException;

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public RecipientInfo generate(GenericKey genericKey) throws Throwable {
        byte[] bArr = new byte[this.blockSize];
        if (this.random == null) {
            short sXd = (short) (Od.Xd() ^ (-21386));
            int[] iArr = new int["~v\rxF\r\u007f~\u0012\u0010\b\u0014\u001aOu\t\b\u001b\u0019\rz\u000b\u0019\u0010\u001c\u001b".length()];
            QB qb = new QB("~v\rxF\r\u007f~\u0012\u0010\b\u0014\u001aOu\t\b\u001b\u0019\rz\u000b\u0019\u0010\u001c\u001b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        short sXd2 = (short) (C1499aX.Xd() ^ (-12875));
        int[] iArr2 = new int["e]o[%kZYxvjvx.Pcn\u0002{oYisj\u0003\u0002".length()];
        QB qb2 = new QB("e]o[%kZYxvjvx.Pcn\u0002{oYisj\u0003\u0002");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr2 = {bArr};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Qg.kd("RHZU\"XRBO", (short) (C1607wl.Xd() ^ 16779), (short) (C1607wl.Xd() ^ 28421)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            if (this.salt == null) {
                byte[] bArr2 = new byte[20];
                this.salt = bArr2;
                SecureRandom secureRandom2 = this.random;
                short sXd3 = (short) (OY.Xd() ^ 31322);
                short sXd4 = (short) (OY.Xd() ^ 14714);
                int[] iArr3 = new int["[QeO\u001b_PM^ZPZ^\u00126GDUQC/=I>HE".length()];
                QB qb3 = new QB("[QeO\u001b_PM^ZPZ^\u00126GDUQC/=I>HE");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                    i4++;
                }
                Object[] objArr3 = {bArr2};
                Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.ud("]Se`-c]MZ", (short) (OY.Xd() ^ 16535)), byte[].class);
                try {
                    method2.setAccessible(true);
                    method2.invoke(secureRandom2, objArr3);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(this.salt, this.iterationCount, this.prf.prfAlgID));
            this.keyDerivationAlgorithm = algorithmIdentifier;
            DEROctetString dEROctetString = new DEROctetString(generateEncryptedBytes(new AlgorithmIdentifier(this.kekAlgorithm, new DEROctetString(bArr)), calculateDerivedKey(this.schemeID, algorithmIdentifier, this.keySize), genericKey));
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.kekAlgorithm);
            aSN1EncodableVector.add(new DEROctetString(bArr));
            return new RecipientInfo(new PasswordRecipientInfo(this.keyDerivationAlgorithm, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_PWRI_KEK, new DERSequence(aSN1EncodableVector)), dEROctetString));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    protected abstract byte[] generateEncryptedBytes(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, GenericKey genericKey) throws CMSException;

    public PasswordRecipientInfoGenerator setPRF(PasswordRecipient.PRF prf) {
        this.prf = prf;
        return this;
    }

    public PasswordRecipientInfoGenerator setPasswordConversionScheme(int i2) {
        this.schemeID = i2;
        return this;
    }

    public PasswordRecipientInfoGenerator setSaltAndIterationCount(byte[] bArr, int i2) {
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i2;
        return this;
    }

    public PasswordRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
