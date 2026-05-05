package com.google.mlkit.vision.vkp;

import com.google.mlkit.common.model.LocalModel;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VkpImageLabelerOptions implements zzc {
    public static VkpImageLabelerOptions from(float f2, int i2, LocalModel localModel) {
        return new zza(f2, i2, localModel);
    }

    abstract float zza();

    abstract int zzb();

    abstract LocalModel zzc();
}
