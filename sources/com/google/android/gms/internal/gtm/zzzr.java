package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzzr implements zzzd {
    private final zzzg zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzzr(zzzg zzzgVar, String str, Object[] objArr) {
        this.zza = zzzgVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i2 = (cCharAt + 8191) - (cCharAt | 8191);
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.zzd = i2 | (cCharAt2 << i4);
                return;
            }
            int i6 = ((cCharAt2 + 8191) - (cCharAt2 | 8191)) << i4;
            i2 = (i2 + i6) - (i2 & i6);
            i4 += 13;
            i3 = i5;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzd
    public final zzzg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzzd
    public final boolean zzb() {
        return (-1) - (((-1) - this.zzd) | ((-1) - 2)) == 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzd
    public final int zzc() {
        int i2 = this.zzd;
        if ((1 & i2) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
