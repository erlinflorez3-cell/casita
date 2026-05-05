package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzan extends zzaj {
    public zzan() {
        super(4);
    }

    public final zzan zzb(Object obj) {
        obj.getClass();
        int i2 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            this.zza = Arrays.copyOf(objArr, zzaj.zza(length, i2));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }

    public final zzaq zzc() {
        this.zzc = true;
        return zzaq.zzg(this.zza, this.zzb);
    }
}
