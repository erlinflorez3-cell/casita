package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzul extends zzuq {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzul(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final int zzb() {
        throw null;
    }

    final void zzc(byte b2) {
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        this.zza[i2] = b2;
        this.zzd++;
    }

    final void zzd(int i2) {
        int i3 = this.zzc;
        int i4 = i3 + 1;
        this.zzc = i4;
        byte[] bArr = this.zza;
        bArr[i3] = (byte) (255 & i2);
        int i5 = i3 + 2;
        this.zzc = i5;
        int i6 = i2 >> 8;
        bArr[i4] = (byte) ((i6 + 255) - (i6 | 255));
        int i7 = i3 + 3;
        this.zzc = i7;
        bArr[i5] = (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255)));
        this.zzc = i3 + 4;
        bArr[i7] = (byte) ((i2 >> 24) & 255);
        this.zzd += 4;
    }

    final void zze(long j2) {
        int i2 = this.zzc;
        int i3 = i2 + 1;
        this.zzc = i3;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.zzc = i4;
        bArr[i3] = (byte) ((-1) - (((-1) - (j2 >> 8)) | ((-1) - 255)));
        int i5 = i2 + 3;
        this.zzc = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.zzc = i6;
        long j3 = j2 >> 24;
        bArr[i5] = (byte) ((255 + j3) - (255 | j3));
        int i7 = i2 + 5;
        this.zzc = i7;
        bArr[i6] = (byte) ((-1) - (((-1) - ((int) (j2 >> 32))) | ((-1) - 255)));
        int i8 = i2 + 6;
        this.zzc = i8;
        bArr[i7] = (byte) ((-1) - (((-1) - ((int) (j2 >> 40))) | ((-1) - 255)));
        int i9 = i2 + 7;
        this.zzc = i9;
        int i10 = (int) (j2 >> 48);
        bArr[i8] = (byte) ((i10 + 255) - (i10 | 255));
        this.zzc = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        this.zzd += 8;
    }

    final void zzf(int i2) {
        if (!zzuq.zzb) {
            while (((-128) & i2) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 127)))) & ((-1) - 128)));
                this.zzd++;
                i2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr2[i4] = (byte) i2;
            this.zzd++;
            return;
        }
        long j2 = this.zzc;
        while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
            byte[] bArr3 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            int i6 = (-1) - (((-1) - i2) | ((-1) - 127));
            zzaau.zzn(bArr3, i5, (byte) ((i6 + 128) - (i6 & 128)));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        zzaau.zzn(bArr4, i7, (byte) i2);
        this.zzd += (int) (((long) this.zzc) - j2);
    }

    final void zzg(long j2) {
        if (zzuq.zzb) {
            long j3 = this.zzc;
            while (true) {
                int i2 = (int) j2;
                if ((-1) - (((-1) - j2) | ((-1) - (-128))) == 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    zzaau.zzn(bArr, i3, (byte) i2);
                    this.zzd += (int) (((long) this.zzc) - j3);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                int i5 = (i2 + 127) - (i2 | 127);
                zzaau.zzn(bArr2, i4, (byte) ((i5 + 128) - (i5 & 128)));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                int i6 = (int) j2;
                if ((j2 - 128) - (j2 | (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i7 = this.zzc;
                    this.zzc = i7 + 1;
                    bArr3[i7] = (byte) i6;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i8 = this.zzc;
                this.zzc = i8 + 1;
                bArr4[i8] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - i6) | ((-1) - 127)))) & ((-1) - 128)));
                this.zzd++;
                j2 >>>= 7;
            }
        }
    }
}
