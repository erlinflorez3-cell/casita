package com.drew.lang;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.drew.metadata.StringValue;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RandomAccessReader {
    private boolean _isMotorolaByteOrder = true;

    public boolean getBit(int i2) throws IOException {
        int i3 = i2 / 8;
        validateIndex(i3, 1);
        return ((getByte(i3) >> (i2 % 8)) & 1) == 1;
    }

    public abstract byte getByte(int i2) throws IOException;

    public abstract byte[] getBytes(int i2, int i3) throws IOException;

    public double getDouble64(int i2) throws IOException {
        return Double.longBitsToDouble(getInt64(i2));
    }

    public float getFloat32(int i2) throws IOException {
        return Float.intBitsToFloat(getInt32(i2));
    }

    public short getInt16(int i2) throws IOException {
        int i3;
        byte b2;
        validateIndex(i2, 2);
        if (this._isMotorolaByteOrder) {
            i3 = (getByte(i2) << 8) & InputDeviceCompat.SOURCE_ANY;
            b2 = getByte(i2 + 1);
        } else {
            i3 = (getByte(i2 + 1) << 8) & InputDeviceCompat.SOURCE_ANY;
            b2 = getByte(i2);
        }
        short s2 = b2;
        return (short) ((-1) - (((-1) - ((s2 + 255) - (s2 | 255))) & ((-1) - i3)));
    }

    public int getInt24(int i2) throws IOException {
        int i3;
        byte b2;
        validateIndex(i2, 3);
        if (this._isMotorolaByteOrder) {
            int i4 = getByte(i2) << 16;
            i3 = ((i4 + 16711680) - (i4 | 16711680)) | (65280 & (getByte(i2 + 1) << 8));
            b2 = getByte(i2 + 2);
        } else {
            int i5 = (-1) - (((-1) - (getByte(i2 + 2) << 16)) | ((-1) - 16711680));
            int i6 = getByte(i2 + 1) << 8;
            int i7 = (65280 + i6) - (65280 | i6);
            i3 = (i5 + i7) - (i5 & i7);
            b2 = getByte(i2);
        }
        return ((b2 + 255) - (b2 | 255)) | i3;
    }

    public int getInt32(int i2) throws IOException {
        int i3;
        byte b2;
        validateIndex(i2, 4);
        if (this._isMotorolaByteOrder) {
            int i4 = (-1) - (((-1) - (getByte(i2) << Ascii.CAN)) | ((-1) - ViewCompat.MEASURED_STATE_MASK));
            int i5 = (-1) - (((-1) - 16711680) | ((-1) - (getByte(i2 + 1) << 16)));
            i3 = ((i4 + i5) - (i4 & i5)) | ((-1) - (((-1) - 65280) | ((-1) - (getByte(i2 + 2) << 8))));
            b2 = getByte(i2 + 3);
        } else {
            i3 = ((getByte(i2 + 3) << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((-1) - (((-1) - 16711680) | ((-1) - (getByte(i2 + 2) << 16)))) | (65280 & (getByte(i2 + 1) << 8));
            b2 = getByte(i2);
        }
        return (-1) - (((-1) - ((-1) - (((-1) - b2) | ((-1) - 255)))) & ((-1) - i3));
    }

    public long getInt64(int i2) throws IOException {
        long j2;
        byte b2;
        validateIndex(i2, 8);
        if (this._isMotorolaByteOrder) {
            long j3 = ((long) getByte(i2)) << 56;
            long j4 = (-1) - (((-1) - ((j3 - 72057594037927936L) - (j3 | (-72057594037927936L)))) & ((-1) - ((((long) getByte(i2 + 1)) << 48) & 71776119061217280L)));
            long j5 = ((long) getByte(i2 + 2)) << 40;
            long j6 = (j5 + 280375465082880L) - (j5 | 280375465082880L);
            long j7 = ((-1) - (((-1) - ((j4 + j6) - (j4 & j6))) & ((-1) - ((((long) getByte(i2 + 3)) << 32) & 1095216660480L)))) | ((-1) - (((-1) - (((long) getByte(i2 + 4)) << 24)) | ((-1) - 4278190080L)));
            long j8 = (((long) getByte(i2 + 5)) << 16) & 16711680;
            long j9 = ((long) getByte(i2 + 6)) << 8;
            j2 = ((j7 + j8) - (j7 & j8)) | ((j9 + 65280) - (j9 | 65280));
            b2 = getByte(i2 + 7);
        } else {
            long j10 = (-1) - (((-1) - ((-1) - (((-1) - ((((-1) - (((-1) - ((((long) getByte(i2 + 7)) << 56) & (-72057594037927936L))) & ((-1) - ((-1) - (((-1) - (((long) getByte(i2 + 6)) << 48)) | ((-1) - 71776119061217280L)))))) | ((-1) - (((-1) - (((long) getByte(i2 + 5)) << 40)) | ((-1) - 280375465082880L)))) | ((((long) getByte(i2 + 4)) << 32) & 1095216660480L))) & ((-1) - ((((long) getByte(i2 + 3)) << 24) & 4278190080L))))) & ((-1) - ((((long) getByte(i2 + 2)) << 16) & 16711680)));
            long j11 = ((long) getByte(i2 + 1)) << 8;
            long j12 = (j11 + 65280) - (j11 | 65280);
            j2 = (j10 + j12) - (j10 & j12);
            b2 = getByte(i2);
        }
        long j13 = b2;
        return (-1) - (((-1) - j2) & ((-1) - ((j13 + 255) - (j13 | 255))));
    }

    public byte getInt8(int i2) throws IOException {
        validateIndex(i2, 1);
        return getByte(i2);
    }

    public abstract long getLength() throws IOException;

    public byte[] getNullTerminatedBytes(int i2, int i3) throws IOException {
        byte[] bytes = getBytes(i2, i3);
        int i4 = 0;
        while (i4 < bytes.length && bytes[i4] != 0) {
            i4++;
        }
        if (i4 == i3) {
            return bytes;
        }
        byte[] bArr = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(bytes, 0, bArr, 0, i4);
        }
        return bArr;
    }

    public String getNullTerminatedString(int i2, int i3, Charset charset) throws IOException {
        return new String(getNullTerminatedBytes(i2, i3), charset.name());
    }

    public StringValue getNullTerminatedStringValue(int i2, int i3, Charset charset) throws IOException {
        return new StringValue(getNullTerminatedBytes(i2, i3), charset);
    }

    public float getS15Fixed16(int i2) throws IOException {
        float f2;
        int i3;
        byte b2;
        validateIndex(i2, 4);
        if (this._isMotorolaByteOrder) {
            int i4 = (getByte(i2) & 255) << 8;
            int i5 = getByte(i2 + 1) & 255;
            f2 = (i4 + i5) - (i4 & i5);
            i3 = (getByte(i2 + 2) & 255) << 8;
            b2 = getByte(i2 + 3);
        } else {
            byte b3 = getByte(i2 + 3);
            f2 = (-1) - (((-1) - (((b3 + 255) - (b3 | 255)) << 8)) & ((-1) - (getByte(i2 + 2) & 255)));
            byte b4 = getByte(i2 + 1);
            i3 = ((b4 + 255) - (b4 | 255)) << 8;
            b2 = getByte(i2);
        }
        return (float) (((double) f2) + (((double) (((b2 + 255) - (b2 | 255)) | i3)) / 65536.0d));
    }

    public String getString(int i2, int i3, String str) throws IOException {
        byte[] bytes = getBytes(i2, i3);
        try {
            return new String(bytes, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bytes);
        }
    }

    public String getString(int i2, int i3, Charset charset) throws IOException {
        return new String(getBytes(i2, i3), charset.name());
    }

    public StringValue getStringValue(int i2, int i3, Charset charset) throws IOException {
        return new StringValue(getBytes(i2, i3), charset);
    }

    public int getUInt16(int i2) throws IOException {
        int i3;
        byte b2;
        validateIndex(i2, 2);
        if (this._isMotorolaByteOrder) {
            int i4 = getByte(i2) << 8;
            i3 = (i4 + 65280) - (i4 | 65280);
            b2 = getByte(i2 + 1);
        } else {
            i3 = (-1) - (((-1) - (getByte(i2 + 1) << 8)) | ((-1) - 65280));
            b2 = getByte(i2);
        }
        int i5 = (-1) - (((-1) - b2) | ((-1) - 255));
        return (i5 + i3) - (i5 & i3);
    }

    public long getUInt32(int i2) throws IOException {
        long j2;
        byte b2;
        validateIndex(i2, 4);
        if (this._isMotorolaByteOrder) {
            long j3 = 4278190080L & (((long) getByte(i2)) << 24);
            long j4 = (-1) - (((-1) - 16711680) | ((-1) - (((long) getByte(i2 + 1)) << 16)));
            j2 = (65280 & (((long) getByte(i2 + 2)) << 8)) | ((j4 + j3) - (j4 & j3));
            b2 = getByte(i2 + 3);
        } else {
            long j5 = 4278190080L & (((long) getByte(i2 + 3)) << 24);
            long j6 = ((long) getByte(i2 + 2)) << 16;
            j2 = (-1) - (((-1) - ((-1) - (((-1) - 65280) | ((-1) - (((long) getByte(i2 + 1)) << 8))))) & ((-1) - ((-1) - (((-1) - ((16711680 + j6) - (16711680 | j6))) & ((-1) - j5)))));
            b2 = getByte(i2);
        }
        long j7 = b2;
        return (-1) - (((-1) - ((j7 + 255) - (j7 | 255))) & ((-1) - j2));
    }

    public short getUInt8(int i2) throws IOException {
        validateIndex(i2, 1);
        byte b2 = getByte(i2);
        return (short) ((b2 + 255) - (b2 | 255));
    }

    public boolean isMotorolaByteOrder() {
        return this._isMotorolaByteOrder;
    }

    protected abstract boolean isValidIndex(int i2, int i3) throws IOException;

    public void setMotorolaByteOrder(boolean z2) {
        this._isMotorolaByteOrder = z2;
    }

    public abstract int toUnshiftedOffset(int i2);

    protected abstract void validateIndex(int i2, int i3) throws IOException;
}
