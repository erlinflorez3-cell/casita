package com.adobe.internal.xmp.impl;

import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBuffer {
    private byte[] buffer;
    private String encoding;
    private int length;

    public ByteBuffer(int i2) {
        this.encoding = null;
        this.buffer = new byte[i2];
        this.length = 0;
    }

    public ByteBuffer(InputStream inputStream) throws IOException {
        this.encoding = null;
        this.length = 0;
        this.buffer = new byte[16384];
        while (true) {
            int i2 = inputStream.read(this.buffer, this.length, 16384);
            if (i2 <= 0) {
                return;
            }
            int i3 = this.length + i2;
            this.length = i3;
            if (i2 != 16384) {
                return;
            } else {
                ensureCapacity(i3 + 16384);
            }
        }
    }

    public ByteBuffer(byte[] bArr) {
        this.encoding = null;
        this.buffer = bArr;
        this.length = bArr.length;
    }

    public ByteBuffer(byte[] bArr, int i2) {
        this.encoding = null;
        if (i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
        }
        this.buffer = bArr;
        this.length = i2;
    }

    public ByteBuffer(byte[] bArr, int i2, int i3) {
        this.encoding = null;
        if (i3 > bArr.length - i2) {
            throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
        }
        byte[] bArr2 = new byte[i3];
        this.buffer = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.length = i3;
    }

    private void ensureCapacity(int i2) {
        byte[] bArr = this.buffer;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            this.buffer = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public void append(byte b2) {
        ensureCapacity(this.length + 1);
        byte[] bArr = this.buffer;
        int i2 = this.length;
        this.length = i2 + 1;
        bArr[i2] = b2;
    }

    public void append(ByteBuffer byteBuffer) {
        append(byteBuffer.buffer, 0, byteBuffer.length);
    }

    public void append(byte[] bArr) {
        append(bArr, 0, bArr.length);
    }

    public void append(byte[] bArr, int i2, int i3) {
        ensureCapacity(this.length + i3);
        System.arraycopy(bArr, i2, this.buffer, this.length, i3);
        this.length += i3;
    }

    public byte byteAt(int i2) {
        if (i2 < this.length) {
            return this.buffer[i2];
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public int charAt(int i2) {
        if (i2 < this.length) {
            return this.buffer[i2] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public InputStream getByteStream() {
        return new ByteArrayInputStream(this.buffer, 0, this.length);
    }

    public String getEncoding() {
        if (this.encoding == null) {
            int i2 = this.length;
            if (i2 < 2) {
                this.encoding = "UTF-8";
            } else {
                byte[] bArr = this.buffer;
                byte b2 = bArr[0];
                if (b2 == 0) {
                    if (i2 < 4 || bArr[1] != 0) {
                        this.encoding = "UTF-16BE";
                    } else if ((bArr[2] & 255) == 254 && (-1) - (((-1) - bArr[3]) | ((-1) - 255)) == 255) {
                        this.encoding = "UTF-32BE";
                    } else {
                        this.encoding = "UTF-32";
                    }
                } else if ((-1) - (((-1) - b2) | ((-1) - 255)) < 128) {
                    if (bArr[1] != 0) {
                        this.encoding = "UTF-8";
                    } else if (i2 < 4 || bArr[2] != 0) {
                        this.encoding = "UTF-16LE";
                    } else {
                        this.encoding = "UTF-32LE";
                    }
                } else if ((b2 + 255) - (255 | b2) == 239) {
                    this.encoding = "UTF-8";
                } else if ((b2 & 255) != 254 && i2 >= 4 && bArr[2] == 0) {
                    this.encoding = "UTF-32";
                } else {
                    this.encoding = HTTP.UTF_16;
                }
            }
        }
        return this.encoding;
    }

    public int length() {
        return this.length;
    }
}
