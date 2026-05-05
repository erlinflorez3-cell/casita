package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FocusingProcessor<T> implements Detector.Processor<T> {
    private Detector<T> zza;
    private Tracker<T> zzb;
    private int zze;
    private int zzc = 3;
    private boolean zzd = false;
    private int zzf = 0;

    public FocusingProcessor(Detector<T> detector, Tracker<T> tracker) {
        this.zza = detector;
        this.zzb = tracker;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.zzf == this.zzc) {
                this.zzb.onDone();
                this.zzd = false;
            } else {
                this.zzb.onMissing(detections);
            }
            this.zzf++;
            return;
        }
        this.zzf = 0;
        if (this.zzd) {
            T t2 = detectedItems.get(this.zze);
            if (t2 != null) {
                this.zzb.onUpdate(detections, t2);
                return;
            } else {
                this.zzb.onDone();
                this.zzd = false;
            }
        }
        int iSelectFocus = selectFocus(detections);
        T t3 = detectedItems.get(iSelectFocus);
        if (t3 == null) {
            new StringBuilder(35).append("Invalid focus selected: ").append(iSelectFocus).toString();
            return;
        }
        this.zzd = true;
        this.zze = iSelectFocus;
        this.zza.setFocus(iSelectFocus);
        this.zzb.onNewItem(this.zze, t3);
        this.zzb.onUpdate(detections, t3);
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        this.zzb.onDone();
    }

    public abstract int selectFocus(Detector.Detections<T> detections);

    protected final void zza(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(28).append("Invalid max gap: ").append(i2).toString());
        }
        this.zzc = i2;
    }
}
