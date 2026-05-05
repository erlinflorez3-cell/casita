package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes8.dex */
public final class zzk {
    private static int zza(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = (bArr[i2 + 1] & 255) << 8;
        int i5 = (i3 + i4) - (i3 & i4);
        byte b2 = bArr[i2 + 2];
        int i6 = ((b2 + 255) - (b2 | 255)) << 16;
        int i7 = (i5 + i6) - (i5 & i6);
        byte b3 = bArr[i2 + 3];
        return (-1) - (((-1) - (((b3 + 255) - (b3 | 255)) << 24)) & ((-1) - i7));
    }

    private static long zza(long j2, long j3, long j4) {
        long j5 = (j2 ^ j3) * j4;
        long j6 = ((j5 ^ (j5 >>> 47)) ^ j3) * j4;
        return (j6 ^ (j6 >>> 47)) * j4;
    }

    public static long zza(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException(new StringBuilder(67).append("Out of bound index with offput: 0 and length: ").append(length).toString());
        }
        if (length <= 32) {
            if (length > 16) {
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long jZzb = zzb(bArr, 0) * (-5435081209227447693L);
                long jZzb2 = zzb(bArr, 8);
                long jZzb3 = zzb(bArr, length - 8) * j2;
                return zza(Long.rotateRight(jZzb + jZzb2, 43) + Long.rotateRight(jZzb3, 30) + (zzb(bArr, length - 16) * (-7286425919675154353L)), jZzb + Long.rotateRight(jZzb2 - 7286425919675154353L, 18) + jZzb3, j2);
            }
            if (length >= 8) {
                long j3 = ((long) (length << 1)) - 7286425919675154353L;
                long jZzb4 = zzb(bArr, 0) - 7286425919675154353L;
                long jZzb5 = zzb(bArr, length - 8);
                return zza((Long.rotateRight(jZzb5, 37) * j3) + jZzb4, (Long.rotateRight(jZzb4, 25) + jZzb5) * j3, j3);
            }
            if (length >= 4) {
                long j4 = ((long) (length << 1)) - 7286425919675154353L;
                long jZza = zza(bArr, 0);
                long j5 = ((long) length) + (((jZza + 4294967295L) - (jZza | 4294967295L)) << 3);
                long jZza2 = zza(bArr, length - 4);
                return zza(j5, (jZza2 + 4294967295L) - (jZza2 | 4294967295L), j4);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j6 = (((long) ((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (length + (((-1) - (((-1) - bArr[length - 1]) | ((-1) - 255))) << 2))) * (-4348849565147123417L));
            return (j6 ^ (j6 >>> 47)) * (-7286425919675154353L);
        }
        if (length <= 64) {
            long j7 = ((long) (length << 1)) - 7286425919675154353L;
            long jZzb6 = zzb(bArr, 0) * (-7286425919675154353L);
            long jZzb7 = zzb(bArr, 8);
            long jZzb8 = zzb(bArr, length - 8) * j7;
            long jRotateRight = Long.rotateRight(jZzb6 + jZzb7, 43) + Long.rotateRight(jZzb8, 30) + (zzb(bArr, length - 16) * (-7286425919675154353L));
            long jZza3 = zza(jRotateRight, jZzb8 + jZzb6 + Long.rotateRight(jZzb7 - 7286425919675154353L, 18), j7);
            long jZzb9 = zzb(bArr, 16) * j7;
            long jZzb10 = zzb(bArr, 24);
            long jZzb11 = (jRotateRight + zzb(bArr, length - 32)) * j7;
            return zza(Long.rotateRight(jZzb9 + jZzb10, 43) + Long.rotateRight(jZzb11, 30) + ((jZza3 + zzb(bArr, length - 24)) * j7), jZzb9 + Long.rotateRight(jZzb10 + jZzb6, 18) + jZzb11, j7);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jZzb12 = zzb(bArr, 0) + 95310865018149119L;
        int i2 = length - 1;
        int i3 = (i2 / 64) << 6;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 63));
        int i5 = i3 + i4;
        int i6 = i5 - 63;
        long jZzb13 = 2480279821605975764L;
        long j8 = 1390051526045402406L;
        int i7 = 0;
        while (true) {
            long jRotateRight2 = Long.rotateRight(jZzb12 + jZzb13 + jArr[0] + zzb(bArr, i7 + 8), 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(jZzb13 + jArr[1] + zzb(bArr, i7 + 48), 42) * (-5435081209227447693L);
            long j9 = jRotateRight2 ^ jArr2[1];
            jZzb13 = jRotateRight3 + jArr[0] + zzb(bArr, i7 + 40);
            jZzb12 = Long.rotateRight(j8 + jArr2[0], 33) * (-5435081209227447693L);
            zza(bArr, i7, jArr[1] * (-5435081209227447693L), j9 + jArr2[0], jArr);
            zza(bArr, i7 + 32, jZzb12 + jArr2[1], jZzb13 + zzb(bArr, i7 + 16), jArr2);
            i7 += 64;
            if (i7 == i3) {
                long j10 = (-5435081209227447693L) + ((j9 & 255) << 1);
                long j11 = jArr2[0] + ((long) i4);
                jArr2[0] = j11;
                long j12 = jArr[0] + j11;
                jArr[0] = j12;
                jArr2[0] = jArr2[0] + j12;
                long jRotateRight4 = Long.rotateRight(jZzb12 + jZzb13 + jArr[0] + zzb(bArr, i5 - 55), 37) * j10;
                long jRotateRight5 = Long.rotateRight(jZzb13 + jArr[1] + zzb(bArr, i5 - 15), 42) * j10;
                long j13 = jRotateRight4 ^ (jArr2[1] * 9);
                long jZzb14 = jRotateRight5 + (jArr[0] * 9) + zzb(bArr, i5 - 23);
                long jRotateRight6 = Long.rotateRight(j9 + jArr2[0], 33) * j10;
                zza(bArr, i6, jArr[1] * j10, j13 + jArr2[0], jArr);
                zza(bArr, i5 - 31, jRotateRight6 + jArr2[1], zzb(bArr, i5 - 47) + jZzb14, jArr2);
                return zza(zza(jArr[0], jArr2[0], j10) + (((jZzb14 >>> 47) ^ jZzb14) * (-4348849565147123417L)) + j13, zza(jArr[1], jArr2[1], j10) + jRotateRight6, j10);
            }
            j8 = j9;
        }
    }

    private static void zza(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
        long jZzb = zzb(bArr, i2);
        long jZzb2 = zzb(bArr, i2 + 8);
        long jZzb3 = zzb(bArr, i2 + 16);
        long jZzb4 = zzb(bArr, i2 + 24);
        long j4 = j2 + jZzb;
        long j5 = jZzb2 + j4 + jZzb3;
        long jRotateRight = Long.rotateRight(j3 + j4 + jZzb4, 21) + Long.rotateRight(j5, 44);
        jArr[0] = j5 + jZzb4;
        jArr[1] = jRotateRight + j4;
    }

    private static long zzb(byte[] bArr, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }
}
