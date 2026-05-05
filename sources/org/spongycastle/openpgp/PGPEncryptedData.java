package org.spongycastle.openpgp;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.bcpg.InputStreamPacket;
import org.spongycastle.bcpg.SymmetricEncIntegrityPacket;
import org.spongycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PGPEncryptedData implements SymmetricKeyAlgorithmTags {
    InputStreamPacket encData;
    InputStream encStream;
    PGPDigestCalculator integrityCalculator;
    TruncatedStream truncStream;

    protected class TruncatedStream extends InputStream {
        int bufPtr;
        InputStream in;
        int[] lookAhead = new int[22];

        TruncatedStream(InputStream inputStream) throws IOException {
            int i2 = 0;
            while (true) {
                int[] iArr = this.lookAhead;
                if (i2 == iArr.length) {
                    this.bufPtr = 0;
                    this.in = inputStream;
                    return;
                } else {
                    int i3 = inputStream.read();
                    iArr[i2] = i3;
                    if (i3 < 0) {
                        throw new EOFException();
                    }
                    i2++;
                }
            }
        }

        int[] getLookAhead() {
            int[] iArr = new int[this.lookAhead.length];
            int i2 = this.bufPtr;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.lookAhead;
                if (i2 == iArr2.length) {
                    break;
                }
                iArr[i4] = iArr2[i2];
                i2++;
                i4++;
            }
            while (i3 != this.bufPtr) {
                iArr[i4] = this.lookAhead[i3];
                i3++;
                i4++;
            }
            return iArr;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i2 = this.in.read();
            if (i2 < 0) {
                return -1;
            }
            int[] iArr = this.lookAhead;
            int i3 = this.bufPtr;
            int i4 = iArr[i3];
            iArr[i3] = i2;
            this.bufPtr = (i3 + 1) % iArr.length;
            return i4;
        }
    }

    PGPEncryptedData(InputStreamPacket inputStreamPacket) {
        this.encData = inputStreamPacket;
    }

    public InputStream getInputStream() {
        return this.encData.getInputStream();
    }

    public boolean isIntegrityProtected() {
        return this.encData instanceof SymmetricEncIntegrityPacket;
    }

    public boolean verify() throws PGPException, IOException {
        if (!isIntegrityProtected()) {
            throw new PGPException("data not integrity protected.");
        }
        while (this.encStream.read() >= 0) {
        }
        int[] lookAhead = this.truncStream.getLookAhead();
        OutputStream outputStream = this.integrityCalculator.getOutputStream();
        outputStream.write((byte) lookAhead[0]);
        outputStream.write((byte) lookAhead[1]);
        byte[] digest = this.integrityCalculator.getDigest();
        int length = digest.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr[i2] = (byte) lookAhead[i2 + 2];
        }
        return Arrays.constantTimeAreEqual(digest, bArr);
    }
}
