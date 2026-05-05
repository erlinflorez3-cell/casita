package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Encoder implements Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    public Base64Encoder() {
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c2, char c3, char c4, char c5) throws IOException {
        char c6 = this.padding;
        if (c4 == c6) {
            byte[] bArr = this.decodingTable;
            byte b2 = bArr[c2];
            byte b3 = bArr[c3];
            if ((b2 + b3) - (b2 & b3) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b2 << 2) | (b3 >> 4));
            return 1;
        }
        if (c5 == c6) {
            byte[] bArr2 = this.decodingTable;
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            byte b6 = bArr2[c4];
            if ((((-1) - (((-1) - b4) & ((-1) - b5))) | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b4 << 2) | (b5 >> 4));
            int i2 = b5 << 4;
            int i3 = b6 >> 2;
            outputStream.write((i2 + i3) - (i2 & i3));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        byte b10 = bArr3[c5];
        if ((-1) - (((-1) - (((b7 + b8) - (b7 & b8)) | b9)) & ((-1) - b10)) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b7 << 2) | (b8 >> 4));
        int i4 = b8 << 4;
        int i5 = b9 >> 2;
        outputStream.write((i4 + i5) - (i4 & i5));
        outputStream.write((b9 << 6) | b10);
        return 3;
    }

    private boolean ignore(char c2) {
        return c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == ' ';
    }

    private int nextI(String str, int i2, int i3) {
        while (i2 < i3 && ignore(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    private int nextI(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && ignore((char) bArr[i2])) {
            i2++;
        }
        return i2;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i2 = length - 4;
        int i3 = 0;
        int iNextI = nextI(str, 0, i2);
        while (iNextI < i2) {
            byte b2 = this.decodingTable[str.charAt(iNextI)];
            int iNextI2 = nextI(str, iNextI + 1, i2);
            byte b3 = this.decodingTable[str.charAt(iNextI2)];
            int iNextI3 = nextI(str, iNextI2 + 1, i2);
            byte b4 = this.decodingTable[str.charAt(iNextI3)];
            int iNextI4 = nextI(str, iNextI3 + 1, i2);
            int i4 = iNextI4 + 1;
            byte b5 = this.decodingTable[str.charAt(iNextI4)];
            if ((((-1) - (((-1) - ((-1) - (((-1) - b2) & ((-1) - b3)))) & ((-1) - b4))) | b5) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((-1) - (((-1) - (b3 << 4)) & ((-1) - (b4 >> 2))));
            int i5 = b4 << 6;
            outputStream.write((i5 + b5) - (i5 & b5));
            i3 += 3;
            iNextI = nextI(str, i4, i2);
        }
        return i3 + decodeLastBlock(outputStream, str.charAt(i2), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i2, int i3, OutputStream outputStream) throws IOException {
        int i4 = i3 + i2;
        while (i4 > i2 && ignore((char) bArr[i4 - 1])) {
            i4--;
        }
        int i5 = i4 - 4;
        int iNextI = nextI(bArr, i2, i5);
        int i6 = 0;
        while (iNextI < i5) {
            byte b2 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, iNextI + 1, i5);
            byte b3 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, iNextI2 + 1, i5);
            byte b4 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, iNextI3 + 1, i5);
            int i7 = iNextI4 + 1;
            byte b5 = this.decodingTable[bArr[iNextI4]];
            int i8 = ((-1) - (((-1) - b2) & ((-1) - b3))) | b4;
            if ((i8 + b5) - (i8 & b5) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b2 << 2) | (b3 >> 4));
            int i9 = b3 << 4;
            int i10 = b4 >> 2;
            outputStream.write((i9 + i10) - (i9 & i10));
            int i11 = b4 << 6;
            outputStream.write((i11 + b5) - (i11 & b5));
            i6 += 3;
            iNextI = nextI(bArr, i7, i5);
        }
        return i6 + decodeLastBlock(outputStream, (char) bArr[i5], (char) bArr[i4 - 3], (char) bArr[i4 - 2], (char) bArr[i4 - 1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    @Override // org.bouncycastle.util.encoders.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encode(byte[] r12, int r13, int r14, java.io.OutputStream r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.encoders.Base64Encoder.encode(byte[], int, int, java.io.OutputStream):int");
    }

    protected void initialiseDecodingTable() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = -1;
            i3++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i2 >= bArr2.length) {
                return;
            }
            this.decodingTable[bArr2[i2]] = (byte) i2;
            i2++;
        }
    }
}
