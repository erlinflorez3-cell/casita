package com.upokecenter.cbor;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.upokecenter.util.DataUtilities;
import java.io.IOException;
import java.io.OutputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
final class StringOutput {
    private final StringBuilder builder;
    private final OutputStream outputStream;

    public StringOutput(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.builder = null;
    }

    public StringOutput(StringBuilder sb) {
        this.builder = sb;
        this.outputStream = null;
    }

    public void WriteAscii(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("\"index\" (" + i2 + ") is not greater or equal to 0");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("\"index\" (" + i2 + ") is not less or equal to " + bArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(" (" + i3 + ") is not greater or equal to 0");
        }
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(" (" + i3 + ") is not less or equal to " + bArr.length);
        }
        if (bArr.length - i2 < i3) {
            throw new IllegalArgumentException("\"bytes\" + \"'s length minus \" + index (" + (bArr.length - i2) + ") is not greater or equal to " + i3);
        }
        if (this.outputStream == null) {
            DataUtilities.ReadUtf8FromBytes(bArr, i2, i3, this.builder, false);
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            byte b2 = bArr[i4 + i2];
            if ((127 & b2) != b2) {
                throw new IllegalArgumentException("str is non-ASCII");
            }
        }
        this.outputStream.write(bArr, i2, i3);
    }

    public void WriteCodePoint(int i2) throws IOException {
        if ((i2 >> 7) == 0) {
            OutputStream outputStream = this.outputStream;
            if (outputStream == null) {
                this.builder.append((char) i2);
                return;
            } else {
                outputStream.write((byte) i2);
                return;
            }
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("codePoint(" + i2 + ") is less than 0");
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("codePoint(" + i2 + ") is more than 1114111");
        }
        OutputStream outputStream2 = this.outputStream;
        if (outputStream2 == null) {
            if ((16775168 + i2) - (16775168 | i2) == 55296) {
                throw new IllegalArgumentException("ch is a surrogate");
            }
            if (i2 <= 65535) {
                this.builder.append((char) i2);
                return;
            }
            if (i2 <= 1114111) {
                int i3 = i2 - 65536;
                int i4 = i3 >> 10;
                int i5 = (i4 + 1023) - (i4 | 1023);
                this.builder.append((char) ((i5 + 55296) - (i5 & 55296)));
                this.builder.append((char) (((-1) - (((-1) - i3) | ((-1) - 1023))) | Utf8.LOG_SURROGATE_HEADER));
                return;
            }
            return;
        }
        if (i2 < 128) {
            outputStream2.write((byte) i2);
            return;
        }
        if (i2 <= 2047) {
            outputStream2.write((byte) (((i2 >> 6) & 31) | 192));
            this.outputStream.write((byte) ((i2 & 63) | 128));
            return;
        }
        if (i2 <= 65535) {
            if ((63488 & i2) == 55296) {
                throw new IllegalArgumentException("ch is a surrogate");
            }
            outputStream2.write((byte) ((-1) - (((-1) - ((i2 >> 12) & 15)) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY))));
            int i6 = i2 >> 6;
            int i7 = (i6 + 63) - (i6 | 63);
            this.outputStream.write((byte) ((i7 + 128) - (i7 & 128)));
            this.outputStream.write((byte) ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 63)))) & ((-1) - 128))));
            return;
        }
        int i8 = (-1) - (((-1) - (i2 >> 18)) | ((-1) - 7));
        outputStream2.write((byte) ((i8 + 240) - (i8 & 240)));
        this.outputStream.write((byte) (((i2 >> 12) & 63) | 128));
        int i9 = (-1) - (((-1) - (i2 >> 6)) | ((-1) - 63));
        this.outputStream.write((byte) ((i9 + 128) - (i9 & 128)));
        int i10 = (-1) - (((-1) - i2) | ((-1) - 63));
        this.outputStream.write((byte) ((i10 + 128) - (i10 & 128)));
    }

    public void WriteString(String str) throws IOException {
        if (this.outputStream == null) {
            this.builder.append(str);
        } else if (str.length() == 1) {
            WriteCodePoint(str.charAt(0));
        } else if (DataUtilities.WriteUtf8(str, 0, str.length(), this.outputStream, false) < 0) {
            throw new IllegalArgumentException("str has an unpaired surrogate");
        }
    }

    public void WriteString(String str, int i2, int i3) throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            this.builder.append((CharSequence) str, i2, i3 + i2);
        } else if (i3 == 1) {
            WriteCodePoint(str.charAt(i2));
        } else if (DataUtilities.WriteUtf8(str, i2, i3, outputStream, false) < 0) {
            throw new IllegalArgumentException("str has an unpaired surrogate");
        }
    }
}
