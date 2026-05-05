package com.google.mlkit.vision.objects.custom.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznz;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.model.CustomModelLoader;
import com.google.mlkit.vision.vkp.PipelineManager;
import com.google.mlkit.vision.vkp.VkpStatus;

/* JADX INFO: loaded from: classes7.dex */
final class zze implements CustomModelLoader.CustomModelLoaderHelper {
    final /* synthetic */ long zza;
    final /* synthetic */ zzf zzb;
    private long zzc = 0;
    private VkpStatus zzd = null;

    zze(zzf zzfVar, long j2) {
        this.zza = j2;
        this.zzb = zzfVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.model.CustomModelLoader.CustomModelLoaderHelper
    public final void logLoad() throws MlKitException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        if (((VkpStatus) Preconditions.checkNotNull(this.zzd)).isSuccess()) {
            zzf.zzj(this.zzb, zznz.NO_ERROR, (VkpStatus) Preconditions.checkNotNull(this.zzd), jElapsedRealtime, this.zzc);
            return;
        }
        zzf zzfVar = this.zzb;
        zzf.zzj(zzfVar, zzfVar.zzc.zzd() != null ? zznz.LOCAL_MODEL_INVALID : zznz.REMOTE_MODEL_INVALID, (VkpStatus) Preconditions.checkNotNull(this.zzd), jElapsedRealtime, this.zzc);
        ((VkpStatus) Preconditions.checkNotNull(this.zzd)).throwsMlKitExceptionIfPresent();
    }

    @Override // com.google.mlkit.common.sdkinternal.model.CustomModelLoader.CustomModelLoaderHelper
    public final boolean tryLoad(LocalModel localModel) throws Throwable {
        this.zzc = zzf.zzc(this.zzb, localModel);
        zzf zzfVar = this.zzb;
        if (zzfVar.zzh == null) {
            zzfVar.zzh = zzfVar.zzg(localModel);
        }
        VkpStatus vkpStatusStart = ((PipelineManager) Preconditions.checkNotNull(this.zzb.zzh)).start();
        this.zzd = vkpStatusStart;
        if (!vkpStatusStart.isSuccess()) {
            ((PipelineManager) Preconditions.checkNotNull(this.zzb.zzh)).stop();
            this.zzb.zzh = null;
        }
        return ((VkpStatus) Preconditions.checkNotNull(this.zzd)).isSuccess();
    }
}
