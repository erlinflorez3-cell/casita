package com.google.android.gms.internal.mlkit_vision_barcode;

import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;

/* JADX INFO: loaded from: classes8.dex */
final class zzxd extends zzxl {
    private int zza;
    private int zzb;
    private float zzc;
    private float zzd;
    private boolean zze;
    private float zzf;
    private float zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private float zzk;
    private float zzl;
    private short zzm;

    zzxd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zza(boolean z2) {
        this.zzj = true;
        this.zzm = (short) ((-1) - (((-1) - this.zzm) & ((-1) - 512)));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzb(float f2) {
        this.zzg = 0.8f;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 64) - (s2 & 64));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzc(float f2) {
        this.zzf = 0.5f;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 32) - (s2 & 32));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzd(float f2) {
        this.zzd = 0.8f;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 8) - (s2 & 8));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zze(int i2) {
        this.zzb = 5;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 2) - (s2 & 2));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzf(float f2) {
        this.zzc = 0.25f;
        this.zzm = (short) ((-1) - (((-1) - this.zzm) & ((-1) - 4)));
        return this;
    }

    public final zzxl zzg(int i2) {
        this.zza = 10;
        this.zzm = (short) ((-1) - (((-1) - this.zzm) & ((-1) - 1)));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzh(long j2) {
        this.zzi = ConfigurationDefaultValue.MotionPaddingAroundTouchMSec;
        this.zzm = (short) (this.zzm | 256);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzi(boolean z2) {
        this.zze = z2;
        this.zzm = (short) ((-1) - (((-1) - this.zzm) & ((-1) - 16)));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzj(float f2) {
        this.zzk = 0.1f;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 1024) - (s2 & 1024));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzk(long j2) {
        this.zzh = 1500L;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 128) - (s2 & 128));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzl(float f2) {
        this.zzl = 0.05f;
        short s2 = this.zzm;
        this.zzm = (short) ((s2 + 2048) - (s2 & 2048));
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxm zzm() {
        if (this.zzm == 4095) {
            return new zzxf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((-1) - (((-1) - this.zzm) | ((-1) - 1)) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 2)) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.zzm & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        short s2 = this.zzm;
        if ((s2 + 8) - (s2 | 8) == 0) {
            sb.append(" maxCoverage");
        }
        short s3 = this.zzm;
        if ((s3 + 16) - (s3 | 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 32)) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 64)) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 128)) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 256)) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        short s4 = this.zzm;
        if ((s4 + 512) - (s4 | 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 1024)) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((-1) - (((-1) - this.zzm) | ((-1) - 2048)) == 0) {
            sb.append(" zoomOutThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
