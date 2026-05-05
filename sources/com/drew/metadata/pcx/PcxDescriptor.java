package com.drew.metadata.pcx;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PcxDescriptor extends TagDescriptor<PcxDirectory> {
    public PcxDescriptor(PcxDirectory pcxDirectory) {
        super(pcxDirectory);
    }

    public String getColorPlanesDescription() {
        return getIndexedDescription(10, 3, "24-bit color", "16 colors");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? i2 != 10 ? i2 != 12 ? super.getDescription(i2) : getPaletteTypeDescription() : getColorPlanesDescription() : getVersionDescription();
    }

    public String getPaletteTypeDescription() {
        return getIndexedDescription(12, 1, "Color or B&W", "Grayscale");
    }

    public String getVersionDescription() {
        return getIndexedDescription(1, "2.5 with fixed EGA palette information", null, "2.8 with modifiable EGA palette information", "2.8 without palette information (default palette)", "PC Paintbrush for Windows", "3.0 or better");
    }
}
