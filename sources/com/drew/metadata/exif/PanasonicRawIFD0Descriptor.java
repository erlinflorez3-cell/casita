package com.drew.metadata.exif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PanasonicRawIFD0Descriptor extends TagDescriptor<PanasonicRawIFD0Directory> {
    public PanasonicRawIFD0Descriptor(PanasonicRawIFD0Directory panasonicRawIFD0Directory) {
        super(panasonicRawIFD0Directory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? i2 != 274 ? super.getDescription(i2) : getOrientationDescription(274) : getVersionBytesDescription(1, 2);
    }
}
