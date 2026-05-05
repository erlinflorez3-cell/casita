package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class MultiProcessor<T> implements Detector.Processor<T> {
    private Factory<T> zza;
    private SparseArray<zza> zzb;
    private int zzc;

    public static class Builder<T> {
        private MultiProcessor<T> zza;

        public Builder(Factory<T> factory) {
            MultiProcessor<T> multiProcessor = new MultiProcessor<>();
            this.zza = multiProcessor;
            if (factory == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            ((MultiProcessor) multiProcessor).zza = factory;
        }

        public MultiProcessor<T> build() {
            return this.zza;
        }

        public Builder<T> setMaxGapFrames(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException(new StringBuilder(28).append("Invalid max gap: ").append(i2).toString());
            }
            ((MultiProcessor) this.zza).zzc = i2;
            return this;
        }
    }

    public interface Factory<T> {
        Tracker<T> create(T t2);
    }

    private class zza {
        private Tracker<T> zza;
        private int zzb;

        private zza(MultiProcessor multiProcessor) {
            this.zzb = 0;
        }

        static /* synthetic */ int zza(zza zzaVar, int i2) {
            zzaVar.zzb = 0;
            return 0;
        }

        static /* synthetic */ int zzb(zza zzaVar) {
            int i2 = zzaVar.zzb;
            zzaVar.zzb = i2 + 1;
            return i2;
        }
    }

    private MultiProcessor() {
        this.zzb = new SparseArray<>();
        this.zzc = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i2 = 0; i2 < detectedItems.size(); i2++) {
            int iKeyAt = detectedItems.keyAt(i2);
            T tValueAt = detectedItems.valueAt(i2);
            if (this.zzb.get(iKeyAt) == null) {
                zza zzaVar = new zza();
                zzaVar.zza = this.zza.create(tValueAt);
                zzaVar.zza.onNewItem(iKeyAt, tValueAt);
                this.zzb.append(iKeyAt, zzaVar);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            int iKeyAt2 = this.zzb.keyAt(i3);
            if (detectedItems2.get(iKeyAt2) == null) {
                zza zzaVarValueAt = this.zzb.valueAt(i3);
                zza.zzb(zzaVarValueAt);
                if (zzaVarValueAt.zzb >= this.zzc) {
                    zzaVarValueAt.zza.onDone();
                    hashSet.add(Integer.valueOf(iKeyAt2));
                } else {
                    zzaVarValueAt.zza.onMissing(detections);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.zzb.delete(((Integer) it.next()).intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i4 = 0; i4 < detectedItems3.size(); i4++) {
            int iKeyAt3 = detectedItems3.keyAt(i4);
            T tValueAt2 = detectedItems3.valueAt(i4);
            zza zzaVar2 = this.zzb.get(iKeyAt3);
            zza.zza(zzaVar2, 0);
            zzaVar2.zza.onUpdate(detections, tValueAt2);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            this.zzb.valueAt(i2).zza.onDone();
        }
        this.zzb.clear();
    }
}
