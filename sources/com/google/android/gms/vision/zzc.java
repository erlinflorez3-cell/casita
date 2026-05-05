package com.google.android.gms.vision;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc {
    private static final Object zza = new Object();
    private static int zzb = 0;
    private final SparseIntArray zzc = new SparseIntArray();
    private final SparseIntArray zzd = new SparseIntArray();

    public final int zza(int i2) {
        synchronized (zza) {
            int i3 = this.zzc.get(i2, -1);
            if (i3 != -1) {
                return i3;
            }
            int i4 = zzb;
            zzb = i4 + 1;
            this.zzc.append(i2, i4);
            this.zzd.append(i4, i2);
            return i4;
        }
    }

    public final int zzb(int i2) {
        int i3;
        synchronized (zza) {
            i3 = this.zzd.get(i2);
        }
        return i3;
    }
}
