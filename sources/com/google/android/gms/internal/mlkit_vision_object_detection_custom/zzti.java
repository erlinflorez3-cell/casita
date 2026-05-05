package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
final class zzti extends zztm {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    /* synthetic */ zzti(String str, boolean z2, int i2, zzth zzthVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztm) {
            zztm zztmVar = (zztm) obj;
            if (this.zza.equals(zztmVar.zzb()) && this.zzb == zztmVar.zzc() && this.zzc == zztmVar.zza()) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztm
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztm
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztm
    public final boolean zzc() {
        return this.zzb;
    }
}
