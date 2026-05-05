package com.google.android.libraries.barhopper;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiScaleDecodingOptions {
    private float[] extraScales = new float[0];
    private int minimumDetectedDimension = 10;
    private boolean skipProcessingIfBarcodeFound = true;

    public float[] getExtraScales() {
        return this.extraScales;
    }

    public int getMinimumDetectedDimension() {
        return this.minimumDetectedDimension;
    }

    public boolean getSkipProcessingIfBarcodeFound() {
        return this.skipProcessingIfBarcodeFound;
    }

    public void setExtraScales(float[] fArr) {
        this.extraScales = fArr;
    }

    public void setMinimumDetectedDimension(int i2) {
        this.minimumDetectedDimension = i2;
    }

    public void setSkipProcessingIfBarcodeFound(boolean z2) {
        this.skipProcessingIfBarcodeFound = z2;
    }
}
