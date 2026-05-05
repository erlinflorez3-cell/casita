package org.spongycastle.crypto.engines;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;
    private long A0;
    private long A1;
    private long A2;
    private long A3;
    private int BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, Ascii.EM, 1, 50, 2, Ascii.SUB, MessagePack.Code.BIN32, 75, MessagePack.Code.EXT8, Ascii.ESC, 104, 51, -18, MessagePack.Code.MAP32, 3, 100, 4, MessagePack.Code.NEGFIXINT_PREFIX, Ascii.SO, 52, -115, -127, -17, 76, 113, 8, MessagePack.Code.EXT16, -8, 105, Ascii.FS, MessagePack.Code.NEVER_USED, 125, MessagePack.Code.FALSE, Ascii.GS, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, MessagePack.Code.EXT32, 9, 120, 101, 47, -118, 5, 33, Ascii.SI, -31, 36, Ascii.DC2, -16, -126, 69, 53, -109, MessagePack.Code.STR16, -114, -106, -113, MessagePack.Code.STR32, -67, 54, MessagePack.Code.INT8, MessagePack.Code.UINT32, -108, 19, 92, MessagePack.Code.INT32, -15, 64, 70, -125, 56, 102, MessagePack.Code.ARRAY32, -3, 48, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, MessagePack.Code.TRUE, -93, -74, Ascii.RS, 66, 58, 107, 40, 84, -6, -123, Base64.padSymbol, -70, 43, 121, 10, Ascii.NAK, -101, -97, 94, MessagePack.Code.FLOAT32, 78, MessagePack.Code.FIXEXT1, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, MessagePack.Code.FIXEXT4, 116, 79, -82, -23, MessagePack.Code.FIXEXT2, -25, -26, -83, -24, 44, MessagePack.Code.FIXEXT8, 117, 122, -21, Ascii.SYN, Ascii.VT, -11, 89, MessagePack.Code.FLOAT64, 95, -80, -100, -87, 81, MessagePack.Code.FIXSTR_PREFIX, 127, Ascii.FF, -10, 111, Ascii.ETB, MessagePack.Code.BIN8, 73, -20, MessagePack.Code.FIXEXT16, 67, Ascii.US, 45, -92, 118, 123, -73, MessagePack.Code.UINT8, -69, 62, 90, -5, 96, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, MessagePack.Code.FIXARRAY_PREFIX, 97, -66, MessagePack.Code.ARRAY16, -4, -68, -107, MessagePack.Code.UINT64, MessagePack.Code.UINT16, 55, Utf8.REPLACEMENT_BYTE, 91, MessagePack.Code.INT16, 83, 57, -124, 60, 65, -94, 109, 71, Ascii.DC4, 42, -98, 93, 86, -14, MessagePack.Code.INT64, -85, 68, 17, -110, MessagePack.Code.STR8, 35, 32, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, MessagePack.Code.MAP16, MessagePack.Code.BIN16, 49, -2, Ascii.CAN, Ascii.CR, 99, -116, -128, MessagePack.Code.NIL, -9, 112, 7};
    private static final byte[] aLogtable = {0, 3, 5, Ascii.SI, 17, 51, 85, -1, Ascii.SUB, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, MessagePack.Code.FIXEXT16, 115, -107, -92, -9, 2, 6, 10, Ascii.RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, MessagePack.Code.STR8, 112, MessagePack.Code.FIXARRAY_PREFIX, -85, -26, 49, 83, -11, 4, Ascii.FF, Ascii.DC4, 60, 68, MessagePack.Code.UINT8, 79, MessagePack.Code.INT16, 104, -72, MessagePack.Code.INT64, 110, -78, MessagePack.Code.UINT16, 76, MessagePack.Code.FIXEXT1, 103, -87, MessagePack.Code.NEGFIXINT_PREFIX, 59, 77, MessagePack.Code.FIXEXT8, 98, -90, -15, 8, Ascii.CAN, 40, 120, -120, -125, -98, -71, MessagePack.Code.INT8, 107, -67, MessagePack.Code.ARRAY16, 127, -127, -104, -77, MessagePack.Code.UINT32, 73, MessagePack.Code.STR32, 118, -102, -75, MessagePack.Code.BIN8, 87, -7, 16, 48, 80, -16, Ascii.VT, Ascii.GS, 39, 105, -69, MessagePack.Code.FIXEXT4, 97, -93, -2, Ascii.EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, MessagePack.Code.FIXSTR_PREFIX, -5, Ascii.SYN, 58, 78, MessagePack.Code.INT32, 109, -73, MessagePack.Code.FALSE, 93, -25, 50, 86, -6, Ascii.NAK, Utf8.REPLACEMENT_BYTE, 65, MessagePack.Code.TRUE, 94, -30, Base64.padSymbol, 71, MessagePack.Code.EXT32, 64, MessagePack.Code.NIL, 91, -19, 44, 116, -100, -65, MessagePack.Code.STR16, 117, -97, -70, MessagePack.Code.FIXEXT2, 100, -84, -17, 42, 126, -126, -99, -68, MessagePack.Code.MAP32, 122, -114, -119, -128, -101, -74, MessagePack.Code.NEVER_USED, 88, -24, 35, 101, -81, -22, 37, 111, -79, MessagePack.Code.EXT16, 67, MessagePack.Code.BIN16, 84, -4, Ascii.US, 33, 99, -91, -12, 7, 9, Ascii.ESC, 45, 119, -103, -80, MessagePack.Code.FLOAT64, 70, MessagePack.Code.FLOAT32, 69, MessagePack.Code.UINT64, 74, MessagePack.Code.MAP16, 121, -117, -122, -111, -88, -29, 62, 66, MessagePack.Code.BIN32, 81, -13, Ascii.SO, Ascii.DC2, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, Ascii.CR, Ascii.ETB, 57, 75, MessagePack.Code.ARRAY32, 124, -124, -105, -94, -3, Ascii.FS, 36, 108, -76, MessagePack.Code.EXT8, 82, -10, 1, 3, 5, Ascii.SI, 17, 51, 85, -1, Ascii.SUB, 46, 114, -106, -95, -8, 19, 53, 95, -31, 56, 72, MessagePack.Code.FIXEXT16, 115, -107, -92, -9, 2, 6, 10, Ascii.RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, MessagePack.Code.STR8, 112, MessagePack.Code.FIXARRAY_PREFIX, -85, -26, 49, 83, -11, 4, Ascii.FF, Ascii.DC4, 60, 68, MessagePack.Code.UINT8, 79, MessagePack.Code.INT16, 104, -72, MessagePack.Code.INT64, 110, -78, MessagePack.Code.UINT16, 76, MessagePack.Code.FIXEXT1, 103, -87, MessagePack.Code.NEGFIXINT_PREFIX, 59, 77, MessagePack.Code.FIXEXT8, 98, -90, -15, 8, Ascii.CAN, 40, 120, -120, -125, -98, -71, MessagePack.Code.INT8, 107, -67, MessagePack.Code.ARRAY16, 127, -127, -104, -77, MessagePack.Code.UINT32, 73, MessagePack.Code.STR32, 118, -102, -75, MessagePack.Code.BIN8, 87, -7, 16, 48, 80, -16, Ascii.VT, Ascii.GS, 39, 105, -69, MessagePack.Code.FIXEXT4, 97, -93, -2, Ascii.EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, 96, MessagePack.Code.FIXSTR_PREFIX, -5, Ascii.SYN, 58, 78, MessagePack.Code.INT32, 109, -73, MessagePack.Code.FALSE, 93, -25, 50, 86, -6, Ascii.NAK, Utf8.REPLACEMENT_BYTE, 65, MessagePack.Code.TRUE, 94, -30, Base64.padSymbol, 71, MessagePack.Code.EXT32, 64, MessagePack.Code.NIL, 91, -19, 44, 116, -100, -65, MessagePack.Code.STR16, 117, -97, -70, MessagePack.Code.FIXEXT2, 100, -84, -17, 42, 126, -126, -99, -68, MessagePack.Code.MAP32, 122, -114, -119, -128, -101, -74, MessagePack.Code.NEVER_USED, 88, -24, 35, 101, -81, -22, 37, 111, -79, MessagePack.Code.EXT16, 67, MessagePack.Code.BIN16, 84, -4, Ascii.US, 33, 99, -91, -12, 7, 9, Ascii.ESC, 45, 119, -103, -80, MessagePack.Code.FLOAT64, 70, MessagePack.Code.FLOAT32, 69, MessagePack.Code.UINT64, 74, MessagePack.Code.MAP16, 121, -117, -122, -111, -88, -29, 62, 66, MessagePack.Code.BIN32, 81, -13, Ascii.SO, Ascii.DC2, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, Ascii.CR, Ascii.ETB, 57, 75, MessagePack.Code.ARRAY32, 124, -124, -105, -94, -3, Ascii.FS, 36, 108, -76, MessagePack.Code.EXT8, 82, -10, 1};
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, MessagePack.Code.BIN16, 48, 1, 103, 43, -2, MessagePack.Code.FIXEXT8, -85, 118, MessagePack.Code.FLOAT32, -126, MessagePack.Code.EXT32, 125, -6, 89, 71, -16, -83, MessagePack.Code.FIXEXT1, -94, -81, -100, -92, 114, MessagePack.Code.NIL, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, MessagePack.Code.UINT8, 52, -91, -27, -15, 113, MessagePack.Code.FIXEXT16, 49, Ascii.NAK, 4, MessagePack.Code.EXT8, 35, MessagePack.Code.TRUE, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, -128, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, MessagePack.Code.FIXSTR_PREFIX, 82, 59, MessagePack.Code.FIXEXT4, -77, 41, -29, 47, -124, 83, MessagePack.Code.INT16, 0, -19, 32, -4, -79, 91, 106, MessagePack.Code.FLOAT64, -66, 57, 74, 76, 88, MessagePack.Code.UINT64, MessagePack.Code.INT8, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, MessagePack.Code.STR16, 33, 16, -1, -13, MessagePack.Code.INT32, MessagePack.Code.UINT16, Ascii.FF, 19, -20, 95, -105, 68, Ascii.ETB, MessagePack.Code.BIN8, -89, 126, Base64.padSymbol, 100, 93, Ascii.EM, 115, 96, -127, 79, MessagePack.Code.ARRAY16, 34, 42, MessagePack.Code.FIXARRAY_PREFIX, -120, 70, -18, -72, Ascii.DC4, MessagePack.Code.MAP16, 94, Ascii.VT, MessagePack.Code.STR32, MessagePack.Code.NEGFIXINT_PREFIX, 50, 58, 10, 73, 6, 36, 92, MessagePack.Code.FALSE, MessagePack.Code.INT64, -84, 98, -111, -107, -28, 121, -25, MessagePack.Code.EXT16, 55, 109, -115, MessagePack.Code.FIXEXT2, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, MessagePack.Code.BIN32, -24, MessagePack.Code.ARRAY32, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, Ascii.SO, 97, 53, 87, -71, -122, MessagePack.Code.NEVER_USED, Ascii.GS, -98, -31, -8, -104, 17, 105, MessagePack.Code.STR8, -114, -108, -101, Ascii.RS, -121, -23, MessagePack.Code.UINT32, 85, 40, MessagePack.Code.MAP32, -116, -95, -119, Ascii.CR, -65, -26, 66, 104, 65, -103, 45, Ascii.SI, -80, 84, -69, Ascii.SYN};
    private static final byte[] Si = {82, 9, 106, MessagePack.Code.FIXEXT2, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, MessagePack.Code.FIXEXT8, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, MessagePack.Code.BIN8, MessagePack.Code.MAP16, -23, MessagePack.Code.FLOAT64, 84, 123, -108, 50, -90, MessagePack.Code.FALSE, 35, Base64.padSymbol, -18, 76, -107, Ascii.VT, 66, -6, MessagePack.Code.TRUE, 78, 8, 46, -95, 102, 40, MessagePack.Code.STR8, 36, -78, 118, 91, -94, 73, 109, -117, MessagePack.Code.INT16, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, MessagePack.Code.FIXEXT1, -92, 92, MessagePack.Code.UINT8, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, MessagePack.Code.STR16, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, MessagePack.Code.FIXARRAY_PREFIX, MessagePack.Code.FIXEXT16, -85, 0, -116, -68, MessagePack.Code.INT64, 10, -9, -28, 88, 5, -72, -77, 69, 6, MessagePack.Code.INT8, 44, Ascii.RS, -113, MessagePack.Code.FLOAT32, Utf8.REPLACEMENT_BYTE, Ascii.SI, 2, MessagePack.Code.NEVER_USED, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, MessagePack.Code.ARRAY16, -22, -105, -14, MessagePack.Code.UINT64, MessagePack.Code.UINT32, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.FS, 117, MessagePack.Code.MAP32, 110, 71, -15, Ascii.SUB, 113, Ascii.GS, 41, MessagePack.Code.BIN16, -119, 111, -73, 98, Ascii.SO, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, MessagePack.Code.BIN32, MessagePack.Code.INT32, 121, 32, -102, MessagePack.Code.STR32, MessagePack.Code.NIL, -2, 120, MessagePack.Code.UINT16, 90, -12, Ascii.US, MessagePack.Code.ARRAY32, -88, 51, -120, 7, MessagePack.Code.EXT8, 49, -79, Ascii.DC2, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, Ascii.EM, -75, 74, Ascii.CR, 45, -27, 122, -97, -109, MessagePack.Code.EXT32, -100, -17, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, 59, 77, -82, 42, -11, -80, MessagePack.Code.EXT16, -21, -69, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, MessagePack.Code.FIXEXT4, 38, -31, 105, Ascii.DC4, 99, 85, 33, Ascii.FF, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, Mp4VideoDirectory.TAG_OPCOLOR, 179, 125, 250, 239, 197, 145};
    static byte[][] shifts0 = {new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, Ascii.CAN}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, Ascii.CAN, 32}};
    static byte[][] shifts1 = {new byte[]{0, Ascii.CAN, 16, 8}, new byte[]{0, 32, Ascii.CAN, 16}, new byte[]{0, 40, 32, Ascii.CAN}, new byte[]{0, 48, 40, Ascii.CAN}, new byte[]{0, 56, 40, 32}};

    public RijndaelEngine() {
        this(128);
    }

    public RijndaelEngine(int i2) {
        if (i2 == 128) {
            this.BC = 32;
            this.BC_MASK = 4294967295L;
            this.shifts0SC = shifts0[0];
            this.shifts1SC = shifts1[0];
        } else if (i2 == 160) {
            this.BC = 40;
            this.BC_MASK = 1099511627775L;
            this.shifts0SC = shifts0[1];
            this.shifts1SC = shifts1[1];
        } else if (i2 == 192) {
            this.BC = 48;
            this.BC_MASK = 281474976710655L;
            this.shifts0SC = shifts0[2];
            this.shifts1SC = shifts1[2];
        } else if (i2 == 224) {
            this.BC = 56;
            this.BC_MASK = 72057594037927935L;
            this.shifts0SC = shifts0[3];
            this.shifts1SC = shifts1[3];
        } else {
            if (i2 != 256) {
                throw new IllegalArgumentException("unknown blocksize to Rijndael");
            }
            this.BC = 64;
            this.BC_MASK = -1L;
            this.shifts0SC = shifts0[4];
            this.shifts1SC = shifts1[4];
        }
        this.blockBits = i2;
    }

    private void InvMixColumn() {
        int i2;
        int i3;
        long j2 = 0;
        long j3 = 0;
        long jMul0xe = 0;
        long jMul0xe2 = 0;
        for (int i4 = 0; i4 < this.BC; i4 += 8) {
            int i5 = (int) ((-1) - (((-1) - (this.A0 >> i4)) | ((-1) - 255)));
            long j4 = this.A1 >> i4;
            int i6 = (int) ((j4 + 255) - (j4 | 255));
            long j5 = this.A2 >> i4;
            int i7 = (int) ((j5 + 255) - (j5 | 255));
            int i8 = (int) ((this.A3 >> i4) & 255);
            int i9 = -1;
            int i10 = i5 != 0 ? (-1) - (((-1) - logtable[(-1) - (((-1) - i5) | ((-1) - 255))]) | ((-1) - 255)) : -1;
            if (i6 != 0) {
                byte b2 = logtable[i6 & 255];
                i2 = (b2 + 255) - (b2 | 255);
            } else {
                i2 = -1;
            }
            if (i7 != 0) {
                byte b3 = logtable[(i7 + 255) - (i7 | 255)];
                i3 = (b3 + 255) - (b3 | 255);
            } else {
                i3 = -1;
            }
            if (i8 != 0) {
                i9 = logtable[i8 & 255] & 255;
            }
            long jMul0xe3 = ((long) ((-1) - (((-1) - (((mul0xe(i10) ^ mul0xb(i2)) ^ mul0xd(i3)) ^ mul0x9(i9))) | ((-1) - 255)))) << i4;
            j2 = (j2 + jMul0xe3) - (j2 & jMul0xe3);
            jMul0xe2 |= ((long) ((((mul0xe(i2) ^ mul0xb(i3)) ^ mul0xd(i9)) ^ mul0x9(i10)) & 255)) << i4;
            int iMul0xe = ((mul0xe(i3) ^ mul0xb(i9)) ^ mul0xd(i10)) ^ mul0x9(i2);
            j3 = (-1) - (((-1) - j3) & ((-1) - (((long) ((iMul0xe + 255) - (iMul0xe | 255))) << i4)));
            jMul0xe = (-1) - (((-1) - (((long) ((-1) - (((-1) - (((mul0xe(i9) ^ mul0xb(i10)) ^ mul0xd(i2)) ^ mul0x9(i3))) | ((-1) - 255)))) << i4)) & ((-1) - jMul0xe));
        }
        this.A0 = j2;
        this.A1 = jMul0xe2;
        this.A2 = j3;
        this.A3 = jMul0xe;
    }

    private void KeyAddition(long[] jArr) {
        this.A0 ^= jArr[0];
        this.A1 ^= jArr[1];
        this.A2 ^= jArr[2];
        this.A3 ^= jArr[3];
    }

    private void MixColumn() {
        long jMul0x2 = 0;
        long j2 = 0;
        long jMul0x22 = 0;
        long jMul0x23 = 0;
        for (int i2 = 0; i2 < this.BC; i2 += 8) {
            int i3 = (int) ((-1) - (((-1) - (this.A0 >> i2)) | ((-1) - 255)));
            long j3 = this.A1 >> i2;
            int i4 = (int) ((j3 + 255) - (j3 | 255));
            long j4 = this.A2 >> i2;
            int i5 = (int) ((j4 + 255) - (j4 | 255));
            long j5 = this.A3 >> i2;
            int i6 = (int) ((j5 + 255) - (j5 | 255));
            jMul0x2 = (-1) - (((-1) - jMul0x2) & ((-1) - (((long) ((-1) - (((-1) - (((mul0x2(i3) ^ mul0x3(i4)) ^ i5) ^ i6)) | ((-1) - 255)))) << i2)));
            jMul0x23 |= ((long) ((-1) - (((-1) - (((mul0x2(i4) ^ mul0x3(i5)) ^ i6) ^ i3)) | ((-1) - 255)))) << i2;
            int iMul0x2 = ((mul0x2(i5) ^ mul0x3(i6)) ^ i3) ^ i4;
            j2 = (-1) - (((-1) - j2) & ((-1) - (((long) ((iMul0x2 + 255) - (iMul0x2 | 255))) << i2)));
            jMul0x22 = (((long) ((-1) - (((-1) - (((mul0x2(i6) ^ mul0x3(i3)) ^ i4) ^ i5)) | ((-1) - 255)))) << i2) | jMul0x22;
        }
        this.A0 = jMul0x2;
        this.A1 = jMul0x23;
        this.A2 = j2;
        this.A3 = jMul0x22;
    }

    private void ShiftRow(byte[] bArr) {
        this.A1 = shift(this.A1, bArr[1]);
        this.A2 = shift(this.A2, bArr[2]);
        this.A3 = shift(this.A3, bArr[3]);
    }

    private void Substitution(byte[] bArr) {
        this.A0 = applyS(this.A0, bArr);
        this.A1 = applyS(this.A1, bArr);
        this.A2 = applyS(this.A2, bArr);
        this.A3 = applyS(this.A3, bArr);
    }

    private long applyS(long j2, byte[] bArr) {
        long j3 = 0;
        for (int i2 = 0; i2 < this.BC; i2 += 8) {
            byte b2 = bArr[(int) ((-1) - (((-1) - (j2 >> i2)) | ((-1) - 255)))];
            j3 = (-1) - (((-1) - j3) & ((-1) - (((long) ((b2 + 255) - (b2 | 255))) << i2)));
        }
        return j3;
    }

    private void decryptBlock(long[][] jArr) {
        KeyAddition(jArr[this.ROUNDS]);
        Substitution(Si);
        ShiftRow(this.shifts1SC);
        for (int i2 = this.ROUNDS - 1; i2 > 0; i2--) {
            KeyAddition(jArr[i2]);
            InvMixColumn();
            Substitution(Si);
            ShiftRow(this.shifts1SC);
        }
        KeyAddition(jArr[0]);
    }

    private void encryptBlock(long[][] jArr) {
        KeyAddition(jArr[0]);
        for (int i2 = 1; i2 < this.ROUNDS; i2++) {
            Substitution(S);
            ShiftRow(this.shifts0SC);
            MixColumn();
            KeyAddition(jArr[i2]);
        }
        Substitution(S);
        ShiftRow(this.shifts0SC);
        KeyAddition(jArr[this.ROUNDS]);
    }

    private long[][] generateWorkingKey(byte[] bArr) {
        int i2;
        int i3;
        int i4 = 8;
        int length = bArr.length * 8;
        int i5 = 1;
        int i6 = 0;
        int i7 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        if (length == 128) {
            i2 = 4;
        } else if (length == 160) {
            i2 = 5;
        } else if (length == 192) {
            i2 = 6;
        } else if (length == 224) {
            i2 = 7;
        } else {
            if (length != 256) {
                throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
            }
            i2 = 8;
        }
        if (length >= this.blockBits) {
            this.ROUNDS = i2 + 6;
        } else {
            this.ROUNDS = (this.BC / 8) + 6;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < bArr.length) {
            bArr2[i8 % 4][i8 / 4] = bArr[i9];
            i8++;
            i9++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i2 && i11 < (this.ROUNDS + 1) * (this.BC / 8)) {
            while (i6 < i7) {
                int i12 = this.BC;
                long[] jArr2 = jArr[i11 / (i12 / 8)];
                jArr2[i6] = (-1) - (((-1) - (((long) (bArr2[i6][i10] & 255)) << ((i11 * 8) % i12))) & ((-1) - jArr2[i6]));
                i6++;
                i7 = 4;
            }
            i10++;
            i11++;
            i6 = 0;
            i7 = 4;
        }
        int i13 = 0;
        while (i11 < (this.ROUNDS + i5) * (this.BC / i4)) {
            int i14 = 0;
            while (i14 < 4) {
                byte[] bArr3 = bArr2[i14];
                i14++;
                bArr3[0] = (byte) (S[bArr2[i14 % 4][i2 - 1] & 255] ^ bArr3[0]);
            }
            byte[] bArr4 = bArr2[0];
            int i15 = i13 + 1;
            bArr4[0] = (byte) (rcon[i13] ^ bArr4[0]);
            if (i2 <= 6) {
                for (int i16 = i5; i16 < i2; i16++) {
                    for (int i17 = 0; i17 < 4; i17++) {
                        byte[] bArr5 = bArr2[i17];
                        bArr5[i16] = (byte) (bArr5[i16] ^ bArr5[i16 - 1]);
                    }
                }
            } else {
                int i18 = i5;
                while (true) {
                    i3 = 4;
                    if (i18 >= 4) {
                        break;
                    }
                    int i19 = 0;
                    while (i19 < i3) {
                        byte[] bArr6 = bArr2[i19];
                        bArr6[i18] = (byte) (bArr6[i18] ^ bArr6[i18 - 1]);
                        i19++;
                        i3 = 4;
                    }
                    i18++;
                }
                for (int i20 = 0; i20 < 4; i20++) {
                    byte[] bArr7 = bArr2[i20];
                    bArr7[4] = (byte) (bArr7[4] ^ S[(-1) - (((-1) - bArr7[3]) | ((-1) - 255))]);
                }
                int i21 = 5;
                while (i21 < i2) {
                    int i22 = 0;
                    while (i22 < i3) {
                        byte[] bArr8 = bArr2[i22];
                        bArr8[i21] = (byte) (bArr8[i21] ^ bArr8[i21 - 1]);
                        i22++;
                        i3 = 4;
                    }
                    i21++;
                    i3 = 4;
                }
            }
            int i23 = 0;
            while (i23 < i2 && i11 < (this.ROUNDS + i5) * (this.BC / i4)) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int i25 = this.BC;
                    long[] jArr3 = jArr[i11 / (i25 / 8)];
                    long j2 = jArr3[i24];
                    byte b2 = bArr2[i24][i23];
                    long j3 = ((long) ((b2 + 255) - (b2 | 255))) << ((i11 * 8) % i25);
                    jArr3[i24] = (j3 + j2) - (j3 & j2);
                }
                i23++;
                i11++;
                i4 = 8;
                i5 = 1;
            }
            i13 = i15;
            i4 = 8;
            i5 = 1;
        }
        return jArr;
    }

    private byte mul0x2(int i2) {
        if (i2 != 0) {
            return aLogtable[((-1) - (((-1) - logtable[i2]) | ((-1) - 255))) + 25];
        }
        return (byte) 0;
    }

    private byte mul0x3(int i2) {
        if (i2 != 0) {
            return aLogtable[((-1) - (((-1) - logtable[i2]) | ((-1) - 255))) + 1];
        }
        return (byte) 0;
    }

    private byte mul0x9(int i2) {
        if (i2 >= 0) {
            return aLogtable[i2 + 199];
        }
        return (byte) 0;
    }

    private byte mul0xb(int i2) {
        if (i2 >= 0) {
            return aLogtable[i2 + 104];
        }
        return (byte) 0;
    }

    private byte mul0xd(int i2) {
        if (i2 >= 0) {
            return aLogtable[i2 + 238];
        }
        return (byte) 0;
    }

    private byte mul0xe(int i2) {
        if (i2 >= 0) {
            return aLogtable[i2 + 223];
        }
        return (byte) 0;
    }

    private void packBlock(byte[] bArr, int i2) {
        for (int i3 = 0; i3 != this.BC; i3 += 8) {
            bArr[i2] = (byte) (this.A0 >> i3);
            bArr[i2 + 1] = (byte) (this.A1 >> i3);
            int i4 = i2 + 3;
            bArr[i2 + 2] = (byte) (this.A2 >> i3);
            i2 += 4;
            bArr[i4] = (byte) (this.A3 >> i3);
        }
    }

    private long shift(long j2, int i2) {
        long j3 = j2 >>> i2;
        long j4 = j2 << (this.BC - i2);
        return ((j4 + j3) - (j4 & j3)) & this.BC_MASK;
    }

    private void unpackBlock(byte[] bArr, int i2) {
        this.A0 = bArr[i2] & 255;
        this.A1 = (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255));
        this.A2 = (-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255));
        int i3 = i2 + 4;
        byte b2 = bArr[i2 + 3];
        this.A3 = (b2 + 255) - (b2 | 255);
        for (int i4 = 8; i4 != this.BC; i4 += 8) {
            long j2 = this.A0;
            long j3 = ((long) ((-1) - (((-1) - bArr[i3]) | ((-1) - 255)))) << i4;
            this.A0 = (j2 + j3) - (j2 & j3);
            this.A1 |= ((long) ((-1) - (((-1) - bArr[i3 + 1]) | ((-1) - 255)))) << i4;
            int i5 = i3 + 3;
            this.A2 = (-1) - (((-1) - this.A2) & ((-1) - (((long) (bArr[i3 + 2] & 255)) << i4)));
            long j4 = this.A3;
            i3 += 4;
            byte b3 = bArr[i5];
            this.A3 = (-1) - (((-1) - j4) & ((-1) - (((long) ((b3 + 255) - (b3 | 255))) << i4)));
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.BC / 2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + cipherParameters.getClass().getName());
        }
        this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
        this.forEncryption = z2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        int i4 = this.BC;
        if ((i4 / 2) + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if ((i4 / 2) + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i2);
            encryptBlock(this.workingKey);
            packBlock(bArr2, i3);
        } else {
            unpackBlock(bArr, i2);
            decryptBlock(this.workingKey);
            packBlock(bArr2, i3);
        }
        return this.BC / 2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
