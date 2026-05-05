package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdm extends zzbdq {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzbdm(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        int i4 = length - i3;
        if ((i4 + i3) - (i4 & i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzM() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzN(byte b2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzO(int i2, boolean z2) throws IOException {
        zzx(i2 << 3);
        zzN(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzP(byte[] bArr, int i2, int i3) throws IOException {
        zzx(i3);
        zze(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcu
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zze(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzh(int i2, zzbdd zzbddVar) throws IOException {
        zzx((i2 << 3) | 2);
        zzi(zzbddVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzi(zzbdd zzbddVar) throws IOException {
        zzx(zzbddVar.zzd());
        zzbddVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzj(int i2, int i3) throws IOException {
        zzx((-1) - (((-1) - (i2 << 3)) & ((-1) - 5)));
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzk(int i2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) ((-1) - (((-1) - i2) | ((-1) - 255)));
            int i5 = i3 + 2;
            this.zzc = i5;
            int i6 = i2 >> 8;
            bArr[i4] = (byte) ((i6 + 255) - (i6 | 255));
            int i7 = i3 + 3;
            this.zzc = i7;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.zzc = i3 + 4;
            int i8 = i2 >> 24;
            bArr[i7] = (byte) ((i8 + 255) - (i8 | 255));
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzl(int i2, long j2) throws IOException {
        zzx((-1) - (((-1) - (i2 << 3)) & ((-1) - 1)));
        zzm(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzm(long j2) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            this.zzc = i3;
            bArr[i2] = (byte) ((-1) - (((-1) - ((int) j2)) | ((-1) - 255)));
            int i4 = i2 + 2;
            this.zzc = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i2 + 3;
            this.zzc = i5;
            bArr[i4] = (byte) ((-1) - (((-1) - ((int) (j2 >> 16))) | ((-1) - 255)));
            int i6 = i2 + 4;
            this.zzc = i6;
            int i7 = (int) (j2 >> 24);
            bArr[i5] = (byte) ((i7 + 255) - (i7 | 255));
            int i8 = i2 + 5;
            this.zzc = i8;
            bArr[i6] = (byte) ((-1) - (((-1) - ((int) (j2 >> 32))) | ((-1) - 255)));
            int i9 = i2 + 6;
            this.zzc = i9;
            bArr[i8] = (byte) ((-1) - (((-1) - ((int) (j2 >> 40))) | ((-1) - 255)));
            int i10 = i2 + 7;
            this.zzc = i10;
            bArr[i9] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzc = i2 + 8;
            bArr[i10] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzn(int i2, int i3) throws IOException {
        zzx(i2 << 3);
        zzo(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzo(int i2) throws IOException {
        if (i2 >= 0) {
            zzx(i2);
        } else {
            zzz(i2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    final void zzp(int i2, zzbfs zzbfsVar, zzbgm zzbgmVar) throws IOException {
        int i3 = i2 << 3;
        zzx((i3 + 2) - (i3 & 2));
        zzx(((zzbck) zzbfsVar).zzs(zzbgmVar));
        zzbgmVar.zzj(zzbfsVar, this.zze);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzq(zzbfs zzbfsVar) throws IOException {
        zzx(zzbfsVar.zzz());
        zzbfsVar.zzX(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzr(int i2, zzbfs zzbfsVar) throws IOException {
        zzx(11);
        zzw(2, i2);
        zzx(26);
        zzq(zzbfsVar);
        zzx(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzs(int i2, zzbdd zzbddVar) throws IOException {
        zzx(11);
        zzw(2, i2);
        zzh(3, zzbddVar);
        zzx(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzt(int i2, String str) throws IOException {
        int i3 = i2 << 3;
        zzx((i3 + 2) - (i3 & 2));
        zzu(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzu(String str) throws IOException {
        int i2 = this.zzc;
        try {
            int iZzF = zzF(str.length() * 3);
            int iZzF2 = zzF(str.length());
            if (iZzF2 != iZzF) {
                zzx(zzbhp.zzc(str));
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = zzbhp.zzb(str, bArr, i3, this.zzb - i3);
                return;
            }
            int i4 = i2 + iZzF2;
            this.zzc = i4;
            int iZzb = zzbhp.zzb(str, this.zza, i4, this.zzb - i4);
            this.zzc = i2;
            zzx((iZzb - i2) - iZzF2);
            this.zzc = iZzb;
        } catch (zzbho e2) {
            this.zzc = i2;
            zzI(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzbdn(e3);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzv(int i2, int i3) throws IOException {
        zzx((-1) - (((-1) - (i2 << 3)) & ((-1) - i3)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzw(int i2, int i3) throws IOException {
        zzx(i2 << 3);
        zzx(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzx(int i2) throws IOException {
        while ((-1) - (((-1) - i2) | ((-1) - (-128))) != 0) {
            try {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                int i4 = (-1) - (((-1) - i2) & ((-1) - 128));
                bArr[i3] = (byte) ((i4 + 255) - (i4 | 255));
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
            }
        }
        byte[] bArr2 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzy(int i2, long j2) throws IOException {
        zzx(i2 << 3);
        zzz(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzz(long j2) throws IOException {
        if (!zzbdq.zzb || this.zzb - this.zzc < 10) {
            while ((-1) - (((-1) - j2) | ((-1) - (-128))) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    int i3 = (-1) - (((-1) - ((int) j2)) & ((-1) - 128));
                    bArr[i2] = (byte) ((i3 + 255) - (i3 | 255));
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzbdn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e2);
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
            if ((j2 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                zzbhk.zzn(bArr3, i6, (byte) i5);
                return;
            }
            byte[] bArr4 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            zzbhk.zzn(bArr4, i7, (byte) ((-1) - (((-1) - ((-1) - (((-1) - i5) & ((-1) - 128)))) | ((-1) - 255))));
            j2 >>>= 7;
        }
    }
}
