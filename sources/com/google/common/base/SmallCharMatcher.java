package com.google.common.base;

import com.google.common.base.CharMatcher;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] table, long filter, boolean containsZero, String description) {
        super(description);
        this.table = table;
        this.filter = filter;
        this.containsZero = containsZero;
    }

    private boolean checkFilter(int c2) {
        return 1 == ((this.filter >> c2) & 1);
    }

    static int chooseTableSize(int setSize) {
        if (setSize == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(setSize - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < setSize) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static CharMatcher from(BitSet chars, String description) {
        int i2;
        int iCardinality = chars.cardinality();
        boolean z2 = chars.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i3 = iChooseTableSize - 1;
        int iNextSetBit = chars.nextSetBit(0);
        long j2 = 0;
        while (iNextSetBit != -1) {
            long j3 = 1 << iNextSetBit;
            long j4 = (j3 + j2) - (j3 & j2);
            int iSmear = smear(iNextSetBit);
            while (true) {
                i2 = (-1) - (((-1) - iSmear) | ((-1) - i3));
                if (cArr[i2] == 0) {
                    break;
                }
                iSmear = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = chars.nextSetBit(iNextSetBit + 1);
            j2 = j4;
        }
        return new SmallCharMatcher(cArr, j2, z2, description);
    }

    static int smear(int hashCode) {
        return Integer.rotateLeft(hashCode * (-862048943), 15) * C2;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c2) {
        if (c2 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c2)) {
            return false;
        }
        int length = this.table.length - 1;
        int iSmear = smear(c2);
        int i2 = (iSmear + length) - (iSmear | length);
        int i3 = i2;
        do {
            char c3 = this.table[i3];
            if (c3 == 0) {
                return false;
            }
            if (c3 == c2) {
                return true;
            }
            i3 = (-1) - (((-1) - (i3 + 1)) | ((-1) - length));
        } while (i3 != i2);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    void setBits(BitSet table) {
        if (this.containsZero) {
            table.set(0);
        }
        for (char c2 : this.table) {
            if (c2 != 0) {
                table.set(c2);
            }
        }
    }
}
