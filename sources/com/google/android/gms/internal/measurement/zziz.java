package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zziz extends zziw {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private zziz(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i3 + i2;
        this.zzg = i2;
        this.zzh = i2;
    }

    private final void zzaa() {
        int i2 = this.zze + this.zzf;
        this.zze = i2;
        int i3 = i2 - this.zzh;
        int i4 = this.zzj;
        if (i3 <= i4) {
            this.zzf = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzf = i5;
        this.zze = i2 - i5;
    }

    private final void zzf(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zze;
            int i4 = this.zzg;
            if (i2 <= i3 - i4) {
                this.zzg = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    private final byte zzv() throws IOException {
        int i2 = this.zzg;
        if (i2 == this.zze) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 1;
        return bArr[i2];
    }

    private final int zzw() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 4;
        int i3 = bArr[i2] & 255;
        byte b2 = bArr[i2 + 1];
        int i4 = ((b2 + 255) - (b2 | 255)) << 8;
        int i5 = (-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - ((bArr[i2 + 2] & 255) << 16)));
        int i6 = ((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24;
        return (i6 + i5) - (i6 & i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[PHI: r1
  0x006c: PHI (r1v7 int) = (r1v6 int), (r1v8 int) binds: [B:26:0x0050, B:30:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzx() throws java.io.IOException {
        /*
            r7 = this;
            int r5 = r7.zzg
            int r1 = r7.zze
            if (r1 == r5) goto L70
            byte[] r4 = r7.zzd
            int r3 = r5 + 1
            r2 = r4[r5]
            if (r2 < 0) goto L11
            r7.zzg = r3
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
            r7.zzg = r1
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
            long r1 = r7.zzm()
            int r0 = (int) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziz.zzx():int");
    }

    private final long zzy() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 8;
        long j2 = (-1) - (((-1) - ((((long) bArr[i2]) & 255) | (((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 8))) & ((-1) - ((((long) bArr[i2 + 2]) & 255) << 16)));
        long j3 = bArr[i2 + 3];
        long j4 = j2 | (((j3 + 255) - (j3 | 255)) << 24);
        long j5 = bArr[i2 + 4];
        long j6 = ((j5 + 255) - (j5 | 255)) << 32;
        long j7 = bArr[i2 + 5];
        long j8 = (-1) - (((-1) - ((j4 + j6) - (j4 & j6))) & ((-1) - (((j7 + 255) - (j7 | 255)) << 40)));
        long j9 = (((long) bArr[i2 + 6]) & 255) << 48;
        return (-1) - (((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56)) & ((-1) - ((j8 + j9) - (j8 & j9))));
    }

    private final long zzz() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzg = i4;
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
                this.zzg = i5;
                return j2;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb(int i2) throws zzkb {
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        int iZzc = i2 + zzc();
        if (iZzc < 0) {
            throw zzkb.zzg();
        }
        int i3 = this.zzj;
        if (iZzc > i3) {
            throw zzkb.zzi();
        }
        this.zzj = iZzc;
        zzaa();
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzc(int i2) throws zzkb {
        if (this.zzi != i2) {
            throw zzkb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzd(int i2) {
        this.zzj = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zze(int i2) throws IOException {
        boolean zZze;
        int i3 = (i2 + 7) - (7 | i2);
        int i4 = 0;
        if (i3 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i4 < 10) {
                    if (zzv() < 0) {
                        i4++;
                    }
                }
                throw zzkb.zze();
            }
            while (i4 < 10) {
                byte[] bArr = this.zzd;
                int i5 = this.zzg;
                this.zzg = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i3 == 1) {
            zzf(8);
            return true;
        }
        if (i3 == 2) {
            zzf(zzx());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzkb.zza();
            }
            zzf(4);
            return true;
        }
        do {
            int iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
            if (this.zza >= this.zzb) {
                throw zzkb.zzh();
            }
            this.zza++;
            zZze = zze(iZzi);
            this.zza--;
        } while (zZze);
        zzc(((i2 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzh() throws IOException {
        return zza(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzi = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzkb.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final long zzm() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzv = zzv();
            long j3 = ((long) ((-1) - (((-1) - bZzv) | ((-1) - 127)))) << i2;
            j2 = (j2 + j3) - (j2 & j3);
            if ((-1) - (((-1) - bZzv) | ((-1) - 128)) == 0) {
                return j2;
            }
        }
        throw zzkb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzo() throws IOException {
        return zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzp() throws IOException {
        return zzz();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.google.android.gms.internal.measurement.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzik zzq() throws java.io.IOException {
        /*
            r3 = this;
            int r2 = r3.zzx()
            if (r2 <= 0) goto L19
            int r0 = r3.zze
            int r1 = r3.zzg
            int r0 = r0 - r1
            if (r2 > r0) goto L19
            byte[] r0 = r3.zzd
            com.google.android.gms.internal.measurement.zzik r1 = com.google.android.gms.internal.measurement.zzik.zza(r0, r1, r2)
            int r0 = r3.zzg
            int r0 = r0 + r2
            r3.zzg = r0
            return r1
        L19:
            if (r2 != 0) goto L1e
            com.google.android.gms.internal.measurement.zzik r0 = com.google.android.gms.internal.measurement.zzik.zza
            return r0
        L1e:
            if (r2 <= 0) goto L35
            int r0 = r3.zze
            int r1 = r3.zzg
            int r0 = r0 - r1
            if (r2 > r0) goto L35
            int r2 = r2 + r1
            r3.zzg = r2
            byte[] r0 = r3.zzd
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
        L30:
            com.google.android.gms.internal.measurement.zzik r0 = com.google.android.gms.internal.measurement.zzik.zzb(r0)
            return r0
        L35:
            if (r2 > 0) goto L41
            if (r2 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.measurement.zzjv.zzb
            goto L30
        L3c:
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.measurement.zzkb r0 = com.google.android.gms.internal.measurement.zzkb.zzi()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziz.zzq():com.google.android.gms.internal.measurement.zzik");
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzr() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0 && iZzx <= this.zze - this.zzg) {
            String str = new String(this.zzd, this.zzg, iZzx, zzjv.zza);
            this.zzg += iZzx;
            return str;
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzs() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (iZzx <= i2 - i3) {
                String strZzb = zzmp.zzb(this.zzd, i3, iZzx);
                this.zzg += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }
}
