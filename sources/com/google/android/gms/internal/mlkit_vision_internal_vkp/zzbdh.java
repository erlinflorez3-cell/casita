package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdh extends zzbdj {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzbdh(InputStream inputStream, int i2, zzbdg zzbdgVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zzbeu.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.zze.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    private final void zzK(int i2) throws IOException {
        if (zzL(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzbew("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzL(int i2) throws IOException {
        int i3 = this.zzi;
        int i4 = i3 + i2;
        int i5 = this.zzg;
        if (i4 <= i5) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i6 = this.zzk;
        if (i2 > (Integer.MAX_VALUE - i6) - i3 || i6 + i3 + i2 > this.zzl) {
            return false;
        }
        if (i3 > 0) {
            if (i5 > i3) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i6 = this.zzk + i3;
            this.zzk = i6;
            i5 = this.zzg - i3;
            this.zzg = i5;
            this.zzi = 0;
        }
        try {
            int i7 = this.zze.read(this.zzf, i5, Math.min(4096 - i5, (Integer.MAX_VALUE - i6) - i5));
            if (i7 == 0 || i7 < -1 || i7 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.zzg += i7;
            zzJ();
            if (this.zzg >= i2) {
                return true;
            }
            return zzL(i2);
        } catch (zzbew e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzM(int i2, boolean z2) throws IOException {
        byte[] bArrZzN = zzN(i2);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i2) throws IOException {
        if (i2 == 0) {
            return zzbeu.zzb;
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw new zzbew("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.zzl;
        if (i5 > i6) {
            zzB((i6 - i3) - i4);
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.zzg - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096) {
            try {
                if (i8 > this.zze.available()) {
                    return null;
                }
            } catch (zzbew e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i7);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i7 < i2) {
            try {
                int i9 = this.zze.read(bArr, i7, i2 - i7);
                if (i9 == -1) {
                    throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i9;
                i7 += i9;
            } catch (zzbew e3) {
                e3.zza();
                throw e3;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final void zzA(int i2) {
        this.zzl = i2;
        zzJ();
    }

    public final void zzB(int i2) throws IOException {
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzi = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.zzk;
        int i7 = i6 + i4;
        int i8 = this.zzl;
        if (i7 + i2 > i8) {
            zzB((i8 - i6) - i4);
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i7;
        this.zzg = 0;
        this.zzi = 0;
        while (i5 < i2) {
            try {
                long j2 = i2 - i5;
                try {
                    long jSkip = this.zze.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (zzbew e2) {
                    e2.zza();
                    throw e2;
                }
            } finally {
                this.zzk += i5;
                zzJ();
            }
        }
        if (i5 >= i2) {
            return;
        }
        int i9 = this.zzg;
        int i10 = i9 - this.zzi;
        this.zzi = i9;
        zzK(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.zzg;
            if (i11 <= i12) {
                this.zzi = i11;
                return;
            } else {
                i10 += i12;
                this.zzi = i12;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzE(int i2) throws IOException {
        int iZzm;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i4 < 10) {
                    if (zza() < 0) {
                        i4++;
                    }
                }
                throw new zzbew("CodedInputStream encountered a malformed varint.");
            }
            while (i4 < 10) {
                byte[] bArr = this.zzf;
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw new zzbew("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            zzB(8);
            return true;
        }
        if (i3 == 2) {
            zzB(zzj());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        int i6 = (i2 >>> 3) << 3;
        zzz((i6 + 4) - (i6 & 4));
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zze(int i2) throws zzbew {
        if (i2 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.zzk + this.zzi;
        if (i3 < 0) {
            throw new zzbew("Failed to parse the message.");
        }
        int i4 = this.zzl;
        if (i3 > i4) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i3;
        zzJ();
        return i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzK(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        byte b2 = bArr[i2 + 1];
        int i4 = (b2 + 255) - (b2 | 255);
        byte b3 = bArr[i2 + 2];
        int i5 = (b3 + 255) - (b3 | 255);
        byte b4 = bArr[i2 + 3];
        int i6 = (b4 + 255) - (b4 | 255);
        int i7 = i4 << 8;
        int i8 = (i7 + i3) - (i7 & i3);
        int i9 = i5 << 16;
        return (-1) - (((-1) - (i6 << 24)) & ((-1) - ((i8 + i9) - (i8 & i9))));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[PHI: r1
  0x0071: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:28:0x0056, B:32:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() throws java.io.IOException {
        /*
            r7 = this;
            int r5 = r7.zzi
            int r1 = r7.zzg
            if (r1 != r5) goto Lc
        L6:
            long r1 = r7.zzs()
            int r0 = (int) r1
            return r0
        Lc:
            byte[] r4 = r7.zzf
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L17
            r7.zzi = r3
            return r2
        L17:
            int r1 = r1 - r3
            r0 = 9
            if (r1 < r0) goto L6
            int r1 = r5 + 2
            r0 = r4[r3]
            int r6 = r0 << 7
            r6 = r6 ^ r2
            if (r6 >= 0) goto L2a
            r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
        L27:
            r7.zzi = r1
            return r0
        L2a:
            int r3 = r5 + 3
            r0 = r4[r1]
            int r2 = r0 << 14
            r2 = r2 ^ r6
            if (r2 < 0) goto L37
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L35:
            r1 = r3
            goto L27
        L37:
            int r1 = r5 + 4
            r0 = r4[r3]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L45
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
        L44:
            goto L27
        L45:
            int r3 = r5 + 5
            r1 = r4[r1]
            int r0 = r1 << 28
            r2 = r2 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r0
            if (r1 >= 0) goto L73
            int r1 = r5 + 6
            r0 = r4[r3]
            if (r0 >= 0) goto L71
            int r3 = r5 + 7
            r0 = r4[r1]
            if (r0 >= 0) goto L73
            int r1 = r5 + 8
            r0 = r4[r3]
            if (r0 >= 0) goto L71
            int r3 = r5 + 9
            r0 = r4[r1]
            if (r0 >= 0) goto L73
            int r1 = r5 + 10
            r0 = r4[r3]
            if (r0 >= 0) goto L75
            goto L6
        L71:
            r0 = r2
            goto L44
        L73:
            r0 = r2
            goto L35
        L75:
            r0 = r2
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdh.zzj():int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzl() throws IOException {
        return zzF(zzj());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw new zzbew("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzK(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        long j2 = bArr[i2];
        long j3 = (j2 + 255) - (j2 | 255);
        long j4 = ((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 8;
        long j5 = bArr[i2 + 2];
        long j6 = bArr[i2 + 3];
        long j7 = bArr[i2 + 4];
        long j8 = bArr[i2 + 5];
        long j9 = bArr[i2 + 6];
        long j10 = bArr[i2 + 7];
        long j11 = (-1) - (((-1) - j9) | ((-1) - 255));
        return (-1) - (((-1) - (((j10 + 255) - (j10 | 255)) << 56)) & ((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - ((j3 | j4) | (((-1) - (((-1) - j5) | ((-1) - 255))) << 16))) & ((-1) - (((j6 + 255) - (j6 | 255)) << 24)))) | ((j7 & 255) << 32))) & ((-1) - (((-1) - (((-1) - j8) | ((-1) - 255))) << 40))))) & ((-1) - (j11 << 48))))));
    }

    public final long zzr() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzi = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j2 = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i9 < 0) {
                            j2 = (-2080896) ^ i9;
                        } else {
                            i7 = i2 + 5;
                            long j4 = (((long) bArr[i5]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j2 = j4 ^ 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j5 = (((long) bArr[i7]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i2 + 7;
                                    long j6 = j5 ^ (((long) bArr[i5]) << 42);
                                    if (j6 >= 0) {
                                        j2 = j6 ^ 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i2 + 9;
                                            long j7 = (j5 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i2 + 10;
                                                if (bArr[i10] >= 0) {
                                                    j2 = j7;
                                                }
                                            } else {
                                                j2 = j7;
                                            }
                                        }
                                    }
                                    i5 = i10;
                                }
                                j2 = j5 ^ j3;
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return j2;
            }
        }
        return zzs();
    }

    final long zzs() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZza = zza();
            long j3 = ((long) ((-1) - (((-1) - bZza) | ((-1) - 127)))) << i2;
            j2 = (j2 + j3) - (j2 & j3);
            if ((-1) - (((-1) - bZza) | ((-1) - 128)) == 0) {
                return j2;
            }
        }
        throw new zzbew("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final long zzu() throws IOException {
        return zzG(zzr());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final zzbdd zzw() throws IOException {
        int iZzj = zzj();
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (iZzj <= i2 - i3 && iZzj > 0) {
            zzbdd zzbddVarZzo = zzbdd.zzo(this.zzf, i3, iZzj);
            this.zzi += iZzj;
            return zzbddVarZzo;
        }
        if (iZzj == 0) {
            return zzbdd.zzb;
        }
        if (iZzj < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzN = zzN(iZzj);
        if (bArrZzN != null) {
            return zzbdd.zzo(bArrZzN, 0, bArrZzN.length);
        }
        int i4 = this.zzi;
        int i5 = this.zzg;
        int i6 = i5 - i4;
        this.zzk += i5;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzj - i6);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i4, bArr, 0, i6);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return new zzbdc(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zzf, i3, iZzj, zzbeu.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzj > this.zzg) {
            return new String(zzM(iZzj, false), zzbeu.zza);
        }
        zzK(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzbeu.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final String zzy() throws IOException {
        byte[] bArrZzM;
        int iZzj = zzj();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (iZzj <= i3 - i2 && iZzj > 0) {
            bArrZzM = this.zzf;
            this.zzi = i2 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (iZzj <= i3) {
                zzK(iZzj);
                bArrZzM = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzM = zzM(iZzj, false);
            }
        }
        return zzbhp.zzd(bArrZzM, i2, iZzj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final void zzz(int i2) throws zzbew {
        if (this.zzj != i2) {
            throw new zzbew("Protocol message end-group tag did not match expected tag.");
        }
    }
}
