package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
class zzkt extends zzku {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzkt(int i2) {
    }

    public final zzkt zza(Object obj) {
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
}
