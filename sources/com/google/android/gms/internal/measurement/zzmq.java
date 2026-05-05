package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
final class zzmq extends zzmr {
    zzmq() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i5 >= i4) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i5 >= i4 - 2) {
                        return zzmp.zza(bArr, i5, i4);
                    }
                    int i6 = i3 + 2;
                    byte b3 = bArr[i5];
                    if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                        int i7 = i3 + 3;
                        if (bArr[i6] <= -65) {
                            i3 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 1) {
                    return zzmp.zza(bArr, i5, i4);
                }
                int i8 = i3 + 2;
                byte b4 = bArr[i5];
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    i3 += 3;
                    if (bArr[i8] > -65) {
                    }
                }
                return -1;
            }
            i3 = i5;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    final int zza(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = i3 + i2;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i2) < i6 && (cCharAt = str.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                int i10 = cCharAt2 >>> 6;
                bArr[i8] = (byte) ((i10 + 960) - (i10 & 960));
                i8 += 2;
                bArr[i9] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                    if (i8 > i6 - 4) {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i4 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                        }
                        throw new zzmt(i7, length);
                    }
                    int i11 = i7 + 1;
                    if (i11 != str.length()) {
                        char cCharAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240)));
                            int i12 = (codePoint >>> 12) & 63;
                            bArr[i8 + 1] = (byte) ((i12 + 128) - (i12 & 128));
                            int i13 = i8 + 3;
                            int i14 = codePoint >>> 6;
                            bArr[i8 + 2] = (byte) (((i14 + 63) - (i14 | 63)) | 128);
                            i8 += 4;
                            bArr[i13] = (byte) ((-1) - (((-1) - ((codePoint + 63) - (codePoint | 63))) & ((-1) - 128)));
                            i7 = i11;
                        } else {
                            i7 = i11;
                        }
                    }
                    throw new zzmt(i7 - 1, length);
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i15 = i8 + 2;
                bArr[i8 + 1] = (byte) (((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63))) | 128);
                i8 += 3;
                int i16 = (cCharAt2 + '?') - (cCharAt2 | '?');
                bArr[i15] = (byte) ((i16 + 128) - (i16 & 128));
            }
            i7++;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    final String zza(byte[] bArr, int i2, int i3) throws zzkb {
        if ((-1) - (((-1) - (i2 | i3)) & ((-1) - ((bArr.length - i2) - i3))) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                break;
            }
            i2++;
            zzmo.zza(b2, cArr, i5);
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i7 = i5 + 1;
                zzmo.zza(b3, cArr, i5);
                while (i6 < i4) {
                    byte b4 = bArr[i6];
                    if (b4 < 0) {
                        break;
                    }
                    i6++;
                    zzmo.zza(b4, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (b3 < -32) {
                if (i6 >= i4) {
                    throw zzkb.zzd();
                }
                i2 += 2;
                zzmo.zza(b3, bArr[i6], cArr, i5);
                i5++;
            } else if (b3 < -16) {
                if (i6 >= i4 - 1) {
                    throw zzkb.zzd();
                }
                int i8 = i2 + 2;
                i2 += 3;
                zzmo.zza(b3, bArr[i6], bArr[i8], cArr, i5);
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw zzkb.zzd();
                }
                byte b5 = bArr[i6];
                int i9 = i2 + 3;
                byte b6 = bArr[i2 + 2];
                i2 += 4;
                zzmo.zza(b3, b5, b6, bArr[i9], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
