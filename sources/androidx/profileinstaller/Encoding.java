package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int utf8Length(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeUInt(OutputStream outputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((-1) - (((-1) - (j2 >> (i3 * 8))) | ((-1) - 255)));
        }
        outputStream.write(bArr);
    }

    static void writeUInt8(OutputStream outputStream, int i2) throws IOException {
        writeUInt(outputStream, i2, 1);
    }

    static void writeUInt16(OutputStream outputStream, int i2) throws IOException {
        writeUInt(outputStream, i2, 2);
    }

    static void writeUInt32(OutputStream outputStream, long j2) throws IOException {
        writeUInt(outputStream, j2, 4);
    }

    static void writeString(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static int bitsToBytes(int i2) {
        return ((i2 + 7) & (-8)) / 8;
    }

    static byte[] read(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw error("Not enough bytes to read: " + i2);
            }
            i3 += i4;
        }
        return bArr;
    }

    static long readUInt(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = read(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArr[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    static int readUInt8(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 1);
    }

    static int readUInt16(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 2);
    }

    static long readUInt32(InputStream inputStream) throws IOException {
        return readUInt(inputStream, 4);
    }

    static String readString(InputStream inputStream, int i2) throws IOException {
        return new String(read(inputStream, i2), StandardCharsets.UTF_8);
    }

    static byte[] readCompressed(InputStream inputStream, int i2, int i3) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = inputStream.read(bArr2);
                if (i5 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw error(e2.getMessage());
                }
            }
            if (i4 != i2) {
                throw error("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
            }
            if (inflater.finished()) {
                return bArr;
            }
            throw error("Inflater did not finish");
        } finally {
            inflater.end();
        }
    }

    static void writeCompressed(OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    static byte[] compress(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static void writeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    static RuntimeException error(String str) {
        return new IllegalStateException(str);
    }
}
