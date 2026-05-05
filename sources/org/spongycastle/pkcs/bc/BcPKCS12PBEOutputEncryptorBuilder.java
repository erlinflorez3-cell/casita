package org.spongycastle.pkcs.bc;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.io.CipherOutputStream;
import org.spongycastle.crypto.paddings.PKCS7Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OutputEncryptor;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.OY;

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
            Constructor<?> constructor = Class.forName(C1593ug.zd("qi\u007fk9\u007frq\u0005\u0003z\u0007\rBh{z\u000e\f\u007fm}\f\u0003\u000f\u000e", (short) (C1633zX.Xd() ^ (-11286)), (short) (C1633zX.Xd() ^ (-29586)))).getConstructor(new Class[0]);
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
        Method method = Class.forName(C1561oA.od("<2F0{@1.?;1;?r\u0017(%62$\u0010\u001e*\u001f)&", (short) (OY.Xd() ^ 15558))).getMethod(C1561oA.Kd("6.B?\u000eFB4C", (short) (FB.Xd() ^ 22853)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            final PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, this.iterationCount);
            this.engine.init(true, PKCS12PBEUtils.createCipherParameters(this.algorithm, this.digest, this.engine.getBlockSize(), pKCS12PBEParams, cArr));
            return new OutputEncryptor() { // from class: org.spongycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.1
                @Override // org.spongycastle.operator.OutputEncryptor
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams);
                }

                @Override // org.spongycastle.operator.OutputEncryptor
                public GenericKey getKey() {
                    return new GenericKey(new AlgorithmIdentifier(BcPKCS12PBEOutputEncryptorBuilder.this.algorithm, pKCS12PBEParams), PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr));
                }

                @Override // org.spongycastle.operator.OutputEncryptor
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
