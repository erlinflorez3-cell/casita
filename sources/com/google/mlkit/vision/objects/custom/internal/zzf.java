package com.google.mlkit.vision.objects.custom.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzas;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzav;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzdj;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzdl;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznf;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzng;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznm;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzny;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zznz;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzoa;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzob;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzoq;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqw;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzqx;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzra;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztt;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztv;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztw;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzue;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzuf;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.CustomModelLoader;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import com.google.mlkit.vision.objects.DetectedObject;
import com.google.mlkit.vision.objects.custom.CustomObjectDetectorOptions;
import com.google.mlkit.vision.vkp.PipelineManager;
import com.google.mlkit.vision.vkp.VkpDetectedObject;
import com.google.mlkit.vision.vkp.VkpImageLabel;
import com.google.mlkit.vision.vkp.VkpObjectDetectorOptions;
import com.google.mlkit.vision.vkp.VkpResults;
import com.google.mlkit.vision.vkp.VkpStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class zzf extends MLTask {
    private static final ImageUtils zzb = ImageUtils.getInstance();
    zzqw zza;
    private final CustomObjectDetectorOptions zzc;
    private final MlKitContext zzd;
    private final CustomModelLoader zze;
    private final zztt zzf;
    private final zztv zzg;
    private PipelineManager zzh;

    zzf(MlKitContext mlKitContext, CustomObjectDetectorOptions customObjectDetectorOptions) {
        zztt zzttVarZzb = zzue.zzb("object-detection-custom");
        zzuf.zza();
        Preconditions.checkNotNull(mlKitContext, "Context can not be null");
        Preconditions.checkNotNull(customObjectDetectorOptions, "CustomObjectDetectorOptions can not be null");
        this.zzc = customObjectDetectorOptions;
        this.zzd = mlKitContext;
        this.zze = CustomModelLoader.getInstance(mlKitContext, customObjectDetectorOptions.zzd(), customObjectDetectorOptions.zzc());
        this.zzf = zzttVarZzb;
        this.zzg = zztv.zza(mlKitContext.getApplicationContext());
        this.zza = zzg.zzb(customObjectDetectorOptions, null);
    }

    static /* bridge */ /* synthetic */ long zzc(zzf zzfVar, LocalModel localModel) throws Throwable {
        MlKitContext mlKitContext = zzfVar.zzd;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzfVar.zza = zzg.zzb(zzfVar.zzc, ModelUtils.getModelLoggingInfo(mlKitContext.getApplicationContext(), localModel));
        return SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    static /* bridge */ /* synthetic */ void zzj(zzf zzfVar, zznz zznzVar, VkpStatus vkpStatus, long j2, long j3) {
        zzob zzobVar = new zzob();
        zzobVar.zze(zzny.TYPE_THICK);
        zzra zzraVar = new zzra();
        zzraVar.zzd(zzfVar.zza);
        zzraVar.zze(zznzVar);
        zzraVar.zzg(zzg.zza(vkpStatus));
        zzraVar.zzh(Long.valueOf(j2));
        zzraVar.zzf(Long.valueOf(j3));
        zzobVar.zzi(zzraVar.zzi());
        zzfVar.zzf.zzd(zztw.zzf(zzobVar), zzoa.CUSTOM_OBJECT_LOAD);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.mlkit.vision.objects.custom.internal.zzd] */
    private final void zzk(zznz zznzVar, VkpStatus vkpStatus, InputImage inputImage, List list, boolean z2, long j2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.zzf.zzh(new zzc(this, list, jElapsedRealtime, zznzVar, vkpStatus, z2, inputImage), zzoa.CUSTOM_OBJECT_INFERENCE);
        zzdj zzdjVar = new zzdj();
        zzdjVar.zza(this.zza);
        zzdjVar.zzb(zznzVar);
        zzdjVar.zzd(Boolean.valueOf(z2));
        zzdjVar.zzc(Boolean.valueOf(!list.isEmpty()));
        final zzdl zzdlVarZze = zzdjVar.zze();
        final ?? r15 = new Object() { // from class: com.google.mlkit.vision.objects.custom.internal.zzd
        };
        final zzoa zzoaVar = zzoa.AGGREGATED_CUSTOM_OBJECT_INFERENCE;
        Executor executorWorkerThreadExecutor = MLTaskExecutor.workerThreadExecutor();
        final zztt zzttVar = this.zzf;
        executorWorkerThreadExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzts
            @Override // java.lang.Runnable
            public final void run() {
                zzttVar.zzg(zzoaVar, zzdlVarZze, jElapsedRealtime, r15);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzg.zzc(24311, zznzVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() throws MlKitException {
        this.zze.load(new zze(this, SystemClock.elapsedRealtime()));
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        PipelineManager pipelineManager = this.zzh;
        if (pipelineManager != null) {
            pipelineManager.stop();
            this.zzh = null;
        }
        zztt zzttVar = this.zzf;
        zzob zzobVar = new zzob();
        zzobVar.zze(zzny.TYPE_THICK);
        zzttVar.zzd(zztw.zzf(zzobVar), zzoa.CUSTOM_OBJECT_CLOSE);
    }

    final /* synthetic */ zztj zzd(List list, long j2, zznz zznzVar, VkpStatus vkpStatus, boolean z2, InputImage inputImage) {
        zzas zzasVar = new zzas();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DetectedObject detectedObject = (DetectedObject) it.next();
            zzoq zzoqVar = new zzoq();
            zzoqVar.zzb(Integer.valueOf(detectedObject.getLabels().size()));
            if (!detectedObject.getLabels().isEmpty()) {
                zzoqVar.zza(Float.valueOf(detectedObject.getLabels().get(0).getConfidence()));
            }
            Integer trackingId = detectedObject.getTrackingId();
            if (trackingId != null) {
                zzoqVar.zzc(trackingId);
            }
            zzasVar.zza(zzoqVar.zzd());
        }
        zzob zzobVar = new zzob();
        zzobVar.zze(zzny.TYPE_THICK);
        zzqx zzqxVar = new zzqx();
        zznm zznmVar = new zznm();
        zznmVar.zzd(Long.valueOf(j2));
        zznmVar.zze(zznzVar);
        zznmVar.zzg(zzg.zza(vkpStatus));
        zznmVar.zzf(Boolean.valueOf(z2));
        zznmVar.zzb(true);
        zznmVar.zzc(true);
        zzqxVar.zzg(zznmVar.zzh());
        ImageUtils imageUtils = zzb;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zznf zznfVar = new zznf();
        zznfVar.zza(mobileVisionImageFormat != -1 ? mobileVisionImageFormat != 35 ? mobileVisionImageFormat != 842094169 ? mobileVisionImageFormat != 16 ? mobileVisionImageFormat != 17 ? zzng.UNKNOWN_FORMAT : zzng.NV21 : zzng.NV16 : zzng.YV12 : zzng.YUV_420_888 : zzng.BITMAP);
        zznfVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzqxVar.zzf(zznfVar.zzd());
        zzqxVar.zze(this.zza);
        zzqxVar.zzh(zzasVar.zzb());
        zzobVar.zzh(zzqxVar.zzi());
        return zztw.zzf(zzobVar);
    }

    final PipelineManager zzg(LocalModel localModel) throws MlKitException {
        CustomObjectDetectorOptions customObjectDetectorOptions = this.zzc;
        Context applicationContext = this.zzd.getApplicationContext();
        boolean z2 = customObjectDetectorOptions.getDetectorMode() == 1;
        CustomObjectDetectorOptions customObjectDetectorOptions2 = this.zzc;
        return PipelineManager.newInstanceForObjectDetection(applicationContext, VkpObjectDetectorOptions.from(z2, customObjectDetectorOptions2.isMultipleObjectsEnabled(), customObjectDetectorOptions2.isClassificationEnabled(), false, customObjectDetectorOptions2.zza(), customObjectDetectorOptions2.zzb(), localModel));
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* JADX INFO: renamed from: zzh */
    public final synchronized List run(InputImage inputImage) throws MlKitException {
        ArrayList arrayList;
        Preconditions.checkNotNull(inputImage, "Mobile vision input can not be null");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh == null) {
            return new ArrayList();
        }
        VkpResults vkpResultsProcess = ((PipelineManager) Preconditions.checkNotNull(this.zzh)).process(inputImage.getFormat() == 35 ? InputImage.fromByteBuffer(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, true), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), 17) : inputImage, new VisionImageMetadataParcel(inputImage.getWidth(), inputImage.getHeight(), 0, SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees())));
        VkpStatus status = vkpResultsProcess.getStatus();
        if (!status.isSuccess()) {
            zzk(zznz.UNKNOWN_ERROR, status, inputImage, zzav.zzh(), vkpResultsProcess.isFromColdCall(), jElapsedRealtime);
            status.throwsMlKitExceptionIfPresent();
            return new ArrayList();
        }
        List<VkpDetectedObject> detectedObjects = vkpResultsProcess.getDetectedObjects();
        Matrix coordinatesMatrix = inputImage.getCoordinatesMatrix();
        if (detectedObjects.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (VkpDetectedObject vkpDetectedObject : detectedObjects) {
                ArrayList arrayList2 = new ArrayList();
                for (VkpImageLabel vkpImageLabel : vkpDetectedObject.getLabels()) {
                    if (!"/m/0bl9f".equals(vkpImageLabel.getClassName())) {
                        arrayList2.add(new DetectedObject.Label(vkpImageLabel.getText(), vkpImageLabel.getScore(), vkpImageLabel.getIndex()));
                    }
                }
                Rect boundingBox = vkpDetectedObject.getBoundingBox();
                if (coordinatesMatrix != null) {
                    CommonConvertUtils.transformRect(boundingBox, coordinatesMatrix);
                }
                arrayList.add(new DetectedObject(boundingBox, vkpDetectedObject.getTrackingId(), arrayList2));
            }
        }
        zzk(zznz.NO_ERROR, status, inputImage, arrayList, vkpResultsProcess.isFromColdCall(), jElapsedRealtime);
        return arrayList;
    }
}
