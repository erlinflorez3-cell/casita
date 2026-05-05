package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgd implements zzbfp {
    private final zzbfs zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzbgd(zzbfs zzbfsVar, String str, Object[] objArr) {
        this.zza = zzbfsVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i2 = (-1) - ((65535 - cCharAt) | ((-1) - 8191));
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                int i6 = cCharAt2 << i4;
                this.zzd = (i2 + i6) - (i2 & i6);
                return;
            } else {
                i2 |= ((-1) - ((65535 - cCharAt2) | ((-1) - 8191))) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfp
    public final zzbfs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfp
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbfp
    public final int zzc() {
        int i2 = this.zzd;
        if ((1 & i2) != 0) {
            return 1;
        }
        return (i2 + 4) - (i2 | 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
