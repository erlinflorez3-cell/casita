package com.drew.metadata.jpeg;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class JpegDescriptor extends TagDescriptor<JpegDirectory> {
    public JpegDescriptor(JpegDirectory jpegDirectory) {
        super(jpegDirectory);
    }

    public String getComponentDataDescription(int i2) {
        JpegComponent component = ((JpegDirectory) this._directory).getComponent(i2);
        if (component == null) {
            return null;
        }
        return component.getComponentName() + " component: " + component;
    }

    public String getDataPrecisionDescription() {
        String string = ((JpegDirectory) this._directory).getString(0);
        if (string == null) {
            return null;
        }
        return string + " bits";
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == -3) {
            return getImageCompressionTypeDescription();
        }
        if (i2 == 3) {
            return getImageWidthDescription();
        }
        if (i2 == 0) {
            return getDataPrecisionDescription();
        }
        if (i2 == 1) {
            return getImageHeightDescription();
        }
        switch (i2) {
            case 6:
                return getComponentDataDescription(0);
            case 7:
                return getComponentDataDescription(1);
            case 8:
                return getComponentDataDescription(2);
            case 9:
                return getComponentDataDescription(3);
            default:
                return super.getDescription(i2);
        }
    }

    public String getImageCompressionTypeDescription() {
        return getIndexedDescription(-3, "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic");
    }

    public String getImageHeightDescription() {
        String string = ((JpegDirectory) this._directory).getString(1);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }

    public String getImageWidthDescription() {
        String string = ((JpegDirectory) this._directory).getString(3);
        if (string == null) {
            return null;
        }
        return string + " pixels";
    }
}
