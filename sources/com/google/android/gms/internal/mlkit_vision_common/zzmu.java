package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        zzmjVar.zzc(zzc(i2, i3, j2, i4, i5, i6, i7), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        zzmjVar.zzc(zzc(i2, i3, j2, i4, i5, i6, i7), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        return new zzmt(i2, i3, i6, i4, i5, SystemClock.elapsedRealtime() - j2, i7);
    }
}
