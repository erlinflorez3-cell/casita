package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzuo extends zzul {
    private final OutputStream zzg;

    zzuo(OutputStream outputStream, int i2) {
        super(i2);
        this.zzg = outputStream;
    }

    private final void zzH() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzI(int i2) throws IOException {
        if (this.zzb - this.zzc < i2) {
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzJ() throws IOException {
        if (this.zzc > 0) {
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzK(byte b2) throws IOException {
        if (this.zzc == this.zzb) {
            zzH();
        }
        zzc(b2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzL(int i2, boolean z2) throws IOException {
        zzI(11);
        zzf(i2 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzM(int i2, zzud zzudVar) throws IOException {
        zzu((-1) - (((-1) - (i2 << 3)) & ((-1) - 2)));
        zzu(zzudVar.zzd());
        zzudVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq, com.google.android.gms.internal.gtm.zztt
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzr(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzh(int i2, int i3) throws IOException {
        zzI(14);
        int i4 = i2 << 3;
        zzf((i4 + 5) - (i4 & 5));
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzi(int i2) throws IOException {
        zzI(4);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzj(int i2, long j2) throws IOException {
        zzI(18);
        zzf((i2 << 3) | 1);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzk(long j2) throws IOException {
        zzI(8);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzl(int i2, int i3) throws IOException {
        zzI(20);
        zzf(i2 << 3);
        if (i3 >= 0) {
            zzf(i3);
        } else {
            zzg(i3);
        }
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
        int i3 = i2 << 3;
        zzu((i3 + 2) - (i3 & 2));
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zzb;
        int i5 = this.zzc;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, 0, this.zza, i5, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i5, i6);
        this.zzc = this.zzb;
        this.zzd += i6;
        zzH();
        int i7 = i3 - i6;
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzs(int i2, int i3) throws IOException {
        int i4 = i2 << 3;
        zzu((i4 + i3) - (i4 & i3));
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzt(int i2, int i3) throws IOException {
        zzI(20);
        zzf(i2 << 3);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzu(int i2) throws IOException {
        zzI(5);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzv(int i2, long j2) throws IOException {
        zzI(20);
        zzf(i2 << 3);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzw(long j2) throws IOException {
        zzI(10);
        zzg(j2);
    }

    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzD = zzD(length);
            int i2 = iZzD + length;
            int i3 = this.zzb;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iZzb = zzaaz.zzb(str, bArr, 0, length);
                zzu(iZzb);
                zzr(bArr, 0, iZzb);
                return;
            }
            if (i2 > i3 - this.zzc) {
                zzH();
            }
            int iZzD2 = zzD(str.length());
            int i4 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i5 = i4 + iZzD2;
                    this.zzc = i5;
                    int iZzb2 = zzaaz.zzb(str, this.zza, i5, this.zzb - i5);
                    this.zzc = i4;
                    iZzc = (iZzb2 - i4) - iZzD2;
                    zzf(iZzc);
                    this.zzc = iZzb2;
                } else {
                    iZzc = zzaaz.zzc(str);
                    zzf(iZzc);
                    this.zzc = zzaaz.zzb(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzaay e2) {
                this.zzd -= this.zzc - i4;
                this.zzc = i4;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new zzun(e3);
            }
        } catch (zzaay e4) {
            zzF(str, e4);
        }
    }
}
