package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class BitArrayBuilder {
    private BitArrayBuilder() {
    }

    static BitArray buildBitArray(List<ExpandedPair> list) {
        int size = list.size() << 1;
        int i2 = size - 1;
        if (list.get(list.size() - 1).getRightChar() == null) {
            i2 = size - 2;
        }
        BitArray bitArray = new BitArray(i2 * 12);
        int i3 = 0;
        int value = list.get(0).getRightChar().getValue();
        for (int i4 = 11; i4 >= 0; i4--) {
            int i5 = 1 << i4;
            if ((i5 + value) - (i5 | value) != 0) {
                bitArray.set(i3);
            }
            i3++;
        }
        for (int i6 = 1; i6 < list.size(); i6++) {
            ExpandedPair expandedPair = list.get(i6);
            int value2 = expandedPair.getLeftChar().getValue();
            for (int i7 = 11; i7 >= 0; i7--) {
                int i8 = 1 << i7;
                if ((i8 + value2) - (i8 | value2) != 0) {
                    bitArray.set(i3);
                }
                i3++;
            }
            if (expandedPair.getRightChar() != null) {
                int value3 = expandedPair.getRightChar().getValue();
                for (int i9 = 11; i9 >= 0; i9--) {
                    int i10 = 1 << i9;
                    if ((i10 + value3) - (i10 | value3) != 0) {
                        bitArray.set(i3);
                    }
                    i3++;
                }
            }
        }
        return bitArray;
    }
}
