package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbhf extends zzbhd {
    zzbhf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzbel zzbelVar = (zzbel) obj;
        zzbhe zzbheVar = zzbelVar.zzc;
        if (zzbheVar != zzbhe.zzc()) {
            return zzbheVar;
        }
        zzbhe zzbheVarZzf = zzbhe.zzf();
        zzbelVar.zzc = zzbheVarZzf;
        return zzbheVarZzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* synthetic */ Object zzb() {
        return zzbhe.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* synthetic */ Object zzc(Object obj) {
        zzbhe zzbheVar = (zzbhe) obj;
        zzbheVar.zzh();
        return zzbheVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i2, int i3) {
        int i4 = i2 << 3;
        ((zzbhe) obj).zzj((i4 + 5) - (i4 & 5), Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ void zze(Object obj, int i2, long j2) {
        ((zzbhe) obj).zzj((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ void zzf(Object obj, int i2, Object obj2) {
        int i3 = i2 << 3;
        ((zzbhe) obj).zzj((i3 + 3) - (i3 & 3), (zzbhe) obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ void zzg(Object obj, int i2, zzbdd zzbddVar) {
        ((zzbhe) obj).zzj((-1) - (((-1) - (i2 << 3)) & ((-1) - 2)), zzbddVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i2, long j2) {
        ((zzbhe) obj).zzj(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final void zzi(Object obj) {
        ((zzbel) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhd
    final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzbel) obj).zzc = (zzbhe) obj2;
    }
}
