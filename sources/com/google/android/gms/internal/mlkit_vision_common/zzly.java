package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes8.dex */
final class zzly extends zzmd {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zzly() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zza(boolean z2) {
        this.zzb = true;
        this.zzd = (byte) ((-1) - (((-1) - 1) & ((-1) - this.zzd)));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zzb(int i2) {
        this.zzc = 1;
        this.zzd = (byte) ((-1) - (((-1) - this.zzd) & ((-1) - 2)));
        return this;
    }

    public final zzmd zzc(String str) {
        this.zza = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzme zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzma(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        byte b2 = this.zzd;
        if ((b2 + 1) - (b2 | 1) == 0) {
            sb.append(" enableFirelog");
        }
        byte b3 = this.zzd;
        if ((b3 + 2) - (b3 | 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
