package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    public DERGenerator(OutputStream outputStream, int i2, boolean z2) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z2;
        this._tagNo = i2;
    }

    private void writeLength(OutputStream outputStream, int i2) throws IOException {
        if (i2 <= 127) {
            outputStream.write((byte) i2);
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
        outputStream.write((byte) (128 | i4));
        for (int i5 = (i4 - 1) * 8; i5 >= 0; i5 -= 8) {
            outputStream.write((byte) (i2 >> i5));
        }
    }

    void writeDEREncoded(int i2, byte[] bArr) throws IOException {
        if (!this._tagged) {
            writeDEREncoded(this._out, i2, bArr);
            return;
        }
        int i3 = this._tagNo;
        int i4 = i3 | 128;
        if (this._isExplicit) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i2, bArr);
            writeDEREncoded(this._out, (i3 + 160) - (i3 & 160), byteArrayOutputStream.toByteArray());
            return;
        }
        if ((i2 & 32) != 0) {
            writeDEREncoded(this._out, (-1) - (((-1) - i3) & ((-1) - 160)), bArr);
        } else {
            writeDEREncoded(this._out, i4, bArr);
        }
    }

    void writeDEREncoded(OutputStream outputStream, int i2, byte[] bArr) throws IOException {
        outputStream.write(i2);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
