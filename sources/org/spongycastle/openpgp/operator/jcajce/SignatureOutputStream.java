package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes2.dex */
class SignatureOutputStream extends OutputStream {
    private Signature sig;

    SignatureOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        try {
            this.sig.update((byte) i2);
        } catch (SignatureException e2) {
            throw new IOException("signature update caused exception: " + e2.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e2) {
            throw new IOException("signature update caused exception: " + e2.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        try {
            this.sig.update(bArr, i2, i3);
        } catch (SignatureException e2) {
            throw new IOException("signature update caused exception: " + e2.getMessage());
        }
    }
}
