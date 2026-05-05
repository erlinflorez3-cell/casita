package yg;

import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* JADX INFO: loaded from: classes.dex */
public class VK extends CipherInputStream {
    public VK(InputStream inputStream, Cipher cipher) {
        super(inputStream, cipher);
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }
}
