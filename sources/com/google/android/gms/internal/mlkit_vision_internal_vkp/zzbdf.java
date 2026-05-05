package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdf extends zzbdj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* synthetic */ zzbdf(byte[] bArr, int i2, int i3, boolean z2, zzbde zzbdeVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i3;
        this.zzh = 0;
        this.zzi = 0;
    }

    private final void zzI() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = this.zzk;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzg = i4;
        this.zzf = i2 - i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final void zzA(int i2) {
        this.zzk = i2;
        zzI();
    }

    public final void zzB(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (i2 <= i3 - i4) {
                this.zzh = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final boolean zzE(int i2) throws IOException {
        int iZzm;
        int i3 = (-1) - (((-1) - i2) | ((-1) - 7));
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i4 < 10) {
                    if (zza() < 0) {
                        i4++;
                    }
                }
                throw new zzbew("CodedInputStream encountered a malformed varint.");
            }
            while (i4 < 10) {
                byte[] bArr = this.zze;
                int i5 = this.zzh;
                this.zzh = i5 + 1;
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
        int i2 = this.zzh;
        if (i2 == this.zzf) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final int zze(int i2) throws zzbew {
        if (i2 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.zzh;
        if (i3 < 0) {
            throw new zzbew("Failed to parse the message.");
        }
        int i4 = this.zzk;
        if (i3 > i4) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i3;
        zzI();
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
        int i3 = bArr[i2] & 255;
        int i4 = (-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255));
        int i5 = (-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255));
        return (((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24) | ((-1) - (((-1) - ((i4 << 8) | i3)) & ((-1) - (i5 << 16))));
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0071 A[PHI: r1
  0x0071: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:69:0x0056, B:73:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() throws java.io.IOException {
        /*
            r7 = this;
            int r5 = r7.zzh
            int r1 = r7.zzf
            if (r1 != r5) goto Lc
        L6:
            long r1 = r7.zzs()
            int r0 = (int) r1
            return r0
        Lc:
            byte[] r4 = r7.zze
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L17
            r7.zzh = r3
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
            r7.zzh = r1
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdf.zzj():int");
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
        long j2 = bArr[i2];
        long j3 = (j2 + 255) - (j2 | 255);
        long j4 = ((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 8;
        long j5 = bArr[i2 + 2];
        long j6 = bArr[i2 + 3];
        long j7 = bArr[i2 + 4];
        long j8 = bArr[i2 + 5];
        long j9 = ((-1) - (((-1) - (j3 | j4)) & ((-1) - (((-1) - (((-1) - j5) | ((-1) - 255))) << 16)))) | ((j6 & 255) << 24);
        long j10 = (j7 & 255) << 32;
        long j11 = (j9 + j10) - (j9 & j10);
        long j12 = ((j8 + 255) - (j8 | 255)) << 40;
        return (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56) | ((j11 + j12) - (j11 & j12)) | (((-1) - (((-1) - bArr[i2 + 6]) | ((-1) - 255))) << 48);
    }

    public final long zzr() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzh = i4;
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
                this.zzh = i5;
                return j2;
            }
        }
        return zzs();
    }

    final long zzs() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZza = zza();
            long j3 = ((long) (127 & bZza)) << i2;
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
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                zzbdd zzbddVarZzo = zzbdd.zzo(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return zzbddVarZzo;
            }
        }
        if (iZzj == 0) {
            return zzbdd.zzb;
        }
        if (iZzj > 0) {
            int i4 = this.zzf;
            int i5 = this.zzh;
            if (iZzj <= i4 - i5) {
                int i6 = iZzj + i5;
                this.zzh = i6;
                return new zzbdc(Arrays.copyOfRange(this.zze, i5, i6));
            }
        }
        if (iZzj <= 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zze, i3, iZzj, zzbeu.zza);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String strZzd = zzbhp.zzd(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdj
    public final void zzz(int i2) throws zzbew {
        if (this.zzj != i2) {
            throw new zzbew("Protocol message end-group tag did not match expected tag.");
        }
    }
}
