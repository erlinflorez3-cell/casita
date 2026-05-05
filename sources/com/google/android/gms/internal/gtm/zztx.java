package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zztx extends zzua {
    private final int zzc;

    zztx(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.gtm.zzua
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final int zzd() {
        return this.zzc;
    }
}
