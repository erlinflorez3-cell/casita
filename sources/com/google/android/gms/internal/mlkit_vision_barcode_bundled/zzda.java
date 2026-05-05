package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzda extends zzde {
    private final int zzc;
    private final int zzd;

    zzda(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzo(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i2) {
        zzu(i2, this.zzd);
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final byte zzb(int i2) {
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, this.zzc + i2, bArr, i3, i4);
    }
}
