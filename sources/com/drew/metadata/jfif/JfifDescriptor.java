package com.drew.metadata.jfif;

import com.braze.Constants;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class JfifDescriptor extends TagDescriptor<JfifDirectory> {
    public JfifDescriptor(JfifDirectory jfifDirectory) {
        super(jfifDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 5 ? i2 != 10 ? i2 != 7 ? i2 != 8 ? super.getDescription(i2) : getImageResXDescription() : getImageResUnitsDescription() : getImageResYDescription() : getImageVersionDescription();
    }

    public String getImageResUnitsDescription() {
        Integer integer = ((JfifDirectory) this._directory).getInteger(7);
        if (integer == null) {
            return null;
        }
        int iIntValue = integer.intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? "unit" : "centimetre" : "inch" : "none";
    }

    public String getImageResXDescription() {
        Integer integer = ((JfifDirectory) this._directory).getInteger(8);
        if (integer == null) {
            return null;
        }
        return String.format("%d dot%s", integer, integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    public String getImageResYDescription() {
        Integer integer = ((JfifDirectory) this._directory).getInteger(10);
        if (integer == null) {
            return null;
        }
        return String.format("%d dot%s", integer, integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    public String getImageVersionDescription() {
        Integer integer = ((JfifDirectory) this._directory).getInteger(5);
        if (integer == null) {
            return null;
        }
        return String.format("%d.%d", Integer.valueOf((integer.intValue() & 65280) >> 8), Integer.valueOf((-1) - (((-1) - integer.intValue()) | ((-1) - 255))));
    }
}
