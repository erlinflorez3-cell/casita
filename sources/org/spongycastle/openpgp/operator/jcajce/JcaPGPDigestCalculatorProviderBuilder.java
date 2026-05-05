package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPDigestCalculatorProviderBuilder {
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());

    private class DigestOutputStream extends OutputStream {
        private MessageDigest dig;

        DigestOutputStream(MessageDigest messageDigest) {
            this.dig = messageDigest;
        }

        byte[] getDigest() {
            return this.dig.digest();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.dig.update((byte) i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.dig.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.dig.update(bArr, i2, i3);
        }
    }

    public PGPDigestCalculatorProvider build() throws PGPException {
        return new PGPDigestCalculatorProvider() { // from class: org.spongycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder.1
            @Override // org.spongycastle.openpgp.operator.PGPDigestCalculatorProvider
            public PGPDigestCalculator get(final int i2) throws PGPException {
                try {
                    final MessageDigest messageDigestCreateDigest = JcaPGPDigestCalculatorProviderBuilder.this.helper.createDigest(i2);
                    final DigestOutputStream digestOutputStream = JcaPGPDigestCalculatorProviderBuilder.this.new DigestOutputStream(messageDigestCreateDigest);
                    return new PGPDigestCalculator() { // from class: org.spongycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder.1.1
                        @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
                        public int getAlgorithm() {
                            return i2;
                        }

                        @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
                        public byte[] getDigest() {
                            return digestOutputStream.getDigest();
                        }

                        @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
                        public OutputStream getOutputStream() {
                            return digestOutputStream;
                        }

                        @Override // org.spongycastle.openpgp.operator.PGPDigestCalculator
                        public void reset() {
                            messageDigestCreateDigest.reset();
                        }
                    };
                } catch (GeneralSecurityException e2) {
                    throw new PGPException("exception on setup: " + e2, e2);
                }
            }
        };
    }

    public JcaPGPDigestCalculatorProviderBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaPGPDigestCalculatorProviderBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
