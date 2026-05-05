package com.drew.metadata.gif;

import com.drew.metadata.TagDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public class GifAnimationDescriptor extends TagDescriptor<GifAnimationDirectory> {
    public GifAnimationDescriptor(GifAnimationDirectory gifAnimationDirectory) {
        super(gifAnimationDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 1 ? super.getDescription(i2) : getIterationCountDescription();
    }

    public String getIterationCountDescription() {
        Integer integer = ((GifAnimationDirectory) this._directory).getInteger(1);
        if (integer == null) {
            return null;
        }
        return integer.intValue() == 0 ? "Infinite" : integer.intValue() == 1 ? "Once" : integer.intValue() == 2 ? "Twice" : integer.toString() + " times";
    }
}
