package com.google.android.odml.image;

/* JADX INFO: loaded from: classes9.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    zzb() {
    }

    @Override // com.google.android.odml.image.zzh
    final zzh zza(int i2) {
        this.zza = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final zzh zzb(int i2) {
        this.zzb = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb.append(" storageType");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}
