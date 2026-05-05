package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzih extends zzif {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzih(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.zzk = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zzf = i3 + i2;
        this.zzh = i2;
        this.zzi = i2;
        this.zze = z2;
    }

    private final byte zzaa() throws IOException {
        int i2 = this.zzh;
        if (i2 == this.zzf) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i2 + 1;
        return bArr[i2];
    }

    private final void zzf(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (i2 <= i3 - i4) {
                this.zzh = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[PHI: r1
  0x006c: PHI (r1v7 int) = (r1v6 int), (r1v8 int) binds: [B:26:0x0050, B:30:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv() throws java.io.IOException {
        /*
            r7 = this;
            int r5 = r7.zzh
            int r1 = r7.zzf
            if (r1 == r5) goto L70
            byte[] r4 = r7.zzd
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L11
            r7.zzh = r3
            return r2
        L11:
            int r1 = r1 - r3
            r0 = 9
            if (r1 < r0) goto L70
            int r1 = r5 + 2
            r0 = r4[r3]
            int r6 = r0 << 7
            r6 = r6 ^ r2
            if (r6 >= 0) goto L24
            r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
        L21:
            r7.zzh = r1
            return r0
        L24:
            int r3 = r5 + 3
            r0 = r4[r1]
            int r2 = r0 << 14
            r2 = r2 ^ r6
            if (r2 < 0) goto L31
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r3
            goto L21
        L31:
            int r1 = r5 + 4
            r0 = r4[r3]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L3f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
        L3e:
            goto L21
        L3f:
            int r3 = r5 + 5
            r1 = r4[r1]
            int r0 = r1 << 28
            r2 = r2 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r0
            if (r1 >= 0) goto L6e
            int r1 = r5 + 6
            r0 = r4[r3]
            if (r0 >= 0) goto L6c
            int r3 = r5 + 7
            r0 = r4[r1]
            if (r0 >= 0) goto L6e
            int r1 = r5 + 8
            r0 = r4[r3]
            if (r0 >= 0) goto L6c
            int r3 = r5 + 9
            r0 = r4[r1]
            if (r0 >= 0) goto L6e
            int r1 = r5 + 10
            r0 = r4[r3]
            if (r0 < 0) goto L70
            r0 = r2
            goto L21
        L6c:
            r0 = r2
            goto L3e
        L6e:
            r0 = r2
            goto L2f
        L70:
            long r1 = r7.zzs()
            int r0 = (int) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzih.zzv():int");
    }

    private final long zzw() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
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
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            j2 = (-2080896) ^ i10;
                            i5 = i9;
                        } else {
                            i5 = i2 + 5;
                            long j5 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i11 = i2 + 6;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j5 = j6 ^ (((long) bArr[i11]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            j2 = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j6 ^ j3;
                                i5 = i11;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                }
                this.zzh = i5;
                return j2;
            }
        }
        return zzs();
    }

    private final int zzx() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i2 + 4;
        int i3 = bArr[i2] & 255;
        int i4 = ((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16;
        return (((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24) | ((i5 + i6) - (i5 & i6));
    }

    private final long zzy() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i2 + 8;
        long j2 = ((long) bArr[i2]) & 255;
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = ((j2 + j3) - (j2 & j3)) | ((((long) bArr[i2 + 2]) & 255) << 16);
        long j5 = ((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24;
        long j6 = (j4 + j5) - (j4 & j5);
        long j7 = ((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 32;
        long j8 = bArr[i2 + 5];
        long j9 = (-1) - (((-1) - (((j6 + j7) - (j6 & j7)) | (((j8 + 255) - (j8 | 255)) << 40))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48)));
        long j10 = bArr[i2 + 7];
        return (-1) - (((-1) - (((j10 + 255) - (j10 | 255)) << 56)) & ((-1) - j9));
    }

    private final void zzz() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = i2 - this.zzi;
        int i4 = this.zzk;
        if (i3 <= i4) {
            this.zzg = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzg = i5;
        this.zzf = i2 - i5;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zza() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzj = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw zzjk.zzd();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zza(int i2) throws zzjk {
        if (this.zzj != i2) {
            throw zzjk.zze();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzb(int i2) throws IOException {
        int iZza;
        int i3 = (-1) - (((-1) - i2) | ((-1) - 7));
        int i4 = 0;
        if (i3 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i4 < 10) {
                    if (zzaa() < 0) {
                        i4++;
                    }
                }
                throw zzjk.zzc();
            }
            while (i4 < 10) {
                byte[] bArr = this.zzd;
                int i5 = this.zzh;
                this.zzh = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzjk.zzc();
            return true;
        }
        if (i3 == 1) {
            zzf(8);
            return true;
        }
        if (i3 == 2) {
            zzf(zzv());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzjk.zzf();
            }
            zzf(4);
            return true;
        }
        do {
            iZza = zza();
            if (iZza == 0) {
                break;
            }
        } while (zzb(iZza));
        int i6 = (i2 >>> 3) << 3;
        zza((i6 + 4) - (i6 & 4));
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzc(int i2) throws zzjk {
        if (i2 < 0) {
            throw zzjk.zzb();
        }
        int iZzu = i2 + zzu();
        int i3 = this.zzk;
        if (iZzu > i3) {
            throw zzjk.zza();
        }
        this.zzk = iZzu;
        zzz();
        return i3;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzd() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zzd(int i2) {
        this.zzk = i2;
        zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzg() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzh() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzi() throws IOException {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzj() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0 && iZzv <= this.zzf - this.zzh) {
            String str = new String(this.zzd, this.zzh, iZzv, zzjf.zza);
            this.zzh += iZzv;
            return str;
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzk() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzv <= i2 - i3) {
                String strZzb = zzmd.zzb(this.zzd, i3, iZzv);
                this.zzh += iZzv;
                return strZzb;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.google.android.gms.internal.vision.zzif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.vision.zzht zzl() throws java.io.IOException {
        /*
            r3 = this;
            int r2 = r3.zzv()
            if (r2 <= 0) goto L19
            int r0 = r3.zzf
            int r1 = r3.zzh
            int r0 = r0 - r1
            if (r2 > r0) goto L19
            byte[] r0 = r3.zzd
            com.google.android.gms.internal.vision.zzht r1 = com.google.android.gms.internal.vision.zzht.zza(r0, r1, r2)
            int r0 = r3.zzh
            int r0 = r0 + r2
            r3.zzh = r0
            return r1
        L19:
            if (r2 != 0) goto L1e
            com.google.android.gms.internal.vision.zzht r0 = com.google.android.gms.internal.vision.zzht.zza
            return r0
        L1e:
            if (r2 <= 0) goto L35
            int r0 = r3.zzf
            int r1 = r3.zzh
            int r0 = r0 - r1
            if (r2 > r0) goto L35
            int r2 = r2 + r1
            r3.zzh = r2
            byte[] r0 = r3.zzd
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
        L30:
            com.google.android.gms.internal.vision.zzht r0 = com.google.android.gms.internal.vision.zzht.zza(r0)
            return r0
        L35:
            if (r2 > 0) goto L41
            if (r2 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.vision.zzjf.zzb
            goto L30
        L3c:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r0
        L41:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzih.zzl():com.google.android.gms.internal.vision.zzht");
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzm() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzn() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzo() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzp() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzq() throws IOException {
        return zze(zzv());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzr() throws IOException {
        return zza(zzw());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    final long zzs() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzaa = zzaa();
            long j3 = ((long) ((-1) - (((-1) - bZzaa) | ((-1) - 127)))) << i2;
            j2 = (j2 + j3) - (j2 & j3);
            if ((bZzaa + 128) - (bZzaa | 128) == 0) {
                return j2;
            }
        }
        throw zzjk.zzc();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzt() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzu() {
        return this.zzh - this.zzi;
    }
}
