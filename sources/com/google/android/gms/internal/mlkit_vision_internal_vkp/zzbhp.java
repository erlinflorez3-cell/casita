package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbhp {
    private static final zzbhm zza;

    static {
        if (zzbhk.zzx() && zzbhk.zzy()) {
            int i2 = zzbcn.zza;
        }
        zza = new zzbhn();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
        }
        if (i4 == 1) {
            byte b3 = bArr[i2];
            if (b2 > -12 || b3 > -65) {
                return -1;
            }
            return (b3 << 8) ^ b2;
        }
        if (i4 != 2) {
            throw new AssertionError();
        }
        byte b4 = bArr[i2];
        byte b5 = bArr[i2 + 1];
        if (b2 > -12 || b4 > -65 || b5 > -65) {
            return -1;
        }
        return (b5 << 16) ^ ((b4 << 8) ^ b2);
    }

    static int zzb(String str, byte[] bArr, int i2, int i3) {
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
                bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960)));
                bArr[i8 + 1] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 > i4 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new zzbho(i7, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                    }
                    int i9 = i7 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i10 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            int i11 = codePoint >>> 18;
                            bArr[i8] = (byte) ((i11 + 240) - (i11 & 240));
                            int i12 = (-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63));
                            bArr[i8 + 1] = (byte) ((i12 + 128) - (i12 & 128));
                            int i13 = codePoint >>> 6;
                            bArr[i8 + 2] = (byte) (((i13 + 63) - (i13 | 63)) | 128);
                            i8 += 4;
                            bArr[i10] = (byte) ((-1) - (((-1) - (codePoint & 63)) & ((-1) - 128)));
                            i7 = i9;
                        } else {
                            i7 = i9;
                        }
                    }
                    throw new zzbho(i7 - 1, length);
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i8 + 1] = (byte) ((-1) - (((-1) - ((cCharAt2 >>> 6) & 63)) & ((-1) - 128)));
                bArr[i8 + 2] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128)));
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    static int zzc(String str) {
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
                                throw new zzbho(i3, length2);
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

    static String zzd(byte[] bArr, int i2, int i3) throws zzbew {
        int i4;
        int length = bArr.length;
        int i5 = (i2 + i3) - (i2 & i3);
        int i6 = (length - i2) - i3;
        if ((i6 + i5) - (i6 & i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i7 = i2 + i3;
        char[] cArr = new char[i3];
        int i8 = 0;
        while (i2 < i7) {
            byte b2 = bArr[i2];
            if (!zzbhl.zzd(b2)) {
                break;
            }
            i2++;
            cArr[i8] = (char) b2;
            i8++;
        }
        while (i2 < i7) {
            int i9 = i2 + 1;
            byte b3 = bArr[i2];
            if (zzbhl.zzd(b3)) {
                cArr[i8] = (char) b3;
                i8++;
                i2 = i9;
                while (i2 < i7) {
                    byte b4 = bArr[i2];
                    if (zzbhl.zzd(b4)) {
                        i2++;
                        cArr[i8] = (char) b4;
                        i8++;
                    }
                }
            } else {
                if (b3 < -32) {
                    if (i9 >= i7) {
                        throw new zzbew("Protocol message had invalid UTF-8.");
                    }
                    i4 = i8 + 1;
                    i2 += 2;
                    zzbhl.zzc(b3, bArr[i9], cArr, i8);
                } else if (b3 < -16) {
                    if (i9 >= i7 - 1) {
                        throw new zzbew("Protocol message had invalid UTF-8.");
                    }
                    i4 = i8 + 1;
                    int i10 = i2 + 2;
                    i2 += 3;
                    zzbhl.zzb(b3, bArr[i9], bArr[i10], cArr, i8);
                } else {
                    if (i9 >= i7 - 2) {
                        throw new zzbew("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i9];
                    int i11 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    zzbhl.zza(b3, b5, b6, bArr[i11], cArr, i8);
                    i8 += 2;
                }
                i8 = i4;
            }
        }
        return new String(cArr, 0, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean zze(byte[] r7, int r8, int r9) {
        /*
        L0:
            if (r8 >= r9) goto L9
            r0 = r7[r8]
            if (r0 < 0) goto L9
            int r8 = r8 + 1
            goto L0
        L9:
            if (r8 < r9) goto Ld
        Lb:
            r0 = 1
            return r0
        Ld:
            if (r8 >= r9) goto Lb
            int r1 = r8 + 1
            r6 = r7[r8]
            if (r6 >= 0) goto L77
            r5 = -32
            r3 = -65
            if (r6 >= r5) goto L2c
            if (r1 < r9) goto L21
        L1d:
            if (r6 == 0) goto Lb
        L1f:
            r0 = 0
            return r0
        L21:
            r0 = -62
            if (r6 < r0) goto L1f
            int r8 = r8 + 2
            r0 = r7[r1]
            if (r0 <= r3) goto Ld
            goto L1f
        L2c:
            r0 = -16
            if (r6 >= r0) goto L52
            int r0 = r9 + (-1)
            if (r1 < r0) goto L39
            int r6 = zza(r7, r1, r9)
            goto L1d
        L39:
            int r4 = r8 + 2
            r2 = r7[r1]
            if (r2 > r3) goto L1f
            r1 = -96
            if (r6 != r5) goto L45
            if (r2 < r1) goto L1f
        L45:
            r0 = -19
            if (r6 != r0) goto L4b
            if (r2 >= r1) goto L1f
        L4b:
            int r8 = r8 + 3
            r0 = r7[r4]
            if (r0 <= r3) goto Ld
            goto L1f
        L52:
            int r0 = r9 + (-2)
            if (r1 < r0) goto L5b
            int r6 = zza(r7, r1, r9)
            goto L1d
        L5b:
            int r2 = r8 + 2
            r0 = r7[r1]
            if (r0 > r3) goto L1f
            int r1 = r6 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L1f
            int r1 = r8 + 3
            r0 = r7[r2]
            if (r0 > r3) goto L1f
            int r8 = r8 + 4
            r0 = r7[r1]
            if (r0 > r3) goto L1f
            goto Ld
        L77:
            r8 = r1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhp.zze(byte[], int, int):boolean");
    }
}
