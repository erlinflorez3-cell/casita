package com.drew.metadata.exif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PrintIMDescriptor extends TagDescriptor<PrintIMDirectory> {
    public PrintIMDescriptor(PrintIMDirectory printIMDirectory) {
        super(printIMDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        if (i2 == 0) {
            return super.getDescription(i2);
        }
        Integer integer = ((PrintIMDirectory) this._directory).getInteger(i2);
        if (integer == null) {
            return null;
        }
        return String.format("0x%08x", integer);
    }
}
