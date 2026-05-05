package com.google.mlkit.vision.vkp;

import com.google.mlkit.vision.vkp.VkpStatus;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_VkpStatus_VkpError extends VkpStatus.VkpError {
    private final int zza;
    private final int zzb;

    AutoValue_VkpStatus_VkpError(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VkpStatus.VkpError) {
            VkpStatus.VkpError vkpError = (VkpStatus.VkpError) obj;
            if (this.zza == vkpError.getErrorSpaceNumber() && this.zzb == vkpError.getErrorCode()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.vkp.VkpStatus.VkpError
    public int getErrorCode() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.vkp.VkpStatus.VkpError
    public int getErrorSpaceNumber() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        return "VkpError{errorSpaceNumber=" + this.zza + ", errorCode=" + this.zzb + "}";
    }
}
