package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;

/* JADX INFO: loaded from: classes8.dex */
public class LargestFaceFocusingProcessor extends FocusingProcessor<Face> {

    public static class Builder {
        private LargestFaceFocusingProcessor zza;

        public Builder(Detector<Face> detector, Tracker<Face> tracker) {
            this.zza = new LargestFaceFocusingProcessor(detector, tracker);
        }

        public LargestFaceFocusingProcessor build() {
            return this.zza;
        }

        public Builder setMaxGapFrames(int i2) {
            this.zza.zza(i2);
            return this;
        }
    }

    public LargestFaceFocusingProcessor(Detector<Face> detector, Tracker<Face> tracker) {
        super(detector, tracker);
    }

    @Override // com.google.android.gms.vision.FocusingProcessor
    public int selectFocus(Detector.Detections<Face> detections) {
        SparseArray<Face> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            throw new IllegalArgumentException("No faces for selectFocus.");
        }
        int iKeyAt = detectedItems.keyAt(0);
        float width = detectedItems.valueAt(0).getWidth();
        for (int i2 = 1; i2 < detectedItems.size(); i2++) {
            int iKeyAt2 = detectedItems.keyAt(i2);
            float width2 = detectedItems.valueAt(i2).getWidth();
            if (width2 > width) {
                iKeyAt = iKeyAt2;
                width = width2;
            }
        }
        return iKeyAt;
    }
}
