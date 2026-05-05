package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbcx extends zzbdc {
    private final int zzc;
    private final int zzd;

    zzbcx(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzl(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdc, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final byte zza(int i2) {
        zzq(i2, this.zzd);
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdc, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    final byte zzb(int i2) {
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdc
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdc, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdc, com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdd
    protected final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, this.zzc + i2, bArr, i3, i4);
    }
}
