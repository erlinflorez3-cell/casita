package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzfj extends zzfg {
    zzfj() {
    }

    private static int zza(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            return zzff.zzam(i2);
        }
        if (i3 == 1) {
            return zzff.zzp(i2, zzfd.zza(bArr, j2));
        }
        if (i3 == 2) {
            return zzff.zzd(i2, zzfd.zza(bArr, j2), zzfd.zza(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.clearcut.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(int r17, byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(CharSequence charSequence, byte[] bArr, int i2, int i3) {
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
            zzfd.zza(bArr, j3, (byte) cCharAt);
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
                    zzfd.zza(bArr, j3, (byte) ((i6 + 960) - (i6 & 960)));
                    j3 += 2;
                    zzfd.zza(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                        if (j3 > j4 - 4) {
                            if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i4 = i5 + 1) != length && Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j3).toString());
                            }
                            throw new zzfi(i5, length);
                        }
                        int i7 = i5 + 1;
                        if (i7 != length) {
                            char cCharAt3 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j2 = 1;
                                zzfd.zza(bArr, j3, (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240))));
                                zzfd.zza(bArr, j3 + 1, (byte) (((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63))) | 128));
                                long j6 = j3 + 3;
                                int i8 = (codePoint >>> 6) & 63;
                                zzfd.zza(bArr, j3 + 2, (byte) ((i8 + 128) - (i8 & 128)));
                                j3 += 4;
                                int i9 = codePoint & 63;
                                zzfd.zza(bArr, j6, (byte) ((i9 + 128) - (i9 & 128)));
                                i5 = i7;
                            } else {
                                i5 = i7;
                            }
                        }
                        throw new zzfi(i5 - 1, length);
                    }
                    int i10 = cCharAt2 >>> '\f';
                    zzfd.zza(bArr, j3, (byte) ((i10 + 480) - (i10 & 480)));
                    long j7 = j3 + 2;
                    int i11 = (cCharAt2 >>> 6) & 63;
                    zzfd.zza(bArr, j3 + 1, (byte) ((i11 + 128) - (i11 & 128)));
                    j3 += 3;
                    zzfd.zza(bArr, j7, (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128))));
                }
                j2 = 1;
            } else {
                zzfd.zza(bArr, j3, (byte) cCharAt2);
                j3 += j2;
            }
            i5++;
        }
        return (int) j3;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j2;
        char c2;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        long jZzb = zzfd.zzb(byteBuffer);
        long jPosition = ((long) byteBuffer.position()) + jZzb;
        long jLimit = ((long) byteBuffer.limit()) + jZzb;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(byteBuffer.limit()).toString());
        }
        int i5 = 0;
        while (true) {
            j2 = 1;
            c2 = 128;
            if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            zzfd.zza(jPosition, (byte) cCharAt);
            i5++;
            jPosition = 1 + jPosition;
        }
        if (i5 == length) {
            i2 = (int) (jPosition - jZzb);
        } else {
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j3 = jPosition + j2;
                        zzfd.zza(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        zzfd.zza(j3, (byte) (((cCharAt2 + '?') - (cCharAt2 | '?')) | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new zzfi(i5, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(jPosition).toString());
                            }
                            i4 = i5 + 1;
                            if (i4 != length) {
                                char cCharAt3 = charSequence.charAt(i4);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    zzfd.zza(jPosition, (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240))));
                                    int i6 = (-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63));
                                    c2 = 128;
                                    zzfd.zza(jPosition + 1, (byte) ((i6 + 128) - (i6 & 128)));
                                    long j4 = jPosition + 3;
                                    zzfd.zza(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    zzfd.zza(j4, (byte) ((-1) - (((-1) - ((-1) - (((-1) - codePoint) | ((-1) - 63)))) & ((-1) - 128))));
                                } else {
                                    i5 = i4;
                                }
                            }
                            throw new zzfi(i5 - 1, length);
                        }
                        long j5 = jPosition + j2;
                        int i7 = cCharAt2 >>> '\f';
                        zzfd.zza(jPosition, (byte) ((i7 + 480) - (i7 & 480)));
                        long j6 = jPosition + 2;
                        int i8 = (-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63));
                        zzfd.zza(j5, (byte) ((i8 + 128) - (i8 & 128)));
                        jPosition += 3;
                        zzfd.zza(j6, (byte) ((-1) - (((-1) - ((cCharAt2 + '?') - (cCharAt2 | '?'))) & ((-1) - 128))));
                    }
                    i4 = i5;
                    c2 = 128;
                } else {
                    zzfd.zza(jPosition, (byte) cCharAt2);
                    i4 = i5;
                    jPosition += j2;
                }
                i5 = i4 + 1;
                j2 = 1;
            }
            i2 = (int) (jPosition - jZzb);
        }
        byteBuffer.position(i2);
    }
}
