package com.drew.metadata.jpeg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class JpegComponent implements Serializable {
    private static final long serialVersionUID = 61121257899091914L;
    private final int _componentId;
    private final int _quantizationTableNumber;
    private final int _samplingFactorByte;

    public JpegComponent(int i2, int i3, int i4) {
        this._componentId = i2;
        this._samplingFactorByte = i3;
        this._quantizationTableNumber = i4;
    }

    public int getComponentId() {
        return this._componentId;
    }

    public String getComponentName() {
        int i2 = this._componentId;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.format("Unknown (%s)", Integer.valueOf(i2)) : "Q" : "I" : "Cr" : "Cb" : "Y";
    }

    public int getHorizontalSamplingFactor() {
        return (this._samplingFactorByte >> 4) & 15;
    }

    public int getQuantizationTableNumber() {
        return this._quantizationTableNumber;
    }

    public int getVerticalSamplingFactor() {
        return (-1) - (((-1) - this._samplingFactorByte) | ((-1) - 15));
    }

    public String toString() {
        return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", Integer.valueOf(this._quantizationTableNumber), Integer.valueOf(getHorizontalSamplingFactor()), Integer.valueOf(getVerticalSamplingFactor()));
    }
}
