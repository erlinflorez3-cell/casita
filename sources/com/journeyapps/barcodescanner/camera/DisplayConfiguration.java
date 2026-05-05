package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DisplayConfiguration {
    private static final String TAG = "DisplayConfiguration";
    private boolean center = false;
    private PreviewScalingStrategy previewScalingStrategy = new FitCenterStrategy();
    private int rotation;
    private Size viewfinderSize;

    public DisplayConfiguration(int i2) {
        this.rotation = i2;
    }

    public DisplayConfiguration(int i2, Size size) {
        this.rotation = i2;
        this.viewfinderSize = size;
    }

    public Size getBestPreviewSize(List<Size> list, boolean z2) {
        return this.previewScalingStrategy.getBestPreviewSize(list, getDesiredPreviewSize(z2));
    }

    public Size getDesiredPreviewSize(boolean z2) {
        Size size = this.viewfinderSize;
        if (size == null) {
            return null;
        }
        return z2 ? size.rotate() : size;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        return this.previewScalingStrategy;
    }

    public int getRotation() {
        return this.rotation;
    }

    public Size getViewfinderSize() {
        return this.viewfinderSize;
    }

    public Rect scalePreview(Size size) {
        return this.previewScalingStrategy.scalePreview(size, this.viewfinderSize);
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.previewScalingStrategy = previewScalingStrategy;
    }
}
