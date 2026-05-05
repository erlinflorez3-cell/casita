package org.bouncycastle.crypto.prng;

import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.util.Pack;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f27614n = 0;
    private byte[] P = {-69, 44, 98, 127, -75, -86, MessagePack.Code.FIXEXT1, Ascii.CR, -127, -2, -78, -126, MessagePack.Code.FLOAT64, MessagePack.Code.FIXSTR_PREFIX, -95, 8, Ascii.CAN, 113, 86, -24, 73, 2, 16, MessagePack.Code.BIN8, MessagePack.Code.MAP16, 53, -91, -20, -128, Ascii.DC2, -72, 105, MessagePack.Code.STR16, 47, 117, MessagePack.Code.UINT8, -94, 9, 54, 3, 97, 45, -3, MessagePack.Code.NEGFIXINT_PREFIX, MessagePack.Code.ARRAY32, 5, 67, MessagePack.Code.FIXARRAY_PREFIX, -83, MessagePack.Code.EXT16, -31, -81, 87, -101, 76, MessagePack.Code.FIXEXT16, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, MessagePack.Code.EXT32, -125, -105, 70, -79, -103, 100, 49, 119, MessagePack.Code.FIXEXT2, Ascii.GS, MessagePack.Code.FIXEXT4, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, MessagePack.Code.BIN16, MessagePack.Code.INT64, -9, -68, 111, MessagePack.Code.MAP32, 4, -27, -107, 62, 37, -122, -90, Ascii.VT, -113, -15, 36, Ascii.SO, MessagePack.Code.FIXEXT8, 64, -77, MessagePack.Code.UINT64, 126, 6, Ascii.NAK, -102, 77, Ascii.FS, -93, MessagePack.Code.STR32, 50, -110, 88, 17, 39, -12, 89, MessagePack.Code.INT8, 78, 106, Ascii.ETB, 91, -84, -1, 7, MessagePack.Code.NIL, 101, 121, -4, MessagePack.Code.EXT8, MessagePack.Code.UINT16, 118, 66, 93, -25, 58, 52, 122, 48, 40, Ascii.SI, 115, 1, -7, MessagePack.Code.INT16, MessagePack.Code.INT32, Ascii.EM, -23, -111, -71, 90, -19, 65, 109, -76, MessagePack.Code.TRUE, -98, -65, 99, -6, Ascii.US, 51, 96, 71, -119, -16, -106, Ascii.SUB, 95, -109, Base64.padSymbol, 55, 75, MessagePack.Code.STR8, -88, MessagePack.Code.NEVER_USED, Ascii.ESC, -10, 57, -117, -73, Ascii.FF, 32, MessagePack.Code.UINT32, -120, 110, -74, 116, -114, -115, Ascii.SYN, 41, -14, -121, -11, -21, 112, -29, -5, 85, -97, MessagePack.Code.BIN32, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, Ascii.RS, -99, MessagePack.Code.ARRAY16, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, 33, -17, -22, -66, MessagePack.Code.FLOAT32, 114, 79, 82, -104, Utf8.REPLACEMENT_BYTE, MessagePack.Code.FALSE, Ascii.DC4, 123, 59, 84};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f27615s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j2) {
        addSeedMaterial(Pack.longToBigEndian(j2));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b2 : bArr) {
            byte[] bArr2 = this.P;
            byte b3 = this.f27615s;
            byte b4 = this.f27614n;
            byte b5 = bArr2[(b3 + bArr2[255 & b4] + b2) & 255];
            this.f27615s = b5;
            byte b6 = bArr2[255 & b4];
            bArr2[(-1) - (((-1) - b4) | ((-1) - 255))] = bArr2[(-1) - (((-1) - b5) | ((-1) - 255))];
            bArr2[(b5 + 255) - (b5 | 255)] = b6;
            int i2 = b4 + 1;
            this.f27614n = (byte) ((i2 + 255) - (i2 | 255));
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i2, int i3) {
        synchronized (this.P) {
            int i4 = i3 + i2;
            while (i2 != i4) {
                byte[] bArr2 = this.P;
                byte b2 = this.f27615s;
                byte b3 = this.f27614n;
                byte b4 = bArr2[(b2 + bArr2[255 & b3]) & 255];
                this.f27615s = b4;
                bArr[i2] = bArr2[(-1) - (((-1) - (bArr2[(-1) - (((-1) - bArr2[255 & b4]) | ((-1) - 255))] + 1)) | ((-1) - 255))];
                byte b5 = bArr2[255 & b3];
                bArr2[b3 & 255] = bArr2[255 & b4];
                bArr2[(b4 + 255) - (b4 | 255)] = b5;
                this.f27614n = (byte) ((-1) - (((-1) - (b3 + 1)) | ((-1) - 255)));
                i2++;
            }
        }
    }
}
