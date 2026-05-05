package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzas extends zzao {
    public zzas() {
        super(4);
    }

    public final zzas zza(Object obj) {
        obj.getClass();
        int i2 = this.zzb;
        int i3 = i2 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i3) {
            int i4 = length + (length >> 1) + 1;
            if (i4 < i3) {
                int iHighestOneBit = Integer.highestOneBit(i2);
                i4 = iHighestOneBit + iHighestOneBit;
            }
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i4);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr2[i5] = obj;
        return this;
    }

    public final zzav zzb() {
        this.zzc = true;
        return zzav.zzg(this.zza, this.zzb);
    }
}
