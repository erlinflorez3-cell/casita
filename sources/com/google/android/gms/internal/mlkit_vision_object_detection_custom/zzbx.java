package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

/* JADX INFO: loaded from: classes8.dex */
final class zzbx implements zzcc {
    private final int zza;
    private final zzcb zzb;

    zzbx(int i2, zzcb zzcbVar) {
        this.zza = i2;
        this.zzb = zzcbVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        return this.zza == zzccVar.zza() && this.zzb.equals(zzccVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzcc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzcc
    public final zzcb zzb() {
        return this.zzb;
    }
}
