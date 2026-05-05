package com.drew.metadata.heif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class HeifDescriptor extends TagDescriptor<HeifDirectory> {
    public HeifDescriptor(HeifDirectory heifDirectory) {
        super(heifDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 4 || i2 == 5) ? getPixelDescription(i2) : i2 != 6 ? super.getDescription(i2) : getRotationDescription();
    }

    public String getPixelDescription(int i2) {
        return ((HeifDirectory) this._directory).getString(i2) + " pixels";
    }

    public String getRotationDescription() {
        Integer integer = ((HeifDirectory) this._directory).getInteger(6);
        if (integer == null) {
            return null;
        }
        return (integer.intValue() * 90) + " degrees";
    }
}
