package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbr extends zzbs {
    public static int zza(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }
}
