package com.drew.lang;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.drew.metadata.StringValue;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SequentialReader {
    private boolean _isMotorolaByteOrder = true;

    public abstract int available();

    public abstract byte getByte() throws IOException;

    public abstract void getBytes(byte[] bArr, int i2, int i3) throws IOException;

    public abstract byte[] getBytes(int i2) throws IOException;

    public double getDouble64() throws IOException {
        return Double.longBitsToDouble(getInt64());
    }

    public float getFloat32() throws IOException {
        return Float.intBitsToFloat(getInt32());
    }

    public short getInt16() throws IOException {
        int i2;
        int i3;
        if (this._isMotorolaByteOrder) {
            int i4 = getByte() << 8;
            i2 = (i4 + InputDeviceCompat.SOURCE_ANY) - (i4 | InputDeviceCompat.SOURCE_ANY);
            i3 = (-1) - (((-1) - getByte()) | ((-1) - 255));
        } else {
            i2 = getByte() & 255;
            i3 = (-1) - (((-1) - (getByte() << 8)) | ((-1) - InputDeviceCompat.SOURCE_ANY));
        }
        return (short) ((i2 + i3) - (i2 & i3));
    }

    public int getInt32() throws IOException {
        int i2;
        int i3;
        if (this._isMotorolaByteOrder) {
            int i4 = ((-1) - (((-1) - (getByte() << Ascii.CAN)) | ((-1) - ViewCompat.MEASURED_STATE_MASK))) | ((getByte() << 16) & 16711680);
            int i5 = (getByte() << 8) & 65280;
            i2 = (i4 + i5) - (i4 & i5);
            i3 = (-1) - (((-1) - getByte()) | ((-1) - 255));
        } else {
            int i6 = ((-1) - (((-1) - getByte()) | ((-1) - 255))) | ((-1) - (((-1) - 65280) | ((-1) - (getByte() << 8))));
            int i7 = 16711680 & (getByte() << 16);
            i2 = (i6 + i7) - (i6 & i7);
            i3 = (-16777216) & (getByte() << Ascii.CAN);
        }
        return (i2 + i3) - (i2 & i3);
    }

    public long getInt64() throws IOException {
        long j2;
        long j3;
        if (this._isMotorolaByteOrder) {
            long j4 = (-1) - (((-1) - ((((((long) getByte()) << 56) & (-72057594037927936L)) | ((-1) - (((-1) - (((long) getByte()) << 48)) | ((-1) - 71776119061217280L)))) | ((((long) getByte()) << 40) & 280375465082880L))) & ((-1) - ((((long) getByte()) << 32) & 1095216660480L)));
            long j5 = ((long) getByte()) << 24;
            long j6 = (-1) - (((-1) - j4) & ((-1) - ((j5 + 4278190080L) - (j5 | 4278190080L))));
            long j7 = (((long) getByte()) << 16) & 16711680;
            j2 = (-1) - (((-1) - ((j6 + j7) - (j6 & j7))) & ((-1) - ((-1) - (((-1) - (((long) getByte()) << 8)) | ((-1) - 65280)))));
            j3 = (-1) - (((-1) - ((long) getByte())) | ((-1) - 255));
        } else {
            long j8 = ((long) getByte()) & 255;
            long j9 = ((long) getByte()) << 8;
            long j10 = (-1) - (((-1) - ((j9 + 65280) - (j9 | 65280))) & ((-1) - j8));
            long j11 = ((long) getByte()) << 16;
            long j12 = (-1) - (((-1) - (j10 | ((j11 + 16711680) - (j11 | 16711680)))) & ((-1) - ((((long) getByte()) << 24) & 4278190080L)));
            long j13 = ((long) getByte()) << 32;
            long j14 = j12 | ((1095216660480L + j13) - (1095216660480L | j13));
            long j15 = 280375465082880L & (((long) getByte()) << 40);
            long j16 = (j14 + j15) - (j14 & j15);
            long j17 = ((long) getByte()) << 48;
            long j18 = (71776119061217280L + j17) - (71776119061217280L | j17);
            j2 = (j16 + j18) - (j16 & j18);
            j3 = (-1) - (((-1) - (((long) getByte()) << 56)) | ((-1) - (-72057594037927936L)));
        }
        return (j2 + j3) - (j2 & j3);
    }

    public byte getInt8() throws IOException {
        return getByte();
    }

    public byte[] getNullTerminatedBytes(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            byte b2 = getByte();
            bArr[i3] = b2;
            if (b2 == 0) {
                break;
            }
            i3++;
        }
        if (i3 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        if (i3 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i3);
        }
        return bArr2;
    }

    public String getNullTerminatedString(int i2, Charset charset) throws IOException {
        return getNullTerminatedStringValue(i2, charset).toString();
    }

    public StringValue getNullTerminatedStringValue(int i2, Charset charset) throws IOException {
        return new StringValue(getNullTerminatedBytes(i2), charset);
    }

    public abstract long getPosition() throws IOException;

    public float getS15Fixed16() throws IOException {
        if (!this._isMotorolaByteOrder) {
            byte b2 = getByte();
            return (float) (((double) ((-1) - (((-1) - (getByte() & 255)) & ((-1) - (((-1) - (((-1) - getByte()) | ((-1) - 255))) << 8))))) + (((double) ((-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - (((-1) - (((-1) - getByte()) | ((-1) - 255))) << 8))))) / 65536.0d));
        }
        byte b3 = getByte();
        int i2 = ((b3 + 255) - (b3 | 255)) << 8;
        byte b4 = getByte();
        float f2 = (-1) - (((-1) - i2) & ((-1) - ((b4 + 255) - (b4 | 255))));
        int i3 = (getByte() & 255) << 8;
        byte b5 = getByte();
        return (float) (((double) f2) + (((double) (i3 | ((b5 + 255) - (b5 | 255)))) / 65536.0d));
    }

    public String getString(int i2) throws IOException {
        return new String(getBytes(i2));
    }

    public String getString(int i2, String str) throws IOException {
        byte[] bytes = getBytes(i2);
        try {
            return new String(bytes, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bytes);
        }
    }

    public String getString(int i2, Charset charset) throws IOException {
        return new String(getBytes(i2), charset);
    }

    public StringValue getStringValue(int i2, Charset charset) throws IOException {
        return new StringValue(getBytes(i2), charset);
    }

    public int getUInt16() throws IOException {
        int i2;
        int i3;
        if (this._isMotorolaByteOrder) {
            int i4 = getByte() << 8;
            i2 = (i4 + 65280) - (i4 | 65280);
            i3 = (-1) - (((-1) - getByte()) | ((-1) - 255));
        } else {
            i2 = (-1) - (((-1) - getByte()) | ((-1) - 255));
            i3 = 65280 & (getByte() << 8);
        }
        return (-1) - (((-1) - i2) & ((-1) - i3));
    }

    public long getUInt32() throws IOException {
        if (this._isMotorolaByteOrder) {
            long j2 = ((((long) getByte()) << 24) & 4278190080L) | ((((long) getByte()) << 16) & 16711680);
            long j3 = (-1) - (((-1) - (((long) getByte()) << 8)) | ((-1) - 65280));
            long j4 = (j2 + j3) - (j2 & j3);
            long j5 = getByte();
            long j6 = (j5 + 255) - (j5 | 255);
            return (j4 + j6) - (j4 & j6);
        }
        long j7 = 255 & ((long) getByte());
        long j8 = ((long) getByte()) << 8;
        long j9 = (-1) - (((-1) - ((65280 + j8) - (65280 | j8))) & ((-1) - j7));
        long j10 = ((long) getByte()) << 16;
        long j11 = (16711680 + j10) - (16711680 | j10);
        return (-1) - (((-1) - ((((long) getByte()) << 24) & 4278190080L)) & ((-1) - ((j11 + j9) - (j11 & j9))));
    }

    public short getUInt8() throws IOException {
        byte b2 = getByte();
        return (short) ((b2 + 255) - (b2 | 255));
    }

    public boolean isMotorolaByteOrder() {
        return this._isMotorolaByteOrder;
    }

    public void setMotorolaByteOrder(boolean z2) {
        this._isMotorolaByteOrder = z2;
    }

    public abstract void skip(long j2) throws IOException;

    public abstract boolean trySkip(long j2) throws IOException;
}
