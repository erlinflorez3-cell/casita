package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
class zzde extends zzdd {
    protected final byte[] zza;

    zzde(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf) || zzd() != ((zzdf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzde)) {
            return obj.equals(this);
        }
        zzde zzdeVar = (zzde) obj;
        int iZzp = zzp();
        int iZzp2 = zzdeVar.zzp();
        if (iZzp == 0 || iZzp2 == 0 || iZzp == iZzp2) {
            return zzg(zzdeVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    byte zzb(int i2) {
        return this.zza[i2];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdd
    final boolean zzg(zzdf zzdfVar, int i2, int i3) {
        if (i3 > zzdfVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i3 + zzd());
        }
        int i4 = i2 + i3;
        if (i4 > zzdfVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + zzdfVar.zzd());
        }
        if (!(zzdfVar instanceof zzde)) {
            return zzdfVar.zzk(i2, i4).equals(zzk(0, i3));
        }
        zzde zzdeVar = (zzde) zzdfVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzdeVar.zza;
        int iZzc = zzc() + i3;
        int iZzc2 = zzc();
        int iZzc3 = zzdeVar.zzc() + i2;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzi(int i2, int i3, int i4) {
        return zzep.zzb(i2, this.zza, zzc() + i3, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzj(int i2, int i3, int i4) {
        int iZzc = zzc() + i3;
        return zzhe.zzf(i2, this.zza, iZzc, i4 + iZzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i2, int i3) {
        int iZzo = zzo(i2, i3, zzd());
        return iZzo == 0 ? zzdf.zzb : new zzda(this.zza, zzc() + i2, iZzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final void zzm(zzcx zzcxVar) throws IOException {
        ((zzdk) zzcxVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        int iZzc = zzc();
        return zzhe.zzg(this.zza, iZzc, zzd() + iZzc);
    }
}
