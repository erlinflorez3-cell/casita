package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
class zzbdc extends zzbdb {
    protected final byte[] zza;

    zzbdc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbdd) || zzd() != ((zzbdd) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzbdc)) {
            return obj.equals(this);
        }
        zzbdc zzbdcVar = (zzbdc) obj;
        int iZzm = zzm();
        int iZzm2 = zzbdcVar.zzm();
        if (iZzm == 0 || iZzm2 == 0 || iZzm == iZzm2) {
            return zzg(zzbdcVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    byte zzb(int i2) {
        return this.zza[i2];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdb
    final boolean zzg(zzbdd zzbddVar, int i2, int i3) {
        if (i3 > zzbddVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i3 + zzd());
        }
        int i4 = i2 + i3;
        if (i4 > zzbddVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + zzbddVar.zzd());
        }
        if (!(zzbddVar instanceof zzbdc)) {
            return zzbddVar.zzj(i2, i4).equals(zzj(0, i3));
        }
        zzbdc zzbdcVar = (zzbdc) zzbddVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzbdcVar.zza;
        int iZzc = zzc() + i3;
        int iZzc2 = zzc();
        int iZzc3 = zzbdcVar.zzc() + i2;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final int zzi(int i2, int i3, int i4) {
        return zzbeu.zzb(i2, this.zza, zzc() + i3, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final zzbdd zzj(int i2, int i3) {
        int iZzl = zzl(i2, i3, zzd());
        return iZzl == 0 ? zzbdd.zzb : new zzbcx(this.zza, zzc() + i2, iZzl);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    final void zzk(zzbcu zzbcuVar) throws IOException {
        zzbcuVar.zza(this.zza, zzc(), zzd());
    }
}
