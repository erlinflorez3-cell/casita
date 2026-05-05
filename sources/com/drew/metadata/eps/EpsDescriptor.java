package com.drew.metadata.eps;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class EpsDescriptor extends TagDescriptor<EpsDirectory> {
    public EpsDescriptor(EpsDirectory epsDirectory) {
        super(epsDirectory);
    }

    public String getByteSizeDescription(int i2) {
        return ((EpsDirectory) this._directory).getString(i2) + " bytes";
    }

    public String getColorTypeDescription() {
        return getIndexedDescription(30, 1, "Grayscale", "Lab", "RGB", "CMYK");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        switch (i2) {
            case 28:
            case 29:
                return getPixelDescription(i2);
            case 30:
                return getColorTypeDescription();
            case 31:
            default:
                return ((EpsDirectory) this._directory).getString(i2);
            case 32:
            case 33:
                return getByteSizeDescription(i2);
        }
    }

    public String getPixelDescription(int i2) {
        return ((EpsDirectory) this._directory).getString(i2) + " pixels";
    }
}
