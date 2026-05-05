package com.google.mlkit.vision.vkp;

import com.google.android.gms.common.internal.LibraryVersion;
import com.google.mlkit.common.model.LocalModel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VkpObjectDetectorOptions implements zzc {
    public static VkpObjectDetectorOptions from(boolean z2, boolean z3, boolean z4, boolean z5, float f2, int i2, LocalModel localModel) {
        String str = localModel == null ? "object-detection" : "object-detection-custom";
        return new zzb(z2, z3, z4, z5, f2, i2, localModel, str, LibraryVersion.getInstance().getVersion(str));
    }

    abstract float zza();

    abstract int zzb();

    abstract LocalModel zzc();

    abstract String zzd();

    abstract String zze();

    abstract boolean zzf();

    abstract boolean zzg();

    abstract boolean zzh();

    abstract boolean zzi();
}
