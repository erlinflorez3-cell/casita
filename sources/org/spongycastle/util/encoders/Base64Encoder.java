package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import okio.Utf8;

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
            if ((b2 | b3) < 0) {
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
            int i2 = (-1) - (((-1) - b4) & ((-1) - b5));
            if ((i2 + b6) - (i2 & b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            int i3 = b4 << 2;
            int i4 = b5 >> 4;
            outputStream.write((i3 + i4) - (i3 & i4));
            outputStream.write((b5 << 4) | (b6 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        byte b10 = bArr3[c5];
        if ((-1) - (((-1) - ((-1) - (((-1) - (b7 | b8)) & ((-1) - b9)))) & ((-1) - b10)) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        int i5 = b7 << 2;
        int i6 = b8 >> 4;
        outputStream.write((i5 + i6) - (i5 & i6));
        int i7 = b8 << 4;
        int i8 = b9 >> 2;
        outputStream.write((i7 + i8) - (i7 & i8));
        outputStream.write((-1) - (((-1) - (b9 << 6)) & ((-1) - b10)));
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

    @Override // org.spongycastle.util.encoders.Encoder
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
            int i5 = (-1) - (((-1) - ((b2 + b3) - (b2 & b3))) & ((-1) - b4));
            if ((i5 + b5) - (i5 & b5) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            int i6 = b2 << 2;
            int i7 = b3 >> 4;
            outputStream.write((i6 + i7) - (i6 & i7));
            outputStream.write((-1) - (((-1) - (b3 << 4)) & ((-1) - (b4 >> 2))));
            outputStream.write((b4 << 6) | b5);
            i3 += 3;
            iNextI = nextI(str, i4, i2);
        }
        return i3 + decodeLastBlock(outputStream, str.charAt(i2), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    @Override // org.spongycastle.util.encoders.Encoder
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
            int i8 = (-1) - (((-1) - b2) & ((-1) - b3));
            if ((-1) - (((-1) - ((i8 + b4) - (i8 & b4))) & ((-1) - b5)) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((-1) - (((-1) - (b2 << 2)) & ((-1) - (b3 >> 4))));
            outputStream.write((-1) - (((-1) - (b3 << 4)) & ((-1) - (b4 >> 2))));
            outputStream.write((-1) - (((-1) - (b4 << 6)) & ((-1) - b5)));
            i6 += 3;
            iNextI = nextI(bArr, i7, i5);
        }
        return i6 + decodeLastBlock(outputStream, (char) bArr[i5], (char) bArr[i4 - 3], (char) bArr[i4 - 2], (char) bArr[i4 - 1]);
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i2, int i3, OutputStream outputStream) throws IOException {
        int i4;
        int i5 = i3 % 3;
        int i6 = i3 - i5;
        int i7 = i2;
        while (true) {
            i4 = i2 + i6;
            if (i7 >= i4) {
                break;
            }
            int i8 = (-1) - (((-1) - bArr[i7]) | ((-1) - 255));
            int i9 = (-1) - (((-1) - bArr[i7 + 1]) | ((-1) - 255));
            byte b2 = bArr[i7 + 2];
            outputStream.write(this.encodingTable[(i8 >>> 2) & 63]);
            int i10 = i8 << 4;
            int i11 = i9 >>> 4;
            int i12 = (i10 + i11) - (i10 & i11);
            outputStream.write(this.encodingTable[(i12 + 63) - (i12 | 63)]);
            int i13 = (i9 << 2) | ((b2 & 255) >>> 6);
            outputStream.write(this.encodingTable[(i13 + 63) - (i13 | 63)]);
            outputStream.write(this.encodingTable[(b2 + Utf8.REPLACEMENT_BYTE) - (b2 | Utf8.REPLACEMENT_BYTE)]);
            i7 += 3;
        }
        if (i5 == 1) {
            int i14 = bArr[i4] & 255;
            int i15 = i14 >>> 2;
            outputStream.write(this.encodingTable[(i15 + 63) - (i15 | 63)]);
            outputStream.write(this.encodingTable[(i14 << 4) & 63]);
            outputStream.write(this.padding);
            outputStream.write(this.padding);
        } else if (i5 == 2) {
            int i16 = (-1) - (((-1) - bArr[i4]) | ((-1) - 255));
            byte b3 = bArr[i4 + 1];
            int i17 = (b3 + 255) - (b3 | 255);
            int i18 = i16 >>> 2;
            int i19 = (-1) - (((-1) - ((-1) - (((-1) - (i16 << 4)) & ((-1) - (i17 >>> 4))))) | ((-1) - 63));
            int i20 = i17 << 2;
            outputStream.write(this.encodingTable[(i18 + 63) - (i18 | 63)]);
            outputStream.write(this.encodingTable[i19]);
            outputStream.write(this.encodingTable[(i20 + 63) - (i20 | 63)]);
            outputStream.write(this.padding);
        }
        return ((i6 / 3) * 4) + (i5 == 0 ? 0 : 4);
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
