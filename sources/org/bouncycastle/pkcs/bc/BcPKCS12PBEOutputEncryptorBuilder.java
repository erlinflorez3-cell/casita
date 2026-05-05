package org.bouncycastle.pkcs.bc;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.io.CipherOutputStream;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OutputEncryptor;
import yg.C1633zX;
import yg.FB;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class BcPKCS12PBEOutputEncryptorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private ExtendedDigest digest;
    private BufferedBlockCipher engine;
    private int iterationCount;
    private SecureRandom random;

    public BcPKCS12PBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, BlockCipher blockCipher) {
        this(aSN1ObjectIdentifier, blockCipher, new SHA1Digest());
    }

    public BcPKCS12PBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, BlockCipher blockCipher, ExtendedDigest extendedDigest) {
        this.iterationCount = 1024;
        this.algorithm = aSN1ObjectIdentifier;
        this.engine = new PaddedBufferedBlockCipher(blockCipher, new PKCS7Padding());
        this.digest = extendedDigest;
    }

    public OutputEncryptor build(final char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.vd("\n\u007f\u0018\u0002I\u000e\u0003\u007f\u001d\u0019\u0013\u001d\u001dPx\n\u0013$$\u0016}\f\u001c\u0011'$", (short) (ZN.Xd() ^ 19594))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        byte[] bArr = new byte[20];
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {bArr};
        Method method = Class.forName(Qg.kd("I?S=\tM>;LH>HL\u007f$52C?1\u001d+7,63", (short) (FB.Xd() ^ 27443), (short) (FB.Xd() ^ 10469))).getMethod(hg.Vd("F<NI\u0016LF6C", (short) (C1633zX.Xd() ^ (-5897)), (short) (C1633zX.Xd() ^ (-5548))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            final PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, this.iterationCount);
            this.engine.init(true, PKCS12PBEUtils.createCipherParameters(this.algorithm, this.digest, this.engine.getBlockSize(), pKCS12PBEParams, cArr));
            return new OutputEncryptor() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.1
                @Override // org.bouncycastle.operator.OutputEncryptor
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams);
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public GenericKey getKey() {
                    return new GenericKey(new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams), PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr));
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public OutputStream getOutputStream(OutputStream outputStream) {
                    return new CipherOutputStream(outputStream, BcPKCS12PBEOutputEncryptorBuilder.this.engine);
                }
            };
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public BcPKCS12PBEOutputEncryptorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }
}
