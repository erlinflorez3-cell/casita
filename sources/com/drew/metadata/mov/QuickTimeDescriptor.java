package com.drew.metadata.mov;

import com.drew.lang.Rational;
import com.drew.metadata.TagDescriptor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeDescriptor extends TagDescriptor<QuickTimeDirectory> {
    public QuickTimeDescriptor(QuickTimeDirectory quickTimeDirectory) {
        super(quickTimeDirectory);
    }

    private String getCompatibleBrandsDescription() {
        String[] stringArray = ((QuickTimeDirectory) this._directory).getStringArray(4098);
        if (stringArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            String strLookup = QuickTimeDictionary.lookup(4096, str);
            if (strLookup != null) {
                str = strLookup;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    private String getDurationDescription() {
        Rational rational = ((QuickTimeDirectory) this._directory).getRational(260);
        if (rational == null) {
            return null;
        }
        double dDoubleValue = rational.doubleValue();
        Integer numValueOf = Integer.valueOf((int) (dDoubleValue / Math.pow(60.0d, 2.0d)));
        Integer numValueOf2 = Integer.valueOf((int) ((dDoubleValue / Math.pow(60.0d, 1.0d)) - ((double) (numValueOf.intValue() * 60))));
        return String.format("%1$02d:%2$02d:%3$02d", numValueOf, numValueOf2, Integer.valueOf((int) Math.ceil((dDoubleValue / Math.pow(60.0d, 0.0d)) - ((double) (numValueOf2.intValue() * 60)))));
    }

    private String getMajorBrandDescription() {
        byte[] byteArray = ((QuickTimeDirectory) this._directory).getByteArray(4096);
        if (byteArray == null) {
            return null;
        }
        return QuickTimeDictionary.lookup(4096, new String(byteArray));
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        return i2 != 260 ? i2 != 4096 ? i2 != 4098 ? super.getDescription(i2) : getCompatibleBrandsDescription() : getMajorBrandDescription() : getDurationDescription();
    }
}
