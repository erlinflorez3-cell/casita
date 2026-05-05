package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzaxo extends zzaxt {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zzaxo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxt
    public final zzaxt zza(boolean z2) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxt
    public final zzaxt zzb(int i2) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzaxt zzc(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxt
    public final zzaxu zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzaxq(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        byte b2 = this.zzd;
        if ((b2 + 2) - (b2 | 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
