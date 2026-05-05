package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class MultiDetector extends Detector<Object> {
    private List<Detector<? extends Object>> zza;

    public static class Builder {
        private MultiDetector zza = new MultiDetector();

        public Builder add(Detector<? extends Object> detector) {
            this.zza.zza.add(detector);
            return this;
        }

        public MultiDetector build() {
            if (this.zza.zza.size() != 0) {
                return this.zza;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }

    private MultiDetector() {
        this.zza = new ArrayList();
    }

    @Override // com.google.android.gms.vision.Detector
    public SparseArray<Object> detect(Frame frame) {
        SparseArray<Object> sparseArray = new SparseArray<>();
        Iterator<Detector<? extends Object>> it = this.zza.iterator();
        while (it.hasNext()) {
            SparseArray<? extends Object> sparseArrayDetect = it.next().detect(frame);
            for (int i2 = 0; i2 < sparseArrayDetect.size(); i2++) {
                int iKeyAt = sparseArrayDetect.keyAt(i2);
                if (sparseArray.get(iKeyAt) != null) {
                    throw new IllegalStateException(new StringBuilder(104).append("Detection ID overlap for id = ").append(iKeyAt).append("  This means that one of the detectors is not using global IDs.").toString());
                }
                sparseArray.append(iKeyAt, sparseArrayDetect.valueAt(i2));
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public boolean isOperational() {
        Iterator<Detector<? extends Object>> it = this.zza.iterator();
        while (it.hasNext()) {
            if (!it.next().isOperational()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.vision.Detector
    public void receiveFrame(Frame frame) {
        Iterator<Detector<? extends Object>> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().receiveFrame(frame);
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public void release() {
        Iterator<Detector<? extends Object>> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.zza.clear();
    }

    @Override // com.google.android.gms.vision.Detector
    public void setProcessor(Detector.Processor<Object> processor) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }
}
