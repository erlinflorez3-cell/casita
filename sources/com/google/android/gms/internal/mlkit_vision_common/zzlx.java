package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.compose.animation.core.AnimationKt;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class zzlx implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* JADX INFO: Access modifiers changed from: private */
    zzlx(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    /* synthetic */ zzlx(String str, zzlw zzlwVar) {
        this("unusedTag");
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzlx zze(String str) {
        zzmw.zza();
        if (!zzmw.zzb()) {
            return zzlv.zza;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j2 = this.zze;
        if (j2 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j2);
    }

    public zzlx zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j2) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j3 = this.zzf;
        if (j3 != 0 && jElapsedRealtimeNanos - j3 >= AnimationKt.MillisToNanos) {
            zza();
        }
        this.zzf = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j2;
        this.zzg = Math.min(this.zzg, j2);
        this.zzh = Math.max(this.zzh, j2);
        if (this.zzc % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.zzb, Long.valueOf(j2), Integer.valueOf(this.zzc), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf((int) (this.zzd / ((double) this.zzc))));
            zzmw.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j2) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j2);
    }
}
