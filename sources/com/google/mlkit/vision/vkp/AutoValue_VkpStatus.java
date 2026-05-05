package com.google.mlkit.vision.vkp;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.vkp.VkpStatus;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_VkpStatus extends VkpStatus {
    private final boolean zza;
    private final MlKitException zzb;
    private final Set zzc;

    AutoValue_VkpStatus(boolean z2, MlKitException mlKitException, Set set) {
        this.zza = z2;
        this.zzb = mlKitException;
        if (set == null) {
            throw new NullPointerException("Null errors");
        }
        this.zzc = set;
    }

    public final boolean equals(Object obj) {
        MlKitException mlKitException;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VkpStatus) {
            VkpStatus vkpStatus = (VkpStatus) obj;
            if (this.zza == vkpStatus.isSuccess() && ((mlKitException = this.zzb) != null ? mlKitException.equals(vkpStatus.getMlKitException()) : vkpStatus.getMlKitException() == null) && this.zzc.equals(vkpStatus.getErrors())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.vkp.VkpStatus
    public Set<VkpStatus.VkpError> getErrors() {
        return this.zzc;
    }

    @Override // com.google.mlkit.vision.vkp.VkpStatus
    public MlKitException getMlKitException() {
        return this.zzb;
    }

    public final int hashCode() {
        MlKitException mlKitException = this.zzb;
        return (((mlKitException == null ? 0 : mlKitException.hashCode()) ^ (((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003)) * 1000003) ^ this.zzc.hashCode();
    }

    @Override // com.google.mlkit.vision.vkp.VkpStatus
    public boolean isSuccess() {
        return this.zza;
    }

    public final String toString() {
        Set set = this.zzc;
        return "VkpStatus{success=" + this.zza + ", mlKitException=" + String.valueOf(this.zzb) + ", errors=" + set.toString() + "}";
    }
}
