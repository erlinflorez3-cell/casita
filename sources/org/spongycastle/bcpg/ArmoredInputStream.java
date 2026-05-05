package org.spongycastle.bcpg;

import com.dynatrace.android.agent.Global;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;
import org.apache.commons.codec.language.Soundex;
import org.spongycastle.util.StringList;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class ArmoredInputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    int bufPtr;
    boolean clearText;
    CRC24 crc;
    boolean crcFound;
    boolean hasHeaders;
    String header;
    StringList headerList;
    InputStream in;
    boolean isEndOfStream;
    int lastC;
    boolean newLineFound;
    int[] outBuf;
    boolean restart;
    boolean start;

    static {
        for (int i2 = 65; i2 <= 90; i2++) {
            decodingTable[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            decodingTable[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            decodingTable[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = Utf8.REPLACEMENT_BYTE;
    }

    public ArmoredInputStream(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public ArmoredInputStream(InputStream inputStream, boolean z2) throws IOException {
        this.start = true;
        this.outBuf = new int[3];
        this.bufPtr = 3;
        this.crc = new CRC24();
        this.crcFound = false;
        this.hasHeaders = true;
        this.header = null;
        this.newLineFound = false;
        this.clearText = false;
        this.restart = false;
        this.headerList = Strings.newList();
        this.lastC = 0;
        this.in = inputStream;
        this.hasHeaders = z2;
        if (z2) {
            parseHeaders();
        }
        this.start = false;
    }

    private int decode(int i2, int i3, int i4, int i5, int[] iArr) throws EOFException {
        if (i5 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        }
        if (i4 == 61) {
            byte[] bArr = decodingTable;
            iArr[2] = (-1) - (((-1) - ((((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 2) | ((bArr[i3] & 255) >> 4))) | ((-1) - 255));
            return 2;
        }
        if (i5 == 61) {
            byte[] bArr2 = decodingTable;
            byte b2 = bArr2[i2];
            byte b3 = bArr2[i3];
            byte b4 = bArr2[i4];
            iArr[1] = (-1) - (((-1) - ((b2 << 2) | (b3 >> 4))) | ((-1) - 255));
            int i6 = b3 << 4;
            int i7 = b4 >> 2;
            iArr[2] = ((i6 + i7) - (i6 & i7)) & 255;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b5 = bArr3[i2];
        byte b6 = bArr3[i3];
        byte b7 = bArr3[i4];
        byte b8 = bArr3[i5];
        int i8 = (b5 << 2) | (b6 >> 4);
        iArr[0] = (i8 + 255) - (i8 | 255);
        int i9 = b6 << 4;
        int i10 = b7 >> 2;
        int i11 = (i9 + i10) - (i9 & i10);
        iArr[1] = (i11 + 255) - (i11 | 255);
        iArr[2] = ((b7 << 6) | b8) & 255;
        return 0;
    }

    private boolean parseHeaders() throws IOException {
        int i2;
        boolean z2;
        this.header = null;
        this.headerList = Strings.newList();
        if (this.restart) {
            z2 = true;
            i2 = 0;
        } else {
            i2 = 0;
            while (true) {
                int i3 = this.in.read();
                if (i3 < 0) {
                    z2 = false;
                    break;
                }
                if (i3 == 45 && (i2 == 0 || i2 == 10 || i2 == 13)) {
                    break;
                }
                i2 = i3;
            }
            z2 = true;
        }
        if (z2) {
            StringBuffer stringBuffer = new StringBuffer(Global.HYPHEN);
            if (this.restart) {
                stringBuffer.append(Soundex.SILENT_MARKER);
            }
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                int i4 = this.in.read();
                if (i4 >= 0) {
                    if (i2 == 13 && i4 == 10) {
                        z4 = true;
                    }
                    if ((z3 && i2 != 13 && i4 == 10) || (z3 && i4 == 13)) {
                        break;
                    }
                    if (i4 == 13 || (i2 != 13 && i4 == 10)) {
                        String string = stringBuffer.toString();
                        if (string.trim().length() == 0) {
                            break;
                        }
                        this.headerList.add(string);
                        stringBuffer.setLength(0);
                    }
                    if (i4 != 10 && i4 != 13) {
                        stringBuffer.append((char) i4);
                        z3 = false;
                    } else if (i4 == 13 || (i2 != 13 && i4 == 10)) {
                        z3 = true;
                    }
                    i2 = i4;
                } else {
                    break;
                }
            }
            if (z4) {
                this.in.read();
            }
        }
        if (this.headerList.size() > 0) {
            this.header = this.headerList.get(0);
        }
        this.clearText = "-----BEGIN PGP SIGNED MESSAGE-----".equals(this.header);
        this.newLineFound = true;
        return z2;
    }

    private int readIgnoreSpace() throws IOException {
        int i2 = this.in.read();
        while (true) {
            if (i2 != 32 && i2 != 9) {
                return i2;
            }
            i2 = this.in.read();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    public String getArmorHeaderLine() {
        return this.header;
    }

    public String[] getArmorHeaders() {
        if (this.headerList.size() <= 1) {
            return null;
        }
        StringList stringList = this.headerList;
        return stringList.toStringArray(1, stringList.size());
    }

    public boolean isClearText() {
        return this.clearText;
    }

    public boolean isEndOfStream() {
        return this.isEndOfStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2;
        if (this.start) {
            if (this.hasHeaders) {
                parseHeaders();
            }
            this.crc.reset();
            this.start = false;
        }
        if (this.clearText) {
            int i3 = this.in.read();
            if (i3 == 13 || (i3 == 10 && this.lastC != 13)) {
                this.newLineFound = true;
            } else if (this.newLineFound && i3 == 45) {
                i3 = this.in.read();
                if (i3 == 45) {
                    this.clearText = false;
                    this.start = true;
                    this.restart = true;
                } else {
                    i3 = this.in.read();
                }
                this.newLineFound = false;
            } else if (i3 != 10 && this.lastC != 13) {
                this.newLineFound = false;
            }
            this.lastC = i3;
            if (i3 < 0) {
                this.isEndOfStream = true;
            }
            return i3;
        }
        if (this.bufPtr > 2 || this.crcFound) {
            int ignoreSpace = readIgnoreSpace();
            if (ignoreSpace == 13 || ignoreSpace == 10) {
                int ignoreSpace2 = readIgnoreSpace();
                while (true) {
                    if (ignoreSpace2 != 10 && ignoreSpace2 != 13) {
                        break;
                    }
                    ignoreSpace2 = readIgnoreSpace();
                }
                if (ignoreSpace2 < 0) {
                    this.isEndOfStream = true;
                    return -1;
                }
                if (ignoreSpace2 == 61) {
                    int iDecode = decode(readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
                    this.bufPtr = iDecode;
                    if (iDecode != 0) {
                        throw new IOException("no crc found in armored message.");
                    }
                    int[] iArr = this.outBuf;
                    int i4 = (-1) - (((-1) - (iArr[2] & 255)) & ((-1) - ((-1) - (((-1) - ((iArr[0] & 255) << 16)) & ((-1) - ((iArr[1] & 255) << 8))))));
                    this.crcFound = true;
                    if (i4 == this.crc.getValue()) {
                        return read();
                    }
                    throw new IOException("crc check failed in armored message.");
                }
                if (ignoreSpace2 == 45) {
                    do {
                        i2 = this.in.read();
                        if (i2 < 0 || i2 == 10) {
                            break;
                        }
                    } while (i2 != 13);
                    if (!this.crcFound) {
                        throw new IOException("crc check not found.");
                    }
                    this.crcFound = false;
                    this.start = true;
                    this.bufPtr = 3;
                    if (i2 < 0) {
                        this.isEndOfStream = true;
                    }
                    return -1;
                }
                this.bufPtr = decode(ignoreSpace2, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
            } else {
                if (ignoreSpace < 0) {
                    this.isEndOfStream = true;
                    return -1;
                }
                this.bufPtr = decode(ignoreSpace, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
            }
        }
        int[] iArr2 = this.outBuf;
        int i5 = this.bufPtr;
        this.bufPtr = i5 + 1;
        int i6 = iArr2[i5];
        this.crc.update(i6);
        return i6;
    }
}
