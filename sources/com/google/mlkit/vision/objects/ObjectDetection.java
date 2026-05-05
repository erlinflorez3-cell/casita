package com.google.mlkit.vision.objects;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;

/* JADX INFO: loaded from: classes7.dex */
public class ObjectDetection {
    private ObjectDetection() {
    }

    public static ObjectDetector getClient(ObjectDetectorOptionsBase objectDetectorOptionsBase) {
        Preconditions.checkNotNull(objectDetectorOptionsBase, "options cannot be null");
        return (ObjectDetector) MultiFlavorDetectorCreator.getInstance().create(objectDetectorOptionsBase);
    }
}
