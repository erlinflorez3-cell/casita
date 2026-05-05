package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcq {
    private final int zza;
    private final int zzb;

    public zzcq(int i2, int i3) {
        zzkj.zzd(i2 < 32767 && i2 >= 0);
        zzkj.zzd(i3 < 32767 && i3 >= 0);
        this.zza = i2;
        this.zzb = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcq) {
            zzcq zzcqVar = (zzcq) obj;
            if (this.zza == zzcqVar.zza && this.zzb == zzcqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza << 16) | this.zzb;
    }

    public final String toString() {
        return this.zza + "x" + this.zzb;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }
}
