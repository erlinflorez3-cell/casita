package com.google.android.libraries.vision.visionkit.pipeline;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzbu implements zzbt {
    public zzbu(zzcd zzcdVar) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final void close(long j2, long j3, long j4, long j5, long j6) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final byte[] getAnalyticsLogs(long j2) {
        return new byte[0];
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final long initialize(byte[] bArr, long j2, long j3, long j4, long j5, long j6) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final long initializeFrameBufferReleaseCallback(long j2) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final long initializeIsolationCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final byte[] process(long j2, long j3, long j4, byte[] bArr, int i2, int i3, int i4, int i5) {
        return zzdf.zzc().zzw();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final byte[] processBitmap(long j2, long j3, Bitmap bitmap, int i2, int i3, int i4, int i5) {
        return zzdf.zzc().zzw();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final byte[] processYuvFrame(long j2, long j3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6, int i7) {
        return zzdf.zzc().zzw();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final void start(long j2) throws PipelineException {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final boolean stop(long j2) {
        return true;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final void waitUntilIdle(long j2) throws PipelineException {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.zzbt
    public final void zza() {
    }
}
