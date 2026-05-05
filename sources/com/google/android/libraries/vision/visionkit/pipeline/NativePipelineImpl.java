package com.google.android.libraries.vision.visionkit.pipeline;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
class NativePipelineImpl implements zzbt {
    private zzbdv zza;
    private zzcd zzb;
    private zzcj zzc;
    private zzci zzd;

    public NativePipelineImpl(zzcd zzcdVar, zzcj zzcjVar, zzci zzciVar, zzbdv zzbdvVar) {
        this.zzb = zzcdVar;
        this.zzc = zzcjVar;
        this.zzd = zzciVar;
        this.zza = zzbdvVar;
    }

    public NativePipelineImpl(String str, zzcd zzcdVar, zzcj zzcjVar, zzci zzciVar, zzbdv zzbdvVar) {
        this(zzcdVar, zzcjVar, zzciVar, zzbdvVar);
        System.loadLibrary("mlkitcommonpipeline");
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native void close(long j2, long j3, long j4, long j5, long j6);

    public void closeFileDescriptor(int i2) {
        this.zzd.zze(i2);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native byte[] getAnalyticsLogs(long j2);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native long initialize(byte[] bArr, long j2, long j3, long j4, long j5, long j6);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native long initializeFrameBufferReleaseCallback(long j2);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native long initializeFrameManager();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native long initializeIsolationCallback();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long j2) {
        this.zzb.zzf(j2);
    }

    public void onResult(byte[] bArr) {
        try {
            this.zzc.zzg(zzdf.zzd(bArr, this.zza));
        } catch (zzbew e2) {
            com.google.android.gms.internal.mlkit_vision_internal_vkp.zzcp.zza.zza(e2, "Error in result from JNI layer", new Object[0]);
        }
    }

    public int openFileDescriptor(String str) {
        this.zzd.zza(str);
        return -1;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native byte[] process(long j2, long j3, long j4, byte[] bArr, int i2, int i3, int i4, int i5);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native byte[] processBitmap(long j2, long j3, Bitmap bitmap, int i2, int i3, int i4, int i5);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native byte[] processYuvFrame(long j2, long j3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6, int i7);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native void start(long j2) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native boolean stop(long j2);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public native void waitUntilIdle(long j2) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }
}
