package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzbdl extends zzbdq {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzbdl(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
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
        bArr[i4] = (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255)));
        int i6 = i3 + 3;
        this.zzc = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.zzc = i3 + 4;
        bArr[i6] = (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255)));
        this.zzd += 4;
    }

    final void zze(long j2) {
        int i2 = this.zzc;
        int i3 = i2 + 1;
        this.zzc = i3;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) ((j2 + 255) - (j2 | 255));
        int i4 = i2 + 2;
        this.zzc = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.zzc = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.zzc = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.zzc = i7;
        int i8 = (int) (j2 >> 32);
        bArr[i6] = (byte) ((i8 + 255) - (i8 | 255));
        int i9 = i2 + 6;
        this.zzc = i9;
        bArr[i7] = (byte) ((-1) - (((-1) - ((int) (j2 >> 40))) | ((-1) - 255)));
        int i10 = i2 + 7;
        this.zzc = i10;
        bArr[i9] = (byte) ((-1) - (((-1) - ((int) (j2 >> 48))) | ((-1) - 255)));
        this.zzc = i2 + 8;
        int i11 = (int) (j2 >> 56);
        bArr[i10] = (byte) ((i11 + 255) - (i11 | 255));
        this.zzd += 8;
    }

    final void zzf(int i2) {
        if (!zzbdq.zzb) {
            while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) (((i2 + 128) - (128 & i2)) & 255);
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
            zzbhk.zzn(bArr3, i5, (byte) ((i2 | 128) & 255));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        zzbhk.zzn(bArr4, i6, (byte) i2);
        this.zzd += (int) (((long) this.zzc) - j2);
    }

    final void zzg(long j2) {
        if (zzbdq.zzb) {
            long j3 = this.zzc;
            while (true) {
                int i2 = (int) j2;
                if ((j2 - 128) - (j2 | (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    zzbhk.zzn(bArr, i3, (byte) i2);
                    this.zzd += (int) (((long) this.zzc) - j3);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzbhk.zzn(bArr2, i4, (byte) ((-1) - (((-1) - (i2 | 128)) | ((-1) - 255))));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                int i5 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i6 = this.zzc;
                    this.zzc = i6 + 1;
                    bArr3[i6] = (byte) i5;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                bArr4[i7] = (byte) (((i5 + 128) - (i5 & 128)) & 255);
                this.zzd++;
                j2 >>>= 7;
            }
        }
    }
}
