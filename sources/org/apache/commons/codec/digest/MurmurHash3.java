package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class MurmurHash3 {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;

    @Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;

    @Deprecated
    public static class IncrementalHash32 extends IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @Deprecated
        int finalise(int i2, int i3, byte[] bArr, int i4) {
            int i5;
            int i6;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i6 = bArr[2] << 16;
                    }
                    return MurmurHash3.fmix32(i2 ^ i4);
                }
                i6 = 0;
                i5 = i6 ^ (bArr[1] << 8);
            } else {
                i5 = 0;
            }
            i2 ^= Integer.rotateLeft((i5 ^ bArr[0]) * (-862048943), 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i2 ^ i4);
        }
    }

    public static class IncrementalHash32x86 {
        private static final int BLOCK_SIZE = 4;
        private int hash;
        private int totalLen;
        private final byte[] unprocessed = new byte[3];
        private int unprocessedLength;

        private static int orBytes(byte b2, byte b3, byte b4, byte b5) {
            int i2 = (b2 + 255) - (b2 | 255);
            int i3 = (b3 & 255) << 8;
            int i4 = (i2 + i3) - (i2 & i3);
            int i5 = ((-1) - (((-1) - b4) | ((-1) - 255))) << 16;
            int i6 = (i4 + i5) - (i4 & i5);
            int i7 = ((b5 + 255) - (b5 | 255)) << 24;
            return (i6 + i7) - (i6 & i7);
        }

        public final void add(byte[] bArr, int i2, int i3) {
            int iOrBytes;
            if (i3 <= 0) {
                return;
            }
            this.totalLen += i3;
            int i4 = this.unprocessedLength;
            if ((i4 + i3) - 4 < 0) {
                System.arraycopy(bArr, i2, this.unprocessed, i4, i3);
                this.unprocessedLength += i3;
                return;
            }
            if (i4 > 0) {
                if (i4 == 1) {
                    iOrBytes = orBytes(this.unprocessed[0], bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
                } else if (i4 == 2) {
                    byte[] bArr2 = this.unprocessed;
                    iOrBytes = orBytes(bArr2[0], bArr2[1], bArr[i2], bArr[i2 + 1]);
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("Unprocessed length should be 1, 2, or 3: " + this.unprocessedLength);
                    }
                    byte[] bArr3 = this.unprocessed;
                    iOrBytes = orBytes(bArr3[0], bArr3[1], bArr3[2], bArr[i2]);
                }
                this.hash = MurmurHash3.mix32(iOrBytes, this.hash);
                int i5 = 4 - this.unprocessedLength;
                i2 += i5;
                i3 -= i5;
            }
            int i6 = i3 >> 2;
            for (int i7 = 0; i7 < i6; i7++) {
                this.hash = MurmurHash3.mix32(MurmurHash3.getLittleEndianInt(bArr, (i7 << 2) + i2), this.hash);
            }
            int i8 = i6 << 2;
            int i9 = i3 - i8;
            this.unprocessedLength = i9;
            if (i9 != 0) {
                System.arraycopy(bArr, i2 + i8, this.unprocessed, 0, i9);
            }
        }

        public final int end() {
            return finalise(this.hash, this.unprocessedLength, this.unprocessed, this.totalLen);
        }

        int finalise(int i2, int i3, byte[] bArr, int i4) {
            int i5;
            int i6;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        byte b2 = bArr[2];
                        i6 = ((b2 + 255) - (b2 | 255)) << 16;
                    }
                    return MurmurHash3.fmix32(i2 ^ i4);
                }
                i6 = 0;
                byte b3 = bArr[1];
                i5 = i6 ^ (((b3 + 255) - (b3 | 255)) << 8);
            } else {
                i5 = 0;
            }
            i2 ^= Integer.rotateLeft((i5 ^ (bArr[0] & 255)) * (-862048943), 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i2 ^ i4);
        }

        public final void start(int i2) {
            this.totalLen = 0;
            this.unprocessedLength = 0;
            this.hash = i2;
        }
    }

    private MurmurHash3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int fmix32(int i2) {
        int i3 = (i2 ^ (i2 >>> 16)) * (-2048144789);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477387);
        return i4 ^ (i4 >>> 16);
    }

    private static long fmix64(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLittleEndianInt(byte[] bArr, int i2) {
        return (-1) - (((-1) - (((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24)) & ((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (bArr[i2] & 255)) & ((-1) - ((bArr[i2 + 1] & 255) << 8))))) & ((-1) - ((bArr[i2 + 2] & 255) << 16))))));
    }

    private static long getLittleEndianLong(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = (j2 + 255) - (j2 | 255);
        long j4 = bArr[i2 + 1];
        long j5 = (-1) - (((-1) - j3) & ((-1) - (((j4 + 255) - (j4 | 255)) << 8)));
        long j6 = bArr[i2 + 2];
        long j7 = (-1) - (((-1) - j5) & ((-1) - (((j6 + 255) - (j6 | 255)) << 16)));
        long j8 = bArr[i2 + 3];
        long j9 = ((j8 + 255) - (j8 | 255)) << 24;
        return (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56) | ((-1) - (((-1) - ((-1) - (((-1) - (((j7 + j9) - (j7 & j9)) | ((((long) bArr[i2 + 4]) & 255) << 32))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40))))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48))));
    }

    @Deprecated
    public static long[] hash128(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, 104729);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, 104729);
    }

    @Deprecated
    public static long[] hash128(byte[] bArr, int i2, int i3, int i4) {
        return hash128x64Internal(bArr, i2, i3, i4);
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    public static long[] hash128x64(byte[] bArr, int i2, int i3, int i4) {
        return hash128x64Internal(bArr, i2, i3, ((long) i4) & 4294967295L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static long[] hash128x64Internal(byte[] bArr, int i2, int i3, long j2) {
        int i4 = i3 >> 4;
        long jRotateLeft = j2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 + (i5 << 4);
            long littleEndianLong = getLittleEndianLong(bArr, i6);
            long littleEndianLong2 = getLittleEndianLong(bArr, i6 + 8);
            j2 = ((Long.rotateLeft((Long.rotateLeft(littleEndianLong * C1, 31) * C2) ^ j2, 27) + jRotateLeft) * 5) + 1390208809;
            jRotateLeft = ((Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(C2 * littleEndianLong2, 33) * C1), 31) + j2) * 5) + 944331445;
        }
        int i7 = i2 + (i4 << 4);
        long j3 = 0;
        switch ((i2 + i3) - i7) {
            case 1:
                byte b2 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b2 + 255) - (b2 | 255)))) * C1, 31) * C2;
                break;
            case 2:
                long j4 = bArr[i7 + 1];
                j3 ^= ((j4 + 255) - (j4 | 255)) << 8;
                byte b22 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b22 + 255) - (b22 | 255)))) * C1, 31) * C2;
                break;
            case 3:
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j42 = bArr[i7 + 1];
                j3 ^= ((j42 + 255) - (j42 | 255)) << 8;
                byte b222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b222 + 255) - (b222 | 255)))) * C1, 31) * C2;
                break;
            case 4:
                long j5 = bArr[i7 + 3];
                j3 ^= ((j5 + 255) - (j5 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j422 = bArr[i7 + 1];
                j3 ^= ((j422 + 255) - (j422 | 255)) << 8;
                byte b2222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b2222 + 255) - (b2222 | 255)))) * C1, 31) * C2;
                break;
            case 5:
                long j6 = bArr[i7 + 4];
                j3 ^= ((j6 + 255) - (j6 | 255)) << 32;
                long j52 = bArr[i7 + 3];
                j3 ^= ((j52 + 255) - (j52 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j4222 = bArr[i7 + 1];
                j3 ^= ((j4222 + 255) - (j4222 | 255)) << 8;
                byte b22222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b22222 + 255) - (b22222 | 255)))) * C1, 31) * C2;
                break;
            case 6:
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j62 = bArr[i7 + 4];
                j3 ^= ((j62 + 255) - (j62 | 255)) << 32;
                long j522 = bArr[i7 + 3];
                j3 ^= ((j522 + 255) - (j522 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j42222 = bArr[i7 + 1];
                j3 ^= ((j42222 + 255) - (j42222 | 255)) << 8;
                byte b222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b222222 + 255) - (b222222 | 255)))) * C1, 31) * C2;
                break;
            case 7:
                long j7 = bArr[i7 + 6];
                j3 ^= ((j7 + 255) - (j7 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j622 = bArr[i7 + 4];
                j3 ^= ((j622 + 255) - (j622 | 255)) << 32;
                long j5222 = bArr[i7 + 3];
                j3 ^= ((j5222 + 255) - (j5222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j422222 = bArr[i7 + 1];
                j3 ^= ((j422222 + 255) - (j422222 | 255)) << 8;
                byte b2222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b2222222 + 255) - (b2222222 | 255)))) * C1, 31) * C2;
                break;
            case 8:
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j72 = bArr[i7 + 6];
                j3 ^= ((j72 + 255) - (j72 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j6222 = bArr[i7 + 4];
                j3 ^= ((j6222 + 255) - (j6222 | 255)) << 32;
                long j52222 = bArr[i7 + 3];
                j3 ^= ((j52222 + 255) - (j52222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j4222222 = bArr[i7 + 1];
                j3 ^= ((j4222222 + 255) - (j4222222 | 255)) << 8;
                byte b22222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b22222222 + 255) - (b22222222 | 255)))) * C1, 31) * C2;
                break;
            case 9:
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j722 = bArr[i7 + 6];
                j3 ^= ((j722 + 255) - (j722 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j62222 = bArr[i7 + 4];
                j3 ^= ((j62222 + 255) - (j62222 | 255)) << 32;
                long j522222 = bArr[i7 + 3];
                j3 ^= ((j522222 + 255) - (j522222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j42222222 = bArr[i7 + 1];
                j3 ^= ((j42222222 + 255) - (j42222222 | 255)) << 8;
                byte b222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b222222222 + 255) - (b222222222 | 255)))) * C1, 31) * C2;
                break;
            case 10:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j7222 = bArr[i7 + 6];
                j3 ^= ((j7222 + 255) - (j7222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j622222 = bArr[i7 + 4];
                j3 ^= ((j622222 + 255) - (j622222 | 255)) << 32;
                long j5222222 = bArr[i7 + 3];
                j3 ^= ((j5222222 + 255) - (j5222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j422222222 = bArr[i7 + 1];
                j3 ^= ((j422222222 + 255) - (j422222222 | 255)) << 8;
                byte b2222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b2222222222 + 255) - (b2222222222 | 255)))) * C1, 31) * C2;
                break;
            case 11:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 10])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j72222 = bArr[i7 + 6];
                j3 ^= ((j72222 + 255) - (j72222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j6222222 = bArr[i7 + 4];
                j3 ^= ((j6222222 + 255) - (j6222222 | 255)) << 32;
                long j52222222 = bArr[i7 + 3];
                j3 ^= ((j52222222 + 255) - (j52222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j4222222222 = bArr[i7 + 1];
                j3 ^= ((j4222222222 + 255) - (j4222222222 | 255)) << 8;
                byte b22222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b22222222222 + 255) - (b22222222222 | 255)))) * C1, 31) * C2;
                break;
            case 12:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 11])) | ((-1) - 255))) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 10])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j722222 = bArr[i7 + 6];
                j3 ^= ((j722222 + 255) - (j722222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j62222222 = bArr[i7 + 4];
                j3 ^= ((j62222222 + 255) - (j62222222 | 255)) << 32;
                long j522222222 = bArr[i7 + 3];
                j3 ^= ((j522222222 + 255) - (j522222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j42222222222 = bArr[i7 + 1];
                j3 ^= ((j42222222222 + 255) - (j42222222222 | 255)) << 8;
                byte b222222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b222222222222 + 255) - (b222222222222 | 255)))) * C1, 31) * C2;
                break;
            case 13:
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 12])) | ((-1) - 255))) << 32;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 11])) | ((-1) - 255))) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 10])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j7222222 = bArr[i7 + 6];
                j3 ^= ((j7222222 + 255) - (j7222222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j622222222 = bArr[i7 + 4];
                j3 ^= ((j622222222 + 255) - (j622222222 | 255)) << 32;
                long j5222222222 = bArr[i7 + 3];
                j3 ^= ((j5222222222 + 255) - (j5222222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j422222222222 = bArr[i7 + 1];
                j3 ^= ((j422222222222 + 255) - (j422222222222 | 255)) << 8;
                byte b2222222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b2222222222222 + 255) - (b2222222222222 | 255)))) * C1, 31) * C2;
                break;
            case 14:
                long j8 = bArr[i7 + 13];
                j3 ^= ((j8 + 255) - (j8 | 255)) << 40;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 12])) | ((-1) - 255))) << 32;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 11])) | ((-1) - 255))) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 10])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j72222222 = bArr[i7 + 6];
                j3 ^= ((j72222222 + 255) - (j72222222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j6222222222 = bArr[i7 + 4];
                j3 ^= ((j6222222222 + 255) - (j6222222222 | 255)) << 32;
                long j52222222222 = bArr[i7 + 3];
                j3 ^= ((j52222222222 + 255) - (j52222222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j4222222222222 = bArr[i7 + 1];
                j3 ^= ((j4222222222222 + 255) - (j4222222222222 | 255)) << 8;
                byte b22222222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b22222222222222 + 255) - (b22222222222222 | 255)))) * C1, 31) * C2;
                break;
            case 15:
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 14])) | ((-1) - 255))) << 48;
                long j82 = bArr[i7 + 13];
                j3 ^= ((j82 + 255) - (j82 | 255)) << 40;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 12])) | ((-1) - 255))) << 32;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 11])) | ((-1) - 255))) << 24;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 10])) | ((-1) - 255))) << 16;
                j3 ^= ((-1) - (((-1) - ((long) bArr[i7 + 9])) | ((-1) - 255))) << 8;
                jRotateLeft ^= Long.rotateLeft((j3 ^ ((long) (bArr[i7 + 8] & 255))) * C2, 33) * C1;
                j3 = ((-1) - (((-1) - ((long) bArr[i7 + 7])) | ((-1) - 255))) << 56;
                long j722222222 = bArr[i7 + 6];
                j3 ^= ((j722222222 + 255) - (j722222222 | 255)) << 48;
                j3 ^= (((long) bArr[i7 + 5]) & 255) << 40;
                long j62222222222 = bArr[i7 + 4];
                j3 ^= ((j62222222222 + 255) - (j62222222222 | 255)) << 32;
                long j522222222222 = bArr[i7 + 3];
                j3 ^= ((j522222222222 + 255) - (j522222222222 | 255)) << 24;
                j3 ^= (((long) bArr[i7 + 2]) & 255) << 16;
                long j42222222222222 = bArr[i7 + 1];
                j3 ^= ((j42222222222222 + 255) - (j42222222222222 | 255)) << 8;
                byte b222222222222222 = bArr[i7];
                j2 ^= Long.rotateLeft((j3 ^ ((long) ((b222222222222222 + 255) - (b222222222222222 | 255)))) * C1, 31) * C2;
                break;
        }
        long j9 = i3;
        long j10 = j2 ^ j9;
        long j11 = j9 ^ jRotateLeft;
        long j12 = j10 + j11;
        long jFmix64 = fmix64(j12);
        long jFmix642 = fmix64(j11 + j12);
        long j13 = jFmix64 + jFmix642;
        return new long[]{j13, jFmix642 + j13};
    }

    public static int hash32(long j2) {
        return hash32(j2, 104729);
    }

    public static int hash32(long j2, int i2) {
        long jReverseBytes = Long.reverseBytes(j2);
        return fmix32(mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i2)) ^ 8);
    }

    public static int hash32(long j2, long j3) {
        return hash32(j2, j3, 104729);
    }

    public static int hash32(long j2, long j3, int i2) {
        long jReverseBytes = Long.reverseBytes(j2);
        long jReverseBytes2 = Long.reverseBytes(j3);
        return fmix32(mix32((int) (jReverseBytes2 >>> 32), mix32((int) jReverseBytes2, mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i2)))) ^ 16);
    }

    @Deprecated
    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, 104729);
    }

    @Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, 104729);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i2) {
        return hash32(bArr, i2, 104729);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i2, int i3) {
        return hash32(bArr, 0, i2, i3);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3 >> 2;
        for (int i6 = 0; i6 < i5; i6++) {
            i4 = mix32(getLittleEndianInt(bArr, (i6 << 2) + i2), i4);
        }
        int i7 = (i5 << 2) + i2;
        int i8 = (i2 + i3) - i7;
        if (i8 == 1) {
            i4 ^= Integer.rotateLeft((bArr[i7] ^ i) * (-862048943), 15) * C2_32;
        } else {
            if (i8 != 2) {
                i = i8 == 3 ? bArr[i7 + 2] << 16 : 0;
            }
            i ^= bArr[i7 + 1] << 8;
            i4 ^= Integer.rotateLeft((bArr[i7] ^ i) * (-862048943), 15) * C2_32;
        }
        return fmix32(i4 ^ i3);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    public static int hash32x86(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3 >> 2;
        for (int i6 = 0; i6 < i5; i6++) {
            i4 = mix32(getLittleEndianInt(bArr, (i6 << 2) + i2), i4);
        }
        int i7 = (i5 << 2) + i2;
        int i8 = (i2 + i3) - i7;
        if (i8 == 1) {
            byte b2 = bArr[i7];
            i4 ^= Integer.rotateLeft((((b2 + 255) - (b2 | 255)) ^ i) * (-862048943), 15) * C2_32;
        } else {
            if (i8 != 2) {
                i = i8 == 3 ? ((-1) - (((-1) - bArr[i7 + 2]) | ((-1) - 255))) << 16 : 0;
            }
            i ^= (bArr[i7 + 1] & 255) << 8;
            byte b22 = bArr[i7];
            i4 ^= Integer.rotateLeft((((b22 + 255) - (b22 | 255)) ^ i) * (-862048943), 15) * C2_32;
        }
        return fmix32(i4 ^ i3);
    }

    @Deprecated
    public static long hash64(int i2) {
        return fmix64((Long.rotateLeft((((long) Integer.reverseBytes(i2)) & 4294967295L) * C1, 31) * C2) ^ 104733);
    }

    @Deprecated
    public static long hash64(long j2) {
        return fmix64(((Long.rotateLeft((Long.rotateLeft(Long.reverseBytes(j2) * C1, 31) * C2) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    @Deprecated
    public static long hash64(short s2) {
        return fmix64((Long.rotateLeft((((((long) s2) & 255) << 8) ^ (255 & ((long) ((s2 & 65280) >> 8)))) * C1, 31) * C2) ^ 104731);
    }

    @Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, 104729);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i2, int i3) {
        return hash64(bArr, i2, i3, 104729);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Deprecated
    public static long hash64(byte[] bArr, int i2, int i3, int i4) {
        long jRotateLeft = i4;
        int i5 = i3 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            jRotateLeft = (Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(getLittleEndianLong(bArr, i2 + (i6 << 3)) * C1, 31) * C2), 27) * 5) + 1390208809;
        }
        int i7 = i2 + (i5 << 3);
        long j2 = 0;
        switch ((i2 + i3) - i7) {
            case 1:
                long j3 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j3 + 255) - (j3 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 2:
                long j4 = bArr[i7 + 1];
                j2 ^= ((j4 + 255) - (j4 | 255)) << 8;
                long j32 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j32 + 255) - (j32 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 3:
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                long j42 = bArr[i7 + 1];
                j2 ^= ((j42 + 255) - (j42 | 255)) << 8;
                long j322 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j322 + 255) - (j322 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 4:
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 3])) | ((-1) - 255))) << 24;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                long j422 = bArr[i7 + 1];
                j2 ^= ((j422 + 255) - (j422 | 255)) << 8;
                long j3222 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j3222 + 255) - (j3222 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 5:
                long j5 = bArr[i7 + 4];
                j2 ^= ((j5 + 255) - (j5 | 255)) << 32;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 3])) | ((-1) - 255))) << 24;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                long j4222 = bArr[i7 + 1];
                j2 ^= ((j4222 + 255) - (j4222 | 255)) << 8;
                long j32222 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j32222 + 255) - (j32222 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 6:
                long j6 = bArr[i7 + 5];
                j2 ^= ((j6 + 255) - (j6 | 255)) << 40;
                long j52 = bArr[i7 + 4];
                j2 ^= ((j52 + 255) - (j52 | 255)) << 32;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 3])) | ((-1) - 255))) << 24;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                long j42222 = bArr[i7 + 1];
                j2 ^= ((j42222 + 255) - (j42222 | 255)) << 8;
                long j322222 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j322222 + 255) - (j322222 | 255)) ^ j2) * C1, 31) * C2;
                break;
            case 7:
                long j7 = bArr[i7 + 6];
                j2 = ((j7 + 255) - (j7 | 255)) << 48;
                long j62 = bArr[i7 + 5];
                j2 ^= ((j62 + 255) - (j62 | 255)) << 40;
                long j522 = bArr[i7 + 4];
                j2 ^= ((j522 + 255) - (j522 | 255)) << 32;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 3])) | ((-1) - 255))) << 24;
                j2 ^= ((-1) - (((-1) - ((long) bArr[i7 + 2])) | ((-1) - 255))) << 16;
                long j422222 = bArr[i7 + 1];
                j2 ^= ((j422222 + 255) - (j422222 | 255)) << 8;
                long j3222222 = bArr[i7];
                jRotateLeft ^= Long.rotateLeft((((j3222222 + 255) - (j3222222 | 255)) ^ j2) * C1, 31) * C2;
                break;
        }
        return fmix64(((long) i3) ^ jRotateLeft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mix32(int i2, int i3) {
        return (Integer.rotateLeft((Integer.rotateLeft(i2 * (-862048943), 15) * C2_32) ^ i3, 13) * 5) + N_32;
    }
}
