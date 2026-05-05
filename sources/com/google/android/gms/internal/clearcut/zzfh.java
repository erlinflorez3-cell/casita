package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzfh extends zzfg {
    zzfh() {
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(int i2, byte[] bArr, int i3, int i4) {
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
                        return zzff.zzf(bArr, i5, i4);
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
                    return zzff.zzf(bArr, i5, i4);
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

    @Override // com.google.android.gms.internal.clearcut.zzfg
    final int zzb(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        int length = charSequence.length();
        int i6 = i3 + i2;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i2) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = charSequence.charAt(i7);
            if (cCharAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960)));
                i8 += 2;
                bArr[i9] = (byte) ((-1) - (((-1) - ((cCharAt2 + '?') - (cCharAt2 | '?'))) & ((-1) - 128)));
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                    if (i8 > i6 - 4) {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(cCharAt2).append(" at index ").append(i8).toString());
                        }
                        throw new zzfi(i7, length);
                    }
                    int i10 = i7 + 1;
                    if (i10 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240)));
                            bArr[i8 + 1] = (byte) ((-1) - (((-1) - ((codePoint >>> 12) & 63)) & ((-1) - 128)));
                            int i11 = i8 + 3;
                            int i12 = codePoint >>> 6;
                            bArr[i8 + 2] = (byte) (((i12 + 63) - (i12 | 63)) | 128);
                            i8 += 4;
                            bArr[i11] = (byte) (((codePoint + 63) - (codePoint | 63)) | 128);
                            i7 = i10;
                        } else {
                            i7 = i10;
                        }
                    }
                    throw new zzfi(i7 - 1, length);
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i13 = i8 + 2;
                int i14 = cCharAt2 >>> 6;
                bArr[i8 + 1] = (byte) (((i14 + 63) - (i14 | 63)) | 128);
                i8 += 3;
                int i15 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                bArr[i13] = (byte) ((i15 + 128) - (i15 & 128));
            }
            i7++;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzc(charSequence, byteBuffer);
    }
}
