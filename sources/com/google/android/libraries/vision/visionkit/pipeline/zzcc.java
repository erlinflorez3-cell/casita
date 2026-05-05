package com.google.android.libraries.vision.visionkit.pipeline;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzki;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class zzcc implements zzcd, zzcj, zzci {
    protected final zzbdv zza;
    private final zzbi zzb;
    private final zzbt zzc;
    private long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;

    public zzcc(zzcg zzcgVar, String str) {
        zzbdv zzbdvVarZzb = zzbdv.zzb();
        zzbdvVarZzb = zzbdvVarZzb == null ? zzbdv.zza() : zzbdvVarZzb;
        if (zzcgVar.zzj()) {
            this.zzc = new zzbu(this);
        } else if (zzcgVar.zzi()) {
            this.zzc = new NativePipelineImpl(this, this, this, zzbdvVarZzb);
        } else {
            this.zzc = new NativePipelineImpl("mlkitcommonpipeline", this, this, this, zzbdvVarZzb);
        }
        if (zzcgVar.zzk()) {
            this.zzb = new zzbi(zzcgVar.zza());
        } else {
            this.zzb = new zzbi(10);
        }
        this.zza = zzbdvVarZzb;
        long jInitializeFrameManager = this.zzc.initializeFrameManager();
        this.zze = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.zzc.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.zzf = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.zzc.initializeResultsCallback();
        this.zzg = jInitializeResultsCallback;
        long jInitializeIsolationCallback = this.zzc.initializeIsolationCallback();
        this.zzh = jInitializeIsolationCallback;
        this.zzd = this.zzc.initialize(zzcgVar.zzw(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzci
    public final int zza(String str) {
        return -1;
    }

    public final zzki zzb() {
        byte[] analyticsLogs = this.zzc.getAnalyticsLogs(this.zzd);
        if (analyticsLogs == null) {
            return zzki.zzd();
        }
        try {
            return zzki.zze(zzd.zze(analyticsLogs, zzbdv.zza()));
        } catch (zzbew e2) {
            throw new IllegalStateException("Could not parse analytics logs", e2);
        }
    }

    public final zzki zzc(zzbh zzbhVar) {
        byte[] bArrProcess;
        if (this.zzd == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!this.zzb.zzb(zzbhVar, zzbhVar.zza()) || (bArrProcess = this.zzc.process(this.zzd, this.zze, zzbhVar.zza(), zzbhVar.zzc(), zzbhVar.zzb().zzb(), zzbhVar.zzb().zza(), zzbhVar.zzd() - 1, zzbhVar.zze() - 1)) == null) {
            return zzki.zzd();
        }
        try {
            return zzki.zze(zzdf.zzd(bArrProcess, this.zza));
        } catch (zzbew e2) {
            throw new IllegalStateException("Could not parse results", e2);
        }
    }

    public final synchronized void zzd() {
        long j2 = this.zzd;
        if (j2 != 0) {
            this.zzc.stop(j2);
            this.zzc.close(this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
            this.zzd = 0L;
            this.zzc.zza();
        }
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzci
    public final void zze(int i2) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzcd
    public final void zzf(long j2) {
        this.zzb.zza(j2);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzcj
    public final void zzg(zzdf zzdfVar) {
        com.google.android.gms.internal.mlkit_vision_internal_vkp.zzcp.zza.zzb(this, "Pipeline received results: ".concat(String.valueOf(String.valueOf(zzdfVar))), new Object[0]);
    }

    public final void zzh() throws PipelineException {
        long j2 = this.zzd;
        if (j2 == 0) {
            throw new PipelineException(zzch.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
        }
        try {
            this.zzc.start(j2);
            this.zzc.waitUntilIdle(this.zzd);
        } catch (PipelineException e2) {
            this.zzc.stop(this.zzd);
            throw e2;
        }
    }

    public final void zzi() {
        long j2 = this.zzd;
        if (j2 == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!this.zzc.stop(j2)) {
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
    }

    public final zzki zzj(long j2, Bitmap bitmap, int i2) {
        if (this.zzd == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(String.valueOf(bitmap.getConfig()))));
        }
        byte[] bArrProcessBitmap = this.zzc.processBitmap(this.zzd, j2, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i2 - 1);
        if (bArrProcessBitmap == null) {
            return zzki.zzd();
        }
        try {
            return zzki.zze(zzdf.zzd(bArrProcessBitmap, this.zza));
        } catch (zzbew e2) {
            throw new IllegalStateException("Could not parse results", e2);
        }
    }

    public final zzki zzk(long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.zzd == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        byte[] bArrProcessYuvFrame = this.zzc.processYuvFrame(this.zzd, j2, byteBuffer, byteBuffer2, byteBuffer3, i2, i3, i4, i5, i6, i7 - 1);
        if (bArrProcessYuvFrame == null) {
            return zzki.zzd();
        }
        try {
            return zzki.zze(zzdf.zzd(bArrProcessYuvFrame, this.zza));
        } catch (zzbew e2) {
            throw new IllegalStateException("Could not parse results", e2);
        }
    }
}
