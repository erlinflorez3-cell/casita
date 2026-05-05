package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

/* JADX INFO: loaded from: classes8.dex */
final class zzuu extends zzuy {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    /* synthetic */ zzuu(String str, boolean z2, int i2, zzut zzutVar) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuy) {
            zzuy zzuyVar = (zzuy) obj;
            if (this.zza.equals(zzuyVar.zzb()) && this.zzb == zzuyVar.zzc() && this.zzc == zzuyVar.zza()) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuy
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuy
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuy
    public final boolean zzc() {
        return this.zzb;
    }
}
