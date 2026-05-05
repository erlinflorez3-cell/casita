package com.google.mlkit.vision.objects.custom.internal;

import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzas;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzav;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzof;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzog;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzoh;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzok;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqt;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqu;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqw;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzru;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzrv;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.vision.objects.custom.CustomObjectDetectorOptions;
import com.google.mlkit.vision.vkp.VkpStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class zzg {
    public static zzav zza(VkpStatus vkpStatus) {
        zzas zzasVar = new zzas();
        for (VkpStatus.VkpError vkpError : vkpStatus.getErrors()) {
            zzru zzruVar = new zzru();
            zzruVar.zzb(zzrv.zzb(vkpError.getErrorSpaceNumber()));
            zzruVar.zza(Integer.valueOf(vkpError.getErrorCode()));
            zzasVar.zza(zzruVar.zzd());
        }
        return zzasVar.zzb();
    }

    public static zzqw zzb(CustomObjectDetectorOptions customObjectDetectorOptions, ModelUtils.ModelLoggingInfo modelLoggingInfo) {
        zzqu zzquVar;
        CustomRemoteModel customRemoteModelZzc = customObjectDetectorOptions.zzc();
        LocalModel localModelZzd = customObjectDetectorOptions.zzd();
        zzoh zzohVar = zzoh.SOURCE_UNKNOWN;
        if (customRemoteModelZzc != null) {
            zzohVar = zzoh.CLOUD;
        } else if (localModelZzd != null) {
            zzohVar = localModelZzd.getAbsoluteFilePath() != null ? zzoh.LOCAL : localModelZzd.getAssetFilePath() != null ? zzoh.APP_ASSET : zzoh.URI;
        }
        zzof zzofVar = new zzof();
        zzofVar.zzc(zzog.CUSTOM_OBJECT_DETECTION);
        zzofVar.zze(zzohVar);
        if (modelLoggingInfo != null) {
            zzofVar.zzd(Long.valueOf(modelLoggingInfo.getSize()));
            zzofVar.zza(modelLoggingInfo.getHash());
            zzofVar.zzb(Boolean.valueOf(modelLoggingInfo.isManifestModel()));
        }
        zzqt zzqtVar = new zzqt();
        int detectorMode = customObjectDetectorOptions.getDetectorMode();
        if (detectorMode == 1) {
            zzquVar = zzqu.STREAM;
        } else if (detectorMode != 2) {
            String str = "Unexpected detector mode: " + detectorMode;
            zzquVar = zzqu.MODE_UNSPECIFIED;
        } else {
            zzquVar = zzqu.SINGLE_IMAGE;
        }
        zzqtVar.zze(zzquVar);
        zzqtVar.zzg(Boolean.valueOf(customObjectDetectorOptions.isMultipleObjectsEnabled()));
        zzqtVar.zzc(Boolean.valueOf(customObjectDetectorOptions.isClassificationEnabled()));
        zzok zzokVar = new zzok();
        zzokVar.zzb(zzofVar.zzh());
        zzqtVar.zzd(zzokVar.zzc());
        zzqtVar.zzf(Integer.valueOf(customObjectDetectorOptions.zzb()));
        zzqtVar.zzb(Float.valueOf(customObjectDetectorOptions.zza()));
        return zzqtVar.zzi();
    }
}
