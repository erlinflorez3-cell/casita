package org.spongycastle.openpgp;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
class SXprUtils {
    SXprUtils() {
    }

    static S2K parseS2K(InputStream inputStream) throws IOException {
        skipOpenParenthesis(inputStream);
        readString(inputStream, inputStream.read());
        byte[] bytes = readBytes(inputStream, inputStream.read());
        final long j2 = Long.parseLong(readString(inputStream, inputStream.read()));
        skipCloseParenthesis(inputStream);
        return new S2K(2, bytes, (int) j2) { // from class: org.spongycastle.openpgp.SXprUtils.1
            @Override // org.spongycastle.bcpg.S2K
            public long getIterationCount() {
                return j2;
            }
        };
    }

    static byte[] readBytes(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[readLength(inputStream, i2)];
        Streams.readFully(inputStream, bArr);
        return bArr;
    }

    private static int readLength(InputStream inputStream, int i2) throws IOException {
        int i3;
        while (true) {
            i3 = i2 - 48;
            int i4 = inputStream.read();
            if (i4 < 0 || i4 == 58) {
                break;
            }
            i2 = (i3 * 10) + i4;
        }
        return i3;
    }

    static String readString(InputStream inputStream, int i2) throws IOException {
        int length = readLength(inputStream, i2);
        char[] cArr = new char[length];
        for (int i3 = 0; i3 != length; i3++) {
            cArr[i3] = (char) inputStream.read();
        }
        return new String(cArr);
    }

    static void skipCloseParenthesis(InputStream inputStream) throws IOException {
        if (inputStream.read() != 41) {
            throw new IOException("unknown character encountered");
        }
    }

    static void skipOpenParenthesis(InputStream inputStream) throws IOException {
        if (inputStream.read() != 40) {
            throw new IOException("unknown character encountered");
        }
    }
}
