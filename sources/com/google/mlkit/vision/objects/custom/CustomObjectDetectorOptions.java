package com.google.mlkit.vision.objects.custom;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzf;
import com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzg;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.vision.objects.ObjectDetectorOptionsBase;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class CustomObjectDetectorOptions extends ObjectDetectorOptionsBase {
    private final float zza;
    private final int zzb;
    private final LocalModel zzc;
    private final CustomRemoteModel zzd;

    public static class Builder extends ObjectDetectorOptionsBase.Builder<Builder> {
        private LocalModel zza;
        private CustomRemoteModel zzb;
        private float zzc = -1.0f;
        private int zzd = 10;

        public Builder(CustomRemoteModel customRemoteModel) {
            Preconditions.checkNotNull(customRemoteModel, "remoteModel must not be null");
            this.zzb = customRemoteModel;
        }

        public Builder(LocalModel localModel) {
            Preconditions.checkNotNull(localModel, "localModel must not be null");
            this.zza = localModel;
        }

        @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase.Builder
        public CustomObjectDetectorOptions build() {
            return new CustomObjectDetectorOptions(this, null);
        }

        @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase.Builder
        public Builder enableClassification() {
            return (Builder) super.enableClassification();
        }

        @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase.Builder
        public Builder enableMultipleObjects() {
            return (Builder) super.enableMultipleObjects();
        }

        public Builder setClassificationConfidenceThreshold(float f2) {
            boolean z2 = false;
            if (Float.compare(f2, 0.0f) >= 0 && Float.compare(f2, 1.0f) <= 0) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "classificationConfidenceThreshold should be in range [0.0f, 1.0f].");
            this.zzc = f2;
            return this;
        }

        @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase.Builder
        public Builder setDetectorMode(int i2) {
            return (Builder) super.setDetectorMode(i2);
        }

        @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase.Builder
        public Builder setExecutor(Executor executor) {
            return (Builder) super.setExecutor(executor);
        }

        public Builder setMaxPerObjectLabelCount(int i2) {
            Preconditions.checkArgument(i2 > 0, "maxPerObjectLabelCount value %d should be positive", Integer.valueOf(i2));
            this.zzd = i2;
            return this;
        }
    }

    /* synthetic */ CustomObjectDetectorOptions(Builder builder, zza zzaVar) {
        super(builder);
        this.zza = builder.zzc;
        this.zzb = builder.zzd;
        this.zzc = builder.zza;
        this.zzd = builder.zzb;
    }

    @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomObjectDetectorOptions)) {
            return false;
        }
        CustomObjectDetectorOptions customObjectDetectorOptions = (CustomObjectDetectorOptions) obj;
        return super.equals(obj) && Float.compare(this.zza, customObjectDetectorOptions.zza) == 0 && this.zzb == customObjectDetectorOptions.zzb && Objects.equal(this.zzc, customObjectDetectorOptions.zzc) && Objects.equal(this.zzd, customObjectDetectorOptions.zzd);
    }

    @Override // com.google.mlkit.vision.objects.ObjectDetectorOptionsBase
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(super.hashCode()), Float.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public String toString() {
        zzf zzfVarZza = zzg.zza(this);
        zzfVarZza.zza("classificationConfidenceThreshold", this.zza);
        zzfVarZza.zzb("maxPerObjectLabelCount", this.zzb);
        zzfVarZza.zzc("localModel", this.zzc);
        zzfVarZza.zzb("detectorMode", super.getDetectorMode());
        zzfVarZza.zzd("enableMultipleObjects", super.isMultipleObjectsEnabled());
        zzfVarZza.zzd("enableClassification", super.isClassificationEnabled());
        zzfVarZza.zzc("remoteModel", this.zzd);
        return zzfVarZza.toString();
    }

    public final float zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final CustomRemoteModel zzc() {
        return this.zzd;
    }

    public final LocalModel zzd() {
        return this.zzc;
    }
}
