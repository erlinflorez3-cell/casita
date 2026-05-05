package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzhw extends zzid {
    private final int zzc;
    private final int zzd;

    zzhw(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzb(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final byte zza(int i2) {
        int iZza = zza();
        if (((iZza - (i2 + 1)) | i2) >= 0) {
            return this.zzb[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i2).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i2).append(", ").append(iZza).toString());
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    protected final void zza(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    final byte zzb(int i2) {
        return this.zzb[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.vision.zzid
    protected final int zze() {
        return this.zzc;
    }
}
