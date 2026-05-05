package com.drew.metadata.exif;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PanasonicRawDistortionDescriptor extends TagDescriptor<PanasonicRawDistortionDirectory> {
    public PanasonicRawDistortionDescriptor(PanasonicRawDistortionDirectory panasonicRawDistortionDirectory) {
        super(panasonicRawDistortionDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 2 ? i2 != 11 ? i2 != 4 ? i2 != 5 ? i2 != 7 ? i2 != 8 ? i2 != 9 ? super.getDescription(i2) : getDistortionParam09Description() : getDistortionParam08Description() : getDistortionCorrectionDescription() : getDistortionScaleDescription() : getDistortionParam04Description() : getDistortionParam11Description() : getDistortionParam02Description();
    }

    public String getDistortionCorrectionDescription() {
        Integer integer = ((PanasonicRawDistortionDirectory) this._directory).getInteger(7);
        if (integer == null) {
            return null;
        }
        int iIntValue = (-1) - (((-1) - integer.intValue()) | ((-1) - 15));
        return iIntValue != 0 ? iIntValue != 1 ? "Unknown (" + integer + ")" : "On" : "Off";
    }

    public String getDistortionParam02Description() {
        if (((PanasonicRawDistortionDirectory) this._directory).getInteger(2) == null) {
            return null;
        }
        return new Rational(r0.intValue(), 32678L).toString();
    }

    public String getDistortionParam04Description() {
        if (((PanasonicRawDistortionDirectory) this._directory).getInteger(4) == null) {
            return null;
        }
        return new Rational(r0.intValue(), 32678L).toString();
    }

    public String getDistortionParam08Description() {
        if (((PanasonicRawDistortionDirectory) this._directory).getInteger(8) == null) {
            return null;
        }
        return new Rational(r0.intValue(), 32678L).toString();
    }

    public String getDistortionParam09Description() {
        if (((PanasonicRawDistortionDirectory) this._directory).getInteger(9) == null) {
            return null;
        }
        return new Rational(r0.intValue(), 32678L).toString();
    }

    public String getDistortionParam11Description() {
        if (((PanasonicRawDistortionDirectory) this._directory).getInteger(11) == null) {
            return null;
        }
        return new Rational(r0.intValue(), 32678L).toString();
    }

    public String getDistortionScaleDescription() {
        Integer integer = ((PanasonicRawDistortionDirectory) this._directory).getInteger(5);
        if (integer == null) {
            return null;
        }
        return Integer.toString(1 / ((integer.intValue() / 32768) + 1));
    }
}
