package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class FaceDetector extends Detector<Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;
    private final zzc zza;
    private final zzb zzb;
    private final Object zzc;
    private boolean zzd;

    public static class Builder {
        private final Context zza;
        private int zzb = 0;
        private boolean zzc = false;
        private int zzd = 0;
        private boolean zze = true;
        private int zzf = 0;
        private float zzg = -1.0f;

        public Builder(Context context) {
            this.zza = context;
        }

        public FaceDetector build() {
            zzf zzfVar = new zzf();
            zzfVar.zza = this.zzf;
            zzfVar.zzb = this.zzb;
            zzfVar.zzc = this.zzd;
            zzfVar.zzd = this.zzc;
            zzfVar.zze = this.zze;
            zzfVar.zzf = this.zzg;
            if (FaceDetector.zzb(zzfVar)) {
                return new FaceDetector(new zzb(this.zza, zzfVar));
            }
            throw new IllegalArgumentException("Invalid build options");
        }

        public Builder setClassificationType(int i2) {
            if (i2 != 0 && i2 != 1) {
                throw new IllegalArgumentException(new StringBuilder(40).append("Invalid classification type: ").append(i2).toString());
            }
            this.zzd = i2;
            return this;
        }

        public Builder setLandmarkType(int i2) {
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                throw new IllegalArgumentException(new StringBuilder(34).append("Invalid landmark type: ").append(i2).toString());
            }
            this.zzb = i2;
            return this;
        }

        public Builder setMinFaceSize(float f2) {
            if (f2 < 0.0f || f2 > 1.0f) {
                throw new IllegalArgumentException(new StringBuilder(47).append("Invalid proportional face size: ").append(f2).toString());
            }
            this.zzg = f2;
            return this;
        }

        public Builder setMode(int i2) {
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                throw new IllegalArgumentException(new StringBuilder(25).append("Invalid mode: ").append(i2).toString());
            }
            this.zzf = i2;
            return this;
        }

        public Builder setProminentFaceOnly(boolean z2) {
            this.zzc = z2;
            return this;
        }

        public Builder setTrackingEnabled(boolean z2) {
            this.zze = z2;
            return this;
        }
    }

    private FaceDetector() {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        throw new IllegalStateException("Default constructor called");
    }

    private FaceDetector(zzb zzbVar) {
        this.zza = new zzc();
        this.zzc = new Object();
        this.zzd = true;
        this.zzb = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(zzf zzfVar) {
        boolean z2 = zzfVar.zza == 2 || zzfVar.zzb != 2;
        if (zzfVar.zzb == 2 && zzfVar.zzc == 1) {
            return false;
        }
        return z2;
    }

    @Override // com.google.android.gms.vision.Detector
    public final SparseArray<Face> detect(Frame frame) {
        Face[] faceArrZza;
        if (frame == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        if (frame.getPlanes() == null || ((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes())).length != 3) {
            ByteBuffer byteBufferZza = frame.getBitmap() != null ? zzw.zza((Bitmap) Preconditions.checkNotNull(frame.getBitmap()), true) : frame.getGrayscaleImageData();
            synchronized (this.zzc) {
                if (!this.zzd) {
                    throw new IllegalStateException("Cannot use detector after release()");
                }
                faceArrZza = this.zzb.zza((ByteBuffer) Preconditions.checkNotNull(byteBufferZza), zzs.zza(frame));
            }
        } else {
            synchronized (this.zzc) {
                if (!this.zzd) {
                    throw new IllegalStateException("Cannot use detector after release()");
                }
                faceArrZza = this.zzb.zza((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes()), zzs.zza(frame));
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray<Face> sparseArray = new SparseArray<>(faceArrZza.length);
        int iMax = 0;
        for (Face face : faceArrZza) {
            int id = face.getId();
            iMax = Math.max(iMax, id);
            if (hashSet.contains(Integer.valueOf(id))) {
                id = iMax + 1;
                iMax = id;
            }
            hashSet.add(Integer.valueOf(id));
            sparseArray.append(this.zza.zza(id), face);
        }
        return sparseArray;
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this.zzc) {
                if (this.zzd) {
                    release();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (this.zzd) {
                this.zzb.zzc();
                this.zzd = false;
            }
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean setFocus(int i2) {
        boolean zZza;
        int iZzb = this.zza.zzb(i2);
        synchronized (this.zzc) {
            if (!this.zzd) {
                throw new RuntimeException("Cannot use detector after release()");
            }
            zZza = this.zzb.zza(iZzb);
        }
        return zZza;
    }
}
