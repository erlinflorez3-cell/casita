package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
final class zztg extends zztl {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zztg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztl
    public final zztl zza(boolean z2) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztl
    public final zztl zzb(int i2) {
        this.zzc = 1;
        this.zzd = (byte) ((-1) - (((-1) - this.zzd) & ((-1) - 2)));
        return this;
    }

    public final zztl zzc(String str) {
        this.zza = "object-detection-custom";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztl
    public final zztm zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzti(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
