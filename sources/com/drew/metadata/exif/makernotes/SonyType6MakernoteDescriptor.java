package com.drew.metadata.exif.makernotes;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class SonyType6MakernoteDescriptor extends TagDescriptor<SonyType6MakernoteDirectory> {
    public SonyType6MakernoteDescriptor(SonyType6MakernoteDirectory sonyType6MakernoteDirectory) {
        super(sonyType6MakernoteDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 8192 ? super.getDescription(i2) : getMakernoteThumbVersionDescription();
    }

    public String getMakernoteThumbVersionDescription() {
        return getVersionBytesDescription(8192, 2);
    }
}
