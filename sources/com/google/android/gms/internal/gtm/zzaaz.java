package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzaaz {
    private static final zzaaw zza;

    static {
        if (zzaau.zzx() && zzaau.zzy()) {
            int i2 = zzto.zza;
        }
        zza = new zzaax();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 != 0) {
            if (i4 == 1) {
                byte b3 = bArr[i2];
                if (b2 <= -12 && b3 <= -65) {
                    return b2 ^ (b3 << 8);
                }
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                byte b4 = bArr[i2];
                byte b5 = bArr[i2 + 1];
                if (b2 <= -12 && b4 <= -65 && b5 <= -65) {
                    return ((b4 << 8) ^ b2) ^ (b5 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    static int zzb(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = charSequence.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = charSequence.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 < 128 && i8 < i4) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                int i9 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                bArr[i8 + 1] = (byte) ((i9 + 128) - (i9 & 128));
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 > i4 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                            throw new zzaay(i7, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                    }
                    int i10 = i7 + 1;
                    if (i10 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i11 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            int i12 = codePoint >>> 18;
                            bArr[i8] = (byte) ((i12 + 240) - (i12 & 240));
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                            i7 = i10;
                        } else {
                            i7 = i10;
                        }
                    }
                    throw new zzaay(i7 - 1, length);
                }
                int i13 = cCharAt2 >>> '\f';
                bArr[i8] = (byte) ((i13 + 480) - (i13 & 480));
                bArr[i8 + 1] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                int i14 = cCharAt2 & '?';
                bArr[i8 + 2] = (byte) ((i14 + 128) - (i14 & 128));
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new zzaay(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i4) + 4294967296L));
    }

    static String zzd(byte[] bArr, int i2, int i3) throws zzyg {
        int i4;
        int length = bArr.length;
        if ((((length - i2) - i3) | ((-1) - (((-1) - i2) & ((-1) - i3)))) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            if (!zzaav.zzd(b2)) {
                break;
            }
            i2++;
            cArr[i6] = (char) b2;
            i6++;
        }
        while (i2 < i5) {
            int i7 = i2 + 1;
            byte b3 = bArr[i2];
            if (zzaav.zzd(b3)) {
                cArr[i6] = (char) b3;
                i6++;
                i2 = i7;
                while (i2 < i5) {
                    byte b4 = bArr[i2];
                    if (zzaav.zzd(b4)) {
                        i2++;
                        cArr[i6] = (char) b4;
                        i6++;
                    }
                }
            } else {
                if (b3 < -32) {
                    if (i7 >= i5) {
                        throw zzyg.zzd();
                    }
                    i4 = i6 + 1;
                    i2 += 2;
                    zzaav.zzc(b3, bArr[i7], cArr, i6);
                } else if (b3 < -16) {
                    if (i7 >= i5 - 1) {
                        throw zzyg.zzd();
                    }
                    i4 = i6 + 1;
                    int i8 = i2 + 2;
                    i2 += 3;
                    zzaav.zzb(b3, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i5 - 2) {
                        throw zzyg.zzd();
                    }
                    byte b5 = bArr[i7];
                    int i9 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    zzaav.zza(b3, b5, b6, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i4;
            }
        }
        return new String(cArr, 0, i6);
    }

    static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzf(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }
}
