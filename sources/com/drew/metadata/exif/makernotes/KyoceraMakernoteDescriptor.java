package com.drew.metadata.exif.makernotes;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class KyoceraMakernoteDescriptor extends TagDescriptor<KyoceraMakernoteDirectory> {
    public KyoceraMakernoteDescriptor(KyoceraMakernoteDirectory kyoceraMakernoteDirectory) {
        super(kyoceraMakernoteDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? super.getDescription(i2) : getProprietaryThumbnailDataDescription();
    }

    public String getProprietaryThumbnailDataDescription() {
        return getByteLengthDescription(1);
    }
}
