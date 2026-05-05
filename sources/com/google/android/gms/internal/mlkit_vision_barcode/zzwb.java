package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes8.dex */
final class zzwb extends zzwg {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zzwb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final zzwg zza(boolean z2) {
        this.zzb = true;
        this.zzd = (byte) ((-1) - (((-1) - 1) & ((-1) - this.zzd)));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final zzwg zzb(int i2) {
        this.zzc = 1;
        byte b2 = this.zzd;
        this.zzd = (byte) ((b2 + 2) - (b2 & 2));
        return this;
    }

    public final zzwg zzc(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final zzwh zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzwd(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((-1) - (((-1) - this.zzd) | ((-1) - 2)) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
