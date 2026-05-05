package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzdk extends zzdn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzdk(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzb(byte b2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zzb, this.zzd, i3);
            this.zzd += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzd(int i2, boolean z2) throws IOException {
        zzt(i2 << 3);
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zze(int i2, zzdf zzdfVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(zzdfVar.zzd());
        zzdfVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzf(int i2, int i3) throws IOException {
        zzt((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzg(int i2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            int i4 = i3 + 1;
            this.zzd = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - i2) | ((-1) - 255)));
            int i5 = i3 + 2;
            this.zzd = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i3 + 3;
            this.zzd = i6;
            int i7 = i2 >> 16;
            bArr[i5] = (byte) ((i7 + 255) - (i7 | 255));
            this.zzd = i3 + 4;
            bArr[i6] = (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255)));
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzh(int i2, long j2) throws IOException {
        int i3 = i2 << 3;
        zzt((i3 + 1) - (i3 & 1));
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzi(long j2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i3 = i2 + 1;
            this.zzd = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i2 + 2;
            this.zzd = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - ((int) (j2 >> 8))) | ((-1) - 255)));
            int i5 = i2 + 3;
            this.zzd = i5;
            int i6 = (int) (j2 >> 16);
            bArr[i4] = (byte) ((i6 + 255) - (i6 | 255));
            int i7 = i2 + 4;
            this.zzd = i7;
            int i8 = (int) (j2 >> 24);
            bArr[i5] = (byte) ((i8 + 255) - (i8 | 255));
            int i9 = i2 + 5;
            this.zzd = i9;
            int i10 = (int) (j2 >> 32);
            bArr[i7] = (byte) ((i10 + 255) - (i10 | 255));
            int i11 = i2 + 6;
            this.zzd = i11;
            int i12 = (int) (j2 >> 40);
            bArr[i9] = (byte) ((i12 + 255) - (i12 | 255));
            int i13 = i2 + 7;
            this.zzd = i13;
            bArr[i11] = (byte) ((-1) - (((-1) - ((int) (j2 >> 48))) | ((-1) - 255)));
            this.zzd = i2 + 8;
            bArr[i13] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzj(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzt(i2);
        } else {
            zzv(i2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    final void zzm(int i2, zzfm zzfmVar, zzge zzgeVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(((zzcq) zzfmVar).zzB(zzgeVar));
        zzgeVar.zzi(zzfmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzn(int i2, zzfm zzfmVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zzfmVar.zzF());
        zzfmVar.zzab(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzo(int i2, zzdf zzdfVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zze(3, zzdfVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzp(int i2, String str) throws IOException {
        int i3 = i2 << 3;
        zzt((i3 + 2) - (i3 & 2));
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i2 = this.zzd;
        try {
            int iZzA = zzA(str.length() * 3);
            int iZzA2 = zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzhe.zze(str));
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = zzhe.zzd(str, bArr, i3, this.zzc - i3);
                return;
            }
            int i4 = i2 + iZzA2;
            this.zzd = i4;
            int iZzd = zzhe.zzd(str, this.zzb, i4, this.zzc - i4);
            this.zzd = i2;
            zzt((iZzd - i2) - iZzA2);
            this.zzd = iZzd;
        } catch (zzhd e2) {
            this.zzd = i2;
            zzD(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzdl(e3);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzr(int i2, int i3) throws IOException {
        zzt((-1) - (((-1) - (i2 << 3)) & ((-1) - i3)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzs(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzt(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzt(int i2) throws IOException {
        while ((i2 - 128) - ((-128) | i2) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                int i4 = i2 | 128;
                bArr[i3] = (byte) ((i4 + 255) - (i4 | 255));
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzu(int i2, long j2) throws IOException {
        zzt(i2 << 3);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzv(long j2) throws IOException {
        if (!zzdn.zzc || this.zzc - this.zzd < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - ((int) j2)) & ((-1) - 128)))) | ((-1) - 255)));
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while (true) {
            int i4 = (int) j2;
            if ((j2 - 128) - (j2 | (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                zzgz.zzn(bArr3, i5, (byte) i4);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            zzgz.zzn(bArr4, i6, (byte) (((-1) - (((-1) - i4) & ((-1) - 128))) & 255));
            j2 >>>= 7;
        }
    }
}
