package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzhe {
    public static final /* synthetic */ int zza = 0;
    private static final zzhb zzb;

    static {
        if (zzgz.zzx() && zzgz.zzy()) {
            int i2 = zzct.zza;
        }
        zzb = new zzhc();
    }

    static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i4 == 1) {
            return zzh(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return zzi(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    static int zzd(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
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
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i4) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                int i9 = cCharAt2 >>> 6;
                bArr[i8] = (byte) ((i9 + 960) - (i9 & 960));
                bArr[i8 + 1] = (byte) ((-1) - (((-1) - (cCharAt2 & '?')) & ((-1) - 128)));
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 > i4 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new zzhd(i7, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                    }
                    int i10 = i7 + 1;
                    if (i10 != str.length()) {
                        char cCharAt3 = str.charAt(i10);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i11 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            int i12 = codePoint >>> 18;
                            bArr[i8] = (byte) ((i12 + 240) - (i12 & 240));
                            int i13 = codePoint >>> 12;
                            int i14 = (i13 + 63) - (i13 | 63);
                            bArr[i8 + 1] = (byte) ((i14 + 128) - (i14 & 128));
                            int i15 = (codePoint >>> 6) & 63;
                            bArr[i8 + 2] = (byte) ((i15 + 128) - (i15 & 128));
                            i8 += 4;
                            int i16 = codePoint & 63;
                            bArr[i11] = (byte) ((i16 + 128) - (i16 & 128));
                            i7 = i10;
                        } else {
                            i7 = i10;
                        }
                    }
                    throw new zzhd(i7 - 1, length);
                }
                bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - 480)));
                int i17 = cCharAt2 >>> 6;
                bArr[i8 + 1] = (byte) (((i17 + 63) - (i17 | 63)) | 128);
                bArr[i8 + 2] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128)));
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    static int zze(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new zzhd(i3, length2);
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

    static int zzf(int i2, byte[] bArr, int i3, int i4) {
        return zzb.zza(i2, bArr, i3, i4);
    }

    static boolean zzg(byte[] bArr, int i2, int i3) {
        return zzb.zza(0, bArr, i2, i3) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
