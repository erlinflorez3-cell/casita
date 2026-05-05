package org.spongycastle.cms;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cms.PasswordRecipientInfo;
import org.spongycastle.asn1.cms.RecipientInfo;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.operator.GenericKey;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PasswordRecipientInfoGenerator implements RecipientInfoGenerator {
    private int blockSize;
    private ASN1ObjectIdentifier kekAlgorithm;
    private AlgorithmIdentifier keyDerivationAlgorithm;
    private int keySize;
    protected char[] password;
    private SecureRandom random;
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
    }

    private static int getKeySize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Integer num = (Integer) PasswordRecipientInformation.KEYSIZES.get(aSN1ObjectIdentifier);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("cannot find key size for algorithm: " + aSN1ObjectIdentifier);
    }

    protected abstract byte[] calculateDerivedKey(int i2, AlgorithmIdentifier algorithmIdentifier, int i3) throws CMSException;

    @Override // org.spongycastle.cms.RecipientInfoGenerator
    public RecipientInfo generate(GenericKey genericKey) throws Throwable {
        byte[] bArr = new byte[this.blockSize];
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.yd("C;M9\u000bQ@?VTHT^\u00146I,?9-\u001f/90@?", (short) (C1607wl.Xd() ^ 29000))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        short sXd = (short) (FB.Xd() ^ 29504);
        int[] iArr = new int["og}i7}po\u0003\u0001x\u0005\u000b@fyx\f\n}k{\n\u0001\r\f".length()];
        QB qb = new QB("og}i7}po\u0003\u0001x\u0005\u000b@fyx\f\n}k{\n\u0001\r\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr2 = {bArr};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("\u0014\f \u001dk$ \u0012!", (short) (ZN.Xd() ^ 24399), (short) (ZN.Xd() ^ 31913)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            if (this.keyDerivationAlgorithm == null) {
                byte[] bArr2 = new byte[20];
                SecureRandom secureRandom2 = this.random;
                Object[] objArr3 = {bArr2};
                Method method2 = Class.forName(Jg.Wd("t\u0010XggQu\u0018]~)Y\u0012jCy*p\u00118H\r=g\u0016H", (short) (OY.Xd() ^ 11050), (short) (OY.Xd() ^ 3784))).getMethod(ZO.xd("Z!C3$j5g\u0014", (short) (Od.Xd() ^ (-21203)), (short) (Od.Xd() ^ (-9769))), byte[].class);
                try {
                    method2.setAccessible(true);
                    method2.invoke(secureRandom2, objArr3);
                    this.keyDerivationAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, 1024));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            DEROctetString dEROctetString = new DEROctetString(generateEncryptedBytes(new AlgorithmIdentifier(this.kekAlgorithm, new DEROctetString(bArr)), calculateDerivedKey(this.schemeID, this.keyDerivationAlgorithm, this.keySize), genericKey));
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.kekAlgorithm);
            aSN1EncodableVector.add(new DEROctetString(bArr));
            return new RecipientInfo(new PasswordRecipientInfo(this.keyDerivationAlgorithm, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_PWRI_KEK, new DERSequence(aSN1EncodableVector)), dEROctetString));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    protected abstract byte[] generateEncryptedBytes(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, GenericKey genericKey) throws CMSException;

    public PasswordRecipientInfoGenerator setPasswordConversionScheme(int i2) {
        this.schemeID = i2;
        return this;
    }

    public PasswordRecipientInfoGenerator setSaltAndIterationCount(byte[] bArr, int i2) {
        this.keyDerivationAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr, i2));
        return this;
    }

    public PasswordRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
