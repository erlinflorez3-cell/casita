package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes9.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;
    private static final byte[] S = {41, 46, 67, MessagePack.Code.EXT32, -94, MessagePack.Code.FIXEXT16, 124, 1, Base64.padSymbol, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, MessagePack.Code.NIL, MessagePack.Code.EXT8, 115, -116, -104, -109, 43, MessagePack.Code.STR8, -68, 76, -126, MessagePack.Code.FLOAT32, Ascii.RS, -101, 87, 60, -3, MessagePack.Code.FIXEXT1, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.SYN, 103, 66, 111, Ascii.CAN, -118, Ascii.ETB, -27, Ascii.DC2, -66, 78, MessagePack.Code.BIN8, MessagePack.Code.FIXEXT4, MessagePack.Code.STR16, -98, MessagePack.Code.MAP16, 73, MessagePack.Code.FIXSTR_PREFIX, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, Ascii.NAK, -78, 7, Utf8.REPLACEMENT_BYTE, -108, MessagePack.Code.FALSE, 16, -119, Ascii.VT, 34, 95, 33, -128, 127, 93, -102, 90, MessagePack.Code.FIXARRAY_PREFIX, 50, 39, 53, 62, MessagePack.Code.UINT8, -25, -65, -9, -105, 3, -1, Ascii.EM, 48, -77, 72, -91, -75, MessagePack.Code.INT16, MessagePack.Code.FIXEXT8, 94, -110, 42, -84, 86, -86, MessagePack.Code.BIN32, 79, -72, 56, MessagePack.Code.INT32, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, MessagePack.Code.UINT64, 101, -26, 45, -88, 2, Ascii.ESC, 96, 37, -83, -82, -80, -71, -10, Ascii.FS, 70, 97, 105, 52, 64, 126, Ascii.SI, 85, 71, -93, 35, MessagePack.Code.ARRAY32, 81, -81, 58, MessagePack.Code.TRUE, 92, -7, MessagePack.Code.UINT32, -70, MessagePack.Code.BIN16, -22, 38, 44, 83, Ascii.CR, 110, -123, 40, -124, 9, MessagePack.Code.INT64, MessagePack.Code.MAP32, MessagePack.Code.UINT16, -12, 65, -127, 77, 82, 106, MessagePack.Code.ARRAY16, 55, MessagePack.Code.EXT16, 108, MessagePack.Code.NEVER_USED, -85, -6, 36, -31, 123, 8, Ascii.FF, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, MessagePack.Code.FLOAT64, MessagePack.Code.FIXEXT2, -2, 59, 0, Ascii.GS, 57, -14, -17, -73, Ascii.SO, 102, 88, MessagePack.Code.INT8, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, Ascii.US, Ascii.SUB, MessagePack.Code.STR32, -103, -115, 51, -97, 17, -125, Ascii.DC4};
    private byte[] C;
    private int COff;
    private byte[] M;
    private byte[] X;
    private int mOff;
    private int xOff;

    public MD2Digest() {
        this.X = new byte[48];
        this.M = new byte[16];
        this.C = new byte[16];
        reset();
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.X = new byte[48];
        this.M = new byte[16];
        this.C = new byte[16];
        copyIn(mD2Digest);
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.X;
        System.arraycopy(bArr, 0, this.X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.M;
        System.arraycopy(bArr2, 0, this.M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.C;
        System.arraycopy(bArr3, 0, this.C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i2) {
        int length = this.M.length;
        int i3 = this.mOff;
        byte b2 = (byte) (length - i3);
        while (true) {
            byte[] bArr2 = this.M;
            if (i3 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.M);
                processBlock(this.C);
                System.arraycopy(this.X, this.xOff, bArr, i2, 16);
                reset();
                return 16;
            }
            bArr2[i3] = b2;
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return MessageDigestAlgorithms.MD2;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    protected void processBlock(byte[] bArr) {
        for (int i2 = 0; i2 < 16; i2++) {
            byte[] bArr2 = this.X;
            bArr2[i2 + 16] = bArr[i2];
            bArr2[i2 + 32] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 18; i4++) {
            for (int i5 = 0; i5 < 48; i5++) {
                byte[] bArr3 = this.X;
                byte b2 = (byte) (S[i3] ^ bArr3[i5]);
                bArr3[i5] = b2;
                i3 = (-1) - (((-1) - b2) | ((-1) - 255));
            }
            i3 = (i3 + i4) % 256;
        }
    }

    protected void processCheckSum(byte[] bArr) {
        byte b2 = this.C[15];
        for (int i2 = 0; i2 < 16; i2++) {
            byte[] bArr2 = this.C;
            byte b3 = bArr2[i2];
            byte[] bArr3 = S;
            int i3 = b2 ^ bArr[i2];
            b2 = (byte) (bArr3[(i3 + 255) - (i3 | 255)] ^ b3);
            bArr2[i2] = b2;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.X;
            if (i2 == bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.mOff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.M;
            if (i3 == bArr2.length) {
                break;
            }
            bArr2[i3] = 0;
            i3++;
        }
        this.COff = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.C;
            if (i4 == bArr3.length) {
                return;
            }
            bArr3[i4] = 0;
            i4++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.M;
        int i2 = this.mOff;
        int i3 = i2 + 1;
        this.mOff = i3;
        bArr[i2] = b2;
        if (i3 == 16) {
            processCheckSum(bArr);
            processBlock(this.M);
            this.mOff = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i2, int i3) {
        while (this.mOff != 0 && i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
        while (i3 > 16) {
            System.arraycopy(bArr, i2, this.M, 0, 16);
            processCheckSum(this.M);
            processBlock(this.M);
            i3 -= 16;
            i2 += 16;
        }
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
