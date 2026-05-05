package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class hm {
    private int Code;
    private final int[] V = new int[10];

    final int B() {
        if ((-1) - (((-1) - this.Code) | ((-1) - 16)) != 0) {
            return this.V[4];
        }
        return Integer.MAX_VALUE;
    }

    final boolean B(int i2) {
        return ((1 << i2) & this.Code) != 0;
    }

    final int Code() {
        int i2 = this.Code;
        if ((i2 + 128) - (i2 | 128) != 0) {
            return this.V[7];
        }
        return 65535;
    }

    final int I(int i2) {
        return this.V[i2];
    }

    final hm I(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.V;
            if (i2 < iArr.length) {
                this.Code = (1 << i2) | this.Code;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    final int V() {
        return Integer.bitCount(this.Code);
    }

    final int V(int i2) {
        return (-1) - (((-1) - this.Code) | ((-1) - 32)) != 0 ? this.V[5] : i2;
    }

    final int Z() {
        int i2 = this.Code;
        if ((i2 + 2) - (i2 | 2) != 0) {
            return this.V[1];
        }
        return -1;
    }
}
