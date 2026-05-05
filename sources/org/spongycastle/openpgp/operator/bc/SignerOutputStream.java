package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
class SignerOutputStream extends OutputStream {
    private Signer sig;

    SignerOutputStream(Signer signer) {
        this.sig = signer;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.sig.update((byte) i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.sig.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.sig.update(bArr, i2, i3);
    }
}
