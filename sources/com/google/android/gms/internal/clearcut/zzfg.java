package com.google.android.gms.internal.clearcut;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzfg {
    zzfg() {
    }

    static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i5 = 0;
        while (i5 < length) {
            try {
                char cCharAt = charSequence.charAt(i5);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i5, (byte) cCharAt);
                i5++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i5)).append(" at index ").append(byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)).toString());
            }
        }
        if (i5 == length) {
            byteBuffer.position(iPosition + i5);
            return;
        }
        iPosition += i5;
        while (i5 < length) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 192))));
                    byteBuffer.put(i2, (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128));
                    iPosition = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i5)).append(" at index ").append(byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)).toString());
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    i2 = i5 + 1;
                    if (i2 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i6 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i3 = iPosition + 2;
                                    i4 = (codePoint >>> 12) & 63;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i6;
                                    i5 = i2;
                                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i5)).append(" at index ").append(byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)).toString());
                                }
                                try {
                                    byteBuffer.put(i6, (byte) ((i4 + 128) - (i4 & 128)));
                                    iPosition += 3;
                                    int i7 = codePoint >>> 6;
                                    byteBuffer.put(i3, (byte) (((i7 + 63) - (i7 | 63)) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i5 = i2;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i5 = i2;
                                    iPosition = i3;
                                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(i5)).append(" at index ").append(byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)).toString());
                                }
                            } else {
                                i5 = i2;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new zzfi(i5, length);
                }
                i2 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY))));
                iPosition += 2;
                byteBuffer.put(i2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                int i8 = (cCharAt2 + '?') - (cCharAt2 | '?');
                byteBuffer.put(iPosition, (byte) ((i8 + 128) - (i8 & 128)));
            }
            i5++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    abstract int zzb(int i2, byte[] bArr, int i3, int i4);

    abstract int zzb(CharSequence charSequence, byte[] bArr, int i2, int i3);

    abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    final boolean zze(byte[] bArr, int i2, int i3) {
        return zzb(0, bArr, i2, i3) == 0;
    }
}
