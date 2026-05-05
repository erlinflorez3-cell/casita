package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdo extends zzbdl {
    private final OutputStream zzg;

    zzbdo(OutputStream outputStream, int i2) {
        super(i2);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzK() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzL(int i2) throws IOException {
        if (this.zzb - this.zzc < i2) {
            zzK();
        }
    }

    public final void zzA(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zzb;
        int i5 = this.zzc;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, this.zza, i5, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        System.arraycopy(bArr, i2, this.zza, i5, i6);
        int i7 = i2 + i6;
        this.zzc = this.zzb;
        this.zzd += i6;
        zzK();
        int i8 = i3 - i6;
        if (i8 <= this.zzb) {
            System.arraycopy(bArr, i7, this.zza, 0, i8);
            this.zzc = i8;
        } else {
            this.zzg.write(bArr, i7, i8);
        }
        this.zzd += i8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzM() throws IOException {
        if (this.zzc > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzN(byte b2) throws IOException {
        if (this.zzc == this.zzb) {
            zzK();
        }
        zzc(b2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzO(int i2, boolean z2) throws IOException {
        zzL(11);
        zzf(i2 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzP(byte[] bArr, int i2, int i3) throws IOException {
        zzx(i3);
        zzA(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcu
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzA(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzh(int i2, zzbdd zzbddVar) throws IOException {
        int i3 = i2 << 3;
        zzx((i3 + 2) - (i3 & 2));
        zzi(zzbddVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzi(zzbdd zzbddVar) throws IOException {
        zzx(zzbddVar.zzd());
        zzbddVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzj(int i2, int i3) throws IOException {
        zzL(14);
        zzf((-1) - (((-1) - (i2 << 3)) & ((-1) - 5)));
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzk(int i2) throws IOException {
        zzL(4);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzl(int i2, long j2) throws IOException {
        zzL(18);
        zzf((i2 << 3) | 1);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzm(long j2) throws IOException {
        zzL(8);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzn(int i2, int i3) throws IOException {
        zzL(20);
        zzf(i2 << 3);
        if (i3 >= 0) {
            zzf(i3);
        } else {
            zzg(i3);
        }
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
        zzx((i2 << 3) | 2);
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
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzF = zzF(length);
            int i2 = iZzF + length;
            int i3 = this.zzb;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iZzb = zzbhp.zzb(str, bArr, 0, length);
                zzx(iZzb);
                zzA(bArr, 0, iZzb);
                return;
            }
            if (i2 > i3 - this.zzc) {
                zzK();
            }
            int iZzF2 = zzF(str.length());
            int i4 = this.zzc;
            try {
                if (iZzF2 == iZzF) {
                    int i5 = i4 + iZzF2;
                    this.zzc = i5;
                    int iZzb2 = zzbhp.zzb(str, this.zza, i5, this.zzb - i5);
                    this.zzc = i4;
                    iZzc = (iZzb2 - i4) - iZzF2;
                    zzf(iZzc);
                    this.zzc = iZzb2;
                } else {
                    iZzc = zzbhp.zzc(str);
                    zzf(iZzc);
                    this.zzc = zzbhp.zzb(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzbho e2) {
                this.zzd -= this.zzc - i4;
                this.zzc = i4;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new zzbdn(e3);
            }
        } catch (zzbho e4) {
            zzI(str, e4);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzv(int i2, int i3) throws IOException {
        zzx((-1) - (((-1) - (i2 << 3)) & ((-1) - i3)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzw(int i2, int i3) throws IOException {
        zzL(20);
        zzf(i2 << 3);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzx(int i2) throws IOException {
        zzL(5);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzy(int i2, long j2) throws IOException {
        zzL(20);
        zzf(i2 << 3);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq
    public final void zzz(long j2) throws IOException {
        zzL(10);
        zzg(j2);
    }
}
