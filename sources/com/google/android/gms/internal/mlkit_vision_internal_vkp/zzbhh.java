package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzbhh extends zzbhj {
    zzbhh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhk.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhk.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhk.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhk.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzbhk.zzb) {
            zzbhk.zzi(obj, j2, z2);
        } else {
            zzbhk.zzj(obj, j2, z2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzbhk.zzb) {
            zzbhk.zzD(obj, j2, b2);
        } else {
            zzbhk.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final void zze(Object obj, long j2, double d2) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final void zzf(Object obj, long j2, float f2) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhj
    public final boolean zzg(Object obj, long j2) {
        return zzbhk.zzb ? zzbhk.zzt(obj, j2) : zzbhk.zzu(obj, j2);
    }
}
