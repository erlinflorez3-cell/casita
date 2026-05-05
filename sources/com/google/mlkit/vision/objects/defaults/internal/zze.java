package com.google.mlkit.vision.objects.defaults.internal;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzog;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzoh;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzon;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzoz;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzpa;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzpb;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzpc;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzpl;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzpm;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzrs;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzrt;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzrw;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuv;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvf;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvh;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvi;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvq;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwa;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.objects.DetectedObject;
import com.google.mlkit.vision.objects.defaults.ObjectDetectorOptions;
import com.google.mlkit.vision.objects.defaults.PredefinedCategory;
import com.google.mlkit.vision.vkp.PipelineManager;
import com.google.mlkit.vision.vkp.VkpObjectDetectorOptions;
import com.google.mlkit.vision.vkp.VkpStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class zze extends MLTask {
    private static final ImageUtils zzb = ImageUtils.getInstance();
    final zzrs zza;
    private final ObjectDetectorOptions zzc;
    private final MlKitContext zzd;
    private final zzvf zze;
    private final zzvh zzf;
    private final zzwa zzg;
    private PipelineManager zzh;
    private boolean zzi;

    zze(MlKitContext mlKitContext, ObjectDetectorOptions objectDetectorOptions) {
        zzvf zzvfVarZzb = zzvq.zzb("object-detection");
        Preconditions.checkNotNull(mlKitContext, "Context can not be null");
        Preconditions.checkNotNull(objectDetectorOptions, "ObjectDetectorOptions can not be null");
        this.zze = zzvfVarZzb;
        this.zzf = zzvh.zza(mlKitContext.getApplicationContext());
        this.zzc = objectDetectorOptions;
        this.zzd = mlKitContext;
        this.zza = zzi.zzb(objectDetectorOptions);
        this.zzg = zzwa.zzf(mlKitContext.getApplicationContext());
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.mlkit.vision.objects.defaults.internal.zzd] */
    private final void zze(zzpa zzpaVar, VkpStatus vkpStatus, InputImage inputImage, List list, boolean z2, Boolean bool, long j2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.zze.zzh(new zzc(this, list, jElapsedRealtime, zzpaVar, vkpStatus, z2, bool, inputImage), zzpb.ON_DEVICE_OBJECT_INFERENCE);
        zzek zzekVar = new zzek();
        zzekVar.zza(this.zza);
        zzekVar.zzb(zzpaVar);
        zzekVar.zzd(Boolean.valueOf(z2));
        zzekVar.zzc(Boolean.valueOf(!list.isEmpty()));
        final zzem zzemVarZze = zzekVar.zze();
        final ?? r15 = new Object() { // from class: com.google.mlkit.vision.objects.defaults.internal.zzd
        };
        final zzpb zzpbVar = zzpb.AGGREGATED_ON_DEVICE_OBJECT_INFERENCE;
        Executor executorWorkerThreadExecutor = MLTaskExecutor.workerThreadExecutor();
        final zzvf zzvfVar = this.zze;
        executorWorkerThreadExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzve
            @Override // java.lang.Runnable
            public final void run() {
                zzvfVar.zzg(zzpbVar, zzemVarZze, jElapsedRealtime, r15);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzf.zzc(24310, zzpaVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    private final void zzf(zzpa zzpaVar, VkpStatus vkpStatus, long j2) {
        zzpc zzpcVar = new zzpc();
        zzpcVar.zze(zzoz.TYPE_THICK);
        zzrw zzrwVar = new zzrw();
        zzrwVar.zzd(this.zza);
        zzrwVar.zzg(Long.valueOf(j2));
        zzrwVar.zze(zzpaVar);
        zzrwVar.zzf(zzi.zza(vkpStatus));
        zzpcVar.zzi(zzrwVar.zzh());
        this.zze.zzd(zzvi.zzf(zzpcVar), zzpb.ON_DEVICE_OBJECT_LOAD);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() throws MlKitException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.zzg.zzk("object-detection:".concat(String.valueOf(LibraryVersion.getInstance().getVersion("object-detection"))));
        try {
            Tasks.await(this.zzg.zzb());
        } catch (InterruptedException | ExecutionException e2) {
            "remoteConfig.loadAndActivate failed: ".concat(String.valueOf(e2.getLocalizedMessage()));
        }
        this.zzi = Boolean.parseBoolean(this.zzg.zzh("vision_object_detection_enable_acceleration"));
        if (Log.isLoggable("BundledODTTask", 4)) {
            String str = "isRemoteConfigAccelerationEnabled = " + this.zzi;
        }
        this.zzg.zza(zzwa.zza);
        if (this.zzh == null) {
            MlKitContext mlKitContext = this.zzd;
            ObjectDetectorOptions objectDetectorOptions = this.zzc;
            this.zzh = PipelineManager.newInstanceForObjectDetection(mlKitContext.getApplicationContext(), VkpObjectDetectorOptions.from(objectDetectorOptions.getDetectorMode() == 1, objectDetectorOptions.isMultipleObjectsEnabled(), objectDetectorOptions.isClassificationEnabled(), this.zzi, 0.0f, 1, null));
        }
        VkpStatus vkpStatusStart = this.zzh.start();
        if (vkpStatusStart.isSuccess()) {
            zzf(zzpa.NO_ERROR, vkpStatusStart, SystemClock.elapsedRealtime() - jElapsedRealtime);
        } else {
            zzf(zzpa.NO_VALID_MODEL, vkpStatusStart, SystemClock.elapsedRealtime() - jElapsedRealtime);
            vkpStatusStart.throwsMlKitExceptionIfPresent();
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        PipelineManager pipelineManager = this.zzh;
        if (pipelineManager != null) {
            pipelineManager.stop();
            this.zzh = null;
        }
        zzvf zzvfVar = this.zze;
        zzpc zzpcVar = new zzpc();
        zzpcVar.zze(zzoz.TYPE_THICK);
        zzvfVar.zzd(zzvi.zzf(zzpcVar), zzpb.ON_DEVICE_OBJECT_CLOSE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ zzuv zzc(List list, long j2, zzpa zzpaVar, VkpStatus vkpStatus, boolean z2, Boolean bool, InputImage inputImage) {
        zzpm zzpmVar;
        zzan zzanVar = new zzan();
        Iterator it = list.iterator();
        while (true) {
            byte b2 = -1;
            if (!it.hasNext()) {
                zzon zzonVar = new zzon();
                zzonVar.zzd(Long.valueOf(j2));
                zzonVar.zze(zzpaVar);
                zzonVar.zzh(zzi.zza(vkpStatus));
                zzonVar.zzg(Boolean.valueOf(z2));
                zzonVar.zzb(true);
                zzonVar.zzc(true);
                zzonVar.zzi(Boolean.valueOf(this.zzi));
                if (bool != null) {
                    zzonVar.zzf(bool);
                }
                zzpc zzpcVar = new zzpc();
                zzpcVar.zze(zzoz.TYPE_THICK);
                zzrt zzrtVar = new zzrt();
                zzrtVar.zzg(zzonVar.zzj());
                ImageUtils imageUtils = zzb;
                int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
                int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
                zzog zzogVar = new zzog();
                zzogVar.zza(mobileVisionImageFormat != -1 ? mobileVisionImageFormat != 35 ? mobileVisionImageFormat != 842094169 ? mobileVisionImageFormat != 16 ? mobileVisionImageFormat != 17 ? zzoh.UNKNOWN_FORMAT : zzoh.NV21 : zzoh.NV16 : zzoh.YV12 : zzoh.YUV_420_888 : zzoh.BITMAP);
                zzogVar.zzb(Integer.valueOf(mobileVisionImageSize));
                zzrtVar.zzf(zzogVar.zzd());
                zzrtVar.zze(this.zza);
                zzrtVar.zzh(zzanVar.zzc());
                zzpcVar.zzh(zzrtVar.zzi());
                return zzvi.zzf(zzpcVar);
            }
            DetectedObject detectedObject = (DetectedObject) it.next();
            zzpl zzplVar = new zzpl();
            if (!detectedObject.getLabels().isEmpty()) {
                DetectedObject.Label label = detectedObject.getLabels().get(0);
                String text = label.getText();
                switch (text.hashCode()) {
                    case -958563771:
                        if (text.equals(PredefinedCategory.FASHION_GOOD)) {
                            b2 = 1;
                        }
                        break;
                    case -231354562:
                        if (text.equals(PredefinedCategory.HOME_GOOD)) {
                            b2 = 0;
                        }
                        break;
                    case 2195582:
                        if (text.equals(PredefinedCategory.FOOD)) {
                            b2 = 2;
                        }
                        break;
                    case 77195495:
                        if (text.equals(PredefinedCategory.PLACE)) {
                            b2 = 3;
                        }
                        break;
                    case 77195851:
                        if (text.equals(PredefinedCategory.PLANT)) {
                            b2 = 4;
                        }
                        break;
                }
                if (b2 == 0) {
                    zzpmVar = zzpm.CATEGORY_HOME_GOOD;
                } else if (b2 == 1) {
                    zzpmVar = zzpm.CATEGORY_FASHION_GOOD;
                } else if (b2 == 2) {
                    zzpmVar = zzpm.CATEGORY_FOOD;
                } else if (b2 == 3) {
                    zzpmVar = zzpm.CATEGORY_PLACE;
                } else if (b2 != 4) {
                    "Unexpected category: ".concat(String.valueOf(text));
                    zzpmVar = zzpm.CATEGORY_UNKNOWN;
                } else {
                    zzpmVar = zzpm.CATEGORY_PLANT;
                }
                zzplVar.zza(zzpmVar);
                zzplVar.zzb(Float.valueOf(label.getConfidence()));
            }
            Integer trackingId = detectedObject.getTrackingId();
            if (trackingId != null) {
                zzplVar.zzc(trackingId);
            }
            zzanVar.zzb(zzplVar.zze());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e A[PHI: r1
  0x018e: PHI (r1v10 int) = (r1v6 int), (r1v12 int) binds: [B:82:0x0183, B:86:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List run(com.google.mlkit.vision.common.InputImage r19) throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.objects.defaults.internal.zze.run(com.google.mlkit.vision.common.InputImage):java.util.List");
    }
}
