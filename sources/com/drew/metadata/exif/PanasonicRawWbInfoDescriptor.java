package com.drew.metadata.exif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PanasonicRawWbInfoDescriptor extends TagDescriptor<PanasonicRawWbInfoDirectory> {
    public PanasonicRawWbInfoDescriptor(PanasonicRawWbInfoDirectory panasonicRawWbInfoDirectory) {
        super(panasonicRawWbInfoDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return (i2 == 1 || i2 == 4 || i2 == 7 || i2 == 10 || i2 == 13 || i2 == 16 || i2 == 19) ? getWbTypeDescription(i2) : super.getDescription(i2);
    }

    public String getWbTypeDescription(int i2) {
        Integer integer = ((PanasonicRawWbInfoDirectory) this._directory).getInteger(i2);
        if (integer == null) {
            return null;
        }
        return ExifDescriptorBase.getWhiteBalanceDescription(integer.intValue());
    }
}
