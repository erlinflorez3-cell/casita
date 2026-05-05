package com.google.android.gms.internal.vision;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfc extends zzfb {
    public static int zza(int i2, int i3, int i4) {
        if (i3 <= 1073741823) {
            return Math.min(Math.max(i2, i3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        }
        throw new IllegalArgumentException(zzdg.zza("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), Integer.valueOf(LockFreeTaskQueueCore.MAX_CAPACITY_MASK)));
    }
}
