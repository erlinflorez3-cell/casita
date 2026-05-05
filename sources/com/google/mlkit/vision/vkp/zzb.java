package com.google.mlkit.vision.vkp;

import com.google.mlkit.common.model.LocalModel;

/* JADX INFO: loaded from: classes7.dex */
final class zzb extends VkpObjectDetectorOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final float zze;
    private final int zzf;
    private final LocalModel zzg;
    private final String zzh;
    private final String zzi;

    zzb(boolean z2, boolean z3, boolean z4, boolean z5, float f2, int i2, LocalModel localModel, String str, String str2) {
        this.zza = z2;
        this.zzb = z3;
        this.zzc = z4;
        this.zzd = z5;
        this.zze = f2;
        this.zzf = i2;
        this.zzg = localModel;
        this.zzh = str;
        if (str2 == null) {
            throw new NullPointerException("Null clientLibraryVersion");
        }
        this.zzi = str2;
    }

    public final boolean equals(Object obj) {
        LocalModel localModel;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VkpObjectDetectorOptions) {
            VkpObjectDetectorOptions vkpObjectDetectorOptions = (VkpObjectDetectorOptions) obj;
            if (this.zza == vkpObjectDetectorOptions.zzi() && this.zzb == vkpObjectDetectorOptions.zzh() && this.zzc == vkpObjectDetectorOptions.zzg() && this.zzd == vkpObjectDetectorOptions.zzf() && Float.floatToIntBits(this.zze) == Float.floatToIntBits(vkpObjectDetectorOptions.zza()) && this.zzf == vkpObjectDetectorOptions.zzb() && ((localModel = this.zzg) != null ? localModel.equals(vkpObjectDetectorOptions.zzc()) : vkpObjectDetectorOptions.zzc() == null) && this.zzh.equals(vkpObjectDetectorOptions.zzd()) && this.zzi.equals(vkpObjectDetectorOptions.zze())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true == this.zzd ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.zze);
        LocalModel localModel = this.zzg;
        return (((((((iFloatToIntBits * 1000003) ^ this.zzf) * 1000003) ^ (localModel == null ? 0 : localModel.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode();
    }

    public final String toString() {
        return "VkpObjectDetectorOptions{streamingMode=" + this.zza + ", multipleObjectsEnabled=" + this.zzb + ", classificationEnabled=" + this.zzc + ", accelerationEnabled=" + this.zzd + ", classificationConfidenceThreshold=" + this.zze + ", maxPerObjectLabelCount=" + this.zzf + ", customClassifierLocalModel=" + String.valueOf(this.zzg) + ", clientLibraryName=" + this.zzh + ", clientLibraryVersion=" + this.zzi + "}";
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final float zza() {
        return this.zze;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final int zzb() {
        return this.zzf;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final LocalModel zzc() {
        return this.zzg;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final String zzd() {
        return this.zzh;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final String zze() {
        return this.zzi;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final boolean zzh() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.vkp.VkpObjectDetectorOptions
    final boolean zzi() {
        return this.zza;
    }
}
