package com.google.mlkit.vision.objects.custom.internal;

import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzny;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznz;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzoa;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzob;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqq;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztt;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztw;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzue;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import com.google.mlkit.vision.objects.custom.CustomObjectDetectorOptions;
import com.google.mlkit.vision.objects.internal.ObjectDetectorImpl;

/* JADX INFO: loaded from: classes7.dex */
final class zza implements MultiFlavorDetectorCreator.DetectorCreator {
    private final zzb zza;
    private final zztt zzb;
    private final ExecutorSelector zzc;

    zza(zzb zzbVar, ExecutorSelector executorSelector) {
        zztt zzttVarZzb = zzue.zzb("object-detection-custom");
        this.zza = zzbVar;
        this.zzb = zzttVarZzb;
        this.zzc = executorSelector;
    }

    @Override // com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator
    public final /* bridge */ /* synthetic */ MultiFlavorDetectorCreator.MultiFlavorDetector create(MultiFlavorDetectorCreator.DetectorOptions detectorOptions) {
        CustomObjectDetectorOptions customObjectDetectorOptions = (CustomObjectDetectorOptions) detectorOptions;
        zzob zzobVar = new zzob();
        zzobVar.zze(zzny.TYPE_THICK);
        zzqq zzqqVar = new zzqq();
        zzqqVar.zzb(zzg.zzb(customObjectDetectorOptions, null));
        zzqqVar.zzc(zznz.NO_ERROR);
        zzobVar.zzg(zzqqVar.zzd());
        this.zzb.zzd(zztw.zzg(zzobVar, 1), zzoa.CUSTOM_OBJECT_CREATE);
        return ObjectDetectorImpl.newInstance((MLTask) this.zza.get(customObjectDetectorOptions), this.zzc.getExecutorToUse(customObjectDetectorOptions.getExecutor()));
    }
}
