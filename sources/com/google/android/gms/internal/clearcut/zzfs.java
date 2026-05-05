package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfs {
    private final ByteBuffer zzgd;
    private zzbn zzrh;
    private int zzri;

    private zzfs(ByteBuffer byteBuffer) {
        this.zzgd = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzfs(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, i2, i3));
    }

    private static int zza(CharSequence charSequence) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
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
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i4) + 4294967296L).toString());
    }

    private final void zzao(int i2) throws IOException {
        byte b2 = (byte) i2;
        if (!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b2);
    }

    private final void zzap(int i2) throws IOException {
        while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
            zzao((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 127)))) & ((-1) - 128)));
            i2 >>>= 7;
        }
        zzao(i2);
    }

    public static int zzb(int i2, zzfz zzfzVar) {
        int iZzr = zzr(i2);
        int iZzas = zzfzVar.zzas();
        return iZzr + zzz(iZzas) + iZzas;
    }

    public static int zzb(int i2, String str) {
        return zzr(i2) + zzh(str);
    }

    public static int zzb(int i2, byte[] bArr) {
        return zzr(i2) + zzh(bArr);
    }

    public static int zzd(int i2, long j2) {
        return zzr(i2) + zzo(j2);
    }

    private static void zzd(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c2 = 57343;
        int i3 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                int i4 = cCharAt2;
                if (cCharAt2 < 128) {
                    byteBuffer.put((byte) i4);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    i4 = (cCharAt2 & '?') | 128;
                    byteBuffer.put((byte) i4);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i5 = i3 + 1;
                        if (i5 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63)))) & ((-1) - 128))));
                                int i6 = (codePoint >>> 6) & 63;
                                byteBuffer.put((byte) ((i6 + 128) - (i6 & 128)));
                                int i7 = codePoint & 63;
                                byteBuffer.put((byte) ((i7 + 128) - (i7 & 128)));
                                i3 = i5;
                            } else {
                                i3 = i5;
                            }
                        }
                        throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
                    }
                    int i8 = cCharAt2 >>> '\f';
                    byteBuffer.put((byte) ((i8 + 480) - (i8 & 480)));
                    byteBuffer.put((byte) (((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63))) | 128));
                    byteBuffer.put((byte) ((-1) - (((-1) - (cCharAt2 & '?')) & ((-1) - 128))));
                }
                i3++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i9 = iRemaining + iArrayOffset;
            while (i3 < length2) {
                int i10 = i3 + iArrayOffset;
                if (i10 >= i9 || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                bArrArray[i10] = (byte) cCharAt;
                i3++;
            }
            if (i3 == length2) {
                i2 = iArrayOffset + length2;
            } else {
                i2 = iArrayOffset + i3;
                while (i3 < length2) {
                    char cCharAt4 = charSequence.charAt(i3);
                    if (cCharAt4 < 128 && i2 < i9) {
                        int i11 = i2 + 1;
                        bArrArray[i2] = (byte) cCharAt4;
                        i2 = i11;
                    } else if (cCharAt4 < 2048 && i2 <= i9 - 2) {
                        int i12 = i2 + 1;
                        bArrArray[i2] = (byte) ((-1) - (((-1) - (cCharAt4 >>> 6)) & ((-1) - 960)));
                        i2 += 2;
                        bArrArray[i12] = (byte) (((cCharAt4 + '?') - (cCharAt4 | '?')) | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c2 >= cCharAt4) || i2 > i9 - 3) {
                            if (i2 > i9 - 4) {
                                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(cCharAt4).append(" at index ").append(i2).toString());
                            }
                            int i13 = i3 + 1;
                            if (i13 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i2] = (byte) ((-1) - (((-1) - (codePoint2 >>> 18)) & ((-1) - 240)));
                                    bArrArray[i2 + 1] = (byte) ((-1) - (((-1) - ((codePoint2 >>> 12) & 63)) & ((-1) - 128)));
                                    int i14 = i2 + 3;
                                    int i15 = codePoint2 >>> 6;
                                    int i16 = (i15 + 63) - (i15 | 63);
                                    bArrArray[i2 + 2] = (byte) ((i16 + 128) - (i16 & 128));
                                    i2 += 4;
                                    bArrArray[i14] = (byte) ((-1) - (((-1) - ((codePoint2 + 63) - (codePoint2 | 63))) & ((-1) - 128)));
                                    i3 = i13;
                                } else {
                                    i3 = i13;
                                }
                            }
                            throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3 - 1).toString());
                        }
                        bArrArray[i2] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i17 = i2 + 2;
                        int i18 = cCharAt4 >>> 6;
                        bArrArray[i2 + 1] = (byte) ((-1) - (((-1) - ((i18 + 63) - (i18 | 63))) & ((-1) - 128)));
                        i2 += 3;
                        int i19 = (cCharAt4 + '?') - (cCharAt4 | '?');
                        bArrArray[i17] = (byte) ((i19 + 128) - (i19 & 128));
                    }
                    i3++;
                    c2 = 57343;
                }
            }
            byteBuffer.position(i2 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e2) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e2);
            throw bufferOverflowException;
        }
    }

    public static zzfs zzg(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzh(String str) {
        int iZza = zza(str);
        return zzz(iZza) + iZza;
    }

    public static int zzh(byte[] bArr) {
        return zzz(bArr.length) + bArr.length;
    }

    public static zzfs zzh(byte[] bArr, int i2, int i3) {
        return new zzfs(bArr, 0, i3);
    }

    public static long zzj(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzo(long j2) {
        if (((-128) + j2) - ((-128) | j2) == 0) {
            return 1;
        }
        if (((-16384) + j2) - ((-16384) | j2) == 0) {
            return 2;
        }
        if (((-2097152) + j2) - ((-2097152) | j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) + j2) - ((-562949953421312L) | j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) + j2) - ((-72057594037927936L) | j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int zzr(int i2) {
        return zzz(i2 << 3);
    }

    public static int zzs(int i2) {
        if (i2 >= 0) {
            return zzz(i2);
        }
        return 10;
    }

    private static int zzz(int i2) {
        if (((-128) & i2) == 0) {
            return 1;
        }
        if ((-1) - (((-1) - i2) | ((-1) - (-16384))) == 0) {
            return 2;
        }
        if ((-1) - (((-1) - (-2097152)) | ((-1) - i2)) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void zza(int i2, zzfz zzfzVar) throws IOException {
        zzb(i2, 2);
        if (zzfzVar.zzrs < 0) {
            zzfzVar.zzas();
        }
        zzap(zzfzVar.zzrs);
        zzfzVar.zza(this);
    }

    public final void zza(int i2, String str) throws IOException {
        zzb(i2, 2);
        try {
            int iZzz = zzz(str.length());
            if (iZzz != zzz(str.length() * 3)) {
                zzap(zza(str));
                zzd(str, this.zzgd);
                return;
            }
            int iPosition = this.zzgd.position();
            if (this.zzgd.remaining() < iZzz) {
                throw new zzft(iPosition + iZzz, this.zzgd.limit());
            }
            this.zzgd.position(iPosition + iZzz);
            zzd(str, this.zzgd);
            int iPosition2 = this.zzgd.position();
            this.zzgd.position(iPosition);
            zzap((iPosition2 - iPosition) - iZzz);
            this.zzgd.position(iPosition2);
        } catch (BufferOverflowException e2) {
            zzft zzftVar = new zzft(this.zzgd.position(), this.zzgd.limit());
            zzftVar.initCause(e2);
            throw zzftVar;
        }
    }

    public final void zza(int i2, byte[] bArr) throws IOException {
        zzb(i2, 2);
        zzap(bArr.length);
        int length = bArr.length;
        if (this.zzgd.remaining() < length) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(bArr, 0, length);
    }

    public final void zzb(int i2, int i3) throws IOException {
        zzap((i2 << 3) | i3);
    }

    public final void zzb(int i2, boolean z2) throws IOException {
        zzb(25, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        if (!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b2);
    }

    public final void zzc(int i2, int i3) throws IOException {
        zzb(i2, 0);
        if (i3 >= 0) {
            zzap(i3);
        } else {
            zzn(i3);
        }
    }

    public final void zze(int i2, zzdo zzdoVar) throws IOException {
        if (this.zzrh != null) {
            if (this.zzri != this.zzgd.position()) {
                this.zzrh.write(this.zzgd.array(), this.zzri, this.zzgd.position() - this.zzri);
            }
            zzbn zzbnVar = this.zzrh;
            zzbnVar.zza(i2, zzdoVar);
            zzbnVar.flush();
            this.zzri = this.zzgd.position();
        }
        this.zzrh = zzbn.zza(this.zzgd);
        this.zzri = this.zzgd.position();
        zzbn zzbnVar2 = this.zzrh;
        zzbnVar2.zza(i2, zzdoVar);
        zzbnVar2.flush();
        this.zzri = this.zzgd.position();
    }

    public final void zzem() {
        if (this.zzgd.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzgd.remaining())));
        }
    }

    public final void zzi(int i2, long j2) throws IOException {
        zzb(i2, 0);
        zzn(j2);
    }

    public final void zzn(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            int i2 = ((int) j2) & 127;
            zzao((i2 + 128) - (i2 & 128));
            j2 >>>= 7;
        }
        zzao((int) j2);
    }
}
