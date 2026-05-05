package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    protected BERGenerator(OutputStream outputStream, int i2, boolean z2) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z2;
        this._tagNo = i2;
    }

    private void writeHdr(int i2) throws IOException {
        this._out.write(i2);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    protected void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    protected void writeBERHeader(int i2) throws IOException {
        if (this._tagged) {
            int i3 = this._tagNo;
            int i4 = (-1) - (((-1) - i3) & ((-1) - 128));
            if (this._isExplicit) {
                writeHdr((i3 + 160) - (i3 & 160));
            } else {
                if ((-1) - (((-1) - i2) | ((-1) - 32)) == 0) {
                    writeHdr(i4);
                    return;
                }
                i2 = (-1) - (((-1) - i3) & ((-1) - 160));
            }
        }
        writeHdr(i2);
    }
}
