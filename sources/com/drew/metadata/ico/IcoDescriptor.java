package com.drew.metadata.ico;

import com.braze.Constants;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class IcoDescriptor extends TagDescriptor<IcoDirectory> {
    public IcoDescriptor(IcoDirectory icoDirectory) {
        super(icoDirectory);
    }

    public String getColourPaletteSizeDescription() {
        Integer integer = ((IcoDirectory) this._directory).getInteger(4);
        if (integer == null) {
            return null;
        }
        if (integer.intValue() == 0) {
            return "No palette";
        }
        return integer + " colour" + (integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? super.getDescription(i2) : getColourPaletteSizeDescription() : getImageHeightDescription() : getImageWidthDescription() : getImageTypeDescription();
    }

    public String getImageHeightDescription() {
        Integer integer = ((IcoDirectory) this._directory).getInteger(3);
        if (integer == null) {
            return null;
        }
        return (integer.intValue() == 0 ? 256 : integer.intValue()) + " pixels";
    }

    public String getImageTypeDescription() {
        return getIndexedDescription(1, 1, "Icon", "Cursor");
    }

    public String getImageWidthDescription() {
        Integer integer = ((IcoDirectory) this._directory).getInteger(2);
        if (integer == null) {
            return null;
        }
        return (integer.intValue() == 0 ? 256 : integer.intValue()) + " pixels";
    }
}
