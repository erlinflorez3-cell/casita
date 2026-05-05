package com.drew.metadata.exif.makernotes;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public class AppleMakernoteDescriptor extends TagDescriptor<AppleMakernoteDirectory> {
    public AppleMakernoteDescriptor(AppleMakernoteDirectory appleMakernoteDirectory) {
        super(appleMakernoteDirectory);
    }

    public String getAccelerationVectorDescription() {
        Rational[] rationalArray = ((AppleMakernoteDirectory) this._directory).getRationalArray(8);
        if (rationalArray == null || rationalArray.length != 3) {
            return null;
        }
        return String.format("%.2fg %s, ", Double.valueOf(rationalArray[0].getAbsolute().doubleValue()), rationalArray[0].isPositive() ? "left" : ViewProps.RIGHT) + String.format("%.2fg %s, ", Double.valueOf(rationalArray[1].getAbsolute().doubleValue()), rationalArray[1].isPositive() ? "down" : "up") + String.format("%.2fg %s", Double.valueOf(rationalArray[2].getAbsolute().doubleValue()), rationalArray[2].isPositive() ? "forward" : "backward");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 8 ? i2 != 10 ? super.getDescription(i2) : getHdrImageTypeDescription() : getAccelerationVectorDescription();
    }

    public String getHdrImageTypeDescription() {
        return getIndexedDescription(10, 3, "HDR Image", "Original Image");
    }
}
