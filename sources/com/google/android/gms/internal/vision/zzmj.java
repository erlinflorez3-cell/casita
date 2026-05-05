package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzmj extends zzme {
    zzmj() {
    }

    private static int zza(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            return zzmd.zzb(i2);
        }
        if (i3 == 1) {
            return zzmd.zzb(i2, zzma.zza(bArr, j2));
        }
        if (i3 == 2) {
            return zzmd.zzb(i2, zzma.zza(bArr, j2), zzma.zza(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza(int r17, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzmj.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.vision.zzme
    final int zza(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        long j2;
        int i4;
        char cCharAt;
        long j3 = i2;
        long j4 = ((long) i3) + j3;
        int length = charSequence.length();
        if (length > i3 || bArr.length - i3 < i2) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(i2 + i3).toString());
        }
        int i5 = 0;
        while (true) {
            j2 = 1;
            if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            zzma.zza(bArr, j3, (byte) cCharAt);
            i5++;
            j3 = 1 + j3;
        }
        if (i5 == length) {
            return (int) j3;
        }
        while (i5 < length) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 >= 128 || j3 >= j4) {
                if (cCharAt2 < 2048 && j3 <= j4 - 2) {
                    long j5 = j3 + j2;
                    int i6 = cCharAt2 >>> 6;
                    zzma.zza(bArr, j3, (byte) ((i6 + 960) - (i6 & 960)));
                    j3 += 2;
                    int i7 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                    zzma.zza(bArr, j5, (byte) ((i7 + 128) - (i7 & 128)));
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                        if (j3 > j4 - 4) {
                            if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i4 = i5 + 1) != length && Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j3).toString());
                            }
                            throw new zzmg(i5, length);
                        }
                        int i8 = i5 + 1;
                        if (i8 != length) {
                            char cCharAt3 = charSequence.charAt(i8);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j2 = 1;
                                zzma.zza(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                int i9 = (codePoint >>> 12) & 63;
                                zzma.zza(bArr, j3 + 1, (byte) ((i9 + 128) - (i9 & 128)));
                                long j6 = j3 + 3;
                                zzma.zza(bArr, j3 + 2, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63)))) & ((-1) - 128))));
                                j3 += 4;
                                zzma.zza(bArr, j6, (byte) ((-1) - (((-1) - (codePoint & 63)) & ((-1) - 128))));
                                i5 = i8;
                            } else {
                                i5 = i8;
                            }
                        }
                        throw new zzmg(i5 - 1, length);
                    }
                    int i10 = cCharAt2 >>> '\f';
                    zzma.zza(bArr, j3, (byte) ((i10 + 480) - (i10 & 480)));
                    long j7 = j3 + 2;
                    zzma.zza(bArr, j3 + 1, (byte) ((-1) - (((-1) - ((cCharAt2 >>> 6) & 63)) & ((-1) - 128))));
                    j3 += 3;
                    zzma.zza(bArr, j7, (byte) (((cCharAt2 + '?') - (cCharAt2 | '?')) | 128));
                }
                j2 = 1;
            } else {
                zzma.zza(bArr, j3, (byte) cCharAt2);
                j3 += j2;
            }
            i5++;
        }
        return (int) j3;
    }

    @Override // com.google.android.gms.internal.vision.zzme
    final String zzb(byte[] bArr, int i2, int i3) throws zzjk {
        if ((((-1) - (((-1) - i2) & ((-1) - i3))) | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte bZza = zzma.zza(bArr, i2);
            if (!zzmf.zzd(bZza)) {
                break;
            }
            i2++;
            zzmf.zzb(bZza, cArr, i5);
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte bZza2 = zzma.zza(bArr, i2);
            if (zzmf.zzd(bZza2)) {
                int i7 = i5 + 1;
                zzmf.zzb(bZza2, cArr, i5);
                while (i6 < i4) {
                    byte bZza3 = zzma.zza(bArr, i6);
                    if (!zzmf.zzd(bZza3)) {
                        break;
                    }
                    i6++;
                    zzmf.zzb(bZza3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (zzmf.zze(bZza2)) {
                if (i6 >= i4) {
                    throw zzjk.zzh();
                }
                i2 += 2;
                zzmf.zzb(bZza2, zzma.zza(bArr, i6), cArr, i5);
                i5++;
            } else if (zzmf.zzf(bZza2)) {
                if (i6 >= i4 - 1) {
                    throw zzjk.zzh();
                }
                int i8 = i2 + 2;
                i2 += 3;
                zzmf.zzb(bZza2, zzma.zza(bArr, i6), zzma.zza(bArr, i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw zzjk.zzh();
                }
                byte bZza4 = zzma.zza(bArr, i6);
                int i9 = i2 + 3;
                byte bZza5 = zzma.zza(bArr, i2 + 2);
                i2 += 4;
                zzmf.zzb(bZza2, bZza4, bZza5, zzma.zza(bArr, i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
