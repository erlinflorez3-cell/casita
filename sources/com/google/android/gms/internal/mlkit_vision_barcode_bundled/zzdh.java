package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzdh extends zzdj {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzdh(byte[] bArr, int i2, int i3, boolean z2, zzdg zzdgVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i2) throws zzer {
        int i3 = this.zzd;
        this.zzd = 0;
        int i4 = this.zzb + this.zzc;
        this.zzb = i4;
        if (i4 > 0) {
            this.zzc = i4;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i3;
    }
}
