package com.google.mlkit.vision.vkp;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VkpDetectedObject {
    public abstract Rect getBoundingBox();

    public abstract List<VkpImageLabel> getLabels();

    public abstract Integer getTrackingId();
}
