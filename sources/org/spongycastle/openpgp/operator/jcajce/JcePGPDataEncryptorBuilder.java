package org.spongycastle.openpgp.operator.jcajce;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PGPDataEncryptor;
import org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import yg.C1580rY;
import yg.Qg;

/* JADX INFO: loaded from: classes2.dex */
public class JcePGPDataEncryptorBuilder implements PGPDataEncryptorBuilder {
    private int encAlgorithm;
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private SecureRandom random;
    private boolean withIntegrityPacket;

    private class MyPGPDataEncryptor implements PGPDataEncryptor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Cipher f28090c;

        MyPGPDataEncryptor(byte[] bArr) throws PGPException {
            Cipher cipherCreateStreamCipher = JcePGPDataEncryptorBuilder.this.helper.createStreamCipher(JcePGPDataEncryptorBuilder.this.encAlgorithm, JcePGPDataEncryptorBuilder.this.withIntegrityPacket);
            this.f28090c = cipherCreateStreamCipher;
            try {
                if (!JcePGPDataEncryptorBuilder.this.withIntegrityPacket) {
                    cipherCreateStreamCipher.init(1, PGPUtil.makeSymmetricKey(JcePGPDataEncryptorBuilder.this.encAlgorithm, bArr));
                } else {
                    cipherCreateStreamCipher.init(1, PGPUtil.makeSymmetricKey(JcePGPDataEncryptorBuilder.this.encAlgorithm, bArr), new IvParameterSpec(new byte[cipherCreateStreamCipher.getBlockSize()]));
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new PGPException("imvalid algorithm parameter: " + e2.getMessage(), e2);
            } catch (InvalidKeyException e3) {
                throw new PGPException("invalid key: " + e3.getMessage(), e3);
            }
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public int getBlockSize() {
            return this.f28090c.getBlockSize();
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public PGPDigestCalculator getIntegrityCalculator() {
            if (JcePGPDataEncryptorBuilder.this.withIntegrityPacket) {
                return new SHA1PGPDigestCalculator();
            }
            return null;
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.f28090c);
        }
    }

    public JcePGPDataEncryptorBuilder(int i2) {
        this.encAlgorithm = i2;
        if (i2 == 0) {
            throw new IllegalArgumentException("null cipher specified");
        }
    }

    @Override // org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder
    public PGPDataEncryptor build(byte[] bArr) throws PGPException {
        return new MyPGPDataEncryptor(bArr);
    }

    @Override // org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder
    public int getAlgorithm() {
        return this.encAlgorithm;
    }

    @Override // org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder
    public SecureRandom getSecureRandom() throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Qg.kd("~t\tr>\u0003sp\u0002}s}\u00025YjgxtfR`lakh", (short) (C1580rY.Xd() ^ (-24591)), (short) (C1580rY.Xd() ^ (-12765)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.random;
    }

    public JcePGPDataEncryptorBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcePGPDataEncryptorBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcePGPDataEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcePGPDataEncryptorBuilder setWithIntegrityPacket(boolean z2) {
        this.withIntegrityPacket = z2;
        return this;
    }
}
