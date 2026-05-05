package com.drew.metadata.adobe;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class AdobeJpegDescriptor extends TagDescriptor<AdobeJpegDirectory> {
    public AdobeJpegDescriptor(AdobeJpegDirectory adobeJpegDirectory) {
        super(adobeJpegDirectory);
    }

    private String getColorTransformDescription() {
        return getIndexedDescription(3, "Unknown (RGB or CMYK)", "YCbCr", "YCCK");
    }

    private String getDctEncodeVersionDescription() {
        Integer integer = ((AdobeJpegDirectory) this._directory).getInteger(0);
        if (integer == null) {
            return null;
        }
        return integer.intValue() == 100 ? "100" : Integer.toString(integer.intValue());
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 0 ? i2 != 3 ? super.getDescription(i2) : getColorTransformDescription() : getDctEncodeVersionDescription();
    }
}
