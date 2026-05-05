package com.google.android.gms.vision.clearcut;

import android.content.Context;
import com.google.android.gms.internal.vision.zze;
import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.internal.vision.zzi;
import com.google.android.gms.vision.L;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = zze.zza().zza(2, zzi.zza);
    private zzb zzb = new zzb(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i2, zzfi.zzo zzoVar) {
        if (i2 != 3 || this.zzb.zza()) {
            zza.execute(new zza(this, i2, zzoVar));
        } else {
            L.v("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
