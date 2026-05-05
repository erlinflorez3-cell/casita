package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzum extends zzuq {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzum(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if ((-1) - (((-1) - (length - i3)) & ((-1) - i3)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzJ() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzK(byte b2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzL(int i2, boolean z2) throws IOException {
        zzu(i2 << 3);
        zzK(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzM(int i2, zzud zzudVar) throws IOException {
        zzu((-1) - (((-1) - (i2 << 3)) & ((-1) - 2)));
        zzu(zzudVar.zzd());
        zzudVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq, com.google.android.gms.internal.gtm.zztt
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zze(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzh(int i2, int i3) throws IOException {
        zzu((-1) - (((-1) - (i2 << 3)) & ((-1) - 5)));
        zzi(i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzi(int i2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) (255 & i2);
            int i5 = i3 + 2;
            this.zzc = i5;
            bArr[i4] = (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255)));
            int i6 = i3 + 3;
            this.zzc = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.zzc = i3 + 4;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzj(int i2, long j2) throws IOException {
        zzu((-1) - (((-1) - (i2 << 3)) & ((-1) - 1)));
        zzk(j2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzk(long j2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            this.zzc = i3;
            int i4 = (int) j2;
            bArr[i2] = (byte) ((i4 + 255) - (i4 | 255));
            int i5 = i2 + 2;
            this.zzc = i5;
            int i6 = (int) (j2 >> 8);
            bArr[i3] = (byte) ((i6 + 255) - (i6 | 255));
            int i7 = i2 + 3;
            this.zzc = i7;
            bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
            int i8 = i2 + 4;
            this.zzc = i8;
            bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
            int i9 = i2 + 5;
            this.zzc = i9;
            bArr[i8] = (byte) ((-1) - (((-1) - ((int) (j2 >> 32))) | ((-1) - 255)));
            int i10 = i2 + 6;
            this.zzc = i10;
            bArr[i9] = (byte) ((-1) - (((-1) - ((int) (j2 >> 40))) | ((-1) - 255)));
            int i11 = i2 + 7;
            this.zzc = i11;
            int i12 = (int) (j2 >> 48);
            bArr[i10] = (byte) ((i12 + 255) - (i12 | 255));
            this.zzc = i2 + 8;
            bArr[i11] = (byte) ((-1) - (((-1) - ((int) (j2 >> 56))) | ((-1) - 255)));
        } catch (IndexOutOfBoundsException e2) {
            throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzl(int i2, int i3) throws IOException {
        zzu(i2 << 3);
        zzm(i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzm(int i2) throws IOException {
        if (i2 >= 0) {
            zzu(i2);
        } else {
            zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    final void zzn(int i2, zzzg zzzgVar, zzzt zzztVar) throws IOException {
        zzu((i2 << 3) | 2);
        zzu(((zztl) zzzgVar).zzQ(zzztVar));
        zzztVar.zzm(zzzgVar, this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzo(int i2, zzzg zzzgVar) throws IOException {
        zzu(11);
        zzt(2, i2);
        zzu(26);
        zzu(zzzgVar.zzX());
        zzzgVar.zzaw(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzp(int i2, zzud zzudVar) throws IOException {
        zzu(11);
        zzt(2, i2);
        zzM(3, zzudVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzq(int i2, String str) throws IOException {
        zzu((-1) - (((-1) - (i2 << 3)) & ((-1) - 2)));
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i2 = this.zzc;
        try {
            int iZzD = zzD(str.length() * 3);
            int iZzD2 = zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(zzaaz.zzc(str));
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = zzaaz.zzb(str, bArr, i3, this.zzb - i3);
                return;
            }
            int i4 = i2 + iZzD2;
            this.zzc = i4;
            int iZzb = zzaaz.zzb(str, this.zza, i4, this.zzb - i4);
            this.zzc = i2;
            zzu((iZzb - i2) - iZzD2);
            this.zzc = iZzb;
        } catch (zzaay e2) {
            this.zzc = i2;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzun(e3);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzs(int i2, int i3) throws IOException {
        zzu((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzt(int i2, int i3) throws IOException {
        zzu(i2 << 3);
        zzu(i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzu(int i2) throws IOException {
        while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
            try {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) ((-1) - (((-1) - (i2 & 127)) & ((-1) - 128)));
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
            }
        }
        byte[] bArr2 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzv(int i2, long j2) throws IOException {
        zzu(i2 << 3);
        zzw(j2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzw(long j2) throws IOException {
        if (!zzuq.zzb || this.zzb - this.zzc < 10) {
            while ((j2 - 128) - (j2 | (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    int i3 = ((int) j2) & 127;
                    bArr[i2] = (byte) ((i3 + 128) - (i3 & 128));
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzun(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
                }
            }
            byte[] bArr2 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr2[i4] = (byte) j2;
            return;
        }
        while (true) {
            int i5 = (int) j2;
            if ((j2 - 128) - (j2 | (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                zzaau.zzn(bArr3, i6, (byte) i5);
                return;
            }
            byte[] bArr4 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            zzaau.zzn(bArr4, i7, (byte) ((-1) - (((-1) - (i5 & 127)) & ((-1) - 128))));
            j2 >>>= 7;
        }
    }
}
