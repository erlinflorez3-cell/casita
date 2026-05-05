package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ASN1OutputStream {
    private OutputStream os;

    private class ImplicitOutputStream extends ASN1OutputStream {
        private boolean first;

        public ImplicitOutputStream(OutputStream outputStream) {
            super(outputStream);
            this.first = true;
        }

        @Override // org.spongycastle.asn1.ASN1OutputStream
        public void write(int i2) throws IOException {
            if (this.first) {
                this.first = false;
            } else {
                super.write(i2);
            }
        }
    }

    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    public void close() throws IOException {
        this.os.close();
    }

    public void flush() throws IOException {
        this.os.flush();
    }

    ASN1OutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    void write(int i2) throws IOException {
        this.os.write(i2);
    }

    void write(byte[] bArr) throws IOException {
        this.os.write(bArr);
    }

    void write(byte[] bArr, int i2, int i3) throws IOException {
        this.os.write(bArr, i2, i3);
    }

    void writeEncoded(int i2, int i3, byte[] bArr) throws IOException {
        writeTag(i2, i3);
        writeLength(bArr.length);
        write(bArr);
    }

    void writeEncoded(int i2, byte[] bArr) throws IOException {
        write(i2);
        writeLength(bArr.length);
        write(bArr);
    }

    void writeImplicitObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        aSN1Primitive.encode(new ImplicitOutputStream(this.os));
    }

    void writeLength(int i2) throws IOException {
        if (i2 <= 127) {
            write((byte) i2);
            return;
        }
        int i3 = i2;
        int i4 = 1;
        while (true) {
            i3 >>>= 8;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        write((byte) ((i4 + 128) - (128 & i4)));
        for (int i5 = (i4 - 1) * 8; i5 >= 0; i5 -= 8) {
            write((byte) (i2 >> i5));
        }
    }

    protected void writeNull() throws IOException {
        this.os.write(5);
        this.os.write(0);
    }

    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        aSN1Encodable.toASN1Primitive().encode(this);
    }

    void writeTag(int i2, int i3) throws IOException {
        if (i3 < 31) {
            write((i2 + i3) - (i2 & i3));
            return;
        }
        write(i2 | 31);
        if (i3 < 128) {
            write(i3);
            return;
        }
        byte[] bArr = new byte[5];
        int i4 = 4;
        bArr[4] = (byte) (127 & i3);
        do {
            i3 >>= 7;
            i4--;
            int i5 = (-1) - (((-1) - i3) | ((-1) - 127));
            bArr[i4] = (byte) ((i5 + 128) - (i5 & 128));
        } while (i3 > 127);
        write(bArr, i4, 5 - i4);
    }
}
