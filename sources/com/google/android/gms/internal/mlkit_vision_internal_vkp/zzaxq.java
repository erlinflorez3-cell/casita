package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzaxq extends zzaxu {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    /* synthetic */ zzaxq(String str, boolean z2, int i2, zzaxp zzaxpVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaxu) {
            zzaxu zzaxuVar = (zzaxu) obj;
            if (this.zza.equals(zzaxuVar.zzb()) && this.zzb == zzaxuVar.zzc() && this.zzc == zzaxuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.zza + ", enableFirelog=" + this.zzb + ", firelogEventType=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxu
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxu
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxu
    public final boolean zzc() {
        return this.zzb;
    }
}
