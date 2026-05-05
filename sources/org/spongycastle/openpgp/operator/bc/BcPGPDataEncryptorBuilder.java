package org.spongycastle.openpgp.operator.bc;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.io.CipherOutputStream;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PGPDataEncryptor;
import org.spongycastle.openpgp.operator.PGPDataEncryptorBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import yg.C1561oA;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPDataEncryptorBuilder implements PGPDataEncryptorBuilder {
    private int encAlgorithm;
    private SecureRandom random;
    private boolean withIntegrityPacket;

    private class MyPGPDataEncryptor implements PGPDataEncryptor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BufferedBlockCipher f28088c;

        MyPGPDataEncryptor(byte[] bArr) throws PGPException {
            try {
                this.f28088c = BcUtil.createStreamCipher(true, BcImplProvider.createBlockCipher(BcPGPDataEncryptorBuilder.this.encAlgorithm), BcPGPDataEncryptorBuilder.this.withIntegrityPacket, bArr);
            } catch (IllegalArgumentException e2) {
                throw new PGPException("invalid parameters: " + e2.getMessage(), e2);
            }
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public int getBlockSize() {
            return this.f28088c.getBlockSize();
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public PGPDigestCalculator getIntegrityCalculator() {
            if (BcPGPDataEncryptorBuilder.this.withIntegrityPacket) {
                return new SHA1PGPDigestCalculator();
            }
            return null;
        }

        @Override // org.spongycastle.openpgp.operator.PGPDataEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.f28088c);
        }
    }

    public BcPGPDataEncryptorBuilder(int i2) {
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
            Constructor<?> constructor = Class.forName(C1561oA.Kd("ph~j8~qp\u0004\u0002y\u0006\fAgzy\r\u000b~l|\u000b\u0002\u000e\r", (short) (Od.Xd() ^ (-11482)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.random;
    }

    public BcPGPDataEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public BcPGPDataEncryptorBuilder setWithIntegrityPacket(boolean z2) {
        this.withIntegrityPacket = z2;
        return this;
    }
}
