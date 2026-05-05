package com.drew.metadata.avi;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class AviDescriptor extends TagDescriptor<AviDirectory> {
    public AviDescriptor(AviDirectory aviDirectory) {
        super(aviDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 6 || i2 == 7) ? getSizeDescription(i2) : super.getDescription(i2);
    }

    public String getSizeDescription(int i2) {
        return ((AviDirectory) this._directory).getString(i2) + " pixels";
    }
}
