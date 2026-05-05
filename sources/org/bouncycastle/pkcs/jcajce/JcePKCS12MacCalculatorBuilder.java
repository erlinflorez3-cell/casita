package org.bouncycastle.pkcs.jcajce;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.io.MacOutputStream;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class JcePKCS12MacCalculatorBuilder implements PKCS12MacCalculatorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private JcaJceHelper helper;
    private int iterationCount;
    private SecureRandom random;
    private int saltLength;

    public JcePKCS12MacCalculatorBuilder() {
        this(OIWObjectIdentifiers.idSHA1);
    }

    public JcePKCS12MacCalculatorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.helper = new DefaultJcaJceHelper();
        this.iterationCount = 1024;
        this.algorithm = aSN1ObjectIdentifier;
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public MacCalculator build(char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.ud("~t\tr>\u0003sp\u0002}s}\u00025YjgxtfR`lakh", (short) (FB.Xd() ^ 20575))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            final Mac macCreateMac = this.helper.createMac(this.algorithm.getId());
            int macLength = macCreateMac.getMacLength();
            this.saltLength = macLength;
            final byte[] bArr = new byte[macLength];
            SecureRandom secureRandom = this.random;
            short sXd = (short) (FB.Xd() ^ 14585);
            int[] iArr = new int["e]o[-sbahfZfp&H[n\u0002{oaq{rrq".length()];
            QB qb = new QB("e]o[-sbahfZfp&H[n\u0002{oaq{rrq");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr2 = {bArr};
            short sXd2 = (short) (C1580rY.Xd() ^ (-14146));
            int[] iArr2 = new int["aYmj9qm_n".length()];
            QB qb2 = new QB("aYmj9qm_n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, this.iterationCount);
                final PKCS12Key pKCS12Key = new PKCS12Key(cArr);
                macCreateMac.init(pKCS12Key, pBEParameterSpec);
                return new MacCalculator() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder.1
                    @Override // org.bouncycastle.operator.MacCalculator
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return new AlgorithmIdentifier(JcePKCS12MacCalculatorBuilder.this.algorithm, new PKCS12PBEParams(bArr, JcePKCS12MacCalculatorBuilder.this.iterationCount));
                    }

                    @Override // org.bouncycastle.operator.MacCalculator
                    public GenericKey getKey() {
                        return new GenericKey(getAlgorithmIdentifier(), pKCS12Key.getEncoded());
                    }

                    @Override // org.bouncycastle.operator.MacCalculator
                    public byte[] getMac() {
                        return macCreateMac.doFinal();
                    }

                    @Override // org.bouncycastle.operator.MacCalculator
                    public OutputStream getOutputStream() {
                        return new MacOutputStream(macCreateMac);
                    }
                };
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            throw new OperatorCreationException(Xg.qd(";5)+60kA=n3C74H:u$\u0019\u001cy>=IATLBVRV\u001f\u0006", (short) (FB.Xd() ^ 18800), (short) (FB.Xd() ^ 8027)) + e4.getMessage(), e4);
        }
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return new AlgorithmIdentifier(this.algorithm, DERNull.INSTANCE);
    }

    public JcePKCS12MacCalculatorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }

    public JcePKCS12MacCalculatorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePKCS12MacCalculatorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
