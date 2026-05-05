package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes2.dex */
public class BufferedDecoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator, int i2) {
        this.translator = translator;
        if (i2 % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i2];
        this.bufOff = 0;
    }

    public int processByte(byte b2, byte[] bArr, int i2) {
        byte[] bArr2 = this.buf;
        int i3 = this.bufOff;
        int i4 = i3 + 1;
        this.bufOff = i4;
        bArr2[i3] = b2;
        if (i4 != bArr2.length) {
            return 0;
        }
        int iDecode = this.translator.decode(bArr2, 0, bArr2.length, bArr, i2);
        this.bufOff = 0;
        return iDecode;
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5 = i2;
        int i6 = i3;
        if (i6 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i7 = this.bufOff;
        int i8 = length - i7;
        int iDecode = 0;
        if (i6 > i8) {
            System.arraycopy(bArr, i5, bArr3, i7, i8);
            Translator translator = this.translator;
            byte[] bArr4 = this.buf;
            int iDecode2 = translator.decode(bArr4, 0, bArr4.length, bArr2, i4);
            this.bufOff = 0;
            int i9 = i6 - i8;
            int i10 = i5 + i8;
            int length2 = i9 - (i9 % this.buf.length);
            iDecode = iDecode2 + this.translator.decode(bArr, i10, length2, bArr2, i4 + iDecode2);
            i6 = i9 - length2;
            i5 = i10 + length2;
        }
        if (i6 != 0) {
            System.arraycopy(bArr, i5, this.buf, this.bufOff, i6);
            this.bufOff += i6;
        }
        return iDecode;
    }
}
