package com.drew.metadata.exif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PanasonicRawWbInfo2Descriptor extends TagDescriptor<PanasonicRawWbInfo2Directory> {
    public PanasonicRawWbInfo2Descriptor(PanasonicRawWbInfo2Directory panasonicRawWbInfo2Directory) {
        super(panasonicRawWbInfo2Directory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 1 || i2 == 5 || i2 == 9 || i2 == 13 || i2 == 17 || i2 == 21 || i2 == 25) ? getWbTypeDescription(i2) : super.getDescription(i2);
    }

    public String getWbTypeDescription(int i2) {
        Integer integer = ((PanasonicRawWbInfo2Directory) this._directory).getInteger(i2);
        if (integer == null) {
            return null;
        }
        return ExifDescriptorBase.getWhiteBalanceDescription(integer.intValue());
    }
}
