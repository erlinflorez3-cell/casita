package com.google.mlkit.vision.objects.custom.internal;

import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznz;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.vkp.VkpStatus;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzc {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zznz zzd;
    public final /* synthetic */ VkpStatus zze;
    public final /* synthetic */ boolean zzf;
    public final /* synthetic */ InputImage zzg;

    public /* synthetic */ zzc(zzf zzfVar, List list, long j2, zznz zznzVar, VkpStatus vkpStatus, boolean z2, InputImage inputImage) {
        this.zza = zzfVar;
        this.zzb = list;
        this.zzc = j2;
        this.zzd = zznzVar;
        this.zze = vkpStatus;
        this.zzf = z2;
        this.zzg = inputImage;
    }

    public final zztj zza() {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }
}
