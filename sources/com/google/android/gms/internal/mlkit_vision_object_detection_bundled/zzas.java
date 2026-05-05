package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzas {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzar zzc;

    public final zzas zza(Object obj, Object obj2) {
        int i2 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzak.zza(length, i3));
        }
        zzw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i4 = this.zzb;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.zzb = i4 + 1;
        return this;
    }

    public final zzat zzb() {
        zzar zzarVar = this.zzc;
        if (zzarVar != null) {
            throw zzarVar.zza();
        }
        zzbl zzblVarZzh = zzbl.zzh(this.zzb, this.zza, this);
        zzar zzarVar2 = this.zzc;
        if (zzarVar2 == null) {
            return zzblVarZzh;
        }
        throw zzarVar2.zza();
    }
}
