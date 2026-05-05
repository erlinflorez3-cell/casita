package com.drew.metadata.photoshop;

import com.braze.Constants;
import com.bumptech.glide.Registry;
import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class PsdHeaderDescriptor extends TagDescriptor<PsdHeaderDirectory> {
    public PsdHeaderDescriptor(PsdHeaderDirectory psdHeaderDirectory) {
        super(psdHeaderDirectory);
    }

    public String getBitsPerChannelDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(4);
        if (integer == null) {
            return null;
        }
        return integer + " bit" + (integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY) + " per channel";
    }

    public String getChannelCountDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(1);
        if (integer == null) {
            return null;
        }
        return integer + " channel" + (integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    public String getColorModeDescription() {
        return getIndexedDescription(5, Registry.BUCKET_BITMAP, "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.getDescription(i2) : getColorModeDescription() : getBitsPerChannelDescription() : getImageWidthDescription() : getImageHeightDescription() : getChannelCountDescription();
    }

    public String getImageHeightDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(2);
        if (integer == null) {
            return null;
        }
        return integer + " pixel" + (integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    public String getImageWidthDescription() {
        String str = null;
        try {
            Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(3);
            if (integer == null) {
                return null;
            }
            str = integer + " pixel" + (integer.intValue() == 1 ? "" : Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }
}
